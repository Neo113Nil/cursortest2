package X3;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public abstract class z extends AbstractC2349a {
    public static Y3.g Q(Y3.g gVar) {
        gVar.b();
        gVar.f6172w = true;
        if (gVar.f6168s > 0) {
            return gVar;
        }
        Y3.g gVar2 = Y3.g.f6159x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>", gVar2);
        return gVar2;
    }

    public static int R(int i) {
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

    public static final void S(HashMap hashMap, W3.h[] hVarArr) {
        for (W3.h hVar : hVarArr) {
            hashMap.put(hVar.f6036k, hVar.f6037l);
        }
    }

    public static Map T(Map map) {
        kotlin.jvm.internal.l.f("<this>", map);
        int size = map.size();
        if (size == 0) {
            return w.f6091k;
        }
        if (size != 1) {
            return U(map);
        }
        kotlin.jvm.internal.l.f("<this>", map);
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.l.e("with(...)", singletonMap);
        return singletonMap;
    }

    public static LinkedHashMap U(Map map) {
        kotlin.jvm.internal.l.f("<this>", map);
        return new LinkedHashMap(map);
    }
}
