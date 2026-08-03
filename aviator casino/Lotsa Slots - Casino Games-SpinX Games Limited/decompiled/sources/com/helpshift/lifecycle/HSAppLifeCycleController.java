package com.helpshift.lifecycle;

/* loaded from: classes2.dex */
public class HSAppLifeCycleController {
    private static com.helpshift.lifecycle.HSAppLifeCycleController instance;
    private com.helpshift.lifecycle.BaseLifeCycleTracker lifeCycleTracker;

    public static com.helpshift.lifecycle.HSAppLifeCycleController getInstance() {
        if (instance == null) {
            instance = new com.helpshift.lifecycle.HSAppLifeCycleController();
        }
        return instance;
    }

    public void init(android.app.Application application, boolean z, com.helpshift.lifecycle.HSAppLifeCycleEventsHandler hSAppLifeCycleEventsHandler) {
        if (this.lifeCycleTracker != null) {
            return;
        }
        if (z) {
            this.lifeCycleTracker = new com.helpshift.lifecycle.ManualAppLifeCycleTracker(hSAppLifeCycleEventsHandler);
        } else {
            this.lifeCycleTracker = new com.helpshift.lifecycle.DefaultAppLifeCycleTracker(application, hSAppLifeCycleEventsHandler);
        }
    }

    public void onManualAppForegroundAPI() {
        com.helpshift.lifecycle.BaseLifeCycleTracker baseLifeCycleTracker = this.lifeCycleTracker;
        if (baseLifeCycleTracker == null) {
            return;
        }
        baseLifeCycleTracker.onManualAppForegroundAPI();
    }

    public void onManualAppBackgroundAPI() {
        com.helpshift.lifecycle.BaseLifeCycleTracker baseLifeCycleTracker = this.lifeCycleTracker;
        if (baseLifeCycleTracker == null) {
            return;
        }
        baseLifeCycleTracker.onManualAppBackgroundAPI();
    }

    public void onAppForeground() {
        com.helpshift.lifecycle.BaseLifeCycleTracker baseLifeCycleTracker = this.lifeCycleTracker;
        if (baseLifeCycleTracker == null) {
            return;
        }
        baseLifeCycleTracker.notifyAppForeground();
    }
}
