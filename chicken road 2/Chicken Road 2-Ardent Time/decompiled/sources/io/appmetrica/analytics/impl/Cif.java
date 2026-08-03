package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif extends io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer {
    public final io.appmetrica.analytics.impl.C0565nf a() {
        return new io.appmetrica.analytics.impl.C0565nf();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final io.appmetrica.analytics.protobuf.nano.MessageNano defaultValue() {
        return new io.appmetrica.analytics.impl.C0565nf();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0565nf toState(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0565nf) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0565nf(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final java.lang.Object defaultValue() {
        return new io.appmetrica.analytics.impl.C0565nf();
    }
}
