package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504l6 implements io.appmetrica.analytics.impl.Ua {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0530m6 f6331a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fh f6332b;

    public C0504l6(io.appmetrica.analytics.impl.C0530m6 c0530m6) {
        this.f6331a = c0530m6;
        this.f6332b = c0530m6.a();
        io.appmetrica.analytics.impl.C0244b4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(io.appmetrica.analytics.impl.Qn qn) {
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f6331a.f6391a;
        io.appmetrica.analytics.impl.C0774vh a2 = c0801wi.a(qn, this.f6332b);
        io.appmetrica.analytics.impl.Fh fh = a2.f6978e;
        io.appmetrica.analytics.impl.Pl pl = c0801wi.f7029e;
        if (pl != null) {
            fh.f4368b.setUuid(((io.appmetrica.analytics.impl.Ol) pl).g());
        } else {
            fh.getClass();
        }
        c0801wi.f7027c.b(a2);
        io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + qn, new java.lang.Object[0]);
    }

    public final void a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        java.util.Map<java.lang.String, java.lang.String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                io.appmetrica.analytics.impl.Fh fh = this.f6332b;
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                synchronized (fh) {
                    io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
                    d8.f4203b.b(d8.f4202a, key, value);
                }
            }
        }
    }
}
