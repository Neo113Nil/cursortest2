package util.h.xy.ad;

/* loaded from: classes5.dex */
final class mc {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    mc() {
    }

    public static void Camera2StreamConfigurationMap(int i, byte[] bArr, int i2) {
        int i3 = getHighSpeedVideoSizes;
        int i4 = (i3 & 105) + (i3 | 105);
        int i5 = i4 % 128;
        getHighSpeedVideoFpsRangesFor = i5;
        if (i4 % 2 != 0) {
            bArr[i2] = (byte) ((i ^ 32) + ((i & 32) << 1));
            int i6 = ((i2 | 116) << 1) - (i2 ^ 116);
            int i7 = (i6 ^ (-59)) + ((i6 & (-59)) << 1);
            bArr[i7] = (byte) (i / 112);
            int i8 = (i7 ^ (-2)) + ((i7 & (-2)) << 1);
            int i9 = (i8 & 39) + (i8 | 39);
            bArr[i9] = (byte) ((i & (-67)) + (i | (-67)));
            bArr[((i9 | 105) << 1) - (i9 ^ 105)] = (byte) i;
        } else {
            bArr[i2] = (byte) (i >>> 24);
            int i10 = i2 + 1;
            bArr[i10] = (byte) (i >>> 16);
            int i11 = ((i10 | 34) << 1) - (i10 ^ 34);
            int i12 = ((i11 | (-33)) << 1) - (i11 ^ (-33));
            bArr[i12] = (byte) (i >>> 8);
            bArr[i12 + 1] = (byte) i;
        }
        int i13 = i5 + 15;
        getHighSpeedVideoSizes = i13 % 128;
        if (i13 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
