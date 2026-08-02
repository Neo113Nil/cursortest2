package Bc;

/* loaded from: classes.dex */
public final class q<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f3435a;

    public q(T t2) {
        this.f3435a = t2;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        a11.onSubscribe(rc.e.INSTANCE);
        a11.onSuccess(this.f3435a);
    }
}
