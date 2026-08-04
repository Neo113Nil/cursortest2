package com.flurry.android.marketing.messaging;

import com.flurry.android.marketing.messaging.notification.FlurryMessage;

/* JADX INFO: loaded from: classes.dex */
public interface FlurryMessagingListener {
    void onNonFlurryNotificationReceived(Object obj);

    void onNotificationCancelled(FlurryMessage flurryMessage);

    boolean onNotificationClicked(FlurryMessage flurryMessage);

    boolean onNotificationReceived(FlurryMessage flurryMessage);

    void onTokenRefresh(String str);
}
