package I6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3743a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3743a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a2 = nVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                n c3 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3743a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f3743a.get(this);
        nVar.getClass();
        long j = n.f3746f.get(nVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3743a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d7 = nVar.d();
            if (d7 != n.f3747g) {
                return d7;
            }
            n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
