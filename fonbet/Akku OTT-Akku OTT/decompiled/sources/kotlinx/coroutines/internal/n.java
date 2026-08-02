package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class n<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new o(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int a2 = oVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                o<E> c = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar.b()) {
                return;
            }
            o<E> c = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }

    public final int c() {
        o oVar = (o) a.get(this);
        oVar.getClass();
        long j = o.f.get(oVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            E e = (E) oVar.d();
            if (e != o.g) {
                return e;
            }
            o<E> c = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
