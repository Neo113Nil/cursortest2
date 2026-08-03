package com.helpshift.lifecycle;

/* loaded from: classes2.dex */
public class HSAppLifeCycleEventsHandler {
    private final com.helpshift.core.HSContext hsContext;
    private boolean isFirstAppLaunch = true;
    private long appLaunchTime = 0;

    public HSAppLifeCycleEventsHandler(com.helpshift.core.HSContext hSContext) {
        this.hsContext = hSContext;
    }

    public void onAppForeground() {
        this.hsContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.lifecycle.HSAppLifeCycleEventsHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.lifecycle.HSAppLifeCycleEventsHandler.this.m5666x64e70412();
            }
        });
    }

    /* renamed from: lambda$onAppForeground$0$com-helpshift-lifecycle-HSAppLifeCycleEventsHandler, reason: not valid java name */
    /* synthetic */ void m5666x64e70412() {
        this.appLaunchTime = java.lang.System.currentTimeMillis();
        this.hsContext.setAppBackgroundStatus(false);
        this.hsContext.getAnalyticsEventDM().sendAppLaunchEvent(this.appLaunchTime);
        this.hsContext.getAnalyticsEventDM().sendFailedEvents();
        this.hsContext.sendMigrationFailureLogs();
        com.helpshift.user.UserManager userManager = this.hsContext.getUserManager();
        com.helpshift.notification.CoreNotificationManager notificationManager = this.hsContext.getNotificationManager();
        if (!userManager.retryPushTokenSync() && !this.hsContext.isWebchatUIOpen()) {
            this.hsContext.getConversationPoller().startPoller();
        }
        userManager.scanRefreshTokenExpiry();
        userManager.collectAndStoreSDKCollectibleAttributes();
        userManager.triggerIdentityAttributeSync();
        userManager.startIdentityDataSyncPoller("app_foreground");
        userManager.syncSdkDataWithBackend();
        notificationManager.showProactiveInAppNotificationIfPresent(this.isFirstAppLaunch);
        this.isFirstAppLaunch = false;
    }

    public void onAppBackground() {
        this.hsContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.lifecycle.HSAppLifeCycleEventsHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.lifecycle.HSAppLifeCycleEventsHandler.this.m5665x55dda33e();
            }
        });
    }

    /* renamed from: lambda$onAppBackground$1$com-helpshift-lifecycle-HSAppLifeCycleEventsHandler, reason: not valid java name */
    /* synthetic */ void m5665x55dda33e() {
        this.hsContext.getConversationPoller().stopPoller();
        this.hsContext.getUserManager().stopIdentityDataSyncPoller("app_background");
        this.hsContext.getAnalyticsEventDM().addEventToStorage(java.lang.System.currentTimeMillis(), "ab", com.helpshift.proactive.ProactiveAnalyticsUtil.getBackgroundEventData(this.hsContext.getPersistentStorage(), this.appLaunchTime));
        this.hsContext.setAppBackgroundStatus(true);
    }
}
