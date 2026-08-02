package n4;

import android.os.Handler;
import d6.C0977k;
import i4.C1265b;
import i4.C1266c;
import i4.C1267d;
import i4.C1269f;
import i4.C1274k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n1.C1450e;
import p6.AbstractC1539a;
import w1.C1726n0;
import w1.F0;

/* renamed from: n4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1479m {

    /* renamed from: a, reason: collision with root package name */
    public final C1480n f15447a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.y f15448b;

    /* renamed from: c, reason: collision with root package name */
    public l4.s f15449c;

    /* renamed from: d, reason: collision with root package name */
    public C1450e f15450d;

    /* renamed from: e, reason: collision with root package name */
    public r f15451e;

    /* renamed from: f, reason: collision with root package name */
    public C1726n0 f15452f;

    /* renamed from: g, reason: collision with root package name */
    public final C0977k f15453g;

    /* renamed from: h, reason: collision with root package name */
    public final C1471e f15454h;

    /* renamed from: i, reason: collision with root package name */
    public final android.support.v4.media.session.t f15455i;
    public final android.support.v4.media.session.t j;

    /* renamed from: k, reason: collision with root package name */
    public final android.support.v4.media.session.t f15456k;

    /* renamed from: l, reason: collision with root package name */
    public long f15457l;

    /* renamed from: m, reason: collision with root package name */
    public D f15458m;

    /* renamed from: n, reason: collision with root package name */
    public D f15459n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15460o;

    /* renamed from: p, reason: collision with root package name */
    public long f15461p;

    public C1479m(C1471e c1471e, C1480n c1480n) {
        E4.y yVar = new E4.y();
        yVar.f2247a = 0L;
        this.f15448b = yVar;
        this.f15457l = 1L;
        this.f15460o = false;
        this.f15461p = 0L;
        this.f15447a = c1480n;
        this.f15454h = c1471e;
        this.f15455i = c1471e.c("RepoOperation");
        this.j = c1471e.c("Transaction");
        this.f15456k = c1471e.c("DataOperation");
        this.f15453g = new C0977k(c1471e);
        q(new RunnableC1476j(this, 0));
    }

    public static C1266c c(String str, String str2) {
        if (str != null) {
            return C1266c.b(str, str2);
        }
        return null;
    }

    public static void d(C1479m c1479m, String str, C1473g c1473g, C1266c c1266c) {
        int i7;
        c1479m.getClass();
        if (c1266c == null || (i7 = c1266c.f13989a) == -1 || i7 == -25) {
            return;
        }
        StringBuilder d7 = t.e.d(str, " at ");
        d7.append(c1473g.toString());
        d7.append(" failed: ");
        d7.append(c1266c.toString());
        c1479m.f15455i.C0(d7.toString());
    }

    public static void e(C1479m c1479m, long j, C1473g c1473g, C1266c c1266c) {
        c1479m.getClass();
        if (c1266c == null || c1266c.f13989a != -25) {
            List c3 = c1479m.f15459n.c(j, !(c1266c == null), true, c1479m.f15448b);
            if (c3.size() > 0) {
                c1479m.p(c1473g);
            }
            c1479m.m(c3);
        }
    }

    public static void g(ArrayList arrayList, C1726n0 c1726n0) {
        List list = ((q4.i) c1726n0.f17807d).f15863b;
        if (list != null) {
            arrayList.addAll(list);
        }
        for (Object obj : ((q4.i) c1726n0.f17807d).f15862a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            g(arrayList, new C1726n0((v4.c) entry.getKey(), c1726n0, (q4.i) entry.getValue(), 22));
        }
    }

    public static ArrayList h(C1726n0 c1726n0) {
        ArrayList arrayList = new ArrayList();
        g(arrayList, c1726n0);
        Collections.sort(arrayList);
        return arrayList;
    }

    public final C1473g a(C1473g c1473g, int i7) {
        C1473g A7 = j(c1473g).A();
        if (this.j.r0()) {
            this.f15455i.W(null, "Aborting transactions for path: " + c1473g + ". Affected: " + A7, new Object[0]);
        }
        C1726n0 K7 = this.f15452f.K(c1473g);
        for (C1726n0 c1726n0 = (C1726n0) K7.f17806c; c1726n0 != null; c1726n0 = (C1726n0) c1726n0.f17806c) {
            b(i7, c1726n0);
        }
        b(i7, K7);
        B.v vVar = new B.v(this, i7, 9);
        for (Object obj : ((q4.i) K7.f17807d).f15862a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            new C1726n0((v4.c) entry.getKey(), K7, (q4.i) entry.getValue(), 22).n(vVar, true);
        }
        return A7;
    }

    public final void b(int i7, C1726n0 c1726n0) {
        C1266c c1266c;
        int i8;
        List list = ((q4.i) c1726n0.f17807d).f15863b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            int i9 = -9;
            int i10 = -25;
            if (i7 == -9) {
                c1266c = C1266c.b("overriddenBySet", null);
            } else {
                q4.k.b("Unknown transaction abort reason: " + i7, i7 == -25);
                HashMap hashMap = C1266c.f13987d;
                if (!hashMap.containsKey(-25)) {
                    throw new IllegalArgumentException("Invalid Firebase Database error code: -25");
                }
                c1266c = new C1266c(-25, (String) hashMap.get(-25));
            }
            int i11 = 0;
            int i12 = -1;
            while (i11 < list.size()) {
                C1478l c1478l = (C1478l) list.get(i11);
                int i13 = c1478l.f15441d;
                if (i13 == 5) {
                    i8 = i10;
                } else if (i13 == 3) {
                    q4.k.c(i12 == i11 + (-1));
                    c1478l.f15441d = 5;
                    c1478l.f15445y = c1266c;
                    i8 = i10;
                    i12 = i11;
                } else {
                    q4.k.c(i13 == 2);
                    o(new J(this, c1478l.f15440c, s4.h.a(c1478l.f15438a)));
                    if (i7 == i9) {
                        arrayList.addAll(this.f15459n.c(c1478l.f15446z, true, false, this.f15448b));
                        i8 = -25;
                    } else {
                        i8 = i10;
                        q4.k.b("Unknown transaction abort reason: " + i7, i7 == i8);
                    }
                    arrayList2.add(new l4.x(6, c1478l, c1266c, false));
                }
                i11++;
                i10 = i8;
                i9 = -9;
            }
            if (i12 == -1) {
                ((q4.i) c1726n0.f17807d).f15863b = null;
                c1726n0.M();
            } else {
                ((q4.i) c1726n0.f17807d).f15863b = list.subList(0, i12 + 1);
                c1726n0.M();
            }
            m(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                l((Runnable) it.next());
            }
        }
    }

    public final void f(AbstractC1472f abstractC1472f) {
        v4.c B7 = abstractC1472f.e().f16172a.B();
        m((B7 == null || !B7.equals(AbstractC1469c.f15393a)) ? this.f15459n.d(abstractC1472f, false) : this.f15458m.d(abstractC1472f, false));
    }

    public final void i(q4.j jVar, C1266c c1266c, C1473g c1473g) {
        if (jVar != null) {
            v4.c A7 = c1473g.A();
            l(new l4.x(jVar, c1266c, (A7 == null || !A7.equals(v4.c.f17171d)) ? new C1269f(this, c1473g) : new C1269f(this, c1473g.C())));
        }
    }

    public final C1726n0 j(C1473g c1473g) {
        C1726n0 c1726n0 = this.f15452f;
        while (!c1473g.isEmpty() && ((q4.i) c1726n0.f17807d).f15863b == null) {
            c1726n0 = c1726n0.K(new C1473g(c1473g.B()));
            c1473g = c1473g.E();
        }
        return c1726n0;
    }

    public final void k(s4.h hVar, boolean z4, boolean z7) {
        C1473g c1473g = hVar.f16172a;
        q4.k.c(c1473g.isEmpty() || !c1473g.B().equals(AbstractC1469c.f15393a));
        D d7 = this.f15459n;
        HashSet hashSet = d7.f15363e;
        if (z4 && !hashSet.contains(hVar)) {
            d7.d(new C1466B(hVar), z7);
            hashSet.add(hVar);
        } else {
            if (z4 || !hashSet.contains(hVar)) {
                return;
            }
            C1466B c1466b = new C1466B(hVar);
            d7.l(c1466b.f15358d, c1466b, null, z7);
            hashSet.remove(hVar);
        }
    }

    public final void l(Runnable runnable) {
        ((Handler) this.f15454h.f15401b.f16591b).post(runnable);
    }

    public final void m(List list) {
        if (list.isEmpty()) {
            return;
        }
        C0977k c0977k = this.f15453g;
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) c0977k.f12442c;
        if (tVar.r0()) {
            tVar.W(null, "Raising " + list.size() + " event(s)", new Object[0]);
        }
        ((Handler) ((u1.c) c0977k.f12441b).f16591b).post(new l4.x(10, c0977k, new ArrayList(list)));
    }

    public final void n(C1726n0 c1726n0) {
        List list = ((q4.i) c1726n0.f17807d).f15863b;
        if (list != null) {
            int i7 = 0;
            while (i7 < list.size()) {
                if (((C1478l) list.get(i7)).f15441d == 4) {
                    list.remove(i7);
                } else {
                    i7++;
                }
            }
            if (list.size() > 0) {
                ((q4.i) c1726n0.f17807d).f15863b = list;
                c1726n0.M();
            } else {
                ((q4.i) c1726n0.f17807d).f15863b = null;
                c1726n0.M();
            }
        }
        for (Object obj : ((q4.i) c1726n0.f17807d).f15862a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            n(new C1726n0((v4.c) entry.getKey(), c1726n0, (q4.i) entry.getValue(), 22));
        }
    }

    public final void o(AbstractC1472f abstractC1472f) {
        List l7;
        if (AbstractC1469c.f15393a.equals(abstractC1472f.e().f16172a.B())) {
            D d7 = this.f15458m;
            d7.getClass();
            l7 = d7.l(abstractC1472f.e(), abstractC1472f, null, false);
        } else {
            D d8 = this.f15459n;
            d8.getClass();
            l7 = d8.l(abstractC1472f.e(), abstractC1472f, null, false);
        }
        m(l7);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1473g p(C1473g c1473g) {
        C1473g c1473g2;
        ArrayList arrayList;
        C1266c c1266c;
        C1266c c1266c2;
        boolean z4;
        C1266c a2;
        B3.g gVar;
        C1726n0 j = j(c1473g);
        C1473g A7 = j.A();
        ArrayList h6 = h(j);
        if (h6.isEmpty()) {
            return A7;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = h6.iterator();
        while (it.hasNext()) {
            arrayList3.add(Long.valueOf(((C1478l) it.next()).f15446z));
        }
        Iterator it2 = h6.iterator();
        while (true) {
            boolean z7 = false;
            if (!it2.hasNext()) {
                break;
            }
            C1478l c1478l = (C1478l) it2.next();
            C1473g D7 = C1473g.D(A7, c1478l.f15438a);
            ArrayList arrayList4 = new ArrayList();
            q4.k.c(D7 != null);
            int i7 = c1478l.f15441d;
            C1473g c1473g3 = c1478l.f15438a;
            E4.y yVar = this.f15448b;
            if (i7 == 6) {
                c1266c2 = c1478l.f15445y;
                if (c1266c2.f13989a != -25) {
                    arrayList4.addAll(this.f15459n.c(c1478l.f15446z, true, false, yVar));
                }
            } else {
                Comparable comparable = null;
                if (i7 != 2) {
                    c1473g2 = A7;
                    arrayList = arrayList2;
                    c1266c = null;
                } else if (c1478l.f15444x >= 25) {
                    c1266c2 = C1266c.b("maxretries", null);
                    arrayList4.addAll(this.f15459n.c(c1478l.f15446z, true, false, yVar));
                } else {
                    v4.r i8 = this.f15459n.i(c1473g3, arrayList3);
                    if (i8 == null) {
                        i8 = v4.j.f17184e;
                    }
                    v4.r rVar = i8;
                    c1478l.f15435A = rVar;
                    try {
                        gVar = c1478l.f15439b.j(new C1274k(rVar));
                        a2 = null;
                    } catch (Throwable th) {
                        this.f15455i.a0("Caught Throwable.", th);
                        a2 = C1266c.a(th);
                        gVar = new B3.g(z7, comparable, 7);
                    }
                    if (gVar.f1063b) {
                        long j3 = c1478l.f15446z;
                        Long valueOf = Long.valueOf(j3);
                        HashMap p5 = Y4.D.p(yVar);
                        v4.r rVar2 = (v4.r) gVar.f1064c;
                        v4.r Q6 = Y4.D.Q(rVar2, new L(rVar), p5);
                        c1478l.f15436B = rVar2;
                        c1478l.f15437C = Q6;
                        long j7 = this.f15457l;
                        c1473g2 = A7;
                        arrayList = arrayList2;
                        this.f15457l = j7 + 1;
                        c1478l.f15446z = j7;
                        arrayList3.remove(valueOf);
                        arrayList4.addAll(this.f15459n.h(c1478l.f15438a, rVar2, Q6, c1478l.f15446z, c1478l.f15443f, false));
                        c1266c = null;
                        arrayList4.addAll(this.f15459n.c(j3, true, false, yVar));
                    } else {
                        c1473g2 = A7;
                        arrayList = arrayList2;
                        arrayList4.addAll(this.f15459n.c(c1478l.f15446z, true, false, yVar));
                        z4 = true;
                        c1266c2 = a2;
                        m(arrayList4);
                        if (z4) {
                            c1478l.f15441d = 4;
                            C1265b c1265b = new C1265b(new C1269f(this, c1473g3), v4.l.m(c1478l.f15435A));
                            q(new l4.x(5, this, c1478l));
                            arrayList2 = arrayList;
                            arrayList2.add(new RunnableC1475i(c1478l, c1266c2, c1265b, 1));
                        } else {
                            arrayList2 = arrayList;
                        }
                        A7 = c1473g2;
                    }
                }
                c1266c2 = c1266c;
                z4 = false;
                m(arrayList4);
                if (z4) {
                }
                A7 = c1473g2;
            }
            c1473g2 = A7;
            arrayList = arrayList2;
            z4 = true;
            m(arrayList4);
            if (z4) {
            }
            A7 = c1473g2;
        }
        C1473g c1473g4 = A7;
        n(this.f15452f);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            l((Runnable) arrayList2.get(i9));
        }
        C1726n0 c1726n0 = this.f15452f;
        n(c1726n0);
        r(c1726n0);
        return c1473g4;
    }

    public final void q(Runnable runnable) {
        ((L4.b) this.f15454h.f15404e.f8076b).execute(runnable);
    }

    public final void r(C1726n0 c1726n0) {
        q4.i iVar = (q4.i) c1726n0.f17807d;
        if (iVar.f15863b == null) {
            if (iVar.f15862a.isEmpty()) {
                return;
            }
            for (Object obj : ((q4.i) c1726n0.f17807d).f15862a.entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                r(new C1726n0((v4.c) entry.getKey(), c1726n0, (q4.i) entry.getValue(), 22));
            }
            return;
        }
        ArrayList h6 = h(c1726n0);
        q4.k.c(h6.size() > 0);
        Boolean bool = Boolean.TRUE;
        Iterator it = h6.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C1478l) it.next()).f15441d != 2) {
                    bool = Boolean.FALSE;
                    break;
                }
            } else {
                break;
            }
        }
        if (bool.booleanValue()) {
            C1473g A7 = c1726n0.A();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = h6.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C1478l) it2.next()).f15446z));
            }
            v4.r i7 = this.f15459n.i(A7, arrayList);
            if (i7 == null) {
                i7 = v4.j.f17184e;
            }
            String x4 = i7.x();
            Iterator it3 = h6.iterator();
            while (it3.hasNext()) {
                C1478l c1478l = (C1478l) it3.next();
                q4.k.c(c1478l.f15441d == 2);
                c1478l.f15441d = 3;
                c1478l.f15444x++;
                i7 = i7.q(C1473g.D(A7, c1478l.f15438a), c1478l.f15436B);
            }
            this.f15449c.f("p", A7.l(), i7.u(true), x4, new F0(this, A7, (Iterable) h6, (Object) this, 18));
        }
    }

    public final void s(C1473g c1473g, v4.r rVar, q4.j jVar) {
        android.support.v4.media.session.t tVar = this.f15455i;
        if (tVar.r0()) {
            tVar.W(null, "set: " + c1473g, new Object[0]);
        }
        android.support.v4.media.session.t tVar2 = this.f15456k;
        if (tVar2.r0()) {
            tVar2.W(null, "set: " + c1473g + " " + rVar, new Object[0]);
        }
        v4.r Q6 = Y4.D.Q(rVar, new L(this.f15459n.i(c1473g, new ArrayList())), Y4.D.p(this.f15448b));
        long j = this.f15457l;
        this.f15457l = 1 + j;
        m(this.f15459n.h(c1473g, rVar, Q6, j, true, true));
        this.f15449c.f("p", c1473g.l(), rVar.u(true), null, new C1474h(this, c1473g, j, jVar, 1));
        p(a(c1473g, -9));
    }

    public final void t(v4.c cVar, Object obj) {
        if (cVar.equals(AbstractC1469c.f15394b)) {
            this.f15448b.f2247a = ((Long) obj).longValue();
        }
        C1473g c1473g = new C1473g(AbstractC1469c.f15393a, cVar);
        try {
            v4.r a2 = AbstractC1539a.a(obj, v4.j.f17184e);
            C1450e c1450e = this.f15450d;
            c1450e.f15308b = ((v4.r) c1450e.f15308b).q(c1473g, a2);
            m(this.f15458m.g(c1473g, a2));
        } catch (C1267d e7) {
            this.f15455i.a0("Failed to parse info update", e7);
        }
    }

    public final String toString() {
        return this.f15447a.toString();
    }
}
