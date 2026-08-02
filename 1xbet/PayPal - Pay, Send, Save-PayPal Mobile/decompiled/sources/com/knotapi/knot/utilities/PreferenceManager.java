package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class PreferenceManager {
    public static final java.lang.String PREF_CLIENT_COOKIES = "client_cookies";
    public static final java.lang.String PREF_INTERNET_SPEED = "internet_speed";
    public static final java.lang.String PREF_SDK_LOAD_TIME = "sdk_load_time";
    public static final java.lang.String PREF_SETTINGS = "settings";
    public static final java.lang.String TAG = "Knot:PreferenceManager";
    private final java.lang.String DEFAULT_PREF_FILE_NAME = "knotapi_sdk";

    public static java.lang.String getGoogleAuthPattern(android.content.Context context, java.lang.String str) {
        try {
            com.knotapi.knot.utilities.PreferenceManager preferenceManager = new com.knotapi.knot.utilities.PreferenceManager();
            if (preferenceManager.getString(context, "settings", "").isEmpty()) {
                return com.knotapi.knot.utilities.Constants.google_auth_pattern;
            }
            java.lang.String optString = new org.json.JSONObject(new org.json.JSONObject(preferenceManager.getString(context, "settings", "")).optString(str)).optString("user_id_page_pattern");
            return !optString.isEmpty() ? optString : com.knotapi.knot.utilities.Constants.google_auth_pattern;
        } catch (org.json.JSONException unused) {
            return com.knotapi.knot.utilities.Constants.google_auth_pattern;
        }
    }

    public static java.lang.String getUserAgent(android.content.Context context, java.lang.String str, java.lang.Boolean bool) {
        try {
            com.knotapi.knot.utilities.PreferenceManager preferenceManager = new com.knotapi.knot.utilities.PreferenceManager();
            if (!preferenceManager.getString(context, "settings", "").isEmpty()) {
                java.lang.String optString = new org.json.JSONObject(new org.json.JSONObject(preferenceManager.getString(context, "settings", "")).optString(str)).optString("user_agent");
                if (!optString.isEmpty()) {
                    return optString;
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return bool.booleanValue() ? com.knotapi.knot.utilities.Constants.operaPopupUserAgent : com.knotapi.knot.utilities.Constants.operaUserAgent;
    }

    public void deletePrefData(android.content.Context context) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(context, "knotapi_sdk").edit();
        edit.remove("settings");
        edit.apply();
    }

    public android.content.SharedPreferences getSharedPreferences(android.content.Context context, java.lang.String str) {
        return context.getSharedPreferences(str, 0);
    }

    public java.lang.String getString(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return getSharedPreferences(context, "knotapi_sdk").getString(str, str2);
    }

    public java.lang.String internetSpeed(android.content.Context context) {
        java.lang.String string;
        try {
            string = new com.knotapi.knot.utilities.PreferenceManager().getString(context, PREF_INTERNET_SPEED, "");
        } catch (java.lang.Exception unused) {
        }
        return !string.isEmpty() ? string : "";
    }

    public void saveString(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(context, "knotapi_sdk").edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
