package com.unity3d.services.analytics.interfaces;

/* loaded from: classes5.dex */
public class Analytics {
    public static void initialize(com.unity3d.services.analytics.interfaces.IAnalytics iAnalytics) {
        com.unity3d.services.analytics.core.api.Analytics.setAnalyticsInterface(iAnalytics);
    }
}
