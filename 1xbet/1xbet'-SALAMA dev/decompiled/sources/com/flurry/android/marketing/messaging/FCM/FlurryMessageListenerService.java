package com.flurry.android.marketing.messaging.FCM;

import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Collections;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC0998i1;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class FlurryMessageListenerService extends FirebaseMessagingService {
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        AbstractC0997i0.o(4, "FCM message received");
        if (remoteMessage != null) {
            synchronized (C1010l1.r()) {
                FlurryFCMNotification.getInstance().notificationReceived(remoteMessage);
            }
        }
    }

    public final void onNewToken(String str) {
        AbstractC0997i0.o(4, "FCM token received");
        if (str != null) {
            C1010l1.r();
            FlurryFCMNotification.getInstance().tokenRefreshed(str);
            FlurryFCMNotification.getInstance().notifyTokenRefresh(str);
            if (AbstractC0998i1.f17749c != null) {
                Collections.emptyMap();
            }
        }
    }
}
