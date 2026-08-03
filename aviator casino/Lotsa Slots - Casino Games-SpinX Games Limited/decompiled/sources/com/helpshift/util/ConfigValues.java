package com.helpshift.util;

/* loaded from: classes5.dex */
public class ConfigValues {
    public static final java.lang.String BREADCRUMBS_OR_LOGS_AVAILABLE = "breadcrumbsOrLogsAvailable";
    public static final java.lang.String CUSTOM_ISSUE_FIELDS = "cifs";
    public static final java.lang.String DEFAULT_STATUSBAR_COLOR = "#453FB9";
    public static final java.lang.String ENABLE_IN_APP_NOTIFICATION = "enableInAppNotification";
    public static final java.lang.String ENABLE_LOGGING = "enableLogging";
    public static final java.lang.String FAQ_SECTION_ID_KEY = "FAQ_SECTION_ID";
    public static final java.lang.String HELPCENTER_MODE_APP_MAIN_PAGE = "APP_MAIN_PAGE";
    public static final java.lang.String HELPCENTER_MODE_FAQ_SECTION = "FAQ_SECTION";
    public static final java.lang.String HELPCENTER_MODE_KEY = "HELPCENTER_MODE";
    public static final java.lang.String HELPCENTER_MODE_SINGLE_FAQ = "SINGLE_FAQ";
    public static final java.lang.String HELP_CENTER_SERVICE = "HELP_CENTER_SERVICE_FLAG";
    public static final java.lang.String MANUAL_LIFECYCLE_TRACKING = "manualLifecycleTracking";
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "notificationChannelId";
    public static final java.lang.String NOTIFICATION_ICON = "notificationIcon";
    public static final java.lang.String NOTIFICATION_LARGE_ICON = "notificationLargeIcon";
    public static final java.lang.String NOTIFICATION_SOUND_ID = "notificationSoundId";
    public static final java.lang.String OLD_CUSTOM_ISSUE_FIELDS = "customIssueFields";
    public static final java.lang.String SCREEN_ORIENTATION = "screenOrientation";
    public static final java.lang.String SERVICE_MODE_KEY = "SERVICE_MODE";
    public static final java.lang.String SINGLE_FAQ_PUBLISH_ID_KEY = "SINGLE_FAQ_PUBLISH_ID";
    public static final java.lang.String SOURCE = "source";
    public static final java.lang.String SOURCE_API = "api";
    public static final java.lang.String SOURCE_HELPCENTER = "helpcenter";
    public static final java.lang.String SOURCE_NOTIFICATION = "notification";
    public static final java.lang.String SOURCE_PROACTIVE = "proactive";
    public static final java.lang.String WEBCHAT_SERVICE = "WEBCHAT_SERVICE_FLAG";
    public static final java.lang.String WEBVIEW_VERSION = "webviewVersion";

    private ConfigValues() {
    }

    public static java.util.Map<java.lang.String, java.lang.Object> getDefaultConfigMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ENABLE_LOGGING, false);
        hashMap.put(NOTIFICATION_CHANNEL_ID, "");
        hashMap.put(NOTIFICATION_SOUND_ID, 0);
        hashMap.put(NOTIFICATION_ICON, 0);
        hashMap.put(NOTIFICATION_LARGE_ICON, 0);
        hashMap.put(MANUAL_LIFECYCLE_TRACKING, false);
        hashMap.put(ENABLE_IN_APP_NOTIFICATION, true);
        return hashMap;
    }
}
