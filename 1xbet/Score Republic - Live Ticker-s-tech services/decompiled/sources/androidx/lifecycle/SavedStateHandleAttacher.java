package androidx.lifecycle;

import android.os.Bundle;
import p000.ph0;
import p000.t41;
import p000.uh0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements uh0 {

    /* JADX INFO: renamed from: j */
    public final t41 f547j;

    public SavedStateHandleAttacher(t41 t41Var) {
        this.f547j = t41Var;
    }

    @Override // p000.uh0
    /* JADX INFO: renamed from: d */
    public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
        if (ph0Var != ph0.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + ph0Var).toString());
        }
        yh0Var.mo862d().m442f(this);
        t41 t41Var = this.f547j;
        if (t41Var.f7276b) {
            return;
        }
        Bundle bundleM849c = t41Var.f7275a.m849c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = t41Var.f7277c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM849c != null) {
            bundle.putAll(bundleM849c);
        }
        t41Var.f7277c = bundle;
        t41Var.f7276b = true;
    }
}
