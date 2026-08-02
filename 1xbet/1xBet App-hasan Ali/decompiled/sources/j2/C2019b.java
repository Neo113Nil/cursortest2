package j2;

import a3.AbstractC0467k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.internal.ads.TC;
import f2.C1944b;
import f2.C1945c;
import f2.C1946d;
import f2.m;
import g2.InterfaceC1979c;
import g2.l;
import j1.AbstractC2017a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o2.d;
import o2.i;
import p2.C2248f;
import u.AbstractC2462i;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2019b implements InterfaceC1979c {

    /* renamed from: o, reason: collision with root package name */
    public static final String f17493o = m.f("SystemJobScheduler");

    /* renamed from: k, reason: collision with root package name */
    public final Context f17494k;

    /* renamed from: l, reason: collision with root package name */
    public final JobScheduler f17495l;

    /* renamed from: m, reason: collision with root package name */
    public final l f17496m;

    /* renamed from: n, reason: collision with root package name */
    public final C2018a f17497n;

    public C2019b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C2018a c2018a = new C2018a(context);
        this.f17494k = context;
        this.f17496m = lVar;
        this.f17495l = jobScheduler;
        this.f17497n = c2018a;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            m.d().b(f17493o, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c(Context context, JobScheduler jobScheduler, String str) {
        String string;
        ArrayList e3 = e(context, jobScheduler);
        if (e3 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        int size = e3.size();
        int i = 0;
        while (i < size) {
            Object obj = e3.get(i);
            i++;
            JobInfo jobInfo = (JobInfo) obj;
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    string = extras.getString("EXTRA_WORK_SPEC_ID");
                    if (!str.equals(string)) {
                        arrayList.add(Integer.valueOf(jobInfo.getId()));
                    }
                }
            }
            string = null;
            if (!str.equals(string)) {
            }
        }
        return arrayList;
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.d().b(f17493o, "getAllPendingJobs() is not reliable on this device.", th);
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

    @Override // g2.InterfaceC1979c
    public final void b(String str) {
        Context context = this.f17494k;
        JobScheduler jobScheduler = this.f17495l;
        ArrayList c5 = c(context, jobScheduler, str);
        if (c5 == null || c5.isEmpty()) {
            return;
        }
        int size = c5.size();
        int i = 0;
        while (i < size) {
            Object obj = c5.get(i);
            i++;
            a(jobScheduler, ((Integer) obj).intValue());
        }
        this.f17496m.f17130m.k().K(str);
    }

    @Override // g2.InterfaceC1979c
    public final void d(i... iVarArr) {
        int a5;
        ArrayList c5;
        int a6;
        l lVar = this.f17496m;
        WorkDatabase workDatabase = lVar.f17130m;
        C2248f c2248f = new C2248f(workDatabase);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i h3 = workDatabase.n().h(iVar.f18633a);
                String str = f17493o;
                if (h3 == null) {
                    m.d().h(str, "Skipping scheduling " + iVar.f18633a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (h3.f18634b != 1) {
                    m.d().h(str, "Skipping scheduling " + iVar.f18633a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    d B5 = workDatabase.k().B(iVar.f18633a);
                    if (B5 != null) {
                        a5 = B5.f18626b;
                    } else {
                        lVar.f17129l.getClass();
                        a5 = c2248f.a(lVar.f17129l.f16980g);
                    }
                    if (B5 == null) {
                        lVar.f17130m.k().D(new d(iVar.f18633a, a5));
                    }
                    g(iVar, a5);
                    if (Build.VERSION.SDK_INT == 23 && (c5 = c(this.f17494k, this.f17495l, iVar.f18633a)) != null) {
                        int indexOf = c5.indexOf(Integer.valueOf(a5));
                        if (indexOf >= 0) {
                            c5.remove(indexOf);
                        }
                        if (c5.isEmpty()) {
                            lVar.f17129l.getClass();
                            a6 = c2248f.a(lVar.f17129l.f16980g);
                        } else {
                            a6 = ((Integer) c5.get(0)).intValue();
                        }
                        g(iVar, a6);
                    }
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // g2.InterfaceC1979c
    public final boolean f() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0071, code lost:
    
        if (r11 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(i iVar, int i) {
        int i5;
        int i6;
        JobScheduler jobScheduler = this.f17495l;
        C2018a c2018a = this.f17497n;
        c2018a.getClass();
        C1945c c1945c = iVar.f18640j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f18633a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, c2018a.f17492a).setRequiresCharging(c1945c.f16983b).setRequiresDeviceIdle(c1945c.f16984c).setExtras(persistableBundle);
        int i7 = c1945c.f16982a;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30 || i7 != 6) {
            int b3 = AbstractC2462i.b(i7);
            if (b3 != 0) {
                if (b3 != 1) {
                    if (b3 == 2) {
                        i5 = 2;
                    } else if (b3 != 3) {
                        i5 = 4;
                        if (b3 == 4) {
                        }
                        m.d().a(C2018a.f17491b, "API version too low. Cannot convert network type value ".concat(AbstractC0467k.E(i7)), new Throwable[0]);
                    } else {
                        if (i8 >= 24) {
                            i5 = 3;
                        }
                        m.d().a(C2018a.f17491b, "API version too low. Cannot convert network type value ".concat(AbstractC0467k.E(i7)), new Throwable[0]);
                    }
                }
                i5 = 1;
            } else {
                i5 = 0;
            }
            extras.setRequiredNetworkType(i5);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (c1945c.f16984c) {
            i6 = 2;
        } else {
            i6 = 2;
            extras.setBackoffCriteria(iVar.f18643m, iVar.f18642l == 2 ? 0 : 1);
        }
        long max = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (i8 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!iVar.f18647q) {
            extras.setImportantWhileForeground(true);
        }
        if (i8 >= 24 && c1945c.f16988h.f16991a.size() > 0) {
            Iterator it = c1945c.f16988h.f16991a.iterator();
            while (it.hasNext()) {
                C1946d c1946d = (C1946d) it.next();
                boolean z3 = c1946d.f16990b;
                TC.C();
                extras.addTriggerContentUri(TC.b(c1946d.f16989a, z3 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c1945c.f);
            extras.setTriggerContentMaxDelay(c1945c.f16987g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c1945c.f16985d);
            extras.setRequiresStorageNotLow(c1945c.f16986e);
        }
        boolean z5 = iVar.f18641k > 0;
        if (AbstractC2017a.a() && iVar.f18647q && !z5) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        m d5 = m.d();
        String str = iVar.f18633a;
        String str2 = f17493o;
        d5.a(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                m.d().h(str2, "Unable to schedule work ID " + iVar.f18633a, new Throwable[0]);
                if (iVar.f18647q && iVar.f18648r == 1) {
                    iVar.f18647q = false;
                    m.d().a(str2, "Scheduling a non-expedited job (work ID " + iVar.f18633a + ")", new Throwable[0]);
                    g(iVar, i);
                }
            }
        } catch (IllegalStateException e3) {
            ArrayList e5 = e(this.f17494k, jobScheduler);
            int size = e5 != null ? e5.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            l lVar = this.f17496m;
            Integer valueOf2 = Integer.valueOf(lVar.f17130m.n().d().size());
            C1944b c1944b = lVar.f17129l;
            int i9 = Build.VERSION.SDK_INT;
            int i10 = c1944b.f16981h;
            if (i9 == 23) {
                i10 /= i6;
            }
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr = new Object[3];
            objArr[0] = valueOf;
            objArr[1] = valueOf2;
            objArr[i6] = valueOf3;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            m.d().b(str2, format, new Throwable[0]);
            throw new IllegalStateException(format, e3);
        } catch (Throwable th) {
            m.d().b(str2, "Unable to schedule " + iVar, th);
        }
    }
}
