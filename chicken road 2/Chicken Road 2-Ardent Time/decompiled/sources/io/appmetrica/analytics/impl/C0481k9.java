package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481k9 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.We f6264a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0833xo f6265b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Rk f6266c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.L6 f6267d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H8 f6268e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Jk f6269f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0446j0 f6270g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Z4 f6271h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.TimeProvider f6272i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6273j;

    /* renamed from: k, reason: collision with root package name */
    public long f6274k;

    /* renamed from: l, reason: collision with root package name */
    public int f6275l;

    public C0481k9(io.appmetrica.analytics.impl.We we, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.Rk rk, io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.impl.C0446j0 c0446j0, io.appmetrica.analytics.impl.H8 h8, io.appmetrica.analytics.impl.Jk jk, int i2, io.appmetrica.analytics.impl.Z4 z4, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f6264a = we;
        this.f6265b = c0833xo;
        this.f6266c = rk;
        this.f6267d = l6;
        this.f6270g = c0446j0;
        this.f6268e = h8;
        this.f6269f = jk;
        this.f6273j = i2;
        this.f6272i = systemTimeProvider;
        this.f6271h = z4;
        this.f6274k = we.i();
        this.f6275l = we.h();
    }

    public final void a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.Tk tk) {
        java.util.Map map = p5.f4828p;
        io.appmetrica.analytics.impl.Jk jk = this.f6269f;
        jk.getClass();
        map.putAll(new java.util.HashMap(jk.f4514b));
        p5.c(this.f6264a.j());
        p5.f4827o = java.lang.Integer.valueOf(this.f6265b.b());
        io.appmetrica.analytics.impl.C0421i0 a2 = this.f6270g.a();
        io.appmetrica.analytics.impl.H8 h8 = this.f6268e;
        h8.getClass();
        io.appmetrica.analytics.impl.G8 g8 = (io.appmetrica.analytics.impl.G8) h8.f4374b.a(io.appmetrica.analytics.impl.EnumC0251bb.a(p5.f4816d));
        io.appmetrica.analytics.impl.L6 l6 = this.f6267d;
        io.appmetrica.analytics.impl.C0869z8 a3 = g8.a(p5);
        int i2 = p5.f4816d;
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f6265b;
        io.appmetrica.analytics.impl.C0402h7 c0402h7 = new io.appmetrica.analytics.impl.C0402h7(l6.f4588g, tk, i2, c0833xo, a3, (io.appmetrica.analytics.impl.C0489kh) l6.f4589h.f5265k.a(), a2);
        java.lang.Long valueOf = java.lang.Long.valueOf(tk.f5032a);
        io.appmetrica.analytics.impl.Vk vk = tk.f5035d;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(tk.f5033b);
        io.appmetrica.analytics.impl.EnumC0251bb a4 = io.appmetrica.analytics.impl.EnumC0251bb.a(c0402h7.f6035h.f4816d);
        long j2 = 0;
        if (!io.appmetrica.analytics.impl.AbstractC0792w9.f7011g.contains(io.appmetrica.analytics.impl.EnumC0251bb.a(i2))) {
            synchronized (c0833xo) {
                org.json.JSONObject a5 = c0833xo.f7123a.a();
                j2 = a5.optLong("global_number", 0L);
                c0833xo.f7123a.a(a5.put("global_number", 1 + j2));
            }
        }
        l6.a(l6.f4593l.fromModel(new io.appmetrica.analytics.impl.C0324e7(valueOf, vk, valueOf2, a4, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(tk.f5034c), c0402h7.a())));
        this.f6271h.f5375a.h();
    }
}
