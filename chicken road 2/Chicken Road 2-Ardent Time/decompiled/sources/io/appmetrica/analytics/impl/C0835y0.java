package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835y0 implements io.appmetrica.analytics.impl.Ta {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0835y0 f7125e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f7126f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f7127g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7128a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0653r0 f7129b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f7130c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ba f7131d;

    public C0835y0(android.content.Context context) {
        this.f7128a = context;
        io.appmetrica.analytics.impl.C0653r0 c2 = io.appmetrica.analytics.impl.C0244b4.l().c();
        this.f7129b = c2;
        this.f7131d = c2.a(context, io.appmetrica.analytics.impl.C0244b4.l().g());
        this.f7130c = new java.util.concurrent.FutureTask(new io.appmetrica.analytics.impl.Ro(1, this));
    }

    public static io.appmetrica.analytics.impl.C0835y0 a(android.content.Context context) {
        io.appmetrica.analytics.impl.C0835y0 c0835y0 = f7125e;
        if (c0835y0 == null) {
            synchronized (io.appmetrica.analytics.impl.C0835y0.class) {
                try {
                    c0835y0 = f7125e;
                    if (c0835y0 == null) {
                        c0835y0 = new io.appmetrica.analytics.impl.C0835y0(context);
                        c0835y0.j();
                        io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().execute(new io.appmetrica.analytics.impl.RunnableC0809x0(c0835y0));
                        f7125e = c0835y0;
                    }
                } finally {
                }
            }
        }
        return c0835y0;
    }

    public static void b(boolean z2) {
        c().a(z2, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z2;
        synchronized (io.appmetrica.analytics.impl.C0835y0.class) {
            z2 = f7126f;
        }
        return z2;
    }

    public static boolean l() {
        return f7127g;
    }

    public static synchronized boolean m() {
        boolean z2;
        synchronized (io.appmetrica.analytics.impl.C0835y0.class) {
            io.appmetrica.analytics.impl.C0835y0 c0835y0 = f7125e;
            if (c0835y0 != null && c0835y0.f7130c.isDone()) {
                z2 = c0835y0.f().i() != null;
            }
        }
        return z2;
    }

    public static synchronized void n() {
        synchronized (io.appmetrica.analytics.impl.C0835y0.class) {
            f7125e = null;
            f7126f = false;
            f7127g = false;
        }
    }

    public static void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (io.appmetrica.analytics.impl.C0835y0.class) {
            f7126f = true;
        }
    }

    public static void r() {
        f7127g = true;
    }

    public static io.appmetrica.analytics.impl.C0835y0 s() {
        return f7125e;
    }

    public static void setDataSendingEnabled(boolean z2) {
        c().setDataSendingEnabled(z2);
    }

    public static void setUserProfileID(java.lang.String str) {
        c().setUserProfileID(str);
    }

    public final void c(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        this.f7131d.a(appMetricaConfig, this);
    }

    public final void d(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().execute(new io.appmetrica.analytics.impl.RunnableC0784w1(this.f7128a));
    }

    public final java.lang.String e() {
        return f().e();
    }

    public final io.appmetrica.analytics.impl.Ca f() {
        try {
            return (io.appmetrica.analytics.impl.Ca) this.f7130c.get();
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> g() {
        return f().g();
    }

    public final io.appmetrica.analytics.AdvIdentifiersResult h() {
        return f().h();
    }

    public final io.appmetrica.analytics.impl.C0458jc i() {
        return f().i();
    }

    public final void j() {
        io.appmetrica.analytics.impl.R3 r3 = io.appmetrica.analytics.impl.C0244b4.l().f5493c;
        F0.a aVar = new F0.a(9, this);
        r3.f4888a.getClass();
        new io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread(aVar, "IAA-INIT_CORE-" + io.appmetrica.analytics.impl.ThreadFactoryC0874zd.f7184a.incrementAndGet()).start();
    }

    public final void o() {
        io.appmetrica.analytics.impl.C0244b4.l().f5508r.a(this.f7128a);
        new io.appmetrica.analytics.impl.V3(this.f7128a).a(this.f7128a);
        io.appmetrica.analytics.impl.C0244b4.l().a(this.f7128a).a();
        this.f7130c.run();
    }

    public final io.appmetrica.analytics.impl.Ca p() {
        io.appmetrica.analytics.impl.Ca ca;
        io.appmetrica.analytics.impl.C0653r0 c0653r0 = this.f7129b;
        android.content.Context context = this.f7128a;
        io.appmetrica.analytics.impl.Ba ba = this.f7131d;
        synchronized (c0653r0) {
            try {
                if (c0653r0.f6709d == null) {
                    if (c0653r0.a(context)) {
                        c0653r0.f6709d = new io.appmetrica.analytics.impl.E0();
                    } else {
                        c0653r0.f6709d = new io.appmetrica.analytics.impl.C0(context, ba);
                    }
                }
                ca = c0653r0.f6709d;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return ca;
    }

    public final void b(io.appmetrica.analytics.AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().execute(new io.appmetrica.analytics.impl.RunnableC0784w1(this.f7128a));
    }

    public final io.appmetrica.analytics.impl.Ra c(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static io.appmetrica.analytics.impl.Hc c() {
        if (m()) {
            return f7125e.f();
        }
        return io.appmetrica.analytics.impl.C0244b4.l().f5492b;
    }

    public final io.appmetrica.analytics.impl.X9 d() {
        return f().d();
    }

    public final io.appmetrica.analytics.impl.C0321e4 b() {
        return this.f7131d.a();
    }

    public static void a(android.location.Location location) {
        c().a(location);
    }

    public static void a(boolean z2) {
        c().a(z2);
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        c().a(str, str2);
    }

    public static void a(java.lang.String str) {
        c().a(str);
    }

    public final void a(io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List<java.lang.String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(io.appmetrica.analytics.impl.C0835y0 c0835y0) {
        synchronized (io.appmetrica.analytics.impl.C0835y0.class) {
            f7125e = c0835y0;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final io.appmetrica.analytics.impl.Sa a() {
        return f().a();
    }
}
