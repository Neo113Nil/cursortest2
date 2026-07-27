package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {
    public static String a(y yVar) {
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", yVar.f5626a);
        jSONObject.put("url", yVar.f5628c);
        jSONObject.put("responseCode", yVar.f5630e);
        byte[] bArr = yVar.f;
        try {
            encodeToString = new String(bArr, v2.a.f10417a);
        } catch (Throwable unused) {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", encodeToString);
        Map map = yVar.f5631g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
