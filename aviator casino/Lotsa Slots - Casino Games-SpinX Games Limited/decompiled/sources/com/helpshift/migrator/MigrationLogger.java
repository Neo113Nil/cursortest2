package com.helpshift.migrator;

/* loaded from: classes2.dex */
public class MigrationLogger {
    public static final java.lang.String ERROR_LOG_ARRAY_KEY = "error_logs";
    private final com.helpshift.storage.ISharedPreferencesStore sharedPreferences;

    public MigrationLogger(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore) {
        this.sharedPreferences = iSharedPreferencesStore;
    }

    public void e(java.lang.String str, java.lang.String str2) {
        e(str, str2, null);
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.helpshift.log.HSPreInstallLogger.e(str, str2, th);
        try {
            java.lang.String stackTrace = com.helpshift.log.HSPreInstallLogger.getStackTrace(th);
            java.lang.String string = this.sharedPreferences.getString(ERROR_LOG_ARRAY_KEY);
            org.json.JSONArray jSONArray = com.helpshift.util.Utils.isEmpty(string) ? new org.json.JSONArray() : new org.json.JSONArray(string);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.ironsource.C4.a.d, java.lang.System.currentTimeMillis());
            jSONObject.put("message", str2);
            jSONObject.put("error", stackTrace);
            jSONArray.put(jSONObject);
            this.sharedPreferences.putString(ERROR_LOG_ARRAY_KEY, jSONArray.toString());
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSPreInstallLogger.e("Helpshift_mgrtLog", "Error setting error logs in prefs", e);
        }
    }

    public void d(java.lang.String str, java.lang.String str2) {
        com.helpshift.log.HSPreInstallLogger.d(str, str2);
    }
}
