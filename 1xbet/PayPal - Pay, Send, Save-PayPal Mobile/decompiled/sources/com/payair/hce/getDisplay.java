package com.payair.hce;

/* loaded from: classes4.dex */
public final class getDisplay extends com.payair.hce.setTextSelectHandleLeft {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        return ((((i * 50) + (i2 * (-97))) + (((~(i4 | i5)) | (~(i4 | i))) * 98)) + ((((~(i5 | (~i))) | i4) | (~(i | i3))) * (-49))) + (((~(i | i2)) | (~(i3 | i4))) * 49) != 1 ? valueOf(objArr) : writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 100) + ((i & 100) << 1)) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) obj;
            java.lang.String str = (java.lang.String) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext}, -669572456, 669572456, java.lang.System.identityHashCode(isuicontext));
            com.payair.hce.setSelection setselection = (com.payair.hce.setSelection) com.payair.hce.setTextSelectHandleLeft.DigitizedCardProfile(new java.lang.Object[0], 1993028063, -1993028063, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{setselection, str}, 1396003107, -1396003102, java.lang.System.identityHashCode(setselection));
            return null;
        }
        com.payair.hce.isUiContext isuicontext2 = (com.payair.hce.isUiContext) obj;
        java.lang.String str2 = (java.lang.String) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext2}, -669572456, 669572456, java.lang.System.identityHashCode(isuicontext2));
        com.payair.hce.setSelection setselection2 = (com.payair.hce.setSelection) com.payair.hce.setTextSelectHandleLeft.DigitizedCardProfile(new java.lang.Object[0], 1993028063, -1993028063, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{setselection2, str2}, 1396003107, -1396003102, java.lang.System.identityHashCode(setselection2));
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = (i & 45) + (i | 45);
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    @Override // com.payair.hce.setTextSelectHandleLeft, com.payair.hce.setElegantTextHeight
    public final java.lang.Boolean writeReplace() {
        return (java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 558762981, -558762981, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj}, 1034156900, -1034156899, java.lang.System.identityHashCode(this));
    }
}
