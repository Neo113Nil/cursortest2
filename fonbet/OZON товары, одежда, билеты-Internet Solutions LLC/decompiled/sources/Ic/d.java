package Ic;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.w;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes9.dex */
public final class d<T> implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final w<? super T> f12162a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC8487b f12163b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12164c;

    public d(w<? super T> wVar) {
        this.f12162a = wVar;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        this.f12163b.dispose();
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f12163b.isDisposed();
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (this.f12164c) {
            return;
        }
        this.f12164c = true;
        InterfaceC8487b interfaceC8487b = this.f12163b;
        w<? super T> wVar = this.f12162a;
        if (interfaceC8487b != null) {
            try {
                wVar.onComplete();
                return;
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            wVar.onSubscribe(rc.e.INSTANCE);
            try {
                wVar.onError(nullPointerException);
            } catch (Throwable th3) {
                C2645f.c(th3);
                C3493a.f(new C8691a(nullPointerException, th3));
            }
        } catch (Throwable th4) {
            C2645f.c(th4);
            C3493a.f(new C8691a(nullPointerException, th4));
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        if (this.f12164c) {
            C3493a.f(th2);
            return;
        }
        this.f12164c = true;
        InterfaceC8487b interfaceC8487b = this.f12163b;
        w<? super T> wVar = this.f12162a;
        if (interfaceC8487b != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                wVar.onError(th2);
                return;
            } catch (Throwable th3) {
                C2645f.c(th3);
                C3493a.f(new C8691a(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            wVar.onSubscribe(rc.e.INSTANCE);
            try {
                wVar.onError(new C8691a(th2, nullPointerException));
            } catch (Throwable th4) {
                C2645f.c(th4);
                C3493a.f(new C8691a(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            C2645f.c(th5);
            C3493a.f(new C8691a(th2, nullPointerException, th5));
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        if (this.f12164c) {
            return;
        }
        InterfaceC8487b interfaceC8487b = this.f12163b;
        w<? super T> wVar = this.f12162a;
        if (interfaceC8487b == null) {
            this.f12164c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                wVar.onSubscribe(rc.e.INSTANCE);
                try {
                    wVar.onError(nullPointerException);
                    return;
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(new C8691a(nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                C3493a.f(new C8691a(nullPointerException, th3));
                return;
            }
        }
        if (t2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f12163b.dispose();
                onError(nullPointerException2);
                return;
            } catch (Throwable th4) {
                C2645f.c(th4);
                onError(new C8691a(nullPointerException2, th4));
                return;
            }
        }
        try {
            wVar.onNext(t2);
        } catch (Throwable th5) {
            C2645f.c(th5);
            try {
                this.f12163b.dispose();
                onError(th5);
            } catch (Throwable th6) {
                C2645f.c(th6);
                onError(new C8691a(th5, th6));
            }
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (rc.d.g(this.f12163b, interfaceC8487b)) {
            this.f12163b = interfaceC8487b;
            try {
                this.f12162a.onSubscribe(this);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f12164c = true;
                try {
                    interfaceC8487b.dispose();
                    C3493a.f(th2);
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    C3493a.f(new C8691a(th2, th3));
                }
            }
        }
    }
}
