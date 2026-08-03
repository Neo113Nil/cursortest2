package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class RecyclerView extends android.view.ViewGroup {

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f2442l0 = {android.R.attr.nestedScrollingEnabled};

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f2443m0 = {android.R.attr.clipToPadding};

    /* renamed from: n0, reason: collision with root package name */
    public static final java.lang.Class[] f2444n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final P.p f2445o0;

    /* renamed from: A, reason: collision with root package name */
    public android.widget.EdgeEffect f2446A;

    /* renamed from: B, reason: collision with root package name */
    public android.widget.EdgeEffect f2447B;

    /* renamed from: C, reason: collision with root package name */
    public android.widget.EdgeEffect f2448C;

    /* renamed from: D, reason: collision with root package name */
    public P.t f2449D;

    /* renamed from: E, reason: collision with root package name */
    public int f2450E;

    /* renamed from: F, reason: collision with root package name */
    public int f2451F;
    public android.view.VelocityTracker G;

    /* renamed from: H, reason: collision with root package name */
    public int f2452H;

    /* renamed from: I, reason: collision with root package name */
    public int f2453I;

    /* renamed from: J, reason: collision with root package name */
    public int f2454J;

    /* renamed from: K, reason: collision with root package name */
    public int f2455K;

    /* renamed from: L, reason: collision with root package name */
    public int f2456L;

    /* renamed from: Q, reason: collision with root package name */
    public final int f2457Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f2458R;

    /* renamed from: S, reason: collision with root package name */
    public final float f2459S;

    /* renamed from: T, reason: collision with root package name */
    public final float f2460T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f2461U;

    /* renamed from: V, reason: collision with root package name */
    public final P.G f2462V;

    /* renamed from: W, reason: collision with root package name */
    public P.RunnableC0037j f2463W;

    /* renamed from: a, reason: collision with root package name */
    public final P.B f2464a;

    /* renamed from: a0, reason: collision with root package name */
    public final P.C0035h f2465a0;

    /* renamed from: b, reason: collision with root package name */
    public P.D f2466b;

    /* renamed from: b0, reason: collision with root package name */
    public final P.E f2467b0;

    /* renamed from: c, reason: collision with root package name */
    public final I0.b f2468c;

    /* renamed from: c0, reason: collision with root package name */
    public java.util.ArrayList f2469c0;

    /* renamed from: d, reason: collision with root package name */
    public final I0.b f2470d;

    /* renamed from: d0, reason: collision with root package name */
    public final m0.j f2471d0;

    /* renamed from: e, reason: collision with root package name */
    public final m0.j f2472e;
    public P.I e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2473f;
    public y.C1019g f0;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f2474g;

    /* renamed from: g0, reason: collision with root package name */
    public final int[] f2475g0;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f2476h;

    /* renamed from: h0, reason: collision with root package name */
    public final int[] f2477h0;

    /* renamed from: i, reason: collision with root package name */
    public P.v f2478i;

    /* renamed from: i0, reason: collision with root package name */
    public final int[] f2479i0;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f2480j;

    /* renamed from: j0, reason: collision with root package name */
    public final java.util.ArrayList f2481j0;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f2482k;
    public final C.b k0;

    /* renamed from: l, reason: collision with root package name */
    public P.C0033f f2483l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2484m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2485n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2486o;

    /* renamed from: p, reason: collision with root package name */
    public int f2487p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2488q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2489r;

    /* renamed from: s, reason: collision with root package name */
    public int f2490s;
    public final android.view.accessibility.AccessibilityManager t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2491u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2492v;

    /* renamed from: w, reason: collision with root package name */
    public int f2493w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2494x;

    /* renamed from: y, reason: collision with root package name */
    public P.s f2495y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.EdgeEffect f2496z;

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        f2444n0 = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        f2445o0 = new P.p();
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a2;
        char c2;
        int i2;
        android.content.res.TypedArray typedArray;
        char c3;
        java.lang.reflect.Constructor constructor;
        this.f2464a = new P.B(this);
        this.f2472e = new m0.j(17);
        this.f2474g = new android.graphics.Rect();
        this.f2476h = new android.graphics.Rect();
        new android.graphics.RectF();
        this.f2480j = new java.util.ArrayList();
        this.f2482k = new java.util.ArrayList();
        this.f2487p = 0;
        this.f2491u = false;
        this.f2492v = false;
        this.f2493w = 0;
        this.f2494x = 0;
        this.f2495y = new P.s();
        P.C0029b c0029b = new P.C0029b();
        java.lang.Object[] objArr = null;
        c0029b.f1296a = null;
        c0029b.f1297b = new java.util.ArrayList();
        c0029b.f1298c = 250L;
        c0029b.f1299d = 250L;
        c0029b.f1232e = new java.util.ArrayList();
        c0029b.f1233f = new java.util.ArrayList();
        c0029b.f1234g = new java.util.ArrayList();
        c0029b.f1235h = new java.util.ArrayList();
        c0029b.f1236i = new java.util.ArrayList();
        c0029b.f1237j = new java.util.ArrayList();
        c0029b.f1238k = new java.util.ArrayList();
        c0029b.f1239l = new java.util.ArrayList();
        c0029b.f1240m = new java.util.ArrayList();
        c0029b.f1241n = new java.util.ArrayList();
        c0029b.f1242o = new java.util.ArrayList();
        this.f2449D = c0029b;
        this.f2450E = 0;
        this.f2451F = -1;
        this.f2459S = Float.MIN_VALUE;
        this.f2460T = Float.MIN_VALUE;
        boolean z2 = true;
        this.f2461U = true;
        this.f2462V = new P.G(this);
        this.f2465a0 = new P.C0035h();
        P.E e2 = new P.E();
        e2.f1193a = 0;
        e2.f1194b = false;
        e2.f1195c = false;
        e2.f1196d = false;
        e2.f1197e = false;
        this.f2467b0 = e2;
        m0.j jVar = new m0.j(15, false);
        this.f2471d0 = jVar;
        this.f2475g0 = new int[2];
        this.f2477h0 = new int[2];
        this.f2479i0 = new int[2];
        this.f2481j0 = new java.util.ArrayList();
        this.k0 = new C.b(5, this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2443m0, 0, 0);
            this.f2473f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f2473f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f2456L = viewConfiguration.getScaledTouchSlop();
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            java.lang.reflect.Method method = y.B.f8419a;
            a2 = y.y.a(viewConfiguration);
        } else {
            a2 = y.B.a(viewConfiguration, context);
        }
        this.f2459S = a2;
        this.f2460T = i3 >= 26 ? y.y.b(viewConfiguration) : y.B.a(viewConfiguration, context);
        this.f2457Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2458R = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2449D.f1296a = jVar;
        this.f2468c = new I0.b(new m0.j(14, this));
        this.f2470d = new I0.b(new C.j(16, this));
        java.lang.reflect.Field field = y.x.f8478a;
        if ((i3 >= 26 ? y.r.c(this) : 0) == 0 && i3 >= 26) {
            y.r.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.t = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new P.I(this));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, O.a.f1163a, 0, 0);
            java.lang.String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                android.graphics.drawable.Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                android.content.res.Resources resources = getContext().getResources();
                c2 = 3;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                c3 = 2;
                new P.C0033f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.watchfacestudio.huasi_urx110.R.dimen.fastscroll_margin));
            } else {
                c2 = 3;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                c3 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                java.lang.String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = androidx.recyclerview.widget.RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        java.lang.Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(P.v.class);
                        try {
                            constructor = asSubclass.getConstructor(f2444n0);
                            java.lang.Object[] objArr2 = new java.lang.Object[i2];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c3] = 0;
                            objArr2[c2] = 0;
                            objArr = objArr2;
                        } catch (java.lang.NoSuchMethodException e3) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (java.lang.NoSuchMethodException e4) {
                                e4.initCause(e3);
                                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e4);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((P.v) constructor.newInstance(objArr));
                    } catch (java.lang.ClassCastException e5) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e5);
                    } catch (java.lang.ClassNotFoundException e6) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e6);
                    } catch (java.lang.IllegalAccessException e7) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                    } catch (java.lang.InstantiationException e8) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                    } catch (java.lang.reflect.InvocationTargetException e9) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                    }
                }
            }
            android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2442l0, 0, 0);
            z2 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    private y.C1019g getScrollingChildHelper() {
        if (this.f0 == null) {
            this.f0 = new y.C1019g(this);
        }
        return this.f0;
    }

    public static void j(android.view.View view) {
        if (view == null) {
            return;
        }
        ((P.w) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i2, int i3) {
        P.v vVar = this.f2478i;
        if (vVar != null) {
            vVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b(java.lang.String str) {
        if (this.f2493w > 0) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f2494x > 0) {
            android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new java.lang.IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i3) {
        boolean z2;
        android.widget.EdgeEffect edgeEffect = this.f2496z;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f2496z.onRelease();
            z2 = this.f2496z.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f2447B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f2447B.onRelease();
            z2 |= this.f2447B.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f2446A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f2446A.onRelease();
            z2 |= this.f2446A.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f2448C;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f2448C.onRelease();
            z2 |= this.f2448C.isFinished();
        }
        if (z2) {
            java.lang.reflect.Field field = y.x.f8478a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof P.w) && this.f2478i.d((P.w) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        P.v vVar = this.f2478i;
        if (vVar != null && vVar.b()) {
            return this.f2478i.f(this.f2467b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        P.v vVar = this.f2478i;
        if (vVar != null && vVar.b()) {
            this.f2478i.g(this.f2467b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        P.v vVar = this.f2478i;
        if (vVar != null && vVar.b()) {
            return this.f2478i.h(this.f2467b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        P.v vVar = this.f2478i;
        if (vVar != null && vVar.c()) {
            return this.f2478i.i(this.f2467b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        P.v vVar = this.f2478i;
        if (vVar != null && vVar.c()) {
            this.f2478i.j(this.f2467b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        P.v vVar = this.f2478i;
        if (vVar != null && vVar.c()) {
            return this.f2478i.k(this.f2467b0);
        }
        return 0;
    }

    public final void d() {
        I0.b bVar = this.f2468c;
        if (!this.f2486o || this.f2491u) {
            int i2 = u.d.f8356a;
            android.os.Trace.beginSection("RV FullInvalidate");
            android.util.Log.e("RecyclerView", "No adapter attached; skipping layout");
            android.os.Trace.endSection();
            return;
        }
        if (((java.util.ArrayList) bVar.f658c).size() > 0) {
            bVar.getClass();
            if (((java.util.ArrayList) bVar.f658c).size() > 0) {
                int i3 = u.d.f8356a;
                android.os.Trace.beginSection("RV FullInvalidate");
                android.util.Log.e("RecyclerView", "No adapter attached; skipping layout");
                android.os.Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        java.util.ArrayList arrayList = this.f2480j;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            P.C0033f c0033f = (P.C0033f) arrayList.get(i2);
            if (c0033f.f1259l != c0033f.f1261n.getWidth() || c0033f.f1260m != c0033f.f1261n.getHeight()) {
                c0033f.f1259l = c0033f.f1261n.getWidth();
                c0033f.f1260m = c0033f.f1261n.getHeight();
                c0033f.e(0);
            } else if (c0033f.f1268v != 0) {
                if (c0033f.f1262o) {
                    int i3 = c0033f.f1259l;
                    int i4 = c0033f.f1251d;
                    int i5 = i3 - i4;
                    int i6 = 0 - (0 / 2);
                    android.graphics.drawable.StateListDrawable stateListDrawable = c0033f.f1249b;
                    stateListDrawable.setBounds(0, 0, i4, 0);
                    int i7 = c0033f.f1260m;
                    android.graphics.drawable.Drawable drawable = c0033f.f1250c;
                    drawable.setBounds(0, 0, c0033f.f1252e, i7);
                    androidx.recyclerview.widget.RecyclerView recyclerView = c0033f.f1261n;
                    java.lang.reflect.Field field = y.x.f8478a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i4, i6);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i4, -i6);
                    } else {
                        canvas.translate(i5, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i6);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i5, -i6);
                    }
                }
                if (c0033f.f1263p) {
                    int i8 = c0033f.f1260m;
                    int i9 = c0033f.f1255h;
                    int i10 = i8 - i9;
                    android.graphics.drawable.StateListDrawable stateListDrawable2 = c0033f.f1253f;
                    stateListDrawable2.setBounds(0, 0, 0, i9);
                    int i11 = c0033f.f1259l;
                    android.graphics.drawable.Drawable drawable2 = c0033f.f1254g;
                    drawable2.setBounds(0, 0, i11, c0033f.f1256i);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i10);
                }
            }
        }
        android.widget.EdgeEffect edgeEffect = this.f2496z;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2473f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.f2496z;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect3 = this.f2446A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2473f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.f2446A;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.f2447B;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2473f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.f2447B;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.f2448C;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2473f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.f2448C;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f2449D == null || arrayList.size() <= 0 || !this.f2449D.b()) ? z2 : true) {
            java.lang.reflect.Field field2 = y.x.f8478a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        java.lang.reflect.Field field = y.x.f8478a;
        setMeasuredDimension(P.v.e(i2, paddingRight, getMinimumWidth()), P.v.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View view, int i2) {
        int i3;
        this.f2478i.getClass();
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view == null || i(view) == null) {
                return findNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            android.graphics.Rect rect = this.f2474g;
            char c2 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            android.graphics.Rect rect2 = this.f2476h;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f2478i.f1303b;
            java.lang.reflect.Field field = y.x.f8478a;
            int i4 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i5 = rect.left;
            int i6 = rect2.left;
            if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                i3 = 1;
            } else {
                int i7 = rect.right;
                int i8 = rect2.right;
                i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                c2 = 1;
            } else {
                int i11 = rect.bottom;
                int i12 = rect2.bottom;
                if ((i11 > i12 || i9 >= i12) && i9 > i10) {
                    c2 = 65535;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 17) {
                        if (i2 != 33) {
                            if (i2 != 66) {
                                if (i2 != 130) {
                                    throw new java.lang.IllegalArgumentException("Invalid direction: " + i2 + h());
                                }
                                if (c2 > 0) {
                                    return findNextFocus;
                                }
                            } else if (i3 > 0) {
                                return findNextFocus;
                            }
                        } else if (c2 < 0) {
                            return findNextFocus;
                        }
                    } else if (i3 < 0) {
                        return findNextFocus;
                    }
                } else {
                    if (c2 > 0) {
                        return findNextFocus;
                    }
                    if (c2 == 0 && i3 * i4 >= 0) {
                        return findNextFocus;
                    }
                }
            } else {
                if (c2 < 0) {
                    return findNextFocus;
                }
                if (c2 == 0 && i3 * i4 <= 0) {
                    return findNextFocus;
                }
            }
        }
        return super.focusSearch(view, i2);
    }

    public final boolean g(int[] iArr, int i2) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i2, null);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        P.v vVar = this.f2478i;
        if (vVar != null) {
            return vVar.l();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        P.v vVar = this.f2478i;
        if (vVar != null) {
            return vVar.m(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public P.q getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        P.v vVar = this.f2478i;
        if (vVar == null) {
            return super.getBaseline();
        }
        vVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2473f;
    }

    public P.I getCompatAccessibilityDelegate() {
        return this.e0;
    }

    public P.s getEdgeEffectFactory() {
        return this.f2495y;
    }

    public P.t getItemAnimator() {
        return this.f2449D;
    }

    public int getItemDecorationCount() {
        return this.f2480j.size();
    }

    public P.v getLayoutManager() {
        return this.f2478i;
    }

    public int getMaxFlingVelocity() {
        return this.f2458R;
    }

    public int getMinFlingVelocity() {
        return this.f2457Q;
    }

    public long getNanoTime() {
        return java.lang.System.nanoTime();
    }

    public P.x getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2461U;
    }

    public P.A getRecycledViewPool() {
        P.B b2 = this.f2464a;
        if (b2.f1190e == null) {
            P.A a2 = new P.A();
            a2.f1184a = new android.util.SparseArray();
            a2.f1185b = 0;
            b2.f1190e = a2;
        }
        return b2.f1190e;
    }

    public int getScrollState() {
        return this.f2450E;
    }

    public final java.lang.String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f2478i + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.View i(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof android.view.View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2484m;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f8468d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f2486o || this.f2491u || ((java.util.ArrayList) this.f2468c.f658c).size() > 0;
    }

    public final void m() {
        int D2 = this.f2470d.D();
        for (int i2 = 0; i2 < D2; i2++) {
            ((P.w) this.f2470d.C(i2).getLayoutParams()).f1310b = true;
        }
        java.util.ArrayList arrayList = this.f2464a.f1187b;
        if (arrayList.size() <= 0) {
            return;
        }
        B1.a.m(arrayList.get(0));
        throw null;
    }

    public final void n(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2451F) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2451F = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f2454J = x2;
            this.f2452H = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f2455K = y2;
            this.f2453I = y2;
        }
    }

    public final void o(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        android.graphics.Rect rect = this.f2474g;
        rect.set(0, 0, width, height);
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof P.w) {
            P.w wVar = (P.w) layoutParams;
            if (!wVar.f1310b) {
                int i2 = rect.left;
                android.graphics.Rect rect2 = wVar.f1309a;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2478i.G(this, view, this.f2474g, !this.f2486o, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        boolean z2 = false;
        this.f2493w = 0;
        this.f2484m = true;
        if (this.f2486o && !isLayoutRequested()) {
            z2 = true;
        }
        this.f2486o = z2;
        P.v vVar = this.f2478i;
        if (vVar != null) {
            vVar.f1306e = true;
        }
        java.lang.ThreadLocal threadLocal = P.RunnableC0037j.f1278e;
        P.RunnableC0037j runnableC0037j = (P.RunnableC0037j) threadLocal.get();
        this.f2463W = runnableC0037j;
        if (runnableC0037j == null) {
            P.RunnableC0037j runnableC0037j2 = new P.RunnableC0037j();
            runnableC0037j2.f1280a = new java.util.ArrayList();
            runnableC0037j2.f1283d = new java.util.ArrayList();
            this.f2463W = runnableC0037j2;
            java.lang.reflect.Field field = y.x.f8478a;
            android.view.Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            P.RunnableC0037j runnableC0037j3 = this.f2463W;
            runnableC0037j3.f1282c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0037j3);
        }
        this.f2463W.f1280a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        java.lang.Object obj;
        super.onDetachedFromWindow();
        P.t tVar = this.f2449D;
        if (tVar != null) {
            tVar.a();
        }
        setScrollState(0);
        P.G g2 = this.f2462V;
        g2.f1204g.removeCallbacks(g2);
        g2.f1200c.abortAnimation();
        this.f2484m = false;
        P.v vVar = this.f2478i;
        if (vVar != null) {
            vVar.f1306e = false;
            vVar.z(this);
        }
        this.f2481j0.clear();
        removeCallbacks(this.k0);
        this.f2472e.getClass();
        do {
            M1.n nVar = P.O.f1231a;
            int i2 = nVar.f1093a;
            obj = null;
            if (i2 > 0) {
                int i3 = i2 - 1;
                java.lang.Object[] objArr = (java.lang.Object[]) nVar.f1094b;
                java.lang.Object obj2 = objArr[i3];
                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i3] = null;
                nVar.f1093a--;
                obj = obj2;
            }
        } while (obj != null);
        P.RunnableC0037j runnableC0037j = this.f2463W;
        if (runnableC0037j != null) {
            runnableC0037j.f1280a.remove(this);
            this.f2463W = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.f2480j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((P.C0033f) arrayList.get(i2)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f2478i != null && !this.f2488q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2478i.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2478i.b()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        q((int) (f3 * this.f2459S), (int) (f2 * this.f2460T), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f2459S), (int) (f2 * this.f2460T), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2478i.c()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f2459S), (int) (f2 * this.f2460T), motionEvent);
                    } else if (this.f2478i.b()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f2459S), (int) (f2 * this.f2460T), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f2459S), (int) (f2 * this.f2460T), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z2;
        if (this.f2488q) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2483l = null;
        }
        java.util.ArrayList arrayList = this.f2482k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            P.C0033f c0033f = (P.C0033f) arrayList.get(i2);
            if (c0033f.c(motionEvent) && action != 3) {
                this.f2483l = c0033f;
                p();
                setScrollState(0);
                return true;
            }
        }
        P.v vVar = this.f2478i;
        if (vVar == null) {
            return false;
        }
        boolean b2 = vVar.b();
        boolean c2 = this.f2478i.c();
        if (this.G == null) {
            this.G = android.view.VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2489r) {
                this.f2489r = false;
            }
            this.f2451F = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2454J = x2;
            this.f2452H = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2455K = y2;
            this.f2453I = y2;
            if (this.f2450E == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f2479i0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = b2;
            if (c2) {
                i3 = (b2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i3, 0);
        } else if (actionMasked == 1) {
            this.G.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2451F);
            if (findPointerIndex < 0) {
                android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2451F + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2450E != 1) {
                int i4 = x3 - this.f2452H;
                int i5 = y3 - this.f2453I;
                if (b2 == 0 || java.lang.Math.abs(i4) <= this.f2456L) {
                    z2 = false;
                } else {
                    this.f2454J = x3;
                    z2 = true;
                }
                if (c2 && java.lang.Math.abs(i5) > this.f2456L) {
                    this.f2455K = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2451F = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2454J = x4;
            this.f2452H = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2455K = y4;
            this.f2453I = y4;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f2450E == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = u.d.f8356a;
        android.os.Trace.beginSection("RV OnLayout");
        android.util.Log.e("RecyclerView", "No adapter attached; skipping layout");
        android.os.Trace.endSection();
        this.f2486o = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        P.v vVar = this.f2478i;
        if (vVar == null) {
            e(i2, i3);
            return;
        }
        if (vVar.y()) {
            android.view.View.MeasureSpec.getMode(i2);
            android.view.View.MeasureSpec.getMode(i3);
            this.f2478i.f1303b.e(i2, i3);
        } else {
            if (this.f2485n) {
                this.f2478i.f1303b.e(i2, i3);
                return;
            }
            P.E e2 = this.f2467b0;
            if (e2.f1197e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e2.getClass();
            this.f2487p++;
            this.f2478i.f1303b.e(i2, i3);
            if (this.f2487p < 1) {
                this.f2487p = 1;
            }
            this.f2487p--;
            e2.f1195c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, android.graphics.Rect rect) {
        if (this.f2493w > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof P.D)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        P.D d2 = (P.D) parcelable;
        this.f2466b = d2;
        super.onRestoreInstanceState(d2.f258a);
        P.v vVar = this.f2478i;
        if (vVar == null || (parcelable2 = this.f2466b.f1192c) == null) {
            return;
        }
        vVar.B(parcelable2);
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        P.D d2 = new P.D(super.onSaveInstanceState());
        P.D d3 = this.f2466b;
        if (d3 != null) {
            d2.f1192c = d3.f1192c;
        } else {
            P.v vVar = this.f2478i;
            if (vVar != null) {
                d2.f1192c = vVar.C();
            } else {
                d2.f1192c = null;
            }
        }
        return d2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f2448C = null;
        this.f2446A = null;
        this.f2447B = null;
        this.f2496z = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z2;
        if (this.f2488q || this.f2489r) {
            return false;
        }
        int action = motionEvent.getAction();
        P.C0033f c0033f = this.f2483l;
        if (c0033f != null) {
            if (action != 0) {
                if (c0033f.f1264q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b2 = c0033f.b(motionEvent.getX(), motionEvent.getY());
                        boolean a2 = c0033f.a(motionEvent.getX(), motionEvent.getY());
                        if (b2 || a2) {
                            if (a2) {
                                c0033f.f1265r = 1;
                                c0033f.f1258k = (int) motionEvent.getX();
                            } else if (b2) {
                                c0033f.f1265r = 2;
                                c0033f.f1257j = (int) motionEvent.getY();
                            }
                            c0033f.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0033f.f1264q == 2) {
                        c0033f.f1257j = 0.0f;
                        c0033f.f1258k = 0.0f;
                        c0033f.e(1);
                        c0033f.f1265r = 0;
                    } else if (motionEvent.getAction() == 2 && c0033f.f1264q == 2) {
                        c0033f.f();
                        int i2 = c0033f.f1265r;
                        int i3 = c0033f.f1248a;
                        if (i2 == 1) {
                            float x2 = motionEvent.getX();
                            int[] iArr = c0033f.t;
                            iArr[0] = i3;
                            int i4 = c0033f.f1259l - i3;
                            iArr[1] = i4;
                            float max = java.lang.Math.max(i3, java.lang.Math.min(i4, x2));
                            if (java.lang.Math.abs(0 - max) >= 2.0f) {
                                float f2 = c0033f.f1258k;
                                int computeHorizontalScrollRange = c0033f.f1261n.computeHorizontalScrollRange();
                                c0033f.f1261n.computeHorizontalScrollOffset();
                                int d2 = P.C0033f.d(f2, max, iArr, computeHorizontalScrollRange, 0, c0033f.f1259l);
                                if (d2 != 0) {
                                    c0033f.f1261n.scrollBy(d2, 0);
                                }
                                c0033f.f1258k = max;
                            }
                        }
                        if (c0033f.f1265r == 2) {
                            float y2 = motionEvent.getY();
                            int[] iArr2 = c0033f.f1266s;
                            iArr2[0] = i3;
                            int i5 = c0033f.f1260m - i3;
                            iArr2[1] = i5;
                            float max2 = java.lang.Math.max(i3, java.lang.Math.min(i5, y2));
                            if (java.lang.Math.abs(0 - max2) >= 2.0f) {
                                float f3 = c0033f.f1257j;
                                int computeVerticalScrollRange = c0033f.f1261n.computeVerticalScrollRange();
                                c0033f.f1261n.computeVerticalScrollOffset();
                                int d3 = P.C0033f.d(f3, max2, iArr2, computeVerticalScrollRange, 0, c0033f.f1260m);
                                if (d3 != 0) {
                                    c0033f.f1261n.scrollBy(0, d3);
                                }
                                c0033f.f1257j = max2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f2483l = null;
                }
                p();
                setScrollState(0);
                return true;
            }
            this.f2483l = null;
        }
        if (action != 0) {
            java.util.ArrayList arrayList = this.f2482k;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                P.C0033f c0033f2 = (P.C0033f) arrayList.get(i6);
                if (c0033f2.c(motionEvent)) {
                    this.f2483l = c0033f2;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
        }
        P.v vVar = this.f2478i;
        if (vVar == null) {
            return false;
        }
        boolean b3 = vVar.b();
        boolean c2 = this.f2478i.c();
        if (this.G == null) {
            this.G = android.view.VelocityTracker.obtain();
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2479i0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            this.f2451F = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f2454J = x3;
            this.f2452H = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f2455K = y3;
            this.f2453I = y3;
            int i7 = b3;
            if (c2) {
                i7 = (b3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.G.addMovement(obtain);
                android.view.VelocityTracker velocityTracker = this.G;
                int i8 = this.f2458R;
                velocityTracker.computeCurrentVelocity(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, i8);
                float f4 = b3 != 0 ? -this.G.getXVelocity(this.f2451F) : 0.0f;
                float f5 = c2 ? -this.G.getYVelocity(this.f2451F) : 0.0f;
                if (f4 != 0.0f || f5 != 0.0f) {
                    int i9 = (int) f4;
                    int i10 = (int) f5;
                    P.v vVar2 = this.f2478i;
                    if (vVar2 == null) {
                        android.util.Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2488q) {
                        boolean b4 = vVar2.b();
                        boolean c3 = this.f2478i.c();
                        int i11 = this.f2457Q;
                        if (b4 == 0 || java.lang.Math.abs(i9) < i11) {
                            i9 = 0;
                        }
                        if (!c3 || java.lang.Math.abs(i10) < i11) {
                            i10 = 0;
                        }
                        if (i9 != 0 || i10 != 0) {
                            float f6 = i9;
                            float f7 = i10;
                            if (!dispatchNestedPreFling(f6, f7)) {
                                boolean z3 = b4 != 0 || c3;
                                dispatchNestedFling(f6, f7, z3);
                                int i12 = b4;
                                if (z3) {
                                    if (c3) {
                                        i12 = (b4 ? 1 : 0) | 2;
                                    }
                                    getScrollingChildHelper().g(i12, 1);
                                    int i13 = -i8;
                                    int max3 = java.lang.Math.max(i13, java.lang.Math.min(i9, i8));
                                    int max4 = java.lang.Math.max(i13, java.lang.Math.min(i10, i8));
                                    P.G g2 = this.f2462V;
                                    g2.f1204g.setScrollState(2);
                                    g2.f1199b = 0;
                                    g2.f1198a = 0;
                                    g2.f1200c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                    g2.a();
                                    p();
                                    obtain.recycle();
                                    return true;
                                }
                            }
                        }
                    }
                }
                setScrollState(0);
                p();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2451F);
                if (findPointerIndex < 0) {
                    android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2451F + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i14 = this.f2454J - x4;
                int i15 = this.f2455K - y4;
                boolean f8 = f(i14, i15, this.f2477h0, this.f2475g0, 0);
                int[] iArr4 = this.f2475g0;
                if (f8) {
                    int[] iArr5 = this.f2477h0;
                    i14 -= iArr5[0];
                    i15 -= iArr5[1];
                    obtain.offsetLocation(iArr4[0], iArr4[1]);
                    iArr3[0] = iArr3[0] + iArr4[0];
                    iArr3[1] = iArr3[1] + iArr4[1];
                }
                if (this.f2450E != 1) {
                    if (b3 != 0) {
                        int abs = java.lang.Math.abs(i14);
                        int i16 = this.f2456L;
                        if (abs > i16) {
                            i14 = i14 > 0 ? i14 - i16 : i14 + i16;
                            z2 = true;
                            if (c2) {
                                int abs2 = java.lang.Math.abs(i15);
                                int i17 = this.f2456L;
                                if (abs2 > i17) {
                                    i15 = i15 > 0 ? i15 - i17 : i15 + i17;
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                    }
                    z2 = false;
                    if (c2) {
                    }
                    if (z2) {
                    }
                }
                int i18 = i15;
                if (this.f2450E == 1) {
                    this.f2454J = x4 - iArr4[0];
                    this.f2455K = y4 - iArr4[1];
                    q(b3 != 0 ? i14 : 0, c2 ? i18 : 0, obtain);
                    P.RunnableC0037j runnableC0037j = this.f2463W;
                    if (runnableC0037j != null && (i14 != 0 || i18 != 0)) {
                        runnableC0037j.a(this, i14, i18);
                    }
                }
            } else if (actionMasked == 3) {
                p();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f2451F = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2454J = x5;
                this.f2452H = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2455K = y5;
                this.f2453I = y5;
            } else if (actionMasked == 6) {
                n(motionEvent);
            }
        }
        this.G.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p() {
        android.view.VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        s(0);
        android.widget.EdgeEffect edgeEffect = this.f2496z;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f2496z.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f2446A;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f2446A.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f2447B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f2447B.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f2448C;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f2448C.isFinished();
        }
        if (z2) {
            java.lang.reflect.Field field = y.x.f8478a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i2, int i3, android.view.MotionEvent motionEvent) {
        d();
        if (!this.f2480j.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f2475g0;
        boolean z2 = false;
        boolean z3 = true;
        if (g(iArr, 0)) {
            int i4 = this.f2454J;
            int i5 = iArr[0];
            this.f2454J = i4 - i5;
            int i6 = this.f2455K;
            int i7 = iArr[1];
            this.f2455K = i6 - i7;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i5, i7);
            }
            int[] iArr2 = this.f2479i0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = 0;
                float y2 = motionEvent.getY();
                if (f2 < 0.0f) {
                    if (this.f2496z == null) {
                        this.f2495y.getClass();
                        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
                        this.f2496z = edgeEffect;
                        if (this.f2473f) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    C.d.a(this.f2496z, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    if (f2 > 0.0f) {
                        if (this.f2447B == null) {
                            this.f2495y.getClass();
                            android.widget.EdgeEffect edgeEffect2 = new android.widget.EdgeEffect(getContext());
                            this.f2447B = edgeEffect2;
                            if (this.f2473f) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        C.d.a(this.f2447B, f2 / getWidth(), y2 / getHeight());
                    }
                    if (f2 >= 0.0f) {
                        if (this.f2446A == null) {
                            this.f2495y.getClass();
                            android.widget.EdgeEffect edgeEffect3 = new android.widget.EdgeEffect(getContext());
                            this.f2446A = edgeEffect3;
                            if (this.f2473f) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        C.d.a(this.f2446A, (-f2) / getHeight(), x2 / getWidth());
                    } else if (f2 > 0.0f) {
                        if (this.f2448C == null) {
                            this.f2495y.getClass();
                            android.widget.EdgeEffect edgeEffect4 = new android.widget.EdgeEffect(getContext());
                            this.f2448C = edgeEffect4;
                            if (this.f2473f) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        C.d.a(this.f2448C, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (!z3 || f2 != 0.0f || f2 != 0.0f) {
                        java.lang.reflect.Field field = y.x.f8478a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = true;
                if (f2 >= 0.0f) {
                }
                if (!z3) {
                }
                java.lang.reflect.Field field2 = y.x.f8478a;
                postInvalidateOnAnimation();
            }
            c(i2, i3);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i2, int i3) {
        int i4;
        P.v vVar = this.f2478i;
        if (vVar == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2488q) {
            return;
        }
        int i5 = !vVar.b() ? 0 : i2;
        int i6 = !this.f2478i.c() ? 0 : i3;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        P.G g2 = this.f2462V;
        g2.getClass();
        int abs = java.lang.Math.abs(i5);
        int abs2 = java.lang.Math.abs(i6);
        boolean z2 = abs > abs2;
        int sqrt = (int) java.lang.Math.sqrt(0);
        int sqrt2 = (int) java.lang.Math.sqrt((i6 * i6) + (i5 * i5));
        androidx.recyclerview.widget.RecyclerView recyclerView = g2.f1204g;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i7 = width / 2;
        float f2 = width;
        float f3 = i7;
        float sin = (((float) java.lang.Math.sin((java.lang.Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
        if (sqrt > 0) {
            i4 = java.lang.Math.round(java.lang.Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z2) {
                abs = abs2;
            }
            i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
        }
        int min = java.lang.Math.min(i4, 2000);
        P.p pVar = f2445o0;
        if (g2.f1201d != pVar) {
            g2.f1201d = pVar;
            g2.f1200c = new android.widget.OverScroller(recyclerView.getContext(), pVar);
        }
        recyclerView.setScrollState(2);
        g2.f1199b = 0;
        g2.f1198a = 0;
        g2.f1200c.startScroll(0, 0, i5, i6, min);
        g2.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View view, boolean z2) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        this.f2478i.getClass();
        if (this.f2493w <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z2) {
        return this.f2478i.G(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        java.util.ArrayList arrayList = this.f2482k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((P.C0033f) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2487p != 0 || this.f2488q) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        P.v vVar = this.f2478i;
        if (vVar == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2488q) {
            return;
        }
        boolean b2 = vVar.b();
        boolean c2 = this.f2478i.c();
        if (b2 || c2) {
            if (!b2) {
                i2 = 0;
            }
            if (!c2) {
                i3 = 0;
            }
            q(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f2493w <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2490s |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(P.I i2) {
        this.e0 = i2;
        y.x.a(this, i2);
    }

    public void setAdapter(P.q qVar) {
        setLayoutFrozen(false);
        P.t tVar = this.f2449D;
        if (tVar != null) {
            tVar.a();
        }
        P.v vVar = this.f2478i;
        P.B b2 = this.f2464a;
        if (vVar != null) {
            vVar.E();
            this.f2478i.F(b2);
        }
        b2.f1186a.clear();
        java.util.ArrayList arrayList = b2.f1187b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            B1.a.m(arrayList.get(size));
            throw null;
        }
        arrayList.clear();
        P.C0035h c0035h = b2.f1191f.f2465a0;
        c0035h.getClass();
        c0035h.f1272c = 0;
        I0.b bVar = this.f2468c;
        bVar.L((java.util.ArrayList) bVar.f658c);
        bVar.L((java.util.ArrayList) bVar.f659d);
        b2.f1186a.clear();
        java.util.ArrayList arrayList2 = b2.f1187b;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            B1.a.m(arrayList2.get(size2));
            throw null;
        }
        arrayList2.clear();
        androidx.recyclerview.widget.RecyclerView recyclerView = b2.f1191f;
        P.C0035h c0035h2 = recyclerView.f2465a0;
        c0035h2.getClass();
        c0035h2.f1272c = 0;
        if (b2.f1190e == null) {
            P.A a2 = new P.A();
            a2.f1184a = new android.util.SparseArray();
            a2.f1185b = 0;
            b2.f1190e = a2;
        }
        P.A a3 = b2.f1190e;
        if (a3.f1185b == 0) {
            android.util.SparseArray sparseArray = a3.f1184a;
            if (sparseArray.size() > 0) {
                ((P.z) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2467b0.f1194b = true;
        this.f2492v = this.f2492v;
        this.f2491u = true;
        int D2 = this.f2470d.D();
        for (int i2 = 0; i2 < D2; i2++) {
            j(this.f2470d.C(i2));
        }
        m();
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (arrayList2.get(i3) != null) {
                throw new java.lang.ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            B1.a.m(arrayList2.get(size4));
            throw null;
        }
        arrayList2.clear();
        P.C0035h c0035h3 = recyclerView.f2465a0;
        c0035h3.getClass();
        c0035h3.f1272c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(P.r rVar) {
        if (rVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2473f) {
            this.f2448C = null;
            this.f2446A = null;
            this.f2447B = null;
            this.f2496z = null;
        }
        this.f2473f = z2;
        super.setClipToPadding(z2);
        if (this.f2486o) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(P.s sVar) {
        sVar.getClass();
        this.f2495y = sVar;
        this.f2448C = null;
        this.f2446A = null;
        this.f2447B = null;
        this.f2496z = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2485n = z2;
    }

    public void setItemAnimator(P.t tVar) {
        P.t tVar2 = this.f2449D;
        if (tVar2 != null) {
            tVar2.a();
            this.f2449D.f1296a = null;
        }
        this.f2449D = tVar;
        if (tVar != null) {
            tVar.f1296a = this.f2471d0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        P.B b2 = this.f2464a;
        b2.f1188c = i2;
        b2.b();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f2488q) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f2488q = false;
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2488q = true;
            this.f2489r = true;
            setScrollState(0);
            P.G g2 = this.f2462V;
            g2.f1204g.removeCallbacks(g2);
            g2.f1200c.abortAnimation();
        }
    }

    public void setLayoutManager(P.v vVar) {
        C.j jVar;
        if (vVar == this.f2478i) {
            return;
        }
        setScrollState(0);
        P.G g2 = this.f2462V;
        g2.f1204g.removeCallbacks(g2);
        g2.f1200c.abortAnimation();
        P.v vVar2 = this.f2478i;
        P.B b2 = this.f2464a;
        if (vVar2 != null) {
            P.t tVar = this.f2449D;
            if (tVar != null) {
                tVar.a();
            }
            this.f2478i.E();
            this.f2478i.F(b2);
            b2.f1186a.clear();
            java.util.ArrayList arrayList = b2.f1187b;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                B1.a.m(arrayList.get(size));
                throw null;
            }
            arrayList.clear();
            P.C0035h c0035h = b2.f1191f.f2465a0;
            c0035h.getClass();
            c0035h.f1272c = 0;
            if (this.f2484m) {
                P.v vVar3 = this.f2478i;
                vVar3.f1306e = false;
                vVar3.z(this);
            }
            this.f2478i.I(null);
            this.f2478i = null;
        } else {
            b2.f1186a.clear();
            java.util.ArrayList arrayList2 = b2.f1187b;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                B1.a.m(arrayList2.get(size2));
                throw null;
            }
            arrayList2.clear();
            P.C0035h c0035h2 = b2.f1191f.f2465a0;
            c0035h2.getClass();
            c0035h2.f1272c = 0;
        }
        I0.b bVar = this.f2470d;
        ((O1.a) bVar.f658c).d();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) bVar.f659d;
        int size3 = arrayList3.size() - 1;
        while (true) {
            jVar = (C.j) bVar.f657b;
            if (size3 < 0) {
                break;
            }
            j((android.view.View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) jVar.f88b;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2478i = vVar;
        if (vVar != null) {
            if (vVar.f1303b != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + vVar + " is already attached to a RecyclerView:" + vVar.f1303b.h());
            }
            vVar.I(this);
            if (this.f2484m) {
                this.f2478i.f1306e = true;
            }
        }
        b2.b();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        y.C1019g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f8468d) {
            java.lang.reflect.Field field = y.x.f8478a;
            y.AbstractC1028p.z(scrollingChildHelper.f8467c);
        }
        scrollingChildHelper.f8468d = z2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2461U = z2;
    }

    public void setRecycledViewPool(P.A a2) {
        P.B b2 = this.f2464a;
        if (b2.f1190e != null) {
            r1.f1185b--;
        }
        b2.f1190e = a2;
        if (a2 != null) {
            b2.f1191f.getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f2450E) {
            return;
        }
        this.f2450E = i2;
        if (i2 != 2) {
            P.G g2 = this.f2462V;
            g2.f1204g.removeCallbacks(g2);
            g2.f1200c.abortAnimation();
        }
        P.v vVar = this.f2478i;
        if (vVar != null) {
            vVar.D(i2);
        }
        java.util.ArrayList arrayList = this.f2469c0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((P.y) this.f2469c0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f2456L = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            android.util.Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f2456L = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(P.F f2) {
        this.f2464a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        P.v vVar = this.f2478i;
        if (vVar != null) {
            return vVar.n(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(P.x xVar) {
    }

    @java.lang.Deprecated
    public void setOnScrollListener(P.y yVar) {
    }

    public void setRecyclerListener(P.C c2) {
    }
}
