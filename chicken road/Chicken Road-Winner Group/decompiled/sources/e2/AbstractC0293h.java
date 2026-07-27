package e2;

import java.util.Arrays;
import java.util.List;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0293h extends X0.a {
    public static List S(Object... elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.length <= 0) {
            return o.f4877a;
        }
        List asList = Arrays.asList(elements);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        return asList;
    }

    public static void T() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
