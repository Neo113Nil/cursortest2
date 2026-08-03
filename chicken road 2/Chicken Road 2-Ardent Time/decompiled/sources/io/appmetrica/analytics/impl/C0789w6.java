package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789w6 implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0624pm[] fromModel(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        io.appmetrica.analytics.impl.C0624pm[] c0624pmArr = new io.appmetrica.analytics.impl.C0624pm[map.size()];
        int i2 = 0;
        for (java.lang.Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i1.AbstractC0191j.J();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            io.appmetrica.analytics.impl.C0624pm c0624pm = new io.appmetrica.analytics.impl.C0624pm();
            c0624pm.f6664a = (java.lang.String) entry.getKey();
            java.lang.Object[] array = ((java.util.Collection) entry.getValue()).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0624pm.f6665b = (java.lang.String[]) array;
            c0624pmArr[i2] = c0624pm;
            i2 = i3;
        }
        return c0624pmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> toModel(io.appmetrica.analytics.impl.C0624pm[] c0624pmArr) {
        int E2 = i1.AbstractC0203v.E(c0624pmArr.length);
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        for (io.appmetrica.analytics.impl.C0624pm c0624pm : c0624pmArr) {
            linkedHashMap.put(c0624pm.f6664a, i1.AbstractC0189h.S(c0624pm.f6665b));
        }
        return linkedHashMap;
    }
}
