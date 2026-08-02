package f4;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzx;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import i3.C1263a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final C1263a f12962a = new C1263a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        com.google.android.gms.common.internal.D.e(str);
        List<String> zza = zzx.zza('.').zza((CharSequence) str);
        int size = zza.size();
        C1263a c1263a = f12962a;
        if (size < 2) {
            c1263a.c(w1.L.i("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = zza.get(1);
        try {
            r.b d7 = d(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return d7 == null ? new HashMap() : d7;
        } catch (UnsupportedEncodingException e7) {
            c1263a.b("Unable to decode token", e7, new Object[0]);
            return new HashMap();
        }
    }

    public static r.b c(JSONObject jSONObject) {
        r.b bVar = new r.b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            bVar.put(next, obj);
        }
        return bVar;
    }

    public static r.b d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e7) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzzh(e7);
        }
    }
}
