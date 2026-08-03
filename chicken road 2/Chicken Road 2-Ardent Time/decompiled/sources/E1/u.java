package E1;

/* loaded from: classes.dex */
public abstract class u extends E1.d implements z1.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f302d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(E1.u.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f303c;
    private volatile int cleanedAndPointers;

    public u(long j2, E1.u uVar, int i2) {
        super(uVar);
        this.f303c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // E1.d
    public final boolean c() {
        return f302d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f302d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, k1.i iVar);

    public final void h() {
        if (f302d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f302d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
