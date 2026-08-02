package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCompoundDrawableTintBlendMode implements com.payair.hce.setOnItemClickListener {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;
    private java.lang.Class values;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (com.payair.hce.setCompoundDrawableTintBlendMode) objArr[0];
        int i4 = writeReplace;
        AlternateContactlessPaymentDataJson = (i4 + 113) % 128;
        java.lang.Class cls = setcompounddrawabletintblendmode.values;
        int i5 = i4 ^ 105;
        int i6 = ((i4 & 105) | i5) << 1;
        int i7 = -i5;
        AlternateContactlessPaymentDataJson = ((i6 & i7) + (i6 | i7)) % 128;
        return cls;
    }

    public setCompoundDrawableTintBlendMode(java.lang.Class cls) {
        this.values = cls;
    }

    @Override // com.payair.hce.setOnItemClickListener
    public final java.lang.Class AlternateContactlessPaymentDataJson() {
        return (java.lang.Class) values(new java.lang.Object[]{this}, 749220277, -749220277, java.lang.System.identityHashCode(this));
    }
}
