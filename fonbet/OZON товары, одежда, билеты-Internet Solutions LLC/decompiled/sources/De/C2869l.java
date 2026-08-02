package De;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10724g0;
import xe.T;
import xe.W;

/* renamed from: De.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2869l extends xe.I implements W {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6629g = AtomicIntegerFieldUpdater.newUpdater(C2869l.class, "runningWorkers$volatile");

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W f6630b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.I f6631c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6632d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final p<Runnable> f6633e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f6634f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: De.l$a */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private Runnable f6635a;

        public a(@NotNull Runnable runnable) {
            this.f6635a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i11 = 0;
            while (true) {
                try {
                    this.f6635a.run();
                } catch (Throwable th2) {
                    xe.K.a(kotlin.coroutines.g.f71771a, th2);
                }
                C2869l c2869l = C2869l.this;
                Runnable D02 = c2869l.D0();
                if (D02 == null) {
                    return;
                }
                this.f6635a = D02;
                i11++;
                if (i11 >= 16 && c2869l.f6631c.t(c2869l)) {
                    c2869l.f6631c.q(c2869l, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2869l(@NotNull xe.I i11, int i12) {
        W w11 = i11 instanceof W ? (W) i11 : null;
        this.f6630b = w11 == null ? T.a() : w11;
        this.f6631c = i11;
        this.f6632d = i12;
        this.f6633e = new p<>();
        this.f6634f = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable D0() {
        while (true) {
            Runnable d11 = this.f6633e.d();
            if (d11 != null) {
                return d11;
            }
            synchronized (this.f6634f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6629g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6633e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean E0() {
        synchronized (this.f6634f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6629g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f6632d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // xe.W
    @NotNull
    public final InterfaceC10724g0 k(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f6630b.k(j11, runnable, coroutineContext);
    }

    @Override // xe.W
    public final void o(long j11, @NotNull C10737n c10737n) {
        this.f6630b.o(j11, c10737n);
    }

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable D02;
        this.f6633e.a(runnable);
        if (f6629g.get(this) >= this.f6632d || !E0() || (D02 = D0()) == null) {
            return;
        }
        this.f6631c.q(this, new a(D02));
    }

    @Override // xe.I
    public final void r(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable D02;
        this.f6633e.a(runnable);
        if (f6629g.get(this) >= this.f6632d || !E0() || (D02 = D0()) == null) {
            return;
        }
        this.f6631c.r(this, new a(D02));
    }

    @Override // xe.I
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6631c);
        sb2.append(".limitedParallelism(");
        return Ek.a.d(sb2, this.f6632d, ')');
    }
}
