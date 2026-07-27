package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f12577a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;

    public n(JSONObject jSONObject) {
        this.f12577a = jSONObject.optString("imageurl");
        this.b = jSONObject.optString("clickurl");
        this.c = jSONObject.optString("longlegaltext");
        this.d = jSONObject.optString("ad_info");
        this.e = jSONObject.optString("ad_link");
        this.f = jSONObject.optInt("percent");
        this.g = jSONObject.optString("rec_rule");
        this.h = jSONObject.optString("user_privacy");
    }
}
