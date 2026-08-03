package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveInAppLifecycleTracker implements android.app.Application.ActivityLifecycleCallbacks, com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback {
    private final com.helpshift.util.network.connectivity.HSConnectivityManager hsConnectivityManager;
    private final com.helpshift.proactive.ProactiveInAppEventHandler proactiveInAppEventHandler;
    private boolean isConfigurationChanged = false;
    private int activityStarted = 0;
    private int activityStopped = 0;
    private boolean isNetworkListenerRegistered = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    public ProactiveInAppLifecycleTracker(com.helpshift.proactive.ProactiveInAppEventHandler proactiveInAppEventHandler, com.helpshift.util.network.connectivity.HSConnectivityManager hSConnectivityManager) {
        this.proactiveInAppEventHandler = proactiveInAppEventHandler;
        this.hsConnectivityManager = hSConnectivityManager;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        this.activityStarted++;
        if (!this.isNetworkListenerRegistered) {
            this.hsConnectivityManager.registerNetworkConnectivityListener(activity.getApplicationContext(), this);
        }
        this.isNetworkListenerRegistered = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        notifyAppResumed(activity, this.isConfigurationChanged);
        this.isConfigurationChanged = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        this.activityStopped++;
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.isConfigurationChanged = isChangingConfigurations;
        if (isChangingConfigurations || this.activityStarted != this.activityStopped) {
            return;
        }
        this.isNetworkListenerRegistered = false;
        this.hsConnectivityManager.unregisterNetworkConnectivityListener(this);
        notifyAppStopped();
    }

    public void registerActivityCallback(android.app.Application application) {
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    private void notifyAppResumed(android.app.Activity activity, boolean z) {
        this.proactiveInAppEventHandler.onAppResumeEvent(activity, z);
    }

    private void notifyAppStopped() {
        this.proactiveInAppEventHandler.onAppStoppedEvent();
    }

    @Override // com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback
    public void onNetworkAvailable() {
        this.proactiveInAppEventHandler.onNetworkToggle(true);
    }

    @Override // com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback
    public void onNetworkUnavailable() {
        this.proactiveInAppEventHandler.onNetworkToggle(false);
    }
}
