package g6;

import java.util.Collection;

/* renamed from: g6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1161j extends AbstractC1160i {
    public static int N0(Iterable iterable) {
        t6.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
