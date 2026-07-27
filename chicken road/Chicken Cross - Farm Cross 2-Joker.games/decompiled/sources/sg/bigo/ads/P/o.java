package sg.bigo.ads.P;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f12487a;
    public final int b;
    public final String c;

    public o(JSONObject jSONObject) {
        this.f12487a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("url");
        jSONObject.optString("md5");
    }
}
