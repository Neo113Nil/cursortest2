package io.appmetrica.analytics.impl;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
@android.annotation.TargetApi(28)
/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C0733u2 f6871a = new io.appmetrica.analytics.impl.C0733u2();

    private C0733u2() {
    }

    public static final io.appmetrica.analytics.impl.C0811x2 a(android.content.Context context, io.appmetrica.analytics.impl.C0268c2 c0268c2) {
        return new io.appmetrica.analytics.impl.C0811x2((io.appmetrica.analytics.impl.EnumC0785w2) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new E0.a(8, c0268c2)), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new H0.b(19)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.appmetrica.analytics.impl.EnumC0785w2 a(io.appmetrica.analytics.impl.C0268c2 c0268c2, android.app.usage.UsageStatsManager usageStatsManager) {
        int appStandbyBucket;
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c0268c2.getClass();
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(28)) {
            if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return io.appmetrica.analytics.impl.EnumC0785w2.RESTRICTED;
            }
            if (appStandbyBucket == 5) {
                return io.appmetrica.analytics.impl.EnumC0785w2.EXEMPTED;
            }
            if (appStandbyBucket == 10) {
                return io.appmetrica.analytics.impl.EnumC0785w2.ACTIVE;
            }
            if (appStandbyBucket == 30) {
                return io.appmetrica.analytics.impl.EnumC0785w2.FREQUENT;
            }
            if (appStandbyBucket == 20) {
                return io.appmetrica.analytics.impl.EnumC0785w2.WORKING_SET;
            }
            if (appStandbyBucket == 40) {
                return io.appmetrica.analytics.impl.EnumC0785w2.RARE;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Boolean a(android.app.ActivityManager activityManager) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = activityManager.isBackgroundRestricted();
        return java.lang.Boolean.valueOf(isBackgroundRestricted);
    }
}
