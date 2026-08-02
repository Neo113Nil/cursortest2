package com.payair.hce;

/* loaded from: classes4.dex */
public final class registerDeviceIdChangeListener extends com.payair.hce.setTextSelectHandleLeft {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (~(i4 | (~i2))) | (~(i4 | i3));
        return ((((i * (-495)) + (i2 * (-495))) + (i5 * 992)) + (((~((i | (~i3)) | i2)) | i5) * (-496))) + ((i2 | i3) * 496) != 1 ? values(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = DigitizedCardProfile + 105;
        valueOf = i % 128;
        if (i % 2 != 0) {
            byte[] bArr = new byte[1];
            bArr[1] = ((java.lang.Byte) obj).byteValue();
            java.lang.String DigitizedCardProfile2 = com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile(bArr);
            com.payair.hce.setSelection setselection = (com.payair.hce.setSelection) com.payair.hce.setTextSelectHandleLeft.DigitizedCardProfile(new java.lang.Object[0], 1993028063, -1993028063, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{setselection, DigitizedCardProfile2.toUpperCase(java.util.Locale.ENGLISH)}, 1396003107, -1396003102, java.lang.System.identityHashCode(setselection));
        } else {
            java.lang.String DigitizedCardProfile3 = com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile(new byte[]{((java.lang.Byte) obj).byteValue()});
            com.payair.hce.setSelection setselection2 = (com.payair.hce.setSelection) com.payair.hce.setTextSelectHandleLeft.DigitizedCardProfile(new java.lang.Object[0], 1993028063, -1993028063, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{setselection2, DigitizedCardProfile3.toUpperCase(java.util.Locale.ENGLISH)}, 1396003107, -1396003102, java.lang.System.identityHashCode(setselection2));
        }
        int i2 = DigitizedCardProfile;
        int i3 = (i2 ^ 90) + ((i2 & 90) << 1);
        int i4 = (~i3) + (i3 << 1);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 45;
        int i3 = (i | 45) & (~i2);
        int i4 = i2 << 1;
        valueOf = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i5 = valueOf;
        int i6 = (-2) - (~((i5 ^ 42) + ((i5 & 42) << 1)));
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    @Override // com.payair.hce.setTextSelectHandleLeft, com.payair.hce.setElegantTextHeight
    public final java.lang.Boolean writeReplace() {
        return (java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -39503769, 39503769, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        valueOf(new java.lang.Object[]{this, obj}, -146418980, 146418981, java.lang.System.identityHashCode(this));
    }
}
