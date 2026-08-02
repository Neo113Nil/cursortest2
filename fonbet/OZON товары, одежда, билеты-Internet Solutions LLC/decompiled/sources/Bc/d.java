package Bc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class d<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3387a;

    /* renamed from: b, reason: collision with root package name */
    final ru.ozon.app.android.web.webview.cache.a f3388b;

    static final class a<T> implements io.reactivex.A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3389a;

        /* renamed from: b, reason: collision with root package name */
        final ru.ozon.app.android.web.webview.cache.a f3390b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f3391c;

        a(io.reactivex.A a11, ru.ozon.app.android.web.webview.cache.a aVar) {
            this.f3389a = a11;
            this.f3390b = aVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f3391c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f3391c.isDisposed();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3389a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f3391c, interfaceC8487b)) {
                this.f3391c = interfaceC8487b;
                this.f3389a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3389a.onSuccess(t2);
            try {
                this.f3390b.accept(t2);
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
        }
    }

    public d(io.reactivex.y yVar, ru.ozon.app.android.web.webview.cache.a aVar) {
        this.f3387a = yVar;
        this.f3388b = aVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3387a.c(new a(a11, this.f3388b));
    }
}
