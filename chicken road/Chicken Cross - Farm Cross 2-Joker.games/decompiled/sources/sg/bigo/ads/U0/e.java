package sg.bigo.ads.U0;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f12570a;
    public final int b;
    public final ArrayList c = new ArrayList();

    public e(JSONObject jSONObject) {
        this.f12570a = jSONObject.optInt(CampaignEx.JSON_KEY_CLICK_MODE, 2);
        this.b = jSONObject.optInt("wrong_click_time", 500);
        JSONArray optJSONArray = jSONObject.optJSONArray("reconfirm_click_region");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    this.c.add(new f(optJSONObject));
                }
            }
        }
    }
}
