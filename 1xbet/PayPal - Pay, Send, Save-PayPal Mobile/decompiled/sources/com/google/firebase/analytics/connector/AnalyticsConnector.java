package com.google.firebase.analytics.connector;

/* loaded from: classes4.dex */
public interface AnalyticsConnector {

    /* loaded from: classes9.dex */
    public interface AnalyticsConnectorHandle {
        void registerEventNames(java.util.Set<java.lang.String> set);

        void unregister();

        void unregisterEventNames();
    }

    /* loaded from: classes9.dex */
    public interface AnalyticsConnectorListener {
        void onMessageTriggered(int i, android.os.Bundle bundle);
    }

    /* loaded from: classes9.dex */
    public static class ConditionalUserProperty {
        public boolean active;
        public long creationTimestamp;
        public java.lang.String expiredEventName;
        public android.os.Bundle expiredEventParams;

        /* renamed from: name, reason: collision with root package name */
        public java.lang.String f3912name;
        public java.lang.String origin;
        public long timeToLive;
        public java.lang.String timedOutEventName;
        public android.os.Bundle timedOutEventParams;
        public java.lang.String triggerEventName;
        public long triggerTimeout;
        public java.lang.String triggeredEventName;
        public android.os.Bundle triggeredEventParams;
        public long triggeredTimestamp;
        public java.lang.Object value;
    }

    void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle);

    java.util.List<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2);

    int getMaxUserProperties(java.lang.String str);

    java.util.Map<java.lang.String, java.lang.Object> getUserProperties(boolean z);

    void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle);

    com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(java.lang.String str, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener);

    void setConditionalUserProperty(com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty);

    void setUserProperty(java.lang.String str, java.lang.String str2, java.lang.Object obj);
}
