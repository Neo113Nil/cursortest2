package com.payair.hce;

/* loaded from: classes4.dex */
public final class setText implements com.payair.hce.setMinWidth {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;
    private com.payair.hce.setHighlights values;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i | i2);
        if ((i * (-375)) + (i2 * (-375)) + (((~((~i2) | i4)) | i3 | i5) * 376) + (((~(i | (~i3))) | i5) * (-376)) + (((~(i4 | i3)) | i2) * 376) != 1) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.setFreezesText setfreezestext = new com.payair.hce.setFreezesText(((com.payair.hce.setText) objArr[0]).values.values());
        int i6 = valueOf;
        AlternateContactlessPaymentDataJson = ((((i6 & (-32)) | ((~i6) & 31)) - (~((i6 & 31) << 1))) - 1) % 128;
        return setfreezestext;
    }

    setText(com.payair.hce.setHighlights sethighlights) {
        this.values = sethighlights;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setText settext = (com.payair.hce.setText) objArr[0];
        valueOf = (AlternateContactlessPaymentDataJson + 87) % 128;
        try {
            com.payair.hce.setEms setems = (com.payair.hce.setEms) valueOf(new java.lang.Object[]{settext}, 1597567112, -1597567111, java.lang.System.identityHashCode(settext));
            int i = valueOf;
            int i2 = (((i | 104) << 1) - (i ^ 104)) - 1;
            AlternateContactlessPaymentDataJson = i2 % 128;
            if (i2 % 2 != 0) {
                return setems;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{this}, 167926408, -167926408, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{this}, 1597567112, -1597567111, java.lang.System.identityHashCode(this));
    }
}
