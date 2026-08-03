package com.fyber.inneractive.sdk.response.nativead.parser;

/* loaded from: classes3.dex */
public abstract class b {
    public static java.util.ArrayList a(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String optString = jSONArray.optString(i);
            if (optString != null && !optString.isEmpty() && !optString.equals(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }
}
