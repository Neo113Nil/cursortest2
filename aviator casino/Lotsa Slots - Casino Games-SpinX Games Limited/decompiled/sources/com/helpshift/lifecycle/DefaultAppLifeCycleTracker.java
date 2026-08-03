package com.helpshift.lifecycle;

/* loaded from: classes2.dex */
public class DefaultAppLifeCycleTracker extends com.helpshift.lifecycle.BaseLifeCycleTracker implements android.app.Application.ActivityLifecycleCallbacks {
    private static final java.lang.String TAG = "DALCTracker";
    private boolean isAppForeground;
    private boolean isConfigurationChanged;
    private int started;
    private int stopped;

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
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    DefaultAppLifeCycleTracker(android.app.Application application, com.helpshift.lifecycle.HSAppLifeCycleEventsHandler hSAppLifeCycleEventsHandler) {
        super(hSAppLifeCycleEventsHandler);
        this.isConfigurationChanged = false;
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
        if (com.helpshift.HSPluginEventBridge.shouldCallFirstForegroundEvent()) {
            this.started++;
            this.isAppForeground = true;
        }
    }

    @Override // com.helpshift.lifecycle.BaseLifeCycleTracker
    public void onManualAppForegroundAPI() {
        com.helpshift.log.HSLogger.e(TAG, "Install API is called with manualLifeCycleTracking config as false, Ignore this event");
    }

    @Override // com.helpshift.lifecycle.BaseLifeCycleTracker
    public void onManualAppBackgroundAPI() {
        com.helpshift.log.HSLogger.e(TAG, "Install API is called with manualLifeCycleTracking config as false, Ignore this event");
    }

    public boolean isAppInForeground() {
        return this.started > this.stopped;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        this.started++;
        if (!this.isConfigurationChanged) {
            if (!this.isAppForeground) {
                notifyAppForeground();
            }
            this.isAppForeground = true;
        }
        this.isConfigurationChanged = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        this.stopped++;
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.isConfigurationChanged = isChangingConfigurations;
        if (isChangingConfigurations || this.started != this.stopped) {
            return;
        }
        this.isAppForeground = false;
        notifyAppBackground();
    }
}
