package p000;

/* JADX INFO: renamed from: ep */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0182ep extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f2153n;

    /* JADX INFO: renamed from: o */
    public int f2154o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0848wp f2155p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0182ep(C0848wp c0848wp, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f2153n = i;
        this.f2155p = c0848wp;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f2153n;
        kf1 kf1Var = kf1.f4365a;
        switch (i) {
            case 0:
                return ((C0182ep) mo1491k((InterfaceC0808vm) obj2, (u10) obj)).mo17m(kf1Var);
            case 1:
                return ((C0182ep) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            default:
                return ((C0182ep) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f2153n;
        C0848wp c0848wp = this.f2155p;
        switch (i) {
            case 0:
                return new C0182ep(c0848wp, interfaceC0808vm, 0);
            case 1:
                return new C0182ep(c0848wp, interfaceC0808vm, 1);
            default:
                return new C0182ep(c0848wp, interfaceC0808vm, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r10 == r6) goto L20;
     */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17m(Object obj) throws Throwable {
        int i = this.f2153n;
        kf1 kf1Var = kf1.f4365a;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        C0848wp c0848wp = this.f2155p;
        switch (i) {
            case 0:
                int i2 = this.f2154o;
                if (i2 == 0) {
                    wo1.m5395v(obj);
                    this.f2154o = 1;
                    return C0848wp.m5402c(c0848wp, this) == enumC0513nn ? enumC0513nn : kf1Var;
                }
                if (i2 == 1) {
                    wo1.m5395v(obj);
                    return kf1Var;
                }
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f2154o;
                if (i3 == 0) {
                    wo1.m5395v(obj);
                    f71 f71Var = c0848wp.f8614r;
                    this.f2154o = 1;
                    Object objM2651a0 = ((C0324ij) f71Var.f2335l).m2651a0(this);
                    if (objM2651a0 != enumC0513nn) {
                        objM2651a0 = kf1Var;
                    }
                    if (objM2651a0 != enumC0513nn) {
                    }
                    return enumC0513nn;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        wo1.m5395v(obj);
                        return kf1Var;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
                t10 t10Var = c0848wp.m5405h().f2648c;
                boolean z = t10Var instanceof i70;
                C0301hw c0301hw = C0301hw.f3348j;
                EnumC0576pc enumC0576pc = EnumC0576pc.f6081k;
                t10 t10VarMo1141h = z ? ((i70) t10Var).mo1141h(c0301hw, 0, enumC0576pc) : new C0838wf(t10Var, c0301hw, 0, enumC0576pc);
                C0367jp c0367jp = new C0367jp(1, c0848wp);
                this.f2154o = 2;
                if (t10VarMo1141h.mo622r(c0367jp, this) != enumC0513nn) {
                    return kf1Var;
                }
                return enumC0513nn;
            default:
                nu1 nu1Var = c0848wp.f8613q;
                int i4 = this.f2154o;
                try {
                    if (i4 == 0) {
                        wo1.m5395v(obj);
                        if (nu1Var.m3591l() instanceof r00) {
                            return nu1Var.m3591l();
                        }
                        this.f2154o = 1;
                        if (c0848wp.m5406i(this) != enumC0513nn) {
                        }
                        return enumC0513nn;
                    }
                    if (i4 == 1) {
                        wo1.m5395v(obj);
                    } else {
                        if (i4 != 2) {
                            C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wo1.m5395v(obj);
                    }
                    return (aa1) obj;
                    this.f2154o = 2;
                    obj = C0848wp.m5403e(c0848wp, false, this);
                } catch (Throwable th) {
                    return new a01(th, -1);
                }
                break;
        }
    }
}
