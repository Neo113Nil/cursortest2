package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a02 extends d12 {

    /* JADX INFO: renamed from: t */
    public static final AtomicLong f7t = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: l */
    public yz1 f8l;

    /* JADX INFO: renamed from: m */
    public yz1 f9m;

    /* JADX INFO: renamed from: n */
    public final PriorityBlockingQueue f10n;

    /* JADX INFO: renamed from: o */
    public final LinkedBlockingQueue f11o;

    /* JADX INFO: renamed from: p */
    public final vz1 f12p;

    /* JADX INFO: renamed from: q */
    public final vz1 f13q;

    /* JADX INFO: renamed from: r */
    public final Object f14r;

    /* JADX INFO: renamed from: s */
    public final Semaphore f15s;

    public a02(f02 f02Var) {
        super(f02Var);
        this.f14r = new Object();
        this.f15s = new Semaphore(2);
        this.f10n = new PriorityBlockingQueue();
        this.f11o = new LinkedBlockingQueue();
        this.f12p = new vz1(this, "Thread death: Uncaught exception on worker thread");
        this.f13q = new vz1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: B */
    public final boolean mo0B() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m1E() {
        if (Thread.currentThread() == this.f9m) {
            return;
        }
        C0270h1.m2191g("Call expected from network thread");
    }

    /* JADX INFO: renamed from: F */
    public final void m2F() {
        if (Thread.currentThread() != this.f8l) {
            return;
        }
        C0270h1.m2191g("Call not expected from worker thread");
    }

    /* JADX INFO: renamed from: G */
    public final boolean m3G() {
        return Thread.currentThread() == this.f8l;
    }

    /* JADX INFO: renamed from: H */
    public final xz1 m4H(Callable callable) {
        m1081C();
        xz1 xz1Var = new xz1(this, callable, false);
        if (Thread.currentThread() != this.f8l) {
            m10N(xz1Var);
            return xz1Var;
        }
        if (!this.f10n.isEmpty()) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5312a("Callable skipped the worker queue.");
        }
        xz1Var.run();
        return xz1Var;
    }

    /* JADX INFO: renamed from: I */
    public final xz1 m5I(Callable callable) {
        m1081C();
        xz1 xz1Var = new xz1(this, callable, true);
        if (Thread.currentThread() == this.f8l) {
            xz1Var.run();
            return xz1Var;
        }
        m10N(xz1Var);
        return xz1Var;
    }

    /* JADX INFO: renamed from: J */
    public final void m6J(Runnable runnable) {
        m1081C();
        p80.m3863h(runnable);
        m10N(new xz1(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: K */
    public final Object m7K(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            a02 a02Var = ((f02) this.f7192j).f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                ky1 ky1Var = ((f02) this.f7192j).f2247o;
                f02.m1560m(ky1Var);
                wc1 wc1Var = ky1Var.f4603r;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                wc1Var.m5312a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            ky1 ky1Var2 = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4603r.m5312a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: L */
    public final void m8L(Runnable runnable) {
        m1081C();
        m10N(new xz1(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: M */
    public final void m9M(Runnable runnable) {
        m1081C();
        xz1 xz1Var = new xz1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f14r) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f11o;
                linkedBlockingQueue.add(xz1Var);
                yz1 yz1Var = this.f9m;
                if (yz1Var == null) {
                    yz1 yz1Var2 = new yz1(this, "Measurement Network", linkedBlockingQueue);
                    this.f9m = yz1Var2;
                    yz1Var2.setUncaughtExceptionHandler(this.f13q);
                    this.f9m.start();
                } else {
                    Object obj = yz1Var.f9554j;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m10N(xz1 xz1Var) {
        synchronized (this.f14r) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f10n;
                priorityBlockingQueue.add(xz1Var);
                yz1 yz1Var = this.f8l;
                if (yz1Var == null) {
                    yz1 yz1Var2 = new yz1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f8l = yz1Var2;
                    yz1Var2.setUncaughtExceptionHandler(this.f12p);
                    this.f8l.start();
                } else {
                    Object obj = yz1Var.f9554j;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: z */
    public final void mo11z() {
        if (Thread.currentThread() == this.f8l) {
            return;
        }
        C0270h1.m2191g("Call expected from worker thread");
    }
}
