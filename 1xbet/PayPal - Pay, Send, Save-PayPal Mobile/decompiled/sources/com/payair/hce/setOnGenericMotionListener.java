package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnGenericMotionListener {
    private static int SdkCoreBusinessLogicModuleImpl = 1;
    private static int getPaymentFci;
    private final byte AlternateContactlessPaymentDataJson;
    private final java.lang.String DigitizedCardProfile;
    private final byte[] IccPrivateKeyCrtComponentsJson;
    private final byte[] RecordsJson;
    private final boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private final byte[] getAid;
    private final java.lang.String getCiacDecline;
    private final boolean getProfileVersion;
    private final byte[] valueOf;
    private final byte[] values;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i | i3);
        int i6 = ~i;
        int i7 = ~(i6 | i2);
        switch ((i * (-813)) + (i2 * 408) + (((~(i | i4)) | i5) * (-814)) + (((~((~i3) | i4)) | i7 | i5) * 407) + (((~(i6 | i3)) | i7 | (~(i2 | i3))) * 407)) {
            case 1:
                return values(objArr);
            case 2:
                return valueOf(objArr);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return writeReplace(objArr);
            case 5:
                return DigitizedCardProfile(objArr);
            case 6:
                return getProfileVersion(objArr);
            case 7:
                com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
                int i8 = SdkCoreBusinessLogicModuleImpl;
                int i9 = i8 & 21;
                int i10 = (i8 ^ 21) | i9;
                int i11 = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                getPaymentFci = i11;
                byte[] bArr = setongenericmotionlistener.IccPrivateKeyCrtComponentsJson;
                SdkCoreBusinessLogicModuleImpl = (i11 + 55) % 128;
                return bArr;
            case 8:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 9:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                com.payair.hce.setOnGenericMotionListener setongenericmotionlistener2 = (com.payair.hce.setOnGenericMotionListener) objArr[0];
                int i12 = (SdkCoreBusinessLogicModuleImpl + 13) % 128;
                getPaymentFci = i12;
                boolean z = setongenericmotionlistener2.SdkCoreAlternateContactlessPaymentDataImpl;
                int i13 = i12 & 107;
                int i14 = ((i12 ^ 107) | i13) << 1;
                int i15 = -((i12 | 107) & (~i13));
                SdkCoreBusinessLogicModuleImpl = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
                return java.lang.Boolean.valueOf(z);
        }
    }

    public setOnGenericMotionListener(java.lang.String str, byte[] bArr, byte[] bArr2, byte b, byte[] bArr3, boolean z, boolean z2, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.lang.String str2) {
        this.DigitizedCardProfile = str;
        this.valueOf = bArr;
        this.values = bArr2;
        this.AlternateContactlessPaymentDataJson = b;
        if (b == 1 || b == 3) {
            this.writeReplace = bArr3;
        } else {
            this.writeReplace = new byte[8];
        }
        this.getProfileVersion = z;
        this.SdkCoreAlternateContactlessPaymentDataImpl = z2;
        this.getAid = bArr4;
        this.RecordsJson = bArr5;
        this.IccPrivateKeyCrtComponentsJson = bArr6;
        this.getCiacDecline = str2;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        getPaymentFci = (((((i ^ 107) | (i & 107)) << 1) - (~(-((i & (-108)) | ((~i) & 107))))) - 1) % 128;
        java.lang.String str = setongenericmotionlistener.getCiacDecline;
        int i2 = i & 31;
        int i3 = (((i ^ 31) | i2) << 1) - ((i | 31) & (~i2));
        getPaymentFci = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = getPaymentFci;
        int i2 = ((i | 1) << 1) - (i ^ 1);
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        byte b = setongenericmotionlistener.AlternateContactlessPaymentDataJson;
        if (i2 % 2 != 0) {
            return java.lang.Byte.valueOf(b);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i & 85;
        int i3 = i | 85;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        getPaymentFci = i4 % 128;
        byte[] bArr = setongenericmotionlistener.getAid;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i & 115;
        int i6 = (i ^ 115) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        getPaymentFci = i7 % 128;
        if (i7 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i & 63;
        int i3 = -(-((i ^ 63) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getPaymentFci = i4;
        byte[] bArr = setongenericmotionlistener.RecordsJson;
        int i5 = (i4 ^ 45) + ((i4 & 45) << 1);
        SdkCoreBusinessLogicModuleImpl = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i & 91;
        int i3 = ((i | 91) & (~i2)) + (i2 << 1);
        int i4 = i3 % 128;
        getPaymentFci = i4;
        java.lang.String str = setongenericmotionlistener.DigitizedCardProfile;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = ((i4 | 3) << 1) - (i4 ^ 3);
        SdkCoreBusinessLogicModuleImpl = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = getPaymentFci;
        int i2 = ((i ^ 15) | (i & 15)) << 1;
        int i3 = -((i & (-16)) | ((~i) & 15));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        SdkCoreBusinessLogicModuleImpl = i5;
        byte[] bArr = setongenericmotionlistener.values;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i6 = i5 & 7;
        int i7 = (i5 | 7) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        getPaymentFci = i9 % 128;
        if (i9 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = getPaymentFci;
        int i2 = i & 19;
        int i3 = ((i ^ 19) | i2) << 1;
        int i4 = -((i | 19) & (~i2));
        int i5 = ((i3 & i4) + (i4 | i3)) % 128;
        SdkCoreBusinessLogicModuleImpl = i5;
        byte[] bArr = setongenericmotionlistener.valueOf;
        int i6 = ((i5 ^ 32) + ((i5 & 32) << 1)) - 1;
        getPaymentFci = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnGenericMotionListener setongenericmotionlistener = (com.payair.hce.setOnGenericMotionListener) objArr[0];
        int i = getPaymentFci;
        int i2 = (i & (-114)) | ((~i) & 113);
        int i3 = -(-((i & 113) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        SdkCoreBusinessLogicModuleImpl = i4 % 128;
        boolean z = setongenericmotionlistener.getProfileVersion;
        if (i4 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean SdkCoreAlternateContactlessPaymentDataImpl() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 834997205, -834997205, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final boolean RecordsJson() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1546705724, 1546705729, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final byte[] IccPrivateKeyCrtComponentsJson() {
        return (byte[]) values(new java.lang.Object[]{this}, 1550664217, -1550664211, java.lang.System.identityHashCode(this));
    }

    public final byte[] getProfileVersion() {
        return (byte[]) values(new java.lang.Object[]{this}, -490423691, 490423693, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getAid() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1548017376, 1548017379, java.lang.System.identityHashCode(this));
    }

    public final byte[] valueOf() {
        return (byte[]) values(new java.lang.Object[]{this}, -1336471713, 1336471720, java.lang.System.identityHashCode(this));
    }

    public final byte[] writeReplace() {
        return (byte[]) values(new java.lang.Object[]{this}, -1086494655, 1086494659, java.lang.System.identityHashCode(this));
    }

    public final byte[] DigitizedCardProfile() {
        return (byte[]) values(new java.lang.Object[]{this}, 952522735, -952522727, java.lang.System.identityHashCode(this));
    }

    public final byte values() {
        return ((java.lang.Byte) values(new java.lang.Object[]{this}, 1017549758, -1017549757, java.lang.System.identityHashCode(this))).byteValue();
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1142623522, 1142623531, java.lang.System.identityHashCode(this));
    }
}
