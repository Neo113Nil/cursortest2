package com.yandex.varioqub.config.impl;

/* renamed from: com.yandex.varioqub.config.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0103b {
    public static int a() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static java.lang.String b() {
        android.content.Context context = com.yandex.varioqub.config.impl.AbstractC0105d.f2679a;
        if (context != null) {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        }
        kotlin.jvm.internal.i.i("appContext");
        throw null;
    }

    public static android.content.pm.PackageInfo c() {
        android.content.pm.PackageManager.PackageInfoFlags of;
        android.content.pm.PackageInfo packageInfo;
        android.content.Context context = com.yandex.varioqub.config.impl.AbstractC0105d.f2679a;
        if (context == null) {
            kotlin.jvm.internal.i.i("appContext");
            throw null;
        }
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.lang.String packageName = context.getPackageName();
        of = android.content.pm.PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        return packageInfo;
    }

    public static java.lang.String d() {
        long longVersionCode;
        android.content.pm.PackageInfo c2 = c();
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return java.lang.String.valueOf(c2.versionCode);
        }
        longVersionCode = c2.getLongVersionCode();
        return java.lang.String.valueOf(longVersionCode);
    }
}
