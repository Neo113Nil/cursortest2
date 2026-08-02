package Dc;

import Dc.m;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: Dc.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2851b extends x implements m {

    /* renamed from: c, reason: collision with root package name */
    static final C0134b f6322c;

    /* renamed from: d, reason: collision with root package name */
    static final i f6323d;

    /* renamed from: e, reason: collision with root package name */
    static final int f6324e;

    /* renamed from: f, reason: collision with root package name */
    static final c f6325f;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<C0134b> f6326b;

    /* renamed from: Dc.b$a */
    static final class a extends x.c {

        /* renamed from: a, reason: collision with root package name */
        private final rc.f f6327a;

        /* renamed from: b, reason: collision with root package name */
        private final C8486a f6328b;

        /* renamed from: c, reason: collision with root package name */
        private final rc.f f6329c;

        /* renamed from: d, reason: collision with root package name */
        private final c f6330d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f6331e;

        a(c cVar) {
            this.f6330d = cVar;
            rc.f fVar = new rc.f();
            this.f6327a = fVar;
            C8486a c8486a = new C8486a();
            this.f6328b = c8486a;
            rc.f fVar2 = new rc.f();
            this.f6329c = fVar2;
            fVar2.a(fVar);
            fVar2.a(c8486a);
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b a(Runnable runnable) {
            return this.f6331e ? rc.e.INSTANCE : this.f6330d.d(runnable, 0L, TimeUnit.MILLISECONDS, this.f6327a);
        }

        @Override // io.reactivex.x.c
        public final InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit) {
            return this.f6331e ? rc.e.INSTANCE : this.f6330d.d(runnable, j11, timeUnit, this.f6328b);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f6331e) {
                return;
            }
            this.f6331e = true;
            this.f6329c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f6331e;
        }
    }

    /* renamed from: Dc.b$b, reason: collision with other inner class name */
    static final class C0134b implements m {

        /* renamed from: a, reason: collision with root package name */
        final int f6332a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f6333b;

        /* renamed from: c, reason: collision with root package name */
        long f6334c;

        C0134b(int i11, i iVar) {
            this.f6332a = i11;
            this.f6333b = new c[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f6333b[i12] = new c(iVar);
            }
        }

        @Override // Dc.m
        public final void a(int i11, m.a aVar) {
            int i12 = this.f6332a;
            if (i12 == 0) {
                for (int i13 = 0; i13 < i11; i13++) {
                    aVar.a(i13, C2851b.f6325f);
                }
                return;
            }
            int i14 = ((int) this.f6334c) % i12;
            for (int i15 = 0; i15 < i11; i15++) {
                aVar.a(i15, new a(this.f6333b[i14]));
                i14++;
                if (i14 == i12) {
                    i14 = 0;
                }
            }
            this.f6334c = i14;
        }

        public final c b() {
            int i11 = this.f6332a;
            if (i11 == 0) {
                return C2851b.f6325f;
            }
            long j11 = this.f6334c;
            this.f6334c = 1 + j11;
            return this.f6333b[(int) (j11 % i11)];
        }
    }

    /* renamed from: Dc.b$c */
    static final class c extends h {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f6324e = availableProcessors;
        c cVar = new c(new i("RxComputationShutdown"));
        f6325f = cVar;
        cVar.dispose();
        i iVar = new i("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f6323d = iVar;
        C0134b c0134b = new C0134b(0, iVar);
        f6322c = c0134b;
        for (c cVar2 : c0134b.f6333b) {
            cVar2.dispose();
        }
    }

    public C2851b() {
        AtomicReference<C0134b> atomicReference;
        i iVar = f6323d;
        C0134b c0134b = f6322c;
        this.f6326b = new AtomicReference<>(c0134b);
        C0134b c0134b2 = new C0134b(f6324e, iVar);
        do {
            atomicReference = this.f6326b;
            if (atomicReference.compareAndSet(c0134b, c0134b2)) {
                return;
            }
        } while (atomicReference.get() == c0134b);
        for (c cVar : c0134b2.f6333b) {
            cVar.dispose();
        }
    }

    @Override // Dc.m
    public final void a(int i11, m.a aVar) {
        C9656b.d(i11, "number > 0 required");
        this.f6326b.get().a(i11, aVar);
    }

    @Override // io.reactivex.x
    public final x.c b() {
        return new a(this.f6326b.get().b());
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f6326b.get().b().e(runnable, j11, timeUnit);
    }

    @Override // io.reactivex.x
    public final InterfaceC8487b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        return this.f6326b.get().b().f(runnable, j11, j12, timeUnit);
    }
}
