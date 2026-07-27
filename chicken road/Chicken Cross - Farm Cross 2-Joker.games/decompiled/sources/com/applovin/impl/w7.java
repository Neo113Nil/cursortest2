package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class w7 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f4547a;

    private w7(List list) {
        this.f4547a = list;
    }

    public static w7 a(t8 t8Var, w7 w7Var, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        try {
            List b = w7Var != null ? w7Var.b() : new ArrayList();
            Iterator it = t8Var.a("Verification").iterator();
            while (it.hasNext()) {
                v7 a2 = v7.a((t8) it.next(), y7Var, lVar);
                if (a2 != null) {
                    b.add(a2);
                }
            }
            return new w7(b);
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            lVar.E().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.f4547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w7) {
            return this.f4547a.equals(((w7) obj).f4547a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4547a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f4547a + "'}";
    }

    static w7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            v7 a2 = v7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), lVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new w7(arrayList);
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f4547a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f4547a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
