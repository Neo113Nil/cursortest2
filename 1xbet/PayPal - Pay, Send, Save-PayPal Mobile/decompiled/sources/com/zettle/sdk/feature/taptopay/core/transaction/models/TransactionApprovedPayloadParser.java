package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayloadParser;", "Lcom/zettle/sdk/commons/network/Response$Parser;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionApprovedPayloadParser implements com.zettle.sdk.commons.network.Response.Parser<com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.zettle.sdk.commons.network.Response.Parser
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload parse(org.json.JSONObject json) {
        java.lang.String optString;
        java.lang.String optString2;
        java.lang.String optString3;
        java.lang.String optString4;
        java.lang.String optString5;
        java.lang.String optString6;
        java.lang.String optString7;
        java.lang.String optString8;
        java.lang.String optString9;
        java.lang.String optString10;
        java.lang.String optString11;
        java.lang.String optString12;
        java.lang.String optString13;
        java.lang.String optString14;
        java.lang.String optString15;
        java.lang.String optString16;
        java.lang.String optString17;
        java.lang.String optString18;
        java.lang.String optString19;
        java.lang.String optString20;
        java.lang.String optString21;
        java.lang.String optString22;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            org.json.JSONObject optJSONObject = json.optJSONObject(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES);
            optString = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_EMV_PROTOCOL_STATE, null);
            if (optString == null) {
                throw new java.io.IOException("EMV_PROTOCOL_STATE field is missed or null");
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(json.optLong(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, -1L));
            if (valueOf.longValue() == -1) {
                valueOf = null;
            }
            if (valueOf == null) {
                throw new java.io.IOException("AMOUNT field is missed or null");
            }
            long longValue = valueOf.longValue();
            optString2 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_EMV_CONVERSATION_RESULT, null);
            if (optString2 == null) {
                throw new java.io.IOException("EMV_CONVERSATION_RESULT field is missed or null");
            }
            boolean optBoolean = json.optBoolean(com.zettle.sdk.commons.network.JsonKt.KEY_SIGNATURE_REQUIRED, false);
            boolean optBoolean2 = json.optBoolean(com.zettle.sdk.commons.network.JsonKt.KEY_SIGNATURE_OPTIONAL, false);
            boolean optBoolean3 = json.optBoolean(com.zettle.sdk.commons.network.JsonKt.KEY_SIGNATURE_PERMISSIVE, false);
            optString3 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARDHOLDER_NAME, null);
            optString4 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_LAST_DIGITS, null);
            optString5 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_APPLICATION_IDENTIFIER, null);
            optString6 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_HASH, null);
            optString7 = json.optString("REFERENCE_NUMBER", null);
            optString8 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_TYPE, null);
            optString9 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_TSI, null);
            optString10 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_ENTRY_MODE, null);
            optString11 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARDHOLDER_VERIFICATION_METHOD, null);
            optString12 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_TVR, null);
            optString13 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_ISSUING_BANK, null);
            optString14 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_MASKED_PAN, null);
            optString15 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_APPLICATION_NAME, null);
            optString16 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_AUTHORIZATION_CODE, null);
            optString17 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_UUID, null);
            optString18 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_LAST_RECEIPT_EMAIL, null);
            optString19 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_LAST_RECEIPT_PHONE_NUMBER, null);
            optString20 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_LAST_RECEIPT_COUNTRY_CODE, null);
            long optLong = json.optLong(com.zettle.sdk.commons.network.JsonKt.KEY_INSTALLMENT_AMOUNT, 0L);
            int optInt = json.optInt(com.zettle.sdk.commons.network.JsonKt.KEY_NR_OF_INSTALLMENTS, 0);
            optString21 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_MX_FIID, null);
            optString22 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_MX_CARD_TYPE, null);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(json.optInt(com.zettle.sdk.commons.network.JsonKt.KEY_MX_PAYMENT_METHOD, -1));
            if (valueOf2.intValue() == -1) {
                valueOf2 = null;
            }
            com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference fromJSON$core_publicRelease = com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.INSTANCE.fromJSON$core_publicRelease(optJSONObject);
            java.lang.Long valueOf3 = optJSONObject != null ? java.lang.Long.valueOf(optJSONObject.optLong(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, -1L)) : null;
            if (valueOf3 != null && valueOf3.longValue() == -1) {
                valueOf3 = null;
            }
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload(optString, optString2, longValue, optBoolean, optBoolean2, optBoolean3, optString3, optString4, optString5, optString6, optString7, optString8, optString9, optString10, optString11, optString12, optString13, optString14, optString15, optString16, optString17, optString18, optString19, optString20, optLong, optInt, optString21, optString22, valueOf2, fromJSON$core_publicRelease, valueOf3);
        } catch (org.json.JSONException e) {
            throw new java.io.IOException("Syntax error", e);
        }
    }
}
