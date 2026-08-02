package com.payair.hce;

/* loaded from: classes4.dex */
public final class getRemoteContext extends com.payair.hce.showErrorNotification {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int getAid = 1;
    private java.math.BigInteger AlternateContactlessPaymentDataJson;
    private java.math.BigInteger DigitizedCardProfile;
    private java.math.BigInteger valueOf;
    private java.math.BigInteger values;
    private java.math.BigInteger writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i2 | i4;
        int i7 = (i * (-751)) + (i2 * (-751)) + (((~(i4 | i5)) | (~(i4 | i3))) * 1504) + ((~(i3 | i6)) * (-1504)) + (((~(i | i5)) | (~i6)) * 752);
        if (i7 == 1) {
            com.payair.hce.getRemoteContext getremotecontext = (com.payair.hce.getRemoteContext) objArr[0];
            int i8 = getAid;
            int i9 = (((i8 & 26) + (i8 | 26)) - 1) % 128;
            IccPrivateKeyCrtComponentsJson = i9;
            java.math.BigInteger bigInteger = getremotecontext.DigitizedCardProfile;
            getAid = (((i9 & 58) + (i9 | 58)) - 1) % 128;
            return bigInteger;
        }
        if (i7 == 2) {
            com.payair.hce.getRemoteContext getremotecontext2 = (com.payair.hce.getRemoteContext) objArr[0];
            int i10 = IccPrivateKeyCrtComponentsJson;
            getAid = (i10 + 35) % 128;
            java.math.BigInteger bigInteger2 = getremotecontext2.writeReplace;
            getAid = (((i10 | 81) << 1) - (i10 ^ 81)) % 128;
            return bigInteger2;
        }
        if (i7 == 3) {
            return writeReplace(objArr);
        }
        if (i7 == 4) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.getRemoteContext getremotecontext3 = (com.payair.hce.getRemoteContext) objArr[0];
        int i11 = IccPrivateKeyCrtComponentsJson;
        int i12 = ((i11 ^ 5) + ((i11 & 5) << 1)) % 128;
        getAid = i12;
        java.math.BigInteger bigInteger3 = getremotecontext3.values;
        int i13 = (i12 & (-74)) | ((~i12) & 73);
        int i14 = -(-((i12 & 73) << 1));
        IccPrivateKeyCrtComponentsJson = ((i13 & i14) + (i13 | i14)) % 128;
        return bigInteger3;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getRemoteContext getremotecontext = (com.payair.hce.getRemoteContext) objArr[0];
        int i = (IccPrivateKeyCrtComponentsJson + 105) % 128;
        getAid = i;
        java.math.BigInteger bigInteger = getremotecontext.AlternateContactlessPaymentDataJson;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getRemoteContext getremotecontext = (com.payair.hce.getRemoteContext) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        getAid = ((((i | 89) << 1) - (~(-(i ^ 89)))) - 1) % 128;
        java.math.BigInteger bigInteger = getremotecontext.valueOf;
        int i2 = i + 88;
        int i3 = (~i2) + (i2 << 1);
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    public final java.math.BigInteger RecordsJson() {
        return (java.math.BigInteger) DigitizedCardProfile(new java.lang.Object[]{this}, 1047405534, -1047405530, java.lang.System.identityHashCode(this));
    }

    public final java.math.BigInteger getAid() {
        return (java.math.BigInteger) DigitizedCardProfile(new java.lang.Object[]{this}, 1357454054, -1357454054, java.lang.System.identityHashCode(this));
    }

    public final java.math.BigInteger SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.math.BigInteger) DigitizedCardProfile(new java.lang.Object[]{this}, -1481790620, 1481790622, java.lang.System.identityHashCode(this));
    }

    public final java.math.BigInteger AlternateContactlessPaymentDataJson() {
        return (java.math.BigInteger) DigitizedCardProfile(new java.lang.Object[]{this}, 1302316443, -1302316440, java.lang.System.identityHashCode(this));
    }

    public final java.math.BigInteger writeReplace() {
        return (java.math.BigInteger) DigitizedCardProfile(new java.lang.Object[]{this}, 1300626065, -1300626064, java.lang.System.identityHashCode(this));
    }
}
