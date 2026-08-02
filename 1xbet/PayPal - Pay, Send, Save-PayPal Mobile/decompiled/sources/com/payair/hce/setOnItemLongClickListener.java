package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnItemLongClickListener<T> {
    private static int valueOf = 1;
    private static int values;
    private T AlternateContactlessPaymentDataJson;
    private java.lang.Class<? extends T> DigitizedCardProfile;

    public setOnItemLongClickListener(java.lang.Class<? extends T> cls) {
        this.DigitizedCardProfile = cls;
    }

    public final T valueOf() throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        T t;
        synchronized (this) {
            int i = valueOf;
            int i2 = (((((i ^ 39) | (i & 39)) << 1) - (~(-((i & (-40)) | ((~i) & 39))))) - 1) % 128;
            values = i2;
            if (this.AlternateContactlessPaymentDataJson == null) {
                int i3 = i2 ^ 3;
                int i4 = (i2 & 3) << 1;
                valueOf = ((i3 & i4) + (i3 | i4)) % 128;
                this.AlternateContactlessPaymentDataJson = this.DigitizedCardProfile.newInstance();
                int i5 = values;
                int i6 = (i5 & (-40)) | ((~i5) & 39);
                int i7 = -(-((i5 & 39) << 1));
                int i8 = (i6 & i7) + (i7 | i6);
                valueOf = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 / 2;
                }
            }
            t = this.AlternateContactlessPaymentDataJson;
            int i10 = valueOf;
            int i11 = i10 & 9;
            int i12 = (i10 ^ 9) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            values = i13 % 128;
            if (i13 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return t;
    }
}
