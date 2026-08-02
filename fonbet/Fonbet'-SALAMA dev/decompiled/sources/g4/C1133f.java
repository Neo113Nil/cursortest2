package g4;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import h4.EnumC1208k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import n3.AbstractC1464a;
import w1.C1718l0;

/* renamed from: g4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1133f implements InterfaceC1129b {

    /* renamed from: h, reason: collision with root package name */
    public static final C1132e f13193h = new C1132e(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13194a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13195b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13196c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f13197d;

    /* renamed from: e, reason: collision with root package name */
    public final C1138k f13198e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f13199f;

    /* renamed from: g, reason: collision with root package name */
    public final C1718l0 f13200g;

    public C1133f(ArrayList arrayList, ArrayList arrayList2, C1718l0 c1718l0) {
        int i7 = 1;
        EnumC1208k enumC1208k = EnumC1208k.f13562a;
        this.f13194a = new HashMap();
        this.f13195b = new HashMap();
        this.f13196c = new HashMap();
        this.f13197d = new HashSet();
        this.f13199f = new AtomicReference();
        C1138k c1138k = new C1138k();
        this.f13198e = c1138k;
        this.f13200g = c1718l0;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C1128a.b(c1138k, C1138k.class, A4.c.class, A4.b.class));
        arrayList3.add(C1128a.b(this, C1133f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C1128a c1128a = (C1128a) it.next();
            if (c1128a != null) {
                arrayList3.add(c1128a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((N4.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f13200g.l(componentRegistrar));
                        it3.remove();
                    }
                } catch (C1139l e7) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C1128a) it4.next()).f13184b.toArray();
                int length = array.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        Object obj = array[i8];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f13197d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f13197d.add(obj.toString());
                        }
                        i8++;
                    }
                }
            }
            if (this.f13194a.isEmpty()) {
                AbstractC1464a.q(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f13194a.keySet());
                arrayList6.addAll(arrayList3);
                AbstractC1464a.q(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C1128a c1128a2 = (C1128a) it5.next();
                this.f13194a.put(c1128a2, new C1140m(new Y3.d(i7, this, c1128a2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f13199f.get();
        if (bool != null) {
            i(this.f13194a, bool.booleanValue());
        }
    }

    @Override // g4.InterfaceC1129b
    public final synchronized N4.b c(C1144q c1144q) {
        p3.f.l(c1144q, "Null interface requested.");
        return (N4.b) this.f13195b.get(c1144q);
    }

    @Override // g4.InterfaceC1129b
    public final C1142o e(C1144q c1144q) {
        N4.b c3 = c(c1144q);
        return c3 == null ? new C1142o(C1142o.f13217c, C1142o.f13218d) : c3 instanceof C1142o ? (C1142o) c3 : new C1142o(null, c3);
    }

    @Override // g4.InterfaceC1129b
    public final synchronized N4.b g(C1144q c1144q) {
        C1141n c1141n = (C1141n) this.f13196c.get(c1144q);
        if (c1141n != null) {
            return c1141n;
        }
        return f13193h;
    }

    public final void i(HashMap hashMap, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            C1128a c1128a = (C1128a) entry.getKey();
            N4.b bVar = (N4.b) entry.getValue();
            int i7 = c1128a.f13186d;
            if (i7 == 1 || (i7 == 2 && z4)) {
                bVar.get();
            }
        }
        C1138k c1138k = this.f13198e;
        synchronized (c1138k) {
            arrayDeque = (ArrayDeque) c1138k.f13211c;
            if (arrayDeque != null) {
                c1138k.f13211c = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                c1138k.a((A4.a) it.next());
            }
        }
    }

    public final void j() {
        for (C1128a c1128a : this.f13194a.keySet()) {
            for (C1136i c1136i : c1128a.f13185c) {
                boolean z4 = c1136i.f13207b == 2;
                C1144q c1144q = c1136i.f13206a;
                if (z4) {
                    HashMap hashMap = this.f13196c;
                    if (!hashMap.containsKey(c1144q)) {
                        Set emptySet = Collections.emptySet();
                        C1141n c1141n = new C1141n();
                        c1141n.f13216b = null;
                        c1141n.f13215a = Collections.newSetFromMap(new ConcurrentHashMap());
                        c1141n.f13215a.addAll(emptySet);
                        hashMap.put(c1144q, c1141n);
                    }
                }
                HashMap hashMap2 = this.f13195b;
                if (hashMap2.containsKey(c1144q)) {
                    continue;
                } else {
                    int i7 = c1136i.f13207b;
                    if (i7 == 1) {
                        throw new C1137j("Unsatisfied dependency for component " + c1128a + ": " + c1144q);
                    }
                    if (i7 != 2) {
                        hashMap2.put(c1144q, new C1142o(C1142o.f13217c, C1142o.f13218d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1128a c1128a = (C1128a) it.next();
            if (c1128a.f13187e == 0) {
                N4.b bVar = (N4.b) this.f13194a.get(c1128a);
                for (C1144q c1144q : c1128a.f13184b) {
                    HashMap hashMap = this.f13195b;
                    if (hashMap.containsKey(c1144q)) {
                        arrayList2.add(new K5.a(11, (C1142o) ((N4.b) hashMap.get(c1144q)), bVar));
                    } else {
                        hashMap.put(c1144q, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f13194a.entrySet()) {
            C1128a c1128a = (C1128a) entry.getKey();
            if (c1128a.f13187e != 0) {
                N4.b bVar = (N4.b) entry.getValue();
                for (C1144q c1144q : c1128a.f13184b) {
                    if (!hashMap.containsKey(c1144q)) {
                        hashMap.put(c1144q, new HashSet());
                    }
                    ((Set) hashMap.get(c1144q)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f13196c;
            if (hashMap2.containsKey(key)) {
                C1141n c1141n = (C1141n) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new K5.a(12, c1141n, (N4.b) it.next()));
                }
            } else {
                C1144q c1144q2 = (C1144q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C1141n c1141n2 = new C1141n();
                c1141n2.f13216b = null;
                c1141n2.f13215a = Collections.newSetFromMap(new ConcurrentHashMap());
                c1141n2.f13215a.addAll(set);
                hashMap2.put(c1144q2, c1141n2);
            }
        }
        return arrayList;
    }
}
