package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 implements lj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7393a;

    /* JADX INFO: renamed from: b */
    public final Object f7394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7395c;

    public /* synthetic */ ta0(int i, Object obj, Object obj2) {
        this.f7393a = i;
        this.f7395c = obj;
        this.f7394b = obj2;
    }

    @Override // p000.lj0
    /* JADX INFO: renamed from: a */
    public final void mo3228a(C0511nl c0511nl) {
        kj0 vv0Var;
        int i = this.f7393a;
        Object obj = this.f7394b;
        Object obj2 = this.f7395c;
        switch (i) {
            case 0:
                ((lj0) obj).mo3228a(c0511nl);
                ((ua0) obj2).f7735x.mo3228a(c0511nl);
                break;
            case 1:
                gv0 gv0Var = (gv0) obj2;
                gv0Var.f2950z = c0511nl;
                if (!gv0Var.f2949y) {
                    ((lj0) obj).mo3228a(c0511nl);
                }
                break;
            default:
                wv0 wv0Var = (wv0) obj2;
                AbstractC0477mo abstractC0477mo = wv0Var.f8707f;
                AbstractC0959zp abstractC0959zp = (AbstractC0959zp) obj;
                EnumC0474ml enumC0474ml = c0511nl.f5453a;
                if (enumC0474ml != EnumC0474ml.f5075n) {
                    EnumC0474ml enumC0474ml2 = EnumC0474ml.f5074m;
                    EnumC0474ml enumC0474ml3 = EnumC0474ml.f5073l;
                    if (enumC0474ml == enumC0474ml3 || enumC0474ml == enumC0474ml2) {
                        abstractC0477mo.mo964m();
                    }
                    if (wv0Var.f8709h == enumC0474ml3) {
                        if (enumC0474ml != EnumC0474ml.f5071j) {
                            if (enumC0474ml == enumC0474ml2) {
                                wv0Var.mo3397e();
                            }
                            break;
                        }
                    }
                    int iOrdinal = enumC0474ml.ordinal();
                    if (iOrdinal == 0) {
                        vv0Var = new vv0(ij0.f3585e);
                    } else if (iOrdinal == 1) {
                        vv0Var = new vv0(ij0.m2653b(abstractC0959zp, null));
                    } else if (iOrdinal == 2) {
                        vv0Var = new vv0(ij0.m2652a(c0511nl.f5454b));
                    } else if (iOrdinal != 3) {
                        dd0.m1167m(enumC0474ml, "Unsupported state:");
                    } else {
                        vv0Var = new rv0(wv0Var, abstractC0959zp);
                    }
                    wv0Var.f8709h = enumC0474ml;
                    abstractC0477mo.mo965o(enumC0474ml, vv0Var);
                    break;
                }
                break;
        }
    }
}
