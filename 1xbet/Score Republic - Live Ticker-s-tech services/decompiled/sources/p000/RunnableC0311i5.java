package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0311i5 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3435j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ LayoutInflaterFactory2C0828w5 f3436k;

    public /* synthetic */ RunnableC0311i5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5, int i) {
        this.f3435j = i;
        this.f3436k = layoutInflaterFactory2C0828w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f3435j;
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f3436k;
        switch (i) {
            case 0:
                if ((layoutInflaterFactory2C0828w5.f8418h0 & 1) != 0) {
                    layoutInflaterFactory2C0828w5.m5251u(0);
                }
                if ((layoutInflaterFactory2C0828w5.f8418h0 & 4096) != 0) {
                    layoutInflaterFactory2C0828w5.m5251u(108);
                }
                layoutInflaterFactory2C0828w5.f8417g0 = false;
                layoutInflaterFactory2C0828w5.f8418h0 = 0;
                break;
            default:
                layoutInflaterFactory2C0828w5.f8389E.showAtLocation(layoutInflaterFactory2C0828w5.f8388D, 55, 0, 0);
                ji1 ji1Var = layoutInflaterFactory2C0828w5.f8391G;
                if (ji1Var != null) {
                    ji1Var.m2913b();
                }
                if (layoutInflaterFactory2C0828w5.f8392H && (viewGroup = layoutInflaterFactory2C0828w5.f8393I) != null && viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C0828w5.f8388D.setAlpha(0.0f);
                    ji1 ji1VarM248a = ai1.m248a(layoutInflaterFactory2C0828w5.f8388D);
                    ji1VarM248a.m2912a(1.0f);
                    layoutInflaterFactory2C0828w5.f8391G = ji1VarM248a;
                    ji1VarM248a.m2915d(new C0421l5(0, this));
                } else {
                    layoutInflaterFactory2C0828w5.f8388D.setAlpha(1.0f);
                    layoutInflaterFactory2C0828w5.f8388D.setVisibility(0);
                }
                break;
        }
    }
}
