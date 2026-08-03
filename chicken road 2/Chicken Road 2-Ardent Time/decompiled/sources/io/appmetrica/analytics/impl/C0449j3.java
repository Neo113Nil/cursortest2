package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449j3 implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Gf f6149a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0764v7 f6150b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0824xf f6151c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0385gg f6152d;

    public C0449j3() {
        this(new io.appmetrica.analytics.impl.Gf(), new io.appmetrica.analytics.impl.C0764v7(), new io.appmetrica.analytics.impl.C0824xf(), new io.appmetrica.analytics.impl.C0385gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(io.appmetrica.analytics.impl.C0475k3 c0475k3) {
        io.appmetrica.analytics.impl.Di di;
        io.appmetrica.analytics.impl.C0325e8 c0325e8 = new io.appmetrica.analytics.impl.C0325e8();
        io.appmetrica.analytics.impl.Di fromModel = this.f6149a.fromModel(c0475k3.f6246a);
        c0325e8.f5785a = (io.appmetrica.analytics.impl.C0558n8) fromModel.f4214a;
        c0325e8.f5787c = this.f6150b.fromModel(c0475k3.f6247b);
        io.appmetrica.analytics.impl.Di fromModel2 = this.f6151c.fromModel(c0475k3.f6248c);
        c0325e8.f5788d = (io.appmetrica.analytics.impl.C0532m8) fromModel2.f4214a;
        io.appmetrica.analytics.impl.C0825xg c0825xg = c0475k3.f6249d;
        if (c0825xg != null) {
            di = this.f6152d.fromModel(c0825xg);
            c0325e8.f5786b = (io.appmetrica.analytics.impl.C0610p8) di.f4214a;
        } else {
            di = null;
        }
        return new io.appmetrica.analytics.impl.Di(c0325e8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(fromModel, fromModel2, di)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0449j3(io.appmetrica.analytics.impl.Gf gf, io.appmetrica.analytics.impl.C0764v7 c0764v7, io.appmetrica.analytics.impl.C0824xf c0824xf, io.appmetrica.analytics.impl.C0385gg c0385gg) {
        this.f6149a = gf;
        this.f6150b = c0764v7;
        this.f6151c = c0824xf;
        this.f6152d = c0385gg;
    }

    public final io.appmetrica.analytics.impl.C0475k3 a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
