package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Bm extends BaseProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am defaultValue() {
        Am am = new Am();
        am.f6555i = new C1065vm();
        return am;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am toState(byte[] bArr) {
        return (Am) MessageNano.mergeFrom(new Am(), bArr);
    }
}
