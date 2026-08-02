package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public interface Message {
    void dismiss();

    default boolean getAutoTrack() {
        return true;
    }

    java.lang.String getId();

    void setAutoTrack(boolean z);

    void show();

    void track(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType);

    default void recordDisplay() {
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Message", "recordDisplay protocol method was not implemented.", new java.lang.Object[0]);
    }

    default java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        return java.util.Collections.emptyMap();
    }
}
