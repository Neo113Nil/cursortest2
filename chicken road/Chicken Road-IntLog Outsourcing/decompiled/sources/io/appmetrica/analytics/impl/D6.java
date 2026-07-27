package io.appmetrica.analytics.impl;

import g4.AbstractC0464i;
import g4.AbstractC0466k;
import g4.AbstractC0476u;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class D6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1013tm[] fromModel(Map<String, ? extends List<String>> map) {
        C1013tm[] c1013tmArr = new C1013tm[map.size()];
        int i2 = 0;
        for (Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0466k.C0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C1013tm c1013tm = new C1013tm();
            c1013tm.f9326a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c1013tm.f9327b = (String[]) array;
            c1013tmArr[i2] = c1013tm;
            i2 = i3;
        }
        return c1013tmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C1013tm[] c1013tmArr) {
        int W5 = AbstractC0476u.W(c1013tmArr.length);
        if (W5 < 16) {
            W5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W5);
        for (C1013tm c1013tm : c1013tmArr) {
            linkedHashMap.put(c1013tm.f9326a, AbstractC0464i.a0(c1013tm.f9327b));
        }
        return linkedHashMap;
    }
}
