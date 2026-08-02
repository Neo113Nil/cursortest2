package com.payair.hce;

/* loaded from: classes10.dex */
class setForegroundTintBlendMode extends com.payair.hce.communication.JsonResponse {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE)
    private java.lang.String valueOf;

    setForegroundTintBlendMode() {
    }

    @Override // com.payair.hce.communication.JsonResponse
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseInitLogin{reference='");
        sb.append(this.valueOf);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = writeReplace;
        int i2 = ((((i ^ 13) | (i & 13)) << 1) - (~(-((i & (-14)) | ((~i) & 13))))) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public boolean isDataValid() {
        int i = writeReplace + 73;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        boolean z = i % 2 == 0;
        int i3 = i2 + 77;
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }
}
