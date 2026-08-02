package com.flurry.android.marketing.messaging;

import android.content.Context;
import android.content.Intent;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.google.firebase.messaging.RemoteMessage;
import w1.AbstractC1707i1;
import w1.AbstractC1715k1;
import w1.AbstractC1739q1;
import w1.AbstractC1741r1;

/* loaded from: classes.dex */
public final class FlurryMessaging {
    public static void addFlurryMessageToIntentExtras(Intent intent, FlurryMessage flurryMessage) {
        if (AbstractC1715k1.n()) {
            String str = AbstractC1739q1.f17833a;
            if (intent == null) {
                return;
            }
            intent.putExtra("flurryMessage", flurryMessage);
        }
    }

    public static FlurryMessage convertFcmMessageToFlurryMessage(RemoteMessage remoteMessage) {
        if (AbstractC1715k1.n()) {
            return AbstractC1741r1.a(remoteMessage);
        }
        return null;
    }

    public static FlurryMessage getFlurryMessageFromIntent(Intent intent) {
        if (AbstractC1715k1.n()) {
            return AbstractC1739q1.a(intent);
        }
        return null;
    }

    public static boolean isAppInForeground() {
        return AbstractC1707i1.n();
    }

    public static boolean isFlurryMessage(RemoteMessage remoteMessage) {
        if (AbstractC1715k1.n()) {
            return AbstractC1739q1.f(remoteMessage);
        }
        return false;
    }

    public static void logNotificationCancelled(FlurryMessage flurryMessage) {
        if (AbstractC1715k1.n()) {
            int i7 = flurryMessage.notificationId;
            AbstractC1739q1.d("Flurry.PushCanceled", flurryMessage.getFlurryData());
        }
    }

    public static void logNotificationClicked(FlurryMessage flurryMessage) {
        if (AbstractC1715k1.n()) {
            int i7 = flurryMessage.notificationId;
            AbstractC1739q1.d("Flurry.PushOpened", flurryMessage.getFlurryData());
        }
    }

    public static void logNotificationReceived(FlurryMessage flurryMessage) {
        AbstractC1715k1.d(flurryMessage);
    }

    public static void setToken(String str) {
        if (AbstractC1715k1.n()) {
            String str2 = AbstractC1739q1.f17833a;
            FlurryFCMNotification.getInstance().tokenRefreshed(str);
        }
    }

    public static void showNotification(Context context, FlurryMessage flurryMessage) {
        if (AbstractC1715k1.n()) {
            AbstractC1739q1.g(context, flurryMessage);
        }
    }
}
