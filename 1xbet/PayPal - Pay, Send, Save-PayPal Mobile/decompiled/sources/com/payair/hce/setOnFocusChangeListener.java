package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnFocusChangeListener {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int getAid;
    private final java.lang.String AlternateContactlessPaymentDataJson;
    private final java.lang.String DigitizedCardProfile;
    private final byte[] IccPrivateKeyCrtComponentsJson;
    private final java.lang.String valueOf;
    private final java.lang.String values;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i | i2);
        int i6 = (i * 471) + (i2 * 471) + ((i2 | i) * (-470)) + (((~((~i) | i4)) | (~(i4 | i3)) | i5) * (-470)) + (((~(i | i4 | i3)) | i5) * 470);
        if (i6 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 != 2) {
            return i6 != 3 ? values(objArr) : valueOf(objArr);
        }
        com.payair.hce.setOnFocusChangeListener setonfocuschangelistener = (com.payair.hce.setOnFocusChangeListener) objArr[0];
        int i7 = getAid;
        SdkCoreAlternateContactlessPaymentDataImpl = ((i7 ^ 49) + ((i7 & 49) << 1)) % 128;
        byte[] bArr = setonfocuschangelistener.IccPrivateKeyCrtComponentsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = ((-2) - (~(i7 + 102))) % 128;
        return bArr;
    }

    public setOnFocusChangeListener(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, byte[] bArr2) {
        this.values = str;
        this.DigitizedCardProfile = str2;
        this.AlternateContactlessPaymentDataJson = str3;
        this.valueOf = str4;
        this.writeReplace = bArr;
        this.IccPrivateKeyCrtComponentsJson = bArr2;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnFocusChangeListener setonfocuschangelistener = (com.payair.hce.setOnFocusChangeListener) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i | 117) << 1;
        int i3 = -(i ^ 117);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getAid = i4 % 128;
        java.lang.String str = setonfocuschangelistener.values;
        if (i4 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnFocusChangeListener setonfocuschangelistener = (com.payair.hce.setOnFocusChangeListener) objArr[0];
        int i = getAid;
        int i2 = i ^ 103;
        int i3 = ((i & 103) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 & i4) + (i3 | i4)) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i5;
        java.lang.String str = setonfocuschangelistener.DigitizedCardProfile;
        int i6 = i5 & 109;
        int i7 = -(-((i5 ^ 109) | i6));
        int i8 = (i6 & i7) + (i6 | i7);
        getAid = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnFocusChangeListener setonfocuschangelistener = (com.payair.hce.setOnFocusChangeListener) objArr[0];
        int i = getAid;
        int i2 = i & 25;
        int i3 = i2 + ((i ^ 25) | i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        byte[] bArr = setonfocuschangelistener.writeReplace;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final byte[] valueOf() {
        return (byte[]) writeReplace(new java.lang.Object[]{this}, 1356603500, -1356603498, java.lang.System.identityHashCode(this));
    }

    public final byte[] writeReplace() {
        return (byte[]) writeReplace(new java.lang.Object[]{this}, 2114270745, -2114270745, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -278639431, 278639434, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 59081021, -59081020, java.lang.System.identityHashCode(this));
    }
}
