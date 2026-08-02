package com.payair.hce;

/* loaded from: classes4.dex */
public class setBackgroundTintList {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "gcmRegistrationId")
    private java.lang.String writeReplace;

    setBackgroundTintList() {
        this.writeReplace = null;
    }

    public setBackgroundTintList(java.lang.String str) {
        this.writeReplace = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestUpdateRNSInfo{gcmRegistrationId='");
        sb.append(this.writeReplace);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 107;
        int i3 = -(-(i | 107));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }
}
