package Bc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class f<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3397a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9019a f3398b;

    static final class a<T> extends AtomicInteger implements io.reactivex.A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3399a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9019a f3400b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f3401c;

        a(io.reactivex.A<? super T> a11, InterfaceC9019a interfaceC9019a) {
            this.f3399a = a11;
            this.f3400b = interfaceC9019a;
        }

        final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f3400b.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f3401c.dispose();
            a();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f3401c.isDisposed();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3399a.onError(th2);
            a();
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f3401c, interfaceC8487b)) {
                this.f3401c = interfaceC8487b;
                this.f3399a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3399a.onSuccess(t2);
            a();
        }
    }

    public f(io.reactivex.y yVar, InterfaceC9019a interfaceC9019a) {
        this.f3397a = yVar;
        this.f3398b = interfaceC9019a;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3397a.c(new a(a11, this.f3398b));
    }
}
