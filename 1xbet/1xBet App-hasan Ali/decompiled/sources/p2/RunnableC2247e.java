package p2;

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
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.G7;
import f2.C1944b;
import g2.AbstractC1980d;
import j1.AbstractC2017a;
import j2.C2019b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n1.K;

/* renamed from: p2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2247e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final String f18696n = f2.m.f("ForceStopRunnable");

    /* renamed from: o, reason: collision with root package name */
    public static final long f18697o = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: k, reason: collision with root package name */
    public final Context f18698k;

    /* renamed from: l, reason: collision with root package name */
    public final g2.l f18699l;

    /* renamed from: m, reason: collision with root package name */
    public int f18700m = 0;

    public RunnableC2247e(Context context, g2.l lVar) {
        this.f18698k = context.getApplicationContext();
        this.f18699l = lVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = AbstractC2017a.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f18697o;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z3;
        WorkDatabase workDatabase;
        int i;
        List historicalProcessExitReasons;
        int reason;
        String string;
        String str = C2019b.f17493o;
        Context context = this.f18698k;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList e3 = C2019b.e(context, jobScheduler);
        g2.l lVar = this.f18699l;
        v3.e k5 = lVar.f17130m.k();
        k5.getClass();
        R1.j b3 = R1.j.b("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) k5.f20432l;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            HashSet hashSet = new HashSet(e3 != null ? e3.size() : 0);
            if (e3 != null && !e3.isEmpty()) {
                int size = e3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = e3.get(i5);
                    i5++;
                    JobInfo jobInfo = (JobInfo) obj;
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            string = extras.getString("EXTRA_WORK_SPEC_ID");
                            if (TextUtils.isEmpty(string)) {
                                hashSet.add(string);
                            } else {
                                C2019b.a(jobScheduler, jobInfo.getId());
                            }
                        }
                    }
                    string = null;
                    if (TextUtils.isEmpty(string)) {
                    }
                }
            }
            int size2 = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    z3 = false;
                    break;
                }
                Object obj2 = arrayList.get(i6);
                i6++;
                if (!hashSet.contains((String) obj2)) {
                    f2.m.d().a(C2019b.f17493o, "Reconciling jobs", new Throwable[0]);
                    z3 = true;
                    break;
                }
            }
            if (z3) {
                workDatabase = lVar.f17130m;
                workDatabase.c();
                try {
                    G7 n5 = workDatabase.n();
                    int size3 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        n5.j((String) obj3, -1L);
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = lVar.f17130m;
            G7 n6 = workDatabase.n();
            C1071hd m5 = workDatabase.m();
            workDatabase.c();
            try {
                ArrayList c5 = n6.c();
                boolean isEmpty = c5.isEmpty();
                if (!isEmpty) {
                    int size4 = c5.size();
                    int i8 = 0;
                    while (i8 < size4) {
                        Object obj4 = c5.get(i8);
                        i8++;
                        o2.i iVar = (o2.i) obj4;
                        n6.n(1, iVar.f18633a);
                        n6.j(iVar.f18633a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) m5.f13761l;
                workDatabase_Impl2.b();
                o2.e eVar = (o2.e) m5.f13764o;
                Y1.f a5 = eVar.a();
                workDatabase_Impl2.c();
                try {
                    a5.r();
                    workDatabase_Impl2.h();
                    workDatabase_Impl2.f();
                    eVar.c(a5);
                    workDatabase.h();
                    workDatabase.f();
                    boolean z5 = !isEmpty || z3;
                    Long i9 = lVar.f17134q.f18701a.j().i("reschedule_needed");
                    String str2 = f18696n;
                    if (i9 != null && i9.longValue() == 1) {
                        f2.m.d().a(str2, "Rescheduling Workers.", new Throwable[0]);
                        lVar.T();
                        C2248f c2248f = lVar.f17134q;
                        c2248f.getClass();
                        c2248f.f18701a.j().k(new o2.c("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i10 = AbstractC2017a.a() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                                    reason = K.d(historicalProcessExitReasons.get(i11)).getReason();
                                    if (reason == 10) {
                                        i = 0;
                                    }
                                }
                            }
                            if (z5) {
                                return;
                            }
                            f2.m.d().a(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                            AbstractC1980d.a(lVar.f17129l, lVar.f17130m, lVar.f17132o);
                            return;
                        }
                        if (broadcast == null) {
                            c(context);
                            i = 0;
                        }
                        if (z5) {
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        i = 0;
                        f2.m.d().h(str2, "Ignoring exception", e);
                        f2.m.d().a(str2, "Application was force-stopped, rescheduling.", new Throwable[i]);
                        lVar.T();
                    } catch (SecurityException e6) {
                        e = e6;
                        i = 0;
                        f2.m.d().h(str2, "Ignoring exception", e);
                        f2.m.d().a(str2, "Application was force-stopped, rescheduling.", new Throwable[i]);
                        lVar.T();
                    }
                    f2.m.d().a(str2, "Application was force-stopped, rescheduling.", new Throwable[i]);
                    lVar.T();
                } catch (Throwable th2) {
                    workDatabase_Impl2.f();
                    eVar.c(a5);
                    throw th2;
                }
            } finally {
                workDatabase.f();
            }
        } finally {
            g5.close();
            b3.l();
        }
    }

    public final boolean b() {
        C1944b c1944b = this.f18699l.f17129l;
        c1944b.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f18696n;
        if (isEmpty) {
            f2.m.d().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a5 = AbstractC2250h.a(this.f18698k, c1944b);
        f2.m.d().a(str, "Is default app process = " + a5, new Throwable[0]);
        return a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f18696n;
        g2.l lVar = this.f18699l;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                g2.k.a(this.f18698k);
                f2.m.d().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e3) {
                    int i = this.f18700m + 1;
                    this.f18700m = i;
                    if (i >= 3) {
                        f2.m.d().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                        lVar.f17129l.getClass();
                        throw illegalStateException;
                    }
                    f2.m.d().a(str, "Retrying after " + (i * 300), e3);
                    try {
                        Thread.sleep(this.f18700m * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            lVar.S();
        }
    }
}
