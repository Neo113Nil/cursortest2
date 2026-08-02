package p4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class l0 extends X {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18802q = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: o, reason: collision with root package name */
    public final Thread f18803o = Thread.currentThread();

    /* renamed from: p, reason: collision with root package name */
    public E f18804p;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p4.X
    public final boolean k() {
        return true;
    }

    @Override // p4.X
    public final void l(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f18802q;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                n(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f18803o.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18802q;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                E e3 = this.f18804p;
                if (e3 != null) {
                    e3.a();
                    return;
                }
                return;
            }
        }
    }
}
