package androidx.appcompat.widget;

import Y1.C0077a;
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
import androidx.appcompat.view.menu.ActionMenuItemView;
import b0.j;
import k.InterfaceC1068i;
import k.MenuC1069j;
import k.MenuItemC1070k;
import l.C1087f;
import l.C1089h;
import l.C1090i;
import l.C1092k;
import l.D;
import l.E;
import l.InterfaceC1091j;
import l.InterfaceC1093l;
import l.v0;

/* loaded from: classes.dex */
public class ActionMenuView extends E implements InterfaceC1068i {

    /* renamed from: p, reason: collision with root package name */
    public MenuC1069j f1963p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1964q;

    /* renamed from: r, reason: collision with root package name */
    public int f1965r;

    /* renamed from: s, reason: collision with root package name */
    public C1090i f1966s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1967t;

    /* renamed from: u, reason: collision with root package name */
    public int f1968u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1969v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1970w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1093l f1971x;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1969v = (int) (56.0f * f);
        this.f1970w = (int) (f * 4.0f);
        this.f1964q = context;
        this.f1965r = 0;
    }

    public static C1092k h() {
        C1092k c1092k = new C1092k(-2);
        c1092k.f9822c = false;
        c1092k.f9689b = 16;
        return c1092k;
    }

    public static C1092k i(ViewGroup.LayoutParams layoutParams) {
        C1092k c1092k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C1092k) {
            C1092k c1092k2 = (C1092k) layoutParams;
            c1092k = new C1092k(c1092k2);
            c1092k.f9822c = c1092k2.f9822c;
        } else {
            c1092k = new C1092k(layoutParams);
        }
        if (c1092k.f9689b <= 0) {
            c1092k.f9689b = 16;
        }
        return c1092k;
    }

    @Override // k.InterfaceC1068i
    public final boolean a(MenuItemC1070k menuItemC1070k) {
        return this.f1963p.p(menuItemC1070k, null, 0);
    }

    @Override // l.E, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1092k;
    }

    @Override // l.E
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ D generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.E
    /* renamed from: e */
    public final D generateLayoutParams(AttributeSet attributeSet) {
        return new C1092k(getContext(), attributeSet);
    }

    @Override // l.E
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ D generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // l.E, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // l.E, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1963p == null) {
            Context context = getContext();
            MenuC1069j menuC1069j = new MenuC1069j(context);
            this.f1963p = menuC1069j;
            menuC1069j.f9583e = new j(this);
            C1090i c1090i = new C1090i(context);
            this.f1966s = c1090i;
            c1090i.f9809k = true;
            c1090i.f9810l = true;
            c1090i.f9804e = new C0077a(11);
            this.f1963p.b(c1090i, this.f1964q);
            C1090i c1090i2 = this.f1966s;
            c1090i2.f9805g = this;
            this.f1963p = c1090i2.f9802c;
        }
        return this.f1963p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1090i c1090i = this.f1966s;
        C1089h c1089h = c1090i.f9806h;
        if (c1089h != null) {
            return c1089h.getDrawable();
        }
        if (c1090i.f9808j) {
            return c1090i.f9807i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1965r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i3) {
        boolean z3 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC1091j)) {
            z3 = ((InterfaceC1091j) childAt).b();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC1091j)) ? z3 : ((InterfaceC1091j) childAt2).c() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1090i c1090i = this.f1966s;
        if (c1090i != null) {
            c1090i.f();
            C1087f c1087f = this.f1966s.f9816r;
            if (c1087f == null || !c1087f.b()) {
                return;
            }
            this.f1966s.g();
            this.f1966s.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1090i c1090i = this.f1966s;
        if (c1090i != null) {
            c1090i.g();
            C1087f c1087f = c1090i.f9817s;
            if (c1087f == null || !c1087f.b()) {
                return;
            }
            c1087f.f9634i.dismiss();
        }
    }

    @Override // l.E, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.f1967t) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i3;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = v0.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C1092k c1092k = (C1092k) childAt.getLayoutParams();
                if (c1092k.f9822c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i7 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1092k).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1092k).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1092k).leftMargin) + ((ViewGroup.MarginLayoutParams) c1092k).rightMargin;
                    j(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C1092k c1092k2 = (C1092k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1092k2.f9822c) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) c1092k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1092k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C1092k c1092k3 = (C1092k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1092k3.f9822c) {
                int i21 = paddingLeft + ((ViewGroup.MarginLayoutParams) c1092k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c1092k3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // l.E, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        MenuC1069j menuC1069j;
        boolean z3 = this.f1967t;
        boolean z4 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f1967t = z4;
        if (z3 != z4) {
            this.f1968u = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f1967t && (menuC1069j = this.f1963p) != null && size != this.f1968u) {
            this.f1968u = size;
            menuC1069j.o(true);
        }
        int childCount = getChildCount();
        if (!this.f1967t || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C1092k c1092k = (C1092k) getChildAt(i9).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c1092k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1092k).leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.f1969v;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = false;
        int i19 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f1970w;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i14;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z6) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C1092k c1092k2 = (C1092k) childAt.getLayoutParams();
                c1092k2.f9826h = false;
                c1092k2.f9824e = 0;
                c1092k2.f9823d = 0;
                c1092k2.f = false;
                ((ViewGroup.MarginLayoutParams) c1092k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1092k2).rightMargin = 0;
                c1092k2.f9825g = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i22 = c1092k2.f9822c ? 1 : i12;
                C1092k c1092k3 = (C1092k) childAt.getLayoutParams();
                int i23 = i12;
                i7 = i14;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z8 = z7;
                if (i22 <= 0 || (z7 && i22 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z8 && i8 < 2) {
                        i8 = 2;
                    }
                }
                c1092k3.f = !c1092k3.f9822c && z8;
                c1092k3.f9823d = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), makeMeasureSpec);
                i17 = Math.max(i17, i8);
                if (c1092k2.f) {
                    i19++;
                }
                if (c1092k2.f9822c) {
                    z5 = true;
                }
                i12 = i23 - i8;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j3 |= 1 << i18;
                }
            }
            i18++;
            size3 = i20;
            paddingBottom = i21;
            i14 = i7;
        }
        int i24 = size3;
        int i25 = i12;
        int i26 = i14;
        boolean z9 = z5 && i16 == 2;
        int i27 = i25;
        boolean z10 = false;
        while (i19 > 0 && i27 > 0) {
            int i28 = Integer.MAX_VALUE;
            long j4 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i30 < childCount2) {
                boolean z11 = z9;
                C1092k c1092k4 = (C1092k) getChildAt(i30).getLayoutParams();
                int i31 = i15;
                if (c1092k4.f) {
                    int i32 = c1092k4.f9823d;
                    if (i32 < i28) {
                        j4 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j4 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                i15 = i31;
                z9 = z11;
            }
            boolean z12 = z9;
            i6 = i15;
            j3 |= j4;
            if (i29 > i27) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C1092k c1092k5 = (C1092k) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j5 = 1 << i34;
                if ((j4 & j5) != 0) {
                    if (z12 && c1092k5.f9825g) {
                        r11 = 1;
                        r11 = 1;
                        if (i27 == 1) {
                            childAt2.setPadding(i5 + i26, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1092k5.f9823d += r11;
                    c1092k5.f9826h = r11;
                    i27--;
                } else if (c1092k5.f9823d == i33) {
                    j3 |= j5;
                }
                i34++;
                z5 = z13;
            }
            i15 = i6;
            z9 = z12;
            z10 = true;
        }
        i6 = i15;
        boolean z14 = !z5 && i16 == 1;
        if (i27 > 0 && j3 != 0 && (i27 < i16 - 1 || z14 || i17 > 1)) {
            float bitCount = Long.bitCount(j3);
            if (!z14) {
                if ((j3 & 1) != 0 && !((C1092k) getChildAt(0).getLayoutParams()).f9825g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j3 & (1 << i35)) != 0 && !((C1092k) getChildAt(i35).getLayoutParams()).f9825g) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) ((i27 * i26) / bitCount) : 0;
            boolean z15 = z10;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j3 & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    C1092k c1092k6 = (C1092k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1092k6.f9824e = i36;
                        c1092k6.f9826h = true;
                        if (i37 == 0 && !c1092k6.f9825g) {
                            ((ViewGroup.MarginLayoutParams) c1092k6).leftMargin = (-i36) / 2;
                        }
                        z15 = true;
                    } else if (c1092k6.f9822c) {
                        c1092k6.f9824e = i36;
                        c1092k6.f9826h = true;
                        ((ViewGroup.MarginLayoutParams) c1092k6).rightMargin = (-i36) / 2;
                        z15 = true;
                    } else {
                        if (i37 != 0) {
                            ((ViewGroup.MarginLayoutParams) c1092k6).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c1092k6).rightMargin = i36 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                C1092k c1092k7 = (C1092k) childAt4.getLayoutParams();
                if (c1092k7.f9826h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1092k7.f9823d * i26) + c1092k7.f9824e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f1966s.f9814p = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC1093l interfaceC1093l) {
        this.f1971x = interfaceC1093l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1090i c1090i = this.f1966s;
        C1089h c1089h = c1090i.f9806h;
        if (c1089h != null) {
            c1089h.setImageDrawable(drawable);
        } else {
            c1090i.f9808j = true;
            c1090i.f9807i = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
    }

    public void setPopupTheme(int i3) {
        if (this.f1965r != i3) {
            this.f1965r = i3;
            if (i3 == 0) {
                this.f1964q = getContext();
            } else {
                this.f1964q = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C1090i c1090i) {
        this.f1966s = c1090i;
        c1090i.f9805g = this;
        this.f1963p = c1090i.f9802c;
    }

    @Override // l.E, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1092k(getContext(), attributeSet);
    }
}
