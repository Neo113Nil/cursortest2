package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.common.threading.ThreadUtilsKt;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class BootUpReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        ThreadUtilsKt.suspendifyOnIO(new BootUpReceiver$onReceive$1(context, goAsync(), null));
    }
}
