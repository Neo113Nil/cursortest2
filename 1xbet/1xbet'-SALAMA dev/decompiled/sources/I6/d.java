package I6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3724a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        d dVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3725b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d dVarB2 = b();
            t6.h.b(dVarB2);
            while (dVarB2.c() && (dVarB = dVarB2.b()) != null) {
                dVarB2 = dVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(dVarB2);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(dVarB2, obj, dVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(dVarB2) != obj) {
                    }
                }
            }
            if (dVar != null) {
                f3724a.set(dVar, dVarB2);
            }
            if (!dVarB2.c() || dVarB2.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
