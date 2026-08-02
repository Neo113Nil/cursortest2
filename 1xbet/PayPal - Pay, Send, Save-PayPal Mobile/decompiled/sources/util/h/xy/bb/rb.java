package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class rb implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    private java.lang.String ArtificialStackFrames;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String CoroutineDebuggingKt;
    private java.util.HashMap<java.lang.String, java.lang.String> accessartificialFrame = new java.util.HashMap<>();
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private java.lang.String isOutputSupportedFor;
    private java.lang.String isOutputSupportedForhNQ4ISI;
    private java.lang.String toString;
    private java.lang.String unwrapAs;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getProductId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f699);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputStallDuration;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        return str2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25349(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 5) + (i | 5)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getOutputStallDuration = str;
        getHighSpeedVideoSizes = (((i2 | 121) << 1) - (i2 ^ 121)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getProductName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f740);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.toString;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i | 1) << 1) - (i ^ 1)) % 128;
        return str2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25350(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 33) + (i | 33)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.toString = str;
        int i3 = i2 + 51;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getPanLastDigits() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f834);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputFormats;
        int i = getHighSpeedVideoFpsRanges + 81;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25345(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 73;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputFormats = str;
            int i3 = i + 67;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getOutputFormats = str;
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getPanExpiryDate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f686);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputSizes;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i | 77) << 1) - (i ^ 77)) % 128;
        return str2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25354(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 115;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            this.getOutputSizes = str;
        } else {
            this.getOutputSizes = str;
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getTokenLastDigits() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f275);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputMinFrameDurationlomOqCM;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 39) + (i | 39);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25346(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 125) + (i | 125);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM = str;
        } else {
            this.getOutputMinFrameDurationlomOqCM = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getTokenExpiryDate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f294);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.CoroutineDebuggingKt;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 55) % 128;
        return str2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m25340(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i + 27) % 128;
        this.CoroutineDebuggingKt = str;
        int i2 = i + 69;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getShortDescription() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f677);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = getHighSpeedVideoFpsRanges + 83;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m25357(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 37) + ((i & 37) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        getHighSpeedVideoSizes = ((i2 & 59) + (i2 | 59)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getLongDescription() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f687);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 85) % 128;
        return str2;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m25338(java.lang.String str) {
        int i = (getHighSpeedVideoFpsRanges + 91) % 128;
        getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = str;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getIssuerName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f695);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.unwrapAs;
        int i = getHighSpeedVideoSizes + 17;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m25339(java.lang.String str) {
        int i = (getHighSpeedVideoSizes + 113) % 128;
        getHighSpeedVideoFpsRanges = i;
        this.unwrapAs = str;
        int i2 = i + 13;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getIssuerPhoneNumber() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f698);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m25352(java.lang.String str) {
        int i = (getHighSpeedVideoSizes + 69) % 128;
        getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = str;
        getHighSpeedVideoSizes = (((i | 15) << 1) - (i ^ 15)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getIssuerEmail() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f710);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 37) % 128;
        return str2;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final void m25342(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i | 43) << 1) - (i ^ 43)) % 128;
        this.getInputSizeshNQ4ISI = str;
        getHighSpeedVideoSizes = (i + 39) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getIssuerWebsite() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f706);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputFormats;
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final void m25343(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 107) + (i | 107);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInputFormats = str;
        } else {
            this.getInputFormats = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getTermsAndConditionsUrl() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f709);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return str2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m25341(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            this.getOutputSizeshNQ4ISI = str;
            getHighSpeedVideoFpsRanges = (((i3 | 87) << 1) - (i3 ^ 87)) % 128;
        } else {
            this.getOutputSizeshNQ4ISI = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getPrivacyPolicyUrl() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f707);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputMinFrameDuration;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m25347(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 97) + (i | 97);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputMinFrameDuration = str;
        } else {
            this.getOutputMinFrameDuration = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getTokenID() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f329);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoSizesFor;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i | 89) << 1) - (i ^ 89)) % 128;
        return str2;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m25344(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 47) + ((i & 47) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizesFor = str;
        getHighSpeedVideoSizes = (i2 + 39) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.util.HashMap<java.lang.String, java.lang.String> getKeyValues() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f718);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.accessartificialFrame;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i & 89) + (i | 89)) % 128;
        return hashMap;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getCardReferenceId() {
        int i = (getHighSpeedVideoSizes + 35) % 128;
        getHighSpeedVideoFpsRanges = i;
        java.lang.String str = this.isOutputSupportedFor;
        int i2 = ((i | 81) << 1) - (i ^ 81);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public final void m25351(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 27) + ((i & 27) << 1)) % 128;
        this.isOutputSupportedFor = str;
        int i2 = i + 29;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getTspId() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 107) + ((i & 107) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        java.lang.String str = this.ArtificialStackFrames;
        int i3 = i2 + 31;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public final void m25353(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 73) + (i | 73);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.ArtificialStackFrames = str;
        } else {
            this.ArtificialStackFrames = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getPaymentAccountReference() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 5) + (i | 5);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getAuxiliaryTokenLastDigits() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f291);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.isOutputSupportedForhNQ4ISI;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 73) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData
    public final java.lang.String getAuxiliaryTokenExpiryDate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f742);
        sb.append(util.h.xy.al.ra.f297);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputStallDurationlomOqCM;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i & 115) + (i | 115)) % 128;
        return str2;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public final void m25355(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i + 107) % 128;
        this.isOutputSupportedForhNQ4ISI = str;
        int i2 = ((i | 71) << 1) - (i ^ 71);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˍ, reason: contains not printable characters */
    public final void m25348(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputStallDurationlomOqCM = str;
            getHighSpeedVideoSizes = (i + 59) % 128;
        } else {
            this.getOutputStallDurationlomOqCM = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐨ, reason: contains not printable characters */
    public final void m25356(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 43;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 == 0) {
            this.getValidOutputFormatsForInputhNQ4ISI = str;
            getHighSpeedVideoSizes = ((i2 ^ 11) + ((i2 & 11) << 1)) % 128;
        } else {
            this.getValidOutputFormatsForInputhNQ4ISI = str;
            throw null;
        }
    }
}
