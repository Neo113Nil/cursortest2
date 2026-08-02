package p000;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi0 f9308a;

    public yi0(zi0 zi0Var) {
        this.f9308a = zi0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        zi0 zi0Var = this.f9308a;
        wi0 wi0Var = zi0Var.f9796z;
        C0275h6 c0275h6 = zi0Var.f9779H;
        if (i != 1 || c0275h6.getInputMethodMode() == 2 || c0275h6.getContentView() == null) {
            return;
        }
        zi0Var.f9775D.removeCallbacks(wi0Var);
        wi0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
