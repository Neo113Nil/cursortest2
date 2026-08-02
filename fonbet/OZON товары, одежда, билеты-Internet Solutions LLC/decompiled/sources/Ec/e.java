package Ec;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6950c;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;
import qc.g;
import sc.C9653a;
import wc.v;

/* loaded from: classes.dex */
public final class e<T> extends AtomicReference<InterfaceC6950c> implements j<T>, InterfaceC6950c, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final g<? super T> f7818a;

    /* renamed from: b, reason: collision with root package name */
    final g<? super Throwable> f7819b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9019a f7820c;

    /* renamed from: d, reason: collision with root package name */
    final v f7821d;

    public e(g gVar, g gVar2, v vVar) {
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        this.f7818a = gVar;
        this.f7819b = gVar2;
        this.f7820c = interfaceC9019a;
        this.f7821d = vVar;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        Fc.g.a(this);
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (Fc.g.e(this, interfaceC6950c)) {
            try {
                this.f7821d.accept(this);
            } catch (Throwable th2) {
                C2645f.c(th2);
                interfaceC6950c.cancel();
                onError(th2);
            }
        }
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        Fc.g.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == Fc.g.CANCELLED;
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        get().n(j11);
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        InterfaceC6950c interfaceC6950c = get();
        Fc.g gVar = Fc.g.CANCELLED;
        if (interfaceC6950c != gVar) {
            lazySet(gVar);
            try {
                this.f7820c.run();
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        InterfaceC6950c interfaceC6950c = get();
        Fc.g gVar = Fc.g.CANCELLED;
        if (interfaceC6950c == gVar) {
            C3493a.f(th2);
            return;
        }
        lazySet(gVar);
        try {
            this.f7819b.accept(th2);
        } catch (Throwable th3) {
            C2645f.c(th3);
            C3493a.f(new C8691a(th2, th3));
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f7818a.accept(t2);
        } catch (Throwable th2) {
            C2645f.c(th2);
            get().cancel();
            onError(th2);
        }
    }
}
