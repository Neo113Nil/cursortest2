package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5274a = new HashMap();

    public p() {
    }

    public p(JSONObject jSONObject) {
        JSONArray names;
        JSONArray names2 = jSONObject.names();
        for (int i = 0; i < names2.length(); i++) {
            String optString = names2.optString(i, null);
            JSONObject optJSONObject = jSONObject.optJSONObject(optString);
            o oVar = new o();
            if (optJSONObject != null && (names = optJSONObject.names()) != null) {
                for (int i2 = 0; i2 < names.length(); i2++) {
                    String optString2 = names.optString(i2, null);
                    String optString3 = optJSONObject.optString(optString2, null);
                    if (optString2 != null && optString3 != null) {
                        oVar.f5272a.put(optString2, optString3);
                    }
                }
            }
            this.f5274a.put(optString, oVar);
        }
    }
}
