package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class aw1 extends jw1 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f648n = 0;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ String f649o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ String f650p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ mw1 f651q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f652r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(mw1 mw1Var, String str, String str2, Bundle bundle) {
        super(mw1Var, true);
        this.f649o = str;
        this.f650p = str2;
        this.f652r = bundle;
        Objects.requireNonNull(mw1Var);
        this.f651q = mw1Var;
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: a */
    public final void mo492a() {
        switch (this.f648n) {
            case 0:
                ev1 ev1Var = this.f651q.f5174f;
                p80.m3863h(ev1Var);
                ev1Var.clearConditionalUserProperty(this.f649o, this.f650p, (Bundle) this.f652r);
                break;
            case 1:
                ev1 ev1Var2 = this.f651q.f5174f;
                p80.m3863h(ev1Var2);
                ev1Var2.getConditionalUserProperties(this.f649o, this.f650p, (bv1) this.f652r);
                break;
            default:
                ev1 ev1Var3 = this.f651q.f5174f;
                p80.m3863h(ev1Var3);
                ev1Var3.setCurrentScreenByScionActivityInfo((xv1) this.f652r, this.f649o, this.f650p, this.f4100j);
                break;
        }
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: b */
    public void mo493b() {
        switch (this.f648n) {
            case 1:
                ((bv1) this.f652r).mo785n(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(mw1 mw1Var, String str, String str2, bv1 bv1Var) {
        super(mw1Var, true);
        this.f649o = str;
        this.f650p = str2;
        this.f652r = bv1Var;
        Objects.requireNonNull(mw1Var);
        this.f651q = mw1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(mw1 mw1Var, xv1 xv1Var, String str, String str2) {
        super(mw1Var, true);
        this.f652r = xv1Var;
        this.f649o = str;
        this.f650p = str2;
        Objects.requireNonNull(mw1Var);
        this.f651q = mw1Var;
    }
}
