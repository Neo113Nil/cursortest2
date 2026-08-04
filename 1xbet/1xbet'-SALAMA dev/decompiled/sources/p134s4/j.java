package p134s4;

import G4.C0286t;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p098n4.C0929b;
import p098n4.C0934g;
import p098n4.M;
import p120q4.k;
import p141t4.a;
import p141t4.b;
import p155w1.C1013m0;
import v4.c;
import v4.f;
import v4.l;
import v4.m;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1013m0 f16185b = new C1013m0(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16186a;

    public j(b bVar) {
        this.f16186a = bVar;
    }

    public final w a(w wVar, C0934g c0934g, C0929b c0929b, w wVar2, r rVar, boolean z4, C0286t c0286t) {
        w wVar3;
        Map.Entry entry;
        c cVar;
        w wVarB = wVar;
        C0929b c0929bM = c0929b;
        boolean zIsEmpty = ((a) wVarB.f11336c).f16153a.f17192a.isEmpty();
        a aVar = (a) wVarB.f11336c;
        if (zIsEmpty && !aVar.f16154b) {
            return wVarB;
        }
        k.b("Can't have a merge that is an overwrite", ((r) c0929bM.f15398a.f15861a) == null);
        if (!c0934g.isEmpty()) {
            c0929bM = C0929b.f15397b.m(c0934g, c0929bM);
        }
        r rVar2 = aVar.f16153a.f17192a;
        c0929bM.getClass();
        HashMap map = new HashMap();
        for (Map.Entry entry2 : c0929bM.f15398a.f15862b) {
            map.put((c) entry2.getKey(), new C0929b((p120q4.c) entry2.getValue()));
        }
        Iterator it = map.entrySet().iterator();
        loop1: while (true) {
            wVar3 = wVarB;
            do {
                if (!it.hasNext()) {
                    break loop1;
                }
                entry = (Map.Entry) it.next();
                cVar = (c) entry.getKey();
            } while (!rVar2.i(cVar));
            wVarB = b(wVar3, new C0934g(cVar), ((C0929b) entry.getValue()).t(rVar2.o(cVar)), wVar2, rVar, z4, c0286t);
        }
        w wVarB2 = wVar3;
        for (Map.Entry entry3 : map.entrySet()) {
            c cVar2 = (c) entry3.getKey();
            boolean z7 = !aVar.a(cVar2) && ((r) ((C0929b) entry3.getValue()).f15398a.f15861a) == null;
            if (!rVar2.i(cVar2) && !z7) {
                wVarB2 = b(wVarB2, new C0934g(cVar2), ((C0929b) entry3.getValue()).t(rVar2.o(cVar2)), wVar2, rVar, z4, c0286t);
            }
        }
        return wVarB2;
    }

    public final w b(w wVar, C0934g c0934g, r rVar, w wVar2, r rVar2, boolean z4, C0286t c0286t) {
        l lVarD;
        a aVar = (a) wVar.f11336c;
        b bVarI = this.f16186a;
        if (!z4) {
            bVarI = bVarI.i();
        }
        boolean zIsEmpty = c0934g.isEmpty();
        l lVar = aVar.f16153a;
        boolean z7 = true;
        if (!zIsEmpty) {
            if (!bVarI.l() || aVar.f16155c) {
                c cVarB = c0934g.B();
                if (!aVar.b(c0934g) && c0934g.size() > 1) {
                    return wVar;
                }
                C0934g c0934gE = c0934g.E();
                r rVarQ = lVar.f17192a.o(cVarB).q(c0934gE, rVar);
                if (cVarB.equals(c.f17177d)) {
                    lVarD = bVarI.E(lVar, rVarQ);
                } else {
                    lVarD = bVarI.D(aVar.f16153a, cVarB, rVarQ, c0934gE, f16185b, null);
                }
            } else {
                k.b("An empty path should have been caught in the other branch", !c0934g.isEmpty());
                c cVarB2 = c0934g.B();
                lVarD = bVarI.C(lVar, lVar.t(cVarB2, lVar.f17192a.o(cVarB2).q(c0934g.E(), rVar)), null);
            }
            if (!aVar.f16154b && !c0934g.isEmpty()) {
                z7 = false;
            }
            w wVar3 = new w(18, (a) wVar.f11335b, new a(lVarD, z7, bVarI.l()));
            return d(wVar3, c0934g, wVar2, new t(wVar2, wVar3, rVar2, 23), c0286t);
        }
        lVarD = bVarI.C(lVar, new l(rVar, bVarI.N()), null);
        if (!aVar.f16154b) {
            z7 = false;
        }
        w wVar4 = new w(18, (a) wVar.f11335b, new a(lVarD, z7, bVarI.l()));
        return d(wVar4, c0934g, wVar2, new t(wVar2, wVar4, rVar2, 23), c0286t);
    }

    public final w c(w wVar, C0934g c0934g, r rVar, w wVar2, r rVar2, C0286t c0286t) {
        r rVarW;
        r rVar3;
        r rVarQ = rVar;
        a aVar = (a) wVar.f11335b;
        t tVar = new t(wVar2, wVar, rVar2, 23);
        boolean zIsEmpty = c0934g.isEmpty();
        b bVar = this.f16186a;
        a aVar2 = (a) wVar.f11335b;
        l lVar = aVar2.f16153a;
        if (zIsEmpty) {
            return wVar.N(bVar.C(lVar, new l(rVarQ, bVar.N()), c0286t), true, bVar.l());
        }
        c cVarB = c0934g.B();
        c cVar = c.f17177d;
        boolean zEquals = cVarB.equals(cVar);
        boolean z4 = aVar.f16154b;
        if (zEquals) {
            return wVar.N(bVar.E(lVar, rVarQ), z4, aVar.f16155c);
        }
        C0934g c0934gE = c0934g.E();
        r rVarO = aVar.f16153a.f17192a.o(cVarB);
        if (c0934gE.isEmpty()) {
            rVar3 = rVarQ;
        } else {
            if (aVar2.a(cVarB)) {
                rVarW = lVar.f17192a.o(cVarB);
            } else {
                rVarW = wVar2.w(cVarB, rVar2 != null ? new a(new l(rVar2, m.f17195a), true, false) : (a) wVar.f11336c);
            }
            if (rVarW == null) {
                rVarQ = v4.j.f17190e;
            } else if (c0934gE.A().equals(cVar) && rVarW.g(c0934gE.C()).isEmpty()) {
                rVar3 = rVarW;
            } else {
                rVarQ = rVarW.q(c0934gE, rVarQ);
            }
            rVar3 = rVarQ;
        }
        return !rVarO.equals(rVar3) ? wVar.N(bVar.D(aVar.f16153a, cVarB, rVar3, c0934gE, tVar, c0286t), z4, bVar.l()) : wVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    public final w d(w wVar, C0934g c0934g, w wVar2, a aVar, C0286t c0286t) {
        r rVarW;
        l lVarD;
        r rVarA;
        a aVar2 = (a) wVar.f11335b;
        if (wVar2.M(c0934g) != null) {
            return wVar;
        }
        boolean zIsEmpty = c0934g.isEmpty();
        b bVar = this.f16186a;
        a aVar3 = (a) wVar.f11336c;
        if (zIsEmpty) {
            k.b("If change path is empty, we must have complete server data", aVar3.f16154b);
            if (aVar3.f16155c) {
                r rVarD = wVar.D();
                if (!(rVarD instanceof f)) {
                    rVarD = v4.j.f17190e;
                }
                rVarA = wVar2.x(rVarD);
            } else {
                rVarA = ((M) wVar2.f11336c).a((C0934g) wVar2.f11335b, wVar.D(), Collections.emptyList(), false);
            }
            lVarD = bVar.C(aVar2.f16153a, new l(rVarA, bVar.N()), c0286t);
        } else {
            c cVarB = c0934g.B();
            boolean zEquals = cVarB.equals(c.f17177d);
            l lVar = aVar2.f16153a;
            l lVar2 = aVar3.f16153a;
            if (zEquals) {
                k.b("Can't have a priority with additional path components", c0934g.size() == 1);
                r rVarY = wVar2.y(c0934g, lVar.f17192a, lVar2.f17192a);
                if (rVarY != null) {
                    lVarD = bVar.E(lVar, rVarY);
                } else {
                    lVarD = lVar;
                }
            } else {
                C0934g c0934gE = c0934g.E();
                if (aVar2.a(cVarB)) {
                    r rVarY2 = wVar2.y(c0934g, lVar.f17192a, lVar2.f17192a);
                    r rVar = lVar.f17192a;
                    rVarW = rVarY2 != null ? rVar.o(cVarB).q(c0934gE, rVarY2) : rVar.o(cVarB);
                } else {
                    rVarW = wVar2.w(cVarB, aVar3);
                }
                if (rVarW != null) {
                    lVarD = bVar.D(aVar2.f16153a, cVarB, rVarW, c0934gE, aVar, c0286t);
                } else {
                    lVarD = lVar;
                }
            }
        }
        return wVar.N(lVarD, aVar2.f16154b || c0934g.isEmpty(), bVar.l());
    }
}
