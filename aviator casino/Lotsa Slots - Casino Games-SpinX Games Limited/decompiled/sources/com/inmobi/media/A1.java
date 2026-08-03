package com.inmobi.media;

/* loaded from: classes5.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f4591a;
    public static final java.lang.String b;
    public static final java.lang.String c;
    public static final java.lang.String d;
    public static final java.util.HashMap e = new java.util.HashMap();
    public static final byte f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        android.content.pm.PackageManager packageManager;
        byte b2 = 2;
        f = (byte) 2;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        java.lang.String str = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (java.lang.Exception unused) {
            }
        } else {
            packageManager = null;
        }
        android.content.pm.ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(context.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            java.lang.String str2 = applicationInfo.packageName;
            f4591a = str2;
            d = applicationInfo.loadLabel(packageManager).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            b = packageManager.getInstallerPackageName(str2);
        }
        android.content.pm.PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 128) : null;
        if (packageInfo != null && ((str = packageInfo.versionName) == null || str.length() == 0)) {
            str = android.os.Build.VERSION.SDK_INT < 28 ? java.lang.String.valueOf(packageInfo.versionCode) : java.lang.String.valueOf(packageInfo.getLongVersionCode());
        }
        if (com.inmobi.media.J3.a(str)) {
            c = str;
        }
        try {
            com.inmobi.media.B5.f4614a.getClass();
            b2 = com.inmobi.media.B5.y() ? !android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (java.lang.Error | java.lang.Exception unused2) {
        }
        f = b2;
        a();
    }

    public static void a() {
        java.lang.String str = f4591a;
        if (str != null) {
            e.put("u-appbid", str);
        }
        java.lang.String str2 = d;
        if (str2 != null) {
            e.put("u-appdnm", str2);
        }
        java.lang.String str3 = c;
        if (str3 != null) {
            e.put("u-appver", str3);
        }
        java.util.HashMap hashMap = e;
        hashMap.put("u-appsecure", java.lang.String.valueOf((int) f));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A1", "TAG");
        java.util.Objects.toString(hashMap);
    }
}
