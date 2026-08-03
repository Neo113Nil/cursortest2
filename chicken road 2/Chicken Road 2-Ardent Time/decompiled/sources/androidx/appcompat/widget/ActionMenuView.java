package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionMenuView extends h.AbstractC0135D implements g.i {

    /* renamed from: p, reason: collision with root package name */
    public g.j f2027p;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f2028q;

    /* renamed from: r, reason: collision with root package name */
    public int f2029r;

    /* renamed from: s, reason: collision with root package name */
    public h.C0151i f2030s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public int f2031u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2032v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2033w;

    /* renamed from: x, reason: collision with root package name */
    public h.InterfaceC0154l f2034x;

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f2032v = (int) (56.0f * f2);
        this.f2033w = (int) (f2 * 4.0f);
        this.f2028q = context;
        this.f2029r = 0;
    }

    public static h.C0153k h() {
        h.C0153k c0153k = new h.C0153k(-2);
        c0153k.f3187c = false;
        c0153k.f3043b = 16;
        return c0153k;
    }

    public static h.C0153k i(android.view.ViewGroup.LayoutParams layoutParams) {
        h.C0153k c0153k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof h.C0153k) {
            h.C0153k c0153k2 = (h.C0153k) layoutParams;
            c0153k = new h.C0153k(c0153k2);
            c0153k.f3187c = c0153k2.f3187c;
        } else {
            c0153k = new h.C0153k(layoutParams);
        }
        if (c0153k.f3043b <= 0) {
            c0153k.f3043b = 16;
        }
        return c0153k;
    }

    @Override // g.i
    public final boolean a(g.k kVar) {
        return this.f2027p.p(kVar, null, 0);
    }

    @Override // h.AbstractC0135D, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h.C0153k;
    }

    @Override // h.AbstractC0135D
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ h.C0134C generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // h.AbstractC0135D
    /* renamed from: e */
    public final h.C0134C generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new h.C0153k(getContext(), attributeSet);
    }

    @Override // h.AbstractC0135D
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ h.C0134C generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // h.AbstractC0135D, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // h.AbstractC0135D, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public android.view.Menu getMenu() {
        if (this.f2027p == null) {
            android.content.Context context = getContext();
            g.j jVar = new g.j(context);
            this.f2027p = jVar;
            jVar.f2964e = new Z0.h(20, this);
            h.C0151i c0151i = new h.C0151i(context);
            this.f2030s = c0151i;
            c0151i.f3171k = true;
            c0151i.f3172l = true;
            c0151i.f3165e = new f1.L();
            this.f2027p.b(c0151i, this.f2028q);
            h.C0151i c0151i2 = this.f2030s;
            c0151i2.f3167g = this;
            this.f2027p = c0151i2.f3163c;
        }
        return this.f2027p;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        getMenu();
        h.C0151i c0151i = this.f2030s;
        h.C0150h c0150h = c0151i.f3168h;
        if (c0150h != null) {
            return c0150h.getDrawable();
        }
        if (c0151i.f3170j) {
            return c0151i.f3169i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2029r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        android.view.KeyEvent.Callback childAt = getChildAt(i2 - 1);
        android.view.KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof h.InterfaceC0152j)) {
            z2 = ((h.InterfaceC0152j) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof h.InterfaceC0152j)) ? z2 : z2 | ((h.InterfaceC0152j) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h.C0151i c0151i = this.f2030s;
        if (c0151i != null) {
            c0151i.h();
            h.C0148f c0148f = this.f2030s.f3178r;
            if (c0148f == null || !c0148f.b()) {
                return;
            }
            this.f2030s.i();
            this.f2030s.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h.C0151i c0151i = this.f2030s;
        if (c0151i != null) {
            c0151i.i();
            h.C0148f c0148f = c0151i.f3179s;
            if (c0148f == null || !c0148f.b()) {
                return;
            }
            c0148f.f3016i.dismiss();
        }
    }

    @Override // h.AbstractC0135D, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.t) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = h.t0.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                h.C0153k c0153k = (h.C0153k) childAt.getLayoutParams();
                if (c0153k.f3187c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i6 = getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) c0153k).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((android.view.ViewGroup.MarginLayoutParams) c0153k).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) c0153k).leftMargin) + ((android.view.ViewGroup.MarginLayoutParams) c0153k).rightMargin;
                    j(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            android.view.View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = java.lang.Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                android.view.View childAt3 = getChildAt(i16);
                h.C0153k c0153k2 = (h.C0153k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0153k2.f3187c) {
                    int i17 = width2 - ((android.view.ViewGroup.MarginLayoutParams) c0153k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((android.view.ViewGroup.MarginLayoutParams) c0153k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt4 = getChildAt(i19);
            h.C0153k c0153k3 = (h.C0153k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0153k3.f3187c) {
                int i20 = paddingLeft + ((android.view.ViewGroup.MarginLayoutParams) c0153k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((android.view.ViewGroup.MarginLayoutParams) c0153k3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // h.AbstractC0135D, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        ?? r4;
        int i9;
        int i10;
        int i11;
        g.j jVar;
        boolean z4 = this.t;
        boolean z5 = android.view.View.MeasureSpec.getMode(i2) == 1073741824;
        this.t = z5;
        if (z4 != z5) {
            this.f2031u = 0;
        }
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (this.t && (jVar = this.f2027p) != null && size != this.f2031u) {
            this.f2031u = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.t || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                h.C0153k c0153k = (h.C0153k) getChildAt(i12).getLayoutParams();
                ((android.view.ViewGroup.MarginLayoutParams) c0153k).rightMargin = 0;
                ((android.view.ViewGroup.MarginLayoutParams) c0153k).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i3);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int size3 = android.view.View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.f2032v;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z6 = false;
        int i22 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f2033w;
            if (i21 >= childCount2) {
                break;
            }
            android.view.View childAt = getChildAt(i21);
            int i23 = size3;
            int i24 = i13;
            if (childAt.getVisibility() == 8) {
                i9 = mode;
                i10 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof androidx.appcompat.view.menu.ActionMenuItemView;
                int i25 = i19 + 1;
                if (z7) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                h.C0153k c0153k2 = (h.C0153k) childAt.getLayoutParams();
                c0153k2.f3192h = false;
                c0153k2.f3189e = 0;
                c0153k2.f3188d = 0;
                c0153k2.f3190f = false;
                ((android.view.ViewGroup.MarginLayoutParams) c0153k2).leftMargin = 0;
                ((android.view.ViewGroup.MarginLayoutParams) c0153k2).rightMargin = 0;
                c0153k2.f3191g = z7 && !android.text.TextUtils.isEmpty(((androidx.appcompat.view.menu.ActionMenuItemView) childAt).getText());
                int i26 = c0153k2.f3187c ? 1 : i15;
                h.C0153k c0153k3 = (h.C0153k) childAt.getLayoutParams();
                i9 = mode;
                i10 = paddingBottom;
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, android.view.View.MeasureSpec.getMode(childMeasureSpec));
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = z7 ? (androidx.appcompat.view.menu.ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || android.text.TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i26 <= 0 || (z8 && i26 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i26 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i17;
                    if (measuredWidth % i17 != 0) {
                        i11++;
                    }
                    if (z8 && i11 < 2) {
                        i11 = 2;
                    }
                }
                c0153k3.f3190f = !c0153k3.f3187c && z8;
                c0153k3.f3188d = i11;
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i11 * i17, 1073741824), makeMeasureSpec);
                i20 = java.lang.Math.max(i20, i11);
                if (c0153k2.f3190f) {
                    i22++;
                }
                if (c0153k2.f3187c) {
                    z6 = true;
                }
                i15 -= i11;
                i18 = java.lang.Math.max(i18, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j2 |= 1 << i21;
                }
                i19 = i25;
            }
            i21++;
            size3 = i23;
            i13 = i24;
            paddingBottom = i10;
            mode = i9;
        }
        int i27 = mode;
        int i28 = i13;
        int i29 = size3;
        boolean z9 = z6 && i19 == 2;
        boolean z10 = false;
        while (i22 > 0 && i15 > 0) {
            int i30 = Integer.MAX_VALUE;
            int i31 = 0;
            int i32 = 0;
            long j3 = 0;
            while (i32 < childCount2) {
                h.C0153k c0153k4 = (h.C0153k) getChildAt(i32).getLayoutParams();
                boolean z11 = z10;
                if (c0153k4.f3190f) {
                    int i33 = c0153k4.f3188d;
                    if (i33 < i30) {
                        j3 = 1 << i32;
                        i30 = i33;
                        i31 = 1;
                    } else if (i33 == i30) {
                        j3 |= 1 << i32;
                        i31++;
                    }
                }
                i32++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i31 > i15) {
                break;
            }
            int i34 = i30 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                android.view.View childAt2 = getChildAt(i35);
                h.C0153k c0153k5 = (h.C0153k) childAt2.getLayoutParams();
                int i36 = i18;
                int i37 = childMeasureSpec;
                int i38 = childCount2;
                long j4 = 1 << i35;
                if ((j3 & j4) != 0) {
                    if (z9 && c0153k5.f3191g) {
                        r4 = 1;
                        r4 = 1;
                        if (i15 == 1) {
                            childAt2.setPadding(i4 + i17, 0, i4, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0153k5.f3188d += r4;
                    c0153k5.f3192h = r4;
                    i15--;
                } else if (c0153k5.f3188d == i34) {
                    j2 |= j4;
                }
                i35++;
                childMeasureSpec = i37;
                i18 = i36;
                childCount2 = i38;
            }
            z10 = true;
        }
        z2 = z10;
        int i39 = i18;
        int i40 = childMeasureSpec;
        int i41 = childCount2;
        boolean z12 = !z6 && i19 == 1;
        if (i15 <= 0 || j2 == 0 || (i15 >= i19 - 1 && !z12 && i20 <= 1)) {
            i5 = i41;
            z3 = z2;
        } else {
            float bitCount = java.lang.Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((h.C0153k) getChildAt(0).getLayoutParams()).f3191g) {
                    bitCount -= 0.5f;
                }
                int i42 = i41 - 1;
                if ((j2 & (1 << i42)) != 0 && !((h.C0153k) getChildAt(i42).getLayoutParams()).f3191g) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) ((i15 * i17) / bitCount) : 0;
            boolean z13 = z2;
            i5 = i41;
            for (int i44 = 0; i44 < i5; i44++) {
                if ((j2 & (1 << i44)) != 0) {
                    android.view.View childAt3 = getChildAt(i44);
                    h.C0153k c0153k6 = (h.C0153k) childAt3.getLayoutParams();
                    if (childAt3 instanceof androidx.appcompat.view.menu.ActionMenuItemView) {
                        c0153k6.f3189e = i43;
                        c0153k6.f3192h = true;
                        if (i44 == 0 && !c0153k6.f3191g) {
                            ((android.view.ViewGroup.MarginLayoutParams) c0153k6).leftMargin = (-i43) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0153k6.f3187c) {
                            c0153k6.f3189e = i43;
                            c0153k6.f3192h = true;
                            ((android.view.ViewGroup.MarginLayoutParams) c0153k6).rightMargin = (-i43) / 2;
                            z13 = true;
                        } else {
                            if (i44 != 0) {
                                ((android.view.ViewGroup.MarginLayoutParams) c0153k6).leftMargin = i43 / 2;
                            }
                            if (i44 != i5 - 1) {
                                ((android.view.ViewGroup.MarginLayoutParams) c0153k6).rightMargin = i43 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i45 = 0;
            while (i45 < i5) {
                android.view.View childAt4 = getChildAt(i45);
                h.C0153k c0153k7 = (h.C0153k) childAt4.getLayoutParams();
                if (c0153k7.f3192h) {
                    i8 = i40;
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((c0153k7.f3188d * i17) + c0153k7.f3189e, 1073741824), i8);
                } else {
                    i8 = i40;
                }
                i45++;
                i40 = i8;
            }
        }
        if (i27 != 1073741824) {
            i7 = i28;
            i6 = i39;
        } else {
            i6 = i29;
            i7 = i28;
        }
        setMeasuredDimension(i7, i6);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f2030s.f3176p = z2;
    }

    public void setOnMenuItemClickListener(h.InterfaceC0154l interfaceC0154l) {
        this.f2034x = interfaceC0154l;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        getMenu();
        h.C0151i c0151i = this.f2030s;
        h.C0150h c0150h = c0151i.f3168h;
        if (c0150h != null) {
            c0150h.setImageDrawable(drawable);
        } else {
            c0151i.f3170j = true;
            c0151i.f3169i = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
    }

    public void setPopupTheme(int i2) {
        if (this.f2029r != i2) {
            this.f2029r = i2;
            if (i2 == 0) {
                this.f2028q = getContext();
            } else {
                this.f2028q = new android.view.ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(h.C0151i c0151i) {
        this.f2030s = c0151i;
        c0151i.f3167g = this;
        this.f2027p = c0151i.f3163c;
    }

    @Override // h.AbstractC0135D, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new h.C0153k(getContext(), attributeSet);
    }
}
