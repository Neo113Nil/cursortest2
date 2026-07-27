package e2;

import d2.C0274d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class r extends s {
    public static HashMap l0(C0274d... c0274dArr) {
        HashMap hashMap = new HashMap(s.j0(c0274dArr.length));
        n0(hashMap, c0274dArr);
        return hashMap;
    }

    public static Map m0(C0274d... c0274dArr) {
        if (c0274dArr.length <= 0) {
            return p.f4878a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.j0(c0274dArr.length));
        n0(linkedHashMap, c0274dArr);
        return linkedHashMap;
    }

    public static final void n0(HashMap hashMap, C0274d[] c0274dArr) {
        for (C0274d c0274d : c0274dArr) {
            hashMap.put(c0274d.f4845a, c0274d.f4846b);
        }
    }

    public static List o0(Map map) {
        int size = map.size();
        o oVar = o.f4877a;
        if (size != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return X0.a.z(new C0274d(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new C0274d(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new C0274d(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return oVar;
    }

    public static Map p0(ArrayList arrayList) {
        p pVar = p.f4878a;
        int size = arrayList.size();
        if (size == 0) {
            return pVar;
        }
        if (size == 1) {
            return s.k0((C0274d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.j0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0274d c0274d = (C0274d) it.next();
            linkedHashMap.put(c0274d.f4845a, c0274d.f4846b);
        }
        return linkedHashMap;
    }

    public static LinkedHashMap q0(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
