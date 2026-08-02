package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y10 implements t10 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ b90 f9128j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0294hp f9129k;

    public y10(b90 b90Var, C0294hp c0294hp) {
        this.f9128j = b90Var;
        this.f9129k = c0294hp;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.t10
    /* JADX INFO: renamed from: r */
    public final Object mo622r(u10 u10Var, AbstractC0882xm abstractC0882xm) throws Throwable {
        x10 x10Var;
        h41 h41Var;
        h41 h41Var2;
        if (abstractC0882xm instanceof x10) {
            x10Var = (x10) abstractC0882xm;
            int i = x10Var.f8737n;
            if ((i & Integer.MIN_VALUE) != 0) {
                x10Var.f8737n = i - Integer.MIN_VALUE;
            } else {
                x10Var = new x10(this, abstractC0882xm);
            }
        } else {
            x10Var = new x10(this, abstractC0882xm);
        }
        Object obj = x10Var.f8736m;
        int i2 = x10Var.f8737n;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            try {
                if (i2 == 0) {
                    wo1.m5395v(obj);
                    b90 b90Var = this.f9128j;
                    x10Var.f8739p = this;
                    x10Var.f8740q = u10Var;
                    x10Var.f8737n = 1;
                    if (b90Var.mo622r(u10Var, x10Var) != enumC0513nn) {
                    }
                    return enumC0513nn;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) x10Var.f8739p;
                        wo1.m5395v(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h41Var2 = (h41) x10Var.f8739p;
                    try {
                        wo1.m5395v(obj);
                        h41Var2.mo2013o();
                        return kf1.f4365a;
                    } catch (Throwable th2) {
                        th = th2;
                        h41Var2.mo2013o();
                        throw th;
                    }
                }
                u10Var = x10Var.f8740q;
                this = (y10) x10Var.f8739p;
                wo1.m5395v(obj);
                C0294hp c0294hp = this.f9129k;
                x10Var.f8739p = h41Var;
                x10Var.f8740q = null;
                x10Var.f8737n = 3;
                if (c0294hp.mo928e(h41Var, null, x10Var) != enumC0513nn) {
                    h41Var2 = h41Var;
                    h41Var2.mo2013o();
                    return kf1.f4365a;
                }
            } catch (Throwable th3) {
                th = th3;
                h41Var2 = h41Var;
                h41Var2.mo2013o();
                throw th;
            }
            InterfaceC0180en interfaceC0180en = x10Var.f8992k;
            interfaceC0180en.getClass();
            h41Var = new h41(u10Var, interfaceC0180en);
        } catch (Throwable th4) {
            y10 y10Var = this;
            gd1 gd1Var = new gd1(th4);
            C0294hp c0294hp2 = y10Var.f9129k;
            x10Var.f8739p = th4;
            x10Var.f8740q = null;
            x10Var.f8737n = 2;
            if (AbstractC0875xf.m5646a(gd1Var, c0294hp2, th4, x10Var) != enumC0513nn) {
                throw th4;
            }
        }
        return enumC0513nn;
    }
}
