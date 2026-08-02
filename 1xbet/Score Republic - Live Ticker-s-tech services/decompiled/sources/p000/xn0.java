package p000;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ yn0 f9000j;

    public xn0(yn0 yn0Var) {
        this.f9000j = yn0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9000j.mo3323c();
    }
}
