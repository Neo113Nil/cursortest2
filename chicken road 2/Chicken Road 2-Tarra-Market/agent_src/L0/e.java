package L0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends V.a {
    public static List O(Object... elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.length <= 0) {
            return l.f214a;
        }
        List asList = Arrays.asList(elements);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        return asList;
    }

    public static void P() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
