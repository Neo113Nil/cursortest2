package com.zhuinden.fragmentviewbindingdelegatekt;

import androidx.lifecycle.C0031b;
import live.football.scorerepublic.WebViewFragment;
import p000.InterfaceC0738tq;
import p000.b90;
import p000.f50;
import p000.gj0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentViewBindingDelegate$1 implements InterfaceC0738tq {

    /* JADX INFO: renamed from: j */
    public final b90 f1404j = new b90(24, this);

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ f50 f1405k;

    public FragmentViewBindingDelegate$1(f50 f50Var) {
        this.f1405k = f50Var;
    }

    @Override // p000.InterfaceC0738tq
    /* JADX INFO: renamed from: c */
    public final void mo1019c(yh0 yh0Var) {
        ((WebViewFragment) this.f1405k.f2314l).f1122Z.m447d(this.f1404j);
    }

    @Override // p000.InterfaceC0738tq
    public final void onDestroy(yh0 yh0Var) {
        C0031b c0031b = ((WebViewFragment) this.f1405k.f2314l).f1122Z;
        c0031b.getClass();
        C0031b.m444a("removeObserver");
        gj0 gj0Var = (gj0) c0031b.f559b.mo2354c(this.f1404j);
        if (gj0Var == null) {
            return;
        }
        gj0Var.mo435e();
        gj0Var.m2100b(false);
    }
}
