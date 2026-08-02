package Nc;

import Kc.C3493a;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: Nc.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3669c<T> extends e<T> {

    /* renamed from: c, reason: collision with root package name */
    static final a[] f18959c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    static final a[] f18960d = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18961a = new AtomicReference<>(f18960d);

    /* renamed from: b, reason: collision with root package name */
    Throwable f18962b;

    /* renamed from: Nc.c$a */
    static final class a<T> extends AtomicBoolean implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f18963a;

        /* renamed from: b, reason: collision with root package name */
        final C3669c<T> f18964b;

        a(w<? super T> wVar, C3669c<T> c3669c) {
            this.f18963a = wVar;
            this.f18964b = c3669c;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f18964b.e(this);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get();
        }
    }

    C3669c() {
    }

    public static <T> C3669c<T> d() {
        return new C3669c<>();
    }

    final void e(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f18961a;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == f18959c || aVarArr2 == (aVarArr = f18960d)) {
                return;
            }
            int length = aVarArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (aVarArr2[i11] == aVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i11);
                System.arraycopy(aVarArr2, i11 + 1, aVarArr, i11, (length - i11) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.f18961a;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f18959c;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (!aVar.get()) {
                aVar.f18963a.onComplete();
            }
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        C9656b.c(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<a<T>[]> atomicReference = this.f18961a;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f18959c;
        if (aVarArr == aVarArr2) {
            C3493a.f(th2);
            return;
        }
        this.f18962b = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get()) {
                C3493a.f(th2);
            } else {
                aVar.f18963a.onError(th2);
            }
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        C9656b.c(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.f18961a.get()) {
            if (!aVar.get()) {
                aVar.f18963a.onNext(t2);
            }
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (this.f18961a.get() == f18959c) {
            interfaceC8487b.dispose();
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super T> wVar) {
        a<T> aVar = new a<>(wVar, this);
        wVar.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f18961a;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f18959c) {
                Throwable th2 = this.f18962b;
                if (th2 != null) {
                    wVar.onError(th2);
                    return;
                } else {
                    wVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.get()) {
                e(aVar);
                return;
            }
            return;
        }
    }
}
