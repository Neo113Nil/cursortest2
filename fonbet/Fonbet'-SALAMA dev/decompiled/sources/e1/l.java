package e1;

import H2.q;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.v4.media.session.t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import c5.C0820a;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import d1.C0949b;
import d1.n;
import e3.C1023h;
import f1.C1068b;
import h1.C1178b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import m1.C1430e;
import n.C1442b;
import n.ExecutorC1441a;
import n1.AbstractC1451f;
import n1.ExecutorC1453h;
import n1.RunnableC1449d;
import n1.RunnableC1454i;
import w1.C1759x1;

/* loaded from: classes.dex */
public final class l extends p3.f {

    /* renamed from: D, reason: collision with root package name */
    public static l f12538D;

    /* renamed from: E, reason: collision with root package name */
    public static l f12539E;

    /* renamed from: F, reason: collision with root package name */
    public static final Object f12540F;

    /* renamed from: A, reason: collision with root package name */
    public final C1023h f12541A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f12542B;

    /* renamed from: C, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f12543C;

    /* renamed from: d, reason: collision with root package name */
    public final Context f12544d;

    /* renamed from: e, reason: collision with root package name */
    public final C0949b f12545e;

    /* renamed from: f, reason: collision with root package name */
    public final WorkDatabase f12546f;

    /* renamed from: x, reason: collision with root package name */
    public final C1759x1 f12547x;

    /* renamed from: y, reason: collision with root package name */
    public final List f12548y;

    /* renamed from: z, reason: collision with root package name */
    public final C0995b f12549z;

    static {
        n.g("WorkManagerImpl");
        f12538D = null;
        f12539E = null;
        f12540F = new Object();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, C0949b c0949b, C1759x1 c1759x1) {
        super(22);
        D0.h hVar;
        Executor executor;
        String str;
        boolean z4 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        ExecutorC1453h executorC1453h = (ExecutorC1453h) c1759x1.f17925b;
        int i7 = WorkDatabase.f9869k;
        if (z4) {
            hVar = new D0.h(applicationContext, null);
            hVar.f1648g = true;
        } else {
            String str2 = AbstractC1003j.f12536a;
            hVar = new D0.h(applicationContext, "androidx.work.workdb");
            hVar.f1647f = new com.google.android.gms.common.h(applicationContext, 1);
        }
        hVar.f1645d = executorC1453h;
        C0999f c0999f = new C0999f();
        if (hVar.f1644c == null) {
            hVar.f1644c = new ArrayList();
        }
        hVar.f1644c.add(c0999f);
        hVar.a(AbstractC1002i.f12529a);
        hVar.a(new C1001h(2, applicationContext, 3));
        hVar.a(AbstractC1002i.f12530b);
        hVar.a(AbstractC1002i.f12531c);
        hVar.a(new C1001h(5, applicationContext, 6));
        hVar.a(AbstractC1002i.f12532d);
        hVar.a(AbstractC1002i.f12533e);
        hVar.a(AbstractC1002i.f12534f);
        hVar.a(new C1001h(applicationContext));
        hVar.a(new C1001h(10, applicationContext, 11));
        hVar.a(AbstractC1002i.f12535g);
        hVar.f1649h = false;
        hVar.f1650i = true;
        Context context2 = hVar.f1643b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = hVar.f1645d;
        if (executor2 == null && hVar.f1646e == null) {
            ExecutorC1441a executorC1441a = C1442b.f15280e;
            hVar.f1646e = executorC1441a;
            hVar.f1645d = executorC1441a;
        } else if (executor2 != null && hVar.f1646e == null) {
            hVar.f1646e = executor2;
        } else if (executor2 == null && (executor = hVar.f1646e) != null) {
            hVar.f1645d = executor;
        }
        if (hVar.f1647f == null) {
            hVar.f1647f = new M4.e();
        }
        J0.b bVar = hVar.f1647f;
        ArrayList arrayList = hVar.f1644c;
        boolean z7 = hVar.f1648g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        char c3 = (activityManager == null || activityManager.isLowRamDevice()) ? (char) 2 : (char) 3;
        Executor executor3 = hVar.f1645d;
        Executor executor4 = hVar.f1646e;
        boolean z8 = hVar.f1649h;
        boolean z9 = hVar.f1650i;
        String str3 = hVar.f1642a;
        D0.i iVar = hVar.j;
        D0.a aVar = new D0.a();
        aVar.f1619c = bVar;
        aVar.f1620d = context2;
        aVar.f1621e = str3;
        aVar.f1622f = iVar;
        aVar.f1623g = executor3;
        aVar.f1624h = executor4;
        aVar.f1617a = z8;
        aVar.f1618b = z9;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            D0.j jVar = (D0.j) Class.forName(str).newInstance();
            J0.c e7 = jVar.e(aVar);
            jVar.f1655c = e7;
            if (e7 instanceof D0.l) {
                ((D0.l) e7).getClass();
            }
            boolean z10 = c3 == 3;
            e7.setWriteAheadLoggingEnabled(z10);
            jVar.f1659g = arrayList;
            jVar.f1654b = executor3;
            new ArrayDeque();
            jVar.f1657e = z7;
            jVar.f1658f = z10;
            WorkDatabase workDatabase = (WorkDatabase) jVar;
            Context applicationContext2 = context.getApplicationContext();
            n nVar = new n(c0949b.f12339f);
            synchronized (n.class) {
                n.f12364b = nVar;
            }
            String str5 = AbstractC0997d.f12520a;
            C1178b c1178b = new C1178b(applicationContext2, this);
            AbstractC1451f.a(applicationContext2, SystemJobService.class, true);
            n.d().b(AbstractC0997d.f12520a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List asList = Arrays.asList(c1178b, new C1068b(applicationContext2, c0949b, c1759x1, this));
            C0995b c0995b = new C0995b(context, c0949b, c1759x1, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.f12544d = applicationContext3;
            this.f12545e = c0949b;
            this.f12547x = c1759x1;
            this.f12546f = workDatabase;
            this.f12548y = asList;
            this.f12549z = c0995b;
            this.f12541A = new C1023h(workDatabase);
            this.f12542B = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f12547x.G(new RunnableC1449d(applicationContext3, this));
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
        Object obj = f12540F;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    lVar = f12538D;
                    if (lVar == null) {
                        lVar = f12539E;
                    }
                }
                return lVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (lVar != null) {
            return lVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (e1.l.f12539E != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        e1.l.f12539E = new e1.l(r4, r5, new w1.C1759x1(r5.f12335b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        e1.l.f12538D = e1.l.f12539E;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n0(Context context, C0949b c0949b) {
        synchronized (f12540F) {
            try {
                l lVar = f12538D;
                if (lVar != null && f12539E != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void o0() {
        synchronized (f12540F) {
            try {
                this.f12542B = true;
                BroadcastReceiver.PendingResult pendingResult = this.f12543C;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f12543C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p0() {
        ArrayList d7;
        WorkDatabase workDatabase = this.f12546f;
        Context context = this.f12544d;
        String str = C1178b.f13350e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d7 = C1178b.d(context, jobScheduler)) != null && !d7.isEmpty()) {
            Iterator it = d7.iterator();
            while (it.hasNext()) {
                C1178b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        C0820a n2 = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n2.f10433a;
        workDatabase_Impl.b();
        C1430e c1430e = (C1430e) n2.f10441i;
        K0.f a2 = c1430e.a();
        workDatabase_Impl.c();
        try {
            a2.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            c1430e.c(a2);
            AbstractC0997d.a(this.f12545e, workDatabase, this.f12548y);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            c1430e.c(a2);
            throw th;
        }
    }

    public final void q0(String str, t tVar) {
        C1759x1 c1759x1 = this.f12547x;
        q qVar = new q(23);
        qVar.f3287b = this;
        qVar.f3288c = str;
        qVar.f3289d = tVar;
        c1759x1.G(qVar);
    }

    public final void r0(String str) {
        this.f12547x.G(new RunnableC1454i(this, str, false));
    }
}
