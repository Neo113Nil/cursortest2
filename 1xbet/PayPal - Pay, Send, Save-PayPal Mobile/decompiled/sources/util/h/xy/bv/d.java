package util.h.xy.bv;

/* loaded from: classes5.dex */
public class d extends util.h.xy.bv.rb {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;

    public d(int i) {
        super(i);
    }

    @util.h.xy.a.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] m25684() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = (byte[]) this.getHighSpeedVideoFpsRanges.clone();
        if (i3 != 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25688(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 93) % 128;
        this.getHighSpeedVideoFpsRanges = (byte[]) bArr.clone();
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 59) + (i | 59)) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m25686() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 57) << 1) - (i ^ 57)) % 128;
        byte[] bArr = (byte[]) this.Camera2StreamConfigurationMap.clone();
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i2 & 67) + (i2 | 67)) % 128;
        return bArr;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25687(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 53;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
        } else {
            this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public void m25685() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 111) + ((i & 111) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.ar.b.m25100(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        } else {
            util.h.xy.ar.b.m25100(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }
        int i3 = getHighSpeedVideoSizes + 43;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
