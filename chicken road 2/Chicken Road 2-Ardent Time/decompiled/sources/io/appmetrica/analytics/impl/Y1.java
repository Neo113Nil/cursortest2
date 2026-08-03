package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y1 extends io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer {
    public final io.appmetrica.analytics.impl.X1 a() {
        return new io.appmetrica.analytics.impl.X1();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final io.appmetrica.analytics.protobuf.nano.MessageNano defaultValue() {
        return new io.appmetrica.analytics.impl.X1();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.X1 toState(byte[] bArr) {
        return (io.appmetrica.analytics.impl.X1) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.X1(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final java.lang.Object defaultValue() {
        return new io.appmetrica.analytics.impl.X1();
    }
}
