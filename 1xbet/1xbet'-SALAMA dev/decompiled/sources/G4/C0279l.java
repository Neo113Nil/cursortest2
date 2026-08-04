package G4;

import A1.RunnableC0032m0;
import android.util.SparseArray;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: renamed from: G4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0279l implements D4.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f2990n = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P6.b f2991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0273f f2992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0290x f2993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0268a f2994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f2995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p072k1.g f2996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A f2997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V0 f2998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y f2999i;
    public final P2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray f3000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f3001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p023d1.n f3002m;

    public C0279l(P6.b bVar, A a2, C4.e eVar) {
        p113p3.f.O("LocalStore was passed an unstarted persistence implementation", bVar.y(), new Object[0]);
        this.f2991a = bVar;
        this.f2997g = a2;
        Y yT = bVar.t();
        this.f2999i = yT;
        this.j = bVar.l();
        p023d1.n nVar = new p023d1.n(0, yT.e());
        nVar.f12371a += 2;
        this.f3002m = nVar;
        this.f2995e = bVar.s();
        V0 v6 = new V0(11);
        this.f2998h = v6;
        this.f3000k = new SparseArray();
        this.f3001l = new HashMap();
        bVar.r().t(v6);
        c(eVar);
    }

    public static boolean e(Z z4, Z z7, K4.z zVar) {
        if (z4.f2959g.isEmpty()) {
            return true;
        }
        long j = z7.f2957e.f3333a.f11828a - z4.f2957e.f3333a.f11828a;
        long j3 = f2990n;
        if (j >= j3) {
            return true;
        }
        if (z7.f2958f.f3333a.f11828a - z4.f2958f.f3333a.f11828a >= j3) {
            return true;
        }
        if (zVar == null) {
            return false;
        }
        return zVar.f4083e.f14781a.size() + (zVar.f4082d.f14781a.size() + zVar.f4081c.f14781a.size()) > 0;
    }

    public final Z a(E4.I i7) {
        int i8;
        Z zJ = this.f2999i.j(i7);
        if (zJ != null) {
            i8 = zJ.f2954b;
        } else {
            C0284q c0284q = new C0284q();
            this.f2991a.H(new RunnableC0032m0(this, c0284q, i7, 7), "Allocate target");
            i8 = c0284q.f3015a;
            zJ = (Z) c0284q.f3016b;
        }
        SparseArray sparseArray = this.f3000k;
        if (sparseArray.get(i8) == null) {
            sparseArray.put(i8, zJ);
            this.f3001l.put(i7, Integer.valueOf(i8));
        }
        return zJ;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    public final P2 b(E4.C c3, boolean z4) {
        H4.n nVar;
        boolean z7 = false;
        E4.I i7 = c3.i();
        Integer num = (Integer) this.f3001l.get(i7);
        Y y4 = this.f2999i;
        Z zJ = num != null ? (Z) this.f3000k.get(num.intValue()) : y4.j(i7);
        H4.n nVar2 = H4.n.f3332b;
        p075k4.e eVarF = H4.h.f3317c;
        if (zJ != null) {
            eVarF = y4.f(zJ.f2954b);
            nVar = zJ.f2958f;
        } else {
            nVar = nVar2;
        }
        if (!z4) {
            nVar = nVar2;
        }
        A a2 = this.f2997g;
        p113p3.f.O("initialize() not called", a2.f2871a, new Object[0]);
        p075k4.c cVarE = a2.e(c3);
        if (cVarE == null) {
            if (c3.h() || nVar.equals(nVar2)) {
                cVarE = null;
            } else {
                p075k4.e eVarB = A.b(c3, ((p072k1.g) a2.f2873c).v(eVarF));
                if (A.d(c3, eVarF.f14781a.size(), eVarB, nVar)) {
                    cVarE = null;
                } else {
                    if (Q0.a.E()) {
                        Q0.a.v(1, "QueryEngine", "Re-using previous result from %s to execute query: %s", nVar.toString(), c3.toString());
                    }
                    H4.b bVar = H4.b.f3303d;
                    Timestamp timestamp = nVar.f3333a;
                    int i8 = timestamp.f11829b + 1;
                    double d7 = i8;
                    long j = timestamp.f11828a;
                    cVarE = a2.a(eVarB, c3, new H4.b(new H4.n(d7 == 1.0E9d ? new Timestamp(j + 1, 0) : new Timestamp(j, i8)), H4.h.b(), -1));
                }
            }
            if (cVarE == null) {
                p023d1.n nVar3 = new p023d1.n();
                nVar3.f12371a = 0;
                if (Q0.a.E()) {
                    Q0.a.v(1, "QueryEngine", "Using full collection scan to execute query: %s", c3.toString());
                }
                cVarE = ((p072k1.g) a2.f2873c).x(c3, H4.b.f3303d, nVar3);
                if (cVarE != null && a2.f2872b) {
                    int size = cVarE.size();
                    if (nVar3.f12371a < 100) {
                        Q0.a.v(1, "QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", c3.toString(), 100);
                    } else {
                        Q0.a.v(1, "QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", c3.toString(), Integer.valueOf(nVar3.f12371a), Integer.valueOf(size));
                        if (nVar3.f12371a > 2.0d * ((double) size)) {
                            ((InterfaceC0273f) a2.f2874d).X(c3.i());
                            Q0.a.v(1, "QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", c3.toString());
                        }
                    }
                }
            }
        }
        return new P2(10, cVarE, eVarF, z7);
    }

    public final void c(C4.e eVar) {
        P6.b bVar = this.f2991a;
        InterfaceC0273f interfaceC0273fO = bVar.o(eVar);
        this.f2992b = interfaceC0273fO;
        this.f2993c = bVar.p(eVar, interfaceC0273fO);
        InterfaceC0268a interfaceC0268aN = bVar.n(eVar);
        this.f2994d = interfaceC0268aN;
        InterfaceC0290x interfaceC0290x = this.f2993c;
        InterfaceC0273f interfaceC0273f = this.f2992b;
        D d7 = this.f2995e;
        this.f2996f = new p072k1.g(d7, interfaceC0290x, interfaceC0268aN, interfaceC0273f);
        d7.e(interfaceC0273f);
        p072k1.g gVar = this.f2996f;
        InterfaceC0273f interfaceC0273f2 = this.f2992b;
        A a2 = this.f2997g;
        a2.f2873c = gVar;
        a2.f2874d = interfaceC0273f2;
        a2.f2871a = true;
    }

    public final V0 d(Map map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Set setKeySet = map.keySet();
        D d7 = this.f2995e;
        HashMap mapN = d7.n(setKeySet);
        for (Map.Entry entry : map.entrySet()) {
            H4.h hVar = (H4.h) entry.getKey();
            H4.k kVar = (H4.k) entry.getValue();
            H4.k kVar2 = (H4.k) mapN.get(hVar);
            if (kVar.d() != kVar2.d()) {
                hashSet.add(hVar);
            }
            if (kVar.e() && kVar.f3325c.equals(H4.n.f3332b)) {
                arrayList.add(kVar.f3323a);
                map2.put(hVar, kVar);
            } else if (p136t.e.b(kVar2.f3324b, 1) || kVar.f3325c.compareTo(kVar2.f3325c) > 0 || (kVar.f3325c.compareTo(kVar2.f3325c) == 0 && (kVar2.c() || p136t.e.b(kVar2.f3328f, 2)))) {
                p113p3.f.O("Cannot add a document when the remote version is zero", !H4.n.f3332b.equals(kVar.f3326d), new Object[0]);
                d7.i(kVar, kVar.f3326d);
                map2.put(hVar, kVar);
            } else {
                Q0.a.v(1, "LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", hVar, kVar2.f3325c, kVar.f3325c);
            }
        }
        d7.o(arrayList);
        return new V0(9, map2, hashSet, false);
    }
}
