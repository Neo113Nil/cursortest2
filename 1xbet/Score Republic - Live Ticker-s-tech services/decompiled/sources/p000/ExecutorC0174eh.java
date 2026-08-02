package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: eh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0174eh extends ConcurrentLinkedQueue implements Executor {

    /* JADX INFO: renamed from: k */
    public static final Logger f2089k = Logger.getLogger(ExecutorC0174eh.class.getName());

    /* JADX INFO: renamed from: l */
    public static final Object f2090l = new Object();

    /* JADX INFO: renamed from: j */
    public volatile Object f2091j;

    /* JADX INFO: renamed from: b */
    public final void m1425b() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Runnable runnable = (Runnable) poll();
        if (runnable == null) {
            this.f2091j = Thread.currentThread();
            while (true) {
                try {
                    Runnable runnable2 = (Runnable) poll();
                    if (runnable2 != null) {
                        this.f2091j = null;
                        runnable = runnable2;
                        break;
                    } else {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                    }
                } catch (Throwable th) {
                    this.f2091j = null;
                    throw th;
                }
            }
        }
        do {
            try {
                runnable.run();
            } catch (Throwable th2) {
                f2089k.log(Level.WARNING, "Runnable threw exception", th2);
            }
            runnable = (Runnable) poll();
        } while (runnable != null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.f2091j;
        if (obj != f2090l) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && AbstractC0249gh.f2734b) {
            throw new RejectedExecutionException();
        }
    }

    public final void shutdown() {
        this.f2091j = f2090l;
        while (true) {
            Runnable runnable = (Runnable) poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f2089k.log(Level.WARNING, "Runnable threw exception", th);
            }
        }
    }
}
