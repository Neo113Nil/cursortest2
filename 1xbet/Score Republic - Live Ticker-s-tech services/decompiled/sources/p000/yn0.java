package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class yn0 {

    /* JADX INFO: renamed from: a */
    public final Context f9396a;

    /* JADX INFO: renamed from: b */
    public final on0 f9397b;

    /* JADX INFO: renamed from: c */
    public final boolean f9398c;

    /* JADX INFO: renamed from: d */
    public final int f9399d;

    /* JADX INFO: renamed from: e */
    public View f9400e;

    /* JADX INFO: renamed from: g */
    public boolean f9402g;

    /* JADX INFO: renamed from: h */
    public do0 f9403h;

    /* JADX INFO: renamed from: i */
    public wn0 f9404i;

    /* JADX INFO: renamed from: j */
    public PopupWindow.OnDismissListener f9405j;

    /* JADX INFO: renamed from: f */
    public int f9401f = 8388611;

    /* JADX INFO: renamed from: k */
    public final xn0 f9406k = new xn0(this);

    public yn0(Context context, on0 on0Var, View view, boolean z, int i, int i2) {
        this.f9396a = context;
        this.f9397b = on0Var;
        this.f9400e = view;
        this.f9398c = z;
        this.f9399d = i;
    }

    /* JADX INFO: renamed from: a */
    public final wn0 m5813a() {
        wn0 z91Var;
        if (this.f9404i == null) {
            Context context = this.f9396a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f9396a;
            if (iMin >= dimensionPixelSize) {
                z91Var = new ViewOnKeyListenerC0431lf(context2, this.f9400e, this.f9399d, this.f9398c);
            } else {
                z91Var = new z91(context2, this.f9397b, this.f9400e, this.f9399d, this.f9398c);
            }
            z91Var.mo3219l(this.f9397b);
            z91Var.mo3224r(this.f9406k);
            z91Var.mo3220n(this.f9400e);
            z91Var.mo1483e(this.f9403h);
            z91Var.mo3221o(this.f9402g);
            z91Var.mo3222p(this.f9401f);
            this.f9404i = z91Var;
        }
        return this.f9404i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5814b() {
        wn0 wn0Var = this.f9404i;
        return wn0Var != null && wn0Var.mo3216a();
    }

    /* JADX INFO: renamed from: c */
    public void mo3323c() {
        this.f9404i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9405j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5815d(int i, int i2, boolean z, boolean z2) {
        wn0 wn0VarM5813a = m5813a();
        wn0VarM5813a.mo3225s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f9401f, this.f9400e.getLayoutDirection()) & 7) == 5) {
                i -= this.f9400e.getWidth();
            }
            wn0VarM5813a.mo3223q(i);
            wn0VarM5813a.mo3226t(i2);
            int i3 = (int) ((this.f9396a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            wn0VarM5813a.f8592j = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        wn0VarM5813a.mo3217c();
    }
}
