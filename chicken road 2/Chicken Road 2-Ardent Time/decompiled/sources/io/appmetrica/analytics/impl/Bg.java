package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Bg implements io.appmetrica.analytics.impl.Ql, io.appmetrica.analytics.impl.Ga {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4125a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Q4 f4126b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.R4 f4127c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Am f4128d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Pa f4129e;

    public Bg(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0606p4 c0606p4, io.appmetrica.analytics.impl.Y4 y4, io.appmetrica.analytics.impl.R4 r4, io.appmetrica.analytics.impl.Hl hl) {
        this.f4125a = context;
        this.f4126b = q4;
        this.f4127c = r4;
        io.appmetrica.analytics.impl.Am a2 = hl.a(context, q4, c0606p4.f6629a);
        this.f4128d = a2;
        this.f4129e = y4.a(context, q4, c0606p4.f6630b, a2);
        hl.a(q4, this);
    }

    public final io.appmetrica.analytics.impl.Q4 a() {
        return this.f4126b;
    }

    public final android.content.Context b() {
        return this.f4125a;
    }

    public final void a(io.appmetrica.analytics.impl.InterfaceC0347f4 interfaceC0347f4) {
        this.f4127c.f4891a.add(interfaceC0347f4);
    }

    public final void b(io.appmetrica.analytics.impl.InterfaceC0347f4 interfaceC0347f4) {
        this.f4127c.f4891a.remove(interfaceC0347f4);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        ((io.appmetrica.analytics.impl.X4) this.f4129e).a(c0365fm);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(io.appmetrica.analytics.impl.Jl jl, io.appmetrica.analytics.impl.C0365fm c0365fm) {
        ((io.appmetrica.analytics.impl.X4) this.f4129e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        this.f4128d.a(c0606p4.f6629a);
        this.f4129e.a(c0606p4.f6630b);
    }

    public Bg(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0606p4 c0606p4, io.appmetrica.analytics.impl.Y4 y4) {
        this(context, q4, c0606p4, y4, new io.appmetrica.analytics.impl.R4(), io.appmetrica.analytics.impl.Hl.a());
    }

    public final void a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        if (!io.appmetrica.analytics.impl.AbstractC0792w9.f7007c.contains(io.appmetrica.analytics.impl.EnumC0251bb.a(p5.f4816d))) {
            this.f4129e.a(c0606p4.f6630b);
        }
        ((io.appmetrica.analytics.impl.X4) this.f4129e).a(p5);
    }
}
