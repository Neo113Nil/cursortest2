package com.ironsource;

import com.ironsource.C4531m8;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class V9 {

    /* renamed from: a, reason: collision with root package name */
    static String f7967a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        return jSONObject.optBoolean("rewarded") ? f7967a + jSONObject.optString("name") : jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(J9 j9) {
        if (j9.i()) {
            return C4531m8.e.Banner.toString();
        }
        if (j9.n()) {
            return C4531m8.e.RewardedVideo.toString();
        }
        return C4531m8.e.Interstitial.toString();
    }
}
