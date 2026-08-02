package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fm0 extends yd0 {
    /* JADX INFO: renamed from: G */
    public static int m1881G(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: H */
    public static Map m1882H(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C0448lw.f4914j;
        }
        int i = 0;
        if (size == 1) {
            kv0 kv0Var = (kv0) arrayList.get(0);
            kv0Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(kv0Var.f4582j, kv0Var.f4583k);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1881G(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            kv0 kv0Var2 = (kv0) obj;
            linkedHashMap.put(kv0Var2.f4582j, kv0Var2.f4583k);
        }
        return linkedHashMap;
    }
}
