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
import k4.AbstractC1341c;
import k4.C1343e;
import w1.P2;
import w1.V0;

/* renamed from: G4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0279l implements D4.a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f2990n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a, reason: collision with root package name */
    public final P6.b f2991a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0273f f2992b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0290x f2993c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0268a f2994d;

    /* renamed from: e, reason: collision with root package name */
    public final D f2995e;

    /* renamed from: f, reason: collision with root package name */
    public k1.g f2996f;

    /* renamed from: g, reason: collision with root package name */
    public final A f2997g;

    /* renamed from: h, reason: collision with root package name */
    public final V0 f2998h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f2999i;
    public final P2 j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f3000k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f3001l;

    /* renamed from: m, reason: collision with root package name */
    public final d1.n f3002m;

    public C0279l(P6.b bVar, A a2, C4.e eVar) {
        p3.f.O("LocalStore was passed an unstarted persistence implementation", bVar.y(), new Object[0]);
        this.f2991a = bVar;
        this.f2997g = a2;
        Y t7 = bVar.t();
        this.f2999i = t7;
        this.j = bVar.l();
        d1.n nVar = new d1.n(0, t7.e());
        nVar.f12365a += 2;
        this.f3002m = nVar;
        this.f2995e = bVar.s();
        V0 v02 = new V0(11);
        this.f2998h = v02;
        this.f3000k = new SparseArray();
        this.f3001l = new HashMap();
        bVar.r().t(v02);
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
        return zVar.f4083e.f14775a.size() + (zVar.f4082d.f14775a.size() + zVar.f4081c.f14775a.size()) > 0;
    }

    public final Z a(E4.I i7) {
        int i8;
        Z j = this.f2999i.j(i7);
        if (j != null) {
            i8 = j.f2954b;
        } else {
            C0284q c0284q = new C0284q();
            this.f2991a.H(new RunnableC0032m0(this, c0284q, i7, 7), "Allocate target");
            i8 = c0284q.f3015a;
            j = (Z) c0284q.f3016b;
        }
        SparseArray sparseArray = this.f3000k;
        if (sparseArray.get(i8) == null) {
            sparseArray.put(i8, j);
            this.f3001l.put(i7, Integer.valueOf(i8));
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P2 b(E4.C c3, boolean z4) {
        H4.n nVar;
        boolean z7 = false;
        E4.I i7 = c3.i();
        Integer num = (Integer) this.f3001l.get(i7);
        Y y4 = this.f2999i;
        Z j = num != null ? (Z) this.f3000k.get(num.intValue()) : y4.j(i7);
        H4.n nVar2 = H4.n.f3332b;
        C1343e c1343e = H4.h.f3317c;
        if (j != null) {
            c1343e = y4.f(j.f2954b);
            nVar = j.f2958f;
        } else {
            nVar = nVar2;
        }
        if (!z4) {
            nVar = nVar2;
        }
        A a2 = this.f2997g;
        p3.f.O("initialize() not called", a2.f2871a, new Object[0]);
        AbstractC1341c e7 = a2.e(c3);
        if (e7 == null) {
            if (!c3.h() && !nVar.equals(nVar2)) {
                C1343e b7 = A.b(c3, ((k1.g) a2.f2873c).v(c1343e));
                if (!A.d(c3, c1343e.f14775a.size(), b7, nVar)) {
                    if (Q0.a.E()) {
                        Q0.a.v(1, "QueryEngine", "Re-using previous result from %s to execute query: %s", nVar.toString(), c3.toString());
                    }
                    H4.b bVar = H4.b.f3303d;
                    Timestamp timestamp = nVar.f3333a;
                    int i8 = timestamp.f11829b + 1;
                    double d7 = i8;
                    long j3 = timestamp.f11828a;
                    e7 = a2.a(b7, c3, new H4.b(new H4.n(d7 == 1.0E9d ? new Timestamp(j3 + 1, 0) : new Timestamp(j3, i8)), H4.h.b(), -1));
                    if (e7 == null) {
                        d1.n nVar3 = new d1.n();
                        nVar3.f12365a = 0;
                        if (Q0.a.E()) {
                            Q0.a.v(1, "QueryEngine", "Using full collection scan to execute query: %s", c3.toString());
                        }
                        e7 = ((k1.g) a2.f2873c).x(c3, H4.b.f3303d, nVar3);
                        if (e7 != null && a2.f2872b) {
                            int size = e7.size();
                            if (nVar3.f12365a < 100) {
                                Q0.a.v(1, "QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", c3.toString(), 100);
                            } else {
                                Q0.a.v(1, "QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", c3.toString(), Integer.valueOf(nVar3.f12365a), Integer.valueOf(size));
                                if (nVar3.f12365a > 2.0d * size) {
                                    ((InterfaceC0273f) a2.f2874d).X(c3.i());
                                    Q0.a.v(1, "QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", c3.toString());
                                }
                            }
                        }
                    }
                }
            }
            e7 = null;
            if (e7 == null) {
            }
        }
        return new P2(10, e7, c1343e, z7);
    }

    public final void c(C4.e eVar) {
        P6.b bVar = this.f2991a;
        InterfaceC0273f o7 = bVar.o(eVar);
        this.f2992b = o7;
        this.f2993c = bVar.p(eVar, o7);
        InterfaceC0268a n2 = bVar.n(eVar);
        this.f2994d = n2;
        InterfaceC0290x interfaceC0290x = this.f2993c;
        InterfaceC0273f interfaceC0273f = this.f2992b;
        D d7 = this.f2995e;
        this.f2996f = new k1.g(d7, interfaceC0290x, n2, interfaceC0273f);
        d7.e(interfaceC0273f);
        k1.g gVar = this.f2996f;
        InterfaceC0273f interfaceC0273f2 = this.f2992b;
        A a2 = this.f2997g;
        a2.f2873c = gVar;
        a2.f2874d = interfaceC0273f2;
        a2.f2871a = true;
    }

    public final V0 d(Map map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Set keySet = map.keySet();
        D d7 = this.f2995e;
        HashMap n2 = d7.n(keySet);
        for (Map.Entry entry : map.entrySet()) {
            H4.h hVar = (H4.h) entry.getKey();
            H4.k kVar = (H4.k) entry.getValue();
            H4.k kVar2 = (H4.k) n2.get(hVar);
            if (kVar.d() != kVar2.d()) {
                hashSet.add(hVar);
            }
            if (kVar.e() && kVar.f3325c.equals(H4.n.f3332b)) {
                arrayList.add(kVar.f3323a);
                hashMap.put(hVar, kVar);
            } else if (t.e.b(kVar2.f3324b, 1) || kVar.f3325c.compareTo(kVar2.f3325c) > 0 || (kVar.f3325c.compareTo(kVar2.f3325c) == 0 && (kVar2.c() || t.e.b(kVar2.f3328f, 2)))) {
                p3.f.O("Cannot add a document when the remote version is zero", !H4.n.f3332b.equals(kVar.f3326d), new Object[0]);
                d7.i(kVar, kVar.f3326d);
                hashMap.put(hVar, kVar);
            } else {
                Q0.a.v(1, "LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", hVar, kVar2.f3325c, kVar.f3325c);
            }
        }
        d7.o(arrayList);
        return new V0(9, hashMap, hashSet, false);
    }
}
