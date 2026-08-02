package E3;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class J extends K implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final J f1999a = new J();

    @Override // E3.K
    public final K a() {
        return T.f2026a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
