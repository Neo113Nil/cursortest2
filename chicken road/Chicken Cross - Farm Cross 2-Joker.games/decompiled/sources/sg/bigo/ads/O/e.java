package sg.bigo.ads.O;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12471a;
    public final int b;
    public final String[] c;
    public final String d;

    public e(JSONObject jSONObject) {
        this.f12471a = "";
        this.b = 0;
        this.c = null;
        this.d = "";
        this.f12471a = jSONObject.optString("title", "");
        this.b = jSONObject.optInt("type", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.c = new String[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.c[i] = optJSONArray.optString(i);
            }
        }
        this.d = jSONObject.optString("id", "");
    }
}
