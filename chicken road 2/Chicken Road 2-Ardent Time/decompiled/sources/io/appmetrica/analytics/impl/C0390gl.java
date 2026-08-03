package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390gl implements io.appmetrica.analytics.impl.InterfaceC0248b8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Yi f5998a;

    public C0390gl() {
        this(new io.appmetrica.analytics.impl.Yi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.impl.Di> fromModel(io.appmetrica.analytics.impl.C0364fl c0364fl) {
        io.appmetrica.analytics.impl.C0739u8 c0739u8 = new io.appmetrica.analytics.impl.C0739u8();
        c0739u8.f6893a = 1;
        c0739u8.f6894b = new io.appmetrica.analytics.impl.C0713t8();
        io.appmetrica.analytics.impl.Di fromModel = this.f5998a.fromModel(c0364fl.f5907a);
        c0739u8.f6894b.f6848a = (io.appmetrica.analytics.impl.C0636q8) fromModel.f4214a;
        io.appmetrica.analytics.impl.C0217a3 c0217a3 = new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(fromModel));
        fromModel.f4215b.getBytesTruncated();
        return java.util.Collections.singletonList(new io.appmetrica.analytics.impl.Di(c0739u8, c0217a3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0390gl(io.appmetrica.analytics.impl.Yi yi) {
        this.f5998a = yi;
    }

    public final io.appmetrica.analytics.impl.C0364fl a(java.util.List<io.appmetrica.analytics.impl.Di> list) {
        throw new java.lang.UnsupportedOperationException();
    }
}
