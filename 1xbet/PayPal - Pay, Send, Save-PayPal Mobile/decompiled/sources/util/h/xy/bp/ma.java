package util.h.xy.bp;

/* loaded from: classes18.dex */
public final class ma implements com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private java.lang.String getInputSizeshNQ4ISI = "";
    private int getHighSpeedVideoSizes = 0;
    private java.lang.String getOutputFormats = null;
    private java.util.Date getHighSpeedVideoSizesFor = null;
    private java.lang.String Camera2StreamConfigurationMap = null;
    private com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType getHighSpeedVideoFpsRangesFor = null;
    private byte[] getInputFormats = null;

    @util.h.xy.a.a
    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 89) << 1) - (i ^ 89)) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData m25535 = m25535();
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i2 & 121) + (i2 | 121)) % 128;
        return m25535;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData m25535() {
        util.h.xy.bp.ma maVar = new util.h.xy.bp.ma();
        maVar.m25536(this.getInputSizeshNQ4ISI);
        maVar.m25537(this.getHighSpeedVideoSizes);
        maVar.m25541(this.getOutputFormats);
        maVar.m25542(this.getHighSpeedVideoSizesFor);
        maVar.m25538(this.Camera2StreamConfigurationMap);
        maVar.m25540(this.getHighSpeedVideoFpsRangesFor);
        maVar.m25539(util.h.xy.ar.b.m25103(this.getInputFormats));
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
        return maVar;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25536(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 59) % 128;
        this.getInputSizeshNQ4ISI = str;
        getHighResolutionOutputSizeshNQ4ISI = (i + 77) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25537(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (((i2 | 97) << 1) - (i2 ^ 97)) % 128;
        getHighSpeedVideoFpsRanges = i3;
        this.getHighSpeedVideoSizes = i;
        getHighResolutionOutputSizeshNQ4ISI = (((i3 | 89) << 1) - (i3 ^ 89)) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25541(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 51) + (i | 51);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputFormats = str;
        } else {
            this.getOutputFormats = str;
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25542(java.util.Date date) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 117) + ((i & 117) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizesFor = date;
        int i3 = i2 + 109;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25538(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 93) + (i | 93)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = str;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 103) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25540(com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 57) + ((i & 57) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRangesFor = cryptogramDataType;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 117) % 128;
        } else {
            this.getHighSpeedVideoFpsRangesFor = cryptogramDataType;
            throw null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25539(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 107) + ((i & 107) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInputFormats = bArr;
            int i3 = i + 57;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getInputFormats = bArr;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final java.lang.String getDpan() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 13) % 128;
        java.lang.String str = this.getInputSizeshNQ4ISI;
        int i2 = (i & 121) + (i | 121);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final int getDpanSequenceNumber() {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final java.lang.String getPAR() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 125) << 1) - (i ^ 125);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getOutputFormats;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final java.util.Date getDpanExpirationDate() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 105) + (i | 105);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHighSpeedVideoSizesFor;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final java.lang.String getTrack2EquvalentData() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 115;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 107) << 1) - (i ^ 107)) % 128;
        return str;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType getCryptogramDataType() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 113;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType = this.getHighSpeedVideoFpsRangesFor;
        int i3 = ((i | 99) << 1) - (i ^ 99);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return cryptogramDataType;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final byte[] getCryptogramData() {
        int i = (getHighSpeedVideoFpsRanges + 111) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        byte[] bArr = this.getInputFormats;
        getHighSpeedVideoFpsRanges = ((i & 61) + (i | 61)) % 128;
        return bArr;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData
    @util.h.xy.a.a
    public final void wipe() {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 49) + (i2 | 49);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            util.h.xy.ar.b.m25095(getCryptogramData());
            this.getInputSizeshNQ4ISI = "";
            i = 1;
        } else {
            util.h.xy.ar.b.m25095(getCryptogramData());
            this.getInputSizeshNQ4ISI = "";
            i = 0;
        }
        this.getHighSpeedVideoSizes = i;
        this.getOutputFormats = "";
        this.getHighSpeedVideoSizesFor = null;
        this.Camera2StreamConfigurationMap = "";
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputFormats = null;
    }
}
