package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class mc implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private java.util.List<java.lang.Integer> Camera2StreamConfigurationMap;
    private double getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private util.h.xy.bb.me getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private java.lang.String getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25321(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 113) + (i | 113);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            this.getInputFormats = str;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 121) % 128;
        } else {
            this.getInputFormats = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25314(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 27) << 1) - (i ^ 27);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputMinFrameDuration = str;
        } else {
            this.getOutputMinFrameDuration = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25315(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 61) << 1) - (i ^ 61);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputStallDurationlomOqCM = str;
        } else {
            this.getOutputStallDurationlomOqCM = str;
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25320(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 97) + (i | 97);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputFormats = str;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i3 = ~identityHashCode;
            int i4 = (i3 ^ 1607096065) | (i3 & 1607096065);
            int i5 = ~((i4 ^ (-546479201)) | (i4 & (-546479201)));
            int i6 = ~(((-8524801) ^ identityHashCode) | (identityHashCode & (-8524801)));
            int i7 = -(-(((i5 ^ i6) | (i5 & i6)) * (-302)));
            int i8 = ~(((-546479201) ^ identityHashCode) | (identityHashCode & (-546479201)));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i9 = ~identityHashCode2;
            int i10 = -(-(((~((i9 ^ (-1188118481)) | (i9 & (-1188118481)))) | 1140860544) * (-245)));
            int i11 = (i10 ^ (-1525345992)) + ((i10 & (-1525345992)) << 1);
            int i12 = (~((identityHashCode2 ^ (-1188118481)) | (identityHashCode2 & (-1188118481)))) * (-245);
            int i13 = ~(identityHashCode2 | (-1188118481));
            if ((((((i7 | (-337321297)) << 1) - (i7 ^ (-337321297))) - (~((~((identityHashCode ^ (-537954401)) | (identityHashCode & (-537954401)))) * (-604)))) - 1) + (((1598571265 ^ i8) | (i8 & 1598571265)) * 302) <= (((i11 ^ i12) + ((i12 & i11) << 1)) - (~(-(-(((200776050 ^ i13) | (i13 & 200776050)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))))) - 1) {
                throw null;
            }
            return;
        }
        this.getOutputFormats = str;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25323(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 109) << 1) - (i ^ 109);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            this.getOutputStallDuration = str;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 119) % 128;
        } else {
            this.getOutputStallDuration = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25317(java.util.List<java.lang.Integer> list) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 7) + (i | 7)) % 128;
        this.Camera2StreamConfigurationMap = list;
        int i2 = (i ^ 43) + ((i & 43) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25318(double d) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 27) + (i | 27)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = d;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 13) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m25313(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 27) << 1) - (i ^ 27);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputSizeshNQ4ISI = str;
        } else {
            this.getOutputSizeshNQ4ISI = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m25324(java.lang.String str) {
        int i = (getHighSpeedVideoFpsRanges + 71) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        this.getOutputSizes = str;
        int i2 = i + 73;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m25312(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 73;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoSizes = str;
        } else {
            this.getHighSpeedVideoSizes = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25319(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt cardArt) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i + 93) % 128;
        this.getInputSizeshNQ4ISI = cardArt;
        getHighSpeedVideoFpsRanges = (i + 97) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25316(java.lang.String str, java.lang.String str2) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 41) + ((i & 41) << 1)) % 128;
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new util.h.xy.bb.me();
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (((i2 | 59) << 1) - (i2 ^ 59)) % 128;
        }
        this.getHighSpeedVideoSizesFor.m25331(str);
        this.getHighSpeedVideoSizesFor.m25330(str2);
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (i3 ^ 125) + ((i3 & 125) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.lang.String getProductId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f699);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputFormats;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i | 121) << 1) - (i ^ 121)) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.lang.String getProductName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f740);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputMinFrameDuration;
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 121) + ((i & 121) << 1)) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.lang.String getShortDesc1() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f720);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputStallDurationlomOqCM;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 83) << 1) - (i ^ 83);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.lang.String getShortDesc2() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f741);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputFormats;
        int i = getHighSpeedVideoFpsRanges + 23;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.lang.String getLongDesc() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f687);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputStallDuration;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.util.List<java.lang.Integer> getTopupAmounts() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f719);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.List<java.lang.Integer> list = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
        return list;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final double getRefundableDeposit() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f748);
        util.h.xy.am.ma.m25027(str, sb.toString());
        double d = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 45) + ((i & 45) << 1)) % 128;
        return d;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.lang.String m25322() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f747);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputSizeshNQ4ISI;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 3) << 1) - (i ^ 3);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.lang.String getCsWebsiteUrl() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f806);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputSizes;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final java.lang.String getCsPhoneNumber() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f778);
        util.h.xy.am.ma.m25027(str, sb.toString());
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getCardArt() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f776);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt cardArt = this.getInputSizeshNQ4ISI;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 5) + (i | 5);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return cardArt;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ValidityPeriod getValidityPeriod() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f790);
        sb.append(util.h.xy.al.ra.f813);
        util.h.xy.am.ma.m25027(str, sb.toString());
        return this.getHighSpeedVideoSizesFor;
    }
}
