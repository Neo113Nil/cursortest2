package sg.bigo.ads.U0;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12580a;
    public final String[] b;
    public final String[] c;

    public r(JSONObject jSONObject) {
        this.f12580a = jSONObject;
        jSONObject.optInt("type", 0);
        jSONObject.optString("value", "");
        jSONObject.optString("name", "");
        jSONObject.optString("uuid", "");
        jSONObject.optInt("replace", 0);
        jSONObject.optInt("norepeat", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("reg");
        if (optJSONArray == null) {
            this.b = new String[0];
            this.c = new String[0];
            return;
        }
        this.b = new String[optJSONArray.length()];
        this.c = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                this.b[i] = optJSONObject.optString("token", "");
                this.c[i] = optJSONObject.optString("value", "");
            }
        }
    }
}
