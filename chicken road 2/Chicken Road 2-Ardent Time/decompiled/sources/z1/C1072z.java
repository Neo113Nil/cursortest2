package z1;

/* renamed from: z1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072z extends E1.t {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8605e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(z1.C1072z.class, "_decision");
    private volatile int _decision;

    @Override // E1.t, z1.Z
    public final void p(java.lang.Object obj) {
        q(obj);
    }

    @Override // E1.t, z1.Z
    public final void q(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f8605e;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                E1.AbstractC0000a.h(u0.AbstractC0995a.o(this.f301d), z1.AbstractC1068v.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
