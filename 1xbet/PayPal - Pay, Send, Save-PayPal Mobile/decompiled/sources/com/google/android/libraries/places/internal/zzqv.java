package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzqv {
    private static final java.lang.reflect.Method zza;

    static {
        java.lang.reflect.Method method = null;
        try {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", java.lang.String.class, java.lang.String.class);
                cls.getMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.String.class, java.lang.Long.TYPE);
                cls.getMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } finally {
            zza = method;
        }
    }

    public static java.lang.String zza(java.lang.String str, @javax.annotation.Nullable java.lang.String str2) {
        try {
            return (java.lang.String) zza.invoke(null, "tiktok_systrace", "false");
        } catch (java.lang.Exception unused) {
            return "false";
        }
    }
}
