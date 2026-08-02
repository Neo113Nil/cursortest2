package com.paypal.oslo.app;

/* loaded from: classes10.dex */
public abstract class Hilt_MainActivity extends androidx.fragment.app.FragmentActivity implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private volatile dagger.hilt.android.internal.managers.ActivityComponentManager getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private boolean Camera2StreamConfigurationMap = false;

    Hilt_MainActivity() {
        addOnContextAvailableListener(new androidx.view.contextaware.OnContextAvailableListener() { // from class: com.paypal.oslo.app.Hilt_MainActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                com.paypal.oslo.app.Hilt_MainActivity.this.inject();
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
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            synchronized (this.getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = createComponentManager();
                }
            }
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected void inject() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        ((com.paypal.oslo.app.MainActivity_GeneratedInjector) generatedComponent()).injectMainActivity((com.paypal.oslo.app.MainActivity) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
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
