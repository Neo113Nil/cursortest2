package L0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class f extends e {
    public static int Q(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
