package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387gi implements io.appmetrica.analytics.impl.Ra {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f5991a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ah f5992b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f5993c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f5994d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.ReporterConfig f5995e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0646qi f5996f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Oe f5997g;

    public C0387gi(io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, android.content.Context context, java.lang.String str) {
        this(context.getApplicationContext(), str, new io.appmetrica.analytics.impl.C0861z0());
    }

    public static io.appmetrica.analytics.impl.Ra a(io.appmetrica.analytics.impl.C0861z0 c0861z0, android.content.Context context, io.appmetrica.analytics.ReporterConfig reporterConfig) {
        c0861z0.getClass();
        return io.appmetrica.analytics.impl.C0835y0.a(context).f().c(reporterConfig);
    }

    public final void c(java.lang.String str) {
        io.appmetrica.analytics.ReporterConfig build = io.appmetrica.analytics.ReporterConfig.newConfigBuilder(str).build();
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Th(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.RunnableC0310di(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final io.appmetrica.analytics.plugins.IPluginReporter getPluginExtension() {
        return this.f5997g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Lh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.RunnableC0284ci(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue) {
        this.f5992b.f4067h.a(adRevenue);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Ph(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map) {
        this.f5992b.f4069j.a(map);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Zh(this, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        this.f5992b.f4068i.a(eCommerceEvent);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Rh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.Throwable th) {
        this.f5992b.f4061b.a(str);
        this.f5996f.getClass();
        if (th == null) {
            th = new io.appmetrica.analytics.impl.N1();
            th.fillInStackTrace();
        }
        this.f5993c.execute(new io.appmetrica.analytics.impl.Hh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str) {
        this.f5992b.f4060a.a(str);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.RunnableC0335ei(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(io.appmetrica.analytics.Revenue revenue) {
        this.f5992b.f4066g.a(revenue);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Oh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(java.lang.Throwable th) {
        this.f5992b.f4064e.a(th);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Jh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(io.appmetrica.analytics.profile.UserProfile userProfile) {
        this.f5992b.f4065f.a(userProfile);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Nh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Kh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.RunnableC0258bi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Sh(this, z2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(java.lang.String str, byte[] bArr) {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Wh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(java.lang.String str) {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Mh(this, str));
    }

    public C0387gi(android.content.Context context, java.lang.String str, io.appmetrica.analytics.impl.C0861z0 c0861z0) {
        this(context, new io.appmetrica.analytics.impl.Ah(), c0861z0, new io.appmetrica.analytics.impl.C0646qi(), io.appmetrica.analytics.ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(io.appmetrica.analytics.impl.Qn qn) {
        this.f5992b.f4063d.a(qn);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Yh(this, qn));
    }

    public C0387gi(android.content.Context context, io.appmetrica.analytics.impl.Ah ah, io.appmetrica.analytics.impl.C0861z0 c0861z0, io.appmetrica.analytics.impl.C0646qi c0646qi, io.appmetrica.analytics.ReporterConfig reporterConfig) {
        this(context, ah, c0861z0, c0646qi, reporterConfig, new io.appmetrica.analytics.impl.Oe(new io.appmetrica.analytics.impl.Qh(c0861z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue, boolean z2) {
        this.f5992b.f4067h.a(adRevenue);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Xh(this, adRevenue, z2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.lang.String str2) {
        this.f5992b.f4060a.a(str);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.RunnableC0361fi(this, str, str2));
    }

    public C0387gi(android.content.Context context, io.appmetrica.analytics.impl.Ah ah, io.appmetrica.analytics.impl.C0861z0 c0861z0, io.appmetrica.analytics.impl.C0646qi c0646qi, io.appmetrica.analytics.ReporterConfig reporterConfig, io.appmetrica.analytics.impl.Oe oe) {
        this.f5993c = io.appmetrica.analytics.impl.C0244b4.l().g().a();
        this.f5994d = context;
        this.f5992b = ah;
        this.f5991a = c0861z0;
        this.f5996f = c0646qi;
        this.f5995e = reporterConfig;
        this.f5997g = oe;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        this.f5992b.f4062c.a(str);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Ih(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0369g0
    public final void a(io.appmetrica.analytics.impl.V v2) {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.RunnableC0232ai(this, v2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f5992b.f4060a.a(str);
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Gh(this, str, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(map)));
    }

    public final void a(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Uh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(io.appmetrica.analytics.ModuleEvent moduleEvent) {
        this.f5992b.getClass();
        this.f5996f.getClass();
        this.f5993c.execute(new io.appmetrica.analytics.impl.Vh(this, moduleEvent));
    }
}
