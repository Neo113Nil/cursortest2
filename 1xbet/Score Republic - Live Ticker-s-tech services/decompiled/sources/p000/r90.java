package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r90 extends x40 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6751h = 1;

    /* JADX INFO: renamed from: i */
    public Object f6752i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ mj0 f6753j;

    public r90(hv0 hv0Var, AbstractC0477mo abstractC0477mo) {
        this.f6753j = hv0Var;
        this.f6752i = new va0(0, abstractC0477mo);
    }

    @Override // p000.x40, p000.AbstractC0477mo
    /* JADX INFO: renamed from: a */
    public AbstractC0959zp mo960a(hj0 hj0Var) {
        switch (this.f6751h) {
            case 1:
                hv0 hv0Var = (hv0) this.f6753j;
                zu0 zu0Var = hv0Var.f3340f;
                gv0 gv0Var = new gv0(hv0Var, hj0Var, (va0) this.f6752i);
                List list = hj0Var.f3222b;
                if (hv0.m2339g(list)) {
                    if (zu0Var.f9963p.containsKey(((C0190ex) list.get(0)).f2195a.get(0))) {
                        yu0 yu0Var = (yu0) zu0Var.f9963p.get(((C0190ex) list.get(0)).f2195a.get(0));
                        yu0Var.m5834a(gv0Var);
                        if (yu0Var.f9470d != null) {
                            gv0Var.m2155H();
                        }
                    }
                }
                return gv0Var;
            default:
                return super.mo960a(hj0Var);
        }
    }

    @Override // p000.x40, p000.AbstractC0477mo
    /* JADX INFO: renamed from: o */
    public final void mo965o(EnumC0474ml enumC0474ml, kj0 kj0Var) {
        switch (this.f6751h) {
            case 0:
                mj0 mj0Var = (mj0) this.f6752i;
                s90 s90Var = (s90) this.f6753j;
                mj0 mj0Var2 = s90Var.f7066k;
                EnumC0474ml enumC0474ml2 = EnumC0474ml.f5072k;
                if (mj0Var == mj0Var2) {
                    a90.m132p("there's pending lb while current lb has been out of READY", s90Var.f7069n);
                    s90Var.f7067l = enumC0474ml;
                    s90Var.f7068m = kj0Var;
                    if (enumC0474ml == enumC0474ml2) {
                        s90Var.m4507h();
                    }
                } else if (mj0Var == s90Var.f7064i) {
                    boolean z = enumC0474ml == enumC0474ml2;
                    s90Var.f7069n = z;
                    if (z || mj0Var2 == s90Var.f7061f) {
                        s90Var.f7062g.mo965o(enumC0474ml, kj0Var);
                    } else {
                        s90Var.m4507h();
                    }
                }
                break;
            default:
                ((va0) this.f6752i).mo965o(enumC0474ml, new vv0(kj0Var));
                break;
        }
    }

    @Override // p000.x40
    /* JADX INFO: renamed from: q */
    public final AbstractC0477mo mo4281q() {
        switch (this.f6751h) {
            case 0:
                return ((s90) this.f6753j).f7062g;
            default:
                return (va0) this.f6752i;
        }
    }

    public r90(s90 s90Var) {
        this.f6753j = s90Var;
    }
}
