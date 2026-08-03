package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346f3 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    public final io.appmetrica.analytics.impl.C0598om a(io.appmetrica.analytics.impl.C0295d3 c0295d3) {
        io.appmetrica.analytics.impl.C0598om c0598om = new io.appmetrica.analytics.impl.C0598om();
        c0598om.f6604a = c0295d3.f5692a;
        return c0598om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        io.appmetrica.analytics.impl.C0598om c0598om = new io.appmetrica.analytics.impl.C0598om();
        c0598om.f6604a = ((io.appmetrica.analytics.impl.C0295d3) obj).f5692a;
        return c0598om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        return new io.appmetrica.analytics.impl.C0295d3(((io.appmetrica.analytics.impl.C0598om) obj).f6604a);
    }

    public final io.appmetrica.analytics.impl.C0295d3 a(io.appmetrica.analytics.impl.C0598om c0598om) {
        return new io.appmetrica.analytics.impl.C0295d3(c0598om.f6604a);
    }
}
