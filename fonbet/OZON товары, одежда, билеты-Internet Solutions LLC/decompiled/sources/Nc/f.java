package Nc;

import Kc.C3493a;
import io.reactivex.p;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;
import uc.AbstractC10018b;

/* loaded from: classes9.dex */
public final class f<T> extends e<T> {

    /* renamed from: a, reason: collision with root package name */
    final Cc.c<T> f18969a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<w<? super T>> f18970b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f18971c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18972d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f18973e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f18974f;

    /* renamed from: g, reason: collision with root package name */
    Throwable f18975g;

    /* renamed from: h, reason: collision with root package name */
    final AtomicBoolean f18976h;

    /* renamed from: i, reason: collision with root package name */
    final AbstractC10018b<T> f18977i;

    /* renamed from: j, reason: collision with root package name */
    boolean f18978j;

    final class a extends AbstractC10018b<T> {
        a() {
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            f.this.f18978j = true;
            return 2;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            f.this.f18969a.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (f.this.f18973e) {
                return;
            }
            f.this.f18973e = true;
            f.this.g();
            f.this.f18970b.lazySet(null);
            if (f.this.f18977i.getAndIncrement() == 0) {
                f.this.f18970b.lazySet(null);
                f.this.f18969a.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return f.this.f18973e;
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return f.this.f18969a.isEmpty();
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            return f.this.f18969a.poll();
        }
    }

    f(int i11) {
        C9656b.d(i11, "capacityHint");
        this.f18969a = new Cc.c<>(i11);
        this.f18971c = new AtomicReference<>();
        this.f18972d = true;
        this.f18970b = new AtomicReference<>();
        this.f18976h = new AtomicBoolean();
        this.f18977i = new a();
    }

    public static <T> f<T> d() {
        return new f<>(p.bufferSize());
    }

    public static <T> f<T> e(int i11) {
        return new f<>(i11);
    }

    public static f f(Runnable runnable, int i11) {
        return new f(runnable, i11);
    }

    final void g() {
        AtomicReference<Runnable> atomicReference = this.f18971c;
        Runnable runnable = atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    final void h() {
        Throwable th2;
        if (this.f18977i.getAndIncrement() != 0) {
            return;
        }
        w<? super T> wVar = this.f18970b.get();
        int i11 = 1;
        int i12 = 1;
        while (wVar == null) {
            i12 = this.f18977i.addAndGet(-i12);
            if (i12 == 0) {
                return;
            } else {
                wVar = this.f18970b.get();
            }
        }
        if (this.f18978j) {
            Cc.c<T> cVar = this.f18969a;
            boolean z11 = this.f18972d;
            while (!this.f18973e) {
                boolean z12 = this.f18974f;
                if (!z11 && z12 && (th2 = this.f18975g) != null) {
                    this.f18970b.lazySet(null);
                    cVar.clear();
                    wVar.onError(th2);
                    return;
                }
                wVar.onNext(null);
                if (z12) {
                    this.f18970b.lazySet(null);
                    Throwable th3 = this.f18975g;
                    if (th3 != null) {
                        wVar.onError(th3);
                        return;
                    } else {
                        wVar.onComplete();
                        return;
                    }
                }
                i11 = this.f18977i.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            this.f18970b.lazySet(null);
            cVar.clear();
            return;
        }
        Cc.c<T> cVar2 = this.f18969a;
        boolean z13 = this.f18972d;
        boolean z14 = true;
        int i13 = 1;
        while (!this.f18973e) {
            boolean z15 = this.f18974f;
            T poll = this.f18969a.poll();
            boolean z16 = poll == null;
            if (z15) {
                if (!z13 && z14) {
                    Throwable th4 = this.f18975g;
                    if (th4 != null) {
                        this.f18970b.lazySet(null);
                        cVar2.clear();
                        wVar.onError(th4);
                        return;
                    }
                    z14 = false;
                }
                if (z16) {
                    this.f18970b.lazySet(null);
                    Throwable th5 = this.f18975g;
                    if (th5 != null) {
                        wVar.onError(th5);
                        return;
                    } else {
                        wVar.onComplete();
                        return;
                    }
                }
            }
            if (z16) {
                i13 = this.f18977i.addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            } else {
                wVar.onNext(poll);
            }
        }
        this.f18970b.lazySet(null);
        cVar2.clear();
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (this.f18974f || this.f18973e) {
            return;
        }
        this.f18974f = true;
        g();
        h();
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        C9656b.c(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f18974f || this.f18973e) {
            C3493a.f(th2);
            return;
        }
        this.f18975g = th2;
        this.f18974f = true;
        g();
        h();
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        C9656b.c(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f18974f || this.f18973e) {
            return;
        }
        this.f18969a.offer(t2);
        h();
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (this.f18974f || this.f18973e) {
            interfaceC8487b.dispose();
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super T> wVar) {
        if (this.f18976h.get() || !this.f18976h.compareAndSet(false, true)) {
            rc.e.d(new IllegalStateException("Only a single observer allowed."), wVar);
            return;
        }
        wVar.onSubscribe(this.f18977i);
        this.f18970b.lazySet(wVar);
        if (this.f18973e) {
            this.f18970b.lazySet(null);
        } else {
            h();
        }
    }

    f(Runnable runnable, int i11) {
        C9656b.d(i11, "capacityHint");
        this.f18969a = new Cc.c<>(i11);
        this.f18971c = new AtomicReference<>(runnable);
        this.f18972d = true;
        this.f18970b = new AtomicReference<>();
        this.f18976h = new AtomicBoolean();
        this.f18977i = new a();
    }
}
