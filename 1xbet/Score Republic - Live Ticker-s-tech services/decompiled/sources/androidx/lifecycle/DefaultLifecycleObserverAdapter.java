package androidx.lifecycle;

import p000.AbstractC0775uq;
import p000.C0270h1;
import p000.InterfaceC0738tq;
import p000.ph0;
import p000.uh0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements uh0 {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0738tq f541j;

    /* JADX INFO: renamed from: k */
    public final uh0 f542k;

    public DefaultLifecycleObserverAdapter(InterfaceC0738tq interfaceC0738tq, uh0 uh0Var) {
        this.f541j = interfaceC0738tq;
        this.f542k = uh0Var;
    }

    @Override // p000.uh0
    /* JADX INFO: renamed from: d */
    public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
        int i = AbstractC0775uq.f7885a[ph0Var.ordinal()];
        InterfaceC0738tq interfaceC0738tq = this.f541j;
        if (i == 1) {
            interfaceC0738tq.mo1019c(yh0Var);
        } else if (i == 3) {
            interfaceC0738tq.mo415a(yh0Var);
        } else if (i == 6) {
            interfaceC0738tq.onDestroy(yh0Var);
        } else if (i == 7) {
            C0270h1.m2190f("ON_ANY must not been send by anybody");
            return;
        }
        uh0 uh0Var = this.f542k;
        if (uh0Var != null) {
            uh0Var.mo328d(yh0Var, ph0Var);
        }
    }
}
