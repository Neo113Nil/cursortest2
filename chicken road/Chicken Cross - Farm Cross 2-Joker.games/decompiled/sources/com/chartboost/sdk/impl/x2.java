package com.chartboost.sdk.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class x2 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f5066a;
        public final Object b;

        public a(String str, Object obj) {
            this.f5066a = str;
            this.b = obj;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            mb.b("put (" + str + ")", e);
        }
    }

    public static JSONObject a(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            a(jSONObject, aVar.f5066a, aVar.b);
        }
        return jSONObject;
    }

    public static a a(String str, Object obj) {
        return new a(str, obj);
    }
}
