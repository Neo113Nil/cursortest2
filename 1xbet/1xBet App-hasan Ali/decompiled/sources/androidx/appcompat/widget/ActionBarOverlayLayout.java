package androidx.appcompat.widget;

import E.H0;
import S2.n;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import g1.C1968b;
import game.betting133.sports1xbet.R;
import java.lang.reflect.Field;
import n.B0;
import n.C2128d;
import n.C2130e;
import n.InterfaceC2118L;
import n.InterfaceC2126c;
import n.RunnableC2124b;
import n1.AbstractC2158A;
import n1.AbstractC2179u;
import n1.AbstractC2181w;
import n1.C;
import n1.InterfaceC2166g;
import n1.InterfaceC2167h;
import n1.P;
import n1.S;
import n1.T;
import n1.U;
import n1.V;
import n1.W;
import n1.X;
import n1.Y;
import n1.h0;
import n1.k0;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2166g, InterfaceC2167h {
    public static final int[] J = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final k0 K;

    /* renamed from: L, reason: collision with root package name */
    public static final Rect f6702L;

    /* renamed from: A, reason: collision with root package name */
    public k0 f6703A;

    /* renamed from: B, reason: collision with root package name */
    public k0 f6704B;

    /* renamed from: C, reason: collision with root package name */
    public OverScroller f6705C;

    /* renamed from: D, reason: collision with root package name */
    public ViewPropertyAnimator f6706D;

    /* renamed from: E, reason: collision with root package name */
    public final n f6707E;

    /* renamed from: F, reason: collision with root package name */
    public final RunnableC2124b f6708F;

    /* renamed from: G, reason: collision with root package name */
    public final RunnableC2124b f6709G;

    /* renamed from: H, reason: collision with root package name */
    public final H0 f6710H;

    /* renamed from: I, reason: collision with root package name */
    public final C2130e f6711I;

    /* renamed from: k, reason: collision with root package name */
    public int f6712k;

    /* renamed from: l, reason: collision with root package name */
    public ContentFrameLayout f6713l;

    /* renamed from: m, reason: collision with root package name */
    public ActionBarContainer f6714m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2118L f6715n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f6716o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6717p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6718q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6719r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6720s;

    /* renamed from: t, reason: collision with root package name */
    public int f6721t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f6722u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f6723v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f6724w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f6725x;

    /* renamed from: y, reason: collision with root package name */
    public k0 f6726y;

    /* renamed from: z, reason: collision with root package name */
    public k0 f6727z;

    static {
        int i = Build.VERSION.SDK_INT;
        Y x5 = i >= 36 ? new X() : i >= 35 ? new W() : i >= 34 ? new V() : i >= 31 ? new U() : i >= 30 ? new T() : i >= 29 ? new S() : new P();
        x5.h(C1968b.b(0, 1, 0, 1));
        K = x5.b();
        f6702L = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6722u = new Rect();
        this.f6723v = new Rect();
        this.f6724w = new Rect();
        this.f6725x = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        k0 k0Var = k0.f18441b;
        this.f6726y = k0Var;
        this.f6727z = k0Var;
        this.f6703A = k0Var;
        this.f6704B = k0Var;
        this.f6707E = new n(this, 1);
        this.f6708F = new RunnableC2124b(this, 0);
        this.f6709G = new RunnableC2124b(this, 1);
        h(context);
        this.f6710H = new H0();
        C2130e c2130e = new C2130e(context);
        c2130e.setWillNotDraw(true);
        this.f6711I = c2130e;
        addView(c2130e);
    }

    public static boolean e(View view, Rect rect, boolean z3) {
        boolean z5;
        C2128d c2128d = (C2128d) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c2128d).leftMargin;
        int i5 = rect.left;
        if (i != i5) {
            ((ViewGroup.MarginLayoutParams) c2128d).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c2128d).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c2128d).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c2128d).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c2128d).rightMargin = i9;
            z5 = true;
        }
        if (z3) {
            int i10 = ((ViewGroup.MarginLayoutParams) c2128d).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c2128d).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // n1.InterfaceC2166g
    public final void a(View view, View view2, int i, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // n1.InterfaceC2166g
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // n1.InterfaceC2167h
    public final void c(NestedScrollView nestedScrollView, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        f(nestedScrollView, i, i5, i6, i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2128d;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f6716o != null) {
            if (this.f6714m.getVisibility() == 0) {
                i = (int) (this.f6714m.getTranslationY() + this.f6714m.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f6716o.setBounds(0, i, getWidth(), this.f6716o.getIntrinsicHeight() + i);
            this.f6716o.draw(canvas);
        }
    }

    @Override // n1.InterfaceC2166g
    public final void f(NestedScrollView nestedScrollView, int i, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(nestedScrollView, i, i5, i6, i7);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        removeCallbacks(this.f6708F);
        removeCallbacks(this.f6709G);
        ViewPropertyAnimator viewPropertyAnimator = this.f6706D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2128d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2128d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f6714m;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        H0 h02 = this.f6710H;
        return h02.f1042b | h02.f1041a;
    }

    public CharSequence getTitle() {
        j();
        return ((B0) this.f6715n).f18120a.getTitle();
    }

    public final void h(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        this.f6712k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f6716o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f6705C = new OverScroller(context);
    }

    @Override // n1.InterfaceC2166g
    public final boolean i(View view, View view2, int i, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void j() {
        InterfaceC2118L wrapper;
        if (this.f6713l == null) {
            this.f6713l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f6714m = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC2118L) {
                wrapper = (InterfaceC2118L) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f6715n = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        k0 c5 = k0.c(this, windowInsets);
        h0 h0Var = c5.f18442a;
        boolean e3 = e(this.f6714m, new Rect(h0Var.n().f17073a, h0Var.n().f17074b, h0Var.n().f17075c, h0Var.n().f17076d), false);
        Field field = C.f18360a;
        Rect rect = this.f6722u;
        AbstractC2181w.b(this, c5, rect);
        k0 r5 = h0Var.r(rect.left, rect.top, rect.right, rect.bottom);
        this.f6726y = r5;
        boolean z3 = true;
        if (!this.f6727z.equals(r5)) {
            this.f6727z = this.f6726y;
            e3 = true;
        }
        Rect rect2 = this.f6723v;
        if (rect2.equals(rect)) {
            z3 = e3;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return h0Var.a().f18442a.c().f18442a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h(getContext());
        Field field = C.f18360a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C2128d c2128d = (C2128d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c2128d).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c2128d).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i5) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f6714m, i, 0, i5, 0);
        C2128d c2128d = (C2128d) this.f6714m.getLayoutParams();
        int max = Math.max(0, this.f6714m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2128d).leftMargin + ((ViewGroup.MarginLayoutParams) c2128d).rightMargin);
        int max2 = Math.max(0, this.f6714m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2128d).topMargin + ((ViewGroup.MarginLayoutParams) c2128d).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f6714m.getMeasuredState());
        Field field = C.f18360a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f6712k;
            if (this.f6718q && this.f6714m.getTabContainer() != null) {
                measuredHeight += this.f6712k;
            }
        } else {
            measuredHeight = this.f6714m.getVisibility() != 8 ? this.f6714m.getMeasuredHeight() : 0;
        }
        Rect rect = this.f6722u;
        Rect rect2 = this.f6724w;
        rect2.set(rect);
        this.f6703A = this.f6726y;
        if (!this.f6717p && !z3) {
            C2130e c2130e = this.f6711I;
            k0 k0Var = K;
            Rect rect3 = this.f6725x;
            AbstractC2181w.b(c2130e, k0Var, rect3);
            if (!rect3.equals(f6702L)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f6703A = this.f6703A.f18442a.r(0, measuredHeight, 0, 0);
                e(this.f6713l, rect2, true);
                if (!this.f6704B.equals(this.f6703A)) {
                    k0 k0Var2 = this.f6703A;
                    this.f6704B = k0Var2;
                    ContentFrameLayout contentFrameLayout = this.f6713l;
                    WindowInsets b3 = k0Var2.b();
                    if (b3 != null) {
                        WindowInsets a5 = Build.VERSION.SDK_INT >= 30 ? AbstractC2158A.a(contentFrameLayout, b3) : AbstractC2179u.a(contentFrameLayout, b3);
                        if (!a5.equals(b3)) {
                            k0.c(contentFrameLayout, a5);
                        }
                    }
                }
                measureChildWithMargins(this.f6713l, i, 0, i5, 0);
                C2128d c2128d2 = (C2128d) this.f6713l.getLayoutParams();
                int max3 = Math.max(max, this.f6713l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2128d2).leftMargin + ((ViewGroup.MarginLayoutParams) c2128d2).rightMargin);
                int max4 = Math.max(max2, this.f6713l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2128d2).topMargin + ((ViewGroup.MarginLayoutParams) c2128d2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f6713l.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
            }
        }
        C1968b b5 = C1968b.b(this.f6703A.f18442a.n().f17073a, this.f6703A.f18442a.n().f17074b + measuredHeight, this.f6703A.f18442a.n().f17075c, this.f6703A.f18442a.n().f17076d);
        k0 k0Var3 = this.f6703A;
        int i6 = Build.VERSION.SDK_INT;
        Y x5 = i6 >= 36 ? new X(k0Var3) : i6 >= 35 ? new W(k0Var3) : i6 >= 34 ? new V(k0Var3) : i6 >= 31 ? new U(k0Var3) : i6 >= 30 ? new T(k0Var3) : i6 >= 29 ? new S(k0Var3) : new P(k0Var3);
        x5.h(b5);
        this.f6703A = x5.b();
        e(this.f6713l, rect2, true);
        if (!this.f6704B.equals(this.f6703A)) {
        }
        measureChildWithMargins(this.f6713l, i, 0, i5, 0);
        C2128d c2128d22 = (C2128d) this.f6713l.getLayoutParams();
        int max32 = Math.max(max, this.f6713l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2128d22).leftMargin + ((ViewGroup.MarginLayoutParams) c2128d22).rightMargin);
        int max42 = Math.max(max2, this.f6713l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2128d22).topMargin + ((ViewGroup.MarginLayoutParams) c2128d22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f6713l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i5, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f5, boolean z3) {
        if (!this.f6719r || !z3) {
            return false;
        }
        this.f6705C.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f6705C.getFinalY() > this.f6714m.getHeight()) {
            g();
            this.f6709G.run();
        } else {
            g();
            this.f6708F.run();
        }
        this.f6720s = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        int i8 = this.f6721t + i5;
        this.f6721t = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f6710H.f1041a = i;
        this.f6721t = getActionBarHideOffset();
        g();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f6714m.getVisibility() != 0) {
            return false;
        }
        return this.f6719r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f6719r || this.f6720s) {
            return;
        }
        if (this.f6721t <= this.f6714m.getHeight()) {
            g();
            postDelayed(this.f6708F, 600L);
        } else {
            g();
            postDelayed(this.f6709G, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        g();
        this.f6714m.setTranslationY(-Math.max(0, Math.min(i, this.f6714m.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2126c interfaceC2126c) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f6718q = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f6719r) {
            this.f6719r = z3;
            if (z3) {
                return;
            }
            g();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        B0 b02 = (B0) this.f6715n;
        b02.f18123d = i != 0 ? AbstractC2346c.p(b02.f18120a.getContext(), i) : null;
        b02.c();
    }

    public void setLogo(int i) {
        j();
        B0 b02 = (B0) this.f6715n;
        b02.f18124e = i != 0 ? AbstractC2346c.p(b02.f18120a.getContext(), i) : null;
        b02.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f6717p = z3;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((B0) this.f6715n).f18128k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        B0 b02 = (B0) this.f6715n;
        if (b02.f18125g) {
            return;
        }
        b02.f18126h = charSequence;
        if ((b02.f18121b & 8) != 0) {
            Toolbar toolbar = b02.f18120a;
            toolbar.setTitle(charSequence);
            if (b02.f18125g) {
                C.e(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2128d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        B0 b02 = (B0) this.f6715n;
        b02.f18123d = drawable;
        b02.c();
    }

    @Override // n1.InterfaceC2166g
    public final void d(int i, int i5, int[] iArr, int i6) {
    }
}
