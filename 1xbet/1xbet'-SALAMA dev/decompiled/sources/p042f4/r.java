package p042f4;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzx;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p062i3.a;
import p122r.b;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12968a = new a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object objC = jSONArray.get(i7);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        D.e(str);
        List<String> listZza = zzx.zza('.').zza((CharSequence) str);
        int size = listZza.size();
        a aVar = f12968a;
        if (size < 2) {
            aVar.c(L.i("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = listZza.get(1);
        try {
            b bVarD = d(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return bVarD == null ? new HashMap() : bVarD;
        } catch (UnsupportedEncodingException e7) {
            aVar.b("Unable to decode token", e7, new Object[0]);
            return new HashMap();
        }
    }

    public static b c(JSONObject jSONObject) throws JSONException {
        b bVar = new b();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            bVar.put(next, objC);
        }
        return bVar;
    }

    public static b d(String str) {
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
