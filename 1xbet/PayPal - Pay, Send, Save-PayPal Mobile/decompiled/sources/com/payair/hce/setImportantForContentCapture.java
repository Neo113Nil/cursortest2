package com.payair.hce;

/* loaded from: classes4.dex */
public class setImportantForContentCapture implements com.payair.hce.createPackageContext, java.io.Serializable {
    private static int getAid = 1;
    private static int getProfileVersion;
    private boolean AlternateContactlessPaymentDataJson;
    private boolean DigitizedCardProfile;
    private boolean IccPrivateKeyCrtComponentsJson;
    private boolean RecordsJson;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private boolean valueOf;
    private boolean values;
    private boolean writeReplace;

    public setImportantForContentCapture(com.payair.hce.createPackageContext createpackagecontext) {
        this.valueOf = createpackagecontext.getAckAlwaysRequiredIfCurrencyNotProvided();
        this.AlternateContactlessPaymentDataJson = createpackagecontext.getAckAlwaysRequiredIfCurrencyProvided();
        this.writeReplace = createpackagecontext.getAckAutomaticallyResetByApplication();
        this.DigitizedCardProfile = createpackagecontext.getAckPreEntryAllowed();
        this.values = createpackagecontext.getPinAlwaysRequiredIfCurrencyNotProvided();
        this.SdkCoreAlternateContactlessPaymentDataImpl = createpackagecontext.getPinAlwaysRequiredIfCurrencyProvided();
        this.RecordsJson = createpackagecontext.getPinAutomaticallyResetByApplication();
        this.IccPrivateKeyCrtComponentsJson = createpackagecontext.getPinPreEntryAllowed();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckAlwaysRequiredIfCurrencyProvided() {
        int i = getAid;
        int i2 = (i & 97) + (i | 97);
        getProfileVersion = i2 % 128;
        boolean z = this.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinPreEntryAllowed() {
        int i = getProfileVersion;
        int i2 = (((i & (-62)) | ((~i) & 61)) - (~((i & 61) << 1))) - 1;
        getAid = i2 % 128;
        boolean z = this.IccPrivateKeyCrtComponentsJson;
        if (i2 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
        int i = getAid;
        int i2 = i & 115;
        int i3 = -(-((i ^ 115) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            return this.values;
        }
        throw null;
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
        int i = getProfileVersion;
        getAid = ((-2) - (~(i + 10))) % 128;
        boolean z = this.valueOf;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getAid = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckPreEntryAllowed() {
        int i = getProfileVersion;
        int i2 = i & 83;
        int i3 = i | 83;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getAid = i4;
        boolean z = this.DigitizedCardProfile;
        int i5 = i4 ^ 25;
        int i6 = ((i4 & 25) | i5) << 1;
        int i7 = -i5;
        getProfileVersion = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        return z;
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getAckAutomaticallyResetByApplication() {
        int i = getAid;
        int i2 = (i & (-18)) | ((~i) & 17);
        int i3 = (i & 17) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getProfileVersion = i4 % 128;
        boolean z = this.writeReplace;
        if (i4 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinAutomaticallyResetByApplication() {
        int i = getAid;
        int i2 = i & 109;
        int i3 = (i ^ 109) | i2;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        getProfileVersion = i4;
        boolean z = this.RecordsJson;
        int i5 = i4 + 7;
        getAid = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createPackageContext
    public boolean getPinAlwaysRequiredIfCurrencyProvided() {
        int i = ((-2) - (~(getProfileVersion + 14))) % 128;
        getAid = i;
        boolean z = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i + 106;
        getProfileVersion = ((~i2) + (i2 << 1)) % 128;
        return z;
    }
}
