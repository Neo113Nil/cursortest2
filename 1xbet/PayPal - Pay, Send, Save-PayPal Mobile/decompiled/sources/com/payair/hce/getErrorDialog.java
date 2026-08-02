package com.payair.hce;

/* loaded from: classes4.dex */
public final class getErrorDialog implements com.payair.hce.getMCallbacksannotations {
    private static int valueOf = 0;
    private static int writeReplace = 1;
    private byte[] DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public getErrorDialog(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public getErrorDialog(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.DigitizedCardProfile = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getErrorDialog geterrordialog = (com.payair.hce.getErrorDialog) objArr[0];
        int i = writeReplace;
        int i2 = i ^ 41;
        int i3 = ((((i & 41) | i2) << 1) - (~(-i2))) - 1;
        int i4 = i3 % 128;
        valueOf = i4;
        byte[] bArr = geterrordialog.DigitizedCardProfile;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = i4 ^ 21;
        int i6 = -(-((i4 & 21) << 1));
        writeReplace = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
        return bArr;
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -363040252, 363040252, java.lang.System.identityHashCode(this));
    }
}
