package com.payair.hce;

/* loaded from: classes4.dex */
class setForegroundTintMode extends com.payair.hce.communication.JsonResponse {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "autoStartToken")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "redirectUrl")
    private java.lang.String valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE)
    private java.lang.String values;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return ((((i * 628) + (i2 * 628)) + (((i2 | i3) | (~i)) * (-627))) + (((~((~i2) | i3)) | i) * (-627))) + (((~(i | i3)) | (~(i2 | (~i3)))) * 627) != 1 ? values(objArr) : DigitizedCardProfile(objArr);
    }

    setForegroundTintMode() {
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setForegroundTintMode setforegroundtintmode = (com.payair.hce.setForegroundTintMode) objArr[0];
        int i = writeReplace;
        int i2 = i & 43;
        int i3 = ((i ^ 43) | i2) << 1;
        int i4 = -((i | 43) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AlternateContactlessPaymentDataJson = i5 % 128;
        java.lang.String str = setforegroundtintmode.values;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setForegroundTintMode setforegroundtintmode = (com.payair.hce.setForegroundTintMode) objArr[0];
        int i = (writeReplace + 101) % 128;
        AlternateContactlessPaymentDataJson = i;
        java.lang.String str = setforegroundtintmode.DigitizedCardProfile;
        int i2 = i & 99;
        int i3 = ((i ^ 99) | i2) << 1;
        int i4 = -((i | 99) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        writeReplace = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseIdentify{reference='");
        sb.append(this.values);
        sb.append("', autoStartToken='");
        sb.append(this.DigitizedCardProfile);
        sb.append("', redirectUrl='");
        sb.append(this.valueOf);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 73;
        int i3 = (i ^ 73) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public boolean isDataValid() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & 67) + (i | 67);
        writeReplace = i2 % 128;
        return i2 % 2 == 0;
    }

    final java.lang.String values() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -226410896, 226410896, java.lang.System.identityHashCode(this));
    }

    final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -955328739, 955328740, java.lang.System.identityHashCode(this));
    }
}
