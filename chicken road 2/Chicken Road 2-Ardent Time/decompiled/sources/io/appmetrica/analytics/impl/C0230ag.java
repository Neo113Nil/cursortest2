package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230ag implements io.appmetrica.analytics.impl.Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0333eg f5476a;

    public C0230ag(io.appmetrica.analytics.impl.C0333eg c0333eg) {
        this.f5476a = c0333eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        io.appmetrica.analytics.impl.C0333eg c0333eg = this.f5476a;
        java.util.ArrayList arrayList = c0333eg.f5851g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            io.appmetrica.analytics.impl.C0566ng c0566ng = (io.appmetrica.analytics.impl.C0566ng) next;
            c0333eg.f5847c.getClass();
            java.lang.String str = c0566ng != null ? c0566ng.f6533a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            java.lang.Object next2 = it2.next();
            if (next2 != null) {
                arrayList3.add(next2);
            }
        }
        c0333eg.a(c0333eg.f5847c.a(arrayList3));
    }
}
