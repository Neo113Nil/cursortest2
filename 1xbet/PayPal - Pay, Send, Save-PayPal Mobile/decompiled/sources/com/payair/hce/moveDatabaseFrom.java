package com.payair.hce;

/* loaded from: classes4.dex */
public class moveDatabaseFrom extends com.payair.hce.fileList {
    private static int valueOf = 1;
    private static int writeReplace;
    private int AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public moveDatabaseFrom(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
        this.AlternateContactlessPaymentDataJson = i;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.moveDatabaseFrom movedatabasefrom = (com.payair.hce.moveDatabaseFrom) objArr[0];
        int i = valueOf;
        int i2 = ((i ^ 55) | (i & 55)) << 1;
        int i3 = -((i & (-56)) | ((~i) & 55));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        writeReplace = i4;
        int i5 = movedatabasefrom.AlternateContactlessPaymentDataJson;
        int i6 = i4 + 47;
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Integer.valueOf(i5);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.fileList
    public java.lang.String toString() {
        int i = writeReplace;
        int i2 = ((i ^ 41) | (i & 41)) << 1;
        int i3 = -((i & (-42)) | ((~i) & 41));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        valueOf = i4;
        int i5 = i4 & 95;
        int i6 = (i4 | 95) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        writeReplace = i8 % 128;
        if (i8 % 2 == 0) {
            return "moveDatabaseFrom";
        }
        throw new java.lang.ArithmeticException();
    }

    public final int values() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1849555291, -1849555291, java.lang.System.identityHashCode(this))).intValue();
    }
}
