package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/SignaturePayloadParser;", "Lcom/zettle/sdk/commons/network/Response$Parser;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/SignaturePayload;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/SignaturePayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SignaturePayloadParser implements com.zettle.sdk.commons.network.Response.Parser<com.zettle.sdk.feature.taptopay.core.transaction.models.SignaturePayload> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.zettle.sdk.commons.network.Response.Parser
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.SignaturePayload parse(org.json.JSONObject json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            java.lang.String optString = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_UUID, null);
            if (optString != null) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.models.SignaturePayload(optString);
            }
            throw new java.io.IOException("CARD_PAYMENT_UUID field is missed or null");
        } catch (org.json.JSONException e) {
            throw new java.io.IOException("Syntax error", e);
        }
    }
}
