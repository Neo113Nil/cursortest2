package util.h.xy.au;

/* loaded from: classes18.dex */
public final class c {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private byte[][] getHighResolutionOutputSizeshNQ4ISI;

    public c(byte[][] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[][] m25119() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[][] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i | 39) << 1) - (i ^ 39)) % 128;
        return bArr;
    }
}
