package f2;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final long f5640d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f5641a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5642b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5643c;

    public u(String str, String str2, long j2) {
        this.f5641a = str;
        this.f5642b = str2;
        this.f5643c = j2;
    }

    public static String a(String str, String str2, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j2);
            return jSONObject.toString();
        } catch (JSONException e3) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e3);
            return null;
        }
    }

    public static u b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new u(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new u(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e3) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e3);
            return null;
        }
    }
}
