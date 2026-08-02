package com.flurry.android.marketing.messaging.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;
import w1.AbstractC1706i0;
import w1.AbstractC1715k1;
import w1.AbstractC1739q1;

/* loaded from: classes.dex */
public final class NotificationCancelledReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        FlurryMessage a2 = AbstractC1739q1.a(intent);
        if (a2 == null) {
            AbstractC1706i0.o(3, "No flurry message received in the cancelled notification.");
            return;
        }
        a2.getNotificationId();
        FlurryMessagingListener flurryMessagingListener = AbstractC1715k1.f17758a;
        if (flurryMessagingListener != null) {
            AbstractC1715k1.e(new b(12, flurryMessagingListener, a2, false));
        }
        if (AbstractC1715k1.n()) {
            AbstractC1739q1.d("Flurry.PushCanceled", a2.getFlurryData());
        }
    }
}
