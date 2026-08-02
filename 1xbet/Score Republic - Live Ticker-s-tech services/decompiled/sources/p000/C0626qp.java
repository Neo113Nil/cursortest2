package p000;

/* JADX INFO: renamed from: qp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0626qp extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f6554n;

    /* JADX INFO: renamed from: o */
    public int f6555o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ boolean f6556p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0848wp f6557q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f6558r;

    /* JADX INFO: renamed from: s */
    public Object f6559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0626qp(C0848wp c0848wp, int i, InterfaceC0808vm interfaceC0808vm, int i2) {
        super(2, interfaceC0808vm);
        this.f6554n = i2;
        this.f6557q = c0848wp;
        this.f6558r = i;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f6554n;
        kf1 kf1Var = kf1.f4365a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC0808vm interfaceC0808vm = (InterfaceC0808vm) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C0626qp) mo1491k(interfaceC0808vm, bool)).mo17m(kf1Var);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f6554n;
        int i2 = this.f6558r;
        C0848wp c0848wp = this.f6557q;
        switch (i) {
            case 0:
                C0626qp c0626qp = new C0626qp(c0848wp, i2, interfaceC0808vm, 0);
                c0626qp.f6556p = ((Boolean) obj).booleanValue();
                return c0626qp;
            default:
                C0626qp c0626qp2 = new C0626qp(c0848wp, i2, interfaceC0808vm, 1);
                c0626qp2.f6556p = ((Boolean) obj).booleanValue();
                return c0626qp2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        Throwable th;
        aa1 a01Var;
        boolean z;
        boolean z2;
        Object obj2;
        int iHashCode;
        int i = this.f6554n;
        int iIntValue = this.f6558r;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        C0848wp c0848wp = this.f6557q;
        switch (i) {
            case 0:
                boolean z3 = this.f6555o;
                try {
                    if (z3 == 0) {
                        wo1.m5395v(obj);
                        boolean z4 = this.f6556p;
                        this.f6556p = z4;
                        this.f6555o = 1;
                        obj = C0848wp.m5404g(c0848wp, z4, this);
                        z3 = z4;
                        if (obj == enumC0513nn) {
                            return enumC0513nn;
                        }
                    } else {
                        if (z3 != 1) {
                            if (z3 != 2) {
                                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = this.f6556p;
                            th = (Throwable) this.f6559s;
                            wo1.m5395v(obj);
                            z3 = z5;
                            iIntValue = ((Number) obj).intValue();
                            th = th;
                            a01Var = new a01(th, iIntValue);
                            z = z3;
                            return new kv0(a01Var, Boolean.valueOf(z));
                        }
                        boolean z6 = this.f6556p;
                        wo1.m5395v(obj);
                        z3 = z6;
                    }
                    a01Var = (aa1) obj;
                    z = z3;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        g81 g81VarM5405h = c0848wp.m5405h();
                        this.f6559s = th;
                        this.f6556p = z3;
                        this.f6555o = 2;
                        Integer numM1996a = g81VarM5405h.m1996a();
                        if (numM1996a != enumC0513nn) {
                            obj = numM1996a;
                            th = th;
                            z3 = z3;
                        }
                        return enumC0513nn;
                    }
                }
                return new kv0(a01Var, Boolean.valueOf(z));
            default:
                int i2 = this.f6555o;
                if (i2 == 0) {
                    wo1.m5395v(obj);
                    z2 = this.f6556p;
                    this.f6556p = z2;
                    this.f6555o = 1;
                    obj = c0848wp.m5407j(this);
                    if (obj != enumC0513nn) {
                    }
                    return enumC0513nn;
                }
                if (i2 == 1) {
                    z2 = this.f6556p;
                    wo1.m5395v(obj);
                } else {
                    if (i2 != 2) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.f6559s;
                    wo1.m5395v(obj);
                }
                iIntValue = ((Number) obj).intValue();
                obj = obj2;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new C0329io(obj, iHashCode, iIntValue);
                if (z2) {
                    g81 g81VarM5405h2 = c0848wp.m5405h();
                    this.f6559s = obj;
                    this.f6555o = 2;
                    Integer numM1996a2 = g81VarM5405h2.m1996a();
                    if (numM1996a2 != enumC0513nn) {
                        Object obj3 = obj;
                        obj = numM1996a2;
                        obj2 = obj3;
                        iIntValue = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return enumC0513nn;
                }
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new C0329io(obj, iHashCode, iIntValue);
        }
    }
}
