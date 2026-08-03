package E1;

/* loaded from: classes.dex */
public abstract class b extends E1.q {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f267a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.b.class, java.lang.Object.class, "_consensus");
    private volatile java.lang.Object _consensus = E1.AbstractC0000a.f261a;

    @Override // E1.q
    public final java.lang.Object a(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f267a;
        java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
        C.j jVar = E1.AbstractC0000a.f261a;
        if (obj2 == jVar) {
            C.j c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == jVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, jVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != jVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(java.lang.Object obj, java.lang.Object obj2);

    public abstract C.j c(java.lang.Object obj);
}
