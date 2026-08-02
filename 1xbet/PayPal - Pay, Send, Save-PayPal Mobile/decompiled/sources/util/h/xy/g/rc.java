package util.h.xy.g;

/* loaded from: classes5.dex */
public class rc implements util.h.xy.g.b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final util.h.xy.g.a getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final java.lang.String getOutputMinFrameDuration;
    private final byte[] getOutputMinFrameDurationlomOqCM;
    private final byte[] getOutputSizeshNQ4ISI;
    private final byte[] getOutputStallDuration;
    private final util.h.xy.s.f[] getOutputStallDurationlomOqCM;

    rc(java.lang.String str, util.h.xy.g.a aVar, byte[] bArr, util.h.xy.s.f[] fVarArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9) {
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
        if (bArr6 == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f828);
        }
        this.getInputSizeshNQ4ISI = aVar;
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoSizesFor = bArr;
        this.getOutputStallDurationlomOqCM = fVarArr;
        this.getOutputStallDuration = bArr2;
        this.getOutputSizeshNQ4ISI = bArr3;
        this.Camera2StreamConfigurationMap = bArr4;
        this.getHighSpeedVideoFpsRangesFor = bArr5;
        this.getHighSpeedVideoSizes = bArr6;
        this.getOutputMinFrameDurationlomOqCM = bArr7;
        this.getOutputFormats = bArr8;
        this.getInputFormats = bArr9;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˏ */
    public java.lang.String mo26866() {
        java.lang.String str = this.getOutputMinFrameDuration;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 11) % 128;
        return str;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˊ */
    public util.h.xy.g.a mo26864() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
        getHighSpeedVideoFpsRanges = i;
        util.h.xy.g.a aVar = this.getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = (i + 95) % 128;
        return aVar;
    }

    @Override // util.h.xy.g.b
    /* renamed from: ˎ */
    public util.h.xy.s.a.b mo26865() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 29) + ((i & 29) << 1)) % 128;
        util.h.xy.s.a.b bVar = util.h.xy.s.a.b.f2298;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.s.f[] m26896() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i + 121) % 128;
        util.h.xy.s.f[] fVarArr = this.getOutputStallDurationlomOqCM;
        int i2 = (i & 49) + (i | 49);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return fVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] m26894() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 113) + (i | 113);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        int i3 = i + 7;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] m26888() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i + 11) % 128;
        byte[] bArr = this.getOutputSizeshNQ4ISI;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public byte[] m26895() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 83) % 128;
        byte[] bArr = this.getOutputStallDuration;
        getHighResolutionOutputSizeshNQ4ISI = (i + 79) % 128;
        return bArr;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public byte[] m26889() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 119) << 1) - (i ^ 119)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 3) << 1) - (i2 ^ 3)) % 128;
        return bArr;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m26890() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 75) << 1) - (i ^ 75);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i3 = i + 83;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ι, reason: contains not printable characters */
    public byte[] m26897() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 9) + (i | 9)) % 128;
        byte[] bArr = this.getHighSpeedVideoSizes;
        int i2 = (i & 89) + (i | 89);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public byte[] m26893() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 75) + ((i & 75) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        int i3 = (i2 ^ 29) + ((i2 & 29) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public byte[] m26891() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 31) + ((i & 31) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        byte[] bArr = this.getOutputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 85) % 128;
        return bArr;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public byte[] m26892() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 51) << 1) - (i ^ 51)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        byte[] bArr = this.getInputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 27) << 1) - (i2 ^ 27)) % 128;
        return bArr;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f848);
        sb.append(util.h.xy.al.ra.f272);
        sb.append(this.getOutputMinFrameDuration);
        sb.append('\'');
        sb.append(util.h.xy.al.ra.f857);
        sb.append(this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes().m26877());
        sb.append('\'');
        sb.append(util.h.xy.al.ra.f849);
        sb.append(util.h.xy.ar.b.m25074(this.getHighSpeedVideoSizesFor));
        sb.append('\'');
        sb.append(util.h.xy.al.ra.f296);
        sb.append(util.h.xy.ar.b.m25074(this.getOutputStallDuration));
        sb.append('\'');
        sb.append(util.h.xy.al.ra.f288);
        sb.append(util.h.xy.ar.b.m25074(this.getOutputSizeshNQ4ISI));
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }
}
