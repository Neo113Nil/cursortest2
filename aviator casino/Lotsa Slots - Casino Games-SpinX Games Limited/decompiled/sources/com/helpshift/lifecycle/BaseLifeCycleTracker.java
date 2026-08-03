package com.helpshift.lifecycle;

/* loaded from: classes2.dex */
public abstract class BaseLifeCycleTracker {
    private static final java.lang.String TAG = "LifecycleTkr";
    private final com.helpshift.lifecycle.HSAppLifeCycleEventsHandler hsAppLifeCycleEventsHandler;

    public abstract void onManualAppBackgroundAPI();

    public abstract void onManualAppForegroundAPI();

    protected BaseLifeCycleTracker(com.helpshift.lifecycle.HSAppLifeCycleEventsHandler hSAppLifeCycleEventsHandler) {
        this.hsAppLifeCycleEventsHandler = hSAppLifeCycleEventsHandler;
    }

    void notifyAppForeground() {
        com.helpshift.log.HSLogger.d(TAG, "App is in foreground");
        this.hsAppLifeCycleEventsHandler.onAppForeground();
    }

    void notifyAppBackground() {
        com.helpshift.log.HSLogger.d(TAG, "App is in background");
        this.hsAppLifeCycleEventsHandler.onAppBackground();
    }
}
