package p098n4;

import G4.C0286t;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p046g0.g;
import p106o4.d;
import p114p4.a;
import p120q4.k;
import p134s4.h;
import p134s4.i;
import p134s4.j;
import p136t.e;
import p141t4.b;
import v4.c;
import v4.l;
import v4.p;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15480a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15481b;

    public s(a aVar) {
        this.f15481b = aVar;
    }

    public final ArrayList a(g gVar, w wVar, r rVar) {
        p134s4.g gVar2 = ((d) gVar.f13026b).f15614b;
        HashMap map = this.f15480a;
        if (gVar2 != null) {
            i iVar = (i) map.get(gVar2);
            k.c(iVar != null);
            return b(iVar, gVar, wVar, rVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((i) ((Map.Entry) it.next()).getValue(), gVar, wVar, rVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0464  */
    public final ArrayList b(i iVar, g gVar, w wVar, r rVar) {
        C0286t c0286t;
        w wVarB;
        C0934g c0934g;
        C0286t c0286t2;
        String str;
        iVar.getClass();
        int i7 = gVar.f13025a;
        if (i7 == 2 && ((d) gVar.f13026b).f15614b != null) {
            k.b("We should always have a full cache before handling merges", iVar.f16182c.D() != null);
            k.b("Missing event cache, even though we have a server cache", iVar.f16182c.C() != null);
        }
        w wVar2 = iVar.f16182c;
        j jVar = iVar.f16181b;
        jVar.getClass();
        C0286t c0286t3 = new C0286t(2);
        int iE = e.e(i7);
        if (iE == 0) {
            c0286t = c0286t3;
            p106o4.e eVar = (p106o4.e) gVar;
            d dVar = (d) eVar.f13026b;
            int i8 = dVar.f15613a;
            if (i8 == 1) {
                wVarB = jVar.c(wVar2, (C0934g) eVar.f13027c, eVar.f15616d, wVar, rVar, c0286t);
            } else {
                k.c(i8 == 2);
                wVarB = jVar.b(wVar2, (C0934g) eVar.f13027c, eVar.f15616d, wVar, rVar, dVar.f15615c || (((p134s4.a) wVar2.f11336c).f16155c && !((C0934g) eVar.f13027c).isEmpty()), c0286t);
            }
        } else if (iE != 1) {
            if (iE == 2) {
                p106o4.a aVar = (p106o4.a) gVar;
                boolean z4 = aVar.f15608d;
                C0934g c0934g2 = (C0934g) aVar.f13027c;
                if (z4) {
                    if (wVar.M(c0934g2) == null) {
                        t tVar = new t(wVar, wVar2, rVar, 23);
                        p134s4.a aVar2 = (p134s4.a) wVar2.f11335b;
                        boolean zIsEmpty = c0934g2.isEmpty();
                        b bVar = jVar.f16186a;
                        p134s4.a aVar3 = (p134s4.a) wVar2.f11336c;
                        M m7 = (M) wVar.f11336c;
                        C0934g c0934g3 = (C0934g) wVar.f11335b;
                        l lVarC = aVar2.f16153a;
                        boolean z7 = aVar3.f16154b;
                        if (zIsEmpty || c0934g2.B().equals(c.f17177d)) {
                            c0286t = c0286t3;
                            lVarC = bVar.C(lVarC, new l(z7 ? m7.a(c0934g3, wVar2.D(), Collections.emptyList(), false) : wVar.x(aVar3.f16153a.f17192a), bVar.N()), c0286t);
                        } else {
                            c cVarB = c0934g2.B();
                            r rVarW = wVar.w(cVarB, aVar3);
                            r rVarO = (rVarW == null && aVar3.a(cVarB)) ? lVarC.f17192a.o(cVarB) : rVarW;
                            if (rVarO != null) {
                                c0286t2 = c0286t3;
                                lVarC = bVar.D(lVarC, cVarB, rVarO, c0934g2.E(), tVar, c0286t2);
                            } else {
                                c0286t2 = c0286t3;
                                if (rVarO == null && ((p134s4.a) wVar2.f11335b).f16153a.f17192a.i(cVarB)) {
                                    lVarC = bVar.D(lVarC, cVarB, v4.j.f17190e, c0934g2.E(), tVar, c0286t2);
                                }
                            }
                            if (lVarC.f17192a.isEmpty() && z7) {
                                r rVarA = m7.a(c0934g3, wVar2.D(), Collections.emptyList(), false);
                                if (rVarA.r()) {
                                    lVarC = bVar.C(lVarC, new l(rVarA, bVar.N()), c0286t2);
                                }
                            }
                            c0286t = c0286t2;
                        }
                        wVarB = wVar2.N(lVarC, z7 || wVar.M(C0934g.f15421d) != null, bVar.l());
                    }
                } else if (wVar.M(c0934g2) == null) {
                    p134s4.a aVar4 = (p134s4.a) wVar2.f11336c;
                    p120q4.c cVar = aVar.f15609e;
                    Object obj = cVar.f15861a;
                    boolean z8 = aVar4.f16155c;
                    l lVar = aVar4.f16153a;
                    if (obj == null) {
                        C0929b c0929bL = C0929b.f15397b;
                        Iterator it = cVar.iterator();
                        while (it.hasNext()) {
                            C0934g c0934g4 = (C0934g) ((Map.Entry) it.next()).getKey();
                            C0934g c0934gM = c0934g2.m(c0934g4);
                            if (aVar4.b(c0934gM)) {
                                c0929bL = c0929bL.l(c0934g4, lVar.f17192a.g(c0934gM));
                            }
                        }
                        wVarB = jVar.a(wVar2, c0934g2, c0929bL, wVar, rVar, z8, c0286t3);
                    } else if ((c0934g2.isEmpty() && aVar4.f16154b) || aVar4.b(c0934g2)) {
                        wVarB = jVar.b(wVar2, c0934g2, lVar.f17192a.g(c0934g2), wVar, rVar, z8, c0286t3);
                    } else if (c0934g2.isEmpty()) {
                        C0929b c0929b = C0929b.f15397b;
                        C0929b c0929bL2 = c0929b;
                        for (p pVar : lVar.f17192a) {
                            c cVar2 = pVar.f17201a;
                            c0929bL2.getClass();
                            c0929bL2 = c0929bL2.l(new C0934g(cVar2), pVar.f17202b);
                        }
                        wVarB = jVar.a(wVar2, c0934g2, c0929bL2, wVar, rVar, z8, c0286t3);
                    }
                }
                wVarB = wVar2;
            } else {
                if (iE != 3) {
                    if (i7 == 1) {
                        str = "Overwrite";
                    } else if (i7 == 2) {
                        str = "Merge";
                    } else if (i7 != 3) {
                        str = i7 != 4 ? "null" : "ListenComplete";
                    } else {
                        str = "AckUserWrite";
                    }
                    throw new AssertionError("Unknown operation: ".concat(str));
                }
                p134s4.a aVar5 = (p134s4.a) wVar2.f11336c;
                boolean z9 = aVar5.f16154b;
                C0934g c0934g5 = (C0934g) gVar.f13027c;
                wVarB = jVar.d(new w(18, (p134s4.a) wVar2.f11335b, new p134s4.a(aVar5.f16153a, z9 || c0934g5.isEmpty(), aVar5.f16155c)), c0934g5, wVar, j.f16185b, c0286t3);
            }
            c0286t = c0286t3;
        } else {
            c0286t = c0286t3;
            p106o4.c cVar3 = (p106o4.c) gVar;
            d dVar2 = (d) cVar3.f13026b;
            int i9 = dVar2.f15613a;
            if (i9 == 1) {
                C0929b c0929b2 = cVar3.f15610d;
                k.b("Can't have a merge that is an overwrite", ((r) c0929b2.f15398a.f15861a) == null);
                p120q4.c<Map.Entry> cVar4 = c0929b2.f15398a;
                Iterator it2 = cVar4.iterator();
                w wVarC = wVar2;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    c0934g = (C0934g) cVar3.f13027c;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    C0934g c0934gM2 = c0934g.m((C0934g) entry.getKey());
                    if (((p134s4.a) wVar2.f11335b).a(c0934gM2.B())) {
                        wVarC = jVar.c(wVarC, c0934gM2, (r) entry.getValue(), wVar, rVar, c0286t);
                    }
                    cVar4 = cVar4;
                }
                for (Map.Entry entry2 : cVar4) {
                    C0934g c0934gM3 = c0934g.m((C0934g) entry2.getKey());
                    if (!((p134s4.a) wVar2.f11335b).a(c0934gM3.B())) {
                        wVarC = jVar.c(wVarC, c0934gM3, (r) entry2.getValue(), wVar, rVar, c0286t);
                    }
                    c0934g = c0934g;
                }
                wVarB = wVarC;
            } else {
                k.c(i9 == 2);
                wVarB = jVar.a(wVar2, (C0934g) cVar3.f13027c, cVar3.f15610d, wVar, rVar, dVar2.f15615c || ((p134s4.a) wVar2.f11336c).f16155c, c0286t);
            }
        }
        ArrayList<p134s4.c> arrayList = new ArrayList(new ArrayList(c0286t.f3024a.values()));
        p134s4.a aVar6 = (p134s4.a) wVarB.f11335b;
        if (aVar6.f16154b) {
            l lVar2 = aVar6.f16153a;
            boolean zR = lVar2.f17192a.r();
            r rVar2 = lVar2.f17192a;
            boolean z10 = zR || rVar2.isEmpty();
            if (!arrayList.isEmpty() || !((p134s4.a) wVar2.f11335b).f16154b || ((z10 && !rVar2.equals(wVar2.C())) || !rVar2.e().equals(wVar2.C().e()))) {
                arrayList.add(new p134s4.c(5, lVar2, null, null, null));
            }
        }
        k.b("Once a server snap is complete, it should never go back", ((p134s4.a) wVarB.f11336c).f16154b || !((p134s4.a) wVar2.f11336c).f16154b);
        iVar.f16182c = wVarB;
        ArrayList arrayListA = iVar.a(arrayList, ((p134s4.a) wVarB.f11335b).f16153a, null);
        h hVar = iVar.f16180a;
        if (!hVar.f16179b.h()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (p134s4.c cVar5 : arrayList) {
                int i10 = cVar5.f16159a;
                c cVar6 = cVar5.f16162d;
                if (i10 == 2) {
                    hashSet2.add(cVar6);
                } else if (i10 == 1) {
                    hashSet.add(cVar6);
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f15481b.m(hVar, hashSet2, hashSet);
            }
        }
        return arrayListA;
    }

    public final r c(C0934g c0934g) {
        r rVarG;
        Iterator it = this.f15480a.values().iterator();
        do {
            rVarG = null;
            if (!it.hasNext()) {
                break;
            }
            i iVar = (i) it.next();
            r rVarD = iVar.f16182c.D();
            if (rVarD != null && (iVar.f16180a.f16179b.h() || (!c0934g.isEmpty() && !rVarD.o(c0934g.B()).isEmpty()))) {
                rVarG = rVarD.g(c0934g);
            }
        } while (rVarG == null);
        return rVarG;
    }

    public final i d() {
        Iterator it = this.f15480a.entrySet().iterator();
        while (it.hasNext()) {
            i iVar = (i) ((Map.Entry) it.next()).getValue();
            if (iVar.f16180a.f16179b.h()) {
                return iVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f15480a.entrySet().iterator();
        while (it.hasNext()) {
            i iVar = (i) ((Map.Entry) it.next()).getValue();
            if (!iVar.f16180a.f16179b.h()) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public final i f(h hVar, w wVar, p134s4.a aVar) {
        boolean z4;
        i iVar = (i) this.f15480a.get(hVar.f16179b);
        if (iVar != null) {
            return iVar;
        }
        boolean z7 = aVar.f16154b;
        l lVar = aVar.f16153a;
        r rVarA = ((M) wVar.f11336c).a((C0934g) wVar.f11335b, z7 ? lVar.f17192a : null, Collections.emptyList(), false);
        if (rVarA != null) {
            z4 = true;
        } else {
            r rVar = lVar.f17192a;
            if (rVar == null) {
                rVar = v4.j.f17190e;
            }
            rVarA = wVar.x(rVar);
            z4 = false;
        }
        return new i(hVar, new w(18, new p134s4.a(new l(rVarA, hVar.f16179b.f16176g), z4, false), aVar));
    }

    public final boolean g() {
        return d() != null;
    }

    public final i h(h hVar) {
        return hVar.f16179b.h() ? d() : (i) this.f15480a.get(hVar.f16179b);
    }
}
