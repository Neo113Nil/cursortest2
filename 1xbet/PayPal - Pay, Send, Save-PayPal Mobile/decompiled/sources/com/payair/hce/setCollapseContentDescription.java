package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCollapseContentDescription {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;
    private int AlternateContactlessPaymentDataJson = 0;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~(i4 | i5);
        return ((((i * (-575)) + (i2 * (-575))) + (((~(i5 | i3)) | i6) * 576)) + (((~(i | ((~i3) | i5))) | (~(i2 | i4))) * 576)) + (i6 * 576) != 1 ? DigitizedCardProfile(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    public setCollapseContentDescription(java.lang.String str) {
        this.writeReplace = str;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setCollapseContentDescription setcollapsecontentdescription = (com.payair.hce.setCollapseContentDescription) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 43;
        int i3 = i | 43;
        int i4 = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        valueOf = i4;
        if (setcollapsecontentdescription.AlternateContactlessPaymentDataJson == -1) {
            int i5 = i & 51;
            int i6 = ((i ^ 51) | i5) << 1;
            int i7 = -((~i5) & (i | 51));
            valueOf = ((i6 & i7) + (i7 | i6)) % 128;
            return java.lang.Boolean.FALSE;
        }
        int i8 = (i4 | 39) << 1;
        int i9 = -(i4 ^ 39);
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        int i11 = i10 % 128;
        DigitizedCardProfile = i11;
        boolean z = i10 % 2 != 0;
        int i12 = i11 ^ 31;
        int i13 = ((i11 & 31) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        valueOf = i15 % 128;
        if (i15 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setCollapseContentDescription setcollapsecontentdescription = (com.payair.hce.setCollapseContentDescription) objArr[0];
        int i = valueOf;
        int i2 = i & 109;
        int i3 = ((i ^ 109) | i2) << 1;
        int i4 = -((~i2) & (i | 109));
        DigitizedCardProfile = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        int i5 = setcollapsecontentdescription.AlternateContactlessPaymentDataJson;
        if (i5 == -1) {
            int i6 = (i & (-16)) | ((~i) & 15);
            int i7 = -(-((i & 15) << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            DigitizedCardProfile = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            int i9 = i ^ 105;
            int i10 = ((i & 105) | i9) << 1;
            int i11 = -i9;
            DigitizedCardProfile = ((i10 & i11) + (i11 | i10)) % 128;
            return null;
        }
        int indexOf = setcollapsecontentdescription.writeReplace.indexOf(46, i5);
        if (indexOf == -1) {
            valueOf = (DigitizedCardProfile + 43) % 128;
            java.lang.String substring = setcollapsecontentdescription.writeReplace.substring(setcollapsecontentdescription.AlternateContactlessPaymentDataJson);
            setcollapsecontentdescription.AlternateContactlessPaymentDataJson = -1;
            int i12 = valueOf + 19;
            DigitizedCardProfile = i12 % 128;
            if (i12 % 2 != 0) {
                return substring;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.String substring2 = setcollapsecontentdescription.writeReplace.substring(setcollapsecontentdescription.AlternateContactlessPaymentDataJson, indexOf);
        int identityHashCode = java.lang.System.identityHashCode(setcollapsecontentdescription);
        int i13 = (-2) - ((-1) ^ ((-167) - (~(indexOf * (-167)))));
        int i14 = ~indexOf;
        int i15 = i14 & (-2);
        int i16 = (~i15) & (i14 | (-2));
        int i17 = ~(i15 | i16);
        int i18 = (i14 | indexOf) & i14;
        int i19 = ~identityHashCode;
        int i20 = (i19 | identityHashCode) & i19;
        int i21 = i18 & i20;
        int i22 = (i18 | i20) & (~i21);
        int i23 = (i22 ^ i21) | (i22 & i21);
        int i24 = ~i23;
        int i25 = (i23 | i24) & i24;
        int i26 = i17 ^ i25;
        int i27 = i17 & i25;
        int i28 = -(-(((i27 ^ i26) | (i27 & i26)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
        int i29 = (((i13 ^ i28) | (i13 & i28)) << 1) - ((i13 & (~i28)) | ((~i13) & i28));
        int i30 = (i15 & i16) | (i15 ^ i16);
        int i31 = i30 & identityHashCode;
        int i32 = (i30 | identityHashCode) & (~i31);
        int i33 = (~((i32 ^ i31) | (i32 & i31))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
        int i34 = (i29 | i33) << 1;
        int i35 = -(i33 ^ i29);
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        int i37 = i19 ^ (-2);
        int i38 = i19 & (-2);
        int i39 = (i37 ^ i38) | (i37 & i38);
        int i40 = ~i39;
        int i41 = (i39 | i40) & i40;
        int i42 = indexOf & (-2);
        int i43 = (indexOf | (-2)) & (~i42);
        int i44 = ~((i43 ^ i42) | (i43 & i42));
        int i45 = (i44 ^ i41) | (i44 & i41);
        int i46 = i14 & 1;
        int i47 = i46 | ((i14 | 1) & (~i46));
        int i48 = i47 & identityHashCode;
        int i49 = (i47 | identityHashCode) & (~i48);
        int i50 = ~((i49 ^ i48) | (i49 & i48));
        int i51 = i36 & ((((~i45) & i50) | ((~i50) & i45) | (i45 & i50)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        setcollapsecontentdescription.AlternateContactlessPaymentDataJson = (i51 - (~((r0 ^ i36) | i51))) - 1;
        int i52 = DigitizedCardProfile;
        int i53 = i52 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i54 = (i52 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i53;
        int i55 = (i53 & i54) + (i54 | i53);
        valueOf = i55 % 128;
        if (i55 % 2 == 0) {
            return substring2;
        }
        throw null;
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -432883902, 432883903, java.lang.System.identityHashCode(this));
    }

    public final boolean writeReplace() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1772817506, -1772817506, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
