package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0603q2 implements eo0 {

    /* JADX INFO: renamed from: B */
    public C0455m2 f6319B;

    /* JADX INFO: renamed from: C */
    public C0455m2 f6320C;

    /* JADX INFO: renamed from: D */
    public RunnableC0529o2 f6321D;

    /* JADX INFO: renamed from: E */
    public C0492n2 f6322E;

    /* JADX INFO: renamed from: j */
    public final Context f6324j;

    /* JADX INFO: renamed from: k */
    public Context f6325k;

    /* JADX INFO: renamed from: l */
    public on0 f6326l;

    /* JADX INFO: renamed from: m */
    public final LayoutInflater f6327m;

    /* JADX INFO: renamed from: n */
    public do0 f6328n;

    /* JADX INFO: renamed from: q */
    public go0 f6331q;

    /* JADX INFO: renamed from: r */
    public C0566p2 f6332r;

    /* JADX INFO: renamed from: s */
    public Drawable f6333s;

    /* JADX INFO: renamed from: t */
    public boolean f6334t;

    /* JADX INFO: renamed from: u */
    public boolean f6335u;

    /* JADX INFO: renamed from: v */
    public boolean f6336v;

    /* JADX INFO: renamed from: w */
    public int f6337w;

    /* JADX INFO: renamed from: x */
    public int f6338x;

    /* JADX INFO: renamed from: y */
    public int f6339y;

    /* JADX INFO: renamed from: z */
    public boolean f6340z;

    /* JADX INFO: renamed from: o */
    public final int f6329o = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: p */
    public final int f6330p = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: A */
    public final SparseBooleanArray f6318A = new SparseBooleanArray();

    /* JADX INFO: renamed from: F */
    public final b90 f6323F = new b90(6, this);

    public C0603q2(Context context) {
        this.f6324j = context;
        this.f6327m = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m4025a(rn0 rn0Var, View view, ViewGroup viewGroup) {
        View actionView = rn0Var.getActionView();
        if (actionView == null || rn0Var.m4386e()) {
            fo0 fo0Var = view instanceof fo0 ? (fo0) view : (fo0) this.f6327m.inflate(this.f6330p, viewGroup, false);
            fo0Var.mo329a(rn0Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) fo0Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f6331q);
            if (this.f6322E == null) {
                this.f6322E = new C0492n2(this);
            }
            actionMenuItemView.setPopupCallback(this.f6322E);
            actionView = (View) fo0Var;
        }
        actionView.setVisibility(rn0Var.f6902L ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0677s2)) {
            actionView.setLayoutParams(ActionMenuView.m358j(layoutParams));
        }
        return actionView;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: b */
    public final void mo1481b(on0 on0Var, boolean z) {
        m4026c();
        C0455m2 c0455m2 = this.f6320C;
        if (c0455m2 != null && c0455m2.m5814b()) {
            c0455m2.f9404i.dismiss();
        }
        do0 do0Var = this.f6328n;
        if (do0Var != null) {
            do0Var.mo609b(on0Var, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4026c() {
        Object obj;
        RunnableC0529o2 runnableC0529o2 = this.f6321D;
        if (runnableC0529o2 != null && (obj = this.f6331q) != null) {
            ((View) obj).removeCallbacks(runnableC0529o2);
            this.f6321D = null;
            return true;
        }
        C0455m2 c0455m2 = this.f6319B;
        if (c0455m2 == null) {
            return false;
        }
        if (c0455m2.m5814b()) {
            c0455m2.f9404i.dismiss();
        }
        return true;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: d */
    public final boolean mo1482d(rn0 rn0Var) {
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: e */
    public final void mo1483e(do0 do0Var) {
        throw null;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: f */
    public final boolean mo1484f(rn0 rn0Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.eo0
    /* JADX INFO: renamed from: g */
    public final void mo1485g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f6331q;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            on0 on0Var = this.f6326l;
            if (on0Var != null) {
                on0Var.m3710i();
                ArrayList arrayListM3711l = this.f6326l.m3711l();
                int size = arrayListM3711l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    rn0 rn0Var = (rn0) arrayListM3711l.get(i2);
                    if ((rn0Var.f6897G & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        rn0 itemData = childAt instanceof fo0 ? ((fo0) childAt).getItemData() : null;
                        View viewM4025a = m4025a(rn0Var, childAt, viewGroup);
                        if (rn0Var != itemData) {
                            viewM4025a.setPressed(false);
                            viewM4025a.jumpDrawablesToCurrentState();
                        }
                        if (viewM4025a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM4025a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM4025a);
                            }
                            ((ViewGroup) this.f6331q).addView(viewM4025a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f6332r) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f6331q).requestLayout();
        on0 on0Var2 = this.f6326l;
        if (on0Var2 != null) {
            on0Var2.m3710i();
            ArrayList arrayList2 = on0Var2.f5807r;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                sn0 sn0Var = ((rn0) arrayList2.get(i3)).f6900J;
            }
        }
        on0 on0Var3 = this.f6326l;
        if (on0Var3 != null) {
            on0Var3.m3710i();
            arrayList = on0Var3.f5808s;
        }
        if (this.f6335u && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((rn0) arrayList.get(0)).f6902L;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C0566p2 c0566p2 = this.f6332r;
        if (z) {
            if (c0566p2 == null) {
                this.f6332r = new C0566p2(this, this.f6324j);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f6332r.getParent();
            if (viewGroup3 != this.f6331q) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f6332r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6331q;
                C0566p2 c0566p3 = this.f6332r;
                actionMenuView.getClass();
                C0677s2 c0677s2M357i = ActionMenuView.m357i();
                c0677s2M357i.f7009a = true;
                actionMenuView.addView(c0566p3, c0677s2M357i);
            }
        } else if (c0566p2 != null) {
            Object parent = c0566p2.getParent();
            Object obj = this.f6331q;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f6332r);
            }
        }
        ((ActionMenuView) this.f6331q).setOverflowReserved(this.f6335u);
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: h */
    public final void mo1486h(Context context, on0 on0Var) {
        this.f6325k = context;
        LayoutInflater.from(context);
        this.f6326l = on0Var;
        Resources resources = context.getResources();
        if (!this.f6336v) {
            this.f6335u = true;
        }
        int i = 2;
        this.f6337w = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f6339y = i;
        int measuredWidth = this.f6337w;
        if (this.f6335u) {
            if (this.f6332r == null) {
                C0566p2 c0566p2 = new C0566p2(this, this.f6324j);
                this.f6332r = c0566p2;
                if (this.f6334t) {
                    c0566p2.setImageDrawable(this.f6333s);
                    this.f6333s = null;
                    this.f6334t = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6332r.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f6332r.getMeasuredWidth();
        } else {
            this.f6332r = null;
        }
        this.f6338x = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4027i() {
        C0455m2 c0455m2 = this.f6319B;
        return c0455m2 != null && c0455m2.m5814b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.eo0
    /* JADX INFO: renamed from: j */
    public final boolean mo1487j(gb1 gb1Var) {
        boolean z;
        if (gb1Var.hasVisibleItems()) {
            gb1 gb1Var2 = gb1Var;
            while (true) {
                on0 on0Var = gb1Var2.f2684I;
                if (on0Var == this.f6326l) {
                    break;
                }
                gb1Var2 = (gb1) on0Var;
            }
            rn0 rn0Var = gb1Var2.f2685J;
            ViewGroup viewGroup = (ViewGroup) this.f6331q;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof fo0) && ((fo0) childAt).getItemData() == rn0Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                gb1Var.f2685J.getClass();
                int size = gb1Var.f5804o.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = gb1Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0455m2 c0455m2 = new C0455m2(this, this.f6325k, gb1Var, view);
                this.f6320C = c0455m2;
                c0455m2.f9402g = z;
                wn0 wn0Var = c0455m2.f9404i;
                if (wn0Var != null) {
                    wn0Var.mo3221o(z);
                }
                C0455m2 c0455m3 = this.f6320C;
                if (!c0455m3.m5814b()) {
                    if (c0455m3.f9400e == null) {
                        C0270h1.m2191g("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c0455m3.m5815d(0, 0, false, false);
                }
                do0 do0Var = this.f6328n;
                if (do0Var != null) {
                    do0Var.mo621q(gb1Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: k */
    public final boolean mo1488k() {
        int size;
        ArrayList arrayListM3711l;
        int i;
        boolean z;
        C0603q2 c0603q2 = this;
        on0 on0Var = c0603q2.f6326l;
        if (on0Var != null) {
            arrayListM3711l = on0Var.m3711l();
            size = arrayListM3711l.size();
        } else {
            size = 0;
            arrayListM3711l = null;
        }
        int i2 = c0603q2.f6339y;
        int i3 = c0603q2.f6338x;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0603q2.f6331q;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            rn0 rn0Var = (rn0) arrayListM3711l.get(i4);
            int i7 = rn0Var.f6898H;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0603q2.f6340z && rn0Var.f6902L) {
                i2 = 0;
            }
            i4++;
        }
        if (c0603q2.f6335u && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0603q2.f6318A;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            rn0 rn0Var2 = (rn0) arrayListM3711l.get(i9);
            int i11 = rn0Var2.f6898H;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = rn0Var2.f6904k;
            if (z3) {
                View viewM4025a = c0603q2.m4025a(rn0Var2, null, viewGroup);
                viewM4025a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM4025a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                rn0Var2.m4387f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewM4025a2 = c0603q2.m4025a(rn0Var2, null, viewGroup);
                        viewM4025a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM4025a2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            rn0 rn0Var3 = (rn0) arrayListM3711l.get(i13);
                            if (rn0Var3.f6904k == i12) {
                                if ((rn0Var3.f6897G & 32) == 32) {
                                    i8++;
                                }
                                rn0Var3.m4387f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    rn0Var2.m4387f(z5);
                } else {
                    rn0Var2.m4387f(false);
                }
                i9++;
                i = 2;
                c0603q2 = this;
                z = true;
            }
            i9++;
            i = 2;
            c0603q2 = this;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4028l() {
        on0 on0Var;
        int i = 0;
        if (this.f6335u && !m4027i() && (on0Var = this.f6326l) != null && this.f6331q != null && this.f6321D == null) {
            on0Var.m3710i();
            if (!on0Var.f5808s.isEmpty()) {
                RunnableC0529o2 runnableC0529o2 = new RunnableC0529o2(i, this, new C0455m2(this, this.f6325k, this.f6326l, this.f6332r));
                this.f6321D = runnableC0529o2;
                ((View) this.f6331q).post(runnableC0529o2);
                return true;
            }
        }
        return false;
    }
}
