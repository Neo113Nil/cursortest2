package v4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n4.C1473g;
import p6.AbstractC1539a;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final C1473g f17200a;

    /* renamed from: b, reason: collision with root package name */
    public final C1473g f17201b;

    /* renamed from: c, reason: collision with root package name */
    public final r f17202c;

    public u(l4.t tVar) {
        ArrayList arrayList = tVar.f15009a;
        this.f17200a = arrayList != null ? new C1473g(arrayList) : null;
        ArrayList arrayList2 = tVar.f15010b;
        this.f17201b = arrayList2 != null ? new C1473g(arrayList2) : null;
        this.f17202c = AbstractC1539a.a(tVar.f15011c, j.f17184e);
    }

    public final r a(C1473g c1473g, r rVar, r rVar2) {
        boolean z4 = true;
        C1473g c1473g2 = this.f17200a;
        int compareTo = c1473g2 == null ? 1 : c1473g.compareTo(c1473g2);
        C1473g c1473g3 = this.f17201b;
        int compareTo2 = c1473g3 == null ? -1 : c1473g.compareTo(c1473g3);
        boolean z7 = c1473g2 != null && c1473g.z(c1473g2);
        boolean z8 = c1473g3 != null && c1473g.z(c1473g3);
        if (compareTo > 0 && compareTo2 < 0 && !z8) {
            return rVar2;
        }
        if (compareTo > 0 && z8 && rVar2.r()) {
            return rVar2;
        }
        if (compareTo > 0 && compareTo2 == 0) {
            q4.k.c(z8);
            q4.k.c(!rVar2.r());
            return rVar.r() ? j.f17184e : rVar;
        }
        if (!z7 && !z8) {
            if (compareTo2 <= 0 && compareTo > 0) {
                z4 = false;
            }
            q4.k.c(z4);
            return rVar;
        }
        HashSet hashSet = new HashSet();
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((p) it.next()).f17195a);
        }
        Iterator it2 = rVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((p) it2.next()).f17195a);
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!rVar2.e().isEmpty() || !rVar.e().isEmpty()) {
            arrayList.add(c.f17171d);
        }
        Iterator it3 = arrayList.iterator();
        r rVar3 = rVar;
        while (it3.hasNext()) {
            c cVar = (c) it3.next();
            r o7 = rVar.o(cVar);
            r a2 = a(c1473g.t(cVar), rVar.o(cVar), rVar2.o(cVar));
            if (a2 != o7) {
                rVar3 = rVar3.s(cVar, a2);
            }
        }
        return rVar3;
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f17200a + ", optInclusiveEnd=" + this.f17201b + ", snap=" + this.f17202c + '}';
    }
}
