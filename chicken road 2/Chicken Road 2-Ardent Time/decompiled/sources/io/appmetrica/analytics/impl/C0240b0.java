package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240b0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f5483a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Wk f5484b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.R3 f5485c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5486d = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);

    public C0240b0(io.appmetrica.analytics.impl.C0861z0 c0861z0, io.appmetrica.analytics.impl.Wk wk, io.appmetrica.analytics.impl.R3 r3) {
        this.f5483a = c0861z0;
        this.f5484b = wk;
        this.f5485c = r3;
    }

    public final synchronized void a(android.content.Context context, io.appmetrica.analytics.AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f5483a.getClass();
        if (io.appmetrica.analytics.impl.C0861z0.a()) {
            return;
        }
        io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new java.lang.Object[0]);
        this.f5484b.a();
        this.f5483a.getClass();
        io.appmetrica.analytics.impl.C0835y0 a2 = io.appmetrica.analytics.impl.C0835y0.a(context);
        a2.f7131d.a(null, a2);
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor a3 = this.f5485c.a();
        ((io.appmetrica.analytics.impl.C0870z9) a3).f7180b.post(new F0.b(this, context, appMetricaLibraryAdapterConfig, 3));
        this.f5483a.getClass();
        io.appmetrica.analytics.impl.C0861z0.b();
    }

    public static final void a(io.appmetrica.analytics.impl.C0240b0 c0240b0, android.content.Context context, io.appmetrica.analytics.AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0240b0.f5483a.getClass();
        io.appmetrica.analytics.impl.C0835y0 a2 = io.appmetrica.analytics.impl.C0835y0.a(context);
        a2.f().a(appMetricaLibraryAdapterConfig);
        io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().execute(new io.appmetrica.analytics.impl.RunnableC0784w1(a2.f7128a));
    }
}
