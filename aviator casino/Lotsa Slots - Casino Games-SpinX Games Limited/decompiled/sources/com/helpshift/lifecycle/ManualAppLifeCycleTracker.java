package com.helpshift.lifecycle;

/* loaded from: classes2.dex */
public class ManualAppLifeCycleTracker extends com.helpshift.lifecycle.BaseLifeCycleTracker {
    private static final java.lang.String TAG = "MALCTracker";
    private boolean isAppInForeground;

    public ManualAppLifeCycleTracker(com.helpshift.lifecycle.HSAppLifeCycleEventsHandler hSAppLifeCycleEventsHandler) {
        super(hSAppLifeCycleEventsHandler);
        this.isAppInForeground = false;
    }

    @Override // com.helpshift.lifecycle.BaseLifeCycleTracker
    public void onManualAppForegroundAPI() {
        if (this.isAppInForeground) {
            com.helpshift.log.HSLogger.d(TAG, "Application is already in foreground, so ignore this event");
        } else if (com.helpshift.core.HSContext.installCallSuccessful.get()) {
            this.isAppInForeground = true;
            notifyAppForeground();
        } else {
            com.helpshift.log.HSLogger.e(TAG, "onManualAppForegroundAPI is called without calling install API");
        }
    }

    @Override // com.helpshift.lifecycle.BaseLifeCycleTracker
    public void onManualAppBackgroundAPI() {
        if (!this.isAppInForeground) {
            com.helpshift.log.HSLogger.d(TAG, "Application is already in background, so ignore this event");
        } else if (com.helpshift.core.HSContext.installCallSuccessful.get()) {
            this.isAppInForeground = false;
            notifyAppBackground();
        } else {
            com.helpshift.log.HSLogger.e(TAG, "onManualAppBackgroundAPI is called without calling install API");
        }
    }
}
