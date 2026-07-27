package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683h2 extends BaseProtobufStateSerializer {
    public final C0657g2 a() {
        return new C0657g2();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final MessageNano defaultValue() {
        return new C0657g2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0657g2 toState(byte[] bArr) {
        return (C0657g2) MessageNano.mergeFrom(new C0657g2(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C0657g2();
    }
}
