package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f4963a = new java.util.ArrayList();

    public final synchronized java.util.List a() {
        java.util.ArrayList arrayList;
        try {
            java.util.ArrayList arrayList2 = this.f4963a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList2));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((io.appmetrica.analytics.impl.Rc) it.next()).a());
            }
            arrayList = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                java.lang.Object next = it2.next();
                if (((java.lang.String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return i1.AbstractC0190i.X(i1.AbstractC0190i.a0(arrayList));
    }

    public final synchronized void a(io.appmetrica.analytics.impl.Rc... rcArr) {
        i1.AbstractC0196o.L(this.f4963a, rcArr);
    }
}
