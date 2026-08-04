package com.flurry.android.marketing.messaging.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC1006k1;
import p155w1.AbstractC1030q1;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCancelledReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        FlurryMessage flurryMessageA = AbstractC1030q1.a(intent);
        if (flurryMessageA == null) {
            AbstractC0997i0.o(3, "No flurry message received in the cancelled notification.");
            return;
        }
        flurryMessageA.getNotificationId();
        FlurryMessagingListener flurryMessagingListener = AbstractC1006k1.f17764a;
        if (flurryMessagingListener != null) {
            AbstractC1006k1.e(new b(12, flurryMessagingListener, flurryMessageA, false));
        }
        if (AbstractC1006k1.n()) {
            AbstractC1030q1.d("Flurry.PushCanceled", flurryMessageA.getFlurryData());
        }
    }
}
