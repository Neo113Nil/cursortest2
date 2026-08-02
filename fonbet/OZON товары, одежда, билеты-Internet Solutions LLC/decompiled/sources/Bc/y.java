package Bc;

import io.reactivex.C;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class y<T> extends io.reactivex.h<T> {

    /* renamed from: c, reason: collision with root package name */
    final C<? extends T> f3468c;

    static final class a<T> extends Fc.c<T> implements io.reactivex.A<T> {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f3469c;

        @Override // Fc.c, hg.InterfaceC6950c
        public final void cancel() {
            super.cancel();
            this.f3469c.dispose();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f9317a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f3469c, interfaceC8487b)) {
                this.f3469c = interfaceC8487b;
                this.f9317a.d(this);
            }
        }
    }

    public y(C<? extends T> c11) {
        this.f3468c = c11;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        this.f3468c.c(new a(jVar));
    }
}
