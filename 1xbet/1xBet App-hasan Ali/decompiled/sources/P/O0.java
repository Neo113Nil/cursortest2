package P;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class O0 {
    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i, int i5) {
        int e3 = e(arrayList, i, i5);
        return e3 >= 0 ? e3 : -(e3 + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i5 = i * 5;
        return Integer.bitCount(iArr[i5 + 1] >> 28) + iArr[i5 + 4];
    }

    public static final void d(int i, int i5, int[] iArr) {
        if (i5 >= 0) {
        }
        int i6 = (i * 5) + 1;
        iArr[i6] = i5 | (iArr[i6] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i, int i5) {
        int size = arrayList.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            int i8 = ((C0280a) arrayList.get(i7)).f4439a;
            if (i8 < 0) {
                i8 += i5;
            }
            int g5 = kotlin.jvm.internal.l.g(i8, i);
            if (g5 < 0) {
                i6 = i7 + 1;
            } else {
                if (g5 <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
