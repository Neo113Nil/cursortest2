package com.adjust.sdk;

/* loaded from: classes7.dex */
public class SharedPreferencesManager {
    private static final int INDEX_CLICK_TIME = 1;
    private static final int INDEX_IS_SENDING = 2;
    private static final int INDEX_RAW_REFERRER = 0;
    private static final java.lang.String PREFS_KEY_CONTROL_PARAMS = "control_params";
    private static final java.lang.String PREFS_KEY_DEEPLINK_CLICK_TIME = "deeplink_click_time";
    private static final java.lang.String PREFS_KEY_DEEPLINK_REFERRER = "deeplink_referrer";
    private static final java.lang.String PREFS_KEY_DEEPLINK_URL = "deeplink_url";
    private static final java.lang.String PREFS_KEY_DEEPLINK_URL_CACHED = "deeplink_url_cached";
    private static final java.lang.String PREFS_KEY_GDPR_FORGET_ME = "gdpr_forget_me";
    private static final java.lang.String PREFS_KEY_INSTALL_TRACKED = "install_tracked";
    private static final java.lang.String PREFS_KEY_LVL_TRACKED = "lvl_tracked";
    private static final java.lang.String PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS = "preinstall_payload_read_status";
    private static final java.lang.String PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER = "preinstall_system_installer_referrer";
    private static final java.lang.String PREFS_KEY_PUSH_TOKEN = "push_token";
    private static final java.lang.String PREFS_KEY_RAW_REFERRERS = "raw_referrers";
    private static final java.lang.String PREFS_NAME = "adjust_preferences";
    private static final int REFERRERS_COUNT = 10;
    private static com.adjust.sdk.SharedPreferencesManager defaultInstance;
    private static android.content.SharedPreferences sharedPreferences;
    private static android.content.SharedPreferences.Editor sharedPreferencesEditor;

    private SharedPreferencesManager(android.content.Context context) {
        try {
            android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences(PREFS_NAME, 0);
            sharedPreferences = sharedPreferences2;
            sharedPreferencesEditor = sharedPreferences2.edit();
        } catch (java.lang.Exception e) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Cannot access to SharedPreferences", e.getMessage());
            sharedPreferences = null;
            sharedPreferencesEditor = null;
        }
    }

    private boolean getBoolean(java.lang.String str, boolean z) {
        synchronized (this) {
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                try {
                    return sharedPreferences2.getBoolean(str, z);
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return z;
        }
    }

    public static com.adjust.sdk.SharedPreferencesManager getDefaultInstance(android.content.Context context) {
        com.adjust.sdk.SharedPreferencesManager sharedPreferencesManager;
        synchronized (com.adjust.sdk.SharedPreferencesManager.class) {
            if (defaultInstance == null) {
                defaultInstance = new com.adjust.sdk.SharedPreferencesManager(context);
            }
            sharedPreferencesManager = defaultInstance;
        }
        return sharedPreferencesManager;
    }

    private long getLong(java.lang.String str, long j) {
        synchronized (this) {
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                try {
                    return sharedPreferences2.getLong(str, j);
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return j;
        }
    }

    private int getRawReferrerIndex(java.lang.String str, long j) {
        synchronized (this) {
            try {
                org.json.JSONArray rawReferrerArray = getRawReferrerArray();
                for (int i = 0; i < rawReferrerArray.length(); i++) {
                    org.json.JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                    java.lang.String optString = jSONArray.optString(0, null);
                    if (optString != null && optString.equals(str) && jSONArray.optLong(1, -1L) == j) {
                        return i;
                    }
                }
            } catch (org.json.JSONException unused) {
            }
            return -1;
        }
    }

    private java.lang.String getString(java.lang.String str) {
        synchronized (this) {
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                return null;
            }
            try {
                return sharedPreferences2.getString(str, null);
            } catch (java.lang.ClassCastException unused) {
                return null;
            } catch (java.lang.Throwable unused2) {
                if (str.equals(PREFS_KEY_RAW_REFERRERS)) {
                    remove(PREFS_KEY_RAW_REFERRERS);
                }
                return null;
            }
        }
    }

    private void remove(java.lang.String str) {
        synchronized (this) {
            android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
            if (editor != null) {
                editor.remove(str).apply();
            }
        }
    }

    private void saveBoolean(java.lang.String str, boolean z) {
        synchronized (this) {
            android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
            if (editor != null) {
                editor.putBoolean(str, z).apply();
            }
        }
    }

    private void saveInteger(java.lang.String str, int i) {
        synchronized (this) {
            android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
            if (editor != null) {
                editor.putInt(str, i).apply();
            }
        }
    }

    private void saveLong(java.lang.String str, long j) {
        synchronized (this) {
            android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
            if (editor != null) {
                editor.putLong(str, j).apply();
            }
        }
    }

    private void saveString(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
            if (editor != null) {
                editor.putString(str, str2).apply();
            }
        }
    }

    public void cacheDeeplink(android.net.Uri uri) {
        synchronized (this) {
            if (uri == null) {
                return;
            }
            saveString(PREFS_KEY_DEEPLINK_URL_CACHED, uri.toString());
        }
    }

    public void clear() {
        synchronized (this) {
            android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
            if (editor != null) {
                editor.clear().apply();
            }
        }
    }

    public java.lang.String getCachedDeeplink() {
        java.lang.String string;
        synchronized (this) {
            string = getString(PREFS_KEY_DEEPLINK_URL_CACHED);
        }
        return string;
    }

    public org.json.JSONObject getControlParamsJson() {
        synchronized (this) {
            java.lang.String string = getString(PREFS_KEY_CONTROL_PARAMS);
            if (string != null) {
                try {
                    return new org.json.JSONObject(string);
                } catch (java.lang.Throwable unused) {
                }
            }
            return null;
        }
    }

    public long getDeeplinkClickTime() {
        long j;
        synchronized (this) {
            j = getLong(PREFS_KEY_DEEPLINK_CLICK_TIME, -1L);
        }
        return j;
    }

    public java.lang.String getDeeplinkReferrer() {
        java.lang.String string;
        synchronized (this) {
            string = getString(PREFS_KEY_DEEPLINK_REFERRER);
        }
        return string;
    }

    public java.lang.String getDeeplinkUrl() {
        java.lang.String string;
        synchronized (this) {
            string = getString(PREFS_KEY_DEEPLINK_URL);
        }
        return string;
    }

    public boolean getGdprForgetMe() {
        boolean z;
        synchronized (this) {
            z = getBoolean(PREFS_KEY_GDPR_FORGET_ME, false);
        }
        return z;
    }

    public boolean getInstallTracked() {
        boolean z;
        synchronized (this) {
            z = getBoolean(PREFS_KEY_INSTALL_TRACKED, false);
        }
        return z;
    }

    public boolean getLicenseVerificationTracked() {
        boolean z;
        synchronized (this) {
            z = getBoolean(PREFS_KEY_LVL_TRACKED, false);
        }
        return z;
    }

    public long getPreinstallPayloadReadStatus() {
        long j;
        synchronized (this) {
            j = getLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, 0L);
        }
        return j;
    }

    public java.lang.String getPreinstallReferrer() {
        java.lang.String string;
        synchronized (this) {
            string = getString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
        }
        return string;
    }

    public java.lang.String getPushToken() {
        java.lang.String string;
        synchronized (this) {
            string = getString(PREFS_KEY_PUSH_TOKEN);
        }
        return string;
    }

    public org.json.JSONArray getRawReferrer(java.lang.String str, long j) {
        synchronized (this) {
            int rawReferrerIndex = getRawReferrerIndex(str, j);
            if (rawReferrerIndex >= 0) {
                try {
                    return getRawReferrerArray().getJSONArray(rawReferrerIndex);
                } catch (org.json.JSONException unused) {
                }
            }
            return null;
        }
    }

    public org.json.JSONArray getRawReferrerArray() {
        synchronized (this) {
            java.lang.String string = getString(PREFS_KEY_RAW_REFERRERS);
            if (string != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                    if (jSONArray.length() <= 10) {
                        return new org.json.JSONArray(string);
                    }
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    for (int i = 0; i < 10; i++) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                    saveRawReferrerArray(jSONArray2);
                    return jSONArray2;
                } catch (java.lang.Throwable unused) {
                }
            }
            return new org.json.JSONArray();
        }
    }

    public void removeDeeplink() {
        synchronized (this) {
            remove(PREFS_KEY_DEEPLINK_URL);
            remove(PREFS_KEY_DEEPLINK_REFERRER);
            remove(PREFS_KEY_DEEPLINK_CLICK_TIME);
        }
    }

    public void removeGdprForgetMe() {
        synchronized (this) {
            remove(PREFS_KEY_GDPR_FORGET_ME);
        }
    }

    public void removePreinstallReferrer() {
        synchronized (this) {
            remove(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
        }
    }

    public void removePushToken() {
        synchronized (this) {
            remove(PREFS_KEY_PUSH_TOKEN);
        }
    }

    public void removeRawReferrer(java.lang.String str, long j) {
        int rawReferrerIndex;
        synchronized (this) {
            if (str != null) {
                if (str.length() != 0 && (rawReferrerIndex = getRawReferrerIndex(str, j)) >= 0) {
                    org.json.JSONArray rawReferrerArray = getRawReferrerArray();
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    for (int i = 0; i < rawReferrerArray.length(); i++) {
                        if (i != rawReferrerIndex) {
                            try {
                                jSONArray.put(rawReferrerArray.getJSONArray(i));
                            } catch (org.json.JSONException unused) {
                            }
                        }
                    }
                    saveString(PREFS_KEY_RAW_REFERRERS, jSONArray.toString());
                }
            }
        }
    }

    public void saveControlParams(org.json.JSONObject jSONObject) {
        synchronized (this) {
            try {
                saveString(PREFS_KEY_CONTROL_PARAMS, jSONObject.toString());
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void saveDeeplink(com.adjust.sdk.AdjustDeeplink adjustDeeplink, long j) {
        synchronized (this) {
            if (adjustDeeplink != null) {
                android.net.Uri uri = adjustDeeplink.url;
                if (uri != null) {
                    saveString(PREFS_KEY_DEEPLINK_URL, uri.toString());
                    saveLong(PREFS_KEY_DEEPLINK_CLICK_TIME, j);
                    android.net.Uri uri2 = adjustDeeplink.referrer;
                    if (uri2 != null) {
                        saveString(PREFS_KEY_DEEPLINK_REFERRER, uri2.toString());
                    }
                }
            }
        }
    }

    public void savePreinstallReferrer(java.lang.String str) {
        synchronized (this) {
            saveString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER, str);
        }
    }

    public void savePushToken(java.lang.String str) {
        synchronized (this) {
            saveString(PREFS_KEY_PUSH_TOKEN, str);
        }
    }

    public void saveRawReferrer(java.lang.String str, long j) {
        synchronized (this) {
            try {
                if (getRawReferrer(str, j) == null) {
                    org.json.JSONArray rawReferrerArray = getRawReferrerArray();
                    if (rawReferrerArray.length() != 10) {
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        jSONArray.put(0, str);
                        jSONArray.put(1, j);
                        jSONArray.put(2, 0);
                        rawReferrerArray.put(jSONArray);
                        saveRawReferrerArray(rawReferrerArray);
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
    }

    public void saveRawReferrerArray(org.json.JSONArray jSONArray) {
        synchronized (this) {
            try {
                saveString(PREFS_KEY_RAW_REFERRERS, jSONArray.toString());
            } catch (java.lang.Throwable unused) {
                remove(PREFS_KEY_RAW_REFERRERS);
            }
        }
    }

    public void setGdprForgetMe() {
        synchronized (this) {
            saveBoolean(PREFS_KEY_GDPR_FORGET_ME, true);
        }
    }

    public void setInstallTracked() {
        synchronized (this) {
            saveBoolean(PREFS_KEY_INSTALL_TRACKED, true);
        }
    }

    public void setLicenseVerificationTracked() {
        synchronized (this) {
            saveBoolean(PREFS_KEY_LVL_TRACKED, true);
        }
    }

    public void setPreinstallPayloadReadStatus(long j) {
        synchronized (this) {
            saveLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, j);
        }
    }

    public void setSendingReferrersAsNotSent() {
        synchronized (this) {
            try {
                org.json.JSONArray rawReferrerArray = getRawReferrerArray();
                boolean z = false;
                for (int i = 0; i < rawReferrerArray.length(); i++) {
                    org.json.JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                    if (jSONArray.optInt(2, -1) == 1) {
                        jSONArray.put(2, 0);
                        z = true;
                    }
                }
                if (z) {
                    saveRawReferrerArray(rawReferrerArray);
                }
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
