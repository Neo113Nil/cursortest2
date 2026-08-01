package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f12575a;
    public final String b;
    public final String c;

    public l(JSONObject jSONObject) {
        this.f12575a = jSONObject.optString("vendor_url");
        this.b = jSONObject.optString("vendor_key");
        this.c = jSONObject.optString("params");
    }
}
