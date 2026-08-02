package com.payair.hce;

/* loaded from: classes4.dex */
public final class isUiContext {
    private static int values = 1;
    private static int writeReplace;
    private byte[] DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i | i5);
        switch ((i * (-523)) + (i2 * 263) + ((i4 | i6 | (~(i5 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + (i6 * (-786)) + (((~((~i3) | i5)) | i4 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)) {
            case 1:
                com.payair.hce.isUiContext isuicontext = new com.payair.hce.isUiContext((java.lang.String) objArr[0]);
                int i7 = writeReplace & 95;
                values = ((i7 - (~(-(-((r4 ^ 95) | i7))))) - 1) % 128;
                return isuicontext;
            case 2:
                java.lang.String upperCase = new java.lang.String(com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile(((com.payair.hce.isUiContext) objArr[0]).DigitizedCardProfile)).toUpperCase(java.util.Locale.ENGLISH);
                values = (writeReplace + 17) % 128;
                return upperCase;
            case 3:
                return valueOf(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return values(objArr);
            case 6:
                return AlternateContactlessPaymentDataJson(objArr);
            default:
                return writeReplace(objArr);
        }
    }

    private isUiContext(java.lang.String str) {
        this.DigitizedCardProfile = com.payair.hce.setVerticalScrollbarThumbDrawable.valueOf(str);
    }

    private isUiContext(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.DigitizedCardProfile = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.String upperCase = new java.lang.String(com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile(((com.payair.hce.isUiContext) objArr[0]).DigitizedCardProfile)).toUpperCase(java.util.Locale.ENGLISH);
        int i = writeReplace;
        int i2 = ((i & 88) + (i | 88)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return upperCase;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) objArr[0];
        int i = values;
        int i2 = (i | 33) << 1;
        int i3 = -((i & (-34)) | ((~i) & 33));
        int i4 = (i2 & i3) + (i3 | i2);
        writeReplace = i4 % 128;
        byte[] bArr = isuicontext.DigitizedCardProfile;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) objArr[0];
        int i = values;
        writeReplace = (((i | 5) << 1) - (i ^ 5)) % 128;
        int length = isuicontext.DigitizedCardProfile.length;
        int i2 = (i & 97) + (i | 97);
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(length);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        com.payair.hce.isUiContext isuicontext = new com.payair.hce.isUiContext(bArr, bArr.length);
        int i = writeReplace + 61;
        values = i % 128;
        if (i % 2 != 0) {
            return isuicontext;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.isUiContext isuicontext;
        com.payair.hce.isUiContext isuicontext2 = (com.payair.hce.isUiContext) objArr[0];
        com.payair.hce.isUiContext isuicontext3 = (com.payair.hce.isUiContext) objArr[1];
        int i = writeReplace;
        int i2 = i & 115;
        values = (((((i ^ 115) | i2) << 1) - (~(-((~i2) & (i | 115))))) - 1) % 128;
        if (isuicontext3 != null) {
            int i3 = i + 33;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                byte[] bArr = isuicontext3.DigitizedCardProfile;
                throw null;
            }
            byte[] bArr2 = isuicontext3.DigitizedCardProfile;
            if (bArr2 != null) {
                if (isuicontext3 == isuicontext2) {
                    isuicontext = new com.payair.hce.isUiContext(bArr2, bArr2.length);
                    int i4 = writeReplace;
                    values = ((i4 & 31) + (i4 | 31)) % 128;
                } else {
                    int i5 = (i & (-48)) | ((~i) & 47);
                    int i6 = -(-((i & 47) << 1));
                    values = ((i5 & i6) + (i6 | i5)) % 128;
                    isuicontext = isuicontext3;
                }
                byte[] bArr3 = isuicontext2.DigitizedCardProfile;
                int length = bArr3.length;
                int length2 = (bArr3.length - (~(-(~(-(-isuicontext.DigitizedCardProfile.length)))))) - 1;
                int i7 = (~length2) + (length2 << 1);
                if (i7 > bArr3.length) {
                    int i8 = values;
                    writeReplace = ((((i8 | 61) << 1) - (~(-((i8 & (-62)) | ((~i8) & 61))))) - 1) % 128;
                    byte[] bArr4 = new byte[i7];
                    java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    isuicontext2.DigitizedCardProfile = bArr4;
                    int i9 = values;
                    writeReplace = ((i9 ^ 103) + ((i9 & 103) << 1)) % 128;
                }
                byte[] bArr5 = isuicontext.DigitizedCardProfile;
                java.lang.System.arraycopy(bArr5, 0, isuicontext2.DigitizedCardProfile, length, bArr5.length);
                if (isuicontext3 == isuicontext2) {
                    int i10 = values;
                    int i11 = i10 & 111;
                    int i12 = ((i10 ^ 111) | i11) << 1;
                    int i13 = -((~i11) & (i10 | 111));
                    writeReplace = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                    byte[] bArr6 = isuicontext.DigitizedCardProfile;
                    if (bArr6 != null) {
                        int i14 = i10 & 99;
                        int i15 = (((i10 | 99) & (~i14)) - (~(i14 << 1))) - 1;
                        writeReplace = i15 % 128;
                        int i16 = i15 % 2;
                        java.util.Arrays.fill(bArr6, (byte) 0);
                    }
                }
                int i17 = writeReplace;
                int i18 = i17 & 121;
                int i19 = (((i17 ^ 121) | i18) << 1) - ((i17 | 121) & (~i18));
                values = i19 % 128;
                if (i19 % 2 != 0) {
                    return isuicontext2;
                }
                throw null;
            }
        }
        int i20 = i & 55;
        int i21 = ((i ^ 55) | i20) << 1;
        int i22 = -((~i20) & (i | 55));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        values = i23 % 128;
        if (i23 % 2 != 0) {
            return isuicontext2;
        }
        throw null;
    }

    public final com.payair.hce.isUiContext valueOf(com.payair.hce.isUiContext isuicontext) {
        return (com.payair.hce.isUiContext) DigitizedCardProfile(new java.lang.Object[]{this, isuicontext}, 73569380, -73569375, java.lang.System.identityHashCode(this));
    }

    public static com.payair.hce.isUiContext DigitizedCardProfile(byte[] bArr) {
        return (com.payair.hce.isUiContext) DigitizedCardProfile(new java.lang.Object[]{bArr}, -1034745021, 1034745025, (int) java.lang.System.currentTimeMillis());
    }

    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1438697640, 1438697646, java.lang.System.identityHashCode(this))).intValue();
    }

    public final byte[] DigitizedCardProfile() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 942400464, -942400461, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -669572456, 669572456, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1283643699, -1283643697, java.lang.System.identityHashCode(this));
    }

    public static com.payair.hce.isUiContext AlternateContactlessPaymentDataJson(java.lang.String str) {
        return (com.payair.hce.isUiContext) DigitizedCardProfile(new java.lang.Object[]{str}, -720074735, 720074736, (int) java.lang.System.currentTimeMillis());
    }
}
