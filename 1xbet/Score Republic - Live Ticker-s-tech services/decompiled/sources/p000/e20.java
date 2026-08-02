package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e20 implements u10 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0219fp f1908j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ u10 f1909k;

    public e20(C0219fp c0219fp, u10 u10Var) {
        this.f1908j = c0219fp;
        this.f1909k = u10Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r8.mo583j(r7, r0) == r5) goto L23;
     */
    @Override // p000.u10
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo583j(Object obj, InterfaceC0808vm interfaceC0808vm) {
        d20 d20Var;
        if (interfaceC0808vm instanceof d20) {
            d20Var = (d20) interfaceC0808vm;
            int i = d20Var.f1524o;
            if ((i & Integer.MIN_VALUE) != 0) {
                d20Var.f1524o = i - Integer.MIN_VALUE;
            } else {
                d20Var = new d20(this, interfaceC0808vm);
            }
        } else {
            d20Var = new d20(this, interfaceC0808vm);
        }
        Object objMo1490g = d20Var.f1523n;
        int i2 = d20Var.f1524o;
        boolean z = true;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        if (i2 == 0) {
            wo1.m5395v(objMo1490g);
            d20Var.f1522m = this;
            d20Var.f1526q = obj;
            d20Var.f1524o = 1;
            objMo1490g = this.f1908j.mo1490g(obj, d20Var);
            if (objMo1490g != enumC0513nn) {
            }
            return enumC0513nn;
        }
        if (i2 == 1) {
            obj = d20Var.f1526q;
            this = d20Var.f1522m;
            wo1.m5395v(objMo1490g);
        } else {
            if (i2 != 2) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = d20Var.f1522m;
            wo1.m5395v(objMo1490g);
        }
        if (z) {
            return kf1.f4365a;
        }
        throw new C0080c(this);
        if (((Boolean) objMo1490g).booleanValue()) {
            u10 u10Var = this.f1909k;
            d20Var.f1522m = this;
            d20Var.f1526q = null;
            d20Var.f1524o = 2;
        } else {
            z = false;
        }
        if (z) {
            return kf1.f4365a;
        }
        throw new C0080c(this);
    }
}
