package org.betup.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Locale;
import org.betup.R;
import org.betup.ui.dialogs.ProgressDialog;

/* loaded from: classes2.dex */
public class ConfirmEmailActivity extends AppCompatActivity {
    public static final int CANCELED = -235;
    public static final int CONFIRMED = -237;
    public static final int INVALID = -236;
    public static final int REQUEST_CONFIRMATION = 831;

    @BindView(R.id.icon)
    ImageView icon;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private Dialog progressDialog;
    private boolean sendStart;

    @BindView(R.id.subtitle)
    TextView subtitle;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setResult(INVALID);
        setContentView(R.layout.activity_confirm_email);
        ButterKnife.bind(this);
        if (getIntent().getExtras() != null && getIntent().getExtras().getBoolean("sendStart")) {
            this.sendStart = true;
        }
        this.mAuth = FirebaseAuth.getInstance();
        this.mAuthListener = new FirebaseAuth.AuthStateListener() { // from class: org.betup.ui.ConfirmEmailActivity.1
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public void onAuthStateChanged(final FirebaseAuth firebaseAuth) {
                Log.d("PROVIDERTEST", "CURRENT USER = " + (firebaseAuth.getCurrentUser() != null));
                if (firebaseAuth.getCurrentUser() != null) {
                    if (firebaseAuth.getCurrentUser().isEmailVerified()) {
                        Log.d("PROVIDERTEST", "EMAIL VERIFIED");
                        ConfirmEmailActivity.this.setResult(ConfirmEmailActivity.CONFIRMED);
                        ConfirmEmailActivity.this.finish();
                        return;
                    } else {
                        ConfirmEmailActivity.this.subtitle.setText(Html.fromHtml(String.format(Locale.getDefault(), ConfirmEmailActivity.this.getString(R.string.email_sent), firebaseAuth.getCurrentUser().getEmail())));
                        if (ConfirmEmailActivity.this.sendStart) {
                            ConfirmEmailActivity.this.sendAgainClick();
                            return;
                        }
                        return;
                    }
                }
                ConfirmEmailActivity.this.setResult(ConfirmEmailActivity.INVALID);
                ConfirmEmailActivity.this.finish();
            }
        };
    }

    @OnClick({R.id.sendAgain})
    public void sendAgainClick() {
        if (this.mAuth.getCurrentUser() != null) {
            displayProgress();
            Log.d("PROVIDERTEST", "SENDING EMAIL VERIFICATION...");
            this.mAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() { // from class: org.betup.ui.ConfirmEmailActivity.2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<Void> task) {
                    ConfirmEmailActivity.this.hideProgress();
                    Log.d("PROVIDERTEST", "EMAIL SENT!!!");
                    if (task.isSuccessful()) {
                        Log.d("PROVIDERTEST", "EMAIL SENT SUCCESSFULLY");
                        ConfirmEmailActivity.this.icon.startAnimation(AnimationUtils.loadAnimation(ConfirmEmailActivity.this.getApplicationContext(), R.anim.zoom_click));
                        return;
                    }
                    Log.d("PROVIDERTEST", task.getException().getMessage());
                }
            });
        }
    }

    @OnClick({R.id.confirm})
    public void confirmClick() {
        displayProgress();
        if (this.mAuth.getCurrentUser() != null) {
            this.mAuth.getCurrentUser().reload().addOnCompleteListener(new OnCompleteListener<Void>() { // from class: org.betup.ui.ConfirmEmailActivity.3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<Void> task) {
                    ConfirmEmailActivity.this.hideProgress();
                    if (task.isSuccessful()) {
                        Log.d("PROVIDERTEST", "USER RELOADED");
                        if (ConfirmEmailActivity.this.mAuth.getCurrentUser().isEmailVerified()) {
                            ConfirmEmailActivity.this.setResult(ConfirmEmailActivity.CONFIRMED);
                            ConfirmEmailActivity.this.finish();
                        } else {
                            SuperActivityToast.create(ConfirmEmailActivity.this, new Style(), 2).setText(ConfirmEmailActivity.this.getString(R.string.email_confirmation_failed)).setDuration(2000).setFrame(3).setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_RED)).setAnimations(4).show();
                        }
                    }
                }
            });
        }
    }

    @OnClick({R.id.signOut})
    public void signOutClick() {
        FirebaseAuth.getInstance().signOut();
        setResult(CANCELED);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mAuth.addAuthStateListener(this.mAuthListener);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        FirebaseAuth.AuthStateListener authStateListener = this.mAuthListener;
        if (authStateListener != null) {
            this.mAuth.removeAuthStateListener(authStateListener);
        }
    }

    public void displayProgress() {
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.progressDialog = ProgressDialog.showDialog(this);
    }

    public void hideProgress() {
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.progressDialog = null;
    }
}
