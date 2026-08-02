package com.payair.hce;

/* loaded from: classes4.dex */
public final class setIndicatorBoundsRelative implements com.payair.hce.setOnChildClickListener {
    private static int valueOf = 0;
    private static int writeReplace = 1;
    private java.lang.StringBuilder AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = ~(i3 | i);
        int i8 = (i * (-519)) + (i2 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i2 | i3)) | (~(i4 | i5 | i6))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + (((~(i5 | i6)) | i7) * (-1040)) + (((~(i | i5)) | (~(i4 | i6)) | i7) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL);
        if (i8 == 1) {
            return values(objArr);
        }
        if (i8 == 2) {
            com.payair.hce.setIndicatorBoundsRelative setindicatorboundsrelative = (com.payair.hce.setIndicatorBoundsRelative) objArr[0];
            java.lang.String str = (java.lang.String) objArr[1];
            int intValue = ((java.lang.Number) objArr[2]).intValue();
            int intValue2 = ((java.lang.Number) objArr[3]).intValue();
            int i9 = valueOf;
            int i10 = i9 & 115;
            int i11 = (i9 ^ 115) | i10;
            writeReplace = ((i10 & i11) + (i11 | i10)) % 128;
            setindicatorboundsrelative.AlternateContactlessPaymentDataJson.append((java.lang.CharSequence) str, intValue, intValue2);
            writeReplace = (valueOf + 117) % 128;
            return java.lang.Integer.valueOf(intValue2);
        }
        if (i8 != 3) {
            return writeReplace(objArr);
        }
        com.payair.hce.setIndicatorBoundsRelative setindicatorboundsrelative2 = (com.payair.hce.setIndicatorBoundsRelative) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        int i12 = valueOf;
        writeReplace = ((((i12 & (-118)) | ((~i12) & 117)) - (~(-(-((i12 & 117) << 1))))) - 1) % 128;
        setindicatorboundsrelative2.AlternateContactlessPaymentDataJson.append(str2);
        int i13 = writeReplace;
        int i14 = i13 | 1;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 1)) & i14);
        valueOf = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
        return setindicatorboundsrelative2;
    }

    public setIndicatorBoundsRelative(java.lang.StringBuilder sb) {
        this.AlternateContactlessPaymentDataJson = sb;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setIndicatorBoundsRelative setindicatorboundsrelative = (com.payair.hce.setIndicatorBoundsRelative) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        java.lang.String str2 = (java.lang.String) objArr[4];
        int i = writeReplace;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            setindicatorboundsrelative.AlternateContactlessPaymentDataJson.append((java.lang.CharSequence) str, intValue, intValue2);
            setindicatorboundsrelative.AlternateContactlessPaymentDataJson.append(str2);
        } else {
            setindicatorboundsrelative.AlternateContactlessPaymentDataJson.append((java.lang.CharSequence) str, intValue, intValue2);
            setindicatorboundsrelative.AlternateContactlessPaymentDataJson.append(str2);
            intValue2++;
        }
        int i5 = intValue & (-139466765);
        int i6 = ((-139466765) | intValue) & (~i5);
        int i7 = ~intValue;
        int i8 = ((~((i6 ^ i5) | (i6 & i5))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 569390910;
        int i9 = ((i8 | (-10473142)) << 1) - (i8 ^ (-10473142));
        int i10 = ((-175675533) ^ i7) | (i7 & (-175675533));
        int i11 = i10 & (-2111264829);
        int i12 = (i10 | (-2111264829)) & (~i11);
        int i13 = ~((i12 ^ i11) | (i12 & i11));
        int i14 = i13 & (-2147473597);
        int i15 = (i13 | (-2147473597)) & (~i14);
        int i16 = -(-(((i15 ^ i14) | (i15 & i14)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
        int i17 = i7 & 191200061;
        int i18 = ~(((191200061 | i7) & (~i17)) | i17);
        int i19 = ((~i18) & (-1072528382)) | (1072528381 & i18);
        int i20 = i18 & (-1072528382);
        int i21 = -(-(((i20 ^ i19) | (i20 & i19)) * (-1188)));
        int i22 = (i21 & 1907932739) + (i21 | 1907932739);
        int i23 = intValue & (-191200062);
        int i24 = (~i23) & (intValue | (-191200062));
        int i25 = (i23 ^ i24) | (i23 & i24);
        int i26 = ~i25;
        int i27 = (i25 | i26) & i26;
        int i28 = (i27 ^ (-1072528382)) | (i27 & (-1072528382));
        int i29 = (intValue | i7) & i7;
        int i30 = i29 & (-885801410);
        int i31 = (i29 | (-885801410)) & (~i30);
        int i32 = ~((i31 ^ i30) | (i31 & i30));
        int i33 = ((~i32) & i28) | ((~i28) & i32);
        int i34 = i32 & i28;
        int i35 = -(-(((i34 ^ i33) | (i34 & i33)) * 594));
        int i36 = i22 & i35;
        int i37 = (i35 | i22) & (~i36);
        int i38 = -(-(i36 << 1));
        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
        int i40 = i7 & (-191200062);
        int i41 = ((-191200062) | i7) & (~i40);
        int i42 = ~((i41 ^ i40) | (i41 & i40));
        int i43 = i42 & 4473089;
        int i44 = (i42 | 4473089) & (~i43);
        int i45 = (i44 ^ i43) | (i44 & i43);
        int i46 = ~(i7 | (-885801410));
        int i47 = i45 & i46;
        int i48 = (i45 | i46) & (~i47);
        int i49 = -(-(((i48 ^ i47) | (i48 & i47)) * 594));
        int i50 = i39 & i49;
        if (((i9 | i16) << 1) - (i16 ^ i9) <= ((((i39 ^ i49) | i50) << 1) - (~(-((i49 | i39) & (~i50))))) - 1) {
            return java.lang.Integer.valueOf(intValue2);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setIndicatorBoundsRelative setindicatorboundsrelative = (com.payair.hce.setIndicatorBoundsRelative) objArr[0];
        int i = valueOf & 51;
        writeReplace = ((i - (~(-(-((r0 ^ 51) | i))))) - 1) % 128;
        java.lang.String obj = setindicatorboundsrelative.AlternateContactlessPaymentDataJson.toString();
        int identityHashCode = java.lang.System.identityHashCode(setindicatorboundsrelative);
        int i2 = ~identityHashCode;
        int i3 = identityHashCode & 545048657;
        int i4 = (i2 & (-545048658)) | i3;
        int i5 = identityHashCode & (-545048658);
        int i6 = ~((i4 ^ i5) | (i4 & i5));
        int i7 = ((~i6) & 541329409) | ((-541329410) & i6);
        int i8 = i6 & 541329409;
        int i9 = (i8 ^ i7) | (i8 & i7);
        int i10 = ~((identityHashCode ^ 1354482288) | (identityHashCode & 1354482288));
        int i11 = (((i9 ^ i10) | (i9 & i10)) * (-880)) - 146458656;
        int i12 = (i2 | identityHashCode) & i2;
        int i13 = i12 ^ (-545048658);
        int i14 = (-545048658) & i12;
        int i15 = (i14 ^ i13) | (i14 & i13);
        int i16 = ~i15;
        int i17 = (i15 | i16) & i16;
        int i18 = ((~i17) & (-1354482289)) | (1354482288 & i17) | (i17 & (-1354482289));
        int i19 = (i2 & 545048657) | i5;
        int i20 = ~((i19 ^ i3) | (i19 & i3));
        int i21 = i18 ^ i20;
        int i22 = i20 & i18;
        int i23 = ((i22 ^ i21) | (i22 & i21)) * (-880);
        int identityHashCode2 = java.lang.System.identityHashCode(setindicatorboundsrelative);
        int i24 = 2126247934 | identityHashCode2;
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = ((~i26) & 134878852) | ((-134878853) & i26);
        int i28 = i26 & 134878852;
        int i29 = -(-(((i28 ^ i27) | (i28 & i27)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
        int i30 = (i29 ^ (-32802196)) + ((i29 & (-32802196)) << 1);
        int i31 = i30 & (-1094456236);
        int i32 = ((-1094456236) ^ i30) | i31;
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = ~identityHashCode2;
        int i35 = (i34 & (-168457917)) | (168457916 & (~i34)) | (i34 & 168457916);
        int i36 = ((-2092668871) & i35) | ((~i35) & 2092668870);
        int i37 = i35 & 2092668870;
        int i38 = (i37 ^ i36) | (i37 & i36);
        int i39 = ~i38;
        int i40 = ((i38 | i39) & i39) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
        if ((((~i23) & i11) | ((~i11) & i23)) + ((i23 & i11) << 1) + ((~((identityHashCode ^ 545048657) | i3)) * 880) <= ((i33 | i40) << 1) - (i40 ^ i33)) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String toString() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1999424093, -1999424093, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setOnChildClickListener
    public final int values(java.lang.String str, int i, int i2) {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, -825428622, 825428624, i)).intValue();
    }

    @Override // com.payair.hce.setOnChildClickListener
    public final int AlternateContactlessPaymentDataJson(java.lang.String str, int i, int i2, java.lang.String str2) {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), str2}, 1893140292, -1893140291, i)).intValue();
    }

    @Override // com.payair.hce.setOnChildClickListener
    public final com.payair.hce.setOnChildClickListener DigitizedCardProfile(java.lang.String str) {
        return (com.payair.hce.setOnChildClickListener) valueOf(new java.lang.Object[]{this, str}, -814449438, 814449441, java.lang.System.identityHashCode(this));
    }
}
