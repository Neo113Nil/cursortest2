package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: mx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486mx extends AbstractC0412kx implements InterfaceC0665rr {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5176p = AtomicReferenceFieldUpdater.newUpdater(AbstractC0486mx.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5177q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5178r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ long f5179s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ long f5180t;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = c62.f1155a;
        f5180t = unsafe.objectFieldOffset(AbstractC0486mx.class.getDeclaredField("_queue$volatile"));
        f5177q = AtomicReferenceFieldUpdater.newUpdater(AbstractC0486mx.class, Object.class, "_delayed$volatile");
        f5179s = unsafe.objectFieldOffset(AbstractC0486mx.class.getDeclaredField("_delayed$volatile"));
        f5178r = AtomicIntegerFieldUpdater.newUpdater(AbstractC0486mx.class, "_isCompleted$volatile");
    }

    /* JADX INFO: renamed from: A */
    public final long m3438A() {
        C0756u7 c0756u7 = this.f4589n;
        if (((c0756u7 == null || c0756u7.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            f5176p.getClass();
            Unsafe unsafe = c62.f1155a;
            Object objectVolatile = unsafe.getObjectVolatile(this, f5180t);
            if (objectVolatile == null) {
                f5177q.getClass();
            } else if (objectVolatile instanceof zj0) {
                long j = zj0.f9803f.get((zj0) objectVolatile);
                if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                    return 0L;
                }
                f5177q.getClass();
            } else if (objectVolatile == xe1.f8935a) {
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: B */
    public abstract Thread mo2951B();

    /* JADX INFO: renamed from: C */
    public final boolean m3439C() {
        C0756u7 c0756u7 = this.f4589n;
        if (c0756u7 != null ? c0756u7.isEmpty() : true) {
            f5177q.getClass();
            Unsafe unsafe = c62.f1155a;
            f5176p.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, f5180t);
            if (objectVolatile != null) {
                if (objectVolatile instanceof zj0) {
                    long j = zj0.f9803f.get((zj0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == xe1.f8935a) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m3440D() {
        System.nanoTime();
        f5177q.getClass();
    }

    /* JADX INFO: renamed from: E */
    public final void m3441E() {
        f5176p.getClass();
        Unsafe unsafe = c62.f1155a;
        unsafe.putObjectVolatile(this, f5180t, (Object) null);
        f5177q.getClass();
        unsafe.putObjectVolatile(this, f5179s, (Object) null);
    }

    @Override // p000.AbstractC0292hn
    /* JADX INFO: renamed from: o */
    public final void mo1225o(InterfaceC0180en interfaceC0180en, Runnable runnable) {
        mo2953x(runnable);
    }

    @Override // p000.AbstractC0412kx
    public void shutdown() {
        cd1.f1223a.set(null);
        f5178r.set(this, 1);
        m3442v();
        while (mo3099t() <= 0) {
        }
        m3440D();
    }

    @Override // p000.AbstractC0412kx
    /* JADX INFO: renamed from: t */
    public final long mo3099t() {
        if (m3100u()) {
            return 0L;
        }
        m3444y();
        Runnable runnableM3443w = m3443w();
        if (runnableM3443w == null) {
            return m3438A();
        }
        runnableM3443w.run();
        return 0L;
    }

    /* JADX INFO: renamed from: v */
    public final void m3442v() {
        AbstractC0486mx abstractC0486mx;
        Unsafe unsafe;
        g72 g72Var = xe1.f8935a;
        while (true) {
            f5176p.getClass();
            Unsafe unsafe2 = c62.f1155a;
            long j = f5180t;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = c62.f1155a;
                    abstractC0486mx = this;
                    if (unsafe3.compareAndSwapObject(abstractC0486mx, f5180t, (Object) null, g72Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(abstractC0486mx, j) != null) {
                        break;
                    } else {
                        this = abstractC0486mx;
                    }
                }
            } else {
                abstractC0486mx = this;
                if (objectVolatile instanceof zj0) {
                    ((zj0) objectVolatile).m5921c();
                    return;
                }
                if (objectVolatile == g72Var) {
                    return;
                }
                zj0 zj0Var = new zj0(8, true);
                zj0Var.m5919a((Runnable) objectVolatile);
                do {
                    unsafe = c62.f1155a;
                    if (unsafe.compareAndSwapObject(abstractC0486mx, f5180t, objectVolatile, zj0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(abstractC0486mx, j) == objectVolatile);
            }
            this = abstractC0486mx;
        }
    }

    /* JADX INFO: renamed from: w */
    public final Runnable m3443w() {
        AbstractC0486mx abstractC0486mx;
        Unsafe unsafe;
        while (true) {
            f5176p.getClass();
            Unsafe unsafe2 = c62.f1155a;
            long j = f5180t;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof zj0) {
                zj0 zj0Var = (zj0) objectVolatile;
                Object objM5923e = zj0Var.m5923e();
                if (objM5923e == zj0.f9804g) {
                    zj0 zj0VarM5922d = zj0Var.m5922d();
                    while (true) {
                        Unsafe unsafe3 = c62.f1155a;
                        abstractC0486mx = this;
                        if (unsafe3.compareAndSwapObject(abstractC0486mx, f5180t, objectVolatile, zj0VarM5922d) || unsafe3.getObjectVolatile(abstractC0486mx, j) != objectVolatile) {
                            break;
                        }
                        this = abstractC0486mx;
                    }
                } else {
                    return (Runnable) objM5923e;
                }
            } else {
                abstractC0486mx = this;
                if (objectVolatile == xe1.f8935a) {
                    return null;
                }
                do {
                    unsafe = c62.f1155a;
                    if (unsafe.compareAndSwapObject(abstractC0486mx, f5180t, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(abstractC0486mx, j) == objectVolatile);
            }
            this = abstractC0486mx;
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo2953x(Runnable runnable) {
        m3444y();
        if (!m3445z(runnable)) {
            RunnableC0368jq.f4062u.mo2953x(runnable);
            return;
        }
        Thread threadMo2951B = mo2951B();
        if (Thread.currentThread() != threadMo2951B) {
            LockSupport.unpark(threadMo2951B);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3444y() {
        f5177q.getClass();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m3445z(Runnable runnable) {
        AbstractC0486mx abstractC0486mx;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            f5176p.getClass();
            Unsafe unsafe3 = c62.f1155a;
            long j = f5180t;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (f5178r.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = c62.f1155a;
                    AbstractC0486mx abstractC0486mx2 = this;
                    runnable2 = runnable;
                    abstractC0486mx = abstractC0486mx2;
                    if (unsafe4.compareAndSwapObject(abstractC0486mx2, f5180t, (Object) null, runnable2)) {
                        return true;
                    }
                    if (unsafe4.getObjectVolatile(abstractC0486mx, j) != null) {
                        break;
                    }
                    this = abstractC0486mx;
                    runnable = runnable2;
                }
                this = abstractC0486mx;
                runnable = runnable2;
            } else {
                abstractC0486mx = this;
                runnable2 = runnable;
                if (objectVolatile instanceof zj0) {
                    zj0 zj0Var = (zj0) objectVolatile;
                    int iM5919a = zj0Var.m5919a(runnable2);
                    if (iM5919a == 0) {
                        return true;
                    }
                    if (iM5919a == 1) {
                        zj0 zj0VarM5922d = zj0Var.m5922d();
                        do {
                            unsafe2 = c62.f1155a;
                            if (unsafe2.compareAndSwapObject(abstractC0486mx, f5180t, objectVolatile, zj0VarM5922d)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(abstractC0486mx, j) == objectVolatile);
                    } else if (iM5919a == 2) {
                        return false;
                    }
                    this = abstractC0486mx;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == xe1.f8935a) {
                        return false;
                    }
                    zj0 zj0Var2 = new zj0(8, true);
                    zj0Var2.m5919a((Runnable) objectVolatile);
                    zj0Var2.m5919a(runnable2);
                    do {
                        unsafe = c62.f1155a;
                        if (unsafe.compareAndSwapObject(abstractC0486mx, f5180t, objectVolatile, zj0Var2)) {
                            return true;
                        }
                    } while (unsafe.getObjectVolatile(abstractC0486mx, j) == objectVolatile);
                    this = abstractC0486mx;
                    runnable = runnable2;
                }
            }
        }
    }
}
