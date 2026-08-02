package Bc;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class k<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3419a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9019a f3420b;

    final class a implements io.reactivex.A<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3421a;

        a(io.reactivex.A<? super T> a11) {
            this.f3421a = a11;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            try {
                k.this.f3420b.run();
            } catch (Throwable th3) {
                C2645f.c(th3);
                th2 = new C8691a(th2, th3);
            }
            this.f3421a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f3421a.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            io.reactivex.A<? super T> a11 = this.f3421a;
            try {
                k.this.f3420b.run();
                a11.onSuccess(t2);
            } catch (Throwable th2) {
                C2645f.c(th2);
                a11.onError(th2);
            }
        }
    }

    public k(io.reactivex.y yVar, InterfaceC9019a interfaceC9019a) {
        this.f3419a = yVar;
        this.f3420b = interfaceC9019a;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3419a.c(new a(a11));
    }
}
