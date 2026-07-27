package e2;

import a.AbstractC0086a;
import d2.C0274d;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s extends AbstractC0086a {
    public static int j0(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map k0(C0274d pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f4845a, pair.f4846b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
}
