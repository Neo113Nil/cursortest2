package com.payair.hce;

/* loaded from: classes4.dex */
class setClipBounds extends com.payair.hce.communication.JsonRequest {
    private static int valueOf = 1;
    private static int values;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "type")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE)
    private java.lang.String writeReplace;

    setClipBounds(java.lang.String str, java.lang.String str2) {
        this.writeReplace = str;
        this.AlternateContactlessPaymentDataJson = str2;
    }

    @Override // com.payair.hce.communication.JsonRequest
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestAuthenticate{reference='");
        sb.append(this.writeReplace);
        sb.append("'type='");
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = valueOf;
        int i2 = i & 41;
        values = ((((i ^ 41) | i2) << 1) - ((i | 41) & (~i2))) % 128;
        return obj;
    }
}
