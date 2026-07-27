package com.ironsource;

import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4551na {

    /* renamed from: a, reason: collision with root package name */
    private String f8452a;
    private JSONObject b;
    private String c;
    private String d;

    public C4551na(JSONObject jSONObject) {
        this.f8452a = jSONObject.optString(U3.g.b);
        this.b = jSONObject.optJSONObject(U3.g.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(U3.g.e);
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f8452a;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(U3.g.b, this.f8452a);
            jSONObject.put(U3.g.c, this.b);
            jSONObject.put("success", this.c);
            jSONObject.put(U3.g.e, this.d);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
