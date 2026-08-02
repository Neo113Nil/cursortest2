package com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsParser;", "Lcom/zettle/sdk/commons/network/Response$Parser;", "Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimitsRemote;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimitsRemote;", "Companion", "ResponseLimitSchemes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvmLimitsParser implements com.zettle.sdk.commons.network.Response.Parser<com.zettle.sdk.feature.taptopay.core.models.CvmLimitsRemote> {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsParser$ResponseLimitSchemes;", "", "<init>", "(Ljava/lang/String;I)V", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "MAESTRO", "VISA_ELECTRON", "CUP", "JCB", "DISCOVER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ResponseLimitSchemes {
        VISA,
        MASTERCARD,
        AMERICAN_EXPRESS,
        MAESTRO,
        VISA_ELECTRON,
        CUP,
        JCB,
        DISCOVER
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.zettle.sdk.commons.network.Response.Parser
    public final com.zettle.sdk.feature.taptopay.core.models.CvmLimitsRemote parse(org.json.JSONObject json) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            if (!json.has("cvmRequiredLimit") || json.isNull("cvmRequiredLimit")) {
                throw new java.io.IOException("cvmRequiredLimit field is missed or null");
            }
            org.json.JSONObject jSONObject = json.getJSONObject("cvmRequiredLimit");
            if (!jSONObject.has("cards") || jSONObject.isNull("cards")) {
                throw new java.io.IOException("cards field is missed or null");
            }
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("cards");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                long j2 = jSONObject2.getJSONObject(next).getLong("amount");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "");
                linkedHashMap.put(next, java.lang.Long.valueOf(j2));
            }
            if (!jSONObject.has(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT) && jSONObject.isNull(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT)) {
                j = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.DELAY;
                return new com.zettle.sdk.feature.taptopay.core.models.CvmLimitsRemote(linkedHashMap, j);
            }
            j = jSONObject.getJSONObject(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT).getLong("amount");
            return new com.zettle.sdk.feature.taptopay.core.models.CvmLimitsRemote(linkedHashMap, j);
        } catch (org.json.JSONException e) {
            throw new java.io.IOException("Syntax error", e);
        }
    }
}
