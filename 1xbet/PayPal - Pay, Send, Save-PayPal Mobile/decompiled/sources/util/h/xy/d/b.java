package util.h.xy.d;

/* loaded from: classes5.dex */
public class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private final util.h.xy.d.mg getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final int getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState getOutputMinFrameDuration;
    private final int getOutputSizes;
    private final int getOutputSizeshNQ4ISI;
    private final int getOutputStallDuration;
    private final int getOutputStallDurationlomOqCM;

    public b(int i, int i2, int i3, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, boolean z, util.h.xy.d.mg mgVar, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.getOutputStallDurationlomOqCM = i;
        this.getInputSizeshNQ4ISI = i2;
        this.getOutputSizes = i3;
        this.getOutputMinFrameDuration = digitalizedCardState;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighSpeedVideoSizes = mgVar;
        this.getOutputStallDuration = i4;
        this.getHighResolutionOutputSizeshNQ4ISI = i5;
        this.getOutputSizeshNQ4ISI = i6;
        this.getHighSpeedVideoFpsRangesFor = i7;
        this.getInputFormats = i8;
        this.getOutputFormats = i9;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m26138() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 59) % 128;
        boolean z = this.getHighSpeedVideoSizesFor;
        int i2 = (i & 87) + (i | 87);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public int m26143() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 7;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.getOutputStallDurationlomOqCM;
        getHighSpeedVideoFpsRanges = (i + 65) % 128;
        return i3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int m26139() {
        int i = getHighSpeedVideoFpsRanges + 11;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getInputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m26141() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 89) + (i | 89);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getOutputSizes;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m26136() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 7) % 128;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = this.getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = ((i & 97) + (i | 97)) % 128;
        return digitalizedCardState;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public util.h.xy.d.mg m26133() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 19) + (i | 19)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        util.h.xy.d.mg mgVar = this.getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i2 & 107) + (i2 | 107)) % 128;
        return mgVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m26131() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.getOutputStallDuration;
        int i4 = ((i | 19) << 1) - (i ^ 19);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m26132() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i | 97) << 1) - (i ^ 97)) % 128;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i + 63;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public int m26142() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 3;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i | 79) << 1) - (i ^ 79)) % 128;
        return i3;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public int m26145() {
        int i = Camera2StreamConfigurationMap + 115;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m26134() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 37) + (i | 37);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getInputFormats;
        }
        throw null;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public int m26135() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i & 19) + (i | 19)) % 128;
        int i2 = this.getOutputFormats;
        Camera2StreamConfigurationMap = (i + 29) % 128;
        return i2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m26137(java.lang.String str, java.lang.String str2) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 117) + (i | 117);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            if (this.getHighSpeedVideoSizes == null) {
                m26143();
                m26138();
                m26132();
                m26142();
                m26131();
                m26145();
                m26139();
                m26134();
                m26136();
                m26141();
                m26135();
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 19) % 128;
            } else {
                Camera2StreamConfigurationMap = (((i3 | 7) << 1) - (i3 ^ 7)) % 128;
                m26143();
                m26138();
                m26133();
                m26132();
                m26142();
                m26131();
                m26145();
                m26139();
                m26134();
                m26136();
                m26141();
                m26135();
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 79) % 128;
            }
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = (i4 & 31) + (i4 | 31);
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m26140(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 55) << 1) - (i ^ 55);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            m26137(str, util.h.xy.cb.b.f1091);
        } else {
            m26137(str, util.h.xy.cb.b.f1091);
            throw new java.lang.ArithmeticException();
        }
    }

    static {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if (m26134() >= 65535) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m26144(java.lang.String str) {
        boolean z;
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 107) + (i2 | 107);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            m26143();
            m26134();
            if (m26143() < 65535) {
                z = true;
                i = Camera2StreamConfigurationMap + 33;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    m26134();
                    throw null;
                }
            }
            try {
                util.h.xy.k.mb.m26931(util.h.xy.k.ra.f2243.m26950(str).getResult());
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            }
            z = true;
        } else {
            m26143();
            m26134();
            if (m26143() < 65535) {
                z = false;
                i = Camera2StreamConfigurationMap + 33;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                }
            }
            util.h.xy.k.mb.m26931(util.h.xy.k.ra.f2243.m26950(str).getResult());
            z = true;
        }
        int i4 = Camera2StreamConfigurationMap;
        int i5 = ((i4 | 85) << 1) - (i4 ^ 85);
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
