package h1;

import W5.AbstractC0486a1;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import d1.C0950c;
import d1.C0951d;
import d1.n;
import e1.InterfaceC0996c;
import e1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m1.C1429d;
import m1.i;
import n1.C1450e;
import t.e;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178b implements InterfaceC0996c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f13350e = n.g("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f13351a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f13352b;

    /* renamed from: c, reason: collision with root package name */
    public final l f13353c;

    /* renamed from: d, reason: collision with root package name */
    public final C1177a f13354d;

    public C1178b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C1177a c1177a = new C1177a(context);
        this.f13351a = context;
        this.f13353c = lVar;
        this.f13352b = jobScheduler;
        this.f13354d = c1177a;
    }

    public static void b(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            n.d().c(f13350e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            n.d().c(f13350e, "getAllPendingJobs() is not reliable on this device.", th);
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

    @Override // e1.InterfaceC0996c
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[SYNTHETIC] */
    @Override // e1.InterfaceC0996c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        String string;
        Context context = this.f13351a;
        JobScheduler jobScheduler = this.f13352b;
        ArrayList d7 = d(context, jobScheduler);
        ArrayList arrayList = null;
        if (d7 != null) {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = d7.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        string = extras.getString("EXTRA_WORK_SPEC_ID");
                        if (!str.equals(string)) {
                            arrayList2.add(Integer.valueOf(jobInfo.getId()));
                        }
                    }
                }
                string = null;
                if (!str.equals(string)) {
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
        this.f13353c.f12546f.k().v0(str);
    }

    @Override // e1.InterfaceC0996c
    public final void e(i... iVarArr) {
        int x4;
        l lVar = this.f13353c;
        WorkDatabase workDatabase = lVar.f12546f;
        C1450e c1450e = new C1450e(workDatabase, 0);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i l7 = workDatabase.n().l(iVar.f15216a);
                String str = f13350e;
                if (l7 == null) {
                    n.d().i(str, "Skipping scheduling " + iVar.f15216a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (l7.f15217b != 1) {
                    n.d().i(str, "Skipping scheduling " + iVar.f15216a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    C1429d f02 = workDatabase.k().f0(iVar.f15216a);
                    if (f02 != null) {
                        x4 = f02.f15209b;
                    } else {
                        lVar.f12545e.getClass();
                        x4 = c1450e.x(lVar.f12545e.f12340g);
                    }
                    if (f02 == null) {
                        lVar.f12546f.k().k0(new C1429d(iVar.f15216a, x4));
                    }
                    f(iVar, x4);
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    public final void f(i iVar, int i7) {
        int i8;
        JobScheduler jobScheduler = this.f13352b;
        C1177a c1177a = this.f13354d;
        c1177a.getClass();
        C0950c c0950c = iVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f15216a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i7, c1177a.f13349a).setRequiresCharging(c0950c.f12344b).setRequiresDeviceIdle(c0950c.f12345c).setExtras(persistableBundle);
        int i9 = c0950c.f12343a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i9 != 6) {
            int e7 = e.e(i9);
            if (e7 != 0) {
                if (e7 != 1) {
                    if (e7 != 2) {
                        i8 = 3;
                        if (e7 != 3) {
                            i8 = 4;
                            if (e7 != 4 || i10 < 26) {
                                n.d().b(C1177a.f13348b, "API version too low. Cannot convert network type value ".concat(AbstractC0486a1.y(i9)), new Throwable[0]);
                            }
                        }
                    } else {
                        i8 = 2;
                    }
                }
                i8 = 1;
            } else {
                i8 = 0;
            }
            extras.setRequiredNetworkType(i8);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!c0950c.f12345c) {
            extras.setBackoffCriteria(iVar.f15227m, iVar.f15226l == 2 ? 0 : 1);
        }
        long max = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (i10 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!iVar.f15231q) {
            extras.setImportantWhileForeground(true);
        }
        if (c0950c.f12350h.f12353a.size() > 0) {
            Iterator it = c0950c.f12350h.f12353a.iterator();
            while (it.hasNext()) {
                C0951d c0951d = (C0951d) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c0951d.f12351a, c0951d.f12352b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c0950c.f12348f);
            extras.setTriggerContentMaxDelay(c0950c.f12349g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c0950c.f12346d);
            extras.setRequiresStorageNotLow(c0950c.f12347e);
        }
        boolean z4 = iVar.f15225k > 0;
        if (L.b.b() && iVar.f15231q && !z4) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        n d7 = n.d();
        String str = iVar.f15216a;
        String str2 = f13350e;
        d7.b(str2, "Scheduling work ID " + str + " Job ID " + i7, new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                n.d().i(str2, "Unable to schedule work ID " + iVar.f15216a, new Throwable[0]);
                if (iVar.f15231q && iVar.f15232r == 1) {
                    iVar.f15231q = false;
                    n.d().b(str2, "Scheduling a non-expedited job (work ID " + iVar.f15216a + ")", new Throwable[0]);
                    f(iVar, i7);
                }
            }
        } catch (IllegalStateException e8) {
            ArrayList d8 = d(this.f13351a, jobScheduler);
            int size = d8 != null ? d8.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            l lVar = this.f13353c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(lVar.f12546f.n().g().size()), Integer.valueOf(lVar.f12545e.f12341h));
            n.d().c(str2, format, new Throwable[0]);
            throw new IllegalStateException(format, e8);
        } catch (Throwable th) {
            n.d().c(str2, "Unable to schedule " + iVar, th);
        }
    }
}
