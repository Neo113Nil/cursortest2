package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ew1 extends jw1 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f2191n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ bv1 f2192o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ mw1 f2193p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew1(mw1 mw1Var, bv1 bv1Var, int i) {
        super(mw1Var, true);
        this.f2191n = i;
        switch (i) {
            case 1:
                this.f2192o = bv1Var;
                Objects.requireNonNull(mw1Var);
                this.f2193p = mw1Var;
                super(mw1Var, true);
                break;
            case 2:
                this.f2192o = bv1Var;
                Objects.requireNonNull(mw1Var);
                this.f2193p = mw1Var;
                super(mw1Var, true);
                break;
            default:
                this.f2192o = bv1Var;
                Objects.requireNonNull(mw1Var);
                this.f2193p = mw1Var;
                break;
        }
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: a */
    public final void mo492a() {
        switch (this.f2191n) {
            case 0:
                ev1 ev1Var = this.f2193p.f5174f;
                p80.m3863h(ev1Var);
                ev1Var.getGmpAppId(this.f2192o);
                break;
            case 1:
                ev1 ev1Var2 = this.f2193p.f5174f;
                p80.m3863h(ev1Var2);
                ev1Var2.getCachedAppInstanceId(this.f2192o);
                break;
            case 2:
                ev1 ev1Var3 = this.f2193p.f5174f;
                p80.m3863h(ev1Var3);
                ev1Var3.generateEventId(this.f2192o);
                break;
            case 3:
                ev1 ev1Var4 = this.f2193p.f5174f;
                p80.m3863h(ev1Var4);
                ev1Var4.getCurrentScreenName(this.f2192o);
                break;
            default:
                ev1 ev1Var5 = this.f2193p.f5174f;
                p80.m3863h(ev1Var5);
                ev1Var5.getCurrentScreenClass(this.f2192o);
                break;
        }
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: b */
    public final void mo493b() {
        int i = this.f2191n;
        bv1 bv1Var = this.f2192o;
        switch (i) {
            case 0:
                bv1Var.mo785n(null);
                break;
            case 1:
                bv1Var.mo785n(null);
                break;
            case 2:
                bv1Var.mo785n(null);
                break;
            case 3:
                bv1Var.mo785n(null);
                break;
            default:
                bv1Var.mo785n(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew1(mw1 mw1Var, bv1 bv1Var, int i, boolean z) {
        super(mw1Var, true);
        this.f2191n = i;
        this.f2192o = bv1Var;
        this.f2193p = mw1Var;
    }
}
