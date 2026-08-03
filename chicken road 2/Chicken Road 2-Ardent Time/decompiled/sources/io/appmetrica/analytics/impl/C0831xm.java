package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831xm extends io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0805wm defaultValue() {
        io.appmetrica.analytics.impl.C0805wm c0805wm = new io.appmetrica.analytics.impl.C0805wm();
        c0805wm.f7047i = new io.appmetrica.analytics.impl.C0675rm();
        return c0805wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0805wm toState(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0805wm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0805wm(), bArr);
    }
}
