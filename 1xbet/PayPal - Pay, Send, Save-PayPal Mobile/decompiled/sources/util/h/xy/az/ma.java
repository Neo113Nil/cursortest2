package util.h.xy.az;

/* loaded from: classes5.dex */
public final class ma extends java.lang.Exception {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final long serialVersionUID = 1;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m25272() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 35) + (i | 35)) % 128;
        int i2 = this.getHighSpeedVideoSizes;
        int i3 = i + 73;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m25271() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 27) + (i | 27);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        int i3 = this.getHighSpeedVideoFpsRanges;
        if (i2 % 2 != 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25274(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 37;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = i;
            int i4 = i2 + 79;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoFpsRanges = i;
        throw null;
    }

    public ma() {
    }

    public ma(java.lang.String str, int i) {
        super(str);
        this.getHighSpeedVideoFpsRanges = i;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25273(int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 33) % 128;
        this.getHighSpeedVideoSizes = i;
        int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
