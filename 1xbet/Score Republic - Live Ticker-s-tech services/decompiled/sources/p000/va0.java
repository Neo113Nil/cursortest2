package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class va0 extends x40 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8148h;

    /* JADX INFO: renamed from: i */
    public final Object f8149i;

    public /* synthetic */ va0(int i, Object obj) {
        this.f8148h = i;
        this.f8149i = obj;
    }

    @Override // p000.x40, p000.AbstractC0477mo
    /* JADX INFO: renamed from: a */
    public AbstractC0959zp mo960a(hj0 hj0Var) {
        switch (this.f8148h) {
            case 0:
                lj0 lj0Var = (lj0) hj0Var.m2273c();
                AbstractC0959zp abstractC0959zpMo960a = super.mo960a(hj0Var);
                if (lj0Var != null) {
                    return abstractC0959zpMo960a.mo2156e().f8455a.get(mj0.f5056d) == null ? new ua0(abstractC0959zpMo960a, lj0Var) : abstractC0959zpMo960a;
                }
                return abstractC0959zpMo960a;
            default:
                return super.mo960a(hj0Var);
        }
    }

    @Override // p000.x40, p000.AbstractC0477mo
    /* JADX INFO: renamed from: o */
    public void mo965o(EnumC0474ml enumC0474ml, kj0 kj0Var) {
        switch (this.f8148h) {
            case 1:
                qq0 qq0Var = (qq0) this.f8149i;
                u31 u31Var = qq0Var.f6567g;
                if (u31Var.f7662f.containsKey(qq0Var.f6561a)) {
                    qq0Var.f6564d = enumC0474ml;
                    qq0Var.f6565e = kj0Var;
                    if (!qq0Var.f6566f && !u31Var.f7664h) {
                        if (enumC0474ml == EnumC0474ml.f5074m) {
                            qq0Var.f6562b.mo3397e();
                        }
                        u31Var.m4873j();
                        break;
                    }
                }
                break;
            default:
                super.mo965o(enumC0474ml, kj0Var);
                break;
        }
    }

    @Override // p000.x40
    /* JADX INFO: renamed from: q */
    public final AbstractC0477mo mo4281q() {
        int i = this.f8148h;
        Object obj = this.f8149i;
        switch (i) {
            case 0:
                return (AbstractC0477mo) obj;
            default:
                return ((qq0) obj).f6567g.f7663g;
        }
    }
}
