package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import s0.s;
import t0.o;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4737a = s.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        s.d().a(f4737a, "Received intent " + intent);
        try {
            o a6 = o.a(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (o.f11881m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = a6.f11890i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    a6.f11890i = goAsync;
                    if (a6.f11889h) {
                        goAsync.finish();
                        a6.f11890i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e3) {
            s.d().c(f4737a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
        }
    }
}
