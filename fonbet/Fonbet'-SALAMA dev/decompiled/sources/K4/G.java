package K4;

import A1.C0043s0;
import A1.RunnableC0015e;
import E4.EnumC0172e;
import G4.C0279l;
import G4.C0282o;
import G4.Z;
import U5.c0;
import U5.l0;
import Y4.C0581k;
import Y4.C0596t;
import Y4.C0597u;
import Y4.C0600x;
import Y4.D0;
import a5.C0622a;
import b6.AbstractC0791c;
import b6.C0790b;
import com.google.protobuf.AbstractC0891a;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0909j;
import com.google.protobuf.C0928t;
import com.google.protobuf.I;
import e3.C1023h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k4.AbstractC1341c;
import k4.C1343e;
import w1.P2;

/* loaded from: classes2.dex */
public final class G extends AbstractC0315b {

    /* renamed from: s, reason: collision with root package name */
    public static final C0909j f3983s = AbstractC0911k.f12212b;

    /* renamed from: r, reason: collision with root package name */
    public final P2 f3984r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G(r rVar, L4.f fVar, P2 p22, v vVar) {
        super(rVar, r0, fVar, L4.e.f4351b, L4.e.f4350a, vVar);
        H2.r rVar2 = Y4.D.f7693e;
        if (rVar2 == null) {
            synchronized (Y4.D.class) {
                try {
                    rVar2 = Y4.D.f7693e;
                    if (rVar2 == null) {
                        C0282o c3 = H2.r.c();
                        c3.f3012d = c0.f6471c;
                        c3.f3013e = H2.r.b("google.firestore.v1.Firestore", "Listen");
                        c3.f3009a = true;
                        Y4.G z4 = Y4.G.z();
                        C0928t c0928t = AbstractC0791c.f10155a;
                        c3.f3010b = new C0790b(z4);
                        c3.f3011c = new C0790b(Y4.H.v());
                        rVar2 = c3.d();
                        Y4.D.f7693e = rVar2;
                    }
                } finally {
                }
            }
        }
        this.f3984r = p22;
    }

    @Override // K4.AbstractC0315b
    public final void e(AbstractC0891a abstractC0891a) {
        f((Y4.H) abstractC0891a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0364, code lost:
    
        if (r0.f4016b == 0) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.protobuf.I, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    @Override // K4.AbstractC0315b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Y4.H h6) {
        F f7;
        l0 l0Var;
        Object e7;
        HashMap hashMap;
        E4.z zVar;
        C0321h c0321h;
        H4.f fVar;
        Iterator it;
        E4.z zVar2;
        H4.f fVar2;
        HashMap hashMap2;
        HashMap hashMap3;
        H4.k kVar;
        H4.h hVar;
        l0 l0Var2;
        Object c3;
        this.f4005k.f4384f = 0L;
        P2 p22 = this.f3984r;
        p22.getClass();
        int e8 = t.e.e(h6.A());
        F f8 = F.f3979c;
        char c4 = 2;
        if (e8 == 0) {
            D0 B7 = h6.B();
            int ordinal = B7.z().ordinal();
            if (ordinal == 0) {
                f7 = F.f3977a;
            } else if (ordinal == 1) {
                f7 = F.f3978b;
            } else if (ordinal == 2) {
                C0622a v6 = B7.v();
                l0Var = l0.c(v6.v()).g(v6.x());
                f7 = f8;
                e7 = new E(f7, B7.B(), B7.y(), l0Var);
            } else if (ordinal == 3) {
                f7 = F.f3980d;
            } else {
                if (ordinal != 4) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                f7 = F.f3981e;
            }
            l0Var = null;
            e7 = new E(f7, B7.B(), B7.y(), l0Var);
        } else if (e8 != 1) {
            if (e8 == 2) {
                C0597u x4 = h6.x();
                I y4 = x4.y();
                H4.k h7 = H4.k.h(p22.j(x4.w()), P2.n(x4.x()));
                c3 = new C(Collections.emptyList(), y4, h7.f3323a, h7);
            } else if (e8 == 3) {
                C0600x y5 = h6.y();
                c3 = new C(Collections.emptyList(), y5.x(), p22.j(y5.w()), null);
            } else {
                if (e8 != 4) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                Y4.C z4 = h6.z();
                e7 = new D(z4.x(), new B.v(z4.v(), z4.y(), 2));
            }
            e7 = c3;
        } else {
            C0596t w7 = h6.w();
            I y7 = w7.y();
            I x7 = w7.x();
            H4.h j = p22.j(w7.w().A());
            H4.n n2 = P2.n(w7.w().B());
            p3.f.O("Got a document change without an update time", !n2.equals(H4.n.f3332b), new Object[0]);
            H4.l e9 = H4.l.e(w7.w().z());
            H4.k kVar2 = new H4.k(j);
            kVar2.a(n2, e9);
            e7 = new C(y7, x7, j, kVar2);
        }
        H4.n n7 = h6.A() != 1 ? H4.n.f3332b : h6.B().A() != 0 ? H4.n.f3332b : P2.n(h6.B().x());
        C0043s0 c0043s0 = ((v) this.f4006l).f4070a;
        ((u) c0043s0.f558h).e(2);
        p3.f.O("WatchStream and WatchStreamAggregator should both be non-null", (((G) c0043s0.f559i) == null || ((Q3.o) c0043s0.f560k) == null) ? false : true, new Object[0]);
        boolean z7 = e7 instanceof E;
        E e10 = z7 ? (E) e7 : null;
        HashMap hashMap4 = c0043s0.f551a;
        E4.z zVar3 = (E4.z) ((C1023h) c0043s0.f554d).f12667a;
        if (e10 != null && e10.f3973c.equals(f8) && (l0Var2 = e10.f3976f) != null) {
            for (Integer num : e10.f3974d) {
                if (hashMap4.containsKey(num)) {
                    hashMap4.remove(num);
                    Q3.o oVar = (Q3.o) c0043s0.f560k;
                    num.getClass();
                    ((HashMap) oVar.f5823b).remove(num);
                    int intValue = num.intValue();
                    E4.H e11 = zVar3.e();
                    e11.a("handleRejectedListen");
                    HashMap hashMap5 = e11.f2117g;
                    E4.G g3 = (E4.G) hashMap5.get(Integer.valueOf(intValue));
                    H4.h hVar2 = g3 != null ? g3.f2109a : null;
                    if (hVar2 != null) {
                        e11.f2116f.remove(hVar2);
                        hashMap5.remove(Integer.valueOf(intValue));
                        e11.g();
                        H4.n nVar = H4.n.f3332b;
                        e11.c(new I4.j(nVar, Collections.emptyMap(), Collections.emptyMap(), Collections.singletonMap(hVar2, H4.k.h(hVar2, nVar)), Collections.singleton(hVar2)));
                    } else {
                        C0279l c0279l = e11.f2111a;
                        c0279l.f2991a.H(new RunnableC0015e(c0279l, intValue, 1), "Release target");
                        e11.h(intValue, l0Var2);
                    }
                }
            }
            return;
        }
        if (!(e7 instanceof C)) {
            if (e7 instanceof D) {
                Q3.o oVar2 = (Q3.o) c0043s0.f560k;
                D d7 = (D) e7;
                oVar2.getClass();
                B.v vVar = d7.f3972d;
                int i7 = d7.f3971c;
                Z l7 = oVar2.l(i7);
                if (l7 != null) {
                    E4.I i8 = l7.f2953a;
                    boolean f9 = i8.f();
                    int i9 = vVar.f965b;
                    if (!f9) {
                        z a2 = oVar2.e(i7).a();
                        C0043s0 c0043s02 = (C0043s0) oVar2.f5822a;
                        int size = (a2.f4081c.f14775a.size() + ((C1023h) c0043s02.f554d).a0(i7).f14775a.size()) - a2.f4083e.f14775a.size();
                        if (size != i9) {
                            C0581k c0581k = (C0581k) vVar.f966c;
                            if (c0581k != null && c0581k.y()) {
                                try {
                                    c0321h = C0321h.b(c0581k.v().v(), c0581k.v().x(), c0581k.x());
                                } catch (C0320g e12) {
                                    Q0.a.v(2, "WatchChangeAggregator", "Applying bloom filter failed: (" + e12.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
                                }
                            }
                            c0321h = null;
                            H4.f fVar3 = (H4.f) oVar2.f5827f;
                            if (c0321h != null) {
                                C1343e a02 = ((C1023h) c0043s02.f554d).a0(i7);
                                StringBuilder sb = new StringBuilder("projects/");
                                sb.append(fVar3.f3313a);
                                sb.append("/databases/");
                                String i10 = e1.k.i(sb, fVar3.f3314b, "/documents/");
                                Iterator it2 = a02.iterator();
                                int i11 = 0;
                                while (true) {
                                    E3.F f10 = (E3.F) it2;
                                    if (((Iterator) f10.f1994b).hasNext()) {
                                        H4.h hVar3 = (H4.h) f10.next();
                                        StringBuilder c7 = t.e.c(i10);
                                        String str = i10;
                                        c7.append(hVar3.f3318a.c());
                                        String sb2 = c7.toString();
                                        int i12 = c0321h.f4016b;
                                        if (i12 == 0) {
                                            it = it2;
                                            fVar2 = fVar3;
                                            hashMap2 = hashMap4;
                                            zVar2 = zVar3;
                                        } else {
                                            it = it2;
                                            byte[] digest = ((MessageDigest) c0321h.f4019e).digest(sb2.getBytes(StandardCharsets.UTF_8));
                                            zVar2 = zVar3;
                                            if (digest.length != 16) {
                                                throw new RuntimeException(e1.k.g(new StringBuilder("Invalid md5 hash array length: "), digest.length, " (expected 16)"));
                                            }
                                            long d8 = C0321h.d(0, digest);
                                            long d9 = C0321h.d(8, digest);
                                            int i13 = 0;
                                            while (i13 < c0321h.f4017c) {
                                                long j3 = (i13 * d9) + d8;
                                                hashMap2 = hashMap4;
                                                fVar2 = fVar3;
                                                long j7 = i12;
                                                long j8 = j3 - ((((j3 >>> 1) / j7) << 1) * j7);
                                                if (j8 < j7) {
                                                    j7 = 0;
                                                }
                                                int i14 = (int) (j8 - j7);
                                                if (((1 << (i14 % 8)) & ((AbstractC0911k) c0321h.f4018d).t(i14 / 8)) != 0) {
                                                    i13++;
                                                    hashMap4 = hashMap2;
                                                    fVar3 = fVar2;
                                                }
                                            }
                                            fVar2 = fVar3;
                                            hashMap2 = hashMap4;
                                            i10 = str;
                                            it2 = it;
                                            zVar3 = zVar2;
                                            hashMap4 = hashMap2;
                                            fVar3 = fVar2;
                                        }
                                        oVar2.m(i7, hVar3, null);
                                        i11++;
                                        i10 = str;
                                        it2 = it;
                                        zVar3 = zVar2;
                                        hashMap4 = hashMap2;
                                        fVar3 = fVar2;
                                    } else {
                                        fVar = fVar3;
                                        hashMap = hashMap4;
                                        zVar = zVar3;
                                        c4 = i9 == size - i11 ? (char) 1 : (char) 3;
                                    }
                                }
                            } else {
                                fVar = fVar3;
                                hashMap = hashMap4;
                                zVar = zVar3;
                            }
                            if (c4 != 1) {
                                oVar2.n(i7);
                                ((HashMap) oVar2.f5826e).put(Integer.valueOf(i7), c4 == 3 ? G4.B.f2877c : G4.B.f2876b);
                            }
                            B b7 = B.f3965b;
                            H4.f fVar4 = fVar;
                            String str2 = fVar4.f3313a;
                            if (c0581k != null) {
                                c0581k.v().v().size();
                                c0581k.v().getClass();
                            }
                            if (str2 == null) {
                                throw new NullPointerException("Null projectId");
                            }
                            if (fVar4.f3314b == null) {
                                throw new NullPointerException("Null databaseId");
                            }
                            Iterator it3 = b7.f3966a.iterator();
                            while (it3.hasNext()) {
                                if (((AtomicReference) it3.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } else if (i9 == 0) {
                        H4.h hVar4 = new H4.h(i8.f2126d);
                        oVar2.m(i7, hVar4, H4.k.h(hVar4, H4.n.f3332b));
                    } else {
                        p3.f.O("Single document existence filter with count: %d", i9 == 1, Integer.valueOf(i9));
                    }
                }
            } else {
                hashMap = hashMap4;
                zVar = zVar3;
                p3.f.O("Expected watchChange to be an instance of WatchTargetChange", z7, new Object[0]);
                Q3.o oVar3 = (Q3.o) c0043s0.f560k;
                E e13 = (E) e7;
                oVar3.getClass();
                ?? r12 = e13.f3974d;
                boolean isEmpty = r12.isEmpty();
                HashMap hashMap6 = (HashMap) oVar3.f5823b;
                if (isEmpty) {
                    r12 = new ArrayList();
                    for (Integer num2 : hashMap6.keySet()) {
                        if (oVar3.i(num2.intValue())) {
                            r12.add(num2);
                        }
                    }
                }
                for (Integer num3 : r12) {
                    int intValue2 = num3.intValue();
                    A e14 = oVar3.e(intValue2);
                    F f11 = e13.f3973c;
                    int ordinal2 = f11.ordinal();
                    AbstractC0911k abstractC0911k = e13.f3975e;
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            int i15 = e14.f3960a - 1;
                            e14.f3960a = i15;
                            if (i15 == 0) {
                                e14.f3962c = false;
                                e14.f3961b.clear();
                            }
                            if (!abstractC0911k.isEmpty()) {
                                e14.f3962c = true;
                                e14.f3963d = abstractC0911k;
                            }
                        } else if (ordinal2 == 2) {
                            int i16 = e14.f3960a - 1;
                            e14.f3960a = i16;
                            if (i16 == 0) {
                                hashMap6.remove(num3);
                            }
                            p3.f.O("WatchChangeAggregator does not handle errored targets", e13.f3976f == null, new Object[0]);
                        } else if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                p3.f.F("Unknown target watch change state: %s", f11);
                                throw null;
                            }
                            if (oVar3.i(intValue2)) {
                                oVar3.n(intValue2);
                                if (!abstractC0911k.isEmpty()) {
                                    e14.f3962c = true;
                                    e14.f3963d = abstractC0911k;
                                }
                            }
                        } else if (oVar3.i(intValue2)) {
                            e14.f3962c = true;
                            e14.f3964e = true;
                            if (!abstractC0911k.isEmpty()) {
                                e14.f3962c = true;
                                e14.f3963d = abstractC0911k;
                            }
                        }
                    } else if (oVar3.i(intValue2) && !abstractC0911k.isEmpty()) {
                        e14.f3962c = true;
                        e14.f3963d = abstractC0911k;
                    }
                }
            }
            if (!n7.equals(H4.n.f3332b) || n7.compareTo(((C0279l) c0043s0.f555e).f2999i.g()) < 0) {
            }
            p3.f.O("Can't raise event for unknown SnapshotVersion", !n7.equals(r0), new Object[0]);
            Q3.o oVar4 = (Q3.o) c0043s0.f560k;
            oVar4.getClass();
            HashMap hashMap7 = new HashMap();
            for (Map.Entry entry : ((HashMap) oVar4.f5823b).entrySet()) {
                Integer num4 = (Integer) entry.getKey();
                int intValue3 = num4.intValue();
                A a4 = (A) entry.getValue();
                Z l8 = oVar4.l(intValue3);
                if (l8 != null) {
                    if (a4.f3964e) {
                        E4.I i17 = l8.f2953a;
                        if (i17.f()) {
                            H4.h hVar5 = new H4.h(i17.f2126d);
                            if (((HashMap) oVar4.f5824c).get(hVar5) == null && !((C1023h) ((C0043s0) oVar4.f5822a).f554d).a0(intValue3).f14775a.l(hVar5)) {
                                oVar4.m(intValue3, hVar5, H4.k.h(hVar5, n7));
                            }
                        }
                    }
                    if (a4.f3962c) {
                        hashMap7.put(num4, a4.a());
                        a4.f3962c = false;
                        a4.f3961b.clear();
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry2 : ((HashMap) oVar4.f5825d).entrySet()) {
                H4.h hVar6 = (H4.h) entry2.getKey();
                Iterator it4 = ((Set) entry2.getValue()).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        hashSet.add(hVar6);
                        break;
                    }
                    Z l9 = oVar4.l(((Integer) it4.next()).intValue());
                    if (l9 != null) {
                        if (!l9.f2956d.equals(G4.B.f2878d)) {
                            break;
                        }
                    }
                }
            }
            Iterator it5 = ((HashMap) oVar4.f5824c).values().iterator();
            while (it5.hasNext()) {
                ((H4.k) it5.next()).f3326d = n7;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap7);
            I4.j jVar = new I4.j(n7, unmodifiableMap, Collections.unmodifiableMap((HashMap) oVar4.f5826e), Collections.unmodifiableMap((HashMap) oVar4.f5824c), Collections.unmodifiableSet(hashSet));
            oVar4.f5824c = new HashMap();
            oVar4.f5825d = new HashMap();
            oVar4.f5826e = new HashMap();
            for (Map.Entry entry3 : unmodifiableMap.entrySet()) {
                z zVar4 = (z) entry3.getValue();
                if (zVar4.f4079a.isEmpty()) {
                    hashMap3 = hashMap;
                } else {
                    Integer num5 = (Integer) entry3.getKey();
                    num5.getClass();
                    hashMap3 = hashMap;
                    Z z8 = (Z) hashMap3.get(num5);
                    if (z8 != null) {
                        hashMap3.put(num5, z8.a(zVar4.f4079a, n7));
                    }
                }
                hashMap = hashMap3;
            }
            HashMap hashMap8 = hashMap;
            for (Map.Entry entry4 : ((Map) jVar.f3680d).entrySet()) {
                Integer num6 = (Integer) entry4.getKey();
                int intValue4 = num6.intValue();
                Z z9 = (Z) hashMap8.get(num6);
                if (z9 != null) {
                    hashMap8.put(num6, z9.a(AbstractC0911k.f12212b, z9.f2957e));
                    c0043s0.l(intValue4);
                    c0043s0.m(new Z(z9.f2953a, intValue4, z9.f2955c, (G4.B) entry4.getValue()));
                }
            }
            zVar.e().c(jVar);
            return;
        }
        Q3.o oVar5 = (Q3.o) c0043s0.f560k;
        C c8 = (C) e7;
        oVar5.getClass();
        Iterator it6 = c8.f3967c.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            kVar = c8.f3970f;
            hVar = c8.f3969e;
            if (!hasNext) {
                break;
            }
            Integer num7 = (Integer) it6.next();
            int intValue5 = num7.intValue();
            if (kVar == null || !kVar.d()) {
                oVar5.m(intValue5, hVar, kVar);
            } else if (oVar5.i(intValue5)) {
                AbstractC1341c abstractC1341c = ((C1023h) ((C0043s0) oVar5.f5822a).f554d).a0(intValue5).f14775a;
                H4.h hVar7 = kVar.f3323a;
                EnumC0172e enumC0172e = abstractC1341c.l(hVar7) ? EnumC0172e.f2176c : EnumC0172e.f2175b;
                A e15 = oVar5.e(intValue5);
                e15.f3962c = true;
                e15.f3961b.put(hVar7, enumC0172e);
                ((HashMap) oVar5.f5824c).put(hVar7, kVar);
                Set set = (Set) ((HashMap) oVar5.f5825d).get(hVar7);
                if (set == null) {
                    set = new HashSet();
                    ((HashMap) oVar5.f5825d).put(hVar7, set);
                }
                set.add(num7);
            }
        }
        Iterator it7 = c8.f3968d.iterator();
        while (it7.hasNext()) {
            oVar5.m(((Integer) it7.next()).intValue(), hVar, kVar);
        }
        hashMap = hashMap4;
        zVar = zVar3;
        if (n7.equals(H4.n.f3332b)) {
        }
    }
}
