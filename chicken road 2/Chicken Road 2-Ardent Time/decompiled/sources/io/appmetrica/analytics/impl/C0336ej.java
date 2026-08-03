package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336ej implements io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5854a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ib f5855b = new io.appmetrica.analytics.impl.Ib();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f5856c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment f5857d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f5858e;

    public C0336ej(android.content.Context context) {
        this.f5854a = context;
        this.f5857d = new io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment(new io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo(io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.getAppVersionName(context), io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.getAppVersionCodeString(context)), io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector.framework(), new io.appmetrica.analytics.coreapi.internal.model.ScreenInfo(0, 0, 0, 0.0f), new io.appmetrica.analytics.coreapi.internal.model.SdkInfo("8.0.0", "50147728", io.appmetrica.analytics.impl.AbstractC0362fj.a()), "phone", io.appmetrica.analytics.impl.Ib.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo) {
        float f2;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    java.lang.String str = this.f5858e;
                    if (str == null) {
                        android.content.Context context = this.f5854a;
                        android.graphics.Point point = new android.graphics.Point(screenInfo.getWidth(), screenInfo.getHeight());
                        io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager = io.appmetrica.analytics.impl.N7.f4710a;
                        try {
                            f2 = context.getResources().getDisplayMetrics().density;
                        } catch (java.lang.Throwable unused) {
                            f2 = 0.0f;
                        }
                        if (!java.lang.Float.isNaN(f2) && f2 != 0.0f) {
                            int i2 = point.x;
                            int i3 = point.y;
                            if (io.appmetrica.analytics.impl.N7.a(context)) {
                                str = "tv";
                            } else {
                                float f3 = 160 * f2;
                                float f4 = i2;
                                float f5 = f4 / f3;
                                float f6 = i3;
                                float f7 = f6 / f3;
                                double sqrt = java.lang.Math.sqrt((f7 * f7) + (f5 * f5));
                                float f8 = f4 / f2;
                                float f9 = f6 / f2;
                                if (f8 > f9) {
                                    f8 = f9;
                                }
                                if (sqrt < 7 && f8 < 600) {
                                    str = "phone";
                                }
                                str = "tablet";
                            }
                        }
                        str = "phone";
                    }
                    this.f5857d = io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    java.util.Iterator it = this.f5856c.iterator();
                    while (it.hasNext()) {
                        ((io.appmetrica.analytics.impl.AbstractC0581o5) ((io.appmetrica.analytics.impl.InterfaceC0311dj) it.next())).d();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(io.appmetrica.analytics.impl.InterfaceC0311dj interfaceC0311dj) {
        this.f5856c.remove(interfaceC0311dj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment getSdkEnvironment() {
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = this.f5857d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        kotlin.jvm.internal.i.i("sdkEnvironment");
        throw null;
    }

    public final synchronized void a(java.lang.String str) {
        if (str != null) {
            if (!str.equals(this.f5858e)) {
                this.f5858e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f5857d = io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    java.util.Iterator it = this.f5856c.iterator();
                    while (it.hasNext()) {
                        ((io.appmetrica.analytics.impl.AbstractC0581o5) ((io.appmetrica.analytics.impl.InterfaceC0311dj) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!kotlin.jvm.internal.i.a(appVersionInfo.getAppVersionName(), str) || !kotlin.jvm.internal.i.a(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f5857d = io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment.copy$default(getSdkEnvironment(), new io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            java.util.Iterator it = this.f5856c.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.impl.AbstractC0581o5) ((io.appmetrica.analytics.impl.InterfaceC0311dj) it.next())).d();
            }
        }
    }

    public final synchronized void a(android.content.res.Configuration configuration) {
        this.f5855b.getClass();
        java.util.List a2 = io.appmetrica.analytics.impl.Ib.a(configuration);
        if (!kotlin.jvm.internal.i.a(getSdkEnvironment().getLocales(), a2)) {
            this.f5857d = io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, a2, 31, null);
            java.util.Iterator it = this.f5856c.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.impl.AbstractC0581o5) ((io.appmetrica.analytics.impl.InterfaceC0311dj) it.next())).d();
            }
        }
    }

    public final void a(io.appmetrica.analytics.impl.InterfaceC0311dj interfaceC0311dj) {
        this.f5856c.add(interfaceC0311dj);
    }
}
