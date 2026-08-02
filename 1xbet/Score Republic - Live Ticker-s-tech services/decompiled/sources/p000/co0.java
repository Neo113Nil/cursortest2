package p000;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class co0 extends zi0 implements qn0 {

    /* JADX INFO: renamed from: I */
    public nu1 f1302I;

    @Override // p000.qn0
    /* JADX INFO: renamed from: h */
    public final void mo980h(on0 on0Var, MenuItem menuItem) {
        nu1 nu1Var = this.f1302I;
        if (nu1Var != null) {
            nu1Var.mo980h(on0Var, menuItem);
        }
    }

    @Override // p000.qn0
    /* JADX INFO: renamed from: j */
    public final void mo981j(on0 on0Var, rn0 rn0Var) {
        nu1 nu1Var = this.f1302I;
        if (nu1Var != null) {
            nu1Var.mo981j(on0Var, rn0Var);
        }
    }

    @Override // p000.zi0
    /* JADX INFO: renamed from: q */
    public final C0151dv mo982q(Context context, boolean z) {
        bo0 bo0Var = new bo0(context, z);
        bo0Var.setHoverListener(this);
        return bo0Var;
    }
}
