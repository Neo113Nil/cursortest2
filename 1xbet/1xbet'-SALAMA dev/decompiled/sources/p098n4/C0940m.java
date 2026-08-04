package p098n4;

import B.v;
import B3.g;
import E4.y;
import Y4.D;
import android.os.Handler;
import android.support.v4.media.session.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p028d6.k;
import p063i4.b;
import p063i4.c;
import p063i4.d;
import p063i4.f;
import p083l4.s;
import p083l4.x;
import p096n1.e;
import p115p6.a;
import p120q4.i;
import p120q4.j;
import p134s4.h;
import p155w1.C1017n0;
import p155w1.F0;
import v4.l;
import v4.r;

/* JADX INFO: renamed from: n4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0940m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0941n f15453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f15454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f15455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f15456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f15457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1017n0 f15458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f15459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0932e f15460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f15461i;
    public final t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f15462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public D f15464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public D f15465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f15467p;

    public C0940m(C0932e c0932e, C0941n c0941n) {
        y yVar = new y();
        yVar.f2247a = 0L;
        this.f15454b = yVar;
        this.f15463l = 1L;
        this.f15466o = false;
        this.f15467p = 0L;
        this.f15453a = c0941n;
        this.f15460h = c0932e;
        this.f15461i = c0932e.c("RepoOperation");
        this.j = c0932e.c("Transaction");
        this.f15462k = c0932e.c("DataOperation");
        this.f15459g = new k(c0932e);
        q(new RunnableC0937j(this, 0));
    }

    public static c c(String str, String str2) {
        if (str != null) {
            return c.b(str, str2);
        }
        return null;
    }

    public static void d(C0940m c0940m, String str, C0934g c0934g, c cVar) {
        int i7;
        c0940m.getClass();
        if (cVar == null || (i7 = cVar.f13995a) == -1 || i7 == -25) {
            return;
        }
        StringBuilder sbD = p136t.e.d(str, " at ");
        sbD.append(c0934g.toString());
        sbD.append(" failed: ");
        sbD.append(cVar.toString());
        c0940m.f15461i.C0(sbD.toString());
    }

    public static void e(C0940m c0940m, long j, C0934g c0934g, c cVar) {
        c0940m.getClass();
        if (cVar == null || cVar.f13995a != -25) {
            List listC = c0940m.f15465n.c(j, !(cVar == null), true, c0940m.f15454b);
            if (listC.size() > 0) {
                c0940m.p(c0934g);
            }
            c0940m.m(listC);
        }
    }

    public static void g(ArrayList arrayList, C1017n0 c1017n0) {
        List list = ((i) c1017n0.f17813d).f15869b;
        if (list != null) {
            arrayList.addAll(list);
        }
        for (Object obj : ((i) c1017n0.f17813d).f15868a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            g(arrayList, new C1017n0((v4.c) entry.getKey(), c1017n0, (i) entry.getValue(), 22));
        }
    }

    public static ArrayList h(C1017n0 c1017n0) {
        ArrayList arrayList = new ArrayList();
        g(arrayList, c1017n0);
        Collections.sort(arrayList);
        return arrayList;
    }

    public final C0934g a(C0934g c0934g, int i7) {
        C0934g c0934gA = j(c0934g).A();
        if (this.j.r0()) {
            this.f15461i.W(null, "Aborting transactions for path: " + c0934g + ". Affected: " + c0934gA, new Object[0]);
        }
        C1017n0 c1017n0K = this.f15458f.K(c0934g);
        for (C1017n0 c1017n0 = (C1017n0) c1017n0K.f17812c; c1017n0 != null; c1017n0 = (C1017n0) c1017n0.f17812c) {
            b(i7, c1017n0);
        }
        b(i7, c1017n0K);
        v vVar = new v(this, i7, 9);
        for (Object obj : ((i) c1017n0K.f17813d).f15868a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            new C1017n0((v4.c) entry.getKey(), c1017n0K, (i) entry.getValue(), 22).n(vVar, true);
        }
        return c0934gA;
    }

    public final void b(int i7, C1017n0 c1017n0) {
        c cVar;
        int i8;
        List list = ((i) c1017n0.f17813d).f15869b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            int i9 = -9;
            int i10 = -25;
            if (i7 == -9) {
                cVar = c.b("overriddenBySet", null);
            } else {
                p120q4.k.b("Unknown transaction abort reason: " + i7, i7 == -25);
                HashMap map = c.f13993d;
                if (!map.containsKey(-25)) {
                    throw new IllegalArgumentException("Invalid Firebase Database error code: -25");
                }
                cVar = new c(-25, (String) map.get(-25));
            }
            int i11 = 0;
            int i12 = -1;
            while (i11 < list.size()) {
                C0939l c0939l = (C0939l) list.get(i11);
                int i13 = c0939l.f15447d;
                if (i13 == 5) {
                    i8 = i10;
                } else if (i13 == 3) {
                    p120q4.k.c(i12 == i11 + (-1));
                    c0939l.f15447d = 5;
                    c0939l.f15451y = cVar;
                    i8 = i10;
                    i12 = i11;
                } else {
                    p120q4.k.c(i13 == 2);
                    o(new J(this, c0939l.f15446c, h.a(c0939l.f15444a)));
                    if (i7 == i9) {
                        arrayList.addAll(this.f15465n.c(c0939l.f15452z, true, false, this.f15454b));
                        i8 = -25;
                    } else {
                        i8 = i10;
                        p120q4.k.b("Unknown transaction abort reason: " + i7, i7 == i8);
                    }
                    arrayList2.add(new x(6, c0939l, cVar, false));
                }
                i11++;
                i10 = i8;
                i9 = -9;
            }
            if (i12 == -1) {
                ((i) c1017n0.f17813d).f15869b = null;
                c1017n0.M();
            } else {
                ((i) c1017n0.f17813d).f15869b = list.subList(0, i12 + 1);
                c1017n0.M();
            }
            m(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                l((Runnable) it.next());
            }
        }
    }

    public final void f(AbstractC0933f abstractC0933f) {
        v4.c cVarB = abstractC0933f.e().f16178a.B();
        m((cVarB == null || !cVarB.equals(AbstractC0930c.f15399a)) ? this.f15465n.d(abstractC0933f, false) : this.f15464m.d(abstractC0933f, false));
    }

    public final void i(j jVar, c cVar, C0934g c0934g) {
        if (jVar != null) {
            v4.c cVarA = c0934g.A();
            l(new x(jVar, cVar, (cVarA == null || !cVarA.equals(v4.c.f17177d)) ? new f(this, c0934g) : new f(this, c0934g.C())));
        }
    }

    public final C1017n0 j(C0934g c0934g) {
        C1017n0 c1017n0K = this.f15458f;
        while (!c0934g.isEmpty() && ((i) c1017n0K.f17813d).f15869b == null) {
            c1017n0K = c1017n0K.K(new C0934g(c0934g.B()));
            c0934g = c0934g.E();
        }
        return c1017n0K;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k(h hVar, boolean z4, boolean z7) {
        C0934g c0934g = hVar.f16178a;
        p120q4.k.c(c0934g.isEmpty() || !c0934g.B().equals(AbstractC0930c.f15399a));
        D d7 = this.f15465n;
        HashSet hashSet = d7.f15369e;
        if (z4 && !hashSet.contains(hVar)) {
            d7.d(new B(hVar), z7);
            hashSet.add(hVar);
        } else {
            if (z4 || !hashSet.contains(hVar)) {
                return;
            }
            B b7 = new B(hVar);
            d7.l(b7.f15364d, b7, null, z7);
            hashSet.remove(hVar);
        }
    }

    public final void l(Runnable runnable) {
        ((Handler) this.f15460h.f15407b.f16597b).post(runnable);
    }

    public final void m(List list) {
        if (list.isEmpty()) {
            return;
        }
        k kVar = this.f15459g;
        t tVar = (t) kVar.f12448c;
        if (tVar.r0()) {
            tVar.W(null, "Raising " + list.size() + " event(s)", new Object[0]);
        }
        ((Handler) ((p145u1.c) kVar.f12447b).f16597b).post(new x(10, kVar, new ArrayList(list)));
    }

    public final void n(C1017n0 c1017n0) {
        List list = ((i) c1017n0.f17813d).f15869b;
        if (list != null) {
            int i7 = 0;
            while (i7 < list.size()) {
                if (((C0939l) list.get(i7)).f15447d == 4) {
                    list.remove(i7);
                } else {
                    i7++;
                }
            }
            if (list.size() > 0) {
                ((i) c1017n0.f17813d).f15869b = list;
                c1017n0.M();
            } else {
                ((i) c1017n0.f17813d).f15869b = null;
                c1017n0.M();
            }
        }
        for (Object obj : ((i) c1017n0.f17813d).f15868a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            n(new C1017n0((v4.c) entry.getKey(), c1017n0, (i) entry.getValue(), 22));
        }
    }

    public final void o(AbstractC0933f abstractC0933f) {
        List listL;
        if (AbstractC0930c.f15399a.equals(abstractC0933f.e().f16178a.B())) {
            D d7 = this.f15464m;
            d7.getClass();
            listL = d7.l(abstractC0933f.e(), abstractC0933f, null, false);
        } else {
            D d8 = this.f15465n;
            d8.getClass();
            listL = d8.l(abstractC0933f.e(), abstractC0933f, null, false);
        }
        m(listL);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0155  */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    public final C0934g p(C0934g c0934g) {
        c cVar;
        c cVarB;
        boolean z4;
        c cVarA;
        g gVar;
        C1017n0 c1017n0J = j(c0934g);
        C0934g c0934gA = c1017n0J.A();
        ArrayList arrayListH = h(c1017n0J);
        if (arrayListH.isEmpty()) {
            return c0934gA;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((C0939l) it.next()).f15452z));
        }
        Iterator it2 = arrayListH.iterator();
        while (true) {
            boolean z7 = false;
            if (!it2.hasNext()) {
                break;
            }
            C0939l c0939l = (C0939l) it2.next();
            C0934g c0934gD = C0934g.D(c0934gA, c0939l.f15444a);
            ArrayList arrayList3 = new ArrayList();
            p120q4.k.c(c0934gD != null);
            int i7 = c0939l.f15447d;
            C0934g c0934g2 = c0939l.f15444a;
            y yVar = this.f15454b;
            if (i7 == 6) {
                cVarB = c0939l.f15451y;
                if (cVarB.f13995a != -25) {
                    arrayList3.addAll(this.f15465n.c(c0939l.f15452z, true, false, yVar));
                }
            } else {
                Comparable comparable = null;
                if (i7 == 2) {
                    if (c0939l.f15450x >= 25) {
                        cVarB = c.b("maxretries", null);
                        arrayList3.addAll(this.f15465n.c(c0939l.f15452z, true, false, yVar));
                    } else {
                        r rVarI = this.f15465n.i(c0934g2, arrayList2);
                        if (rVarI == null) {
                            rVarI = v4.j.f17190e;
                        }
                        r rVar = rVarI;
                        c0939l.f15441A = rVar;
                        try {
                            gVar = c0939l.f15445b.j(new p063i4.k(rVar));
                            cVarA = null;
                        } catch (Throwable th) {
                            this.f15461i.a0("Caught Throwable.", th);
                            cVarA = c.a(th);
                            gVar = new g(z7, comparable, 7);
                        }
                        if (gVar.f1063b) {
                            long j = c0939l.f15452z;
                            Long lValueOf = Long.valueOf(j);
                            HashMap mapP = D.p(yVar);
                            r rVar2 = (r) gVar.f1064c;
                            r rVarQ = D.Q(rVar2, new L(rVar), mapP);
                            c0939l.f15442B = rVar2;
                            c0939l.f15443C = rVarQ;
                            long j3 = this.f15463l;
                            this.f15463l = j3 + 1;
                            c0939l.f15452z = j3;
                            arrayList2.remove(lValueOf);
                            arrayList3.addAll(this.f15465n.h(c0939l.f15444a, rVar2, rVarQ, c0939l.f15452z, c0939l.f15449f, false));
                            cVar = null;
                            arrayList3.addAll(this.f15465n.c(j, true, false, yVar));
                        } else {
                            c0934gA = c0934gA;
                            arrayList = arrayList;
                            arrayList3.addAll(this.f15465n.c(c0939l.f15452z, true, false, yVar));
                            z4 = true;
                            cVarB = cVarA;
                        }
                    }
                    m(arrayList3);
                    if (z4) {
                        c0939l.f15447d = 4;
                        b bVar = new b(new f(this, c0934g2), l.m(c0939l.f15441A));
                        q(new x(5, this, c0939l));
                        arrayList = arrayList;
                        arrayList.add(new RunnableC0936i(c0939l, cVarB, bVar, 1));
                    } else {
                        arrayList = arrayList;
                    }
                    c0934gA = c0934gA;
                } else {
                    cVar = null;
                }
                cVarB = cVar;
                z4 = false;
                m(arrayList3);
                if (z4) {
                    c0939l.f15447d = 4;
                    b bVar2 = new b(new f(this, c0934g2), l.m(c0939l.f15441A));
                    q(new x(5, this, c0939l));
                    arrayList = arrayList;
                    arrayList.add(new RunnableC0936i(c0939l, cVarB, bVar2, 1));
                } else {
                    arrayList = arrayList;
                }
                c0934gA = c0934gA;
            }
            c0934gA = c0934gA;
            arrayList = arrayList;
            z4 = true;
            m(arrayList3);
            if (z4) {
                c0939l.f15447d = 4;
                b bVar3 = new b(new f(this, c0934g2), l.m(c0939l.f15441A));
                q(new x(5, this, c0939l));
                arrayList = arrayList;
                arrayList.add(new RunnableC0936i(c0939l, cVarB, bVar3, 1));
            } else {
                arrayList = arrayList;
            }
            c0934gA = c0934gA;
        }
        C0934g c0934g3 = c0934gA;
        n(this.f15458f);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            l((Runnable) arrayList.get(i8));
        }
        C1017n0 c1017n0 = this.f15458f;
        n(c1017n0);
        r(c1017n0);
        return c0934g3;
    }

    public final void q(Runnable runnable) {
        ((L4.b) this.f15460h.f15410e.f8076b).execute(runnable);
    }

    public final void r(C1017n0 c1017n0) {
        i iVar = (i) c1017n0.f17813d;
        if (iVar.f15869b == null) {
            if (iVar.f15868a.isEmpty()) {
                return;
            }
            for (Object obj : ((i) c1017n0.f17813d).f15868a.entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                r(new C1017n0((v4.c) entry.getKey(), c1017n0, (i) entry.getValue(), 22));
            }
            return;
        }
        ArrayList<C0939l> arrayListH = h(c1017n0);
        p120q4.k.c(arrayListH.size() > 0);
        Boolean bool = Boolean.TRUE;
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            if (((C0939l) it.next()).f15447d != 2) {
                bool = Boolean.FALSE;
                break;
            }
        }
        if (bool.booleanValue()) {
            C0934g c0934gA = c1017n0.A();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = arrayListH.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C0939l) it2.next()).f15452z));
            }
            r rVarI = this.f15465n.i(c0934gA, arrayList);
            if (rVarI == null) {
                rVarI = v4.j.f17190e;
            }
            String strX = rVarI.x();
            for (C0939l c0939l : arrayListH) {
                p120q4.k.c(c0939l.f15447d == 2);
                c0939l.f15447d = 3;
                c0939l.f15450x++;
                rVarI = rVarI.q(C0934g.D(c0934gA, c0939l.f15444a), c0939l.f15442B);
            }
            this.f15455c.f("p", c0934gA.l(), rVarI.u(true), strX, new F0(this, c0934gA, (Iterable) arrayListH, (Object) this, 18));
        }
    }

    public final void s(C0934g c0934g, r rVar, j jVar) {
        t tVar = this.f15461i;
        if (tVar.r0()) {
            tVar.W(null, "set: " + c0934g, new Object[0]);
        }
        t tVar2 = this.f15462k;
        if (tVar2.r0()) {
            tVar2.W(null, "set: " + c0934g + " " + rVar, new Object[0]);
        }
        r rVarQ = D.Q(rVar, new L(this.f15465n.i(c0934g, new ArrayList())), D.p(this.f15454b));
        long j = this.f15463l;
        this.f15463l = 1 + j;
        m(this.f15465n.h(c0934g, rVar, rVarQ, j, true, true));
        this.f15455c.f("p", c0934g.l(), rVar.u(true), null, new C0935h(this, c0934g, j, jVar, 1));
        p(a(c0934g, -9));
    }

    public final void t(v4.c cVar, Object obj) {
        if (cVar.equals(AbstractC0930c.f15400b)) {
            this.f15454b.f2247a = ((Long) obj).longValue();
        }
        C0934g c0934g = new C0934g(AbstractC0930c.f15399a, cVar);
        try {
            r rVarA = a.a(obj, v4.j.f17190e);
            e eVar = this.f15456d;
            eVar.f15314b = ((r) eVar.f15314b).q(c0934g, rVarA);
            m(this.f15464m.g(c0934g, rVarA));
        } catch (d e7) {
            this.f15461i.a0("Failed to parse info update", e7);
        }
    }

    public final String toString() {
        return this.f15453a.toString();
    }
}
