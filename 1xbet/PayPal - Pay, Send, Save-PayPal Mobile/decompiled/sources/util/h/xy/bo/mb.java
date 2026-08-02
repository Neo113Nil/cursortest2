package util.h.xy.bo;

/* loaded from: classes18.dex */
public final class mb implements com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private byte[] getInputSizeshNQ4ISI = null;
    private byte[] getInputFormats = null;
    private byte[] getHighSpeedVideoSizesFor = null;
    private byte[] getOutputFormats = null;
    private byte[] getOutputMinFrameDurationlomOqCM = null;
    private byte[] getHighSpeedVideoSizes = null;
    private byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    private byte[] getOutputSizes = null;
    private byte[] getHighSpeedVideoFpsRangesFor = null;
    private byte[] getOutputStallDurationlomOqCM = null;
    private byte[] getOutputMinFrameDuration = null;

    @util.h.xy.a.a
    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData m25530 = m25530();
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i ^ 35) + ((i & 35) << 1)) % 128;
        return m25530;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData m25530() {
        util.h.xy.bo.mb mbVar = new util.h.xy.bo.mb();
        mbVar.m25529(util.h.xy.ar.b.m25103(this.getOutputFormats));
        mbVar.m25525(util.h.xy.ar.b.m25103(this.getHighSpeedVideoFpsRangesFor));
        mbVar.m25532(util.h.xy.ar.b.m25103(this.getHighSpeedVideoSizes));
        mbVar.m25533(util.h.xy.ar.b.m25103(this.getOutputMinFrameDurationlomOqCM));
        mbVar.m25527(util.h.xy.ar.b.m25103(this.getInputSizeshNQ4ISI));
        mbVar.m25531(util.h.xy.ar.b.m25103(this.getHighSpeedVideoSizesFor));
        mbVar.m25528(util.h.xy.ar.b.m25103(this.getInputFormats));
        mbVar.m25524(util.h.xy.ar.b.m25103(this.getHighResolutionOutputSizeshNQ4ISI));
        mbVar.m25534(util.h.xy.ar.b.m25103(this.getOutputSizes));
        mbVar.m25523(util.h.xy.ar.b.m25103(this.getOutputStallDurationlomOqCM));
        mbVar.m25526(util.h.xy.ar.b.m25103(this.getOutputMinFrameDuration));
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 61) + ((i & 61) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return mbVar;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final void wipe() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 113) % 128;
        util.h.xy.ar.b.m25100(getStatusWord(), getChipDataField(), getCondensedPaymentData(), getCardMainAid(), getCardMainAppTemplate(), getCardAliasAid(), getCardAliasAppTemplate(), getCommonDataTemplate(), getCID(), getQrcBuffer(), getTransactionId());
        this.getInputSizeshNQ4ISI = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputFormats = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDuration = null;
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 95) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getStatusWord() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f497);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getInputSizeshNQ4ISI;
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i ^ 15) + ((i & 15) << 1)) % 128;
        return bArr;
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25527(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 67) % 128;
        this.getInputSizeshNQ4ISI = bArr;
        int i2 = i + 63;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getCID() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f340);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getInputFormats;
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 121) + (i | 121);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25528(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInputFormats = bArr;
            int i3 = i + 125;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getInputFormats = bArr;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getChipDataField() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f464);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 93) % 128;
        return bArr;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25531(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 3;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            this.getHighSpeedVideoSizesFor = bArr;
        } else {
            this.getHighSpeedVideoSizesFor = bArr;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getCondensedPaymentData() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f520);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getOutputFormats;
        int i = getHighSpeedVideoFpsRanges + 75;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25529(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 117;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputFormats = bArr;
            int i3 = (i & 7) + (i | 7);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getOutputFormats = bArr;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getCardMainAid() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f564);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 115) % 128;
        return bArr;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25533(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 9;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM = bArr;
        } else {
            this.getOutputMinFrameDurationlomOqCM = bArr;
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getCardMainAppTemplate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f566);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighSpeedVideoSizes;
        int i = Camera2StreamConfigurationMap + 79;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m25532(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 113;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoSizes = bArr;
        } else {
            this.getHighSpeedVideoSizes = bArr;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getCardAliasAid() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f563);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = getHighSpeedVideoFpsRanges + 35;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m25524(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i | 51) << 1) - (i ^ 51)) % 128;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        getHighSpeedVideoFpsRanges = (((i | 121) << 1) - (i ^ 121)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getCardAliasAppTemplate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f558);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getOutputSizes;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 45) % 128;
        return bArr;
    }

    @util.h.xy.a.a
    /* renamed from: ι, reason: contains not printable characters */
    public final void m25534(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 111) % 128;
        this.getOutputSizes = bArr;
        getHighSpeedVideoFpsRanges = (((i | 23) << 1) - (i ^ 23)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getCommonDataTemplate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f587);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighSpeedVideoFpsRanges + 75;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m25525(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 93;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoFpsRangesFor = bArr;
        } else {
            this.getHighSpeedVideoFpsRangesFor = bArr;
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getQrcBuffer() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f616);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getOutputStallDurationlomOqCM;
        int i = Camera2StreamConfigurationMap + 1;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m25523(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i ^ 47;
        Camera2StreamConfigurationMap = (((i | 47) << 1) - i2) % 128;
        this.getOutputStallDurationlomOqCM = bArr;
        int i3 = i2 + ((i & 47) << 1);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData
    @util.h.xy.a.a
    public final byte[] getTransactionId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f596);
        sb.append(util.h.xy.al.ra.f329);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getOutputMinFrameDuration;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 105) + (i | 105);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ʿ, reason: contains not printable characters */
    public final void m25526(byte[] bArr) {
        int i = (getHighSpeedVideoFpsRanges + 125) % 128;
        Camera2StreamConfigurationMap = i;
        this.getOutputMinFrameDuration = bArr;
        getHighSpeedVideoFpsRanges = (((i | 117) << 1) - (i ^ 117)) % 128;
    }
}
