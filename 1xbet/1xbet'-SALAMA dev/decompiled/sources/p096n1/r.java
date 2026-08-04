package p096n1;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p023d1.n;
import p047g1.e;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15347e = n.g("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15351d;

    public r() {
        o oVar = new o(0);
        oVar.f15344b = 0;
        this.f15349b = new HashMap();
        this.f15350c = new HashMap();
        this.f15351d = new Object();
        this.f15348a = Executors.newSingleThreadScheduledExecutor(oVar);
    }

    public final void a(String str, e eVar) {
        synchronized (this.f15351d) {
            n.d().b(f15347e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            q qVar = new q(this, str);
            this.f15349b.put(str, qVar);
            this.f15350c.put(str, eVar);
            this.f15348a.schedule(qVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f15351d) {
            try {
                if (((q) this.f15349b.remove(str)) != null) {
                    n.d().b(f15347e, "Stopping timer for " + str, new Throwable[0]);
                    this.f15350c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
