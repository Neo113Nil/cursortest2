package Qe0;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class i<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return Vc.a.b(Long.valueOf(-((Long) t2).longValue()), Long.valueOf(-((Long) t11).longValue()));
    }
}
