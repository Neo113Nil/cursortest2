package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: j */
    public static final RunnableC0393ke f9749j;

    /* JADX INFO: renamed from: k */
    public static final RunnableC0393ke f9750k;

    static {
        int i = 3;
        f9749j = new RunnableC0393ke(i);
        f9750k = new RunnableC0393ke(i);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4914a(Throwable th);

    /* JADX INFO: renamed from: b */
    public abstract void mo4915b(Object obj);

    /* JADX INFO: renamed from: c */
    public final void m5888c() {
        RunnableC0393ke runnableC0393ke = f9750k;
        RunnableC0393ke runnableC0393ke2 = f9749j;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            ye0 ye0Var = new ye0(this);
            ye0.m5789a(ye0Var, Thread.currentThread());
            if (compareAndSet(runnable, ye0Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(runnableC0393ke2)) == runnableC0393ke) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo4916d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo4917e();

    /* JADX INFO: renamed from: f */
    public abstract String mo4918f();

    /* JADX INFO: renamed from: g */
    public final void m5889g(Thread thread) {
        Runnable runnable = (Runnable) get();
        ye0 ye0Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof ye0;
            RunnableC0393ke runnableC0393ke = f9750k;
            if (!z2 && runnable != runnableC0393ke) {
                break;
            }
            if (z2) {
                ye0Var = (ye0) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC0393ke || compareAndSet(runnable, runnableC0393ke)) {
                z = Thread.interrupted() || z;
                LockSupport.park(ye0Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo4917e = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo4916d = mo4916d();
            RunnableC0393ke runnableC0393ke = f9749j;
            if (!zMo4916d) {
                try {
                    objMo4917e = mo4917e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC0393ke)) {
                            m5889g(threadCurrentThread);
                        }
                        if (zMo4916d) {
                            return;
                        }
                        mo4914a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, runnableC0393ke)) {
                            m5889g(threadCurrentThread);
                        }
                        if (!zMo4916d) {
                            mo4915b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC0393ke)) {
                m5889g(threadCurrentThread);
            }
            if (zMo4916d) {
                return;
            }
            mo4915b(objMo4917e);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f9749j) {
            str = "running=[DONE]";
        } else if (runnable instanceof ye0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo4918f();
    }
}
