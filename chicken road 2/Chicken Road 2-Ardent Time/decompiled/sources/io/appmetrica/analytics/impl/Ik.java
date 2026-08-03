package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ik implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Kk fromModel(java.util.Map<java.lang.String, byte[]> map) {
        io.appmetrica.analytics.impl.Kk kk = new io.appmetrica.analytics.impl.Kk();
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : map.entrySet()) {
            io.appmetrica.analytics.impl.Lk lk = new io.appmetrica.analytics.impl.Lk();
            lk.f4626a = entry.getKey().getBytes(y1.a.f8486a);
            lk.f4627b = entry.getValue();
            arrayList.add(lk);
        }
        java.lang.Object[] array = arrayList.toArray(new io.appmetrica.analytics.impl.Lk[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kk.f4556a = (io.appmetrica.analytics.impl.Lk[]) array;
        return kk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.Map<java.lang.String, byte[]> toModel(io.appmetrica.analytics.impl.Kk kk) {
        io.appmetrica.analytics.impl.Lk[] lkArr = kk.f4556a;
        int E2 = i1.AbstractC0203v.E(lkArr.length);
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        for (io.appmetrica.analytics.impl.Lk lk : lkArr) {
            linkedHashMap.put(new java.lang.String(lk.f4626a, y1.a.f8486a), lk.f4627b);
        }
        return linkedHashMap;
    }
}
