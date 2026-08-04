package W5;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c2 f7156d = new c2(new f2(17));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f7157a = new IdentityHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f7158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f7159c;

    public c2(f2 f2Var) {
        this.f7158b = f2Var;
    }

    public static Object a(b2 b2Var) {
        Object obj;
        c2 c2Var = f7156d;
        synchronized (c2Var) {
            try {
                a2 a2Var = (a2) c2Var.f7157a.get(b2Var);
                if (a2Var == null) {
                    a2Var = new a2(b2Var.b());
                    c2Var.f7157a.put(b2Var, a2Var);
                }
                ScheduledFuture scheduledFuture = a2Var.f7122c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    a2Var.f7122c = null;
                }
                a2Var.f7121b++;
                obj = a2Var.f7120a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(b2 b2Var, Object obj) {
        c2 c2Var = f7156d;
        synchronized (c2Var) {
            try {
                a2 a2Var = (a2) c2Var.f7157a.get(b2Var);
                if (a2Var == null) {
                    throw new IllegalArgumentException("No cached instance found for " + b2Var);
                }
                p113p3.f.d("Releasing the wrong instance", obj == a2Var.f7120a);
                p113p3.f.q("Refcount has already reached zero", a2Var.f7121b > 0);
                int i7 = a2Var.f7121b - 1;
                a2Var.f7121b = i7;
                if (i7 == 0) {
                    p113p3.f.q("Destroy task already scheduled", a2Var.f7122c == null);
                    if (c2Var.f7159c == null) {
                        c2Var.f7158b.getClass();
                        c2Var.f7159c = Executors.newSingleThreadScheduledExecutor(AbstractC0494d0.e("grpc-shared-destroyer-%d"));
                    }
                    a2Var.f7122c = c2Var.f7159c.schedule(new RunnableC0559z0(new A2.c(c2Var, a2Var, b2Var, obj, 11, false)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
