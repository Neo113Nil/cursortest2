package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.x2;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5012a;
    public final String b;
    public final String c;

    public t1(String str, String str2, String str3) {
        this.f5012a = str;
        this.b = str2;
        this.c = str3;
    }

    public static Map b(JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if ("templates".equals(next)) {
                        hashMap.putAll(a(jSONObject2, i));
                    } else {
                        hashMap.putAll(a(jSONObject2, next));
                    }
                }
            } catch (JSONException e) {
                mb.b("v2PrefetchToAssets: " + e, null);
                return hashMap;
            }
        }
        return hashMap;
    }

    public String a() {
        return this.c;
    }

    public String toString() {
        return "Asset{directory='" + this.f5012a + "', filename='" + this.b + "', url='" + this.c + "'}";
    }

    public static Map a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            mb.a("deserializeAssets assetsJson is null", null);
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                hashMap.put(next2, new t1(next, jSONObject3.getString(ContentDisposition.Parameters.FileName), jSONObject3.getString("url")));
            }
        }
        return hashMap;
    }

    public static JSONObject a(JSONArray jSONArray) {
        JSONObject a2 = x2.a(new x2.a[0]);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("name");
                String optString2 = jSONObject.optString("type");
                String optString3 = jSONObject.optString("value");
                String optString4 = jSONObject.optString("param");
                if (!"param".equals(optString2) && optString4.isEmpty()) {
                    JSONObject optJSONObject = a2.optJSONObject(optString2);
                    if (optJSONObject == null) {
                        optJSONObject = x2.a(new x2.a[0]);
                        a2.put(optString2, optJSONObject);
                    }
                    optJSONObject.put("html".equals(optString2) ? "body" : optString, x2.a(x2.a(ContentDisposition.Parameters.FileName, optString), x2.a("url", optString3)));
                }
            }
        }
        return a2;
    }

    public static Map a(JSONObject jSONObject, int i) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int min = Math.min(i, optJSONArray.length());
            for (int i2 = 0; i2 < min; i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                Iterator it = a(jSONObject2 != null ? a(jSONObject2.getJSONArray("elements")) : null).entrySet().iterator();
                while (it.hasNext()) {
                    t1 t1Var = (t1) ((Map.Entry) it.next()).getValue();
                    hashMap.put(t1Var.b, t1Var);
                }
            }
        }
        return hashMap;
    }

    public static Map a(JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("name");
                hashMap.put(string, new t1(str, string, jSONObject2.getString("value")));
            }
        }
        return hashMap;
    }

    public File a(File file) {
        if (this.f5012a != null && this.b != null) {
            String str = this.f5012a + "/" + this.b;
            try {
                return new File(file, str);
            } catch (Exception e) {
                mb.a("Cannot create file for path: " + str + ". Error: " + e, null);
                return null;
            }
        }
        mb.a("Cannot create file. Directory or filename is null.", null);
        return null;
    }
}
