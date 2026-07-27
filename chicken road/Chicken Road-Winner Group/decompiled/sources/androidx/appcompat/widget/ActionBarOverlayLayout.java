package androidx.appcompat.widget;

import D.AbstractC0014o;
import D.C0009j;
import D.InterfaceC0007h;
import D.InterfaceC0008i;
import D.z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.chicken.jump.road.pump.R;
import h.AbstractC0323a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l.C1083b;
import l.C1086e;
import l.InterfaceC1085d;
import l.InterfaceC1104x;
import l.RunnableC1084c;
import l.p0;
import l.v0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0007h, InterfaceC0008i {
    public static final int[] y = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: a, reason: collision with root package name */
    public int f1940a;

    /* renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f1941b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarContainer f1942c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1104x f1943d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1944e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1945g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1946h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1947i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1948j;

    /* renamed from: k, reason: collision with root package name */
    public int f1949k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f1950l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1951m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1952n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1953o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1954p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1955q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1956r;

    /* renamed from: s, reason: collision with root package name */
    public OverScroller f1957s;

    /* renamed from: t, reason: collision with root package name */
    public ViewPropertyAnimator f1958t;

    /* renamed from: u, reason: collision with root package name */
    public final C1083b f1959u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC1084c f1960v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC1084c f1961w;

    /* renamed from: x, reason: collision with root package name */
    public final C0009j f1962x;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1950l = new Rect();
        this.f1951m = new Rect();
        this.f1952n = new Rect();
        this.f1953o = new Rect();
        this.f1954p = new Rect();
        this.f1955q = new Rect();
        this.f1956r = new Rect();
        this.f1959u = new C1083b(this);
        this.f1960v = new RunnableC1084c(this, 0);
        this.f1961w = new RunnableC1084c(this, 1);
        i(context);
        this.f1962x = new C0009j();
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        C1086e c1086e = (C1086e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1086e).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1086e).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1086e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1086e).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c1086e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c1086e).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) c1086e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c1086e).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // D.InterfaceC0007h
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // D.InterfaceC0007h
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(viewGroup, i3, i4, i5, i6);
        }
    }

    @Override // D.InterfaceC0007h
    public final void c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1086e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f1944e == null || this.f) {
            return;
        }
        if (this.f1942c.getVisibility() == 0) {
            i3 = (int) (this.f1942c.getTranslationY() + this.f1942c.getBottom() + 0.5f);
        } else {
            i3 = 0;
        }
        this.f1944e.setBounds(0, i3, getWidth(), this.f1944e.getIntrinsicHeight() + i3);
        this.f1944e.draw(canvas);
    }

    @Override // D.InterfaceC0008i
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        b(viewGroup, i3, i4, i5, i6, i7);
    }

    @Override // D.InterfaceC0007h
    public final boolean f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = z.f259a;
        getWindowSystemUiVisibility();
        boolean g3 = g(this.f1942c, rect, false);
        Rect rect2 = this.f1953o;
        rect2.set(rect);
        Method method = v0.f9912a;
        Rect rect3 = this.f1950l;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e3) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e3);
            }
        }
        Rect rect4 = this.f1954p;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g3 = true;
        }
        Rect rect5 = this.f1951m;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g3 = true;
        }
        if (g3) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1086e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1086e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1942c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0009j c0009j = this.f1962x;
        return c0009j.f246c | c0009j.f245b;
    }

    public CharSequence getTitle() {
        j();
        return ((p0) this.f1943d).f9849a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1960v);
        removeCallbacks(this.f1961w);
        ViewPropertyAnimator viewPropertyAnimator = this.f1958t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(y);
        this.f1940a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1944e = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1957s = new OverScroller(context);
    }

    public final void j() {
        InterfaceC1104x wrapper;
        if (this.f1941b == null) {
            this.f1941b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1942c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1104x) {
                wrapper = (InterfaceC1104x) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1943d = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = z.f259a;
        AbstractC0014o.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1086e c1086e = (C1086e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c1086e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c1086e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        j();
        measureChildWithMargins(this.f1942c, i3, 0, i4, 0);
        C1086e c1086e = (C1086e) this.f1942c.getLayoutParams();
        int i5 = 0;
        int max = Math.max(0, this.f1942c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1086e).leftMargin + ((ViewGroup.MarginLayoutParams) c1086e).rightMargin);
        int max2 = Math.max(0, this.f1942c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1086e).topMargin + ((ViewGroup.MarginLayoutParams) c1086e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1942c.getMeasuredState());
        Field field = z.f259a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            i5 = this.f1940a;
            if (this.f1946h && this.f1942c.getTabContainer() != null) {
                i5 += this.f1940a;
            }
        } else if (this.f1942c.getVisibility() != 8) {
            i5 = this.f1942c.getMeasuredHeight();
        }
        Rect rect = this.f1950l;
        Rect rect2 = this.f1952n;
        rect2.set(rect);
        Rect rect3 = this.f1955q;
        rect3.set(this.f1953o);
        if (this.f1945g || z3) {
            rect3.top += i5;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i5;
            rect2.bottom = rect2.bottom;
        }
        g(this.f1941b, rect2, true);
        Rect rect4 = this.f1956r;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f1941b.a(rect3);
        }
        measureChildWithMargins(this.f1941b, i3, 0, i4, 0);
        C1086e c1086e2 = (C1086e) this.f1941b.getLayoutParams();
        int max3 = Math.max(max, this.f1941b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1086e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1086e2).rightMargin);
        int max4 = Math.max(max2, this.f1941b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1086e2).topMargin + ((ViewGroup.MarginLayoutParams) c1086e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1941b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f3, boolean z3) {
        if (!this.f1947i || !z3) {
            return false;
        }
        this.f1957s.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1957s.getFinalY() > this.f1942c.getHeight()) {
            h();
            this.f1961w.run();
        } else {
            h();
            this.f1960v.run();
        }
        this.f1948j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f1949k + i4;
        this.f1949k = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f1962x.f245b = i3;
        this.f1949k = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f1942c.getVisibility() != 0) {
            return false;
        }
        return this.f1947i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1947i || this.f1948j) {
            return;
        }
        if (this.f1949k <= this.f1942c.getHeight()) {
            h();
            postDelayed(this.f1960v, 600L);
        } else {
            h();
            postDelayed(this.f1961w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f1942c.setTranslationY(-Math.max(0, Math.min(i3, this.f1942c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1085d interfaceC1085d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f1946h = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f1947i) {
            this.f1947i = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        j();
        p0 p0Var = (p0) this.f1943d;
        p0Var.f9852d = i3 != 0 ? AbstractC0323a.a(p0Var.f9849a.getContext(), i3) : null;
        p0Var.c();
    }

    public void setLogo(int i3) {
        j();
        p0 p0Var = (p0) this.f1943d;
        p0Var.f9853e = i3 != 0 ? AbstractC0323a.a(p0Var.f9849a.getContext(), i3) : null;
        p0Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f1945g = z3;
        this.f = z3 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((p0) this.f1943d).f9858k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        p0 p0Var = (p0) this.f1943d;
        if (p0Var.f9854g) {
            return;
        }
        p0Var.f9855h = charSequence;
        if ((p0Var.f9850b & 8) != 0) {
            p0Var.f9849a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1086e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        p0 p0Var = (p0) this.f1943d;
        p0Var.f9852d = drawable;
        p0Var.c();
    }

    @Override // D.InterfaceC0007h
    public final void d(int i3, int i4, int[] iArr, int i5) {
    }
}
