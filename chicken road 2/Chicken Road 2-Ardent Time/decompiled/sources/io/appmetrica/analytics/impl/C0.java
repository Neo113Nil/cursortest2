package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class C0 implements io.appmetrica.analytics.impl.Ca {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4149a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ba f4150b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ve f4151c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ol f4152d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0462jg f4153e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bf f4154f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0464ji f4155g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0801wi f4156h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.D7 f4157i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Wk f4158j;

    /* renamed from: k, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0458jc f4159k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0524m0 f4160l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4161m;

    public C0(android.content.Context context, io.appmetrica.analytics.impl.Ba ba) {
        this.f4149a = context;
        this.f4150b = ba;
        io.appmetrica.analytics.impl.Ve b2 = io.appmetrica.analytics.impl.C0244b4.l().b(context);
        this.f4151c = b2;
        java.util.ArrayList a2 = io.appmetrica.analytics.impl.C0692sd.a();
        io.appmetrica.analytics.impl.C0244b4 l2 = io.appmetrica.analytics.impl.C0244b4.l();
        l2.m().a(new io.appmetrica.analytics.impl.K3(context));
        io.appmetrica.analytics.impl.D0.a(context).a(a2);
        io.appmetrica.analytics.impl.Bf a3 = io.appmetrica.analytics.impl.D0.a(context, io.appmetrica.analytics.impl.D0.a(ba.b(), this));
        this.f4154f = a3;
        io.appmetrica.analytics.impl.D7 j2 = l2.j();
        this.f4157i = j2;
        io.appmetrica.analytics.impl.C0801wi a4 = io.appmetrica.analytics.impl.D0.a(a3, context, ba.getDefaultExecutor());
        this.f4156h = a4;
        j2.a(a4);
        io.appmetrica.analytics.impl.Ol a5 = io.appmetrica.analytics.impl.D0.a(context, a4, b2, ba.b());
        this.f4152d = a5;
        a4.a(a5);
        this.f4153e = io.appmetrica.analytics.impl.D0.a(a4, b2, ba.b());
        this.f4155g = io.appmetrica.analytics.impl.D0.a(context, a3, a4, ba.b(), a5);
        this.f4158j = l2.o();
        this.f4160l = new io.appmetrica.analytics.impl.C0524m0(b2);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.impl.Ra c(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        return this.f4155g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.impl.X9 d() {
        return this.f4152d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final java.lang.String e() {
        return this.f4152d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final java.util.Map<java.lang.String, java.lang.String> g() {
        return this.f4152d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.AdvIdentifiersResult h() {
        return this.f4152d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final io.appmetrica.analytics.impl.C0458jc i() {
        return this.f4159k;
    }

    public final io.appmetrica.analytics.impl.Ia j() {
        io.appmetrica.analytics.impl.C0458jc c0458jc = this.f4159k;
        kotlin.jvm.internal.i.b(c0458jc);
        return c0458jc.f6186a;
    }

    public final io.appmetrica.analytics.impl.C0464ji k() {
        return this.f4155g;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z2) {
        j().setDataSendingEnabled(z2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(java.lang.String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        java.lang.Boolean bool;
        io.appmetrica.analytics.impl.C0524m0 c0524m0 = this.f4160l;
        io.appmetrica.analytics.impl.C0783w0 c0783w0 = c0524m0.f6380b;
        c0783w0.getClass();
        io.appmetrica.analytics.AppMetricaConfig.Builder newConfigBuilder = io.appmetrica.analytics.AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c0783w0.f6987a.b() && kotlin.jvm.internal.i.a(c0783w0.f6988b.f5643a, java.lang.Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        java.lang.Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = java.lang.Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        io.appmetrica.analytics.AppMetricaConfig build = newConfigBuilder.build();
        io.appmetrica.analytics.AppMetricaConfig.Builder f2 = c0524m0.f6379a.f();
        if (f2 != null) {
            if (f2.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f2.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f2.build();
        }
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger mainPublicOrAnonymousLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new io.appmetrica.analytics.impl.B0(this, build, mainPublicOrAnonymousLogger), false)) {
            io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new java.lang.Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void b(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        boolean z2;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreateMainPublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a2 = a(orCreateMainPublicLogger, appMetricaConfig, new io.appmetrica.analytics.impl.A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a2 || this.f4161m) {
            z2 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z2 = true;
        }
        if (a2 || z2) {
            this.f4151c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new java.lang.Object[0]);
        }
        if (a2) {
            io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new java.lang.Object[0]);
        }
        if (z2) {
            io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new java.lang.Object[0]);
        }
        this.f4161m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.A6
    public final void a(int i2, android.os.Bundle bundle) {
        this.f4152d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f4153e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f4153e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        this.f4155g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List<java.lang.String> list) {
        this.f4152d.a(startupParamsCallback, list, io.appmetrica.analytics.impl.AbstractC0380gb.c(this.f4154f.f4123a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.impl.InterfaceC0795wc interfaceC0795wc, boolean z2) {
        if (this.f4159k == null) {
            a(publicLogger, appMetricaConfig, z2);
            this.f4153e.a();
            io.appmetrica.analytics.impl.C0407hc a2 = interfaceC0795wc.a();
            io.appmetrica.analytics.impl.C0842y7 c0842y7 = new io.appmetrica.analytics.impl.C0842y7(a2);
            io.appmetrica.analytics.impl.C0458jc c0458jc = new io.appmetrica.analytics.impl.C0458jc(a2, c0842y7);
            this.f4150b.c().a(c0842y7);
            this.f4159k = c0458jc;
            io.appmetrica.analytics.impl.C0529m5 c0529m5 = this.f4158j.f5224b;
            synchronized (c0529m5) {
                try {
                    c0529m5.f6389a = a2;
                    java.util.Iterator it = c0529m5.f6390b.iterator();
                    while (it.hasNext()) {
                        ((io.appmetrica.analytics.impl.InterfaceC0228ae) it.next()).consume(a2);
                    }
                    c0529m5.f6390b.clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        interfaceC0795wc.a();
        return false;
    }

    public final void a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, boolean z2) {
        java.lang.Boolean bool = appMetricaConfig.logs;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f4150b.d().a(this.f4149a, appMetricaConfig, this);
            this.f4150b.d().b();
            publicLogger.info("Register application crash handler", new java.lang.Object[0]);
        } else {
            this.f4150b.d().a();
            publicLogger.info("Disable all crash handlers", new java.lang.Object[0]);
        }
        if (((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f4158j.a();
        } else {
            io.appmetrica.analytics.impl.Wk wk = this.f4158j;
            synchronized (wk) {
                if (wk.f5229g) {
                    wk.f5223a.unregisterListener(wk.f5225c, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.RESUMED);
                    wk.f5223a.unregisterListener(wk.f5226d, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.PAUSED);
                    wk.f5229g = false;
                }
            }
        }
        this.f4154f.d(appMetricaConfig);
        io.appmetrica.analytics.impl.Ol ol = this.f4152d;
        ol.f4791e = publicLogger;
        ol.b(appMetricaConfig.customHosts);
        io.appmetrica.analytics.impl.Ol ol2 = this.f4152d;
        java.lang.Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        ol2.a(obj instanceof java.util.Map ? (java.util.Map) obj : null);
        java.lang.String str = (java.lang.String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f4152d.a(str);
        if (str != null) {
            this.f4152d.b("api");
        }
        this.f4156h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, java.lang.Boolean.valueOf(z2));
        this.f4152d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(android.location.Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
        j().a(z2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
        j().a(z2, z3);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str, java.lang.String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Ta
    public final io.appmetrica.analytics.impl.Sa a() {
        return this.f4155g;
    }
}
