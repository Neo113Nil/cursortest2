package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public class SignInHubActivity extends androidx.fragment.app.FragmentActivity {
    private static boolean zba = false;
    private boolean zbb = false;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private android.content.Intent zbf;

    private final void zbc() {
        getSupportLoaderManager().initLoader(0, null, new com.google.android.gms.auth.api.signin.internal.zbw(this, null));
        zba = false;
    }

    private final void zbd(int i) {
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(i);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra(com.helpshift.proactive.InAppViewConstants.CONFIG, this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (android.content.ActivityNotFoundException unused) {
            this.zbb = true;
            android.util.Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            com.google.android.gms.auth.api.signin.SignInAccount signInAccount = (com.google.android.gms.auth.api.signin.SignInAccount) intent.getParcelableExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                com.google.android.gms.auth.api.signin.GoogleSignInAccount zba2 = signInAccount.zba();
                com.google.android.gms.auth.api.signin.internal.zbn zbc = com.google.android.gms.auth.api.signin.internal.zbn.zbc(this);
                com.google.android.gms.auth.api.signin.GoogleSignInOptions zba3 = this.zbc.zba();
                zba2.getClass();
                zbc.zbe(zba3, zba2);
                intent.removeExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", zba2);
                this.zbd = true;
                this.zbe = i2;
                this.zbf = intent;
                zbc();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            android.util.Log.e("AuthSignInClient", "Unknown action: ".concat(java.lang.String.valueOf(intent.getAction())));
            finish();
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra(com.helpshift.proactive.InAppViewConstants.CONFIG);
        bundleExtra.getClass();
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) bundleExtra.getParcelable(com.helpshift.proactive.InAppViewConstants.CONFIG);
        if (signInConfiguration == null) {
            android.util.Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbd(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            } else {
                zba = true;
                zbe(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z;
        if (z) {
            this.zbe = bundle.getInt("signInResultCode");
            android.content.Intent intent2 = (android.content.Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.zbf = intent2;
            zbc();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
