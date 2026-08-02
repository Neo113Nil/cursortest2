package com.zettle.sdk.feature.taptopay.core.refunds.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayloadParser;", "Lcom/zettle/sdk/commons/network/Response$Parser;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "", "originalAmount", "<init>", "(J)V", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundPayloadParser implements com.zettle.sdk.commons.network.Response.Parser<com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    public RefundPayloadParser(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.zettle.sdk.commons.network.Response.Parser
    public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload parse(org.json.JSONObject json) {
        java.lang.String optString;
        java.lang.String optString2;
        java.lang.String optString3;
        java.lang.String optString4;
        java.lang.String optString5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            long abs = java.lang.Math.abs(json.getLong(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT));
            optString = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_UUID, null);
            if (optString == null) {
                throw new java.io.IOException("AMOUNT field is missed or null");
            }
            optString2 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_TYPE, null);
            optString3 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_MASKED_PAN, null);
            optString4 = json.optString("REFERENCE_NUMBER", null);
            optString5 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_ENTRY_MODE, null);
            return new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload(j, abs, optString, optString2, optString3, optString4, optString5);
        } catch (org.json.JSONException e) {
            throw new java.io.IOException(e);
        }
    }
}
