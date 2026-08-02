package p000;

/* JADX INFO: renamed from: vf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0801vf extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f8187n;

    /* JADX INFO: renamed from: o */
    public int f8188o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f8189p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0838wf f8190q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0801vf(C0838wf c0838wf, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f8187n = i;
        this.f8190q = c0838wf;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f8187n;
        kf1 kf1Var = kf1.f4365a;
        switch (i) {
            case 0:
                return ((C0801vf) mo1491k((InterfaceC0808vm) obj2, (kx0) obj)).mo17m(kf1Var);
            default:
                return ((C0801vf) mo1491k((InterfaceC0808vm) obj2, (u10) obj)).mo17m(kf1Var);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f8187n;
        C0838wf c0838wf = this.f8190q;
        switch (i) {
            case 0:
                C0801vf c0801vf = new C0801vf(c0838wf, interfaceC0808vm, 0);
                c0801vf.f8189p = obj;
                return c0801vf;
            default:
                C0801vf c0801vf2 = new C0801vf(c0838wf, interfaceC0808vm, 1);
                c0801vf2.f8189p = obj;
                return c0801vf2;
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        int i = this.f8187n;
        C0838wf c0838wf = this.f8190q;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        kf1 kf1Var = kf1.f4365a;
        switch (i) {
            case 0:
                int i2 = this.f8188o;
                if (i2 == 0) {
                    wo1.m5395v(obj);
                    kx0 kx0Var = (kx0) this.f8189p;
                    this.f8188o = 1;
                    Object objMo622r = c0838wf.f8531m.mo622r(new q61(kx0Var), this);
                    if (objMo622r != enumC0513nn) {
                        objMo622r = kf1Var;
                    }
                    if (objMo622r != enumC0513nn) {
                        objMo622r = kf1Var;
                    }
                    if (objMo622r == enumC0513nn) {
                        return enumC0513nn;
                    }
                } else {
                    if (i2 != 1) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wo1.m5395v(obj);
                }
                return kf1Var;
            default:
                int i3 = this.f8188o;
                if (i3 == 0) {
                    wo1.m5395v(obj);
                    u10 u10Var = (u10) this.f8189p;
                    this.f8188o = 1;
                    Object objMo622r2 = c0838wf.f8531m.mo622r(u10Var, this);
                    if (objMo622r2 != enumC0513nn) {
                        objMo622r2 = kf1Var;
                    }
                    if (objMo622r2 == enumC0513nn) {
                        return enumC0513nn;
                    }
                } else {
                    if (i3 != 1) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wo1.m5395v(obj);
                }
                return kf1Var;
        }
    }
}
