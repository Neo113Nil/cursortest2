package com.dogearn.dogemoney;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/* loaded from: classes.dex */
public class InvalidClickActivity extends AppCompatActivity {
    private TextView textView;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_invalid_click);
        this.textView = (TextView) findViewById(R.id.invalidClickid);
        FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() { // from class: com.dogearn.dogemoney.InvalidClickActivity.1
            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String obj = dataSnapshot.child("Invadil").getValue().toString();
                InvalidClickActivity.this.textView.setText("You did " + obj + " Invalid Click");
            }
        });
    }
}
