package p000;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public jg0 f7154a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f7155b;

    public sn0(vn0 vn0Var, ActionProvider actionProvider) {
        this.f7155b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        jg0 jg0Var = this.f7154a;
        if (jg0Var != null) {
            on0 on0Var = ((rn0) jg0Var.f3922k).f6916w;
            on0Var.f5806q = true;
            on0Var.m3712p(true);
        }
    }
}
