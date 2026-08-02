package com.payair.hce;

/* loaded from: classes4.dex */
final class setFilters {
    private static com.payair.hce.setMaxEms valueOf = new com.payair.hce.setCustomInsertionActionModeCallback();
    private static com.payair.hce.setWidth writeReplace = new com.payair.hce.setCursorVisible();
    private static int values;
    private static int AlternateContactlessPaymentDataJson = (values + 61) % 128;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i | i5);
        return ((((i * (-523)) + (i2 * 263)) + (((i4 | i6) | (~(i5 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)) + (i6 * (-786))) + ((((~((~i3) | i5)) | i4) | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) != 1 ? values(objArr) : writeReplace(objArr);
    }

    setFilters() {
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setHintTextColor sethinttextcolor = (com.payair.hce.setHintTextColor) objArr[0];
        values = (AlternateContactlessPaymentDataJson + 53) % 128;
        if (((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue() > 0) {
            com.payair.hce.setTitleMarginBottom settitlemarginbottom = new com.payair.hce.setTitleMarginBottom(sethinttextcolor);
            int i = AlternateContactlessPaymentDataJson + 3;
            values = i % 128;
            if (i % 2 == 0) {
                return settitlemarginbottom;
            }
            throw null;
        }
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = ((i2 ^ 85) + ((i2 & 85) << 1)) % 128;
        values = i3;
        com.payair.hce.setMaxEms setmaxems = valueOf;
        int i4 = (i3 & 75) + (i3 | 75);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            return setmaxems;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setHintTextColor sethinttextcolor = (com.payair.hce.setHintTextColor) objArr[0];
        int i = values + 33;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue() <= 0) {
            com.payair.hce.setWidth setwidth = writeReplace;
            int i2 = values;
            AlternateContactlessPaymentDataJson = (((i2 & (-108)) | ((~i2) & 107)) + ((i2 & 107) << 1)) % 128;
            return setwidth;
        }
        com.payair.hce.setSubtitle setsubtitle = new com.payair.hce.setSubtitle(sethinttextcolor);
        int i3 = values;
        int i4 = i3 & 25;
        int i5 = ((i3 ^ 25) | i4) << 1;
        int i6 = -((i3 | 25) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        AlternateContactlessPaymentDataJson = i7 % 128;
        if (i7 % 2 != 0) {
            return setsubtitle;
        }
        throw null;
    }

    static com.payair.hce.setWidth DigitizedCardProfile(com.payair.hce.setHintTextColor sethinttextcolor) {
        return (com.payair.hce.setWidth) DigitizedCardProfile(new java.lang.Object[]{sethinttextcolor}, -1932318758, 1932318759, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.setMaxEms AlternateContactlessPaymentDataJson(com.payair.hce.setHintTextColor sethinttextcolor) {
        return (com.payair.hce.setMaxEms) DigitizedCardProfile(new java.lang.Object[]{sethinttextcolor}, 1855195378, -1855195378, (int) java.lang.System.currentTimeMillis());
    }
}
