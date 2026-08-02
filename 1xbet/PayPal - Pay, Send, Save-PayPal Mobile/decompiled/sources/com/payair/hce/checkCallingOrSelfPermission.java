package com.payair.hce;

/* loaded from: classes4.dex */
public final class checkCallingOrSelfPermission extends com.payair.hce.setTextSelectHandleLeft {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        return ((((i * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) + (i2 * (-219))) + (((~((~i) | (~i2))) | (~((i4 | i) | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) + (((~(i4 | i2)) | i) * (-440))) + (((i | i2) | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) != 1 ? DigitizedCardProfile(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = valueOf;
        int i2 = (((i & (-90)) | ((~i) & 89)) - (~(-(-((i & 89) << 1))))) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj != null) {
            java.lang.String writeReplace = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) obj).writeReplace();
            com.payair.hce.setSelection setselection = (com.payair.hce.setSelection) com.payair.hce.setTextSelectHandleLeft.DigitizedCardProfile(new java.lang.Object[0], 1993028063, -1993028063, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{setselection, writeReplace}, 1396003107, -1396003102, java.lang.System.identityHashCode(setselection));
            int i3 = valueOf;
            AlternateContactlessPaymentDataJson = ((i3 & 101) + (i3 | 101)) % 128;
        }
        int i4 = valueOf;
        AlternateContactlessPaymentDataJson = (((i4 & 71) - (~(i4 | 71))) - 1) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 55;
        int i3 = ((i ^ 55) | i2) << 1;
        int i4 = -((i | 55) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i6 = AlternateContactlessPaymentDataJson;
        valueOf = ((i6 ^ 63) + ((i6 & 63) << 1)) % 128;
        return bool;
    }

    @Override // com.payair.hce.setTextSelectHandleLeft, com.payair.hce.setElegantTextHeight
    public final java.lang.Boolean writeReplace() {
        return (java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 110121976, -110121976, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj}, 961958792, -961958791, java.lang.System.identityHashCode(this));
    }
}
