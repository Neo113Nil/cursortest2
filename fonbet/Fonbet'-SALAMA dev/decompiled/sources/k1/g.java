package k1;

import A1.C0041r0;
import A1.C0043s0;
import B1.m;
import E3.AbstractC0158p;
import E4.C;
import G4.C0269b;
import G4.C0286t;
import G4.C0292z;
import G4.InterfaceC0268a;
import G4.InterfaceC0273f;
import G4.InterfaceC0290x;
import H4.h;
import I4.i;
import Q3.o;
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
import androidx.fragment.app.AbstractComponentCallbacksC0722v;
import androidx.fragment.app.T;
import androidx.fragment.app.V;
import c2.C0814u;
import c2.C0819z;
import c2.D;
import c2.I;
import c2.J;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.Timestamp;
import d1.n;
import e3.C1023h;
import f4.C1091c;
import i4.C1266c;
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
import k4.AbstractC1341c;
import k4.AbstractC1348j;
import k4.C1340b;
import k4.C1344f;
import k4.C1345g;
import k4.C1347i;
import k4.C1350l;
import k4.C1351m;
import k4.InterfaceC1346h;
import l4.u;
import n4.C1473g;
import n4.C1479m;
import p1.InterfaceC1533a;
import t4.InterfaceC1609a;
import t4.InterfaceC1610b;
import v2.t;
import v4.j;
import v4.k;
import v4.l;
import v4.p;
import v4.r;
import w1.AbstractC1706i0;
import w1.C1717l;
import w1.C1730o0;
import w1.C1734p0;
import w1.C1743s0;
import w1.M0;
import w1.N0;

/* loaded from: classes.dex */
public final class g implements J, E1.e, Continuation, q4.b, u, InterfaceC1610b, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static g f14673e;

    /* renamed from: a, reason: collision with root package name */
    public Object f14674a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14675b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14676c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14677d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f14674a = obj;
        this.f14675b = obj2;
        this.f14676c = obj3;
        this.f14677d = obj4;
    }

    public static synchronized g B(Context context, InterfaceC1533a interfaceC1533a) {
        g gVar;
        synchronized (g.class) {
            try {
                if (f14673e == null) {
                    g gVar2 = new g();
                    Context applicationContext = context.getApplicationContext();
                    gVar2.f14674a = new C1329a(applicationContext, interfaceC1533a);
                    gVar2.f14675b = new C1330b(applicationContext, interfaceC1533a);
                    gVar2.f14676c = new C1333e(applicationContext, interfaceC1533a);
                    gVar2.f14677d = new f(applicationContext, interfaceC1533a);
                    f14673e = gVar2;
                }
                gVar = f14673e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static void O(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashMap.remove(arrayList.get(i7));
        }
    }

    public static C1351m h(List list, Map map, Comparator comparator) {
        g gVar = new g();
        gVar.f14674a = list;
        gVar.f14675b = map;
        Collections.sort(list, comparator);
        C1350l c1350l = new C1350l(list.size());
        int i7 = c1350l.f14786b - 1;
        int size = list.size();
        while (i7 >= 0) {
            boolean z4 = (c1350l.f14785a & ((long) (1 << i7))) == 0;
            int pow = (int) Math.pow(2.0d, i7);
            i7--;
            size -= pow;
            if (z4) {
                gVar.k(2, pow, size);
            } else {
                gVar.k(2, pow, size);
                size -= pow;
                gVar.k(1, pow, size);
            }
        }
        InterfaceC1346h interfaceC1346h = (AbstractC1348j) gVar.f14676c;
        if (interfaceC1346h == null) {
            interfaceC1346h = C1345g.f14777a;
        }
        return new C1351m(interfaceC1346h, comparator);
    }

    @Override // c2.J
    public void A(int i7, D d7, C0814u c0814u, C0819z c0819z) {
        if (K(i7, d7)) {
            ((I) this.f14675b).g(c0814u, c0819z);
        }
    }

    @Override // t4.InterfaceC1610b
    public l C(l lVar, l lVar2, C0286t c0286t) {
        l lVar3;
        if (lVar2.f17186a.r()) {
            lVar3 = new l(j.f17184e, (k) this.f14675b);
        } else {
            l lVar4 = new l(lVar2.f17186a.v(j.f17184e), lVar2.f17188c, lVar2.f17187b);
            Iterator it = lVar2.iterator();
            lVar3 = lVar4;
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (!J(pVar)) {
                    lVar3 = lVar3.t(pVar.f17195a, j.f17184e);
                }
            }
        }
        ((C1023h) this.f14674a).C(lVar, lVar3, c0286t);
        return lVar3;
    }

    @Override // t4.InterfaceC1610b
    public l D(l lVar, v4.c cVar, r rVar, C1473g c1473g, InterfaceC1609a interfaceC1609a, C0286t c0286t) {
        if (!J(new p(cVar, rVar))) {
            rVar = j.f17184e;
        }
        return ((C1023h) this.f14674a).D(lVar, cVar, rVar, c1473g, interfaceC1609a, c0286t);
    }

    public AbstractC1341c F(Map map, HashSet hashSet) {
        HashMap hashMap = new HashMap();
        L(hashMap, map.keySet());
        AbstractC1341c abstractC1341c = H4.g.f3315a;
        for (Map.Entry entry : n(map, hashMap, hashSet).entrySet()) {
            abstractC1341c = abstractC1341c.D((h) entry.getKey(), ((C0292z) entry.getValue()).f3044a);
        }
        return abstractC1341c;
    }

    public void G(V v6) {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = v6.f9416c;
        String str = abstractComponentCallbacksC0722v.f9537e;
        HashMap hashMap = (HashMap) this.f14675b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0722v.f9537e, v6);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0722v);
        }
    }

    @Override // c2.J
    public void H(int i7, D d7, C0819z c0819z) {
        if (K(i7, d7)) {
            ((I) this.f14675b).c(c0819z);
        }
    }

    public void I(V v6) {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = v6.f9416c;
        if (abstractComponentCallbacksC0722v.f9522S) {
            ((T) this.f14677d).f(abstractComponentCallbacksC0722v);
        }
        HashMap hashMap = (HashMap) this.f14675b;
        if (hashMap.get(abstractComponentCallbacksC0722v.f9537e) == v6 && ((V) hashMap.put(abstractComponentCallbacksC0722v.f9537e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0722v);
        }
    }

    public boolean J(p pVar) {
        k kVar = (k) this.f14675b;
        return kVar.compare((p) this.f14676c, pVar) <= 0 && kVar.compare(pVar, (p) this.f14677d) <= 0;
    }

    public boolean K(int i7, D d7) {
        C0041r0 c0041r0 = (C0041r0) this.f14674a;
        D d8 = null;
        if (d7 != null) {
            int i8 = 0;
            while (true) {
                if (i8 >= c0041r0.f546c.size()) {
                    break;
                }
                if (((D) c0041r0.f546c.get(i8)).f10164d == d7.f10164d) {
                    d8 = d7.b(Pair.create(c0041r0.f545b, d7.f10161a));
                    break;
                }
                i8++;
            }
            if (d8 == null) {
                return false;
            }
        }
        int i9 = i7 + c0041r0.f547d;
        I i10 = (I) this.f14675b;
        int i11 = i10.f10179a;
        C0043s0 c0043s0 = (C0043s0) this.f14677d;
        if (i11 != i9 || !t.a(i10.f10180b, d8)) {
            this.f14675b = new I(((I) c0043s0.f558h).f10181c, i9, d8, 0L);
        }
        m mVar = (m) this.f14676c;
        if (mVar.f1014b == i9 && t.a((D) mVar.f1015c, d8)) {
            return true;
        }
        this.f14676c = new m((CopyOnWriteArrayList) ((m) c0043s0.f559i).f1016d, i9, d8, 2);
        return true;
    }

    public void L(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!map.containsKey(hVar)) {
                treeSet.add(hVar);
            }
        }
        map.putAll(((InterfaceC0268a) this.f14676c).x(treeSet));
    }

    public HashMap M(Map map) {
        ArrayList c3 = ((InterfaceC0290x) this.f14675b).c(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Iterator it = c3.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            Iterator it2 = iVar.b().iterator();
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                H4.k kVar = (H4.k) map.get(hVar);
                if (kVar != null) {
                    hashMap.put(hVar, iVar.a(kVar, hashMap.containsKey(hVar) ? (I4.f) hashMap.get(hVar) : I4.f.f3666b));
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
            HashMap hashMap2 = new HashMap();
            for (h hVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(hVar2)) {
                    I4.h c4 = I4.h.c((H4.k) map.get(hVar2), (I4.f) hashMap.get(hVar2));
                    if (c4 != null) {
                        hashMap2.put(hVar2, c4);
                    }
                    hashSet.add(hVar2);
                }
            }
            ((InterfaceC0268a) this.f14676c).b(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }

    @Override // t4.InterfaceC1610b
    public k N() {
        return (k) this.f14675b;
    }

    public g2.b P(List list) {
        ArrayList e7 = e(list);
        if (e7.size() < 2) {
            return (g2.b) AbstractC0158p.e(e7, null);
        }
        Collections.sort(e7, new C0269b(12));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = ((g2.b) e7.get(0)).f13107c;
        int i9 = 0;
        while (true) {
            if (i9 >= e7.size()) {
                break;
            }
            g2.b bVar = (g2.b) e7.get(i9);
            if (i8 == bVar.f13107c) {
                arrayList.add(new Pair(bVar.f13106b, Integer.valueOf(bVar.f13108d)));
                i9++;
            } else if (arrayList.size() == 1) {
                return (g2.b) e7.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.f14676c;
        g2.b bVar2 = (g2.b) hashMap.get(arrayList);
        if (bVar2 == null) {
            List subList = e7.subList(0, arrayList.size());
            int i10 = 0;
            for (int i11 = 0; i11 < subList.size(); i11++) {
                i10 += ((g2.b) subList.get(i11)).f13108d;
            }
            int nextInt = ((Random) this.f14677d).nextInt(i10);
            int i12 = 0;
            while (true) {
                if (i7 >= subList.size()) {
                    bVar2 = (g2.b) AbstractC0158p.f(subList);
                    break;
                }
                g2.b bVar3 = (g2.b) subList.get(i7);
                i12 += bVar3.f13108d;
                if (nextInt < i12) {
                    bVar2 = bVar3;
                    break;
                }
                i7++;
            }
            hashMap.put(arrayList, bVar2);
        }
        return bVar2;
    }

    public Bundle Q(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f14676c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    @Override // q4.b
    public Object a(C1473g c1473g, Object obj, Object obj2) {
        if (((q4.c) this.f14674a).y(c1473g) != null) {
            return null;
        }
        ((ArrayList) this.f14675b).add(new q4.e(((C1473g) this.f14676c).m(c1473g), ((r) this.f14677d).g(c1473g)));
        return null;
    }

    @Override // l4.u
    public void b(String str, String str2) {
        C1266c c3 = C1479m.c(str, str2);
        C1479m c1479m = (C1479m) this.f14677d;
        C1473g c1473g = (C1473g) this.f14674a;
        C1479m.d(c1479m, "onDisconnect().updateChildren", c1473g, c3);
        if (c3 == null) {
            for (Map.Entry entry : ((TreeMap) this.f14675b).entrySet()) {
                c1479m.f15451e.c(c1473g.m((C1473g) entry.getKey()), (r) entry.getValue());
            }
        }
        c1479m.i((q4.j) this.f14676c, c3, c1473g);
    }

    public void c(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (((ArrayList) this.f14674a).contains(abstractComponentCallbacksC0722v)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0722v);
        }
        synchronized (((ArrayList) this.f14674a)) {
            ((ArrayList) this.f14674a).add(abstractComponentCallbacksC0722v);
        }
        abstractComponentCallbacksC0722v.f9505B = true;
    }

    public void d(Object obj, Object obj2, f0 f0Var, boolean z4) {
        byte[] array;
        if (((ConcurrentHashMap) this.f14675b) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (f0Var.F() != Z.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14675b;
        Integer valueOf = Integer.valueOf(f0Var.D());
        if (f0Var.E() == r0.RAW) {
            valueOf = null;
        }
        J3.b a2 = Q3.i.f5812b.a(o.c(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), valueOf));
        int ordinal = f0Var.E().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = J3.b.f3834a;
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(f0Var.D()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(f0Var.D()).array();
        }
        J3.k kVar = new J3.k(obj, obj2, array, f0Var.F(), f0Var.E(), f0Var.D(), f0Var.C().D(), a2);
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
            if (((J3.k) this.f14676c) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f14676c = kVar;
        }
    }

    public ArrayList e(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f14674a;
        O(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f14675b;
        O(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            g2.b bVar = (g2.b) list.get(i7);
            if (!hashMap.containsKey(bVar.f13106b) && !hashMap2.containsKey(Integer.valueOf(bVar.f13107c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public R3.k f() {
        Integer num = (Integer) this.f14674a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f14675b) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((R3.d) this.f14676c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((R3.d) this.f14677d) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f14674a));
        }
        Integer num2 = (Integer) this.f14675b;
        int intValue = num2.intValue();
        R3.d dVar = (R3.d) this.f14676c;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (dVar == R3.d.f6024g) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (dVar == R3.d.f6025h) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (dVar == R3.d.f6026i) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (dVar == R3.d.j) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (dVar != R3.d.f6027k) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new R3.k(((Integer) this.f14674a).intValue(), ((Integer) this.f14675b).intValue(), (R3.d) this.f14677d, (R3.d) this.f14676c);
    }

    public InterfaceC1346h g(int i7, int i8) {
        if (i8 == 0) {
            return C1345g.f14777a;
        }
        Map map = (Map) this.f14675b;
        List list = (List) this.f14674a;
        if (i8 == 1) {
            Object obj = list.get(i7);
            return new C1344f(obj, map.get(obj), null, null);
        }
        int i9 = i8 / 2;
        int i10 = i7 + i9;
        InterfaceC1346h g3 = g(i7, i9);
        InterfaceC1346h g7 = g(i10 + 1, i9);
        Object obj2 = list.get(i10);
        return new C1344f(obj2, map.get(obj2), g3, g7);
    }

    @Override // t4.InterfaceC1610b
    public C1023h i() {
        return (C1023h) this.f14674a;
    }

    @Override // c2.J
    public void j(int i7, D d7, C0814u c0814u, C0819z c0819z, IOException iOException, boolean z4) {
        if (K(i7, d7)) {
            ((I) this.f14675b).j(c0814u, c0819z, iOException, z4);
        }
    }

    public void k(int i7, int i8, int i9) {
        InterfaceC1346h g3 = g(i9 + 1, i8 - 1);
        Object obj = ((List) this.f14674a).get(i9);
        Map map = (Map) this.f14675b;
        AbstractC1348j c1347i = i7 == 1 ? new C1347i(obj, map.get(obj), null, g3) : new C1344f(obj, map.get(obj), null, g3);
        if (((AbstractC1348j) this.f14676c) == null) {
            this.f14676c = c1347i;
            this.f14677d = c1347i;
        } else {
            ((AbstractC1348j) this.f14677d).r(c1347i);
            this.f14677d = c1347i;
        }
    }

    @Override // t4.InterfaceC1610b
    public boolean l() {
        return true;
    }

    @Override // c2.J
    public void m(int i7, D d7, C0814u c0814u, C0819z c0819z) {
        if (K(i7, d7)) {
            ((I) this.f14675b).l(c0814u, c0819z);
        }
    }

    public HashMap n(Map map, Map map2, Set set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (H4.k kVar : map.values()) {
            I4.d dVar = (I4.d) map2.get(kVar.f3323a);
            h hVar = kVar.f3323a;
            if (set.contains(hVar) && (dVar == null || (dVar.f3665b instanceof I4.m))) {
                hashMap.put(hVar, kVar);
            } else if (dVar != null) {
                I4.h hVar2 = dVar.f3665b;
                hashMap2.put(hVar, hVar2.d());
                hVar2.a(kVar, hVar2.d(), new Timestamp(new Date()));
            } else {
                hashMap2.put(hVar, I4.f.f3666b);
            }
        }
        hashMap2.putAll(M(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            h hVar3 = (h) entry.getKey();
            H4.k kVar2 = (H4.k) entry.getValue();
            I4.f fVar = (I4.f) hashMap2.get(entry.getKey());
            C0292z c0292z = new C0292z();
            c0292z.f3044a = kVar2;
            c0292z.f3045b = fVar;
            hashMap3.put(hVar3, c0292z);
        }
        return hashMap3;
    }

    @Override // w1.M0
    public void o(Object obj, N0 n02) {
        String str = (String) obj;
        int i7 = n02.f17457D;
        C1743s0 c1743s0 = (C1743s0) this.f14677d;
        if (i7 != 200) {
            c1743s0.d(new C1730o0(this, i7, str, 0));
        }
        String str2 = (String) this.f14675b;
        String str3 = (String) this.f14674a;
        if ((i7 < 200 || i7 >= 300) && i7 != 400) {
            String str4 = c1743s0.f17856z;
            AbstractC1706i0.o(5, "Analytics report sent with error ".concat(str2));
            c1743s0.d(new com.flurry.android.marketing.messaging.notification.b(10, c1743s0, str3));
            return;
        }
        String str5 = c1743s0.f17856z;
        AbstractC1706i0.o(5, "Analytics report sent to ".concat(str2));
        C1743s0.h(str);
        if (str != null) {
            "HTTP response: ".concat(str);
        }
        c1743s0.d(new C1734p0(c1743s0, i7, str3, (String) this.f14676c));
        c1743s0.d(new C1717l(c1743s0, 4));
    }

    public void p(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((r.l) this.f14675b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                p(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0722v q(String str) {
        V v6 = (V) ((HashMap) this.f14675b).get(str);
        if (v6 != null) {
            return v6.f9416c;
        }
        return null;
    }

    @Override // c2.J
    public void r(int i7, D d7, C0819z c0819z) {
        if (K(i7, d7)) {
            ((I) this.f14675b).m(c0819z);
        }
    }

    public AbstractComponentCallbacksC0722v s(String str) {
        for (V v6 : ((HashMap) this.f14675b).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = v6.f9416c;
                if (!str.equals(abstractComponentCallbacksC0722v.f9537e)) {
                    abstractComponentCallbacksC0722v = abstractComponentCallbacksC0722v.f9515L.f9385c.s(str);
                }
                if (abstractComponentCallbacksC0722v != null) {
                    return abstractComponentCallbacksC0722v;
                }
            }
        }
        return null;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (V v6 : ((HashMap) this.f14675b).values()) {
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
        boolean isLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = (String) this.f14674a;
        if (isLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return ((o) this.f14675b).r(str, Boolean.TRUE, (RecaptchaAction) this.f14676c).continueWithTask((C1091c) this.f14677d);
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (V v6 : ((HashMap) this.f14675b).values()) {
            if (v6 != null) {
                arrayList.add(v6.f9416c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public AbstractC1341c v(Iterable iterable) {
        return F(((G4.D) this.f14674a).n(iterable), new HashSet());
    }

    public AbstractC1341c w(C c3, H4.b bVar, n nVar) {
        HashMap g3 = ((InterfaceC0268a) this.f14676c).g(c3.f2095f, bVar.f3307c);
        HashMap u4 = ((G4.D) this.f14674a).u(c3, bVar, g3.keySet(), nVar);
        for (Map.Entry entry : g3.entrySet()) {
            if (!u4.containsKey(entry.getKey())) {
                u4.put((h) entry.getKey(), H4.k.g((h) entry.getKey()));
            }
        }
        AbstractC1341c abstractC1341c = H4.g.f3315a;
        for (Map.Entry entry2 : u4.entrySet()) {
            I4.d dVar = (I4.d) g3.get(entry2.getKey());
            if (dVar != null) {
                dVar.f3665b.a((H4.k) entry2.getValue(), I4.f.f3666b, new Timestamp(new Date()));
            }
            if (c3.g((H4.k) entry2.getValue())) {
                abstractC1341c = abstractC1341c.D((h) entry2.getKey(), (H4.k) entry2.getValue());
            }
        }
        return abstractC1341c;
    }

    public AbstractC1341c x(C c3, H4.b bVar, n nVar) {
        boolean e7 = c3.e();
        H4.m mVar = c3.f2095f;
        if (e7) {
            C1340b c1340b = H4.g.f3315a;
            h hVar = new h(mVar);
            I4.d e8 = ((InterfaceC0268a) this.f14676c).e(hVar);
            H4.k y4 = (e8 == null || (e8.f3665b instanceof I4.m)) ? ((G4.D) this.f14674a).y(hVar) : H4.k.g(hVar);
            if (e8 != null) {
                e8.f3665b.a(y4, I4.f.f3666b, new Timestamp(new Date()));
            }
            return y4.d() ? c1340b.D(y4.f3323a, y4) : c1340b;
        }
        String str = c3.f2096g;
        if (str == null) {
            return w(c3, bVar, nVar);
        }
        p3.f.O("Currently we only support collection group queries at the root.", mVar.isEmpty(), new Object[0]);
        AbstractC1341c abstractC1341c = H4.g.f3315a;
        Iterator it = ((InterfaceC0273f) this.f14677d).B(str).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : w(new C((H4.m) ((H4.m) it.next()).b(str), null, c3.f2094e, c3.f2090a, c3.f2097h, c3.f2098i, c3.j, c3.f2099k), bVar, nVar)) {
                abstractC1341c = abstractC1341c.D((h) entry.getKey(), (H4.k) entry.getValue());
            }
        }
        return abstractC1341c;
    }

    @Override // c2.J
    public void y(int i7, D d7, C0814u c0814u, C0819z c0819z) {
        if (K(i7, d7)) {
            ((I) this.f14675b).e(c0814u, c0819z);
        }
    }

    public List z() {
        ArrayList arrayList;
        if (((ArrayList) this.f14674a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f14674a)) {
            arrayList = new ArrayList((ArrayList) this.f14674a);
        }
        return arrayList;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, boolean z4) {
        this.f14677d = obj;
        this.f14674a = obj2;
        this.f14675b = obj3;
        this.f14676c = obj4;
    }

    public g(s4.g gVar) {
        p pVar;
        p d7;
        k kVar = gVar.f16170g;
        this.f14674a = new C1023h(kVar);
        this.f14675b = kVar;
        if (gVar.e()) {
            if (gVar.e()) {
                v4.c cVar = gVar.f16167d;
                cVar = cVar == null ? v4.c.f17169b : cVar;
                k kVar2 = gVar.f16170g;
                if (gVar.e()) {
                    pVar = kVar2.c(cVar, gVar.f16166c);
                } else {
                    throw new IllegalArgumentException("Cannot get index start value if start has not been set");
                }
            } else {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
        } else {
            pVar = p.f17193c;
        }
        this.f14676c = pVar;
        if (gVar.c()) {
            if (gVar.c()) {
                v4.c cVar2 = gVar.f16169f;
                cVar2 = cVar2 == null ? v4.c.f17170c : cVar2;
                k kVar3 = gVar.f16170g;
                if (gVar.c()) {
                    d7 = kVar3.c(cVar2, gVar.f16168e);
                } else {
                    throw new IllegalArgumentException("Cannot get index end value if start has not been set");
                }
            } else {
                throw new IllegalArgumentException("Cannot get index end name if start has not been set");
            }
        } else {
            d7 = gVar.f16170g.d();
        }
        this.f14677d = d7;
    }

    public g(int i7) {
        switch (i7) {
            case 6:
                this.f14674a = new r.b();
                this.f14675b = new SparseArray();
                this.f14676c = new r.f();
                this.f14677d = new r.b();
                break;
            case 8:
                f2 f2Var = f2.f7216b;
                this.f14675b = Z1.n();
                this.f14676c = Z1.n();
                this.f14677d = Z1.n();
                this.f14674a = f2Var;
                break;
            case 9:
                this.f14674a = new ArrayList();
                this.f14675b = new HashMap();
                this.f14676c = new HashMap();
                break;
            case 13:
                Random random = new Random();
                this.f14676c = new HashMap();
                this.f14677d = random;
                this.f14674a = new HashMap();
                this.f14675b = new HashMap();
                break;
            default:
                this.f14674a = new O.c(10);
                this.f14675b = new r.l();
                this.f14676c = new ArrayList();
                this.f14677d = new HashSet();
                break;
        }
    }

    @Override // t4.InterfaceC1610b
    public l E(l lVar, r rVar) {
        return lVar;
    }
}
