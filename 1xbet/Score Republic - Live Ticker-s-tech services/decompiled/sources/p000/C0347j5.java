package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0347j5 implements xt0, do0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LayoutInflaterFactory2C0828w5 f3820j;

    public /* synthetic */ C0347j5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5) {
        this.f3820j = layoutInflaterFactory2C0828w5;
    }

    /* JADX INFO: renamed from: a */
    public ak1 m2821a(View view, ak1 ak1Var) {
        boolean z;
        oj1 jj1Var;
        boolean z2;
        boolean z3;
        ak1 ak1VarMo2654b = ak1Var;
        xj1 xj1Var = ak1VarMo2654b.f229a;
        int i = xj1Var.mo3938k().f8516b;
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f3820j;
        Context context = layoutInflaterFactory2C0828w5.f8427t;
        int i2 = xj1Var.mo3938k().f8516b;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0828w5.f8388D;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0828w5.f8388D.getLayoutParams();
            if (layoutInflaterFactory2C0828w5.f8388D.isShown()) {
                if (layoutInflaterFactory2C0828w5.f8421k0 == null) {
                    layoutInflaterFactory2C0828w5.f8421k0 = new Rect();
                    layoutInflaterFactory2C0828w5.f8422l0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0828w5.f8421k0;
                Rect rect2 = layoutInflaterFactory2C0828w5.f8422l0;
                rect.set(xj1Var.mo3938k().f8515a, xj1Var.mo3938k().f8516b, xj1Var.mo3938k().f8517c, xj1Var.mo3938k().f8518d);
                ni1.m3540a(layoutInflaterFactory2C0828w5.f8393I, rect, rect2);
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup = layoutInflaterFactory2C0828w5.f8393I;
                WeakHashMap weakHashMap = ai1.f194a;
                ak1 ak1VarM5160a = vh1.m5160a(viewGroup);
                int i6 = ak1VarM5160a == null ? 0 : ak1VarM5160a.f229a.mo3938k().f8515a;
                int i7 = ak1VarM5160a == null ? 0 : ak1VarM5160a.f229a.mo3938k().f8517c;
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z3 = true;
                }
                if (i3 <= 0 || layoutInflaterFactory2C0828w5.f8395K != null) {
                    View view2 = layoutInflaterFactory2C0828w5.f8395K;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != i6 || marginLayoutParams2.rightMargin != i7) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = i6;
                            marginLayoutParams2.rightMargin = i7;
                            layoutInflaterFactory2C0828w5.f8395K.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0828w5.f8395K = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = i7;
                    layoutInflaterFactory2C0828w5.f8393I.addView(layoutInflaterFactory2C0828w5.f8395K, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0828w5.f8395K;
                boolean z4 = view4 != null;
                if (z4 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0828w5.f8395K;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0828w5.f8400P && z4) {
                    i2 = 0;
                }
                z = z4;
                z2 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z2) {
                layoutInflaterFactory2C0828w5.f8388D.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0828w5.f8395K;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (i != i2) {
            int i10 = xj1Var.mo3938k().f8515a;
            int i11 = xj1Var.mo3938k().f8517c;
            int i12 = xj1Var.mo3938k().f8518d;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 36) {
                jj1Var = new nj1(ak1VarMo2654b);
            } else if (i13 >= 35) {
                jj1Var = new mj1(ak1VarMo2654b);
            } else if (i13 >= 34) {
                jj1Var = new lj1(ak1VarMo2654b);
            } else if (i13 >= 31) {
                jj1Var = new kj1(ak1VarMo2654b);
            } else {
                jj1Var = i13 >= 30 ? new jj1(ak1VarMo2654b) : new ij1(ak1VarMo2654b);
            }
            jj1Var.mo2655d(wd0.m5318a(i10, i2, i11, i12));
            ak1VarMo2654b = jj1Var.mo2654b();
        }
        WeakHashMap weakHashMap2 = ai1.f194a;
        WindowInsets windowInsetsM271a = ak1VarMo2654b.m271a();
        if (windowInsetsM271a != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM271a);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM271a)) {
                return ak1.m270b(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return ak1VarMo2654b;
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: b */
    public void mo609b(on0 on0Var, boolean z) {
        this.f3820j.m5248q(on0Var);
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: q */
    public boolean mo621q(on0 on0Var) {
        Window.Callback callback = this.f3820j.f8428u.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, on0Var);
        return true;
    }
}
