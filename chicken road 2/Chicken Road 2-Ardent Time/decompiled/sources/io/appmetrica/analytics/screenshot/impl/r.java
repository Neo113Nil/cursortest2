package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class r implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.O fromModel(io.appmetrica.analytics.screenshot.impl.C0900p c0900p) {
        io.appmetrica.analytics.screenshot.impl.O o2 = new io.appmetrica.analytics.screenshot.impl.O();
        o2.f7510a = c0900p.f7580a;
        java.lang.Object[] array = c0900p.f7581b.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o2.f7512c = (java.lang.String[]) array;
        o2.f7511b = c0900p.f7582c;
        return o2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.C0900p toModel(io.appmetrica.analytics.screenshot.impl.O o2) {
        return new io.appmetrica.analytics.screenshot.impl.C0900p(o2.f7510a, i1.AbstractC0189h.S(o2.f7512c), o2.f7511b);
    }
}
