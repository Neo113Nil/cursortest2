package com.payair.hce;

/* loaded from: classes4.dex */
public final class uidHasPackageName extends java.lang.IllegalStateException {
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = 1;
    private java.lang.Throwable AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public uidHasPackageName(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.AlternateContactlessPaymentDataJson = th;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.uidHasPackageName uidhaspackagename = (com.payair.hce.uidHasPackageName) objArr[0];
        int i = writeReplace;
        int i2 = ((((i | 82) << 1) - (i ^ 82)) - 1) % 128;
        DigitizedCardProfile = i2;
        java.lang.Throwable th = uidhaspackagename.AlternateContactlessPaymentDataJson;
        int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return th;
        }
        throw null;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return (java.lang.Throwable) valueOf(new java.lang.Object[]{this}, -1317118488, 1317118488, java.lang.System.identityHashCode(this));
    }
}
