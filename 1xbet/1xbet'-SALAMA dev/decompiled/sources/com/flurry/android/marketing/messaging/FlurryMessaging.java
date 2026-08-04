package com.flurry.android.marketing.messaging;

import android.content.Context;
import android.content.Intent;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.google.firebase.messaging.RemoteMessage;
import p155w1.AbstractC0998i1;
import p155w1.AbstractC1006k1;
import p155w1.AbstractC1030q1;
import p155w1.AbstractC1032r1;

/* JADX INFO: loaded from: classes.dex */
public final class FlurryMessaging {
    public static void addFlurryMessageToIntentExtras(Intent intent, FlurryMessage flurryMessage) {
        if (AbstractC1006k1.n()) {
            String str = AbstractC1030q1.f17839a;
            if (intent == null) {
                return;
            }
            intent.putExtra("flurryMessage", flurryMessage);
        }
    }

    public static FlurryMessage convertFcmMessageToFlurryMessage(RemoteMessage remoteMessage) {
        if (AbstractC1006k1.n()) {
            return AbstractC1032r1.a(remoteMessage);
        }
        return null;
    }

    public static FlurryMessage getFlurryMessageFromIntent(Intent intent) {
        if (AbstractC1006k1.n()) {
            return AbstractC1030q1.a(intent);
        }
        return null;
    }

    public static boolean isAppInForeground() {
        return AbstractC0998i1.n();
    }

    public static boolean isFlurryMessage(RemoteMessage remoteMessage) {
        if (AbstractC1006k1.n()) {
            return AbstractC1030q1.f(remoteMessage);
        }
        return false;
    }

    public static void logNotificationCancelled(FlurryMessage flurryMessage) {
        if (AbstractC1006k1.n()) {
            int i7 = flurryMessage.notificationId;
            AbstractC1030q1.d("Flurry.PushCanceled", flurryMessage.getFlurryData());
        }
    }

    public static void logNotificationClicked(FlurryMessage flurryMessage) {
        if (AbstractC1006k1.n()) {
            int i7 = flurryMessage.notificationId;
            AbstractC1030q1.d("Flurry.PushOpened", flurryMessage.getFlurryData());
        }
    }

    public static void logNotificationReceived(FlurryMessage flurryMessage) {
        AbstractC1006k1.d(flurryMessage);
    }

    public static void setToken(String str) {
        if (AbstractC1006k1.n()) {
            String str2 = AbstractC1030q1.f17839a;
            FlurryFCMNotification.getInstance().tokenRefreshed(str);
        }
    }

    public static void showNotification(Context context, FlurryMessage flurryMessage) {
        if (AbstractC1006k1.n()) {
            AbstractC1030q1.g(context, flurryMessage);
        }
    }
}
