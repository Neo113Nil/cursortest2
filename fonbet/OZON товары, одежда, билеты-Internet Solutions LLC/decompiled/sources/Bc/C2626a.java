package Bc;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: Bc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2626a<T> extends io.reactivex.y<T> implements io.reactivex.A<T> {

    /* renamed from: f, reason: collision with root package name */
    static final C0082a[] f3372f = new C0082a[0];

    /* renamed from: g, reason: collision with root package name */
    static final C0082a[] f3373g = new C0082a[0];

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.y f3374a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicInteger f3375b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<C0082a<T>[]> f3376c = new AtomicReference<>(f3372f);

    /* renamed from: d, reason: collision with root package name */
    T f3377d;

    /* renamed from: e, reason: collision with root package name */
    Throwable f3378e;

    /* renamed from: Bc.a$a, reason: collision with other inner class name */
    static final class C0082a<T> extends AtomicBoolean implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f3379a;

        /* renamed from: b, reason: collision with root package name */
        final C2626a<T> f3380b;

        C0082a(io.reactivex.A<? super T> a11, C2626a<T> c2626a) {
            this.f3379a = a11;
            this.f3380b = c2626a;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f3380b.l(this);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get();
        }
    }

    public C2626a(io.reactivex.y yVar) {
        this.f3374a = yVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        C0082a<T> c0082a = new C0082a<>(a11, this);
        a11.onSubscribe(c0082a);
        while (true) {
            AtomicReference<C0082a<T>[]> atomicReference = this.f3376c;
            C0082a<T>[] c0082aArr = atomicReference.get();
            if (c0082aArr == f3373g) {
                Throwable th2 = this.f3378e;
                if (th2 != null) {
                    a11.onError(th2);
                    return;
                } else {
                    a11.onSuccess(this.f3377d);
                    return;
                }
            }
            int length = c0082aArr.length;
            C0082a<T>[] c0082aArr2 = new C0082a[length + 1];
            System.arraycopy(c0082aArr, 0, c0082aArr2, 0, length);
            c0082aArr2[length] = c0082a;
            while (!atomicReference.compareAndSet(c0082aArr, c0082aArr2)) {
                if (atomicReference.get() != c0082aArr) {
                    break;
                }
            }
            if (c0082a.get()) {
                l(c0082a);
            }
            if (this.f3375b.getAndIncrement() == 0) {
                this.f3374a.c(this);
                return;
            }
            return;
        }
    }

    final void l(C0082a<T> c0082a) {
        C0082a<T>[] c0082aArr;
        while (true) {
            AtomicReference<C0082a<T>[]> atomicReference = this.f3376c;
            C0082a<T>[] c0082aArr2 = atomicReference.get();
            int length = c0082aArr2.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (c0082aArr2[i11] == c0082a) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                c0082aArr = f3372f;
            } else {
                C0082a<T>[] c0082aArr3 = new C0082a[length - 1];
                System.arraycopy(c0082aArr2, 0, c0082aArr3, 0, i11);
                System.arraycopy(c0082aArr2, i11 + 1, c0082aArr3, i11, (length - i11) - 1);
                c0082aArr = c0082aArr3;
            }
            while (!atomicReference.compareAndSet(c0082aArr2, c0082aArr)) {
                if (atomicReference.get() != c0082aArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.A
    public final void onError(Throwable th2) {
        this.f3378e = th2;
        for (C0082a<T> c0082a : this.f3376c.getAndSet(f3373g)) {
            if (!c0082a.get()) {
                c0082a.f3379a.onError(th2);
            }
        }
    }

    @Override // io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
    }

    @Override // io.reactivex.A
    public final void onSuccess(T t2) {
        this.f3377d = t2;
        for (C0082a<T> c0082a : this.f3376c.getAndSet(f3373g)) {
            if (!c0082a.get()) {
                c0082a.f3379a.onSuccess(t2);
            }
        }
    }
}
