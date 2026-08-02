package org.betup.ui.splash;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.X3;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.ServerDownMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.offer.GDPRAreaChecker;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.ui.ConfirmEmailActivity;
import org.betup.ui.LoginActivity;
import org.betup.ui.MainActivity;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.dialogs.InfoDialog;
import org.betup.ui.dialogs.NoInternetDialogFragment;
import org.betup.ui.dialogs.OnDialogButtonClickListener;
import org.betup.ui.dialogs.TermsPrivacyDialogCallback;
import org.betup.ui.dialogs.TermsPrivacyDialogFragment;
import org.betup.ui.fragment.login.AuthFragment;
import org.betup.ui.splash.init.DefaultInitializer;
import org.betup.ui.splash.init.InitializationListener;
import org.betup.ui.splash.init.Initializer;
import org.betup.ui.splash.load.DefaultLoader;
import org.betup.ui.splash.load.LoadListener;
import org.betup.ui.splash.load.Loader;
import org.betup.utils.SharedPrefs;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public class SplashActivity extends BaseActivity implements InitializationListener, LoadListener {

    @BindView(R.id.info)
    TextView info;
    private Initializer initializer;
    private Loader loader;

    @Inject
    LocalPreferencesService localPreferencesService;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @BindView(R.id.progress)
    ProgressBar progress;

    @Inject
    ServerErrorsProcessor serverErrorsProcessor;
    private boolean linkProcessed = false;
    private boolean hasNavigatedToLogin = false;

    @Override // org.betup.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        if (savedInstanceState != null) {
            this.linkProcessed = savedInstanceState.getBoolean("linkProcessed", false);
        }
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        Handler handler = new Handler();
        this.mAuth = FirebaseAuth.getInstance();
        this.info.setText(getString(R.string.loading_authenticating));
        this.initializer = new DefaultInitializer(this, this.mAuth, this);
        this.loader = new DefaultLoader(this, this, handler);
        this.mAuthListener = new FirebaseAuth.AuthStateListener() { // from class: org.betup.ui.splash.SplashActivity.1
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public void onAuthStateChanged(final FirebaseAuth firebaseAuth) {
                SplashActivity.this.initializer.init();
            }
        };
        new GDPRAreaChecker(this.localPreferencesService).execute(new Void[0]);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("linkProcessed", this.linkProcessed);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        FirebaseAuth.AuthStateListener authStateListener = this.mAuthListener;
        if (authStateListener != null) {
            this.mAuth.addAuthStateListener(authStateListener);
        }
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        FirebaseAuth.AuthStateListener authStateListener = this.mAuthListener;
        if (authStateListener != null) {
            this.mAuth.removeAuthStateListener(authStateListener);
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override // org.betup.ui.splash.init.InitializationListener
    public void initSuccess(boolean isAuthenticated, boolean requestedConfirmation) {
        if (isUiActive()) {
            if (!isAuthenticated) {
                goLogin();
            } else if (requestedConfirmation) {
                goConfirmation();
            } else {
                goMain();
            }
        }
    }

    @Override // org.betup.ui.splash.init.InitializationListener
    public void initInetError() {
        if (isUiActive()) {
            displayInetError();
        }
    }

    @Override // org.betup.ui.splash.load.LoadListener
    public void displayPlayServicesError() {
        if (isUiActive()) {
            try {
                new InfoDialog.Builder(this).allowDismiss(false).icon(R.drawable.no_inet).dismissOnFirstButtonClick(true).onFirstButtonClick(new OnDialogButtonClickListener() { // from class: org.betup.ui.splash.SplashActivity.3
                    @Override // org.betup.ui.dialogs.OnDialogButtonClickListener
                    public void onClick(Dialog dialog) {
                        if (SplashActivity.this.isUiActive()) {
                            try {
                                SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms")));
                            } catch (ActivityNotFoundException unused) {
                                SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.gms")));
                            }
                        }
                    }
                }).onSecondButtonClick(new OnDialogButtonClickListener() { // from class: org.betup.ui.splash.SplashActivity.2
                    @Override // org.betup.ui.dialogs.OnDialogButtonClickListener
                    public void onClick(Dialog dialog) {
                        if (SplashActivity.this.isUiActive()) {
                            SplashActivity.this.startActivity(new Intent(SplashActivity.this, (Class<?>) SplashActivity.class));
                            SplashActivity.this.finish();
                        }
                    }
                }).title(getString(R.string.play_services_error)).desc(getString(R.string.update_play_services)).firstButtonTitle(getString(R.string.update_big)).secondButtonTitle(getString(R.string.close_big)).build().show();
            } catch (WindowManager.BadTokenException e) {
                Log.w("SplashActivity", "Skip play services dialog: invalid window token", e);
            }
        }
    }

    @Override // org.betup.ui.splash.init.InitializationListener
    public void initPlayServicesError() {
        if (isUiActive()) {
            displayPlayServicesError();
        }
    }

    @Override // org.betup.ui.splash.init.InitializationListener
    public void initForceUpdate() {
        if (isUiActive()) {
            new InfoDialog.Builder(this).title(getString(R.string.new_version)).desc(getString(R.string.new_version_desc)).allowDismiss(false).onFirstButtonClick(new OnDialogButtonClickListener() { // from class: org.betup.ui.splash.SplashActivity.5
                @Override // org.betup.ui.dialogs.OnDialogButtonClickListener
                public void onClick(Dialog dialog) {
                    if (SplashActivity.this.isUiActive()) {
                        dialog.dismiss();
                        SplashActivity.this.finish();
                        try {
                            SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(FirebaseRemoteConfig.getInstance().getString("androidAppLink"))));
                        } catch (ActivityNotFoundException unused) {
                            SplashActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + FirebaseRemoteConfig.getInstance().getString("androidAppLink").split(X3.j.b)[1])));
                        }
                    }
                }
            }).secondButtonTitle(getString(R.string.cancel)).onSecondButtonClick(new OnDialogButtonClickListener() { // from class: org.betup.ui.splash.SplashActivity.4
                @Override // org.betup.ui.dialogs.OnDialogButtonClickListener
                public void onClick(Dialog dialog) {
                    dialog.dismiss();
                    System.exit(0);
                }
            }).build().show();
        }
    }

    @Override // org.betup.ui.splash.load.LoadListener
    public void loadProgress(int progressVal, final String infoText) {
        this.progress.setProgress(progressVal);
        if (infoText != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.info, "alpha", 1.0f, 0.0f).setDuration(200L);
            duration.addListener(new Animator.AnimatorListener() { // from class: org.betup.ui.splash.SplashActivity.6
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    SplashActivity.this.info.setText(infoText);
                    ObjectAnimator.ofFloat(SplashActivity.this.info, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                }
            });
            duration.start();
        }
    }

    @Override // org.betup.ui.splash.load.LoadListener
    public void loadInetError() {
        if (isUiActive()) {
            displayInetError();
        }
    }

    @Override // org.betup.ui.splash.load.LoadListener
    public void loadCompleted() {
        if (isUiActive()) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.setFlags(268468224);
            if (getIntent().getExtras() != null) {
                intent.putExtras(getIntent().getExtras());
            }
            startActivity(intent);
            finish();
        }
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        Log.d("SERVERDOWN", "REGISTERED SUB");
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processServerDown(ServerDownMessage message) {
        if (isUiActive() && this.serverErrorsProcessor.processMessage(this, message) == FetchStat.NO_CONNECTION) {
            displayInetError();
        }
    }

    private void goConfirmation() {
        startActivityForResult(new Intent(this, (Class<?>) ConfirmEmailActivity.class), ConfirmEmailActivity.REQUEST_CONFIRMATION);
    }

    private void goMain() {
        this.loader.load();
    }

    private void displayInetError() {
        if (isUiActive()) {
            NoInternetDialogFragment.showDialog(this, new Runnable() { // from class: org.betup.ui.splash.SplashActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    System.exit(0);
                }
            }, new Runnable() { // from class: org.betup.ui.splash.SplashActivity$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.this.m14327lambda$displayInetError$1$orgbetupuisplashSplashActivity();
                }
            });
        }
    }

    /* renamed from: lambda$displayInetError$1$org-betup-ui-splash-SplashActivity, reason: not valid java name */
    /* synthetic */ void m14327lambda$displayInetError$1$orgbetupuisplashSplashActivity() {
        startActivity(new Intent(this, (Class<?>) SplashActivity.class));
        finish();
    }

    private void goLogin() {
        if (isUiActive()) {
            if (!SharedPrefs.getTermsAccepted(this)) {
                TermsPrivacyDialogFragment.showDialog(this, new TermsPrivacyDialogCallback() { // from class: org.betup.ui.splash.SplashActivity.7
                    @Override // org.betup.ui.dialogs.TermsPrivacyDialogCallback
                    public void onAccept() {
                        SharedPrefs.setTermsAccepted(SplashActivity.this, true);
                        SplashActivity.this.navigateToLoginActivity();
                    }
                });
            } else {
                navigateToLoginActivity();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateToLoginActivity() {
        if (this.hasNavigatedToLogin || !isUiActive()) {
            return;
        }
        this.hasNavigatedToLogin = true;
        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("action", AuthFragment.Action.LOGIN);
        bundle.putBoolean(TtmlNode.START, true);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUiActive() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }
}
