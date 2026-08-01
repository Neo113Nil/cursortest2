package sg.bigo.ads.K0;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class B {
    public static HashMap a(String str) {
        JSONObject jSONObject;
        String optString;
        HashMap hashMap = new HashMap();
        if (I.a((CharSequence) str)) {
            return hashMap;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null && (optString = jSONObject.optString(next)) != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static String a(String str, HashMap hashMap) {
        Object obj;
        if (hashMap == null || (obj = hashMap.get(str)) == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }
}
