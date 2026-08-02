package com.dogearn.dogemoney;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
public class SigninActivity extends AppCompatActivity {
    FirebaseAuth.AuthStateListener authStateListener;
    DatabaseReference databaseReference;
    FirebaseAuth firebaseAuth;
    private PublisherAdView mPublisherAdView;
    private int myIntValue;
    private ProgressBar progressBar;
    ProgressDialog progressDialog;
    private EditText signPT;
    private Button signin;
    private EditText signinET;
    private Button signup;
    String user_id;
    DatabaseReference user_id_child;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_signin);
        this.progressDialog = new ProgressDialog(this);
        this.progressDialog.setMessage("Logging....");
        this.signinET = (EditText) findViewById(R.id.loginEmailET);
        this.signPT = (EditText) findViewById(R.id.loginPassET);
        this.signin = (Button) findViewById(R.id.signIn);
        this.signup = (Button) findViewById(R.id.createAcc);
        this.firebaseAuth = FirebaseAuth.getInstance();
        this.mPublisherAdView = (PublisherAdView) findViewById(R.id.mAdviewLogin);
        this.mPublisherAdView.loadAd(new PublisherAdRequest.Builder().build());
        this.mPublisherAdView.setAdListener(new AdListener() { // from class: com.dogearn.dogemoney.SigninActivity.1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLeftApplication() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                SigninActivity.this.mPublisherAdView.isShown();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                Toast.makeText(SigninActivity.this, "Failed to load banner ads", 0).show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                SigninActivity.this.mPublisherAdView.isShown();
            }
        });
        this.signin.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.SigninActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String trim = SigninActivity.this.signinET.getText().toString().trim();
                String trim2 = SigninActivity.this.signPT.getText().toString().trim();
                SigninActivity.this.progressDialog.show();
                if (TextUtils.isEmpty(trim) || TextUtils.isEmpty(trim2)) {
                    Toast.makeText(SigninActivity.this, "FILL ALL THE FIELDS", 0).show();
                } else {
                    SigninActivity.this.firebaseAuth.signInWithEmailAndPassword(trim, trim2).addOnCompleteListener(new OnCompleteListener<AuthResult>() { // from class: com.dogearn.dogemoney.SigninActivity.2.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                SigninActivity.this.progressDialog.dismiss();
                                Log.d("SUCCESS", "signInWithEmail:success");
                                SigninActivity.this.firebaseAuth.getCurrentUser();
                                Intent intent = new Intent(SigninActivity.this, (Class<?>) HomeActivity.class);
                                intent.setFlags(268468224);
                                SigninActivity.this.finishAffinity();
                                SigninActivity.this.startActivity(intent);
                                return;
                            }
                            SigninActivity.this.progressDialog.dismiss();
                            Log.w("FAILED", "signInWithEmail:failure", task.getException());
                            Toast.makeText(SigninActivity.this, "Authentication failed.", 0).show();
                        }
                    });
                }
            }
        });
        this.signup.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.SigninActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SigninActivity.this.startActivity(new Intent(SigninActivity.this, (Class<?>) RegisterActivity.class));
            }
        });
        this.authStateListener = new FirebaseAuth.AuthStateListener() { // from class: com.dogearn.dogemoney.SigninActivity.4
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() != null) {
                    SigninActivity signinActivity = SigninActivity.this;
                    signinActivity.startActivity(new Intent(signinActivity, (Class<?>) HomeActivity.class));
                }
            }
        };
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.firebaseAuth.addAuthStateListener(this.authStateListener);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        finish();
    }
}
