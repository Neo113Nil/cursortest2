package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0251gj extends AtomicReference implements InterfaceC0435lj, InterfaceC0187eu, xm0, ft0, c81 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2760j;

    /* JADX INFO: renamed from: k */
    public final Object f2761k;

    /* JADX INFO: renamed from: l */
    public final Object f2762l;

    public C0251gj(xm0 xm0Var) {
        this.f2760j = 3;
        this.f2762l = xm0Var;
        this.f2761k = new C0264gw(2);
    }

    @Override // p000.InterfaceC0435lj
    /* JADX INFO: renamed from: a */
    public final void mo608a(InterfaceC0187eu interfaceC0187eu) {
        int i = this.f2760j;
        Object obj = this.f2761k;
        switch (i) {
            case 0:
                if (EnumC0262gu.m2149e(this, interfaceC0187eu)) {
                    ((InterfaceC0435lj) obj).mo608a(this);
                }
                break;
            case 1:
                EnumC0262gu.m2148d(this, interfaceC0187eu);
                break;
            case 2:
                EnumC0262gu.m2148d(this, interfaceC0187eu);
                break;
            case 3:
                EnumC0262gu.m2149e(this, interfaceC0187eu);
                break;
            case 4:
                if (EnumC0262gu.m2149e(this, interfaceC0187eu)) {
                    ((xm0) obj).mo975a(this);
                }
                break;
            default:
                if (EnumC0262gu.m2149e(this, interfaceC0187eu)) {
                    ((c81) obj).mo77a(this);
                }
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public void mo976b(Object obj) {
        int i = this.f2760j;
        Object obj2 = this.f2762l;
        Object obj3 = this.f2761k;
        switch (i) {
            case 1:
                try {
                    Object objApply = ((r60) obj2).apply(obj);
                    zg1.m5905p(objApply, "The mapper returned a null CompletableSource");
                    AbstractC0213fj abstractC0213fj = (AbstractC0213fj) objApply;
                    if (!EnumC0262gu.m2147b((InterfaceC0187eu) get())) {
                        abstractC0213fj.m1874c(this);
                    }
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    onError(th);
                    return;
                }
                break;
            case 2:
                try {
                    ((AbstractC0959zp) ((C0042ay) obj2).apply(obj)).m5993v(this);
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    ((ft0) obj3).onError(th2);
                    return;
                }
                break;
            case 3:
                ((xm0) obj2).mo976b(obj);
                break;
            case 4:
                ((xm0) obj3).mo976b(obj);
                break;
            default:
                ((c81) obj3).mo78b(obj);
                break;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        switch (this.f2760j) {
            case 0:
                EnumC0262gu.m2146a(this);
                break;
            case 1:
                EnumC0262gu.m2146a(this);
                break;
            case 2:
                EnumC0262gu.m2146a(this);
                break;
            case 3:
                EnumC0262gu.m2146a(this);
                C0264gw c0264gw = (C0264gw) this.f2761k;
                c0264gw.getClass();
                EnumC0262gu.m2146a(c0264gw);
                break;
            case 4:
                EnumC0262gu.m2146a(this);
                break;
            default:
                EnumC0262gu.m2146a(this);
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public void onComplete() {
        int i = this.f2760j;
        Object obj = this.f2762l;
        Object obj2 = this.f2761k;
        switch (i) {
            case 0:
                ((AbstractC0213fj) obj).m1874c(new C0312i6(17, this, (InterfaceC0435lj) obj2));
                break;
            case 1:
                ((InterfaceC0435lj) obj2).onComplete();
                break;
            case 2:
                ((ft0) obj2).onComplete();
                break;
            case 3:
                ((xm0) obj).onComplete();
                break;
            default:
                InterfaceC0187eu interfaceC0187eu = (InterfaceC0187eu) get();
                if (interfaceC0187eu != EnumC0262gu.f2872j && compareAndSet(interfaceC0187eu, null)) {
                    ((hm0) obj).m2293b(new f50(11, (xm0) obj2, this));
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public final void onError(Throwable th) {
        int i = this.f2760j;
        Object obj = this.f2762l;
        Object obj2 = this.f2761k;
        switch (i) {
            case 0:
                ((InterfaceC0435lj) obj2).onError(th);
                break;
            case 1:
                ((InterfaceC0435lj) obj2).onError(th);
                break;
            case 2:
                ((ft0) obj2).onError(th);
                break;
            case 3:
                ((xm0) obj).onError(th);
                break;
            case 4:
                ((xm0) obj2).onError(th);
                break;
            default:
                c81 c81Var = (c81) obj2;
                try {
                    Object obj3 = ((CallableC0445lt) obj).f4898k;
                    zg1.m5905p(obj3, "The nextFunction returned a null SingleSource.");
                    ((z71) obj3).m5865a(new f50(26, this, c81Var));
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    c81Var.onError(new C0658rk(th, th2));
                }
                break;
        }
    }

    @Override // p000.ft0
    public void onNext(Object obj) {
        ((ft0) this.f2761k).onNext(obj);
    }

    public /* synthetic */ C0251gj(int i, Object obj, Object obj2) {
        this.f2760j = i;
        this.f2761k = obj;
        this.f2762l = obj2;
    }
}
