package com.payair.hce;

/* loaded from: classes4.dex */
public final class isRestrictedUserProfile extends java.lang.IllegalStateException {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;
    private java.lang.Throwable valueOf;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public isRestrictedUserProfile(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.valueOf = th;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.isRestrictedUserProfile isrestricteduserprofile = (com.payair.hce.isRestrictedUserProfile) objArr[0];
        int i = values;
        int i2 = i & 3;
        int i3 = (i ^ 3) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        AlternateContactlessPaymentDataJson = i4 % 128;
        java.lang.Throwable th = isrestricteduserprofile.valueOf;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i & 11;
        int i6 = ((((i ^ 11) | i5) << 1) - (~(-((i | 11) & (~i5))))) - 1;
        AlternateContactlessPaymentDataJson = i6 % 128;
        if (i6 % 2 == 0) {
            return th;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return (java.lang.Throwable) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 444093164, -444093164, java.lang.System.identityHashCode(this));
    }
}
