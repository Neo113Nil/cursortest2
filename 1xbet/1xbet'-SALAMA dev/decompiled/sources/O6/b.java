package O6;

import N6.l;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5016a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int a(l lVar, int i7) {
        int i8;
        h.e(lVar, "<this>");
        int i9 = i7 + 1;
        int length = lVar.f4819e.length;
        int[] iArr = lVar.f4820f;
        h.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (i11 <= i10) {
            i8 = (i11 + i10) >>> 1;
            int i12 = iArr[i8];
            if (i12 < i9) {
                i11 = i8 + 1;
            } else {
                if (i12 <= i9) {
                    if (i8 >= 0) {
                        return i8;
                    }
                    return ~i8;
                }
                i10 = i8 - 1;
            }
        }
        i8 = (-i11) - 1;
        if (i8 >= 0) {
            return i8;
        }
        return ~i8;
    }
}
