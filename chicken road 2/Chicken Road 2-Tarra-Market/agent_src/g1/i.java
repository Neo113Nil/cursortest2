package g1;

import b1.AbstractC0028p;
import b1.AbstractC0032u;
import b1.InterfaceC0033v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class i extends AbstractC0028p implements InterfaceC0033v {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1154g = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final h1.l f1155c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1156d;

    /* renamed from: e, reason: collision with root package name */
    public final l f1157e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1158f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(h1.l lVar, int i2) {
        this.f1155c = lVar;
        this.f1156d = i2;
        if ((lVar instanceof InterfaceC0033v ? (InterfaceC0033v) lVar : null) == null) {
            int i3 = AbstractC0032u.f691a;
        }
        this.f1157e = new l();
        this.f1158f = new Object();
    }

    @Override // b1.AbstractC0028p
    public final void l(M0.i iVar, Runnable runnable) {
        this.f1157e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1154g;
        if (atomicIntegerFieldUpdater.get(this) < this.f1156d) {
            synchronized (this.f1158f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1156d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable n2 = n();
                if (n2 == null) {
                    return;
                }
                this.f1155c.l(this, new P.q(6, this, n2));
            }
        }
    }

    public final Runnable n() {
        while (true) {
            Runnable runnable = (Runnable) this.f1157e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1158f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1154g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1157e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
