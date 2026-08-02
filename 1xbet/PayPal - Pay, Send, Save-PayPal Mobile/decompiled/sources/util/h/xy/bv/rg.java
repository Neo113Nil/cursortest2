package util.h.xy.bv;

/* loaded from: classes18.dex */
public final class rg extends util.h.xy.bv.rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoSizes;

    public rg(int i) {
        super(i);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25761(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 79;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            int i3 = i + 53;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25760(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 47) % 128;
        this.getHighSpeedVideoSizes = (byte[]) bArr.clone();
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 57) << 1) - (i ^ 57)) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final java.lang.String m25759() {
        int i = Camera2StreamConfigurationMap + 117;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final byte[] m25758() {
        int i = getHighSpeedVideoFpsRangesFor + 89;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr = (byte[]) this.getHighSpeedVideoSizes.clone();
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i2 | 59) << 1) - (i2 ^ 59)) % 128;
        return bArr;
    }
}
