package util.h.xy.bv;

/* loaded from: classes5.dex */
public class h extends util.h.xy.bv.rb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public h(int i) {
        super(i);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public java.lang.String m25696() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 51) % 128;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 73) + ((i & 73) << 1)) % 128;
        return str;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25698(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 99) % 128;
        this.getHighSpeedVideoFpsRanges = str;
        Camera2StreamConfigurationMap = (i + 47) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public java.lang.String m25694() {
        int i = getHighSpeedVideoSizes + 113;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25697(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 105) % 128;
        this.getHighSpeedVideoFpsRangesFor = str;
        getHighSpeedVideoSizes = (((i | 45) << 1) - (i ^ 45)) % 128;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public byte[] m25695() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 33) << 1) - (i ^ 33);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i | 91) << 1) - (i ^ 91);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25699(byte[] bArr) {
        int i = (Camera2StreamConfigurationMap + 117) % 128;
        getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        Camera2StreamConfigurationMap = ((i ^ 79) + ((i & 79) << 1)) % 128;
    }
}
