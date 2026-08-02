package com.payair.hce;

/* loaded from: classes4.dex */
public final class setVerticalScrollbarPosition {
    private static int getAid = 1;
    private static int writeReplace;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private byte[] values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        switch ((i * 784) + (i2 * (-782)) + ((~i2) * (-783)) + ((~(i4 | i5 | i2)) * (-783)) + (((~(i2 | i5)) | i4) * 783)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return values(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i6 = writeReplace;
                int i7 = i6 & 119;
                int i8 = ((i6 ^ 119) | i7) << 1;
                int i9 = -((~i7) & (i6 | 119));
                getAid = ((i8 & i9) + (i8 | i9)) % 128;
                setverticalscrollbarposition.values = bArr;
                getAid = (i6 + 109) % 128;
                return null;
            case 5:
                return DigitizedCardProfile(objArr);
            case 6:
                return valueOf(objArr);
            case 7:
                com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition2 = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
                int i10 = getAid;
                int i11 = i10 & 75;
                writeReplace = (((~i11) & (i10 | 75)) + (i11 << 1)) % 128;
                java.lang.String str = setverticalscrollbarposition2.AlternateContactlessPaymentDataJson;
                writeReplace = ((i10 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
                return str;
            default:
                com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition3 = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                int i12 = getAid;
                int i13 = (((i12 & 50) + (i12 | 50)) - 1) % 128;
                writeReplace = i13;
                setverticalscrollbarposition3.valueOf = str2;
                getAid = (i13 + 95) % 128;
                return null;
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
        int i = getAid;
        int i2 = (((i & 2) + (i | 2)) - 1) % 128;
        writeReplace = i2;
        java.lang.String str = setverticalscrollbarposition.DigitizedCardProfile;
        int i3 = (((i2 ^ 85) | (i2 & 85)) << 1) - ((i2 & (-86)) | ((~i2) & 85));
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = writeReplace;
        getAid = (((i ^ 20) + ((i & 20) << 1)) - 1) % 128;
        setverticalscrollbarposition.DigitizedCardProfile = str;
        int identityHashCode = java.lang.System.identityHashCode(setverticalscrollbarposition);
        int i2 = ~identityHashCode;
        int i3 = i2 ^ (-614382086);
        int i4 = i2 & (-614382086);
        int i5 = ~((i3 ^ i4) | (i4 & i3));
        int i6 = ((-538454530) & i5) | ((~i5) & 538454529);
        int i7 = i5 & 538454529;
        int i8 = (i7 ^ i6) | (i7 & i6);
        int i9 = i2 & 1033813927;
        int i10 = ((-1033813928) & identityHashCode) | i9;
        int i11 = identityHashCode & 1033813927;
        int i12 = (i10 ^ i11) | (i10 & i11);
        int i13 = ~i12;
        int i14 = (i12 | i13) & i13;
        int i15 = i8 & i14;
        int i16 = -(-((((i8 | i14) & (~i15)) | i15) * 717));
        int i17 = (i2 | 1033813927) & (~i9);
        int i18 = ~((i17 ^ i9) | (i9 & i17));
        int i19 = i18 ^ 538454529;
        int i20 = i18 & 538454529;
        int i21 = (i20 ^ i19) | (i20 & i19);
        int i22 = ~((identityHashCode & 614382085) | i4 | ((-614382086) & identityHashCode));
        int i23 = i21 ^ i22;
        int i24 = i22 & i21;
        int i25 = -(~(((i24 ^ i23) | (i24 & i23)) * 717));
        int identityHashCode2 = java.lang.System.identityHashCode(setverticalscrollbarposition);
        int i26 = ~identityHashCode2;
        int i27 = identityHashCode2 & (-1083262116);
        int i28 = (i26 & 1083262115) | i27;
        int i29 = identityHashCode2 & 1083262115;
        int i30 = ~((i28 ^ i29) | (i28 & i29));
        int i31 = i30 & 302553152;
        int i32 = (-2) - (~(2113540385 - (~((((i30 | 302553152) & (~i31)) | i31) * (-814)))));
        int i33 = i26 ^ (-311008324);
        int i34 = i26 & (-311008324);
        int i35 = ~((i34 ^ i33) | (i34 & i33));
        int i36 = i35 & 1074806944;
        int i37 = (i35 | 1074806944) & (~i36);
        int i38 = -(-(((i37 ^ i36) | (i37 & i36) | (~((1083262115 ^ identityHashCode2) | i29))) * 407));
        int i39 = i32 ^ i38;
        int i40 = ((i38 & i32) | i39) << 1;
        int i41 = -i39;
        int i42 = (i40 & i41) + (i40 | i41);
        int i43 = ~(((~i27) & (identityHashCode2 | (-1083262116))) | i27);
        int i44 = (i43 & (-1074806945)) | ((~i43) & 1074806944) | (i43 & 1074806944);
        int i45 = identityHashCode2 ^ 311008323;
        int i46 = identityHashCode2 & 311008323;
        int i47 = ~((i46 ^ i45) | (i46 & i45));
        int i48 = ((i47 ^ i44) | (i47 & i44)) * 407;
        if ((-2) - (~((((i16 ^ (-1012188400)) + (((-1012188400) & i16) << 1)) - (~i25)) - 1)) <= (i42 & i48) + (i48 | i42)) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
        int i = getAid;
        writeReplace = (i + 51) % 128;
        byte[] bArr = setverticalscrollbarposition.values;
        int i2 = (-2) - (~(((i | 42) << 1) - (i ^ 42)));
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
        int i = writeReplace;
        int i2 = i & 103;
        getAid = (i2 + ((i ^ 103) | i2)) % 128;
        java.lang.String str = setverticalscrollbarposition.valueOf;
        int i3 = ((i & 108) + (i | 108)) - 1;
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarPosition setverticalscrollbarposition = (com.payair.hce.setVerticalScrollbarPosition) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = ((i | 43) << 1) - (i ^ 43);
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            setverticalscrollbarposition.AlternateContactlessPaymentDataJson = str;
            return null;
        }
        setverticalscrollbarposition.AlternateContactlessPaymentDataJson = str;
        throw null;
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -2088030763, 2088030764, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -264251867, 264251874, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 812126300, -812126300, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -166385731, 166385733, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(byte[] bArr) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr}, -1452176725, 1452176729, java.lang.System.identityHashCode(this));
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -232857993, 232857996, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1754226450, 1754226455, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2130146652, -2130146646, java.lang.System.identityHashCode(this));
    }
}
