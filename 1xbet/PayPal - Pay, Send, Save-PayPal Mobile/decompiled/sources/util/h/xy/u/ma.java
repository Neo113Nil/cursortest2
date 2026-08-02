package util.h.xy.u;

/* loaded from: classes5.dex */
public class ma {
    private static int Camera2StreamConfigurationMap = 46;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.aa.d getHighSpeedVideoFpsRanges = null;
    private java.security.Signature getInputSizeshNQ4ISI = null;
    private byte[] getHighSpeedVideoFpsRangesFor = null;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI = null;

    static {
        int i = 46 % 2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27531(util.h.xy.aa.d dVar) {
        int i = Camera2StreamConfigurationMap + 69;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = dVar;
        } else {
            this.getHighSpeedVideoFpsRanges = dVar;
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27529(java.security.Signature signature) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 31) + ((i & 31) << 1);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            this.getInputSizeshNQ4ISI = signature;
            getHighSpeedVideoSizes = ((i3 & 53) + (i3 | 53)) % 128;
        } else {
            this.getInputSizeshNQ4ISI = signature;
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public java.security.Signature m27526() {
        int i = getHighSpeedVideoSizes + 49;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.security.Signature signature = this.getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i2 & 1) + (i2 | 1)) % 128;
        return signature;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.aa.d m27528() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 49) + (i | 49);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.aa.d dVar = this.getHighSpeedVideoFpsRanges;
        int i4 = (i3 & 91) + (i3 | 91);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            return dVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27527(java.lang.String str) {
        int i = (Camera2StreamConfigurationMap + 51) % 128;
        getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        Camera2StreamConfigurationMap = ((i ^ 65) + ((i & 65) << 1)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public java.lang.String m27530() {
        int i = getHighSpeedVideoSizes;
        int i2 = (((i | 103) << 1) - (i ^ 103)) % 128;
        Camera2StreamConfigurationMap = i2;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i2 ^ 91) + ((i2 & 91) << 1)) % 128;
        return str;
    }
}
