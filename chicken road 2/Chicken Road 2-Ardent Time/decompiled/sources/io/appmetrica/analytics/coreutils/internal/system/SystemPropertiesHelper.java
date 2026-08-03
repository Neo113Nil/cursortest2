package io.appmetrica.analytics.coreutils.internal.system;

/* loaded from: classes.dex */
public final class SystemPropertiesHelper {
    public static final io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper INSTANCE = new io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper();

    private SystemPropertiesHelper() {
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    public static final java.lang.String readSystemProperty(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties", true, android.content.Context.class.getClassLoader());
            java.lang.Object invoke = cls.getMethod("get", java.lang.String.class).invoke(cls, str);
            java.lang.String str2 = invoke instanceof java.lang.String ? (java.lang.String) invoke : null;
            return str2 == null ? "" : str2;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
