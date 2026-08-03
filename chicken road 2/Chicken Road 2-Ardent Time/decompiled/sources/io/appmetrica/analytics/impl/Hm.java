package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hm implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    public final io.appmetrica.analytics.impl.C0779vm a(io.appmetrica.analytics.impl.Gm gm) {
        io.appmetrica.analytics.impl.C0779vm c0779vm = new io.appmetrica.analytics.impl.C0779vm();
        c0779vm.f6985a = gm.f4352a;
        return c0779vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        io.appmetrica.analytics.impl.C0779vm c0779vm = new io.appmetrica.analytics.impl.C0779vm();
        c0779vm.f6985a = ((io.appmetrica.analytics.impl.Gm) obj).f4352a;
        return c0779vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        return new io.appmetrica.analytics.impl.Gm(((io.appmetrica.analytics.impl.C0779vm) obj).f6985a);
    }

    public final io.appmetrica.analytics.impl.Gm a(io.appmetrica.analytics.impl.C0779vm c0779vm) {
        return new io.appmetrica.analytics.impl.Gm(c0779vm.f6985a);
    }
}
