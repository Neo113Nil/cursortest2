package E4;

import A1.C0043s0;
import A1.RunnableC0015e;
import G4.C0269b;
import G4.C0270c;
import G4.C0279l;
import G4.C0280m;
import G4.RunnableC0276i;
import G4.Z;
import U5.k0;
import U5.l0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0279l f2111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0043s0 f2112b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C4.e f2121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p151v2.n f2122m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2113c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2114d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2115e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f2116f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2117g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V0 f2118h = new V0(11);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f2119i = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p023d1.n f2120k = new p023d1.n(1, 1);
    public final HashMap j = new HashMap();

    public H(C0279l c0279l, C0043s0 c0043s0, C4.e eVar) {
        this.f2111a = c0279l;
        this.f2112b = c0043s0;
        this.f2121l = eVar;
    }

    public static void e(l0 l0Var, String str, Object... objArr) {
        k0 k0Var = l0Var.f6547a;
        String str2 = l0Var.f6548b;
        if (str2 == null) {
            str2 = "";
        }
        if ((k0Var == k0.FAILED_PRECONDITION && str2.contains("requires an index")) || k0Var == k0.PERMISSION_DENIED) {
            Q0.a.v(2, "Firestore", "%s: %s", String.format(str, objArr), l0Var);
        }
    }

    public final void a(String str) {
        p113p3.f.O("Trying to call %s before setting callback", this.f2122m != null, str);
    }

    public final void b(p075k4.c cVar, I4.j jVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f2113c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C0279l c0279l = this.f2111a;
            if (!zHasNext) {
                this.f2122m.g(arrayList);
                c0279l.f2991a.H(new RunnableC0276i(c0279l, arrayList2, 0), "notifyLocalViewChanges");
                return;
            }
            E e7 = (E) ((Map.Entry) it.next()).getValue();
            N n2 = e7.f2108c;
            D3.j jVarC = n2.c(cVar, null);
            boolean z4 = false;
            if (jVarC.f1724c) {
                jVarC = n2.c((p075k4.c) c0279l.b(e7.f2106a, false).f17514b, jVarC);
            }
            int i7 = e7.f2107b;
            K4.z zVar = jVar != null ? (K4.z) ((Map) jVar.f3678b).get(Integer.valueOf(i7)) : null;
            if (jVar != null) {
                if (((Map) jVar.f3680d).get(Integer.valueOf(i7)) != null) {
                    z4 = true;
                }
            }
            P2 p2A = e7.f2108c.a(jVarC, zVar, z4);
            l(i7, (List) p2A.f17515c);
            O o7 = (O) p2A.f17514b;
            if (o7 != null) {
                arrayList.add(o7);
                ArrayList arrayList3 = new ArrayList();
                C0269b c0269b = H4.h.f3316b;
                p075k4.e eVar = new p075k4.e(arrayList3, c0269b);
                p075k4.e eVar2 = new p075k4.e(new ArrayList(), c0269b);
                for (C0173f c0173f : o7.f2159d) {
                    int iOrdinal = c0173f.f2179a.ordinal();
                    H4.k kVar = c0173f.f2180b;
                    if (iOrdinal == 0) {
                        eVar2 = eVar2.l(kVar.f3323a);
                    } else if (iOrdinal == 1) {
                        eVar = eVar.l(kVar.f3323a);
                    }
                }
                arrayList2.add(new C0280m(i7, o7.f2160e, eVar, eVar2));
            }
        }
    }

    public final void c(I4.j jVar) {
        a("handleRemoteEvent");
        for (Map.Entry entry : ((Map) jVar.f3678b).entrySet()) {
            Integer num = (Integer) entry.getKey();
            K4.z zVar = (K4.z) entry.getValue();
            G g3 = (G) this.f2117g.get(num);
            if (g3 != null) {
                int size = zVar.f4081c.f14781a.size();
                p075k4.e eVar = zVar.f4082d;
                int size2 = eVar.f14781a.size() + size;
                p075k4.e eVar2 = zVar.f4083e;
                p113p3.f.O("Limbo resolution for single document contains multiple changes.", eVar2.f14781a.size() + size2 <= 1, new Object[0]);
                if (zVar.f4081c.f14781a.size() > 0) {
                    g3.f2110b = true;
                } else if (eVar.f14781a.size() > 0) {
                    p113p3.f.O("Received change for limbo target document without add.", g3.f2110b, new Object[0]);
                } else if (eVar2.f14781a.size() > 0) {
                    p113p3.f.O("Received remove for limbo target document without add.", g3.f2110b, new Object[0]);
                    g3.f2110b = false;
                }
            }
        }
        C0279l c0279l = this.f2111a;
        b((p075k4.c) c0279l.f2991a.G("Apply remote event", new B4.E(c0279l, jVar, (H4.n) jVar.f3679c, 1)), jVar);
    }

    public final int d(C c3, boolean z4) {
        a("listen");
        HashMap map = this.f2113c;
        p113p3.f.O("We already listen to query: %s", !map.containsKey(c3), c3);
        I i7 = c3.i();
        C0279l c0279l = this.f2111a;
        Z zA = c0279l.a(i7);
        int i8 = zA.f2954b;
        P2 p2B = c0279l.b(c3, true);
        HashMap map2 = this.f2114d;
        boolean z7 = (map2.get(Integer.valueOf(i8)) != null ? ((E) map.get((C) ((List) map2.get(Integer.valueOf(i8))).get(0))).f2108c.f2150b : 1) == 3;
        p075k4.e eVar = H4.h.f3317c;
        K4.z zVar = new K4.z(zA.f2959g, z7, eVar, eVar, eVar);
        N n2 = new N(c3, (p075k4.e) p2B.f17515c);
        P2 p2A = n2.a(n2.c((p075k4.c) p2B.f17514b, null), zVar, false);
        l(i8, (List) p2A.f17515c);
        map.put(c3, new E(c3, i8, n2));
        if (!map2.containsKey(Integer.valueOf(i8))) {
            map2.put(Integer.valueOf(i8), new ArrayList(1));
        }
        ((List) map2.get(Integer.valueOf(i8))).add(c3);
        this.f2122m.g(Collections.singletonList((O) p2A.f17514b));
        if (z4) {
            this.f2112b.g(zA);
        }
        return zA.f2954b;
    }

    public final void f(int i7, l0 l0Var) {
        Map map = (Map) this.f2119i.get(this.f2121l);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i7);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(numValueOf);
            if (taskCompletionSource != null) {
                if (l0Var != null) {
                    taskCompletionSource.setException(L4.r.g(l0Var));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    public final void g() {
        while (true) {
            LinkedHashSet linkedHashSet = this.f2115e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashMap map = this.f2116f;
            if (map.size() >= 100) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            H4.h hVar = (H4.h) it.next();
            it.remove();
            p023d1.n nVar = this.f2120k;
            int i7 = nVar.f12371a;
            nVar.f12371a = i7 + 2;
            this.f2117g.put(Integer.valueOf(i7), new G(hVar));
            map.put(hVar, Integer.valueOf(i7));
            this.f2112b.g(new Z(new C(hVar.f3318a, null).i(), i7, -1L, G4.B.f2878d));
        }
    }

    public final void h(int i7, l0 l0Var) {
        HashMap map = this.f2114d;
        for (C c3 : (List) map.get(Integer.valueOf(i7))) {
            this.f2113c.remove(c3);
            if (!l0Var.e()) {
                HashMap map2 = (HashMap) this.f2122m.f17144c;
                C0175h c0175h = (C0175h) map2.get(c3);
                if (c0175h != null) {
                    for (D d7 : c0175h.f2185a) {
                        d7.f2102c.a(null, L4.r.g(l0Var));
                    }
                }
                map2.remove(c3);
                e(l0Var, "Listen for %s failed", c3);
            }
        }
        map.remove(Integer.valueOf(i7));
        V0 v6 = this.f2118h;
        p075k4.e eVarT = v6.T(i7);
        v6.W(i7);
        Iterator it = eVarT.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return;
            }
            H4.h hVar = (H4.h) f7.next();
            if (!v6.l(hVar)) {
                i(hVar);
            }
        }
    }

    public final void i(H4.h hVar) {
        this.f2115e.remove(hVar);
        HashMap map = this.f2116f;
        Integer num = (Integer) map.get(hVar);
        if (num != null) {
            this.f2112b.q(num.intValue());
            map.remove(hVar);
            this.f2117g.remove(num);
            g();
        }
    }

    public final void j(int i7) {
        HashMap map = this.j;
        if (map.containsKey(Integer.valueOf(i7))) {
            Iterator it = ((List) map.get(Integer.valueOf(i7))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            map.remove(Integer.valueOf(i7));
        }
    }

    public final void k(C c3, boolean z4) {
        a("stopListening");
        HashMap map = this.f2113c;
        E e7 = (E) map.get(c3);
        p113p3.f.O("Trying to stop listening to a query not found", e7 != null, new Object[0]);
        map.remove(c3);
        int i7 = e7.f2107b;
        List list = (List) this.f2114d.get(Integer.valueOf(i7));
        list.remove(c3);
        if (list.isEmpty()) {
            C0279l c0279l = this.f2111a;
            c0279l.f2991a.H(new RunnableC0015e(c0279l, i7, 1), "Release target");
            if (z4) {
                this.f2112b.q(i7);
            }
            h(i7, l0.f6536e);
        }
    }

    public final void l(int i7, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            int iOrdinal = xVar.f2245a.ordinal();
            V0 v6 = this.f2118h;
            H4.h hVar = xVar.f2246b;
            if (iOrdinal == 0) {
                v6.getClass();
                C0270c c0270c = new C0270c(hVar, i7);
                v6.f17568b = ((p075k4.e) v6.f17568b).l(c0270c);
                v6.f17569c = ((p075k4.e) v6.f17569c).l(c0270c);
                if (!this.f2116f.containsKey(hVar)) {
                    LinkedHashSet linkedHashSet = this.f2115e;
                    if (!linkedHashSet.contains(hVar)) {
                        Q0.a.v(1, "H", "New document in limbo: %s", hVar);
                        linkedHashSet.add(hVar);
                        g();
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    p113p3.f.F("Unknown limbo change type: %s", xVar.f2245a);
                    throw null;
                }
                Q0.a.v(1, "H", "Document no longer in limbo: %s", hVar);
                v6.getClass();
                C0270c c0270c2 = new C0270c(hVar, i7);
                v6.f17568b = ((p075k4.e) v6.f17568b).t(c0270c2);
                v6.f17569c = ((p075k4.e) v6.f17569c).t(c0270c2);
                if (!v6.l(hVar)) {
                    i(hVar);
                }
            }
        }
    }
}
