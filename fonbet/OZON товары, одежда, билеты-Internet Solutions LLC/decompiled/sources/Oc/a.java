package Oc;

import Fc.g;
import Gc.k;
import Kc.C3493a;
import hg.InterfaceC6950c;
import io.reactivex.j;

/* loaded from: classes9.dex */
public final class a<T> implements j<T>, InterfaceC6950c {

    /* renamed from: a, reason: collision with root package name */
    final j f20180a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC6950c f20181b;

    /* renamed from: c, reason: collision with root package name */
    boolean f20182c;

    /* renamed from: d, reason: collision with root package name */
    Gc.a<Object> f20183d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f20184e;

    public a(j jVar) {
        this.f20180a = jVar;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        this.f20181b.cancel();
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (g.g(this.f20181b, interfaceC6950c)) {
            this.f20181b = interfaceC6950c;
            this.f20180a.d(this);
        }
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        this.f20181b.n(j11);
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        if (this.f20184e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f20184e) {
                    return;
                }
                if (!this.f20182c) {
                    this.f20184e = true;
                    this.f20182c = true;
                    this.f20180a.onComplete();
                } else {
                    Gc.a<Object> aVar = this.f20183d;
                    if (aVar == null) {
                        aVar = new Gc.a<>();
                        this.f20183d = aVar;
                    }
                    aVar.c(k.COMPLETE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        if (this.f20184e) {
            C3493a.f(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f20184e) {
                    if (this.f20182c) {
                        this.f20184e = true;
                        Gc.a<Object> aVar = this.f20183d;
                        if (aVar == null) {
                            aVar = new Gc.a<>();
                            this.f20183d = aVar;
                        }
                        aVar.e(k.f(th2));
                        return;
                    }
                    this.f20184e = true;
                    this.f20182c = true;
                    z11 = false;
                }
                if (z11) {
                    C3493a.f(th2);
                } else {
                    this.f20180a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        Gc.a<Object> aVar;
        if (this.f20184e) {
            return;
        }
        if (t2 == null) {
            this.f20181b.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f20184e) {
                    return;
                }
                if (this.f20182c) {
                    Gc.a<Object> aVar2 = this.f20183d;
                    if (aVar2 == null) {
                        aVar2 = new Gc.a<>();
                        this.f20183d = aVar2;
                    }
                    aVar2.c(t2);
                    return;
                }
                this.f20182c = true;
                this.f20180a.onNext(t2);
                do {
                    synchronized (this) {
                        try {
                            aVar = this.f20183d;
                            if (aVar == null) {
                                this.f20182c = false;
                                return;
                            }
                            this.f20183d = null;
                        } finally {
                        }
                    }
                } while (!aVar.a(this.f20180a));
            } finally {
            }
        }
    }
}
