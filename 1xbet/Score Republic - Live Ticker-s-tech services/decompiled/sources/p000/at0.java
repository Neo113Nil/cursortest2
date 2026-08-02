package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class at0 extends AtomicInteger implements InterfaceC0187eu, ft0 {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0435lj f629j;

    /* JADX INFO: renamed from: l */
    public final wz0 f631l;

    /* JADX INFO: renamed from: n */
    public InterfaceC0187eu f633n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f634o;

    /* JADX INFO: renamed from: k */
    public final C0757u8 f630k = new C0757u8();

    /* JADX INFO: renamed from: m */
    public final C0584pk f632m = new C0584pk(0);

    public at0(InterfaceC0435lj interfaceC0435lj, wz0 wz0Var) {
        this.f629j = interfaceC0435lj;
        this.f631l = wz0Var;
        lazySet(1);
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public final void mo172a(InterfaceC0187eu interfaceC0187eu) {
        if (EnumC0262gu.m2150f(this.f633n, interfaceC0187eu)) {
            this.f633n = interfaceC0187eu;
            this.f629j.mo608a(this);
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        this.f634o = true;
        this.f633n.mo480c();
        this.f632m.mo480c();
    }

    @Override // p000.ft0
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            C0757u8 c0757u8 = this.f630k;
            c0757u8.getClass();
            Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
            InterfaceC0435lj interfaceC0435lj = this.f629j;
            if (thM4416b != null) {
                interfaceC0435lj.onError(thM4416b);
            } else {
                interfaceC0435lj.onComplete();
            }
        }
    }

    @Override // p000.ft0
    public final void onError(Throwable th) {
        C0757u8 c0757u8 = this.f630k;
        c0757u8.getClass();
        if (!AbstractC0671rx.m4415a(c0757u8, th)) {
            vt1.m5196h(th);
            return;
        }
        mo480c();
        if (getAndSet(0) > 0) {
            this.f629j.onError(AbstractC0671rx.m4416b(c0757u8));
        }
    }

    @Override // p000.ft0
    public final void onNext(Object obj) {
        try {
            AbstractC0213fj abstractC0213fj = (AbstractC0213fj) this.f631l.apply(obj);
            getAndIncrement();
            jm0 jm0Var = new jm0(this, 2);
            if (this.f634o || !this.f632m.m3948a(jm0Var)) {
                return;
            }
            abstractC0213fj.m1874c(jm0Var);
        } catch (Throwable th) {
            wo1.m5394u(th);
            this.f633n.mo480c();
            onError(th);
        }
    }
}
