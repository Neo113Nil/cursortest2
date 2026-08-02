package com.microblink.blinkid.activity;

/* loaded from: classes9.dex */
public final class BlinkIdActivity extends com.microblink.blinkid.activity.BaseScanActivity<com.microblink.blinkid.uisettings.BlinkIdUISettings, com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController> {
    @Override // com.microblink.blinkid.activity.BaseScanActivity
    protected final void IlIllIlIIl(android.content.Intent intent) {
        ((com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController) this.IllIIIllII).getRecognizerBundle().saveToIntent(intent);
        ((com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController) this.IllIIIllII).getHighResImagesBundle().saveToIntent(intent);
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder
    public final /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.ScanningOverlay getScanningOverlay() {
        return super.getScanningOverlay();
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity
    protected final com.microblink.blinkid.uisettings.UISettings llIIlIlIIl(android.content.Intent intent) {
        return new com.microblink.blinkid.uisettings.BlinkIdUISettings(intent);
    }

    @Override // com.microblink.blinkid.activity.BaseScanActivity, androidx.view.ComponentActivity, android.app.Activity
    public final /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
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
