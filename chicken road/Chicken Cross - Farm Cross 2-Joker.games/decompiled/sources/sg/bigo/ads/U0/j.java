package sg.bigo.ads.U0;

import android.text.TextUtils;
import com.ironsource.U3;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f12574a;
    public final String b;
    public final int c;
    public final JSONArray d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final LinkedHashMap i;
    public final String j;
    public final int k;
    public final String l;

    public j(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.i = linkedHashMap;
        this.f12574a = jSONObject.optString("land_url", "");
        this.l = jSONObject.optString("sub_url", "");
        this.b = jSONObject.optString("deeplink_url", "");
        this.c = jSONObject.optInt("web_ad_model", 0);
        this.e = jSONObject.optString("return_tracker_url", "");
        this.f = jSONObject.optInt("land_preload_type", 0);
        this.g = jSONObject.optString("click_open_pkg", "");
        jSONObject.optInt("probe_interval", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("pixel");
        if (optJSONObject != null) {
            this.h = optJSONObject.optString("host", "");
            String optString = optJSONObject.optString("value", "");
            if (!I.a((CharSequence) optString)) {
                linkedHashMap.clear();
                if (!TextUtils.isEmpty(optString)) {
                    for (String str : optString.split(U3.j.c)) {
                        if (str.indexOf(U3.j.b) >= 0) {
                            String substring = str.substring(0, str.indexOf(U3.j.b));
                            if (!TextUtils.isEmpty(substring)) {
                                String str2 = (String) this.i.get(substring);
                                this.i.put(substring, I.a((CharSequence) str2) ? str : str2 + U3.j.c + str);
                            }
                        }
                    }
                }
            }
        } else {
            this.h = "";
        }
        this.j = jSONObject.optString("pre_landing_url", "");
        this.k = jSONObject.optInt("pre_landing_scene", 0);
        this.d = jSONObject.optJSONArray("webview_bundle");
    }
}
