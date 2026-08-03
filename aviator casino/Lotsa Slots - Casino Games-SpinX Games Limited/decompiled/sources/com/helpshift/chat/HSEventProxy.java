package com.helpshift.chat;

/* loaded from: classes.dex */
public class HSEventProxy {
    private static final java.lang.String TAG = "HSEvntPrxy";
    private com.helpshift.HelpshiftEventsListener eventsListener;
    private final com.helpshift.concurrency.HSThreadingService hsThreadingService;

    public HSEventProxy(com.helpshift.concurrency.HSThreadingService hSThreadingService) {
        this.hsThreadingService = hSThreadingService;
    }

    public void setHelpshiftEventsListener(com.helpshift.HelpshiftEventsListener helpshiftEventsListener) {
        this.eventsListener = helpshiftEventsListener;
    }

    public void sendEvent(final java.lang.String str, final java.util.Map<java.lang.String, java.lang.Object> map) {
        com.helpshift.log.HSLogger.d(TAG, "Event occurred: " + str);
        this.hsThreadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSEventProxy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSEventProxy.this.m5650lambda$sendEvent$0$comhelpshiftchatHSEventProxy(map, str);
            }
        });
    }

    /* renamed from: lambda$sendEvent$0$com-helpshift-chat-HSEventProxy, reason: not valid java name */
    /* synthetic */ void m5650lambda$sendEvent$0$comhelpshiftchatHSEventProxy(java.util.Map map, java.lang.String str) {
        if (this.eventsListener == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        this.eventsListener.onEventOccurred(str, hashMap);
    }

    public void sendAuthFailureEvent(final java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Authentication failure, reason: " + str);
        this.hsThreadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSEventProxy$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSEventProxy.this.m5649lambda$sendAuthFailureEvent$1$comhelpshiftchatHSEventProxy(str);
            }
        });
    }

    /* renamed from: lambda$sendAuthFailureEvent$1$com-helpshift-chat-HSEventProxy, reason: not valid java name */
    /* synthetic */ void m5649lambda$sendAuthFailureEvent$1$comhelpshiftchatHSEventProxy(java.lang.String str) {
        if (this.eventsListener == null) {
            return;
        }
        com.helpshift.HelpshiftAuthenticationFailureReason helpshiftAuthenticationFailureReason = com.helpshift.HelpshiftAuthenticationFailureReason.UNKNOWN;
        if (com.helpshift.network.AuthenticationFailureNetwork.REASON_AUTH_TOKEN_NOT_PROVIDED.equals(str)) {
            helpshiftAuthenticationFailureReason = com.helpshift.HelpshiftAuthenticationFailureReason.REASON_AUTH_TOKEN_NOT_PROVIDED;
        } else if (com.helpshift.network.AuthenticationFailureNetwork.REASON_INVALID_AUTH_TOKEN.equals(str)) {
            helpshiftAuthenticationFailureReason = com.helpshift.HelpshiftAuthenticationFailureReason.REASON_INVALID_AUTH_TOKEN;
        }
        this.eventsListener.onUserAuthenticationFailure(helpshiftAuthenticationFailureReason);
    }
}
