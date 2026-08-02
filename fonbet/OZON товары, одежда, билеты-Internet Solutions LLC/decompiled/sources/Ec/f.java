package Ec;

import Fc.g;
import Gc.i;
import I0.C3173b;
import Kc.C3493a;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f<T> extends AtomicInteger implements j<T>, InterfaceC6950c {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6949b<? super T> f7822a;

    /* renamed from: b, reason: collision with root package name */
    final Gc.c f7823b = new Gc.c();

    /* renamed from: c, reason: collision with root package name */
    final AtomicLong f7824c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<InterfaceC6950c> f7825d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f7826e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f7827f;

    public f(InterfaceC6949b<? super T> interfaceC6949b) {
        this.f7822a = interfaceC6949b;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        if (this.f7827f) {
            return;
        }
        g.a(this.f7825d);
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (this.f7826e.compareAndSet(false, true)) {
            this.f7822a.d(this);
            g.d(this.f7825d, this.f7824c, interfaceC6950c);
        } else {
            interfaceC6950c.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        if (j11 > 0) {
            g.b(this.f7825d, this.f7824c, j11);
        } else {
            cancel();
            onError(new IllegalArgumentException(C3173b.b(j11, "§3.9 violated: positive request amount required but it was ")));
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        this.f7827f = true;
        InterfaceC6949b<? super T> interfaceC6949b = this.f7822a;
        Gc.c cVar = this.f7823b;
        if (getAndIncrement() == 0) {
            cVar.getClass();
            Throwable b11 = i.b(cVar);
            if (b11 != null) {
                interfaceC6949b.onError(b11);
            } else {
                interfaceC6949b.onComplete();
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        this.f7827f = true;
        InterfaceC6949b<? super T> interfaceC6949b = this.f7822a;
        Gc.c cVar = this.f7823b;
        cVar.getClass();
        if (!i.a(cVar, th2)) {
            C3493a.f(th2);
        } else if (getAndIncrement() == 0) {
            interfaceC6949b.onError(i.b(cVar));
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        if (get() == 0 && compareAndSet(0, 1)) {
            InterfaceC6949b<? super T> interfaceC6949b = this.f7822a;
            interfaceC6949b.onNext(t2);
            if (decrementAndGet() != 0) {
                Gc.c cVar = this.f7823b;
                cVar.getClass();
                Throwable b11 = i.b(cVar);
                if (b11 != null) {
                    interfaceC6949b.onError(b11);
                } else {
                    interfaceC6949b.onComplete();
                }
            }
        }
    }
}
