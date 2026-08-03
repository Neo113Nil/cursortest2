package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838y3 extends io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer {
    public final io.appmetrica.analytics.impl.C0812x3 a() {
        return new io.appmetrica.analytics.impl.C0812x3();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final io.appmetrica.analytics.protobuf.nano.MessageNano defaultValue() {
        return new io.appmetrica.analytics.impl.C0812x3();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0812x3 toState(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0812x3) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0812x3(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final java.lang.Object defaultValue() {
        return new io.appmetrica.analytics.impl.C0812x3();
    }
}
