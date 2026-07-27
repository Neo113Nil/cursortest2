package N1;

import E.C0028c;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
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
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: h, reason: collision with root package name */
    public static final e f2006h = new e(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2008b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2009c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2010d;

    /* renamed from: e, reason: collision with root package name */
    public final k f2011e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2012f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.j f2013g;

    public f(ArrayList arrayList, ArrayList arrayList2, l1.j jVar) {
        O1.l lVar = O1.l.f2264a;
        this.f2007a = new HashMap();
        this.f2008b = new HashMap();
        this.f2009c = new HashMap();
        this.f2010d = new HashSet();
        this.f2012f = new AtomicReference();
        k kVar = new k();
        this.f2011e = kVar;
        this.f2013g = jVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a.b(kVar, k.class, V1.b.class, V1.a.class));
        arrayList3.add(a.b(this, f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList3.add(aVar);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Y1.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2013g.m(componentRegistrar));
                        it3.remove();
                    }
                } catch (l e3) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e3);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((a) it4.next()).f1997b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2010d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f2010d.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.f2007a.isEmpty()) {
                AbstractC1477a.j(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2007a.keySet());
                arrayList6.addAll(arrayList3);
                AbstractC1477a.j(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                a aVar2 = (a) it5.next();
                this.f2007a.put(aVar2, new m(new K1.c(this, 1, aVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f2012f.get();
        if (bool != null) {
            g(this.f2007a, bool.booleanValue());
        }
    }

    @Override // N1.b
    public final synchronized Y1.a b(q qVar) {
        B0.f.g(qVar, "Null interface requested.");
        return (Y1.a) this.f2008b.get(qVar);
    }

    @Override // N1.b
    public final synchronized Y1.a c(q qVar) {
        n nVar = (n) this.f2009c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f2006h;
    }

    public final void g(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            Y1.a aVar2 = (Y1.a) entry.getValue();
            int i2 = aVar.f1999d;
            if (i2 == 1 || (i2 == 2 && z)) {
                aVar2.get();
            }
        }
        k kVar = this.f2011e;
        synchronized (kVar) {
            arrayDeque = kVar.f2023b;
            if (arrayDeque != null) {
                kVar.f2023b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void h() {
        for (a aVar : this.f2007a.keySet()) {
            for (i iVar : aVar.f1998c) {
                if (iVar.f2020b == 2 && !this.f2009c.containsKey(iVar.f2019a)) {
                    HashMap hashMap = this.f2009c;
                    q qVar = iVar.f2019a;
                    Set emptySet = Collections.emptySet();
                    n nVar = new n();
                    nVar.f2029b = null;
                    nVar.f2028a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f2028a.addAll(emptySet);
                    hashMap.put(qVar, nVar);
                } else if (this.f2008b.containsKey(iVar.f2019a)) {
                    continue;
                } else {
                    int i2 = iVar.f2020b;
                    if (i2 == 1) {
                        throw new j("Unsatisfied dependency for component " + aVar + ": " + iVar.f2019a);
                    }
                    if (i2 != 2) {
                        HashMap hashMap2 = this.f2008b;
                        q qVar2 = iVar.f2019a;
                        C0028c c0028c = o.f2030c;
                        e eVar = o.f2031d;
                        o oVar = new o();
                        oVar.f2032a = c0028c;
                        oVar.f2033b = eVar;
                        hashMap2.put(qVar2, oVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f2000e == 0) {
                Y1.a aVar2 = (Y1.a) this.f2007a.get(aVar);
                for (q qVar : aVar.f1997b) {
                    HashMap hashMap = this.f2008b;
                    if (hashMap.containsKey(qVar)) {
                        arrayList2.add(new B3.c((o) ((Y1.a) hashMap.get(qVar)), 3, aVar2));
                    } else {
                        hashMap.put(qVar, aVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f2007a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f2000e != 0) {
                Y1.a aVar2 = (Y1.a) entry.getValue();
                for (q qVar : aVar.f1997b) {
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, new HashSet());
                    }
                    ((Set) hashMap.get(qVar)).add(aVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f2009c;
            if (hashMap2.containsKey(key)) {
                n nVar = (n) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new B3.c(nVar, 4, (Y1.a) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f2029b = null;
                nVar2.f2028a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f2028a.addAll(set);
                hashMap2.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
