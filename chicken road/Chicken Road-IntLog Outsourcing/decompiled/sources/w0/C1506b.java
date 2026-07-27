package w0;

import B0.i;
import B0.j;
import B0.q;
import B1.g;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import b2.AbstractC0279e;
import c0.C0307i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import s0.C1415c;
import s0.C1416d;
import s0.s;
import t0.h;
import t0.o;
import u1.AbstractC1477a;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final String f12111e = s.f("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f12112a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f12113b;

    /* renamed from: c, reason: collision with root package name */
    public final o f12114c;

    /* renamed from: d, reason: collision with root package name */
    public final C1505a f12115d;

    public C1506b(Context context, o oVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C1505a c1505a = new C1505a(context);
        this.f12112a = context;
        this.f12114c = oVar;
        this.f12113b = jobScheduler;
        this.f12115d = c1505a;
    }

    public static void b(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            s.d().c(f12111e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s.d().c(f12111e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j d(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // t0.h
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f12112a;
        JobScheduler jobScheduler = this.f12113b;
        ArrayList c2 = c(context, jobScheduler);
        if (c2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = c2.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j d6 = d(jobInfo);
                if (d6 != null && str.equals(d6.f157a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b(jobScheduler, ((Integer) it2.next()).intValue());
        }
        i p5 = this.f12114c.f11884c.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p5.f153b;
        workDatabase_Impl.b();
        B0.h hVar = (B0.h) p5.f156e;
        C0307i a6 = hVar.a();
        if (str == null) {
            a6.j(1);
        } else {
            a6.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a6);
        }
    }

    @Override // t0.h
    public final boolean e() {
        return true;
    }

    @Override // t0.h
    public final void f(q... qVarArr) {
        int intValue;
        o oVar = this.f12114c;
        WorkDatabase workDatabase = oVar.f11884c;
        final g gVar = new g(workDatabase);
        for (q qVar : qVarArr) {
            workDatabase.c();
            try {
                q g6 = workDatabase.t().g(qVar.f173a);
                String str = f12111e;
                String str2 = qVar.f173a;
                if (g6 == null) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (g6.f174b != 1) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j p5 = AbstractC1477a.p(qVar);
                    B0.g a6 = workDatabase.p().a(p5);
                    if (a6 != null) {
                        intValue = a6.f150c;
                    } else {
                        oVar.f11883b.getClass();
                        final int i2 = oVar.f11883b.f11757g;
                        Object n6 = ((WorkDatabase) gVar.f215b).n(new Callable() { // from class: C0.h
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                B1.g this$0 = B1.g.this;
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                WorkDatabase workDatabase2 = (WorkDatabase) this$0.f215b;
                                Long l2 = workDatabase2.l().l("next_job_scheduler_id");
                                int i3 = 0;
                                int longValue = l2 != null ? (int) l2.longValue() : 0;
                                workDatabase2.l().m(new B0.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i2) {
                                    workDatabase2.l().m(new B0.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i3 = longValue;
                                }
                                return Integer.valueOf(i3);
                            }
                        });
                        kotlin.jvm.internal.i.d(n6, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n6).intValue();
                    }
                    if (a6 == null) {
                        oVar.f11884c.p().c(new B0.g(p5.f157a, p5.f158b, intValue));
                    }
                    g(qVar, intValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    public final void g(q qVar, int i2) {
        int i3;
        int i6;
        JobScheduler jobScheduler = this.f12113b;
        C1505a c1505a = this.f12115d;
        c1505a.getClass();
        C1416d c1416d = qVar.f182j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = qVar.f173a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", qVar.f192t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", qVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i2, c1505a.f12110a).setRequiresCharging(c1416d.f11763b);
        boolean z = c1416d.f11764c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        int i7 = Build.VERSION.SDK_INT;
        int i8 = c1416d.f11762a;
        if (i7 < 30 || i8 != 6) {
            int b6 = O.j.b(i8);
            if (b6 != 0) {
                if (b6 != 1) {
                    if (b6 != 2) {
                        i3 = 3;
                        if (b6 != 3) {
                            i3 = 4;
                            if (b6 != 4 || i7 < 26) {
                                s.d().a(C1505a.f12109b, "API version too low. Cannot convert network type value ".concat(AbstractC0279e.q(i8)));
                            }
                        }
                    } else {
                        i3 = 2;
                    }
                }
                i3 = 1;
            } else {
                i3 = 0;
            }
            extras.setRequiredNetworkType(i3);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(qVar.f185m, qVar.f184l == 2 ? 0 : 1);
        }
        long max = Math.max(qVar.a() - System.currentTimeMillis(), 0L);
        if (i7 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!qVar.f189q) {
            extras.setImportantWhileForeground(true);
        }
        Set<C1415c> set = c1416d.f11769h;
        if (!set.isEmpty()) {
            for (C1415c c1415c : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c1415c.f11759a, c1415c.f11760b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c1416d.f11767f);
            extras.setTriggerContentMaxDelay(c1416d.f11768g);
        }
        extras.setPersisted(false);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            extras.setRequiresBatteryNotLow(c1416d.f11765d);
            extras.setRequiresStorageNotLow(c1416d.f11766e);
        }
        boolean z5 = qVar.f183k > 0;
        boolean z6 = max > 0;
        if (i9 >= 31 && qVar.f189q && !z5 && !z6) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f12111e;
        s.d().a(str2, "Scheduling work ID " + str + "Job ID " + i2);
        try {
            try {
                if (jobScheduler.schedule(build) == 0) {
                    s.d().g(str2, "Unable to schedule work ID " + str);
                    if (qVar.f189q) {
                        if (qVar.f190r == 1) {
                            i6 = 0;
                            try {
                                qVar.f189q = false;
                                s.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(qVar, i2);
                            } catch (IllegalStateException e3) {
                                e = e3;
                                ArrayList c2 = c(this.f12112a, jobScheduler);
                                int size = c2 != null ? c2.size() : i6;
                                Locale locale = Locale.getDefault();
                                Integer valueOf = Integer.valueOf(size);
                                o oVar = this.f12114c;
                                String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(oVar.f11884c.t().d().size()), Integer.valueOf(oVar.f11883b.f11758h));
                                s.d().b(str2, format);
                                IllegalStateException illegalStateException = new IllegalStateException(format, e);
                                oVar.f11883b.getClass();
                                throw illegalStateException;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                s.d().c(str2, "Unable to schedule " + qVar, th);
            }
        } catch (IllegalStateException e6) {
            e = e6;
            i6 = 0;
        }
    }
}
