package io.appmetrica.analytics.impl;

import g4.AbstractC0476u;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class B3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F3 fromModel(A3 a32) {
        F3 f3 = new F3();
        f3.f6776a = a(a32.f6497a);
        int size = a32.f6498b.size();
        C3[] c3Arr = new C3[size];
        for (int i2 = 0; i2 < size; i2++) {
            c3Arr[i2] = a((C1148z3) a32.f6498b.get(i2));
        }
        f3.f6777b = c3Arr;
        return f3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A3 toModel(F3 f3) {
        C3 c32 = f3.f6776a;
        if (c32 == null) {
            c32 = new C3();
        }
        C1148z3 a6 = a(c32);
        C3[] c3Arr = f3.f6777b;
        ArrayList arrayList = new ArrayList(c3Arr.length);
        for (C3 c33 : c3Arr) {
            arrayList.add(a(c33));
        }
        return new A3(a6, arrayList);
    }

    public static C3 a(C1148z3 c1148z3) {
        E3 e3;
        C3 c32 = new C3();
        Map map = c1148z3.f9617a;
        int i2 = 0;
        if (map != null) {
            e3 = new E3();
            int size = map.size();
            D3[] d3Arr = new D3[size];
            for (int i3 = 0; i3 < size; i3++) {
                d3Arr[i3] = new D3();
            }
            e3.f6721a = d3Arr;
            int i6 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                D3 d32 = e3.f6721a[i6];
                d32.f6664a = str;
                d32.f6665b = str2;
                i6++;
            }
        } else {
            e3 = null;
        }
        c32.f6617a = e3;
        int ordinal = c1148z3.f9618b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i2 = 2;
                if (ordinal != 2) {
                    i2 = 3;
                    if (ordinal != 3) {
                        throw new C1.b();
                    }
                }
            } else {
                i2 = 1;
            }
        }
        c32.f6618b = i2;
        return c32;
    }

    public static C1148z3 a(C3 c32) {
        LinkedHashMap linkedHashMap;
        Y7 y7;
        E3 e3 = c32.f6617a;
        if (e3 != null) {
            D3[] d3Arr = e3.f6721a;
            int W5 = AbstractC0476u.W(d3Arr.length);
            if (W5 < 16) {
                W5 = 16;
            }
            linkedHashMap = new LinkedHashMap(W5);
            for (D3 d32 : d3Arr) {
                linkedHashMap.put(d32.f6664a, d32.f6665b);
            }
        } else {
            linkedHashMap = null;
        }
        int i2 = c32.f6618b;
        if (i2 == 0) {
            y7 = Y7.f7729b;
        } else if (i2 == 1) {
            y7 = Y7.f7730c;
        } else if (i2 == 2) {
            y7 = Y7.f7731d;
        } else if (i2 != 3) {
            y7 = Y7.f7729b;
        } else {
            y7 = Y7.f7732e;
        }
        return new C1148z3(linkedHashMap, y7);
    }
}
