package com.payair.hce;

/* loaded from: classes4.dex */
public final class component5 extends java.lang.Exception {
    private static int values = 0;
    private static int writeReplace = 1;
    private int AlternateContactlessPaymentDataJson;
    private int DigitizedCardProfile;
    private java.lang.String valueOf;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public component5(java.lang.String str) {
        super(str);
        this.DigitizedCardProfile = 1105;
        this.AlternateContactlessPaymentDataJson = 1301;
        this.valueOf = str;
    }

    public component5(int i, java.lang.String str) {
        super(str);
        this.DigitizedCardProfile = 1105;
        this.AlternateContactlessPaymentDataJson = i;
        this.valueOf = str;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.component5 component5Var = (com.payair.hce.component5) objArr[0];
        int i = writeReplace + 99;
        values = i % 128;
        java.lang.String str = component5Var.valueOf;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 720494324, -720494324, java.lang.System.identityHashCode(this));
    }
}
