package Nc;

import Gc.a;
import Gc.k;
import Kc.C3493a;
import io.reactivex.w;
import nc.InterfaceC8487b;

/* renamed from: Nc.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C3670d<T> extends e<T> implements a.InterfaceC0204a<Object> {

    /* renamed from: a, reason: collision with root package name */
    final C3669c f18965a;

    /* renamed from: b, reason: collision with root package name */
    boolean f18966b;

    /* renamed from: c, reason: collision with root package name */
    Gc.a<Object> f18967c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f18968d;

    C3670d(C3669c c3669c) {
        this.f18965a = c3669c;
    }

    final void d() {
        Gc.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f18967c;
                    if (aVar == null) {
                        this.f18966b = false;
                        return;
                    }
                    this.f18967c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.d(this);
        }
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (this.f18968d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f18968d) {
                    return;
                }
                this.f18968d = true;
                if (!this.f18966b) {
                    this.f18966b = true;
                    this.f18965a.onComplete();
                    return;
                }
                Gc.a<Object> aVar = this.f18967c;
                if (aVar == null) {
                    aVar = new Gc.a<>();
                    this.f18967c = aVar;
                }
                aVar.c(k.COMPLETE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        if (this.f18968d) {
            C3493a.f(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f18968d) {
                    this.f18968d = true;
                    if (this.f18966b) {
                        Gc.a<Object> aVar = this.f18967c;
                        if (aVar == null) {
                            aVar = new Gc.a<>();
                            this.f18967c = aVar;
                        }
                        aVar.e(k.f(th2));
                        return;
                    }
                    this.f18966b = true;
                    z11 = false;
                }
                if (z11) {
                    C3493a.f(th2);
                } else {
                    this.f18965a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        if (this.f18968d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f18968d) {
                    return;
                }
                if (!this.f18966b) {
                    this.f18966b = true;
                    this.f18965a.onNext(t2);
                    d();
                } else {
                    Gc.a<Object> aVar = this.f18967c;
                    if (aVar == null) {
                        aVar = new Gc.a<>();
                        this.f18967c = aVar;
                    }
                    aVar.c(t2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        boolean z11 = true;
        if (!this.f18968d) {
            synchronized (this) {
                try {
                    if (!this.f18968d) {
                        if (this.f18966b) {
                            Gc.a<Object> aVar = this.f18967c;
                            if (aVar == null) {
                                aVar = new Gc.a<>();
                                this.f18967c = aVar;
                            }
                            aVar.c(k.e(interfaceC8487b));
                            return;
                        }
                        this.f18966b = true;
                        z11 = false;
                    }
                } finally {
                }
            }
        }
        if (z11) {
            interfaceC8487b.dispose();
        } else {
            this.f18965a.onSubscribe(interfaceC8487b);
            d();
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super T> wVar) {
        this.f18965a.subscribe(wVar);
    }

    @Override // qc.q
    public final boolean test(Object obj) {
        return k.d(this.f18965a, obj);
    }
}
