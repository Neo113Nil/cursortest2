package p053h1;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p023d1.n;
import p031e1.c;
import p031e1.l;
import p088m1.d;
import p088m1.i;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f13356e = n.g("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f13358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f13359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f13360d;

    public b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f13357a = context;
        this.f13359c = lVar;
        this.f13358b = jobScheduler;
        this.f13360d = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            n.d().c(f13356e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            n.d().c(f13356e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // p031e1.c
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    @Override // p031e1.c
    public final void c(String str) {
        String string;
        Context context = this.f13357a;
        JobScheduler jobScheduler = this.f13358b;
        ArrayList<JobInfo> arrayListD = d(context, jobScheduler);
        ArrayList arrayList = null;
        if (arrayListD != null) {
            ArrayList arrayList2 = new ArrayList(2);
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
                if (str.equals(string)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f13359c.f12552f.k().v0(str);
    }

    @Override // p031e1.c
    public final void e(i... iVarArr) {
        int iX;
        l lVar = this.f13359c;
        WorkDatabase workDatabase = lVar.f12552f;
        e eVar = new e(workDatabase, 0);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i iVarL = workDatabase.n().l(iVar.f15222a);
                String str = f13356e;
                if (iVarL == null) {
                    n.d().i(str, "Skipping scheduling " + iVar.f15222a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (iVarL.f15223b != 1) {
                    n.d().i(str, "Skipping scheduling " + iVar.f15222a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    d dVarF0 = workDatabase.k().f0(iVar.f15222a);
                    if (dVarF0 != null) {
                        iX = dVarF0.f15215b;
                    } else {
                        lVar.f12551e.getClass();
                        iX = eVar.x(lVar.f12551e.f12346g);
                    }
                    if (dVarF0 == null) {
                        lVar.f12552f.k().k0(new d(iVar.f15222a, iX));
                    }
                    f(iVar, iX);
                    workDatabase.h();
                }
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    public final void f(i iVar, int i7) {
        int i8;
        JobScheduler jobScheduler = this.f13358b;
        a aVar = this.f13360d;
        aVar.getClass();
        p023d1.c cVar = iVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f15222a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i7, aVar.f13355a).setRequiresCharging(cVar.f12350b).setRequiresDeviceIdle(cVar.f12351c).setExtras(persistableBundle);
        int i9 = cVar.f12349a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i9 != 6) {
            int iE = p136t.e.e(i9);
            if (iE == 0) {
                i8 = 0;
            } else if (iE == 1) {
                i8 = 1;
            } else if (iE != 2) {
                i8 = 3;
                if (iE != 3) {
                    i8 = 4;
                    if (iE != 4 || i10 < 26) {
                        n.d().b(a.f13354b, "API version too low. Cannot convert network type value ".concat(AbstractC0486a1.y(i9)), new Throwable[0]);
                        i8 = 1;
                    }
                }
            } else {
                i8 = 2;
            }
            extras.setRequiredNetworkType(i8);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f12351c) {
            extras.setBackoffCriteria(iVar.f15233m, iVar.f15232l == 2 ? 0 : 1);
        }
        long jMax = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (i10 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!iVar.f15237q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.f12356h.f12359a.size() > 0) {
            for (p023d1.d dVar : cVar.f12356h.f12359a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f12357a, dVar.f12358b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f12354f);
            extras.setTriggerContentMaxDelay(cVar.f12355g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f12352d);
            extras.setRequiresStorageNotLow(cVar.f12353e);
        }
        boolean z4 = iVar.f15231k > 0;
        if (L.b.b() && iVar.f15237q && !z4) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        n nVarD = n.d();
        String str = iVar.f15222a;
        String str2 = f13356e;
        nVarD.b(str2, "Scheduling work ID " + str + " Job ID " + i7, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                n.d().i(str2, "Unable to schedule work ID " + iVar.f15222a, new Throwable[0]);
                if (iVar.f15237q && iVar.f15238r == 1) {
                    iVar.f15237q = false;
                    n.d().b(str2, "Scheduling a non-expedited job (work ID " + iVar.f15222a + ")", new Throwable[0]);
                    f(iVar, i7);
                }
            }
        } catch (IllegalStateException e7) {
            ArrayList arrayListD = d(this.f13357a, jobScheduler);
            int size = arrayListD != null ? arrayListD.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            l lVar = this.f13359c;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(lVar.f12552f.n().g().size()), Integer.valueOf(lVar.f12551e.f12347h));
            n.d().c(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e7);
        } catch (Throwable th) {
            n.d().c(str2, "Unable to schedule " + iVar, th);
        }
    }
}
