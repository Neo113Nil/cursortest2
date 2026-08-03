package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509lb implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Mc f6353a;

    public C0509lb() {
        this(new io.appmetrica.analytics.impl.Mc(new io.appmetrica.analytics.impl.Rn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(io.appmetrica.analytics.impl.Qn qn) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray((io.appmetrica.analytics.protobuf.nano.MessageNano) this.f6353a.f4660a.fromModel(qn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0509lb(io.appmetrica.analytics.impl.Mc mc) {
        this.f6353a = mc;
    }

    public final io.appmetrica.analytics.impl.Qn a(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
