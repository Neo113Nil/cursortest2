package com.paypal.oslo.feature.taptopay.ui.paymode;

/* loaded from: classes15.dex */
abstract class Hilt_PayModeActivity extends androidx.fragment.app.FragmentActivity implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private volatile dagger.hilt.android.internal.managers.ActivityComponentManager Camera2StreamConfigurationMap;
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private boolean getHighSpeedVideoFpsRangesFor = false;

    Hilt_PayModeActivity() {
        addOnContextAvailableListener(new androidx.view.contextaware.OnContextAvailableListener() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                com.paypal.oslo.feature.taptopay.ui.paymode.Hilt_PayModeActivity.this.inject();
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
        if (this.Camera2StreamConfigurationMap == null) {
            synchronized (this.getHighSpeedVideoSizes) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = createComponentManager();
                }
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    protected void inject() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity_GeneratedInjector) generatedComponent()).injectPayModeActivity((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
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
