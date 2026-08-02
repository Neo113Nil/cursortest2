package com.microblink.blinkid.activity;

/* loaded from: classes9.dex */
public final class BlinkCardActivity extends com.microblink.blinkid.activity.BaseScanActivity<com.microblink.blinkid.uisettings.BlinkCardUISettings, com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController> {
    private android.content.Intent getHighSpeedVideoFpsRangesFor;

    @Override // com.microblink.blinkid.activity.BaseScanActivity
    protected final void IlIllIlIIl(android.content.Intent intent) {
        android.content.Intent intent2 = this.getHighSpeedVideoFpsRangesFor;
        if (intent2 != null) {
            intent.putExtras(intent2);
        }
        ((com.microblink.blinkid.uisettings.BlinkCardUISettings) this.IlIllIlIIl).getRecognizerBundle().saveToIntent(intent);
        ((com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController) this.IllIIIllII).getHighResImagesBundle().saveToIntent(intent);
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder
    public final /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.ScanningOverlay getScanningOverlay() {
        return super.getScanningOverlay();
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity
    protected final com.microblink.blinkid.uisettings.UISettings llIIlIlIIl(android.content.Intent intent) {
        return new com.microblink.blinkid.uisettings.BlinkCardUISettings(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == 235) {
            if (i2 == 99) {
                ((com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController) this.IllIIIllII).resumeScanning();
            } else {
                this.getHighSpeedVideoFpsRangesFor = intent;
                super.llIIlIlIIl(com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, androidx.view.ComponentActivity, android.app.Activity
    public final /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity
    protected final void llIIlIlIIl(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (!((com.microblink.blinkid.uisettings.BlinkCardUISettings) this.IlIllIlIIl).isEditScreenEnabled()) {
            super.llIIlIlIIl(recognitionSuccessType);
            return;
        }
        android.content.Intent buildIntent = com.microblink.blinkid.activity.edit.BlinkCardEditActivity.buildIntent(this, ((com.microblink.blinkid.uisettings.BlinkCardUISettings) this.IlIllIlIIl).getEditScreenFieldConfiguration(), ((com.microblink.blinkid.uisettings.BlinkCardUISettings) this.IlIllIlIIl).getEditScreenStrings(this), ((com.microblink.blinkid.uisettings.BlinkCardUISettings) this.IlIllIlIIl).getEditScreenTheme(), ((com.microblink.blinkid.uisettings.BlinkCardUISettings) this.IlIllIlIIl).getUsingFlagSecure(), ((com.microblink.blinkid.uisettings.BlinkCardUISettings) this.IlIllIlIIl).getFilterTouchesWhenObscured());
        IlIllIlIIl(buildIntent);
        startActivityForResult(buildIntent, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
