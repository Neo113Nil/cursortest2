package com.helpshift.user;

/* loaded from: classes5.dex */
public class InternalUserLoginEventListener implements com.helpshift.HelpshiftUserLoginEventsListener {
    private final com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener;
    private final com.helpshift.concurrency.HSThreadingService threadingService;

    public InternalUserLoginEventListener(com.helpshift.concurrency.HSThreadingService hSThreadingService, com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        this.threadingService = hSThreadingService;
        this.helpshiftUserLoginEventsListener = helpshiftUserLoginEventsListener;
    }

    @Override // com.helpshift.HelpshiftUserLoginEventsListener
    public void onLoginFailure(final java.lang.String str, final java.util.Map<java.lang.String, java.lang.String> map) {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.user.InternalUserLoginEventListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.InternalUserLoginEventListener.this.m5700xf22d8d3c(str, map);
            }
        });
    }

    /* renamed from: lambda$onLoginFailure$0$com-helpshift-user-InternalUserLoginEventListener, reason: not valid java name */
    /* synthetic */ void m5700xf22d8d3c(java.lang.String str, java.util.Map map) {
        com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener = this.helpshiftUserLoginEventsListener;
        if (helpshiftUserLoginEventsListener != null) {
            helpshiftUserLoginEventsListener.onLoginFailure(str, map);
        }
    }

    @Override // com.helpshift.HelpshiftUserLoginEventsListener
    public void onLoginSuccess() {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.user.InternalUserLoginEventListener$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.InternalUserLoginEventListener.this.m5701x63249ef6();
            }
        });
    }

    /* renamed from: lambda$onLoginSuccess$1$com-helpshift-user-InternalUserLoginEventListener, reason: not valid java name */
    /* synthetic */ void m5701x63249ef6() {
        com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener = this.helpshiftUserLoginEventsListener;
        if (helpshiftUserLoginEventsListener != null) {
            helpshiftUserLoginEventsListener.onLoginSuccess();
        }
    }
}
