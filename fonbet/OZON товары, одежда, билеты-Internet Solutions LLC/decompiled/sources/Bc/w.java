package Bc;

import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class w<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3455a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.x f3456b;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3457a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f3458b = new rc.h();

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.y f3459c;

        a(io.reactivex.A a11, io.reactivex.y yVar) {
            this.f3457a = a11;
            this.f3459c = yVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
            rc.h hVar = this.f3458b;
            hVar.getClass();
            rc.d.a(hVar);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3457a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3457a.onSuccess(t2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3459c.c(this);
        }
    }

    public w(io.reactivex.y yVar, io.reactivex.x xVar) {
        this.f3455a = yVar;
        this.f3456b = xVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        a aVar = new a(a11, this.f3455a);
        a11.onSubscribe(aVar);
        InterfaceC8487b d11 = this.f3456b.d(aVar);
        rc.h hVar = aVar.f3458b;
        hVar.getClass();
        rc.d.d(hVar, d11);
    }
}
