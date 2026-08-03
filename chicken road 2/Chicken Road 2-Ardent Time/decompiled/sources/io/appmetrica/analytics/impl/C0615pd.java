package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615pd implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0829xk f6649a = io.appmetrica.analytics.impl.C0560na.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0701sm[] fromModel(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        io.appmetrica.analytics.impl.C0701sm c0701sm;
        java.util.Map<java.lang.String, io.appmetrica.analytics.impl.Yc> c2 = this.f6649a.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            io.appmetrica.analytics.impl.Yc yc = c2.get(key);
            if (yc == null || value == null) {
                c0701sm = null;
            } else {
                c0701sm = new io.appmetrica.analytics.impl.C0701sm();
                c0701sm.f6825a = key;
                c0701sm.f6826b = (byte[]) yc.f5340c.fromModel(value);
            }
            if (c0701sm != null) {
                arrayList.add(c0701sm);
            }
        }
        java.lang.Object[] array = arrayList.toArray(new io.appmetrica.analytics.impl.C0701sm[0]);
        if (array != null) {
            return (io.appmetrica.analytics.impl.C0701sm[]) array;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.Map<java.lang.String, java.lang.Object> toModel(io.appmetrica.analytics.impl.C0701sm[] c0701smArr) {
        java.util.Map<java.lang.String, io.appmetrica.analytics.impl.Yc> c2 = this.f6649a.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.appmetrica.analytics.impl.C0701sm c0701sm : c0701smArr) {
            io.appmetrica.analytics.impl.Yc yc = c2.get(c0701sm.f6825a);
            h1.C0172d c0172d = yc != null ? new h1.C0172d(c0701sm.f6825a, yc.f5340c.toModel(c0701sm.f6826b)) : null;
            if (c0172d != null) {
                arrayList.add(c0172d);
            }
        }
        return i1.AbstractC0202u.J(arrayList);
    }
}
