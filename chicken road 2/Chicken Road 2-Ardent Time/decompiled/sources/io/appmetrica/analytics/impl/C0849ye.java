package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849ye implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0727tm fromModel(io.appmetrica.analytics.impl.C0823xe c0823xe) {
        io.appmetrica.analytics.impl.C0727tm c0727tm = new io.appmetrica.analytics.impl.C0727tm();
        c0727tm.f6865a = c0823xe.f7107a;
        c0727tm.f6866b = c0823xe.f7108b;
        return c0727tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        io.appmetrica.analytics.impl.C0727tm c0727tm = (io.appmetrica.analytics.impl.C0727tm) obj;
        return new io.appmetrica.analytics.impl.C0823xe(c0727tm.f6865a, c0727tm.f6866b);
    }

    public final io.appmetrica.analytics.impl.C0823xe a(io.appmetrica.analytics.impl.C0727tm c0727tm) {
        return new io.appmetrica.analytics.impl.C0823xe(c0727tm.f6865a, c0727tm.f6866b);
    }
}
