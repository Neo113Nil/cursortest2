package util.h.xy.dc;

/* loaded from: classes5.dex */
public class a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26265(byte[] bArr, byte b, long j) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        getHighResolutionOutputSizeshNQ4ISI = (i + 75) % 128;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 49) % 128;
            if (((1 << i2) & j) != 0) {
                int i4 = (i3 & 95) + (i3 | 95);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    byte b2 = bArr[i2];
                    bArr[i2] = (byte) (((~b) & b2) | ((~b2) & b));
                    throw null;
                }
                byte b3 = bArr[i2];
                bArr[i2] = (byte) ((b3 & (~b)) | ((~b3) & b));
            }
        }
        int i5 = getHighResolutionOutputSizeshNQ4ISI;
        int i6 = (i5 & 83) + (i5 | 83);
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
