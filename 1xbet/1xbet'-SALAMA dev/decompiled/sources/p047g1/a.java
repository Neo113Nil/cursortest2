package p047g1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.t;
import androidx.work.impl.WorkDatabase;
import p023d1.n;
import p031e1.l;
import p088m1.c;
import p088m1.d;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13072a = n.g("Alarms");

    public static void a(Context context, int i7, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        n.d().b(f13072a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i7 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = lVar.f12552f;
        t tVarK = workDatabase.k();
        d dVarF0 = tVarK.f0(str);
        if (dVarF0 != null) {
            a(context, dVarF0.f15215b, str);
            int i7 = dVarF0.f15215b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i7, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (e.class) {
            workDatabase.c();
            try {
                Long lE = workDatabase.j().E("next_alarm_manager_id");
                iIntValue = lE != null ? lE.intValue() : 0;
                workDatabase.j().I(new c("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        tVarK.k0(new d(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
