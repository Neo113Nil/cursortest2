package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z91 extends wn0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A */
    public int f9691A;

    /* JADX INFO: renamed from: C */
    public boolean f9693C;

    /* JADX INFO: renamed from: k */
    public final Context f9694k;

    /* JADX INFO: renamed from: l */
    public final on0 f9695l;

    /* JADX INFO: renamed from: m */
    public final ln0 f9696m;

    /* JADX INFO: renamed from: n */
    public final boolean f9697n;

    /* JADX INFO: renamed from: o */
    public final int f9698o;

    /* JADX INFO: renamed from: p */
    public final int f9699p;

    /* JADX INFO: renamed from: q */
    public final co0 f9700q;

    /* JADX INFO: renamed from: t */
    public PopupWindow.OnDismissListener f9703t;

    /* JADX INFO: renamed from: u */
    public View f9704u;

    /* JADX INFO: renamed from: v */
    public View f9705v;

    /* JADX INFO: renamed from: w */
    public do0 f9706w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f9707x;

    /* JADX INFO: renamed from: y */
    public boolean f9708y;

    /* JADX INFO: renamed from: z */
    public boolean f9709z;

    /* JADX INFO: renamed from: r */
    public final ViewTreeObserverOnGlobalLayoutListenerC0570p6 f9701r = new ViewTreeObserverOnGlobalLayoutListenerC0570p6(5, this);

    /* JADX INFO: renamed from: s */
    public final ViewOnAttachStateChangeListenerC0357jf f9702s = new ViewOnAttachStateChangeListenerC0357jf(2, this);

    /* JADX INFO: renamed from: B */
    public int f9692B = 0;

    public z91(Context context, on0 on0Var, View view, int i, boolean z) {
        this.f9694k = context;
        this.f9695l = on0Var;
        this.f9697n = z;
        this.f9696m = new ln0(on0Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f9699p = i;
        Resources resources = context.getResources();
        this.f9698o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9704u = view;
        this.f9700q = new co0(context, null, i);
        on0Var.m3706b(this, context);
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: a */
    public final boolean mo3216a() {
        return !this.f9708y && this.f9700q.f9779H.isShowing();
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: b */
    public final void mo1481b(on0 on0Var, boolean z) {
        if (on0Var != this.f9695l) {
            return;
        }
        dismiss();
        do0 do0Var = this.f9706w;
        if (do0Var != null) {
            do0Var.mo609b(on0Var, z);
        }
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: c */
    public final void mo3217c() {
        View view;
        if (mo3216a()) {
            return;
        }
        if (this.f9708y || (view = this.f9704u) == null) {
            C0270h1.m2191g("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f9705v = view;
        co0 co0Var = this.f9700q;
        C0275h6 c0275h6 = co0Var.f9779H;
        C0275h6 c0275h7 = co0Var.f9779H;
        c0275h6.setOnDismissListener(this);
        co0Var.f9795y = this;
        co0Var.f9778G = true;
        c0275h7.setFocusable(true);
        View view2 = this.f9705v;
        boolean z = this.f9707x == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9707x = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9701r);
        }
        view2.addOnAttachStateChangeListener(this.f9702s);
        co0Var.f9794x = view2;
        co0Var.f9791u = this.f9692B;
        boolean z2 = this.f9709z;
        Context context = this.f9694k;
        ln0 ln0Var = this.f9696m;
        if (!z2) {
            this.f9691A = wn0.m5367m(ln0Var, context, this.f9698o);
            this.f9709z = true;
        }
        co0Var.m5917r(this.f9691A);
        c0275h7.setInputMethodMode(2);
        Rect rect = this.f8592j;
        co0Var.f9777F = rect != null ? new Rect(rect) : null;
        co0Var.mo3217c();
        C0151dv c0151dv = co0Var.f9782l;
        c0151dv.setOnKeyListener(this);
        if (this.f9693C) {
            on0 on0Var = this.f9695l;
            if (on0Var.f5811v != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0151dv, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(on0Var.f5811v);
                }
                frameLayout.setEnabled(false);
                c0151dv.addHeaderView(frameLayout, null, false);
            }
        }
        co0Var.mo4268p(ln0Var);
        co0Var.mo3217c();
    }

    @Override // p000.t71
    public final void dismiss() {
        if (mo3216a()) {
            this.f9700q.dismiss();
        }
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: e */
    public final void mo1483e(do0 do0Var) {
        this.f9706w = do0Var;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: g */
    public final void mo1485g() {
        this.f9709z = false;
        ln0 ln0Var = this.f9696m;
        if (ln0Var != null) {
            ln0Var.notifyDataSetChanged();
        }
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: i */
    public final C0151dv mo3218i() {
        return this.f9700q.f9782l;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: j */
    public final boolean mo1487j(gb1 gb1Var) {
        boolean z;
        if (gb1Var.hasVisibleItems()) {
            yn0 yn0Var = new yn0(this.f9694k, gb1Var, this.f9705v, this.f9697n, this.f9699p, 0);
            do0 do0Var = this.f9706w;
            yn0Var.f9403h = do0Var;
            wn0 wn0Var = yn0Var.f9404i;
            if (wn0Var != null) {
                wn0Var.mo1483e(do0Var);
            }
            int size = gb1Var.f5804o.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = gb1Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            yn0Var.f9402g = z;
            wn0 wn0Var2 = yn0Var.f9404i;
            if (wn0Var2 != null) {
                wn0Var2.mo3221o(z);
            }
            yn0Var.f9405j = this.f9703t;
            this.f9703t = null;
            this.f9695l.m3707c(false);
            co0 co0Var = this.f9700q;
            int width = co0Var.f9785o;
            int iM5916n = co0Var.m5916n();
            if ((Gravity.getAbsoluteGravity(this.f9692B, this.f9704u.getLayoutDirection()) & 7) == 5) {
                width += this.f9704u.getWidth();
            }
            if (!yn0Var.m5814b()) {
                if (yn0Var.f9400e != null) {
                    yn0Var.m5815d(width, iM5916n, true, true);
                }
            }
            do0 do0Var2 = this.f9706w;
            if (do0Var2 != null) {
                do0Var2.mo621q(gb1Var);
            }
            return true;
        }
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: k */
    public final boolean mo1488k() {
        return false;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: n */
    public final void mo3220n(View view) {
        this.f9704u = view;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: o */
    public final void mo3221o(boolean z) {
        this.f9696m.f4853c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9708y = true;
        this.f9695l.m3707c(true);
        ViewTreeObserver viewTreeObserver = this.f9707x;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9707x = this.f9705v.getViewTreeObserver();
            }
            this.f9707x.removeGlobalOnLayoutListener(this.f9701r);
            this.f9707x = null;
        }
        this.f9705v.removeOnAttachStateChangeListener(this.f9702s);
        PopupWindow.OnDismissListener onDismissListener = this.f9703t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: p */
    public final void mo3222p(int i) {
        this.f9692B = i;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: q */
    public final void mo3223q(int i) {
        this.f9700q.f9785o = i;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: r */
    public final void mo3224r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9703t = onDismissListener;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: s */
    public final void mo3225s(boolean z) {
        this.f9693C = z;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: t */
    public final void mo3226t(int i) {
        this.f9700q.m5914g(i);
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: l */
    public final void mo3219l(on0 on0Var) {
    }
}
