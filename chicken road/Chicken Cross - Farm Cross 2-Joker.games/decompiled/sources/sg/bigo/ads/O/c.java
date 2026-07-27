package sg.bigo.ads.O;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f12469a = "";
    public String b = "";
    public String c = "";
    public String d = "";

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f12469a = jSONObject.optString("title", "");
            this.b = jSONObject.optString("description", "");
            this.c = jSONObject.optString("cta", "");
            this.d = jSONObject.optString("land_url", "");
        } catch (JSONException unused) {
        }
    }
}
