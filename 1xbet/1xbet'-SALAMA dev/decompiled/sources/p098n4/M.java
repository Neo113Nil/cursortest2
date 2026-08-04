package p098n4;

import A1.C0011c;
import E2.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p063i4.c;
import p083l4.u;
import p120q4.g;
import p134s4.h;
import p134s4.i;
import p155w1.C1009l0;
import v4.j;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1009l0 f15388d = new C1009l0(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15391c;

    public /* synthetic */ M(C0940m c0940m, Object obj, Object obj2) {
        this.f15391c = c0940m;
        this.f15389a = obj;
        this.f15390b = obj2;
    }

    public static C0929b c(ArrayList arrayList, g gVar, C0934g c0934g) {
        C0929b c0929bL = C0929b.f15397b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            if (gVar.p(h6)) {
                C0934g c0934g2 = h6.f15376b;
                if (h6.c()) {
                    if (c0934g.z(c0934g2)) {
                        c0929bL = c0929bL.l(C0934g.D(c0934g, c0934g2), h6.b());
                    } else if (c0934g2.z(c0934g)) {
                        c0929bL = c0929bL.l(C0934g.f15421d, h6.b().g(C0934g.D(c0934g2, c0934g)));
                    }
                } else if (c0934g.z(c0934g2)) {
                    c0929bL = c0929bL.m(C0934g.D(c0934g, c0934g2), h6.a());
                } else if (c0934g2.z(c0934g)) {
                    C0934g c0934gD = C0934g.D(c0934g2, c0934g);
                    if (c0934gD.isEmpty()) {
                        c0929bL = c0929bL.m(C0934g.f15421d, h6.a());
                    } else {
                        r rVarC = h6.a().C(c0934gD);
                        if (rVarC != null) {
                            c0929bL = c0929bL.l(C0934g.f15421d, rVarC);
                        }
                    }
                }
            }
        }
        return c0929bL;
    }

    public r a(C0934g c0934g, r rVar, List list, boolean z4) {
        if (list.isEmpty() && !z4) {
            r rVarC = ((C0929b) this.f15389a).C(c0934g);
            if (rVarC != null) {
                return rVarC;
            }
            C0929b c0929bZ = ((C0929b) this.f15389a).z(c0934g);
            if (c0929bZ.f15398a.isEmpty()) {
                return rVar;
            }
            if (rVar == null && c0929bZ.C(C0934g.f15421d) == null) {
                return null;
            }
            if (rVar == null) {
                rVar = j.f17190e;
            }
            return c0929bZ.t(rVar);
        }
        C0929b c0929bZ2 = ((C0929b) this.f15389a).z(c0934g);
        if (!z4 && c0929bZ2.f15398a.isEmpty()) {
            return rVar;
        }
        if (!z4 && rVar == null && c0929bZ2.C(C0934g.f15421d) == null) {
            return null;
        }
        C0929b c0929bC = c((ArrayList) this.f15390b, new C0011c(z4, list, c0934g), c0934g);
        if (rVar == null) {
            rVar = j.f17190e;
        }
        return c0929bC.t(rVar);
    }

    @Override // p083l4.u
    public void b(String str, String str2) {
        c cVarC = C0940m.c(str, str2);
        C0934g c0934g = (C0934g) this.f15389a;
        C0940m c0940m = (C0940m) this.f15391c;
        if (cVarC == null) {
            c0940m.f15457e.b(c0934g);
        }
        c0940m.i((p120q4.j) this.f15390b, cVarC, c0934g);
    }

    public List d(c cVar) {
        i iVar = (i) this.f15389a;
        D d7 = (D) this.f15391c;
        if (cVar != null) {
            d7.f15372h.C0("Listen at " + iVar.f16180a.f16178a + " failed: " + cVar.toString());
            return d7.l(iVar.f16180a, null, cVar, false);
        }
        h hVar = iVar.f16180a;
        E e7 = (E) this.f15390b;
        if (e7 != null) {
            d7.getClass();
            return (List) d7.f15371g.j(new f(6, d7, e7, false));
        }
        C0934g c0934g = hVar.f16178a;
        d7.getClass();
        return (List) d7.f15371g.j(new f(5, d7, c0934g, false));
    }

    public M(D d7, i iVar) {
        this.f15391c = d7;
        this.f15389a = iVar;
        this.f15390b = d7.m(iVar.f16180a);
    }
}
