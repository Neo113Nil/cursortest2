package I6;

import D6.w0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends d implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3758d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3759c;
    private volatile int cleanedAndPointers;

    public u(long j, u uVar, int i7) {
        super(uVar);
        this.f3759c = j;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // I6.d
    public final boolean c() {
        return f3758d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f3758d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i7, p065i6.i iVar);

    public final void h() {
        if (f3758d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f3758d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
