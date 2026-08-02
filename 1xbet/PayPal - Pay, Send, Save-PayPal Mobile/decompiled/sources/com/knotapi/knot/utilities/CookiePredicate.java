package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class CookiePredicate {
    public static final java.lang.String TAG = "Knot:CookiePredicate";

    public static boolean checkPredicateCookiesFound(java.util.List<com.knotapi.knot.utilities.Cookie> list, java.lang.String str) {
        int i;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (0; i < jSONArray.length(); i + 1) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                java.lang.String optString = jSONObject.optString("name");
                java.lang.String optString2 = jSONObject.optString("domain");
                java.lang.String optString3 = jSONObject.optString(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile(optString);
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile(optString2);
                java.util.regex.Pattern compile3 = !optString3.isEmpty() ? java.util.regex.Pattern.compile(optString3) : null;
                for (com.knotapi.knot.utilities.Cookie cookie : list) {
                    i = (compile.matcher(cookie.getName()).matches() && compile2.matcher(cookie.getDomain()).matches() && (compile3 == null || compile3.matcher(cookie.getValue()).matches())) ? i + 1 : 0;
                }
                return false;
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static java.lang.Boolean isUserLoggedIn(com.knotapi.knot.models.Bot bot, java.util.List<com.knotapi.knot.utilities.Cookie> list) {
        return java.lang.Boolean.valueOf(checkPredicateCookiesFound(list, bot.getLoggedInPredicate()));
    }
}
