package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f6877a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6872b = AtomicReferenceFieldUpdater.newUpdater(rk1.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f6876f = c62.f1155a.objectFieldOffset(rk1.class.getDeclaredField("lastScheduledTask$volatile"));

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6873c = AtomicIntegerFieldUpdater.newUpdater(rk1.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6874d = AtomicIntegerFieldUpdater.newUpdater(rk1.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6875e = AtomicIntegerFieldUpdater.newUpdater(rk1.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final pc1 m4365a(pc1 pc1Var) {
        f6872b.getClass();
        pc1 pc1Var2 = (pc1) c62.f1155a.getAndSetObject(this, f6876f, pc1Var);
        if (pc1Var2 == null) {
            return null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6873c;
        if (atomicIntegerFieldUpdater.get(this) - f6874d.get(this) == 127) {
            return pc1Var2;
        }
        if (pc1Var2.f6088k) {
            f6875e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f6877a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, pc1Var2);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4366b() {
        f6872b.getClass();
        Object objectVolatile = c62.f1155a.getObjectVolatile(this, f6876f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6874d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f6873c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m4367c(d90 d90Var) {
        f6872b.getClass();
        pc1 pc1Var = (pc1) c62.f1155a.getAndSetObject(this, f6876f, (Object) null);
        if (pc1Var != null) {
            d90Var.m5664a(pc1Var);
        }
        while (true) {
            pc1 pc1VarM4369e = m4369e();
            if (pc1VarM4369e == null) {
                return;
            } else {
                d90Var.m5664a(pc1VarM4369e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final pc1 m4368d() {
        f6872b.getClass();
        pc1 pc1Var = (pc1) c62.f1155a.getAndSetObject(this, f6876f, (Object) null);
        return pc1Var == null ? m4369e() : pc1Var;
    }

    /* JADX INFO: renamed from: e */
    public final pc1 m4369e() {
        pc1 pc1Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6874d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f6873c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (pc1Var = (pc1) this.f6877a.getAndSet(i2, null)) != null) {
                if (pc1Var.f6088k) {
                    f6875e.decrementAndGet(this);
                }
                return pc1Var;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final pc1 m4370f() {
        rk1 rk1Var;
        while (true) {
            f6872b.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f6876f;
            pc1 pc1Var = (pc1) unsafe.getObjectVolatile(this, j);
            if (pc1Var == null || !pc1Var.f6088k) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                rk1Var = this;
                if (unsafe2.compareAndSwapObject(rk1Var, f6876f, pc1Var, (Object) null)) {
                    return pc1Var;
                }
                if (unsafe2.getObjectVolatile(rk1Var, j) != pc1Var) {
                    break;
                }
                this = rk1Var;
            }
            this = rk1Var;
        }
        rk1 rk1Var2 = this;
        int i = f6874d.get(rk1Var2);
        int i2 = f6873c.get(rk1Var2);
        while (i != i2 && f6875e.get(rk1Var2) != 0) {
            i2--;
            pc1 pc1VarM4371g = rk1Var2.m4371g(i2, true);
            if (pc1VarM4371g != null) {
                return pc1VarM4371g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final pc1 m4371g(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f6877a;
        pc1 pc1Var = (pc1) atomicReferenceArray.get(i2);
        if (pc1Var != null && pc1Var.f6088k == z) {
            while (!atomicReferenceArray.compareAndSet(i2, pc1Var, null)) {
                if (atomicReferenceArray.get(i2) != pc1Var) {
                }
            }
            if (z) {
                f6875e.decrementAndGet(this);
            }
            return pc1Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final long m4372h(int i, k01 k01Var) {
        rk1 rk1Var;
        while (true) {
            f6872b.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f6876f;
            pc1 pc1Var = (pc1) unsafe.getObjectVolatile(this, j);
            if (pc1Var == null) {
                return -2L;
            }
            if (((pc1Var.f6088k ? 1 : 2) & i) == 0) {
                return -2L;
            }
            tc1.f7436f.getClass();
            long jNanoTime = System.nanoTime() - pc1Var.f6087j;
            long j2 = tc1.f7432b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                rk1Var = this;
                if (unsafe2.compareAndSwapObject(rk1Var, f6876f, pc1Var, (Object) null)) {
                    k01Var.f4243j = pc1Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(rk1Var, j) != pc1Var) {
                    break;
                }
                this = rk1Var;
            }
            this = rk1Var;
        }
    }
}
