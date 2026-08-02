package com.payair.hce;

/* loaded from: classes4.dex */
public class openContextMenu implements com.payair.hce.getDrawable {
    private static int values = 0;
    private static int writeReplace = 1;

    @Override // com.payair.hce.getDrawable
    public boolean valueOf(java.lang.String str) {
        int i = writeReplace;
        int i2 = ((i & 103) + (i | 103)) % 128;
        values = i2;
        int i3 = i2 & 107;
        int i4 = (i2 ^ 107) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        writeReplace = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = writeReplace;
        int i2 = i & 5;
        int i3 = ((i ^ 5) | i2) << 1;
        int i4 = -((~i2) & (i | 5));
        values = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        int i5 = (i & 37) + (i | 37);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = values;
        int i2 = ((i & 9) + (i | 9)) % 128;
        writeReplace = i2;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = writeReplace;
        int i2 = i & 75;
        values = (i2 + ((i ^ 75) | i2)) % 128;
        int i3 = i & 79;
        int i4 = -(-((i ^ 79) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    @Override // com.payair.hce.getDrawable
    public boolean SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        int i = writeReplace;
        int i2 = i & 21;
        values = (((((i ^ 21) | i2) << 1) - (~(-((~i2) & (i | 21))))) - 1) % 128;
        int i3 = (i ^ 73) + ((i & 73) << 1);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getDrawable
    public boolean writeReplace() {
        int i = writeReplace;
        values = (((((i ^ 3) | (i & 3)) << 1) - (~(-((i & (-4)) | ((~i) & 3))))) - 1) % 128;
        return false;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        int i = writeReplace;
        int i2 = i & 31;
        int i3 = (i | 31) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        values = i5;
        int i6 = i5 & 21;
        int i7 = ((i5 ^ 21) | i6) << 1;
        int i8 = -((~i6) & (i5 | 21));
        int i9 = (i7 & i8) + (i8 | i7);
        writeReplace = i9 % 128;
        if (i9 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = writeReplace;
        int i2 = i ^ 59;
        int i3 = ((i & 59) | i2) << 1;
        int i4 = -i2;
        values = ((i3 & i4) + (i4 | i3)) % 128;
        int i5 = ((i ^ 101) | (i & 101)) << 1;
        int i6 = -((i & (-102)) | ((~i) & 101));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = values;
        int i2 = ((((i & (-44)) | ((~i) & 43)) - (~((i & 43) << 1))) - 1) % 128;
        writeReplace = i2;
        int i3 = i2 & 67;
        int i4 = (i2 ^ 67) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        boolean z;
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (~i3) | i4;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        switch ((i * 483) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) + (((~(i4 | i5)) | (~i6)) * (-241)) + ((i | i2) * (-482)) + (((~(i | i5)) | (~(i2 | i6))) * 241)) {
            case 1:
                return writeReplace(objArr);
            case 2:
                int i7 = values;
                writeReplace = (i7 + 13) % 128;
                writeReplace = (i7 + 51) % 128;
                return bool;
            case 3:
                return valueOf(objArr);
            case 4:
                return values(objArr);
            case 5:
                int i8 = values;
                writeReplace = (((i8 & (-120)) | ((~i8) & 119)) + ((i8 & 119) << 1)) % 128;
                writeReplace = ((-2) - (~(i8 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE))) % 128;
                return bool;
            case 6:
                int i9 = values;
                writeReplace = ((i9 ^ 45) + ((i9 & 45) << 1)) % 128;
                int i10 = i9 ^ 67;
                int i11 = (i9 & 67) << 1;
                writeReplace = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                return bool;
            case 7:
                int i12 = values;
                int i13 = i12 & 89;
                int i14 = (i12 | 89) & (~i13);
                int i15 = -(-(i13 << 1));
                writeReplace = ((i14 & i15) + (i14 | i15)) % 128;
                return bool;
            case 8:
                return AlternateContactlessPaymentDataJson(objArr);
            case 9:
                int i16 = values;
                int i17 = i16 & 37;
                int i18 = i17 + ((i16 ^ 37) | i17);
                int i19 = i18 % 128;
                writeReplace = i19;
                z = i18 % 2 == 0;
                int i20 = (i19 & (-74)) | ((~i19) & 73);
                int i21 = -(-((i19 & 73) << 1));
                values = ((i20 ^ i21) + ((i21 & i20) << 1)) % 128;
                return java.lang.Boolean.valueOf(z);
            case 10:
                int i22 = writeReplace;
                values = ((((i22 | 30) << 1) - (i22 ^ 30)) - 1) % 128;
                return bool;
            case 11:
                int i23 = values;
                writeReplace = ((((i23 | 113) << 1) - (~(-((i23 & (-114)) | ((~i23) & 113))))) - 1) % 128;
                return bool;
            case 12:
                int i24 = values;
                int i25 = i24 & 67;
                writeReplace = (((~i25) & (i24 | 67)) + (i25 << 1)) % 128;
                writeReplace = (((i24 | 93) << 1) - (i24 ^ 93)) % 128;
                return bool;
            case 13:
                values = (writeReplace + 115) % 128;
                return bool;
            case 14:
                int i26 = writeReplace;
                int i27 = i26 & 63;
                int i28 = ((((i26 | 63) & (~i27)) - (~(i27 << 1))) - 1) % 128;
                values = i28;
                writeReplace = (i28 + 19) % 128;
                return bool;
            case 15:
                int i29 = values + 105;
                writeReplace = i29 % 128;
                return java.lang.Boolean.valueOf(i29 % 2 == 0);
            case 16:
                values = ((-2) - (~(writeReplace + 28))) % 128;
                return bool;
            case 17:
                int i30 = writeReplace;
                int i31 = i30 & 125;
                values = ((((i30 ^ 125) | i31) << 1) - ((i30 | 125) & (~i31))) % 128;
                return bool;
            case 18:
                int i32 = (writeReplace + 51) % 128;
                values = i32;
                writeReplace = ((i32 ^ 51) + ((i32 & 51) << 1)) % 128;
                return bool;
            case 19:
                int i33 = values;
                writeReplace = (((i33 ^ 46) + ((i33 & 46) << 1)) - 1) % 128;
                return bool;
            case 20:
                int i34 = writeReplace;
                int i35 = (((i34 ^ 6) + ((i34 & 6) << 1)) - 1) % 128;
                values = i35;
                int i36 = i35 & 17;
                writeReplace = (((((i35 ^ 17) | i36) << 1) - (~(-((~i36) & (i35 | 17))))) - 1) % 128;
                return bool;
            case 21:
                return DigitizedCardProfile(objArr);
            case 22:
                return getProfileVersion(objArr);
            default:
                int i37 = writeReplace;
                int i38 = i37 & 57;
                int i39 = ((~i38) & (i37 | 57)) + (i38 << 1);
                values = i39 % 128;
                z = i39 % 2 != 0;
                values = ((i37 ^ 41) + ((i37 & 41) << 1)) % 128;
                return java.lang.Boolean.valueOf(z);
        }
    }

    @Override // com.payair.hce.getDrawable
    public final boolean getProfileVersion(java.lang.String str) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str}, -111982410, 111982414, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, str2, exc}, -466928919, 466928936, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1065285268, 1065285271, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, str2, exc}, 1617904286, -1617904276, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean getAid(java.lang.String str) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str}, -1331824927, 1331824949, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean RecordsJson(java.lang.String str) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str}, -2143015264, 2143015264, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, str2}, -1922846655, 1922846661, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, str2, exc}, -790045161, 790045162, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -955636562, 955636582, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), str, str2, exc}, 1719693723, -1719693704, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1967834112, 1967834128, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), str, str2, exc}, 159557203, -159557196, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 1630443431, -1630443413, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), str2, str3, exc}, -1639465472, 1639465477, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str}, 1655675875, -1655675854, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), str2, str3, exc}, -1009635195, 1009635210, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str}, 1470685251, -1470685249, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, str2, str3, exc}, 1317704092, -1317704078, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str}, -1171148598, 1171148610, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, str2, str3, exc}, -1790438896, 1790438905, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, int i) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i)}, 1900770673, -1900770662, i)).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(java.lang.String str) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str}, -507011586, 507011594, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, str, str2, exc}, 495007076, -495007063, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
