package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public class MessagingPushPayload {
    private java.lang.String getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private com.adobe.marketing.mobile.MessagingPushPayload.ActionType getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.lang.String> getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    private java.lang.String isOutputSupportedFor;
    private java.lang.String unwrapAs;
    static final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoSizes = new java.util.HashMap<java.lang.String, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.MessagingPushPayload.1
        {
            put("PRIORITY_MIN", 1);
            put("PRIORITY_LOW", 2);
            put("PRIORITY_DEFAULT", 3);
            put("PRIORITY_HIGH", 4);
            put("PRIORITY_MAX", 5);
        }
    };
    static final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<java.lang.String, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.MessagingPushPayload.2
        {
            put("PRIVATE", 0);
            put("PUBLIC", 1);
            put("SECRET", -1);
        }
    };
    static final java.util.Map<java.lang.String, java.lang.Integer> Camera2StreamConfigurationMap = new java.util.HashMap<java.lang.String, java.lang.Integer>() { // from class: com.adobe.marketing.mobile.MessagingPushPayload.3
        {
            put("PRIORITY_MIN", -2);
            put("PRIORITY_LOW", -1);
            put("PRIORITY_DEFAULT", 0);
            put("PRIORITY_HIGH", 1);
            put("PRIORITY_MAX", 2);
        }
    };
    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<java.lang.String>() { // from class: com.adobe.marketing.mobile.MessagingPushPayload.4
        {
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.TITLE);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.BODY);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.SOUND);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.BADGE_NUMBER);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.NOTIFICATION_VISIBILITY);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.NOTIFICATION_PRIORITY);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.CHANNEL_ID);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ICON);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.IMAGE_URL);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ACTION_TYPE);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ACTION_URI);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ACTION_BUTTONS);
            add(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.INAPP_MESSAGE_ID);
        }
    };
    private int toString = 0;
    private int getValidOutputFormatsForInputhNQ4ISI = 3;
    private int isOutputSupportedForhNQ4ISI = 0;
    private java.util.List<com.adobe.marketing.mobile.MessagingPushPayload.ActionButton> getHighSpeedVideoFpsRanges = new java.util.ArrayList(3);

    public enum ActionType {
        DEEPLINK,
        WEBURL,
        DISMISS,
        OPENAPP,
        NONE
    }

    static final class NotificationPriorities {
        NotificationPriorities() {
        }
    }

    static final class NotificationVisibility {
        NotificationVisibility() {
        }
    }

    static final class ActionButtonType {
        ActionButtonType() {
        }
    }

    static final class ActionButtons {
        ActionButtons() {
        }
    }

    public MessagingPushPayload(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        if (remoteMessage == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Failed to create MessagingPushPayload, remote message is null", new java.lang.Object[0]);
            return;
        }
        if (remoteMessage.getData().isEmpty()) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Failed to create MessagingPushPayload, remote message data payload is null", new java.lang.Object[0]);
            return;
        }
        java.lang.String messageId = remoteMessage.getMessageId();
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messageId)) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Failed to create MessagingPushPayload, message id is null or empty", new java.lang.Object[0]);
        } else {
            this.getOutputStallDurationlomOqCM = messageId;
            getHighResolutionOutputSizeshNQ4ISI(remoteMessage.getData());
        }
    }

    public MessagingPushPayload(java.util.Map<java.lang.String, java.lang.String> map) {
        getHighResolutionOutputSizeshNQ4ISI(map);
    }

    public java.lang.String getTitle() {
        return this.unwrapAs;
    }

    public java.lang.String getBody() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.lang.String getSound() {
        return this.isOutputSupportedFor;
    }

    public int getBadgeCount() {
        return this.getInputFormats;
    }

    public int getNotificationPriority() {
        return this.toString;
    }

    public int getNotificationVisibility() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public int getNotificationImportance() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public java.lang.String getChannelId() {
        return this.getOutputMinFrameDuration;
    }

    public java.lang.String getIcon() {
        return this.getOutputSizeshNQ4ISI;
    }

    public java.lang.String getImageUrl() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public java.lang.String getMessageId() {
        return this.getOutputStallDurationlomOqCM;
    }

    public com.adobe.marketing.mobile.MessagingPushPayload.ActionType getActionType() {
        return this.getOutputFormats;
    }

    public java.lang.String getActionUri() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.util.List<com.adobe.marketing.mobile.MessagingPushPayload.ActionButton> getActionButtons() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Map<java.lang.String, java.lang.String> getData() {
        return this.getOutputStallDuration;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getOutputStallDuration = map;
        if (map == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Payload extraction failed because data provided is null", new java.lang.Object[0]);
            return;
        }
        this.unwrapAs = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.TITLE);
        this.getHighSpeedVideoSizesFor = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.BODY);
        this.isOutputSupportedFor = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.SOUND);
        this.getOutputMinFrameDuration = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.CHANNEL_ID);
        this.getOutputSizeshNQ4ISI = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ICON);
        this.getInputSizeshNQ4ISI = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ACTION_URI);
        this.getOutputMinFrameDurationlomOqCM = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.IMAGE_URL);
        this.getOutputSizes = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.INAPP_MESSAGE_ID);
        try {
            java.lang.String str = map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.BADGE_NUMBER);
            if (str != null) {
                this.getInputFormats = java.lang.Integer.parseInt(str);
            }
        } catch (java.lang.NumberFormatException e) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Exception in converting notification badge count to int - %s", e.getLocalizedMessage());
        }
        this.getValidOutputFormatsForInputhNQ4ISI = Camera2StreamConfigurationMap(map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.NOTIFICATION_PRIORITY));
        this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.NOTIFICATION_VISIBILITY));
        this.getOutputFormats = getHighSpeedVideoSizes(map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ACTION_TYPE));
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(map.get(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.ACTION_BUTTONS));
    }

    public void putDataInExtras(android.content.Intent intent) {
        if (this.getOutputStallDuration == null || intent == null) {
            return;
        }
        for (java.lang.String str : getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.String str2 = this.getOutputStallDuration.get(str);
            if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
                intent.putExtra(str, str2);
            }
        }
    }

    private static int Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.Integer num;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || (num = getHighSpeedVideoSizes.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.Integer num;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || (num = getHighSpeedVideoFpsRangesFor.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.adobe.marketing.mobile.MessagingPushPayload.ActionType getHighSpeedVideoSizes(java.lang.String str) {
        char c;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return com.adobe.marketing.mobile.MessagingPushPayload.ActionType.NONE;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1738457701) {
            if (str.equals("WEBURL")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -545209481) {
            if (hashCode == 1411860198 && str.equals("DEEPLINK")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("OPENAPP")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return com.adobe.marketing.mobile.MessagingPushPayload.ActionType.WEBURL;
        }
        if (c == 1) {
            return com.adobe.marketing.mobile.MessagingPushPayload.ActionType.OPENAPP;
        }
        if (c == 2) {
            return com.adobe.marketing.mobile.MessagingPushPayload.ActionType.DEEPLINK;
        }
        return com.adobe.marketing.mobile.MessagingPushPayload.ActionType.NONE;
    }

    private java.util.List<com.adobe.marketing.mobile.MessagingPushPayload.ActionButton> getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Exception in converting actionButtons json string to json object, Error : actionButtons is null", new java.lang.Object[0]);
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                com.adobe.marketing.mobile.MessagingPushPayload.ActionButton Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(jSONArray.getJSONObject(i));
                if (Camera2StreamConfigurationMap2 != null) {
                    arrayList.add(Camera2StreamConfigurationMap2);
                }
            }
            return arrayList;
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Exception in converting actionButtons json string to json object, Error : %s", e.getLocalizedMessage());
            return null;
        }
    }

    private com.adobe.marketing.mobile.MessagingPushPayload.ActionButton Camera2StreamConfigurationMap(org.json.JSONObject jSONObject) {
        java.lang.String optString;
        try {
            java.lang.String string = jSONObject.getString("label");
            if (string.isEmpty()) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Label is empty", new java.lang.Object[0]);
                return null;
            }
            java.lang.String string2 = jSONObject.getString("type");
            if (!string2.equals("WEBURL") && !string2.equals("DEEPLINK")) {
                optString = null;
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Creating an ActionButton with label (%s), uri (%s), and type (%s)", string, optString, string2);
                return new com.adobe.marketing.mobile.MessagingPushPayload.ActionButton(string, optString, string2);
            }
            optString = jSONObject.optString("uri");
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Creating an ActionButton with label (%s), uri (%s), and type (%s)", string, optString, string2);
            return new com.adobe.marketing.mobile.MessagingPushPayload.ActionButton(string, optString, string2);
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushPayload", "Exception in converting actionButtons json string to json object, Error : %s", e.getLocalizedMessage());
            return null;
        }
    }

    public class ActionButton {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private final com.adobe.marketing.mobile.MessagingPushPayload.ActionType getHighSpeedVideoSizes;

        public ActionButton(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.getHighSpeedVideoSizes = com.adobe.marketing.mobile.MessagingPushPayload.getHighSpeedVideoSizes(str3);
        }

        public java.lang.String getLabel() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public java.lang.String getLink() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public com.adobe.marketing.mobile.MessagingPushPayload.ActionType getType() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
