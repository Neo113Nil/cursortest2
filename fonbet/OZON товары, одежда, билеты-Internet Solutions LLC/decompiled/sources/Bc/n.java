package Bc;

import Bl0.C2645f;
import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class n<T> extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3430a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.f> f3431b;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T>, io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f3432a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.f> f3433b;

        a(io.reactivex.d dVar, qc.o<? super T, ? extends io.reactivex.f> oVar) {
            this.f3432a = dVar;
            this.f3433b = oVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            this.f3432a.onComplete();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3432a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this, interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            try {
                io.reactivex.f apply = this.f3433b.apply(t2);
                C9656b.c(apply, "The mapper returned a null CompletableSource");
                io.reactivex.f fVar = apply;
                if (isDisposed()) {
                    return;
                }
                fVar.a(this);
            } catch (Throwable th2) {
                C2645f.c(th2);
                onError(th2);
            }
        }
    }

    public n(io.reactivex.y yVar, qc.o oVar) {
        this.f3430a = yVar;
        this.f3431b = oVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        a aVar = new a(dVar, this.f3431b);
        dVar.onSubscribe(aVar);
        this.f3430a.c(aVar);
    }
}
