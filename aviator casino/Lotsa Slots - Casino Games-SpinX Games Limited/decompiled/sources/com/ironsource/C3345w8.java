package com.ironsource;

/* renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3345w8 {
    public static com.ironsource.C3291t8 a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        com.ironsource.C3291t8.a aVar = new com.ironsource.C3291t8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.d(map.get("sessionid"));
        }
        aVar.a(context);
        aVar.b(str3);
        return aVar.e(str).a(str2).a();
    }

    public static com.ironsource.D5 a(org.json.JSONObject jSONObject) {
        return new com.ironsource.D5.a(jSONObject.optString(com.ironsource.B5.r)).b().b(jSONObject.optBoolean("enabled")).a(new com.ironsource.C3309u8()).a(a()).a(false).a();
    }

    private static java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> a() {
        java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        arrayList.add(new android.util.Pair<>("Content-Type", com.ironsource.B5.M));
        arrayList.add(new android.util.Pair<>("charset", com.ironsource.B5.O));
        return arrayList;
    }

    public static boolean a(com.ironsource.T4 t4) {
        if (t4 == null || t4.g().get("inAppBidding") == null) {
            return false;
        }
        return java.lang.Boolean.parseBoolean(t4.g().get("inAppBidding"));
    }

    public static com.ironsource.C3202o8.e a(com.ironsource.T4 t4, com.ironsource.C3202o8.e eVar) {
        if (t4 == null || t4.g() == null || t4.g().get("rewarded") == null) {
            return eVar;
        }
        if (java.lang.Boolean.parseBoolean(t4.g().get("rewarded"))) {
            return com.ironsource.C3202o8.e.RewardedVideo;
        }
        return com.ironsource.C3202o8.e.Interstitial;
    }
}
