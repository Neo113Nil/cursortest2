package com.dogearn.dogemoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/* loaded from: classes.dex */
public class ProfileActivity extends AppCompatActivity {
    private Button button;
    private TextView dogeran;
    private TextView email;
    private TextView firstname;
    private Button invalid;
    private TextView lastname;
    private TextView password;
    private TextView phone;
    private Button refer;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_profile);
        this.firstname = (TextView) findViewById(R.id.firstname);
        this.lastname = (TextView) findViewById(R.id.lastname);
        this.email = (TextView) findViewById(R.id.email);
        this.password = (TextView) findViewById(R.id.password);
        this.phone = (TextView) findViewById(R.id.phone);
        this.dogeran = (TextView) findViewById(R.id.dogeearn);
        this.button = (Button) findViewById(R.id.scoreWalletID);
        this.refer = (Button) findViewById(R.id.referemail);
        this.invalid = (Button) findViewById(R.id.invalidclick);
        this.invalid.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.ProfileActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProfileActivity profileActivity = ProfileActivity.this;
                profileActivity.startActivity(new Intent(profileActivity, (Class<?>) InvalidClickActivity.class));
            }
        });
        FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() { // from class: com.dogearn.dogemoney.ProfileActivity.2
            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
                        try {
                            String obj = dataSnapshot.child("First Name").getValue().toString();
                            String obj2 = dataSnapshot.child("Last Name").getValue().toString();
                            String obj3 = dataSnapshot.child("Email").getValue().toString();
                            String obj4 = dataSnapshot.child("Phone").getValue().toString();
                            String obj5 = dataSnapshot.child("Password").getValue().toString();
                            String obj6 = dataSnapshot.child("Register Dogeearn").getValue().toString();
                            String obj7 = dataSnapshot.child("scores").getValue().toString();
                            dataSnapshot.child("Phone").getValue().toString();
                            String obj8 = dataSnapshot.child("referID").getValue().toString();
                            ProfileActivity.this.firstname.setText(obj);
                            ProfileActivity.this.lastname.setText(obj2);
                            ProfileActivity.this.email.setText("Email:" + obj3);
                            ProfileActivity.this.phone.setText("Phone:" + obj4);
                            ProfileActivity.this.password.setText("Pass:" + obj5);
                            ProfileActivity.this.dogeran.setText("Dog_Earn:" + obj6);
                            if (obj7.isEmpty()) {
                                ProfileActivity.this.button.setText("Earning: 0 $");
                            } else {
                                ProfileActivity.this.button.setText("Earning:" + obj7 + "$");
                            }
                            ProfileActivity.this.refer.setText("Refer:" + obj8);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(ProfileActivity.this, "Database error", 0).show();
                        }
                    }
                }
            }
        });
    }
}
