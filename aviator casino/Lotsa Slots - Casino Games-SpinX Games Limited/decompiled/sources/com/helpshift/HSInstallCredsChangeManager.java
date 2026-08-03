package com.helpshift;

/* loaded from: classes4.dex */
public class HSInstallCredsChangeManager {
    public static final java.lang.String HS_CREDS_PREFS_FILE_NAME = "__hs_install_creds_store";
    private static final java.lang.String HS_INSTALL_CREDS_HASH = "hs_sdkx_install_creds_hash";
    private static final java.lang.String TAG = "HSCredsChangeManager";

    private HSInstallCredsChangeManager() {
    }

    public static void changeInstallCredentials(java.lang.String str, java.lang.String str2, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore2, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore3, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore4, java.io.File file, java.io.File file2) {
        try {
            java.lang.String platformIdDomainHash = getPlatformIdDomainHash(str, str2);
            java.lang.String string = iSharedPreferencesStore.getString(HS_INSTALL_CREDS_HASH);
            if (com.helpshift.util.Utils.isEmpty(string)) {
                com.helpshift.log.HSPreInstallLogger.d(TAG, "No stored credentials found, Saving current Credentials in storage, Continue install call");
                iSharedPreferencesStore.putString(HS_INSTALL_CREDS_HASH, platformIdDomainHash);
                return;
            }
            if (platformIdDomainHash.equals(string)) {
                com.helpshift.log.HSPreInstallLogger.d(TAG, "Current Credentials matches with stored credentials, Continue install call");
                return;
            }
            com.helpshift.log.HSPreInstallLogger.w(TAG, "Credentials Changed, Deleting old SDK data");
            java.lang.String extractDeviceId = extractDeviceId(iSharedPreferencesStore2);
            java.lang.String extractPusToken = extractPusToken(iSharedPreferencesStore2);
            clearSDKData(file, file2, iSharedPreferencesStore2, iSharedPreferencesStore3, iSharedPreferencesStore4);
            iSharedPreferencesStore.putString(HS_INSTALL_CREDS_HASH, platformIdDomainHash);
            com.helpshift.log.HSPreInstallLogger.d(TAG, "New credentials updated in storage");
            restoreDeviceId(iSharedPreferencesStore2, extractDeviceId);
            restorePushToken(iSharedPreferencesStore2, extractPusToken);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSPreInstallLogger.e(TAG, "Failed to update install credentials", e);
        }
    }

    private static void clearSDKData(java.io.File file, java.io.File file2, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore2, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore3) {
        clearSDKSharedPreferences(iSharedPreferencesStore, iSharedPreferencesStore2, iSharedPreferencesStore3);
        deleteHelpshiftCachedDirectory(file);
        deleteHelpshiftDebugLogs(file2);
    }

    private static void deleteHelpshiftDebugLogs(java.io.File file) {
        com.helpshift.log.HSPreInstallLogger.w(TAG, "Deleting Helpshift debug logs");
        com.helpshift.util.FileUtil.deleteDir(new java.io.File(file, "helpshift").getAbsolutePath());
    }

    private static void deleteHelpshiftCachedDirectory(java.io.File file) {
        com.helpshift.log.HSPreInstallLogger.w(TAG, "Deleting Helpshift cache directory");
        com.helpshift.util.FileUtil.deleteDir(new java.io.File(file, "helpshift").getAbsolutePath());
    }

    private static void clearSDKSharedPreferences(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore2, com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore3) {
        com.helpshift.log.HSPreInstallLogger.w(TAG, "Deleting SDK Shared Preferences store");
        iSharedPreferencesStore.clear();
        iSharedPreferencesStore2.clear();
        iSharedPreferencesStore3.clear();
    }

    private static java.lang.String extractPusToken(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore) {
        return iSharedPreferencesStore.getString(com.helpshift.storage.HSPersistentStorage.CURRENT_PUSH_TOKEN);
    }

    private static java.lang.String extractDeviceId(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore) {
        return iSharedPreferencesStore.getString(com.helpshift.storage.HSPersistentStorage.HS_DEVICE_ID);
    }

    private static void restoreDeviceId(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore, java.lang.String str) {
        if (com.helpshift.util.Utils.isNotEmpty(str)) {
            com.helpshift.log.HSPreInstallLogger.w(TAG, "Restored device_id in storage");
            iSharedPreferencesStore.putString(com.helpshift.storage.HSPersistentStorage.HS_DEVICE_ID, str);
        } else {
            com.helpshift.log.HSPreInstallLogger.e(TAG, "Device_id empty, Failed to restore device_id in storage");
        }
    }

    private static void restorePushToken(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore, java.lang.String str) {
        if (com.helpshift.util.Utils.isNotEmpty(str)) {
            com.helpshift.log.HSPreInstallLogger.w(TAG, "Restoring push token");
            iSharedPreferencesStore.putString(com.helpshift.storage.HSPersistentStorage.CURRENT_PUSH_TOKEN, str);
        }
    }

    private static java.lang.String getPlatformIdDomainHash(java.lang.String str, java.lang.String str2) {
        return com.helpshift.util.Utils.getSHAHash(str + "|" + str2);
    }
}
