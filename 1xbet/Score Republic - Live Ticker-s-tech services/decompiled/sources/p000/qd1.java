package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6474j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Toolbar f6475k;

    public /* synthetic */ qd1(Toolbar toolbar, int i) {
        this.f6474j = i;
        this.f6475k = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6474j;
        Toolbar toolbar = this.f6475k;
        switch (i) {
            case 0:
                sd1 sd1Var = toolbar.f436U;
                rn0 rn0Var = sd1Var == null ? null : sd1Var.f7099k;
                if (rn0Var != null) {
                    rn0Var.collapseActionView();
                }
                break;
            default:
                toolbar.m376m();
                break;
        }
    }
}
