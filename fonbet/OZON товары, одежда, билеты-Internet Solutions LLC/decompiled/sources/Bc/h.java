package Bc;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes9.dex */
public final class h<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3406a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super Throwable> f3407b;

    final class a implements io.reactivex.A<T> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.A<? super T> f3408a;

        a(io.reactivex.A<? super T> a11) {
            this.f3408a = a11;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            try {
                h.this.f3407b.accept(th2);
            } catch (Throwable th3) {
                C2645f.c(th3);
                th2 = new C8691a(th2, th3);
            }
            this.f3408a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f3408a.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3408a.onSuccess(t2);
        }
    }

    public h(io.reactivex.y yVar, qc.g gVar) {
        this.f3406a = yVar;
        this.f3407b = gVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3406a.c(new a(a11));
    }
}
