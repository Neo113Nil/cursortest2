package androidx.appcompat.widget;

import P.C0364u;
import P.InterfaceC0362s;
import P.InterfaceC0363t;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import i.C1222I;
import java.util.WeakHashMap;
import l.C1373k;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0629b0, InterfaceC0362s, InterfaceC0363t {

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f8207S = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public boolean f8208A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8209B;

    /* renamed from: C, reason: collision with root package name */
    public int f8210C;

    /* renamed from: D, reason: collision with root package name */
    public int f8211D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f8212E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f8213F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f8214G;

    /* renamed from: H, reason: collision with root package name */
    public P.q0 f8215H;

    /* renamed from: I, reason: collision with root package name */
    public P.q0 f8216I;

    /* renamed from: J, reason: collision with root package name */
    public P.q0 f8217J;

    /* renamed from: K, reason: collision with root package name */
    public P.q0 f8218K;

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC0630c f8219L;

    /* renamed from: M, reason: collision with root package name */
    public OverScroller f8220M;

    /* renamed from: N, reason: collision with root package name */
    public ViewPropertyAnimator f8221N;

    /* renamed from: O, reason: collision with root package name */
    public final H2.n f8222O;

    /* renamed from: P, reason: collision with root package name */
    public final RunnableC0628b f8223P;

    /* renamed from: Q, reason: collision with root package name */
    public final RunnableC0628b f8224Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0364u f8225R;

    /* renamed from: a, reason: collision with root package name */
    public int f8226a;

    /* renamed from: b, reason: collision with root package name */
    public int f8227b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f8228c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f8229d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0631c0 f8230e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8231f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8232x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8233y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8234z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8227b = 0;
        this.f8212E = new Rect();
        this.f8213F = new Rect();
        this.f8214G = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        P.q0 q0Var = P.q0.f5100b;
        this.f8215H = q0Var;
        this.f8216I = q0Var;
        this.f8217J = q0Var;
        this.f8218K = q0Var;
        this.f8222O = new H2.n(this, 2);
        this.f8223P = new RunnableC0628b(this, 0);
        this.f8224Q = new RunnableC0628b(this, 1);
        c(context);
        this.f8225R = new C0364u();
    }

    public static boolean a(View view, Rect rect, boolean z4) {
        boolean z7;
        C0632d c0632d = (C0632d) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) c0632d).leftMargin;
        int i8 = rect.left;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0632d).leftMargin = i8;
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c0632d).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c0632d).topMargin = i10;
            z7 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c0632d).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c0632d).rightMargin = i12;
            z7 = true;
        }
        if (z4) {
            int i13 = ((ViewGroup.MarginLayoutParams) c0632d).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c0632d).bottomMargin = i14;
                return true;
            }
        }
        return z7;
    }

    public final void b() {
        removeCallbacks(this.f8223P);
        removeCallbacks(this.f8224Q);
        ViewPropertyAnimator viewPropertyAnimator = this.f8221N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f8207S);
        this.f8226a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f8231f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f8232x = context.getApplicationInfo().targetSdkVersion < 19;
        this.f8220M = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0632d;
    }

    public final void d(int i7) {
        e();
        if (i7 == 2) {
            ((j1) this.f8230e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i7 == 5) {
            ((j1) this.f8230e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        if (this.f8231f == null || this.f8232x) {
            return;
        }
        if (this.f8229d.getVisibility() == 0) {
            i7 = (int) (this.f8229d.getTranslationY() + this.f8229d.getBottom() + 0.5f);
        } else {
            i7 = 0;
        }
        this.f8231f.setBounds(0, i7, getWidth(), this.f8231f.getIntrinsicHeight() + i7);
        this.f8231f.draw(canvas);
    }

    public final void e() {
        InterfaceC0631c0 wrapper;
        if (this.f8228c == null) {
            this.f8228c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f8229d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0631c0) {
                wrapper = (InterfaceC0631c0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f8230e = wrapper;
        }
    }

    public final void f(m.k kVar, m.w wVar) {
        e();
        j1 j1Var = (j1) this.f8230e;
        C0644j c0644j = j1Var.f8673m;
        Toolbar toolbar = j1Var.f8662a;
        if (c0644j == null) {
            j1Var.f8673m = new C0644j(toolbar.getContext());
        }
        C0644j c0644j2 = j1Var.f8673m;
        c0644j2.f8655e = wVar;
        if (kVar == null && toolbar.f8532a == null) {
            return;
        }
        toolbar.f();
        m.k kVar2 = toolbar.f8532a.f8235G;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.r(toolbar.f8542f0);
            kVar2.r(toolbar.f8543g0);
        }
        if (toolbar.f8543g0 == null) {
            toolbar.f8543g0 = new d1(toolbar);
        }
        c0644j2.f8644H = true;
        if (kVar != null) {
            kVar.b(c0644j2, toolbar.f8509A);
            kVar.b(toolbar.f8543g0, toolbar.f8509A);
        } else {
            c0644j2.c(toolbar.f8509A, null);
            toolbar.f8543g0.c(toolbar.f8509A, null);
            c0644j2.f();
            toolbar.f8543g0.f();
        }
        toolbar.f8532a.setPopupTheme(toolbar.f8510B);
        toolbar.f8532a.setPresenter(c0644j2);
        toolbar.f8542f0 = c0644j2;
        toolbar.w();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0632d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0632d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f8229d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0364u c0364u = this.f8225R;
        return c0364u.f5111b | c0364u.f5110a;
    }

    public CharSequence getTitle() {
        e();
        return ((j1) this.f8230e).f8662a.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        P.q0 g3 = P.q0.g(windowInsets, this);
        boolean a2 = a(this.f8229d, new Rect(g3.b(), g3.d(), g3.c(), g3.a()), false);
        WeakHashMap weakHashMap = P.U.f5037a;
        Rect rect = this.f8212E;
        P.I.b(this, g3, rect);
        int i7 = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        P.p0 p0Var = g3.f5101a;
        P.q0 i11 = p0Var.i(i7, i8, i9, i10);
        this.f8215H = i11;
        boolean z4 = true;
        if (!this.f8216I.equals(i11)) {
            this.f8216I = this.f8215H;
            a2 = true;
        }
        Rect rect2 = this.f8213F;
        if (rect2.equals(rect)) {
            z4 = a2;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return p0Var.a().f5101a.c().f5101a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = P.U.f5037a;
        P.G.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0632d c0632d = (C0632d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c0632d).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c0632d).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int measuredHeight;
        e();
        measureChildWithMargins(this.f8229d, i7, 0, i8, 0);
        C0632d c0632d = (C0632d) this.f8229d.getLayoutParams();
        int max = Math.max(0, this.f8229d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0632d).leftMargin + ((ViewGroup.MarginLayoutParams) c0632d).rightMargin);
        int max2 = Math.max(0, this.f8229d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0632d).topMargin + ((ViewGroup.MarginLayoutParams) c0632d).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f8229d.getMeasuredState());
        WeakHashMap weakHashMap = P.U.f5037a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f8226a;
            if (this.f8234z && this.f8229d.getTabContainer() != null) {
                measuredHeight += this.f8226a;
            }
        } else {
            measuredHeight = this.f8229d.getVisibility() != 8 ? this.f8229d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f8212E;
        Rect rect2 = this.f8214G;
        rect2.set(rect);
        P.q0 q0Var = this.f8215H;
        this.f8217J = q0Var;
        if (this.f8233y || z4) {
            I.c a2 = I.c.a(q0Var.b(), this.f8217J.d() + measuredHeight, this.f8217J.c(), this.f8217J.a());
            P.q0 q0Var2 = this.f8217J;
            int i9 = Build.VERSION.SDK_INT;
            P.i0 h0Var = i9 >= 30 ? new P.h0(q0Var2) : i9 >= 29 ? new P.g0(q0Var2) : new P.f0(q0Var2);
            h0Var.d(a2);
            this.f8217J = h0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f8217J = q0Var.f5101a.i(0, measuredHeight, 0, 0);
        }
        a(this.f8228c, rect2, true);
        if (!this.f8218K.equals(this.f8217J)) {
            P.q0 q0Var3 = this.f8217J;
            this.f8218K = q0Var3;
            ContentFrameLayout contentFrameLayout = this.f8228c;
            WindowInsets f7 = q0Var3.f();
            if (f7 != null) {
                WindowInsets a4 = P.G.a(contentFrameLayout, f7);
                if (!a4.equals(f7)) {
                    P.q0.g(a4, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f8228c, i7, 0, i8, 0);
        C0632d c0632d2 = (C0632d) this.f8228c.getLayoutParams();
        int max3 = Math.max(max, this.f8228c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0632d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0632d2).rightMargin);
        int max4 = Math.max(max2, this.f8228c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0632d2).topMargin + ((ViewGroup.MarginLayoutParams) c0632d2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f8228c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z4) {
        if (!this.f8208A || !z4) {
            return false;
        }
        this.f8220M.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (this.f8220M.getFinalY() > this.f8229d.getHeight()) {
            b();
            this.f8224Q.run();
        } else {
            b();
            this.f8223P.run();
        }
        this.f8209B = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // P.InterfaceC0363t
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        onNestedScroll(view, i7, i8, i9, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        C1222I c1222i;
        C1373k c1373k;
        this.f8225R.f5110a = i7;
        this.f8210C = getActionBarHideOffset();
        b();
        InterfaceC0630c interfaceC0630c = this.f8219L;
        if (interfaceC0630c == null || (c1373k = (c1222i = (C1222I) interfaceC0630c).f13648t) == null) {
            return;
        }
        c1373k.a();
        c1222i.f13648t = null;
    }

    @Override // P.InterfaceC0362s
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // P.InterfaceC0362s
    public final void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        e();
        int i8 = this.f8211D ^ i7;
        this.f8211D = i7;
        boolean z4 = (i7 & 4) == 0;
        boolean z7 = (i7 & 256) != 0;
        InterfaceC0630c interfaceC0630c = this.f8219L;
        if (interfaceC0630c != null) {
            C1222I c1222i = (C1222I) interfaceC0630c;
            c1222i.f13643o = !z7;
            if (z4 || !z7) {
                if (c1222i.f13645q) {
                    c1222i.f13645q = false;
                    c1222i.y(true);
                }
            } else if (!c1222i.f13645q) {
                c1222i.f13645q = true;
                c1222i.y(true);
            }
        }
        if ((i8 & 256) == 0 || this.f8219L == null) {
            return;
        }
        WeakHashMap weakHashMap = P.U.f5037a;
        P.G.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f8227b = i7;
        InterfaceC0630c interfaceC0630c = this.f8219L;
        if (interfaceC0630c != null) {
            ((C1222I) interfaceC0630c).f13642n = i7;
        }
    }

    public void setActionBarHideOffset(int i7) {
        b();
        this.f8229d.setTranslationY(-Math.max(0, Math.min(i7, this.f8229d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0630c interfaceC0630c) {
        this.f8219L = interfaceC0630c;
        if (getWindowToken() != null) {
            ((C1222I) this.f8219L).f13642n = this.f8227b;
            int i7 = this.f8211D;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap weakHashMap = P.U.f5037a;
                P.G.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f8234z = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f8208A) {
            this.f8208A = z4;
            if (z4) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        e();
        j1 j1Var = (j1) this.f8230e;
        j1Var.f8665d = i7 != 0 ? AbstractC1464a.w(j1Var.f8662a.getContext(), i7) : null;
        j1Var.c();
    }

    public void setLogo(int i7) {
        e();
        j1 j1Var = (j1) this.f8230e;
        j1Var.f8666e = i7 != 0 ? AbstractC1464a.w(j1Var.f8662a.getContext(), i7) : null;
        j1Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f8233y = z4;
        this.f8232x = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0629b0
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((j1) this.f8230e).f8671k = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0629b0
    public void setWindowTitle(CharSequence charSequence) {
        e();
        j1 j1Var = (j1) this.f8230e;
        if (j1Var.f8668g) {
            return;
        }
        j1Var.f8669h = charSequence;
        if ((j1Var.f8663b & 8) != 0) {
            Toolbar toolbar = j1Var.f8662a;
            toolbar.setTitle(charSequence);
            if (j1Var.f8668g) {
                P.U.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // P.InterfaceC0362s
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f8229d.getVisibility() != 0) {
            return false;
        }
        return this.f8208A;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f8208A || this.f8209B) {
            return;
        }
        if (this.f8210C <= this.f8229d.getHeight()) {
            b();
            postDelayed(this.f8223P, 600L);
        } else {
            b();
            postDelayed(this.f8224Q, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0632d(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f8210C + i8;
        this.f8210C = i11;
        setActionBarHideOffset(i11);
    }

    public void setIcon(Drawable drawable) {
        e();
        j1 j1Var = (j1) this.f8230e;
        j1Var.f8665d = drawable;
        j1Var.c();
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }
}
