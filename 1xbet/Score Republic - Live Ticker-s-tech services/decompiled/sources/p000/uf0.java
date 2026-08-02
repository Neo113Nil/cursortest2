package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uf0 extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7813n;

    /* JADX INFO: renamed from: o */
    public int f7814o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f7815p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf0(Object obj, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f7813n = i;
        this.f7815p = obj;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f7813n;
        kf1 kf1Var = kf1.f4365a;
        InterfaceC0476mn interfaceC0476mn = (InterfaceC0476mn) obj;
        InterfaceC0808vm interfaceC0808vm = (InterfaceC0808vm) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((uf0) mo1491k(interfaceC0808vm, interfaceC0476mn)).mo17m(kf1Var);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f7813n;
        Object obj2 = this.f7815p;
        switch (i) {
            case 0:
                return new uf0((wf0) obj2, interfaceC0808vm, 0);
            default:
                return new uf0((en0) obj2, interfaceC0808vm, 1);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        int i = this.f7813n;
        Object obj2 = this.f7815p;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        switch (i) {
            case 0:
                int i2 = this.f7814o;
                if (i2 == 0) {
                    wo1.m5395v(obj);
                    t10 t10VarMo2854f = ((wf0) obj2).f8535c.mo2854f();
                    this.f7814o = 1;
                    obj = oa2.m3657d(t10VarMo2854f, this);
                    if (obj == enumC0513nn) {
                        return enumC0513nn;
                    }
                } else {
                    if (i2 != 1) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wo1.m5395v(obj);
                }
                zq0 zq0Var = (zq0) obj;
                return zq0Var != null ? zq0Var.m6022a() : C0448lw.f4914j;
            default:
                int i3 = this.f7814o;
                if (i3 != 0) {
                    if (i3 == 1) {
                        wo1.m5395v(obj);
                        return obj;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
                gn0 gn0Var = ((en0) obj2).f2146a;
                this.f7814o = 1;
                Object objM2136v = gn0Var.m2136v(this);
                return objM2136v == enumC0513nn ? enumC0513nn : objM2136v;
        }
    }
}
