package com.helpshift.storage;

/* loaded from: classes5.dex */
public class HSGenericDataManager {
    private static final java.lang.String ENABLE_LOGGING = "enableLogging";
    private static final java.lang.String FALLBACK_NOTIFICATION_STRING = "You have new messages";
    private static final java.lang.String NETWORK_HEADERS = "network_headers";
    private static final java.lang.String NOTIFICATION_CONTENT = "notification_content";
    private static final java.lang.String POLLING_ROUTE = "polling_route";
    private static final java.lang.String PUSH_TOKEN_SYNC_ROUTE = "push_token_sync_route";
    private static final java.lang.String TAG = "genricDataMngr";
    private static final java.lang.String USER_DATA_KEY_MAPPING = "user_data_key_mapping";
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;

    public HSGenericDataManager(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        this.persistentStorage = hSPersistentStorage;
    }

    public void saveGenericSdkData(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !com.helpshift.util.JsonUtils.isValidJsonString(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            savePollingRoute(extractString(POLLING_ROUTE, jSONObject));
            savePushTokenRoute(extractString(PUSH_TOKEN_SYNC_ROUTE, jSONObject));
            saveNetworkHeaders(extractJsonObject(NETWORK_HEADERS, jSONObject));
            saveNotificationContent(extractJsonObject(NOTIFICATION_CONTENT, jSONObject));
            saveUserDataKeyMapping(extractJsonObject(USER_DATA_KEY_MAPPING, jSONObject));
            saveEnableLoggingData(extractJsonObject("enableLogging", jSONObject));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Unable to parse the generic sdk data", e);
        }
    }

    private void saveEnableLoggingData(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.put("startTime", java.lang.System.currentTimeMillis());
            this.persistentStorage.setEnableLoggingViaWebchat(jSONObject.toString());
        }
    }

    private void saveUserDataKeyMapping(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.persistentStorage.storeUserDataKeyMapping(jSONObject.toString());
        }
    }

    private void saveNotificationContent(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.persistentStorage.storeNotificationContent(jSONObject.toString());
        }
    }

    private void saveNetworkHeaders(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.persistentStorage.storeNetworkHeaders(jSONObject.toString());
        }
    }

    private void savePushTokenRoute(java.lang.String str) {
        if (com.helpshift.util.Utils.isNotEmpty(str)) {
            this.persistentStorage.storePushTokenRoute(str);
        }
    }

    private void savePollingRoute(java.lang.String str) {
        if (com.helpshift.util.Utils.isNotEmpty(str)) {
            this.persistentStorage.storePollingRoute(str);
        }
    }

    private java.lang.String extractString(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return "";
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in reading the json value for key " + str, e);
            return "";
        }
    }

    private org.json.JSONObject extractJsonObject(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getJSONObject(str);
            }
            return null;
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in reading the json value for key " + str, e);
            return null;
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getNetworkHeaders() {
        return com.helpshift.util.JsonUtils.jsonStringToStringMap(this.persistentStorage.getNetworkHeaders());
    }

    public java.lang.String getPollingRoute() {
        return this.persistentStorage.getPollingRoute();
    }

    public java.lang.String getPushTokenSyncRoute() {
        return this.persistentStorage.getPushTokenSyncRoute();
    }

    public java.util.Map<java.lang.String, java.lang.String> getUserDataKeyMapping() {
        return com.helpshift.util.JsonUtils.jsonStringToStringMap(this.persistentStorage.getUserDataKeyMapping());
    }

    public java.lang.String getNotificationStringForCount(int i) {
        if (i > 1) {
            return getNotificationString(i, "plural_message");
        }
        return getNotificationString(i, "single_message");
    }

    private java.lang.String getNotificationString(int i, java.lang.String str) {
        org.json.JSONObject notificationContent = getNotificationContent();
        if (notificationContent == null) {
            return FALLBACK_NOTIFICATION_STRING;
        }
        try {
            return notificationContent.getString(str).replace(notificationContent.getString("placeholder"), java.lang.String.valueOf(i));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in constructing unread count string", e);
            return FALLBACK_NOTIFICATION_STRING;
        }
    }

    private org.json.JSONObject getNotificationContent() {
        java.lang.String notificationContent = this.persistentStorage.getNotificationContent();
        if (com.helpshift.util.Utils.isEmpty(notificationContent)) {
            return null;
        }
        try {
            return new org.json.JSONObject(notificationContent);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in reading unread count notification content", e);
            return null;
        }
    }
}
