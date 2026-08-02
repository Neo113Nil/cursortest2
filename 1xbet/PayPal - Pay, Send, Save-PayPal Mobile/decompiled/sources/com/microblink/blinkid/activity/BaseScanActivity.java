package com.microblink.blinkid.activity;

/* loaded from: classes9.dex */
abstract class BaseScanActivity<UiSettingsType extends com.microblink.blinkid.uisettings.UISettings, ScanOverlayType extends com.microblink.blinkid.fragment.overlay.ScanningOverlay> extends androidx.appcompat.app.AppCompatActivity implements com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder {
    private java.lang.Throwable Camera2StreamConfigurationMap;
    protected com.microblink.blinkid.uisettings.UISettings IlIllIlIIl;
    protected com.microblink.blinkid.fragment.overlay.ScanningOverlay IllIIIllII;
    protected com.microblink.blinkid.fragment.RecognizerRunnerFragment llIIlIlIIl;

    /* renamed from: com.microblink.blinkid.activity.BaseScanActivity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.microblink.blinkid.recognition.RecognitionSuccessType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.recognition.RecognitionSuccessType.PARTIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.recognition.RecognitionSuccessType.STAGE_SUCCESSFUL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public class ResultListener implements com.microblink.blinkid.view.recognition.ScanResultListener {
        ResultListener() {
        }

        @Override // com.microblink.blinkid.view.recognition.ScanResultListener
        public void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
            com.microblink.blinkid.activity.BaseScanActivity.this.llIIlIlIIl(recognitionSuccessType);
        }

        @Override // com.microblink.blinkid.view.recognition.ScanResultListener
        public void onUnrecoverableError(java.lang.Throwable th) {
            com.microblink.blinkid.activity.BaseScanActivity.this.Camera2StreamConfigurationMap = th;
        }
    }

    BaseScanActivity() {
    }

    protected abstract void IlIllIlIIl(android.content.Intent intent);

    public com.microblink.blinkid.fragment.overlay.ScanningOverlay getScanningOverlay() {
        return this.IllIIIllII;
    }

    protected abstract com.microblink.blinkid.uisettings.UISettings llIIlIlIIl(android.content.Intent intent);

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.Camera2StreamConfigurationMap != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("com.microblink.blinkid.scanexception", this.Camera2StreamConfigurationMap);
            setResult(0, intent);
        } else {
            setResult(0);
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.microblink.blinkid.uisettings.UISettings llIIlIlIIl = llIIlIlIIl(getIntent());
        this.IlIllIlIIl = llIIlIlIIl;
        this.IllIIIllII = llIIlIlIIl.createOverlayController(this, new com.microblink.blinkid.activity.BaseScanActivity.ResultListener());
        int activityTheme = this.IlIllIlIIl.getActivityTheme();
        if (activityTheme != 0) {
            setTheme(activityTheme);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true);
        if (typedValue.data == 0) {
            setTheme(com.microblink.blinkid.library.R.style.MB_theme);
        }
        super.onCreate(bundle);
        setContentView(com.microblink.blinkid.resources.Layouts.llIIlIlIIl);
        setVolumeControlStream(3);
        if (this.IlIllIlIIl.getUsingFlagSecure()) {
            getWindow().setFlags(8192, 8192);
        }
        findViewById(android.R.id.content).getRootView().setFilterTouchesWhenObscured(this.IlIllIlIIl.getFilterTouchesWhenObscured());
        if (bundle != null) {
            this.llIIlIlIIl = (com.microblink.blinkid.fragment.RecognizerRunnerFragment) getSupportFragmentManager().findFragmentById(com.microblink.blinkid.library.R.id.recognizer_runner_view_container);
            return;
        }
        this.llIIlIlIIl = new com.microblink.blinkid.fragment.RecognizerRunnerFragment();
        androidx.fragment.app.FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(com.microblink.blinkid.library.R.id.recognizer_runner_view_container, this.llIIlIlIIl);
        beginTransaction.commit();
    }

    protected void llIIlIlIIl(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        this.llIIlIlIIl.getRecognizerRunnerView().pauseScanning();
        android.content.Intent intent = new android.content.Intent();
        int i = com.microblink.blinkid.activity.BaseScanActivity.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[recognitionSuccessType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            setResult(-1, intent);
        } else if (i == 4) {
            setResult(0);
        }
        IlIllIlIIl(intent);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
