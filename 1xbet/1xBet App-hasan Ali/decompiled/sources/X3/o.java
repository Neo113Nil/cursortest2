package X3;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class o extends n {
    public static int S(Iterable iterable, int i) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
