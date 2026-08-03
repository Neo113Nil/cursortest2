package com.digitalturbine.ignite.authenticator.parsers;

/* loaded from: classes2.dex */
public abstract class a {
    public static com.digitalturbine.ignite.authenticator.entities.a a(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        org.json.JSONArray optJSONArray;
        java.lang.String str = "";
        boolean z = true;
        try {
            if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                java.lang.String optString = optJSONObject.optString("igniteVersion", "");
                try {
                    if (optJSONObject.has(com.ironsource.X3.a.v) && (optJSONArray = optJSONObject.optJSONArray(com.ironsource.X3.a.v)) != null) {
                        for (int length = optJSONArray.length() - 1; length >= 0; length--) {
                            org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(length);
                            if (optJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(optJSONObject2.optString("type", ""))) {
                                str = optString;
                                break;
                            }
                        }
                    }
                    str = optString;
                } catch (java.lang.Exception e) {
                    e = e;
                    str = optString;
                    com.digitalturbine.ignite.authenticator.logger.a.b("IgniteVersionParser: exception on parse: %s", e.getMessage());
                    z = false;
                    return new com.digitalturbine.ignite.authenticator.entities.a(z, str);
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        z = false;
        return new com.digitalturbine.ignite.authenticator.entities.a(z, str);
    }
}
