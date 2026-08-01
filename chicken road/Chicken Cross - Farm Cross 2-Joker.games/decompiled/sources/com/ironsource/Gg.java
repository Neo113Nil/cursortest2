package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Gg {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7646a = "errMsg";

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
