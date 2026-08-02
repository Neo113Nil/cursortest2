package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k0.C2023c;
import l3.C2054a;
import m.InterfaceC2069g;
import m.MenuC2070h;
import m.MenuItemC2071i;
import n.C2132f;
import n.C2136h;
import n.C2140j;
import n.C2142l;
import n.I0;
import n.InterfaceC2141k;
import n.InterfaceC2143m;
import n.W;
import n.X;

/* loaded from: classes.dex */
public class ActionMenuView extends X implements InterfaceC2069g {

    /* renamed from: A, reason: collision with root package name */
    public Context f6728A;

    /* renamed from: B, reason: collision with root package name */
    public int f6729B;

    /* renamed from: C, reason: collision with root package name */
    public C2140j f6730C;

    /* renamed from: D, reason: collision with root package name */
    public C2023c f6731D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6732E;

    /* renamed from: F, reason: collision with root package name */
    public int f6733F;

    /* renamed from: G, reason: collision with root package name */
    public final int f6734G;

    /* renamed from: H, reason: collision with root package name */
    public final int f6735H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC2143m f6736I;

    /* renamed from: z, reason: collision with root package name */
    public MenuC2070h f6737z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f6734G = (int) (56.0f * f);
        this.f6735H = (int) (f * 4.0f);
        this.f6728A = context;
        this.f6729B = 0;
    }

    public static C2142l h() {
        C2142l c2142l = new C2142l(-2, -2);
        c2142l.f18276a = false;
        ((LinearLayout.LayoutParams) c2142l).gravity = 16;
        return c2142l;
    }

    public static C2142l i(ViewGroup.LayoutParams layoutParams) {
        C2142l c2142l;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C2142l) {
            C2142l c2142l2 = (C2142l) layoutParams;
            c2142l = new C2142l(c2142l2);
            c2142l.f18276a = c2142l2.f18276a;
        } else {
            c2142l = new C2142l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c2142l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2142l).gravity = 16;
        }
        return c2142l;
    }

    @Override // m.InterfaceC2069g
    public final boolean a(MenuItemC2071i menuItemC2071i) {
        return this.f6737z.p(menuItemC2071i, null, 0);
    }

    @Override // n.X, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2142l;
    }

    @Override // n.X
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ W generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // n.X
    /* renamed from: e */
    public final W generateLayoutParams(AttributeSet attributeSet) {
        return new C2142l(getContext(), attributeSet);
    }

    @Override // n.X
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // n.X, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // n.X, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f6737z == null) {
            Context context = getContext();
            MenuC2070h menuC2070h = new MenuC2070h(context);
            this.f6737z = menuC2070h;
            menuC2070h.f17909e = new C2023c(3, this);
            C2140j c2140j = new C2140j(context);
            this.f6730C = c2140j;
            c2140j.f18270u = true;
            c2140j.f18271v = true;
            c2140j.f18264o = new C2054a(1);
            this.f6737z.b(c2140j, this.f6728A);
            C2140j c2140j2 = this.f6730C;
            c2140j2.f18266q = this;
            this.f6737z = c2140j2.f18262m;
        }
        return this.f6737z;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C2140j c2140j = this.f6730C;
        C2136h c2136h = c2140j.f18267r;
        if (c2136h != null) {
            return c2136h.getDrawable();
        }
        if (c2140j.f18269t) {
            return c2140j.f18268s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f6729B;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i) {
        boolean z3 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC2141k)) {
            z3 = ((InterfaceC2141k) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC2141k)) ? z3 : ((InterfaceC2141k) childAt2).d() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2140j c2140j = this.f6730C;
        if (c2140j != null) {
            c2140j.c();
            C2132f c2132f = this.f6730C.f18255B;
            if (c2132f == null || !c2132f.b()) {
                return;
            }
            this.f6730C.d();
            this.f6730C.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2140j c2140j = this.f6730C;
        if (c2140j != null) {
            c2140j.d();
            C2132f c2132f = c2140j.f18256C;
            if (c2132f == null || !c2132f.b()) {
                return;
            }
            c2132f.i.dismiss();
        }
    }

    @Override // n.X, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        int width;
        int i8;
        if (!this.f6732E) {
            super.onLayout(z3, i, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean z5 = I0.f18161a;
        boolean z6 = getLayoutDirection() == 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C2142l c2142l = (C2142l) childAt.getLayoutParams();
                if (c2142l.f18276a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z6) {
                        i8 = getPaddingLeft() + ((LinearLayout.LayoutParams) c2142l).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2142l).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2142l).leftMargin) + ((LinearLayout.LayoutParams) c2142l).rightMargin;
                    j(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        int max = Math.max(0, i17 > 0 ? paddingRight / i17 : 0);
        if (z6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C2142l c2142l2 = (C2142l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2142l2.f18276a) {
                    int i19 = width2 - ((LinearLayout.LayoutParams) c2142l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2142l2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C2142l c2142l3 = (C2142l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2142l3.f18276a) {
                int i22 = paddingLeft + ((LinearLayout.LayoutParams) c2142l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c2142l3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // n.X, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        int i7;
        ?? r11;
        int i8;
        int i9;
        MenuC2070h menuC2070h;
        boolean z3 = this.f6732E;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f6732E = z5;
        if (z3 != z5) {
            this.f6733F = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f6732E && (menuC2070h = this.f6737z) != null && size != this.f6733F) {
            this.f6733F = size;
            menuC2070h.o(true);
        }
        int childCount = getChildCount();
        if (!this.f6732E || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C2142l c2142l = (C2142l) getChildAt(i10).getLayoutParams();
                ((LinearLayout.LayoutParams) c2142l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c2142l).leftMargin = 0;
            }
            super.onMeasure(i, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i11 = size2 - paddingRight;
        int i12 = this.f6734G;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = (i14 / i13) + i12;
        int childCount2 = getChildCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z6 = false;
        int i20 = 0;
        long j5 = 0;
        while (true) {
            i6 = this.f6735H;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i8 = i15;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                i17++;
                if (z7) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C2142l c2142l2 = (C2142l) childAt.getLayoutParams();
                c2142l2.f = false;
                c2142l2.f18278c = 0;
                c2142l2.f18277b = 0;
                c2142l2.f18279d = false;
                ((LinearLayout.LayoutParams) c2142l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c2142l2).rightMargin = 0;
                c2142l2.f18280e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c2142l2.f18276a ? 1 : i13;
                C2142l c2142l3 = (C2142l) childAt.getLayoutParams();
                int i24 = i13;
                i8 = i15;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i22, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z9 = z8;
                if (i23 <= 0 || (z8 && i23 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i23, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i9++;
                    }
                    if (z9 && i9 < 2) {
                        i9 = 2;
                    }
                }
                c2142l3.f18279d = !c2142l3.f18276a && z9;
                c2142l3.f18277b = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), makeMeasureSpec);
                i18 = Math.max(i18, i9);
                if (c2142l2.f18279d) {
                    i20++;
                }
                if (c2142l2.f18276a) {
                    z6 = true;
                }
                i13 = i24 - i9;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j5 |= 1 << i19;
                }
            }
            i19++;
            size3 = i21;
            paddingBottom = i22;
            i15 = i8;
        }
        int i25 = size3;
        int i26 = i13;
        int i27 = i15;
        boolean z10 = z6 && i17 == 2;
        int i28 = i26;
        boolean z11 = false;
        while (i20 > 0 && i28 > 0) {
            int i29 = Integer.MAX_VALUE;
            long j6 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i31 < childCount2) {
                boolean z12 = z10;
                C2142l c2142l4 = (C2142l) getChildAt(i31).getLayoutParams();
                int i32 = i16;
                if (c2142l4.f18279d) {
                    int i33 = c2142l4.f18277b;
                    if (i33 < i29) {
                        j6 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        j6 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                i16 = i32;
                z10 = z12;
            }
            boolean z13 = z10;
            i7 = i16;
            j5 |= j6;
            if (i30 > i28) {
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C2142l c2142l5 = (C2142l) childAt2.getLayoutParams();
                boolean z14 = z6;
                long j7 = 1 << i35;
                if ((j6 & j7) != 0) {
                    if (z13 && c2142l5.f18280e) {
                        r11 = 1;
                        r11 = 1;
                        if (i28 == 1) {
                            childAt2.setPadding(i6 + i27, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c2142l5.f18277b += r11;
                    c2142l5.f = r11;
                    i28--;
                } else if (c2142l5.f18277b == i34) {
                    j5 |= j7;
                }
                i35++;
                z6 = z14;
            }
            i16 = i7;
            z10 = z13;
            z11 = true;
        }
        i7 = i16;
        boolean z15 = !z6 && i17 == 1;
        if (i28 > 0 && j5 != 0 && (i28 < i17 - 1 || z15 || i18 > 1)) {
            float bitCount = Long.bitCount(j5);
            if (!z15) {
                if ((j5 & 1) != 0 && !((C2142l) getChildAt(0).getLayoutParams()).f18280e) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j5 & (1 << i36)) != 0 && !((C2142l) getChildAt(i36).getLayoutParams()).f18280e) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i28 * i27) / bitCount) : 0;
            boolean z16 = z11;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j5 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    C2142l c2142l6 = (C2142l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c2142l6.f18278c = i37;
                        c2142l6.f = true;
                        if (i38 == 0 && !c2142l6.f18280e) {
                            ((LinearLayout.LayoutParams) c2142l6).leftMargin = (-i37) / 2;
                        }
                        z16 = true;
                    } else if (c2142l6.f18276a) {
                        c2142l6.f18278c = i37;
                        c2142l6.f = true;
                        ((LinearLayout.LayoutParams) c2142l6).rightMargin = (-i37) / 2;
                        z16 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) c2142l6).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c2142l6).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z11 = z16;
        }
        if (z11) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                C2142l c2142l7 = (C2142l) childAt4.getLayoutParams();
                if (c2142l7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2142l7.f18277b * i27) + c2142l7.f18278c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i7 : i25);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f6730C.f18275z = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC2143m interfaceC2143m) {
        this.f6736I = interfaceC2143m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C2140j c2140j = this.f6730C;
        C2136h c2136h = c2140j.f18267r;
        if (c2136h != null) {
            c2136h.setImageDrawable(drawable);
        } else {
            c2140j.f18269t = true;
            c2140j.f18268s = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
    }

    public void setPopupTheme(int i) {
        if (this.f6729B != i) {
            this.f6729B = i;
            if (i == 0) {
                this.f6728A = getContext();
            } else {
                this.f6728A = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C2140j c2140j) {
        this.f6730C = c2140j;
        c2140j.f18266q = this;
        this.f6737z = c2140j.f18262m;
    }

    @Override // n.X, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2142l(getContext(), attributeSet);
    }
}
