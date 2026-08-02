package Lc;

import Fc.g;
import Gc.a;
import Gc.i;
import Gc.k;
import Kc.C3493a;
import hg.InterfaceC6950c;
import io.reactivex.j;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sc.C9656b;

/* loaded from: classes.dex */
public final class b<T> extends c<T> {

    /* renamed from: i, reason: collision with root package name */
    static final Object[] f16679i = new Object[0];

    /* renamed from: j, reason: collision with root package name */
    static final a[] f16680j = new a[0];

    /* renamed from: k, reason: collision with root package name */
    static final a[] f16681k = new a[0];

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<a<T>[]> f16682c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f16683d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f16684e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference<Object> f16685f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference<Throwable> f16686g;

    /* renamed from: h, reason: collision with root package name */
    long f16687h;

    static final class a<T> extends AtomicLong implements InterfaceC6950c, a.InterfaceC0204a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final j f16688a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f16689b;

        /* renamed from: c, reason: collision with root package name */
        boolean f16690c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16691d;

        /* renamed from: e, reason: collision with root package name */
        Gc.a<Object> f16692e;

        /* renamed from: f, reason: collision with root package name */
        boolean f16693f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f16694g;

        /* renamed from: h, reason: collision with root package name */
        long f16695h;

        a(j jVar, b bVar) {
            this.f16688a = jVar;
            this.f16689b = bVar;
        }

        final void a(long j11, Object obj) {
            if (this.f16694g) {
                return;
            }
            if (!this.f16693f) {
                synchronized (this) {
                    try {
                        if (this.f16694g) {
                            return;
                        }
                        if (this.f16695h == j11) {
                            return;
                        }
                        if (this.f16691d) {
                            Gc.a<Object> aVar = this.f16692e;
                            if (aVar == null) {
                                aVar = new Gc.a<>();
                                this.f16692e = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.f16690c = true;
                        this.f16693f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f16694g) {
                return;
            }
            this.f16694g = true;
            this.f16689b.q(this);
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (g.f(j11)) {
                Gc.d.a(this, j11);
            }
        }

        @Override // qc.q
        public final boolean test(Object obj) {
            if (this.f16694g) {
                return true;
            }
            if (k.h(obj)) {
                this.f16688a.onComplete();
                return true;
            }
            if (k.i(obj)) {
                this.f16688a.onError(k.g(obj));
                return true;
            }
            long j11 = get();
            if (j11 == 0) {
                cancel();
                this.f16688a.onError(new oc.b("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f16688a.onNext(obj);
            if (j11 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f16683d = reentrantReadWriteLock.readLock();
        this.f16684e = reentrantReadWriteLock.writeLock();
        this.f16682c = new AtomicReference<>(f16680j);
        this.f16686g = new AtomicReference<>();
    }

    public static <T> b<T> m() {
        return new b<>();
    }

    public static <T> b<T> n(T t2) {
        C9656b.c(t2, "defaultValue is null");
        b<T> bVar = new b<>();
        bVar.f16685f.lazySet(t2);
        return bVar;
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (this.f16686g.get() != null) {
            interfaceC6950c.cancel();
        } else {
            interfaceC6950c.n(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.h
    protected final void j(j jVar) {
        Gc.a<Object> aVar;
        a<T> aVar2 = new a<>(jVar, this);
        jVar.d(aVar2);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f16682c;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f16681k) {
                Throwable th2 = this.f16686g.get();
                if (th2 == i.f9907a) {
                    jVar.onComplete();
                    return;
                } else {
                    jVar.onError(th2);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar2;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar2.f16694g) {
                q(aVar2);
                return;
            }
            if (aVar2.f16694g) {
                return;
            }
            synchronized (aVar2) {
                try {
                    if (aVar2.f16694g) {
                        return;
                    }
                    if (aVar2.f16690c) {
                        return;
                    }
                    b<T> bVar = aVar2.f16689b;
                    Lock lock = bVar.f16683d;
                    lock.lock();
                    aVar2.f16695h = bVar.f16687h;
                    Object obj = bVar.f16685f.get();
                    lock.unlock();
                    aVar2.f16691d = obj != null;
                    aVar2.f16690c = true;
                    if (obj == null || aVar2.test(obj)) {
                        return;
                    }
                    while (!aVar2.f16694g) {
                        synchronized (aVar2) {
                            try {
                                aVar = aVar2.f16692e;
                                if (aVar == null) {
                                    aVar2.f16691d = false;
                                    return;
                                }
                                aVar2.f16692e = null;
                            } finally {
                            }
                        }
                        aVar.d(aVar2);
                    }
                    return;
                } finally {
                }
            }
        }
    }

    public final T o() {
        T t2 = (T) this.f16685f.get();
        if (k.h(t2) || k.i(t2)) {
            return null;
        }
        return t2;
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        if (Lc.a.e(this.f16686g, i.f9907a)) {
            k kVar = k.COMPLETE;
            AtomicReference<a<T>[]> atomicReference = this.f16682c;
            a<T>[] aVarArr = atomicReference.get();
            a<T>[] aVarArr2 = f16681k;
            if (aVarArr != aVarArr2 && (aVarArr = atomicReference.getAndSet(aVarArr2)) != aVarArr2) {
                r(kVar);
            }
            for (a<T> aVar : aVarArr) {
                aVar.a(this.f16687h, kVar);
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        C9656b.c(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!Lc.a.e(this.f16686g, th2)) {
            C3493a.f(th2);
            return;
        }
        Object f7 = k.f(th2);
        Serializable serializable = (Serializable) f7;
        AtomicReference<a<T>[]> atomicReference = this.f16682c;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f16681k;
        if (aVarArr != aVarArr2 && (aVarArr = atomicReference.getAndSet(aVarArr2)) != aVarArr2) {
            r(serializable);
        }
        for (a<T> aVar : aVarArr) {
            aVar.a(this.f16687h, f7);
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        C9656b.c(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f16686g.get() != null) {
            return;
        }
        r(t2);
        for (a<T> aVar : this.f16682c.get()) {
            aVar.a(this.f16687h, t2);
        }
    }

    public final boolean p(T t2) {
        if (t2 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        a<T>[] aVarArr = this.f16682c.get();
        for (a<T> aVar : aVarArr) {
            if (aVar.get() == 0) {
                return false;
            }
        }
        r(t2);
        for (a<T> aVar2 : aVarArr) {
            aVar2.a(this.f16687h, t2);
        }
        return true;
    }

    final void q(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f16682c;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
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
            if (length == 1) {
                aVarArr = f16680j;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i11);
                System.arraycopy(aVarArr2, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    final void r(Object obj) {
        Lock lock = this.f16684e;
        lock.lock();
        this.f16687h++;
        this.f16685f.lazySet(obj);
        lock.unlock();
    }
}
