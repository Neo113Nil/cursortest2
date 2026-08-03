package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0271c5 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0219a5 f5618a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0245b5 f5619b;

    /* renamed from: c, reason: collision with root package name */
    protected final android.content.Context f5620c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Q4 f5621d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0580o4 f5622e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.V4 f5623f;

    /* renamed from: g, reason: collision with root package name */
    protected final io.appmetrica.analytics.impl.C0365fm f5624g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0412hh f5625h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H8 f5626i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f5627j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fb f5628k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0688s9 f5629l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5630m;

    public C0271c5(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.V4 v4, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, int i2, io.appmetrica.analytics.impl.Fb fb, io.appmetrica.analytics.impl.InterfaceC0688s9 interfaceC0688s9) {
        this(context, q4, c0580o4, v4, c0365fm, interfaceC0412hh, iCommonExecutor, new io.appmetrica.analytics.impl.H8(), i2, new io.appmetrica.analytics.impl.C0219a5(c0580o4.f6553a), new io.appmetrica.analytics.impl.C0245b5(context, q4), fb, interfaceC0688s9);
    }

    public static io.appmetrica.analytics.impl.X8 c(io.appmetrica.analytics.impl.X4 x4) {
        return new io.appmetrica.analytics.impl.X8(x4);
    }

    public final io.appmetrica.analytics.impl.M8 a() {
        android.content.Context context = this.f5620c;
        io.appmetrica.analytics.impl.Q4 q4 = this.f5621d;
        return new io.appmetrica.analytics.impl.M8(new io.appmetrica.analytics.impl.R8(context, q4), this.f5630m);
    }

    public final io.appmetrica.analytics.impl.L6 b(io.appmetrica.analytics.impl.X4 x4) {
        return new io.appmetrica.analytics.impl.L6(x4, io.appmetrica.analytics.impl.C0560na.f6484I.B().c(this.f5620c, this.f5621d), new io.appmetrica.analytics.impl.H6(x4.c()), new io.appmetrica.analytics.impl.C0350f7());
    }

    public final io.appmetrica.analytics.impl.C0219a5 d() {
        return this.f5618a;
    }

    public final io.appmetrica.analytics.impl.C0245b5 e() {
        return this.f5619b;
    }

    public final io.appmetrica.analytics.impl.C0833xo f() {
        io.appmetrica.analytics.impl.C0833xo c0833xo;
        io.appmetrica.analytics.impl.Bo c0250ba;
        io.appmetrica.analytics.impl.Ao D2 = io.appmetrica.analytics.impl.C0560na.f6484I.D();
        io.appmetrica.analytics.impl.Q4 q4 = this.f5621d;
        synchronized (D2) {
            try {
                java.lang.String valueOf = java.lang.String.valueOf(q4);
                java.util.LinkedHashMap linkedHashMap = D2.f4075b;
                java.lang.Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    io.appmetrica.analytics.impl.We we = new io.appmetrica.analytics.impl.We(io.appmetrica.analytics.impl.C0560na.f6484I.B().b(D2.f4074a, q4));
                    if (q4.d()) {
                        java.lang.String str = "appmetrica_vital_" + q4.f4860b + ".dat";
                        c0250ba = new io.appmetrica.analytics.impl.C0374g5(i1.AbstractC0191j.H(new h1.C0172d(str, new io.appmetrica.analytics.impl.C0250ba(D2.f4074a, str)), new h1.C0172d("appmetrica_vital_main.dat", new io.appmetrica.analytics.impl.C0250ba(D2.f4074a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0250ba = new io.appmetrica.analytics.impl.C0250ba(D2.f4074a, "appmetrica_vital_" + q4.f4860b + ".dat");
                    }
                    obj = new io.appmetrica.analytics.impl.C0833xo(we, c0250ba, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                c0833xo = (io.appmetrica.analytics.impl.C0833xo) obj;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0833xo;
    }

    public C0271c5(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.V4 v4, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.impl.H8 h8, int i2, io.appmetrica.analytics.impl.C0219a5 c0219a5, io.appmetrica.analytics.impl.C0245b5 c0245b5, io.appmetrica.analytics.impl.Fb fb, io.appmetrica.analytics.impl.InterfaceC0688s9 interfaceC0688s9) {
        this.f5620c = context;
        this.f5621d = q4;
        this.f5622e = c0580o4;
        this.f5623f = v4;
        this.f5624g = c0365fm;
        this.f5625h = interfaceC0412hh;
        this.f5627j = iCommonExecutor;
        this.f5626i = h8;
        this.f5630m = i2;
        this.f5618a = c0219a5;
        this.f5619b = c0245b5;
        this.f5628k = fb;
        this.f5629l = interfaceC0688s9;
    }

    public final io.appmetrica.analytics.impl.Jk c() {
        return new io.appmetrica.analytics.impl.Jk(this.f5620c, this.f5621d);
    }

    public final io.appmetrica.analytics.impl.C0775vi d(io.appmetrica.analytics.impl.X4 x4) {
        io.appmetrica.analytics.impl.C0775vi c0775vi = new io.appmetrica.analytics.impl.C0775vi(x4, this.f5623f.a(), this.f5627j);
        io.appmetrica.analytics.impl.Fb fb = this.f5628k;
        synchronized (fb) {
            fb.f4289c.add(c0775vi);
        }
        return c0775vi;
    }

    public final io.appmetrica.analytics.impl.Qg a(io.appmetrica.analytics.impl.X4 x4) {
        return new io.appmetrica.analytics.impl.Qg(new io.appmetrica.analytics.impl.C0437ih(x4, this.f5625h, new io.appmetrica.analytics.impl.C3()), this.f5624g, new io.appmetrica.analytics.impl.C0360fh(this.f5622e));
    }

    public static io.appmetrica.analytics.impl.Rk a(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.W4 w4) {
        io.appmetrica.analytics.impl.Qk qk = new io.appmetrica.analytics.impl.Qk(c0833xo);
        return new io.appmetrica.analytics.impl.Rk(x4, qk, w4, new io.appmetrica.analytics.impl.C0405ha(x4, qk, new io.appmetrica.analytics.impl.Uk(x4.h(), io.appmetrica.analytics.impl.C0405ha.f6047g), io.appmetrica.analytics.impl.AbstractC0810x1.a(), new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider()), new io.appmetrica.analytics.impl.C0863z2(x4, qk, new io.appmetrica.analytics.impl.Uk(x4.h(), io.appmetrica.analytics.impl.C0863z2.f7175g), io.appmetrica.analytics.impl.AbstractC0810x1.a(), new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider()));
    }

    public static io.appmetrica.analytics.impl.S4 b() {
        return new io.appmetrica.analytics.impl.S4();
    }

    public final io.appmetrica.analytics.impl.C0527m3 b(io.appmetrica.analytics.impl.We we) {
        android.content.Context context = this.f5620c;
        return new io.appmetrica.analytics.impl.C0527m3(context, we, context.getPackageName(), new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager());
    }

    public final io.appmetrica.analytics.impl.C0481k9 a(io.appmetrica.analytics.impl.We we, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.Rk rk, io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.impl.C0446j0 c0446j0, io.appmetrica.analytics.impl.Jk jk, io.appmetrica.analytics.impl.C0775vi c0775vi) {
        return new io.appmetrica.analytics.impl.C0481k9(we, c0833xo, rk, l6, c0446j0, this.f5626i, jk, this.f5630m, new io.appmetrica.analytics.impl.Z4(c0775vi), new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    public static io.appmetrica.analytics.impl.C0723ti a(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.X8 x8) {
        return new io.appmetrica.analytics.impl.C0723ti(x8, x4);
    }

    public io.appmetrica.analytics.impl.InterfaceC0637q9 a(io.appmetrica.analytics.impl.InterfaceC0766v9 interfaceC0766v9, io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.impl.Qg qg, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.We we) {
        return this.f5629l.a(interfaceC0766v9, l6, qg, c0580o4, q4, we).a();
    }

    public final io.appmetrica.analytics.impl.C0604p2 a(io.appmetrica.analytics.impl.We we) {
        return new io.appmetrica.analytics.impl.C0604p2(this.f5621d, we);
    }
}
