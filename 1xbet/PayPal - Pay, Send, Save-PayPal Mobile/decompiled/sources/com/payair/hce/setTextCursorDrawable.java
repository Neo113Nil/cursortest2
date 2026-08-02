package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextCursorDrawable extends com.payair.hce.setTextSelectHandleLeft {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = DigitizedCardProfile;
        int i2 = (i | 29) << 1;
        int i3 = -(i ^ 29);
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            com.payair.hce.setSelection DigitizedCardProfile2 = DigitizedCardProfile();
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2, ((java.lang.Class) obj).getName()}, 1396003107, -1396003102, java.lang.System.identityHashCode(DigitizedCardProfile2));
            return null;
        }
        com.payair.hce.setSelection DigitizedCardProfile3 = DigitizedCardProfile();
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile3, ((java.lang.Class) obj).getName()}, 1396003107, -1396003102, java.lang.System.identityHashCode(DigitizedCardProfile3));
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        valueOf(new java.lang.Object[]{this, obj}, 1207391414, -1207391414, java.lang.System.identityHashCode(this));
    }
}
