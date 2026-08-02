package p000;

import android.view.Window;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0384k5 implements InterfaceC0327im, do0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LayoutInflaterFactory2C0828w5 f4285j;

    public /* synthetic */ C0384k5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5) {
        this.f4285j = layoutInflaterFactory2C0828w5;
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: b */
    public void mo609b(on0 on0Var, boolean z) {
        C0791v5 c0791v5;
        on0 on0VarMo2020k = on0Var.mo2020k();
        int i = 0;
        boolean z2 = on0VarMo2020k != on0Var;
        if (z2) {
            on0Var = on0VarMo2020k;
        }
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f4285j;
        C0791v5[] c0791v5Arr = layoutInflaterFactory2C0828w5.f8404T;
        int length = c0791v5Arr != null ? c0791v5Arr.length : 0;
        while (true) {
            if (i < length) {
                c0791v5 = c0791v5Arr[i];
                if (c0791v5 != null && c0791v5.f8079h == on0Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                c0791v5 = null;
                break;
            }
        }
        if (c0791v5 != null) {
            if (!z2) {
                layoutInflaterFactory2C0828w5.m5249r(c0791v5, z);
            } else {
                layoutInflaterFactory2C0828w5.m5247p(c0791v5.f8072a, c0791v5, on0VarMo2020k);
                layoutInflaterFactory2C0828w5.m5249r(c0791v5, true);
            }
        }
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: q */
    public boolean mo621q(on0 on0Var) {
        Window.Callback callback;
        if (on0Var != on0Var.mo2020k()) {
            return true;
        }
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f4285j;
        if (!layoutInflaterFactory2C0828w5.f8398N || (callback = layoutInflaterFactory2C0828w5.f8428u.getCallback()) == null || layoutInflaterFactory2C0828w5.f8409Y) {
            return true;
        }
        callback.onMenuOpened(108, on0Var);
        return true;
    }
}
