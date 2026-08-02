package com.payair.hce;

/* loaded from: classes4.dex */
public final class updateServiceGroup extends com.payair.hce.setTextSelectHandleLeft {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        if ((i * 530) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO + (i2 * 530) + (((~((~i3) | i)) | (~(i | i2))) * 529) + (((~(i | i3)) | (~i2)) * 529) != 1) {
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 41) % 128;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            int i4 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = ((((i4 ^ 53) | (i4 & 53)) << 1) - ((i4 & (-54)) | ((~i4) & 53))) % 128;
            return bool;
        }
        java.lang.Object obj = objArr[1];
        int i5 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (((i5 & 108) + (i5 | 108)) - 1) % 128;
        java.lang.String writeReplace = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) obj).writeReplace();
        com.payair.hce.setSelection setselection = (com.payair.hce.setSelection) com.payair.hce.setTextSelectHandleLeft.DigitizedCardProfile(new java.lang.Object[0], 1993028063, -1993028063, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{setselection, writeReplace}, 1396003107, -1396003102, java.lang.System.identityHashCode(setselection));
        int i6 = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = ((((i6 & (-24)) | ((~i6) & 23)) - (~((i6 & 23) << 1))) - 1) % 128;
        return null;
    }

    @Override // com.payair.hce.setTextSelectHandleLeft, com.payair.hce.setElegantTextHeight
    public final java.lang.Boolean writeReplace() {
        return (java.lang.Boolean) values(new java.lang.Object[]{this}, -160119103, 160119103, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        values(new java.lang.Object[]{this, obj}, 736749297, -736749296, java.lang.System.identityHashCode(this));
    }
}
