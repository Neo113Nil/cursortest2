package p042f4;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p003a.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f12992a;

    static {
        HashMap map = new HashMap();
        f12992a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = f12992a;
                if (map.containsKey(string)) {
                    return a.y0(((String) map.get(string)) + ":" + string2);
                }
            }
            return a.y0("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e7) {
            return a.y0("WEB_INTERNAL_ERROR:" + str + "[ " + e7.getLocalizedMessage() + " ]");
        }
    }
}
