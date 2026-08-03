package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407hc extends io.appmetrica.analytics.impl.I2 implements io.appmetrica.analytics.impl.Ia {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.Long f6048r = java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0691sc f6049p;

    /* renamed from: q, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0433ic f6050q;

    public C0407hc(io.appmetrica.analytics.impl.C0691sc c0691sc) {
        super(c0691sc.b(), c0691sc.i(), c0691sc.h(), c0691sc.d(), c0691sc.f(), c0691sc.j(), c0691sc.g(), c0691sc.c(), c0691sc.a(), c0691sc.e());
        this.f6049p = c0691sc;
        this.f6050q = new io.appmetrica.analytics.impl.C0433ic(this);
        l();
    }

    public final void a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.impl.C0498l0 c0498l0) {
        if (c0498l0.f6318b) {
            clearAppEnvironment();
        }
        java.util.List<java.lang.String> list = c0498l0.f6317a;
        if (!io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.isNullOrEmpty(list)) {
            this.f4404b.f4368b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        java.lang.Boolean bool = (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, java.lang.Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f4405c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            io.appmetrica.analytics.impl.Bd bd = this.f6049p.f6807c;
            android.content.Context context = this.f4403a;
            bd.f4118d = new io.appmetrica.analytics.impl.H0(this.f4404b.f4368b.getApiKey(), bd.f4115a.f4123a.getAsString("PROCESS_CFG_PACKAGE_NAME"), io.appmetrica.analytics.internal.CounterConfigurationReporterType.MAIN, bd.f4115a.f4123a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), bd.f4115a.f4123a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f4404b.d());
            java.io.File nativeCrashDirectory = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getNativeCrashDirectory(context);
            java.lang.String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule nativeCrashClientModule = bd.f4116b;
                io.appmetrica.analytics.impl.I0 i02 = bd.f4117c;
                io.appmetrica.analytics.impl.H0 h02 = bd.f4118d;
                if (h02 == null) {
                    kotlin.jvm.internal.i.i("nativeCrashMetadata");
                    throw null;
                }
                i02.getClass();
                nativeCrashClientModule.initHandling(context, new io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig(absolutePath, io.appmetrica.analytics.impl.I0.a(h02)));
            }
        }
        io.appmetrica.analytics.impl.C0433ic c0433ic = this.f6050q;
        synchronized (c0433ic) {
            try {
                java.lang.Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0433ic.f6094a = num != null ? num.intValue() : 5;
                java.lang.Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = java.lang.Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0433ic.f6095b.a(c0433ic.f6094a);
                } else {
                    c0433ic.f6095b.b();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b(android.app.Activity activity) {
        if (this.f6049p.f6813i.a(activity, io.appmetrica.analytics.impl.EnumC0601p.PAUSED)) {
            this.f4405c.info("Pause session", new java.lang.Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            io.appmetrica.analytics.impl.C0319e2 c0319e2 = this.f6049p.f6811g;
            synchronized (c0319e2) {
                for (io.appmetrica.analytics.impl.C0294d2 c0294d2 : c0319e2.f5770a) {
                    if (!c0294d2.f5690d) {
                        c0294d2.f5690d = true;
                        c0294d2.f5688b.executeDelayed(c0294d2.f5691e, c0294d2.f5689c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void c() {
        io.appmetrica.analytics.impl.C0433ic c0433ic = this.f6050q;
        synchronized (c0433ic) {
            c0433ic.f6095b.a(c0433ic.f6094a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final java.util.List<java.lang.String> f() {
        return this.f4404b.f4367a.b();
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final java.lang.String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final void k() {
        super.k();
        io.appmetrica.analytics.impl.C0244b4.l().m().c();
    }

    public final void l() {
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        c0801wi.f7027c.a(this.f4404b.f4367a);
        io.appmetrica.analytics.impl.C0319e2 c0319e2 = this.f6049p.f6811g;
        io.appmetrica.analytics.impl.C0381gc c0381gc = new io.appmetrica.analytics.impl.C0381gc(this);
        long longValue = f6048r.longValue();
        synchronized (c0319e2) {
            c0319e2.a(c0381gc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(java.lang.String str, boolean z2) {
        this.f4405c.info("App opened via deeplink: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str), new java.lang.Object[0]);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", java.lang.Boolean.valueOf(z2));
        java.lang.String b2 = io.appmetrica.analytics.impl.AbstractC0380gb.b(hashMap);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(b2, "", 8208, 0, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(io.appmetrica.analytics.impl.EnumC0549n enumC0549n) {
        if (enumC0549n == io.appmetrica.analytics.impl.EnumC0549n.f6449b) {
            this.f4405c.info("Enable activity auto tracking", new java.lang.Object[0]);
            return;
        }
        this.f4405c.warning("Could not enable activity auto tracking. " + enumC0549n.f6453a, new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(android.app.Activity activity) {
        if (this.f6049p.f6813i.a(activity, io.appmetrica.analytics.impl.EnumC0601p.RESUMED)) {
            this.f4405c.info("Resume session", new java.lang.Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            io.appmetrica.analytics.impl.C0319e2 c0319e2 = this.f6049p.f6811g;
            synchronized (c0319e2) {
                for (io.appmetrica.analytics.impl.C0294d2 c0294d2 : c0319e2.f5770a) {
                    if (c0294d2.f5690d) {
                        c0294d2.f5690d = false;
                        c0294d2.f5688b.remove(c0294d2.f5691e);
                        io.appmetrica.analytics.impl.C0407hc c0407hc = c0294d2.f5687a.f5984a;
                        c0407hc.f4410h.f7027c.b(c0407hc.f4404b.f4367a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(android.location.Location location) {
        this.f4404b.f4368b.setManualLocation(location);
        this.f4405c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
        this.f4404b.f4368b.setLocationTracking(z2);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
        this.f4405c.info("Set advIdentifiersTracking to %s", java.lang.Boolean.valueOf(z2));
        this.f4404b.f4368b.setAdvIdentifiersTracking(z2, z3);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(io.appmetrica.analytics.impl.Ho ho) {
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        synchronized (ho) {
            ho.f4399b = publicLogger;
        }
        java.util.Iterator it = ho.f4398a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.coreapi.internal.backport.Consumer) it.next()).consume(publicLogger);
        }
        ho.f4398a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(io.appmetrica.analytics.AnrListener anrListener) {
        this.f6050q.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(io.appmetrica.analytics.ExternalAttribution externalAttribution) {
        this.f4405c.info("External attribution received: %s", externalAttribution);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        byte[] bytes = externalAttribution.toBytes();
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(bytes, "", 42, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.impl.I2, io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str, java.lang.String str2) {
        super.a(str, str2);
        io.appmetrica.analytics.impl.Bd bd = this.f6049p.f6807c;
        java.lang.String d2 = this.f4404b.d();
        io.appmetrica.analytics.impl.H0 h02 = bd.f4118d;
        if (h02 != null) {
            io.appmetrica.analytics.impl.H0 h03 = new io.appmetrica.analytics.impl.H0(h02.f4360a, h02.f4361b, h02.f4362c, h02.f4363d, h02.f4364e, d2);
            bd.f4118d = h03;
            io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule nativeCrashClientModule = bd.f4116b;
            bd.f4117c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(io.appmetrica.analytics.impl.I0.a(h03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str) {
        this.f4405c.info("Add auto collected data subscriber: %s", str);
        this.f4404b.f4368b.addAutoCollectedDataSubscriber(str);
    }
}
