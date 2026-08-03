package com.ironsource.sdk.utils;

/* loaded from: classes5.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6724a;

    public static void d(java.lang.String str, java.lang.String str2) {
        if (f6724a) {
            android.util.Log.d(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (f6724a) {
            android.util.Log.e(str, str2);
        }
    }

    public static void enableLogging(int i) {
        f6724a = com.ironsource.C3202o8.d.MODE_0.b() != i;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (f6724a) {
            android.util.Log.i(str, str2);
        }
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        if (f6724a) {
            android.util.Log.v(str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (f6724a) {
            android.util.Log.w(str, str2);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f6724a) {
            android.util.Log.d(str, str2, th);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f6724a) {
            android.util.Log.e(str, str2, th);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (!f6724a || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        android.util.Log.i(str, str2, th);
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f6724a) {
            android.util.Log.v(str, str2, th);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f6724a) {
            android.util.Log.w(str, str2, th);
        }
    }
}
