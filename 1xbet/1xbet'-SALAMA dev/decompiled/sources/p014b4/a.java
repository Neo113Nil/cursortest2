package p014b4;

import P6.b;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10128c;

    public a(String str, long j, long j3) {
        D.e(str);
        this.f10126a = str;
        this.f10128c = j;
        this.f10127b = j3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[Catch: UnsupportedEncodingException -> 0x006c, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x006c, blocks: (B:6:0x0025, B:19:0x0067, B:14:0x0049, B:16:0x005e, B:17:0x0061, B:9:0x003a, B:11:0x0043), top: B:35:0x0025, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    public static a a(String str) {
        Map mapEmptyMap;
        D.i(str);
        D.e(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            Log.e("FirebaseAppCheck", "Invalid token (too few subsections):\n".concat(str), null);
            mapEmptyMap = Collections.emptyMap();
        } else {
            try {
                String str2 = new String(Base64.decode(strArrSplit[1], 11), "UTF-8");
                if (TextUtils.isEmpty(str2)) {
                    mapEmptyMap = null;
                    if (mapEmptyMap == null) {
                        mapEmptyMap = Collections.emptyMap();
                    }
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject != JSONObject.NULL) {
                            mapEmptyMap = b.Q(jSONObject);
                        } else {
                            mapEmptyMap = null;
                        }
                    } catch (Exception e7) {
                        String str3 = "Failed to parse JSONObject into Map:\n" + e7;
                        if (Log.isLoggable("FirebaseAppCheck", 3)) {
                            Log.d("FirebaseAppCheck", str3, null);
                        }
                        mapEmptyMap = Collections.emptyMap();
                    }
                    if (mapEmptyMap == null) {
                        mapEmptyMap = Collections.emptyMap();
                    }
                }
            } catch (UnsupportedEncodingException e8) {
                Log.e("FirebaseAppCheck", "Unable to decode token (charset unknown):\n" + e8, null);
                mapEmptyMap = Collections.emptyMap();
            }
        }
        D.i(mapEmptyMap);
        D.e("iat");
        Integer num = (Integer) mapEmptyMap.get("iat");
        long jLongValue = num == null ? 0L : num.longValue();
        D.e("exp");
        Integer num2 = (Integer) mapEmptyMap.get("exp");
        return new a(str, ((num2 != null ? num2.longValue() : 0L) - jLongValue) * 1000, jLongValue * 1000);
    }

    public static a b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new a(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e7) {
            Log.e("b4.a", "Could not deserialize token: " + e7.getMessage());
            return null;
        }
    }
}
