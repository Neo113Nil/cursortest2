package com.payair.hce;

/* loaded from: classes4.dex */
public final class authenticateRequest {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int getAid;
    private int AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String RecordsJson;
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private byte[] getProfileVersion;
    private int valueOf;
    private java.lang.String values;
    private byte[] writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (~i) | i2;
        int i5 = ~i3;
        switch ((i * 141) + (i2 * (-279)) + ((i2 | i3) * 140) + (((~i4) | (~(i5 | i2))) * (-280)) + (((~(i | (~i2))) | (~(i5 | i)) | (~(i4 | i3))) * 140)) {
            case 1:
                com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
                int i6 = IccPrivateKeyCrtComponentsJson;
                int i7 = i6 ^ 37;
                int i8 = (i6 & 37) << 1;
                int i9 = ((i7 & i8) + (i8 | i7)) % 128;
                getAid = i9;
                java.lang.String str = authenticaterequest.values;
                IccPrivateKeyCrtComponentsJson = ((i9 ^ 59) + ((i9 & 59) << 1)) % 128;
                return str;
            case 2:
                com.payair.hce.authenticateRequest authenticaterequest2 = (com.payair.hce.authenticateRequest) objArr[0];
                int i10 = getAid;
                int i11 = i10 & 111;
                int i12 = ((i10 ^ 111) | i11) << 1;
                int i13 = -((i10 | 111) & (~i11));
                int i14 = ((i12 & i13) + (i13 | i12)) % 128;
                IccPrivateKeyCrtComponentsJson = i14;
                int i15 = authenticaterequest2.AlternateContactlessPaymentDataJson;
                getAid = ((i14 ^ 63) + ((i14 & 63) << 1)) % 128;
                return java.lang.Integer.valueOf(i15);
            case 3:
                com.payair.hce.authenticateRequest authenticaterequest3 = (com.payair.hce.authenticateRequest) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                int i16 = getAid;
                IccPrivateKeyCrtComponentsJson = (i16 + 21) % 128;
                authenticaterequest3.values = str2;
                IccPrivateKeyCrtComponentsJson = ((((i16 | 50) << 1) - (i16 ^ 50)) - 1) % 128;
                return null;
            case 4:
                return valueOf(objArr);
            case 5:
                return writeReplace(objArr);
            case 6:
                return values(objArr);
            case 7:
                com.payair.hce.authenticateRequest authenticaterequest4 = (com.payair.hce.authenticateRequest) objArr[0];
                int i17 = getAid;
                IccPrivateKeyCrtComponentsJson = (((i17 | 65) << 1) - (i17 ^ 65)) % 128;
                byte[] bArr = authenticaterequest4.getProfileVersion;
                int i18 = i17 & 125;
                IccPrivateKeyCrtComponentsJson = ((((i17 | 125) & (~i18)) - (~(i18 << 1))) - 1) % 128;
                return bArr;
            case 8:
                return AlternateContactlessPaymentDataJson(objArr);
            case 9:
                return DigitizedCardProfile(objArr);
            case 10:
                return getAid(objArr);
            case 11:
                return RecordsJson(objArr);
            case 12:
                com.payair.hce.authenticateRequest authenticaterequest5 = (com.payair.hce.authenticateRequest) objArr[0];
                int i19 = getAid;
                int i20 = (i19 | 63) << 1;
                int i21 = -((i19 & (-64)) | ((~i19) & 63));
                IccPrivateKeyCrtComponentsJson = ((i20 ^ i21) + ((i20 & i21) << 1)) % 128;
                java.lang.String str3 = authenticaterequest5.SdkCoreAlternateContactlessPaymentDataImpl;
                int i22 = i19 & 85;
                IccPrivateKeyCrtComponentsJson = ((i22 - (~(-(-((i19 ^ 85) | i22))))) - 1) % 128;
                return str3;
            case 13:
                com.payair.hce.authenticateRequest authenticaterequest6 = (com.payair.hce.authenticateRequest) objArr[0];
                java.lang.String str4 = (java.lang.String) objArr[1];
                int i23 = IccPrivateKeyCrtComponentsJson;
                getAid = (i23 + 3) % 128;
                authenticaterequest6.RecordsJson = str4;
                getAid = (i23 + 59) % 128;
                return null;
            case 14:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 15:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                com.payair.hce.authenticateRequest authenticaterequest7 = (com.payair.hce.authenticateRequest) objArr[0];
                int intValue = ((java.lang.Number) objArr[1]).intValue();
                int i24 = getAid;
                int i25 = i24 & 49;
                int i26 = ((i25 - (~((i24 ^ 49) | i25))) - 1) % 128;
                IccPrivateKeyCrtComponentsJson = i26;
                authenticaterequest7.AlternateContactlessPaymentDataJson = intValue;
                int i27 = (i26 & (-100)) | ((~i26) & 99);
                int i28 = (i26 & 99) << 1;
                getAid = ((i27 ^ i28) + ((i27 & i28) << 1)) % 128;
                return null;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        int i = getAid + 103;
        IccPrivateKeyCrtComponentsJson = i % 128;
        byte[] bArr = authenticaterequest.writeReplace;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        IccPrivateKeyCrtComponentsJson = (getAid + 83) % 128;
        authenticaterequest.writeReplace = bArr;
        int identityHashCode = java.lang.System.identityHashCode(authenticaterequest);
        int i = ~identityHashCode;
        int i2 = i & (-536886275);
        int i3 = ((-536886275) | i) & (~i2);
        int i4 = ((-743740799) - (~(-(-(((i3 ^ i2) | (i3 & i2)) * (-369)))))) + (((~((i & 572734482) | ((~i) & 572734482) | (i & (-572734483)))) | (-555253540)) * (-369));
        int i5 = identityHashCode & (-572734483);
        int i6 = ~(i5 | (((-572734483) | identityHashCode) & (~i5)));
        int i7 = ((~i6) & 35848208) | ((-35848209) & i6);
        int i8 = i6 & 35848208;
        int i9 = (i8 ^ i7) | (i8 & i7);
        int i10 = ((identityHashCode | i) & i) | 572734482;
        int i11 = i10 ^ (-555253540);
        int i12 = i10 & (-555253540);
        int i13 = ~((i12 ^ i11) | (i12 & i11));
        int i14 = i9 & i13;
        int i15 = (i13 | i9) & (~i14);
        int i16 = -(-(((i15 ^ i14) | (i15 & i14)) * 369));
        int i17 = i4 | i16;
        int i18 = i17 << 1;
        int i19 = -((~(i16 & i4)) & i17);
        int identityHashCode2 = java.lang.System.identityHashCode(authenticaterequest);
        int i20 = identityHashCode2 ^ (-547375105);
        int i21 = (-547375105) & identityHashCode2;
        int i22 = (i21 ^ i20) | (i21 & i20);
        int i23 = ~i22;
        int i24 = (i22 | i23) & i23;
        int i25 = ~identityHashCode2;
        int i26 = i25 & (i25 | identityHashCode2);
        int i27 = (i26 ^ 1906592036) | (i26 & 1906592036);
        int i28 = (i27 ^ 548666010) | (i27 & 548666010);
        int i29 = ~i28;
        int i30 = (i28 | i29) & i29;
        int i31 = ((~i30) & i24) | ((~i24) & i30);
        int i32 = i24 & i30;
        int i33 = -(-(((i32 ^ i31) | (i32 & i31)) * (-318)));
        int i34 = (i33 & 131511378) + (i33 | 131511378);
        int i35 = identityHashCode2 & 1906592036;
        int i36 = i35 | ((~i35) & (1906592036 | identityHashCode2));
        int i37 = ~i36;
        int i38 = (i36 | i37) & i37;
        int i39 = ((i38 ^ 1290906) | (i38 & 1290906)) * (-318);
        int i40 = i34 & i39;
        int i41 = i39 | i34;
        int i42 = (i40 & i41) + (i41 | i40);
        int i43 = identityHashCode2 & (-1906592037);
        int i44 = (identityHashCode2 | (-1906592037)) & (~i43);
        int i45 = (i44 ^ i43) | (i44 & i43);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = ((i47 & 548666010) | ((-548666011) & (~i47)) | (i47 & (-548666011))) * 318;
        int i49 = i42 | i48;
        if (((i18 | i19) << 1) - (i19 ^ i18) > ((i49 << 1) - (~(-((~(i48 & i42)) & i49)))) - 1) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        int i = getAid;
        int i2 = i & 69;
        int i3 = (((i | 69) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        int i4 = i3 % 128;
        IccPrivateKeyCrtComponentsJson = i4;
        java.lang.String str = authenticaterequest.DigitizedCardProfile;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = ((i4 & 121) - (~(-(-(i4 | 121))))) - 1;
        getAid = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson + 121;
        int i2 = i % 128;
        getAid = i2;
        if (i % 2 == 0) {
            authenticaterequest.DigitizedCardProfile = str;
            int i3 = i2 & 97;
            int i4 = i2 | 97;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            IccPrivateKeyCrtComponentsJson = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        authenticaterequest.DigitizedCardProfile = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        int i = getAid;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        int i3 = authenticaterequest.valueOf;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(i3);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = getAid;
        int i2 = i & 53;
        int i3 = ((i ^ 53) | i2) << 1;
        int i4 = -((i | 53) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        IccPrivateKeyCrtComponentsJson = i6;
        if (i5 % 2 != 0) {
            authenticaterequest.valueOf = intValue;
            int i7 = i6 & 121;
            getAid = ((((~i7) & (i6 | 121)) - (~(-(-(i7 << 1))))) - 1) % 128;
            return null;
        }
        authenticaterequest.valueOf = intValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (((i | 55) << 1) - (i ^ 55)) % 128;
        getAid = i2;
        java.lang.String str = authenticaterequest.RecordsJson;
        int i3 = i2 + 105;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = getAid;
        int i2 = i & 109;
        int i3 = (((((i ^ 109) | i2) << 1) - (~(-((i | 109) & (~i2))))) - 1) % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        authenticaterequest.getProfileVersion = bArr;
        int i4 = (((i3 & (-112)) | ((~i3) & 111)) - (~(-(-((i3 & 111) << 1))))) - 1;
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.authenticateRequest authenticaterequest = (com.payair.hce.authenticateRequest) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 119;
        int i3 = (i ^ 119) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            authenticaterequest.SdkCoreAlternateContactlessPaymentDataImpl = str;
            return null;
        }
        authenticaterequest.SdkCoreAlternateContactlessPaymentDataImpl = str;
        throw null;
    }

    public final void values(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -1704088603, 1704088613, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -46203677, 46203689, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(byte[] bArr) {
        DigitizedCardProfile(new java.lang.Object[]{this, bArr}, 1077348826, -1077348821, java.lang.System.identityHashCode(this));
    }

    public final byte[] getAid() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -2130549654, 2130549661, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -596054695, 596054708, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -582095923, 582095927, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1662771544, -1662771536, i);
    }

    public final int writeReplace() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 2027571488, -2027571479, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void DigitizedCardProfile(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -406755341, 406755341, i);
    }

    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 119915555, -119915553, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void valueOf(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -314831615, 314831630, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -644474221, 644474232, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(byte[] bArr) {
        DigitizedCardProfile(new java.lang.Object[]{this, bArr}, 53758373, -53758367, java.lang.System.identityHashCode(this));
    }

    public final byte[] valueOf() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1379316894, -1379316880, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -670662141, 670662144, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -387090980, 387090981, java.lang.System.identityHashCode(this));
    }
}
