package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public final class IntUtils {
    public static void quicksort(int[] iArr, int i, int i2) {
        while (i2 > i) {
            int i3 = iArr[i2];
            iArr[i2] = i3;
            iArr[i2] = i3;
            int i4 = i;
            int i5 = i4;
            while (i4 < i2) {
                int i6 = iArr[i4];
                if (i6 <= i3) {
                    int i7 = iArr[i5];
                    iArr[i5] = i6;
                    iArr[i4] = i7;
                    i5++;
                }
                i4++;
            }
            int i8 = iArr[i5];
            iArr[i5] = iArr[i2];
            iArr[i2] = i8;
            quicksort(iArr, i, i5 - 1);
            i = i5 + 1;
        }
    }

    public static java.lang.String toString(int[] iArr) {
        java.lang.String str = "";
        for (int i : iArr) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(i);
            sb.append(" ");
            str = sb.toString();
        }
        return str;
    }

    public static java.lang.String toHexString(int[] iArr) {
        return org.bouncycastle.pqc.math.linearalgebra.ByteUtils.toHexString(org.bouncycastle.pqc.math.linearalgebra.BigEndianConversions.toByteArray(iArr));
    }

    public static int[] subArray(int[] iArr, int i, int i2) {
        int i3 = i2 - i;
        int[] iArr2 = new int[i3];
        java.lang.System.arraycopy(iArr, i, iArr2, 0, i3);
        return iArr2;
    }

    public static void quicksort(int[] iArr) {
        quicksort(iArr, 0, iArr.length - 1);
    }

    public static void fill(int[] iArr, int i) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = i;
        }
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    public static int[] clone(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private IntUtils() {
    }
}
