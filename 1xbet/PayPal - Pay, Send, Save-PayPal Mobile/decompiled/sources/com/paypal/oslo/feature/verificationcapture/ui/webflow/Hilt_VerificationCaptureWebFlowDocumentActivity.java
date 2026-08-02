package com.paypal.oslo.feature.verificationcapture.ui.webflow;

/* loaded from: classes15.dex */
abstract class Hilt_VerificationCaptureWebFlowDocumentActivity extends androidx.fragment.app.FragmentActivity implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private boolean getHighSpeedVideoFpsRanges = false;
    private volatile dagger.hilt.android.internal.managers.ActivityComponentManager getHighSpeedVideoSizes;

    Hilt_VerificationCaptureWebFlowDocumentActivity() {
        addOnContextAvailableListener(new androidx.view.contextaware.OnContextAvailableListener() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                com.paypal.oslo.feature.verificationcapture.ui.webflow.Hilt_VerificationCaptureWebFlowDocumentActivity.this.inject();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        componentManager().initSavedStateHandleHolders();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        componentManager().clearSavedStateHandleHolders();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected dagger.hilt.android.internal.managers.ActivityComponentManager createComponentManager() {
        return new dagger.hilt.android.internal.managers.ActivityComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final dagger.hilt.android.internal.managers.ActivityComponentManager componentManager() {
        if (this.getHighSpeedVideoSizes == null) {
            synchronized (this.Camera2StreamConfigurationMap) {
                if (this.getHighSpeedVideoSizes == null) {
                    this.getHighSpeedVideoSizes = createComponentManager();
                }
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    protected void inject() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        ((com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity_GeneratedInjector) generatedComponent()).injectVerificationCaptureWebFlowDocumentActivity((com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.view.ComponentActivity, androidx.view.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
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
}
