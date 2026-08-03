package io.appmetrica.analytics.remotepermissions.impl;

/* loaded from: classes.dex */
public final class b implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.remotepermissions.impl.c f7473a = new io.appmetrica.analytics.remotepermissions.impl.c();

    public final byte[] a(io.appmetrica.analytics.remotepermissions.impl.a aVar) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f7473a.fromModel(aVar));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f7473a.fromModel((io.appmetrica.analytics.remotepermissions.impl.a) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.remotepermissions.impl.a toModel(byte[] bArr) {
        return this.f7473a.toModel((io.appmetrica.analytics.remotepermissions.impl.f) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.remotepermissions.impl.f(), bArr));
    }
}
