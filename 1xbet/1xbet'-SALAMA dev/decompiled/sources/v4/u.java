package v4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p098n4.C0934g;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0934g f17206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0934g f17207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f17208c;

    public u(p083l4.t tVar) {
        ArrayList arrayList = tVar.f15015a;
        this.f17206a = arrayList != null ? new C0934g(arrayList) : null;
        ArrayList arrayList2 = tVar.f15016b;
        this.f17207b = arrayList2 != null ? new C0934g(arrayList2) : null;
        this.f17208c = p115p6.a.a(tVar.f15017c, j.f17190e);
    }

    public final r a(C0934g c0934g, r rVar, r rVar2) {
        boolean z4 = true;
        C0934g c0934g2 = this.f17206a;
        int iCompareTo = c0934g2 == null ? 1 : c0934g.compareTo(c0934g2);
        C0934g c0934g3 = this.f17207b;
        int iCompareTo2 = c0934g3 == null ? -1 : c0934g.compareTo(c0934g3);
        boolean z7 = c0934g2 != null && c0934g.z(c0934g2);
        boolean z8 = c0934g3 != null && c0934g.z(c0934g3);
        if (iCompareTo > 0 && iCompareTo2 < 0 && !z8) {
            return rVar2;
        }
        if (iCompareTo > 0 && z8 && rVar2.r()) {
            return rVar2;
        }
        if (iCompareTo > 0 && iCompareTo2 == 0) {
            p120q4.k.c(z8);
            p120q4.k.c(!rVar2.r());
            return rVar.r() ? j.f17190e : rVar;
        }
        if (!z7 && !z8) {
            if (iCompareTo2 <= 0 && iCompareTo > 0) {
                z4 = false;
            }
            p120q4.k.c(z4);
            return rVar;
        }
        HashSet hashSet = new HashSet();
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((p) it.next()).f17201a);
        }
        Iterator it2 = rVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((p) it2.next()).f17201a);
        }
        ArrayList<c> arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!rVar2.e().isEmpty() || !rVar.e().isEmpty()) {
            arrayList.add(c.f17177d);
        }
        r rVarS = rVar;
        for (c cVar : arrayList) {
            r rVarO = rVar.o(cVar);
            r rVarA = a(c0934g.t(cVar), rVar.o(cVar), rVar2.o(cVar));
            if (rVarA != rVarO) {
                rVarS = rVarS.s(cVar, rVarA);
            }
        }
        return rVarS;
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f17206a + ", optInclusiveEnd=" + this.f17207b + ", snap=" + this.f17208c + '}';
    }
}
