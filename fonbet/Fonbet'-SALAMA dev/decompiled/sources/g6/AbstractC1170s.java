package g6;

import a.AbstractC0603a;
import f6.C1111d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: g6.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1170s extends AbstractC0603a {
    public static int K0(int i7) {
        return i7 < 0 ? i7 : i7 < 3 ? i7 + 1 : i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map L0(C1111d c1111d) {
        t6.h.e(c1111d, "pair");
        Map singletonMap = Collections.singletonMap(c1111d.f13000a, c1111d.f13001b);
        t6.h.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map M0(C1111d... c1111dArr) {
        if (c1111dArr.length <= 0) {
            return C1168q.f13303a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K0(c1111dArr.length));
        O0(linkedHashMap, c1111dArr);
        return linkedHashMap;
    }

    public static LinkedHashMap N0(C1111d... c1111dArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(K0(c1111dArr.length));
        O0(linkedHashMap, c1111dArr);
        return linkedHashMap;
    }

    public static final void O0(LinkedHashMap linkedHashMap, C1111d[] c1111dArr) {
        for (C1111d c1111d : c1111dArr) {
            linkedHashMap.put(c1111d.f13000a, c1111d.f13001b);
        }
    }

    public static Map P0(ArrayList arrayList) {
        C1168q c1168q = C1168q.f13303a;
        int size = arrayList.size();
        if (size == 0) {
            return c1168q;
        }
        if (size == 1) {
            return L0((C1111d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1111d c1111d = (C1111d) it.next();
            linkedHashMap.put(c1111d.f13000a, c1111d.f13001b);
        }
        return linkedHashMap;
    }
}
