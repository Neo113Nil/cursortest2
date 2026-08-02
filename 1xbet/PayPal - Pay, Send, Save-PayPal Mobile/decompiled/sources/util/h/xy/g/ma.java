package util.h.xy.g;

/* loaded from: classes5.dex */
public final class ma implements util.h.xy.g.b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private final util.h.xy.g.a getHighResolutionOutputSizeshNQ4ISI;
    private final util.h.xy.s.f[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.String getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;

    ma(java.lang.String str, util.h.xy.g.a aVar, byte[] bArr, util.h.xy.s.f[] fVarArr, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f711);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f712);
        }
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f694);
        }
        if (aVar.getHighSpeedVideoSizes() == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f759);
        }
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f784);
        }
        if (bArr.length == 0) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f774);
        }
        if (fVarArr == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f736);
        }
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f758);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aVar;
        this.getInputFormats = str;
        this.getInputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoFpsRangesFor = fVarArr;
        this.getHighSpeedVideoSizes = str2;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˏ */
    public final java.lang.String mo26866() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 31) % 128;
        java.lang.String str = this.getInputFormats;
        getHighSpeedVideoFpsRanges = ((i & 85) + (i | 85)) % 128;
        return str;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˊ */
    public final util.h.xy.g.a mo26864() {
        int i = (getHighSpeedVideoFpsRanges + 81) % 128;
        Camera2StreamConfigurationMap = i;
        util.h.xy.g.a aVar = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˎ */
    public final util.h.xy.s.a.b mo26865() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i ^ 111) + ((i & 111) << 1)) % 128;
        util.h.xy.s.a.b bVar = util.h.xy.s.a.b.f2297;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 65) + (i2 | 65);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.s.f[] m26871() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 67) + ((i & 67) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m26872() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 29) % 128;
        byte[] bArr = this.getInputSizeshNQ4ISI;
        int i2 = i + 91;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final java.lang.String m26870() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 69) + ((i & 69) << 1);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i3 | 89) << 1) - (i3 ^ 89)) % 128;
        return str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f845);
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(util.h.xy.al.ra.f272);
        sb.append(this.getInputFormats);
        sb.append('\'');
        sb.append(util.h.xy.al.ra.f849);
        sb.append(util.h.xy.ar.b.m25074(this.getInputSizeshNQ4ISI));
        sb.append('\'');
        sb.append(util.h.xy.al.ra.f857);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes().m26877());
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = Camera2StreamConfigurationMap + 27;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }
}
