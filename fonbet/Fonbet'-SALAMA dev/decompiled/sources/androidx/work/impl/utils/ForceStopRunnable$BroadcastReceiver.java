package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import d1.n;
import n1.RunnableC1449d;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9892a = n.g("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (n.d().f12365a <= 2) {
            Log.v(f9892a, "Rescheduling alarm that keeps track of force-stops.");
        }
        RunnableC1449d.c(context);
    }
}
