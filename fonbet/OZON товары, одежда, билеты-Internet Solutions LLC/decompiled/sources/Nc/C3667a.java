package Nc;

import Gc.a;
import Gc.i;
import Gc.k;
import Kc.C3493a;
import io.reactivex.w;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: Nc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3667a<T> extends e<T> {

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f18936g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    static final C0372a[] f18937h = new C0372a[0];

    /* renamed from: i, reason: collision with root package name */
    static final C0372a[] f18938i = new C0372a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Object> f18939a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<C0372a<T>[]> f18940b;

    /* renamed from: c, reason: collision with root package name */
    final Lock f18941c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f18942d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReference<Throwable> f18943e;

    /* renamed from: f, reason: collision with root package name */
    long f18944f;

    /* renamed from: Nc.a$a, reason: collision with other inner class name */
    static final class C0372a<T> implements InterfaceC8487b, a.InterfaceC0204a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f18945a;

        /* renamed from: b, reason: collision with root package name */
        final C3667a<T> f18946b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18947c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18948d;

        /* renamed from: e, reason: collision with root package name */
        Gc.a<Object> f18949e;

        /* renamed from: f, reason: collision with root package name */
        boolean f18950f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f18951g;

        /* renamed from: h, reason: collision with root package name */
        long f18952h;

        C0372a(w<? super T> wVar, C3667a<T> c3667a) {
            this.f18945a = wVar;
            this.f18946b = c3667a;
        }

        final void a(long j11, Object obj) {
            if (this.f18951g) {
                return;
            }
            if (!this.f18950f) {
                synchronized (this) {
                    try {
                        if (this.f18951g) {
                            return;
                        }
                        if (this.f18952h == j11) {
                            return;
                        }
                        if (this.f18948d) {
                            Gc.a<Object> aVar = this.f18949e;
                            if (aVar == null) {
                                aVar = new Gc.a<>();
                                this.f18949e = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.f18947c = true;
                        this.f18950f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f18951g) {
                return;
            }
            this.f18951g = true;
            this.f18946b.h(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f18951g;
        }

        @Override // qc.q
        public final boolean test(Object obj) {
            return this.f18951g || k.a(this.f18945a, obj);
        }
    }

    C3667a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f18941c = reentrantReadWriteLock.readLock();
        this.f18942d = reentrantReadWriteLock.writeLock();
        this.f18940b = new AtomicReference<>(f18937h);
        this.f18939a = new AtomicReference<>();
        this.f18943e = new AtomicReference<>();
    }

    public static <T> C3667a<T> d() {
        return new C3667a<>();
    }

    public static <T> C3667a<T> e(T t2) {
        C3667a<T> c3667a = new C3667a<>();
        AtomicReference<Object> atomicReference = c3667a.f18939a;
        C9656b.c(t2, "defaultValue is null");
        atomicReference.lazySet(t2);
        return c3667a;
    }

    public final T f() {
        T t2 = (T) this.f18939a.get();
        if (k.h(t2) || k.i(t2)) {
            return null;
        }
        return t2;
    }

    public final boolean g() {
        Object obj = this.f18939a.get();
        return (obj == null || k.h(obj) || k.i(obj)) ? false : true;
    }

    final void h(C0372a<T> c0372a) {
        C0372a<T>[] c0372aArr;
        while (true) {
            AtomicReference<C0372a<T>[]> atomicReference = this.f18940b;
            C0372a<T>[] c0372aArr2 = atomicReference.get();
            int length = c0372aArr2.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (c0372aArr2[i11] == c0372a) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                c0372aArr = f18937h;
            } else {
                C0372a<T>[] c0372aArr3 = new C0372a[length - 1];
                System.arraycopy(c0372aArr2, 0, c0372aArr3, 0, i11);
                System.arraycopy(c0372aArr2, i11 + 1, c0372aArr3, i11, (length - i11) - 1);
                c0372aArr = c0372aArr3;
            }
            while (!atomicReference.compareAndSet(c0372aArr2, c0372aArr)) {
                if (atomicReference.get() != c0372aArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (Lc.a.e(this.f18943e, i.f9907a)) {
            k kVar = k.COMPLETE;
            AtomicReference<C0372a<T>[]> atomicReference = this.f18940b;
            C0372a<T>[] c0372aArr = f18938i;
            C0372a<T>[] andSet = atomicReference.getAndSet(c0372aArr);
            if (andSet != c0372aArr) {
                Lock lock = this.f18942d;
                lock.lock();
                this.f18944f++;
                this.f18939a.lazySet(kVar);
                lock.unlock();
            }
            for (C0372a<T> c0372a : andSet) {
                c0372a.a(this.f18944f, kVar);
            }
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        C9656b.c(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!Lc.a.e(this.f18943e, th2)) {
            C3493a.f(th2);
            return;
        }
        Object f7 = k.f(th2);
        Serializable serializable = (Serializable) f7;
        AtomicReference<C0372a<T>[]> atomicReference = this.f18940b;
        C0372a<T>[] c0372aArr = f18938i;
        C0372a<T>[] andSet = atomicReference.getAndSet(c0372aArr);
        if (andSet != c0372aArr) {
            Lock lock = this.f18942d;
            lock.lock();
            this.f18944f++;
            this.f18939a.lazySet(serializable);
            lock.unlock();
        }
        for (C0372a<T> c0372a : andSet) {
            c0372a.a(this.f18944f, f7);
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        C9656b.c(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f18943e.get() != null) {
            return;
        }
        Lock lock = this.f18942d;
        lock.lock();
        this.f18944f++;
        this.f18939a.lazySet(t2);
        lock.unlock();
        for (C0372a<T> c0372a : this.f18940b.get()) {
            c0372a.a(this.f18944f, t2);
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (this.f18943e.get() != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super T> wVar) {
        Gc.a<Object> aVar;
        C0372a<T> c0372a = new C0372a<>(wVar, this);
        wVar.onSubscribe(c0372a);
        while (true) {
            AtomicReference<C0372a<T>[]> atomicReference = this.f18940b;
            C0372a<T>[] c0372aArr = atomicReference.get();
            if (c0372aArr == f18938i) {
                Throwable th2 = this.f18943e.get();
                if (th2 == i.f9907a) {
                    wVar.onComplete();
                    return;
                } else {
                    wVar.onError(th2);
                    return;
                }
            }
            int length = c0372aArr.length;
            C0372a<T>[] c0372aArr2 = new C0372a[length + 1];
            System.arraycopy(c0372aArr, 0, c0372aArr2, 0, length);
            c0372aArr2[length] = c0372a;
            while (!atomicReference.compareAndSet(c0372aArr, c0372aArr2)) {
                if (atomicReference.get() != c0372aArr) {
                    break;
                }
            }
            if (c0372a.f18951g) {
                h(c0372a);
                return;
            }
            if (c0372a.f18951g) {
                return;
            }
            synchronized (c0372a) {
                try {
                    if (c0372a.f18951g) {
                        return;
                    }
                    if (c0372a.f18947c) {
                        return;
                    }
                    C3667a<T> c3667a = c0372a.f18946b;
                    Lock lock = c3667a.f18941c;
                    lock.lock();
                    c0372a.f18952h = c3667a.f18944f;
                    Object obj = c3667a.f18939a.get();
                    lock.unlock();
                    c0372a.f18948d = obj != null;
                    c0372a.f18947c = true;
                    if (obj == null || c0372a.test(obj)) {
                        return;
                    }
                    while (!c0372a.f18951g) {
                        synchronized (c0372a) {
                            try {
                                aVar = c0372a.f18949e;
                                if (aVar == null) {
                                    c0372a.f18948d = false;
                                    return;
                                }
                                c0372a.f18949e = null;
                            } finally {
                            }
                        }
                        aVar.d(c0372a);
                    }
                    return;
                } finally {
                }
            }
        }
    }
}
