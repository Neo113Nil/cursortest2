package O6;

import N6.l;
import t6.h;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5016a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(l lVar, int i7) {
        int i8;
        h.e(lVar, "<this>");
        int i9 = i7 + 1;
        int length = lVar.f4819e.length;
        int[] iArr = lVar.f4820f;
        h.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        return i8 >= 0 ? i8 : ~i8;
    }
}
