package V1;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final V1.r f1794a = new V1.r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1795b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference[] f1796c;

    static {
        int highestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1795b = highestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new java.util.concurrent.atomic.AtomicReference();
        }
        f1796c = atomicReferenceArr;
    }

    public static final void a(V1.r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        if (segment.f1792f != null || segment.f1793g != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (segment.f1790d) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = f1796c[(int) (java.lang.Thread.currentThread().getId() & (f1795b - 1))];
        V1.r rVar = f1794a;
        V1.r rVar2 = (V1.r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return;
        }
        int i2 = rVar2 != null ? rVar2.f1789c : 0;
        if (i2 >= 65536) {
            atomicReference.set(rVar2);
            return;
        }
        segment.f1792f = rVar2;
        segment.f1788b = 0;
        segment.f1789c = i2 + 8192;
        atomicReference.set(segment);
    }

    public static final V1.r b() {
        java.util.concurrent.atomic.AtomicReference atomicReference = f1796c[(int) (java.lang.Thread.currentThread().getId() & (f1795b - 1))];
        V1.r rVar = f1794a;
        V1.r rVar2 = (V1.r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new V1.r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new V1.r();
        }
        atomicReference.set(rVar2.f1792f);
        rVar2.f1792f = null;
        rVar2.f1789c = 0;
        return rVar2;
    }
}
