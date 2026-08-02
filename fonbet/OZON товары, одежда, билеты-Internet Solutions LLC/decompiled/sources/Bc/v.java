package Bc;

import Bl0.C2645f;
import io.reactivex.C;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import oc.C8691a;
import sc.C9656b;

/* loaded from: classes.dex */
public final class v<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3451a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super Throwable, ? extends C<? extends T>> f3452b;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3453a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Throwable, ? extends C<? extends T>> f3454b;

        a(io.reactivex.A<? super T> a11, qc.o<? super Throwable, ? extends C<? extends T>> oVar) {
            this.f3453a = a11;
            this.f3454b = oVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            io.reactivex.A<? super T> a11 = this.f3453a;
            try {
                C<? extends T> apply = this.f3454b.apply(th2);
                C9656b.c(apply, "The nextFunction returned a null SingleSource.");
                apply.c(new uc.t(this, a11));
            } catch (Throwable th3) {
                C2645f.c(th3);
                a11.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f3453a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3453a.onSuccess(t2);
        }
    }

    public v(io.reactivex.y yVar, qc.o oVar) {
        this.f3451a = yVar;
        this.f3452b = oVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3451a.c(new a(a11, this.f3452b));
    }
}
