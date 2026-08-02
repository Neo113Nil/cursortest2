package com.payair.hce;

/* loaded from: classes4.dex */
public final class registerPayair {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int getAid;
    private byte[] AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private byte[] valueOf;
    private java.lang.String values;
    private int writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (~i3) | i4;
        switch ((i * 483) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) + (((~(i4 | i5)) | (~i6)) * (-241)) + ((i | i2) * (-482)) + (((~(i | i5)) | (~(i2 | i6))) * 241)) {
            case 1:
                return values(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                return getProfileVersion(objArr);
            case 6:
                return RecordsJson(objArr);
            case 7:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 8:
                return getAid(objArr);
            case 9:
                com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
                int i7 = SdkCoreAlternateContactlessPaymentDataImpl & 49;
                int i8 = ((i7 - (~(-(-((r5 ^ 49) | i7))))) - 1) % 128;
                getAid = i8;
                int i9 = registerpayair.writeReplace;
                int i10 = i8 & 33;
                int i11 = (i8 | 33) & (~i10);
                int i12 = i10 << 1;
                SdkCoreAlternateContactlessPaymentDataImpl = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                return java.lang.Integer.valueOf(i9);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        getAid = i2 % 128;
        java.lang.String str = registerpayair.values;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 73;
        int i3 = (i ^ 73) | i2;
        getAid = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        registerpayair.values = str;
        int i4 = i + 83;
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        int i = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
        getAid = i;
        byte[] bArr = registerpayair.AlternateContactlessPaymentDataJson;
        int i2 = (i & (-48)) | ((~i) & 47);
        int i3 = (i & 47) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = getAid;
        int i2 = (((i ^ 80) + ((i & 80) << 1)) - 1) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i2;
        registerpayair.AlternateContactlessPaymentDataJson = bArr;
        int i3 = (i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 57;
        int i3 = -(-((i ^ 57) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        getAid = i4;
        registerpayair.writeReplace = intValue;
        int i5 = (i4 & (-124)) | ((~i4) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        int i6 = -(-((i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        SdkCoreAlternateContactlessPaymentDataImpl = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i & (-90)) | ((~i) & 89);
        int i3 = -(-((i & 89) << 1));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getAid = i4;
        java.lang.String str = registerpayair.DigitizedCardProfile;
        int i5 = (-2) - (~(((i4 | 48) << 1) - (i4 ^ 48)));
        SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 47;
        int i3 = -(-(i | 47));
        getAid = ((i2 & i3) + (i2 | i3)) % 128;
        registerpayair.DigitizedCardProfile = str;
        int i4 = i ^ 87;
        int i5 = ((i & 87) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i6 | i5);
        getAid = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        int i = getAid;
        int i2 = ((i & (-72)) | ((~i) & 71)) + ((i & 71) << 1);
        int i3 = i2 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i3;
        byte[] bArr = registerpayair.valueOf;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 & 69;
        int i5 = (((i3 | 69) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        getAid = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.registerPayair registerpayair = (com.payair.hce.registerPayair) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 121;
        int i3 = -(-((i ^ 121) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            registerpayair.valueOf = bArr;
            return null;
        }
        registerpayair.valueOf = bArr;
        throw null;
    }

    public final void values(byte[] bArr) {
        values(new java.lang.Object[]{this, bArr}, 776859341, -776859336, java.lang.System.identityHashCode(this));
    }

    public final byte[] DigitizedCardProfile() {
        return (byte[]) values(new java.lang.Object[]{this}, 1305982290, -1305982286, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1888488445, 1888488451, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1495057075, 1495057077, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(int i) {
        values(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -309577604, 309577605, i);
    }

    public final int valueOf() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, 1854844923, -1854844914, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void valueOf(byte[] bArr) {
        values(new java.lang.Object[]{this, bArr}, 1593165757, -1593165749, java.lang.System.identityHashCode(this));
    }

    public final byte[] writeReplace() {
        return (byte[]) values(new java.lang.Object[]{this}, -916738047, 916738054, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -83317337, 83317337, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 1662831895, -1662831892, java.lang.System.identityHashCode(this));
    }
}
