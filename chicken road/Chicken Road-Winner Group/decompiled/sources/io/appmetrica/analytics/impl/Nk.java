package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Nk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pk fromModel(Map<String, byte[]> map) {
        Pk pk = new Pk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Qk qk = new Qk();
            qk.f6485a = entry.getKey().getBytes(v2.a.f10417a);
            qk.f6486b = entry.getValue();
            arrayList.add(qk);
        }
        Object[] array = arrayList.toArray(new Qk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        pk.f6432a = (Qk[]) array;
        return pk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Pk pk) {
        Qk[] qkArr = pk.f6432a;
        int j02 = e2.s.j0(qkArr.length);
        if (j02 < 16) {
            j02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j02);
        for (Qk qk : qkArr) {
            linkedHashMap.put(new String(qk.f6485a, v2.a.f10417a), qk.f6486b);
        }
        return linkedHashMap;
    }
}
