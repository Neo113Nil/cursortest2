package com.plaid.internal;

/* loaded from: classes16.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.Q0.a f5915a;
    public final kotlinx.serialization.json.Json b;

    public S0(com.plaid.internal.Q0.a aVar, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.f5915a = aVar;
        this.b = json;
    }

    public final boolean a(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (!jSONObject.has("start_link")) {
                if (!jSONObject.has("open_url")) {
                    return false;
                }
                java.lang.String string = jSONObject.getString("open_url");
                com.plaid.internal.Q0.a aVar = this.f5915a;
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                aVar.a(string);
                return true;
            }
            java.lang.String jSONObject2 = jSONObject.getJSONObject("start_link").toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            try {
                kotlinx.serialization.json.Json json = this.b;
                com.plaid.internal.N0.b.a();
                com.plaid.internal.M0 a2 = ((com.plaid.internal.N0) json.decodeFromString(com.plaid.internal.N0.a.f5849a, jSONObject2)).a();
                com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("embeddedLinkSessionInfo: ".concat(java.lang.String.valueOf(a2)), true);
                this.f5915a.a(a2);
                return true;
            } catch (kotlinx.serialization.SerializationException e) {
                com.plaid.internal.C0452a6.a aVar3 = com.plaid.internal.C0452a6.f5996a;
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse start_link message: ");
                sb.append(jSONObject2);
                sb.append(" ");
                sb.append(message);
                com.plaid.internal.C0452a6.a.b(aVar3, sb.toString());
                return false;
            }
        } catch (org.json.JSONException e2) {
            com.plaid.internal.C0452a6.a aVar4 = com.plaid.internal.C0452a6.f5996a;
            java.lang.String message2 = e2.getMessage();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to parse internal event: ");
            sb2.append(str);
            sb2.append(", error: ");
            sb2.append(message2);
            com.plaid.internal.C0452a6.a.b(aVar4, sb2.toString());
            return false;
        }
    }

    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        okhttp3.HttpUrl httpUrl = okhttp3.HttpUrl.INSTANCE.get(kotlin.text.StringsKt.replace$default(str, "plaidlink://", "https://", false, 4, (java.lang.Object) null));
        java.lang.String host = httpUrl.host();
        java.util.Set<java.lang.String> queryParameterNames = httpUrl.queryParameterNames();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(queryParameterNames, 10)), 16));
        for (java.lang.Object obj : queryParameterNames) {
            java.lang.String queryParameter = httpUrl.queryParameter((java.lang.String) obj);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put(obj, queryParameter);
        }
        java.lang.String str2 = (java.lang.String) linkedHashMap.get("event");
        if (kotlin.jvm.internal.Intrinsics.areEqual(host, "internal-event") && str2 != null) {
            if (a(str2)) {
                return;
            }
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "failed to handle internal event: ".concat(java.lang.String.valueOf(str2)));
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(host, com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT)) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown action: ");
            sb.append(host);
            sb.append(", parsedUri: ");
            sb.append(httpUrl);
            com.plaid.internal.C0452a6.a.b(aVar, sb.toString());
            return;
        }
        java.util.Set<java.lang.String> queryParameterNames2 = httpUrl.queryParameterNames();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(queryParameterNames2, 10)), 16));
        for (java.lang.Object obj2 : queryParameterNames2) {
            java.lang.String queryParameter2 = httpUrl.queryParameter((java.lang.String) obj2);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            linkedHashMap2.put(obj2, queryParameter2);
        }
        try {
            com.plaid.internal.Q0.a aVar2 = this.f5915a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap2, "");
            aVar2.a(com.plaid.link.result.LinkExit.INSTANCE.fromMap$link_sdk_release(linkedHashMap2));
        } catch (java.util.NoSuchElementException unused) {
            this.f5915a.a(com.plaid.internal.L2.b(new com.plaid.internal.C0447a1("Failed to parse exit"), null));
        }
    }
}
