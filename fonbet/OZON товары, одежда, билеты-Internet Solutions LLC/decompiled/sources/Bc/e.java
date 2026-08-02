package Bc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class e<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3392a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9019a f3393b;

    static final class a<T> implements io.reactivex.A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3394a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9019a f3395b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f3396c;

        a(io.reactivex.A<? super T> a11, InterfaceC9019a interfaceC9019a) {
            this.f3394a = a11;
            this.f3395b = interfaceC9019a;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f3396c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f3396c.isDisposed();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3394a.onError(th2);
            try {
                this.f3395b.run();
            } catch (Throwable th3) {
                C2645f.c(th3);
                C3493a.f(th3);
            }
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f3396c, interfaceC8487b)) {
                this.f3396c = interfaceC8487b;
                this.f3394a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3394a.onSuccess(t2);
            try {
                this.f3395b.run();
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
        }
    }

    public e(io.reactivex.y yVar, InterfaceC9019a interfaceC9019a) {
        this.f3392a = yVar;
        this.f3393b = interfaceC9019a;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3392a.c(new a(a11, this.f3393b));
    }
}
