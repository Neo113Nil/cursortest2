package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437ih extends io.appmetrica.analytics.impl.M5 {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f6101b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0412hh f6102c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C3 f6103d;

    public C0437ih(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh) {
        this(x4, interfaceC0412hh, new io.appmetrica.analytics.impl.C3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0489kh load(io.appmetrica.analytics.impl.L5 l5) {
        io.appmetrica.analytics.impl.C0489kh c0489kh = (io.appmetrica.analytics.impl.C0489kh) super.load(l5);
        c0489kh.f6293m = ((io.appmetrica.analytics.impl.C0360fh) l5.componentArguments).f5892a;
        c0489kh.f6298r = this.f6101b.t.a();
        c0489kh.f6302w = this.f6101b.f5271q.a();
        io.appmetrica.analytics.impl.C0360fh c0360fh = (io.appmetrica.analytics.impl.C0360fh) l5.componentArguments;
        c0489kh.f6284d = c0360fh.f5893b;
        c0489kh.f6285e = c0360fh.f5894c;
        c0489kh.f6286f = c0360fh.f5895d;
        c0489kh.f6289i = c0360fh.f5896e;
        c0489kh.f6287g = c0360fh.f5897f;
        c0489kh.f6288h = c0360fh.f5898g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c0360fh.f5899h);
        io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh = this.f6102c;
        c0489kh.f6290j = valueOf;
        c0489kh.f6291k = interfaceC0412hh;
        io.appmetrica.analytics.impl.C0360fh c0360fh2 = (io.appmetrica.analytics.impl.C0360fh) l5.componentArguments;
        c0489kh.f6301v = c0360fh2.f5901j;
        io.appmetrica.analytics.impl.C0365fm c0365fm = l5.f4580a;
        io.appmetrica.analytics.impl.C0502l4 c0502l4 = c0365fm.f5924n;
        c0489kh.f6294n = c0502l4.f6323a;
        io.appmetrica.analytics.impl.C0823xe c0823xe = c0365fm.f5929s;
        if (c0823xe != null) {
            c0489kh.f6299s = c0823xe.f7107a;
            c0489kh.t = c0823xe.f7108b;
        }
        c0489kh.f6295o = c0502l4.f6324b;
        c0489kh.f6297q = c0365fm.f5915e;
        c0489kh.f6296p = c0365fm.f5921k;
        io.appmetrica.analytics.impl.C3 c3 = this.f6103d;
        java.util.Map<java.lang.String, java.lang.String> map = c0360fh2.f5900i;
        io.appmetrica.analytics.impl.C0864z3 f2 = io.appmetrica.analytics.impl.C0560na.f6484I.f();
        c3.getClass();
        c0489kh.f6300u = io.appmetrica.analytics.impl.C3.a(map, c0365fm, f2);
        c0489kh.f6303x = this.f6101b.f5275v.f6628e.keySet();
        return c0489kh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final io.appmetrica.analytics.networktasks.internal.BaseRequestConfig createBlankConfig() {
        return new io.appmetrica.analytics.impl.C0489kh(this.f6101b);
    }

    public C0437ih(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh, io.appmetrica.analytics.impl.C3 c3) {
        super(x4.getContext(), x4.b().c());
        this.f6101b = x4;
        this.f6102c = interfaceC0412hh;
        this.f6103d = c3;
    }

    public final io.appmetrica.analytics.impl.C0489kh a() {
        return new io.appmetrica.analytics.impl.C0489kh(this.f6101b);
    }
}
