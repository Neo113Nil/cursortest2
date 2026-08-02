package p000;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r71 {

    /* JADX INFO: renamed from: d */
    public static final r71 f6723d = new r71(new x80(15));

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap f6724a = new IdentityHashMap();

    /* JADX INFO: renamed from: b */
    public final x80 f6725b;

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f6726c;

    public r71(x80 x80Var) {
        this.f6725b = x80Var;
    }

    /* JADX INFO: renamed from: a */
    public static Object m4273a(q71 q71Var) {
        Object obj;
        r71 r71Var = f6723d;
        synchronized (r71Var) {
            try {
                p71 p71Var = (p71) r71Var.f6724a.get(q71Var);
                if (p71Var == null) {
                    p71Var = new p71(q71Var.mo155c());
                    r71Var.f6724a.put(q71Var, p71Var);
                }
                ScheduledFuture scheduledFuture = p71Var.f6006c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    p71Var.f6006c = null;
                }
                p71Var.f6005b++;
                obj = p71Var.f6004a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static void m4274b(q71 q71Var, Object obj) {
        r71 r71Var = f6723d;
        synchronized (r71Var) {
            try {
                p71 p71Var = (p71) r71Var.f6724a.get(q71Var);
                if (p71Var == null) {
                    throw new IllegalArgumentException("No cached instance found for " + q71Var);
                }
                a90.m122f("Releasing the wrong instance", obj == p71Var.f6004a);
                a90.m132p("Refcount has already reached zero", p71Var.f6005b > 0);
                int i = p71Var.f6005b - 1;
                p71Var.f6005b = i;
                if (i == 0) {
                    a90.m132p("Destroy task already scheduled", p71Var.f6006c == null);
                    if (r71Var.f6726c == null) {
                        r71Var.f6725b.getClass();
                        r71Var.f6726c = Executors.newSingleThreadScheduledExecutor(ca0.m910e("grpc-shared-destroyer-%d"));
                    }
                    p71Var.f6006c = r71Var.f6726c.schedule(new ek0(new RunnableC0452m(r71Var, p71Var, q71Var, obj, 4)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
