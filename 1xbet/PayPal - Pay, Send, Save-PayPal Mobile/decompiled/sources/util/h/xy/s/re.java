package util.h.xy.s;

/* loaded from: classes5.dex */
public class re {
    private static int Camera2StreamConfigurationMap = 92;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private int getHighSpeedVideoFpsRanges = 0;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private util.h.xy.s.e getHighSpeedVideoSizes;
    private util.h.xy.s.c getHighSpeedVideoSizesFor;
    private com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private util.h.xy.s.a getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private final boolean getOutputMinFrameDurationlomOqCM;
    private util.h.xy.s.rd getOutputSizeshNQ4ISI;
    private util.h.xy.s.rf getOutputStallDurationlomOqCM;

    public re(boolean z, boolean z2, boolean z3) {
        this.getOutputMinFrameDurationlomOqCM = z;
        this.getOutputMinFrameDuration = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.s.c m27371() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 65;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.s.c cVar = this.getHighSpeedVideoSizesFor;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i2 = ~identityHashCode;
        int i3 = (i2 ^ 183330470) | (i2 & 183330470);
        int i4 = -(-((~((i3 ^ (-1043221404)) | (i3 & (-1043221404)))) * 130));
        int i5 = ((i4 | (-1109880281)) << 1) - (i4 ^ (-1109880281));
        int i6 = ((i5 | 770622108) << 1) - (770622108 ^ i5);
        int i7 = ~((identityHashCode ^ (-872548634)) | (identityHashCode & (-872548634)));
        int i8 = -(-(((i7 ^ 12657700) | (i7 & 12657700)) * 130));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i9 = ~((249290031 ^ identityHashCode2) | (identityHashCode2 & 249290031));
        int i10 = ~identityHashCode2;
        int i11 = ~((i10 & (-1341324628)) | (i10 ^ (-1341324628)));
        int i12 = ~((1341914495 ^ identityHashCode2) | (identityHashCode2 & 1341914495));
        int i13 = (i10 & (-249290032)) | (i10 ^ (-249290032));
        int i14 = ~(((-1341324628) ^ i13) | (i13 & (-1341324628)));
        int i15 = (((((i9 ^ i11) | (i9 & i11)) * (-1808)) + 2061149340) - (~(-(-(((i14 ^ i12) | (i12 & i14)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))))) - 1;
        int i16 = ~((identityHashCode2 ^ 1341324627) | (identityHashCode2 & 1341324627));
        int i17 = (i16 ^ 1092624464) | (i16 & 1092624464);
        int i18 = ~i13;
        int i19 = ((i17 ^ i18) | (i17 & i18)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
        if ((i6 & i8) + (i8 | i6) > (i15 ^ i19) + ((i19 & i15) << 1)) {
            return cVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27381(util.h.xy.s.c cVar) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
        Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizesFor = cVar;
        int i2 = ((i | 33) << 1) - (i ^ 33);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27369(util.h.xy.s.a aVar) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 93) + ((i & 93) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getOutputFormats = aVar;
        Camera2StreamConfigurationMap = (((i2 | 51) << 1) - (i2 ^ 51)) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public util.h.xy.s.a m27376() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 21) << 1) - (i ^ 21)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        util.h.xy.s.a aVar = this.getOutputFormats;
        int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m27375() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 57) + ((i & 57) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        boolean z = this.getOutputMinFrameDurationlomOqCM;
        if (i2 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m27370() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 57) << 1) - (i ^ 57);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            if (!this.getOutputMinFrameDurationlomOqCM) {
                byte[] bArr = {0};
                Camera2StreamConfigurationMap = (i3 + 37) % 128;
                return bArr;
            }
            byte[] bArr2 = {1};
            int i4 = i + 111;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                return bArr2;
            }
            throw new java.lang.ArithmeticException();
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m27382() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 7) + ((i & 7) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        if (this.getOutputMinFrameDuration) {
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 13) % 128;
            return new byte[]{1};
        }
        byte[] bArr = {0};
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 37) + ((i2 & 37) << 1)) % 128;
        return bArr;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m27366() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 119) << 1) - (i ^ 119)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (this.getHighSpeedVideoFpsRangesFor) {
            Camera2StreamConfigurationMap = (i2 + 95) % 128;
            byte[] bArr = {1};
            Camera2StreamConfigurationMap = ((i2 & 39) + (i2 | 39)) % 128;
            return bArr;
        }
        byte[] bArr2 = {0};
        int i3 = ((i | 87) << 1) - (i ^ 87);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27372(int i) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 & 81) + (i2 | 81);
        int i4 = i3 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        if (i3 % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = i;
            Camera2StreamConfigurationMap = (i4 + 19) % 128;
        } else {
            this.getHighSpeedVideoFpsRanges = i;
            throw null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m27364() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
        Camera2StreamConfigurationMap = i;
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = (i ^ 79) + ((i & 79) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27373(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 17) << 1) - (i ^ 17);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            this.getInputSizeshNQ4ISI = str;
            getHighResolutionOutputSizeshNQ4ISI = (((i3 | 95) << 1) - (i3 ^ 95)) % 128;
        } else {
            this.getInputSizeshNQ4ISI = str;
            throw null;
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public java.lang.String m27383() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 21) % 128;
        return this.getInputSizeshNQ4ISI;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public util.h.xy.s.rd m27380() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 113;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.s.rd rdVar = this.getOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 79) + (i | 79)) % 128;
        return rdVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27378(util.h.xy.s.rd rdVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 37) + ((i & 37) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        this.getOutputSizeshNQ4ISI = rdVar;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 99) % 128;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public util.h.xy.s.rf m27365() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 35) + (i | 35);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.s.rf rfVar = this.getOutputStallDurationlomOqCM;
        Camera2StreamConfigurationMap = (((i3 | 47) << 1) - (i3 ^ 47)) % 128;
        return rfVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27379(util.h.xy.s.rf rfVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 93;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputStallDurationlomOqCM = rfVar;
            int i3 = (i ^ 115) + ((i & 115) << 1);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getOutputStallDurationlomOqCM = rfVar;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public util.h.xy.s.e m27368() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 41) + (i | 41)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        util.h.xy.s.e eVar = this.getHighSpeedVideoSizes;
        int i3 = i2 + 63;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27377(util.h.xy.s.e eVar) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 57) + (i | 57)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizes = eVar;
        Camera2StreamConfigurationMap = (i2 + 65) % 128;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m27367() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
        Camera2StreamConfigurationMap = i;
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel = this.getInputFormats;
        int i2 = i + 65;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return profileChannel;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27374(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 47;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 == 0) {
            this.getInputFormats = profileChannel;
            getHighResolutionOutputSizeshNQ4ISI = ((i2 & 63) + (i2 | 63)) % 128;
        } else {
            this.getInputFormats = profileChannel;
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f785);
        sb.append(util.h.xy.al.ra.f270);
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(util.h.xy.al.ra.f313);
        sb.append(this.getOutputFormats);
        sb.append(util.h.xy.al.ra.f453);
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(util.h.xy.al.ra.f455);
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(util.h.xy.al.ra.f447);
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(util.h.xy.al.ra.f485);
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append(util.h.xy.al.ra.f494);
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(util.h.xy.al.ra.f493);
        sb.append(this.getInputFormats);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 61) + (i | 61)) % 128;
        return obj;
    }
}
