package com.helpshift.storage;

/* loaded from: classes5.dex */
public class HSPersistentStorage {
    private static final java.lang.String ACTIVE_USER = "active_user";
    private static final java.lang.String ADDITIONAL_HC_DATA = "additional_hc_data";
    private static final java.lang.String ANONYMOUS_USER_ID_MAP = "anon_user_id_map";
    private static final java.lang.String APP_LAUNCH_EVENTS = "app_launch_events";
    private static final java.lang.String APP_LAUNCH_LAST_SYNC_TIMESTAMP = "app_launch_last_sync_timestamp";
    private static final java.lang.String BREADCRUMBS = "breadcrumbs";
    public static final java.lang.String CHAT_RESOURCE_CACHE_SHARED_PREF_NAME = "__hs_chat_resource_cache";
    private static final java.lang.String CLEAR_ANONYMOUS_USER = "clear_anonymous_user";
    private static final java.lang.String CONFIG = "config";
    public static final java.lang.String CURRENT_PUSH_TOKEN = "current_push_token";
    private static final java.lang.String DOMAIN = "domain";
    private static final java.lang.String ENABLE_INAPP_NOTIFICATION = "enable_inapp_notificaiton";
    private static final java.lang.String ENABLE_LOGGING_VIA_WEBCHAT = "enableLoggingViaWebchat";
    private static final java.lang.String FAILED_ANALYTICS_EVENTS = "failed_analytics_events";
    public static final java.lang.String FILE_NAME = "__hs_lite_sdk_store";
    public static final java.lang.String HC_RESOURCE_CACHE_SHARED_PREF_NAME = "__hs_helpcenter_resource_cache";
    private static final java.lang.String HELPCENTER_UI_CONFIG_DATA = "helpcenter_ui_config_data";
    private static final java.lang.String HOST = "host";
    public static final java.lang.String HS_DEVICE_ID = "hs_did";
    private static final java.lang.String HS_SDK_DATA_SYNC_STATUS = "sdkDataSyncStatus";
    public static final java.lang.String HS_SDK_VERSION = "sdkVersion";
    private static final java.lang.String IN_APP_NOTIFICATION_DATA = "in_app_notification_data";
    private static final java.lang.String LANGUAGE = "language";
    private static final java.lang.String LAST_HELPCENTER_CACHE_EVICTED_TIME = "last_helpcenter_cache_eviction_time";
    private static final java.lang.String LAST_LOGGED_OUT_USER = "last_logged_out_user";
    private static final java.lang.String LAST_PROACTIVE_NOTIFICATION_DATA = "last_proactive_notification_data";
    private static final java.lang.String LAST_REQUEST_UNREAD_COUNT_API_ACCESS = "last_unread_count_api_access";
    public static final java.lang.String LEGACY_ANALYTICS_EVENTS_IDS = "legacy_event_ids";
    private static final java.lang.String LOCAL_PROACTIVE_CONFIG = "localProactiveConfig";
    private static final java.lang.String LOCAL_STORAGE_DATA = "local_storage_data";
    private static final java.lang.String NETWORK_HEADERS = "network_headers";
    private static final java.lang.String NOTIFICATION_CHANNEL_ID = "notificationChannelId";
    private static final java.lang.String NOTIFICATION_CONTENT = "notification_content";
    private static final java.lang.String NOTIFICATION_ICON = "notificationIcon";
    private static final java.lang.String NOTIFICATION_LARGE_ICON = "notificationLargeIcon";
    private static final java.lang.String NOTIFICATION_SOUND_ID = "notificationSoundId";
    private static final java.lang.String POLLING_ROUTE = "polling_route";
    private static final java.lang.String PROACTIVE_PUSHNOTIFICATION_DEFAULTS = "proactive_pushnotification_defaults";
    private static final java.lang.String PUSH_TOKEN_SYNC_ROUTE = "push_token_sync_route";
    private static final java.lang.String RETAINED_ANON_UID_FOR_IDENTITY_USER = "retained_anon_uid_for_identity_user";
    private static final java.lang.String SCREEN_ORIENTATION = "screenOrientation";
    static final java.lang.String START_TIME = "startTime";
    public static final java.lang.String TAG = "hsPerStore";
    private static final java.lang.String USER_DATA_KEY_MAPPING = "user_data_key_mapping";
    private static final java.lang.String USER_SESSION_EXPIRY_ALERTS_ALLOWED = "user_session_expiry_alerts_allowed";
    private static final java.lang.String WEBCHAT_UI_CONFIG_DATA = "ui_config_data";
    private java.lang.String platform_id;
    private final com.helpshift.storage.ISharedPreferencesStore preferences;

    public HSPersistentStorage(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore) {
        this.preferences = iSharedPreferencesStore;
    }

    public void setDomain(java.lang.String str) {
        putString("domain", str);
    }

    public java.lang.String getDomain() {
        return getString("domain");
    }

    public void setSdkVersion(java.lang.String str) {
        putString("sdkVersion", str);
    }

    public java.lang.String getSdkVersion() {
        return getString("sdkVersion");
    }

    public void setSDKDataSyncStatus(java.lang.String str) {
        putString(HS_SDK_DATA_SYNC_STATUS, str);
    }

    public java.lang.String getSDKDataSyncStatus() {
        return getString(HS_SDK_DATA_SYNC_STATUS);
    }

    public void setHost(java.lang.String str) {
        putString(HOST, str);
    }

    public java.lang.String getHost() {
        return getString(HOST);
    }

    public void setPlatformId(java.lang.String str) {
        this.platform_id = str;
    }

    public java.lang.String getPlatformId() {
        return this.platform_id;
    }

    public void setActiveUser(java.lang.String str) {
        putString(ACTIVE_USER, str);
    }

    public java.lang.String getActiveUser() {
        return getString(ACTIVE_USER);
    }

    public void removeActiveUser() {
        this.preferences.remove(ACTIVE_USER);
    }

    public void setConfig(java.lang.String str) {
        putString("config", str);
    }

    public java.lang.String getConfig() {
        return getString("config");
    }

    public void setLocalProactiveConfig(java.lang.String str) {
        putString(LOCAL_PROACTIVE_CONFIG, str);
    }

    public java.lang.String getLocalProactiveConfig() {
        return getString(LOCAL_PROACTIVE_CONFIG);
    }

    public void setProactivePushNotificationDefaults(java.lang.String str) {
        putString(PROACTIVE_PUSHNOTIFICATION_DEFAULTS, str);
    }

    public java.lang.String getProactivePushNotificationDefaults() {
        return getString(PROACTIVE_PUSHNOTIFICATION_DEFAULTS);
    }

    public void storeInAppNotificationData(java.lang.String str) {
        putString(IN_APP_NOTIFICATION_DATA, str);
    }

    public java.lang.String getInAppNotificationData() {
        return getString(IN_APP_NOTIFICATION_DATA);
    }

    public void storeLastProactiveNotificationData(java.lang.String str) {
        putString(LAST_PROACTIVE_NOTIFICATION_DATA, str);
    }

    public java.lang.String getLastProactiveNotificationData() {
        return getString(LAST_PROACTIVE_NOTIFICATION_DATA);
    }

    public void setLanguage(java.lang.String str) {
        putString(LANGUAGE, str);
    }

    public java.lang.String getLanguage() {
        return getString(LANGUAGE);
    }

    public void saveLocalStorageData(java.lang.String str) {
        putString(LOCAL_STORAGE_DATA, str);
    }

    public java.lang.String getLocalStorageData() {
        return getString(LOCAL_STORAGE_DATA);
    }

    public void saveAdditionalHelpcenterData(java.lang.String str) {
        putString(ADDITIONAL_HC_DATA, str);
    }

    public java.lang.String getAdditionalHelpcenterData() {
        return getString(ADDITIONAL_HC_DATA);
    }

    public void setCurrentPushToken(java.lang.String str) {
        putString(CURRENT_PUSH_TOKEN, str);
    }

    public java.lang.String getCurrentPushToken() {
        return getString(CURRENT_PUSH_TOKEN);
    }

    public void setClearAnonymousUser(boolean z) {
        putBoolean(CLEAR_ANONYMOUS_USER, z);
    }

    public boolean isClearAnonymousUser() {
        return getBoolean(CLEAR_ANONYMOUS_USER);
    }

    public int getNotificationSoundId() {
        return getInt("notificationSoundId");
    }

    public java.lang.String getNotificationChannelId() {
        return getString("notificationChannelId");
    }

    public int getNotificationIcon() {
        return getInt("notificationIcon");
    }

    public int getNotificationLargeIcon() {
        return getInt("notificationLargeIcon");
    }

    public void setNotificationSoundId(int i) {
        putInt("notificationSoundId", i);
    }

    public void setNotificationChannelId(java.lang.String str) {
        putString("notificationChannelId", str);
    }

    public void setNotificationIcon(int i) {
        putInt("notificationIcon", i);
    }

    public void setNotificationLargeIcon(int i) {
        putInt("notificationLargeIcon", i);
    }

    public void setEnableInAppNotification(boolean z) {
        putBoolean(ENABLE_INAPP_NOTIFICATION, z);
    }

    public boolean getEnableInAppNotification() {
        return getBoolean(ENABLE_INAPP_NOTIFICATION);
    }

    public void setRequestedScreenOrientation(int i) {
        putInt("screenOrientation", i);
    }

    public int getRequestedScreenOrientation() {
        return getInt("screenOrientation");
    }

    public void setWebchatUiConfigData(java.lang.String str) {
        putString(WEBCHAT_UI_CONFIG_DATA, str);
    }

    public java.lang.String getWebchatUiConfigData() {
        return getString(WEBCHAT_UI_CONFIG_DATA);
    }

    public void setHelpcenterUiConfigData(java.lang.String str) {
        putString(HELPCENTER_UI_CONFIG_DATA, str);
    }

    public java.lang.String getHelpcenterUiConfigData() {
        return getString(HELPCENTER_UI_CONFIG_DATA);
    }

    public java.lang.String getHsDeviceId() {
        return getString(HS_DEVICE_ID);
    }

    public void setHsDeviceId(java.lang.String str) {
        putString(HS_DEVICE_ID, str);
    }

    public long getLastSuccessfulAppLaunchEventSyncTime() {
        return getLong(APP_LAUNCH_LAST_SYNC_TIMESTAMP);
    }

    public void setLastAppLaunchEventSyncTime(long j) {
        putLong(APP_LAUNCH_LAST_SYNC_TIMESTAMP, j);
    }

    public java.lang.String getStoredEvents() {
        return getString(APP_LAUNCH_EVENTS);
    }

    public void storeEvents(java.lang.String str) {
        putString(APP_LAUNCH_EVENTS, str);
    }

    public void clearStoredEvents() {
        this.preferences.remove(APP_LAUNCH_EVENTS);
    }

    public void storeUserDataKeyMapping(java.lang.String str) {
        putString(USER_DATA_KEY_MAPPING, str);
    }

    public void storeNotificationContent(java.lang.String str) {
        putString(NOTIFICATION_CONTENT, str);
    }

    public void storeNetworkHeaders(java.lang.String str) {
        putString(NETWORK_HEADERS, str);
    }

    public void storePushTokenRoute(java.lang.String str) {
        putString(PUSH_TOKEN_SYNC_ROUTE, str);
    }

    public void storePollingRoute(java.lang.String str) {
        putString(POLLING_ROUTE, str);
    }

    public void storeAnonymousUserIdMap(java.lang.String str) {
        putString(ANONYMOUS_USER_ID_MAP, str);
    }

    public java.lang.String getAnonymousUserIdMap() {
        return getString(ANONYMOUS_USER_ID_MAP);
    }

    public void removeAnonymousUserIdMap() {
        this.preferences.remove(ANONYMOUS_USER_ID_MAP);
    }

    public java.lang.String getNetworkHeaders() {
        return getString(NETWORK_HEADERS);
    }

    public java.lang.String getPollingRoute() {
        return getString(POLLING_ROUTE);
    }

    public java.lang.String getPushTokenSyncRoute() {
        return getString(PUSH_TOKEN_SYNC_ROUTE);
    }

    public java.lang.String getNotificationContent() {
        return getString(NOTIFICATION_CONTENT);
    }

    public java.lang.String getUserDataKeyMapping() {
        return getString(USER_DATA_KEY_MAPPING);
    }

    public void setFailedAnalyticsEvents(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new org.json.JSONArray();
        }
        putString(FAILED_ANALYTICS_EVENTS, jSONArray.toString());
    }

    public void setLastRequestUnreadCountApiAccess(long j) {
        putLong(LAST_REQUEST_UNREAD_COUNT_API_ACCESS, j);
    }

    public long getLastRequestUnreadCountApiAccess() {
        return getLong(LAST_REQUEST_UNREAD_COUNT_API_ACCESS);
    }

    public org.json.JSONArray getFailedAnalyticsEvents() {
        try {
            java.lang.String string = getString(FAILED_ANALYTICS_EVENTS);
            if (com.helpshift.util.Utils.isEmpty(string)) {
                return new org.json.JSONArray();
            }
            return new org.json.JSONArray(string);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting failed events", e);
            return new org.json.JSONArray();
        }
    }

    public void setBreadCrumbs(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str)) {
            str = new org.json.JSONArray().toString();
        }
        putString(BREADCRUMBS, str);
    }

    public org.json.JSONArray getBreadCrumbs() throws org.json.JSONException {
        try {
            java.lang.String string = getString(BREADCRUMBS);
            if (!com.helpshift.util.Utils.isEmpty(string)) {
                return new org.json.JSONArray(string);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error Getting BreadCrumbs", e);
        }
        return new org.json.JSONArray();
    }

    public void setLastHCCacheEvictedTime(long j) {
        putLong(LAST_HELPCENTER_CACHE_EVICTED_TIME, j);
    }

    public long getLastHCCacheEvictedTime() {
        return getLong(LAST_HELPCENTER_CACHE_EVICTED_TIME);
    }

    void setEnableLoggingViaWebchat(java.lang.String str) {
        putString(ENABLE_LOGGING_VIA_WEBCHAT, str);
    }

    public boolean getEnableLoggingViaWebchat() {
        java.lang.String string;
        try {
            string = this.preferences.getString(ENABLE_LOGGING_VIA_WEBCHAT);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error evaluating enableLogging json from webchat", e);
        }
        if (!com.helpshift.util.Utils.isEmpty(string) && com.helpshift.util.JsonUtils.isValidJsonString(string)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            boolean optBoolean = jSONObject.optBoolean(com.ironsource.mediationsdk.metadata.a.j, false);
            long optLong = jSONObject.optLong(START_TIME, 0L);
            if (java.lang.System.currentTimeMillis() - optLong < jSONObject.optLong("ttl", 0L)) {
                return optBoolean;
            }
            this.preferences.remove(ENABLE_LOGGING_VIA_WEBCHAT);
            return false;
        }
        return false;
    }

    public boolean isUserSessionExpiryAlertsAllowed() {
        return getBoolean(USER_SESSION_EXPIRY_ALERTS_ALLOWED);
    }

    public void shouldAllowUserSessionExpiryAlerts(boolean z) {
        putBoolean(USER_SESSION_EXPIRY_ALERTS_ALLOWED, z);
    }

    public void saveLoggedOutUser(java.lang.String str) {
        putString(LAST_LOGGED_OUT_USER, str);
    }

    public java.lang.String getLastLoggedOutUser() {
        return getString(LAST_LOGGED_OUT_USER);
    }

    public void retainAnonUidForIdentityUser(java.lang.String str) {
        putString(RETAINED_ANON_UID_FOR_IDENTITY_USER, str);
    }

    public java.lang.String getRetainedAnonUidForIdentityUser() {
        return getString(RETAINED_ANON_UID_FOR_IDENTITY_USER);
    }

    private void putLong(java.lang.String str, long j) {
        this.preferences.putLong(str, j);
    }

    private long getLong(java.lang.String str) {
        return this.preferences.getLong(str);
    }

    private void putInt(java.lang.String str, int i) {
        this.preferences.putInt(str, i);
    }

    private int getInt(java.lang.String str) {
        return this.preferences.getInt(str);
    }

    private void putBoolean(java.lang.String str, boolean z) {
        this.preferences.putBoolean(str, z);
    }

    private boolean getBoolean(java.lang.String str) {
        return this.preferences.getBoolean(str);
    }

    public void putString(java.lang.String str, java.lang.String str2) {
        this.preferences.putString(str, str2);
    }

    public java.lang.String getString(java.lang.String str) {
        return this.preferences.getString(str);
    }
}
