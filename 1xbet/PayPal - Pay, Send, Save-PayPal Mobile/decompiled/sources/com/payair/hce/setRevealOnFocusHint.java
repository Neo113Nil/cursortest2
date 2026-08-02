package com.payair.hce;

/* loaded from: classes4.dex */
public class setRevealOnFocusHint implements com.payair.hce.revokeSelfPermissionOnKill, java.io.Serializable {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static int getProfileVersion = 1;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private byte[] IccPrivateKeyCrtComponentsJson;
    private byte[] RecordsJson;
    private byte[] getAid;
    private byte[] valueOf;
    private byte[] values;
    private byte[] writeReplace;

    public setRevealOnFocusHint(com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill) {
        this.writeReplace = revokeselfpermissiononkill.getTrack2Equivalent();
        this.AlternateContactlessPaymentDataJson = revokeselfpermissiononkill.getPan();
        this.values = revokeselfpermissiononkill.getPanSequenceNumber();
        this.valueOf = revokeselfpermissiononkill.getApplicationExpiryDate();
        this.DigitizedCardProfile = revokeselfpermissiononkill.getAip();
        this.RecordsJson = revokeselfpermissiononkill.getCiacDecline();
        this.IccPrivateKeyCrtComponentsJson = revokeselfpermissiononkill.getCvrMaskAnd();
        this.getAid = revokeselfpermissiononkill.getIssuerApplicationData();
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getPan() {
        int i = getProfileVersion + 125;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return this.AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getPanSequenceNumber() {
        int i = getProfileVersion;
        int i2 = ~i;
        int i3 = ((((i ^ 103) | (i & 103)) << 1) - (~(-((i & (-104)) | (i2 & 103))))) - 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.values;
        int i4 = (((i | 65) << 1) - (~(-((i & (-66)) | (i2 & 65))))) - 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getApplicationExpiryDate() {
        int i = getProfileVersion;
        int i2 = i & 27;
        int i3 = i2 + ((i ^ 27) | i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.valueOf;
        SdkCoreAlternateContactlessPaymentDataImpl = ((-2) - (~(i + 110))) % 128;
        return bArr;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getAip() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        getProfileVersion = ((((i & (-122)) | ((~i) & 121)) - (~(-(-((i & 121) << 1))))) - 1) % 128;
        byte[] bArr = this.DigitizedCardProfile;
        int i2 = i + 49;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getCiacDecline() {
        int i = getProfileVersion;
        int i2 = i & 93;
        int i3 = -(-((i ^ 93) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 == 0) {
            return this.RecordsJson;
        }
        throw null;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getCvrMaskAnd() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.IccPrivateKeyCrtComponentsJson;
        int i3 = i & 25;
        int i4 = -(-((i ^ 25) | i3));
        getProfileVersion = ((i3 & i4) + (i4 | i3)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getIssuerApplicationData() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i & (-76)) | ((~i) & 75);
        int i3 = -(-((i & 75) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getProfileVersion = i4 % 128;
        byte[] bArr = this.getAid;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getTrack2Equivalent() {
        int i = getProfileVersion;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i & 47) - (~(i | 47))) - 1) % 128;
        byte[] bArr = this.writeReplace;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i | 121) << 1) - (i ^ 121)) % 128;
        return bArr;
    }
}
