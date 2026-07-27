package w2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: w2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246z extends B2.s {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10537e = AtomicIntegerFieldUpdater.newUpdater(C1246z.class, "_decision");
    private volatile int _decision;

    @Override // B2.s, w2.Z
    public final void o(Object obj) {
        p(obj);
    }

    @Override // B2.s, w2.Z
    public final void p(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f10537e;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                B2.a.g(F2.b.y(this.f179d), AbstractC1242v.h(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
