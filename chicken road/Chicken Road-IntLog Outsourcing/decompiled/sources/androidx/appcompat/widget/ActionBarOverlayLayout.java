package androidx.appcompat.widget;

import E.AbstractC0046v;
import E.C0042q;
import E.G;
import E.InterfaceC0040o;
import E.InterfaceC0041p;
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
import com.chickyneer.roadway.R;
import h.AbstractC0477a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l.C1230b;
import l.C1233e;
import l.InterfaceC1232d;
import l.InterfaceC1249v;
import l.RunnableC1231c;
import l.n0;
import l.t0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0040o, InterfaceC0041p {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4130y = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: a, reason: collision with root package name */
    public int f4131a;

    /* renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f4132b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarContainer f4133c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1249v f4134d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4135e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4136f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4137g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4138h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4139i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4140j;

    /* renamed from: k, reason: collision with root package name */
    public int f4141k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f4142l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4143m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f4144n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4145o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f4146p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f4147q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f4148r;

    /* renamed from: s, reason: collision with root package name */
    public OverScroller f4149s;

    /* renamed from: t, reason: collision with root package name */
    public ViewPropertyAnimator f4150t;

    /* renamed from: u, reason: collision with root package name */
    public final C1230b f4151u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC1231c f4152v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC1231c f4153w;

    /* renamed from: x, reason: collision with root package name */
    public final C0042q f4154x;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4142l = new Rect();
        this.f4143m = new Rect();
        this.f4144n = new Rect();
        this.f4145o = new Rect();
        this.f4146p = new Rect();
        this.f4147q = new Rect();
        this.f4148r = new Rect();
        this.f4151u = new C1230b(this);
        this.f4152v = new RunnableC1231c(this, 0);
        this.f4153w = new RunnableC1231c(this, 1);
        i(context);
        this.f4154x = new C0042q(0);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z5;
        C1233e c1233e = (C1233e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c1233e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c1233e).leftMargin = i3;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c1233e).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c1233e).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c1233e).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c1233e).rightMargin = i9;
            z5 = true;
        }
        if (z) {
            int i10 = ((ViewGroup.MarginLayoutParams) c1233e).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c1233e).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // E.InterfaceC0040o
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // E.InterfaceC0040o
    public final void b(ViewGroup viewGroup, int i2, int i3, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(viewGroup, i2, i3, i6, i7);
        }
    }

    @Override // E.InterfaceC0040o
    public final void c(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1233e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f4135e == null || this.f4136f) {
            return;
        }
        if (this.f4133c.getVisibility() == 0) {
            i2 = (int) (this.f4133c.getTranslationY() + this.f4133c.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f4135e.setBounds(0, i2, getWidth(), this.f4135e.getIntrinsicHeight() + i2);
        this.f4135e.draw(canvas);
    }

    @Override // E.InterfaceC0041p
    public final void e(ViewGroup viewGroup, int i2, int i3, int i6, int i7, int i8, int[] iArr) {
        b(viewGroup, i2, i3, i6, i7, i8);
    }

    @Override // E.InterfaceC0040o
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = G.f566a;
        getWindowSystemUiVisibility();
        boolean g6 = g(this.f4133c, rect, false);
        Rect rect2 = this.f4145o;
        rect2.set(rect);
        Method method = t0.f10978a;
        Rect rect3 = this.f4142l;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e3) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e3);
            }
        }
        Rect rect4 = this.f4146p;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g6 = true;
        }
        Rect rect5 = this.f4143m;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g6 = true;
        }
        if (g6) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1233e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1233e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4133c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0042q c0042q = this.f4154x;
        return c0042q.f632c | c0042q.f631b;
    }

    public CharSequence getTitle() {
        j();
        return ((n0) this.f4134d).f10911a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f4152v);
        removeCallbacks(this.f4153w);
        ViewPropertyAnimator viewPropertyAnimator = this.f4150t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4130y);
        this.f4131a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4135e = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f4136f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f4149s = new OverScroller(context);
    }

    public final void j() {
        InterfaceC1249v wrapper;
        if (this.f4132b == null) {
            this.f4132b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4133c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1249v) {
                wrapper = (InterfaceC1249v) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f4134d = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = G.f566a;
        AbstractC0046v.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1233e c1233e = (C1233e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c1233e).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c1233e).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f4133c, i2, 0, i3, 0);
        C1233e c1233e = (C1233e) this.f4133c.getLayoutParams();
        int i6 = 0;
        int max = Math.max(0, this.f4133c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1233e).leftMargin + ((ViewGroup.MarginLayoutParams) c1233e).rightMargin);
        int max2 = Math.max(0, this.f4133c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1233e).topMargin + ((ViewGroup.MarginLayoutParams) c1233e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4133c.getMeasuredState());
        Field field = G.f566a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            i6 = this.f4131a;
            if (this.f4138h && this.f4133c.getTabContainer() != null) {
                i6 += this.f4131a;
            }
        } else if (this.f4133c.getVisibility() != 8) {
            i6 = this.f4133c.getMeasuredHeight();
        }
        Rect rect = this.f4142l;
        Rect rect2 = this.f4144n;
        rect2.set(rect);
        Rect rect3 = this.f4147q;
        rect3.set(this.f4145o);
        if (this.f4137g || z) {
            rect3.top += i6;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i6;
            rect2.bottom = rect2.bottom;
        }
        g(this.f4132b, rect2, true);
        Rect rect4 = this.f4148r;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f4132b.a(rect3);
        }
        measureChildWithMargins(this.f4132b, i2, 0, i3, 0);
        C1233e c1233e2 = (C1233e) this.f4132b.getLayoutParams();
        int max3 = Math.max(max, this.f4132b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1233e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1233e2).rightMargin);
        int max4 = Math.max(max2, this.f4132b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1233e2).topMargin + ((ViewGroup.MarginLayoutParams) c1233e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4132b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f6, boolean z) {
        if (!this.f4139i || !z) {
            return false;
        }
        this.f4149s.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4149s.getFinalY() > this.f4133c.getHeight()) {
            h();
            this.f4153w.run();
        } else {
            h();
            this.f4152v.run();
        }
        this.f4140j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i6, int i7) {
        int i8 = this.f4141k + i3;
        this.f4141k = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f4154x.f631b = i2;
        this.f4141k = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f4133c.getVisibility() != 0) {
            return false;
        }
        return this.f4139i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4139i || this.f4140j) {
            return;
        }
        if (this.f4141k <= this.f4133c.getHeight()) {
            h();
            postDelayed(this.f4152v, 600L);
        } else {
            h();
            postDelayed(this.f4153w, 600L);
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
        this.f4133c.setTranslationY(-Math.max(0, Math.min(i2, this.f4133c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1232d interfaceC1232d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f4138h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f4139i) {
            this.f4139i = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        n0 n0Var = (n0) this.f4134d;
        n0Var.f10914d = i2 != 0 ? AbstractC0477a.a(n0Var.f10911a.getContext(), i2) : null;
        n0Var.c();
    }

    public void setLogo(int i2) {
        j();
        n0 n0Var = (n0) this.f4134d;
        n0Var.f10915e = i2 != 0 ? AbstractC0477a.a(n0Var.f10911a.getContext(), i2) : null;
        n0Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.f4137g = z;
        this.f4136f = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((n0) this.f4134d).f10921k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        n0 n0Var = (n0) this.f4134d;
        if (n0Var.f10917g) {
            return;
        }
        n0Var.f10918h = charSequence;
        if ((n0Var.f10912b & 8) != 0) {
            n0Var.f10911a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1233e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        n0 n0Var = (n0) this.f4134d;
        n0Var.f10914d = drawable;
        n0Var.c();
    }

    @Override // E.InterfaceC0040o
    public final void d(int i2, int i3, int[] iArr, int i6) {
    }
}
