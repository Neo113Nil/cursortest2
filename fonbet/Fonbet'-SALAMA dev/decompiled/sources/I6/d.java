package I6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3724a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3725b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f3725b.lazySet(this, null);
    }

    public final d b() {
        Object obj = f3724a.get(this);
        if (obj == a.f3717b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d b7;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3725b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d b8 = b();
            t6.h.b(b8);
            while (b8.c() && (b7 = b8.b()) != null) {
                b8 = b7;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b8);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b8, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b8) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f3724a.set(dVar, b8);
            }
            if (!b8.c() || b8.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
