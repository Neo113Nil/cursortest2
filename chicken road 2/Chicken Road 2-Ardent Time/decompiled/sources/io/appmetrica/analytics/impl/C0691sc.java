package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691sc {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6805a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0801wi f6806b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bd f6807c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.M9 f6808d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.D8 f6809e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fh f6810f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0319e2 f6811g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0659r6 f6812h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0627q f6813i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Je f6814j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Rn f6815k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Eg f6816l;

    /* renamed from: m, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0763v6 f6817m;

    /* renamed from: n, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0292d0 f6818n;

    public C0691sc(android.content.Context context, io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Ol ol) {
        this.f6805a = context;
        this.f6806b = c0801wi;
        this.f6807c = new io.appmetrica.analytics.impl.Bd(bf);
        io.appmetrica.analytics.impl.M9 m9 = new io.appmetrica.analytics.impl.M9(context);
        this.f6808d = m9;
        io.appmetrica.analytics.impl.D8 d8 = new io.appmetrica.analytics.impl.D8(new io.appmetrica.analytics.impl.C0674rl(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f6809e = d8;
        this.f6810f = new io.appmetrica.analytics.impl.Fh(bf, new io.appmetrica.analytics.internal.CounterConfiguration(io.appmetrica.analytics.internal.CounterConfigurationReporterType.MAIN), d8);
        this.f6811g = new io.appmetrica.analytics.impl.C0319e2();
        this.f6812h = io.appmetrica.analytics.impl.C0244b4.l().n();
        this.f6813i = new io.appmetrica.analytics.impl.C0627q();
        this.f6814j = new io.appmetrica.analytics.impl.Je(m9);
        this.f6815k = new io.appmetrica.analytics.impl.Rn();
        this.f6816l = new io.appmetrica.analytics.impl.Eg();
        this.f6817m = new io.appmetrica.analytics.impl.C0763v6();
        this.f6818n = new io.appmetrica.analytics.impl.C0292d0();
    }

    public final io.appmetrica.analytics.impl.C0292d0 a() {
        return this.f6818n;
    }

    public final android.content.Context b() {
        return this.f6805a;
    }

    public final io.appmetrica.analytics.impl.C0763v6 c() {
        return this.f6817m;
    }

    public final io.appmetrica.analytics.impl.M9 d() {
        return this.f6808d;
    }

    public final io.appmetrica.analytics.impl.Je e() {
        return this.f6814j;
    }

    public final io.appmetrica.analytics.impl.C0659r6 f() {
        return this.f6812h;
    }

    public final io.appmetrica.analytics.impl.Eg g() {
        return this.f6816l;
    }

    public final io.appmetrica.analytics.impl.Fh h() {
        return this.f6810f;
    }

    public final io.appmetrica.analytics.impl.C0801wi i() {
        return this.f6806b;
    }

    public final io.appmetrica.analytics.impl.Rn j() {
        return this.f6815k;
    }

    public final void a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new java.lang.Object[0]);
        this.f6810f.f4368b.applyFromConfig(appMetricaConfig);
        io.appmetrica.analytics.impl.Fh fh = this.f6810f;
        java.lang.String str = appMetricaConfig.userProfileID;
        synchronized (fh) {
            fh.f4296f = str;
        }
        io.appmetrica.analytics.impl.Fh fh2 = this.f6810f;
        io.appmetrica.analytics.PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        java.lang.Boolean bool = (java.lang.Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        fh2.f4294d = new io.appmetrica.analytics.impl.C0746uf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Actual session timeout is ");
        java.lang.Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new java.lang.Object[0]);
    }
}
