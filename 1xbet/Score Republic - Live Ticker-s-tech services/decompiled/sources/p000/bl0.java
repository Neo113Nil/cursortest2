package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bl0 implements Executor {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f901j = 1;

    /* JADX INFO: renamed from: k */
    public Executor f902k;

    /* JADX INFO: renamed from: l */
    public final Object f903l;

    public bl0(jg0 jg0Var) {
        a90.m127k(jg0Var, "executorPool");
        this.f903l = jg0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        switch (this.f901j) {
            case 0:
                synchronized (this) {
                    try {
                        if (this.f902k == null) {
                            Executor executor2 = (Executor) r71.m4273a((q71) ((jg0) this.f903l).f3922k);
                            a90.m126j(executor2, this.f902k, "%s.getObject()");
                            this.f902k = executor2;
                        }
                        executor = this.f902k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                executor.execute(runnable);
                return;
            default:
                try {
                    this.f902k.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    ((a40) this.f903l).m2178m(e);
                    return;
                }
        }
    }

    public bl0(Executor executor, a40 a40Var) {
        this.f902k = executor;
        this.f903l = a40Var;
    }
}
