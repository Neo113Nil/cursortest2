package sg.bigo.ads.U0;

import android.graphics.Rect;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {
    public f(JSONObject jSONObject) {
        String optString = jSONObject.optString("start_coordinate");
        String optString2 = jSONObject.optString("end_coordinate");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return;
        }
        String[] split = optString.split(",");
        String[] split2 = optString2.split(",");
        if (split.length == 2 && split2.length == 2) {
            try {
                int parseFloat = (int) (Float.parseFloat(split[0]) * 1000.0f);
                int parseFloat2 = (int) (Float.parseFloat(split2[0]) * 1000.0f);
                int parseFloat3 = (int) (Float.parseFloat(split[1]) * 1000.0f);
                int parseFloat4 = (int) (Float.parseFloat(split2[1]) * 1000.0f);
                new Rect(Math.min(parseFloat, parseFloat2), Math.min(parseFloat3, parseFloat4), Math.max(parseFloat, parseFloat2), Math.max(parseFloat3, parseFloat4));
            } catch (NumberFormatException unused) {
            }
        }
    }
}
