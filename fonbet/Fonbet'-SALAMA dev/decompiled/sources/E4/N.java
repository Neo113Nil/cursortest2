package E4;

import A1.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k4.AbstractC1341c;
import k4.C1343e;
import w1.P2;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final C f2149a;

    /* renamed from: b, reason: collision with root package name */
    public int f2150b = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2151c;

    /* renamed from: d, reason: collision with root package name */
    public H4.i f2152d;

    /* renamed from: e, reason: collision with root package name */
    public C1343e f2153e;

    /* renamed from: f, reason: collision with root package name */
    public C1343e f2154f;

    /* renamed from: g, reason: collision with root package name */
    public C1343e f2155g;

    public N(C c3, C1343e c1343e) {
        this.f2149a = c3;
        this.f2152d = new H4.i(H4.g.f3315a, new C1343e(Collections.emptyList(), new M(c3.a(), 1)));
        this.f2153e = c1343e;
        C1343e c1343e2 = H4.h.f3317c;
        this.f2154f = c1343e2;
        this.f2155g = c1343e2;
    }

    public static int b(C0173f c0173f) {
        int ordinal = c0173f.f2179a.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (ordinal != 1) {
            i7 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 2;
                }
                throw new IllegalArgumentException("Unknown change type: " + c0173f.f2179a);
            }
        }
        return i7;
    }

    public final P2 a(D3.j jVar, K4.z zVar, boolean z4) {
        List list;
        H4.k kVar;
        O o7;
        p3.f.O("Cannot apply changes that need a refill", !jVar.f1724c, new Object[0]);
        H4.i iVar = this.f2152d;
        this.f2152d = (H4.i) jVar.f1723b;
        this.f2155g = (C1343e) jVar.f1726e;
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
                p3.f.O("Modified document %s not found in view.", this.f2153e.f14775a.l(hVar), hVar);
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
        if (z4) {
            list = Collections.emptyList();
        } else if (this.f2151c) {
            C1343e c1343e = this.f2154f;
            this.f2154f = H4.h.f3317c;
            Iterator it4 = this.f2152d.f3320b.iterator();
            while (true) {
                E3.F f10 = (E3.F) it4;
                if (!((Iterator) f10.f1994b).hasNext()) {
                    break;
                }
                H4.k kVar2 = (H4.k) f10.next();
                H4.h hVar2 = kVar2.f3323a;
                if (!this.f2153e.f14775a.l(hVar2) && (kVar = (H4.k) this.f2152d.f3319a.m(hVar2)) != null && !kVar.c()) {
                    this.f2154f = this.f2154f.l(kVar2.f3323a);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f2154f.f14775a.size() + c1343e.f14775a.size());
            Iterator it5 = c1343e.iterator();
            while (true) {
                E3.F f11 = (E3.F) it5;
                if (!((Iterator) f11.f1994b).hasNext()) {
                    break;
                }
                H4.h hVar3 = (H4.h) f11.next();
                if (!this.f2154f.f14775a.l(hVar3)) {
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
                if (!c1343e.f14775a.l(hVar4)) {
                    arrayList2.add(new x(w.f2242a, hVar4));
                }
            }
            list = arrayList2;
        } else {
            list = Collections.emptyList();
        }
        int i7 = (this.f2154f.f14775a.size() == 0 && this.f2151c && !z4) ? 3 : 2;
        boolean z7 = i7 != this.f2150b;
        this.f2150b = i7;
        if (arrayList.size() != 0 || z7) {
            o7 = new O(this.f2149a, (H4.i) jVar.f1723b, iVar, arrayList, i7 == 2, (C1343e) jVar.f1726e, z7, false, (zVar == null || zVar.f4079a.isEmpty()) ? false : true);
        } else {
            o7 = null;
        }
        return new P2(7, o7, list, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        if (r3.c() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
    
        if (r5.a().compare(r3, r8) > 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
    
        if (r5.a().compare(r3, r13) < 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014a, code lost:
    
        if (r13 == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D3.j c(AbstractC1341c abstractC1341c, D3.j jVar) {
        EnumC0172e enumC0172e;
        char c3;
        boolean z4;
        H4.i iVar;
        N n2 = this;
        x0 x0Var = jVar != null ? (x0) jVar.f1725d : new x0(3);
        H4.i iVar2 = jVar != null ? (H4.i) jVar.f1723b : n2.f2152d;
        C1343e c1343e = jVar != null ? (C1343e) jVar.f1726e : n2.f2155g;
        C c4 = n2.f2149a;
        int i7 = c4.f2098i;
        boolean b7 = t.e.b(i7, 1);
        long j = c4.f2097h;
        H4.k kVar = (b7 && ((long) iVar2.f3319a.size()) == j) ? (H4.k) iVar2.f3320b.f14775a.y() : null;
        H4.k kVar2 = (t.e.b(i7, 2) && ((long) iVar2.f3319a.size()) == j) ? (H4.k) iVar2.f3320b.f14775a.z() : null;
        Iterator it = abstractC1341c.iterator();
        H4.i iVar3 = iVar2;
        boolean z7 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0172e = EnumC0172e.f2174a;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            H4.h hVar = (H4.h) entry.getKey();
            H4.k kVar3 = (H4.k) iVar2.f3319a.m(hVar);
            H4.i iVar4 = iVar2;
            H4.k kVar4 = c4.g((H4.k) entry.getValue()) ? (H4.k) entry.getValue() : null;
            Iterator it2 = it;
            boolean z8 = kVar3 != null && n2.f2155g.f14775a.l(kVar3.f3323a);
            boolean z9 = kVar4 != null && (kVar4.c() || (n2.f2155g.f14775a.l(kVar4.f3323a) && t.e.b(kVar4.f3328f, 2)));
            if (kVar3 == null || kVar4 == null) {
                c3 = 2;
                if (kVar3 != null || kVar4 == null) {
                    if (kVar3 != null && kVar4 == null) {
                        x0Var.n(new C0173f(enumC0172e, kVar3));
                        if (kVar == null) {
                        }
                        z4 = true;
                        z7 = true;
                    }
                    z4 = false;
                } else {
                    x0Var.n(new C0173f(EnumC0172e.f2175b, kVar4));
                }
                z4 = true;
            } else if (kVar3.f3327e.equals(kVar4.f3327e)) {
                c3 = 2;
                if (z8 != z9) {
                    x0Var.n(new C0173f(EnumC0172e.f2177d, kVar4));
                    z4 = true;
                }
                z4 = false;
            } else {
                if (kVar3.c()) {
                    c3 = 2;
                    if (t.e.b(kVar4.f3328f, 2)) {
                    }
                } else {
                    c3 = 2;
                }
                x0Var.n(new C0173f(EnumC0172e.f2176c, kVar4));
                if (kVar != null) {
                }
                if (kVar2 != null) {
                }
                z4 = true;
            }
            if (!z4) {
                iVar = iVar3;
            } else if (kVar4 != null) {
                iVar3.getClass();
                H4.h hVar2 = kVar4.f3323a;
                H4.i l7 = iVar3.l(hVar2);
                iVar = new H4.i(l7.f3319a.D(hVar2, kVar4), l7.f3320b.l(kVar4));
                c1343e = kVar4.c() ? c1343e.l(hVar2) : c1343e.t(hVar2);
            } else {
                iVar = iVar3.l(hVar);
                c1343e = c1343e.t(hVar);
            }
            n2 = this;
            iVar3 = iVar;
            it = it2;
            iVar2 = iVar4;
        }
        H4.i iVar5 = iVar3;
        if (j != -1) {
            long size = iVar5.f3319a.size();
            while (true) {
                size -= j;
                if (size <= 0) {
                    break;
                }
                boolean b8 = t.e.b(i7, 1);
                C1343e c1343e2 = iVar5.f3320b;
                H4.k kVar5 = (H4.k) (b8 ? c1343e2.f14775a.y() : c1343e2.f14775a.z());
                iVar5 = iVar5.l(kVar5.f3323a);
                c1343e = c1343e.t(kVar5.f3323a);
                x0Var.n(new C0173f(enumC0172e, kVar5));
                j = 1;
            }
        }
        p3.f.O("View was refilled using docs that themselves needed refilling.", !z7 || jVar == null, new Object[0]);
        return new D3.j(iVar5, x0Var, c1343e, z7);
    }
}
