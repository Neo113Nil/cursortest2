package Bc;

import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class c<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3383a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC7094b f3384b;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3385a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.y f3386b;

        a(io.reactivex.A a11, io.reactivex.y yVar) {
            this.f3385a = a11;
            this.f3386b = yVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            this.f3386b.c(new uc.t(this, this.f3385a));
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            this.f3385a.onError(th2);
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f3385a.onSubscribe(this);
            }
        }
    }

    public c(io.reactivex.y yVar, AbstractC7094b abstractC7094b) {
        this.f3383a = yVar;
        this.f3384b = abstractC7094b;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3384b.a(new a(a11, this.f3383a));
    }
}
