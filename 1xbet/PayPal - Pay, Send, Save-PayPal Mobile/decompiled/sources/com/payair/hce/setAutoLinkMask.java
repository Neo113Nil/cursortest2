package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAutoLinkMask extends java.io.IOException {
    private static int valueOf = 1;
    private static int values;
    private java.lang.Throwable DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public setAutoLinkMask(java.lang.String str) {
        super(str);
    }

    public setAutoLinkMask(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.DigitizedCardProfile = th;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setAutoLinkMask setautolinkmask = (com.payair.hce.setAutoLinkMask) objArr[0];
        int i = valueOf;
        int i2 = (i & 101) + (i | 101);
        values = i2 % 128;
        java.lang.Throwable th = setautolinkmask.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            return th;
        }
        throw null;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return (java.lang.Throwable) writeReplace(new java.lang.Object[]{this}, -433935728, 433935728, java.lang.System.identityHashCode(this));
    }
}
