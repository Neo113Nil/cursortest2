package Ac;

import Bl0.C2645f;
import Dp.C2877a;
import Fc.g;
import Jc.AbstractC3389a;
import Kc.C3493a;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import io.reactivex.j;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;
import sc.C9656b;
import tc.InterfaceC9799a;

/* loaded from: classes9.dex */
public final class c<T, R> extends AbstractC3389a<R> {

    /* renamed from: a, reason: collision with root package name */
    final d f722a;

    /* renamed from: b, reason: collision with root package name */
    final C2877a f723b;

    static final class a<T, R> implements InterfaceC9799a<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC9799a<? super R> f724a;

        /* renamed from: b, reason: collision with root package name */
        final C2877a f725b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6950c f726c;

        /* renamed from: d, reason: collision with root package name */
        boolean f727d;

        a(InterfaceC9799a interfaceC9799a, C2877a c2877a) {
            this.f724a = interfaceC9799a;
            this.f725b = c2877a;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f726c.cancel();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (g.g(this.f726c, interfaceC6950c)) {
                this.f726c = interfaceC6950c;
                this.f724a.d(this);
            }
        }

        @Override // tc.InterfaceC9799a
        public final boolean g(T t2) {
            Boolean loadResources$lambda$3;
            if (this.f727d) {
                return false;
            }
            try {
                loadResources$lambda$3 = LocalStateActualizer.loadResources$lambda$3(this.f725b.f6767b, t2);
                C9656b.c(loadResources$lambda$3, "The mapper returned a null value");
                return this.f724a.g(loadResources$lambda$3);
            } catch (Throwable th2) {
                C2645f.c(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            this.f726c.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f727d) {
                return;
            }
            this.f727d = true;
            this.f724a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f727d) {
                C3493a.f(th2);
            } else {
                this.f727d = true;
                this.f724a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            Boolean loadResources$lambda$3;
            if (this.f727d) {
                return;
            }
            try {
                loadResources$lambda$3 = LocalStateActualizer.loadResources$lambda$3(this.f725b.f6767b, t2);
                C9656b.c(loadResources$lambda$3, "The mapper returned a null value");
                this.f724a.onNext(loadResources$lambda$3);
            } catch (Throwable th2) {
                C2645f.c(th2);
                cancel();
                onError(th2);
            }
        }
    }

    static final class b<T, R> implements j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6949b<? super R> f728a;

        /* renamed from: b, reason: collision with root package name */
        final C2877a f729b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6950c f730c;

        /* renamed from: d, reason: collision with root package name */
        boolean f731d;

        b(InterfaceC6949b interfaceC6949b, C2877a c2877a) {
            this.f728a = interfaceC6949b;
            this.f729b = c2877a;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f730c.cancel();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (g.g(this.f730c, interfaceC6950c)) {
                this.f730c = interfaceC6950c;
                this.f728a.d(this);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            this.f730c.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f731d) {
                return;
            }
            this.f731d = true;
            this.f728a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f731d) {
                C3493a.f(th2);
            } else {
                this.f731d = true;
                this.f728a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            Boolean loadResources$lambda$3;
            if (this.f731d) {
                return;
            }
            try {
                loadResources$lambda$3 = LocalStateActualizer.loadResources$lambda$3(this.f729b.f6767b, t2);
                C9656b.c(loadResources$lambda$3, "The mapper returned a null value");
                this.f728a.onNext(loadResources$lambda$3);
            } catch (Throwable th2) {
                C2645f.c(th2);
                cancel();
                onError(th2);
            }
        }
    }

    public c(d dVar, C2877a c2877a) {
        this.f722a = dVar;
        this.f723b = c2877a;
    }

    @Override // Jc.AbstractC3389a
    public final int a() {
        return this.f722a.f732a.f690b;
    }

    public final void c(InterfaceC6949b<? super R>[] interfaceC6949bArr) {
        if (b(interfaceC6949bArr)) {
            int length = interfaceC6949bArr.length;
            InterfaceC6949b<? super T>[] interfaceC6949bArr2 = new InterfaceC6949b[length];
            for (int i11 = 0; i11 < length; i11++) {
                InterfaceC6949b<? super R> interfaceC6949b = interfaceC6949bArr[i11];
                boolean z11 = interfaceC6949b instanceof InterfaceC9799a;
                C2877a c2877a = this.f723b;
                if (z11) {
                    interfaceC6949bArr2[i11] = new a((InterfaceC9799a) interfaceC6949b, c2877a);
                } else {
                    interfaceC6949bArr2[i11] = new b(interfaceC6949b, c2877a);
                }
            }
            this.f722a.d(interfaceC6949bArr2);
        }
    }
}
