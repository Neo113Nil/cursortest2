package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287cl implements io.appmetrica.analytics.impl.InterfaceC0248b8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Yi f5674a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Gf f5675b;

    public C0287cl() {
        this(new io.appmetrica.analytics.impl.Yi(), new io.appmetrica.analytics.impl.Gf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.impl.Di> fromModel(io.appmetrica.analytics.impl.C0261bl c0261bl) {
        io.appmetrica.analytics.impl.C0739u8 c0739u8 = new io.appmetrica.analytics.impl.C0739u8();
        c0739u8.f6893a = 2;
        c0739u8.f6895c = new io.appmetrica.analytics.impl.C0661r8();
        io.appmetrica.analytics.impl.Di fromModel = this.f5674a.fromModel(c0261bl.f5594b);
        c0739u8.f6895c.f6726b = (io.appmetrica.analytics.impl.C0636q8) fromModel.f4214a;
        io.appmetrica.analytics.impl.Di fromModel2 = this.f5675b.fromModel(c0261bl.f5593a);
        c0739u8.f6895c.f6725a = (io.appmetrica.analytics.impl.C0558n8) fromModel2.f4214a;
        return java.util.Collections.singletonList(new io.appmetrica.analytics.impl.Di(c0739u8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0287cl(io.appmetrica.analytics.impl.Yi yi, io.appmetrica.analytics.impl.Gf gf) {
        this.f5674a = yi;
        this.f5675b = gf;
    }

    public final io.appmetrica.analytics.impl.C0261bl a(java.util.List<io.appmetrica.analytics.impl.Di> list) {
        throw new java.lang.UnsupportedOperationException();
    }
}
