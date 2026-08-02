package p000;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: wx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0856wx extends AtomicReference implements Executor, Runnable {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f8715n = 0;

    /* JADX INFO: renamed from: j */
    public C0312i6 f8716j;

    /* JADX INFO: renamed from: k */
    public Executor f8717k;

    /* JADX INFO: renamed from: l */
    public Runnable f8718l;

    /* JADX INFO: renamed from: m */
    public Thread f8719m;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == EnumC0819vx.f8279k) {
            this.f8717k = null;
            this.f8716j = null;
            return;
        }
        this.f8719m = Thread.currentThread();
        try {
            C0312i6 c0312i6 = this.f8716j;
            Objects.requireNonNull(c0312i6);
            qd0 qd0Var = (qd0) c0312i6.f3448l;
            if (((Thread) qd0Var.f6471k) == this.f8719m) {
                this.f8716j = null;
                a90.m133q(((Runnable) qd0Var.f6472l) == null);
                qd0Var.f6472l = runnable;
                Executor executor = this.f8717k;
                Objects.requireNonNull(executor);
                qd0Var.f6473m = executor;
                this.f8717k = null;
            } else {
                Executor executor2 = this.f8717k;
                Objects.requireNonNull(executor2);
                this.f8717k = null;
                this.f8718l = runnable;
                executor2.execute(this);
            }
        } finally {
            this.f8719m = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f8719m) {
            Runnable runnable = this.f8718l;
            Objects.requireNonNull(runnable);
            this.f8718l = null;
            runnable.run();
            return;
        }
        qd0 qd0Var = new qd0(18);
        qd0Var.f6471k = threadCurrentThread;
        C0312i6 c0312i6 = this.f8716j;
        Objects.requireNonNull(c0312i6);
        c0312i6.f3448l = qd0Var;
        this.f8716j = null;
        try {
            Runnable runnable2 = this.f8718l;
            Objects.requireNonNull(runnable2);
            this.f8718l = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) qd0Var.f6472l;
                if (runnable3 == null || (executor = (Executor) qd0Var.f6473m) == null) {
                    break;
                }
                qd0Var.f6472l = null;
                qd0Var.f6473m = null;
                executor.execute(runnable3);
            }
            qd0Var.f6471k = null;
        } catch (Throwable th) {
            qd0Var.f6471k = null;
            throw th;
        }
    }
}
