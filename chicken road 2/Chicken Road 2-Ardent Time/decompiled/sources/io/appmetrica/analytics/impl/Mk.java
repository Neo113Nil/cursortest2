package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mk extends io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer {
    public final io.appmetrica.analytics.impl.Kk a() {
        return new io.appmetrica.analytics.impl.Kk();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final io.appmetrica.analytics.protobuf.nano.MessageNano defaultValue() {
        return new io.appmetrica.analytics.impl.Kk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Kk toState(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Kk) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Kk(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final java.lang.Object defaultValue() {
        return new io.appmetrica.analytics.impl.Kk();
    }
}
