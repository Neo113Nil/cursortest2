package com.ironsource;

/* loaded from: classes5.dex */
public final class Eg implements com.ironsource.G, com.ironsource.Og {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f5689a;
    private final com.ironsource.AbstractC3355x0 b;
    private final com.ironsource.Mg c;
    private final com.ironsource.InterfaceC3350wd d;
    private final com.ironsource.F e;
    private final com.ironsource.Vg f;
    private final com.ironsource.Hg g;
    private com.ironsource.H h;
    private com.ironsource.Pg i;
    private final java.util.List<com.ironsource.B> j;
    private com.ironsource.B k;
    private boolean l;
    private boolean m;
    private int n;

    public Eg(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData, boolean z, com.ironsource.Mg listener, com.ironsource.InterfaceC3350wd interfaceC3350wd, com.ironsource.F f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5689a = adTools;
        this.b = adUnitData;
        this.c = listener;
        this.d = interfaceC3350wd;
        this.e = f;
        this.f = com.ironsource.Vg.a.f6031a.a(z, this);
        this.g = com.ironsource.Hg.d.a(adTools, adUnitData);
        this.j = new java.util.ArrayList();
    }

    private final void c(com.ironsource.B b) {
        if (this.l || i()) {
            if (!b.A()) {
                b.c();
                return;
            }
            com.ironsource.InterfaceC3350wd interfaceC3350wd = this.d;
            if (interfaceC3350wd != null) {
                interfaceC3350wd.a(this.b.b().c(), false);
                return;
            }
            return;
        }
        com.ironsource.F f = this.e;
        if (f != null) {
            b.a(f);
        }
        com.ironsource.Pg pg = this.i;
        if (pg != null) {
            pg.a(b);
        }
        this.j.add(b);
        if (this.j.size() == 1) {
            com.ironsource.Pg pg2 = this.i;
            if (pg2 != null) {
                pg2.b(b);
            }
            this.c.b(b);
            return;
        }
        com.ironsource.H h = this.h;
        if (h == null || !h.a(b)) {
            return;
        }
        this.c.a(b);
    }

    private final java.util.List<com.ironsource.B> f() {
        com.ironsource.H.c c;
        java.util.List<com.ironsource.B> d;
        com.ironsource.H h = this.h;
        return (h == null || (c = h.c()) == null || (d = c.d()) == null) ? kotlin.collections.CollectionsKt.emptyList() : d;
    }

    private final boolean i() {
        return this.k != null;
    }

    private final void j() {
        com.ironsource.H h = this.h;
        com.ironsource.H.b d = h != null ? h.d() : null;
        if (d == null || d.e()) {
            this.c.a(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (d.f()) {
            com.ironsource.Pg pg = this.i;
            if (pg != null) {
                pg.a();
                return;
            }
            return;
        }
        for (com.ironsource.B b : d.a()) {
            this.n++;
            if (b.A()) {
                this.m = false;
                b(b);
            } else {
                b.a(this);
            }
        }
    }

    public final void d() {
        this.l = true;
        com.ironsource.B b = this.k;
        if (b != null) {
            b.b();
        }
    }

    public final com.ironsource.B e() {
        com.ironsource.H.c c;
        com.ironsource.H h = this.h;
        if (h == null || (c = h.c()) == null) {
            return null;
        }
        return c.c();
    }

    public final com.ironsource.Nd g() {
        return this.f.b();
    }

    public final boolean h() {
        java.util.Iterator<com.ironsource.B> it = this.j.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.G
    public void b(com.ironsource.B instance) {
        com.ironsource.InterfaceC3350wd interfaceC3350wd;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        c(instance);
        if (this.n > 0 || !this.m || (interfaceC3350wd = this.d) == null) {
            return;
        }
        interfaceC3350wd.a(this.b.b().c(), false);
    }

    public final void d(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        com.ironsource.Pg pg = this.i;
        if (pg != null) {
            pg.a(instance, this.b.l(), this.b.o());
        }
    }

    public final void a(com.ironsource.E adInstanceFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.g.a(adInstanceFactory, new com.ironsource.Eg.a());
    }

    @Override // com.ironsource.Og
    public boolean b() {
        return !this.j.isEmpty();
    }

    public final void a(com.ironsource.K adInstancePresenter, boolean z) {
        com.ironsource.Pg pg;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        com.ironsource.B c = this.f.c();
        if (c != null) {
            this.f.a(c);
            if (!z && (pg = this.i) != null) {
                pg.a(c, f());
            }
            c.a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.G
    public void a(com.ironsource.mediationsdk.logger.IronSourceError error, com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        if (this.l) {
            return;
        }
        j();
    }

    public /* synthetic */ Eg(com.ironsource.V0 v0, com.ironsource.AbstractC3355x0 abstractC3355x0, boolean z, com.ironsource.Mg mg, com.ironsource.InterfaceC3350wd interfaceC3350wd, com.ironsource.F f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC3355x0, z, mg, (i & 16) != 0 ? null : interfaceC3350wd, (i & 32) != 0 ? null : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.ironsource.Jg jg) {
        com.ironsource.H a2 = com.ironsource.H.c.a(this.b, jg);
        this.h = a2;
        this.i = com.ironsource.Pg.c.a(this.f5689a, this.b, this.g.a(), jg, a2);
        j();
    }

    public final void c() {
        this.f.a();
    }

    @Override // com.ironsource.Og
    public void a(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.k = instance;
        this.j.remove(instance);
    }

    @Override // com.ironsource.Og
    public void a() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f5689a, "destroyReadyToShowInstances", (java.lang.String) null, 2, (java.lang.Object) null));
        if (this.j.isEmpty()) {
            return;
        }
        java.lang.String c = this.b.b().c();
        for (com.ironsource.B b : this.j) {
            if (b.A()) {
                com.ironsource.InterfaceC3350wd interfaceC3350wd = this.d;
                if (interfaceC3350wd != null) {
                    interfaceC3350wd.a(c, false);
                }
            } else {
                b.c();
            }
        }
        this.j.clear();
        this.f5689a.e().h().a();
    }

    @Override // com.ironsource.Og
    public com.ironsource.B a(int i) {
        java.util.List<com.ironsource.B> f = f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f) {
            if (((com.ironsource.B) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (com.ironsource.B) kotlin.collections.CollectionsKt.getOrNull(arrayList, i);
    }

    public static final class a implements com.ironsource.Ig {
        a() {
        }

        @Override // com.ironsource.Ig
        public void a(com.ironsource.Jg waterfallInstances) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (com.ironsource.Eg.this.l) {
                return;
            }
            com.ironsource.Eg eg = com.ironsource.Eg.this;
            java.util.List<com.ironsource.B> b = waterfallInstances.b();
            if (!(b instanceof java.util.Collection) || !b.isEmpty()) {
                java.util.Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    if (((com.ironsource.B) it.next()).A()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            eg.m = z;
            com.ironsource.Eg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.Ig
        public void a(int i, java.lang.String errorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (com.ironsource.Eg.this.l) {
                return;
            }
            com.ironsource.Eg.this.c.a(i, errorReason);
        }
    }
}
