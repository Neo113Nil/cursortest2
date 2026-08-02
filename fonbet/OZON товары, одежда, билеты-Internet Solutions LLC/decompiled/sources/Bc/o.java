package Bc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.Callable;
import nc.C8488c;
import nc.InterfaceC8487b;
import sc.C9653a;
import sc.C9656b;

/* loaded from: classes.dex */
public final class o<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f3434a;

    public o(Callable<? extends T> callable) {
        this.f3434a = callable;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        InterfaceC8487b a12 = C8488c.a(C9653a.f98522b);
        a11.onSubscribe(a12);
        if (a12.isDisposed()) {
            return;
        }
        try {
            T call = this.f3434a.call();
            C9656b.c(call, "The callable returned a null value");
            if (a12.isDisposed()) {
                return;
            }
            a11.onSuccess(call);
        } catch (Throwable th2) {
            C2645f.c(th2);
            if (a12.isDisposed()) {
                C3493a.f(th2);
            } else {
                a11.onError(th2);
            }
        }
    }
}
