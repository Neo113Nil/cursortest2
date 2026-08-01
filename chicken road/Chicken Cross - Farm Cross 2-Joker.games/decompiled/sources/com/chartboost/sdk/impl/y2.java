package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class y2 {
    public static final JSONObject a(JSONObject jSONObject, String name, Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            jSONObject.put(name, obj);
            return jSONObject;
        } catch (JSONException e) {
            mb.b("put (" + name + ")" + e, (Throwable) null, 2, (Object) null);
            return jSONObject;
        }
    }

    public static final Boolean a(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final byte[] a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        byte[] bytes = jSONArray2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
