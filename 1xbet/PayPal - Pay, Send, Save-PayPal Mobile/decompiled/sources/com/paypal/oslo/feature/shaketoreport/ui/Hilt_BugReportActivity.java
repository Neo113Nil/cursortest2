package com.paypal.oslo.feature.shaketoreport.ui;

/* loaded from: classes14.dex */
abstract class Hilt_BugReportActivity extends androidx.view.ComponentActivity implements dagger.hilt.internal.GeneratedComponentManagerHolder {
    private volatile dagger.hilt.android.internal.managers.ActivityComponentManager getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private boolean getHighSpeedVideoFpsRanges = false;

    Hilt_BugReportActivity() {
        addOnContextAvailableListener(new androidx.view.contextaware.OnContextAvailableListener() { // from class: com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity.this.inject();
            }
        });
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        componentManager().initSavedStateHandleHolders();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
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
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = createComponentManager();
                }
            }
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected void inject() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        ((com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity_GeneratedInjector) generatedComponent()).injectBugReportActivity((com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity) dagger.hilt.internal.UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.view.ComponentActivity, androidx.view.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
