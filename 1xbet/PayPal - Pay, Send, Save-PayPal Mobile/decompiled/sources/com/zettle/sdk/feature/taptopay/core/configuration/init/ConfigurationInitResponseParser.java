package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitResponseParser;", "Lcom/zettle/sdk/commons/network/Response$Parser;", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInitRemote;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInitRemote;", "", "", "getHighSpeedVideoFpsRanges", "[Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationInitResponseParser implements com.zettle.sdk.commons.network.Response.Parser<com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"libAccessKey", "libSecretKey", "libGooglePlayProjNum", "attestConnectionTimeout", "attestRefreshInterval", "attestHostReadTimeout", "attestationHost", "attestCertPinning", "attestationMinimumRefreshInterval", "keyLoadingHost", "keyLoadingCertPinning", "keyLoadingCaCert"};

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.zettle.sdk.commons.network.Response.Parser
    public final com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote parse(org.json.JSONObject json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitResponseParser.Companion.ApiVersion apiVersion = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitResponseParser.Companion.ApiVersion.TWO;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("v%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(apiVersion.ordinal())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            if (!json.has(format) || json.isNull(format)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("config version ");
                sb.append(format);
                sb.append(" field is missing or null");
                throw new java.io.IOException(sb.toString());
            }
            org.json.JSONObject jSONObject = json.getJSONObject(format);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            for (java.lang.String str : this.getHighResolutionOutputSizeshNQ4ISI) {
                if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(" field is missing or null");
                    throw new java.io.IOException(sb2.toString());
                }
            }
            java.lang.String string = jSONObject.getString("attestationHost");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = jSONObject.getString("attestCertPinning");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            long j = jSONObject.getLong("attestHostReadTimeout");
            long j2 = jSONObject.getLong("attestConnectionTimeout");
            long j3 = jSONObject.getLong("attestRefreshInterval");
            long j4 = jSONObject.getLong("attestationMinimumRefreshInterval");
            java.lang.String string3 = jSONObject.getString("keyLoadingHost");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            java.lang.String string4 = jSONObject.getString("keyLoadingCertPinning");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            java.lang.String string5 = jSONObject.getString("keyLoadingCaCert");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
            java.lang.String string6 = jSONObject.getString("libAccessKey");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
            java.lang.String string7 = jSONObject.getString("libSecretKey");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
            java.lang.String string8 = jSONObject.getString("libGooglePlayProjNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "");
            return new com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote(string, string2, j, j2, j3, j4, string3, string4, string5, string6, string7, string8);
        } catch (org.json.JSONException e) {
            throw new java.io.IOException("Syntax error", e);
        }
    }
}
