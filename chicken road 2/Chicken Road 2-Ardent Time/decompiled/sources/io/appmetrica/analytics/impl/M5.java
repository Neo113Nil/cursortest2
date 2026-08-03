package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class M5 extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f4644a;

    public M5(android.content.Context context, java.lang.String str) {
        this(context, str, new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a */
    public io.appmetrica.analytics.impl.N5 load(io.appmetrica.analytics.impl.L5 l5) {
        io.appmetrica.analytics.impl.N5 n5 = (io.appmetrica.analytics.impl.N5) super.load((io.appmetrica.analytics.impl.M5) l5);
        java.lang.String packageName = getContext().getPackageName();
        android.content.pm.ApplicationInfo applicationInfo = this.f4644a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i2 = applicationInfo.flags;
            n5.f4707a = (i2 & 2) != 0 ? "1" : io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER;
            n5.f4708b = (i2 & 1) == 0 ? io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (android.text.TextUtils.equals(packageName, getPackageName())) {
            n5.f4707a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER;
            n5.f4708b = (getContext().getApplicationInfo().flags & 1) == 0 ? io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            n5.f4707a = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER;
            n5.f4708b = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER;
        }
        io.appmetrica.analytics.impl.C0365fm c0365fm = l5.f4580a;
        n5.f4709c = c0365fm;
        n5.setRetryPolicyConfig(c0365fm.t);
        return n5;
    }

    public M5(android.content.Context context, java.lang.String str, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager) {
        super(context, str);
        this.f4644a = safePackageManager;
    }
}
