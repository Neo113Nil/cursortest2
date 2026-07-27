package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f12581a;
    public final int b;
    public final String c;

    public s(JSONObject jSONObject) {
        this.f12581a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("data");
    }
}
