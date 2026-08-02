package Bc;

import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class t<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3441a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.x f3442b;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3443a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.x f3444b;

        /* renamed from: c, reason: collision with root package name */
        T f3445c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f3446d;

        a(io.reactivex.A<? super T> a11, io.reactivex.x xVar) {
            this.f3443a = a11;
            this.f3444b = xVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3446d = th2;
            rc.d.d(this, this.f3444b.d(this));
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f3443a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3445c = t2;
            rc.d.d(this, this.f3444b.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f3446d;
            io.reactivex.A<? super T> a11 = this.f3443a;
            if (th2 != null) {
                a11.onError(th2);
            } else {
                a11.onSuccess(this.f3445c);
            }
        }
    }

    public t(io.reactivex.y yVar, io.reactivex.x xVar) {
        this.f3441a = yVar;
        this.f3442b = xVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3441a.c(new a(a11, this.f3442b));
    }
}
