package I4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1307a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1307a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a6 = nVar.a(runnable);
            if (a6 == 0) {
                return true;
            }
            if (a6 == 1) {
                n c2 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c2) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a6 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1307a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c2) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f1307a.get(this);
        nVar.getClass();
        long j2 = n.f1310f.get(nVar);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1307a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d6 = nVar.d();
            if (d6 != n.f1311g) {
                return d6;
            }
            n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c2) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
