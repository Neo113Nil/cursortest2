package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class d8 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private String f4178a;
    private String b;

    private d8() {
    }

    public static d8 a(t8 t8Var, d8 d8Var, com.applovin.impl.sdk.l lVar) {
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (d8Var == null) {
            try {
                d8Var = new d8();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastSystemInfo", "Error occurred while initializing", th);
                }
                lVar.E().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(d8Var.f4178a)) {
            String d = t8Var.d();
            if (StringUtils.isValidString(d)) {
                d8Var.f4178a = d;
            }
        }
        if (!StringUtils.isValidString(d8Var.b)) {
            String str = (String) t8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                d8Var.b = str;
            }
        }
        return d8Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        String str = this.f4178a;
        if (str == null ? d8Var.f4178a != null : !str.equals(d8Var.f4178a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = d8Var.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f4178a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f4178a + "', version='" + this.b + "'}";
    }

    public static d8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        d8 d8Var = new d8();
        d8Var.f4178a = JsonUtils.getString(jSONObject, "name", null);
        d8Var.b = JsonUtils.getString(jSONObject, "version", null);
        return d8Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f4178a);
        JsonUtils.putString(jSONObject, "version", this.b);
        return jSONObject;
    }
}
