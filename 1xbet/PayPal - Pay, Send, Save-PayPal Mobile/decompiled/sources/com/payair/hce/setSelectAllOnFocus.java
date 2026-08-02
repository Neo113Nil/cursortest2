package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSelectAllOnFocus implements com.payair.hce.setMinWidth {
    private static int DigitizedCardProfile = 1;
    private static int writeReplace;
    private com.payair.hce.setHighlights valueOf;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        return ((((i * 784) + (i2 * (-782))) + ((~i2) * (-783))) + ((~((i4 | i5) | i2)) * (-783))) + (((~(i2 | i5)) | i4) * 783) != 1 ? DigitizedCardProfile(objArr) : writeReplace(objArr);
    }

    setSelectAllOnFocus(com.payair.hce.setHighlights sethighlights) {
        this.valueOf = sethighlights;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = new com.payair.hce.setCustomInsertionActionModeCallback(((com.payair.hce.setSelectAllOnFocus) objArr[0]).valueOf.values());
        int i = DigitizedCardProfile;
        int i2 = (i & 32) + (i | 32);
        int i3 = (~i2) + (i2 << 1);
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            return setcustominsertionactionmodecallback;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setSelectAllOnFocus setselectallonfocus = (com.payair.hce.setSelectAllOnFocus) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 117;
        int i3 = ((i | 117) & (~i2)) + (i2 << 1);
        writeReplace = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                return (com.payair.hce.setEms) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselectallonfocus}, -866142802, 866142803, java.lang.System.identityHashCode(setselectallonfocus));
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        return (com.payair.hce.setEms) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -193002506, 193002506, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        return (com.payair.hce.setEms) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -866142802, 866142803, java.lang.System.identityHashCode(this));
    }
}
