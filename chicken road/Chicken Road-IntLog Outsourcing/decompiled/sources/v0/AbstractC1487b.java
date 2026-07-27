package v0;

import B0.j;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import s0.s;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1487b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12055a = s.f("Alarms");

    public static void a(Context context, j jVar, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = C1488c.f12056e;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C1488c.c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i2, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        s.d().a(f12055a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i2 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j jVar, long j2) {
        B0.i p5 = workDatabase.p();
        B0.g a6 = p5.a(jVar);
        int i2 = 0;
        if (a6 != null) {
            int i3 = a6.f150c;
            a(context, jVar, i3);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = C1488c.f12056e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            C1488c.c(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i3, intent, 201326592);
            if (alarmManager != null) {
                AbstractC1486a.a(alarmManager, 0, j2, service);
                return;
            }
            return;
        }
        Object n6 = workDatabase.n(new C0.g(i2, new B1.g(workDatabase)));
        kotlin.jvm.internal.i.d(n6, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) n6).intValue();
        p5.c(new B0.g(jVar.f157a, jVar.f158b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = C1488c.f12056e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        C1488c.c(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            AbstractC1486a.a(alarmManager2, 0, j2, service2);
        }
    }
}
