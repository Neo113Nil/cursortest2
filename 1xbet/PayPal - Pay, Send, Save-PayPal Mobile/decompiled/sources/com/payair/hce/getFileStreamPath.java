package com.payair.hce;

/* loaded from: classes4.dex */
public final class getFileStreamPath extends com.payair.hce.deleteFile {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;
    private com.payair.hce.getErrors values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        return ((((i * (-344)) + (i2 * (-344))) + (((~i6) | (~(i4 | i3))) * 345)) + (((~(i | i5)) | (~((~i3) | i4))) * 345)) + ((~(i6 | i3)) * 345) != 1 ? values(objArr) : writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getFileStreamPath getfilestreampath = (com.payair.hce.getFileStreamPath) objArr[0];
        int i = writeReplace;
        int i2 = (((i | 52) << 1) - (i ^ 52)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        java.lang.Class<?> cls = getfilestreampath.getClass();
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String simpleName = cls.getSimpleName();
        int i3 = AlternateContactlessPaymentDataJson;
        int i4 = i3 & 115;
        int i5 = ((((i3 ^ 115) | i4) << 1) - (~(-((i3 | 115) & (~i4))))) - 1;
        writeReplace = i5 % 128;
        if (i5 % 2 != 0) {
            return simpleName;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getFileStreamPath getfilestreampath = (com.payair.hce.getFileStreamPath) objArr[0];
        int i = writeReplace;
        int i2 = i & 33;
        int i3 = (i2 - (~(-(-((i ^ 33) | i2))))) - 1;
        int i4 = i3 % 128;
        AlternateContactlessPaymentDataJson = i4;
        com.payair.hce.getErrors geterrors = getfilestreampath.values;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = i4 + 37;
        writeReplace = i5 % 128;
        if (i5 % 2 != 0) {
            return geterrors;
        }
        throw null;
    }

    public final com.payair.hce.getErrors DigitizedCardProfile() {
        return (com.payair.hce.getErrors) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2145505733, -2145505733, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 847226295, -847226294, java.lang.System.identityHashCode(this));
    }
}
