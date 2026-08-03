package io.appmetrica.analytics.idsync.impl;

/* renamed from: io.appmetrica.analytics.idsync.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209d implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.C0210e f3919a;

    public C0209d(io.appmetrica.analytics.idsync.impl.C0210e c0210e) {
        this.f3919a = c0210e;
    }

    public final byte[] a(io.appmetrica.analytics.idsync.internal.model.IdSyncConfig idSyncConfig) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f3919a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f3919a.fromModel((io.appmetrica.analytics.idsync.internal.model.IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.internal.model.IdSyncConfig toModel(byte[] bArr) {
        return this.f3919a.toModel((io.appmetrica.analytics.idsync.impl.m) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.idsync.impl.m(), bArr));
    }
}
