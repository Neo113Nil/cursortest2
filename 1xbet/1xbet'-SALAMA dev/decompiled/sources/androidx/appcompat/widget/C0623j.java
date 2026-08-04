package androidx.appcompat.widget;

import P.AbstractC0347c;
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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0623j implements p086m.x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f8637A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f8638B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f8639C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f8640D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f8641E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f8642F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f8643G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f8644H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0613e f8646J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0613e f8647K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public RunnableC0617g f8648L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0615f f8649M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f8652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p086m.k f8653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f8654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p086m.w f8655e;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p086m.z f8658y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0621i f8659z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8656f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f8657x = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseBooleanArray f8645I = new SparseBooleanArray();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final R4.c f8650N = new R4.c(this, 12);

    public C0623j(Context context) {
        this.f8651a = context;
        this.f8654d = LayoutInflater.from(context);
    }

    @Override // p086m.x
    public final void a(p086m.k kVar, boolean z4) {
        h();
        C0613e c0613e = this.f8647K;
        if (c0613e != null && c0613e.b()) {
            c0613e.f15205i.dismiss();
        }
        p086m.w wVar = this.f8655e;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(p086m.m mVar, View view, ViewGroup viewGroup) {
        p086m.y yVar;
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.e()) {
            if (view instanceof p086m.y) {
                yVar = (p086m.y) view;
            } else {
                yVar = (p086m.y) this.f8654d.inflate(this.f8657x, viewGroup, false);
            }
            yVar.a(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f8658y);
            if (this.f8649M == null) {
                this.f8649M = new C0615f(this);
            }
            actionMenuItemView.setPopupCallback(this.f8649M);
            actionView = (View) yVar;
        }
        actionView.setVisibility(mVar.f15175T ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0627l)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // p086m.x
    public final void c(Context context, p086m.k kVar) {
        this.f8652b = context;
        LayoutInflater.from(context);
        this.f8653c = kVar;
        Resources resources = context.getResources();
        if (!this.f8640D) {
            this.f8639C = true;
        }
        int i7 = 2;
        this.f8641E = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
            i7 = 5;
        } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
            i7 = 4;
        } else if (i8 >= 360) {
            i7 = 3;
        }
        this.f8643G = i7;
        int measuredWidth = this.f8641E;
        if (this.f8639C) {
            if (this.f8659z == null) {
                C0621i c0621i = new C0621i(this, this.f8651a);
                this.f8659z = c0621i;
                if (this.f8638B) {
                    c0621i.setImageDrawable(this.f8637A);
                    this.f8637A = null;
                    this.f8638B = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8659z.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8659z.getMeasuredWidth();
        } else {
            this.f8659z = null;
        }
        this.f8642F = measuredWidth;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override // p086m.x
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i7;
        boolean z4;
        p086m.k kVar = this.f8653c;
        if (kVar != null) {
            arrayListL = kVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i8 = this.f8643G;
        int i9 = this.f8642F;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f8658y;
        int i10 = 0;
        boolean z7 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i7 = 2;
            z4 = true;
            if (i10 >= size) {
                break;
            }
            p086m.m mVar = (p086m.m) arrayListL.get(i10);
            int i13 = mVar.f15171P;
            if ((i13 & 2) == 2) {
                i11++;
            } else if ((i13 & 1) == 1) {
                i12++;
            } else {
                z7 = true;
            }
            if (this.f8644H && mVar.f15175T) {
                i8 = 0;
            }
            i10++;
        }
        if (this.f8639C && (z7 || i12 + i11 > i8)) {
            i8--;
        }
        int i14 = i8 - i11;
        SparseBooleanArray sparseBooleanArray = this.f8645I;
        sparseBooleanArray.clear();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            p086m.m mVar2 = (p086m.m) arrayListL.get(i15);
            int i17 = mVar2.f15171P;
            boolean z8 = (i17 & 2) == i7 ? z4 : false;
            int i18 = mVar2.f15177b;
            if (z8) {
                View viewB = b(mVar2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                if (i18 != 0) {
                    sparseBooleanArray.put(i18, z4);
                }
                mVar2.g(z4);
            } else {
                if ((i17 & 1) == z4) {
                    boolean z9 = sparseBooleanArray.get(i18);
                    boolean z10 = ((i14 > 0 || z9) && i9 > 0) ? z4 : false;
                    if (z10) {
                        View viewB2 = b(mVar2, null, viewGroup);
                        viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewB2.getMeasuredWidth();
                        i9 -= measuredWidth2;
                        if (i16 == 0) {
                            i16 = measuredWidth2;
                        }
                        z10 &= i9 + i16 > 0;
                    }
                    if (z10 && i18 != 0) {
                        sparseBooleanArray.put(i18, true);
                    } else if (z9) {
                        sparseBooleanArray.put(i18, false);
                        for (int i19 = 0; i19 < i15; i19++) {
                            p086m.m mVar3 = (p086m.m) arrayListL.get(i19);
                            if (mVar3.f15177b == i18) {
                                if (mVar3.f()) {
                                    i14++;
                                }
                                mVar3.g(false);
                            }
                        }
                    }
                    if (z10) {
                        i14--;
                    }
                    mVar2.g(z10);
                } else {
                    mVar2.g(false);
                }
                i15++;
                i7 = 2;
                z4 = true;
            }
            i15++;
            i7 = 2;
            z4 = true;
        }
        return z4;
    }

    @Override // p086m.x
    public final void e(p086m.w wVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p086m.x
    public final void f() {
        int i7;
        ViewGroup viewGroup = (ViewGroup) this.f8658y;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            p086m.k kVar = this.f8653c;
            if (kVar != null) {
                kVar.i();
                ArrayList arrayListL = this.f8653c.l();
                int size = arrayListL.size();
                i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    p086m.m mVar = (p086m.m) arrayListL.get(i8);
                    if (mVar.f()) {
                        View childAt = viewGroup.getChildAt(i7);
                        p086m.m itemData = childAt instanceof p086m.y ? ((p086m.y) childAt).getItemData() : null;
                        View viewB = b(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.f8658y).addView(viewB, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f8659z) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.f8658y).requestLayout();
        p086m.k kVar2 = this.f8653c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f15152z;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                AbstractC0347c abstractC0347c = ((p086m.m) arrayList2.get(i9)).f15173R;
                if (abstractC0347c != null) {
                    abstractC0347c.f5050a = this;
                }
            }
        }
        p086m.k kVar3 = this.f8653c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f15128A;
        }
        if (this.f8639C && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((p086m.m) arrayList.get(0)).f15175T;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f8659z == null) {
                this.f8659z = new C0621i(this, this.f8651a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f8659z.getParent();
            if (viewGroup3 != this.f8658y) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f8659z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8658y;
                C0621i c0621i = this.f8659z;
                actionMenuView.getClass();
                C0627l c0627lK = ActionMenuView.k();
                c0627lK.f8677a = true;
                actionMenuView.addView(c0621i, c0627lK);
            }
        } else {
            C0621i c0621i2 = this.f8659z;
            if (c0621i2 != null) {
                Object parent = c0621i2.getParent();
                Object obj = this.f8658y;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8659z);
                }
            }
        }
        ((ActionMenuView) this.f8658y).setOverflowReserved(this.f8639C);
    }

    @Override // p086m.x
    public final boolean g(p086m.m mVar) {
        return false;
    }

    public final boolean h() {
        Object obj;
        RunnableC0617g runnableC0617g = this.f8648L;
        if (runnableC0617g != null && (obj = this.f8658y) != null) {
            ((View) obj).removeCallbacks(runnableC0617g);
            this.f8648L = null;
            return true;
        }
        C0613e c0613e = this.f8646J;
        if (c0613e == null) {
            return false;
        }
        if (c0613e.b()) {
            c0613e.f15205i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p086m.x
    public final boolean i(p086m.D d7) {
        boolean z4;
        if (!d7.hasVisibleItems()) {
            return false;
        }
        p086m.D d8 = d7;
        while (true) {
            p086m.k kVar = d8.f15065R;
            if (kVar == this.f8653c) {
                break;
            }
            d8 = (p086m.D) kVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f8658y;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if ((childAt instanceof p086m.y) && ((p086m.y) childAt).getItemData() == d8.f15066S) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        d7.f15066S.getClass();
        int size = d7.f15149f.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z4 = false;
                break;
            }
            MenuItem item = d7.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i8++;
        }
        C0613e c0613e = new C0613e(this, this.f8652b, d7, view);
        this.f8647K = c0613e;
        c0613e.f15203g = z4;
        p086m.s sVar = c0613e.f15205i;
        if (sVar != null) {
            sVar.n(z4);
        }
        C0613e c0613e2 = this.f8647K;
        if (!c0613e2.b()) {
            if (c0613e2.f15201e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0613e2.d(0, 0, false, false);
        }
        p086m.w wVar = this.f8655e;
        if (wVar != null) {
            wVar.n(d7);
        }
        return true;
    }

    @Override // p086m.x
    public final boolean j(p086m.m mVar) {
        return false;
    }

    public final boolean k() {
        C0613e c0613e = this.f8646J;
        return c0613e != null && c0613e.b();
    }

    public final boolean l() {
        p086m.k kVar;
        if (!this.f8639C || k() || (kVar = this.f8653c) == null || this.f8658y == null || this.f8648L != null) {
            return false;
        }
        kVar.i();
        if (kVar.f15128A.isEmpty()) {
            return false;
        }
        RunnableC0617g runnableC0617g = new RunnableC0617g(this, new C0613e(this, this.f8652b, this.f8653c, this.f8659z));
        this.f8648L = runnableC0617g;
        ((View) this.f8658y).post(runnableC0617g);
        return true;
    }
}
