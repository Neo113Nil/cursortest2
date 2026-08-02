package g1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d1.n;

/* loaded from: classes.dex */
public abstract class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13071a = n.g("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n.d().b(f13071a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = b.f13067d;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
