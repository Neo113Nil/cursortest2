package com.zettle.sdk.commons.network.service;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/commons/network/service/ResponseParserImpl;", "Lcom/zettle/sdk/commons/network/service/ResponseParser;", "<init>", "()V", "", "json", "Lcom/zettle/sdk/commons/network/service/ServiceResponse;", "parse", "(Ljava/lang/String;)Lcom/zettle/sdk/commons/network/service/ServiceResponse;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ResponseParserImpl implements com.zettle.sdk.commons.network.service.ResponseParser {
    @Override // com.zettle.sdk.commons.network.service.ResponseParser
    public final com.zettle.sdk.commons.network.service.ServiceResponse parse(java.lang.String json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        try {
            java.lang.Object nextValue = new org.json.JSONTokener(json).nextValue();
            java.util.Map map = null;
            org.json.JSONObject jSONObject = nextValue instanceof org.json.JSONObject ? (org.json.JSONObject) nextValue : null;
            if (jSONObject == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid response [");
                sb.append(json);
                sb.append("]");
                throw new java.io.IOException(sb.toString());
            }
            if (!jSONObject.has(com.zettle.sdk.commons.network.JsonKt.KEY_RESPONSE_CODE)) {
                throw new java.io.IOException("RESPONSE_CODE field is missed");
            }
            int i = jSONObject.getInt(com.zettle.sdk.commons.network.JsonKt.KEY_RESPONSE_CODE);
            final org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.zettle.sdk.commons.network.JsonKt.KEY_PAYLOAD);
            if (optJSONObject != null) {
                java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
                map = kotlin.collections.MapsKt.toMap(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.asSequence(keys), new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String[]>>() { // from class: com.zettle.sdk.commons.network.service.ResponseParserImpl$parse$payload$1$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final kotlin.Pair<java.lang.String, java.lang.String[]> invoke(java.lang.String str) {
                        java.lang.String[] strArr;
                        java.lang.Object obj = optJSONObject.get(str);
                        org.json.JSONArray jSONArray = obj instanceof org.json.JSONArray ? (org.json.JSONArray) obj : null;
                        if (jSONArray == null || (strArr = com.zettle.sdk.commons.network.service.ResponseParserImpl.access$toStringArray(this, jSONArray)) == null) {
                            strArr = new java.lang.String[0];
                        }
                        return kotlin.TuplesKt.to(str, strArr);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }));
            }
            return new com.zettle.sdk.commons.network.service.ServiceResponse(i, map);
        } catch (org.json.JSONException e) {
            throw new java.io.IOException("Syntax error", e);
        }
    }

    public static final /* synthetic */ java.lang.String[] access$toStringArray(com.zettle.sdk.commons.network.service.ResponseParserImpl responseParserImpl, org.json.JSONArray jSONArray) {
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, jSONArray.length() - 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.getString(((kotlin.collections.IntIterator) it).nextInt()));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }
}
