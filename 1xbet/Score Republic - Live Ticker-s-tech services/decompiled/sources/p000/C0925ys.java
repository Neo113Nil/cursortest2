package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: ys */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0925ys extends o80 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ a50 f9452n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0962zs f9453o;

    public C0925ys(DialogInterfaceOnCancelListenerC0962zs dialogInterfaceOnCancelListenerC0962zs, a50 a50Var) {
        this.f9453o = dialogInterfaceOnCancelListenerC0962zs;
        this.f9452n = a50Var;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: t */
    public final View mo24t(int i) {
        a50 a50Var = this.f9452n;
        if (a50Var.mo25u()) {
            return a50Var.mo24t(i);
        }
        Dialog dialog = this.f9453o.f9934o0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: u */
    public final boolean mo25u() {
        return this.f9452n.mo25u() || this.f9453o.f9938s0;
    }
}
