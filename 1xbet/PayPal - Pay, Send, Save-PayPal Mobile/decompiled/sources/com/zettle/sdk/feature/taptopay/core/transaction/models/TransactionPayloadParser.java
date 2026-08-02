package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionPayloadParser;", "Lcom/zettle/sdk/commons/network/Response$Parser;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionPayload;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionPayloadParser implements com.zettle.sdk.commons.network.Response.Parser<com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.zettle.sdk.commons.network.Response.Parser
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload parse(org.json.JSONObject json) {
        java.lang.String optString;
        java.lang.String optString2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            optString = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_EMV_PROTOCOL_STATE, null);
            if (optString == null) {
                throw new java.io.IOException("EMV_PROTOCOL_STATE field is missed or null");
            }
            optString2 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_EMV_CONVERSATION_RESULT, null);
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload(optString, optString2);
        } catch (org.json.JSONException e) {
            throw new java.io.IOException("Syntax error", e);
        }
    }
}
