package b4;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0781a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10126a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10127b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10128c;

    public C0781a(String str, long j, long j3) {
        D.e(str);
        this.f10126a = str;
        this.f10128c = j;
        this.f10127b = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: UnsupportedEncodingException -> 0x006c, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x006c, blocks: (B:16:0x0025, B:20:0x0067, B:28:0x0049, B:30:0x005e, B:31:0x0061, B:23:0x003a, B:25:0x0043), top: B:15:0x0025, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0781a a(String str) {
        Map emptyMap;
        JSONObject jSONObject;
        D.i(str);
        D.e(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            Log.e("FirebaseAppCheck", "Invalid token (too few subsections):\n".concat(str), null);
            emptyMap = Collections.emptyMap();
        } else {
            try {
                String str2 = new String(Base64.decode(split[1], 11), "UTF-8");
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (Exception e7) {
                        String str3 = "Failed to parse JSONObject into Map:\n" + e7;
                        if (Log.isLoggable("FirebaseAppCheck", 3)) {
                            Log.d("FirebaseAppCheck", str3, null);
                        }
                        emptyMap = Collections.emptyMap();
                    }
                    if (jSONObject != JSONObject.NULL) {
                        emptyMap = P6.b.Q(jSONObject);
                        if (emptyMap == null) {
                            emptyMap = Collections.emptyMap();
                        }
                    }
                }
                emptyMap = null;
                if (emptyMap == null) {
                }
            } catch (UnsupportedEncodingException e8) {
                Log.e("FirebaseAppCheck", "Unable to decode token (charset unknown):\n" + e8, null);
                emptyMap = Collections.emptyMap();
            }
        }
        D.i(emptyMap);
        D.e("iat");
        Integer num = (Integer) emptyMap.get("iat");
        long longValue = num == null ? 0L : num.longValue();
        D.e("exp");
        Integer num2 = (Integer) emptyMap.get("exp");
        return new C0781a(str, ((num2 != null ? num2.longValue() : 0L) - longValue) * 1000, longValue * 1000);
    }

    public static C0781a b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C0781a(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e7) {
            Log.e("b4.a", "Could not deserialize token: " + e7.getMessage());
            return null;
        }
    }
}
