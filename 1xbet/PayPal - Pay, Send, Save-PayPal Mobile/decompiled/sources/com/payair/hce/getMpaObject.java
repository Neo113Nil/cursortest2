package com.payair.hce;

/* loaded from: classes4.dex */
public final class getMpaObject extends com.payair.hce.setMobilePinInitialConfiguration {
    private static int DigitizedCardProfile = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public getMpaObject(byte[] bArr) throws com.payair.hce.digitize {
        super(bArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = values + 109;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setMobilePinInitialConfiguration
    public final void AlternateContactlessPaymentDataJson() {
        writeReplace(new java.lang.Object[]{this}, 1652998338, -1652998338, java.lang.System.identityHashCode(this));
    }
}
