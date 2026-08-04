package p048g4;

import A4.b;
import A4.c;
import Y3.d;
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
import p056h4.k;
import p097n3.a;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f13199h = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f13202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f13203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f13204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f13205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1009l0 f13206g;

    public f(ArrayList arrayList, ArrayList arrayList2, C1009l0 c1009l0) {
        int i7 = 1;
        k kVar = k.f13568a;
        this.f13200a = new HashMap();
        this.f13201b = new HashMap();
        this.f13202c = new HashMap();
        this.f13203d = new HashSet();
        this.f13205f = new AtomicReference();
        k kVar2 = new k();
        this.f13204e = kVar2;
        this.f13206g = c1009l0;
        ArrayList<a> arrayList3 = new ArrayList();
        arrayList3.add(a.b(kVar2, k.class, c.class, b.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((N4.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f13206g.l(componentRegistrar));
                        it3.remove();
                    }
                } catch (l e7) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((a) it4.next()).f13190b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f13203d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f13203d.add(obj.toString());
                    }
                }
            }
            if (this.f13200a.isEmpty()) {
                a.q(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f13200a.keySet());
                arrayList6.addAll(arrayList3);
                a.q(arrayList6);
            }
            for (a aVar2 : arrayList3) {
                this.f13200a.put(aVar2, new m(new d(i7, this, aVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f13205f.get();
        if (bool != null) {
            i(this.f13200a, bool.booleanValue());
        }
    }

    @Override // p048g4.b
    public final synchronized N4.b c(q qVar) {
        p113p3.f.l(qVar, "Null interface requested.");
        return (N4.b) this.f13201b.get(qVar);
    }

    @Override // p048g4.b
    public final o e(q qVar) {
        N4.b bVarC = c(qVar);
        if (bVarC == null) {
            return new o(o.f13223c, o.f13224d);
        }
        return bVarC instanceof o ? (o) bVarC : new o(null, bVarC);
    }

    @Override // p048g4.b
    public final synchronized N4.b g(q qVar) {
        n nVar = (n) this.f13202c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f13199h;
    }

    public final void i(HashMap map, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            N4.b bVar = (N4.b) entry.getValue();
            int i7 = aVar.f13192d;
            if (i7 == 1 || (i7 == 2 && z4)) {
                bVar.get();
            }
        }
        k kVar = this.f13204e;
        synchronized (kVar) {
            arrayDeque = (ArrayDeque) kVar.f13217c;
            if (arrayDeque != null) {
                kVar.f13217c = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                kVar.a((A4.a) it.next());
            }
        }
    }

    public final void j() {
        for (a aVar : this.f13200a.keySet()) {
            for (i iVar : aVar.f13191c) {
                boolean z4 = iVar.f13213b == 2;
                q qVar = iVar.f13212a;
                if (z4) {
                    HashMap map = this.f13202c;
                    if (!map.containsKey(qVar)) {
                        Set setEmptySet = Collections.emptySet();
                        n nVar = new n();
                        nVar.f13222b = null;
                        nVar.f13221a = Collections.newSetFromMap(new ConcurrentHashMap());
                        nVar.f13221a.addAll(setEmptySet);
                        map.put(qVar, nVar);
                    }
                }
                HashMap map2 = this.f13201b;
                if (map2.containsKey(qVar)) {
                    continue;
                } else {
                    int i7 = iVar.f13213b;
                    if (i7 == 1) {
                        throw new j("Unsatisfied dependency for component " + aVar + ": " + qVar);
                    }
                    if (i7 != 2) {
                        map2.put(qVar, new o(o.f13223c, o.f13224d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f13193e == 0) {
                N4.b bVar = (N4.b) this.f13200a.get(aVar);
                for (q qVar : aVar.f13190b) {
                    HashMap map = this.f13201b;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new K5.a(11, (o) ((N4.b) map.get(qVar)), bVar));
                    } else {
                        map.put(qVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f13200a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f13193e != 0) {
                N4.b bVar = (N4.b) entry.getValue();
                for (q qVar : aVar.f13190b) {
                    if (!map.containsKey(qVar)) {
                        map.put(qVar, new HashSet());
                    }
                    ((Set) map.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f13202c;
            if (map2.containsKey(key)) {
                n nVar = (n) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new K5.a(12, nVar, (N4.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f13222b = null;
                nVar2.f13221a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f13221a.addAll(set);
                map2.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
