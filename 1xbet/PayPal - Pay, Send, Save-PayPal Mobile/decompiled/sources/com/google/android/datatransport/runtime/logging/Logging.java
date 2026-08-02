package com.google.android.datatransport.runtime.logging;

/* loaded from: classes3.dex */
public final class Logging {
    private static final java.lang.String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static java.lang.String getTag(java.lang.String str) {
        return LOG_PREFIX.concat(java.lang.String.valueOf(str));
    }

    private static java.lang.String concatTag(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        java.lang.String obj = sb.toString();
        return obj.length() > 23 ? obj.substring(0, 23) : obj;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        getTag(str);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (android.util.Log.isLoggable(getTag(str), 3)) {
            new java.lang.Object[]{obj};
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2) {
        if (android.util.Log.isLoggable(getTag(str), 3)) {
            new java.lang.Object[]{obj, obj2};
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        getTag(str);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (android.util.Log.isLoggable(getTag(str), 4)) {
            new java.lang.Object[]{obj};
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        getTag(str);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (android.util.Log.isLoggable(getTag(str), 5)) {
            new java.lang.Object[]{obj};
        }
    }
}
