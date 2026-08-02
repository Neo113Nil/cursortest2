package com.dogearn.dogemoney;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.Random;

/* loaded from: classes.dex */
public class RegisterActivity extends AppCompatActivity {
    private static final String user_dr = "users";
    CheckBox checkBox;
    private EditText countryET;
    private DatabaseReference databaseReference;
    private EditText dogeearn;
    private EditText emailEt;
    private EditText firstnameEt;
    private EditText lastnameET;
    private FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListerer;
    private PublisherAdView mPublisherAdView;
    private EditText news;
    private EditText passwordEt;
    private EditText phone;
    ProgressDialog progressDialog;
    private EditText referEt;
    private Button signupbtn;
    TelephonyManager telephonyManager;
    String user_id;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_register);
        this.mAuth = FirebaseAuth.getInstance();
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child(user_dr);
        this.signupbtn = (Button) findViewById(R.id.signupbtn);
        this.firstnameEt = (EditText) findViewById(R.id.firstnameET);
        this.lastnameET = (EditText) findViewById(R.id.lastnameET);
        this.emailEt = (EditText) findViewById(R.id.userEmailET);
        this.passwordEt = (EditText) findViewById(R.id.userpasswordET);
        this.referEt = (EditText) findViewById(R.id.userReferET);
        this.phone = (EditText) findViewById(R.id.userPhoneET);
        this.checkBox = (CheckBox) findViewById(R.id.termsAndCondition);
        this.dogeearn = (EditText) findViewById(R.id.userDogearnID);
        this.news = (EditText) findViewById(R.id.newsID);
        this.countryET = (EditText) findViewById(R.id.usercountryET);
        this.progressDialog = new ProgressDialog(this);
        this.progressDialog.setMessage("Loading....");
        this.mPublisherAdView = (PublisherAdView) findViewById(R.id.mAdviewregister);
        this.mPublisherAdView.loadAd(new PublisherAdRequest.Builder().build());
        deviceId();
        this.signupbtn.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.RegisterActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RegisterActivity.this.startRegister();
            }
        });
    }

    public void startRegister() {
        this.progressDialog.show();
        final String obj = this.firstnameEt.getText().toString();
        final String obj2 = this.lastnameET.getText().toString();
        final String obj3 = this.emailEt.getText().toString();
        final String obj4 = this.passwordEt.getText().toString();
        final String obj5 = this.phone.getText().toString();
        final String obj6 = this.referEt.getText().toString();
        final String obj7 = this.dogeearn.getText().toString();
        final String obj8 = this.news.getText().toString();
        final String obj9 = this.countryET.getText().toString();
        if (obj.isEmpty()) {
            this.firstnameEt.setError("First Name is required");
            this.firstnameEt.requestFocus();
            return;
        }
        if (obj2.isEmpty()) {
            this.lastnameET.setError("Last Name is required");
            this.lastnameET.requestFocus();
            return;
        }
        if (obj4.isEmpty()) {
            this.passwordEt.setError("Password is required");
            this.passwordEt.requestFocus();
            return;
        }
        if (obj3.isEmpty()) {
            this.emailEt.setError("Email is required");
            this.emailEt.requestFocus();
            return;
        }
        if (obj5.isEmpty()) {
            this.phone.setError("Phone is required");
            this.phone.requestFocus();
            return;
        }
        if (obj7.isEmpty()) {
            this.dogeearn.setError("Dogearn is required");
            this.dogeearn.requestFocus();
        }
        if (obj9.isEmpty()) {
            this.countryET.setError("Country is required");
            this.countryET.requestFocus();
        }
        this.mAuth.createUserWithEmailAndPassword(obj3, obj4).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() { // from class: com.dogearn.dogemoney.RegisterActivity.2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    RegisterActivity.this.progressDialog.dismiss();
                    RegisterActivity.this.startActivity(new Intent(RegisterActivity.this, (Class<?>) HomeActivity.class));
                    Toast.makeText(RegisterActivity.this, "SUCCESS.", 0).show();
                    Log.d("SUCCESS", "createUserWithEmail:success");
                    DatabaseReference child = RegisterActivity.this.databaseReference.child(RegisterActivity.this.mAuth.getCurrentUser().getUid());
                    child.child("First Name").setValue(obj);
                    child.child("Last Name").setValue(obj2);
                    child.child("Email").setValue(obj3);
                    child.child("Password").setValue(obj4);
                    child.child("Refer").setValue(obj6);
                    child.child("Phone").setValue(obj5);
                    child.child("Register Dogeearn").setValue(obj7);
                    child.child("News").setValue(obj8);
                    child.child("Country").setValue(obj9);
                    String num = Integer.toString(new Random().nextInt(16777216), 16);
                    child.child("referID").setValue("000000".substring(num.length()) + num);
                    RegisterActivity.this.updateUserWallet(obj6);
                    return;
                }
                RegisterActivity.this.progressDialog.dismiss();
                Log.w("FAIL", "createUserWithEmail:failure", task.getException());
                Toast.makeText(RegisterActivity.this, "" + task.getException(), 0).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUserWallet(String str) {
        FirebaseDatabase.getInstance().getReference().child(user_dr).orderByChild("referID").equalTo(str).limitToFirst(1).addListenerForSingleValueEvent(new ValueEventListener() { // from class: com.dogearn.dogemoney.RegisterActivity.3
            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
                        if (dataSnapshot2.child("scores").exists()) {
                            dataSnapshot2.getRef().child("scores").setValue(Integer.valueOf(Integer.valueOf(dataSnapshot2.child("scores").getValue().toString()).intValue() + 10));
                        }
                    }
                }
            }
        });
    }

    private void deviceId() {
        this.telephonyManager = (TelephonyManager) getSystemService("phone");
        if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PHONE_STATE"}, 101);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 101) {
            if (iArr[0] == 0) {
                if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != 0) {
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PHONE_STATE"}, 101);
                    return;
                } else {
                    this.databaseReference.child(this.user_id).child("emi_number").setValue(this.telephonyManager.getDeviceId());
                    return;
                }
            }
            Toast.makeText(this, "Without permission we check", 1).show();
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
