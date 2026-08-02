package com.payair.hce;

/* loaded from: classes4.dex */
public final class ReplenishResponseEncrypted {
    private static int values = 0;
    private static int writeReplace = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "content")
    private com.payair.hce.getIccKek AlternateContactlessPaymentDataJson = new com.payair.hce.getIccKek();

    @com.payair.hce.setSelectionFromTop(valueOf = "id")
    private java.lang.String DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i2;
        int i6 = (i * 758) + (i2 * (-756)) + ((i | i4) * (-757)) + ((~(i5 | i | i3)) * 1514) + (((~((~i) | i5)) | (~(i4 | i5)) | (~(i2 | i | i3))) * 757);
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? valueOf(objArr) : DigitizedCardProfile(objArr) : values(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = (com.payair.hce.ReplenishResponseEncrypted) objArr[0];
        int i = values;
        int i2 = (i & (-88)) | ((~i) & 87);
        int i3 = (i & 87) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        writeReplace = i4 % 128;
        java.lang.String str = replenishResponseEncrypted.DigitizedCardProfile;
        if (i4 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = (com.payair.hce.ReplenishResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = writeReplace;
        int i2 = i & 35;
        int i3 = -(-((i ^ 35) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            replenishResponseEncrypted.DigitizedCardProfile = str.toUpperCase();
            int i5 = values;
            int i6 = i5 ^ 93;
            writeReplace = ((((i5 & 93) | i6) << 1) - i6) % 128;
            return null;
        }
        replenishResponseEncrypted.DigitizedCardProfile = str.toUpperCase();
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = (com.payair.hce.ReplenishResponseEncrypted) objArr[0];
        int i = writeReplace;
        int i2 = i & 59;
        int i3 = -(-(i | 59));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        values = i4 % 128;
        com.payair.hce.getIccKek geticckek = replenishResponseEncrypted.AlternateContactlessPaymentDataJson;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i & 119;
        values = (((i | 119) & (~i5)) + (i5 << 1)) % 128;
        return geticckek;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = (com.payair.hce.ReplenishResponseEncrypted) objArr[0];
        com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) objArr[1];
        int i = writeReplace;
        int i2 = ((i | 33) << 1) - (i ^ 33);
        values = i2 % 128;
        if (i2 % 2 == 0) {
            replenishResponseEncrypted.AlternateContactlessPaymentDataJson = geticckek;
            return null;
        }
        replenishResponseEncrypted.AlternateContactlessPaymentDataJson = geticckek;
        throw null;
    }

    public final void writeReplace(com.payair.hce.getIccKek geticckek) {
        writeReplace(new java.lang.Object[]{this, geticckek}, 155339212, -155339212, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getIccKek values() {
        return (com.payair.hce.getIccKek) writeReplace(new java.lang.Object[]{this}, 1219330914, -1219330912, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, -2115919000, 2115919003, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -273286356, 273286357, java.lang.System.identityHashCode(this));
    }
}
