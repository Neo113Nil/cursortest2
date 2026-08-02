package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: g5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0237g5 implements Executor {

    /* JADX INFO: renamed from: j */
    public final Object f2621j = new Object();

    /* JADX INFO: renamed from: k */
    public final ArrayDeque f2622k = new ArrayDeque();

    /* JADX INFO: renamed from: l */
    public final iw1 f2623l;

    /* JADX INFO: renamed from: m */
    public Runnable f2624m;

    public ExecutorC0237g5(iw1 iw1Var) {
        this.f2623l = iw1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m1986a() {
        synchronized (this.f2621j) {
            try {
                Runnable runnable = (Runnable) this.f2622k.poll();
                this.f2624m = runnable;
                if (runnable != null) {
                    this.f2623l.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2621j) {
            try {
                this.f2622k.add(new RunnableC0195f1(3, this, runnable));
                if (this.f2624m == null) {
                    m1986a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
