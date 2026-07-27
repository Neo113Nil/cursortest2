package io.appmetrica.analytics.impl;

import e2.AbstractC0290e;
import e2.AbstractC0293h;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class D6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0864tm[] fromModel(Map<String, ? extends List<String>> map) {
        C0864tm[] c0864tmArr = new C0864tm[map.size()];
        int i3 = 0;
        for (Object obj : map.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0293h.T();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0864tm c0864tm = new C0864tm();
            c0864tm.f8375a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0864tm.f8376b = (String[]) array;
            c0864tmArr[i3] = c0864tm;
            i3 = i4;
        }
        return c0864tmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C0864tm[] c0864tmArr) {
        int j02 = e2.s.j0(c0864tmArr.length);
        if (j02 < 16) {
            j02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j02);
        for (C0864tm c0864tm : c0864tmArr) {
            linkedHashMap.put(c0864tm.f8375a, AbstractC0290e.Z(c0864tm.f8376b));
        }
        return linkedHashMap;
    }
}
