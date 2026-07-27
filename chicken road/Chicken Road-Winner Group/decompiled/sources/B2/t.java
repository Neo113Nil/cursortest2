package B2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w2.c0;

/* loaded from: classes.dex */
public abstract class t extends d implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f180d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f181c;
    private volatile int cleanedAndPointers;

    public t(long j3, t tVar, int i3) {
        super(tVar);
        this.f181c = j3;
        this.cleanedAndPointers = i3 << 16;
    }

    @Override // B2.d
    public final boolean c() {
        return f180d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f180d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, g2.h hVar);

    public final void h() {
        if (f180d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f180d;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
