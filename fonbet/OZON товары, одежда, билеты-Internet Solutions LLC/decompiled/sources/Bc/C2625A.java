package Bc;

import Bc.r;
import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.C;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: Bc.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2625A<T, R> extends io.reactivex.y<R> {

    /* renamed from: a, reason: collision with root package name */
    final C<? extends T>[] f3363a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super Object[], ? extends R> f3364b;

    /* renamed from: Bc.A$a */
    final class a implements qc.o<T, R> {
        a() {
        }

        @Override // qc.o
        public final R apply(T t2) throws Exception {
            R apply = C2625A.this.f3364b.apply(new Object[]{t2});
            C9656b.c(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* renamed from: Bc.A$b */
    static final class b<T, R> extends AtomicInteger implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super R> f3366a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Object[], ? extends R> f3367b;

        /* renamed from: c, reason: collision with root package name */
        final c<T>[] f3368c;

        /* renamed from: d, reason: collision with root package name */
        final Object[] f3369d;

        b(io.reactivex.A<? super R> a11, int i11, qc.o<? super Object[], ? extends R> oVar) {
            super(i11);
            this.f3366a = a11;
            this.f3367b = oVar;
            c<T>[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                cVarArr[i12] = new c<>(this, i12);
            }
            this.f3368c = cVarArr;
            this.f3369d = new Object[i11];
        }

        final void a(int i11, Throwable th2) {
            if (getAndSet(0) <= 0) {
                C3493a.f(th2);
                return;
            }
            c<T>[] cVarArr = this.f3368c;
            int length = cVarArr.length;
            for (int i12 = 0; i12 < i11; i12++) {
                c<T> cVar = cVarArr[i12];
                cVar.getClass();
                rc.d.a(cVar);
            }
            while (true) {
                i11++;
                if (i11 >= length) {
                    this.f3366a.onError(th2);
                    return;
                } else {
                    c<T> cVar2 = cVarArr[i11];
                    cVar2.getClass();
                    rc.d.a(cVar2);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f3368c) {
                    cVar.getClass();
                    rc.d.a(cVar);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* renamed from: Bc.A$c */
    static final class c<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, ?> f3370a;

        /* renamed from: b, reason: collision with root package name */
        final int f3371b;

        c(b<T, ?> bVar, int i11) {
            this.f3370a = bVar;
            this.f3371b = i11;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f3370a.a(this.f3371b, th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            b<T, ?> bVar = this.f3370a;
            io.reactivex.A<? super Object> a11 = bVar.f3366a;
            int i11 = this.f3371b;
            Object[] objArr = bVar.f3369d;
            objArr[i11] = t2;
            if (bVar.decrementAndGet() == 0) {
                try {
                    Object apply = bVar.f3367b.apply(objArr);
                    C9656b.c(apply, "The zipper returned a null value");
                    a11.onSuccess(apply);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    a11.onError(th2);
                }
            }
        }
    }

    public C2625A(C<? extends T>[] cArr, qc.o<? super Object[], ? extends R> oVar) {
        this.f3363a = cArr;
        this.f3364b = oVar;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super R> a11) {
        C<? extends T>[] cArr = this.f3363a;
        int length = cArr.length;
        if (length == 1) {
            cArr[0].c(new r.a(a11, new a()));
            return;
        }
        b bVar = new b(a11, length, this.f3364b);
        a11.onSubscribe(bVar);
        for (int i11 = 0; i11 < length && !bVar.isDisposed(); i11++) {
            C<? extends T> c11 = cArr[i11];
            if (c11 == null) {
                bVar.a(i11, new NullPointerException("One of the sources is null"));
                return;
            }
            c11.c(bVar.f3368c[i11]);
        }
    }
}
