package E3;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class T extends K implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final T f2026a = new T();

    @Override // E3.K
    public final K a() {
        return J.f1999a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
