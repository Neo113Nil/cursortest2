package util.h.xz.b;

/* loaded from: classes5.dex */
public class b {
    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m27722(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            getHighSpeedVideoFpsRangesFor(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            i4++;
            int i6 = i2 ^ ((iArr2[2][(i5 >>> 8) & 255] ^ (iArr2[0][(i5 >>> 24) & 255] + iArr2[1][(i5 >>> 16) & 255])) + iArr2[3][i5 & 255]);
            i2 = i5;
            i = i6;
        }
        int i7 = iArr[iArr.length - 2];
        int i8 = iArr[iArr.length - 1];
        if (!z) {
            getHighSpeedVideoFpsRangesFor(iArr);
        }
        iArr3[0] = i2 ^ i8;
        iArr3[1] = i ^ i7;
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
