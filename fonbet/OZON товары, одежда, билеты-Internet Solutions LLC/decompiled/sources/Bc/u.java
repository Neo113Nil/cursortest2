package Bc;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes.dex */
public final class u<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3447a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super Throwable, ? extends T> f3448b;

    final class a implements io.reactivex.A<T> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.A<? super T> f3449a;

        a(io.reactivex.A<? super T> a11) {
            this.f3449a = a11;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            T apply;
            qc.o<? super Throwable, ? extends T> oVar = u.this.f3448b;
            io.reactivex.A<? super T> a11 = this.f3449a;
            if (oVar != null) {
                try {
                    apply = oVar.apply(th2);
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    a11.onError(new C8691a(th2, th3));
                    return;
                }
            } else {
                apply = null;
            }
            if (apply != null) {
                a11.onSuccess(apply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            a11.onError(nullPointerException);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f3449a.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3449a.onSuccess(t2);
        }
    }

    public u(io.reactivex.y yVar, qc.o oVar) {
        this.f3447a = yVar;
        this.f3448b = oVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3447a.c(new a(a11));
    }
}
