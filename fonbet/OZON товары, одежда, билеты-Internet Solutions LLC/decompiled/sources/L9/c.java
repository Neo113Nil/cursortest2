package L9;

import io.reactivex.w;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class c<T> extends d<T> {

    /* renamed from: b, reason: collision with root package name */
    static final a[] f16629b = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f16630a = new AtomicReference<>(f16629b);

    static final class a<T> extends AtomicBoolean implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f16631a;

        /* renamed from: b, reason: collision with root package name */
        final c<T> f16632b;

        a(w<? super T> wVar, c<T> cVar) {
            this.f16631a = wVar;
            this.f16632b = cVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f16632b.d(this);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get();
        }
    }

    c() {
    }

    public static <T> c<T> c() {
        return new c<>();
    }

    @Override // qc.g
    public final void accept(T t2) {
        if (t2 == null) {
            throw new NullPointerException("value == null");
        }
        for (a<T> aVar : this.f16630a.get()) {
            if (!aVar.get()) {
                aVar.f16631a.onNext(t2);
            }
        }
    }

    final void d(a<T> aVar) {
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f16630a;
            a<T>[] aVarArr = atomicReference.get();
            a<T>[] aVarArr2 = f16629b;
            if (aVarArr == aVarArr2) {
                return;
            }
            int length = aVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (aVarArr[i11] == aVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr2 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
                System.arraycopy(aVarArr, i11 + 1, aVarArr2, i11, (length - i11) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super T> wVar) {
        a<T> aVar = new a<>(wVar, this);
        wVar.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f16630a;
            a<T>[] aVarArr = atomicReference.get();
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
        }
        if (aVar.get()) {
            d(aVar);
        }
    }
}
