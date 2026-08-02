package com.payair.hce;

/* loaded from: classes4.dex */
class setForegroundGravity extends com.payair.hce.communication.JsonResponse {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "missingInfo")
    private java.util.List<java.lang.String> AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "userId")
    private java.lang.Long valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "kd")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = (i * 784) + (i2 * (-782)) + ((~i2) * (-783)) + ((~(i4 | i5 | i2)) * (-783)) + (((~(i2 | i5)) | i4) * 783);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 != 2) {
            return writeReplace(objArr);
        }
        com.payair.hce.setForegroundGravity setforegroundgravity = (com.payair.hce.setForegroundGravity) objArr[0];
        int i7 = values;
        int i8 = i7 & 39;
        int i9 = i7 | 39;
        int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        DigitizedCardProfile = i10;
        java.lang.Long l = setforegroundgravity.valueOf;
        values = ((i10 & 107) + (i10 | 107)) % 128;
        return l;
    }

    setForegroundGravity() {
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setForegroundGravity setforegroundgravity = (com.payair.hce.setForegroundGravity) objArr[0];
        int i = values;
        int i2 = i & 107;
        int i3 = i | 107;
        int i4 = (i2 & i3) + (i3 | i2);
        DigitizedCardProfile = i4 % 128;
        java.lang.String str = setforegroundgravity.writeReplace;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setForegroundGravity setforegroundgravity = (com.payair.hce.setForegroundGravity) objArr[0];
        int i = values;
        int i2 = i & 113;
        int i3 = -(-(i | 113));
        DigitizedCardProfile = ((i2 & i3) + (i2 | i3)) % 128;
        java.util.List<java.lang.String> list = setforegroundgravity.AlternateContactlessPaymentDataJson;
        int i4 = i & 25;
        int i5 = (i4 - (~((i ^ 25) | i4))) - 1;
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseVerifyLoginOrRegister{userId='");
        sb.append(this.valueOf);
        sb.append("', kd='");
        sb.append(this.writeReplace);
        sb.append("', missingInfo=");
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        DigitizedCardProfile = (values + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return obj;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public boolean isDataValid() {
        int i = (DigitizedCardProfile + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        values = i;
        int i2 = i & 33;
        int i3 = (i ^ 33) | i2;
        DigitizedCardProfile = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return true;
    }

    final java.util.List values() {
        return (java.util.List) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1200004522, -1200004521, java.lang.System.identityHashCode(this));
    }

    final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1719230823, -1719230823, java.lang.System.identityHashCode(this));
    }

    final java.lang.Long DigitizedCardProfile() {
        return (java.lang.Long) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 774624060, -774624058, java.lang.System.identityHashCode(this));
    }
}
