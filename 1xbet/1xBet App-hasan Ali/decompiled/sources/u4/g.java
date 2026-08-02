package u4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n.AbstractC2107A;
import p4.AbstractC2277q;
import p4.AbstractC2284y;
import p4.C2268h;
import p4.InterfaceC2259A;

/* loaded from: classes.dex */
public final class g extends AbstractC2277q implements InterfaceC2259A {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20091r = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2259A f20092m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC2277q f20093n;

    /* renamed from: o, reason: collision with root package name */
    public final int f20094o;

    /* renamed from: p, reason: collision with root package name */
    public final j f20095p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f20096q;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC2277q abstractC2277q, int i) {
        InterfaceC2259A interfaceC2259A = abstractC2277q instanceof InterfaceC2259A ? (InterfaceC2259A) abstractC2277q : null;
        this.f20092m = interfaceC2259A == null ? AbstractC2284y.f18836a : interfaceC2259A;
        this.f20093n = abstractC2277q;
        this.f20094o = i;
        this.f20095p = new j();
        this.f20096q = new Object();
    }

    @Override // p4.AbstractC2277q
    public final void E(a4.h hVar, Runnable runnable) {
        boolean z3;
        Runnable H5;
        this.f20095p.a(runnable);
        if (f20091r.get(this) < this.f20094o) {
            synchronized (this.f20096q) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20091r;
                if (atomicIntegerFieldUpdater.get(this) >= this.f20094o) {
                    z3 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z3 = true;
                }
            }
            if (!z3 || (H5 = H()) == null) {
                return;
            }
            this.f20093n.E(this, new D3.h(27, this, H5));
        }
    }

    public final Runnable H() {
        while (true) {
            Runnable runnable = (Runnable) this.f20095p.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f20096q) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20091r;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f20095p.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // p4.InterfaceC2259A
    public final void i(long j5, C2268h c2268h) {
        this.f20092m.i(j5, c2268h);
    }

    @Override // p4.AbstractC2277q
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20093n);
        sb.append(".limitedParallelism(");
        return AbstractC2107A.t(sb, this.f20094o, ')');
    }
}
