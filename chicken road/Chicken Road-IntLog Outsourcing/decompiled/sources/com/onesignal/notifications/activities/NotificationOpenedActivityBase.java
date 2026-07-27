package com.onesignal.notifications.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.ThreadUtilsKt;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class NotificationOpenedActivityBase extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent$com_onesignal_notifications();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        i.e(intent, "intent");
        super.onNewIntent(intent);
        processIntent$com_onesignal_notifications();
    }

    public void processIntent$com_onesignal_notifications() {
        ThreadUtilsKt.suspendifyOnDefault(new NotificationOpenedActivityBase$processIntent$1(this, null));
    }
}
