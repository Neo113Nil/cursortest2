package n4;

import A1.C0011c;
import i4.C1266c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w1.C1718l0;

/* loaded from: classes2.dex */
public final class M implements l4.u {

    /* renamed from: d, reason: collision with root package name */
    public static final C1718l0 f15382d = new C1718l0(20);

    /* renamed from: a, reason: collision with root package name */
    public Object f15383a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15384b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15385c;

    public /* synthetic */ M(C1479m c1479m, Object obj, Object obj2) {
        this.f15385c = c1479m;
        this.f15383a = obj;
        this.f15384b = obj2;
    }

    public static C1468b c(ArrayList arrayList, q4.g gVar, C1473g c1473g) {
        C1468b c1468b = C1468b.f15391b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            if (gVar.p(h6)) {
                C1473g c1473g2 = h6.f15370b;
                if (h6.c()) {
                    if (c1473g.z(c1473g2)) {
                        c1468b = c1468b.l(C1473g.D(c1473g, c1473g2), h6.b());
                    } else if (c1473g2.z(c1473g)) {
                        c1468b = c1468b.l(C1473g.f15415d, h6.b().g(C1473g.D(c1473g2, c1473g)));
                    }
                } else if (c1473g.z(c1473g2)) {
                    c1468b = c1468b.m(C1473g.D(c1473g, c1473g2), h6.a());
                } else if (c1473g2.z(c1473g)) {
                    C1473g D7 = C1473g.D(c1473g2, c1473g);
                    if (D7.isEmpty()) {
                        c1468b = c1468b.m(C1473g.f15415d, h6.a());
                    } else {
                        v4.r C3 = h6.a().C(D7);
                        if (C3 != null) {
                            c1468b = c1468b.l(C1473g.f15415d, C3);
                        }
                    }
                }
            }
        }
        return c1468b;
    }

    public v4.r a(C1473g c1473g, v4.r rVar, List list, boolean z4) {
        if (list.isEmpty() && !z4) {
            v4.r C3 = ((C1468b) this.f15383a).C(c1473g);
            if (C3 != null) {
                return C3;
            }
            C1468b z7 = ((C1468b) this.f15383a).z(c1473g);
            if (z7.f15392a.isEmpty()) {
                return rVar;
            }
            if (rVar == null && z7.C(C1473g.f15415d) == null) {
                return null;
            }
            if (rVar == null) {
                rVar = v4.j.f17184e;
            }
            return z7.t(rVar);
        }
        C1468b z8 = ((C1468b) this.f15383a).z(c1473g);
        if (!z4 && z8.f15392a.isEmpty()) {
            return rVar;
        }
        if (!z4 && rVar == null && z8.C(C1473g.f15415d) == null) {
            return null;
        }
        C1468b c3 = c((ArrayList) this.f15384b, new C0011c(z4, list, c1473g), c1473g);
        if (rVar == null) {
            rVar = v4.j.f17184e;
        }
        return c3.t(rVar);
    }

    @Override // l4.u
    public void b(String str, String str2) {
        C1266c c3 = C1479m.c(str, str2);
        C1473g c1473g = (C1473g) this.f15383a;
        C1479m c1479m = (C1479m) this.f15385c;
        if (c3 == null) {
            c1479m.f15451e.b(c1473g);
        }
        c1479m.i((q4.j) this.f15384b, c3, c1473g);
    }

    public List d(C1266c c1266c) {
        s4.i iVar = (s4.i) this.f15383a;
        D d7 = (D) this.f15385c;
        if (c1266c != null) {
            d7.f15366h.C0("Listen at " + iVar.f16174a.f16172a + " failed: " + c1266c.toString());
            return d7.l(iVar.f16174a, null, c1266c, false);
        }
        s4.h hVar = iVar.f16174a;
        E e7 = (E) this.f15384b;
        if (e7 != null) {
            d7.getClass();
            return (List) d7.f15365g.j(new E2.f(6, d7, e7, false));
        }
        C1473g c1473g = hVar.f16172a;
        d7.getClass();
        return (List) d7.f15365g.j(new E2.f(5, d7, c1473g, false));
    }

    public M(D d7, s4.i iVar) {
        this.f15385c = d7;
        this.f15383a = iVar;
        this.f15384b = d7.m(iVar.f16174a);
    }
}
