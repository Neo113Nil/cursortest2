package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public class SignInHubActivity extends androidx.fragment.app.FragmentActivity {
    private static boolean zba = false;
    private boolean zbb = false;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private android.content.Intent zbf;

    private final void zbc(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (android.content.ActivityNotFoundException unused) {
            this.zbb = true;
            zbe(17);
        }
    }

    private final void zbd() {
        getSupportLoaderManager().initLoader(0, null, new com.google.android.gms.auth.api.signin.internal.zbv(this, null));
        zba = false;
    }

    private final void zbe(int i) {
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(i);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
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
                if (zba2 == null) {
                    zbe(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED);
                    return;
                }
                com.google.android.gms.auth.api.signin.internal.zbn.zba(this).zbc(this.zbc.zba(), zba2);
                intent.removeExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", zba2);
                this.zbd = true;
                this.zbe = i2;
                this.zbf = intent;
                zbd();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbe(intExtra);
                return;
            }
        }
        zbe(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        if (action == null) {
            zbe(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            zbe(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            intent.getAction();
            finish();
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbe(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            } else {
                zba = true;
                zbc(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z;
        if (z) {
            this.zbe = bundle.getInt("signInResultCode");
            android.content.Intent intent2 = (android.content.Intent) bundle.getParcelable("signInResultData");
            if (intent2 == null) {
                setResult(0);
                finish();
            } else {
                this.zbf = intent2;
                zbd();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    final /* synthetic */ android.content.Intent zbb() {
        return this.zbf;
    }

    final /* synthetic */ int zba() {
        return this.zbe;
    }
}
