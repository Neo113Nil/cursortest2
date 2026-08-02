package Bc;

import Bl0.C2645f;
import io.reactivex.C;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes.dex */
public final class m<T, R> extends io.reactivex.y<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3424a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends C<? extends R>> f3425b;

    static final class a<T, R> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super R> f3426a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends C<? extends R>> f3427b;

        /* renamed from: Bc.m$a$a, reason: collision with other inner class name */
        static final class C0083a<R> implements io.reactivex.A<R> {

            /* renamed from: a, reason: collision with root package name */
            final AtomicReference<InterfaceC8487b> f3428a;

            /* renamed from: b, reason: collision with root package name */
            final io.reactivex.A<? super R> f3429b;

            C0083a(AtomicReference<InterfaceC8487b> atomicReference, io.reactivex.A<? super R> a11) {
                this.f3428a = atomicReference;
                this.f3429b = a11;
            }

            @Override // io.reactivex.A
            public final void onError(Throwable th2) {
                this.f3429b.onError(th2);
            }

            @Override // io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.d(this.f3428a, interfaceC8487b);
            }

            @Override // io.reactivex.A
            public final void onSuccess(R r11) {
                this.f3429b.onSuccess(r11);
            }
        }

        a(io.reactivex.A<? super R> a11, qc.o<? super T, ? extends C<? extends R>> oVar) {
            this.f3426a = a11;
            this.f3427b = oVar;
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
            this.f3426a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f3426a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            io.reactivex.A<? super R> a11 = this.f3426a;
            try {
                C<? extends R> apply = this.f3427b.apply(t2);
                C9656b.c(apply, "The single returned by the mapper is null");
                C<? extends R> c11 = apply;
                if (isDisposed()) {
                    return;
                }
                c11.c(new C0083a(this, a11));
            } catch (Throwable th2) {
                C2645f.c(th2);
                a11.onError(th2);
            }
        }
    }

    public m(io.reactivex.y yVar, qc.o oVar) {
        this.f3425b = oVar;
        this.f3424a = yVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super R> a11) {
        this.f3424a.c(new a(a11, this.f3425b));
    }
}
