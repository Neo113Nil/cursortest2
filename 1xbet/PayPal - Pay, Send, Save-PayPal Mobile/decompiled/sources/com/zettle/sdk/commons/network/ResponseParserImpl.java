package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/commons/network/ResponseParserImpl;", "Lcom/zettle/sdk/commons/network/ResponseParser;", "<init>", "()V", "", "p0", "Lcom/zettle/sdk/commons/network/Response;", "parse", "(Ljava/lang/String;)Lcom/zettle/sdk/commons/network/Response;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class ResponseParserImpl implements com.zettle.sdk.commons.network.ResponseParser {
    @Override // com.zettle.sdk.commons.network.ResponseParser
    public final com.zettle.sdk.commons.network.Response parse(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        try {
            java.lang.Object nextValue = new org.json.JSONTokener(p0).nextValue();
            org.json.JSONObject jSONObject = nextValue instanceof org.json.JSONObject ? (org.json.JSONObject) nextValue : null;
            if (jSONObject == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid response [");
                sb.append(p0);
                sb.append("]");
                throw new java.io.IOException(sb.toString());
            }
            if (!jSONObject.has(com.zettle.sdk.commons.network.JsonKt.KEY_RESPONSE_CODE)) {
                throw new java.io.IOException("RESPONSE_CODE field is missed");
            }
            return new com.zettle.sdk.commons.network.ResponseImpl(jSONObject.getInt(com.zettle.sdk.commons.network.JsonKt.KEY_RESPONSE_CODE), jSONObject.optJSONObject(com.zettle.sdk.commons.network.JsonKt.KEY_PAYLOAD));
        } catch (org.json.JSONException e) {
            throw new java.io.IOException("Syntax error", e);
        }
    }
}
