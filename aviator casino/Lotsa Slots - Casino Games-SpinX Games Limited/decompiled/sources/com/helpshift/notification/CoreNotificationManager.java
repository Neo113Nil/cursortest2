package com.helpshift.notification;

/* loaded from: classes2.dex */
public interface CoreNotificationManager {
    void cancelNotifications();

    void handlePush(java.util.Map<java.lang.String, java.lang.String> map, boolean z);

    void setAnalyticsEventDM(com.helpshift.analytics.HSAnalyticsEventDM hSAnalyticsEventDM);

    void setConfigManager(com.helpshift.config.HSConfigManager hSConfigManager);

    void setNotificationChannelId(java.lang.String str);

    void setNotificationIcon(int i);

    void setNotificationLargeIcon(int i);

    void setNotificationReceivedCallback(com.helpshift.notification.NotificationReceivedCallback notificationReceivedCallback);

    void setNotificationSoundId(int i);

    void setResourceCacheManager(com.helpshift.notification.HelpshiftNotificationResourceCacheManager helpshiftNotificationResourceCacheManager);

    void setShouldPauseInAppNotification(boolean z);

    void showDebugLogNotification();

    void showIssueMessageNotification(java.lang.String str, boolean z);

    void showProactiveInAppNotificationIfPresent(boolean z);
}
