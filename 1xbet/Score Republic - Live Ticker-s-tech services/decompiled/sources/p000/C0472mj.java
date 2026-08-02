package p000;

/* JADX INFO: renamed from: mj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0472mj implements InterfaceC0435lj, InterfaceC0187eu, xm0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5050j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0187eu f5051k;

    /* JADX INFO: renamed from: l */
    public final Object f5052l;

    /* JADX INFO: renamed from: m */
    public final Object f5053m;

    public C0472mj(C0509nj c0509nj, InterfaceC0435lj interfaceC0435lj) {
        this.f5050j = 0;
        this.f5053m = c0509nj;
        this.f5052l = interfaceC0435lj;
    }

    @Override // p000.InterfaceC0435lj
    /* JADX INFO: renamed from: a */
    public final void mo608a(InterfaceC0187eu interfaceC0187eu) {
        int i = this.f5050j;
        Object obj = this.f5052l;
        switch (i) {
            case 0:
                InterfaceC0435lj interfaceC0435lj = (InterfaceC0435lj) obj;
                if (EnumC0262gu.m2150f(this.f5051k, interfaceC0187eu)) {
                    this.f5051k = interfaceC0187eu;
                    interfaceC0435lj.mo608a(this);
                }
                break;
            case 1:
                if (EnumC0262gu.m2150f(this.f5051k, interfaceC0187eu)) {
                    this.f5051k = interfaceC0187eu;
                    ((xm0) obj).mo975a(this);
                }
                break;
            default:
                xm0 xm0Var = (xm0) obj;
                if (EnumC0262gu.m2150f(this.f5051k, interfaceC0187eu)) {
                    this.f5051k = interfaceC0187eu;
                    xm0Var.mo975a(this);
                }
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public void mo976b(Object obj) {
        int i = this.f5050j;
        Object obj2 = this.f5052l;
        Object obj3 = this.f5053m;
        switch (i) {
            case 1:
                xm0 xm0Var = (xm0) obj2;
                try {
                    Object objApply = ((r60) obj3).apply(obj);
                    zg1.m5905p(objApply, "The mapper returned a null item");
                    xm0Var.mo976b(objApply);
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    xm0Var.onError(th);
                    return;
                }
                break;
            default:
                InterfaceC0187eu interfaceC0187eu = this.f5051k;
                EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
                if (interfaceC0187eu != enumC0262gu) {
                    try {
                        ((ym0) obj3).f9390k.accept(obj);
                        this.f5051k = enumC0262gu;
                        ((xm0) obj2).mo976b(obj);
                    } catch (Throwable th2) {
                        wo1.m5394u(th2);
                        m3395d(th2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        int i = this.f5050j;
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        switch (i) {
            case 0:
                this.f5051k.mo480c();
                break;
            case 1:
                InterfaceC0187eu interfaceC0187eu = this.f5051k;
                this.f5051k = enumC0262gu;
                interfaceC0187eu.mo480c();
                break;
            default:
                this.f5051k.mo480c();
                this.f5051k = enumC0262gu;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3395d(Throwable th) {
        try {
            ((ym0) this.f5053m).f9391l.accept(th);
        } catch (Throwable th2) {
            wo1.m5394u(th2);
            th = new C0658rk(th, th2);
        }
        this.f5051k = EnumC0262gu.f2872j;
        ((xm0) this.f5052l).onError(th);
    }

    @Override // p000.InterfaceC0435lj
    public final void onComplete() {
        int i = this.f5050j;
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        Object obj = this.f5052l;
        switch (i) {
            case 0:
                InterfaceC0435lj interfaceC0435lj = (InterfaceC0435lj) obj;
                C0509nj c0509nj = (C0509nj) this.f5053m;
                if (this.f5051k != enumC0262gu) {
                    try {
                        c0509nj.f5442c.run();
                        interfaceC0435lj.onComplete();
                    } catch (Throwable th) {
                        wo1.m5394u(th);
                        interfaceC0435lj.onError(th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ((xm0) obj).onComplete();
                break;
            default:
                if (this.f5051k != enumC0262gu) {
                    this.f5051k = enumC0262gu;
                    ((xm0) obj).onComplete();
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public final void onError(Throwable th) {
        int i = this.f5050j;
        Object obj = this.f5052l;
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        switch (i) {
            case 0:
                C0509nj c0509nj = (C0509nj) this.f5053m;
                if (this.f5051k != enumC0262gu) {
                    try {
                        c0509nj.f5441b.accept(th);
                    } catch (Throwable th2) {
                        wo1.m5394u(th2);
                        th = new C0658rk(th, th2);
                    }
                    ((InterfaceC0435lj) obj).onError(th);
                } else {
                    vt1.m5196h(th);
                }
                break;
            case 1:
                ((xm0) obj).onError(th);
                break;
            default:
                if (this.f5051k != enumC0262gu) {
                    m3395d(th);
                } else {
                    vt1.m5196h(th);
                }
                break;
        }
    }

    public /* synthetic */ C0472mj(xm0 xm0Var, Object obj, int i) {
        this.f5050j = i;
        this.f5052l = xm0Var;
        this.f5053m = obj;
    }
}
