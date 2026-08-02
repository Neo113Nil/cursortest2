package Bc;

import Bl0.C2645f;
import Kc.C3493a;
import T7.Z;
import io.reactivex.B;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import rc.C9243b;

/* loaded from: classes.dex */
public final class b<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final B<T> f3381a;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.z<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3382a;

        a(io.reactivex.A<? super T> a11) {
            this.f3382a = a11;
        }

        @Override // io.reactivex.z
        public final void a(qc.f fVar) {
            rc.d.e(this, new C9243b(fVar));
        }

        @Override // io.reactivex.z
        public final boolean b(Throwable th2) {
            InterfaceC8487b andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return false;
            }
            try {
                this.f3382a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.z
        public final void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            C3493a.f(th2);
        }

        @Override // io.reactivex.z
        public final void onSuccess(T t2) {
            InterfaceC8487b andSet;
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return;
            }
            io.reactivex.A<? super T> a11 = this.f3382a;
            try {
                if (t2 == null) {
                    a11.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    a11.onSuccess(t2);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return Z.a(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public b(B<T> b11) {
        this.f3381a = b11;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        a aVar = new a(a11);
        a11.onSubscribe(aVar);
        try {
            this.f3381a.b(aVar);
        } catch (Throwable th2) {
            C2645f.c(th2);
            aVar.onError(th2);
        }
    }
}
