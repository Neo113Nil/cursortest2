package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnTouchListener {
    private static int SdkCoreBusinessLogicModuleImpl = 0;
    private static int getGpoResponse = 1;
    private final byte[] AlternateContactlessPaymentDataJson;
    private final byte[] DigitizedCardProfile;
    private final java.lang.String IccPrivateKeyCrtComponentsJson;
    private final byte[] RecordsJson;
    private final byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private final java.lang.String getAid;
    private final byte[] getProfileVersion;
    private final java.lang.String valueOf;
    private final byte[] values;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        switch ((i * 866) + (i2 * (-864)) + (((~((~i) | i5)) | i4) * (-865)) + ((~(i3 | i)) * 865) + (((~(i | i5)) | (~(i4 | i5))) * 865)) {
            case 1:
                return valueOf(objArr);
            case 2:
                return AlternateContactlessPaymentDataJson(objArr);
            case 3:
                com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
                int i6 = SdkCoreBusinessLogicModuleImpl;
                int i7 = ((i6 & 39) + (i6 | 39)) % 128;
                getGpoResponse = i7;
                java.lang.String str = setontouchlistener.IccPrivateKeyCrtComponentsJson;
                SdkCoreBusinessLogicModuleImpl = (((i7 | 55) << 1) - (i7 ^ 55)) % 128;
                return str;
            case 4:
                return writeReplace(objArr);
            case 5:
                com.payair.hce.setOnTouchListener setontouchlistener2 = (com.payair.hce.setOnTouchListener) objArr[0];
                int i8 = SdkCoreBusinessLogicModuleImpl;
                getGpoResponse = ((i8 & 83) + (i8 | 83)) % 128;
                byte[] bArr = setontouchlistener2.RecordsJson;
                getGpoResponse = ((((i8 ^ 61) | (i8 & 61)) << 1) - ((i8 & (-62)) | ((~i8) & 61))) % 128;
                return bArr;
            case 6:
                return DigitizedCardProfile(objArr);
            case 7:
                return RecordsJson(objArr);
            case 8:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 9:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                return values(objArr);
        }
    }

    public setOnTouchListener(byte[] bArr, java.lang.String str, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, java.lang.String str2, java.lang.String str3) {
        this.writeReplace = bArr;
        this.valueOf = str;
        this.AlternateContactlessPaymentDataJson = bArr2;
        this.values = bArr3;
        this.DigitizedCardProfile = bArr4;
        this.getProfileVersion = bArr5;
        this.RecordsJson = bArr6;
        this.SdkCoreAlternateContactlessPaymentDataImpl = bArr7;
        this.IccPrivateKeyCrtComponentsJson = str2;
        this.getAid = str3;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i ^ 109;
        int i3 = -(-((i & 109) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getGpoResponse = i4 % 128;
        byte[] bArr = setontouchlistener.writeReplace;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = getGpoResponse;
        int i2 = i & 85;
        int i3 = (i ^ 85) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        SdkCoreBusinessLogicModuleImpl = i4 % 128;
        java.lang.String str = setontouchlistener.valueOf;
        if (i4 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = (((i | 111) << 1) - (i ^ 111)) % 128;
        getGpoResponse = i2;
        byte[] bArr = setontouchlistener.AlternateContactlessPaymentDataJson;
        int i3 = i2 + 93;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl + 17;
        getGpoResponse = i % 128;
        byte[] bArr = setontouchlistener.values;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = getGpoResponse;
        int i2 = i & 21;
        int i3 = ((i | 21) & (~i2)) + (i2 << 1);
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        byte[] bArr = setontouchlistener.DigitizedCardProfile;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = getGpoResponse;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        byte[] bArr = setontouchlistener.getProfileVersion;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = getGpoResponse;
        int i2 = i & 59;
        int i3 = (((i | 59) & (~i2)) + (i2 << 1)) % 128;
        SdkCoreBusinessLogicModuleImpl = i3;
        byte[] bArr = setontouchlistener.SdkCoreAlternateContactlessPaymentDataImpl;
        int i4 = (((i3 | 95) << 1) - (~(-((i3 & (-96)) | ((~i3) & 95))))) - 1;
        getGpoResponse = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnTouchListener setontouchlistener = (com.payair.hce.setOnTouchListener) objArr[0];
        int i = getGpoResponse;
        SdkCoreBusinessLogicModuleImpl = ((((i | 61) << 1) - (~(-((i & (-62)) | ((~i) & 61))))) - 1) % 128;
        java.lang.String str = setontouchlistener.getAid;
        int i2 = (i ^ 43) + ((i & 43) << 1);
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final java.lang.String getAid() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -266878927, 266878933, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String RecordsJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 285050262, -285050259, java.lang.System.identityHashCode(this));
    }

    public final byte[] getProfileVersion() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -788066723, 788066727, java.lang.System.identityHashCode(this));
    }

    public final byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1136670693, -1136670688, java.lang.System.identityHashCode(this));
    }

    public final byte[] IccPrivateKeyCrtComponentsJson() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1124956721, 1124956723, java.lang.System.identityHashCode(this));
    }

    public final byte[] DigitizedCardProfile() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 65618716, -65618709, java.lang.System.identityHashCode(this));
    }

    public final byte[] values() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 437433430, -437433430, java.lang.System.identityHashCode(this));
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 574365312, -574365311, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 937872726, -937872717, java.lang.System.identityHashCode(this));
    }

    public final byte[] valueOf() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1793919299, -1793919291, java.lang.System.identityHashCode(this));
    }
}
