package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b20 implements u10 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f686j = 0;

    /* JADX INFO: renamed from: k */
    public final Object f687k;

    /* JADX INFO: renamed from: l */
    public final Object f688l;

    /* JADX INFO: renamed from: m */
    public final xb1 f689m;

    public b20(u10 u10Var, InterfaceC0180en interfaceC0180en) {
        this.f687k = interfaceC0180en;
        this.f688l = vt1.m5198m(interfaceC0180en);
        this.f689m = new C0662ro(u10Var, null, 7);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // p000.u10
    /* JADX INFO: renamed from: j */
    public final Object mo583j(Object obj, InterfaceC0808vm interfaceC0808vm) {
        a20 a20Var;
        int i = this.f686j;
        kf1 kf1Var = kf1.f4365a;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        xb1 xb1Var = this.f689m;
        Object obj2 = this.f688l;
        Object obj3 = this.f687k;
        switch (i) {
            case 0:
                if (interfaceC0808vm instanceof a20) {
                    a20Var = (a20) interfaceC0808vm;
                    int i2 = a20Var.f23q;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        a20Var.f23q = i2 - Integer.MIN_VALUE;
                    } else {
                        a20Var = new a20(this, interfaceC0808vm);
                    }
                } else {
                    a20Var = new a20(this, interfaceC0808vm);
                }
                Object objMo1490g = a20Var.f21o;
                int i3 = a20Var.f23q;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj = a20Var.f20n;
                            this = a20Var.f19m;
                            wo1.m5395v(objMo1490g);
                        } else if (i3 != 3) {
                            C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    wo1.m5395v(objMo1490g);
                    return kf1Var;
                }
                wo1.m5395v(objMo1490g);
                if (((i01) obj3).f3369j) {
                    a20Var.f23q = 1;
                    if (((u10) obj2).mo583j(obj, a20Var) != enumC0513nn) {
                        return kf1Var;
                    }
                } else {
                    a20Var.f19m = this;
                    a20Var.f20n = obj;
                    a20Var.f23q = 2;
                    objMo1490g = ((C0257gp) xb1Var).mo1490g(obj, a20Var);
                    if (objMo1490g != enumC0513nn) {
                    }
                }
                return enumC0513nn;
                if (((Boolean) objMo1490g).booleanValue()) {
                    return kf1Var;
                }
                ((i01) this.f687k).f3369j = true;
                u10 u10Var = (u10) this.f688l;
                a20Var.f19m = null;
                a20Var.f20n = null;
                a20Var.f23q = 3;
                if (u10Var.mo583j(obj, a20Var) != enumC0513nn) {
                    return kf1Var;
                }
                return enumC0513nn;
            default:
                Object objM3018r = kd0.m3018r((InterfaceC0180en) obj3, obj, obj2, (C0662ro) xb1Var, interfaceC0808vm);
                return objM3018r == enumC0513nn ? objM3018r : kf1Var;
        }
    }

    public b20(i01 i01Var, u10 u10Var, C0257gp c0257gp) {
        this.f687k = i01Var;
        this.f688l = u10Var;
        this.f689m = c0257gp;
    }
}
