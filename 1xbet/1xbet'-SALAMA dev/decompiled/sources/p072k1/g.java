package p072k1;

import A1.C0041r0;
import A1.C0043s0;
import E1.e;
import E3.AbstractC0158p;
import E4.C;
import G4.C0269b;
import G4.C0286t;
import G4.C0292z;
import G4.InterfaceC0268a;
import G4.InterfaceC0273f;
import G4.InterfaceC0290x;
import I4.f;
import I4.i;
import Q3.o;
import R3.d;
import V3.Z;
import V3.f0;
import V3.r0;
import W5.Z1;
import W5.f2;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.fragment.app.AbstractComponentCallbacksC0701v;
import androidx.fragment.app.T;
import androidx.fragment.app.V;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.Timestamp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.C0774u;
import p018c2.C0779z;
import p018c2.D;
import p018c2.I;
import p018c2.J;
import p023d1.n;
import p042f4.C0894c;
import p075k4.h;
import p075k4.j;
import p075k4.l;
import p075k4.m;
import p083l4.u;
import p098n4.C0934g;
import p098n4.C0940m;
import p111p1.a;
import p120q4.b;
import p151v2.t;
import p155w1.AbstractC0997i0;
import p155w1.C1008l;
import p155w1.C1021o0;
import p155w1.C1025p0;
import p155w1.C1034s0;
import p155w1.M0;
import p155w1.N0;
import v4.c;
import v4.k;
import v4.p;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public final class g implements J, e, Continuation, b, u, p141t4.b, M0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f14679e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14683d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f14680a = obj;
        this.f14681b = obj2;
        this.f14682c = obj3;
        this.f14683d = obj4;
    }

    public static synchronized g B(Context context, a aVar) {
        try {
            if (f14679e == null) {
                g gVar = new g();
                Context applicationContext = context.getApplicationContext();
                gVar.f14680a = new a(applicationContext, aVar);
                gVar.f14681b = new b(applicationContext, aVar);
                gVar.f14682c = new e(applicationContext, aVar);
                gVar.f14683d = new f(applicationContext, aVar);
                f14679e = gVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14679e;
    }

    public static void O(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            map.remove(arrayList.get(i7));
        }
    }

    public static m h(List list, Map map, Comparator comparator) {
        g gVar = new g();
        gVar.f14680a = list;
        gVar.f14681b = map;
        Collections.sort(list, comparator);
        l lVar = new l(list.size());
        int i7 = lVar.f14792b - 1;
        int size = list.size();
        while (i7 >= 0) {
            boolean z4 = (lVar.f14791a & ((long) (1 << i7))) == 0;
            int iPow = (int) Math.pow(2.0d, i7);
            i7--;
            size -= iPow;
            if (z4) {
                gVar.k(2, iPow, size);
            } else {
                gVar.k(2, iPow, size);
                size -= iPow;
                gVar.k(1, iPow, size);
            }
        }
        h hVar = (j) gVar.f14682c;
        if (hVar == null) {
            hVar = p075k4.g.f14783a;
        }
        return new m(hVar, comparator);
    }

    @Override // p018c2.J
    public void A(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        if (K(i7, d7)) {
            ((I) this.f14681b).g(c0774u, c0779z);
        }
    }

    @Override // p141t4.b
    public v4.l C(v4.l lVar, v4.l lVar2, C0286t c0286t) {
        v4.l lVarT;
        if (lVar2.f17192a.r()) {
            lVarT = new v4.l(v4.j.f17190e, (k) this.f14681b);
        } else {
            v4.l lVar3 = new v4.l(lVar2.f17192a.v(v4.j.f17190e), lVar2.f17194c, lVar2.f17193b);
            Iterator it = lVar2.iterator();
            lVarT = lVar3;
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (!J(pVar)) {
                    lVarT = lVarT.t(pVar.f17201a, v4.j.f17190e);
                }
            }
        }
        ((p033e3.h) this.f14680a).C(lVar, lVarT, c0286t);
        return lVarT;
    }

    @Override // p141t4.b
    public v4.l D(v4.l lVar, c cVar, r rVar, C0934g c0934g, p141t4.a aVar, C0286t c0286t) {
        if (!J(new p(cVar, rVar))) {
            rVar = v4.j.f17190e;
        }
        return ((p033e3.h) this.f14680a).D(lVar, cVar, rVar, c0934g, aVar, c0286t);
    }

    public p075k4.c F(Map map, HashSet hashSet) {
        HashMap map2 = new HashMap();
        L(map2, map.keySet());
        p075k4.c cVarD = H4.g.f3315a;
        for (Map.Entry entry : n(map, map2, hashSet).entrySet()) {
            cVarD = cVarD.D((H4.h) entry.getKey(), ((C0292z) entry.getValue()).f3044a);
        }
        return cVarD;
    }

    public void G(V v6) {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = v6.f9416c;
        String str = abstractComponentCallbacksC0701v.f9537e;
        HashMap map = (HashMap) this.f14681b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0701v.f9537e, v6);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0701v);
        }
    }

    @Override // p018c2.J
    public void H(int i7, D d7, C0779z c0779z) {
        if (K(i7, d7)) {
            ((I) this.f14681b).c(c0779z);
        }
    }

    public void I(V v6) {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = v6.f9416c;
        if (abstractComponentCallbacksC0701v.f9522S) {
            ((T) this.f14683d).f(abstractComponentCallbacksC0701v);
        }
        HashMap map = (HashMap) this.f14681b;
        if (map.get(abstractComponentCallbacksC0701v.f9537e) == v6 && ((V) map.put(abstractComponentCallbacksC0701v.f9537e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0701v);
        }
    }

    public boolean J(p pVar) {
        k kVar = (k) this.f14681b;
        return kVar.compare((p) this.f14682c, pVar) <= 0 && kVar.compare(pVar, (p) this.f14683d) <= 0;
    }

    public boolean K(int i7, D d7) {
        C0041r0 c0041r0 = (C0041r0) this.f14680a;
        D dB = null;
        if (d7 != null) {
            for (int i8 = 0; i8 < c0041r0.f546c.size(); i8++) {
                if (((D) c0041r0.f546c.get(i8)).f10164d == d7.f10164d) {
                    dB = d7.b(Pair.create(c0041r0.f545b, d7.f10161a));
                    break;
                }
            }
            if (dB == null) {
                return false;
            }
        }
        int i9 = i7 + c0041r0.f547d;
        I i10 = (I) this.f14681b;
        int i11 = i10.f10179a;
        C0043s0 c0043s0 = (C0043s0) this.f14683d;
        if (i11 != i9 || !t.a(i10.f10180b, dB)) {
            this.f14681b = new I(((I) c0043s0.f558h).f10181c, i9, dB, 0L);
        }
        B1.m mVar = (B1.m) this.f14682c;
        if (mVar.f1014b == i9 && t.a((D) mVar.f1015c, dB)) {
            return true;
        }
        this.f14682c = new B1.m((CopyOnWriteArrayList) ((B1.m) c0043s0.f559i).f1016d, i9, dB, 2);
        return true;
    }

    public void L(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            if (!map.containsKey(hVar)) {
                treeSet.add(hVar);
            }
        }
        map.putAll(((InterfaceC0268a) this.f14682c).x(treeSet));
    }

    public HashMap M(Map map) {
        ArrayList<i> arrayListC = ((InterfaceC0290x) this.f14681b).c(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (i iVar : arrayListC) {
            for (H4.h hVar : iVar.b()) {
                H4.k kVar = (H4.k) map.get(hVar);
                if (kVar != null) {
                    map2.put(hVar, iVar.a(kVar, map2.containsKey(hVar) ? (f) map2.get(hVar) : f.f3666b));
                    int i7 = iVar.f3673a;
                    if (!treeMap.containsKey(Integer.valueOf(i7))) {
                        treeMap.put(Integer.valueOf(i7), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i7))).add(hVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (H4.h hVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(hVar2)) {
                    I4.h hVarC = I4.h.c((H4.k) map.get(hVar2), (f) map2.get(hVar2));
                    if (hVarC != null) {
                        map3.put(hVar2, hVarC);
                    }
                    hashSet.add(hVar2);
                }
            }
            ((InterfaceC0268a) this.f14682c).b(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    @Override // p141t4.b
    public k N() {
        return (k) this.f14681b;
    }

    public g2.b P(List list) {
        ArrayList arrayListE = e(list);
        if (arrayListE.size() < 2) {
            return (g2.b) AbstractC0158p.e(arrayListE, null);
        }
        Collections.sort(arrayListE, new C0269b(12));
        ArrayList arrayList = new ArrayList();
        int i7 = ((g2.b) arrayListE.get(0)).f13113c;
        for (int i8 = 0; i8 < arrayListE.size(); i8++) {
            g2.b bVar = (g2.b) arrayListE.get(i8);
            if (i7 != bVar.f13113c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (g2.b) arrayListE.get(0);
            }
            arrayList.add(new Pair(bVar.f13112b, Integer.valueOf(bVar.f13114d)));
        }
        HashMap map = (HashMap) this.f14682c;
        g2.b bVar2 = (g2.b) map.get(arrayList);
        if (bVar2 == null) {
            List listSubList = arrayListE.subList(0, arrayList.size());
            int i9 = 0;
            for (int i10 = 0; i10 < listSubList.size(); i10++) {
                i9 += ((g2.b) listSubList.get(i10)).f13114d;
            }
            int iNextInt = ((Random) this.f14683d).nextInt(i9);
            int i11 = 0;
            for (int i12 = 0; i12 < listSubList.size(); i12++) {
                g2.b bVar3 = (g2.b) listSubList.get(i12);
                i11 += bVar3.f13114d;
                if (iNextInt < i11) {
                    bVar2 = bVar3;
                    map.put(arrayList, bVar2);
                }
            }
            bVar2 = (g2.b) AbstractC0158p.f(listSubList);
            map.put(arrayList, bVar2);
        }
        return bVar2;
    }

    public Bundle Q(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f14682c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    @Override // p120q4.b
    public Object a(C0934g c0934g, Object obj, Object obj2) {
        if (((p120q4.c) this.f14680a).y(c0934g) != null) {
            return null;
        }
        ((ArrayList) this.f14681b).add(new p120q4.e(((C0934g) this.f14682c).m(c0934g), ((r) this.f14683d).g(c0934g)));
        return null;
    }

    @Override // p083l4.u
    public void b(String str, String str2) {
        p063i4.c cVarC = C0940m.c(str, str2);
        C0940m c0940m = (C0940m) this.f14683d;
        C0934g c0934g = (C0934g) this.f14680a;
        C0940m.d(c0940m, "onDisconnect().updateChildren", c0934g, cVarC);
        if (cVarC == null) {
            for (Map.Entry entry : ((TreeMap) this.f14681b).entrySet()) {
                c0940m.f15457e.c(c0934g.m((C0934g) entry.getKey()), (r) entry.getValue());
            }
        }
        c0940m.i((p120q4.j) this.f14682c, cVarC, c0934g);
    }

    public void c(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (((ArrayList) this.f14680a).contains(abstractComponentCallbacksC0701v)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0701v);
        }
        synchronized (((ArrayList) this.f14680a)) {
            ((ArrayList) this.f14680a).add(abstractComponentCallbacksC0701v);
        }
        abstractComponentCallbacksC0701v.f9505B = true;
    }

    public void d(Object obj, Object obj2, f0 f0Var, boolean z4) {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.f14681b) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (f0Var.F() != Z.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14681b;
        Integer numValueOf = Integer.valueOf(f0Var.D());
        if (f0Var.E() == r0.RAW) {
            numValueOf = null;
        }
        J3.b bVarA = Q3.i.f5812b.a(o.c(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), numValueOf));
        int iOrdinal = f0Var.E().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(f0Var.D()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(f0Var.D()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(f0Var.D()).array();
        } else {
            bArrArray = J3.b.f3834a;
        }
        J3.k kVar = new J3.k(obj, obj2, bArrArray, f0Var.F(), f0Var.E(), f0Var.D(), f0Var.C().D(), bVarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        byte[] bArr = kVar.f3848c;
        J3.l lVar = new J3.l(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(kVar);
            concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList2));
        }
        if (z4) {
            if (((J3.k) this.f14682c) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f14682c = kVar;
        }
    }

    public ArrayList e(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f14680a;
        O(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f14681b;
        O(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            g2.b bVar = (g2.b) list.get(i7);
            if (!map.containsKey(bVar.f13112b) && !map2.containsKey(Integer.valueOf(bVar.f13113c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public R3.k f() throws GeneralSecurityException {
        Integer num = (Integer) this.f14680a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f14681b) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((d) this.f14682c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((d) this.f14683d) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f14680a));
        }
        Integer num2 = (Integer) this.f14681b;
        int iIntValue = num2.intValue();
        d dVar = (d) this.f14682c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (dVar == d.f6024g) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (dVar == d.f6025h) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (dVar == d.f6026i) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (dVar == d.j) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (dVar != d.f6027k) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new R3.k(((Integer) this.f14680a).intValue(), ((Integer) this.f14681b).intValue(), (d) this.f14683d, (d) this.f14682c);
    }

    public h g(int i7, int i8) {
        if (i8 == 0) {
            return p075k4.g.f14783a;
        }
        Map map = (Map) this.f14681b;
        List list = (List) this.f14680a;
        if (i8 == 1) {
            Object obj = list.get(i7);
            return new p075k4.f(obj, map.get(obj), null, null);
        }
        int i9 = i8 / 2;
        int i10 = i7 + i9;
        h hVarG = g(i7, i9);
        h hVarG2 = g(i10 + 1, i9);
        Object obj2 = list.get(i10);
        return new p075k4.f(obj2, map.get(obj2), hVarG, hVarG2);
    }

    @Override // p141t4.b
    public p033e3.h i() {
        return (p033e3.h) this.f14680a;
    }

    @Override // p018c2.J
    public void j(int i7, D d7, C0774u c0774u, C0779z c0779z, IOException iOException, boolean z4) {
        if (K(i7, d7)) {
            ((I) this.f14681b).j(c0774u, c0779z, iOException, z4);
        }
    }

    public void k(int i7, int i8, int i9) {
        h hVarG = g(i9 + 1, i8 - 1);
        Object obj = ((List) this.f14680a).get(i9);
        Map map = (Map) this.f14681b;
        j iVar = i7 == 1 ? new p075k4.i(obj, map.get(obj), null, hVarG) : new p075k4.f(obj, map.get(obj), null, hVarG);
        if (((j) this.f14682c) == null) {
            this.f14682c = iVar;
            this.f14683d = iVar;
        } else {
            ((j) this.f14683d).r(iVar);
            this.f14683d = iVar;
        }
    }

    @Override // p141t4.b
    public boolean l() {
        return true;
    }

    @Override // p018c2.J
    public void m(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        if (K(i7, d7)) {
            ((I) this.f14681b).l(c0774u, c0779z);
        }
    }

    public HashMap n(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (H4.k kVar : map.values()) {
            I4.d dVar = (I4.d) map2.get(kVar.f3323a);
            H4.h hVar = kVar.f3323a;
            if (set.contains(hVar) && (dVar == null || (dVar.f3665b instanceof I4.m))) {
                map3.put(hVar, kVar);
            } else if (dVar != null) {
                I4.h hVar2 = dVar.f3665b;
                map4.put(hVar, hVar2.d());
                hVar2.a(kVar, hVar2.d(), new Timestamp(new Date()));
            } else {
                map4.put(hVar, f.f3666b);
            }
        }
        map4.putAll(M(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            H4.h hVar3 = (H4.h) entry.getKey();
            H4.k kVar2 = (H4.k) entry.getValue();
            f fVar = (f) map4.get(entry.getKey());
            C0292z c0292z = new C0292z();
            c0292z.f3044a = kVar2;
            c0292z.f3045b = fVar;
            map5.put(hVar3, c0292z);
        }
        return map5;
    }

    @Override // p155w1.M0
    public void o(Object obj, N0 n2) {
        String str = (String) obj;
        int i7 = n2.f17463D;
        C1034s0 c1034s0 = (C1034s0) this.f14683d;
        if (i7 != 200) {
            c1034s0.d(new C1021o0(this, i7, str, 0));
        }
        String str2 = (String) this.f14681b;
        String str3 = (String) this.f14680a;
        if ((i7 < 200 || i7 >= 300) && i7 != 400) {
            String str4 = c1034s0.f17862z;
            AbstractC0997i0.o(5, "Analytics report sent with error ".concat(str2));
            c1034s0.d(new com.flurry.android.marketing.messaging.notification.b(10, c1034s0, str3));
            return;
        }
        String str5 = c1034s0.f17862z;
        AbstractC0997i0.o(5, "Analytics report sent to ".concat(str2));
        C1034s0.h(str);
        if (str != null) {
            "HTTP response: ".concat(str);
        }
        c1034s0.d(new C1025p0(c1034s0, i7, str3, (String) this.f14682c));
        c1034s0.d(new C1008l(c1034s0, 4));
    }

    public void p(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((p122r.l) this.f14681b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                p(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0701v q(String str) {
        V v6 = (V) ((HashMap) this.f14681b).get(str);
        if (v6 != null) {
            return v6.f9416c;
        }
        return null;
    }

    @Override // p018c2.J
    public void r(int i7, D d7, C0779z c0779z) {
        if (K(i7, d7)) {
            ((I) this.f14681b).m(c0779z);
        }
    }

    public AbstractComponentCallbacksC0701v s(String str) {
        for (V v6 : ((HashMap) this.f14681b).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vS = v6.f9416c;
                if (!str.equals(abstractComponentCallbacksC0701vS.f9537e)) {
                    abstractComponentCallbacksC0701vS = abstractComponentCallbacksC0701vS.f9515L.f9385c.s(str);
                }
                if (abstractComponentCallbacksC0701vS != null) {
                    return abstractComponentCallbacksC0701vS;
                }
            }
        }
        return null;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (V v6 : ((HashMap) this.f14681b).values()) {
            if (v6 != null) {
                arrayList.add(v6);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.D.i(exception);
        if (!zzadg.zzc(exception)) {
            return task;
        }
        boolean zIsLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = (String) this.f14680a;
        if (zIsLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return ((o) this.f14681b).r(str, Boolean.TRUE, (RecaptchaAction) this.f14682c).continueWithTask((C0894c) this.f14683d);
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (V v6 : ((HashMap) this.f14681b).values()) {
            if (v6 != null) {
                arrayList.add(v6.f9416c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public p075k4.c v(Iterable iterable) {
        return F(((G4.D) this.f14680a).n(iterable), new HashSet());
    }

    public p075k4.c w(C c3, H4.b bVar, n nVar) {
        HashMap mapG = ((InterfaceC0268a) this.f14682c).g(c3.f2095f, bVar.f3307c);
        HashMap mapU = ((G4.D) this.f14680a).u(c3, bVar, mapG.keySet(), nVar);
        for (Map.Entry entry : mapG.entrySet()) {
            if (!mapU.containsKey(entry.getKey())) {
                mapU.put((H4.h) entry.getKey(), H4.k.g((H4.h) entry.getKey()));
            }
        }
        p075k4.c cVarD = H4.g.f3315a;
        for (Map.Entry entry2 : mapU.entrySet()) {
            I4.d dVar = (I4.d) mapG.get(entry2.getKey());
            if (dVar != null) {
                dVar.f3665b.a((H4.k) entry2.getValue(), f.f3666b, new Timestamp(new Date()));
            }
            if (c3.g((H4.k) entry2.getValue())) {
                cVarD = cVarD.D((H4.h) entry2.getKey(), (H4.k) entry2.getValue());
            }
        }
        return cVarD;
    }

    public p075k4.c x(C c3, H4.b bVar, n nVar) {
        boolean zE = c3.e();
        H4.m mVar = c3.f2095f;
        if (zE) {
            p075k4.b bVar2 = H4.g.f3315a;
            H4.h hVar = new H4.h(mVar);
            I4.d dVarE = ((InterfaceC0268a) this.f14682c).e(hVar);
            H4.k kVarY = (dVarE == null || (dVarE.f3665b instanceof I4.m)) ? ((G4.D) this.f14680a).y(hVar) : H4.k.g(hVar);
            if (dVarE != null) {
                dVarE.f3665b.a(kVarY, f.f3666b, new Timestamp(new Date()));
            }
            return kVarY.d() ? bVar2.D(kVarY.f3323a, kVarY) : bVar2;
        }
        String str = c3.f2096g;
        if (str == null) {
            return w(c3, bVar, nVar);
        }
        p113p3.f.O("Currently we only support collection group queries at the root.", mVar.isEmpty(), new Object[0]);
        p075k4.c cVarD = H4.g.f3315a;
        Iterator it = ((InterfaceC0273f) this.f14683d).B(str).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : w(new C((H4.m) ((H4.m) it.next()).b(str), null, c3.f2094e, c3.f2090a, c3.f2097h, c3.f2098i, c3.j, c3.f2099k), bVar, nVar)) {
                cVarD = cVarD.D((H4.h) entry.getKey(), (H4.k) entry.getValue());
            }
        }
        return cVarD;
    }

    @Override // p018c2.J
    public void y(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        if (K(i7, d7)) {
            ((I) this.f14681b).e(c0774u, c0779z);
        }
    }

    public List z() {
        ArrayList arrayList;
        if (((ArrayList) this.f14680a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f14680a)) {
            arrayList = new ArrayList((ArrayList) this.f14680a);
        }
        return arrayList;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, boolean z4) {
        this.f14683d = obj;
        this.f14680a = obj2;
        this.f14681b = obj3;
        this.f14682c = obj4;
    }

    public g(p134s4.g gVar) {
        p pVarC;
        p pVarD;
        k kVar = gVar.f16176g;
        this.f14680a = new p033e3.h(kVar);
        this.f14681b = kVar;
        if (gVar.e()) {
            if (gVar.e()) {
                c cVar = gVar.f16173d;
                cVar = cVar == null ? c.f17175b : cVar;
                k kVar2 = gVar.f16176g;
                if (gVar.e()) {
                    pVarC = kVar2.c(cVar, gVar.f16172c);
                } else {
                    throw new IllegalArgumentException("Cannot get index start value if start has not been set");
                }
            } else {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
        } else {
            pVarC = p.f17199c;
        }
        this.f14682c = pVarC;
        if (gVar.c()) {
            if (gVar.c()) {
                c cVar2 = gVar.f16175f;
                cVar2 = cVar2 == null ? c.f17176c : cVar2;
                k kVar3 = gVar.f16176g;
                if (gVar.c()) {
                    pVarD = kVar3.c(cVar2, gVar.f16174e);
                } else {
                    throw new IllegalArgumentException("Cannot get index end value if start has not been set");
                }
            } else {
                throw new IllegalArgumentException("Cannot get index end name if start has not been set");
            }
        } else {
            pVarD = gVar.f16176g.d();
        }
        this.f14683d = pVarD;
    }

    public g(int i7) {
        switch (i7) {
            case 6:
                this.f14680a = new p122r.b();
                this.f14681b = new SparseArray();
                this.f14682c = new p122r.f();
                this.f14683d = new p122r.b();
                break;
            case 8:
                f2 f2Var = f2.f7216b;
                this.f14681b = Z1.n();
                this.f14682c = Z1.n();
                this.f14683d = Z1.n();
                this.f14680a = f2Var;
                break;
            case 9:
                this.f14680a = new ArrayList();
                this.f14681b = new HashMap();
                this.f14682c = new HashMap();
                break;
            case 13:
                Random random = new Random();
                this.f14682c = new HashMap();
                this.f14683d = random;
                this.f14680a = new HashMap();
                this.f14681b = new HashMap();
                break;
            default:
                this.f14680a = new O.c(10);
                this.f14681b = new p122r.l();
                this.f14682c = new ArrayList();
                this.f14683d = new HashSet();
                break;
        }
    }

    @Override // p141t4.b
    public v4.l E(v4.l lVar, r rVar) {
        return lVar;
    }
}
