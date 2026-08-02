package com.zettle.sdk.feature.taptopay.core.refunds.models;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/CardPaymentPayloadParser;", "Lcom/zettle/sdk/commons/network/Response$Parser;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "Ljava/util/Currency;", "currency", "", "referenceId", "<init>", "(Ljava/util/Currency;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "getHighSpeedVideoSizes", "Ljava/util/Currency;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CardPaymentPayloadParser implements com.zettle.sdk.commons.network.Response.Parser<com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Currency getHighSpeedVideoSizes;

    public CardPaymentPayloadParser(java.util.Currency currency, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = currency;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.zettle.sdk.commons.network.Response.Parser
    public final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload parse(org.json.JSONObject json) {
        java.lang.String optString;
        java.lang.String optString2;
        java.util.Date date;
        java.lang.String optString3;
        java.lang.String optString4;
        java.lang.String optString5;
        java.lang.String optString6;
        java.lang.String optString7;
        java.util.Date highSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Currency currency = this.getHighSpeedVideoSizes;
            java.lang.Long valueOf = java.lang.Long.valueOf(json.optLong("amount", -1L));
            if (valueOf.longValue() == -1) {
                valueOf = null;
            }
            if (valueOf == null) {
                throw new java.io.IOException("amount field is missed or null");
            }
            long longValue = valueOf.longValue();
            optString = json.optString("transactionId", null);
            if (optString == null) {
                throw new java.io.IOException("transactionId field is missed or null");
            }
            optString2 = json.optString("date", null);
            if (optString2 != null) {
                highSpeedVideoSizes = com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayloadKt.getHighSpeedVideoSizes(optString2);
                date = highSpeedVideoSizes;
            } else {
                date = null;
            }
            optString3 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_REFERENCE_NUMBER, null);
            optString4 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, null);
            optString5 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, null);
            optString6 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_LAST_4_DIGITS, null);
            optString7 = json.optString(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, null);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(json.optLong(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_TOTAL_FEES, -1L));
            if (valueOf2.longValue() == -1) {
                valueOf2 = null;
            }
            return new com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload(str, longValue, optString, false, currency, date, optString4, optString3, optString6, optString5, optString7, valueOf2);
        } catch (org.json.JSONException e) {
            throw new java.io.IOException(e);
        }
    }
}
