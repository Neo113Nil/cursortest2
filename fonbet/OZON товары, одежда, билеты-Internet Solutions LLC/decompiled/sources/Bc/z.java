package Bc;

import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class z<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3470a;

    static final class a<T> extends uc.k<T> implements io.reactivex.A<T> {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f3471c;

        @Override // uc.k, nc.InterfaceC8487b
        public final void dispose() {
            super.dispose();
            this.f3471c.dispose();
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f3471c, interfaceC8487b)) {
                this.f3471c = interfaceC8487b;
                this.f100573a.onSubscribe(this);
            }
        }
    }

    public z(io.reactivex.y yVar) {
        this.f3470a = yVar;
    }

    public static <T> io.reactivex.A<T> c(io.reactivex.w<? super T> wVar) {
        return new a(wVar);
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f3470a.c(new a(wVar));
    }
}
