package com.flurry.android.marketing.messaging.notification;

/* JADX INFO: loaded from: classes.dex */
public interface FlurryNotificationListener<T> {
    void onAppNotificationPermissionStatusChange(boolean z4);

    void onIntegrationTypeUpdate(boolean z4);

    void onNotificationReceived(T t7);

    void onTokenRefresh(String str);

    void onUnhandledNotification(T t7);
}
