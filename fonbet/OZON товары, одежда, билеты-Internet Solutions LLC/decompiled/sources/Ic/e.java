package Ic;

import Gc.k;
import Kc.C3493a;
import io.reactivex.w;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class e<T> implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final w<? super T> f12165a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC8487b f12166b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12167c;

    /* renamed from: d, reason: collision with root package name */
    Gc.a<Object> f12168d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f12169e;

    public e(w<? super T> wVar) {
        this.f12165a = wVar;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        this.f12166b.dispose();
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f12166b.isDisposed();
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (this.f12169e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f12169e) {
                    return;
                }
                if (!this.f12167c) {
                    this.f12169e = true;
                    this.f12167c = true;
                    this.f12165a.onComplete();
                } else {
                    Gc.a<Object> aVar = this.f12168d;
                    if (aVar == null) {
                        aVar = new Gc.a<>();
                        this.f12168d = aVar;
                    }
                    aVar.c(k.COMPLETE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        if (this.f12169e) {
            C3493a.f(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f12169e) {
                    if (this.f12167c) {
                        this.f12169e = true;
                        Gc.a<Object> aVar = this.f12168d;
                        if (aVar == null) {
                            aVar = new Gc.a<>();
                            this.f12168d = aVar;
                        }
                        aVar.e(k.f(th2));
                        return;
                    }
                    this.f12169e = true;
                    this.f12167c = true;
                    z11 = false;
                }
                if (z11) {
                    C3493a.f(th2);
                } else {
                    this.f12165a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        Gc.a<Object> aVar;
        if (this.f12169e) {
            return;
        }
        if (t2 == null) {
            this.f12166b.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f12169e) {
                    return;
                }
                if (this.f12167c) {
                    Gc.a<Object> aVar2 = this.f12168d;
                    if (aVar2 == null) {
                        aVar2 = new Gc.a<>();
                        this.f12168d = aVar2;
                    }
                    aVar2.c(t2);
                    return;
                }
                this.f12167c = true;
                this.f12165a.onNext(t2);
                do {
                    synchronized (this) {
                        try {
                            aVar = this.f12168d;
                            if (aVar == null) {
                                this.f12167c = false;
                                return;
                            }
                            this.f12168d = null;
                        } finally {
                        }
                    }
                } while (!aVar.b(this.f12165a));
            } finally {
            }
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (rc.d.g(this.f12166b, interfaceC8487b)) {
            this.f12166b = interfaceC8487b;
            this.f12165a.onSubscribe(this);
        }
    }
}
