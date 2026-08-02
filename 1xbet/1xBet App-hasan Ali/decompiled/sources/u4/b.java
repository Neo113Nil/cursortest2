package u4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20081a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20082b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(q qVar) {
        this._prev$volatile = qVar;
    }

    public final void a() {
        f20082b.set(this, null);
    }

    public final b b() {
        Object obj = f20081a.get(this);
        if (obj == a.f20075a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean c();

    public final void d() {
        b b3;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20082b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.c()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b b5 = b();
            kotlin.jvm.internal.l.c(b5);
            while (b5.c() && (b3 = b5.b()) != null) {
                b5 = b3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b5);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b5, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(b5) != obj) {
                        break;
                    }
                }
            }
            if (bVar != null) {
                f20081a.set(bVar, b5);
            }
            if (!b5.c() || b5.b() == null) {
                if (bVar == null || !bVar.c()) {
                    return;
                }
            }
        }
    }
}
