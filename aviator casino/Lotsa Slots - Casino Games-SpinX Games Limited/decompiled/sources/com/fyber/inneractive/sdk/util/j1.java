package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class j1 {
    public static boolean a(java.lang.String str) {
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN);
    }
}
