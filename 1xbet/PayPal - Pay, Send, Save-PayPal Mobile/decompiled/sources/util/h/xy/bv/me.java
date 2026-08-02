package util.h.xy.bv;

/* loaded from: classes5.dex */
public final class me extends util.h.xy.bv.rb {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String[] getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final java.lang.String m25710() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 25) + (i | 25)) % 128;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 27) + ((i & 27) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25715(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 57) % 128;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        int i2 = (i ^ 63) + ((i & 63) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public me(int i) {
        super(i);
        this.getInputSizeshNQ4ISI = false;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25719(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 89;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            this.Camera2StreamConfigurationMap = str;
        } else {
            this.Camera2StreamConfigurationMap = str;
            throw null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final java.lang.String m25711() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.Camera2StreamConfigurationMap;
        int i3 = (i ^ 27) + ((i & 27) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25717(boolean z) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (((i | 119) << 1) - (i ^ 119)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getInputSizeshNQ4ISI = z;
        getHighSpeedVideoFpsRangesFor = (i2 + 25) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m25712() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 65) + (i | 65);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        boolean z = this.getInputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i3 & 119) + (i3 | 119)) % 128;
        return z;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final java.lang.String[] m25716() {
        int i = getHighSpeedVideoFpsRangesFor + 31;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ar.b.m25104(this.getHighSpeedVideoSizes);
            throw new java.lang.ArithmeticException();
        }
        java.lang.String[] m25104 = util.h.xy.ar.b.m25104(this.getHighSpeedVideoSizes);
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i2 ^ 39) + ((i2 & 39) << 1)) % 128;
        return m25104;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25720(java.lang.String[] strArr) {
        int i = getHighSpeedVideoFpsRangesFor + 71;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoSizes = util.h.xy.ar.b.m25104(strArr);
            int i2 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i2 & 65) + (i2 | 65)) % 128;
            return;
        }
        this.getHighSpeedVideoSizes = util.h.xy.ar.b.m25104(strArr);
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25718(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 95) % 128;
        this.getInputFormats = str;
        int i2 = ((i | 111) << 1) - (i ^ 111);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final java.lang.String m25713() {
        int i = getHighSpeedVideoFpsRanges + 83;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        int i3 = (i2 ^ 91) + ((i2 & 91) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25714(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 107;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoSizesFor = str;
            int i3 = ((i | 61) << 1) - (i ^ 61);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoSizesFor = str;
        throw null;
    }
}
