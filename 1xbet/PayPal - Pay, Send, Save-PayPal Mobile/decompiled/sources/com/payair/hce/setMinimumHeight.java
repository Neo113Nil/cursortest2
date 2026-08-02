package com.payair.hce;

/* loaded from: classes4.dex */
final class setMinimumHeight {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    setMinimumHeight() {
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = values;
        int i2 = (((i | 121) << 1) - (~(-((i & (-122)) | ((~i) & 121))))) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i3 = AlternateContactlessPaymentDataJson + 71;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Long.valueOf(currentTimeMillis);
        }
        throw new java.lang.ArithmeticException();
    }

    static java.lang.Long values() {
        return (java.lang.Long) values(new java.lang.Object[0], 2003072114, -2003072114, (int) java.lang.System.currentTimeMillis());
    }
}
