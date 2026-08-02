package L9;

import L9.a;
import io.reactivex.w;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class b<T> extends d<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f16614f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    static final a[] f16615g = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<T> f16616a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f16617b;

    /* renamed from: c, reason: collision with root package name */
    final Lock f16618c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f16619d;

    /* renamed from: e, reason: collision with root package name */
    long f16620e;

    static final class a<T> implements InterfaceC8487b, a.InterfaceC0317a<T> {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f16621a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f16622b;

        /* renamed from: c, reason: collision with root package name */
        boolean f16623c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16624d;

        /* renamed from: e, reason: collision with root package name */
        L9.a<T> f16625e;

        /* renamed from: f, reason: collision with root package name */
        boolean f16626f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f16627g;

        /* renamed from: h, reason: collision with root package name */
        long f16628h;

        a(w<? super T> wVar, b<T> bVar) {
            this.f16621a = wVar;
            this.f16622b = bVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f16627g) {
                return;
            }
            this.f16627g = true;
            this.f16622b.e(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f16627g;
        }

        @Override // qc.q
        public final boolean test(T t2) {
            if (this.f16627g) {
                return false;
            }
            this.f16621a.onNext(t2);
            return false;
        }
    }

    b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f16618c = reentrantReadWriteLock.readLock();
        this.f16619d = reentrantReadWriteLock.writeLock();
        this.f16617b = new AtomicReference<>(f16615g);
        this.f16616a = new AtomicReference<>();
    }

    public static <T> b<T> c() {
        return new b<>();
    }

    public static b d(HashSet hashSet) {
        b bVar = new b();
        bVar.f16616a.lazySet(hashSet);
        return bVar;
    }

    @Override // qc.g
    public final void accept(T t2) {
        if (t2 == null) {
            throw new NullPointerException("value == null");
        }
        Lock lock = this.f16619d;
        lock.lock();
        this.f16620e++;
        this.f16616a.lazySet(t2);
        lock.unlock();
        for (a<T> aVar : this.f16617b.get()) {
            long j11 = this.f16620e;
            if (!aVar.f16627g) {
                if (!aVar.f16626f) {
                    synchronized (aVar) {
                        try {
                            if (!aVar.f16627g) {
                                if (aVar.f16628h != j11) {
                                    if (aVar.f16624d) {
                                        L9.a<T> aVar2 = aVar.f16625e;
                                        if (aVar2 == null) {
                                            aVar2 = new L9.a<>();
                                            aVar.f16625e = aVar2;
                                        }
                                        aVar2.a(t2);
                                    } else {
                                        aVar.f16623c = true;
                                        aVar.f16626f = true;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
                aVar.test(t2);
            }
        }
    }

    final void e(a<T> aVar) {
        AtomicReference<a<T>[]> atomicReference;
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            atomicReference = this.f16617b;
            aVarArr = atomicReference.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
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
            if (length == 1) {
                aVarArr2 = f16615g;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i11);
                System.arraycopy(aVarArr, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!Bl.b.e(atomicReference, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super T> wVar) {
        AtomicReference<a<T>[]> atomicReference;
        a<T>[] aVarArr;
        a[] aVarArr2;
        L9.a<T> aVar;
        a<T> aVar2 = new a<>(wVar, this);
        wVar.onSubscribe(aVar2);
        do {
            atomicReference = this.f16617b;
            aVarArr = atomicReference.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar2;
        } while (!Bl.b.e(atomicReference, aVarArr, aVarArr2));
        if (aVar2.f16627g) {
            e(aVar2);
            return;
        }
        if (aVar2.f16627g) {
            return;
        }
        synchronized (aVar2) {
            try {
                if (aVar2.f16627g) {
                    return;
                }
                if (aVar2.f16623c) {
                    return;
                }
                b<T> bVar = aVar2.f16622b;
                Lock lock = bVar.f16618c;
                lock.lock();
                aVar2.f16628h = bVar.f16620e;
                T t2 = bVar.f16616a.get();
                lock.unlock();
                aVar2.f16624d = t2 != null;
                aVar2.f16623c = true;
                if (t2 != null) {
                    aVar2.test(t2);
                    while (!aVar2.f16627g) {
                        synchronized (aVar2) {
                            try {
                                aVar = aVar2.f16625e;
                                if (aVar == null) {
                                    aVar2.f16624d = false;
                                    return;
                                }
                                aVar2.f16625e = null;
                            } finally {
                            }
                        }
                        aVar.b(aVar2);
                    }
                }
            } finally {
            }
        }
    }
}
