package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708t3 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0812x3 fromModel(io.appmetrica.analytics.impl.C0682s3 c0682s3) {
        io.appmetrica.analytics.impl.C0812x3 c0812x3 = new io.appmetrica.analytics.impl.C0812x3();
        c0812x3.f7080a = a(c0682s3.f6789a);
        int size = c0682s3.f6790b.size();
        io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr = new io.appmetrica.analytics.impl.C0734u3[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0734u3Arr[i2] = a((io.appmetrica.analytics.impl.C0656r3) c0682s3.f6790b.get(i2));
        }
        c0812x3.f7081b = c0734u3Arr;
        return c0812x3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0682s3 toModel(io.appmetrica.analytics.impl.C0812x3 c0812x3) {
        io.appmetrica.analytics.impl.C0734u3 c0734u3 = c0812x3.f7080a;
        if (c0734u3 == null) {
            c0734u3 = new io.appmetrica.analytics.impl.C0734u3();
        }
        io.appmetrica.analytics.impl.C0656r3 a2 = a(c0734u3);
        io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr = c0812x3.f7081b;
        java.util.ArrayList arrayList = new java.util.ArrayList(c0734u3Arr.length);
        for (io.appmetrica.analytics.impl.C0734u3 c0734u32 : c0734u3Arr) {
            arrayList.add(a(c0734u32));
        }
        return new io.appmetrica.analytics.impl.C0682s3(a2, arrayList);
    }

    public static io.appmetrica.analytics.impl.C0734u3 a(io.appmetrica.analytics.impl.C0656r3 c0656r3) {
        io.appmetrica.analytics.impl.C0786w3 c0786w3;
        io.appmetrica.analytics.impl.C0734u3 c0734u3 = new io.appmetrica.analytics.impl.C0734u3();
        java.util.Map map = c0656r3.f6715a;
        int i2 = 0;
        if (map != null) {
            c0786w3 = new io.appmetrica.analytics.impl.C0786w3();
            int size = map.size();
            io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr = new io.appmetrica.analytics.impl.C0760v3[size];
            for (int i3 = 0; i3 < size; i3++) {
                c0760v3Arr[i3] = new io.appmetrica.analytics.impl.C0760v3();
            }
            c0786w3.f6998a = c0760v3Arr;
            int i4 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                io.appmetrica.analytics.impl.C0760v3 c0760v3 = c0786w3.f6998a[i4];
                c0760v3.f6946a = str;
                c0760v3.f6947b = str2;
                i4++;
            }
        } else {
            c0786w3 = null;
        }
        c0734u3.f6873a = c0786w3;
        int ordinal = c0656r3.f6716b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i2 = 2;
                if (ordinal != 2) {
                    i2 = 3;
                    if (ordinal != 3) {
                        throw new E1.A();
                    }
                }
            } else {
                i2 = 1;
            }
        }
        c0734u3.f6874b = i2;
        return c0734u3;
    }

    public static io.appmetrica.analytics.impl.C0656r3 a(io.appmetrica.analytics.impl.C0734u3 c0734u3) {
        java.util.LinkedHashMap linkedHashMap;
        io.appmetrica.analytics.impl.S7 s7;
        io.appmetrica.analytics.impl.C0786w3 c0786w3 = c0734u3.f6873a;
        if (c0786w3 != null) {
            io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr = c0786w3.f6998a;
            int E2 = i1.AbstractC0203v.E(c0760v3Arr.length);
            if (E2 < 16) {
                E2 = 16;
            }
            linkedHashMap = new java.util.LinkedHashMap(E2);
            for (io.appmetrica.analytics.impl.C0760v3 c0760v3 : c0760v3Arr) {
                linkedHashMap.put(c0760v3.f6946a, c0760v3.f6947b);
            }
        } else {
            linkedHashMap = null;
        }
        int i2 = c0734u3.f6874b;
        if (i2 == 0) {
            s7 = io.appmetrica.analytics.impl.S7.f4953b;
        } else if (i2 == 1) {
            s7 = io.appmetrica.analytics.impl.S7.f4954c;
        } else if (i2 == 2) {
            s7 = io.appmetrica.analytics.impl.S7.f4955d;
        } else if (i2 != 3) {
            s7 = io.appmetrica.analytics.impl.S7.f4953b;
        } else {
            s7 = io.appmetrica.analytics.impl.S7.f4956e;
        }
        return new io.appmetrica.analytics.impl.C0656r3(linkedHashMap, s7);
    }
}
