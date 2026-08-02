package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import f2.m;
import g2.l;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7109a = m.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.d().a(f7109a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            l Q5 = l.Q(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (l.f17127v) {
                try {
                    Q5.f17136s = goAsync;
                    if (Q5.f17135r) {
                        goAsync.finish();
                        Q5.f17136s = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e3) {
            m.d().b(f7109a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
        }
    }
}
