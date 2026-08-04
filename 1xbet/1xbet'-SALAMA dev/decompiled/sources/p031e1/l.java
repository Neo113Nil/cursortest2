package p031e1;

import D0.i;
import D0.j;
import H2.q;
import J0.c;
import M4.e;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.v4.media.session.t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p023d1.b;
import p023d1.n;
import p033e3.h;
import p094n.a;
import p096n1.d;
import p113p3.f;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends f {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static l f12544D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static l f12545E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Object f12546F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final h f12547A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f12548B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f12549C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f12551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WorkDatabase f12552f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1050x1 f12553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f12554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f12555z;

    static {
        n.g("WorkManagerImpl");
        f12544D = null;
        f12545E = null;
        f12546F = new Object();
    }

    public l(Context context, b bVar, C1050x1 c1050x1) {
        D0.h hVar;
        Executor executor;
        String str;
        boolean z4 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        p096n1.h hVar2 = (p096n1.h) c1050x1.f17931b;
        int i7 = WorkDatabase.f9869k;
        if (z4) {
            hVar = new D0.h(applicationContext, null);
            hVar.f1648g = true;
        } else {
            String str2 = j.f12542a;
            hVar = new D0.h(applicationContext, "androidx.work.workdb");
            hVar.f1647f = new com.google.android.gms.common.h(applicationContext, 1);
        }
        hVar.f1645d = hVar2;
        f fVar = new f();
        if (hVar.f1644c == null) {
            hVar.f1644c = new ArrayList();
        }
        hVar.f1644c.add(fVar);
        hVar.a(i.f12535a);
        hVar.a(new h(2, applicationContext, 3));
        hVar.a(i.f12536b);
        hVar.a(i.f12537c);
        hVar.a(new h(5, applicationContext, 6));
        hVar.a(i.f12538d);
        hVar.a(i.f12539e);
        hVar.a(i.f12540f);
        hVar.a(new h(applicationContext));
        hVar.a(new h(10, applicationContext, 11));
        hVar.a(i.f12541g);
        hVar.f1649h = false;
        hVar.f1650i = true;
        Context context2 = hVar.f1643b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = hVar.f1645d;
        if (executor2 == null && hVar.f1646e == null) {
            a aVar = p094n.b.f15286e;
            hVar.f1646e = aVar;
            hVar.f1645d = aVar;
        } else if (executor2 != null && hVar.f1646e == null) {
            hVar.f1646e = executor2;
        } else if (executor2 == null && (executor = hVar.f1646e) != null) {
            hVar.f1645d = executor;
        }
        if (hVar.f1647f == null) {
            hVar.f1647f = new e();
        }
        J0.b bVar2 = hVar.f1647f;
        ArrayList arrayList = hVar.f1644c;
        boolean z7 = hVar.f1648g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        char c3 = (activityManager == null || activityManager.isLowRamDevice()) ? (char) 2 : (char) 3;
        Executor executor3 = hVar.f1645d;
        Executor executor4 = hVar.f1646e;
        boolean z8 = hVar.f1649h;
        boolean z9 = hVar.f1650i;
        String str3 = hVar.f1642a;
        i iVar = hVar.j;
        D0.a aVar2 = new D0.a();
        aVar2.f1619c = bVar2;
        aVar2.f1620d = context2;
        aVar2.f1621e = str3;
        aVar2.f1622f = iVar;
        aVar2.f1623g = executor3;
        aVar2.f1624h = executor4;
        aVar2.f1617a = z8;
        aVar2.f1618b = z9;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            j jVar = (j) Class.forName(str).newInstance();
            c cVarE = jVar.e(aVar2);
            jVar.f1655c = cVarE;
            if (cVarE instanceof D0.l) {
                ((D0.l) cVarE).getClass();
            }
            boolean z10 = c3 == 3;
            cVarE.setWriteAheadLoggingEnabled(z10);
            jVar.f1659g = arrayList;
            jVar.f1654b = executor3;
            new ArrayDeque();
            jVar.f1657e = z7;
            jVar.f1658f = z10;
            WorkDatabase workDatabase = (WorkDatabase) jVar;
            super(22);
            Context applicationContext2 = context.getApplicationContext();
            n nVar = new n(bVar.f12345f);
            synchronized (n.class) {
                n.f12370b = nVar;
            }
            String str5 = d.f12526a;
            p053h1.b bVar3 = new p053h1.b(applicationContext2, this);
            p096n1.f.a(applicationContext2, SystemJobService.class, true);
            n.d().b(d.f12526a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List listAsList = Arrays.asList(bVar3, new p039f1.b(applicationContext2, bVar, c1050x1, this));
            b bVar4 = new b(context, bVar, c1050x1, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.f12550d = applicationContext3;
            this.f12551e = bVar;
            this.f12553x = c1050x1;
            this.f12552f = workDatabase;
            this.f12554y = listAsList;
            this.f12555z = bVar4;
            this.f12547A = new h(workDatabase);
            this.f12548B = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f12553x.G(new d(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(k.h(new StringBuilder("Cannot access the constructor"), WorkDatabase.class));
        } catch (InstantiationException unused3) {
            throw new RuntimeException(k.h(new StringBuilder("Failed to create an instance of "), WorkDatabase.class));
        }
    }

    public static l m0(Context context) {
        l lVar;
        Object obj = f12546F;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        lVar = f12544D;
                        if (lVar == null) {
                            lVar = f12545E;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (lVar != null) {
            return lVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void n0(Context context, b bVar) {
        synchronized (f12546F) {
            try {
                l lVar = f12544D;
                if (lVar != null && f12545E != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (lVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f12545E == null) {
                        f12545E = new l(applicationContext, bVar, new C1050x1(bVar.f12341b));
                    }
                    f12544D = f12545E;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o0() {
        synchronized (f12546F) {
            try {
                this.f12548B = true;
                BroadcastReceiver.PendingResult pendingResult = this.f12549C;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f12549C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p0() {
        ArrayList arrayListD;
        WorkDatabase workDatabase = this.f12552f;
        Context context = this.f12550d;
        String str = p053h1.b.f13356e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListD = p053h1.b.d(context, jobScheduler)) != null && !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                p053h1.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        p019c5.a aVarN = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVarN.f10433a;
        workDatabase_Impl.b();
        p088m1.e eVar = (p088m1.e) aVarN.f10441i;
        K0.f fVarA = eVar.a();
        workDatabase_Impl.c();
        try {
            fVarA.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(fVarA);
            d.a(this.f12551e, workDatabase, this.f12554y);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            eVar.c(fVarA);
            throw th;
        }
    }

    public final void q0(String str, t tVar) {
        C1050x1 c1050x1 = this.f12553x;
        q qVar = new q(23);
        qVar.f3287b = this;
        qVar.f3288c = str;
        qVar.f3289d = tVar;
        c1050x1.G(qVar);
    }

    public final void r0(String str) {
        this.f12553x.G(new p096n1.i(this, str, false));
    }
}
