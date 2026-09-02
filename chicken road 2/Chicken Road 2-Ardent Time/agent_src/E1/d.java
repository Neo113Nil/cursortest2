package E1;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f269a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.d.class, java.lang.Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f270b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.d.class, java.lang.Object.class, "_prev");
    private volatile java.lang.Object _next;
    private volatile java.lang.Object _prev;

    public d(E1.u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f270b.lazySet(this, null);
    }

    public final E1.d b() {
        java.lang.Object obj = f269a.get(this);
        if (obj == E1.AbstractC0000a.f262b) {
            return null;
        }
        return (E1.d) obj;
    }

    public abstract boolean c();

    public final void d() {
        E1.d b2;
        if (b() == null) {
            return;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f270b;
            E1.d dVar = (E1.d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (E1.d) atomicReferenceFieldUpdater.get(dVar);
            }
            E1.d b3 = b();
            kotlin.jvm.internal.i.b(b3);
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                java.lang.Object obj = atomicReferenceFieldUpdater.get(b3);
                E1.d dVar2 = ((E1.d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f269a.set(dVar, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
