package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f4557a;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private y0(JSONObject jSONObject) {
        this.f4557a = jSONObject;
    }

    public static y0 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && lVar.y().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && lVar.y().f() == null) {
            return null;
        }
        return new y0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f4557a, NotificationCompat.CATEGORY_EVENT, null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f4557a, "style", null);
        return BuildConfig.FLAVOR.equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f4557a, "title", (JSONObject) null);
        return com.applovin.impl.sdk.l.a(JsonUtils.getString(jSONObject, "key", ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f4557a, "destination_state_id", -1);
    }
}
