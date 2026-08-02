package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k71 extends xb1 implements x60 {

    /* JADX INFO: renamed from: n */
    public /* synthetic */ o71 f4297n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ zq0 f4298o;

    @Override // p000.x60
    /* JADX INFO: renamed from: e */
    public final Object mo928e(Object obj, Object obj2, Object obj3) {
        k71 k71Var = new k71(3, (InterfaceC0808vm) obj3);
        k71Var.f4297n = (o71) obj;
        k71Var.f4298o = (zq0) obj2;
        return k71Var.mo17m(kf1.f4365a);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        wo1.m5395v(obj);
        o71 o71Var = this.f4297n;
        zq0 zq0Var = this.f4298o;
        Set setKeySet = zq0Var.m6022a().keySet();
        ArrayList arrayList = new ArrayList(AbstractC0545oi.m3692r(setKeySet));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((rw0) it.next()).f6986a);
        }
        Map<String, ?> all = o71Var.f5646a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = o71Var.f5647b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fm0.m1881G(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = AbstractC0471mi.m3390x((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        zq0 zq0Var2 = new zq0(new LinkedHashMap(zq0Var.m6022a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                zq0Var2.m6025d(new rw0(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                zq0Var2.m6025d(new rw0(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                zq0Var2.m6025d(new rw0(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                zq0Var2.m6025d(new rw0(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                zq0Var2.m6025d(new rw0(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                zq0Var2.m6025d(new rw0(str), (Set) value2);
            }
        }
        return new zq0(new LinkedHashMap(zq0Var2.m6022a()), true);
    }
}
