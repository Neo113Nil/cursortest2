package com.fyber.inneractive.sdk.response.nativead.parser;

/* loaded from: classes3.dex */
public abstract class c {
    public static com.fyber.inneractive.sdk.response.nativead.h a(org.json.JSONObject jSONObject) {
        com.fyber.inneractive.sdk.response.nativead.h hVar = new com.fyber.inneractive.sdk.response.nativead.h();
        if (jSONObject == null) {
            return hVar;
        }
        hVar.f4260a = com.fyber.inneractive.sdk.util.v.a(jSONObject, "url");
        hVar.c = com.fyber.inneractive.sdk.util.v.a(jSONObject, "fallback");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("clicktrackers");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                java.lang.String optString = optJSONArray.optString(i);
                if (optString != null && !optString.isEmpty() && !optString.equals(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL)) {
                    hVar.b.add(optString);
                }
            }
        }
        return hVar;
    }
}
