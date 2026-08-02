package util.h.xy.aw;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoFpsRanges;

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25241() {
        int i = getHighSpeedVideoSizes + 111;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25242(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 77) + (i | 77);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = bArr;
            Camera2StreamConfigurationMap = (i + 25) % 128;
        } else {
            this.getHighSpeedVideoFpsRanges = bArr;
            throw null;
        }
    }
}
