package Ac;

import Bl0.C2645f;
import Fc.g;
import Jc.AbstractC3389a;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import tc.InterfaceC9805g;
import tc.InterfaceC9808j;
import wc.C10498t;

/* renamed from: Ac.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2378a<T> extends AbstractC3389a<T> {

    /* renamed from: a, reason: collision with root package name */
    final C10498t f689a;

    /* renamed from: b, reason: collision with root package name */
    final int f690b;

    /* renamed from: c, reason: collision with root package name */
    final int f691c;

    /* renamed from: Ac.a$a, reason: collision with other inner class name */
    static final class C0021a<T> extends AtomicInteger implements j<T> {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6949b<? super T>[] f692a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicLongArray f693b;

        /* renamed from: c, reason: collision with root package name */
        final long[] f694c;

        /* renamed from: d, reason: collision with root package name */
        final int f695d;

        /* renamed from: e, reason: collision with root package name */
        final int f696e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6950c f697f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC9808j<T> f698g;

        /* renamed from: h, reason: collision with root package name */
        Throwable f699h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f700i;

        /* renamed from: j, reason: collision with root package name */
        int f701j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f702k;

        /* renamed from: l, reason: collision with root package name */
        final AtomicInteger f703l = new AtomicInteger();

        /* renamed from: m, reason: collision with root package name */
        int f704m;

        /* renamed from: n, reason: collision with root package name */
        int f705n;

        /* renamed from: Ac.a$a$a, reason: collision with other inner class name */
        final class C0022a implements InterfaceC6950c {

            /* renamed from: a, reason: collision with root package name */
            final int f706a;

            /* renamed from: b, reason: collision with root package name */
            final int f707b;

            C0022a(int i11, int i12) {
                this.f706a = i11;
                this.f707b = i12;
            }

            @Override // hg.InterfaceC6950c
            public final void cancel() {
                if (C0021a.this.f693b.compareAndSet(this.f706a + this.f707b, 0L, 1L)) {
                    C0021a c0021a = C0021a.this;
                    int i11 = this.f707b;
                    if (c0021a.f693b.decrementAndGet(i11 + i11) == 0) {
                        c0021a.f702k = true;
                        c0021a.f697f.cancel();
                        if (c0021a.getAndIncrement() == 0) {
                            c0021a.f698g.clear();
                        }
                    }
                }
            }

            @Override // hg.InterfaceC6950c
            public final void n(long j11) {
                long j12;
                if (g.f(j11)) {
                    C0021a c0021a = C0021a.this;
                    AtomicLongArray atomicLongArray = c0021a.f693b;
                    do {
                        j12 = atomicLongArray.get(this.f706a);
                        if (j12 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f706a, j12, Gc.d.b(j12, j11)));
                    if (c0021a.f703l.get() == this.f707b) {
                        c0021a.a();
                    }
                }
            }
        }

        C0021a(InterfaceC6949b<? super T>[] interfaceC6949bArr, int i11) {
            this.f692a = interfaceC6949bArr;
            this.f695d = i11;
            this.f696e = i11 - (i11 >> 2);
            int length = interfaceC6949bArr.length;
            int i12 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i12 + 1);
            this.f693b = atomicLongArray;
            atomicLongArray.lazySet(i12, length);
            this.f694c = new long[length];
        }

        final void a() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            boolean z11 = true;
            long j11 = 1;
            int i11 = 0;
            if (this.f705n == 1) {
                InterfaceC9808j<T> interfaceC9808j = this.f698g;
                InterfaceC6949b<? super T>[] interfaceC6949bArr = this.f692a;
                AtomicLongArray atomicLongArray = this.f693b;
                long[] jArr = this.f694c;
                int length = jArr.length;
                int i12 = this.f701j;
                int i13 = 1;
                while (true) {
                    int i14 = 0;
                    while (!this.f702k) {
                        if (interfaceC9808j.isEmpty()) {
                            int length2 = interfaceC6949bArr.length;
                            while (i11 < length2) {
                                interfaceC6949bArr[i11].onComplete();
                                i11++;
                            }
                            return;
                        }
                        long j12 = atomicLongArray.get(i12);
                        long j13 = jArr[i12];
                        if (j12 == j13 || atomicLongArray.get(length + i12) != 0) {
                            i14++;
                        } else {
                            try {
                                T poll = interfaceC9808j.poll();
                                if (poll == null) {
                                    int length3 = interfaceC6949bArr.length;
                                    while (i11 < length3) {
                                        interfaceC6949bArr[i11].onComplete();
                                        i11++;
                                    }
                                    return;
                                }
                                interfaceC6949bArr[i12].onNext(poll);
                                jArr[i12] = j13 + 1;
                                i14 = 0;
                            } catch (Throwable th3) {
                                C2645f.c(th3);
                                this.f697f.cancel();
                                int length4 = interfaceC6949bArr.length;
                                while (i11 < length4) {
                                    interfaceC6949bArr[i11].onError(th3);
                                    i11++;
                                }
                                return;
                            }
                        }
                        i12++;
                        if (i12 == length) {
                            i12 = 0;
                        }
                        if (i14 == length) {
                            int i15 = get();
                            if (i15 == i13) {
                                this.f701j = i12;
                                i13 = addAndGet(-i13);
                                if (i13 == 0) {
                                    return;
                                }
                            } else {
                                i13 = i15;
                            }
                        }
                    }
                    interfaceC9808j.clear();
                    return;
                }
            }
            InterfaceC9808j<T> interfaceC9808j2 = this.f698g;
            InterfaceC6949b<? super T>[] interfaceC6949bArr2 = this.f692a;
            AtomicLongArray atomicLongArray2 = this.f693b;
            long[] jArr2 = this.f694c;
            int length5 = jArr2.length;
            int i16 = this.f701j;
            int i17 = this.f704m;
            int i18 = 1;
            while (true) {
                boolean z12 = z11;
                int i19 = 0;
                while (!this.f702k) {
                    boolean z13 = this.f700i;
                    long j14 = j11;
                    if (z13 && (th2 = this.f699h) != null) {
                        interfaceC9808j2.clear();
                        int length6 = interfaceC6949bArr2.length;
                        while (i11 < length6) {
                            interfaceC6949bArr2[i11].onError(th2);
                            i11++;
                        }
                        return;
                    }
                    boolean isEmpty = interfaceC9808j2.isEmpty();
                    if (z13 && isEmpty) {
                        int length7 = interfaceC6949bArr2.length;
                        while (i11 < length7) {
                            interfaceC6949bArr2[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    if (!isEmpty) {
                        long j15 = atomicLongArray2.get(i16);
                        long j16 = jArr2[i16];
                        if (j15 == j16 || atomicLongArray2.get(length5 + i16) != 0) {
                            i19++;
                        } else {
                            try {
                                T poll2 = interfaceC9808j2.poll();
                                if (poll2 != null) {
                                    interfaceC6949bArr2[i16].onNext(poll2);
                                    jArr2[i16] = j16 + j14;
                                    i17++;
                                    if (i17 == this.f696e) {
                                        this.f697f.n(i17);
                                        i17 = 0;
                                    }
                                    i19 = 0;
                                }
                            } catch (Throwable th4) {
                                C2645f.c(th4);
                                this.f697f.cancel();
                                int length8 = interfaceC6949bArr2.length;
                                while (i11 < length8) {
                                    interfaceC6949bArr2[i11].onError(th4);
                                    i11++;
                                }
                                return;
                            }
                        }
                        i16++;
                        if (i16 == length5) {
                            i16 = 0;
                        }
                        if (i19 != length5) {
                            j11 = j14;
                        }
                    }
                    int i21 = get();
                    if (i21 == i18) {
                        this.f701j = i16;
                        this.f704m = i17;
                        i21 = addAndGet(-i18);
                        if (i21 == 0) {
                            return;
                        }
                    }
                    i18 = i21;
                    z11 = z12;
                    j11 = j14;
                }
                interfaceC9808j2.clear();
                return;
            }
        }

        final void b() {
            InterfaceC6949b<? super T>[] interfaceC6949bArr = this.f692a;
            int length = interfaceC6949bArr.length;
            int i11 = 0;
            while (i11 < length && !this.f702k) {
                int i12 = i11 + 1;
                this.f703l.lazySet(i12);
                interfaceC6949bArr[i11].d(new C0022a(i11, length));
                i11 = i12;
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (g.g(this.f697f, interfaceC6950c)) {
                this.f697f = interfaceC6950c;
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                    int a11 = interfaceC9805g.a(7);
                    if (a11 == 1) {
                        this.f705n = a11;
                        this.f698g = interfaceC9805g;
                        this.f700i = true;
                        b();
                        a();
                        return;
                    }
                    if (a11 == 2) {
                        this.f705n = a11;
                        this.f698g = interfaceC9805g;
                        b();
                        interfaceC6950c.n(this.f695d);
                        return;
                    }
                }
                this.f698g = new Cc.b(this.f695d);
                b();
                interfaceC6950c.n(this.f695d);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f700i = true;
            a();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f699h = th2;
            this.f700i = true;
            a();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f705n != 0 || this.f698g.offer(t2)) {
                a();
            } else {
                this.f697f.cancel();
                onError(new oc.b("Queue is full?"));
            }
        }
    }

    public C2378a(C10498t c10498t, int i11, int i12) {
        this.f689a = c10498t;
        this.f690b = i11;
        this.f691c = i12;
    }

    @Override // Jc.AbstractC3389a
    public final int a() {
        return this.f690b;
    }

    public final void c(InterfaceC6949b<? super T>[] interfaceC6949bArr) {
        if (b(interfaceC6949bArr)) {
            this.f689a.a(new C0021a(interfaceC6949bArr, this.f691c));
        }
    }
}
