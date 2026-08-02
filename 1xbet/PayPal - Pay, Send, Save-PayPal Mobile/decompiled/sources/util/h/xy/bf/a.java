package util.h.xy.bf;

/* loaded from: classes5.dex */
public class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 75;
    private boolean getHighSpeedVideoSizesFor = false;
    private boolean getInputSizeshNQ4ISI = false;
    private boolean getInputFormats = false;
    private boolean getOutputFormats = false;
    private boolean getOutputMinFrameDurationlomOqCM = false;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private boolean getHighSpeedVideoFpsRanges = false;
    private boolean getOutputMinFrameDuration = false;
    private boolean getHighSpeedVideoSizes = false;

    static {
        int i = 75 % 2;
    }

    a() {
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public boolean m25408() {
        int i = Camera2StreamConfigurationMap + 103;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        boolean z = this.getInputSizeshNQ4ISI;
        int i3 = i2 + 35;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25403(boolean z) {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 43;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInputSizeshNQ4ISI = z;
            int i3 = i + 11;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getInputSizeshNQ4ISI = z;
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m25402() {
        boolean z = this.getInputFormats;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 49) % 128;
        return z;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25407(boolean z) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            this.getInputFormats = z;
            int i4 = (i3 ^ 53) + ((i3 & 53) << 1);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getInputFormats = z;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m25399() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25398(boolean z) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 105) << 1) - (i ^ 105)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoFpsRanges = z;
        int i3 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m25404() {
        int i = Camera2StreamConfigurationMap + 75;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw null;
        }
        boolean z = this.getOutputFormats;
        int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25401(boolean z) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 87) << 1) - (i ^ 87)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        this.getOutputFormats = z;
        Camera2StreamConfigurationMap = (i2 + 3) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m25397() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 69) % 128;
        boolean z = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = ((i & 15) + (i | 15)) % 128;
        return z;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25396(boolean z) {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 37) % 128;
        this.getHighSpeedVideoSizesFor = z;
        int i2 = ((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r4 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r4 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        m25394(false);
        r4 = util.h.xy.bf.a.getHighSpeedVideoFpsRangesFor;
        util.h.xy.bf.a.Camera2StreamConfigurationMap = ((r4 ^ 51) + ((r4 & 51) << 1)) % 128;
     */
    /* renamed from: ι, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25410(boolean z) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 41) << 1) - (i ^ 41);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            m25396(false);
            m25401(true);
            m25400();
            m25407(false);
            m25403(false);
        } else {
            m25396(false);
            m25401(false);
            m25400();
            m25407(false);
            m25403(false);
        }
        m25398(false);
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public boolean m25406() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getOutputMinFrameDurationlomOqCM;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public void m25405(boolean z) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 17) + (i | 17)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        this.getOutputMinFrameDurationlomOqCM = z;
        Camera2StreamConfigurationMap = (((i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m25393() {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 69) % 128;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 75) + ((i & 75) << 1)) % 128;
        return z;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m25390(boolean z) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 85) << 1) - (i ^ 85)) % 128;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        int i2 = (i ^ 3) + ((i & 3) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m25391() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 25) + ((i & 25) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.getHighSpeedVideoSizes;
        int i4 = (i3 ^ 77) + ((i3 & 77) << 1);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m25394(boolean z) {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = (~(i | 738903734)) | (-2109396672);
        int i3 = ~((i ^ 1571984041) | (i & 1571984041));
        int i4 = ((i2 ^ i3) | (i2 & i3)) * (-1136);
        int i5 = (~(738903734 | identityHashCode)) | (~((1571984041 & identityHashCode) | (identityHashCode ^ 1571984041)));
        int i6 = ~((-201491105) | i);
        int i7 = (((i4 | (-635152537)) << 1) - (i4 ^ (-635152537))) + (((i5 ^ i6) | (i5 & i6)) * (-568));
        int i8 = ~(((-738903735) ^ i) | (i & (-738903735)));
        int i9 = ~((i ^ (-1571984042)) | (i & (-1571984042)));
        int i10 = (i9 ^ i8) | (i9 & i8);
        int i11 = ~((identityHashCode ^ 2109396671) | (identityHashCode & 2109396671));
        int i12 = ((i11 ^ i10) | (i11 & i10)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i13 = ~identityHashCode2;
        int i14 = (i13 ^ (-160107062)) | (i13 & (-160107062));
        int i15 = (~((i14 ^ (-2017928144)) | (i14 & (-2017928144)))) * 130;
        int i16 = (i15 & 2113881327) + (i15 | 2113881327);
        int i17 = ~((identityHashCode2 ^ (-134414854)) | (identityHashCode2 & (-134414854)));
        if ((i7 ^ i12) + ((i12 & i7) << 1) > ((((i16 | (-588123412)) << 1) - ((-588123412) ^ i16)) - (~(-(-((((-2043620352) ^ i17) | (i17 & (-2043620352))) * 130))))) - 1) {
            this.getHighSpeedVideoSizes = z;
        } else {
            this.getHighSpeedVideoSizes = z;
            throw null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m25395() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 43) + ((i & 43) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        boolean z = this.getOutputMinFrameDuration;
        getHighSpeedVideoFpsRangesFor = (i2 + 89) % 128;
        return z;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m25392(boolean z) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 49) + ((i & 49) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputMinFrameDuration = z;
        } else {
            this.getOutputMinFrameDuration = z;
            throw null;
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public void m25409() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 41) % 128;
        this.getOutputMinFrameDuration = true;
        util.h.xy.bf.mc.f939.m25440(util.h.xy.bu.rb.m25676());
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 1) << 1) - (1 ^ i)) % 128;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public void m25400() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 109) + ((i & 109) << 1)) % 128;
        this.getOutputMinFrameDuration = false;
        util.h.xy.bf.mc.f939.m25437();
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
