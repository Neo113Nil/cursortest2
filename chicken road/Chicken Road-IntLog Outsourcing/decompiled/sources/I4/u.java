package I4;

import D4.k0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public abstract class u extends d implements k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1322d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f1323c;
    private volatile int cleanedAndPointers;

    public u(long j2, u uVar, int i2) {
        super(uVar);
        this.f1323c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // I4.d
    public final boolean c() {
        return f1322d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1322d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, InterfaceC1223i interfaceC1223i);

    public final void h() {
        if (f1322d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1322d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
