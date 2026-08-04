package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p023d1.n;
import p031e1.l;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9879a = n.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n.d().b(f9879a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            l lVarM0 = l.m0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (l.f12546F) {
                try {
                    lVarM0.f12549C = pendingResultGoAsync;
                    if (lVarM0.f12548B) {
                        pendingResultGoAsync.finish();
                        lVarM0.f12549C = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e7) {
            n.d().c(f9879a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e7);
        }
    }
}
