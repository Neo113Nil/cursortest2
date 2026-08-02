package n1;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: n1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1463r {

    /* renamed from: e, reason: collision with root package name */
    public static final String f15341e = d1.n.g("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15342a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15343b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15344c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15345d;

    public C1463r() {
        ThreadFactoryC1460o threadFactoryC1460o = new ThreadFactoryC1460o(0);
        threadFactoryC1460o.f15338b = 0;
        this.f15343b = new HashMap();
        this.f15344c = new HashMap();
        this.f15345d = new Object();
        this.f15342a = Executors.newSingleThreadScheduledExecutor(threadFactoryC1460o);
    }

    public final void a(String str, g1.e eVar) {
        synchronized (this.f15345d) {
            d1.n.d().b(f15341e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            RunnableC1462q runnableC1462q = new RunnableC1462q(this, str);
            this.f15343b.put(str, runnableC1462q);
            this.f15344c.put(str, eVar);
            this.f15342a.schedule(runnableC1462q, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f15345d) {
            try {
                if (((RunnableC1462q) this.f15343b.remove(str)) != null) {
                    d1.n.d().b(f15341e, "Stopping timer for " + str, new Throwable[0]);
                    this.f15344c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
