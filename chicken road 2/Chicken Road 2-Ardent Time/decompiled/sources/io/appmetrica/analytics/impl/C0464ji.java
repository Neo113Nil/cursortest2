package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464ji implements io.appmetrica.analytics.impl.Sa {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bf f6202b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0801wi f6203c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f6204d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ol f6205e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0691sc f6206f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashMap f6207g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.En f6208h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f6209i;

    /* renamed from: j, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0407hc f6210j;

    /* renamed from: k, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0504l6 f6211k;

    public C0464ji(android.content.Context context, io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.impl.C0801wi c0801wi, android.os.Handler handler, io.appmetrica.analytics.impl.Ol ol) {
        this.f6201a = context;
        this.f6202b = bf;
        this.f6203c = c0801wi;
        this.f6204d = handler;
        this.f6205e = ol;
        this.f6206f = new io.appmetrica.analytics.impl.C0691sc(context, bf, c0801wi, ol);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f6207g = linkedHashMap;
        this.f6208h = new io.appmetrica.analytics.impl.En(new io.appmetrica.analytics.impl.C0516li(linkedHashMap));
        this.f6209i = i1.AbstractC0191j.H("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Ta
    public final io.appmetrica.analytics.impl.Sa a() {
        return this;
    }

    public final io.appmetrica.analytics.impl.C0464ji b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized io.appmetrica.analytics.impl.C0407hc b(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.impl.C0498l0 c0498l0) {
        io.appmetrica.analytics.impl.C0407hc c0407hc;
        try {
            c0407hc = this.f6210j;
            if (c0407hc != null) {
                io.appmetrica.analytics.impl.C0691sc c0691sc = this.f6206f;
                c0691sc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new java.lang.Object[0]);
                c0691sc.f6810f.f4368b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f6208h.a(appMetricaConfig.apiKey);
                io.appmetrica.analytics.impl.C0691sc c0691sc2 = this.f6206f;
                c0691sc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new java.lang.Object[0]);
                c0691sc2.f6810f.f4368b.applyFromAnonymousConfig(appMetricaConfig);
                c0407hc = new io.appmetrica.analytics.impl.C0407hc(this.f6206f);
                c0407hc.f4411i = new io.appmetrica.analytics.impl.C0587ob(this.f6204d, c0407hc);
                io.appmetrica.analytics.impl.Ol ol = this.f6205e;
                io.appmetrica.analytics.impl.Fh fh = c0407hc.f4404b;
                if (ol != null) {
                    fh.f4368b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0407hc.a(appMetricaConfig, c0498l0);
                c0407hc.k();
                this.f6203c.f7030f.f5353c = new io.appmetrica.analytics.impl.C0438ii(c0407hc);
                this.f6207g.put(appMetricaConfig.apiKey, c0407hc);
                this.f6210j = c0407hc;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return c0407hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized io.appmetrica.analytics.impl.C0407hc a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.impl.C0498l0 c0498l0) {
        io.appmetrica.analytics.impl.C0407hc c0407hc;
        try {
            c0407hc = this.f6210j;
            if (c0407hc != null) {
                this.f6206f.a(appMetricaConfig, publicLogger);
                c0407hc.a(appMetricaConfig, c0498l0);
                io.appmetrica.analytics.impl.C0244b4.l().getClass();
                this.f6207g.put(appMetricaConfig.apiKey, c0407hc);
            } else {
                this.f6208h.a(appMetricaConfig.apiKey);
                this.f6206f.a(appMetricaConfig, publicLogger);
                c0407hc = new io.appmetrica.analytics.impl.C0407hc(this.f6206f);
                c0407hc.f4411i = new io.appmetrica.analytics.impl.C0587ob(this.f6204d, c0407hc);
                io.appmetrica.analytics.impl.Ol ol = this.f6205e;
                io.appmetrica.analytics.impl.Fh fh = c0407hc.f4404b;
                if (ol != null) {
                    fh.f4368b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0407hc.a(appMetricaConfig, c0498l0);
                c0407hc.k();
                this.f6203c.f7030f.f5353c = new io.appmetrica.analytics.impl.C0438ii(c0407hc);
                this.f6207g.put(appMetricaConfig.apiKey, c0407hc);
                io.appmetrica.analytics.impl.C0244b4.l().getClass();
                this.f6210j = c0407hc;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return c0407hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized void a(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        try {
            if (this.f6207g.containsKey(reporterConfig.apiKey)) {
                io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized io.appmetrica.analytics.impl.Ra b(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        io.appmetrica.analytics.impl.Ra ra;
        try {
            ra = (io.appmetrica.analytics.impl.Ra) this.f6207g.get(reporterConfig.apiKey);
            if (ra == null) {
                if (!this.f6209i.contains(reporterConfig.apiKey)) {
                    this.f6205e.i();
                }
                android.content.Context context = this.f6201a;
                io.appmetrica.analytics.impl.C0847yc c0847yc = new io.appmetrica.analytics.impl.C0847yc(context, this.f6202b, reporterConfig, this.f6203c, new io.appmetrica.analytics.impl.M9(context));
                c0847yc.f4411i = new io.appmetrica.analytics.impl.C0587ob(this.f6204d, c0847yc);
                io.appmetrica.analytics.impl.Ol ol = this.f6205e;
                io.appmetrica.analytics.impl.Fh fh = c0847yc.f4404b;
                if (ol != null) {
                    fh.f4368b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0847yc.k();
                this.f6207g.put(reporterConfig.apiKey, c0847yc);
                ra = c0847yc;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return ra;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized io.appmetrica.analytics.impl.Ua a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        io.appmetrica.analytics.impl.C0504l6 c0504l6;
        try {
            c0504l6 = this.f6211k;
            if (c0504l6 != null) {
                c0504l6.a(appMetricaConfig);
            } else {
                io.appmetrica.analytics.impl.C0504l6 c0504l62 = new io.appmetrica.analytics.impl.C0504l6(new io.appmetrica.analytics.impl.C0530m6(this.f6202b, this.f6206f.f6809e, this.f6203c, appMetricaConfig));
                this.f6211k = c0504l62;
                c0504l6 = c0504l62;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return c0504l6;
    }
}
