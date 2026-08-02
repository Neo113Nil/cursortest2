package Ac;

import Fc.g;
import Kc.C3493a;
import hg.InterfaceC6950c;
import io.reactivex.h;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tc.InterfaceC9807i;

/* loaded from: classes9.dex */
public final class b<T> extends h<T> {

    /* renamed from: c, reason: collision with root package name */
    final Ac.c f709c;

    /* renamed from: d, reason: collision with root package name */
    final int f710d;

    static final class a<T> extends AtomicReference<InterfaceC6950c> implements j<T> {

        /* renamed from: a, reason: collision with root package name */
        final c<T> f711a;

        /* renamed from: b, reason: collision with root package name */
        final int f712b;

        /* renamed from: c, reason: collision with root package name */
        final int f713c;

        /* renamed from: d, reason: collision with root package name */
        long f714d;

        /* renamed from: e, reason: collision with root package name */
        volatile Cc.b f715e;

        a(c<T> cVar, int i11) {
            this.f711a = cVar;
            this.f712b = i11;
            this.f713c = i11 - (i11 >> 2);
        }

        final InterfaceC9807i<T> a() {
            Cc.b bVar = this.f715e;
            if (bVar != null) {
                return bVar;
            }
            Cc.b bVar2 = new Cc.b(this.f712b);
            this.f715e = bVar2;
            return bVar2;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            long j11 = this.f712b;
            if (g.e(this, interfaceC6950c)) {
                interfaceC6950c.n(j11);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f711a.e();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f711a.f(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f711a.g(this, t2);
        }
    }

    /* renamed from: Ac.b$b, reason: collision with other inner class name */
    static final class C0023b<T> extends c<T> {
        @Override // Ac.b.c
        final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            h();
        }

        @Override // Ac.b.c
        public final void e() {
            this.f721f.decrementAndGet();
            d();
        }

        @Override // Ac.b.c
        public final void f(Throwable th2) {
            Gc.c cVar = this.f718c;
            if (cVar.compareAndSet(null, th2)) {
                a();
                d();
            } else if (th2 != cVar.get()) {
                C3493a.f(th2);
            }
        }

        @Override // Ac.b.c
        public final void g(a<T> aVar, T t2) {
            if (get() == 0 && compareAndSet(0, 1)) {
                AtomicLong atomicLong = this.f719d;
                long j11 = atomicLong.get();
                j jVar = this.f716a;
                if (j11 != 0) {
                    jVar.onNext(t2);
                    if (atomicLong.get() != Long.MAX_VALUE) {
                        atomicLong.decrementAndGet();
                    }
                    long j12 = aVar.f714d + 1;
                    if (j12 >= aVar.f713c) {
                        aVar.f714d = 0L;
                        aVar.get().n(j12);
                    } else {
                        aVar.f714d = j12;
                    }
                } else if (!((Cc.b) aVar.a()).offer(t2)) {
                    a();
                    oc.b bVar = new oc.b("Queue full?!");
                    if (this.f718c.compareAndSet(null, bVar)) {
                        jVar.onError(bVar);
                        return;
                    } else {
                        C3493a.f(bVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!((Cc.b) aVar.a()).offer(t2)) {
                a();
                f(new oc.b("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            h();
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x007c, code lost:
        
            r16 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x007e, code lost:
        
            if (r12 == false) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0080, code lost:
        
            if (r15 == false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0082, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0085, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0086, code lost:
        
            if (r15 == false) goto L95;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void h() {
            long j11;
            boolean z11;
            int i11;
            Object poll;
            a<T>[] aVarArr = this.f717b;
            int length = aVarArr.length;
            j jVar = this.f716a;
            int i12 = 1;
            while (true) {
                long j12 = this.f719d.get();
                long j13 = 0;
                while (true) {
                    if (j13 == j12) {
                        j11 = 0;
                        break;
                    }
                    if (!this.f720e) {
                        Throwable th2 = this.f718c.get();
                        if (th2 == null) {
                            boolean z12 = this.f721f.get() == 0;
                            int i13 = 0;
                            boolean z13 = true;
                            while (true) {
                                if (i13 >= aVarArr.length) {
                                    break;
                                }
                                a<T> aVar = aVarArr[i13];
                                j11 = 0;
                                Cc.b bVar = aVar.f715e;
                                if (bVar == null || (poll = bVar.poll()) == null) {
                                    i11 = i13;
                                } else {
                                    jVar.onNext(poll);
                                    long j14 = aVar.f714d + 1;
                                    i11 = i13;
                                    if (j14 == aVar.f713c) {
                                        aVar.f714d = 0L;
                                        aVar.get().n(j14);
                                    } else {
                                        aVar.f714d = j14;
                                    }
                                    j13++;
                                    if (j13 == j12) {
                                        break;
                                    } else {
                                        z13 = false;
                                    }
                                }
                                i13 = i11 + 1;
                            }
                        } else {
                            b();
                            jVar.onError(th2);
                            return;
                        }
                    } else {
                        b();
                        return;
                    }
                }
                if (j13 == j12) {
                    if (this.f720e) {
                        b();
                        return;
                    }
                    Throwable th3 = this.f718c.get();
                    if (th3 != null) {
                        b();
                        jVar.onError(th3);
                        return;
                    }
                    boolean z14 = this.f721f.get() == 0;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            Cc.b bVar2 = aVarArr[i14].f715e;
                            if (bVar2 != null && !bVar2.isEmpty()) {
                                z11 = false;
                                break;
                            }
                            i14++;
                        } else {
                            z11 = true;
                            break;
                        }
                    }
                    if (z14 && z11) {
                        jVar.onComplete();
                        return;
                    }
                }
                if (j13 != j11 && j12 != Long.MAX_VALUE) {
                    this.f719d.addAndGet(-j13);
                }
                int i15 = get();
                if (i15 == i12 && (i15 = addAndGet(-i12)) == 0) {
                    return;
                } else {
                    i12 = i15;
                }
            }
        }
    }

    static abstract class c<T> extends AtomicInteger implements InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final j f716a;

        /* renamed from: b, reason: collision with root package name */
        final a<T>[] f717b;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f720e;

        /* renamed from: c, reason: collision with root package name */
        final Gc.c f718c = new Gc.c();

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f719d = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f721f = new AtomicInteger();

        c(j jVar, int i11, int i12) {
            this.f716a = jVar;
            a<T>[] aVarArr = new a[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                aVarArr[i13] = new a<>(this, i12);
            }
            this.f717b = aVarArr;
            this.f721f.lazySet(i11);
        }

        final void a() {
            for (a<T> aVar : this.f717b) {
                aVar.getClass();
                g.a(aVar);
            }
        }

        final void b() {
            for (a<T> aVar : this.f717b) {
                aVar.f715e = null;
            }
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f720e) {
                return;
            }
            this.f720e = true;
            a();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        abstract void d();

        abstract void e();

        abstract void f(Throwable th2);

        abstract void g(a<T> aVar, T t2);

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (g.f(j11)) {
                Gc.d.a(this.f719d, j11);
                d();
            }
        }
    }

    public b(Ac.c cVar, int i11) {
        this.f709c = cVar;
        this.f710d = i11;
    }

    @Override // io.reactivex.h
    protected final void j(j jVar) {
        Ac.c cVar = this.f709c;
        C0023b c0023b = new C0023b(jVar, cVar.a(), this.f710d);
        jVar.d(c0023b);
        cVar.c(c0023b.f717b);
    }
}
