package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0546oj extends AtomicReference implements InterfaceC0435lj, InterfaceC0187eu, xm0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5750j;

    /* JADX INFO: renamed from: k */
    public boolean f5751k;

    /* JADX INFO: renamed from: l */
    public final Object f5752l;

    /* JADX INFO: renamed from: m */
    public final r60 f5753m;

    public C0546oj(xm0 xm0Var, r60 r60Var) {
        this.f5750j = 1;
        this.f5752l = xm0Var;
        this.f5753m = r60Var;
        this.f5751k = true;
    }

    @Override // p000.InterfaceC0435lj
    /* JADX INFO: renamed from: a */
    public final void mo608a(InterfaceC0187eu interfaceC0187eu) {
        switch (this.f5750j) {
            case 0:
                EnumC0262gu.m2148d(this, interfaceC0187eu);
                break;
            default:
                if (EnumC0262gu.m2149e(this, interfaceC0187eu)) {
                    ((xm0) this.f5752l).mo975a(this);
                }
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public void mo976b(Object obj) {
        ((xm0) this.f5752l).mo976b(obj);
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        switch (this.f5750j) {
            case 0:
                EnumC0262gu.m2146a(this);
                break;
            default:
                EnumC0262gu.m2146a(this);
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public final void onComplete() {
        switch (this.f5750j) {
            case 0:
                ((InterfaceC0435lj) this.f5752l).onComplete();
                break;
            default:
                ((xm0) this.f5752l).onComplete();
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public final void onError(Throwable th) {
        int i = this.f5750j;
        r60 r60Var = this.f5753m;
        Object obj = this.f5752l;
        switch (i) {
            case 0:
                InterfaceC0435lj interfaceC0435lj = (InterfaceC0435lj) obj;
                if (this.f5751k) {
                    interfaceC0435lj.onError(th);
                    return;
                }
                this.f5751k = true;
                try {
                    ((C0042ay) r60Var).getClass();
                    try {
                        mo608a(EnumC0336iw.f3682j);
                        onComplete();
                        return;
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th2) {
                        wo1.m5394u(th2);
                        vt1.m5196h(th2);
                        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                        nullPointerException.initCause(th2);
                        throw nullPointerException;
                    }
                } catch (Throwable th3) {
                    wo1.m5394u(th3);
                    interfaceC0435lj.onError(new C0658rk(th, th3));
                    return;
                }
            default:
                xm0 xm0Var = (xm0) obj;
                if (!this.f5751k && !(th instanceof Exception)) {
                    xm0Var.onError(th);
                    return;
                }
                try {
                    Object objApply = r60Var.apply(th);
                    zg1.m5905p(objApply, "The resumeFunction returned a null MaybeSource");
                    hm0 hm0Var = (hm0) objApply;
                    EnumC0262gu.m2148d(this, null);
                    hm0Var.m2293b(new f50(10, xm0Var, this));
                    return;
                } catch (Throwable th4) {
                    wo1.m5394u(th4);
                    xm0Var.onError(new C0658rk(th, th4));
                    return;
                }
        }
    }

    public C0546oj(InterfaceC0435lj interfaceC0435lj, C0042ay c0042ay) {
        this.f5750j = 0;
        this.f5752l = interfaceC0435lj;
        this.f5753m = c0042ay;
    }
}
