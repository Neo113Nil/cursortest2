package e2;

import java.util.Collection;

/* renamed from: e2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0294i extends AbstractC0293h {
    public static int U(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
