package util.h.xy.cn;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;
    private byte[] getOutputFormats;

    public ma(java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr, int i, java.lang.String str) {
        this.getOutputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap(map);
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = str;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.getOutputFormats = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25976() {
        byte[] bArr;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 45) + ((i & 45) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        byte[] bArr2 = this.getOutputFormats;
        if (bArr2 != null) {
            int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                bArr = new byte[bArr2.length];
                java.lang.System.arraycopy(bArr2, 1, bArr, 0, bArr2.length);
            } else {
                bArr = new byte[bArr2.length];
                java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            }
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i4 & 107) + (i4 | 107)) % 128;
        } else {
            bArr = null;
        }
        int i5 = Camera2StreamConfigurationMap;
        int i6 = (i5 & 1) + (i5 | 1);
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m25977() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 33) << 1) - (i ^ 33);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i | 37) << 1) - (i ^ 37)) % 128;
        return i3;
    }
}
