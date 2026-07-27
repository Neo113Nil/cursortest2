package com.ironsource.mediationsdk.logger;

import com.ironsource.C4491k4;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f8420a;
    private String b;
    private String c;
    private int d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.f8420a = ironSourceTag;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.b);
            jSONObject.put("tag", this.f8420a);
            jSONObject.put("level", this.d);
            jSONObject.put("message", this.c);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
