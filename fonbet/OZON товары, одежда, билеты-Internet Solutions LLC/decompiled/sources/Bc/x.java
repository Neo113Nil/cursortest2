package Bc;

import Kc.C3493a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class x<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3460a;

    /* renamed from: b, reason: collision with root package name */
    final long f3461b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f3462c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f3463d;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T>, Runnable, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3464a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f3465b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final long f3466c;

        /* renamed from: d, reason: collision with root package name */
        final TimeUnit f3467d;

        a(io.reactivex.A a11, long j11, TimeUnit timeUnit) {
            this.f3464a = a11;
            this.f3466c = j11;
            this.f3467d = timeUnit;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
            rc.d.a(this.f3465b);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || !compareAndSet(interfaceC8487b, dVar)) {
                C3493a.f(th2);
            } else {
                rc.d.a(this.f3465b);
                this.f3464a.onError(th2);
            }
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || !compareAndSet(interfaceC8487b, dVar)) {
                return;
            }
            rc.d.a(this.f3465b);
            this.f3464a.onSuccess(t2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || !compareAndSet(interfaceC8487b, dVar)) {
                return;
            }
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            this.f3464a.onError(new TimeoutException(Gc.i.c(this.f3466c, this.f3467d)));
        }
    }

    public x(io.reactivex.y yVar, long j11, io.reactivex.x xVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3460a = yVar;
        this.f3461b = j11;
        this.f3462c = timeUnit;
        this.f3463d = xVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        long j11 = this.f3461b;
        TimeUnit timeUnit = this.f3462c;
        a aVar = new a(a11, j11, timeUnit);
        a11.onSubscribe(aVar);
        rc.d.d(aVar.f3465b, this.f3463d.e(aVar, j11, timeUnit));
        this.f3460a.c(aVar);
    }
}
