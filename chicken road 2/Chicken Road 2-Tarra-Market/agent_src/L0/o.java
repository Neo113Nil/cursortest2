package L0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class o extends p {
    public static Map O(K0.d... dVarArr) {
        if (dVarArr.length <= 0) {
            return m.f215a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.L(dVarArr.length));
        P(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static final void P(LinkedHashMap linkedHashMap, K0.d[] dVarArr) {
        for (K0.d dVar : dVarArr) {
            linkedHashMap.put(dVar.f199a, dVar.f200b);
        }
    }

    public static List Q(Map map) {
        int size = map.size();
        l lVar = l.f214a;
        if (size == 0) {
            return lVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return lVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return V.a.p(new K0.d(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new K0.d(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new K0.d(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map R(ArrayList arrayList) {
        m mVar = m.f215a;
        int size = arrayList.size();
        if (size == 0) {
            return mVar;
        }
        if (size == 1) {
            return p.M((K0.d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.L(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            K0.d dVar = (K0.d) it.next();
            linkedHashMap.put(dVar.f199a, dVar.f200b);
        }
        return linkedHashMap;
    }

    public static LinkedHashMap S(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
