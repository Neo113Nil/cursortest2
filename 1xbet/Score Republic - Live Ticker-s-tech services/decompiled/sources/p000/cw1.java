package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cw1 extends jw1 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f1474n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ String f1475o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ mw1 f1476p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw1(mw1 mw1Var, String str, int i) {
        super(mw1Var, true);
        this.f1474n = i;
        switch (i) {
            case 1:
                this.f1475o = str;
                Objects.requireNonNull(mw1Var);
                this.f1476p = mw1Var;
                super(mw1Var, true);
                break;
            default:
                this.f1475o = str;
                Objects.requireNonNull(mw1Var);
                this.f1476p = mw1Var;
                break;
        }
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: a */
    public final void mo492a() {
        switch (this.f1474n) {
            case 0:
                ev1 ev1Var = this.f1476p.f5174f;
                p80.m3863h(ev1Var);
                ev1Var.beginAdUnitExposure(this.f1475o, this.f4101k);
                break;
            default:
                ev1 ev1Var2 = this.f1476p.f5174f;
                p80.m3863h(ev1Var2);
                ev1Var2.endAdUnitExposure(this.f1475o, this.f4101k);
                break;
        }
    }
}
