package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class v7 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4539a;
    private final List b;
    private final String c;
    private final Set d;

    private v7(String str, List list, String str2, Set set) {
        this.f4539a = str;
        this.b = list;
        this.c = str2;
        this.d = set;
    }

    public static v7 a(t8 t8Var, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        try {
            String str = (String) t8Var.a().get("vendor");
            t8 b = t8Var.b("VerificationParameters");
            String d = b != null ? b.d() : null;
            List a2 = t8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a2.size());
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                b8 a3 = b8.a((t8) it.next(), lVar);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            HashMap hashMap = new HashMap();
            g8.a(t8Var, hashMap, y7Var, lVar);
            return new v7(str, arrayList, d, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastAdVerification", "Error occurred while initializing", th);
            }
            lVar.E().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.d;
    }

    public List c() {
        return this.b;
    }

    public String d() {
        return this.f4539a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v7 v7Var = (v7) obj;
        String str = this.f4539a;
        if (str == null ? v7Var.f4539a != null : !str.equals(v7Var.f4539a)) {
            return false;
        }
        List list = this.b;
        if (list == null ? v7Var.b != null : !list.equals(v7Var.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? v7Var.c != null : !str2.equals(v7Var.c)) {
            return false;
        }
        Set set = this.d;
        Set set2 = v7Var.d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f4539a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f4539a + "'javascriptResources='" + this.b + "'verificationParameters='" + this.c + "'errorEventTrackers='" + this.d + "'}";
    }

    public static v7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            b8 a2 = b8.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), lVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            e8 a3 = e8.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), lVar);
            if (a3 != null) {
                hashSet.add(a3);
            }
        }
        return new v7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f4539a);
        if (this.b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((b8) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.c);
        if (this.d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((e8) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
