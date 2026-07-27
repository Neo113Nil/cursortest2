package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class B3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F3 fromModel(A3 a3) {
        F3 f3 = new F3();
        f3.f5933a = a(a3.f5668a);
        int size = a3.f5669b.size();
        C3[] c3Arr = new C3[size];
        for (int i3 = 0; i3 < size; i3++) {
            c3Arr[i3] = a((C0999z3) a3.f5669b.get(i3));
        }
        f3.f5934b = c3Arr;
        return f3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A3 toModel(F3 f3) {
        C3 c3 = f3.f5933a;
        if (c3 == null) {
            c3 = new C3();
        }
        C0999z3 a3 = a(c3);
        C3[] c3Arr = f3.f5934b;
        ArrayList arrayList = new ArrayList(c3Arr.length);
        for (C3 c32 : c3Arr) {
            arrayList.add(a(c32));
        }
        return new A3(a3, arrayList);
    }

    public static C3 a(C0999z3 c0999z3) {
        E3 e3;
        C3 c3 = new C3();
        Map map = c0999z3.f8657a;
        int i3 = 0;
        if (map != null) {
            e3 = new E3();
            int size = map.size();
            D3[] d3Arr = new D3[size];
            for (int i4 = 0; i4 < size; i4++) {
                d3Arr[i4] = new D3();
            }
            e3.f5881a = d3Arr;
            int i5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                D3 d3 = e3.f5881a[i5];
                d3.f5828a = str;
                d3.f5829b = str2;
                i5++;
            }
        } else {
            e3 = null;
        }
        c3.f5783a = e3;
        int ordinal = c0999z3.f8658b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i3 = 2;
                if (ordinal != 2) {
                    i3 = 3;
                    if (ordinal != 3) {
                        throw new T0.b();
                    }
                }
            } else {
                i3 = 1;
            }
        }
        c3.f5784b = i3;
        return c3;
    }

    public static C0999z3 a(C3 c3) {
        LinkedHashMap linkedHashMap;
        Y7 y7;
        E3 e3 = c3.f5783a;
        if (e3 != null) {
            D3[] d3Arr = e3.f5881a;
            int j02 = e2.s.j0(d3Arr.length);
            if (j02 < 16) {
                j02 = 16;
            }
            linkedHashMap = new LinkedHashMap(j02);
            for (D3 d3 : d3Arr) {
                linkedHashMap.put(d3.f5828a, d3.f5829b);
            }
        } else {
            linkedHashMap = null;
        }
        int i3 = c3.f5784b;
        if (i3 == 0) {
            y7 = Y7.f6853b;
        } else if (i3 == 1) {
            y7 = Y7.f6854c;
        } else if (i3 == 2) {
            y7 = Y7.f6855d;
        } else if (i3 != 3) {
            y7 = Y7.f6853b;
        } else {
            y7 = Y7.f6856e;
        }
        return new C0999z3(linkedHashMap, y7);
    }
}
