package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0421l5 extends m80 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f4677p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f4678q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0421l5(int i, Object obj) {
        super(10);
        this.f4677p = i;
        this.f4678q = obj;
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: a */
    public final void mo1067a() {
        int i = this.f4677p;
        Object obj = this.f4678q;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = ((RunnableC0311i5) obj).f3436k;
                layoutInflaterFactory2C0828w5.f8388D.setAlpha(1.0f);
                layoutInflaterFactory2C0828w5.f8391G.m2915d(null);
                layoutInflaterFactory2C0828w5.f8391G = null;
                break;
            case 1:
                LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w6 = (LayoutInflaterFactory2C0828w5) obj;
                layoutInflaterFactory2C0828w6.f8388D.setAlpha(1.0f);
                layoutInflaterFactory2C0828w6.f8391G.m2915d(null);
                layoutInflaterFactory2C0828w6.f8391G = null;
                break;
            default:
                LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w7 = (LayoutInflaterFactory2C0828w5) ((C0312i6) obj).f3448l;
                layoutInflaterFactory2C0828w7.f8388D.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C0828w7.f8389E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0828w7.f8388D.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0828w7.f8388D.getParent();
                    WeakHashMap weakHashMap = ai1.f194a;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C0828w7.f8388D.m342e();
                layoutInflaterFactory2C0828w7.f8391G.m2915d(null);
                layoutInflaterFactory2C0828w7.f8391G = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0828w7.f8393I;
                WeakHashMap weakHashMap2 = ai1.f194a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // p000.m80, p000.li1
    /* JADX INFO: renamed from: d */
    public void mo1069d() {
        int i = this.f4677p;
        Object obj = this.f4678q;
        switch (i) {
            case 0:
                ((RunnableC0311i5) obj).f3436k.f8388D.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) obj;
                layoutInflaterFactory2C0828w5.f8388D.setVisibility(0);
                if (layoutInflaterFactory2C0828w5.f8388D.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0828w5.f8388D.getParent();
                    WeakHashMap weakHashMap = ai1.f194a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
