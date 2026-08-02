package n4;

import G4.C0286t;
import g0.AbstractC1125g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import o4.C1509a;
import p4.InterfaceC1538a;
import s4.C1593a;
import s4.C1595c;
import t4.InterfaceC1610b;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15474a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1538a f15475b;

    public s(InterfaceC1538a interfaceC1538a) {
        this.f15475b = interfaceC1538a;
    }

    public final ArrayList a(AbstractC1125g abstractC1125g, com.google.android.gms.common.internal.w wVar, v4.r rVar) {
        s4.g gVar = ((o4.d) abstractC1125g.f13020b).f15608b;
        HashMap hashMap = this.f15474a;
        if (gVar != null) {
            s4.i iVar = (s4.i) hashMap.get(gVar);
            q4.k.c(iVar != null);
            return b(iVar, abstractC1125g, wVar, rVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((s4.i) ((Map.Entry) it.next()).getValue(), abstractC1125g, wVar, rVar));
        }
        return arrayList;
    }

    public final ArrayList b(s4.i iVar, AbstractC1125g abstractC1125g, com.google.android.gms.common.internal.w wVar, v4.r rVar) {
        C0286t c0286t;
        com.google.android.gms.common.internal.w b7;
        C1473g c1473g;
        C1473g c1473g2;
        q4.c cVar;
        C0286t c0286t2;
        iVar.getClass();
        int i7 = abstractC1125g.f13019a;
        if (i7 == 2 && ((o4.d) abstractC1125g.f13020b).f15608b != null) {
            q4.k.b("We should always have a full cache before handling merges", iVar.f16176c.D() != null);
            q4.k.b("Missing event cache, even though we have a server cache", iVar.f16176c.C() != null);
        }
        com.google.android.gms.common.internal.w wVar2 = iVar.f16176c;
        s4.j jVar = iVar.f16175b;
        jVar.getClass();
        C0286t c0286t3 = new C0286t(2);
        int e7 = t.e.e(i7);
        if (e7 == 0) {
            c0286t = c0286t3;
            o4.e eVar = (o4.e) abstractC1125g;
            o4.d dVar = (o4.d) eVar.f13020b;
            int i8 = dVar.f15607a;
            if (i8 == 1) {
                b7 = jVar.c(wVar2, (C1473g) eVar.f13021c, eVar.f15610d, wVar, rVar, c0286t);
            } else {
                q4.k.c(i8 == 2);
                b7 = jVar.b(wVar2, (C1473g) eVar.f13021c, eVar.f15610d, wVar, rVar, dVar.f15609c || (((C1593a) wVar2.f11336c).f16149c && !((C1473g) eVar.f13021c).isEmpty()), c0286t);
            }
        } else if (e7 != 1) {
            if (e7 == 2) {
                C1509a c1509a = (C1509a) abstractC1125g;
                boolean z4 = c1509a.f15602d;
                C1473g c1473g3 = (C1473g) c1509a.f13021c;
                if (z4) {
                    if (wVar.M(c1473g3) == null) {
                        android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(wVar, wVar2, rVar, 23);
                        C1593a c1593a = (C1593a) wVar2.f11335b;
                        boolean isEmpty = c1473g3.isEmpty();
                        InterfaceC1610b interfaceC1610b = jVar.f16180a;
                        C1593a c1593a2 = (C1593a) wVar2.f11336c;
                        M m7 = (M) wVar.f11336c;
                        C1473g c1473g4 = (C1473g) wVar.f11335b;
                        v4.l lVar = c1593a.f16147a;
                        boolean z7 = c1593a2.f16148b;
                        if (isEmpty || c1473g3.B().equals(v4.c.f17171d)) {
                            c0286t = c0286t3;
                            lVar = interfaceC1610b.C(lVar, new v4.l(z7 ? m7.a(c1473g4, wVar2.D(), Collections.emptyList(), false) : wVar.x(c1593a2.f16147a.f17186a), interfaceC1610b.N()), c0286t);
                        } else {
                            v4.c B7 = c1473g3.B();
                            v4.r w7 = wVar.w(B7, c1593a2);
                            v4.r o7 = (w7 == null && c1593a2.a(B7)) ? lVar.f17186a.o(B7) : w7;
                            if (o7 != null) {
                                c0286t2 = c0286t3;
                                lVar = interfaceC1610b.D(lVar, B7, o7, c1473g3.E(), tVar, c0286t2);
                            } else {
                                c0286t2 = c0286t3;
                                if (o7 == null && ((C1593a) wVar2.f11335b).f16147a.f17186a.i(B7)) {
                                    lVar = interfaceC1610b.D(lVar, B7, v4.j.f17184e, c1473g3.E(), tVar, c0286t2);
                                }
                            }
                            if (lVar.f17186a.isEmpty() && z7) {
                                v4.r a2 = m7.a(c1473g4, wVar2.D(), Collections.emptyList(), false);
                                if (a2.r()) {
                                    lVar = interfaceC1610b.C(lVar, new v4.l(a2, interfaceC1610b.N()), c0286t2);
                                }
                            }
                            c0286t = c0286t2;
                        }
                        b7 = wVar2.N(lVar, z7 || wVar.M(C1473g.f15415d) != null, interfaceC1610b.l());
                    }
                } else if (wVar.M(c1473g3) == null) {
                    C1593a c1593a3 = (C1593a) wVar2.f11336c;
                    q4.c cVar2 = c1509a.f15603e;
                    Object obj = cVar2.f15855a;
                    boolean z8 = c1593a3.f16149c;
                    v4.l lVar2 = c1593a3.f16147a;
                    if (obj == null) {
                        C1468b c1468b = C1468b.f15391b;
                        Iterator it = cVar2.iterator();
                        while (it.hasNext()) {
                            C1473g c1473g5 = (C1473g) ((Map.Entry) it.next()).getKey();
                            C1473g m8 = c1473g3.m(c1473g5);
                            if (c1593a3.b(m8)) {
                                c1468b = c1468b.l(c1473g5, lVar2.f17186a.g(m8));
                            }
                        }
                        b7 = jVar.a(wVar2, c1473g3, c1468b, wVar, rVar, z8, c0286t3);
                    } else if ((c1473g3.isEmpty() && c1593a3.f16148b) || c1593a3.b(c1473g3)) {
                        b7 = jVar.b(wVar2, c1473g3, lVar2.f17186a.g(c1473g3), wVar, rVar, z8, c0286t3);
                    } else if (c1473g3.isEmpty()) {
                        C1468b c1468b2 = C1468b.f15391b;
                        C1468b c1468b3 = c1468b2;
                        for (v4.p pVar : lVar2.f17186a) {
                            v4.c cVar3 = pVar.f17195a;
                            c1468b3.getClass();
                            c1468b3 = c1468b3.l(new C1473g(cVar3), pVar.f17196b);
                        }
                        b7 = jVar.a(wVar2, c1473g3, c1468b3, wVar, rVar, z8, c0286t3);
                    }
                }
                b7 = wVar2;
            } else {
                if (e7 != 3) {
                    throw new AssertionError("Unknown operation: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "ListenComplete" : "AckUserWrite" : "Merge" : "Overwrite"));
                }
                C1593a c1593a4 = (C1593a) wVar2.f11336c;
                boolean z9 = c1593a4.f16148b;
                C1473g c1473g6 = (C1473g) abstractC1125g.f13021c;
                b7 = jVar.d(new com.google.android.gms.common.internal.w(18, (C1593a) wVar2.f11335b, new C1593a(c1593a4.f16147a, z9 || c1473g6.isEmpty(), c1593a4.f16149c)), c1473g6, wVar, s4.j.f16179b, c0286t3);
            }
            c0286t = c0286t3;
        } else {
            c0286t = c0286t3;
            o4.c cVar4 = (o4.c) abstractC1125g;
            o4.d dVar2 = (o4.d) cVar4.f13020b;
            int i9 = dVar2.f15607a;
            if (i9 == 1) {
                C1468b c1468b4 = cVar4.f15604d;
                q4.k.b("Can't have a merge that is an overwrite", ((v4.r) c1468b4.f15392a.f15855a) == null);
                q4.c cVar5 = c1468b4.f15392a;
                Iterator it2 = cVar5.iterator();
                com.google.android.gms.common.internal.w wVar3 = wVar2;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    c1473g = (C1473g) cVar4.f13021c;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    C1473g m9 = c1473g.m((C1473g) entry.getKey());
                    if (((C1593a) wVar2.f11335b).a(m9.B())) {
                        cVar = cVar5;
                        wVar3 = jVar.c(wVar3, m9, (v4.r) entry.getValue(), wVar, rVar, c0286t);
                    } else {
                        cVar = cVar5;
                    }
                    cVar5 = cVar;
                }
                Iterator it3 = cVar5.iterator();
                while (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    C1473g m10 = c1473g.m((C1473g) entry2.getKey());
                    if (((C1593a) wVar2.f11335b).a(m10.B())) {
                        c1473g2 = c1473g;
                    } else {
                        c1473g2 = c1473g;
                        wVar3 = jVar.c(wVar3, m10, (v4.r) entry2.getValue(), wVar, rVar, c0286t);
                    }
                    c1473g = c1473g2;
                }
                b7 = wVar3;
            } else {
                q4.k.c(i9 == 2);
                b7 = jVar.a(wVar2, (C1473g) cVar4.f13021c, cVar4.f15604d, wVar, rVar, dVar2.f15609c || ((C1593a) wVar2.f11336c).f16149c, c0286t);
            }
        }
        ArrayList arrayList = new ArrayList(new ArrayList(c0286t.f3024a.values()));
        C1593a c1593a5 = (C1593a) b7.f11335b;
        if (c1593a5.f16148b) {
            v4.l lVar3 = c1593a5.f16147a;
            boolean r7 = lVar3.f17186a.r();
            v4.r rVar2 = lVar3.f17186a;
            boolean z10 = r7 || rVar2.isEmpty();
            if (!arrayList.isEmpty() || !((C1593a) wVar2.f11335b).f16148b || ((z10 && !rVar2.equals(wVar2.C())) || !rVar2.e().equals(wVar2.C().e()))) {
                arrayList.add(new C1595c(5, lVar3, null, null, null));
            }
        }
        q4.k.b("Once a server snap is complete, it should never go back", ((C1593a) b7.f11336c).f16148b || !((C1593a) wVar2.f11336c).f16148b);
        iVar.f16176c = b7;
        ArrayList a4 = iVar.a(arrayList, ((C1593a) b7.f11335b).f16147a, null);
        s4.h hVar = iVar.f16174a;
        if (!hVar.f16173b.h()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C1595c c1595c = (C1595c) it4.next();
                int i10 = c1595c.f16153a;
                v4.c cVar6 = c1595c.f16156d;
                if (i10 == 2) {
                    hashSet2.add(cVar6);
                } else if (i10 == 1) {
                    hashSet.add(cVar6);
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f15475b.m(hVar, hashSet2, hashSet);
                return a4;
            }
        }
        return a4;
    }

    public final v4.r c(C1473g c1473g) {
        v4.r rVar;
        Iterator it = this.f15474a.values().iterator();
        do {
            rVar = null;
            if (!it.hasNext()) {
                break;
            }
            s4.i iVar = (s4.i) it.next();
            v4.r D7 = iVar.f16176c.D();
            if (D7 != null && (iVar.f16174a.f16173b.h() || (!c1473g.isEmpty() && !D7.o(c1473g.B()).isEmpty()))) {
                rVar = D7.g(c1473g);
            }
        } while (rVar == null);
        return rVar;
    }

    public final s4.i d() {
        Iterator it = this.f15474a.entrySet().iterator();
        while (it.hasNext()) {
            s4.i iVar = (s4.i) ((Map.Entry) it.next()).getValue();
            if (iVar.f16174a.f16173b.h()) {
                return iVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f15474a.entrySet().iterator();
        while (it.hasNext()) {
            s4.i iVar = (s4.i) ((Map.Entry) it.next()).getValue();
            if (!iVar.f16174a.f16173b.h()) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public final s4.i f(s4.h hVar, com.google.android.gms.common.internal.w wVar, C1593a c1593a) {
        boolean z4;
        s4.i iVar = (s4.i) this.f15474a.get(hVar.f16173b);
        if (iVar != null) {
            return iVar;
        }
        boolean z7 = c1593a.f16148b;
        v4.l lVar = c1593a.f16147a;
        v4.r a2 = ((M) wVar.f11336c).a((C1473g) wVar.f11335b, z7 ? lVar.f17186a : null, Collections.emptyList(), false);
        if (a2 != null) {
            z4 = true;
        } else {
            v4.r rVar = lVar.f17186a;
            if (rVar == null) {
                rVar = v4.j.f17184e;
            }
            a2 = wVar.x(rVar);
            z4 = false;
        }
        return new s4.i(hVar, new com.google.android.gms.common.internal.w(18, new C1593a(new v4.l(a2, hVar.f16173b.f16170g), z4, false), c1593a));
    }

    public final boolean g() {
        return d() != null;
    }

    public final s4.i h(s4.h hVar) {
        return hVar.f16173b.h() ? d() : (s4.i) this.f15474a.get(hVar.f16173b);
    }
}
