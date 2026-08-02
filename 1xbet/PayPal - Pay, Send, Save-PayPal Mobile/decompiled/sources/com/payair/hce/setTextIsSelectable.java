package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextIsSelectable extends com.payair.hce.setEms {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i2 | i4;
        int i7 = (i * (-751)) + (i2 * (-751)) + (((~(i4 | i5)) | (~(i4 | i3))) * 1504) + ((~(i3 | i6)) * (-1504)) + (((~(i | i5)) | (~i6)) * 752);
        if (i7 == 1) {
            int i8 = AlternateContactlessPaymentDataJson;
            int i9 = i8 & 35;
            int i10 = (i8 ^ 35) | i9;
            valueOf = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            return java.lang.Boolean.FALSE;
        }
        if (i7 == 2) {
            return writeReplace(objArr);
        }
        if (i7 == 3) {
            return DigitizedCardProfile(objArr);
        }
        if (i7 == 4) {
            return values(objArr);
        }
        com.payair.hce.setTextIsSelectable settextisselectable = (com.payair.hce.setTextIsSelectable) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i11 = valueOf;
        int i12 = ((i11 ^ 75) | (i11 & 75)) << 1;
        int i13 = -((i11 & (-76)) | ((~i11) & 75));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        AlternateContactlessPaymentDataJson = i14 % 128;
        if (i14 % 2 != 0) {
            setmaxlines.AlternateContactlessPaymentDataJson(78, settextisselectable.writeReplace);
            return null;
        }
        setmaxlines.AlternateContactlessPaymentDataJson(25, settextisselectable.writeReplace);
        return null;
    }

    public setTextIsSelectable(byte[] bArr) {
        this.writeReplace = com.payair.hce.getClientVersion.values(bArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTextIsSelectable settextisselectable = (com.payair.hce.setTextIsSelectable) objArr[0];
        int length = settextisselectable.writeReplace.length;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(settextisselectable);
        int i = intValue * 595;
        int i2 = i & (-1187);
        int i3 = i2 + ((i ^ (-1187)) | i2);
        int i4 = ~intValue;
        int i5 = i4 & 1;
        int i6 = (i4 | 1) & (~i5);
        int i7 = ~((i6 ^ i5) | (i6 & i5));
        int i8 = ~identityHashCode;
        int i9 = i8 ^ 1;
        int i10 = i8 & 1;
        int i11 = ~((i9 ^ i10) | (i9 & i10));
        int i12 = i7 ^ i11;
        int i13 = i7 & i11;
        int i14 = -(-(((i13 ^ i12) | (i13 & i12)) * (-1188)));
        int i15 = ~((i4 ^ 1) | i5);
        int i16 = identityHashCode & (-2);
        int i17 = (~i16) & (identityHashCode | (-2));
        int i18 = ~((i16 ^ i17) | (i16 & i17));
        int i19 = (i15 ^ i18) | (i15 & i18);
        int i20 = (identityHashCode | i8) & i8;
        int i21 = i20 & intValue;
        int i22 = ~(((i20 | intValue) & (~i21)) | i21);
        int i23 = ((~i22) & i19) | ((~i19) & i22);
        int i24 = i19 & i22;
        int i25 = (((i3 & i14) + (i3 | i14)) - (~(-(~(((i24 ^ i23) | (i24 & i23)) * 594))))) - 2;
        int i26 = ((~i8) & (-2)) | i10;
        int i27 = i8 & (-2);
        int i28 = ~((i26 ^ i27) | (i26 & i27));
        int i29 = intValue & (-2);
        int i30 = (intValue | (-2)) & (~i29);
        int i31 = ~((i29 ^ i30) | (i30 & i29));
        int i32 = ((~i28) & i31) | ((~i31) & i28) | (i28 & i31);
        int i33 = intValue ^ i20;
        int i34 = ~((i33 ^ i21) | (i21 & i33));
        int i35 = i32 & i34;
        int i36 = (i34 | i32) & (~i35);
        int i37 = ((i36 ^ i35) | (i36 & i35)) * 594;
        int i38 = i25 ^ i37;
        int i39 = (i37 & i25) << 1;
        int i40 = (i38 & i39) + (i39 | i38);
        int length2 = settextisselectable.writeReplace.length;
        int identityHashCode2 = java.lang.System.identityHashCode(settextisselectable);
        int i41 = length2 * 980;
        int i42 = i40 * (-978);
        int i43 = i41 & i42;
        int i44 = -(-((i41 ^ i42) | i43));
        int i45 = ~i40;
        int i46 = ~identityHashCode2;
        int i47 = i45 & i46;
        int i48 = (i45 | i46) & (~i47);
        int i49 = ((((i43 | i44) << 1) - (i44 ^ i43)) - (~((~((i48 & i47) | (i48 ^ i47))) * 979))) - 1;
        int i50 = length2 & i46;
        int i51 = ((~length2) & identityHashCode2) | i50;
        int i52 = length2 & identityHashCode2;
        int i53 = -(-(((i51 ^ i52) | (i51 & i52)) * (-979)));
        int i54 = i49 ^ i53;
        int i55 = ((i53 & i49) | i54) << 1;
        int i56 = -i54;
        int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
        int i58 = i45 & identityHashCode2;
        int i59 = ~(((identityHashCode2 | i45) & (~i58)) | i58);
        int i60 = (length2 | i46) & (~i50);
        int i61 = ~((i60 ^ i50) | (i60 & i50));
        int i62 = ((~i61) & i59) | ((~i59) & i61);
        int i63 = i59 & i61;
        int i64 = -(-(((i63 ^ i62) | (i63 & i62)) * 979));
        int i65 = i57 & i64;
        int i66 = ((i57 ^ i64) | i65) << 1;
        int i67 = -((i64 | i57) & (~i65));
        int i68 = AlternateContactlessPaymentDataJson;
        int i69 = (i68 & 81) + (i68 | 81);
        valueOf = i69 % 128;
        if (i69 % 2 != 0) {
            return java.lang.Integer.valueOf((i66 & i67) + (i67 | i66));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTextIsSelectable settextisselectable = (com.payair.hce.setTextIsSelectable) objArr[0];
        int i = valueOf;
        int i2 = i & 103;
        int i3 = ((i ^ 103) | i2) << 1;
        int i4 = -((i | 103) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AlternateContactlessPaymentDataJson = i5 % 128;
        byte[] bArr = settextisselectable.writeReplace;
        if (i5 % 2 == 0) {
            return java.lang.Integer.valueOf(com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr));
        }
        com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTextIsSelectable settextisselectable = (com.payair.hce.setTextIsSelectable) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 84) + ((i & 84) << 1)) - 1;
        int i3 = i2 % 128;
        valueOf = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(setems instanceof com.payair.hce.setTextIsSelectable)) {
            int i4 = (i3 & 32) + (i3 | 32);
            int i5 = (~i4) + (i4 << 1);
            AlternateContactlessPaymentDataJson = i5 % 128;
            if (i5 % 2 == 0) {
                return java.lang.Boolean.FALSE;
            }
            throw null;
        }
        boolean AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(settextisselectable.writeReplace, ((com.payair.hce.setTextIsSelectable) setems).writeReplace);
        int i6 = valueOf;
        int i7 = (i6 & (-44)) | ((~i6) & 43);
        int i8 = (i6 & 43) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        AlternateContactlessPaymentDataJson = i9 % 128;
        if (i9 % 2 == 0) {
            return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson2);
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this, setems}, -1876473718, 1876473720, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, 265686056, -265686053, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        values(new java.lang.Object[]{this, setmaxlines}, -297658710, 297658710, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -1230521152, 1230521156, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 1207241149, -1207241148, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
