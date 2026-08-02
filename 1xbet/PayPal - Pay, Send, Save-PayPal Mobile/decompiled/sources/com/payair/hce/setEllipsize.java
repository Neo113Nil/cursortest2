package com.payair.hce;

/* loaded from: classes4.dex */
public final class setEllipsize extends com.payair.hce.setMaxHeight {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~(i | i2);
        int i7 = (~i2) | i4;
        int i8 = (i * (-716)) + (i2 * 1435) + ((i4 | i2) * (-1434)) + (((~(i5 | i2)) | i6 | (~(i7 | i3))) * 717) + (((~(i2 | i3)) | (~(i7 | i5)) | i6) * 717);
        if (i8 == 1) {
            int i9 = AlternateContactlessPaymentDataJson;
            int i10 = i9 ^ 107;
            int i11 = ((i9 & 107) | i10) << 1;
            int i12 = -i10;
            values = ((i11 & i12) + (i11 | i12)) % 128;
            return java.lang.Boolean.FALSE;
        }
        if (i8 == 2) {
            return values(objArr);
        }
        com.payair.hce.setEllipsize setellipsize = (com.payair.hce.setEllipsize) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i13 = AlternateContactlessPaymentDataJson;
        int i14 = (i13 & 23) + (i13 | 23);
        values = i14 % 128;
        if (i14 % 2 != 0) {
            setmaxlines.AlternateContactlessPaymentDataJson(2, setellipsize.DigitizedCardProfile);
        } else {
            setmaxlines.AlternateContactlessPaymentDataJson(4, setellipsize.DigitizedCardProfile);
        }
        int i15 = values;
        AlternateContactlessPaymentDataJson = ((((i15 | 48) << 1) - (i15 ^ 48)) - 1) % 128;
        return null;
    }

    public setEllipsize(byte[] bArr) {
        super(bArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setEllipsize setellipsize = (com.payair.hce.setEllipsize) objArr[0];
        int i = values;
        AlternateContactlessPaymentDataJson = (((i & 34) + (i | 34)) - 1) % 128;
        int length = setellipsize.DigitizedCardProfile.length;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int i2 = intValue & 1;
        int i3 = ((intValue ^ 1) | i2) << 1;
        int i4 = -((intValue | 1) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        int length2 = setellipsize.DigitizedCardProfile.length;
        int identityHashCode = java.lang.System.identityHashCode(setellipsize);
        int i6 = length2 * (-244);
        int i7 = -(-(i5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        int i9 = ~i5;
        int i10 = ~identityHashCode;
        int i11 = (i10 | identityHashCode) & i10;
        int i12 = ~((i11 ^ i9) | (i11 & i9));
        int i13 = i9 & length2;
        int i14 = ~(i13 | ((~i13) & (i9 | length2)));
        int i15 = ((~i14) & i12) | ((~i12) & i14);
        int i16 = i12 & i14;
        int i17 = ((i16 ^ i15) | (i16 & i15)) * (-245);
        int i18 = i8 & i17;
        int i19 = (i8 ^ i17) | i18;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        int i21 = (i5 | i9) & i9;
        int i22 = (i21 & i10) | ((~i21) & identityHashCode);
        int i23 = i21 & identityHashCode;
        int i24 = (i23 ^ i22) | (i23 & i22);
        int i25 = ~i24;
        int i26 = -(~(((i24 | i25) & i25) * (-245)));
        int i27 = (i20 ^ i26) + ((i26 & i20) << 1);
        int i28 = (~i27) + (i27 << 1);
        int i29 = (i10 & i9) | ((~i9) & identityHashCode);
        int i30 = identityHashCode & i9;
        int i31 = ~((i30 ^ i29) | (i30 & i29));
        int i32 = ((~i31) & length2) | ((~length2) & i31);
        int i33 = i31 & length2;
        int i34 = ((i33 ^ i32) | (i33 & i32)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
        int i35 = (i28 | i34) << 1;
        int i36 = -(i34 ^ i28);
        int i37 = AlternateContactlessPaymentDataJson;
        int i38 = i37 & 87;
        int i39 = (((i37 | 87) & (~i38)) - (~(i38 << 1))) - 1;
        values = i39 % 128;
        if (i39 % 2 == 0) {
            return java.lang.Integer.valueOf((i35 & i36) + (i36 | i35));
        }
        throw null;
    }

    @Override // com.payair.hce.setMaxHeight, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setmaxlines}, 1291664793, -1291664793, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1190641726, 1190641728, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1731223434, -1731223433, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
