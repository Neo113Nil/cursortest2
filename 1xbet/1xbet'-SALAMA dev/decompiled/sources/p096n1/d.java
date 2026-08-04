package p096n1;

import D0.k;
import K0.f;
import L.b;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p019c5.a;
import p023d1.n;
import p031e1.j;
import p031e1.l;
import p033e3.h;
import p072k1.g;
import p088m1.c;
import p088m1.e;
import p088m1.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f15308d = n.g("ForceStopRunnable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f15309e = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15312c = 0;

    public d(Context context, l lVar) {
        this.f15310a = context.getApplicationContext();
        this.f15311b = lVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i7 = b.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
        long jCurrentTimeMillis = System.currentTimeMillis() + f15309e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0201  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    public final void a() {
        boolean z4;
        String string;
        String str = p053h1.b.f13356e;
        Context context = this.f15310a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListD = p053h1.b.d(context, jobScheduler);
        l lVar = this.f15311b;
        t tVarK = lVar.f12552f.k();
        tVarK.getClass();
        k kVarC = k.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) tVarK.f8076b;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            kVarC.g();
            HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
            if (arrayListD != null && !arrayListD.isEmpty()) {
                for (JobInfo jobInfo : arrayListD) {
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                string = extras.getString("EXTRA_WORK_SPEC_ID");
                            } else {
                                string = null;
                            }
                        } catch (NullPointerException unused) {
                        }
                    } else {
                        string = null;
                    }
                    if (TextUtils.isEmpty(string)) {
                        p053h1.b.b(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(string);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        n.d().b(p053h1.b.f13356e, "Reconciling jobs", new Throwable[0]);
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                WorkDatabase workDatabase = lVar.f12552f;
                workDatabase.c();
                try {
                    a aVarN = workDatabase.n();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        aVarN.p((String) it2.next(), -1L);
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = lVar.f12552f;
            a aVarN2 = workDatabase2.n();
            g gVarM = workDatabase2.m();
            workDatabase2.c();
            try {
                ArrayList<i> arrayListF = aVarN2.f();
                boolean zIsEmpty = arrayListF.isEmpty();
                if (!zIsEmpty) {
                    for (i iVar : arrayListF) {
                        aVarN2.u(1, iVar.f15222a);
                        aVarN2.p(iVar.f15222a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) gVarM.f14680a;
                workDatabase_Impl2.b();
                e eVar = (e) gVarM.f14683d;
                f fVarA = eVar.a();
                workDatabase_Impl2.c();
                try {
                    fVarA.k();
                    workDatabase_Impl2.h();
                    workDatabase_Impl2.f();
                    eVar.c(fVarA);
                    workDatabase2.h();
                    workDatabase2.f();
                    boolean z7 = !zIsEmpty || z4;
                    Long lE = ((WorkDatabase) lVar.f12547A.f12673a).j().E("reschedule_needed");
                    String str2 = f15308d;
                    if (lE != null && lE.longValue() == 1) {
                        n.d().b(str2, "Rescheduling Workers.", new Throwable[0]);
                        lVar.p0();
                        h hVar = lVar.f12547A;
                        hVar.getClass();
                        ((WorkDatabase) hVar.f12673a).j().I(new c("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i7 = b.b() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
                        if (Build.VERSION.SDK_INT < 30) {
                            if (broadcast == null) {
                                c(context);
                                n.d().b(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                lVar.p0();
                                return;
                            }
                            if (z7) {
                                n.d().b(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                                p031e1.d.a(lVar.f12551e, lVar.f12552f, lVar.f12554y);
                            }
                        }
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                                if (io.sentry.android.core.l.e(historicalProcessExitReasons.get(i8)).getReason() == 10) {
                                    n.d().b(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                    lVar.p0();
                                    return;
                                }
                            }
                        }
                        if (z7) {
                            n.d().b(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                            p031e1.d.a(lVar.f12551e, lVar.f12552f, lVar.f12554y);
                        }
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        n.d().i(str2, "Ignoring exception", e);
                    } catch (SecurityException e8) {
                        e = e8;
                        n.d().i(str2, "Ignoring exception", e);
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.f();
                    eVar.c(fVarA);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase2.f();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorG.close();
            kVarC.g();
            throw th4;
        }
    }

    public final boolean b() {
        p023d1.b bVar = this.f15311b.f12551e;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f15308d;
        if (zIsEmpty) {
            n.d().b(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = g.a(this.f15310a, bVar);
        n.d().b(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f15308d;
        l lVar = this.f15311b;
        try {
            if (!b()) {
                lVar.o0();
                return;
            }
            while (true) {
                j.a(this.f15310a);
                n.d().b(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    lVar.o0();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e7) {
                    int i7 = this.f15312c + 1;
                    this.f15312c = i7;
                    if (i7 >= 3) {
                        n.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                        lVar.f12551e.getClass();
                        throw illegalStateException;
                    }
                    n.d().b(str, "Retrying after " + (((long) i7) * 300), e7);
                    try {
                        Thread.sleep(((long) this.f15312c) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            lVar.o0();
            throw th;
        }
    }
}
