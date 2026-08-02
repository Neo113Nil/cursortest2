package R;

import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(int i, int i5, List list) {
        if (i > i5) {
            f(i, i5);
        }
        if (i < 0) {
            d(i);
        }
        if (i5 > list.size()) {
            e(i5, list.size());
        }
    }

    private static final void c(int i, int i5) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i5 + " elements.");
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(L1.a.l(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i5) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i5 + ')');
    }

    private static final void f(int i, int i5) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i5 + ").");
    }
}
