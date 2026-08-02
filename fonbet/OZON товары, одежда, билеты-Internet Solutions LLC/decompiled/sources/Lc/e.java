package Lc;

import Fc.g;
import Kc.C3493a;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class e<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    final Cc.c<T> f16700c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<Runnable> f16701d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16702e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f16703f;

    /* renamed from: g, reason: collision with root package name */
    Throwable f16704g;

    /* renamed from: h, reason: collision with root package name */
    final AtomicReference<InterfaceC6949b<? super T>> f16705h;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f16706i;

    /* renamed from: j, reason: collision with root package name */
    final AtomicBoolean f16707j;

    /* renamed from: k, reason: collision with root package name */
    final Fc.a<T> f16708k;

    /* renamed from: l, reason: collision with root package name */
    final AtomicLong f16709l;

    /* renamed from: m, reason: collision with root package name */
    boolean f16710m;

    final class a extends Fc.a<T> {
        a() {
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            e.this.f16710m = true;
            return 2;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (e.this.f16706i) {
                return;
            }
            e.this.f16706i = true;
            Runnable andSet = e.this.f16701d.getAndSet(null);
            if (andSet != null) {
                andSet.run();
            }
            e eVar = e.this;
            if (eVar.f16710m || eVar.f16708k.getAndIncrement() != 0) {
                return;
            }
            e.this.f16700c.clear();
            e.this.f16705h.lazySet(null);
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            e.this.f16700c.clear();
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return e.this.f16700c.isEmpty();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (g.f(j11)) {
                e eVar = e.this;
                Gc.d.a(eVar.f16709l, j11);
                eVar.o();
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() {
            return e.this.f16700c.poll();
        }
    }

    e() {
        C9656b.d(8, "capacityHint");
        this.f16700c = new Cc.c<>(8);
        this.f16701d = new AtomicReference<>(null);
        this.f16702e = true;
        this.f16705h = new AtomicReference<>();
        this.f16707j = new AtomicBoolean();
        this.f16708k = new a();
        this.f16709l = new AtomicLong();
    }

    public static e n() {
        return new e();
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (this.f16703f || this.f16706i) {
            interfaceC6950c.cancel();
        } else {
            interfaceC6950c.n(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.h
    protected final void j(j jVar) {
        if (this.f16707j.get() || !this.f16707j.compareAndSet(false, true)) {
            Fc.d.d(new IllegalStateException("This processor allows only a single Subscriber"), jVar);
            return;
        }
        jVar.d(this.f16708k);
        this.f16705h.set(jVar);
        if (this.f16706i) {
            this.f16705h.lazySet(null);
        } else {
            o();
        }
    }

    final boolean m(boolean z11, boolean z12, boolean z13, InterfaceC6949b<? super T> interfaceC6949b, Cc.c<T> cVar) {
        if (this.f16706i) {
            cVar.clear();
            this.f16705h.lazySet(null);
            return true;
        }
        if (!z12) {
            return false;
        }
        if (z11 && this.f16704g != null) {
            cVar.clear();
            this.f16705h.lazySet(null);
            interfaceC6949b.onError(this.f16704g);
            return true;
        }
        if (!z13) {
            return false;
        }
        Throwable th2 = this.f16704g;
        this.f16705h.lazySet(null);
        if (th2 != null) {
            interfaceC6949b.onError(th2);
            return true;
        }
        interfaceC6949b.onComplete();
        return true;
    }

    final void o() {
        boolean z11;
        if (this.f16708k.getAndIncrement() != 0) {
            return;
        }
        int i11 = 1;
        InterfaceC6949b<? super T> interfaceC6949b = this.f16705h.get();
        int i12 = 1;
        while (interfaceC6949b == null) {
            i12 = this.f16708k.addAndGet(-i12);
            if (i12 == 0) {
                return;
            } else {
                interfaceC6949b = this.f16705h.get();
            }
        }
        if (this.f16710m) {
            Cc.c<T> cVar = this.f16700c;
            boolean z12 = this.f16702e;
            while (!this.f16706i) {
                boolean z13 = this.f16703f;
                if (!z12 && z13 && this.f16704g != null) {
                    cVar.clear();
                    this.f16705h.lazySet(null);
                    interfaceC6949b.onError(this.f16704g);
                    return;
                }
                interfaceC6949b.onNext(null);
                if (z13) {
                    this.f16705h.lazySet(null);
                    Throwable th2 = this.f16704g;
                    if (th2 != null) {
                        interfaceC6949b.onError(th2);
                        return;
                    } else {
                        interfaceC6949b.onComplete();
                        return;
                    }
                }
                i11 = this.f16708k.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            cVar.clear();
            this.f16705h.lazySet(null);
            return;
        }
        Cc.c<T> cVar2 = this.f16700c;
        boolean z14 = !this.f16702e;
        int i13 = 1;
        while (true) {
            long j11 = this.f16709l.get();
            long j12 = 0;
            while (j11 != j12) {
                boolean z15 = this.f16703f;
                T poll = cVar2.poll();
                boolean z16 = poll == null;
                if (m(z14, z15, z16, interfaceC6949b, cVar2)) {
                    return;
                }
                if (z16) {
                    break;
                }
                interfaceC6949b.onNext(poll);
                j12++;
            }
            if (j11 == j12) {
                z11 = z14;
                if (m(z14, this.f16703f, cVar2.isEmpty(), interfaceC6949b, cVar2)) {
                    return;
                }
            } else {
                z11 = z14;
            }
            if (j12 != 0 && j11 != Long.MAX_VALUE) {
                this.f16709l.addAndGet(-j12);
            }
            i13 = this.f16708k.addAndGet(-i13);
            if (i13 == 0) {
                return;
            } else {
                z14 = z11;
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        if (this.f16703f || this.f16706i) {
            return;
        }
        this.f16703f = true;
        Runnable andSet = this.f16701d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        o();
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        C9656b.c(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f16703f || this.f16706i) {
            C3493a.f(th2);
            return;
        }
        this.f16704g = th2;
        this.f16703f = true;
        Runnable andSet = this.f16701d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        o();
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        C9656b.c(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f16703f || this.f16706i) {
            return;
        }
        this.f16700c.offer(t2);
        o();
    }
}
