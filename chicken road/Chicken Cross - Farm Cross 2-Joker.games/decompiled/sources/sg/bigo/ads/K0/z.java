package sg.bigo.ads.K0;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class z {
    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.putOpt(str, obj);
        } catch (JSONException unused) {
        }
    }

    public static Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
