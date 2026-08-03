package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public final class PackageManagerUtils {
    public static final io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils();

    /* renamed from: a, reason: collision with root package name */
    private static final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f3770a = new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager();

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(android.content.Context context) {
        android.content.pm.PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static final java.lang.String getAppVersionCodeString(android.content.Context context) {
        return java.lang.String.valueOf(getAppVersionCodeInt(context));
    }

    public static final java.lang.String getAppVersionName(android.content.Context context) {
        java.lang.String str;
        android.content.pm.PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? "0.0" : str;
    }

    public static final android.content.pm.PackageInfo getPackageInfo(android.content.Context context) {
        return f3770a.getPackageInfo(context, context.getPackageName());
    }

    public static final android.content.pm.ServiceInfo getServiceInfo(android.content.Context context, java.lang.Class<?> cls) {
        return f3770a.getServiceInfo(context, new android.content.ComponentName(context, cls), 4);
    }

    public static final boolean hasContentProvider(android.content.Context context, java.lang.String str) {
        return resolveContentProvider(context, str) != null;
    }

    public static final android.content.pm.ProviderInfo resolveContentProvider(android.content.Context context, java.lang.String str) {
        return f3770a.resolveContentProvider(context, str);
    }
}
