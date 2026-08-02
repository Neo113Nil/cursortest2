package com.datadog.trace.api.env;

/* loaded from: classes3.dex */
public class CapturedEnvironment {
    private static final com.datadog.trace.api.env.CapturedEnvironment getHighSpeedVideoFpsRanges = new com.datadog.trace.api.env.CapturedEnvironment();
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;

    CapturedEnvironment() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = hashMap;
        java.lang.String str = java.lang.System.getenv("DD_AZURE_APP_SERVICES");
        java.lang.String str2 = java.lang.System.getenv("WEBSITE_SITE_NAME");
        if ((!"true".equalsIgnoreCase(str) && !"1".equals(str)) || str2 == null) {
            java.lang.String property = java.lang.System.getProperty("sun.java.command");
            if (property != null && !property.equals("")) {
                java.lang.String[] split = property.trim().split(" ");
                if (split.length != 0 && !split[0].equals("")) {
                    java.lang.String str3 = split[0];
                    str2 = str3.endsWith(".jar") ? new java.io.File(str3).getName().replace(".jar", "") : str3;
                }
            }
            str2 = null;
        }
        hashMap.put("service.name", str2);
    }

    public java.util.Map<java.lang.String, java.lang.String> getProperties() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static com.datadog.trace.api.env.CapturedEnvironment get() {
        return getHighSpeedVideoFpsRanges;
    }
}
