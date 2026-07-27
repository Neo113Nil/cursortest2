package sg.bigo.ads.U0;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m implements sg.bigo.ads.P.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f12576a;
    public final String b;
    public final String c;
    public final String[] d;
    public final String[] e;
    public final String f;

    public m(JSONObject jSONObject) {
        this.f12576a = jSONObject.optString("icon");
        this.b = jSONObject.optString("title");
        jSONObject.optString("rate");
        jSONObject.optString("comments");
        jSONObject.optString("downloads");
        this.c = jSONObject.optString("description");
        JSONArray optJSONArray = jSONObject.optJSONArray("genre");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.d = new String[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.d[i] = optJSONArray.optString(i);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("img");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            this.e = new String[optJSONArray2.length()];
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.e[i2] = optJSONArray2.optString(i2);
            }
        }
        this.f = jSONObject.optString("name");
    }
}
