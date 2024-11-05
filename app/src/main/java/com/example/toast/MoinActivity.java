package com.example.toast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Integer[] numero = {0};
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_moin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button count = findViewById(R.id.contar);
        count.setBackgroundColor(getResources().getColor(R.color.blue));

        TextView myAwesomeTextView = (TextView)findViewById(R.id.conteo);


        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero[0]++;
                myAwesomeTextView.setText(numero[0].toString());
            }
        });

    }
}
