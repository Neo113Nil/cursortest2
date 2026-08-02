package Lc;

import Gc.k;
import Kc.C3493a;
import hg.InterfaceC6950c;
import io.reactivex.j;

/* loaded from: classes9.dex */
final class d<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    final e f16696c;

    /* renamed from: d, reason: collision with root package name */
    boolean f16697d;

    /* renamed from: e, reason: collision with root package name */
    Gc.a<Object> f16698e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f16699f;

    d(e eVar) {
        this.f16696c = eVar;
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        boolean z11 = true;
        if (!this.f16699f) {
            synchronized (this) {
                try {
                    if (!this.f16699f) {
                        if (this.f16697d) {
                            Gc.a<Object> aVar = this.f16698e;
                            if (aVar == null) {
                                aVar = new Gc.a<>();
                                this.f16698e = aVar;
                            }
                            aVar.c(k.j(interfaceC6950c));
                            return;
                        }
                        this.f16697d = true;
                        z11 = false;
                    }
                } finally {
                }
            }
        }
        if (z11) {
            interfaceC6950c.cancel();
        } else {
            this.f16696c.d(interfaceC6950c);
            m();
        }
    }

    @Override // io.reactivex.h
    protected final void j(j jVar) {
        this.f16696c.a(jVar);
    }

    final void m() {
        Gc.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f16698e;
                    if (aVar == null) {
                        this.f16697d = false;
                        return;
                    }
                    this.f16698e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.a(this.f16696c);
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        if (this.f16699f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f16699f) {
                    return;
                }
                this.f16699f = true;
                if (!this.f16697d) {
                    this.f16697d = true;
                    this.f16696c.onComplete();
                    return;
                }
                Gc.a<Object> aVar = this.f16698e;
                if (aVar == null) {
                    aVar = new Gc.a<>();
                    this.f16698e = aVar;
                }
                aVar.c(k.COMPLETE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        if (this.f16699f) {
            C3493a.f(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f16699f) {
                    this.f16699f = true;
                    if (this.f16697d) {
                        Gc.a<Object> aVar = this.f16698e;
                        if (aVar == null) {
                            aVar = new Gc.a<>();
                            this.f16698e = aVar;
                        }
                        aVar.e(k.f(th2));
                        return;
                    }
                    this.f16697d = true;
                    z11 = false;
                }
                if (z11) {
                    C3493a.f(th2);
                } else {
                    this.f16696c.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        if (this.f16699f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f16699f) {
                    return;
                }
                if (!this.f16697d) {
                    this.f16697d = true;
                    this.f16696c.onNext(t2);
                    m();
                } else {
                    Gc.a<Object> aVar = this.f16698e;
                    if (aVar == null) {
                        aVar = new Gc.a<>();
                        this.f16698e = aVar;
                    }
                    aVar.c(t2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
