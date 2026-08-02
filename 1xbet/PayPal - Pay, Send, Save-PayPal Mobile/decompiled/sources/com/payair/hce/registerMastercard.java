package com.payair.hce;

/* loaded from: classes4.dex */
public final class registerMastercard {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int getAid = 1;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String RecordsJson;
    private byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private java.lang.String valueOf;
    private java.lang.String values;
    private byte[] writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        switch ((i * 934) + (i2 * (-932)) + (((~((~i) | i5)) | i4) * (-933)) + (((~(i5 | i4)) | (~(i4 | i))) * 933) + ((~(i | i2)) * 933)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return values(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return writeReplace(objArr);
            case 5:
                return getProfileVersion(objArr);
            case 6:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 7:
                com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i6 = IccPrivateKeyCrtComponentsJson;
                int i7 = i6 ^ 49;
                int i8 = (((((i6 & 49) | i7) << 1) - (~(-i7))) - 1) % 128;
                getAid = i8;
                registermastercard.writeReplace = bArr;
                IccPrivateKeyCrtComponentsJson = (i8 + 3) % 128;
                return null;
            case 8:
                return RecordsJson(objArr);
            case 9:
                return getAid(objArr);
            case 10:
                com.payair.hce.registerMastercard registermastercard2 = (com.payair.hce.registerMastercard) objArr[0];
                int i9 = getAid;
                int i10 = (((i9 ^ 16) + ((i9 & 16) << 1)) - 1) % 128;
                IccPrivateKeyCrtComponentsJson = i10;
                byte[] bArr2 = registermastercard2.SdkCoreAlternateContactlessPaymentDataImpl;
                getAid = ((i10 ^ 87) + ((i10 & 87) << 1)) % 128;
                return bArr2;
            case 11:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 12:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 13:
                return getPaymentFci(objArr);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        int i = getAid;
        int i2 = i & 77;
        int i3 = i2 + ((i ^ 77) | i2);
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        java.lang.String str = registermastercard.values;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i & 9;
        IccPrivateKeyCrtComponentsJson = ((i4 - (~((i ^ 9) | i4))) - 1) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = i & 65;
        int i3 = i | 65;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        IccPrivateKeyCrtComponentsJson = i5;
        if (i4 % 2 == 0) {
            registermastercard.values = str;
            int i6 = i5 & 53;
            int i7 = (~i6) & (i5 | 53);
            int i8 = -(-(i6 << 1));
            getAid = ((i7 & i8) + (i8 | i7)) % 128;
            return null;
        }
        registermastercard.values = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i & (-120)) | ((~i) & 119);
        int i3 = (i & 119) << 1;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getAid = i4 % 128;
        java.lang.String str = registermastercard.valueOf;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = i & 25;
        int i6 = ((i ^ 25) | i5) << 1;
        int i7 = -((i | 25) & (~i5));
        getAid = ((i6 & i7) + (i7 | i6)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = ((i ^ 71) | (i & 71)) << 1;
        int i3 = -((i & (-72)) | ((~i) & 71));
        int i4 = (i2 & i3) + (i2 | i3);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            registermastercard.valueOf = str;
            return null;
        }
        registermastercard.valueOf = str;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        int i = getAid;
        int i2 = i & 45;
        int i3 = (~i2) & (i | 45);
        int i4 = i2 << 1;
        IccPrivateKeyCrtComponentsJson = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        java.lang.String str = registermastercard.DigitizedCardProfile;
        int i5 = i + 87;
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = (i & (-120)) | ((~i) & 119);
        int i3 = -(-((i & 119) << 1));
        IccPrivateKeyCrtComponentsJson = ((i2 & i3) + (i3 | i2)) % 128;
        registermastercard.DigitizedCardProfile = str;
        int i4 = (i & 29) + (i | 29);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        int i = getAid;
        int i2 = i + 51;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        byte[] bArr = registermastercard.writeReplace;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i & 65;
        int i4 = i | 65;
        IccPrivateKeyCrtComponentsJson = ((i3 & i4) + (i4 | i3)) % 128;
        return bArr;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        int i = getAid;
        int i2 = i + 3;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        java.lang.String str = registermastercard.AlternateContactlessPaymentDataJson;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = (-2) - (~(i + 104));
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid + 39;
        int i2 = i % 128;
        IccPrivateKeyCrtComponentsJson = i2;
        if (i % 2 == 0) {
            registermastercard.AlternateContactlessPaymentDataJson = str;
            getAid = ((i2 & 61) + (i2 | 61)) % 128;
            return null;
        }
        registermastercard.AlternateContactlessPaymentDataJson = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((((i & (-28)) | ((~i) & 27)) - (~((i & 27) << 1))) - 1) % 128;
        getAid = i2;
        java.lang.String str = registermastercard.RecordsJson;
        int i3 = (i2 & 55) + (i2 | 55);
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson + 75;
        getAid = i % 128;
        if (i % 2 != 0) {
            registermastercard.RecordsJson = str;
            return null;
        }
        registermastercard.RecordsJson = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.registerMastercard registermastercard = (com.payair.hce.registerMastercard) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = getAid;
        int i2 = i & 15;
        int i3 = (i2 - (~(-(-((i ^ 15) | i2))))) - 1;
        int i4 = i3 % 128;
        IccPrivateKeyCrtComponentsJson = i4;
        if (i3 % 2 == 0) {
            registermastercard.SdkCoreAlternateContactlessPaymentDataImpl = bArr;
            getAid = (i4 + 117) % 128;
            return null;
        }
        registermastercard.SdkCoreAlternateContactlessPaymentDataImpl = bArr;
        throw null;
    }

    public final void valueOf(byte[] bArr) {
        DigitizedCardProfile(new java.lang.Object[]{this, bArr}, -1228736057, 1228736066, java.lang.System.identityHashCode(this));
    }

    public final byte[] getAid() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -2034627625, 2034627635, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -555420558, 555420563, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1921665819, -1921665815, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 982699150, -982699137, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1064259332, -1064259326, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(byte[] bArr) {
        DigitizedCardProfile(new java.lang.Object[]{this, bArr}, -329554701, 329554708, java.lang.System.identityHashCode(this));
    }

    public final byte[] DigitizedCardProfile() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1487453280, -1487453268, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 1958972968, -1958972967, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 504468253, -504468242, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -512329661, 512329661, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1296112071, 1296112073, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 298765696, -298765688, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1610043325, -1610043322, java.lang.System.identityHashCode(this));
    }
}
