package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class X4 implements io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea, io.appmetrica.analytics.impl.InterfaceC0463jh {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5255a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Q4 f5256b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.We f5257c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ze f5258d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.L6 f5259e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0723ti f5260f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X8 f5261g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0446j0 f5262h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0472k0 f5263i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Rk f5264j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Qg f5265k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.M8 f5266l;

    /* renamed from: m, reason: collision with root package name */
    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f5267m;

    /* renamed from: n, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0481k9 f5268n;

    /* renamed from: o, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.S4 f5269o;

    /* renamed from: p, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0637q9 f5270p;

    /* renamed from: q, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0527m3 f5271q;

    /* renamed from: r, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker f5272r;

    /* renamed from: s, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0720tf f5273s;
    public final io.appmetrica.analytics.impl.C0833xo t;

    /* renamed from: u, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Jk f5274u;

    /* renamed from: v, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0604p2 f5275v;

    public X4(android.content.Context context, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh, io.appmetrica.analytics.impl.V4 v4) {
        this(context, q4, new io.appmetrica.analytics.impl.C0472k0(), new io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker(), new io.appmetrica.analytics.impl.C0271c5(context, q4, c0580o4, v4, c0365fm, interfaceC0412hh, io.appmetrica.analytics.impl.C0560na.k().w().c(), io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.getAppVersionCodeInt(context), io.appmetrica.analytics.impl.C0560na.k().l(), new io.appmetrica.analytics.impl.P4()), c0580o4);
    }

    public final boolean A() {
        io.appmetrica.analytics.impl.C0489kh c0489kh = (io.appmetrica.analytics.impl.C0489kh) this.f5265k.a();
        return c0489kh.f6294n && this.f5272r.didTimePassSeconds(this.f5268n.f6274k, c0489kh.t, "should force send permissions");
    }

    public final boolean B() {
        io.appmetrica.analytics.impl.C0365fm c0365fm;
        io.appmetrica.analytics.impl.C0720tf c0720tf = this.f5273s;
        c0720tf.f4836h.a(c0720tf.f4829a);
        boolean z2 = ((io.appmetrica.analytics.impl.C0643qf) c0720tf.c()).f6690d;
        io.appmetrica.analytics.impl.Qg qg = this.f5265k;
        synchronized (qg) {
            c0365fm = qg.f6570c.f4580a;
        }
        return !(z2 && c0365fm.f5927q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final void a(io.appmetrica.analytics.impl.Jl jl, io.appmetrica.analytics.impl.C0365fm c0365fm) {
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final io.appmetrica.analytics.impl.Q4 b() {
        return this.f5256b;
    }

    public io.appmetrica.analytics.internal.CounterConfigurationReporterType c() {
        return io.appmetrica.analytics.internal.CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        io.appmetrica.analytics.impl.C0446j0 c0446j0 = this.f5262h;
        synchronized (c0446j0) {
            c0446j0.f6143a = new io.appmetrica.analytics.impl.Fc();
        }
        this.f5263i.a(this.f5262h.a(), this.f5257c);
    }

    public final synchronized void e() {
        ((io.appmetrica.analytics.impl.C0477k5) this.f5270p).d();
    }

    public final io.appmetrica.analytics.impl.C0604p2 f() {
        return this.f5275v;
    }

    public final io.appmetrica.analytics.impl.C0527m3 g() {
        return this.f5271q;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final android.content.Context getContext() {
        return this.f5255a;
    }

    public final io.appmetrica.analytics.impl.We h() {
        return this.f5257c;
    }

    public final io.appmetrica.analytics.impl.L6 i() {
        return this.f5259e;
    }

    public final io.appmetrica.analytics.impl.M8 j() {
        return this.f5266l;
    }

    public final io.appmetrica.analytics.impl.X8 k() {
        return this.f5261g;
    }

    public final io.appmetrica.analytics.impl.C0481k9 l() {
        return this.f5268n;
    }

    public final io.appmetrica.analytics.impl.InterfaceC0637q9 m() {
        return this.f5270p;
    }

    public final io.appmetrica.analytics.impl.C0489kh n() {
        return (io.appmetrica.analytics.impl.C0489kh) this.f5265k.a();
    }

    public final java.lang.String o() {
        return this.f5257c.j();
    }

    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger p() {
        return this.f5267m;
    }

    public final io.appmetrica.analytics.impl.Ze q() {
        return this.f5258d;
    }

    public final io.appmetrica.analytics.impl.Jk r() {
        return this.f5274u;
    }

    public final io.appmetrica.analytics.impl.Rk s() {
        return this.f5264j;
    }

    public final io.appmetrica.analytics.impl.C0365fm t() {
        io.appmetrica.analytics.impl.C0365fm c0365fm;
        io.appmetrica.analytics.impl.Qg qg = this.f5265k;
        synchronized (qg) {
            c0365fm = qg.f6570c.f4580a;
        }
        return c0365fm;
    }

    public final io.appmetrica.analytics.impl.C0833xo u() {
        return this.t;
    }

    public final void v() {
        io.appmetrica.analytics.impl.C0481k9 c0481k9 = this.f5268n;
        int i2 = c0481k9.f6273j;
        c0481k9.f6275l = i2;
        c0481k9.f6264a.a(i2).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = io.appmetrica.analytics.AppMetrica.getLibraryApiLevel();
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.t;
        synchronized (c0833xo) {
            optInt = c0833xo.f7123a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.f5269o.getClass();
            java.util.Iterator it = u0.AbstractC0995a.q(new io.appmetrica.analytics.impl.U4(this)).iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.impl.T4) it.next()).a(optInt);
            }
            this.t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        io.appmetrica.analytics.impl.C0489kh c0489kh = (io.appmetrica.analytics.impl.C0489kh) this.f5265k.a();
        return c0489kh.f6294n && c0489kh.isIdentifiersValid() && this.f5272r.didTimePassSeconds(this.f5268n.f6274k, c0489kh.f6299s, "need to check permissions");
    }

    public final boolean y() {
        io.appmetrica.analytics.impl.C0481k9 c0481k9 = this.f5268n;
        return c0481k9.f6275l < c0481k9.f6273j && ((io.appmetrica.analytics.impl.C0489kh) this.f5265k.a()).f6295o && ((io.appmetrica.analytics.impl.C0489kh) this.f5265k.a()).isIdentifiersValid();
    }

    public final void z() {
        io.appmetrica.analytics.impl.Qg qg = this.f5265k;
        synchronized (qg) {
            qg.f6568a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(io.appmetrica.analytics.impl.P5 p5) {
        java.lang.String a2 = io.appmetrica.analytics.impl.Qf.a("Event received on service", io.appmetrica.analytics.impl.EnumC0251bb.a(p5.f4816d), p5.getName(), p5.getValue());
        if (a2 != null) {
            this.f5267m.info(a2, new java.lang.Object[0]);
        }
        java.lang.String str = this.f5256b.f4860b;
        if (android.text.TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f5260f.a(p5, new io.appmetrica.analytics.impl.C0697si());
    }

    public final void b(io.appmetrica.analytics.impl.P5 p5) {
        this.f5262h.a(p5.f4818f);
        io.appmetrica.analytics.impl.C0421i0 a2 = this.f5262h.a();
        io.appmetrica.analytics.impl.C0472k0 c0472k0 = this.f5263i;
        io.appmetrica.analytics.impl.We we = this.f5257c;
        synchronized (c0472k0) {
            if (a2.f6068b > we.d().f6068b) {
                we.a(a2).b();
                this.f5267m.info("Save new app environment for %s. Value: %s", this.f5256b, a2.f6067a);
            }
        }
    }

    public X4(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0472k0 c0472k0, io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker timePassedChecker, io.appmetrica.analytics.impl.C0271c5 c0271c5, io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        this.f5255a = context.getApplicationContext();
        this.f5256b = q4;
        this.f5263i = c0472k0;
        this.f5272r = timePassedChecker;
        io.appmetrica.analytics.impl.C0833xo f2 = c0271c5.f();
        this.t = f2;
        this.f5273s = io.appmetrica.analytics.impl.C0560na.k().t();
        io.appmetrica.analytics.impl.We a2 = c0271c5.e().a();
        this.f5257c = a2;
        this.f5275v = c0271c5.a(a2);
        io.appmetrica.analytics.impl.Qg a3 = c0271c5.a(this);
        this.f5265k = a3;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger a4 = c0271c5.d().a();
        this.f5267m = a4;
        this.f5258d = io.appmetrica.analytics.impl.C0560na.k().y();
        io.appmetrica.analytics.impl.C0446j0 a5 = c0472k0.a(q4, a4, a2);
        this.f5262h = a5;
        this.f5266l = c0271c5.a();
        io.appmetrica.analytics.impl.L6 b2 = c0271c5.b(this);
        this.f5259e = b2;
        io.appmetrica.analytics.impl.C0775vi d2 = c0271c5.d(this);
        this.f5269o = io.appmetrica.analytics.impl.C0271c5.b();
        w();
        io.appmetrica.analytics.impl.Rk a6 = io.appmetrica.analytics.impl.C0271c5.a(this, f2, new io.appmetrica.analytics.impl.W4(this));
        this.f5264j = a6;
        a4.info("Read app environment for component %s. Value: %s", q4.toString(), a5.a().f6067a);
        io.appmetrica.analytics.impl.Jk c2 = c0271c5.c();
        this.f5274u = c2;
        this.f5268n = c0271c5.a(a2, f2, a6, b2, a5, c2, d2);
        io.appmetrica.analytics.impl.X8 c3 = io.appmetrica.analytics.impl.C0271c5.c(this);
        this.f5261g = c3;
        this.f5260f = io.appmetrica.analytics.impl.C0271c5.a(this, c3);
        this.f5271q = c0271c5.b(a2);
        this.f5270p = c0271c5.a(d2, b2, a3, c0580o4, q4, a2);
        b2.d();
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public synchronized void a(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        long j2;
        try {
            this.f5265k.a(c0580o4);
            boolean z2 = false;
            if (java.lang.Boolean.TRUE.equals(c0580o4.f6560h)) {
                this.f5267m.setEnabled(true);
            } else {
                if (java.lang.Boolean.FALSE.equals(c0580o4.f6560h)) {
                    this.f5267m.setEnabled(false);
                }
            }
            io.appmetrica.analytics.impl.C0604p2 c0604p2 = this.f5275v;
            java.util.Set<java.lang.String> set = c0580o4.f6567o;
            long currentTimeMillis = c0604p2.f6627d.currentTimeMillis();
            boolean z3 = false;
            for (java.lang.String str : set) {
                java.lang.Long l2 = (java.lang.Long) c0604p2.f6628e.get(str);
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = -1;
                    z3 = true;
                }
                if (currentTimeMillis - j2 > c0604p2.f6625b) {
                    c0604p2.f6628e.put(str, java.lang.Long.valueOf(currentTimeMillis));
                    z2 = true;
                }
            }
            if (z2) {
                c0604p2.a(c0604p2.f6628e);
                c0604p2.f6624a.a(c0604p2.f6628e);
            }
            if (z3) {
                this.f5265k.e();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final synchronized void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        this.f5265k.a(c0365fm);
        ((io.appmetrica.analytics.impl.C0477k5) this.f5270p).e();
    }

    public final void a(java.lang.String str) {
        this.f5257c.j(str).b();
    }
}
