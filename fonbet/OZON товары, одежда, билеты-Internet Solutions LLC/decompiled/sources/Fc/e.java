package Fc;

import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import tc.InterfaceC9805g;

/* loaded from: classes9.dex */
public final class e<T> extends AtomicInteger implements InterfaceC9805g<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f9319a;

    /* renamed from: b, reason: collision with root package name */
    final j f9320b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(j jVar, Object obj) {
        this.f9320b = jVar;
        this.f9319a = obj;
    }

    @Override // tc.InterfaceC9804f
    public final int a(int i11) {
        return 1;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        lazySet(2);
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
        lazySet(1);
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        if (g.f(j11) && compareAndSet(0, 1)) {
            j jVar = this.f9320b;
            jVar.onNext(this.f9319a);
            if (get() != 2) {
                jVar.onComplete();
            }
        }
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // tc.InterfaceC9808j
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f9319a;
    }
}
