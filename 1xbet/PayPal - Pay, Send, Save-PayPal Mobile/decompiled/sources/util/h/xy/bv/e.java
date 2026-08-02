package util.h.xy.bv;

/* loaded from: classes5.dex */
public class e extends util.h.xy.bv.rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoFpsRanges;

    public e(int i) {
        super(i);
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25689(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i & 67) + (i | 67)) % 128;
        this.getHighSpeedVideoFpsRanges = (byte[]) bArr.clone();
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i2 ^ 105) + ((i2 & 105) << 1)) % 128;
    }
}
