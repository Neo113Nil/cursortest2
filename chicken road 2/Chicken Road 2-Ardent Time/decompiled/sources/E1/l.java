package E1;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f287a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.l.class, java.lang.Object.class, "_cur");
    private volatile java.lang.Object _cur = new E1.n(8, false);

    public final boolean a(java.lang.Runnable runnable) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f287a;
            E1.n nVar = (E1.n) atomicReferenceFieldUpdater.get(this);
            int a2 = nVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                E1.n c2 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c2) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f287a;
            E1.n nVar = (E1.n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            E1.n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c2) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        E1.n nVar = (E1.n) f287a.get(this);
        nVar.getClass();
        long j2 = E1.n.f290f.get(nVar);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final java.lang.Object d() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f287a;
            E1.n nVar = (E1.n) atomicReferenceFieldUpdater.get(this);
            java.lang.Object d2 = nVar.d();
            if (d2 != E1.n.f291g) {
                return d2;
            }
            E1.n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c2) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
