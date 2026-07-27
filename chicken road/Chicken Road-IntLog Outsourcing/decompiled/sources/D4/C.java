package D4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class C extends I4.t {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f457e = AtomicIntegerFieldUpdater.newUpdater(C.class, "_decision");
    private volatile int _decision;

    @Override // I4.t, D4.g0
    public final void l(Object obj) {
        m(obj);
    }

    @Override // I4.t, D4.g0
    public final void m(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f457e;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                I4.a.i(B0.f.F(this.f1321d), AbstractC0024y.o(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
