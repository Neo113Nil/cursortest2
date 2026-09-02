package g1;

import b1.V;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class u extends d implements V {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1178d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f1179c;
    private volatile int cleanedAndPointers;

    public u(long j2, d1.k kVar, int i2) {
        super(kVar);
        this.f1179c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // g1.d
    public final boolean c() {
        return f1178d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1178d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, M0.i iVar);

    public final void h() {
        if (f1178d.incrementAndGet(this) == d1.e.f917b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1178d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
