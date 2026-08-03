package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements y.InterfaceC1020h, y.InterfaceC1021i {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2003y = {com.watchfacestudio.huasi_urx110.R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: a, reason: collision with root package name */
    public int f2004a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.widget.ContentFrameLayout f2005b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContainer f2006c;

    /* renamed from: d, reason: collision with root package name */
    public h.InterfaceC0164w f2007d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f2008e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2009f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2010g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2011h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2012i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2013j;

    /* renamed from: k, reason: collision with root package name */
    public int f2014k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Rect f2015l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f2016m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f2017n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f2018o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f2019p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f2020q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f2021r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.OverScroller f2022s;
    public android.view.ViewPropertyAnimator t;

    /* renamed from: u, reason: collision with root package name */
    public final h.C0144b f2023u;

    /* renamed from: v, reason: collision with root package name */
    public final h.RunnableC0145c f2024v;

    /* renamed from: w, reason: collision with root package name */
    public final h.RunnableC0145c f2025w;

    /* renamed from: x, reason: collision with root package name */
    public final P.C0039l f2026x;

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2015l = new android.graphics.Rect();
        this.f2016m = new android.graphics.Rect();
        this.f2017n = new android.graphics.Rect();
        this.f2018o = new android.graphics.Rect();
        this.f2019p = new android.graphics.Rect();
        this.f2020q = new android.graphics.Rect();
        this.f2021r = new android.graphics.Rect();
        this.f2023u = new h.C0144b(this);
        this.f2024v = new h.RunnableC0145c(this, 0);
        this.f2025w = new h.RunnableC0145c(this, 1);
        i(context);
        this.f2026x = new P.C0039l(2);
    }

    public static boolean g(android.view.View view, android.graphics.Rect rect, boolean z2) {
        boolean z3;
        h.C0147e c0147e = (h.C0147e) view.getLayoutParams();
        int i2 = ((android.view.ViewGroup.MarginLayoutParams) c0147e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((android.view.ViewGroup.MarginLayoutParams) c0147e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((android.view.ViewGroup.MarginLayoutParams) c0147e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((android.view.ViewGroup.MarginLayoutParams) c0147e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((android.view.ViewGroup.MarginLayoutParams) c0147e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((android.view.ViewGroup.MarginLayoutParams) c0147e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((android.view.ViewGroup.MarginLayoutParams) c0147e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((android.view.ViewGroup.MarginLayoutParams) c0147e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // y.InterfaceC1020h
    public final void a(android.view.View view, android.view.View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // y.InterfaceC1020h
    public final void b(android.view.ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // y.InterfaceC1020h
    public final void c(android.view.View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h.C0147e;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f2008e == null || this.f2009f) {
            return;
        }
        if (this.f2006c.getVisibility() == 0) {
            i2 = (int) (this.f2006c.getTranslationY() + this.f2006c.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f2008e.setBounds(0, i2, getWidth(), this.f2008e.getIntrinsicHeight() + i2);
        this.f2008e.draw(canvas);
    }

    @Override // y.InterfaceC1021i
    public final void e(android.view.ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        b(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // y.InterfaceC1020h
    public final boolean f(android.view.View view, android.view.View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect rect) {
        j();
        java.lang.reflect.Field field = y.x.f8478a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f2006c, rect, false);
        android.graphics.Rect rect2 = this.f2018o;
        rect2.set(rect);
        java.lang.reflect.Method method = h.t0.f3264a;
        android.graphics.Rect rect3 = this.f2015l;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (java.lang.Exception e2) {
                android.util.Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        android.graphics.Rect rect4 = this.f2019p;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        android.graphics.Rect rect5 = this.f2016m;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g2 = true;
        }
        if (g2) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new h.C0147e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new h.C0147e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f2006c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        P.C0039l c0039l = this.f2026x;
        return c0039l.f1286c | c0039l.f1285b;
    }

    public java.lang.CharSequence getTitle() {
        j();
        return ((h.n0) this.f2007d).f3206a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f2024v);
        removeCallbacks(this.f2025w);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2003y);
        this.f2004a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2008e = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f2009f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2022s = new android.widget.OverScroller(context);
    }

    public final void j() {
        h.InterfaceC0164w wrapper;
        if (this.f2005b == null) {
            this.f2005b = (androidx.appcompat.widget.ContentFrameLayout) findViewById(com.watchfacestudio.huasi_urx110.R.id.action_bar_activity_content);
            this.f2006c = (androidx.appcompat.widget.ActionBarContainer) findViewById(com.watchfacestudio.huasi_urx110.R.id.action_bar_container);
            android.view.KeyEvent.Callback findViewById = findViewById(com.watchfacestudio.huasi_urx110.R.id.action_bar);
            if (findViewById instanceof h.InterfaceC0164w) {
                wrapper = (h.InterfaceC0164w) findViewById;
            } else {
                if (!(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
                    throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((androidx.appcompat.widget.Toolbar) findViewById).getWrapper();
            }
            this.f2007d = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        java.lang.reflect.Field field = y.x.f8478a;
        y.AbstractC1026n.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                h.C0147e c0147e = (h.C0147e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((android.view.ViewGroup.MarginLayoutParams) c0147e).leftMargin + paddingLeft;
                int i8 = ((android.view.ViewGroup.MarginLayoutParams) c0147e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f2006c, i2, 0, i3, 0);
        h.C0147e c0147e = (h.C0147e) this.f2006c.getLayoutParams();
        int i4 = 0;
        int max = java.lang.Math.max(0, this.f2006c.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) c0147e).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0147e).rightMargin);
        int max2 = java.lang.Math.max(0, this.f2006c.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) c0147e).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0147e).bottomMargin);
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, this.f2006c.getMeasuredState());
        java.lang.reflect.Field field = y.x.f8478a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f2004a;
            if (this.f2011h && this.f2006c.getTabContainer() != null) {
                i4 += this.f2004a;
            }
        } else if (this.f2006c.getVisibility() != 8) {
            i4 = this.f2006c.getMeasuredHeight();
        }
        android.graphics.Rect rect = this.f2015l;
        android.graphics.Rect rect2 = this.f2017n;
        rect2.set(rect);
        android.graphics.Rect rect3 = this.f2020q;
        rect3.set(this.f2018o);
        if (this.f2010g || z2) {
            rect3.top += i4;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
        }
        g(this.f2005b, rect2, true);
        android.graphics.Rect rect4 = this.f2021r;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f2005b.a(rect3);
        }
        measureChildWithMargins(this.f2005b, i2, 0, i3, 0);
        h.C0147e c0147e2 = (h.C0147e) this.f2005b.getLayoutParams();
        int max3 = java.lang.Math.max(max, this.f2005b.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) c0147e2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0147e2).rightMargin);
        int max4 = java.lang.Math.max(max2, this.f2005b.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) c0147e2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0147e2).bottomMargin);
        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(combineMeasuredStates, this.f2005b.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f2, float f3, boolean z2) {
        if (!this.f2012i || !z2) {
            return false;
        }
        this.f2022s.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2022s.getFinalY() > this.f2006c.getHeight()) {
            h();
            this.f2025w.run();
        } else {
            h();
            this.f2024v.run();
        }
        this.f2013j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f2014k + i3;
        this.f2014k = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        this.f2026x.f1285b = i2;
        this.f2014k = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        if ((i2 & 2) == 0 || this.f2006c.getVisibility() != 0) {
            return false;
        }
        return this.f2012i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        if (!this.f2012i || this.f2013j) {
            return;
        }
        if (this.f2014k <= this.f2006c.getHeight()) {
            h();
            postDelayed(this.f2024v, 600L);
        } else {
            h();
            postDelayed(this.f2025w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f2006c.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i2, this.f2006c.getHeight())));
    }

    public void setActionBarVisibilityCallback(h.InterfaceC0146d interfaceC0146d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f2011h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f2012i) {
            this.f2012i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        h.n0 n0Var = (h.n0) this.f2007d;
        n0Var.f3209d = i2 != 0 ? d.AbstractC0106a.a(n0Var.f3206a.getContext(), i2) : null;
        n0Var.c();
    }

    public void setLogo(int i2) {
        j();
        h.n0 n0Var = (h.n0) this.f2007d;
        n0Var.f3210e = i2 != 0 ? d.AbstractC0106a.a(n0Var.f3206a.getContext(), i2) : null;
        n0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f2010g = z2;
        this.f2009f = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(android.view.Window.Callback callback) {
        j();
        ((h.n0) this.f2007d).f3216k = callback;
    }

    public void setWindowTitle(java.lang.CharSequence charSequence) {
        j();
        h.n0 n0Var = (h.n0) this.f2007d;
        if (n0Var.f3212g) {
            return;
        }
        n0Var.f3213h = charSequence;
        if ((n0Var.f3207b & 8) != 0) {
            n0Var.f3206a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new h.C0147e(layoutParams);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        j();
        h.n0 n0Var = (h.n0) this.f2007d;
        n0Var.f3209d = drawable;
        n0Var.c();
    }

    @Override // y.InterfaceC1020h
    public final void d(int i2, int i3, int[] iArr, int i4) {
    }
}
