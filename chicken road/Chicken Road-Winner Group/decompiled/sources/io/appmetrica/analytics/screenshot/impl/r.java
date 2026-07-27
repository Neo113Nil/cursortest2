package io.appmetrica.analytics.screenshot.impl;

import e2.AbstractC0290e;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C1035p c1035p) {
        O o3 = new O();
        o3.f8997a = c1035p.f9066a;
        Object[] array = c1035p.f9067b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o3.f8999c = (String[]) array;
        o3.f8998b = c1035p.f9068c;
        return o3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1035p toModel(O o3) {
        return new C1035p(o3.f8997a, AbstractC0290e.Z(o3.f8999c), o3.f8998b);
    }
}
