package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813x4 implements io.appmetrica.analytics.impl.Ea, io.appmetrica.analytics.impl.Ql, io.appmetrica.analytics.impl.Ga {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7082a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Q4 f7083b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Am f7084c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0878zh f7085d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.E4 f7086e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0521ln f7087f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f7088g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.R4 f7089h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0514lg f7090i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.T3 f7091j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0644qg f7092k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Object f7093l;

    public C0813x4(android.content.Context context, io.appmetrica.analytics.impl.Hl hl, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0606p4 c0606p4, io.appmetrica.analytics.impl.C0514lg c0514lg) {
        this(context, hl, q4, c0606p4, new io.appmetrica.analytics.impl.C0878zh(c0606p4.f6630b), c0514lg, new io.appmetrica.analytics.impl.R4(), new io.appmetrica.analytics.impl.C0865z4(), new io.appmetrica.analytics.impl.C0644qg());
    }

    public static void b(io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        io.appmetrica.analytics.impl.C0560na.f6484I.c().b(!java.lang.Boolean.FALSE.equals(c0606p4.f6630b.f6566n));
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void a(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        io.appmetrica.analytics.impl.C0878zh c0878zh = this.f7085d;
        c0878zh.f7189a = c0878zh.f7189a.mergeFrom(c0580o4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType c() {
        return io.appmetrica.analytics.internal.CounterConfigurationReporterType.COMMUTATION;
    }

    public final io.appmetrica.analytics.impl.C0580o4 d() {
        return this.f7085d.f7189a;
    }

    public final io.appmetrica.analytics.impl.C0514lg e() {
        return this.f7090i;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final android.content.Context getContext() {
        return this.f7082a;
    }

    public C0813x4(android.content.Context context, io.appmetrica.analytics.impl.Hl hl, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0606p4 c0606p4, io.appmetrica.analytics.impl.C0878zh c0878zh, io.appmetrica.analytics.impl.C0514lg c0514lg, io.appmetrica.analytics.impl.R4 r4, io.appmetrica.analytics.impl.C0865z4 c0865z4, io.appmetrica.analytics.impl.C0644qg c0644qg) {
        this.f7088g = new java.util.ArrayList();
        this.f7093l = new java.lang.Object();
        android.content.Context applicationContext = context.getApplicationContext();
        this.f7082a = applicationContext;
        this.f7083b = q4;
        this.f7085d = c0878zh;
        this.f7089h = r4;
        this.f7086e = io.appmetrica.analytics.impl.C0865z4.a(this);
        b(c0606p4);
        io.appmetrica.analytics.impl.Am a2 = hl.a(applicationContext, q4, c0606p4.f6629a);
        this.f7084c = a2;
        this.f7091j = io.appmetrica.analytics.impl.U3.a(a2, io.appmetrica.analytics.impl.C0560na.k().c());
        this.f7087f = c0865z4.a(this, a2);
        this.f7090i = c0514lg;
        this.f7092k = c0644qg;
        hl.a(q4, this);
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0735u4 c0735u4) {
        this.f7089h.f4891a.add(c0735u4);
        io.appmetrica.analytics.impl.B6.a(c0735u4.f6877c, this.f7091j.a(io.appmetrica.analytics.impl.Fm.a(this.f7084c.e().f5922l)));
    }

    public final synchronized void b(io.appmetrica.analytics.impl.C0735u4 c0735u4) {
        this.f7089h.f4891a.remove(c0735u4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final io.appmetrica.analytics.impl.Q4 b() {
        return this.f7083b;
    }

    public final void a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0735u4 c0735u4) {
        io.appmetrica.analytics.impl.E4 e4 = this.f7086e;
        e4.getClass();
        e4.a(p5, new io.appmetrica.analytics.impl.D4(c0735u4));
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(io.appmetrica.analytics.impl.Jl jl, io.appmetrica.analytics.impl.C0365fm c0365fm) {
        synchronized (this.f7093l) {
            try {
                java.util.Iterator it = this.f7088g.iterator();
                while (it.hasNext()) {
                    io.appmetrica.analytics.impl.Xa xa = (io.appmetrica.analytics.impl.Xa) it.next();
                    io.appmetrica.analytics.impl.B6.a(xa.f5295a, jl, this.f7091j.a(xa.f5297c));
                }
                this.f7088g.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        synchronized (this.f7093l) {
            try {
                java.util.Iterator it = this.f7089h.f4891a.iterator();
                while (it.hasNext()) {
                    io.appmetrica.analytics.impl.C0735u4 c0735u4 = (io.appmetrica.analytics.impl.C0735u4) it.next();
                    io.appmetrica.analytics.impl.B6.a(c0735u4.f6877c, this.f7091j.a(io.appmetrica.analytics.impl.Fm.a(c0365fm.f5922l)));
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it2 = this.f7088g.iterator();
                while (it2.hasNext()) {
                    io.appmetrica.analytics.impl.Xa xa = (io.appmetrica.analytics.impl.Xa) it2.next();
                    if (io.appmetrica.analytics.impl.AbstractC0288cm.a(c0365fm, xa.f5296b, xa.f5297c, new io.appmetrica.analytics.impl.Va())) {
                        io.appmetrica.analytics.impl.B6.a(xa.f5295a, this.f7091j.a(xa.f5297c));
                    } else {
                        arrayList.add(xa);
                    }
                }
                this.f7088g = new java.util.ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f7087f.c();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void a(io.appmetrica.analytics.impl.Xa xa) {
        android.os.ResultReceiver resultReceiver;
        java.util.HashMap hashMap;
        java.util.List<java.lang.String> list;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (xa != null) {
            list = xa.f5296b;
            resultReceiver = xa.f5295a;
            hashMap = xa.f5297c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a2 = this.f7084c.a(list, hashMap);
        if (!a2) {
            io.appmetrica.analytics.impl.B6.a(resultReceiver, this.f7091j.a(hashMap));
        }
        if (!this.f7084c.g()) {
            if (a2) {
                io.appmetrica.analytics.impl.B6.a(resultReceiver, this.f7091j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f7093l) {
            if (a2 && xa != null) {
                try {
                    this.f7088g.add(xa);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        this.f7087f.c();
    }

    public final void a(android.os.ResultReceiver resultReceiver) {
        this.f7092k.a(new io.appmetrica.analytics.impl.C0787w4(resultReceiver));
    }

    public final io.appmetrica.analytics.impl.T3 a() {
        return this.f7091j;
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        this.f7084c.a(c0606p4.f6629a);
        a(c0606p4.f6630b);
    }
}
