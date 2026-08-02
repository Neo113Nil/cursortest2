package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.work.impl.C;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.r;
import androidx.work.o;
import androidx.work.s;
import androidx.work.v;
import g5.C6627B;
import g5.C6637j;
import g5.C6643p;
import g5.S;
import h5.C6810h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: e, reason: collision with root package name */
    private static final String f45421e = o.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f45422a;

    /* renamed from: b, reason: collision with root package name */
    private final JobScheduler f45423b;

    /* renamed from: c, reason: collision with root package name */
    private final C f45424c;

    /* renamed from: d, reason: collision with root package name */
    private final d f45425d;

    public e(@NonNull Context context, @NonNull C c11) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        d dVar = new d(context);
        this.f45422a = context;
        this.f45424c = c11;
        this.f45423b = jobScheduler;
        this.f45425d = dVar;
    }

    public static void b(@NonNull Context context) {
        ArrayList f7;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (f7 = f(context, jobScheduler)) == null || f7.isEmpty()) {
            return;
        }
        Iterator it = f7.iterator();
        while (it.hasNext()) {
            e(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void e(@NonNull JobScheduler jobScheduler, int i11) {
        try {
            jobScheduler.cancel(i11);
        } catch (Throwable th2) {
            o.e().d(f45421e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i11)), th2);
        }
    }

    private static ArrayList f(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            o.e().d(f45421e, "getAllPendingJobs() is not reliable on this device.", th2);
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

    private static C6643p g(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C6643p(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean h(@NonNull Context context, @NonNull C c11) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList f7 = f(context, jobScheduler);
        ArrayList c12 = c11.n().c().c();
        boolean z11 = false;
        HashSet hashSet = new HashSet(f7 != null ? f7.size() : 0);
        if (f7 != null && !f7.isEmpty()) {
            Iterator it = f7.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                C6643p g10 = g(jobInfo);
                if (g10 != null) {
                    hashSet.add(g10.b());
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it2 = c12.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it2.next())) {
                o.e().a(f45421e, "Reconciling jobs");
                z11 = true;
                break;
            }
        }
        if (!z11) {
            return z11;
        }
        WorkDatabase n11 = c11.n();
        n11.beginTransaction();
        try {
            g5.C f11 = n11.f();
            Iterator it3 = c12.iterator();
            while (it3.hasNext()) {
                f11.j(-1L, (String) it3.next());
            }
            n11.setTransactionSuccessful();
            n11.endTransaction();
            return z11;
        } catch (Throwable th2) {
            n11.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.r
    public final void a(@NonNull C6627B... c6627bArr) {
        int d11;
        C c11 = this.f45424c;
        WorkDatabase n11 = c11.n();
        C6810h c6810h = new C6810h(n11);
        for (C6627B c6627b : c6627bArr) {
            n11.beginTransaction();
            try {
                C6627B m11 = n11.f().m(c6627b.f63799a);
                String str = f45421e;
                String str2 = c6627b.f63799a;
                if (m11 == null) {
                    o.e().k(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    n11.setTransactionSuccessful();
                } else if (m11.f63800b != v.a.ENQUEUED) {
                    o.e().k(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    n11.setTransactionSuccessful();
                } else {
                    C6643p generationalId = S.a(c6627b);
                    C6637j a11 = n11.c().a(generationalId);
                    if (a11 != null) {
                        d11 = a11.f63859c;
                    } else {
                        c11.h().getClass();
                        d11 = c6810h.d(c11.h().c());
                    }
                    if (a11 == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        c11.n().c().b(new C6637j(generationalId.b(), generationalId.a(), d11));
                    }
                    i(c6627b, d11);
                    n11.setTransactionSuccessful();
                }
            } finally {
                n11.endTransaction();
            }
        }
    }

    @Override // androidx.work.impl.r
    public final boolean c() {
        return true;
    }

    @Override // androidx.work.impl.r
    public final void d(@NonNull String str) {
        ArrayList arrayList;
        Context context = this.f45422a;
        JobScheduler jobScheduler = this.f45423b;
        ArrayList f7 = f(context, jobScheduler);
        if (f7 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = f7.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                C6643p g10 = g(jobInfo);
                if (g10 != null && str.equals(g10.b())) {
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
            e(jobScheduler, ((Integer) it2.next()).intValue());
        }
        this.f45424c.n().c().e(str);
    }

    public final void i(@NonNull C6627B c6627b, int i11) {
        JobScheduler jobScheduler = this.f45423b;
        JobInfo a11 = this.f45425d.a(c6627b, i11);
        o e11 = o.e();
        StringBuilder sb2 = new StringBuilder("Scheduling work ID ");
        String str = c6627b.f63799a;
        sb2.append(str);
        sb2.append("Job ID ");
        sb2.append(i11);
        String sb3 = sb2.toString();
        String str2 = f45421e;
        e11.a(str2, sb3);
        try {
            if (jobScheduler.schedule(a11) == 0) {
                o.e().k(str2, "Unable to schedule work ID " + str);
                if (c6627b.f63815q && c6627b.f63816r == s.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c6627b.f63815q = false;
                    o.e().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    i(c6627b, i11);
                }
            }
        } catch (IllegalStateException e12) {
            ArrayList f7 = f(this.f45422a, jobScheduler);
            int size = f7 != null ? f7.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            C c11 = this.f45424c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(c11.n().f().l().size()), Integer.valueOf(c11.h().d()));
            o.e().c(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e12);
            c11.h().getClass();
            throw illegalStateException;
        } catch (Throwable th2) {
            o.e().d(str2, "Unable to schedule " + c6627b, th2);
        }
    }
}
