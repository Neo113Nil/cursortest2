package androidx.lifecycle;

import p000.ph0;
import p000.uh0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements uh0 {

    /* JADX INFO: renamed from: j */
    public boolean f548j;

    @Override // p000.uh0
    /* JADX INFO: renamed from: d */
    public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
        if (ph0Var == ph0.ON_DESTROY) {
            this.f548j = false;
            yh0Var.mo862d().m442f(this);
        }
    }
}
