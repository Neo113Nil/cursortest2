package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553n3 implements io.appmetrica.analytics.impl.InterfaceC0264bo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0264bo, s1.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.impl.C0656r3> invoke(java.util.List<io.appmetrica.analytics.impl.C0656r3> list, io.appmetrica.analytics.impl.C0656r3 c0656r3) {
        if (list == null || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                io.appmetrica.analytics.impl.S7 s7 = ((io.appmetrica.analytics.impl.C0656r3) it.next()).f6716b;
                io.appmetrica.analytics.impl.S7 s72 = c0656r3.f6716b;
                if (s7 == s72) {
                    if (s72 != io.appmetrica.analytics.impl.S7.f4954c) {
                        return null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (((io.appmetrica.analytics.impl.C0656r3) obj).f6716b != io.appmetrica.analytics.impl.S7.f4954c) {
                            arrayList.add(obj);
                        }
                    }
                    return i1.AbstractC0190i.S(arrayList, c0656r3);
                }
            }
        }
        return i1.AbstractC0190i.S(list, c0656r3);
    }
}
