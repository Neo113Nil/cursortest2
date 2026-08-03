package androidx.core.widget;

/* loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements y.InterfaceC1021i {

    /* renamed from: B, reason: collision with root package name */
    public static final float f2184B = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final C.h f2185C = new C.h();

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2186D = {android.R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final y.C1015c f2187A;

    /* renamed from: a, reason: collision with root package name */
    public final float f2188a;

    /* renamed from: b, reason: collision with root package name */
    public long f2189b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f2190c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.OverScroller f2191d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.EdgeEffect f2192e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.EdgeEffect f2193f;

    /* renamed from: g, reason: collision with root package name */
    public int f2194g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2195h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2196i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f2197j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2198k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.VelocityTracker f2199l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2200m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2201n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2202o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2203p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2204q;

    /* renamed from: r, reason: collision with root package name */
    public int f2205r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f2206s;
    public final int[] t;

    /* renamed from: u, reason: collision with root package name */
    public int f2207u;

    /* renamed from: v, reason: collision with root package name */
    public int f2208v;

    /* renamed from: w, reason: collision with root package name */
    public C.m f2209w;

    /* renamed from: x, reason: collision with root package name */
    public final P.C0039l f2210x;

    /* renamed from: y, reason: collision with root package name */
    public final y.C1019g f2211y;

    /* renamed from: z, reason: collision with root package name */
    public float f2212z;

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.nestedScrollViewStyle);
        this.f2190c = new android.graphics.Rect();
        this.f2195h = true;
        this.f2196i = false;
        this.f2197j = null;
        this.f2198k = false;
        this.f2201n = true;
        this.f2205r = -1;
        this.f2206s = new int[2];
        this.t = new int[2];
        this.f2187A = new y.C1015c(getContext(), new C.j(0, this));
        int i2 = android.os.Build.VERSION.SDK_INT;
        this.f2192e = i2 >= 31 ? C.e.a(context, attributeSet) : new android.widget.EdgeEffect(context);
        this.f2193f = i2 >= 31 ? C.e.a(context, attributeSet) : new android.widget.EdgeEffect(context);
        this.f2188a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2191d = new android.widget.OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f2202o = viewConfiguration.getScaledTouchSlop();
        this.f2203p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2204q = viewConfiguration.getScaledMaximumFlingVelocity();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2186D, com.watchfacestudio.huasi_urx110.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2210x = new P.C0039l(2);
        this.f2211y = new y.C1019g(this);
        setNestedScrollingEnabled(true);
        y.x.a(this, f2185C);
    }

    public static boolean k(android.view.View view, androidx.core.widget.NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        java.lang.Object parent = view.getParent();
        return (parent instanceof android.view.ViewGroup) && k((android.view.View) parent, nestedScrollView);
    }

    @Override // y.InterfaceC1020h
    public final void a(android.view.View view, android.view.View view2, int i2, int i3) {
        P.C0039l c0039l = this.f2210x;
        if (i3 == 1) {
            c0039l.f1286c = i2;
        } else {
            c0039l.f1285b = i2;
        }
        u(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // y.InterfaceC1020h
    public final void b(android.view.ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        m(i5, i6, null);
    }

    @Override // y.InterfaceC1020h
    public final void c(android.view.View view, int i2) {
        P.C0039l c0039l = this.f2210x;
        if (i2 == 1) {
            c0039l.f1286c = 0;
        } else {
            c0039l.f1285b = 0;
        }
        w(i2);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i2;
        if (this.f2191d.isFinished()) {
            return;
        }
        this.f2191d.computeScrollOffset();
        int currY = this.f2191d.getCurrY();
        int i3 = currY - this.f2208v;
        int height = getHeight();
        android.widget.EdgeEffect edgeEffect = this.f2193f;
        android.widget.EdgeEffect edgeEffect2 = this.f2192e;
        if (i3 <= 0 || Q1.d.m(edgeEffect2) == 0.0f) {
            if (i3 < 0 && Q1.d.m(edgeEffect) != 0.0f) {
                float f2 = height;
                round = java.lang.Math.round(Q1.d.t(edgeEffect, (i3 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i3) {
                    edgeEffect.finish();
                }
            }
            this.f2208v = currY;
            int[] iArr = this.t;
            iArr[1] = 0;
            this.f2211y.c(0, i3, iArr, null, 1);
            i2 = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                o(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i2 - scrollY2;
                iArr[1] = 0;
                this.f2211y.d(0, scrollY2, 0, i4, this.f2206s, 1, iArr);
                i2 = i4 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f2191d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f2191d.getCurrVelocity());
                    }
                }
                this.f2191d.abortAnimation();
                w(1);
            }
            if (this.f2191d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = java.lang.Math.round(Q1.d.t(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i3) {
            edgeEffect2.finish();
        }
        i3 -= round;
        this.f2208v = currY;
        int[] iArr2 = this.t;
        iArr2[1] = 0;
        this.f2211y.c(0, i3, iArr2, null, 1);
        i2 = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.f2191d.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return java.lang.Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        android.view.View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = java.lang.Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // y.InterfaceC1020h
    public final void d(int i2, int i3, int[] iArr, int i4) {
        this.f2211y.c(i2, i3, iArr, null, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z2;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f2190c.setEmpty();
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        z2 = keyEvent.isAltPressed() ? j(33) : g(33);
                    } else if (keyCode == 20) {
                        z2 = keyEvent.isAltPressed() ? j(130) : g(130);
                    } else if (keyCode == 62) {
                        p(keyEvent.isShiftPressed() ? 33 : 130);
                    } else if (keyCode == 92) {
                        z2 = j(33);
                    } else if (keyCode == 93) {
                        z2 = j(130);
                    } else if (keyCode == 122) {
                        p(33);
                    } else if (keyCode == 123) {
                        p(130);
                    }
                    return !z2;
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            android.view.View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                z2 = true;
                if (!z2) {
                }
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f2211y.a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f2211y.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f2211y.c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f2211y.d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        android.widget.EdgeEffect edgeEffect = this.f2192e;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = java.lang.Math.min(0, scrollY);
            if (C.i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (C.i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect2 = this.f2193f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = java.lang.Math.max(getScrollRange(), scrollY) + height2;
        if (C.i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = getPaddingLeft();
        }
        if (C.i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // y.InterfaceC1021i
    public final void e(android.view.ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m(i5, i6, iArr);
    }

    @Override // y.InterfaceC1020h
    public final boolean f(android.view.View view, android.view.View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        android.view.View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                maxScrollAmount = java.lang.Math.min((childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            android.graphics.Rect rect = this.f2190c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        P.C0039l c0039l = this.f2210x;
        return c0039l.f1286c | c0039l.f1285b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        return java.lang.Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2212z == 0.0f) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.Context context = getContext();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new java.lang.IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2212z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2212z;
    }

    public final int h(android.graphics.Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return java.lang.Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return java.lang.Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2211y.f(0);
    }

    public final void i(int i2) {
        if (getChildCount() > 0) {
            this.f2191d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f2208v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2211y.f8468d;
    }

    public final boolean j(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.f2190c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            android.view.View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i2, rect.top, rect.bottom);
    }

    public final boolean l(android.view.View view, int i2, int i3) {
        android.graphics.Rect rect = this.f2190c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public final void m(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2211y.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(android.view.View view, int i2, int i3) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View view, int i2, int i3, int i4, int i5) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2205r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2194g = (int) motionEvent.getY(i2);
            this.f2205r = motionEvent.getPointerId(i2);
            android.view.VelocityTracker velocityTracker = this.f2199l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 <= i5) {
            if (i6 >= 0) {
                i5 = i6;
                z3 = false;
                if (z3 && !this.f2211y.f(1)) {
                    this.f2191d.springBack(i3, i5, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i3, i5);
                return z2 || z3;
            }
            i5 = 0;
        }
        z3 = true;
        if (z3) {
            this.f2191d.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        if (z2) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2196i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float f2;
        int i2;
        int i3;
        char c2;
        int i4;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c3;
        boolean z2;
        android.view.VelocityTracker velocityTracker;
        float f3;
        float f4;
        long j2;
        float sqrt;
        int i5;
        android.view.VelocityTracker velocityTracker2;
        float[] fArr;
        int i6;
        float f5;
        if (motionEvent.getAction() != 8 || this.f2198k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i2 = 9;
            f2 = motionEvent.getAxisValue(9);
            i3 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f2 = motionEvent.getAxisValue(26);
            i3 = getWidth() / 2;
            i2 = 26;
        } else {
            f2 = 0.0f;
            i2 = 0;
            i3 = 0;
        }
        if (f2 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f2)), i3, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        y.C1015c c1015c = this.f2187A;
        c1015c.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i7 = c1015c.f8461f;
        int[] iArr = c1015c.f8463h;
        if (i7 == source && c1015c.f8462g == deviceId && c1015c.f8460e == i2) {
            c3 = 0;
            z2 = false;
        } else {
            android.content.Context context = c1015c.f8456a;
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i8 = android.os.Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                java.lang.reflect.Method method = y.B.f8419a;
                i4 = y.A.b(viewConfiguration, deviceId2, i2, source2);
            } else {
                java.lang.reflect.Method method2 = y.B.f8419a;
                android.view.InputDevice device = android.view.InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i2, source2) == null) {
                    c2 = 0;
                    i4 = Integer.MAX_VALUE;
                    iArr[c2] = i4;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i8 < 34) {
                        scaledMaximumFlingVelocity = y.A.a(viewConfiguration, deviceId3, i2, source3);
                    } else {
                        android.view.InputDevice device2 = android.view.InputDevice.getDevice(deviceId3);
                        int i9 = Integer.MIN_VALUE;
                        if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                            android.content.res.Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM) : -1;
                            java.util.Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                i9 = dimensionPixelSize;
                            }
                        }
                        scaledMaximumFlingVelocity = i9;
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c1015c.f8461f = source;
                    c1015c.f8462g = deviceId;
                    c1015c.f8460e = i2;
                    c3 = 0;
                    z2 = true;
                } else {
                    android.content.res.Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM) : -1;
                    java.util.Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        i4 = Integer.MAX_VALUE;
                    }
                    i4 = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = i4;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i8 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c1015c.f8461f = source;
            c1015c.f8462g = deviceId;
            c1015c.f8460e = i2;
            c3 = 0;
            z2 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            android.view.VelocityTracker velocityTracker3 = c1015c.f8458c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c1015c.f8458c = null;
            }
        } else {
            if (c1015c.f8458c == null) {
                c1015c.f8458c = android.view.VelocityTracker.obtain();
            }
            android.view.VelocityTracker velocityTracker4 = c1015c.f8458c;
            java.util.Map map = y.AbstractC1024l.f8470a;
            velocityTracker4.addMovement(motionEvent);
            if (android.os.Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                java.util.Map map2 = y.AbstractC1024l.f8470a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new y.C1025m());
                }
                y.C1025m c1025m = (y.C1025m) map2.get(velocityTracker4);
                c1025m.getClass();
                long eventTime = motionEvent.getEventTime();
                int i10 = c1025m.f8474d;
                long[] jArr = c1025m.f8472b;
                if (i10 != 0 && eventTime - jArr[c1025m.f8475e] > 40) {
                    c1025m.f8474d = 0;
                    c1025m.f8473c = 0.0f;
                }
                int i11 = (c1025m.f8475e + 1) % 20;
                c1025m.f8475e = i11;
                int i12 = c1025m.f8474d;
                if (i12 != 20) {
                    c1025m.f8474d = i12 + 1;
                }
                c1025m.f8471a[i11] = motionEvent.getAxisValue(26);
                jArr[c1025m.f8475e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, Float.MAX_VALUE);
            y.C1025m c1025m2 = (y.C1025m) y.AbstractC1024l.f8470a.get(velocityTracker4);
            if (c1025m2 != null) {
                int i13 = c1025m2.f8474d;
                if (i13 >= 2) {
                    int i14 = c1025m2.f8475e;
                    int i15 = ((i14 + 20) - (i13 - 1)) % 20;
                    long[] jArr2 = c1025m2.f8472b;
                    long j3 = jArr2[i14];
                    while (true) {
                        j2 = jArr2[i15];
                        if (j3 - j2 <= 100) {
                            break;
                        }
                        c1025m2.f8474d--;
                        i15 = (i15 + 1) % 20;
                    }
                    int i16 = c1025m2.f8474d;
                    if (i16 >= 2) {
                        float[] fArr2 = c1025m2.f8471a;
                        if (i16 == 2) {
                            int i17 = (i15 + 1) % 20;
                            if (j2 != jArr2[i17]) {
                                velocityTracker = velocityTracker4;
                                i5 = 1000;
                                sqrt = fArr2[i17] / (r8 - j2);
                            }
                        } else {
                            float f6 = 0.0f;
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i18 >= c1025m2.f8474d - 1) {
                                    break;
                                }
                                int i20 = i18 + i15;
                                long j4 = jArr2[i20 % 20];
                                int i21 = (i20 + 1) % 20;
                                if (jArr2[i21] == j4) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i6 = 1;
                                } else {
                                    i19++;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f6) * 2.0f));
                                    float f7 = fArr2[i21];
                                    long j5 = jArr2[i21];
                                    fArr = fArr2;
                                    float f8 = f7 / (j5 - j4);
                                    float abs = (java.lang.Math.abs(f8) * (f8 - sqrt2)) + f6;
                                    i6 = 1;
                                    if (i19 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f6 = abs;
                                }
                                i18 += i6;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            sqrt = ((float) java.lang.Math.sqrt(java.lang.Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                            i5 = io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                        }
                        f5 = sqrt * i5;
                        c1025m2.f8473c = f5;
                        if (f5 >= (-java.lang.Math.abs(Float.MAX_VALUE))) {
                            c1025m2.f8473c = -java.lang.Math.abs(Float.MAX_VALUE);
                        } else if (c1025m2.f8473c > java.lang.Math.abs(Float.MAX_VALUE)) {
                            c1025m2.f8473c = java.lang.Math.abs(Float.MAX_VALUE);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                i5 = 1000;
                sqrt = 0.0f;
                f5 = sqrt * i5;
                c1025m2.f8473c = f5;
                if (f5 >= (-java.lang.Math.abs(Float.MAX_VALUE))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                f3 = y.AbstractC1023k.a(velocityTracker, i2);
            } else {
                android.view.VelocityTracker velocityTracker5 = velocityTracker;
                if (i2 == 0) {
                    f3 = velocityTracker5.getXVelocity();
                } else if (i2 == 1) {
                    f3 = velocityTracker5.getYVelocity();
                } else {
                    y.C1025m c1025m3 = (y.C1025m) y.AbstractC1024l.f8470a.get(velocityTracker5);
                    f3 = (c1025m3 == null || i2 != 26) ? 0.0f : c1025m3.f8473c;
                }
            }
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) c1015c.f8457b.f88b;
            float f9 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = java.lang.Math.signum(f9);
            if (z2 || (signum != java.lang.Math.signum(c1015c.f8459d) && signum != 0.0f)) {
                nestedScrollView.f2191d.abortAnimation();
            }
            if (java.lang.Math.abs(f9) >= iArr[0]) {
                float max = java.lang.Math.max(-r4, java.lang.Math.min(f9, iArr[1]));
                if (max == 0.0f) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView.f2191d.abortAnimation();
                    nestedScrollView.i((int) max);
                    f4 = max;
                }
                c1015c.f8459d = f4;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f2198k) {
            return true;
        }
        int i2 = action & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f2205r;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            android.util.Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (java.lang.Math.abs(y2 - this.f2194g) > this.f2202o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2198k = true;
                                this.f2194g = y2;
                                if (this.f2199l == null) {
                                    this.f2199l = android.view.VelocityTracker.obtain();
                                }
                                this.f2199l.addMovement(motionEvent);
                                this.f2207u = 0;
                                android.view.ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f2198k = false;
            this.f2205r = -1;
            android.view.VelocityTracker velocityTracker = this.f2199l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2199l = null;
            }
            if (this.f2191d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                android.view.View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f2194g = y3;
                    this.f2205r = motionEvent.getPointerId(0);
                    android.view.VelocityTracker velocityTracker2 = this.f2199l;
                    if (velocityTracker2 == null) {
                        this.f2199l = android.view.VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2199l.addMovement(motionEvent);
                    this.f2191d.computeScrollOffset();
                    if (!v(motionEvent) && this.f2191d.isFinished()) {
                        z2 = false;
                    }
                    this.f2198k = z2;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f2191d.isFinished()) {
                z2 = false;
            }
            this.f2198k = z2;
            android.view.VelocityTracker velocityTracker3 = this.f2199l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2199l = null;
            }
        }
        return this.f2198k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        int i7 = 0;
        this.f2195h = false;
        android.view.View view = this.f2197j;
        if (view != null && k(view, this)) {
            android.view.View view2 = this.f2197j;
            android.graphics.Rect rect = this.f2190c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f2197j = null;
        if (!this.f2196i) {
            if (this.f2209w != null) {
                scrollTo(getScrollX(), this.f2209w.f90a);
                this.f2209w = null;
            }
            if (getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i6 = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i6 && scrollY >= 0) {
                i7 = paddingTop + scrollY > i6 ? i6 - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2196i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2200m && android.view.View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(android.view.ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        i((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f2, float f3) {
        return this.f2211y.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
        this.f2211y.c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        m(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, android.graphics.Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        android.view.View findNextFocus = rect == null ? android.view.FocusFinder.getInstance().findNextFocus(this, null, i2) : android.view.FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof C.m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C.m mVar = (C.m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f2209w = mVar;
        requestLayout();
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        C.m mVar = new C.m(super.onSaveInstanceState());
        mVar.f90a = getScrollY();
        return mVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        android.view.View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i5)) {
            return;
        }
        android.graphics.Rect rect = this.f2190c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h2 = h(rect);
        if (h2 != 0) {
            if (this.f2201n) {
                t(0, h2, false);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        if (this.f2199l == null) {
            this.f2199l = android.view.VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2207u = 0;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, this.f2207u);
        if (actionMasked != 0) {
            android.widget.EdgeEffect edgeEffect = this.f2193f;
            android.widget.EdgeEffect edgeEffect2 = this.f2192e;
            if (actionMasked == 1) {
                android.view.VelocityTracker velocityTracker = this.f2199l;
                velocityTracker.computeCurrentVelocity(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.f2204q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2205r);
                if (java.lang.Math.abs(yVelocity) >= this.f2203p) {
                    if (Q1.d.m(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (Q1.d.m(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (s(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            i(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!this.f2211y.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            i(i3);
                        }
                    }
                } else if (this.f2191d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2205r = -1;
                this.f2198k = false;
                android.view.VelocityTracker velocityTracker2 = this.f2199l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2199l = null;
                }
                w(0);
                this.f2192e.onRelease();
                this.f2193f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2205r);
                if (findPointerIndex == -1) {
                    android.util.Log.e("NestedScrollView", "Invalid pointerId=" + this.f2205r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.f2194g - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (Q1.d.m(edgeEffect2) != 0.0f) {
                        float f4 = -Q1.d.t(edgeEffect2, -height, x2);
                        if (Q1.d.m(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (Q1.d.m(edgeEffect) != 0.0f) {
                        float t = Q1.d.t(edgeEffect, height, 1.0f - x2);
                        if (Q1.d.m(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = t;
                    }
                    int round = java.lang.Math.round(f2 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i5 = i4 - round;
                    if (!this.f2198k && java.lang.Math.abs(i5) > this.f2202o) {
                        android.view.ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2198k = true;
                        i5 = i5 > 0 ? i5 - this.f2202o : i5 + this.f2202o;
                    }
                    if (this.f2198k) {
                        int r2 = r(i5, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f2194g = y2 - r2;
                        this.f2207u += r2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2198k && getChildCount() > 0 && this.f2191d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2205r = -1;
                this.f2198k = false;
                android.view.VelocityTracker velocityTracker3 = this.f2199l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2199l = null;
                }
                w(0);
                this.f2192e.onRelease();
                this.f2193f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2194g = (int) motionEvent.getY(actionIndex);
                this.f2205r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f2194g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2205r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2198k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2191d.isFinished()) {
                this.f2191d.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f2194g = y3;
            this.f2205r = pointerId;
            u(2, 0);
        }
        android.view.VelocityTracker velocityTracker4 = this.f2199l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.f2190c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                android.view.View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        q(i2, i3, i4);
    }

    public final boolean q(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        java.util.ArrayList<android.view.View> focusables = getFocusables(2);
        int size = focusables.size();
        android.view.View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            r(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    public final int r(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        android.view.VelocityTracker velocityTracker;
        if (i4 == 1) {
            u(2, i4);
        }
        boolean c2 = this.f2211y.c(0, i2, this.t, this.f2206s, i4);
        int[] iArr = this.t;
        int[] iArr2 = this.f2206s;
        if (c2) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = o(i5, 0, scrollY, scrollRange) && !this.f2211y.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f2211y.d(0, scrollY2, 0, i5 - scrollY2, this.f2206s, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        android.widget.EdgeEffect edgeEffect = this.f2193f;
        android.widget.EdgeEffect edgeEffect2 = this.f2192e;
        if (i9 < 0) {
            if (z4) {
                Q1.d.t(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            Q1.d.t(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f2199l) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        if (this.f2195h) {
            this.f2197j = view2;
        } else {
            android.graphics.Rect rect = this.f2190c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        boolean z3 = h2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, h2);
            } else {
                t(0, h2, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        android.view.VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f2199l) != null) {
            velocityTracker.recycle();
            this.f2199l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2195h = true;
        super.requestLayout();
    }

    public final boolean s(android.widget.EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float m2 = Q1.d.m(edgeEffect) * getHeight();
        float abs = java.lang.Math.abs(-i2) * 0.35f;
        float f2 = this.f2188a * 0.015f;
        double log = java.lang.Math.log(abs / f2);
        double d2 = f2184B;
        return ((float) (java.lang.Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f2))) < m2;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f2200m) {
            this.f2200m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        y.C1019g c1019g = this.f2211y;
        if (c1019g.f8468d) {
            java.lang.reflect.Field field = y.x.f8478a;
            y.AbstractC1028p.z(c1019g.f8467c);
        }
        c1019g.f8468d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f2201n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f2211y.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.f2189b > 250) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2191d.startScroll(getScrollX(), scrollY, 0, java.lang.Math.max(0, java.lang.Math.min(i3 + scrollY, java.lang.Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f2208v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2191d.isFinished()) {
                this.f2191d.abortAnimation();
                w(1);
            }
            scrollBy(i2, i3);
        }
        this.f2189b = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i2, int i3) {
        this.f2211y.g(2, i3);
    }

    public final boolean v(android.view.MotionEvent motionEvent) {
        boolean z2;
        android.widget.EdgeEffect edgeEffect = this.f2192e;
        if (Q1.d.m(edgeEffect) != 0.0f) {
            Q1.d.t(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.f2193f;
        if (Q1.d.m(edgeEffect2) == 0.0f) {
            return z2;
        }
        Q1.d.t(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i2) {
        this.f2211y.h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(C.k kVar) {
    }
}
