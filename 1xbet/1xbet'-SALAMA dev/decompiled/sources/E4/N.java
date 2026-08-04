package E4;

import A1.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f2149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2150b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H4.i f2152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p075k4.e f2153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p075k4.e f2154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p075k4.e f2155g;

    public N(C c3, p075k4.e eVar) {
        this.f2149a = c3;
        this.f2152d = new H4.i(H4.g.f3315a, new p075k4.e(Collections.emptyList(), new M(c3.a(), 1)));
        this.f2153e = eVar;
        p075k4.e eVar2 = H4.h.f3317c;
        this.f2154f = eVar2;
        this.f2155g = eVar2;
    }

    public static int b(C0173f c0173f) {
        int iOrdinal = c0173f.f2179a.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 2;
                }
                throw new IllegalArgumentException("Unknown change type: " + c0173f.f2179a);
            }
        }
        return i7;
    }

    public final P2 a(D3.j jVar, K4.z zVar, boolean z4) {
        List listEmptyList;
        H4.k kVar;
        O o7;
        p113p3.f.O("Cannot apply changes that need a refill", !jVar.f1724c, new Object[0]);
        H4.i iVar = this.f2152d;
        this.f2152d = (H4.i) jVar.f1723b;
        this.f2155g = (p075k4.e) jVar.f1726e;
        x0 x0Var = (x0) jVar.f1725d;
        x0Var.getClass();
        ArrayList arrayList = new ArrayList(((TreeMap) x0Var.f613b).values());
        Collections.sort(arrayList, new M(this, 0));
        if (zVar != null) {
            Iterator it = zVar.f4081c.iterator();
            while (true) {
                E3.F f7 = (E3.F) it;
                if (!((Iterator) f7.f1994b).hasNext()) {
                    break;
                }
                this.f2153e = this.f2153e.l((H4.h) f7.next());
            }
            Iterator it2 = zVar.f4082d.iterator();
            while (true) {
                E3.F f8 = (E3.F) it2;
                if (!((Iterator) f8.f1994b).hasNext()) {
                    break;
                }
                H4.h hVar = (H4.h) f8.next();
                p113p3.f.O("Modified document %s not found in view.", this.f2153e.f14781a.l(hVar), hVar);
            }
            Iterator it3 = zVar.f4083e.iterator();
            while (true) {
                E3.F f9 = (E3.F) it3;
                if (!((Iterator) f9.f1994b).hasNext()) {
                    break;
                }
                this.f2153e = this.f2153e.t((H4.h) f9.next());
            }
            this.f2151c = zVar.f4080b;
        }
        if (!z4 && this.f2151c) {
            p075k4.e eVar = this.f2154f;
            this.f2154f = H4.h.f3317c;
            Iterator it4 = this.f2152d.f3320b.iterator();
            while (true) {
                E3.F f10 = (E3.F) it4;
                if (!((Iterator) f10.f1994b).hasNext()) {
                    break;
                }
                H4.k kVar2 = (H4.k) f10.next();
                H4.h hVar2 = kVar2.f3323a;
                if (!this.f2153e.f14781a.l(hVar2) && (kVar = (H4.k) this.f2152d.f3319a.m(hVar2)) != null && !kVar.c()) {
                    this.f2154f = this.f2154f.l(kVar2.f3323a);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f2154f.f14781a.size() + eVar.f14781a.size());
            Iterator it5 = eVar.iterator();
            while (true) {
                E3.F f11 = (E3.F) it5;
                if (!((Iterator) f11.f1994b).hasNext()) {
                    break;
                }
                H4.h hVar3 = (H4.h) f11.next();
                if (!this.f2154f.f14781a.l(hVar3)) {
                    arrayList2.add(new x(w.f2243b, hVar3));
                }
            }
            Iterator it6 = this.f2154f.iterator();
            while (true) {
                E3.F f12 = (E3.F) it6;
                if (!((Iterator) f12.f1994b).hasNext()) {
                    break;
                }
                H4.h hVar4 = (H4.h) f12.next();
                if (!eVar.f14781a.l(hVar4)) {
                    arrayList2.add(new x(w.f2242a, hVar4));
                }
            }
            listEmptyList = arrayList2;
        } else {
            listEmptyList = Collections.emptyList();
        }
        int i7 = (this.f2154f.f14781a.size() == 0 && this.f2151c && !z4) ? 3 : 2;
        boolean z7 = i7 != this.f2150b;
        this.f2150b = i7;
        if (arrayList.size() != 0 || z7) {
            o7 = new O(this.f2149a, (H4.i) jVar.f1723b, iVar, arrayList, i7 == 2, (p075k4.e) jVar.f1726e, z7, false, (zVar == null || zVar.f4079a.isEmpty()) ? false : true);
        } else {
            o7 = null;
        }
        return new P2(7, o7, listEmptyList, false);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x014c A[PHI: r14
      0x014c: PHI (r14v4 char) = (r14v2 char), (r14v2 char), (r14v12 char), (r14v12 char) binds: [B:77:0x0148, B:78:0x014a, B:64:0x011a, B:61:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x014f A[PHI: r14
      0x014f: PHI (r14v7 char) = (r14v2 char), (r14v2 char), (r14v10 char), (r14v13 char) binds: [B:74:0x013c, B:75:0x013e, B:67:0x011e, B:55:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    public final D3.j c(p075k4.c cVar, D3.j jVar) {
        EnumC0172e enumC0172e;
        char c3;
        boolean z4;
        H4.i iVarL;
        N n2 = this;
        x0 x0Var = jVar != null ? (x0) jVar.f1725d : new x0(3);
        H4.i iVar = jVar != null ? (H4.i) jVar.f1723b : n2.f2152d;
        p075k4.e eVarT = jVar != null ? (p075k4.e) jVar.f1726e : n2.f2155g;
        C c4 = n2.f2149a;
        int i7 = c4.f2098i;
        boolean zB = p136t.e.b(i7, 1);
        long j = c4.f2097h;
        H4.k kVar = (zB && ((long) iVar.f3319a.size()) == j) ? (H4.k) iVar.f3320b.f14781a.y() : null;
        H4.k kVar2 = (p136t.e.b(i7, 2) && ((long) iVar.f3319a.size()) == j) ? (H4.k) iVar.f3320b.f14781a.z() : null;
        Iterator it = cVar.iterator();
        H4.i iVar2 = iVar;
        boolean z7 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0172e = EnumC0172e.f2174a;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            H4.h hVar = (H4.h) entry.getKey();
            H4.k kVar3 = (H4.k) iVar.f3319a.m(hVar);
            H4.i iVar3 = iVar;
            H4.k kVar4 = c4.g((H4.k) entry.getValue()) ? (H4.k) entry.getValue() : null;
            Iterator it2 = it;
            boolean z8 = kVar3 != null && n2.f2155g.f14781a.l(kVar3.f3323a);
            boolean z9 = kVar4 != null && (kVar4.c() || (n2.f2155g.f14781a.l(kVar4.f3323a) && p136t.e.b(kVar4.f3328f, 2)));
            if (kVar3 == null || kVar4 == null) {
                c3 = 2;
                if (kVar3 == null && kVar4 != null) {
                    x0Var.n(new C0173f(EnumC0172e.f2175b, kVar4));
                } else if (kVar3 == null || kVar4 != null) {
                    z4 = false;
                } else {
                    x0Var.n(new C0173f(enumC0172e, kVar3));
                    if (kVar != null || kVar2 != null) {
                        z4 = true;
                        z7 = true;
                    }
                }
                z4 = true;
            } else if (kVar3.f3327e.equals(kVar4.f3327e)) {
                c3 = 2;
                if (z8 != z9) {
                    x0Var.n(new C0173f(EnumC0172e.f2177d, kVar4));
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                if (kVar3.c()) {
                    c3 = 2;
                    if (p136t.e.b(kVar4.f3328f, 2) && !kVar4.c()) {
                        z4 = false;
                    }
                } else {
                    c3 = 2;
                }
                x0Var.n(new C0173f(EnumC0172e.f2176c, kVar4));
                if ((kVar == null || c4.a().compare(kVar4, kVar) <= 0) && (kVar2 == null || c4.a().compare(kVar4, kVar2) >= 0)) {
                    z4 = true;
                } else {
                    z4 = true;
                    z7 = true;
                }
            }
            if (!z4) {
                iVarL = iVar2;
            } else if (kVar4 != null) {
                iVar2.getClass();
                H4.h hVar2 = kVar4.f3323a;
                H4.i iVarL2 = iVar2.l(hVar2);
                iVarL = new H4.i(iVarL2.f3319a.D(hVar2, kVar4), iVarL2.f3320b.l(kVar4));
                eVarT = kVar4.c() ? eVarT.l(hVar2) : eVarT.t(hVar2);
            } else {
                iVarL = iVar2.l(hVar);
                eVarT = eVarT.t(hVar);
            }
            n2 = this;
            iVar2 = iVarL;
            it = it2;
            iVar = iVar3;
        }
        H4.i iVarL3 = iVar2;
        if (j != -1) {
            long size = iVarL3.f3319a.size();
            while (true) {
                size -= j;
                if (size <= 0) {
                    break;
                }
                boolean zB2 = p136t.e.b(i7, 1);
                p075k4.e eVar = iVarL3.f3320b;
                H4.k kVar5 = (H4.k) (zB2 ? eVar.f14781a.y() : eVar.f14781a.z());
                iVarL3 = iVarL3.l(kVar5.f3323a);
                eVarT = eVarT.t(kVar5.f3323a);
                x0Var.n(new C0173f(enumC0172e, kVar5));
                j = 1;
            }
        }
        p113p3.f.O("View was refilled using docs that themselves needed refilling.", !z7 || jVar == null, new Object[0]);
        return new D3.j(iVarL3, x0Var, eVarT, z7);
    }
}
