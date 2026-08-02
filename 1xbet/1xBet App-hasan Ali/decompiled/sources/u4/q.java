package u4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p4.g0;

/* loaded from: classes.dex */
public abstract class q extends b implements g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20112d = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f20113c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public q(long j5, q qVar, int i) {
        super(qVar);
        this.f20113c = j5;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // u4.b
    public final boolean c() {
        return f20112d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f20112d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, a4.h hVar);

    public final void h() {
        if (f20112d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f20112d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
