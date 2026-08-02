package Bc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class i<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3410a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super InterfaceC8487b> f3411b;

    static final class a<T> implements io.reactivex.A<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3412a;

        /* renamed from: b, reason: collision with root package name */
        final qc.g<? super InterfaceC8487b> f3413b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3414c;

        a(io.reactivex.A<? super T> a11, qc.g<? super InterfaceC8487b> gVar) {
            this.f3412a = a11;
            this.f3413b = gVar;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            if (this.f3414c) {
                C3493a.f(th2);
            } else {
                this.f3412a.onError(th2);
            }
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            io.reactivex.A<? super T> a11 = this.f3412a;
            try {
                this.f3413b.accept(interfaceC8487b);
                a11.onSubscribe(interfaceC8487b);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f3414c = true;
                interfaceC8487b.dispose();
                a11.onSubscribe(rc.e.INSTANCE);
                a11.onError(th2);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            if (this.f3414c) {
                return;
            }
            this.f3412a.onSuccess(t2);
        }
    }

    public i(io.reactivex.y yVar, qc.g gVar) {
        this.f3410a = yVar;
        this.f3411b = gVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3410a.c(new a(a11, this.f3411b));
    }
}
