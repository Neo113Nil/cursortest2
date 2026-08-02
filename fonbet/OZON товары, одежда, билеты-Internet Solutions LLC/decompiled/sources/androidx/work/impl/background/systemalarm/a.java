package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.o;
import g5.C6637j;
import g5.C6643p;
import g5.InterfaceC6638k;
import h5.C6810h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45372a = o.i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    static class C0820a {
        static void a(AlarmManager alarmManager, int i11, long j11, PendingIntent pendingIntent) {
            alarmManager.setExact(i11, j11, pendingIntent);
        }
    }

    public static void a(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull C6643p c6643p) {
        InterfaceC6638k c11 = workDatabase.c();
        C6637j a11 = c11.a(c6643p);
        if (a11 != null) {
            b(context, c6643p, a11.f63859c);
            o.e().a(f45372a, "Removing SystemIdInfo for workSpecId (" + c6643p + ")");
            c11.d(c6643p);
        }
    }

    private static void b(@NonNull Context context, @NonNull C6643p c6643p, int i11) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i11, b.a(context, c6643p), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o.e().a(f45372a, "Cancelling existing alarm with (workSpecId, systemId) (" + c6643p + ", " + i11 + ")");
        alarmManager.cancel(service);
    }

    public static void c(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull C6643p generationalId, long j11) {
        InterfaceC6638k c11 = workDatabase.c();
        C6637j a11 = c11.a(generationalId);
        if (a11 != null) {
            int i11 = a11.f63859c;
            b(context, generationalId, i11);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i11, b.a(context, generationalId), 201326592);
            if (alarmManager != null) {
                C0820a.a(alarmManager, 0, j11, service);
                return;
            }
            return;
        }
        int c12 = new C6810h(workDatabase).c();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        c11.b(new C6637j(generationalId.b(), generationalId.a(), c12));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, c12, b.a(context, generationalId), 201326592);
        if (alarmManager2 != null) {
            C0820a.a(alarmManager2, 0, j11, service2);
        }
    }
}
