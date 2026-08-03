package com.helpshift.proactive;

/* loaded from: classes5.dex */
public enum ProactiveActions {
    DISMISS("dismiss", false),
    CHAT("chat", true),
    FAQS("faqs", true),
    FAQ_SECTION("faqSection", true),
    SINGLE_FAQ("singleFaq", true),
    DEEPLINK(com.adjust.sdk.Constants.DEEPLINK, false),
    UNKNOWN("unknown", true),
    OPEN_APP("openApp", false);

    public final boolean isSupportAction;
    public final java.lang.String value;

    ProactiveActions(java.lang.String str, boolean z) {
        this.value = str;
        this.isSupportAction = z;
    }

    public static com.helpshift.proactive.ProactiveActions fromValue(java.lang.String str) {
        for (com.helpshift.proactive.ProactiveActions proactiveActions : values()) {
            if (proactiveActions.value.equalsIgnoreCase(str)) {
                return proactiveActions;
            }
        }
        return CHAT;
    }
}
