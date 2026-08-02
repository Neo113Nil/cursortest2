package Bc;

import Bl0.C2645f;
import java.util.concurrent.Callable;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class l<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f3423a;

    public l(Callable<? extends Throwable> callable) {
        this.f3423a = callable;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        try {
            Throwable call = this.f3423a.call();
            C9656b.c(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = call;
        } catch (Throwable th2) {
            th = th2;
            C2645f.c(th);
        }
        a11.onSubscribe(rc.e.INSTANCE);
        a11.onError(th);
    }
}
