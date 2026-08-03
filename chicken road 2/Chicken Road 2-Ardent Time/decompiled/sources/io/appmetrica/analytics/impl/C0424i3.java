package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424i3 implements io.appmetrica.analytics.impl.InterfaceC0248b8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0449j3 f6073a;

    public C0424i3() {
        this(new io.appmetrica.analytics.impl.C0449j3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.impl.Di> fromModel(io.appmetrica.analytics.impl.C0398h3 c0398h3) {
        io.appmetrica.analytics.impl.C0739u8 c0739u8 = new io.appmetrica.analytics.impl.C0739u8();
        c0739u8.f6897e = new io.appmetrica.analytics.impl.C0300d8();
        io.appmetrica.analytics.impl.Di fromModel = this.f6073a.fromModel(c0398h3.f6024b);
        c0739u8.f6897e.f5716a = (io.appmetrica.analytics.impl.C0325e8) fromModel.f4214a;
        c0739u8.f6893a = c0398h3.f6023a;
        return java.util.Collections.singletonList(new io.appmetrica.analytics.impl.Di(c0739u8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0424i3(io.appmetrica.analytics.impl.C0449j3 c0449j3) {
        this.f6073a = c0449j3;
    }

    public final io.appmetrica.analytics.impl.C0398h3 a(java.util.List<io.appmetrica.analytics.impl.Di> list) {
        throw new java.lang.UnsupportedOperationException();
    }
}
