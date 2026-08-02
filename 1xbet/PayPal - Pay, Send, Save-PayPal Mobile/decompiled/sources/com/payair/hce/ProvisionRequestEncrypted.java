package com.payair.hce;

/* loaded from: classes10.dex */
public final class ProvisionRequestEncrypted {
    private static int valueOf = 1;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "recordValue")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "recordNumber")
    private java.lang.Byte DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "sfi")
    private java.lang.Byte values;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 980) + (i2 * (-978)) + ((~(i4 | i5)) * 979) + ((i | i3) * (-979)) + (((~(i | i5)) | (~(i4 | i3))) * 979);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 == 2) {
            return writeReplace(objArr);
        }
        if (i6 == 3) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 == 4) {
            return valueOf(objArr);
        }
        if (i6 == 5) {
            return values(objArr);
        }
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = (com.payair.hce.ProvisionRequestEncrypted) objArr[0];
        java.lang.Byte b = (java.lang.Byte) objArr[1];
        int i7 = writeReplace;
        int i8 = ((i7 & 71) + (i7 | 71)) % 128;
        valueOf = i8;
        provisionRequestEncrypted.values = b;
        writeReplace = (((((i8 ^ 61) | (i8 & 61)) << 1) - (~(-((i8 & (-62)) | ((~i8) & 61))))) - 1) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = (com.payair.hce.ProvisionRequestEncrypted) objArr[0];
        int i = valueOf;
        int i2 = i & 71;
        int i3 = i | 71;
        int i4 = (i2 & i3) + (i2 | i3);
        writeReplace = i4 % 128;
        java.lang.Byte b = provisionRequestEncrypted.DigitizedCardProfile;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i & 19;
        writeReplace = (((i | 19) & (~i5)) + (i5 << 1)) % 128;
        return b;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = (com.payair.hce.ProvisionRequestEncrypted) objArr[0];
        java.lang.Byte b = (java.lang.Byte) objArr[1];
        int i = valueOf;
        int i2 = (-2) - (~(((i | 58) << 1) - (i ^ 58)));
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            provisionRequestEncrypted.DigitizedCardProfile = b;
            return null;
        }
        provisionRequestEncrypted.DigitizedCardProfile = b;
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = (com.payair.hce.ProvisionRequestEncrypted) objArr[0];
        int i = valueOf;
        int i2 = ((((i ^ 83) | (i & 83)) << 1) - ((i & (-84)) | ((~i) & 83))) % 128;
        writeReplace = i2;
        java.lang.Byte b = provisionRequestEncrypted.values;
        int i3 = ((i2 | 113) << 1) - (i2 ^ 113);
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return b;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = (com.payair.hce.ProvisionRequestEncrypted) objArr[0];
        int i = valueOf;
        int i2 = i ^ 51;
        int i3 = ((i & 51) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        writeReplace = i5 % 128;
        java.lang.String str = provisionRequestEncrypted.AlternateContactlessPaymentDataJson;
        if (i5 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = (com.payair.hce.ProvisionRequestEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = valueOf;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            provisionRequestEncrypted.AlternateContactlessPaymentDataJson = str.toUpperCase();
            int i5 = valueOf;
            int i6 = (i5 ^ 117) + ((i5 & 117) << 1);
            writeReplace = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        provisionRequestEncrypted.AlternateContactlessPaymentDataJson = str.toUpperCase();
        throw null;
    }

    public final void valueOf(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -837618313, 837618318, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 1093327563, -1093327559, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.Byte b) {
        values(new java.lang.Object[]{this, b}, -1806533381, 1806533381, java.lang.System.identityHashCode(this));
    }

    public final java.lang.Byte valueOf() {
        return (java.lang.Byte) values(new java.lang.Object[]{this}, -5385263, 5385266, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.Byte b) {
        values(new java.lang.Object[]{this, b}, -1812962118, 1812962120, java.lang.System.identityHashCode(this));
    }

    public final java.lang.Byte DigitizedCardProfile() {
        return (java.lang.Byte) values(new java.lang.Object[]{this}, -2006065438, 2006065439, java.lang.System.identityHashCode(this));
    }
}
