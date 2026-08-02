package f4;

import a.AbstractC0603a;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f12986a;

    static {
        HashMap hashMap = new HashMap();
        f12986a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap hashMap = f12986a;
                if (hashMap.containsKey(string)) {
                    return AbstractC0603a.y0(((String) hashMap.get(string)) + ":" + string2);
                }
            }
            return AbstractC0603a.y0("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e7) {
            return AbstractC0603a.y0("WEB_INTERNAL_ERROR:" + str + "[ " + e7.getLocalizedMessage() + " ]");
        }
    }
}
