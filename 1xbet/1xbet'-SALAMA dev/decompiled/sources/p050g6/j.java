package p050g6;

import java.util.Collection;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends i {
    public static int N0(Iterable iterable) {
        h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
