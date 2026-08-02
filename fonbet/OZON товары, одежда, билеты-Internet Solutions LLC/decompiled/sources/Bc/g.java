package Bc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class g<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final i f3402a;

    /* renamed from: b, reason: collision with root package name */
    final DM.d f3403b;

    static final class a<T> extends AtomicReference<InterfaceC9019a> implements io.reactivex.A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3404a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f3405b;

        a(io.reactivex.A a11, DM.d dVar) {
            this.f3404a = a11;
            lazySet(dVar);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            InterfaceC9019a andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
                this.f3405b.dispose();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f3405b.isDisposed();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3404a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f3405b, interfaceC8487b)) {
                this.f3405b = interfaceC8487b;
                this.f3404a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f3404a.onSuccess(t2);
        }
    }

    public g(i iVar, DM.d dVar) {
        this.f3402a = iVar;
        this.f3403b = dVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f3402a.c(new a(a11, this.f3403b));
    }
}
