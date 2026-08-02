package com.flurry.android.marketing.messaging.FCM;

import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Collections;
import w1.AbstractC1706i0;
import w1.AbstractC1707i1;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class FlurryMessageListenerService extends FirebaseMessagingService {
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        AbstractC1706i0.o(4, "FCM message received");
        if (remoteMessage != null) {
            synchronized (C1719l1.r()) {
                FlurryFCMNotification.getInstance().notificationReceived(remoteMessage);
            }
        }
    }

    public final void onNewToken(String str) {
        AbstractC1706i0.o(4, "FCM token received");
        if (str != null) {
            C1719l1.r();
            FlurryFCMNotification.getInstance().tokenRefreshed(str);
            FlurryFCMNotification.getInstance().notifyTokenRefresh(str);
            if (AbstractC1707i1.f17743c != null) {
                Collections.emptyMap();
            }
        }
    }
}
