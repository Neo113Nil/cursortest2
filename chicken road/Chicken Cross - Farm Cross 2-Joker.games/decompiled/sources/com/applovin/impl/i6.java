package com.applovin.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class i6 {
    private static final ExecutorService q = Executors.newFixedThreadPool(4);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4243a;
    private final com.applovin.impl.sdk.p b;
    private final ScheduledThreadPoolExecutor c;
    private final ScheduledThreadPoolExecutor d;
    private final ScheduledThreadPoolExecutor e;
    private final ScheduledThreadPoolExecutor f;
    private final ScheduledThreadPoolExecutor g;
    private final ScheduledThreadPoolExecutor h;
    private final ScheduledThreadPoolExecutor i;
    private ExecutorService k;
    private ExecutorService l;
    private boolean o;
    private boolean p;
    private final Map j = new HashMap();
    private final List m = new ArrayList(5);
    private final Object n = new Object();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4244a;

        static {
            int[] iArr = new int[b.values().length];
            f4244a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4244a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4244a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4244a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    private static class c extends e {
        private final long f;

        public c(com.applovin.impl.sdk.l lVar, n5 n5Var, b bVar, long j) {
            super(lVar, n5Var, bVar);
            this.f = j;
        }
    }

    private class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final String f4246a;

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.p unused = i6.this.b;
                if (com.applovin.impl.sdk.p.a()) {
                    i6.this.b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        d(String str) {
            this.f4246a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f4246a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) i6.this.f4243a.a(c5.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f4248a;
        private final String b;
        private final com.applovin.impl.sdk.p c;
        protected final n5 d;
        protected final b e;

        public e(com.applovin.impl.sdk.l lVar, n5 n5Var, b bVar) {
            this.f4248a = lVar;
            this.c = lVar.Q();
            this.b = n5Var.c();
            this.d = n5Var;
            this.e = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            try {
                p0.a();
                if (this.f4248a.G0() && !this.d.d()) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.d(this.b, "Task re-scheduled...");
                    }
                    this.f4248a.s0().a(this.d, this.e, 2000L);
                    if (com.applovin.impl.sdk.p.a()) {
                        return;
                    }
                    this.c.d(this.b, this.e + " queue finished task " + this.d.c());
                    return;
                }
                ScheduledFuture b = this.d.b(Thread.currentThread(), ((Long) this.f4248a.a(c5.v)).longValue());
                this.d.run();
                if (b != null) {
                    b.cancel(false);
                }
                if (com.applovin.impl.sdk.p.a()) {
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.b, "Task failed execution", th);
                    }
                    this.d.a(th);
                } finally {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.d(this.b, this.e + " queue finished task " + this.d.c());
                    }
                }
            }
        }
    }

    public i6(com.applovin.impl.sdk.l lVar) {
        this.f4243a = lVar;
        this.b = lVar.Q();
        this.p = ((Boolean) lVar.a(c5.T)).booleanValue();
        this.c = b("auxiliary_operations", ((Integer) lVar.a(c5.O)).intValue());
        this.d = b("shared_thread_pool", ((Integer) lVar.a(c5.N)).intValue());
        this.e = b("core", ((Integer) lVar.a(c5.U)).intValue());
        this.g = b("caching", ((Integer) lVar.a(c5.V)).intValue());
        this.h = b("mediation", ((Integer) lVar.a(c5.W)).intValue());
        this.f = b("timeout", ((Integer) lVar.a(c5.X)).intValue());
        this.i = b("other", ((Integer) lVar.a(c5.Y)).intValue());
        if (((Boolean) lVar.a(c5.J0)).booleanValue() && ((Boolean) lVar.a(c5.K0)).booleanValue()) {
            this.k = Executors.newFixedThreadPool(((Integer) lVar.a(c5.L0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.l = Executors.newFixedThreadPool(((Integer) lVar.a(c5.M0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public Executor c() {
        return this.p ? this.e : this.d;
    }

    public ExecutorService d() {
        return this.l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.o;
    }

    public void g() {
        synchronized (this.n) {
            this.o = true;
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                c cVar = (c) ((e) it.next());
                a(cVar.d, cVar.e, cVar.f);
            }
            this.m.clear();
        }
    }

    public void h() {
        synchronized (this.n) {
            this.o = false;
        }
    }

    public ExecutorService a() {
        return this.k;
    }

    public ScheduledFuture b(n5 n5Var, b bVar, long j) {
        return this.p ? a(new e(this.f4243a, n5Var, bVar)).schedule(n5Var, j, TimeUnit.MILLISECONDS) : this.c.schedule(n5Var, j, TimeUnit.MILLISECONDS);
    }

    public void a(n5 n5Var, b bVar) {
        a(n5Var, bVar, 0L);
    }

    public void a(n5 n5Var, b bVar, long j) {
        a(n5Var, bVar, j, false);
    }

    public void a(n5 n5Var, b bVar, long j, boolean z) {
        if (n5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j >= 0) {
            c cVar = new c(this.f4243a, n5Var, bVar, j);
            if (!b(cVar)) {
                a(cVar, j, z);
                return;
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.d(n5Var.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
    }

    public ExecutorService b() {
        return this.p ? this.g : q;
    }

    private boolean b(e eVar) {
        if (eVar.d.d()) {
            return false;
        }
        synchronized (this.n) {
            if (this.o) {
                return false;
            }
            this.m.add(eVar);
            return true;
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.p) {
            com.applovin.impl.sdk.l lVar = this.f4243a;
            e eVar = new e(lVar, new x6(lVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.c.submit(runnable);
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.i6$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                i6.this.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new x6(this.f4243a, str, runnable));
    }

    public void a(n5 n5Var) {
        if (n5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.p ? this.e : this.d;
            try {
                if (t7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f4243a, n5Var, b.CORE));
                    return;
                }
                ScheduledFuture b2 = n5Var.b(Thread.currentThread(), ((Long) this.f4243a.a(c5.v)).longValue());
                n5Var.run();
                if (b2 != null) {
                    b2.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.a(n5Var.c(), "Task failed execution", th);
                }
                n5Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    private ScheduledThreadPoolExecutor b(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new d(str));
    }

    public void a(n5 n5Var, o3 o3Var) {
        String b2 = o3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.j.get(b2);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b2, 1);
            this.j.put(b2, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new e(this.f4243a, n5Var, b.MEDIATION));
    }

    private void a(final e eVar, long j, boolean z) {
        final ScheduledThreadPoolExecutor a2 = this.p ? a(eVar) : this.d;
        if (j <= 0) {
            a2.submit(eVar);
        } else if (z) {
            i0.a(j, this.f4243a, new Runnable() { // from class: com.applovin.impl.i6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    a2.execute(eVar);
                }
            });
        } else {
            a2.schedule(eVar, j, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i = a.f4244a[eVar.e.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 3) {
            return this.h;
        }
        if (i != 4) {
            return this.i;
        }
        return this.f;
    }

    public ExecutorService a(String str, int i) {
        return Executors.newFixedThreadPool(i, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
