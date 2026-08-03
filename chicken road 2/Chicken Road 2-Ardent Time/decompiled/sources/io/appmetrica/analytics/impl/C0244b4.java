package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244b4 {

    /* renamed from: w, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0244b4 f5490w;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0659r6 f5491a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.D7 f5492b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.R3 f5493c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.F1 f5494d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0575o f5495e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Wk f5496f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.E5 f5497g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0523m f5498h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0547mn f5499i;

    /* renamed from: j, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0770vd f5500j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0653r0 f5501k;

    /* renamed from: l, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.Y3 f5502l;

    /* renamed from: m, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Sc f5503m;

    /* renamed from: n, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.Ve f5504n;

    /* renamed from: o, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0259bj f5505o;

    /* renamed from: p, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f5506p;

    /* renamed from: q, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.K1 f5507q;

    /* renamed from: r, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0276ca f5508r;

    /* renamed from: s, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0240b0 f5509s;
    public volatile io.appmetrica.analytics.impl.M9 t;

    /* renamed from: u, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.G7 f5510u;

    /* renamed from: v, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0270c4 f5511v;

    public C0244b4(io.appmetrica.analytics.impl.C0659r6 c0659r6, io.appmetrica.analytics.impl.C0575o c0575o, io.appmetrica.analytics.impl.R3 r3) {
        this(c0659r6, c0575o, r3, new io.appmetrica.analytics.impl.C0523m(c0575o));
    }

    public static io.appmetrica.analytics.impl.C0244b4 l() {
        if (f5490w == null) {
            synchronized (io.appmetrica.analytics.impl.C0244b4.class) {
                try {
                    if (f5490w == null) {
                        f5490w = new io.appmetrica.analytics.impl.C0244b4(new io.appmetrica.analytics.impl.C0659r6(), new io.appmetrica.analytics.impl.C0575o(), new io.appmetrica.analytics.impl.R3());
                    }
                } finally {
                }
            }
        }
        return f5490w;
    }

    public final io.appmetrica.analytics.impl.C0575o a() {
        return this.f5495e;
    }

    public final io.appmetrica.analytics.impl.Ve b(android.content.Context context) {
        io.appmetrica.analytics.impl.Ve ve = this.f5504n;
        if (ve == null) {
            synchronized (this) {
                try {
                    ve = this.f5504n;
                    if (ve == null) {
                        ve = new io.appmetrica.analytics.impl.Ve(c(context).a(context));
                        this.f5504n = ve;
                    }
                } finally {
                }
            }
        }
        return ve;
    }

    public final io.appmetrica.analytics.impl.C0653r0 c() {
        return this.f5501k;
    }

    public final io.appmetrica.analytics.impl.C0861z0 d() {
        return this.f5506p;
    }

    public final io.appmetrica.analytics.impl.F1 e() {
        return this.f5494d;
    }

    public final io.appmetrica.analytics.impl.K1 f() {
        return this.f5507q;
    }

    public final io.appmetrica.analytics.impl.R3 g() {
        return this.f5493c;
    }

    public final io.appmetrica.analytics.impl.E5 h() {
        return this.f5497g;
    }

    public final io.appmetrica.analytics.impl.C0659r6 i() {
        return this.f5491a;
    }

    public final io.appmetrica.analytics.impl.D7 j() {
        return this.f5492b;
    }

    public final io.appmetrica.analytics.impl.C0276ca k() {
        return this.f5508r;
    }

    public final io.appmetrica.analytics.impl.Y3 m() {
        io.appmetrica.analytics.impl.Y3 y3 = this.f5502l;
        if (y3 == null) {
            synchronized (this) {
                try {
                    y3 = this.f5502l;
                    if (y3 == null) {
                        y3 = new io.appmetrica.analytics.impl.Y3();
                        this.f5502l = y3;
                    }
                } finally {
                }
            }
        }
        return y3;
    }

    public final io.appmetrica.analytics.impl.C0659r6 n() {
        return this.f5491a;
    }

    public final io.appmetrica.analytics.impl.Wk o() {
        return this.f5496f;
    }

    public C0244b4(io.appmetrica.analytics.impl.C0659r6 c0659r6, io.appmetrica.analytics.impl.C0575o c0575o, io.appmetrica.analytics.impl.R3 r3, io.appmetrica.analytics.impl.C0523m c0523m) {
        this(c0659r6, new io.appmetrica.analytics.impl.D7(), r3, c0523m, new io.appmetrica.analytics.impl.F1(), c0575o, new io.appmetrica.analytics.impl.Wk(c0575o, c0523m), new io.appmetrica.analytics.impl.E5(c0575o), new io.appmetrica.analytics.impl.C0547mn(), new io.appmetrica.analytics.impl.C0653r0());
    }

    public final synchronized io.appmetrica.analytics.impl.C0770vd a(android.content.Context context) {
        try {
            if (this.f5500j == null) {
                this.f5500j = new io.appmetrica.analytics.impl.C0770vd(context, new io.appmetrica.analytics.impl.C0548mo());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f5500j;
    }

    public final io.appmetrica.analytics.impl.C0270c4 c(android.content.Context context) {
        java.io.File file;
        io.appmetrica.analytics.impl.C0270c4 c0270c4 = this.f5511v;
        if (c0270c4 == null) {
            synchronized (this) {
                c0270c4 = this.f5511v;
                if (c0270c4 == null) {
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
                        c0270c4 = new io.appmetrica.analytics.impl.C0270c4(file);
                        this.f5511v = c0270c4;
                    }
                    file = null;
                    c0270c4 = new io.appmetrica.analytics.impl.C0270c4(file);
                    this.f5511v = c0270c4;
                }
            }
        }
        return c0270c4;
    }

    public C0244b4(io.appmetrica.analytics.impl.C0659r6 c0659r6, io.appmetrica.analytics.impl.D7 d7, io.appmetrica.analytics.impl.R3 r3, io.appmetrica.analytics.impl.C0523m c0523m, io.appmetrica.analytics.impl.F1 f12, io.appmetrica.analytics.impl.C0575o c0575o, io.appmetrica.analytics.impl.Wk wk, io.appmetrica.analytics.impl.E5 e5, io.appmetrica.analytics.impl.C0547mn c0547mn, io.appmetrica.analytics.impl.C0653r0 c0653r0) {
        this.f5503m = new io.appmetrica.analytics.impl.Sc();
        this.f5506p = new io.appmetrica.analytics.impl.C0861z0();
        this.f5507q = new io.appmetrica.analytics.impl.K1();
        this.f5508r = new io.appmetrica.analytics.impl.C0276ca();
        new io.appmetrica.analytics.impl.C7();
        this.f5510u = new io.appmetrica.analytics.impl.G7();
        this.f5491a = c0659r6;
        this.f5492b = d7;
        this.f5493c = r3;
        this.f5498h = c0523m;
        this.f5494d = f12;
        this.f5495e = c0575o;
        this.f5496f = wk;
        this.f5497g = e5;
        this.f5499i = c0547mn;
        this.f5501k = c0653r0;
    }

    public final io.appmetrica.analytics.impl.C0240b0 b() {
        io.appmetrica.analytics.impl.C0240b0 c0240b0 = this.f5509s;
        if (c0240b0 == null) {
            synchronized (this) {
                try {
                    c0240b0 = this.f5509s;
                    if (c0240b0 == null) {
                        c0240b0 = new io.appmetrica.analytics.impl.C0240b0(this.f5506p, this.f5496f, this.f5493c);
                        this.f5509s = c0240b0;
                    }
                } finally {
                }
            }
        }
        return c0240b0;
    }
}
