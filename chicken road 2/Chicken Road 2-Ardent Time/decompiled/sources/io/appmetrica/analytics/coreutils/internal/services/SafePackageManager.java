package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public final class SafePackageManager {
    private static java.lang.Object a(java.lang.Boolean bool, s1.InterfaceC0991a interfaceC0991a) {
        try {
            java.lang.Object invoke = interfaceC0991a.invoke();
            return invoke == null ? bool : invoke;
        } catch (java.lang.Throwable unused) {
            return bool;
        }
    }

    public final android.content.pm.ActivityInfo getActivityInfo(android.content.Context context, android.content.ComponentName componentName, int i2) {
        return (android.content.pm.ActivityInfo) a(null, new io.appmetrica.analytics.coreutils.impl.a(context, componentName, i2));
    }

    public final android.content.pm.ApplicationInfo getApplicationInfo(android.content.Context context, java.lang.String str, int i2) {
        return (android.content.pm.ApplicationInfo) a(null, new io.appmetrica.analytics.coreutils.impl.b(context, str, i2));
    }

    public final android.os.Bundle getApplicationMetaData(android.content.Context context) {
        return (android.os.Bundle) a(null, new io.appmetrica.analytics.coreutils.impl.c(this, context));
    }

    public final java.lang.String getInstallerPackageName(android.content.Context context, java.lang.String str) {
        return (java.lang.String) a(null, new io.appmetrica.analytics.coreutils.impl.d(context, str));
    }

    public final android.content.pm.PackageInfo getPackageInfo(android.content.Context context, java.lang.String str) {
        return getPackageInfo(context, str, 0);
    }

    public final android.content.pm.ServiceInfo getServiceInfo(android.content.Context context, android.content.ComponentName componentName, int i2) {
        return (android.content.pm.ServiceInfo) a(null, new io.appmetrica.analytics.coreutils.impl.f(context, componentName, i2));
    }

    public final boolean hasSystemFeature(android.content.Context context, java.lang.String str) {
        return ((java.lang.Boolean) a(java.lang.Boolean.FALSE, new io.appmetrica.analytics.coreutils.impl.g(context, str))).booleanValue();
    }

    public final android.content.pm.ResolveInfo resolveActivity(android.content.Context context, android.content.Intent intent, int i2) {
        return (android.content.pm.ResolveInfo) a(null, new io.appmetrica.analytics.coreutils.impl.h(context, intent, i2));
    }

    public final android.content.pm.ProviderInfo resolveContentProvider(android.content.Context context, java.lang.String str) {
        return (android.content.pm.ProviderInfo) a(null, new io.appmetrica.analytics.coreutils.impl.i(context, str));
    }

    public final android.content.pm.ResolveInfo resolveService(android.content.Context context, android.content.Intent intent, int i2) {
        return (android.content.pm.ResolveInfo) a(null, new io.appmetrica.analytics.coreutils.impl.j(context, intent, i2));
    }

    public final h1.C0177i setComponentEnabledSetting(android.content.Context context, android.content.ComponentName componentName, int i2, int i3) {
        return (h1.C0177i) a(null, new io.appmetrica.analytics.coreutils.impl.k(context, componentName, i2, i3));
    }

    public final android.content.pm.PackageInfo getPackageInfo(android.content.Context context, java.lang.String str, int i2) {
        return (android.content.pm.PackageInfo) a(null, new io.appmetrica.analytics.coreutils.impl.e(context, str, i2));
    }
}
