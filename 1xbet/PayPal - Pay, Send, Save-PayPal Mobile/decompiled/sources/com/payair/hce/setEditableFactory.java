package com.payair.hce;

/* loaded from: classes4.dex */
public final class setEditableFactory implements com.payair.hce.setTextColor {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private final int AlternateContactlessPaymentDataJson;
    private final com.payair.hce.setHighlights writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        return ((((i * (-317)) + (i2 * 319)) + (((~(i2 | ((~i3) | i))) | (~((i4 | i5) | i3))) * (-318))) + (((~(i | i5)) | (~(i | i3))) * (-318))) + (((~(i4 | i3)) | i5) * 318) != 1 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    setEditableFactory(int i, com.payair.hce.setHighlights sethighlights) {
        this.AlternateContactlessPaymentDataJson = i;
        this.writeReplace = sethighlights;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setEditableFactory seteditablefactory = (com.payair.hce.setEditableFactory) objArr[0];
        com.payair.hce.setSearchResultHighlights setsearchresulthighlights = new com.payair.hce.setSearchResultHighlights(seteditablefactory.AlternateContactlessPaymentDataJson, seteditablefactory.writeReplace.values());
        int i = values;
        int i2 = (((i | 6) << 1) - (i ^ 6)) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return setsearchresulthighlights;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setEditableFactory seteditablefactory = (com.payair.hce.setEditableFactory) objArr[0];
        int i = values;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        DigitizedCardProfile = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                com.payair.hce.setEms setems = (com.payair.hce.setEms) valueOf(new java.lang.Object[]{seteditablefactory}, -890101467, 890101467, java.lang.System.identityHashCode(seteditablefactory));
                int i3 = DigitizedCardProfile;
                int i4 = i3 & 33;
                int i5 = -(-((i3 ^ 33) | i4));
                values = ((i4 & i5) + (i5 | i4)) % 128;
                return setems;
            }
            throw new java.lang.NullPointerException();
        } catch (java.io.IOException e) {
            throw new com.payair.hce.setLines(e.getMessage(), e);
        }
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{this}, -992258141, 992258142, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{this}, -890101467, 890101467, java.lang.System.identityHashCode(this));
    }
}
