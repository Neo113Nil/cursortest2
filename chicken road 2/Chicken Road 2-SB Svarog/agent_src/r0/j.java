package r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m0.AbstractC0059p;
import m0.AbstractC0064v;
import m0.InterfaceC0065w;

/* loaded from: classes.dex */
public final class j extends AbstractC0059p implements InterfaceC0065w {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1175h = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0059p f1176d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1177e;

    /* renamed from: f, reason: collision with root package name */
    public final m f1178f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1179g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(AbstractC0059p abstractC0059p, int i2) {
        this.f1176d = abstractC0059p;
        this.f1177e = i2;
        if ((abstractC0059p instanceof InterfaceC0065w ? (InterfaceC0065w) abstractC0059p : null) == null) {
            int i3 = AbstractC0064v.f955a;
        }
        this.f1178f = new m();
        this.f1179g = new Object();
    }

    @Override // m0.AbstractC0059p
    public final void f(Y.i iVar, Runnable runnable) {
        this.f1178f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1175h;
        if (atomicIntegerFieldUpdater.get(this) < this.f1177e) {
            synchronized (this.f1179g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1177e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable i2 = i();
                if (i2 == null) {
                    return;
                }
                this.f1176d.f(this, new i(this, i2));
            }
        }
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f1178f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1179g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1175h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1178f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
