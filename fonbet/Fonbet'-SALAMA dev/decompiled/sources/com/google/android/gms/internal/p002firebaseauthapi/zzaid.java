package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import e1.k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import w1.L;

/* loaded from: classes.dex */
public final class zzaid {
    public static zzabg zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder l7 = k.l("Failed to parse ", str, " for string [", str2, "] with exception: ");
        l7.append(message);
        Log.e(str, l7.toString());
        return new zzabg(L.j("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List<String> zza(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                arrayList.add(jSONArray.getString(i7));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
