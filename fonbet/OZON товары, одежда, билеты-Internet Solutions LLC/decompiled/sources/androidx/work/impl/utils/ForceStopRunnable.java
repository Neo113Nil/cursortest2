package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.view.M0;
import androidx.work.c;
import androidx.work.impl.C;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.e;
import androidx.work.impl.s;
import androidx.work.impl.y;
import androidx.work.o;
import androidx.work.v;
import g5.C6627B;
import g5.InterfaceC6648v;
import h5.m;
import h5.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f45489e = o.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    private static final long f45490f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    private final Context f45491a;

    /* renamed from: b, reason: collision with root package name */
    private final C f45492b;

    /* renamed from: c, reason: collision with root package name */
    private final m f45493c;

    /* renamed from: d, reason: collision with root package name */
    private int f45494d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f45495a = o.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            o.e().j(f45495a);
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull C c11) {
        this.f45491a = context.getApplicationContext();
        this.f45492b = c11;
        this.f45493c = c11.j();
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
        long currentTimeMillis = System.currentTimeMillis() + f45490f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i11;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        m mVar = this.f45493c;
        Context context = this.f45491a;
        C c11 = this.f45492b;
        boolean h11 = e.h(context, c11);
        WorkDatabase n11 = c11.n();
        g5.C f7 = n11.f();
        InterfaceC6648v e11 = n11.e();
        n11.beginTransaction();
        try {
            ArrayList t2 = f7.t();
            boolean isEmpty = t2.isEmpty();
            if (!isEmpty) {
                Iterator it = t2.iterator();
                while (it.hasNext()) {
                    C6627B c6627b = (C6627B) it.next();
                    f7.f(v.a.ENQUEUED, c6627b.f63799a);
                    f7.j(-1L, c6627b.f63799a);
                }
            }
            e11.a();
            n11.setTransactionSuccessful();
            n11.endTransaction();
            boolean z11 = !isEmpty || h11;
            boolean b11 = c11.j().b();
            String str = f45489e;
            if (b11) {
                o.e().a(str, "Rescheduling Workers.");
                c11.s();
                c11.j().d();
                return;
            }
            try {
                i11 = Build.VERSION.SDK_INT;
                int i12 = i11 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i12);
            } catch (IllegalArgumentException e12) {
                e = e12;
                o.e().l(str, "Ignoring exception", e);
                o.e().a(str, "Application was force-stopped, rescheduling.");
                c11.s();
                mVar.c(System.currentTimeMillis());
                return;
            } catch (SecurityException e13) {
                e = e13;
                o.e().l(str, "Ignoring exception", e);
                o.e().a(str, "Application was force-stopped, rescheduling.");
                c11.s();
                mVar.c(System.currentTimeMillis());
                return;
            }
            if (i11 >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a11 = mVar.a();
                    for (int i13 = 0; i13 < historicalProcessExitReasons.size(); i13++) {
                        ApplicationExitInfo b12 = M0.b(historicalProcessExitReasons.get(i13));
                        reason = b12.getReason();
                        if (reason == 10) {
                            timestamp = b12.getTimestamp();
                            if (timestamp >= a11) {
                                o.e().a(str, "Application was force-stopped, rescheduling.");
                                c11.s();
                                mVar.c(System.currentTimeMillis());
                                return;
                            }
                        }
                    }
                }
                if (z11) {
                    return;
                }
                o.e().a(str, "Found unfinished work, scheduling it.");
                s.b(c11.h(), c11.n(), c11.l());
                return;
            }
            if (broadcast == null) {
                c(context);
                o.e().a(str, "Application was force-stopped, rescheduling.");
                c11.s();
                mVar.c(System.currentTimeMillis());
                return;
            }
            if (z11) {
            }
        } finally {
            n11.endTransaction();
        }
    }

    public final boolean b() {
        c h11 = this.f45492b.h();
        h11.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f45489e;
        if (isEmpty) {
            o.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a11 = n.a(this.f45491a, h11);
        o.e().a(str, "Is default app process = " + a11);
        return a11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f45489e;
        C c11 = this.f45492b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    y.a(this.f45491a);
                    o.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e11) {
                        int i11 = this.f45494d + 1;
                        this.f45494d = i11;
                        if (i11 >= 3) {
                            o.e().d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                            c11.h().getClass();
                            throw illegalStateException;
                        }
                        o.e().b(str, "Retrying after " + (i11 * 300), e11);
                        try {
                            Thread.sleep(this.f45494d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e12) {
                    o.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e12);
                    c11.h().getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            c11.r();
        }
    }
}
