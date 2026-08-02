package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 implements xm0, InterfaceC0187eu, c81 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5095j;

    /* JADX INFO: renamed from: k */
    public final xm0 f5096k;

    /* JADX INFO: renamed from: l */
    public final nw0 f5097l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0187eu f5098m;

    public /* synthetic */ mm0(xm0 xm0Var, nw0 nw0Var, int i) {
        this.f5095j = i;
        this.f5096k = xm0Var;
        this.f5097l = nw0Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final void mo975a(InterfaceC0187eu interfaceC0187eu) {
        int i = this.f5095j;
        xm0 xm0Var = this.f5096k;
        switch (i) {
            case 0:
                if (EnumC0262gu.m2150f(this.f5098m, interfaceC0187eu)) {
                    this.f5098m = interfaceC0187eu;
                    xm0Var.mo975a(this);
                }
                break;
            default:
                if (EnumC0262gu.m2150f(this.f5098m, interfaceC0187eu)) {
                    this.f5098m = interfaceC0187eu;
                    xm0Var.mo975a(this);
                }
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public final void mo976b(Object obj) {
        int i = this.f5095j;
        nw0 nw0Var = this.f5097l;
        xm0 xm0Var = this.f5096k;
        switch (i) {
            case 0:
                try {
                    if (!nw0Var.test(obj)) {
                        xm0Var.onComplete();
                    } else {
                        xm0Var.mo976b(obj);
                    }
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    xm0Var.onError(th);
                    return;
                }
                break;
            default:
                try {
                    if (!nw0Var.test(obj)) {
                        xm0Var.onComplete();
                    } else {
                        xm0Var.mo976b(obj);
                    }
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    xm0Var.onError(th2);
                }
                break;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        int i = this.f5095j;
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        switch (i) {
            case 0:
                InterfaceC0187eu interfaceC0187eu = this.f5098m;
                this.f5098m = enumC0262gu;
                interfaceC0187eu.mo480c();
                break;
            default:
                InterfaceC0187eu interfaceC0187eu2 = this.f5098m;
                this.f5098m = enumC0262gu;
                interfaceC0187eu2.mo480c();
                break;
        }
    }

    @Override // p000.xm0
    public void onComplete() {
        this.f5096k.onComplete();
    }

    @Override // p000.xm0
    public final void onError(Throwable th) {
        int i = this.f5095j;
        xm0 xm0Var = this.f5096k;
        switch (i) {
            case 0:
                xm0Var.onError(th);
                break;
            default:
                xm0Var.onError(th);
                break;
        }
    }
}
