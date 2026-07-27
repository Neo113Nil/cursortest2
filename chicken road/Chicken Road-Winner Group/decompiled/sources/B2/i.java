package B2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w2.AbstractC1239s;
import w2.AbstractC1244x;
import w2.InterfaceC1245y;

/* loaded from: classes.dex */
public final class i extends AbstractC1239s implements InterfaceC1245y {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f162g = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final D2.l f163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f164d;

    /* renamed from: e, reason: collision with root package name */
    public final l f165e;
    public final Object f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(D2.l lVar, int i3) {
        this.f163c = lVar;
        this.f164d = i3;
        if ((lVar instanceof InterfaceC1245y ? (InterfaceC1245y) lVar : null) == null) {
            int i4 = AbstractC1244x.f10536a;
        }
        this.f165e = new l();
        this.f = new Object();
    }

    @Override // w2.AbstractC1239s
    public final void c(g2.h hVar, Runnable runnable) {
        this.f165e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f162g;
        if (atomicIntegerFieldUpdater.get(this) < this.f164d) {
            synchronized (this.f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f164d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable e3 = e();
                if (e3 == null) {
                    return;
                }
                this.f163c.c(this, new A.a(this, e3, 2, false));
            }
        }
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f165e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f162g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f165e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
