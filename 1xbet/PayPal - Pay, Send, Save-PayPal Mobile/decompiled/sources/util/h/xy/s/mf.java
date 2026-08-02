package util.h.xy.s;

/* loaded from: classes5.dex */
public final class mf extends util.h.xy.s.me {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27245() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 79;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (bArr != null) {
                return (byte[]) bArr.clone();
            }
            int i3 = (((i | 25) << 1) - (i ^ 25)) % 128;
            Camera2StreamConfigurationMap = i3;
            int i4 = (i3 ^ 1) + ((i3 & 1) << 1);
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27244(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 17) % 128;
        this.getHighSpeedVideoFpsRangesFor = bArr;
        int i2 = (i & 83) + (i | 83);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
