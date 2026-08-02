package X3;

import java.util.ArrayList;
import java.util.List;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class n extends AbstractC2346c {
    public static ArrayList L(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public static int M(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.l.f("<this>", arrayList);
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i5 = size - 1;
        while (i <= i5) {
            int i6 = (i + i5) >>> 1;
            int n5 = N4.b.n((Comparable) arrayList.get(i6), comparable);
            if (n5 < 0) {
                i = i6 + 1;
            } else {
                if (n5 <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i + 1);
    }

    public static int N(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        return list.size() - 1;
    }

    public static List O(Object... objArr) {
        kotlin.jvm.internal.l.f("elements", objArr);
        return objArr.length > 0 ? l.o0(objArr) : v.f6090k;
    }

    public static ArrayList P(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public static final List Q(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC2346c.A(list.get(0)) : v.f6090k;
    }

    public static void R() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
