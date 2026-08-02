package com.payair.hce;

/* loaded from: classes4.dex */
public class setOnReceiveContentListener implements com.payair.hce.enforceCallingUriPermission, java.io.Serializable {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int getProfileVersion = 1;
    private boolean AlternateContactlessPaymentDataJson;
    private boolean DigitizedCardProfile;
    private boolean RecordsJson;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private boolean getAid;
    private boolean valueOf;
    private boolean values;
    private boolean writeReplace;

    public setOnReceiveContentListener(com.payair.hce.enforceCallingUriPermission enforcecallinguripermission) {
        this.AlternateContactlessPaymentDataJson = enforcecallinguripermission.getAckAlwaysRequiredIfCurrencyNotProvided();
        this.values = enforcecallinguripermission.getAckAlwaysRequiredIfCurrencyProvided();
        this.writeReplace = enforcecallinguripermission.getAckAutomaticallyResetByApplication();
        this.DigitizedCardProfile = enforcecallinguripermission.getAckPreEntryAllowed();
        this.valueOf = enforcecallinguripermission.getPinAlwaysRequiredIfCurrencyNotProvided();
        this.getAid = enforcecallinguripermission.getPinAlwaysRequiredIfCurrencyProvided();
        this.RecordsJson = enforcecallinguripermission.getPinAutomaticallyResetByApplication();
        this.SdkCoreAlternateContactlessPaymentDataImpl = enforcecallinguripermission.getPinPreEntryAllowed();
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckAlwaysRequiredIfCurrencyProvided() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 59;
        int i3 = (i ^ 59) | i2;
        getProfileVersion = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        boolean z = this.values;
        int i4 = i & 15;
        int i5 = (i ^ 15) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        getProfileVersion = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
        int i = getProfileVersion;
        int i2 = i & 69;
        int i3 = (i | 69) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        IccPrivateKeyCrtComponentsJson = i5;
        boolean z = this.AlternateContactlessPaymentDataJson;
        int i6 = i5 + 65;
        getProfileVersion = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckAutomaticallyResetByApplication() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 59;
        int i3 = i | 59;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        getProfileVersion = i4;
        boolean z = this.writeReplace;
        int i5 = (-2) - (~((i4 & 106) + (i4 | 106)));
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckPreEntryAllowed() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i ^ 93;
        int i3 = -(-((i & 93) << 1));
        getProfileVersion = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        boolean z = this.DigitizedCardProfile;
        int i4 = (i & (-16)) | ((~i) & 15);
        int i5 = (i & 15) << 1;
        getProfileVersion = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return z;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
        int i = getProfileVersion;
        int i2 = i & 49;
        int i3 = i | 49;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        IccPrivateKeyCrtComponentsJson = i5;
        boolean z = this.valueOf;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i6 = i5 & 11;
        getProfileVersion = (i6 + ((i5 ^ 11) | i6)) % 128;
        return z;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinAlwaysRequiredIfCurrencyProvided() {
        int i = getProfileVersion;
        int i2 = i ^ 117;
        int i3 = ((i & 117) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return this.getAid;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinAutomaticallyResetByApplication() {
        int i = IccPrivateKeyCrtComponentsJson + 36;
        getProfileVersion = ((~i) + (i << 1)) % 128;
        boolean z = this.RecordsJson;
        getProfileVersion = ((((r0 & (-68)) | ((~r0) & 67)) - (~((r0 & 67) << 1))) - 1) % 128;
        return z;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinPreEntryAllowed() {
        int i = getProfileVersion;
        int i2 = i & 117;
        int i3 = -(-(i | 117));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return this.SdkCoreAlternateContactlessPaymentDataImpl;
        }
        throw null;
    }
}
