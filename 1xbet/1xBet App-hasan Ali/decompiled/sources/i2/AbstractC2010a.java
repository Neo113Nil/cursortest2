package i2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f2.m;
import g2.l;
import p2.C2248f;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2010a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17304a = m.f("Alarms");

    public static void a(int i, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C2011b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m.d().a(f17304a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j5) {
        int intValue;
        WorkDatabase workDatabase = lVar.f17130m;
        v3.e k5 = workDatabase.k();
        o2.d B5 = k5.B(str);
        if (B5 != null) {
            a(B5.f18626b, context, str);
            int i = B5.f18626b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, C2011b.b(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j5, service);
                return;
            }
            return;
        }
        synchronized (C2248f.class) {
            workDatabase.c();
            try {
                Long i5 = workDatabase.j().i("next_alarm_manager_id");
                intValue = i5 != null ? i5.intValue() : 0;
                workDatabase.j().k(new o2.c("next_alarm_manager_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        k5.D(new o2.d(str, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, intValue, C2011b.b(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j5, service2);
        }
    }
}
