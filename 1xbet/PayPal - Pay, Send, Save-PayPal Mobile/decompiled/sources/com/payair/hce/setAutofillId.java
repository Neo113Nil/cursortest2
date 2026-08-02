package com.payair.hce;

/* loaded from: classes4.dex */
public class setAutofillId implements com.payair.hce.checkCallingUriPermission, java.io.Serializable {
    private static int getCvrMaskAnd = 0;
    private static int getGpoResponse = 1;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private byte[] IccPrivateKeyCrtComponentsJson;
    private byte[] RecordsJson;
    private com.payair.hce.createDisplayContext SdkCoreAlternateContactlessPaymentDataImpl;
    private byte[] SdkCoreBusinessLogicModuleImpl;
    private byte[] getAid;
    private com.payair.hce.enforceCallingOrSelfUriPermission getCiacDecline;
    private com.payair.hce.checkCallingOrSelfUriPermissions[] getPaymentFci;
    private byte[] getProfileVersion;
    private byte[] valueOf;
    private byte[] values;
    private byte[] writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setOnDragListener[] setondraglistenerArr;
        int i4 = 0;
        com.payair.hce.checkCallingOrSelfUriPermissions[] checkcallingorselfuripermissionsArr = (com.payair.hce.checkCallingOrSelfUriPermissions[]) objArr[0];
        int i5 = getGpoResponse + 95;
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 != 0) {
            setondraglistenerArr = new com.payair.hce.setOnDragListener[checkcallingorselfuripermissionsArr.length];
            i4 = 1;
        } else {
            setondraglistenerArr = new com.payair.hce.setOnDragListener[checkcallingorselfuripermissionsArr.length];
        }
        while (i4 < checkcallingorselfuripermissionsArr.length) {
            setondraglistenerArr[i4] = new com.payair.hce.setOnDragListener(checkcallingorselfuripermissionsArr[i4]);
            int i6 = (i4 & (-2)) | ((~i4) & 1);
            int i7 = -(-((i4 & 1) << 1));
            i4 = ((i6 | i7) << 1) - (i7 ^ i6);
            getCvrMaskAnd = (getGpoResponse + 25) % 128;
        }
        getCvrMaskAnd = (getGpoResponse + 61) % 128;
        return setondraglistenerArr;
    }

    public setAutofillId(com.payair.hce.checkCallingUriPermission checkcallinguripermission) {
        this.values = checkcallinguripermission.getAid();
        this.DigitizedCardProfile = checkcallinguripermission.getPpseFci();
        this.valueOf = checkcallinguripermission.getPaymentFci();
        this.AlternateContactlessPaymentDataJson = checkcallinguripermission.getGpoResponse();
        this.writeReplace = checkcallinguripermission.getCdol1RelatedDataLength();
        this.getAid = checkcallinguripermission.getCiacDecline();
        this.IccPrivateKeyCrtComponentsJson = checkcallinguripermission.getCvrMaskAnd();
        this.RecordsJson = checkcallinguripermission.getIssuerApplicationData();
        this.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.setContentCaptureSession(checkcallinguripermission.getIccPrivateKeyCrtComponents());
        this.getProfileVersion = checkcallinguripermission.getPinIvCvc3Track2();
        this.SdkCoreBusinessLogicModuleImpl = checkcallinguripermission.getCiacDeclineOnPpms();
        if (checkcallinguripermission.getAlternateContactlessPaymentData() != null) {
            this.getCiacDecline = new com.payair.hce.setOnHoverListener(checkcallinguripermission.getAlternateContactlessPaymentData());
        }
        this.getPaymentFci = (com.payair.hce.setOnDragListener[]) writeReplace(new java.lang.Object[]{checkcallinguripermission.getRecords()}, -156851078, 156851078, (int) java.lang.System.currentTimeMillis());
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getAid() {
        int i = getGpoResponse;
        int i2 = ((i | 83) << 1) - (i ^ 83);
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.values;
        int i3 = i & 55;
        int i4 = (i ^ 55) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getPpseFci() {
        int i = getGpoResponse;
        int i2 = (i ^ 67) + ((i & 67) << 1);
        int i3 = i2 % 128;
        getCvrMaskAnd = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.DigitizedCardProfile;
        int i4 = i3 & 1;
        int i5 = (i3 | 1) & (~i4);
        int i6 = i4 << 1;
        getGpoResponse = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getPaymentFci() {
        int i = getCvrMaskAnd;
        int i2 = i & 39;
        int i3 = ((i ^ 39) | i2) << 1;
        int i4 = -((~i2) & (i | 39));
        getGpoResponse = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        byte[] bArr = this.valueOf;
        int i5 = (((i | 4) << 1) - (i ^ 4)) - 1;
        getGpoResponse = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getGpoResponse() {
        int i = getGpoResponse;
        int i2 = (i & 9) + (i | 9);
        getCvrMaskAnd = i2 % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCdol1RelatedDataLength() {
        int i = getGpoResponse;
        getCvrMaskAnd = (i + 51) % 128;
        byte[] bArr = this.writeReplace;
        getCvrMaskAnd = (i + 81) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCiacDecline() {
        int i = getCvrMaskAnd + 29;
        getGpoResponse = i % 128;
        byte[] bArr = this.getAid;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCvrMaskAnd() {
        int i = getGpoResponse;
        getCvrMaskAnd = ((((i ^ 19) | (i & 19)) << 1) - ((i & (-20)) | ((~i) & 19))) % 128;
        byte[] bArr = this.IccPrivateKeyCrtComponentsJson;
        int i2 = i + 31;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getIssuerApplicationData() {
        int i = getGpoResponse;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getCvrMaskAnd = i4;
        byte[] bArr = this.RecordsJson;
        getGpoResponse = (i4 + 89) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public com.payair.hce.createDisplayContext getIccPrivateKeyCrtComponents() {
        int i = getGpoResponse;
        int i2 = (((i & 65) - (~(i | 65))) - 1) % 128;
        getCvrMaskAnd = i2;
        com.payair.hce.createDisplayContext createdisplaycontext = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i3 = i2 + 47;
        getGpoResponse = i3 % 128;
        if (i3 % 2 != 0) {
            return createdisplaycontext;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getPinIvCvc3Track2() {
        int i = getCvrMaskAnd;
        int i2 = (i ^ 97) + ((i & 97) << 1);
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getProfileVersion;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public byte[] getCiacDeclineOnPpms() {
        int i = getGpoResponse;
        getCvrMaskAnd = (i + 95) % 128;
        byte[] bArr = this.SdkCoreBusinessLogicModuleImpl;
        int i2 = i & 59;
        int i3 = ((i ^ 59) | i2) << 1;
        int i4 = -((i | 59) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public com.payair.hce.enforceCallingOrSelfUriPermission getAlternateContactlessPaymentData() {
        int i = getGpoResponse;
        getCvrMaskAnd = (((i | 13) << 1) - (i ^ 13)) % 128;
        com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission = this.getCiacDecline;
        getCvrMaskAnd = (((i | 77) << 1) - (i ^ 77)) % 128;
        return enforcecallingorselfuripermission;
    }

    @Override // com.payair.hce.checkCallingUriPermission
    public com.payair.hce.checkCallingOrSelfUriPermissions[] getRecords() {
        int i = getCvrMaskAnd;
        int i2 = i & 81;
        int i3 = -(-((i ^ 81) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getGpoResponse = i4 % 128;
        if (i4 % 2 != 0) {
            return this.getPaymentFci;
        }
        throw null;
    }

    private static com.payair.hce.setOnDragListener[] values(com.payair.hce.checkCallingOrSelfUriPermissions[] checkcallingorselfuripermissionsArr) {
        return (com.payair.hce.setOnDragListener[]) writeReplace(new java.lang.Object[]{checkcallingorselfuripermissionsArr}, -156851078, 156851078, (int) java.lang.System.currentTimeMillis());
    }
}
