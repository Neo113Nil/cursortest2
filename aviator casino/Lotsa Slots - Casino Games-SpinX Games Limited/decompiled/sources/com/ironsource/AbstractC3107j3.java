package com.ironsource;

/* renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3107j3<Listener extends com.ironsource.R0> implements com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener, com.ironsource.Af.a, com.ironsource.E0, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener, com.ironsource.K8.b {

    /* renamed from: a, reason: collision with root package name */
    protected com.ironsource.C3176n0 f6320a;
    protected Listener b;
    protected com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> c;
    protected com.ironsource.F0 d;
    protected com.ironsource.AbstractC3107j3.h e;
    protected com.ironsource.C3064gd g;
    protected com.ironsource.C3016e1 h;
    protected org.json.JSONObject i;
    protected java.lang.String j;
    protected com.ironsource.mediationsdk.adunit.adapter.utility.AdData k;
    protected java.lang.Long l;
    protected com.ironsource.C3056g5 m;
    private final com.ironsource.C3232q2 o;
    private final com.ironsource.InterfaceC3243qd p;
    private java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.ironsource.Af n = new com.ironsource.Af(java.util.concurrent.TimeUnit.SECONDS.toMillis(s()));
    protected final java.lang.Object q = new java.lang.Object();

    /* renamed from: com.ironsource.j3$a */
    class a extends com.ironsource.AbstractRunnableC3136ke {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3107j3.this.L();
        }
    }

    /* renamed from: com.ironsource.j3$b */
    class b extends com.ironsource.AbstractRunnableC3136ke {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3107j3.this.K();
        }
    }

    /* renamed from: com.ironsource.j3$c */
    class c extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ int b;
        final /* synthetic */ java.lang.String c;

        c(int i, java.lang.String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3107j3.this.a(this.b, this.c);
        }
    }

    /* renamed from: com.ironsource.j3$d */
    class d extends com.ironsource.AbstractRunnableC3136ke {
        d() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3107j3.this.I();
        }
    }

    /* renamed from: com.ironsource.j3$e */
    class e extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType b;
        final /* synthetic */ int c;
        final /* synthetic */ java.lang.String d;

        e(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str) {
            this.b = adapterErrorType;
            this.c = i;
            this.d = str;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3107j3.this.a(this.b, this.c, this.d);
        }
    }

    /* renamed from: com.ironsource.j3$f */
    class f extends com.ironsource.AbstractRunnableC3136ke {
        f() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3107j3.this.J();
        }
    }

    /* renamed from: com.ironsource.j3$g */
    class g extends com.ironsource.AbstractRunnableC3136ke {
        g() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3107j3.this.H();
        }
    }

    /* renamed from: com.ironsource.j3$h */
    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3107j3(com.ironsource.InterfaceC3243qd interfaceC3243qd, com.ironsource.C3176n0 c3176n0, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.C3016e1 c3016e1, com.ironsource.C3232q2 c3232q2, Listener listener) {
        this.f6320a = c3176n0;
        this.b = listener;
        this.d = new com.ironsource.F0(c3176n0.a(), com.ironsource.F0.b.PROVIDER, this);
        this.h = c3016e1;
        this.i = c3016e1.c();
        this.c = baseAdAdapter;
        this.o = c3232q2;
        this.p = interfaceC3243qd;
        a(com.ironsource.AbstractC3107j3.h.NONE);
    }

    private boolean D() {
        return this.e == com.ironsource.AbstractC3107j3.h.INIT_IN_PROGRESS;
    }

    private void F() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        a(com.ironsource.AbstractC3107j3.h.LOADING);
        a(false);
        try {
            this.n.a((com.ironsource.Af.a) this);
            G();
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.ironsource.F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str);
            }
            onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.ironsource.F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a(j());
        }
        this.b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean z;
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        com.ironsource.Af af = this.n;
        if (af != null) {
            af.e();
        }
        synchronized (this.q) {
            com.ironsource.AbstractC3107j3.h hVar = this.e;
            z = false;
            if (hVar == com.ironsource.AbstractC3107j3.h.LOADING) {
                long a2 = com.ironsource.C3056g5.a(this.m);
                ironLog.verbose(a("Load duration = " + a2));
                if (this.d != null) {
                    if (v()) {
                        this.d.f.a(a2);
                    } else {
                        this.d.f.a(a2, false);
                    }
                }
                a(com.ironsource.AbstractC3107j3.h.LOADED);
                z = O();
            } else if (hVar != com.ironsource.AbstractC3107j3.h.FAILED) {
                ironLog.error(a(java.lang.String.format("unexpected load success for %s, state - %s", k(), this.e)));
                java.lang.String format = java.lang.String.format("unexpected load success, state - %s", this.e);
                if (this.d != null) {
                    if (v()) {
                        this.d.j.s(format);
                    } else {
                        this.d.j.p(format);
                    }
                }
            }
        }
        if (z) {
            this.b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        a(com.ironsource.AbstractC3107j3.h.SHOWING);
        com.ironsource.F0 f0 = this.d;
        if (f0 != null) {
            f0.i.g(j());
        }
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            com.ironsource.Af af = this.n;
            if (af != null) {
                af.e();
            }
            a(com.ironsource.AbstractC3107j3.h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == com.ironsource.AbstractC3107j3.h.FAILED) {
            return;
        }
        ironLog.error(a(java.lang.String.format("unexpected init success for %s, state - %s", k(), this.e)));
        if (this.d != null) {
            this.d.j.n(java.lang.String.format("unexpected init success, state - %s", this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long a2 = com.ironsource.C3056g5.a(this.m);
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a2 + ", state = " + this.e + ", isBidder = " + w()));
        synchronized (this.q) {
            if (!z()) {
                ironLog.error(a(java.lang.String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.e, 1025)));
                if (this.d != null) {
                    this.d.j.u(java.lang.String.format("unexpected timeout, state - %s, error - %s", this.e, 1025));
                }
            } else {
                a(com.ironsource.AbstractC3107j3.h.FAILED);
                com.ironsource.F0 f0 = this.d;
                if (f0 != null) {
                    f0.f.a(a2, 1025, false);
                    this.d.f.a(a2, 1025, "time out", false);
                }
                this.b.a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out"), this);
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        com.ironsource.C3232q2 c3232q2 = this.o;
        if (c3232q2 == null) {
            return this.f6320a.f();
        }
        java.lang.Integer f2 = c3232q2.f();
        int f3 = (f2 == null || f2.intValue() <= 0) ? this.f6320a.f() : f2.intValue();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + f3 + " seconds"));
        return f3;
    }

    public java.util.concurrent.atomic.AtomicBoolean A() {
        return this.f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.e == com.ironsource.AbstractC3107j3.h.SHOWING;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public void E() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        com.ironsource.C3232q2 i = i();
        java.lang.String k = i.k();
        java.util.Map<java.lang.String, java.lang.Object> a2 = com.ironsource.C3079ha.a(i.a());
        a2.put("adUnit", this.f6320a.a());
        b(k);
        try {
            boolean z = false;
            if (v()) {
                this.d.f.d();
            } else {
                this.d.f.a(false);
            }
            this.l = null;
            this.m = new com.ironsource.C3056g5();
            this.k = a(k, a2);
            synchronized (this.q) {
                if (this.e != com.ironsource.AbstractC3107j3.h.NONE) {
                    z = true;
                } else {
                    a(com.ironsource.AbstractC3107j3.h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                java.lang.String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.j.g(str);
                onInitFailed(com.ironsource.B0.c(this.f6320a.a()), str);
                return;
            }
            this.n.a((com.ironsource.Af.a) this);
            ?? networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.k, com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            java.lang.String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(com.ironsource.B0.c(this.f6320a.a()), str2);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str3));
            com.ironsource.F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str3);
            }
            onInitFailed(com.ironsource.B0.c(this.f6320a.a()), str3);
        }
    }

    protected void G() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) {
            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) obj).loadAd(this.k, com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void M() {
        synchronized (this) {
            if (this.c != null) {
                try {
                    this.c = null;
                } catch (java.lang.Exception e2) {
                    com.ironsource.C3180n4.d().a(e2);
                    java.lang.String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
                    if (this.d != null) {
                        this.d.j.g(str);
                    }
                }
            }
            com.ironsource.F0 f0 = this.d;
            if (f0 != null) {
                f0.f();
                this.d = null;
            }
            com.ironsource.Af af = this.n;
            if (af != null) {
                af.d();
                this.n = null;
            }
        }
    }

    public void N() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.ironsource.F0 f0 = this.d;
        if (f0 != null) {
            f0.i.a();
        }
    }

    protected boolean O() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 c0) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> baseAdAdapter = this.c;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> baseAdAdapter2 = this.c;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        hashMap.put("spId", this.h.i());
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        hashMap.put("instanceType", java.lang.Integer.valueOf(l()));
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(o()));
        if (!android.text.TextUtils.isEmpty(this.j)) {
            hashMap.put("dynamicDemandSource", this.j);
        }
        hashMap.put("sessionDepth", r());
        if (this.f6320a.e() != null && this.f6320a.e().length() > 0) {
            hashMap.put("genericParams", this.f6320a.e());
        }
        if (!android.text.TextUtils.isEmpty(this.f6320a.c())) {
            hashMap.put("auctionId", this.f6320a.c());
        }
        if (b(c0)) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(this.f6320a.d()));
            if (!android.text.TextUtils.isEmpty(this.f6320a.b())) {
                hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, this.f6320a.b());
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f6320a.g().getCustomNetwork())) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f6320a.g().getCustomNetwork());
        }
        return hashMap;
    }

    public void b(java.lang.String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.K8.b
    public java.lang.String c() {
        return this.h.f();
    }

    protected java.lang.String d() {
        return a((java.lang.String) null);
    }

    public java.lang.Long e() {
        return this.l;
    }

    public com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f() {
        return new com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo(this.o.a(j()), this.o.d());
    }

    public com.ironsource.mediationsdk.IronSource.a g() {
        return this.f6320a.a();
    }

    public java.lang.String h() {
        return this.f6320a.c();
    }

    public com.ironsource.C3232q2 i() {
        return this.o;
    }

    protected java.lang.String j() {
        com.ironsource.C3064gd c3064gd = this.g;
        return c3064gd == null ? "" : c3064gd.c();
    }

    public java.lang.String k() {
        return java.lang.String.format("%s %s", c(), java.lang.Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.h.d();
    }

    public java.lang.String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public java.lang.String n() {
        return this.h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.AbstractC3107j3.g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdClicked(java.util.Map map) {
        onAdClicked();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str) {
        if (this.p.c()) {
            this.p.a(new com.ironsource.AbstractC3107j3.e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str, java.util.Map map) {
        onAdLoadFailed(adapterErrorType, i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.AbstractC3107j3.d());
        } else {
            I();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadSuccess(java.util.Map map) {
        onAdLoadSuccess();
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.AbstractC3107j3.f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdOpened(java.util.Map map) {
        onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdShowFailed(int i, java.lang.String str, java.util.Map map) {
        onAdShowFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, java.lang.String str) {
        if (this.p.c()) {
            this.p.a(new com.ironsource.AbstractC3107j3.c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitFailed(int i, java.lang.String str, java.util.Map map) {
        onInitFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.AbstractC3107j3.b());
        } else {
            K();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitSuccess(java.util.Map map) {
        onInitSuccess();
    }

    public com.ironsource.mediationsdk.model.NetworkSettings p() {
        return this.f6320a.g();
    }

    protected java.util.Map<java.lang.String, java.lang.Object> q() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(com.ironsource.C3079ha.a(this.i));
        return hashMap;
    }

    public java.lang.Integer r() {
        com.ironsource.C3176n0 c3176n0 = this.f6320a;
        if (c3176n0 != null) {
            return java.lang.Integer.valueOf(c3176n0.h());
        }
        return null;
    }

    public com.ironsource.AbstractC3107j3.h t() {
        return this.e;
    }

    protected com.ironsource.InterfaceC3243qd u() {
        return this.p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == com.ironsource.AbstractC3107j3.h.FAILED;
    }

    public boolean y() {
        return this.e == com.ironsource.AbstractC3107j3.h.LOADED;
    }

    public boolean z() {
        com.ironsource.AbstractC3107j3.h hVar = this.e;
        return hVar == com.ironsource.AbstractC3107j3.h.INIT_IN_PROGRESS || hVar == com.ironsource.AbstractC3107j3.h.LOADING;
    }

    @Override // com.ironsource.K8.b
    public int b() {
        return this.h.e();
    }

    private boolean b(com.ironsource.C0 c0) {
        return new java.util.ArrayList(java.util.Arrays.asList(com.ironsource.C0.LOAD_AD, com.ironsource.C0.LOAD_AD_SUCCESS, com.ironsource.C0.LOAD_AD_FAILED, com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON, com.ironsource.C0.LOAD_AD_NO_FILL, com.ironsource.C0.RELOAD_AD, com.ironsource.C0.RELOAD_AD_SUCCESS, com.ironsource.C0.RELOAD_AD_FAILED_WITH_REASON, com.ironsource.C0.RELOAD_AD_NO_FILL, com.ironsource.C0.DESTROY_AD, com.ironsource.C0.AD_PRESENT_SCREEN, com.ironsource.C0.AD_DISMISS_SCREEN, com.ironsource.C0.AD_LEFT_APPLICATION, com.ironsource.C0.AD_OPENED, com.ironsource.C0.AD_CLOSED, com.ironsource.C0.SHOW_AD, com.ironsource.C0.SHOW_AD_FAILED, com.ironsource.C0.AD_CLICKED, com.ironsource.C0.AD_REWARDED)).contains(c0);
    }

    protected void a(com.ironsource.AbstractC3107j3.h hVar) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    protected java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.put("userId", this.f6320a.i());
        return map;
    }

    protected com.ironsource.mediationsdk.adunit.adapter.utility.AdData a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        return new com.ironsource.mediationsdk.adunit.adapter.utility.AdData(str, q(), a(map));
    }

    protected java.lang.String a(java.lang.String str) {
        java.lang.String str2 = this.f6320a.a().name() + " - " + k() + " - state = " + this.e;
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    @Override // com.ironsource.Af.a
    public void a() {
        if (!this.p.c()) {
            L();
        } else {
            this.p.a(new com.ironsource.AbstractC3107j3.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            com.ironsource.Af af = this.n;
            if (af != null) {
                af.e();
            }
            a(com.ironsource.AbstractC3107j3.h.FAILED);
            a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, com.ironsource.C3056g5.a(this.m));
            this.b.a(new com.ironsource.mediationsdk.logger.IronSourceError(i, str), this);
            return;
        }
        if (this.e == com.ironsource.AbstractC3107j3.h.FAILED) {
            return;
        }
        ironLog.error(a(java.lang.String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.e, java.lang.Integer.valueOf(i), str)));
        if (this.d != null) {
            this.d.j.m(java.lang.String.format("unexpected init failed, state - %s, error - %s, %s", this.e, java.lang.Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str) {
        long a2 = com.ironsource.C3056g5.a(this.m);
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        com.ironsource.Af af = this.n;
        if (af != null) {
            af.e();
        }
        synchronized (this.q) {
            com.ironsource.AbstractC3107j3.h hVar = this.e;
            if (hVar == com.ironsource.AbstractC3107j3.h.LOADING) {
                a(adapterErrorType, i, str, a2);
                a(com.ironsource.AbstractC3107j3.h.FAILED);
                this.b.a(new com.ironsource.mediationsdk.logger.IronSourceError(i, str), this);
                return;
            }
            if (hVar == com.ironsource.AbstractC3107j3.h.FAILED) {
                a(adapterErrorType, i, str, a2);
                return;
            }
            if (hVar == com.ironsource.AbstractC3107j3.h.LOADED && adapterErrorType == com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                ironLog.error(a(java.lang.String.format("ad expired for %s, state = %s", this.h.f(), this.e)));
                com.ironsource.F0 f0 = this.d;
                if (f0 != null) {
                    f0.j.a(java.lang.String.format("ad expired, state = %s", this.e));
                }
                return;
            }
            ironLog.error(a(java.lang.String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.e, java.lang.Integer.valueOf(i), str)));
            java.lang.String format = java.lang.String.format("unexpected load failed, state - %s, error - %s, %s", this.e, java.lang.Integer.valueOf(i), str);
            if (this.d != null) {
                if (v()) {
                    this.d.j.r(format);
                } else if (this.f6320a.a() != com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO || this.e != com.ironsource.AbstractC3107j3.h.SHOWING) {
                    this.d.j.o(format);
                }
            }
        }
    }

    private void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.f.a(j, i);
                    return;
                } else {
                    this.d.f.b(j, i, false);
                    return;
                }
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                if (v()) {
                    this.d.f.a(j, i, str);
                    return;
                } else {
                    this.d.f.a(j, i, str, false);
                    return;
                }
            }
            this.d.f.a(j, i, false);
        }
    }
}
