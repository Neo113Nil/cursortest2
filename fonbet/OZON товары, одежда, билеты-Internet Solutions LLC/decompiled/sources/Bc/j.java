package Bc;

import Bl0.C2645f;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class j<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3415a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super T> f3416b;

    final class a implements io.reactivex.A<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3417a;

        a(io.reactivex.A<? super T> a11) {
            this.f3417a = a11;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3417a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f3417a.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            io.reactivex.A<? super T> a11 = this.f3417a;
            try {
                j.this.f3416b.accept(t2);
                a11.onSuccess(t2);
            } catch (Throwable th2) {
                C2645f.c(th2);
                a11.onError(th2);
            }
        }
    }

    public j(io.reactivex.y yVar, qc.g gVar) {
        this.f3415a = yVar;
        this.f3416b = gVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3415a.c(new a(a11));
    }
}
