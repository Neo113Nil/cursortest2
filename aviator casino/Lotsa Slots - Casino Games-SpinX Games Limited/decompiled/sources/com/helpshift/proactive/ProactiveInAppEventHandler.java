package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveInAppEventHandler {
    private final com.helpshift.notification.CoreNotificationManager hsNotificationManager;
    private final com.helpshift.concurrency.HSThreadingService hsThreadingService;
    private final com.helpshift.proactive.InAppViewManager inAppViewManager;

    public ProactiveInAppEventHandler(com.helpshift.notification.CoreNotificationManager coreNotificationManager, com.helpshift.proactive.InAppViewManager inAppViewManager, com.helpshift.concurrency.HSThreadingService hSThreadingService) {
        this.inAppViewManager = inAppViewManager;
        this.hsThreadingService = hSThreadingService;
        this.hsNotificationManager = coreNotificationManager;
    }

    public void onAppResumeEvent(final android.app.Activity activity, final boolean z) {
        this.hsThreadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.proactive.ProactiveInAppEventHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.proactive.ProactiveInAppEventHandler.this.m5698xb613b47b(activity, z);
            }
        });
    }

    /* renamed from: lambda$onAppResumeEvent$0$com-helpshift-proactive-ProactiveInAppEventHandler, reason: not valid java name */
    /* synthetic */ void m5698xb613b47b(android.app.Activity activity, boolean z) {
        this.inAppViewManager.onAppResumed(activity, z);
    }

    public void onAppStoppedEvent() {
        this.hsThreadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.proactive.ProactiveInAppEventHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.proactive.ProactiveInAppEventHandler.this.m5699xb49790();
            }
        });
    }

    /* renamed from: lambda$onAppStoppedEvent$1$com-helpshift-proactive-ProactiveInAppEventHandler, reason: not valid java name */
    /* synthetic */ void m5699xb49790() {
        this.inAppViewManager.onAppStopped();
    }

    public void onNetworkToggle(boolean z) {
        if (z) {
            this.hsNotificationManager.showProactiveInAppNotificationIfPresent(true);
        }
    }
}
