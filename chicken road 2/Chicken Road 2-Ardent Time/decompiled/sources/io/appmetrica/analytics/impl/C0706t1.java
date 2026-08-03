package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706t1 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f6831a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ho f6832b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0594oi f6833c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.D7 f6834d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0416hl f6835e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.A2 f6836f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0392gn f6837g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Wk f6838h;

    public C0706t1(io.appmetrica.analytics.impl.C0861z0 c0861z0, io.appmetrica.analytics.impl.A2 a2, io.appmetrica.analytics.impl.C0416hl c0416hl, io.appmetrica.analytics.impl.Ho ho, io.appmetrica.analytics.impl.C0392gn c0392gn, io.appmetrica.analytics.impl.C0594oi c0594oi, io.appmetrica.analytics.impl.D7 d7, io.appmetrica.analytics.impl.Wk wk) {
        this.f6831a = c0861z0;
        this.f6832b = ho;
        this.f6833c = c0594oi;
        this.f6834d = d7;
        this.f6836f = a2;
        this.f6837g = c0392gn;
        this.f6835e = c0416hl;
        this.f6838h = wk;
    }

    public static io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c() {
        return io.appmetrica.analytics.impl.C0244b4.l().f5493c.a();
    }

    public final void a(android.content.Context context, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4011f.a(context);
        a2.f4007b.a(appMetricaConfig);
        io.appmetrica.analytics.impl.C0392gn c0392gn = this.f6837g;
        android.content.Context applicationContext = context.getApplicationContext();
        c0392gn.f6012e.a(applicationContext);
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreatePublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, java.lang.Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new java.lang.Object[0]);
            c0392gn.f6011d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new java.lang.Object[0]);
        }
        c0392gn.f6008a.getClass();
        io.appmetrica.analytics.impl.C0835y0 a3 = io.appmetrica.analytics.impl.C0835y0.a(applicationContext);
        a3.f7131d.a(appMetricaConfig, a3);
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new F0.b(this, context, appMetricaConfig, 4));
        this.f6831a.getClass();
        io.appmetrica.analytics.impl.C0861z0.b();
    }

    public final java.lang.String b() {
        this.f6831a.getClass();
        io.appmetrica.analytics.impl.C0835y0 c0835y0 = io.appmetrica.analytics.impl.C0835y0.f7125e;
        if (c0835y0 == null) {
            return null;
        }
        return c0835y0.f().e();
    }

    public final io.appmetrica.analytics.impl.C0458jc d() {
        this.f6831a.getClass();
        return io.appmetrica.analytics.impl.C0835y0.f7125e.f().i();
    }

    public final void e() {
        d().f6186a.a(this.f6838h.a());
    }

    public final void f() {
        this.f6836f.f4006a.a(null);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.W0(this));
    }

    public final void c(android.app.Activity activity) {
        this.f6836f.f4006a.a(null);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0396h1(this, activity));
    }

    public final void b(android.content.Context context, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f6831a;
        android.content.Context applicationContext = context.getApplicationContext();
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0 a2 = io.appmetrica.analytics.impl.C0835y0.a(applicationContext);
        a2.f().b(this.f6834d.a(appMetricaConfig));
        android.content.Context context2 = a2.f7128a;
        ((io.appmetrica.analytics.impl.C0870z9) io.appmetrica.analytics.impl.C0244b4.l().f5493c.a()).execute(new io.appmetrica.analytics.impl.RunnableC0784w1(context2));
    }

    public final void d(java.lang.String str) {
        this.f6836f.getClass();
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.T0(this, str));
    }

    public C0706t1() {
        this(io.appmetrica.analytics.impl.C0244b4.l().d(), new io.appmetrica.analytics.impl.Ho());
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4023r.a(str);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0577o1(this, str, str2));
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        if (a2.f4019n.a(str).f6701a) {
            this.f6837g.getClass();
            io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
            ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0293d1(this, str, str2));
        }
    }

    public C0706t1(io.appmetrica.analytics.impl.C0861z0 c0861z0, io.appmetrica.analytics.impl.Ho ho) {
        this(c0861z0, new io.appmetrica.analytics.impl.A2(c0861z0), new io.appmetrica.analytics.impl.C0416hl(c0861z0), ho, new io.appmetrica.analytics.impl.C0392gn(c0861z0, ho), io.appmetrica.analytics.impl.C0594oi.a(), io.appmetrica.analytics.impl.C0244b4.l().j(), io.appmetrica.analytics.impl.C0244b4.l().o());
    }

    public final void b(java.lang.String str) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4023r.a(str);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0551n1(this, str));
    }

    public final void c(boolean z2) {
        this.f6836f.getClass();
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.Q0(this, z2));
    }

    public final void a(android.app.Activity activity) {
        this.f6836f.f4006a.a(null);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0525m1(this, activity));
    }

    public final void b(android.app.Activity activity) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4008c.a(activity);
        this.f6837g.getClass();
        android.content.Intent a3 = io.appmetrica.analytics.impl.C0392gn.a(activity);
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.M0(this, a3));
    }

    public final void c(java.lang.String str) {
        if (this.f6835e.a((java.lang.Void) null).f6701a && this.f6836f.f4018m.a(str).f6701a) {
            this.f6837g.getClass();
            io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
            ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0318e1(this, str));
        }
    }

    public final void a(android.app.Application application) {
        this.f6836f.f4010e.a(application);
        this.f6837g.f6010c.a(application);
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new F0.a(7, this));
    }

    public final void b(boolean z2) {
        this.f6836f.getClass();
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.S0(this, z2));
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        this.f6836f.f4016k.a(str);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0241b1(this, str, str2));
    }

    public final void a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4023r.a(str);
        this.f6837g.getClass();
        java.util.List listFromMap = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(map);
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0603p1(this, str, listFromMap));
    }

    public final void b(java.lang.Object... objArr) {
        this.f6836f.f4006a.a(null);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new F0.a(8, objArr));
    }

    public final void a(java.lang.String str, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4024s.a(str);
        this.f6837g.getClass();
        if (th == null) {
            th = new io.appmetrica.analytics.impl.N1();
            th.fillInStackTrace();
        }
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0629q1(this, str, th));
    }

    public final void b(android.content.Context context) {
        this.f6836f.f4011f.a(context);
        this.f6837g.f6012e.a(context);
        this.f6831a.getClass();
        io.appmetrica.analytics.impl.C0835y0.a(context);
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.t.a(str);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0654r1(this, str, str2, th));
    }

    public final void a(java.lang.Throwable th) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4025u.a(th);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0680s1(this, th));
    }

    public final void a(java.lang.String str) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4014i.a(str);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.N0(this, str));
    }

    public final void a(android.content.Intent intent) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4009d.a(intent);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.O0(this, intent));
    }

    public final void a(android.location.Location location) {
        this.f6836f.getClass();
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.P0(this, location));
    }

    public final void a(boolean z2) {
        this.f6836f.getClass();
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.R0(this, z2));
    }

    public final void a(io.appmetrica.analytics.profile.UserProfile userProfile) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4026v.a(userProfile);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.U0(this, userProfile));
    }

    public final void a(io.appmetrica.analytics.Revenue revenue) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4027w.a(revenue);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.V0(this, revenue));
    }

    public final void a(io.appmetrica.analytics.AdRevenue adRevenue) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4028x.a(adRevenue);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.X0(this, adRevenue));
    }

    public final void a(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4029y.a(eCommerceEvent);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.Y0(this, eCommerceEvent));
    }

    public final void a(io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4012g.a(deferredDeeplinkParametersListener);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.Z0(this, deferredDeeplinkParametersListener));
    }

    public final void a(io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4012g.a(deferredDeeplinkListener);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0215a1(this, deferredDeeplinkListener));
    }

    public final io.appmetrica.analytics.impl.Ra a(android.content.Context context, java.lang.String str) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4011f.a(context);
        a2.f4015j.a(str);
        io.appmetrica.analytics.impl.C0392gn c0392gn = this.f6837g;
        c0392gn.f6012e.a(context.getApplicationContext());
        return this.f6833c.a(context.getApplicationContext(), str);
    }

    public final void a(android.content.Context context, io.appmetrica.analytics.ReporterConfig reporterConfig) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4011f.a(context);
        a2.f4013h.a(reporterConfig);
        io.appmetrica.analytics.impl.C0392gn c0392gn = this.f6837g;
        c0392gn.f6012e.a(context.getApplicationContext());
        io.appmetrica.analytics.impl.C0594oi c0594oi = this.f6833c;
        android.content.Context applicationContext = context.getApplicationContext();
        if (((io.appmetrica.analytics.impl.C0387gi) c0594oi.f6596a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0594oi.f6596a) {
                try {
                    if (((io.appmetrica.analytics.impl.C0387gi) c0594oi.f6596a.get(reporterConfig.apiKey)) == null) {
                        java.lang.String str = reporterConfig.apiKey;
                        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor a3 = io.appmetrica.analytics.impl.C0244b4.l().f5493c.a();
                        c0594oi.f6597b.getClass();
                        if (io.appmetrica.analytics.impl.C0835y0.f7125e == null) {
                            ((io.appmetrica.analytics.impl.C0870z9) a3).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0542mi(c0594oi, applicationContext));
                        }
                        io.appmetrica.analytics.impl.C0387gi c0387gi = new io.appmetrica.analytics.impl.C0387gi(applicationContext.getApplicationContext(), str, new io.appmetrica.analytics.impl.C0861z0());
                        c0594oi.f6596a.put(str, c0387gi);
                        c0387gi.a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    public final void a(android.webkit.WebView webView) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4017l.a(webView);
        io.appmetrica.analytics.impl.Ho ho = this.f6837g.f6009b;
        ho.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new io.appmetrica.analytics.internal.js.AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                io.appmetrica.analytics.impl.Eo eo = new io.appmetrica.analytics.impl.Eo();
                synchronized (ho) {
                    try {
                        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = ho.f4399b;
                        if (publicLogger == null) {
                            ho.f4398a.add(eo);
                        } else {
                            eo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                ho.a(new io.appmetrica.analytics.impl.Fo());
            }
        } catch (java.lang.Throwable th) {
            ho.a(new io.appmetrica.analytics.impl.Go(th));
        }
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0267c1(this));
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult a(android.content.Context context) {
        this.f6836f.f4011f.a(context);
        io.appmetrica.analytics.impl.C0392gn c0392gn = this.f6837g;
        android.content.Context applicationContext = context.getApplicationContext();
        c0392gn.f6012e.a(applicationContext);
        c0392gn.f6013f.a(applicationContext);
        return io.appmetrica.analytics.impl.C0244b4.l().a(context.getApplicationContext()).a();
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        this.f6836f.getClass();
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0344f1(this, str, str2));
    }

    public final void a() {
        this.f6836f.getClass();
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0370g1(this));
    }

    public final void a(android.content.Context context, io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List<java.lang.String> list) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4011f.a(context);
        a2.f4020o.a(startupParamsCallback);
        io.appmetrica.analytics.impl.C0392gn c0392gn = this.f6837g;
        c0392gn.f6012e.a(context.getApplicationContext());
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0422i1(this, context, startupParamsCallback, list));
    }

    public final void a(io.appmetrica.analytics.AnrListener anrListener) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4021p.a(anrListener);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0447j1(this, anrListener));
    }

    public final void a(io.appmetrica.analytics.ExternalAttribution externalAttribution) {
        io.appmetrica.analytics.impl.A2 a2 = this.f6836f;
        a2.f4006a.a(null);
        a2.f4022q.a(externalAttribution);
        this.f6837g.getClass();
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0473k1(this, externalAttribution));
    }

    public static /* synthetic */ void a(java.lang.Object[] objArr) {
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor b2 = io.appmetrica.analytics.impl.C0244b4.l().m().b();
        if (b2 != null) {
            b2.process(objArr);
        }
    }

    public final void a(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map) {
        this.f6836f.f4030z.a(map);
        this.f6837g.getClass();
        java.util.List listFromMap = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(map);
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor c2 = c();
        ((io.appmetrica.analytics.impl.C0870z9) c2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0499l1(this, listFromMap));
    }

    public static io.appmetrica.analytics.impl.Ia a(io.appmetrica.analytics.impl.C0706t1 c0706t1) {
        return c0706t1.d().f6186a;
    }
}
