package com.helpshift;

/* loaded from: classes4.dex */
public interface HelpshiftEventsListener {
    void onEventOccurred(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map);

    void onUserAuthenticationFailure(com.helpshift.HelpshiftAuthenticationFailureReason helpshiftAuthenticationFailureReason);
}
