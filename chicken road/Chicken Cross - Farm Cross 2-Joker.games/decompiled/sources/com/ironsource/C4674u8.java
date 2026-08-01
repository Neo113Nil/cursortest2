package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.B5;
import com.ironsource.C4531m8;
import com.ironsource.C4620r8;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4674u8 {
    public static C4620r8 a(Context context, String str, String str2, String str3, Map<String, String> map) throws Exception {
        C4620r8.a aVar = new C4620r8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.d(map.get("sessionid"));
        }
        aVar.a(context);
        aVar.b(str3);
        return aVar.e(str).a(str2).a();
    }

    public static B5 a(JSONObject jSONObject) {
        return new B5.a(jSONObject.optString(C4761z5.r)).b().b(jSONObject.optBoolean("enabled")).a(new C4638s8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", C4761z5.M));
        arrayList.add(new Pair<>("charset", C4761z5.O));
        return arrayList;
    }

    public static boolean a(Q4 q4) {
        if (q4 == null || q4.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(q4.g().get("inAppBidding"));
    }

    public static C4531m8.e a(Q4 q4, C4531m8.e eVar) {
        if (q4 == null || q4.g() == null || q4.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(q4.g().get("rewarded"))) {
            return C4531m8.e.RewardedVideo;
        }
        return C4531m8.e.Interstitial;
    }
}
