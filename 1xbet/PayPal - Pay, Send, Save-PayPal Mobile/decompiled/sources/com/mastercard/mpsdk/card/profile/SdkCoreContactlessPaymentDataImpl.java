package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreContactlessPaymentDataImpl implements com.payair.hce.checkCallingUriPermission, java.io.Serializable {
    private static int DigitizedCardProfile = 1;
    private static final long serialVersionUID = 1836580088383641192L;
    private static int valueOf;
    private byte[] aid;
    private com.payair.hce.enforceCallingOrSelfUriPermission alternateContactlessPaymentData;
    private byte[] cdol1RelatedDataLength;
    private byte[] ciacDecline;
    private byte[] ciacDeclineOnPpms;
    private byte[] cvrMaskAnd;
    private byte[] gpoResponse;
    private com.payair.hce.createDisplayContext iccPrivateKeyCrtComponents;
    private byte[] issuerApplicationData;
    private byte[] paymentFci;
    private byte[] pinIvCvc3Track2;
    private byte[] ppseFci;
    private com.payair.hce.checkCallingOrSelfUriPermissions[] records;

    public SdkCoreContactlessPaymentDataImpl(com.payair.hce.checkCallingUriPermission checkcallinguripermission) {
        this.aid = checkcallinguripermission.getAid();
        this.ppseFci = checkcallinguripermission.getPpseFci();
        this.paymentFci = checkcallinguripermission.getPaymentFci();
        this.gpoResponse = checkcallinguripermission.getGpoResponse();
        this.cdol1RelatedDataLength = checkcallinguripermission.getCdol1RelatedDataLength();
        this.ciacDecline = checkcallinguripermission.getCiacDecline();
        this.cvrMaskAnd = checkcallinguripermission.getCvrMaskAnd();
        this.issuerApplicationData = checkcallinguripermission.getIssuerApplicationData();
        this.iccPrivateKeyCrtComponents = new com.mastercard.mpsdk.card.profile.SdkCoreIccPrivateKeyCrtComponentsImpl(checkcallinguripermission.getIccPrivateKeyCrtComponents());
        this.pinIvCvc3Track2 = checkcallinguripermission.getPinIvCvc3Track2();
        this.ciacDeclineOnPpms = checkcallinguripermission.getCiacDeclineOnPpms();
        if (checkcallinguripermission.getAlternateContactlessPaymentData() != null) {
            this.alternateContactlessPaymentData = new com.mastercard.mpsdk.card.profile.SdkCoreAlternateContactlessPaymentDataImpl(checkcallinguripermission.getAlternateContactlessPaymentData());
        }
        this.records = buildRecords(checkcallinguripermission.getRecords());
    }

    private com.mastercard.mpsdk.card.profile.SdkCoreRecordsImpl[] buildRecords(com.payair.hce.checkCallingOrSelfUriPermissions[] checkcallingorselfuripermissionsArr) {
        int i = valueOf;
        DigitizedCardProfile = (i + 7) % 128;
        com.mastercard.mpsdk.card.profile.SdkCoreRecordsImpl[] sdkCoreRecordsImplArr = new com.mastercard.mpsdk.card.profile.SdkCoreRecordsImpl[checkcallingorselfuripermissionsArr.length];
        int i2 = i & 57;
        DigitizedCardProfile = (i2 + ((i ^ 57) | i2)) % 128;
        int i3 = 0;
        while (i3 < checkcallingorselfuripermissionsArr.length) {
            sdkCoreRecordsImplArr[i3] = new com.mastercard.mpsdk.card.profile.SdkCoreRecordsImpl(checkcallingorselfuripermissionsArr[i3]);
            i3 = (((i3 ^ 1) | (i3 & 1)) << 1) - ((i3 & (-2)) | ((~i3) & 1));
            int i4 = valueOf;
            int i5 = ((((i4 ^ 93) | (i4 & 93)) << 1) - (~(-((i4 & (-94)) | ((~i4) & 93))))) - 1;
            DigitizedCardProfile = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 2;
            }
        }
        int i7 = valueOf;
        int i8 = i7 ^ 25;
        int i9 = (i7 & 25) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        DigitizedCardProfile = i10 % 128;
        if (i10 % 2 != 0) {
            return sdkCoreRecordsImplArr;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getAid() {
        int i = valueOf;
        int i2 = (((i & 62) + (i | 62)) - 1) % 128;
        DigitizedCardProfile = i2;
        byte[] bArr = this.aid;
        int i3 = ((i2 | 106) << 1) - (i2 ^ 106);
        valueOf = ((~i3) + (i3 << 1)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getPpseFci() {
        int i = valueOf;
        int i2 = i & 25;
        int i3 = ((i ^ 25) | i2) << 1;
        int i4 = -((~i2) & (i | 25));
        DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        byte[] bArr = this.ppseFci;
        DigitizedCardProfile = (i + 39) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getPaymentFci() {
        int i = DigitizedCardProfile;
        int i2 = i | 107;
        int i3 = (i2 << 1) - ((~(i & 107)) & i2);
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return this.paymentFci;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getGpoResponse() {
        byte[] bArr = this.gpoResponse;
        int i = DigitizedCardProfile;
        valueOf = ((i & 59) + (i | 59)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCdol1RelatedDataLength() {
        int i = DigitizedCardProfile;
        valueOf = ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        byte[] bArr = this.cdol1RelatedDataLength;
        valueOf = ((i ^ 23) + ((i & 23) << 1)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCiacDecline() {
        int i = valueOf;
        int i2 = i ^ 23;
        DigitizedCardProfile = ((((i & 23) | i2) << 1) - i2) % 128;
        byte[] bArr = this.ciacDecline;
        int i3 = (i & (-96)) | ((~i) & 95);
        int i4 = -(-((i & 95) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCvrMaskAnd() {
        int i = valueOf;
        DigitizedCardProfile = (i + 11) % 128;
        byte[] bArr = this.cvrMaskAnd;
        int i2 = i & 13;
        int i3 = (i ^ 13) | i2;
        DigitizedCardProfile = ((i2 & i3) + (i3 | i2)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getIssuerApplicationData() {
        int i = DigitizedCardProfile + 113;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return this.issuerApplicationData;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public com.payair.hce.createDisplayContext getIccPrivateKeyCrtComponents() {
        int i = DigitizedCardProfile;
        int i2 = i & 61;
        int i3 = (~i2) & (i | 61);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        valueOf = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        com.payair.hce.createDisplayContext createdisplaycontext = this.iccPrivateKeyCrtComponents;
        valueOf = (((i | 121) << 1) - (i ^ 121)) % 128;
        return createdisplaycontext;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getPinIvCvc3Track2() {
        int i = DigitizedCardProfile;
        int i2 = i & 57;
        int i3 = ((((i ^ 57) | i2) << 1) - (~(-((i | 57) & (~i2))))) - 1;
        valueOf = i3 % 128;
        byte[] bArr = this.pinIvCvc3Track2;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCiacDeclineOnPpms() {
        int i = DigitizedCardProfile;
        int i2 = i & 45;
        int i3 = -(-(i | 45));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        valueOf = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.ciacDeclineOnPpms;
        int i6 = ((i5 ^ 67) | (i5 & 67)) << 1;
        int i7 = -((i5 & (-68)) | ((~i5) & 67));
        DigitizedCardProfile = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public com.payair.hce.enforceCallingOrSelfUriPermission getAlternateContactlessPaymentData() {
        int i = DigitizedCardProfile;
        int i2 = i & 57;
        int i3 = (i ^ 57) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission = this.alternateContactlessPaymentData;
        if (i4 % 2 == 0) {
            return enforcecallingorselfuripermission;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public com.payair.hce.checkCallingOrSelfUriPermissions[] getRecords() {
        int i = DigitizedCardProfile;
        int i2 = (((i & (-76)) | ((~i) & 75)) - (~(-(-((i & 75) << 1))))) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return this.records;
        }
        throw null;
    }
}
