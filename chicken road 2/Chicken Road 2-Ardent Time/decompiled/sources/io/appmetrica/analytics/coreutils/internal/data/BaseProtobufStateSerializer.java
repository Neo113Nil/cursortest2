package io.appmetrica.analytics.coreutils.internal.data;

/* loaded from: classes.dex */
public abstract class BaseProtobufStateSerializer<T extends io.appmetrica.analytics.protobuf.nano.MessageNano> implements io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer<T> {
    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public abstract T defaultValue();

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public byte[] toByteArray(T t) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(t);
    }
}
