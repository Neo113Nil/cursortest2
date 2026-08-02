package Hj0;

import S0.C3945c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Hj0.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3156m {
    public static final boolean a(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 67108864) != 0;
    }

    public static final int b(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    public static final C3945c c(ArrayList arrayList, int i11, int i12) {
        int p11 = p(arrayList, i11, i12);
        if (p11 >= 0) {
            return (C3945c) arrayList.get(p11);
        }
        return null;
    }

    public static final int d(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 3];
    }

    public static final boolean e(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean f(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean g(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 1073741824) != 0;
    }

    public static final int h(ArrayList arrayList, int i11, int i12) {
        int p11 = p(arrayList, i11, i12);
        return p11 >= 0 ? p11 : -(p11 + 1);
    }

    public static final int i(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1] & 67108863;
    }

    public static final int j(int[] iArr, int i11) {
        int i12 = i11 * 5;
        int i13 = iArr[i12 + 4];
        int i14 = 1;
        switch (iArr[i12 + 1] >> 30) {
            case 0:
                i14 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        return i13 + i14;
    }

    public static final int k(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 2];
    }

    public static final int m(int[] iArr, int i11) {
        int i12 = i11 * 5;
        int i13 = iArr[i12 + 4];
        int i14 = 1;
        switch (iArr[i12 + 1] >> 28) {
            case 0:
                i14 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        return i13 + i14;
    }

    public static final void n(int i11, int i12, int[] iArr) {
        S0.r.u(i12 >= 0);
        iArr[(i11 * 5) + 3] = i12;
    }

    public static final void o(int i11, int i12, int[] iArr) {
        S0.r.u(i12 >= 0 && i12 < 67108863);
        int i13 = (i11 * 5) + 1;
        iArr[i13] = i12 | (iArr[i13] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(ArrayList arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int a11 = ((C3945c) arrayList.get(i14)).a();
            if (a11 < 0) {
                a11 += i12;
            }
            int i15 = Intrinsics.i(a11, i11);
            if (i15 < 0) {
                i13 = i14 + 1;
            } else {
                if (i15 <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }
}
