package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f2.m;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2012c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17309a = m.f("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.d().a(f17309a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = C2011b.f17305n;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
