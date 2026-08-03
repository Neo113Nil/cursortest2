package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class C9 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0650qm fromModel(io.appmetrica.analytics.impl.B9 b9) {
        io.appmetrica.analytics.impl.C0650qm c0650qm = new io.appmetrica.analytics.impl.C0650qm();
        if (b9 != null) {
            c0650qm.f6700a = b9.f4105a;
        }
        return c0650qm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        return new io.appmetrica.analytics.impl.B9(((io.appmetrica.analytics.impl.C0650qm) obj).f6700a);
    }

    public final io.appmetrica.analytics.impl.B9 a(io.appmetrica.analytics.impl.C0650qm c0650qm) {
        return new io.appmetrica.analytics.impl.B9(c0650qm.f6700a);
    }
}
