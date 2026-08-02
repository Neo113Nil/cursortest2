package com.payair.hce;

/* loaded from: classes4.dex */
public class setOnHoverListener implements com.payair.hce.enforceCallingOrSelfUriPermission, java.io.Serializable {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static int getProfileVersion = 1;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private byte[] valueOf;
    private byte[] values;
    private byte[] writeReplace;

    public setOnHoverListener(com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission) {
        this.DigitizedCardProfile = enforcecallingorselfuripermission.getAid();
        this.values = enforcecallingorselfuripermission.getPaymentFci();
        this.valueOf = enforcecallingorselfuripermission.getGpoResponse();
        this.AlternateContactlessPaymentDataJson = enforcecallingorselfuripermission.getCiacDecline();
        this.writeReplace = enforcecallingorselfuripermission.getCvrMaskAnd();
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getAid() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (((i ^ 28) + ((i & 28) << 1)) - 1) % 128;
        getProfileVersion = i2;
        byte[] bArr = this.DigitizedCardProfile;
        int i3 = i2 & 13;
        int i4 = ((i2 ^ 13) | i3) << 1;
        int i5 = -((i2 | 13) & (~i3));
        SdkCoreAlternateContactlessPaymentDataImpl = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getPaymentFci() {
        int i = getProfileVersion;
        int i2 = i ^ 25;
        int i3 = ((i & 25) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 & i4) + (i3 | i4)) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i5;
        byte[] bArr = this.values;
        int i6 = i5 & 83;
        getProfileVersion = ((((i5 | 83) & (~i6)) - (~(-(-(i6 << 1))))) - 1) % 128;
        return bArr;
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getGpoResponse() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i ^ 89) | (i & 89)) << 1;
        int i3 = -((i & (-90)) | ((~i) & 89));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getProfileVersion = i4 % 128;
        byte[] bArr = this.valueOf;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getCiacDecline() {
        int i = getProfileVersion;
        SdkCoreAlternateContactlessPaymentDataImpl = ((i & 87) + (i | 87)) % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int i2 = (i & (-48)) | ((~i) & 47);
        int i3 = -(-((i & 47) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getCvrMaskAnd() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i ^ 50) + ((i & 50) << 1)) - 1;
        int i3 = i2 % 128;
        getProfileVersion = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.writeReplace;
        int i4 = i3 & 121;
        int i5 = ((i3 ^ 121) | i4) << 1;
        int i6 = -((i3 | 121) & (~i4));
        SdkCoreAlternateContactlessPaymentDataImpl = ((i5 & i6) + (i6 | i5)) % 128;
        return bArr;
    }
}
