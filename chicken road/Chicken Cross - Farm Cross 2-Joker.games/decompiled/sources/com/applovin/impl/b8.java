package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class b8 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4148a;
    private final String b;

    private b8(String str, String str2) {
        this.f4148a = str;
        this.b = str2;
    }

    public static b8 a(t8 t8Var, com.applovin.impl.sdk.l lVar) {
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new b8((String) t8Var.a().get("apiFramework"), t8Var.d());
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            lVar.E().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public String b() {
        return this.f4148a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b8 b8Var = (b8) obj;
        String str = this.f4148a;
        if (str == null ? b8Var.f4148a != null : !str.equals(b8Var.f4148a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = b8Var.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f4148a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f4148a + "', javascriptResourceUrl='" + this.b + "'}";
    }

    public static b8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        return new b8(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f4148a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.b);
        return jSONObject;
    }
}
