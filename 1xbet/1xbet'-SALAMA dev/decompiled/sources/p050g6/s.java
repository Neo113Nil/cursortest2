package p050g6;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p003a.a;
import p044f6.d;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends a {
    public static int K0(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        return i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : f.API_PRIORITY_OTHER;
    }

    public static Map L0(d dVar) {
        h.e(dVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(dVar.f13006a, dVar.f13007b);
        h.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map M0(d... dVarArr) {
        if (dVarArr.length <= 0) {
            return q.f13309a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K0(dVarArr.length));
        O0(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap N0(d... dVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(K0(dVarArr.length));
        O0(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static final void O0(LinkedHashMap linkedHashMap, d[] dVarArr) {
        for (d dVar : dVarArr) {
            linkedHashMap.put(dVar.f13006a, dVar.f13007b);
        }
    }

    public static Map P0(ArrayList arrayList) {
        q qVar = q.f13309a;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            return L0((d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            linkedHashMap.put(dVar.f13006a, dVar.f13007b);
        }
        return linkedHashMap;
    }
}
