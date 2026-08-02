package D6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class K extends I6.t {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1794e = AtomicIntegerFieldUpdater.newUpdater(K.class, "_decision");
    private volatile int _decision;

    @Override // I6.t, D6.s0
    public final void h(Object obj) {
        i(obj);
    }

    @Override // I6.t, D6.s0
    public final void i(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1794e;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                I6.a.h(P6.b.v(this.f3757d), E.r(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
