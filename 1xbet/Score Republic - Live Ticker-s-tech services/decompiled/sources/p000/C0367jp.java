package p000;

/* JADX INFO: renamed from: jp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0367jp implements u10 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4059j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f4060k;

    public /* synthetic */ C0367jp(int i, Object obj) {
        this.f4059j = i;
        this.f4060k = obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // p000.u10
    /* JADX INFO: renamed from: j */
    public final Object mo583j(Object obj, InterfaceC0808vm interfaceC0808vm) throws Throwable {
        C0330ip c0330ip;
        Object objM5403e;
        int i = this.f4059j;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        kf1 kf1Var = kf1.f4365a;
        Object obj2 = this.f4060k;
        switch (i) {
            case 0:
                if (interfaceC0808vm instanceof C0330ip) {
                    c0330ip = (C0330ip) interfaceC0808vm;
                    int i2 = c0330ip.f3631n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0330ip.f3631n = i2 - Integer.MIN_VALUE;
                    } else {
                        c0330ip = new C0330ip(this, interfaceC0808vm);
                    }
                } else {
                    c0330ip = new C0330ip(this, interfaceC0808vm);
                }
                Object obj3 = c0330ip.f3630m;
                int i3 = c0330ip.f3631n;
                if (i3 != 0) {
                    if (i3 == 1) {
                        wo1.m5395v(obj3);
                        return kf1Var;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj3);
                u10 u10Var = (u10) obj2;
                aa1 aa1Var = (aa1) obj;
                if (aa1Var instanceof a01) {
                    throw ((a01) aa1Var).f6b;
                }
                if (!(aa1Var instanceof C0329io)) {
                    if (!(aa1Var instanceof r00 ? true : aa1Var instanceof ef1)) {
                        throw new C0694sj(5);
                    }
                    C0270h1.m2191g("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                Object obj4 = ((C0329io) aa1Var).f3624b;
                c0330ip.f3631n = 1;
                if (u10Var.mo583j(obj4, c0330ip) == enumC0513nn) {
                    return enumC0513nn;
                }
                return kf1Var;
            case 1:
                C0848wp c0848wp = (C0848wp) obj2;
                return ((c0848wp.f8613q.m3591l() instanceof r00) || (objM5403e = C0848wp.m5403e(c0848wp, true, interfaceC0808vm)) != enumC0513nn) ? kf1Var : objM5403e;
            default:
                ((k01) obj2).f4243j = obj;
                throw new C0080c(this);
        }
    }
}
