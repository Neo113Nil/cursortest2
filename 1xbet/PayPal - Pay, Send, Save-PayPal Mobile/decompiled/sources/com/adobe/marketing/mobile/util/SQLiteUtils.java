package com.adobe.marketing.mobile.util;

/* loaded from: classes7.dex */
public class SQLiteUtils {
    private SQLiteUtils() {
    }

    public static boolean deleteDBFromCacheDir(java.lang.String str) {
        try {
            java.io.File applicationCacheDir = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
            if (applicationCacheDir != null && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
                return android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(applicationCacheDir, str));
            }
            return false;
        } catch (java.lang.Exception unused) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteUtils", "Failed to delete (%s) in cache folder.", str);
            return false;
        }
    }
}
