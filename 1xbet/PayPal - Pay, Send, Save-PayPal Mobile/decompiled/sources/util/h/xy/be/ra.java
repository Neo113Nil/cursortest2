package util.h.xy.be;

/* loaded from: classes5.dex */
public final class ra implements com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    private double getValidOutputFormatsForInputhNQ4ISI;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getDigitalCardId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f305);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 91) % 128;
        return str2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25388(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        this.getInputSizeshNQ4ISI = str;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getTransactionDate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f309);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputStallDurationlomOqCM;
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25380(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 99) + ((i & 99) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputStallDurationlomOqCM = str;
        } else {
            this.getOutputStallDurationlomOqCM = str;
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType getTransactionType() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f299);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType m25467 = util.h.xy.bh.b.m25467(this.getOutputSizes);
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 49) + (i | 49)) % 128;
        return m25467;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25386(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 55;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            this.getOutputSizes = str;
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 125) % 128;
        } else {
            this.getOutputSizes = str;
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus getTransactionStatus() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f304);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus m25465 = util.h.xy.bh.b.m25465(this.getOutputMinFrameDuration);
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
        return m25465;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25385(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 91) + (i | 91)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getOutputMinFrameDuration = str;
        getHighSpeedVideoSizes = (((i2 | 107) << 1) - (i2 ^ 107)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getTransactionId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f329);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputMinFrameDurationlomOqCM;
        int i = getHighSpeedVideoSizes + 41;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25383(java.lang.String str) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
        getHighSpeedVideoSizes = i;
        this.getOutputMinFrameDurationlomOqCM = str;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 39) + ((i & 39) << 1)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getCurrencyCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f300);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int i = getHighResolutionOutputSizeshNQ4ISI + 15;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m25376(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 87;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = str;
        } else {
            this.getHighSpeedVideoFpsRanges = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final double getAmount() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f539);
        util.h.xy.am.ma.m25027(str, sb.toString());
        double d = this.getValidOutputFormatsForInputhNQ4ISI;
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 65) + ((i & 65) << 1)) % 128;
        return d;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25382(double d) {
        int i = (getHighSpeedVideoSizes + 53) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        this.getValidOutputFormatsForInputhNQ4ISI = d;
        getHighSpeedVideoSizes = (((i | 107) << 1) - (i ^ 107)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getDisplayAmount() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f331);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 95) + (i | 95);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m25377(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 75;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRangesFor = str;
            int i3 = ((i | 119) << 1) - (i ^ 119);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getMerchantName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f463);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputSizeshNQ4ISI;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 79) + ((i & 79) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m25387(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 67) << 1) - (i ^ 67);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputSizeshNQ4ISI = str;
        } else {
            this.getOutputSizeshNQ4ISI = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getMerchantType() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f623);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 71) + (i | 71);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m25389(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 109) + (i | 109);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = str;
            int i3 = (i ^ 21) + ((i & 21) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.Camera2StreamConfigurationMap = str;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getMerchantPostalCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f430);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoSizesFor;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 101) % 128;
        return str2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m25378(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (((i | 91) << 1) - (i ^ 91)) % 128;
        this.getHighSpeedVideoSizesFor = str;
        getHighSpeedVideoSizes = (i + 59) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getTerminalId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f385);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputFormats;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i ^ 65) + ((i & 65) << 1)) % 128;
        return str2;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final void m25379(java.lang.String str) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
        getHighSpeedVideoSizes = i;
        this.getOutputFormats = str;
        int i2 = i + 113;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final java.lang.String getMerchantId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f489);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputStallDuration;
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 45) + ((i & 45) << 1)) % 128;
        return str2;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m25384(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 115) % 128;
        this.getOutputStallDuration = str;
        int i2 = (i ^ 25) + ((i & 25) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25381(boolean z) {
        int i = (getHighSpeedVideoSizes + 53) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        this.getInputFormats = z;
        getHighSpeedVideoSizes = (i + 117) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord
    public final boolean isAuxiliaryTransaction() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f594);
        sb.append(util.h.xy.al.ra.f444);
        util.h.xy.am.ma.m25027(str, sb.toString());
        if (!this.getInputFormats) {
            return false;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i ^ 53) + ((i & 53) << 1)) % 128;
        getHighSpeedVideoSizes = (((i | 15) << 1) - (i ^ 15)) % 128;
        return true;
    }
}
