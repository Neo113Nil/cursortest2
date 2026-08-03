package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560na {

    /* renamed from: I, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0560na f6484I;

    /* renamed from: C, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.M9 f6487C;

    /* renamed from: H, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0855yk f6491H;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6492a;

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0514lg f6493b;

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.E6 f6494c;

    /* renamed from: e, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.R2 f6496e;

    /* renamed from: f, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0543mj f6497f;

    /* renamed from: g, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.U f6498g;

    /* renamed from: h, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0216a2 f6499h;

    /* renamed from: i, reason: collision with root package name */
    public volatile io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers f6500i;

    /* renamed from: j, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0720tf f6501j;

    /* renamed from: k, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0864z3 f6502k;

    /* renamed from: l, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.Ze f6503l;

    /* renamed from: m, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.Ao f6504m;

    /* renamed from: n, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0336ej f6505n;

    /* renamed from: o, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.Fb f6506o;

    /* renamed from: p, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Al f6507p;

    /* renamed from: r, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0829xk f6509r;

    /* renamed from: w, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.Kb f6513w;

    /* renamed from: x, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0599on f6514x;

    /* renamed from: y, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0726tl f6515y;

    /* renamed from: z, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0770vd f6516z;

    /* renamed from: q, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0534ma f6508q = new io.appmetrica.analytics.impl.C0534ma();

    /* renamed from: s, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Sc f6510s = new io.appmetrica.analytics.impl.Sc();
    public final io.appmetrica.analytics.impl.Uc t = new io.appmetrica.analytics.impl.Uc();

    /* renamed from: u, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0417hm f6511u = new io.appmetrica.analytics.impl.C0417hm();

    /* renamed from: v, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0337ek f6512v = new io.appmetrica.analytics.impl.C0337ek();

    /* renamed from: A, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Od f6485A = new io.appmetrica.analytics.impl.Od();

    /* renamed from: B, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider f6486B = new io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0544mk f6488D = new io.appmetrica.analytics.impl.C0544mk();

    /* renamed from: E, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.ReferenceHolder f6489E = new io.appmetrica.analytics.coreutils.internal.ReferenceHolder();

    /* renamed from: F, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0803wk f6490F = new io.appmetrica.analytics.impl.C0803wk();
    public final io.appmetrica.analytics.impl.C0445j G = new io.appmetrica.analytics.impl.C0445j();

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0492kk f6495d = new io.appmetrica.analytics.impl.C0492kk();

    public C0560na(android.content.Context context) {
        this.f6492a = context;
    }

    public static void a(android.content.Context context) {
        if (f6484I == null) {
            synchronized (io.appmetrica.analytics.impl.C0560na.class) {
                try {
                    if (f6484I == null) {
                        f6484I = new io.appmetrica.analytics.impl.C0560na(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0560na k() {
        return f6484I;
    }

    public final io.appmetrica.analytics.impl.C0417hm A() {
        return this.f6511u;
    }

    public final io.appmetrica.analytics.impl.C0855yk B() {
        java.io.File file;
        io.appmetrica.analytics.impl.C0855yk c0855yk = this.f6491H;
        if (c0855yk == null) {
            synchronized (this) {
                c0855yk = this.f6491H;
                if (c0855yk == null) {
                    android.content.Context context = this.f6492a;
                    java.lang.String readSystemProperty = io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                    java.lang.String readSystemProperty2 = io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                    if (y1.g.T(readSystemProperty)) {
                        readSystemProperty = readSystemProperty2;
                    }
                    if (!y1.g.T(readSystemProperty)) {
                        file = new java.io.File(readSystemProperty, context.getPackageName());
                        try {
                            file.mkdirs();
                        } catch (java.lang.Exception unused) {
                        }
                        c0855yk = new io.appmetrica.analytics.impl.C0855yk(file);
                        this.f6491H = c0855yk;
                    }
                    file = null;
                    c0855yk = new io.appmetrica.analytics.impl.C0855yk(file);
                    this.f6491H = c0855yk;
                }
            }
        }
        return c0855yk;
    }

    public final io.appmetrica.analytics.impl.C0599on C() {
        io.appmetrica.analytics.impl.C0599on c0599on = this.f6514x;
        if (c0599on == null) {
            synchronized (this) {
                try {
                    c0599on = this.f6514x;
                    if (c0599on == null) {
                        c0599on = new io.appmetrica.analytics.impl.C0599on(this.f6492a);
                        this.f6514x = c0599on;
                    }
                } finally {
                }
            }
        }
        return c0599on;
    }

    public final synchronized io.appmetrica.analytics.impl.Ao D() {
        try {
            if (this.f6504m == null) {
                this.f6504m = new io.appmetrica.analytics.impl.Ao(this.f6492a);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f6504m;
    }

    public final void E() {
        if (this.f6501j == null) {
            synchronized (this) {
                try {
                    if (this.f6501j == null) {
                        io.appmetrica.analytics.impl.Qm a2 = io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.C0307df.class);
                        android.content.Context context = this.f6492a;
                        io.appmetrica.analytics.impl.Rm rm = (io.appmetrica.analytics.impl.Rm) a2;
                        io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> a3 = rm.a(context, rm.a(context));
                        io.appmetrica.analytics.impl.C0307df c0307df = (io.appmetrica.analytics.impl.C0307df) a3.read();
                        this.f6501j = new io.appmetrica.analytics.impl.C0720tf(this.f6492a, a3, new io.appmetrica.analytics.impl.C0487kf(), new io.appmetrica.analytics.impl.C0255bf(c0307df), new io.appmetrica.analytics.impl.C0694sf(), new io.appmetrica.analytics.impl.C0461jf(this.f6492a), new io.appmetrica.analytics.impl.C0591of(k().y()), new io.appmetrica.analytics.impl.C0332ef(), c0307df, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    public final io.appmetrica.analytics.impl.C0445j b() {
        return this.G;
    }

    public final io.appmetrica.analytics.impl.U c() {
        io.appmetrica.analytics.impl.U u2 = this.f6498g;
        if (u2 == null) {
            synchronized (this) {
                try {
                    u2 = this.f6498g;
                    if (u2 == null) {
                        u2 = new io.appmetrica.analytics.impl.U(this.f6492a, this.f6495d.a(), this.f6511u.b());
                        this.f6511u.a(u2);
                        this.f6498g = u2;
                    }
                } finally {
                }
            }
        }
        return u2;
    }

    public final io.appmetrica.analytics.impl.C0216a2 d() {
        io.appmetrica.analytics.impl.C0216a2 c0216a2 = this.f6499h;
        if (c0216a2 == null) {
            synchronized (this) {
                try {
                    c0216a2 = this.f6499h;
                    if (c0216a2 == null) {
                        c0216a2 = new io.appmetrica.analytics.impl.C0216a2(this.f6492a, io.appmetrica.analytics.impl.AbstractC0242b2.a());
                        this.f6499h = c0216a2;
                    }
                } finally {
                }
            }
        }
        return c0216a2;
    }

    public final io.appmetrica.analytics.impl.C0371g2 e() {
        return l().f4288b;
    }

    public final io.appmetrica.analytics.impl.C0864z3 f() {
        if (this.f6502k == null) {
            synchronized (this) {
                try {
                    if (this.f6502k == null) {
                        io.appmetrica.analytics.impl.Qm a2 = io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.C0682s3.class);
                        android.content.Context context = this.f6492a;
                        io.appmetrica.analytics.impl.Rm rm = (io.appmetrica.analytics.impl.Rm) a2;
                        io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> a3 = rm.a(context, rm.a(context));
                        this.f6502k = new io.appmetrica.analytics.impl.C0864z3(this.f6492a, a3, new io.appmetrica.analytics.impl.A3(), new io.appmetrica.analytics.impl.C0553n3(), new io.appmetrica.analytics.impl.D3(), new io.appmetrica.analytics.impl.Ti(this.f6492a), new io.appmetrica.analytics.impl.B3(y()), new io.appmetrica.analytics.impl.C0579o3(), (io.appmetrica.analytics.impl.C0682s3) a3.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f6502k;
    }

    public final android.content.Context g() {
        return this.f6492a;
    }

    public final io.appmetrica.analytics.impl.E6 h() {
        if (this.f6494c == null) {
            synchronized (this) {
                try {
                    if (this.f6494c == null) {
                        this.f6494c = new io.appmetrica.analytics.impl.E6(new io.appmetrica.analytics.impl.D6(y()));
                    }
                } finally {
                }
            }
        }
        return this.f6494c;
    }

    public final io.appmetrica.analytics.impl.M9 i() {
        io.appmetrica.analytics.impl.M9 m9 = this.f6487C;
        if (m9 == null) {
            synchronized (this) {
                try {
                    m9 = this.f6487C;
                    if (m9 == null) {
                        m9 = new io.appmetrica.analytics.impl.M9(this.f6492a);
                        this.f6487C = m9;
                    }
                } finally {
                }
            }
        }
        return m9;
    }

    public final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor j() {
        io.appmetrica.analytics.impl.C0726tl c0726tl = this.f6515y;
        if (c0726tl != null) {
            return c0726tl;
        }
        synchronized (this) {
            try {
                io.appmetrica.analytics.impl.C0726tl c0726tl2 = this.f6515y;
                if (c0726tl2 != null) {
                    return c0726tl2;
                }
                io.appmetrica.analytics.impl.C0726tl c0726tl3 = new io.appmetrica.analytics.impl.C0726tl(p().f7121c.getAskForPermissionStrategy());
                this.f6515y = c0726tl3;
                return c0726tl3;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final io.appmetrica.analytics.impl.Fb l() {
        io.appmetrica.analytics.impl.Fb fb = this.f6506o;
        if (fb == null) {
            synchronized (this) {
                try {
                    fb = this.f6506o;
                    if (fb == null) {
                        fb = new io.appmetrica.analytics.impl.Fb(new io.appmetrica.analytics.impl.O2(this.f6492a, this.f6495d.a()), new io.appmetrica.analytics.impl.C0371g2());
                        this.f6506o = fb;
                    }
                } finally {
                }
            }
        }
        return fb;
    }

    public final io.appmetrica.analytics.impl.Kb m() {
        io.appmetrica.analytics.impl.Kb kb = this.f6513w;
        if (kb == null) {
            synchronized (this) {
                try {
                    kb = this.f6513w;
                    if (kb == null) {
                        android.content.Context context = this.f6492a;
                        io.appmetrica.analytics.locationapi.internal.LocationClient locationClient = (io.appmetrica.analytics.locationapi.internal.LocationClient) io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", io.appmetrica.analytics.locationapi.internal.LocationClient.class);
                        kb = locationClient == null ? new io.appmetrica.analytics.impl.Mb() : new io.appmetrica.analytics.impl.Lb(context, new io.appmetrica.analytics.impl.Sb(), locationClient);
                        this.f6513w = kb;
                    }
                } finally {
                }
            }
        }
        return kb;
    }

    public final io.appmetrica.analytics.impl.Kb n() {
        return m();
    }

    public final io.appmetrica.analytics.impl.Uc o() {
        return this.t;
    }

    public final io.appmetrica.analytics.impl.C0829xk p() {
        io.appmetrica.analytics.impl.C0829xk c0829xk = this.f6509r;
        if (c0829xk == null) {
            synchronized (this) {
                try {
                    c0829xk = this.f6509r;
                    if (c0829xk == null) {
                        c0829xk = new io.appmetrica.analytics.impl.C0829xk();
                        this.f6509r = c0829xk;
                    }
                } finally {
                }
            }
        }
        return c0829xk;
    }

    public final io.appmetrica.analytics.impl.C0770vd q() {
        io.appmetrica.analytics.impl.C0770vd c0770vd = this.f6516z;
        if (c0770vd == null) {
            synchronized (this) {
                try {
                    c0770vd = this.f6516z;
                    if (c0770vd == null) {
                        c0770vd = new io.appmetrica.analytics.impl.C0770vd(this.f6492a, new io.appmetrica.analytics.impl.C0574no());
                        this.f6516z = c0770vd;
                    }
                } finally {
                }
            }
        }
        return c0770vd;
    }

    public final io.appmetrica.analytics.impl.Od r() {
        return this.f6485A;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers s() {
        io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers platformIdentifiers = this.f6500i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.f6500i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers(c(), d());
                        this.f6500i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    public final io.appmetrica.analytics.impl.C0720tf t() {
        E();
        return this.f6501j;
    }

    public final io.appmetrica.analytics.impl.C0514lg u() {
        if (this.f6493b == null) {
            synchronized (this) {
                try {
                    if (this.f6493b == null) {
                        this.f6493b = new io.appmetrica.analytics.impl.C0514lg(this.f6492a, f6484I.D().f4076c);
                    }
                } finally {
                }
            }
        }
        return this.f6493b;
    }

    public final io.appmetrica.analytics.impl.C0336ej v() {
        io.appmetrica.analytics.impl.C0336ej c0336ej = this.f6505n;
        if (c0336ej == null) {
            synchronized (this) {
                try {
                    c0336ej = this.f6505n;
                    if (c0336ej == null) {
                        c0336ej = new io.appmetrica.analytics.impl.C0336ej(this.f6492a);
                        this.f6505n = c0336ej;
                    }
                } finally {
                }
            }
        }
        return c0336ej;
    }

    public final io.appmetrica.analytics.impl.C0492kk w() {
        return this.f6495d;
    }

    public final io.appmetrica.analytics.impl.C0803wk x() {
        return this.f6490F;
    }

    public final io.appmetrica.analytics.impl.Ze y() {
        if (this.f6503l == null) {
            synchronized (this) {
                try {
                    if (this.f6503l == null) {
                        this.f6503l = new io.appmetrica.analytics.impl.Ze(B().d(this.f6492a));
                    }
                } finally {
                }
            }
        }
        return this.f6503l;
    }

    public final synchronized io.appmetrica.analytics.impl.K2 z() {
        try {
            if (this.f6507p == null) {
                io.appmetrica.analytics.impl.Al al = new io.appmetrica.analytics.impl.Al(this.f6492a);
                this.f6507p = al;
                this.f6511u.a(al);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f6507p;
    }

    public final io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier a() {
        return this.f6486B.getActivationBarrier();
    }
}
