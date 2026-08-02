package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class r2 {
    public static java.lang.String[] b() {
        return android.content.res.Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",");
    }

    public static boolean d() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.contains("google_sdk") || str2.toLowerCase().contains("droid4x") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || android.os.Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        java.lang.String str3 = android.os.Build.HARDWARE;
        if (str3.contains("goldfish") || str3.contains("ranchu") || str3.contains("vbox86")) {
            return true;
        }
        java.lang.String str4 = android.os.Build.PRODUCT;
        if (str4.contains("sdk") || str4.contains("google_sdk") || str4.contains("sdk_google") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator") || android.os.Build.BOARD.toLowerCase().contains("nox") || android.os.Build.BOOTLOADER.toLowerCase().contains("nox") || str3.toLowerCase().contains("nox") || str4.toLowerCase().contains("nox") || android.os.Build.SERIAL.toLowerCase().contains("nox")) {
            return true;
        }
        return android.os.Build.BRAND.startsWith("generic") && android.os.Build.DEVICE.startsWith("generic");
    }

    public static java.lang.Boolean a(android.app.Activity activity) {
        return java.lang.Boolean.valueOf(((android.os.PowerManager) activity.getSystemService("power")).isPowerSaveMode());
    }

    public static java.nio.charset.Charset c() {
        return java.nio.charset.StandardCharsets.UTF_8;
    }

    public static java.lang.String a() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.app.Application.getProcessName();
        }
        try {
            return (java.lang.String) java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
