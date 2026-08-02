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
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.ArrayList;
import m.SubMenuC1416D;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644j implements m.x {

    /* renamed from: A, reason: collision with root package name */
    public Drawable f8637A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8638B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8639C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8640D;

    /* renamed from: E, reason: collision with root package name */
    public int f8641E;

    /* renamed from: F, reason: collision with root package name */
    public int f8642F;

    /* renamed from: G, reason: collision with root package name */
    public int f8643G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8644H;

    /* renamed from: J, reason: collision with root package name */
    public C0634e f8646J;

    /* renamed from: K, reason: collision with root package name */
    public C0634e f8647K;

    /* renamed from: L, reason: collision with root package name */
    public RunnableC0638g f8648L;

    /* renamed from: M, reason: collision with root package name */
    public C0636f f8649M;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8651a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8652b;

    /* renamed from: c, reason: collision with root package name */
    public m.k f8653c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f8654d;

    /* renamed from: e, reason: collision with root package name */
    public m.w f8655e;

    /* renamed from: y, reason: collision with root package name */
    public m.z f8658y;

    /* renamed from: z, reason: collision with root package name */
    public C0642i f8659z;

    /* renamed from: f, reason: collision with root package name */
    public final int f8656f = R.layout.abc_action_menu_layout;

    /* renamed from: x, reason: collision with root package name */
    public final int f8657x = R.layout.abc_action_menu_item_layout;

    /* renamed from: I, reason: collision with root package name */
    public final SparseBooleanArray f8645I = new SparseBooleanArray();

    /* renamed from: N, reason: collision with root package name */
    public final R4.c f8650N = new R4.c(this, 12);

    public C0644j(Context context) {
        this.f8651a = context;
        this.f8654d = LayoutInflater.from(context);
    }

    @Override // m.x
    public final void a(m.k kVar, boolean z4) {
        h();
        C0634e c0634e = this.f8647K;
        if (c0634e != null && c0634e.b()) {
            c0634e.f15199i.dismiss();
        }
        m.w wVar = this.f8655e;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [m.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(m.m mVar, View view, ViewGroup viewGroup) {
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof m.y ? (m.y) view : (m.y) this.f8654d.inflate(this.f8657x, viewGroup, false);
            actionMenuItemView.a(mVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f8658y);
            if (this.f8649M == null) {
                this.f8649M = new C0636f(this);
            }
            actionMenuItemView2.setPopupCallback(this.f8649M);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(mVar.f15169T ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0648l)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // m.x
    public final void c(Context context, m.k kVar) {
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
        int i10 = this.f8641E;
        if (this.f8639C) {
            if (this.f8659z == null) {
                C0642i c0642i = new C0642i(this, this.f8651a);
                this.f8659z = c0642i;
                if (this.f8638B) {
                    c0642i.setImageDrawable(this.f8637A);
                    this.f8637A = null;
                    this.f8638B = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8659z.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f8659z.getMeasuredWidth();
        } else {
            this.f8659z = null;
        }
        this.f8642F = i10;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override // m.x
    public final boolean d() {
        int i7;
        ArrayList arrayList;
        int i8;
        boolean z4;
        m.k kVar = this.f8653c;
        if (kVar != null) {
            arrayList = kVar.l();
            i7 = arrayList.size();
        } else {
            i7 = 0;
            arrayList = null;
        }
        int i9 = this.f8643G;
        int i10 = this.f8642F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f8658y;
        int i11 = 0;
        boolean z7 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z4 = true;
            if (i11 >= i7) {
                break;
            }
            m.m mVar = (m.m) arrayList.get(i11);
            int i14 = mVar.f15165P;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z7 = true;
            }
            if (this.f8644H && mVar.f15169T) {
                i9 = 0;
            }
            i11++;
        }
        if (this.f8639C && (z7 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = this.f8645I;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i7) {
            m.m mVar2 = (m.m) arrayList.get(i16);
            int i18 = mVar2.f15165P;
            boolean z8 = (i18 & 2) == i8 ? z4 : false;
            int i19 = mVar2.f15171b;
            if (z8) {
                View b7 = b(mVar2, null, viewGroup);
                b7.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b7.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z4);
                }
                mVar2.g(z4);
            } else if ((i18 & 1) == z4) {
                boolean z9 = sparseBooleanArray.get(i19);
                boolean z10 = ((i15 > 0 || z9) && i10 > 0) ? z4 : false;
                if (z10) {
                    View b8 = b(mVar2, null, viewGroup);
                    b8.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b8.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z10 &= i10 + i17 > 0;
                }
                if (z10 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z9) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        m.m mVar3 = (m.m) arrayList.get(i20);
                        if (mVar3.f15171b == i19) {
                            if (mVar3.f()) {
                                i15++;
                            }
                            mVar3.g(false);
                        }
                    }
                }
                if (z10) {
                    i15--;
                }
                mVar2.g(z10);
            } else {
                mVar2.g(false);
                i16++;
                i8 = 2;
                z4 = true;
            }
            i16++;
            i8 = 2;
            z4 = true;
        }
        return z4;
    }

    @Override // m.x
    public final void e(m.w wVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.x
    public final void f() {
        int i7;
        ViewGroup viewGroup = (ViewGroup) this.f8658y;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            m.k kVar = this.f8653c;
            if (kVar != null) {
                kVar.i();
                ArrayList l7 = this.f8653c.l();
                int size = l7.size();
                i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    m.m mVar = (m.m) l7.get(i8);
                    if (mVar.f()) {
                        View childAt = viewGroup.getChildAt(i7);
                        m.m itemData = childAt instanceof m.y ? ((m.y) childAt).getItemData() : null;
                        View b7 = b(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            b7.setPressed(false);
                            b7.jumpDrawablesToCurrentState();
                        }
                        if (b7 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b7.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b7);
                            }
                            ((ViewGroup) this.f8658y).addView(b7, i7);
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
        m.k kVar2 = this.f8653c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f15146z;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                AbstractC0347c abstractC0347c = ((m.m) arrayList2.get(i9)).f15167R;
                if (abstractC0347c != null) {
                    abstractC0347c.f5050a = this;
                }
            }
        }
        m.k kVar3 = this.f8653c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f15122A;
        }
        if (this.f8639C && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((m.m) arrayList.get(0)).f15169T;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f8659z == null) {
                this.f8659z = new C0642i(this, this.f8651a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f8659z.getParent();
            if (viewGroup3 != this.f8658y) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f8659z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8658y;
                C0642i c0642i = this.f8659z;
                actionMenuView.getClass();
                C0648l k7 = ActionMenuView.k();
                k7.f8677a = true;
                actionMenuView.addView(c0642i, k7);
            }
        } else {
            C0642i c0642i2 = this.f8659z;
            if (c0642i2 != null) {
                Object parent = c0642i2.getParent();
                Object obj = this.f8658y;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8659z);
                }
            }
        }
        ((ActionMenuView) this.f8658y).setOverflowReserved(this.f8639C);
    }

    @Override // m.x
    public final boolean g(m.m mVar) {
        return false;
    }

    public final boolean h() {
        Object obj;
        RunnableC0638g runnableC0638g = this.f8648L;
        if (runnableC0638g != null && (obj = this.f8658y) != null) {
            ((View) obj).removeCallbacks(runnableC0638g);
            this.f8648L = null;
            return true;
        }
        C0634e c0634e = this.f8646J;
        if (c0634e == null) {
            return false;
        }
        if (c0634e.b()) {
            c0634e.f15199i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.x
    public final boolean i(SubMenuC1416D subMenuC1416D) {
        boolean z4;
        if (!subMenuC1416D.hasVisibleItems()) {
            return false;
        }
        SubMenuC1416D subMenuC1416D2 = subMenuC1416D;
        while (true) {
            m.k kVar = subMenuC1416D2.f15059R;
            if (kVar == this.f8653c) {
                break;
            }
            subMenuC1416D2 = (SubMenuC1416D) kVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f8658y;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i7);
                if ((childAt instanceof m.y) && ((m.y) childAt).getItemData() == subMenuC1416D2.f15060S) {
                    view = childAt;
                    break;
                }
                i7++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC1416D.f15060S.getClass();
        int size = subMenuC1416D.f15143f.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z4 = false;
                break;
            }
            MenuItem item = subMenuC1416D.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i8++;
        }
        C0634e c0634e = new C0634e(this, this.f8652b, subMenuC1416D, view);
        this.f8647K = c0634e;
        c0634e.f15197g = z4;
        m.s sVar = c0634e.f15199i;
        if (sVar != null) {
            sVar.n(z4);
        }
        C0634e c0634e2 = this.f8647K;
        if (!c0634e2.b()) {
            if (c0634e2.f15195e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0634e2.d(0, 0, false, false);
        }
        m.w wVar = this.f8655e;
        if (wVar != null) {
            wVar.n(subMenuC1416D);
        }
        return true;
    }

    @Override // m.x
    public final boolean j(m.m mVar) {
        return false;
    }

    public final boolean k() {
        C0634e c0634e = this.f8646J;
        return c0634e != null && c0634e.b();
    }

    public final boolean l() {
        m.k kVar;
        if (!this.f8639C || k() || (kVar = this.f8653c) == null || this.f8658y == null || this.f8648L != null) {
            return false;
        }
        kVar.i();
        if (kVar.f15122A.isEmpty()) {
            return false;
        }
        RunnableC0638g runnableC0638g = new RunnableC0638g(this, new C0634e(this, this.f8652b, this.f8653c, this.f8659z));
        this.f8648L = runnableC0638g;
        ((View) this.f8658y).post(runnableC0638g);
        return true;
    }
}
