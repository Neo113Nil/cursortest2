package Ac;

import Dc.m;
import Fc.g;
import Jc.AbstractC3389a;
import Kc.C3493a;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import io.reactivex.j;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import tc.InterfaceC9799a;

/* loaded from: classes9.dex */
public final class d<T> extends AbstractC3389a<T> {

    /* renamed from: a, reason: collision with root package name */
    final C2378a f732a;

    /* renamed from: b, reason: collision with root package name */
    final x f733b;

    /* renamed from: c, reason: collision with root package name */
    final int f734c;

    static abstract class a<T> extends AtomicInteger implements j<T>, InterfaceC6950c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f735a;

        /* renamed from: b, reason: collision with root package name */
        final int f736b;

        /* renamed from: c, reason: collision with root package name */
        final Cc.b<T> f737c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f738d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC6950c f739e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f740f;

        /* renamed from: g, reason: collision with root package name */
        Throwable f741g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicLong f742h = new AtomicLong();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f743i;

        /* renamed from: j, reason: collision with root package name */
        int f744j;

        a(int i11, Cc.b<T> bVar, x.c cVar) {
            this.f735a = i11;
            this.f737c = bVar;
            this.f736b = i11 - (i11 >> 2);
            this.f738d = cVar;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f743i) {
                return;
            }
            this.f743i = true;
            this.f739e.cancel();
            this.f738d.dispose();
            if (getAndIncrement() == 0) {
                this.f737c.clear();
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (g.f(j11)) {
                Gc.d.a(this.f742h, j11);
                if (getAndIncrement() == 0) {
                    this.f738d.a(this);
                }
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f740f) {
                return;
            }
            this.f740f = true;
            if (getAndIncrement() == 0) {
                this.f738d.a(this);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f740f) {
                C3493a.f(th2);
                return;
            }
            this.f741g = th2;
            this.f740f = true;
            if (getAndIncrement() == 0) {
                this.f738d.a(this);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f740f) {
                return;
            }
            if (!this.f737c.offer(t2)) {
                this.f739e.cancel();
                onError(new oc.b("Queue is full?!"));
            } else if (getAndIncrement() == 0) {
                this.f738d.a(this);
            }
        }
    }

    final class b implements m.a {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6949b<? super T>[] f745a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6949b<T>[] f746b;

        b(InterfaceC6949b<? super T>[] interfaceC6949bArr, InterfaceC6949b<T>[] interfaceC6949bArr2) {
            this.f745a = interfaceC6949bArr;
            this.f746b = interfaceC6949bArr2;
        }

        @Override // Dc.m.a
        public final void a(int i11, x.c cVar) {
            d.this.c(i11, this.f745a, this.f746b, cVar);
        }
    }

    static final class c<T> extends a<T> {

        /* renamed from: k, reason: collision with root package name */
        final InterfaceC9799a<? super T> f748k;

        c(InterfaceC9799a<? super T> interfaceC9799a, int i11, Cc.b<T> bVar, x.c cVar) {
            super(i11, bVar, cVar);
            this.f748k = interfaceC9799a;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (g.g(this.f739e, interfaceC6950c)) {
                this.f739e = interfaceC6950c;
                this.f748k.d(this);
                interfaceC6950c.n(this.f735a);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2;
            int i11 = this.f744j;
            Cc.b<T> bVar = this.f737c;
            InterfaceC9799a<? super T> interfaceC9799a = this.f748k;
            int i12 = this.f736b;
            int i13 = 1;
            while (true) {
                long j11 = this.f742h.get();
                long j12 = 0;
                while (j12 != j11) {
                    if (this.f743i) {
                        bVar.clear();
                        return;
                    }
                    boolean z11 = this.f740f;
                    if (z11 && (th2 = this.f741g) != null) {
                        bVar.clear();
                        interfaceC9799a.onError(th2);
                        this.f738d.dispose();
                        return;
                    }
                    T poll = bVar.poll();
                    boolean z12 = poll == null;
                    if (z11 && z12) {
                        interfaceC9799a.onComplete();
                        this.f738d.dispose();
                        return;
                    } else {
                        if (z12) {
                            break;
                        }
                        if (interfaceC9799a.g(poll)) {
                            j12++;
                        }
                        i11++;
                        if (i11 == i12) {
                            this.f739e.n(i11);
                            i11 = 0;
                        }
                    }
                }
                if (j12 == j11) {
                    if (this.f743i) {
                        bVar.clear();
                        return;
                    }
                    if (this.f740f) {
                        Throwable th3 = this.f741g;
                        if (th3 != null) {
                            bVar.clear();
                            interfaceC9799a.onError(th3);
                            this.f738d.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            interfaceC9799a.onComplete();
                            this.f738d.dispose();
                            return;
                        }
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.f742h.addAndGet(-j12);
                }
                int i14 = get();
                if (i14 == i13) {
                    this.f744j = i11;
                    i13 = addAndGet(-i13);
                    if (i13 == 0) {
                        return;
                    }
                } else {
                    i13 = i14;
                }
            }
        }
    }

    /* renamed from: Ac.d$d, reason: collision with other inner class name */
    static final class C0024d<T> extends a<T> {

        /* renamed from: k, reason: collision with root package name */
        final InterfaceC6949b<? super T> f749k;

        C0024d(InterfaceC6949b<? super T> interfaceC6949b, int i11, Cc.b<T> bVar, x.c cVar) {
            super(i11, bVar, cVar);
            this.f749k = interfaceC6949b;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (g.g(this.f739e, interfaceC6950c)) {
                this.f739e = interfaceC6950c;
                this.f749k.d(this);
                interfaceC6950c.n(this.f735a);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2;
            int i11 = this.f744j;
            Cc.b<T> bVar = this.f737c;
            InterfaceC6949b<? super T> interfaceC6949b = this.f749k;
            int i12 = this.f736b;
            int i13 = 1;
            while (true) {
                long j11 = this.f742h.get();
                long j12 = 0;
                while (j12 != j11) {
                    if (this.f743i) {
                        bVar.clear();
                        return;
                    }
                    boolean z11 = this.f740f;
                    if (z11 && (th2 = this.f741g) != null) {
                        bVar.clear();
                        interfaceC6949b.onError(th2);
                        this.f738d.dispose();
                        return;
                    }
                    T poll = bVar.poll();
                    boolean z12 = poll == null;
                    if (z11 && z12) {
                        interfaceC6949b.onComplete();
                        this.f738d.dispose();
                        return;
                    } else {
                        if (z12) {
                            break;
                        }
                        interfaceC6949b.onNext(poll);
                        j12++;
                        i11++;
                        if (i11 == i12) {
                            this.f739e.n(i11);
                            i11 = 0;
                        }
                    }
                }
                if (j12 == j11) {
                    if (this.f743i) {
                        bVar.clear();
                        return;
                    }
                    if (this.f740f) {
                        Throwable th3 = this.f741g;
                        if (th3 != null) {
                            bVar.clear();
                            interfaceC6949b.onError(th3);
                            this.f738d.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            interfaceC6949b.onComplete();
                            this.f738d.dispose();
                            return;
                        }
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.f742h.addAndGet(-j12);
                }
                int i14 = get();
                if (i14 == i13) {
                    this.f744j = i11;
                    i13 = addAndGet(-i13);
                    if (i13 == 0) {
                        return;
                    }
                } else {
                    i13 = i14;
                }
            }
        }
    }

    public d(C2378a c2378a, x xVar, int i11) {
        this.f732a = c2378a;
        this.f733b = xVar;
        this.f734c = i11;
    }

    @Override // Jc.AbstractC3389a
    public final int a() {
        return this.f732a.f690b;
    }

    final void c(int i11, InterfaceC6949b<? super T>[] interfaceC6949bArr, InterfaceC6949b<T>[] interfaceC6949bArr2, x.c cVar) {
        InterfaceC6949b<? super T> interfaceC6949b = interfaceC6949bArr[i11];
        int i12 = this.f734c;
        Cc.b bVar = new Cc.b(i12);
        if (interfaceC6949b instanceof InterfaceC9799a) {
            interfaceC6949bArr2[i11] = new c((InterfaceC9799a) interfaceC6949b, i12, bVar, cVar);
        } else {
            interfaceC6949bArr2[i11] = new C0024d(interfaceC6949b, i12, bVar, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(InterfaceC6949b<? super T>[] interfaceC6949bArr) {
        if (b(interfaceC6949bArr)) {
            int length = interfaceC6949bArr.length;
            InterfaceC6949b<T>[] interfaceC6949bArr2 = new InterfaceC6949b[length];
            x xVar = this.f733b;
            if (xVar instanceof m) {
                ((m) xVar).a(length, new b(interfaceC6949bArr, interfaceC6949bArr2));
            } else {
                for (int i11 = 0; i11 < length; i11++) {
                    c(i11, interfaceC6949bArr, interfaceC6949bArr2, xVar.b());
                }
            }
            this.f732a.c(interfaceC6949bArr2);
        }
    }
}
