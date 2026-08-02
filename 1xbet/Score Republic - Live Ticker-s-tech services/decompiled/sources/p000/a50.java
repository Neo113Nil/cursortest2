package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a50 extends o80 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ c50 f40n;

    public a50(c50 c50Var) {
        this.f40n = c50Var;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: t */
    public final View mo24t(int i) {
        c50 c50Var = this.f40n;
        View view = c50Var.f1112P;
        if (view != null) {
            return view.findViewById(i);
        }
        C0042ay.m526c(c50Var, " does not have a view", "Fragment ");
        return null;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: u */
    public final boolean mo25u() {
        return this.f40n.f1112P != null;
    }
}
