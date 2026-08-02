package Bc;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes.dex */
public final class r<T, R> extends io.reactivex.y<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3436a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends R> f3437b;

    static final class a<T, R> implements io.reactivex.A<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super R> f3438a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends R> f3439b;

        a(io.reactivex.A<? super R> a11, qc.o<? super T, ? extends R> oVar) {
            this.f3438a = a11;
            this.f3439b = oVar;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3438a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f3438a.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            try {
                R apply = this.f3439b.apply(t2);
                C9656b.c(apply, "The mapper function returned a null value.");
                this.f3438a.onSuccess(apply);
            } catch (Throwable th2) {
                C2645f.c(th2);
                onError(th2);
            }
        }
    }

    public r(io.reactivex.y yVar, qc.o oVar) {
        this.f3436a = yVar;
        this.f3437b = oVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super R> a11) {
        this.f3436a.c(new a(a11, this.f3437b));
    }
}
