package g1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.t;
import androidx.work.impl.WorkDatabase;
import d1.n;
import e1.l;
import m1.C1428c;
import m1.C1429d;
import n1.C1450e;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1127a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13066a = n.g("Alarms");

    public static void a(Context context, int i7, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        n.d().b(f13066a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i7 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j) {
        int intValue;
        WorkDatabase workDatabase = lVar.f12546f;
        t k7 = workDatabase.k();
        C1429d f02 = k7.f0(str);
        if (f02 != null) {
            a(context, f02.f15209b, str);
            int i7 = f02.f15209b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i7, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (C1450e.class) {
            workDatabase.c();
            try {
                Long E7 = workDatabase.j().E("next_alarm_manager_id");
                intValue = E7 != null ? E7.intValue() : 0;
                workDatabase.j().I(new C1428c("next_alarm_manager_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        k7.k0(new C1429d(str, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, intValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
