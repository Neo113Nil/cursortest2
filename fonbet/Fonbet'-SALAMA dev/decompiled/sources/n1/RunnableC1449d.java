package n1;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import c5.C0820a;
import d1.C0949b;
import e1.AbstractC0997d;
import e1.AbstractC1003j;
import e3.C1023h;
import h1.C1178b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m1.C1428c;
import m1.C1430e;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1449d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15302d = d1.n.g("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    public static final long f15303e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f15304a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.l f15305b;

    /* renamed from: c, reason: collision with root package name */
    public int f15306c = 0;

    public RunnableC1449d(Context context, e1.l lVar) {
        this.f15304a = context.getApplicationContext();
        this.f15305b = lVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i7 = L.b.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
        long currentTimeMillis = System.currentTimeMillis() + f15303e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z4;
        WorkDatabase workDatabase;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        String string;
        String str = C1178b.f13350e;
        Context context = this.f15304a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList d7 = C1178b.d(context, jobScheduler);
        e1.l lVar = this.f15305b;
        t k7 = lVar.f12546f.k();
        k7.getClass();
        D0.k c3 = D0.k.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) k7.f8076b;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            ArrayList arrayList = new ArrayList(g3.getCount());
            while (g3.moveToNext()) {
                arrayList.add(g3.getString(0));
            }
            HashSet hashSet = new HashSet(d7 != null ? d7.size() : 0);
            if (d7 != null && !d7.isEmpty()) {
                Iterator it = d7.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            string = extras.getString("EXTRA_WORK_SPEC_ID");
                            if (TextUtils.isEmpty(string)) {
                                hashSet.add(string);
                            } else {
                                C1178b.b(jobScheduler, jobInfo.getId());
                            }
                        }
                    }
                    string = null;
                    if (TextUtils.isEmpty(string)) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        d1.n.d().b(C1178b.f13350e, "Reconciling jobs", new Throwable[0]);
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                workDatabase = lVar.f12546f;
                workDatabase.c();
                try {
                    C0820a n2 = workDatabase.n();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        n2.p((String) it3.next(), -1L);
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = lVar.f12546f;
            C0820a n7 = workDatabase.n();
            k1.g m7 = workDatabase.m();
            workDatabase.c();
            try {
                ArrayList f7 = n7.f();
                boolean isEmpty = f7.isEmpty();
                if (!isEmpty) {
                    Iterator it4 = f7.iterator();
                    while (it4.hasNext()) {
                        m1.i iVar = (m1.i) it4.next();
                        n7.u(1, iVar.f15216a);
                        n7.p(iVar.f15216a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) m7.f14674a;
                workDatabase_Impl2.b();
                C1430e c1430e = (C1430e) m7.f14677d;
                K0.f a2 = c1430e.a();
                workDatabase_Impl2.c();
                try {
                    a2.k();
                    workDatabase_Impl2.h();
                    workDatabase_Impl2.f();
                    c1430e.c(a2);
                    workDatabase.h();
                    workDatabase.f();
                    boolean z7 = !isEmpty || z4;
                    Long E7 = ((WorkDatabase) lVar.f12541A.f12667a).j().E("reschedule_needed");
                    String str2 = f15302d;
                    if (E7 != null && E7.longValue() == 1) {
                        d1.n.d().b(str2, "Rescheduling Workers.", new Throwable[0]);
                        lVar.p0();
                        C1023h c1023h = lVar.f12541A;
                        c1023h.getClass();
                        ((WorkDatabase) c1023h.f12667a).j().I(new C1428c("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i7 = L.b.b() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        d1.n.d().i(str2, "Ignoring exception", e);
                        d1.n.d().b(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                        lVar.p0();
                        return;
                    } catch (SecurityException e8) {
                        e = e8;
                        d1.n.d().i(str2, "Ignoring exception", e);
                        d1.n.d().b(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                        lVar.p0();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                                reason = io.sentry.android.core.l.e(historicalProcessExitReasons.get(i8)).getReason();
                                if (reason == 10) {
                                    d1.n.d().b(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                    lVar.p0();
                                    return;
                                }
                            }
                        }
                        if (z7) {
                            return;
                        }
                        d1.n.d().b(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                        AbstractC0997d.a(lVar.f12545e, lVar.f12546f, lVar.f12548y);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        d1.n.d().b(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                        lVar.p0();
                        return;
                    }
                    if (z7) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.f();
                    c1430e.c(a2);
                    throw th2;
                }
            } finally {
                workDatabase.f();
            }
        } finally {
            g3.close();
            c3.g();
        }
    }

    public final boolean b() {
        C0949b c0949b = this.f15305b.f12545e;
        c0949b.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f15302d;
        if (isEmpty) {
            d1.n.d().b(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a2 = AbstractC1452g.a(this.f15304a, c0949b);
        d1.n.d().b(str, "Is default app process = " + a2, new Throwable[0]);
        return a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f15302d;
        e1.l lVar = this.f15305b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                AbstractC1003j.a(this.f15304a);
                d1.n.d().b(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e7) {
                    int i7 = this.f15306c + 1;
                    this.f15306c = i7;
                    if (i7 >= 3) {
                        d1.n.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                        lVar.f12545e.getClass();
                        throw illegalStateException;
                    }
                    d1.n.d().b(str, "Retrying after " + (i7 * 300), e7);
                    try {
                        Thread.sleep(this.f15306c * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            lVar.o0();
        }
    }
}
