package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveNotificationParser {
    private static java.lang.String FALLBACK_NOTIFICATION_TEXT = "You have a new notification.";

    public static com.helpshift.proactive.ProactivePushNotification parsePushNotification(org.json.JSONObject jSONObject, com.helpshift.platform.Device device, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, java.lang.String str, java.lang.String str2, long j) {
        java.lang.String optString = jSONObject.optString("title", device.getAppName());
        java.lang.String optString2 = jSONObject.optString("text", "");
        java.lang.String optString3 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.BIG_TEXT, "");
        com.helpshift.proactive.ProactiveActionEntity extractProactiveActionEntity = extractProactiveActionEntity(jSONObject);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.helpshift.proactive.InAppViewConstants.BUTTONS);
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            arrayList.add(new com.helpshift.proactive.ProactivePushButton(jSONObject2.optString("text", ""), extractProactiveActionEntity(jSONObject2)));
        }
        java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap = com.helpshift.util.JsonUtils.jsonStringToMap(hSPersistentStorage.getProactivePushNotificationDefaults());
        int intValue = ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "notificationIconId", 0)).intValue();
        int intValue2 = ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "largeNotificationIconId", 0)).intValue();
        int intValue3 = ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "soundId", 0)).intValue();
        java.lang.String optString4 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.LARGE_IMAGE_URL, "");
        return new com.helpshift.proactive.ProactivePushNotification(str, str2, j, optString, optString2, optString3, optString4, extractProactiveActionEntity, arrayList, intValue, com.helpshift.util.Utils.isEmpty(optString4) ? 0 : intValue2, intValue3, (java.lang.String) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "proactiveSupportChannelId", ""), (java.lang.String) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "proactiveEngageChannelId", ""));
    }

    public static com.helpshift.proactive.ProactiveInappNotification parseInAppNotification(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, org.json.JSONObject jSONObject) throws com.helpshift.proactive.HSProactiveParsingException {
        org.json.JSONObject optJSONObject;
        boolean z;
        long optLong;
        java.lang.String optString;
        java.lang.String optString2;
        java.lang.String optString3;
        java.lang.String optString4;
        java.lang.String string;
        long optLong2;
        try {
            optJSONObject = jSONObject.optJSONObject(com.helpshift.proactive.InAppViewConstants.IN_APP_DATA);
            z = jSONObject.getBoolean("defaultNotificationEnabled");
            optLong = jSONObject.optLong(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME);
            optString = jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.FALLBACK_TEXT, FALLBACK_NOTIFICATION_TEXT);
            optString2 = jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.FALLBACK_TITLE);
            optString3 = jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID);
            optString4 = jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID);
            string = jSONObject.getString(com.helpshift.proactive.ProactiveNotificationConstants.ENCODED_NOTIF_PAYLOAD);
            optLong2 = jSONObject.optLong(com.helpshift.proactive.InAppViewConstants.EXPIRY, 0L);
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            if (optJSONObject == null) {
                throw new com.helpshift.proactive.HSProactiveParsingException("Invalid or missing in-app notification ", optString3, optString4, optLong, null);
            }
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(com.helpshift.proactive.InAppViewConstants.FONTS);
            if (optJSONObject2 == null) {
                optJSONObject2 = new org.json.JSONObject();
            }
            java.lang.String optString5 = optJSONObject.optString("type");
            com.helpshift.proactive.InAppViewConstants.InAppNotificationType fromString = com.helpshift.proactive.InAppViewConstants.InAppNotificationType.fromString(optString5);
            if (fromString == null) {
                throw new com.helpshift.proactive.HSProactiveParsingException("Invalid or missing in-app notification type: " + optString5, optString3, optString4, optLong, null);
            }
            java.lang.String optString6 = optJSONObject.optString("position");
            boolean optBoolean = optJSONObject.optBoolean(com.helpshift.proactive.InAppViewConstants.RTL, false);
            boolean optBoolean2 = optJSONObject.optBoolean(com.helpshift.proactive.InAppViewConstants.AUTO_DISMISS, true);
            int optInt = optJSONObject.optInt(com.helpshift.proactive.InAppViewConstants.DISMISS_AFTER, 5);
            java.lang.String optString7 = optJSONObject2.optString(com.helpshift.proactive.InAppViewConstants.REGULAR_URL);
            java.lang.String optString8 = optJSONObject2.optString(com.helpshift.proactive.InAppViewConstants.BOLD_URL);
            java.lang.String optString9 = optJSONObject2.optString(com.helpshift.proactive.InAppViewConstants.ITALICS_URL);
            java.lang.String optString10 = optJSONObject2.optString(com.helpshift.proactive.InAppViewConstants.BOLD_ITALICS_URL);
            long optLong3 = optJSONObject.optLong(com.helpshift.proactive.InAppViewConstants.SHOW_AFTER, 5L);
            java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap = com.helpshift.util.JsonUtils.jsonStringToMap(hSPersistentStorage.getProactivePushNotificationDefaults());
            return new com.helpshift.proactive.ProactiveInappNotification(string, optString3, optString4, fromString, optString6, optInt, optBoolean2, optJSONObject, optString7, optString8, optString9, optString10, optBoolean, optLong, optLong2, optLong3, optString, optString2, ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "notificationIconId", 0)).intValue(), ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "soundId", 0)).intValue(), (java.lang.String) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, "proactiveEngageChannelId", ""), z);
        } catch (java.lang.Exception e2) {
            e = e2;
            if (jSONObject == null) {
                throw new com.helpshift.proactive.HSProactiveParsingException(e.getMessage(), e);
            }
            throw new com.helpshift.proactive.HSProactiveParsingException(e.getMessage(), jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID), jSONObject.optString(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID), jSONObject.optLong(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME), e);
        }
    }

    public static com.helpshift.proactive.ProactiveActionEntity extractProactiveActionEntity(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("actionConfig");
        java.lang.String str = "{}";
        if (optJSONObject == null || optJSONObject.length() == 0) {
            return new com.helpshift.proactive.ProactiveActionEntity(com.helpshift.proactive.ProactiveActions.UNKNOWN, "{}", "", -1);
        }
        java.lang.String optString = optJSONObject.optString("action", com.helpshift.proactive.ProactiveActions.UNKNOWN.value);
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(com.helpshift.proactive.InAppViewConstants.CONFIG);
        java.lang.String optString2 = optJSONObject.optString("value");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        }
        return new com.helpshift.proactive.ProactiveActionEntity(com.helpshift.proactive.ProactiveActions.fromValue(optString), str, optString2, optJSONObject.optInt("priority", -1));
    }

    public static boolean hasSupportAction(java.util.List<com.helpshift.proactive.ProactivePushButton> list) {
        if (com.helpshift.util.Utils.isEmpty(list)) {
            return false;
        }
        java.util.Iterator<com.helpshift.proactive.ProactivePushButton> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().actionEntity.action.isSupportAction) {
                return true;
            }
        }
        return false;
    }
}
