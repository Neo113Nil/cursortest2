package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a71 implements Executor, Runnable {

    /* JADX INFO: renamed from: m */
    public static final Logger f50m = Logger.getLogger(a71.class.getName());

    /* JADX INFO: renamed from: n */
    public static final AbstractC0875xf f51n;

    /* JADX INFO: renamed from: j */
    public final Executor f52j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentLinkedQueue f53k = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: l */
    public volatile int f54l = 0;

    static {
        AbstractC0875xf z61Var;
        try {
            z61Var = new y61(AtomicIntegerFieldUpdater.newUpdater(a71.class, "l"));
        } catch (Throwable th) {
            f50m.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            z61Var = new z61();
        }
        f51n = z61Var;
    }

    public a71(Executor executor) {
        a90.m127k(executor, "'executor' must not be null.");
        this.f52j = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m39a(Runnable runnable) {
        AbstractC0875xf abstractC0875xf = f51n;
        if (abstractC0875xf.mo5657n(this)) {
            try {
                this.f52j.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f53k.remove(runnable);
                }
                abstractC0875xf.mo5658o(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a90.m127k(runnable, "'r' must not be null.");
        this.f53k.add(runnable);
        m39a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0875xf abstractC0875xf = f51n;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f53k;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    f50m.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e);
                }
            } catch (Throwable th) {
                abstractC0875xf.mo5658o(this);
                throw th;
            }
        }
        abstractC0875xf.mo5658o(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        m39a(null);
    }
}
