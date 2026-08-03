package com.ironsource;

/* renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3090i3<Smash extends com.ironsource.AbstractC3107j3<?>, Listener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> implements com.ironsource.R0, com.ironsource.U1, com.ironsource.E0, com.ironsource.Eb, com.ironsource.Bc, com.ironsource.InterfaceC3193o, com.ironsource.Lg, com.ironsource.InterfaceC3250r3, com.ironsource.InterfaceC3243qd {
    private com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo A;
    private com.ironsource.C3150la B;
    final com.ironsource.L8 C;
    final com.ironsource.L8.a D;
    protected final com.ironsource.L7 E;
    private final com.ironsource.L7.a F;
    private boolean G;
    private com.ironsource.Qf H;
    private java.util.concurrent.atomic.AtomicBoolean I;
    private com.ironsource.R9 J;

    /* renamed from: a, reason: collision with root package name */
    protected com.ironsource.Kg<Smash> f6300a;
    protected java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.C2963b2.a> b;
    protected com.ironsource.mediationsdk.e c;
    protected com.ironsource.C2963b2 d;
    protected int e;
    protected java.lang.String f;
    protected org.json.JSONObject g;
    protected com.ironsource.C3232q2 h;
    protected com.ironsource.C3064gd i;
    protected boolean j;
    private com.ironsource.environment.NetworkStateReceiver k;
    protected com.ironsource.C2976bf l;
    protected com.ironsource.C3056g5 m;
    protected com.ironsource.C3056g5 n;
    protected com.ironsource.W o;
    protected com.ironsource.AbstractC3090i3.f p;
    protected com.ironsource.Q0 q;
    protected com.ironsource.M5 r;
    protected com.ironsource.F0 s;
    protected com.ironsource.L0 t;
    protected com.ironsource.C3264s u;
    protected com.ironsource.C2953aa v;
    protected java.util.UUID w;
    protected final java.lang.Object x;
    private long y;
    private java.lang.Boolean z;

    /* renamed from: com.ironsource.i3$a */
    class a extends com.ironsource.AbstractRunnableC3136ke {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.AbstractC3090i3.this.y();
        }
    }

    /* renamed from: com.ironsource.i3$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.model.NetworkSettings f6301a;

        b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
            this.f6301a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.AbstractC3090i3.this.c(this.f6301a);
        }
    }

    /* renamed from: com.ironsource.i3$c */
    class c extends java.util.TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.AbstractC3090i3.this.A();
        }
    }

    /* renamed from: com.ironsource.i3$d */
    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.AbstractC3090i3.this.g = new org.json.JSONObject();
            com.ironsource.AbstractC3090i3.this.s.h.a((java.lang.Double) null);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.ironsource.AbstractC3090i3.this.b(hashMap, arrayList, sb, arrayList2);
            com.ironsource.AbstractC3090i3.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    /* renamed from: com.ironsource.i3$e */
    class e implements com.ironsource.C3286t3.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Map f6304a;
        final /* synthetic */ java.lang.StringBuilder b;
        final /* synthetic */ java.util.List c;

        e(java.util.Map map, java.lang.StringBuilder sb, java.util.List list) {
            this.f6304a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.C3286t3.b
        public void a(java.util.List<com.ironsource.C3304u3> list, long j, java.util.List<java.lang.String> list2) {
            com.ironsource.AbstractC3090i3.this.s.g.b(j);
            for (com.ironsource.C3304u3 c3304u3 : list) {
                com.ironsource.mediationsdk.model.NetworkSettings a2 = com.ironsource.AbstractC3090i3.this.o.a(c3304u3.c());
                java.util.Map<java.lang.String, java.lang.Object> b = com.ironsource.AbstractC3090i3.this.b(a2, com.ironsource.mediationsdk.c.b().b(a2, com.ironsource.AbstractC3090i3.this.o.b(), com.ironsource.AbstractC3090i3.this.h()));
                if (c3304u3.a() != null) {
                    this.f6304a.put(c3304u3.c(), c3304u3.a());
                    java.lang.StringBuilder sb = this.b;
                    sb.append(c3304u3.d());
                    sb.append(c3304u3.c());
                    sb.append(",");
                    com.ironsource.AbstractC3090i3.this.s.g.a(b, c3304u3.e());
                } else {
                    com.ironsource.AbstractC3090i3.this.s.g.a(b, c3304u3.e(), c3304u3.b());
                }
            }
            java.util.Iterator<java.lang.String> it = list2.iterator();
            while (it.hasNext()) {
                com.ironsource.mediationsdk.model.NetworkSettings a3 = com.ironsource.AbstractC3090i3.this.o.a(it.next());
                com.ironsource.AbstractC3090i3.this.s.g.b(com.ironsource.AbstractC3090i3.this.b(a3, com.ironsource.mediationsdk.c.b().b(a3, com.ironsource.AbstractC3090i3.this.o.b(), com.ironsource.AbstractC3090i3.this.h())), j);
            }
            com.ironsource.AbstractC3090i3.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f6304a, (java.util.List<java.lang.String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.C3286t3.b
        public void onFailure(java.lang.String str) {
            com.ironsource.AbstractC3090i3.this.s.g.a(str);
            com.ironsource.AbstractC3090i3.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f6304a, (java.util.List<java.lang.String>) this.c, this.b.toString());
        }
    }

    /* renamed from: com.ironsource.i3$f */
    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC3090i3(com.ironsource.W w, com.ironsource.C3150la c3150la, com.ironsource.C2953aa c2953aa) {
        this(com.ironsource.Jb.Y(), com.ironsource.Jb.Q(), w, c3150la, c2953aa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        android.os.AsyncTask.execute(new com.ironsource.AbstractC3090i3.d());
    }

    private com.ironsource.Rg<Smash> B() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        return new com.ironsource.Qg(this.o).d(this.f6300a.b());
    }

    private void C() {
        this.u.a(this.o.b(), false);
    }

    private void H() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        synchronized (this.x) {
            com.ironsource.AbstractC3090i3.f fVar = this.p;
            com.ironsource.AbstractC3090i3.f fVar2 = com.ironsource.AbstractC3090i3.f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.I.set(false);
            long k = this.o.d().k() - com.ironsource.C3056g5.a(this.m);
            if (k > 0) {
                new java.util.Timer().schedule(new com.ironsource.AbstractC3090i3.c(), k);
            } else {
                A();
            }
        }
    }

    private void I() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        a(g(), j());
    }

    private boolean c(boolean z) {
        java.lang.Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        return (z && !bool.booleanValue() && r()) || (!z && this.z.booleanValue());
    }

    private boolean d(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (b2 instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) {
            return this.f6300a.a(this.o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, b2), b2, this.o.b());
        }
        return false;
    }

    private java.util.List<com.ironsource.C3232q2> g() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.b()) && d(networkSettings)) {
                com.ironsource.C2958af c2958af = new com.ironsource.C2958af(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()));
                if (!this.l.b(c2958af)) {
                    copyOnWriteArrayList.add(new com.ironsource.C3232q2(c2958af.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int m() {
        return 1;
    }

    private void o() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h()))) {
                arrayList.add(new com.ironsource.AbstractC3090i3.b(networkSettings));
            }
        }
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.executeTasks(this.o.k(), this.o.p(), arrayList);
    }

    private void p() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new com.ironsource.C2958af(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b())));
        }
        com.ironsource.C2976bf c2976bf = new com.ironsource.C2976bf();
        this.l = c2976bf;
        c2976bf.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        com.ironsource.AbstractC3090i3.f fVar;
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        synchronized (this.x) {
            if (this.o.h().e() && this.l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(com.ironsource.B0.a(this.o.b()), "all smashes are capped", false);
                return;
            }
            if (!q() && this.p == com.ironsource.AbstractC3090i3.f.SHOWING) {
                com.ironsource.mediationsdk.logger.IronLog.API.error(b("load cannot be invoked while showing an ad"));
                a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.B0.d(this.o.b()), "load cannot be invoked while showing an ad"));
                return;
            }
            if (this.o.h().a() != com.ironsource.O0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.o.h().a() != com.ironsource.O0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.p) != com.ironsource.AbstractC3090i3.f.READY_TO_LOAD && fVar != com.ironsource.AbstractC3090i3.f.READY_TO_SHOW) || com.ironsource.mediationsdk.l.a().b(this.o.b()))) {
                com.ironsource.mediationsdk.logger.IronLog.API.error(b("load is already in progress"));
                return;
            }
            this.g = new org.json.JSONObject();
            C();
            if (s()) {
                this.s.f.d();
            } else {
                this.s.f.a(n());
            }
            this.n = new com.ironsource.C3056g5();
            if (this.o.q()) {
                if (!this.b.isEmpty()) {
                    this.d.a(this.b);
                    this.b.clear();
                }
                H();
            } else {
                a(com.ironsource.AbstractC3090i3.f.LOADING);
            }
            if (this.o.q()) {
                return;
            }
            ironLog.verbose(b("auction disabled"));
            I();
            z();
        }
    }

    private void z() {
        com.ironsource.Rg<Smash> B = B();
        if (B.c()) {
            a(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        java.util.Iterator<Smash> it = B.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    protected void D() {
        com.ironsource.mediationsdk.l.a().a(this.o.b(), this.o.f());
    }

    protected boolean E() {
        return true;
    }

    protected boolean F() {
        return true;
    }

    public void G() {
        java.util.Iterator<com.ironsource.mediationsdk.model.NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.o.b(), h());
        }
    }

    protected abstract Smash a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> baseAdAdapter, int i, java.lang.String str, com.ironsource.C3232q2 c3232q2);

    public void a(android.content.Context context, boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            if (z) {
                if (this.k == null) {
                    this.k = new com.ironsource.environment.NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    protected abstract org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings);

    protected void b(boolean z) {
        a(false, z, (com.ironsource.AbstractC3107j3<?>) null);
    }

    protected abstract com.ironsource.L0 d();

    protected com.ironsource.Q0 e() {
        return new com.ironsource.Q0(this.o.h(), this);
    }

    protected java.lang.String f() {
        return b((java.lang.String) null);
    }

    protected void h(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        if (this.o.h().f()) {
            a(abstractC3107j3, abstractC3107j3.f());
        } else {
            a(true, false, abstractC3107j3);
        }
    }

    protected abstract java.lang.String i();

    protected void i(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        if (this.o.q() && this.I.compareAndSet(false, true)) {
            com.ironsource.C3232q2 i = abstractC3107j3.i();
            this.c.a(i, abstractC3107j3.l(), this.h);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.C3232q2> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
            for (Smash smash : this.f6300a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, abstractC3107j3.l(), this.h, i);
        }
    }

    protected java.lang.String j() {
        return "fallback_" + java.lang.System.currentTimeMillis();
    }

    protected java.lang.String k() {
        com.ironsource.C3064gd c3064gd = this.i;
        return c3064gd == null ? "" : c3064gd.c();
    }

    abstract java.lang.String l();

    protected boolean n() {
        return false;
    }

    protected boolean q() {
        return false;
    }

    protected boolean r() {
        return false;
    }

    protected abstract boolean s();

    protected boolean t() {
        boolean z;
        synchronized (this.x) {
            com.ironsource.AbstractC3090i3.f fVar = this.p;
            z = fVar == com.ironsource.AbstractC3090i3.f.LOADING || fVar == com.ironsource.AbstractC3090i3.f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean u() {
        boolean z;
        synchronized (this.x) {
            z = this.p == com.ironsource.AbstractC3090i3.f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean v() {
        boolean z;
        synchronized (this.x) {
            z = this.p == com.ironsource.AbstractC3090i3.f.AUCTION;
        }
        return z;
    }

    protected boolean w() {
        boolean z;
        synchronized (this.x) {
            z = this.p == com.ironsource.AbstractC3090i3.f.LOADING;
        }
        return z;
    }

    public void x() {
        if (c()) {
            a(new com.ironsource.AbstractC3090i3.a());
        } else {
            y();
        }
    }

    @Override // com.ironsource.Eb
    public void b() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        x();
    }

    @Override // com.ironsource.R0
    public void e(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b(abstractC3107j3.k()));
        this.s.i.a(k());
        this.t.a(this.i, abstractC3107j3.f());
    }

    AbstractC3090i3(com.ironsource.H7 h7, com.ironsource.G7 g7, com.ironsource.W w, com.ironsource.C3150la c3150la, com.ironsource.C2953aa c2953aa) {
        this.f = "";
        this.j = false;
        this.x = new java.lang.Object();
        this.y = 0L;
        this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.w = java.util.UUID.randomUUID();
        this.C = h7.s();
        this.D = g7.i();
        this.E = h7.w();
        this.F = g7.x();
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + w.b() + ", loading mode = " + w.h().a());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(w.b());
        sb.append(" initiated object per waterfall mode");
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(sb.toString());
        com.ironsource.C3056g5 c3056g5 = new com.ironsource.C3056g5();
        this.J = a(w);
        this.v = c2953aa;
        this.o = w;
        this.s = new com.ironsource.F0(w.b(), com.ironsource.F0.b.MEDIATION, this);
        this.t = d();
        this.q = e();
        a(com.ironsource.AbstractC3090i3.f.NONE);
        this.B = c3150la;
        this.f6300a = new com.ironsource.Kg<>(this.o.d().f(), this.o.d().i(), this);
        this.s.e.a(l(), this.o.h().a().toString());
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
        this.i = null;
        D();
        this.g = new org.json.JSONObject();
        if (this.o.q()) {
            this.c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.o.d(), com.ironsource.mediationsdk.utils.IronSourceUtils.d()));
        }
        this.d = new com.ironsource.C2963b2(this.o.j(), this.o.d().c());
        p();
        o();
        this.m = new com.ironsource.C3056g5();
        a(com.ironsource.AbstractC3090i3.f.READY_TO_LOAD);
        this.r = new com.ironsource.M5(w.a(), this);
        this.u = new com.ironsource.C3264s();
        this.s.e.a(com.ironsource.C3056g5.a(c3056g5));
        if (this.o.h().e()) {
            ironLog.verbose("first automatic load");
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.ironsource.CallableC3233q3> list2) {
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            com.ironsource.Qf qf = this.H;
            if (qf == null || qf.a(networkSettings, this.o.b())) {
                if (!this.l.b(new com.ironsource.C2958af(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()))) && d(networkSettings)) {
                    com.ironsource.mediationsdk.adunit.adapter.utility.AdData a2 = a(networkSettings, (java.lang.String) null);
                    if (networkSettings.isBidder(this.o.b())) {
                        com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
                        if (b2 instanceof com.ironsource.InterfaceC3268s3) {
                            list2.add(new com.ironsource.CallableC3233q3(networkSettings.getInstanceType(this.o.b()), networkSettings.getProviderInstanceName(), a2, (com.ironsource.InterfaceC3268s3) b2, this, networkSettings));
                        } else {
                            this.s.j.g(b2 == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(",");
                    }
                }
            }
        }
    }

    public java.util.UUID h() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b(java.lang.String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName())));
        com.ironsource.mediationsdk.adunit.adapter.utility.AdData a2 = a(networkSettings, this.o.o());
        com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            try {
                b2.init(a2, com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), null);
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                this.s.j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b(java.lang.String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName())));
    }

    @Override // com.ironsource.R0
    public void d(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(b(abstractC3107j3.k()));
        if (!abstractC3107j3.h().equals(this.f6300a.c())) {
            ironLog.error(b("invoked from " + abstractC3107j3.c() + " with state = " + this.p + " auctionId: " + abstractC3107j3.h() + " and the current id is " + this.f6300a.c()));
            com.ironsource.C3138kg c3138kg = this.s.j;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("onAdLoadSuccess invoked with state = ");
            sb.append(this.p);
            c3138kg.p(sb.toString());
            return;
        }
        if (this.o.m()) {
            java.util.List<Smash> b2 = this.f6300a.b();
            com.ironsource.Qg qg = new com.ironsource.Qg(this.o);
            boolean a2 = qg.a(abstractC3107j3, b2);
            synchronized (this.x) {
                if (a2) {
                    if (t()) {
                        i(abstractC3107j3);
                    }
                }
                if (qg.a(b2)) {
                    i(qg.c(b2));
                }
            }
        }
        this.b.put(abstractC3107j3.c(), com.ironsource.C2963b2.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(com.ironsource.AbstractC3090i3.f.LOADING, com.ironsource.AbstractC3090i3.f.READY_TO_SHOW)) {
            long a3 = com.ironsource.C3056g5.a(this.n);
            if (s()) {
                this.s.f.a(a3);
            } else {
                this.s.f.a(a3, n());
            }
            if (this.o.h().e()) {
                this.r.a(0L);
            }
            if (!this.o.m()) {
                i(abstractC3107j3);
            }
            h(abstractC3107j3);
        }
    }

    protected void a(com.ironsource.AbstractC3090i3.f fVar) {
        synchronized (this.x) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.p = fVar;
        }
    }

    protected void g(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        this.t.d(abstractC3107j3.f());
    }

    protected boolean a(com.ironsource.AbstractC3090i3.f fVar, com.ironsource.AbstractC3090i3.f fVar2) {
        boolean z;
        synchronized (this.x) {
            if (this.p == fVar) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                this.p = fVar2;
                z = true;
            } else {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("wrong state, current state = " + this.p + ", expected state = " + fVar);
                z = false;
            }
        }
        return z;
    }

    private com.ironsource.R9 a(com.ironsource.W w) {
        if (w.l()) {
            return com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    protected void a(com.ironsource.L0 l0) {
        this.t = l0;
    }

    protected com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar) {
        com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> baseAdAdapter = (com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected void a(boolean z, boolean z2, com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        synchronized (this.x) {
            java.lang.Boolean bool = this.z;
            if (bool == null || bool.booleanValue() != z) {
                this.z = java.lang.Boolean.valueOf(z);
                long j = 0;
                if (this.y != 0) {
                    j = new java.util.Date().getTime() - this.y;
                }
                this.y = new java.util.Date().getTime();
                this.s.f.a(z, j, z2);
                com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo f2 = abstractC3107j3 != null ? abstractC3107j3.f() : this.A;
                this.A = f2;
                com.ironsource.L0 l0 = this.t;
                if (!z) {
                    f2 = null;
                }
                l0.a(z, f2);
            }
        }
    }

    private boolean c(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        if (this.f6300a.a(adapterBaseInterface, this.o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.o.b()));
    }

    private boolean b(com.ironsource.C0 c0) {
        return !new java.util.ArrayList(java.util.Arrays.asList(com.ironsource.C0.INIT_STARTED, com.ironsource.C0.LOAD_AD, com.ironsource.C0.AUCTION_REQUEST, com.ironsource.C0.AUCTION_REQUEST_WATERFALL, com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES, com.ironsource.C0.COLLECT_TOKEN, com.ironsource.C0.COLLECT_TOKENS_COMPLETED, com.ironsource.C0.COLLECT_TOKENS_FAILED, com.ironsource.C0.INSTANCE_COLLECT_TOKEN, com.ironsource.C0.INSTANCE_COLLECT_TOKEN_SUCCESS, com.ironsource.C0.INSTANCE_COLLECT_TOKEN_FAILED, com.ironsource.C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(c0);
    }

    private boolean c(com.ironsource.C0 c0) {
        return new java.util.ArrayList(java.util.Arrays.asList(com.ironsource.C0.LOAD_AD_SUCCESS, com.ironsource.C0.LOAD_AD_FAILED, com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON, com.ironsource.C0.AUCTION_SUCCESS, com.ironsource.C0.AUCTION_FAILED, com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES, com.ironsource.C0.AD_FORMAT_CAPPED, com.ironsource.C0.AD_OPENED, com.ironsource.C0.SHOW_AD, com.ironsource.C0.SHOW_AD_FAILED, com.ironsource.C0.AD_CLICKED, com.ironsource.C0.RELOAD_AD_FAILED_WITH_REASON, com.ironsource.C0.RELOAD_AD_SUCCESS, com.ironsource.C0.AD_LEFT_APPLICATION)).contains(c0);
    }

    @Override // com.ironsource.InterfaceC3193o
    public void a() {
        if (this.o.h().e()) {
            a(com.ironsource.AbstractC3090i3.f.READY_TO_LOAD);
            b(true);
            x();
        }
    }

    protected void b(com.ironsource.C3232q2 c3232q2, java.lang.String str) {
        if (c3232q2 != null) {
            com.ironsource.V8 a2 = c3232q2.a(str);
            if (a2 != null) {
                for (com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener : new java.util.HashSet(this.B.a())) {
                    com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2));
                    impressionDataListener.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        com.ironsource.F0 f0 = this.s;
        if (f0 != null) {
            f0.j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.InterfaceC3243qd
    public boolean c() {
        com.ironsource.R9 r9 = this.J;
        if (r9 == null || r9 == java.lang.Thread.currentThread()) {
            return false;
        }
        return this.o.l();
    }

    @Override // com.ironsource.Bc
    public void a(boolean z) {
        if (!this.j || this.o.h().f()) {
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (com.ironsource.AbstractC3107j3<?>) null);
        }
    }

    protected com.ironsource.mediationsdk.LoadWhileShowSupportState a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        return com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE;
    }

    private java.lang.String a(java.util.List<com.ironsource.C3232q2> list, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.concurrent.CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            com.ironsource.C3232q2 c3232q2 = list.get(i);
            Smash a2 = a(c3232q2, str);
            if (a2 != null) {
                copyOnWriteArrayList.add(a2);
                sb.append(a(c3232q2, a2.l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f6300a.a(this.o.h().a(), copyOnWriteArrayList, str);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((java.lang.Object) sb)));
        return sb.toString();
    }

    private void b(org.json.JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.o.b(false);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                }
                this.o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
            } catch (org.json.JSONException e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.b() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.r()));
            }
        } finally {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b(this.o.r()));
        }
    }

    @Override // com.ironsource.Lg
    public void a(int i) {
        this.s.j.v("waterfalls hold too many with size = " + i);
    }

    private Smash a(com.ironsource.C3232q2 c3232q2, java.lang.String str) {
        com.ironsource.mediationsdk.model.NetworkSettings a2 = this.o.a(c3232q2.c());
        if (a2 != null) {
            com.ironsource.mediationsdk.c.b().b(a2, this.o.b(), h());
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> a3 = a(a2, this.o.b());
            if (a3 != null) {
                Smash a4 = a(a2, a3, this.C.a(this.o.b()), str, c3232q2);
                this.b.put(c3232q2.c(), com.ironsource.C2963b2.a.ISAuctionPerformanceDidntAttemptToLoad);
                return a4;
            }
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + a2.getProviderInstanceName()));
        } else {
            java.lang.String str2 = "could not find matching provider settings for auction response item - item = " + c3232q2.c() + " state = " + this.p;
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(b(str2));
            this.s.j.i(str2);
        }
        return null;
    }

    protected java.lang.String b(java.lang.String str) {
        java.lang.String str2 = this.o.b().name() + " state:" + this.p;
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.Object> b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put("spId", networkSettings.getSubProviderId());
            hashMap.put("instanceType", java.lang.Integer.valueOf(networkSettings.getInstanceType(this.o.b())));
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(m()));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
        }
        return hashMap;
    }

    protected void a(int i, java.lang.String str, boolean z) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        a(com.ironsource.AbstractC3090i3.f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.h().f()) {
            if (!z) {
                this.s.f.a(com.ironsource.C3056g5.a(this.n), i, str, n());
            }
            a(new com.ironsource.mediationsdk.logger.IronSourceError(i, str));
        } else {
            if (!z) {
                this.s.j.b(i, str);
            }
            b(false);
        }
        this.q.e();
    }

    protected void a(com.ironsource.AbstractC3107j3<?> abstractC3107j3, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        this.t.c(adInfo);
    }

    protected void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.l.a().b(this.o.b(), ironSourceError);
    }

    protected com.ironsource.mediationsdk.adunit.adapter.utility.AdData a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, java.lang.String str) {
        return com.ironsource.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.ironsource.CallableC3233q3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        com.ironsource.C3286t3 c3286t3 = new com.ironsource.C3286t3();
        com.ironsource.AbstractC3090i3.e eVar = new com.ironsource.AbstractC3090i3.e(map, sb, list);
        this.s.g.a();
        c3286t3.a(list2, eVar, this.o.e(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.h.a(1005, "No candidates available for auctioning");
            a(com.ironsource.B0.e(this.o.b()), "no available ad to load", false);
            return;
        }
        this.s.h.b(str);
        if (this.c != null) {
            int a2 = this.C.a(this.o.b());
            com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.o.b());
            hVar.b(com.ironsource.mediationsdk.utils.IronSourceUtils.g());
            hVar.a(map);
            hVar.a(list);
            hVar.a(this.d);
            hVar.a(a2);
            hVar.a(this.v);
            hVar.d(this.G);
            com.ironsource.Qf qf = this.H;
            if (qf != null && qf.c()) {
                z = true;
            }
            hVar.e(z);
            a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), hVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    protected void a(android.content.Context context, com.ironsource.mediationsdk.h hVar, com.ironsource.U1 u1) {
        com.ironsource.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, hVar, u1);
        } else {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.U1
    public void a(java.util.List<com.ironsource.C3232q2> list, java.lang.String str, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            this.f = "";
            this.e = i;
            this.h = c3232q2;
            this.g = jSONObject;
            if (!android.text.TextUtils.isEmpty(str2)) {
                this.s.j.a(i2, str2);
            }
            a(jSONObject2);
            if (this.u.a(this.o.b())) {
                this.s.h.a(str);
                a(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            java.lang.String a2 = a(list, str);
            this.s.h.a(j, this.o.r() + ";wtf=" + list.size());
            this.s.h.c(a2);
            a(com.ironsource.AbstractC3090i3.f.LOADING);
            z();
            return;
        }
        ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.p));
        com.ironsource.C3138kg c3138kg = this.s.j;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unexpected auction success, state = ");
        sb.append(this.p);
        c3138kg.k(sb.toString());
    }

    @Override // com.ironsource.U1
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            java.lang.String str3 = "Auction failed (error " + i + " - " + str + ")";
            ironLog.verbose(b(str3));
            com.ironsource.mediationsdk.utils.IronSourceUtils.i(i() + ": " + str3);
            this.e = i2;
            this.f = str2;
            this.g = new org.json.JSONObject();
            if (this.o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                I();
            }
            this.s.h.a(j, i, str);
            a(com.ironsource.AbstractC3090i3.f.LOADING);
            z();
            return;
        }
        java.lang.String str4 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.p;
        ironLog.error(b(str4));
        this.s.j.j(str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    @Override // com.ironsource.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        com.ironsource.Rg<Smash> B;
        com.ironsource.AbstractC3107j3<?> c2;
        synchronized (this.x) {
            com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose(b(abstractC3107j3.k() + " - error = " + ironSourceError));
            if (abstractC3107j3.h().equals(this.f6300a.c()) && this.p != com.ironsource.AbstractC3090i3.f.AUCTION) {
                this.b.put(abstractC3107j3.c(), com.ironsource.C2963b2.a.ISAuctionPerformanceFailedToLoad);
                if (!w() && !u()) {
                    B = null;
                    if (B != null) {
                        return;
                    }
                    if (this.o.m()) {
                        synchronized (this.x) {
                            if (B.b() && t() && (c2 = new com.ironsource.Qg(this.o).c(this.f6300a.b())) != null) {
                                i(c2);
                            }
                        }
                    }
                    java.util.Iterator<Smash> it = B.a().iterator();
                    while (it.hasNext()) {
                        it.next().E();
                    }
                    return;
                }
                B = B();
                if (B.c()) {
                    a(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                    return;
                }
                if (B != null) {
                }
            }
            ironLog.error(b("onAdLoadFailed was invoked from " + abstractC3107j3.c() + " with state =" + this.p + " auctionId: " + abstractC3107j3.h() + " and the current id is " + this.f6300a.c()));
            com.ironsource.C3138kg c3138kg = this.s.j;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("onAdLoadFailed was invoked with state =");
            sb.append(this.p);
            c3138kg.o(sb.toString());
        }
    }

    @Override // com.ironsource.R0
    public void a(com.ironsource.AbstractC3107j3<?> abstractC3107j3) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(b(abstractC3107j3.k()));
        this.s.i.g(k());
        this.f6300a.a(abstractC3107j3);
        this.f6300a.b(abstractC3107j3);
        this.l.a(abstractC3107j3);
        if (this.l.b(abstractC3107j3)) {
            ironLog.verbose(b(abstractC3107j3.c() + " was session capped"));
            abstractC3107j3.N();
            com.ironsource.mediationsdk.utils.IronSourceUtils.i(abstractC3107j3.c() + " was session capped");
        }
        this.F.a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), k(), this.o.b());
        if (this.E.c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), this.i, this.o.b())) {
            ironLog.verbose(b("placement " + k() + " is capped"));
            this.s.i.b(k(), null);
        }
        this.D.b(this.o.b());
        if (this.o.q()) {
            com.ironsource.C3232q2 i = abstractC3107j3.i();
            this.c.a(i, abstractC3107j3.l(), this.h, k());
            this.b.put(abstractC3107j3.c(), com.ironsource.C2963b2.a.ISAuctionPerformanceShowedSuccessfully);
            if (E()) {
                b(i, k());
            }
        }
        g(abstractC3107j3);
        if (this.o.h().e()) {
            b(false);
        }
        this.q.h();
    }

    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 c0) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        org.json.JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put("genericParams", this.g);
        }
        hashMap.put("sessionDepth", java.lang.Integer.valueOf(this.C.a(this.o.b())));
        if (c(c0)) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(this.e));
            if (!android.text.TextUtils.isEmpty(this.f)) {
                hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(c0) && !android.text.TextUtils.isEmpty(this.f6300a.c())) {
            hashMap.put("auctionId", this.f6300a.c());
        }
        return hashMap;
    }

    public void a(com.ironsource.C2953aa c2953aa) {
        this.v = c2953aa;
    }

    private void a(org.json.JSONObject jSONObject) {
        this.u.a(this.o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    protected java.lang.String a(com.ironsource.C3232q2 c3232q2, int i) {
        return java.lang.String.format("%s%s", java.lang.Integer.valueOf(i), c3232q2.c());
    }

    public void a(com.ironsource.Qf qf) {
        this.H = qf;
        if (qf != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.z = null;
    }

    @Override // com.ironsource.InterfaceC3250r3
    public void a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (b2 != null) {
            this.s.g.b(b(networkSettings, b2));
        }
    }

    @Override // com.ironsource.InterfaceC3250r3
    public void a(java.lang.String str) {
        this.s.j.g(str);
    }

    @Override // com.ironsource.InterfaceC3243qd
    public void a(java.lang.Runnable runnable) {
        com.ironsource.R9 r9 = this.J;
        if (r9 != null) {
            r9.a(runnable);
        }
    }
}
