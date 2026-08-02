package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d1.n;
import e1.l;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9879a = n.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n.d().b(f9879a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            l m02 = l.m0(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (l.f12540F) {
                try {
                    m02.f12543C = goAsync;
                    if (m02.f12542B) {
                        goAsync.finish();
                        m02.f12543C = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e7) {
            n.d().c(f9879a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e7);
        }
    }
}
