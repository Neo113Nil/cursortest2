package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: lf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0431lf extends wn0 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public boolean f4772A;

    /* JADX INFO: renamed from: B */
    public int f4773B;

    /* JADX INFO: renamed from: C */
    public int f4774C;

    /* JADX INFO: renamed from: E */
    public boolean f4776E;

    /* JADX INFO: renamed from: F */
    public do0 f4777F;

    /* JADX INFO: renamed from: G */
    public ViewTreeObserver f4778G;

    /* JADX INFO: renamed from: H */
    public PopupWindow.OnDismissListener f4779H;

    /* JADX INFO: renamed from: I */
    public boolean f4780I;

    /* JADX INFO: renamed from: k */
    public final Context f4781k;

    /* JADX INFO: renamed from: l */
    public final int f4782l;

    /* JADX INFO: renamed from: m */
    public final int f4783m;

    /* JADX INFO: renamed from: n */
    public final boolean f4784n;

    /* JADX INFO: renamed from: o */
    public final Handler f4785o;

    /* JADX INFO: renamed from: w */
    public View f4793w;

    /* JADX INFO: renamed from: x */
    public View f4794x;

    /* JADX INFO: renamed from: y */
    public int f4795y;

    /* JADX INFO: renamed from: z */
    public boolean f4796z;

    /* JADX INFO: renamed from: p */
    public final ArrayList f4786p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final ArrayList f4787q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final ViewTreeObserverOnGlobalLayoutListenerC0570p6 f4788r = new ViewTreeObserverOnGlobalLayoutListenerC0570p6(3, this);

    /* JADX INFO: renamed from: s */
    public final ViewOnAttachStateChangeListenerC0357jf f4789s = new ViewOnAttachStateChangeListenerC0357jf(0, this);

    /* JADX INFO: renamed from: t */
    public final nu1 f4790t = new nu1(10, this);

    /* JADX INFO: renamed from: u */
    public int f4791u = 0;

    /* JADX INFO: renamed from: v */
    public int f4792v = 0;

    /* JADX INFO: renamed from: D */
    public boolean f4775D = false;

    public ViewOnKeyListenerC0431lf(Context context, View view, int i, boolean z) {
        this.f4781k = context;
        this.f4793w = view;
        this.f4783m = i;
        this.f4784n = z;
        this.f4795y = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4782l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4785o = new Handler();
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: a */
    public final boolean mo3216a() {
        ArrayList arrayList = this.f4787q;
        return arrayList.size() > 0 && ((C0394kf) arrayList.get(0)).f4360a.f9779H.isShowing();
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: b */
    public final void mo1481b(on0 on0Var, boolean z) {
        ArrayList arrayList = this.f4787q;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (on0Var == ((C0394kf) arrayList.get(i)).f4361b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C0394kf) arrayList.get(i2)).f4361b.m3707c(false);
        }
        C0394kf c0394kf = (C0394kf) arrayList.remove(i);
        on0 on0Var2 = c0394kf.f4361b;
        co0 co0Var = c0394kf.f4360a;
        C0275h6 c0275h6 = co0Var.f9779H;
        on0Var2.m3714r(this);
        if (this.f4780I) {
            zn0.m5940b(c0275h6, null);
            c0275h6.setAnimationStyle(0);
        }
        co0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4795y = ((C0394kf) arrayList.get(size2 - 1)).f4362c;
        } else {
            this.f4795y = this.f4793w.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0394kf) arrayList.get(0)).f4361b.m3707c(false);
                return;
            }
            return;
        }
        dismiss();
        do0 do0Var = this.f4777F;
        if (do0Var != null) {
            do0Var.mo609b(on0Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4778G;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4778G.removeGlobalOnLayoutListener(this.f4788r);
            }
            this.f4778G = null;
        }
        this.f4794x.removeOnAttachStateChangeListener(this.f4789s);
        this.f4779H.onDismiss();
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: c */
    public final void mo3217c() {
        if (mo3216a()) {
            return;
        }
        ArrayList arrayList = this.f4786p;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m3227u((on0) obj);
        }
        arrayList.clear();
        View view = this.f4793w;
        this.f4794x = view;
        if (view != null) {
            boolean z = this.f4778G == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4778G = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4788r);
            }
            this.f4794x.addOnAttachStateChangeListener(this.f4789s);
        }
    }

    @Override // p000.t71
    public final void dismiss() {
        ArrayList arrayList = this.f4787q;
        int size = arrayList.size();
        if (size > 0) {
            C0394kf[] c0394kfArr = (C0394kf[]) arrayList.toArray(new C0394kf[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0394kf c0394kf = c0394kfArr[i];
                if (c0394kf.f4360a.f9779H.isShowing()) {
                    c0394kf.f4360a.dismiss();
                }
            }
        }
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: e */
    public final void mo1483e(do0 do0Var) {
        this.f4777F = do0Var;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: g */
    public final void mo1485g() {
        ArrayList arrayList = this.f4787q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C0394kf) obj).f4360a.f9782l.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ln0) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: i */
    public final C0151dv mo3218i() {
        ArrayList arrayList = this.f4787q;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0394kf) arrayList.get(arrayList.size() - 1)).f4360a.f9782l;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: j */
    public final boolean mo1487j(gb1 gb1Var) {
        ArrayList arrayList = this.f4787q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0394kf c0394kf = (C0394kf) obj;
            if (gb1Var == c0394kf.f4361b) {
                c0394kf.f4360a.f9782l.requestFocus();
                return true;
            }
        }
        if (!gb1Var.hasVisibleItems()) {
            return false;
        }
        mo3219l(gb1Var);
        do0 do0Var = this.f4777F;
        if (do0Var != null) {
            do0Var.mo621q(gb1Var);
        }
        return true;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: k */
    public final boolean mo1488k() {
        return false;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: l */
    public final void mo3219l(on0 on0Var) {
        on0Var.m3706b(this, this.f4781k);
        if (mo3216a()) {
            m3227u(on0Var);
        } else {
            this.f4786p.add(on0Var);
        }
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: n */
    public final void mo3220n(View view) {
        if (this.f4793w != view) {
            this.f4793w = view;
            this.f4792v = Gravity.getAbsoluteGravity(this.f4791u, view.getLayoutDirection());
        }
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: o */
    public final void mo3221o(boolean z) {
        this.f4775D = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0394kf c0394kf;
        ArrayList arrayList = this.f4787q;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0394kf = null;
                break;
            }
            c0394kf = (C0394kf) arrayList.get(i);
            if (!c0394kf.f4360a.f9779H.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0394kf != null) {
            c0394kf.f4361b.m3707c(false);
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
        if (this.f4791u != i) {
            this.f4791u = i;
            this.f4792v = Gravity.getAbsoluteGravity(i, this.f4793w.getLayoutDirection());
        }
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: q */
    public final void mo3223q(int i) {
        this.f4796z = true;
        this.f4773B = i;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: r */
    public final void mo3224r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4779H = onDismissListener;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: s */
    public final void mo3225s(boolean z) {
        this.f4776E = z;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: t */
    public final void mo3226t(int i) {
        this.f4772A = true;
        this.f4774C = i;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX INFO: renamed from: u */
    public final void m3227u(on0 on0Var) {
        boolean z;
        int i;
        View childAt;
        C0394kf c0394kf;
        int i2;
        int i3;
        MenuItem item;
        ln0 ln0Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f4781k;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ln0 ln0Var2 = new ln0(on0Var, layoutInflaterFrom, this.f4784n, R.layout.abc_cascading_menu_item_layout);
        int i4 = 1;
        if (!mo3216a() && this.f4775D) {
            ln0Var2.f4853c = true;
        } else if (mo3216a()) {
            int size = on0Var.f5804o.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = on0Var.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            ln0Var2.f4853c = z;
        }
        int iM5367m = wn0.m5367m(ln0Var2, context, this.f4782l);
        co0 co0Var = new co0(context, null, this.f4783m);
        co0Var.f1302I = this.f4790t;
        co0Var.f9795y = this;
        C0275h6 c0275h6 = co0Var.f9779H;
        c0275h6.setOnDismissListener(this);
        co0Var.f9794x = this.f4793w;
        co0Var.f9791u = this.f4792v;
        co0Var.f9778G = true;
        c0275h6.setFocusable(true);
        c0275h6.setInputMethodMode(2);
        co0Var.mo4268p(ln0Var2);
        co0Var.m5917r(iM5367m);
        co0Var.f9791u = this.f4792v;
        ArrayList arrayList = this.f4787q;
        if (arrayList.size() > 0) {
            c0394kf = (C0394kf) arrayList.get(arrayList.size() - 1);
            on0 on0Var2 = c0394kf.f4361b;
            int size2 = on0Var2.f5804o.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i = i4;
                    item = null;
                    break;
                }
                item = on0Var2.getItem(i6);
                if (item.hasSubMenu()) {
                    i = i4;
                    if (on0Var == item.getSubMenu()) {
                        break;
                    }
                } else {
                    i = i4;
                }
                i6++;
                i4 = i;
            }
            if (item == null) {
                childAt = null;
            } else {
                C0151dv c0151dv = c0394kf.f4360a.f9782l;
                ListAdapter adapter = c0151dv.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    ln0Var = (ln0) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ln0Var = (ln0) adapter;
                    headersCount = 0;
                }
                int count = ln0Var.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == ln0Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - c0151dv.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0151dv.getChildCount()) ? c0151dv.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 1;
            childAt = null;
            c0394kf = null;
        }
        if (childAt != null) {
            ao0.m449a(c0275h6, false);
            zn0.m5939a(c0275h6, null);
            C0151dv c0151dv2 = ((C0394kf) arrayList.get(arrayList.size() - 1)).f4360a.f9782l;
            int[] iArr = new int[2];
            c0151dv2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f4794x.getWindowVisibleDisplayFrame(rect);
            if (this.f4795y == i) {
                if (c0151dv2.getWidth() + iArr[0] + iM5367m > rect.right) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            } else if (iArr[0] - iM5367m < 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            boolean z2 = i2 == 1;
            this.f4795y = i2;
            co0Var.f9794x = childAt;
            if ((this.f4792v & 5) != 5) {
                i3 = 0;
                iM5367m = z2 ? childAt.getWidth() : 0 - iM5367m;
            } else if (z2) {
                i3 = 0;
            } else {
                i3 = 0;
                iM5367m = 0 - childAt.getWidth();
            }
            co0Var.f9785o = iM5367m;
            co0Var.f9790t = true;
            co0Var.f9789s = true;
            co0Var.m5914g(i3);
        } else {
            if (this.f4796z) {
                co0Var.f9785o = this.f4773B;
            }
            if (this.f4772A) {
                co0Var.m5914g(this.f4774C);
            }
            Rect rect2 = this.f8592j;
            co0Var.f9777F = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C0394kf(co0Var, on0Var, this.f4795y));
        co0Var.mo3217c();
        C0151dv c0151dv3 = co0Var.f9782l;
        c0151dv3.setOnKeyListener(this);
        if (c0394kf == null && this.f4776E && on0Var.f5811v != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0151dv3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(on0Var.f5811v);
            c0151dv3.addHeaderView(frameLayout, null, false);
            co0Var.mo3217c();
        }
    }
}
