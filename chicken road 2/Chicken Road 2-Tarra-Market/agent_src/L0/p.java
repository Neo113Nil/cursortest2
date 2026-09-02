package L0;

import a.AbstractC0009a;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p extends AbstractC0009a {
    public static int L(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map M(K0.d pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f199a, pair.f200b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map N(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.j.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
