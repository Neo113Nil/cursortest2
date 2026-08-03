package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public android.content.res.ColorStateList f2123A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2124B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2125C;

    /* renamed from: D, reason: collision with root package name */
    public final java.util.ArrayList f2126D;

    /* renamed from: E, reason: collision with root package name */
    public final java.util.ArrayList f2127E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f2128F;
    public final Z0.h G;

    /* renamed from: H, reason: collision with root package name */
    public h.n0 f2129H;

    /* renamed from: I, reason: collision with root package name */
    public h.j0 f2130I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2131J;

    /* renamed from: K, reason: collision with root package name */
    public final C.b f2132K;

    /* renamed from: a, reason: collision with root package name */
    public androidx.appcompat.widget.ActionMenuView f2133a;

    /* renamed from: b, reason: collision with root package name */
    public h.C0161t f2134b;

    /* renamed from: c, reason: collision with root package name */
    public h.C0161t f2135c;

    /* renamed from: d, reason: collision with root package name */
    public h.C0158p f2136d;

    /* renamed from: e, reason: collision with root package name */
    public h.C0159q f2137e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f2138f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f2139g;

    /* renamed from: h, reason: collision with root package name */
    public h.C0158p f2140h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f2141i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.Context f2142j;

    /* renamed from: k, reason: collision with root package name */
    public int f2143k;

    /* renamed from: l, reason: collision with root package name */
    public int f2144l;

    /* renamed from: m, reason: collision with root package name */
    public int f2145m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2146n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2147o;

    /* renamed from: p, reason: collision with root package name */
    public int f2148p;

    /* renamed from: q, reason: collision with root package name */
    public int f2149q;

    /* renamed from: r, reason: collision with root package name */
    public int f2150r;

    /* renamed from: s, reason: collision with root package name */
    public int f2151s;
    public h.O t;

    /* renamed from: u, reason: collision with root package name */
    public int f2152u;

    /* renamed from: v, reason: collision with root package name */
    public int f2153v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2154w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.CharSequence f2155x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.CharSequence f2156y;

    /* renamed from: z, reason: collision with root package name */
    public android.content.res.ColorStateList f2157z;

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.toolbarStyle);
        this.f2154w = 8388627;
        this.f2126D = new java.util.ArrayList();
        this.f2127E = new java.util.ArrayList();
        this.f2128F = new int[2];
        this.G = new Z0.h(21, this);
        this.f2132K = new C.b(8, this);
        I0.b H2 = I0.b.H(getContext(), attributeSet, c.AbstractC0095a.t, com.watchfacestudio.huasi_urx110.R.attr.toolbarStyle);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
        this.f2144l = typedArray.getResourceId(28, 0);
        this.f2145m = typedArray.getResourceId(19, 0);
        this.f2154w = typedArray.getInteger(0, 8388627);
        this.f2146n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2151s = dimensionPixelOffset;
        this.f2150r = dimensionPixelOffset;
        this.f2149q = dimensionPixelOffset;
        this.f2148p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2148p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2149q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2150r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2151s = dimensionPixelOffset5;
        }
        this.f2147o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        h.O o2 = this.t;
        o2.f3109h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o2.f3106e = dimensionPixelSize;
            o2.f3102a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o2.f3107f = dimensionPixelSize2;
            o2.f3103b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o2.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2152u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2153v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2138f = H2.A(4);
        this.f2139g = typedArray.getText(3);
        java.lang.CharSequence text = typedArray.getText(21);
        if (!android.text.TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        java.lang.CharSequence text2 = typedArray.getText(18);
        if (!android.text.TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2142j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        android.graphics.drawable.Drawable A2 = H2.A(16);
        if (A2 != null) {
            setNavigationIcon(A2);
        }
        java.lang.CharSequence text3 = typedArray.getText(15);
        if (!android.text.TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        android.graphics.drawable.Drawable A3 = H2.A(11);
        if (A3 != null) {
            setLogo(A3);
        }
        java.lang.CharSequence text4 = typedArray.getText(12);
        if (!android.text.TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(H2.z(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(H2.z(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        H2.K();
    }

    public static h.k0 g() {
        h.k0 k0Var = new h.k0(-2, -2);
        k0Var.f3194b = 0;
        k0Var.f3193a = 8388627;
        return k0Var;
    }

    private android.view.MenuInflater getMenuInflater() {
        return new f.C0113d(getContext());
    }

    public static h.k0 h(android.view.ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof h.k0;
        if (z2) {
            h.k0 k0Var = (h.k0) layoutParams;
            h.k0 k0Var2 = new h.k0(k0Var);
            k0Var2.f3194b = 0;
            k0Var2.f3194b = k0Var.f3194b;
            return k0Var2;
        }
        if (z2) {
            h.k0 k0Var3 = new h.k0((h.k0) layoutParams);
            k0Var3.f3194b = 0;
            return k0Var3;
        }
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            h.k0 k0Var4 = new h.k0(layoutParams);
            k0Var4.f3194b = 0;
            return k0Var4;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        h.k0 k0Var5 = new h.k0(marginLayoutParams);
        k0Var5.f3194b = 0;
        ((android.view.ViewGroup.MarginLayoutParams) k0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((android.view.ViewGroup.MarginLayoutParams) k0Var5).topMargin = marginLayoutParams.topMargin;
        ((android.view.ViewGroup.MarginLayoutParams) k0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((android.view.ViewGroup.MarginLayoutParams) k0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return k0Var5;
    }

    public static int k(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(java.util.ArrayList arrayList, int i2) {
        java.lang.reflect.Field field = y.x.f8478a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                h.k0 k0Var = (h.k0) childAt.getLayoutParams();
                if (k0Var.f3194b == 0 && r(childAt) && i(k0Var.f3193a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            android.view.View childAt2 = getChildAt(i4);
            h.k0 k0Var2 = (h.k0) childAt2.getLayoutParams();
            if (k0Var2.f3194b == 0 && r(childAt2) && i(k0Var2.f3193a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(android.view.View view, boolean z2) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        h.k0 g2 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (h.k0) layoutParams;
        g2.f3194b = 1;
        if (!z2 || this.f2141i == null) {
            addView(view, g2);
        } else {
            view.setLayoutParams(g2);
            this.f2127E.add(view);
        }
    }

    public final void c() {
        if (this.f2140h == null) {
            h.C0158p c0158p = new h.C0158p(getContext());
            this.f2140h = c0158p;
            c0158p.setImageDrawable(this.f2138f);
            this.f2140h.setContentDescription(this.f2139g);
            h.k0 g2 = g();
            g2.f3193a = (this.f2146n & 112) | 8388611;
            g2.f3194b = 2;
            this.f2140h.setLayoutParams(g2);
            this.f2140h.setOnClickListener(new h.i0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof h.k0);
    }

    public final void d() {
        if (this.t == null) {
            h.O o2 = new h.O();
            o2.f3102a = 0;
            o2.f3103b = 0;
            o2.f3104c = Integer.MIN_VALUE;
            o2.f3105d = Integer.MIN_VALUE;
            o2.f3106e = 0;
            o2.f3107f = 0;
            o2.f3108g = false;
            o2.f3109h = false;
            this.t = o2;
        }
    }

    public final void e() {
        if (this.f2133a == null) {
            androidx.appcompat.widget.ActionMenuView actionMenuView = new androidx.appcompat.widget.ActionMenuView(getContext(), null);
            this.f2133a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2143k);
            this.f2133a.setOnMenuItemClickListener(this.G);
            this.f2133a.getClass();
            h.k0 g2 = g();
            g2.f3193a = (this.f2146n & 112) | 8388613;
            this.f2133a.setLayoutParams(g2);
            b(this.f2133a, false);
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView2 = this.f2133a;
        if (actionMenuView2.f2027p == null) {
            g.j jVar = (g.j) actionMenuView2.getMenu();
            if (this.f2130I == null) {
                this.f2130I = new h.j0(this);
            }
            this.f2133a.setExpandedActionViewsExclusive(true);
            jVar.b(this.f2130I, this.f2142j);
        }
    }

    public final void f() {
        if (this.f2136d == null) {
            this.f2136d = new h.C0158p(getContext());
            h.k0 g2 = g();
            g2.f3193a = (this.f2146n & 112) | 8388611;
            this.f2136d.setLayoutParams(g2);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public java.lang.CharSequence getCollapseContentDescription() {
        h.C0158p c0158p = this.f2140h;
        if (c0158p != null) {
            return c0158p.getContentDescription();
        }
        return null;
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
        h.C0158p c0158p = this.f2140h;
        if (c0158p != null) {
            return c0158p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        h.O o2 = this.t;
        if (o2 != null) {
            return o2.f3108g ? o2.f3102a : o2.f3103b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f2153v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        h.O o2 = this.t;
        if (o2 != null) {
            return o2.f3102a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        h.O o2 = this.t;
        if (o2 != null) {
            return o2.f3103b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        h.O o2 = this.t;
        if (o2 != null) {
            return o2.f3108g ? o2.f3103b : o2.f3102a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f2152u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        g.j jVar;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f2133a;
        return (actionMenuView == null || (jVar = actionMenuView.f2027p) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : java.lang.Math.max(getContentInsetEnd(), java.lang.Math.max(this.f2153v, 0));
    }

    public int getCurrentContentInsetLeft() {
        java.lang.reflect.Field field = y.x.f8478a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        java.lang.reflect.Field field = y.x.f8478a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? java.lang.Math.max(getContentInsetStart(), java.lang.Math.max(this.f2152u, 0)) : getContentInsetStart();
    }

    public android.graphics.drawable.Drawable getLogo() {
        h.C0159q c0159q = this.f2137e;
        if (c0159q != null) {
            return c0159q.getDrawable();
        }
        return null;
    }

    public java.lang.CharSequence getLogoDescription() {
        h.C0159q c0159q = this.f2137e;
        if (c0159q != null) {
            return c0159q.getContentDescription();
        }
        return null;
    }

    public android.view.Menu getMenu() {
        e();
        return this.f2133a.getMenu();
    }

    public java.lang.CharSequence getNavigationContentDescription() {
        h.C0158p c0158p = this.f2136d;
        if (c0158p != null) {
            return c0158p.getContentDescription();
        }
        return null;
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
        h.C0158p c0158p = this.f2136d;
        if (c0158p != null) {
            return c0158p.getDrawable();
        }
        return null;
    }

    public h.C0151i getOuterActionMenuPresenter() {
        return null;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        e();
        return this.f2133a.getOverflowIcon();
    }

    public android.content.Context getPopupContext() {
        return this.f2142j;
    }

    public int getPopupTheme() {
        return this.f2143k;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f2156y;
    }

    public final android.widget.TextView getSubtitleTextView() {
        return this.f2135c;
    }

    public java.lang.CharSequence getTitle() {
        return this.f2155x;
    }

    public int getTitleMarginBottom() {
        return this.f2151s;
    }

    public int getTitleMarginEnd() {
        return this.f2149q;
    }

    public int getTitleMarginStart() {
        return this.f2148p;
    }

    public int getTitleMarginTop() {
        return this.f2150r;
    }

    public final android.widget.TextView getTitleTextView() {
        return this.f2134b;
    }

    public h.InterfaceC0164w getWrapper() {
        android.graphics.drawable.Drawable drawable;
        if (this.f2129H == null) {
            h.n0 n0Var = new h.n0();
            n0Var.f3217l = 0;
            n0Var.f3206a = this;
            n0Var.f3213h = getTitle();
            n0Var.f3214i = getSubtitle();
            n0Var.f3212g = n0Var.f3213h != null;
            n0Var.f3211f = getNavigationIcon();
            I0.b H2 = I0.b.H(getContext(), null, c.AbstractC0095a.f2532a, com.watchfacestudio.huasi_urx110.R.attr.actionBarStyle);
            n0Var.f3218m = H2.A(15);
            android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
            java.lang.CharSequence text = typedArray.getText(27);
            if (!android.text.TextUtils.isEmpty(text)) {
                n0Var.f3212g = true;
                n0Var.f3213h = text;
                if ((n0Var.f3207b & 8) != 0) {
                    n0Var.f3206a.setTitle(text);
                }
            }
            java.lang.CharSequence text2 = typedArray.getText(25);
            if (!android.text.TextUtils.isEmpty(text2)) {
                n0Var.f3214i = text2;
                if ((n0Var.f3207b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            android.graphics.drawable.Drawable A2 = H2.A(20);
            if (A2 != null) {
                n0Var.f3210e = A2;
                n0Var.c();
            }
            android.graphics.drawable.Drawable A3 = H2.A(17);
            if (A3 != null) {
                n0Var.f3209d = A3;
                n0Var.c();
            }
            if (n0Var.f3211f == null && (drawable = n0Var.f3218m) != null) {
                n0Var.f3211f = drawable;
                int i2 = n0Var.f3207b & 4;
                androidx.appcompat.widget.Toolbar toolbar = n0Var.f3206a;
                if (i2 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            n0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(resourceId, (android.view.ViewGroup) this, false);
                android.view.View view = n0Var.f3208c;
                if (view != null && (n0Var.f3207b & 16) != 0) {
                    removeView(view);
                }
                n0Var.f3208c = inflate;
                if (inflate != null && (n0Var.f3207b & 16) != 0) {
                    addView(inflate);
                }
                n0Var.a(n0Var.f3207b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = java.lang.Math.max(dimensionPixelOffset, 0);
                int max2 = java.lang.Math.max(dimensionPixelOffset2, 0);
                d();
                this.t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                android.content.Context context = getContext();
                this.f2144l = resourceId2;
                h.C0161t c0161t = this.f2134b;
                if (c0161t != null) {
                    c0161t.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                android.content.Context context2 = getContext();
                this.f2145m = resourceId3;
                h.C0161t c0161t2 = this.f2135c;
                if (c0161t2 != null) {
                    c0161t2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            H2.K();
            if (com.watchfacestudio.huasi_urx110.R.string.abc_action_bar_up_description != n0Var.f3217l) {
                n0Var.f3217l = com.watchfacestudio.huasi_urx110.R.string.abc_action_bar_up_description;
                if (android.text.TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = n0Var.f3217l;
                    n0Var.f3215j = i3 != 0 ? getContext().getString(i3) : null;
                    n0Var.b();
                }
            }
            n0Var.f3215j = getNavigationContentDescription();
            setNavigationOnClickListener(new h.i0(n0Var));
            this.f2129H = n0Var;
        }
        return this.f2129H;
    }

    public final int i(int i2) {
        java.lang.reflect.Field field = y.x.f8478a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(android.view.View view, int i2) {
        h.k0 k0Var = (h.k0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = k0Var.f3193a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f2154w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((android.view.ViewGroup.MarginLayoutParams) k0Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((android.view.ViewGroup.MarginLayoutParams) k0Var).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((android.view.ViewGroup.MarginLayoutParams) k0Var).bottomMargin;
            if (i7 < i8) {
                i5 = java.lang.Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final boolean m(android.view.View view) {
        return view.getParent() == this || this.f2127E.contains(view);
    }

    public final int n(android.view.View view, int i2, int i3, int[] iArr) {
        h.k0 k0Var = (h.k0) view.getLayoutParams();
        int i4 = ((android.view.ViewGroup.MarginLayoutParams) k0Var).leftMargin - iArr[0];
        int max = java.lang.Math.max(0, i4) + i2;
        iArr[0] = java.lang.Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) k0Var).rightMargin + max;
    }

    public final int o(android.view.View view, int i2, int i3, int[] iArr) {
        h.k0 k0Var = (h.k0) view.getLayoutParams();
        int i4 = ((android.view.ViewGroup.MarginLayoutParams) k0Var).rightMargin - iArr[1];
        int max = i2 - java.lang.Math.max(0, i4);
        iArr[1] = java.lang.Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) k0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2132K);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2125C = false;
        }
        if (!this.f2125C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2125C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2125C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean r2;
        boolean r3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int size3;
        int i22;
        int i23;
        int size4;
        int i24;
        java.lang.reflect.Field field = y.x.f8478a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f2128F;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? java.lang.Math.min(minimumHeight, i5 - i3) : 0;
        if (!r(this.f2136d)) {
            i6 = paddingLeft;
        } else {
            if (z4) {
                i7 = o(this.f2136d, i25, min, iArr);
                i6 = paddingLeft;
                if (r(this.f2140h)) {
                    if (z4) {
                        i7 = o(this.f2140h, i7, min, iArr);
                    } else {
                        i6 = n(this.f2140h, i6, min, iArr);
                    }
                }
                if (r(this.f2133a)) {
                    if (z4) {
                        i6 = n(this.f2133a, i6, min, iArr);
                    } else {
                        i7 = o(this.f2133a, i7, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = java.lang.Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = java.lang.Math.max(0, currentContentInsetRight - (i25 - i7));
                int max = java.lang.Math.max(i6, currentContentInsetLeft);
                int min2 = java.lang.Math.min(i7, i25 - currentContentInsetRight);
                if (r(this.f2141i)) {
                    if (z4) {
                        min2 = o(this.f2141i, min2, min, iArr);
                    } else {
                        max = n(this.f2141i, max, min, iArr);
                    }
                }
                if (r(this.f2137e)) {
                    if (z4) {
                        min2 = o(this.f2137e, min2, min, iArr);
                    } else {
                        max = n(this.f2137e, max, min, iArr);
                    }
                }
                r2 = r(this.f2134b);
                r3 = r(this.f2135c);
                if (r2) {
                    i8 = paddingRight;
                    i9 = 0;
                } else {
                    h.k0 k0Var = (h.k0) this.f2134b.getLayoutParams();
                    i8 = paddingRight;
                    i9 = ((android.view.ViewGroup.MarginLayoutParams) k0Var).bottomMargin + this.f2134b.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) k0Var).topMargin;
                }
                if (r3) {
                    i10 = width;
                } else {
                    h.k0 k0Var2 = (h.k0) this.f2135c.getLayoutParams();
                    i10 = width;
                    i9 += this.f2135c.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) k0Var2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) k0Var2).bottomMargin;
                }
                if (!r2 || r3) {
                    h.C0161t c0161t = !r2 ? this.f2134b : this.f2135c;
                    h.C0161t c0161t2 = !r3 ? this.f2135c : this.f2134b;
                    h.k0 k0Var3 = (h.k0) c0161t.getLayoutParams();
                    h.k0 k0Var4 = (h.k0) c0161t2.getLayoutParams();
                    if ((r2 || this.f2134b.getMeasuredWidth() <= 0) && (!r3 || this.f2135c.getMeasuredWidth() <= 0)) {
                        i11 = paddingLeft;
                        z3 = false;
                    } else {
                        i11 = paddingLeft;
                        z3 = true;
                    }
                    i12 = this.f2154w & 112;
                    i13 = min;
                    if (i12 != 48) {
                        i14 = max;
                        paddingTop = getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) k0Var3).topMargin + this.f2150r;
                    } else if (i12 != 80) {
                        int i26 = (((height - paddingTop2) - paddingBottom) - i9) / 2;
                        i14 = max;
                        int i27 = ((android.view.ViewGroup.MarginLayoutParams) k0Var3).topMargin + this.f2150r;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i9) - i26) - paddingTop2;
                            int i29 = ((android.view.ViewGroup.MarginLayoutParams) k0Var3).bottomMargin;
                            int i30 = this.f2151s;
                            if (i28 < i29 + i30) {
                                i26 = java.lang.Math.max(0, i26 - ((((android.view.ViewGroup.MarginLayoutParams) k0Var4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i26;
                    } else {
                        i14 = max;
                        paddingTop = (((height - paddingBottom) - ((android.view.ViewGroup.MarginLayoutParams) k0Var4).bottomMargin) - this.f2151s) - i9;
                    }
                    if (z4) {
                        int i31 = (z3 ? this.f2148p : 0) - iArr[0];
                        int max2 = java.lang.Math.max(0, i31) + i14;
                        iArr[0] = java.lang.Math.max(0, -i31);
                        if (r2) {
                            h.k0 k0Var5 = (h.k0) this.f2134b.getLayoutParams();
                            int measuredWidth = this.f2134b.getMeasuredWidth() + max2;
                            int measuredHeight = this.f2134b.getMeasuredHeight() + paddingTop;
                            this.f2134b.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.f2149q;
                            paddingTop = measuredHeight + ((android.view.ViewGroup.MarginLayoutParams) k0Var5).bottomMargin;
                        } else {
                            i15 = max2;
                        }
                        if (r3) {
                            int i32 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((h.k0) this.f2135c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f2135c.getMeasuredWidth() + max2;
                            this.f2135c.layout(max2, i32, measuredWidth2, this.f2135c.getMeasuredHeight() + i32);
                            i16 = measuredWidth2 + this.f2149q;
                        } else {
                            i16 = max2;
                        }
                        max = z3 ? java.lang.Math.max(i15, i16) : max2;
                    } else {
                        int i33 = (z3 ? this.f2148p : 0) - iArr[1];
                        min2 -= java.lang.Math.max(0, i33);
                        iArr[1] = java.lang.Math.max(0, -i33);
                        if (r2) {
                            h.k0 k0Var6 = (h.k0) this.f2134b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f2134b.getMeasuredWidth();
                            int measuredHeight2 = this.f2134b.getMeasuredHeight() + paddingTop;
                            this.f2134b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.f2149q;
                            paddingTop = measuredHeight2 + ((android.view.ViewGroup.MarginLayoutParams) k0Var6).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (r3) {
                            int i34 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) ((h.k0) this.f2135c.getLayoutParams())).topMargin;
                            this.f2135c.layout(min2 - this.f2135c.getMeasuredWidth(), i34, min2, this.f2135c.getMeasuredHeight() + i34);
                            i18 = min2 - this.f2149q;
                        } else {
                            i18 = min2;
                        }
                        if (z3) {
                            min2 = java.lang.Math.min(i17, i18);
                        }
                        max = i14;
                    }
                } else {
                    i11 = paddingLeft;
                    i13 = min;
                }
                java.util.ArrayList arrayList = this.f2126D;
                a(arrayList, 3);
                size = arrayList.size();
                i19 = max;
                for (i20 = 0; i20 < size; i20++) {
                    i19 = n((android.view.View) arrayList.get(i20), i19, i13, iArr);
                }
                int i35 = i13;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i21 = 0; i21 < size2; i21++) {
                    min2 = o((android.view.View) arrayList.get(i21), min2, i35, iArr);
                }
                a(arrayList, 1);
                int i36 = iArr[0];
                int i37 = iArr[1];
                size3 = arrayList.size();
                int i38 = i37;
                int i39 = i36;
                i22 = 0;
                int i40 = 0;
                while (i22 < size3) {
                    android.view.View view = (android.view.View) arrayList.get(i22);
                    h.k0 k0Var7 = (h.k0) view.getLayoutParams();
                    int i41 = ((android.view.ViewGroup.MarginLayoutParams) k0Var7).leftMargin - i39;
                    int i42 = ((android.view.ViewGroup.MarginLayoutParams) k0Var7).rightMargin - i38;
                    int max3 = java.lang.Math.max(0, i41);
                    int max4 = java.lang.Math.max(0, i42);
                    int max5 = java.lang.Math.max(0, -i41);
                    int max6 = java.lang.Math.max(0, -i42);
                    i40 += view.getMeasuredWidth() + max3 + max4;
                    i22++;
                    i38 = max6;
                    i39 = max5;
                }
                i23 = ((((i10 - i11) - i8) / 2) + i11) - (i40 / 2);
                int i43 = i40 + i23;
                if (i23 >= i19) {
                    i19 = i43 > min2 ? i23 - (i43 - min2) : i23;
                }
                size4 = arrayList.size();
                for (i24 = 0; i24 < size4; i24++) {
                    i19 = n((android.view.View) arrayList.get(i24), i19, i35, iArr);
                }
                arrayList.clear();
            }
            i6 = n(this.f2136d, paddingLeft, min, iArr);
        }
        i7 = i25;
        if (r(this.f2140h)) {
        }
        if (r(this.f2133a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = java.lang.Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = java.lang.Math.max(0, currentContentInsetRight2 - (i25 - i7));
        int max7 = java.lang.Math.max(i6, currentContentInsetLeft2);
        int min22 = java.lang.Math.min(i7, i25 - currentContentInsetRight2);
        if (r(this.f2141i)) {
        }
        if (r(this.f2137e)) {
        }
        r2 = r(this.f2134b);
        r3 = r(this.f2135c);
        if (r2) {
        }
        if (r3) {
        }
        if (r2) {
        }
        if (!r2) {
        }
        if (!r3) {
        }
        h.k0 k0Var32 = (h.k0) c0161t.getLayoutParams();
        h.k0 k0Var42 = (h.k0) c0161t2.getLayoutParams();
        if (r2) {
        }
        i11 = paddingLeft;
        z3 = false;
        i12 = this.f2154w & 112;
        i13 = min;
        if (i12 != 48) {
        }
        if (z4) {
        }
        java.util.ArrayList arrayList2 = this.f2126D;
        a(arrayList2, 3);
        size = arrayList2.size();
        i19 = max7;
        while (i20 < size) {
        }
        int i352 = i13;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i21 < size2) {
        }
        a(arrayList2, 1);
        int i362 = iArr[0];
        int i372 = iArr[1];
        size3 = arrayList2.size();
        int i382 = i372;
        int i392 = i362;
        i22 = 0;
        int i402 = 0;
        while (i22 < size3) {
        }
        i23 = ((((i10 - i11) - i8) / 2) + i11) - (i402 / 2);
        int i432 = i402 + i23;
        if (i23 >= i19) {
        }
        size4 = arrayList2.size();
        while (i24 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean a2 = h.t0.a(this);
        int i11 = !a2 ? 1 : 0;
        int i12 = 0;
        if (r(this.f2136d)) {
            q(this.f2136d, i2, 0, i3, this.f2147o);
            i4 = k(this.f2136d) + this.f2136d.getMeasuredWidth();
            i5 = java.lang.Math.max(0, l(this.f2136d) + this.f2136d.getMeasuredHeight());
            i6 = android.view.View.combineMeasuredStates(0, this.f2136d.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (r(this.f2140h)) {
            q(this.f2140h, i2, 0, i3, this.f2147o);
            i4 = k(this.f2140h) + this.f2140h.getMeasuredWidth();
            i5 = java.lang.Math.max(i5, l(this.f2140h) + this.f2140h.getMeasuredHeight());
            i6 = android.view.View.combineMeasuredStates(i6, this.f2140h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = java.lang.Math.max(currentContentInsetStart, i4);
        int max2 = java.lang.Math.max(0, currentContentInsetStart - i4);
        int[] iArr = this.f2128F;
        iArr[a2 ? 1 : 0] = max2;
        if (r(this.f2133a)) {
            q(this.f2133a, i2, max, i3, this.f2147o);
            i7 = k(this.f2133a) + this.f2133a.getMeasuredWidth();
            i5 = java.lang.Math.max(i5, l(this.f2133a) + this.f2133a.getMeasuredHeight());
            i6 = android.view.View.combineMeasuredStates(i6, this.f2133a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + java.lang.Math.max(currentContentInsetEnd, i7);
        iArr[i11] = java.lang.Math.max(0, currentContentInsetEnd - i7);
        if (r(this.f2141i)) {
            max3 += p(this.f2141i, i2, max3, i3, 0, iArr);
            i5 = java.lang.Math.max(i5, l(this.f2141i) + this.f2141i.getMeasuredHeight());
            i6 = android.view.View.combineMeasuredStates(i6, this.f2141i.getMeasuredState());
        }
        if (r(this.f2137e)) {
            max3 += p(this.f2137e, i2, max3, i3, 0, iArr);
            i5 = java.lang.Math.max(i5, l(this.f2137e) + this.f2137e.getMeasuredHeight());
            i6 = android.view.View.combineMeasuredStates(i6, this.f2137e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt = getChildAt(i13);
            if (((h.k0) childAt.getLayoutParams()).f3194b == 0 && r(childAt)) {
                max3 += p(childAt, i2, max3, i3, 0, iArr);
                i5 = java.lang.Math.max(i5, l(childAt) + childAt.getMeasuredHeight());
                i6 = android.view.View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.f2150r + this.f2151s;
        int i15 = this.f2148p + this.f2149q;
        if (r(this.f2134b)) {
            p(this.f2134b, i2, max3 + i15, i3, i14, iArr);
            int k2 = k(this.f2134b) + this.f2134b.getMeasuredWidth();
            i8 = l(this.f2134b) + this.f2134b.getMeasuredHeight();
            i9 = android.view.View.combineMeasuredStates(i6, this.f2134b.getMeasuredState());
            i10 = k2;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (r(this.f2135c)) {
            i10 = java.lang.Math.max(i10, p(this.f2135c, i2, max3 + i15, i3, i8 + i14, iArr));
            i8 += l(this.f2135c) + this.f2135c.getMeasuredHeight();
            i9 = android.view.View.combineMeasuredStates(i9, this.f2135c.getMeasuredState());
        }
        int max4 = java.lang.Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingRight + max3 + i10, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (this.f2131J) {
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                android.view.View childAt2 = getChildAt(i16);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i12);
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem findItem;
        if (!(parcelable instanceof h.m0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h.m0 m0Var = (h.m0) parcelable;
        super.onRestoreInstanceState(m0Var.f258a);
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f2133a;
        g.j jVar = actionMenuView != null ? actionMenuView.f2027p : null;
        int i2 = m0Var.f3198c;
        if (i2 != 0 && this.f2130I != null && jVar != null && (findItem = jVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (m0Var.f3199d) {
            C.b bVar = this.f2132K;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        h.O o2 = this.t;
        boolean z2 = i2 == 1;
        if (z2 == o2.f3108g) {
            return;
        }
        o2.f3108g = z2;
        if (!o2.f3109h) {
            o2.f3102a = o2.f3106e;
            o2.f3103b = o2.f3107f;
            return;
        }
        if (z2) {
            int i3 = o2.f3105d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = o2.f3106e;
            }
            o2.f3102a = i3;
            int i4 = o2.f3104c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = o2.f3107f;
            }
            o2.f3103b = i4;
            return;
        }
        int i5 = o2.f3104c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = o2.f3106e;
        }
        o2.f3102a = i5;
        int i6 = o2.f3105d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = o2.f3107f;
        }
        o2.f3103b = i6;
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        h.C0151i c0151i;
        h.C0148f c0148f;
        g.k kVar;
        h.m0 m0Var = new h.m0(super.onSaveInstanceState());
        h.j0 j0Var = this.f2130I;
        if (j0Var != null && (kVar = j0Var.f3185b) != null) {
            m0Var.f3198c = kVar.f2981a;
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f2133a;
        m0Var.f3199d = (actionMenuView == null || (c0151i = actionMenuView.f2030s) == null || (c0148f = c0151i.f3178r) == null || !c0148f.b()) ? false : true;
        return m0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2124B = false;
        }
        if (!this.f2124B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2124B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2124B = false;
        }
        return true;
    }

    public final int p(android.view.View view, int i2, int i3, int i4, int i5, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = java.lang.Math.max(0, i7) + java.lang.Math.max(0, i6);
        iArr[0] = java.lang.Math.max(0, -i6);
        iArr[1] = java.lang.Math.max(0, -i7);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), android.view.ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(android.view.View view, int i2, int i3, int i4, int i5) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(d.AbstractC0106a.a(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f2131J = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f2153v) {
            this.f2153v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f2152u) {
            this.f2152u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(d.AbstractC0106a.a(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(d.AbstractC0106a.a(getContext(), i2));
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onClickListener) {
        f();
        this.f2136d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        e();
        this.f2133a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f2143k != i2) {
            this.f2143k = i2;
            if (i2 == 0) {
                this.f2142j = getContext();
            } else {
                this.f2142j = new android.view.ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(android.content.res.ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f2151s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f2149q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f2148p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f2150r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(android.content.res.ColorStateList.valueOf(i2));
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        h.k0 k0Var = new h.k0(context, attributeSet);
        k0Var.f3193a = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2533b);
        k0Var.f3193a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        k0Var.f3194b = 0;
        return k0Var;
    }

    public void setCollapseContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            c();
        }
        h.C0158p c0158p = this.f2140h;
        if (c0158p != null) {
            c0158p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2140h.setImageDrawable(drawable);
        } else {
            h.C0158p c0158p = this.f2140h;
            if (c0158p != null) {
                c0158p.setImageDrawable(this.f2138f);
            }
        }
    }

    public void setLogo(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.f2137e == null) {
                this.f2137e = new h.C0159q(getContext(), 0);
            }
            if (!m(this.f2137e)) {
                b(this.f2137e, true);
            }
        } else {
            h.C0159q c0159q = this.f2137e;
            if (c0159q != null && m(c0159q)) {
                removeView(this.f2137e);
                this.f2127E.remove(this.f2137e);
            }
        }
        h.C0159q c0159q2 = this.f2137e;
        if (c0159q2 != null) {
            c0159q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence) && this.f2137e == null) {
            this.f2137e = new h.C0159q(getContext(), 0);
        }
        h.C0159q c0159q = this.f2137e;
        if (c0159q != null) {
            c0159q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            f();
        }
        h.C0158p c0158p = this.f2136d;
        if (c0158p != null) {
            c0158p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f2136d)) {
                b(this.f2136d, true);
            }
        } else {
            h.C0158p c0158p = this.f2136d;
            if (c0158p != null && m(c0158p)) {
                removeView(this.f2136d);
                this.f2127E.remove(this.f2136d);
            }
        }
        h.C0158p c0158p2 = this.f2136d;
        if (c0158p2 != null) {
            c0158p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            h.C0161t c0161t = this.f2135c;
            if (c0161t != null && m(c0161t)) {
                removeView(this.f2135c);
                this.f2127E.remove(this.f2135c);
            }
        } else {
            if (this.f2135c == null) {
                android.content.Context context = getContext();
                h.C0161t c0161t2 = new h.C0161t(context, null);
                this.f2135c = c0161t2;
                c0161t2.setSingleLine();
                this.f2135c.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i2 = this.f2145m;
                if (i2 != 0) {
                    this.f2135c.setTextAppearance(context, i2);
                }
                android.content.res.ColorStateList colorStateList = this.f2123A;
                if (colorStateList != null) {
                    this.f2135c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2135c)) {
                b(this.f2135c, true);
            }
        }
        h.C0161t c0161t3 = this.f2135c;
        if (c0161t3 != null) {
            c0161t3.setText(charSequence);
        }
        this.f2156y = charSequence;
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.f2123A = colorStateList;
        h.C0161t c0161t = this.f2135c;
        if (c0161t != null) {
            c0161t.setTextColor(colorStateList);
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            h.C0161t c0161t = this.f2134b;
            if (c0161t != null && m(c0161t)) {
                removeView(this.f2134b);
                this.f2127E.remove(this.f2134b);
            }
        } else {
            if (this.f2134b == null) {
                android.content.Context context = getContext();
                h.C0161t c0161t2 = new h.C0161t(context, null);
                this.f2134b = c0161t2;
                c0161t2.setSingleLine();
                this.f2134b.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i2 = this.f2144l;
                if (i2 != 0) {
                    this.f2134b.setTextAppearance(context, i2);
                }
                android.content.res.ColorStateList colorStateList = this.f2157z;
                if (colorStateList != null) {
                    this.f2134b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2134b)) {
                b(this.f2134b, true);
            }
        }
        h.C0161t c0161t3 = this.f2134b;
        if (c0161t3 != null) {
            c0161t3.setText(charSequence);
        }
        this.f2155x = charSequence;
    }

    public void setTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.f2157z = colorStateList;
        h.C0161t c0161t = this.f2134b;
        if (c0161t != null) {
            c0161t.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(h.l0 l0Var) {
    }
}
