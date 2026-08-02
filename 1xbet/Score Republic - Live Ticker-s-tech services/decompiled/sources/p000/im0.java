package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class im0 extends AtomicReference implements xm0, InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3611j = 0;

    /* JADX INFO: renamed from: k */
    public final Object f3612k;

    /* JADX INFO: renamed from: l */
    public final Object f3613l;

    /* JADX INFO: renamed from: m */
    public Object f3614m;

    public im0() {
        nc1 nc1Var = t22.f7260e;
        o31 o31Var = t22.f7261f;
        o31 o31Var2 = t22.f7259d;
        this.f3612k = nc1Var;
        this.f3613l = o31Var;
        this.f3614m = o31Var2;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final void mo975a(InterfaceC0187eu interfaceC0187eu) {
        switch (this.f3611j) {
            case 0:
                EnumC0262gu.m2149e(this, interfaceC0187eu);
                break;
            default:
                if (EnumC0262gu.m2150f((InterfaceC0187eu) this.f3614m, interfaceC0187eu)) {
                    this.f3614m = interfaceC0187eu;
                    ((xm0) this.f3612k).mo975a(this);
                }
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public final void mo976b(Object obj) {
        int i = this.f3611j;
        Object obj2 = this.f3612k;
        switch (i) {
            case 0:
                lazySet(EnumC0262gu.f2872j);
                try {
                    ((nc1) obj2).getClass();
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    vt1.m5196h(th);
                }
                break;
            default:
                try {
                    Object objApply = ((r60) this.f3613l).apply(obj);
                    zg1.m5905p(objApply, "The mapper returned a null MaybeSource");
                    hm0 hm0Var = (hm0) objApply;
                    if (!EnumC0262gu.m2147b((InterfaceC0187eu) get())) {
                        hm0Var.m2293b(new jg0(3, this));
                    }
                } catch (Exception e) {
                    wo1.m5394u(e);
                    ((xm0) obj2).onError(e);
                    return;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        switch (this.f3611j) {
            case 0:
                EnumC0262gu.m2146a(this);
                break;
            default:
                EnumC0262gu.m2146a(this);
                ((InterfaceC0187eu) this.f3614m).mo480c();
                break;
        }
    }

    @Override // p000.xm0
    public final void onComplete() {
        switch (this.f3611j) {
            case 0:
                lazySet(EnumC0262gu.f2872j);
                try {
                    ((o31) this.f3614m).getClass();
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    vt1.m5196h(th);
                    return;
                }
                break;
            default:
                ((xm0) this.f3612k).onComplete();
                break;
        }
    }

    @Override // p000.xm0
    public final void onError(Throwable th) {
        switch (this.f3611j) {
            case 0:
                lazySet(EnumC0262gu.f2872j);
                try {
                    ((o31) this.f3613l).accept(th);
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    vt1.m5196h(new C0658rk(th, th2));
                    return;
                }
                break;
            default:
                ((xm0) this.f3612k).onError(th);
                break;
        }
    }

    public im0(xm0 xm0Var, r60 r60Var) {
        this.f3612k = xm0Var;
        this.f3613l = r60Var;
    }
}
