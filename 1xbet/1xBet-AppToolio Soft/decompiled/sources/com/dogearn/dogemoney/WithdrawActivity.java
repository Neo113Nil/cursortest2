package com.dogearn.dogemoney;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WithdrawActivity extends AppCompatActivity {
    EditText amount_no;
    private Button delay;
    private AdView mAdView;
    int myIntValue;
    EditText paymenttype;
    EditText redeem_no;
    String scores;
    int ss;
    Button submit;
    String uID;
    private Button urgent;
    FirebaseUser user;
    String user_amount;
    String user_id;
    DatabaseReference user_id_child;
    String user_no;
    private TextView wallet;
    int default_score = 0;
    int threshold = 100;
    int currentScore = 0;
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference root = this.db.getReference();
    DatabaseReference userRef = this.root.child("users");

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_withdraw);
        Utilies.showAlertDialogue("Tips", "If you withdraw your payment in the end of the month,you get double bonus ", this);
        this.redeem_no = (EditText) findViewById(R.id.mobileText);
        this.amount_no = (EditText) findViewById(R.id.amountText);
        this.submit = (Button) findViewById(R.id.withdrawButton);
        this.wallet = (TextView) findViewById(R.id.walletBalanceText);
        this.urgent = (Button) findViewById(R.id.urgentWithdraw);
        this.delay = (Button) findViewById(R.id.delayWithdraw);
        this.paymenttype = (EditText) findViewById(R.id.paymentType);
        this.mAdView = (AdView) findViewById(R.id.qadView);
        this.mAdView.loadAd(new AdRequest.Builder().build());
        this.myIntValue = getSharedPreferences("your_prefs", 0).getInt("your_int_key", 0);
        DatabaseReference child = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.user_id_child = child.child(this.user_id);
        final int i = getSharedPreferences("your_prefs", 0).getInt("your_int_key", -1);
        FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() { // from class: com.dogearn.dogemoney.WithdrawActivity.1
            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
                        String obj = dataSnapshot.child("scores").getValue().toString();
                        WithdrawActivity.this.wallet.setText("Your Earning :" + obj + "$");
                    }
                }
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(WithdrawActivity.this, "Please earn atleast 1 points", 0).show();
            }
        });
        this.urgent.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.WithdrawActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WithdrawActivity.this.submit.setVisibility(4);
                WithdrawActivity.this.delay.setVisibility(4);
                WithdrawActivity withdrawActivity = WithdrawActivity.this;
                withdrawActivity.user_no = withdrawActivity.redeem_no.getText().toString();
                WithdrawActivity withdrawActivity2 = WithdrawActivity.this;
                withdrawActivity2.user_amount = withdrawActivity2.amount_no.getText().toString();
                if (TextUtils.isEmpty(WithdrawActivity.this.paymenttype.getText().toString())) {
                    Toast.makeText(WithdrawActivity.this, "Please enter payment type", 0).show();
                }
                if (TextUtils.isEmpty(WithdrawActivity.this.user_amount)) {
                    Toast.makeText(WithdrawActivity.this, "Please enter your amount", 0).show();
                }
                if (TextUtils.isEmpty(WithdrawActivity.this.user_no)) {
                    Toast.makeText(WithdrawActivity.this, " Please enter your Dogecoin ID", 0).show();
                    return;
                }
                if (i > WithdrawActivity.this.threshold) {
                    SharedPreferences.Editor edit = WithdrawActivity.this.getSharedPreferences("your_prefs", 0).edit();
                    WithdrawActivity withdrawActivity3 = WithdrawActivity.this;
                    withdrawActivity3.currentScore = i - withdrawActivity3.threshold;
                    edit.putInt("your_int_key", WithdrawActivity.this.currentScore);
                    edit.commit();
                    Toast.makeText(WithdrawActivity.this, "Congratulations, Now please restart the app", 1).show();
                    WithdrawActivity.this.user_id_child.child("withdraw_phone").setValue(WithdrawActivity.this.user_no);
                    WithdrawActivity.this.user_id_child.child("withdraw_amount").setValue(WithdrawActivity.this.user_amount);
                    WithdrawActivity.this.checkScore();
                    return;
                }
                Toast.makeText(WithdrawActivity.this, "You need minimum " + WithdrawActivity.this.threshold + " points", 0).show();
            }
        });
        this.delay.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.WithdrawActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WithdrawActivity.this.submit.setVisibility(4);
                WithdrawActivity.this.urgent.setVisibility(4);
                WithdrawActivity withdrawActivity = WithdrawActivity.this;
                withdrawActivity.user_no = withdrawActivity.redeem_no.getText().toString();
                WithdrawActivity withdrawActivity2 = WithdrawActivity.this;
                withdrawActivity2.user_amount = withdrawActivity2.amount_no.getText().toString();
                if (TextUtils.isEmpty(WithdrawActivity.this.user_amount)) {
                    Toast.makeText(WithdrawActivity.this, "Please enter your amount", 0).show();
                }
                if (TextUtils.isEmpty(WithdrawActivity.this.user_no)) {
                    Toast.makeText(WithdrawActivity.this, " Please enter your Dogecoin ID", 0).show();
                    return;
                }
                if (i > WithdrawActivity.this.threshold) {
                    SharedPreferences.Editor edit = WithdrawActivity.this.getSharedPreferences("your_prefs", 0).edit();
                    WithdrawActivity withdrawActivity3 = WithdrawActivity.this;
                    withdrawActivity3.currentScore = i - withdrawActivity3.threshold;
                    edit.putInt("your_int_key", WithdrawActivity.this.currentScore);
                    edit.commit();
                    Toast.makeText(WithdrawActivity.this, "Congratulations, Now please restart the app", 1).show();
                    WithdrawActivity.this.user_id_child.child("withdraw_phone").setValue(WithdrawActivity.this.user_no);
                    WithdrawActivity.this.user_id_child.child("withdraw_amount").setValue(WithdrawActivity.this.user_amount);
                    WithdrawActivity.this.checkScore();
                    return;
                }
                Toast.makeText(WithdrawActivity.this, "You need minimum " + WithdrawActivity.this.threshold + " points", 0).show();
            }
        });
        this.submit.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.WithdrawActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WithdrawActivity.this.delay.setVisibility(4);
                WithdrawActivity.this.urgent.setVisibility(4);
                WithdrawActivity withdrawActivity = WithdrawActivity.this;
                withdrawActivity.user_no = withdrawActivity.redeem_no.getText().toString();
                WithdrawActivity withdrawActivity2 = WithdrawActivity.this;
                withdrawActivity2.user_amount = withdrawActivity2.amount_no.getText().toString();
                if (TextUtils.isEmpty(WithdrawActivity.this.user_amount)) {
                    Toast.makeText(WithdrawActivity.this, "Please enter your amount", 0).show();
                }
                if (TextUtils.isEmpty(WithdrawActivity.this.user_no)) {
                    Toast.makeText(WithdrawActivity.this, " Please enter your Dogecoin ID", 0).show();
                    return;
                }
                if (i > WithdrawActivity.this.threshold) {
                    SharedPreferences.Editor edit = WithdrawActivity.this.getSharedPreferences("your_prefs", 0).edit();
                    WithdrawActivity withdrawActivity3 = WithdrawActivity.this;
                    withdrawActivity3.currentScore = i - withdrawActivity3.threshold;
                    edit.putInt("your_int_key", WithdrawActivity.this.currentScore);
                    edit.commit();
                    Toast.makeText(WithdrawActivity.this, "Congratulations, Now please restart the app", 1).show();
                    WithdrawActivity.this.user_id_child.child("withdraw_phone").setValue(WithdrawActivity.this.user_no);
                    WithdrawActivity.this.user_id_child.child("withdraw_amount").setValue(WithdrawActivity.this.user_amount);
                    WithdrawActivity.this.checkScore();
                    return;
                }
                Toast.makeText(WithdrawActivity.this, "You need minimum " + WithdrawActivity.this.threshold + " points", 0).show();
            }
        });
    }

    public void checkScore() {
        this.userRef.addChildEventListener(new ChildEventListener() { // from class: com.dogearn.dogemoney.WithdrawActivity.5
            @Override // com.google.firebase.database.ChildEventListener
            public void onCancelled(DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onChildChanged(DataSnapshot dataSnapshot, String str) {
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onChildMoved(DataSnapshot dataSnapshot, String str) {
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onChildRemoved(DataSnapshot dataSnapshot) {
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onChildAdded(DataSnapshot dataSnapshot, String str) {
                try {
                    JSONObject jSONObject = new JSONObject(dataSnapshot.getValue().toString());
                    WithdrawActivity.this.scores = jSONObject.getString("scores");
                    WithdrawActivity.this.ss = Integer.parseInt(WithdrawActivity.this.scores);
                    if (WithdrawActivity.this.ss >= WithdrawActivity.this.threshold) {
                        WithdrawActivity.this.submit.setEnabled(false);
                        jSONObject.getString("details");
                        WithdrawActivity.this.user_id_child.child("scores").setValue(Integer.valueOf(WithdrawActivity.this.default_score));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
