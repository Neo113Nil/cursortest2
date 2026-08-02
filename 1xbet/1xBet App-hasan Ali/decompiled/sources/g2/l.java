package g2;

import L4.n;
import S2.q;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.internal.ads.G7;
import f2.C1944b;
import game.betting133.sports1xbet.R;
import h2.C1993b;
import j2.C2019b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o.C2191a;
import p2.AbstractC2249g;
import p2.C2248f;
import p2.ExecutorC2251i;
import p2.RunnableC2247e;
import p2.RunnableC2252j;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class l extends AbstractC2425d {

    /* renamed from: t, reason: collision with root package name */
    public static l f17125t;

    /* renamed from: u, reason: collision with root package name */
    public static l f17126u;

    /* renamed from: v, reason: collision with root package name */
    public static final Object f17127v;

    /* renamed from: k, reason: collision with root package name */
    public final Context f17128k;

    /* renamed from: l, reason: collision with root package name */
    public final C1944b f17129l;

    /* renamed from: m, reason: collision with root package name */
    public final WorkDatabase f17130m;

    /* renamed from: n, reason: collision with root package name */
    public final v3.e f17131n;

    /* renamed from: o, reason: collision with root package name */
    public final List f17132o;

    /* renamed from: p, reason: collision with root package name */
    public final C1978b f17133p;

    /* renamed from: q, reason: collision with root package name */
    public final C2248f f17134q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17135r;

    /* renamed from: s, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f17136s;

    static {
        f2.m.f("WorkManagerImpl");
        f17125t = null;
        f17126u = null;
        f17127v = new Object();
    }

    public l(Context context, C1944b c1944b, v3.e eVar) {
        R1.g gVar;
        Executor executor;
        String str;
        boolean isDeviceProtectedStorage;
        boolean z3 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        ExecutorC2251i executorC2251i = (ExecutorC2251i) eVar.f20432l;
        int i = WorkDatabase.f7099k;
        if (z3) {
            gVar = new R1.g(applicationContext, null);
            gVar.f5147g = true;
        } else {
            String str2 = k.f17123a;
            gVar = new R1.g(applicationContext, "androidx.work.workdb");
            gVar.f = new C1982f(applicationContext);
        }
        gVar.f5145d = executorC2251i;
        g gVar2 = new g();
        if (gVar.f5144c == null) {
            gVar.f5144c = new ArrayList();
        }
        gVar.f5144c.add(gVar2);
        gVar.a(j.f17117a);
        gVar.a(new i(applicationContext, 2, 3));
        gVar.a(j.f17118b);
        gVar.a(j.f17119c);
        gVar.a(new i(applicationContext, 5, 6));
        gVar.a(j.f17120d);
        gVar.a(j.f17121e);
        gVar.a(j.f);
        gVar.a(new i(applicationContext));
        gVar.a(new i(applicationContext, 10, 11));
        gVar.a(j.f17122g);
        gVar.f5148h = false;
        gVar.i = true;
        Context context2 = gVar.f5143b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = gVar.f5145d;
        if (executor2 == null && gVar.f5146e == null) {
            O1.b bVar = C2191a.f18495p;
            gVar.f5146e = bVar;
            gVar.f5145d = bVar;
        } else if (executor2 != null && gVar.f5146e == null) {
            gVar.f5146e = executor2;
        } else if (executor2 == null && (executor = gVar.f5146e) != null) {
            gVar.f5145d = executor;
        }
        if (gVar.f == null) {
            gVar.f = new Q1.j(15);
        }
        X1.a aVar = gVar.f;
        ArrayList arrayList = gVar.f5144c;
        boolean z5 = gVar.f5147g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i5 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = gVar.f5145d;
        n nVar = new n(context2, gVar.f5142a, aVar, gVar.f5149j, arrayList, z5, i5, executor3, gVar.f5146e, gVar.f5148h, gVar.i);
        int i6 = i5;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str3 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str3;
            } else {
                str = name + "." + str3;
            }
            R1.h hVar = (R1.h) Class.forName(str).newInstance();
            X1.b e3 = hVar.e(nVar);
            hVar.f5153c = e3;
            if (e3 instanceof R1.k) {
                ((R1.k) e3).getClass();
            }
            boolean z6 = i6 == 3;
            e3.setWriteAheadLoggingEnabled(z6);
            hVar.f5156g = arrayList;
            hVar.f5152b = executor3;
            new ArrayDeque();
            hVar.f5155e = z5;
            hVar.f = z6;
            WorkDatabase workDatabase = (WorkDatabase) hVar;
            Context applicationContext2 = context.getApplicationContext();
            f2.m mVar = new f2.m(c1944b.f, 0);
            synchronized (f2.m.class) {
                f2.m.f17001m = mVar;
            }
            String str4 = AbstractC1980d.f17106a;
            C2019b c2019b = new C2019b(applicationContext2, this);
            AbstractC2249g.a(applicationContext2, SystemJobService.class, true);
            f2.m.d().a(AbstractC1980d.f17106a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List asList = Arrays.asList(c2019b, new C1993b(applicationContext2, c1944b, eVar, this));
            C1978b c1978b = new C1978b(context, c1944b, eVar, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.f17128k = applicationContext3;
            this.f17129l = c1944b;
            this.f17131n = eVar;
            this.f17130m = workDatabase;
            this.f17132o = asList;
            this.f17133p = c1978b;
            this.f17134q = new C2248f(workDatabase);
            this.f17135r = false;
            if (Build.VERSION.SDK_INT >= 24) {
                isDeviceProtectedStorage = applicationContext3.isDeviceProtectedStorage();
                if (isDeviceProtectedStorage) {
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                }
            }
            this.f17131n.t(new RunnableC2247e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static l P() {
        synchronized (f17127v) {
            try {
                l lVar = f17125t;
                if (lVar != null) {
                    return lVar;
                }
                return f17126u;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static l Q(Context context) {
        l P5;
        synchronized (f17127v) {
            try {
                P5 = P();
                if (P5 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return P5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (g2.l.f17126u != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        g2.l.f17126u = new g2.l(r4, r5, new v3.e(r5.f16976b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        g2.l.f17125t = g2.l.f17126u;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void R(Context context, C1944b c1944b) {
        synchronized (f17127v) {
            try {
                l lVar = f17125t;
                if (lVar != null && f17126u != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void S() {
        synchronized (f17127v) {
            try {
                this.f17135r = true;
                BroadcastReceiver.PendingResult pendingResult = this.f17136s;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f17136s = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T() {
        ArrayList e3;
        WorkDatabase workDatabase = this.f17130m;
        Context context = this.f17128k;
        String str = C2019b.f17493o;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e3 = C2019b.e(context, jobScheduler)) != null && !e3.isEmpty()) {
            int size = e3.size();
            int i = 0;
            while (i < size) {
                Object obj = e3.get(i);
                i++;
                C2019b.a(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        G7 n5 = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n5.f9170a;
        workDatabase_Impl.b();
        o2.e eVar = (o2.e) n5.i;
        Y1.f a5 = eVar.a();
        workDatabase_Impl.c();
        try {
            a5.f6136n.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(a5);
            AbstractC1980d.a(this.f17129l, workDatabase, this.f17132o);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            eVar.c(a5);
            throw th;
        }
    }

    public final void U(String str, v3.e eVar) {
        v3.e eVar2 = this.f17131n;
        q qVar = new q(11);
        qVar.f5347l = this;
        qVar.f5348m = str;
        qVar.f5349n = eVar;
        eVar2.t(qVar);
    }

    public final void V(String str) {
        this.f17131n.t(new RunnableC2252j(this, str, false));
    }
}
