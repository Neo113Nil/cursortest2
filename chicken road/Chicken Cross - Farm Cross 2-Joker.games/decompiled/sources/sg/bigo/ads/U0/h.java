package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f12572a;
    public final int b;
    public final String c;

    public h(JSONObject jSONObject) {
        this.f12572a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("url");
        jSONObject.optString("md5");
    }
}
