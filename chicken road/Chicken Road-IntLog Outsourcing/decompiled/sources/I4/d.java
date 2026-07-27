package I4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1288a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1289b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f1289b.lazySet(this, null);
    }

    public final d b() {
        Object obj = f1288a.get(this);
        if (obj == a.f1281b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d b6;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1289b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d b7 = b();
            kotlin.jvm.internal.i.b(b7);
            while (b7.c() && (b6 = b7.b()) != null) {
                b7 = b6;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b7);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b7, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b7) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f1288a.set(dVar, b7);
            }
            if (!b7.c() || b7.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
