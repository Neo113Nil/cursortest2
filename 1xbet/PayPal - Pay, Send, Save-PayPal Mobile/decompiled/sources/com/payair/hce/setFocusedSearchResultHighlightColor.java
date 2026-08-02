package com.payair.hce;

/* loaded from: classes4.dex */
final class setFocusedSearchResultHighlightColor {
    private static int DigitizedCardProfile = 1;
    private static com.payair.hce.setFreezesText valueOf = new com.payair.hce.setFreezesText();
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    setFocusedSearchResultHighlightColor() {
    }

    static {
        new com.payair.hce.setInputType();
        int i = DigitizedCardProfile ^ 103;
        writeReplace = (((((r0 & 103) | i) << 1) - (~(-i))) - 1) % 128;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setHintTextColor sethinttextcolor = (com.payair.hce.setHintTextColor) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue() > 0) {
            com.payair.hce.setFreezesText setfreezestext = new com.payair.hce.setFreezesText(sethinttextcolor);
            int i5 = DigitizedCardProfile;
            int i6 = ((i5 & (-74)) | ((~i5) & 73)) + ((i5 & 73) << 1);
            writeReplace = i6 % 128;
            if (i6 % 2 == 0) {
                return setfreezestext;
            }
            throw null;
        }
        int i7 = writeReplace;
        int i8 = i7 & 105;
        int i9 = i7 | 105;
        int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        DigitizedCardProfile = i10;
        com.payair.hce.setFreezesText setfreezestext2 = valueOf;
        int i11 = i10 & 67;
        int i12 = (i10 | 67) & (~i11);
        int i13 = i11 << 1;
        writeReplace = ((i12 & i13) + (i13 | i12)) % 128;
        return setfreezestext2;
    }

    static com.payair.hce.setFreezesText DigitizedCardProfile(com.payair.hce.setHintTextColor sethinttextcolor) {
        return (com.payair.hce.setFreezesText) valueOf(new java.lang.Object[]{sethinttextcolor}, 2095243151, -2095243151, (int) java.lang.System.currentTimeMillis());
    }
}
