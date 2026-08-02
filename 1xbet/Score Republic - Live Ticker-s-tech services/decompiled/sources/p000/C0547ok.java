package p000;

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

/* JADX INFO: renamed from: ok */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0547ok implements InterfaceC0289hk {

    /* JADX INFO: renamed from: h */
    public static final C0473mk f5761h = new C0473mk(0);

    /* JADX INFO: renamed from: a */
    public Object f5762a;

    /* JADX INFO: renamed from: b */
    public Object f5763b;

    /* JADX INFO: renamed from: c */
    public Object f5764c;

    /* JADX INFO: renamed from: d */
    public Object f5765d;

    /* JADX INFO: renamed from: e */
    public Object f5766e;

    /* JADX INFO: renamed from: f */
    public Object f5767f;

    /* JADX INFO: renamed from: g */
    public Object f5768g;

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: c */
    public synchronized my0 mo2283c(cz0 cz0Var) {
        hh0 hh0Var = (hh0) ((HashMap) this.f5764c).get(cz0Var);
        if (hh0Var != null) {
            return hh0Var;
        }
        return f5761h;
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: f */
    public tu0 mo2286f(cz0 cz0Var) {
        my0 my0VarMo2287g = mo2287g(cz0Var);
        if (my0VarMo2287g == null) {
            return new tu0(tu0.f7601c, tu0.f7602d);
        }
        return my0VarMo2287g instanceof tu0 ? (tu0) my0VarMo2287g : new tu0(null, my0VarMo2287g);
    }

    @Override // p000.InterfaceC0289hk
    /* JADX INFO: renamed from: g */
    public synchronized my0 mo2287g(cz0 cz0Var) {
        kd0.m3010f(cz0Var, "Null interface requested.");
        return (my0) ((HashMap) this.f5763b).get(cz0Var);
    }

    /* JADX INFO: renamed from: i */
    public void m3697i(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C0805vj c0805vj = (C0805vj) entry.getKey();
            my0 my0Var = (my0) entry.getValue();
            int i = c0805vj.f8201d;
            if (i == 1 || (i == 2 && z)) {
                my0Var.get();
            }
        }
        C0337ix c0337ix = (C0337ix) this.f5766e;
        synchronized (c0337ix) {
            try {
                arrayDeque = c0337ix.f3689b;
                if (arrayDeque != null) {
                    c0337ix.f3689b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw AbstractC0024an.m280c(it);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3698j() {
        HashMap map = (HashMap) this.f5763b;
        HashMap map2 = (HashMap) this.f5764c;
        for (C0805vj c0805vj : ((HashMap) this.f5762a).keySet()) {
            for (C0481ms c0481ms : c0805vj.f8200c) {
                boolean z = c0481ms.f5153b == 2;
                cz0 cz0Var = c0481ms.f5152a;
                if (z && !map2.containsKey(cz0Var)) {
                    Set set = Collections.EMPTY_SET;
                    hh0 hh0Var = new hh0();
                    hh0Var.f3211b = null;
                    hh0Var.f3210a = Collections.newSetFromMap(new ConcurrentHashMap());
                    hh0Var.f3210a.addAll(set);
                    map2.put(cz0Var, hh0Var);
                } else if (map.containsKey(cz0Var)) {
                    continue;
                } else {
                    int i = c0481ms.f5153b;
                    if (i == 1) {
                        throw new C0555os("Unsatisfied dependency for component " + c0805vj + ": " + cz0Var, 2);
                    }
                    if (i != 2) {
                        map.put(cz0Var, new tu0(tu0.f7601c, tu0.f7602d));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public ArrayList m3699k(ArrayList arrayList) {
        HashMap map = (HashMap) this.f5763b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0805vj c0805vj = (C0805vj) obj;
            if (c0805vj.f8202e == 0) {
                my0 my0Var = (my0) ((HashMap) this.f5762a).get(c0805vj);
                for (cz0 cz0Var : c0805vj.f8199b) {
                    if (map.containsKey(cz0Var)) {
                        arrayList2.add(new RunnableC0195f1(5, (tu0) ((my0) map.get(cz0Var)), my0Var));
                    } else {
                        map.put(cz0Var, my0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public ArrayList m3700l() {
        HashMap map = (HashMap) this.f5764c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f5762a).entrySet()) {
            C0805vj c0805vj = (C0805vj) entry.getKey();
            if (c0805vj.f8202e != 0) {
                my0 my0Var = (my0) entry.getValue();
                for (cz0 cz0Var : c0805vj.f8199b) {
                    if (!map2.containsKey(cz0Var)) {
                        map2.put(cz0Var, new HashSet());
                    }
                    ((Set) map2.get(cz0Var)).add(my0Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                hh0 hh0Var = (hh0) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC0195f1(6, hh0Var, (my0) it.next()));
                }
            } else {
                cz0 cz0Var2 = (cz0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                hh0 hh0Var2 = new hh0();
                hh0Var2.f3211b = null;
                hh0Var2.f3210a = Collections.newSetFromMap(new ConcurrentHashMap());
                hh0Var2.f3210a.addAll(set);
                map.put(cz0Var2, hh0Var2);
            }
        }
        return arrayList;
    }
}
