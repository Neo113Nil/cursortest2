package r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m0.W;

/* loaded from: classes.dex */
public abstract class v extends d implements W {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1196d = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f1197c;
    private volatile int cleanedAndPointers;

    public v(long j2, o0.k kVar, int i2) {
        super(kVar);
        this.f1197c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // r0.d
    public final boolean c() {
        return f1196d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1196d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, Y.i iVar);

    public final void h() {
        if (f1196d.incrementAndGet(this) == o0.e.f1066b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1196d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
