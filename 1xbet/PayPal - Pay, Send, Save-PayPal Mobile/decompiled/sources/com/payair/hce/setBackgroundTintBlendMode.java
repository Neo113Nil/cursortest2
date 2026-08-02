package com.payair.hce;

/* loaded from: classes4.dex */
public class setBackgroundTintBlendMode extends com.payair.hce.communication.JsonRequest {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "signatures")
    java.util.ArrayList<com.payair.hce.setX> valueOf;

    public setBackgroundTintBlendMode(java.util.ArrayList<com.payair.hce.setX> arrayList) {
        this.valueOf = arrayList;
    }

    @Override // com.payair.hce.communication.JsonRequest
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestSignData{signatures=");
        sb.append(this.valueOf);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        values = (AlternateContactlessPaymentDataJson + 13) % 128;
        return obj;
    }
}
