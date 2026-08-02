package com.payair.hce;

/* loaded from: classes4.dex */
public class setAccessibilityPaneTitle implements com.payair.hce.checkUriPermission, java.io.Serializable {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int RecordsJson = 1;
    private byte[] AlternateContactlessPaymentDataJson;
    private int DigitizedCardProfile;
    private java.lang.String[] SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.createPackageContext getAid;
    private com.payair.hce.enforceCallingUriPermission getProfileVersion;
    private int valueOf;
    private byte[] values;
    private byte[] writeReplace;

    public setAccessibilityPaneTitle(com.payair.hce.checkUriPermission checkuripermission) {
        this.DigitizedCardProfile = checkuripermission.getCvmResetTimeout();
        this.valueOf = checkuripermission.getDualTapResetTimeout();
        byte[] applicationLifeCycleData = checkuripermission.getApplicationLifeCycleData();
        if (applicationLifeCycleData != null) {
            this.values = applicationLifeCycleData;
        }
        this.writeReplace = checkuripermission.getCardLayoutDescription();
        this.AlternateContactlessPaymentDataJson = checkuripermission.getSecurityWord();
        this.SdkCoreAlternateContactlessPaymentDataImpl = checkuripermission.getCardholderValidators();
        this.getAid = new com.payair.hce.setImportantForContentCapture(checkuripermission.getMchipCvmIssuerOptions());
        this.getProfileVersion = new com.payair.hce.setOnReceiveContentListener(checkuripermission.getMagstripeCvmIssuerOptions());
    }

    @Override // com.payair.hce.checkUriPermission
    public int getCvmResetTimeout() {
        int i = RecordsJson;
        int i2 = i + 47;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.DigitizedCardProfile;
        int i4 = (i ^ 82) + ((i & 82) << 1);
        int i5 = (~i4) + (i4 << 1);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    @Override // com.payair.hce.checkUriPermission
    public int getDualTapResetTimeout() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 27;
        int i3 = ((((i ^ 27) | i2) << 1) - ((i | 27) & (~i2))) % 128;
        RecordsJson = i3;
        int i4 = this.valueOf;
        int i5 = i3 + 13;
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    @Override // com.payair.hce.checkUriPermission
    public byte[] getApplicationLifeCycleData() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return this.values;
        }
        throw null;
    }

    @Override // com.payair.hce.checkUriPermission
    public byte[] getCardLayoutDescription() {
        int i = IccPrivateKeyCrtComponentsJson;
        RecordsJson = ((i ^ 7) + ((i & 7) << 1)) % 128;
        byte[] bArr = this.writeReplace;
        RecordsJson = (((i & 84) + (i | 84)) - 1) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkUriPermission
    public byte[] getSecurityWord() {
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int i = RecordsJson;
        IccPrivateKeyCrtComponentsJson = (((i & 78) + (i | 78)) - 1) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkUriPermission
    public java.lang.String[] getCardholderValidators() {
        int i = RecordsJson;
        int i2 = (i ^ 15) + ((i & 15) << 1);
        int i3 = i2 % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String[] strArr = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i4 = i3 & 99;
        int i5 = i3 | 99;
        RecordsJson = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        return strArr;
    }

    @Override // com.payair.hce.checkUriPermission
    public com.payair.hce.createPackageContext getMchipCvmIssuerOptions() {
        int i = RecordsJson;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        com.payair.hce.createPackageContext createpackagecontext = this.getAid;
        if (i2 % 2 == 0) {
            return createpackagecontext;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkUriPermission
    public com.payair.hce.enforceCallingUriPermission getMagstripeCvmIssuerOptions() {
        int i = IccPrivateKeyCrtComponentsJson + 9;
        RecordsJson = i % 128;
        com.payair.hce.enforceCallingUriPermission enforcecallinguripermission = this.getProfileVersion;
        if (i % 2 != 0) {
            return enforcecallinguripermission;
        }
        throw new java.lang.ArithmeticException();
    }
}
