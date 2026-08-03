package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338el implements io.appmetrica.analytics.impl.InterfaceC0248b8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Gf f5860a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0385gg f5861b;

    public C0338el() {
        this(new io.appmetrica.analytics.impl.Gf(), new io.appmetrica.analytics.impl.C0385gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.impl.Di> fromModel(io.appmetrica.analytics.impl.C0313dl c0313dl) {
        io.appmetrica.analytics.impl.Di di;
        io.appmetrica.analytics.impl.C0739u8 c0739u8 = new io.appmetrica.analytics.impl.C0739u8();
        c0739u8.f6893a = 3;
        c0739u8.f6896d = new io.appmetrica.analytics.impl.C0687s8();
        io.appmetrica.analytics.impl.Di fromModel = this.f5860a.fromModel(c0313dl.f5730a);
        c0739u8.f6896d.f6797a = (io.appmetrica.analytics.impl.C0558n8) fromModel.f4214a;
        io.appmetrica.analytics.impl.C0825xg c0825xg = c0313dl.f5731b;
        if (c0825xg != null) {
            di = this.f5861b.fromModel(c0825xg);
            c0739u8.f6896d.f6798b = (io.appmetrica.analytics.impl.C0610p8) di.f4214a;
        } else {
            di = null;
        }
        return java.util.Collections.singletonList(new io.appmetrica.analytics.impl.Di(c0739u8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(fromModel, di))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0338el(io.appmetrica.analytics.impl.Gf gf, io.appmetrica.analytics.impl.C0385gg c0385gg) {
        this.f5860a = gf;
        this.f5861b = c0385gg;
    }

    public final io.appmetrica.analytics.impl.C0313dl a(java.util.List<io.appmetrica.analytics.impl.Di> list) {
        throw new java.lang.UnsupportedOperationException();
    }
}
