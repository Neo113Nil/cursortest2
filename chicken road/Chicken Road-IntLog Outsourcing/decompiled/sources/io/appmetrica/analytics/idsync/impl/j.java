package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {
    public static String a(y yVar) {
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WebViewManager.EVENT_TYPE_KEY, yVar.f6452a);
        jSONObject.put("url", yVar.f6454c);
        jSONObject.put("responseCode", yVar.f6456e);
        byte[] bArr = yVar.f6457f;
        try {
            encodeToString = new String(bArr, B4.a.f287a);
        } catch (Throwable unused) {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", encodeToString);
        Map map = yVar.f6458g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
