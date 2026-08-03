package io.appmetrica.analytics.remotepermissions.impl;

/* loaded from: classes.dex */
public final class d implements io.appmetrica.analytics.coreapi.internal.data.JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7474a = "permissions";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f7475b = "name";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f7476c = "list";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f7477d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.remotepermissions.impl.a parse(org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray;
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(this.f7474a);
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(this.f7476c)) != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                if (optJSONObject2 != null && optJSONObject2.optBoolean(this.f7477d)) {
                    java.lang.String optString = optJSONObject2.optString(this.f7475b);
                    if (!android.text.TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
        }
        return new io.appmetrica.analytics.remotepermissions.impl.a(hashSet);
    }

    public final io.appmetrica.analytics.remotepermissions.impl.a b(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.remotepermissions.impl.a) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final java.lang.Object parseOrNull(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.remotepermissions.impl.a) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
