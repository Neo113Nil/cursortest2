package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 implements Executor {

    /* JADX INFO: renamed from: o */
    public static final Logger f8106o = Logger.getLogger(v61.class.getName());

    /* JADX INFO: renamed from: j */
    public final Executor f8107j;

    /* JADX INFO: renamed from: k */
    public final ArrayDeque f8108k = new ArrayDeque();

    /* JADX INFO: renamed from: l */
    public int f8109l = 1;

    /* JADX INFO: renamed from: m */
    public long f8110m = 0;

    /* JADX INFO: renamed from: n */
    public final f31 f8111n = new f31(this, 2);

    public v61(Executor executor) {
        p80.m3863h(executor);
        this.f8107j = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p80.m3863h(runnable);
        synchronized (this.f8108k) {
            int i = this.f8109l;
            if (i != 4 && i != 3) {
                long j = this.f8110m;
                RunnableC0825w2 runnableC0825w2 = new RunnableC0825w2(runnable, 2);
                this.f8108k.add(runnableC0825w2);
                this.f8109l = 2;
                try {
                    this.f8107j.execute(this.f8111n);
                    if (this.f8109l != 2) {
                        return;
                    }
                    synchronized (this.f8108k) {
                        try {
                            if (this.f8110m == j && this.f8109l == 2) {
                                this.f8109l = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f8108k) {
                        try {
                            int i2 = this.f8109l;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f8108k.removeLastOccurrence(runnableC0825w2)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            this.f8108k.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f8107j + "}";
    }
}
