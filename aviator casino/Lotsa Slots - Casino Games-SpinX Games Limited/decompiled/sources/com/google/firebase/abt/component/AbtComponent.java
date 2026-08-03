package com.google.firebase.abt.component;

/* loaded from: classes3.dex */
public class AbtComponent {
    private final java.util.Map<java.lang.String, com.google.firebase.abt.FirebaseABTesting> abtOriginInstances = new java.util.HashMap();
    private final com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> analyticsConnector;
    private final android.content.Context appContext;

    protected AbtComponent(android.content.Context context, com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> provider) {
        this.appContext = context;
        this.analyticsConnector = provider;
    }

    public synchronized com.google.firebase.abt.FirebaseABTesting get(java.lang.String str) {
        if (!this.abtOriginInstances.containsKey(str)) {
            this.abtOriginInstances.put(str, createAbtInstance(str));
        }
        return this.abtOriginInstances.get(str);
    }

    protected com.google.firebase.abt.FirebaseABTesting createAbtInstance(java.lang.String str) {
        return new com.google.firebase.abt.FirebaseABTesting(this.appContext, this.analyticsConnector, str);
    }
}
