package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRawInputType implements com.payair.hce.setMaxWidth {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;
    private com.payair.hce.setHighlights values;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~((~i2) | i3);
        if ((i * (-574)) + (i2 * (-574)) + (((~(i4 | i5)) | i6) * 1150) + (((~(i2 | i5)) | i6) * (-575)) + (((~(i | i5)) | (~(i4 | i3))) * 575) == 1) {
            return writeReplace(objArr);
        }
        com.payair.hce.setInputType setinputtype = new com.payair.hce.setInputType(((com.payair.hce.setRawInputType) objArr[0]).values.values());
        int i7 = writeReplace;
        int i8 = i7 | 19;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 19)) & i8);
        AlternateContactlessPaymentDataJson = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
        return setinputtype;
    }

    setRawInputType(com.payair.hce.setHighlights sethighlights) {
        this.values = sethighlights;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setRawInputType setrawinputtype = (com.payair.hce.setRawInputType) objArr[0];
        int i = writeReplace;
        int i2 = (i ^ 89) + ((i & 89) << 1);
        AlternateContactlessPaymentDataJson = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{setrawinputtype}, 1414152515, -1414152515, java.lang.System.identityHashCode(setrawinputtype));
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException e) {
            throw new com.payair.hce.setLines(e.getMessage(), e);
        }
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{this}, -90359825, 90359826, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{this}, 1414152515, -1414152515, java.lang.System.identityHashCode(this));
    }
}
