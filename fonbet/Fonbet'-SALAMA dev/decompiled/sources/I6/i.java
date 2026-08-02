package I6;

import D6.A;
import D6.C0130m;
import D6.E0;
import D6.G;
import D6.J;
import D6.O;
import D6.y0;
import i6.InterfaceC1292i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class i extends A implements J {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3734y = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final K6.k f3735c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J f3737e;

    /* renamed from: f, reason: collision with root package name */
    public final l f3738f;
    private volatile int runningWorkers;

    /* renamed from: x, reason: collision with root package name */
    public final Object f3739x;

    /* JADX WARN: Multi-variable type inference failed */
    public i(K6.k kVar, int i7) {
        this.f3735c = kVar;
        this.f3736d = i7;
        J j = kVar instanceof J ? (J) kVar : null;
        this.f3737e = j == null ? G.f1791a : j;
        this.f3738f = new l();
        this.f3739x = new Object();
    }

    @Override // D6.J
    public final O a(long j, E0 e02, InterfaceC1292i interfaceC1292i) {
        return this.f3737e.a(j, e02, interfaceC1292i);
    }

    @Override // D6.J
    public final void c(long j, C0130m c0130m) {
        this.f3737e.c(j, c0130m);
    }

    @Override // D6.A
    public final void d(InterfaceC1292i interfaceC1292i, Runnable runnable) {
        this.f3738f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3734y;
        if (atomicIntegerFieldUpdater.get(this) < this.f3736d) {
            synchronized (this.f3739x) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f3736d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 == null) {
                    return;
                }
                this.f3735c.d(this, new y0(9, this, f7, false));
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f3738f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3739x) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3734y;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3738f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
