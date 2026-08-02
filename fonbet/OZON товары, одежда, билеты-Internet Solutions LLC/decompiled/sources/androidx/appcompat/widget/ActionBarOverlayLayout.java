package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.m;
import androidx.core.view.C5353y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import ru.ozon.app.android.R;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes8.dex */
public class ActionBarOverlayLayout extends ViewGroup implements E, androidx.core.view.A, androidx.core.view.B {

    /* renamed from: C, reason: collision with root package name */
    static final int[] f37551C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    private static final C5353y0 f37552D;

    /* renamed from: E, reason: collision with root package name */
    private static final Rect f37553E;

    /* renamed from: A, reason: collision with root package name */
    private final androidx.core.view.C f37554A;

    /* renamed from: B, reason: collision with root package name */
    private final e f37555B;

    /* renamed from: a, reason: collision with root package name */
    private int f37556a;

    /* renamed from: b, reason: collision with root package name */
    private int f37557b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f37558c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f37559d;

    /* renamed from: e, reason: collision with root package name */
    private F f37560e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f37561f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37562g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37563h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37564i;

    /* renamed from: j, reason: collision with root package name */
    boolean f37565j;

    /* renamed from: k, reason: collision with root package name */
    private int f37566k;

    /* renamed from: l, reason: collision with root package name */
    private int f37567l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f37568m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f37569n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f37570o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f37571p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    private C5353y0 f37572q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    private C5353y0 f37573r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    private C5353y0 f37574s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    private C5353y0 f37575t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.appcompat.app.E f37576u;

    /* renamed from: v, reason: collision with root package name */
    private OverScroller f37577v;

    /* renamed from: w, reason: collision with root package name */
    ViewPropertyAnimator f37578w;

    /* renamed from: x, reason: collision with root package name */
    final AnimatorListenerAdapter f37579x;

    /* renamed from: y, reason: collision with root package name */
    private final Runnable f37580y;

    /* renamed from: z, reason: collision with root package name */
    private final Runnable f37581z;

    final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f37578w = null;
            actionBarOverlayLayout.f37565j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f37578w = null;
            actionBarOverlayLayout.f37565j = false;
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m();
            actionBarOverlayLayout.f37578w = actionBarOverlayLayout.f37559d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f37579x);
        }
    }

    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m();
            actionBarOverlayLayout.f37578w = actionBarOverlayLayout.f37559d.animate().translationY(-actionBarOverlayLayout.f37559d.getHeight()).setListener(actionBarOverlayLayout.f37579x);
        }
    }

    public static class d extends ViewGroup.MarginLayoutParams {
    }

    private static final class e extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        C5353y0.b bVar = new C5353y0.b();
        bVar.d(androidx.core.graphics.d.b(0, 1, 0, 1));
        f37552D = bVar.a();
        f37553E = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37557b = 0;
        this.f37568m = new Rect();
        this.f37569n = new Rect();
        this.f37570o = new Rect();
        this.f37571p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C5353y0 c5353y0 = C5353y0.f42353b;
        this.f37572q = c5353y0;
        this.f37573r = c5353y0;
        this.f37574s = c5353y0;
        this.f37575t = c5353y0;
        this.f37579x = new a();
        this.f37580y = new b();
        this.f37581z = new c();
        n(context);
        this.f37554A = new androidx.core.view.C();
        e eVar = new e(context);
        eVar.setWillNotDraw(true);
        this.f37555B = eVar;
        addView(eVar);
    }

    private static boolean l(@NonNull View view, @NonNull Rect rect, boolean z11) {
        boolean z12;
        d dVar = (d) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i12 = rect.left;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i12;
            z12 = true;
        } else {
            z12 = false;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i14 = rect.top;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i14;
            z12 = true;
        }
        int i15 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i16 = rect.right;
        if (i15 != i16) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i16;
            z12 = true;
        }
        if (z11) {
            int i17 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i18 = rect.bottom;
            if (i17 != i18) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i18;
                return true;
            }
        }
        return z12;
    }

    private void n(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f37551C);
        this.f37556a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f37561f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f37577v = new OverScroller(context);
    }

    @Override // androidx.appcompat.widget.E
    public final boolean a() {
        p();
        return this.f37560e.a();
    }

    @Override // androidx.appcompat.widget.E
    public final boolean b() {
        p();
        return this.f37560e.b();
    }

    @Override // androidx.appcompat.widget.E
    public final boolean c() {
        p();
        return this.f37560e.c();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // androidx.appcompat.widget.E
    public final void d(Window.Callback callback) {
        p();
        this.f37560e.d(callback);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        int i11;
        super.draw(canvas);
        if (this.f37561f != null) {
            if (this.f37559d.getVisibility() == 0) {
                i11 = (int) (this.f37559d.getTranslationY() + this.f37559d.getBottom() + 0.5f);
            } else {
                i11 = 0;
            }
            this.f37561f.setBounds(0, i11, getWidth(), this.f37561f.getIntrinsicHeight() + i11);
            this.f37561f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.E
    public final void e(androidx.appcompat.view.menu.g gVar, m.a aVar) {
        p();
        this.f37560e.e(gVar, aVar);
    }

    @Override // androidx.appcompat.widget.E
    public final boolean f() {
        p();
        return this.f37560e.f();
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.E
    public final void g(CharSequence charSequence) {
        p();
        this.f37560e.g(charSequence);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f37554A.a();
    }

    @Override // androidx.appcompat.widget.E
    public final void h() {
        p();
        this.f37560e.h();
    }

    @Override // androidx.appcompat.widget.E
    public final boolean i() {
        p();
        return this.f37560e.i();
    }

    @Override // androidx.appcompat.widget.E
    public final void j(int i11) {
        p();
        if (i11 == 2) {
            this.f37560e.l();
        } else if (i11 == 5) {
            this.f37560e.r();
        } else {
            if (i11 != 109) {
                return;
            }
            this.f37562g = true;
        }
    }

    @Override // androidx.appcompat.widget.E
    public final void k() {
        p();
        this.f37560e.n();
    }

    final void m() {
        removeCallbacks(this.f37580y);
        removeCallbacks(this.f37581z);
        ViewPropertyAnimator viewPropertyAnimator = this.f37578w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean o() {
        return this.f37562g;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        p();
        C5353y0 u11 = C5353y0.u(this, windowInsets);
        boolean l11 = l(this.f37559d, new Rect(u11.j(), u11.l(), u11.k(), u11.i()), false);
        Rect rect = this.f37568m;
        androidx.core.view.Y.c(this, u11, rect);
        C5353y0 m11 = u11.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f37572q = m11;
        boolean z11 = true;
        if (!this.f37573r.equals(m11)) {
            this.f37573r = this.f37572q;
            l11 = true;
        }
        Rect rect2 = this.f37569n;
        if (rect2.equals(rect)) {
            z11 = l11;
        } else {
            rect2.set(rect);
        }
        if (z11) {
            requestLayout();
        }
        return u11.a().c().b().t();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n(getContext());
        androidx.core.view.Y.A(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i17 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i11, int i12) {
        int measuredHeight;
        p();
        measureChildWithMargins(this.f37559d, i11, 0, i12, 0);
        d dVar = (d) this.f37559d.getLayoutParams();
        int max = Math.max(0, this.f37559d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int max2 = Math.max(0, this.f37559d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f37559d.getMeasuredState());
        int i13 = androidx.core.view.Y.f42258g;
        boolean z11 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z11) {
            measuredHeight = this.f37556a;
            if (this.f37563h) {
                this.f37559d.getClass();
            }
        } else {
            measuredHeight = this.f37559d.getVisibility() != 8 ? this.f37559d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f37568m;
        Rect rect2 = this.f37570o;
        rect2.set(rect);
        this.f37574s = this.f37572q;
        if (!this.f37562g && !z11) {
            e eVar = this.f37555B;
            C5353y0 c5353y0 = f37552D;
            Rect rect3 = this.f37571p;
            androidx.core.view.Y.c(eVar, c5353y0, rect3);
            if (!rect3.equals(f37553E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f37574s = this.f37574s.m(0, measuredHeight, 0, 0);
                l(this.f37558c, rect2, true);
                if (!this.f37575t.equals(this.f37574s)) {
                    C5353y0 c5353y02 = this.f37574s;
                    this.f37575t = c5353y02;
                    androidx.core.view.Y.d(this.f37558c, c5353y02);
                }
                measureChildWithMargins(this.f37558c, i11, 0, i12, 0);
                d dVar2 = (d) this.f37558c.getLayoutParams();
                int max3 = Math.max(max, this.f37558c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
                int max4 = Math.max(max2, this.f37558c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f37558c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i11, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i12, combineMeasuredStates2 << 16));
            }
        }
        androidx.core.graphics.d b11 = androidx.core.graphics.d.b(this.f37574s.j(), this.f37574s.l() + measuredHeight, this.f37574s.k(), this.f37574s.i());
        C5353y0.b bVar = new C5353y0.b(this.f37574s);
        bVar.d(b11);
        this.f37574s = bVar.a();
        l(this.f37558c, rect2, true);
        if (!this.f37575t.equals(this.f37574s)) {
        }
        measureChildWithMargins(this.f37558c, i11, 0, i12, 0);
        d dVar22 = (d) this.f37558c.getLayoutParams();
        int max32 = Math.max(max, this.f37558c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar22).leftMargin + ((ViewGroup.MarginLayoutParams) dVar22).rightMargin);
        int max42 = Math.max(max2, this.f37558c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar22).topMargin + ((ViewGroup.MarginLayoutParams) dVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f37558c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i11, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i12, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f11, boolean z11) {
        if (!this.f37564i || !z11) {
            return false;
        }
        this.f37577v.fling(0, 0, 0, (int) f11, 0, 0, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        if (this.f37577v.getFinalY() > this.f37559d.getHeight()) {
            m();
            ((c) this.f37581z).run();
        } else {
            m();
            ((b) this.f37580y).run();
        }
        this.f37565j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.core.view.B
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        onNestedScroll(view, i11, i12, i13, i14, i15);
    }

    @Override // androidx.core.view.A
    public final void onNestedScrollAccepted(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // androidx.core.view.A
    public final boolean onStartNestedScroll(View view, View view2, int i11, int i12) {
        return i12 == 0 && onStartNestedScroll(view, view2, i11);
    }

    @Override // androidx.core.view.A
    public final void onStopNestedScroll(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i11) {
        super.onWindowSystemUiVisibilityChanged(i11);
        p();
        int i12 = this.f37567l ^ i11;
        this.f37567l = i11;
        boolean z11 = (i11 & 4) == 0;
        boolean z12 = (i11 & 256) != 0;
        androidx.appcompat.app.E e11 = this.f37576u;
        if (e11 != null) {
            e11.w(!z12);
            if (z11 || !z12) {
                this.f37576u.D();
            } else {
                this.f37576u.x();
            }
        }
        if ((i12 & 256) == 0 || this.f37576u == null) {
            return;
        }
        androidx.core.view.Y.A(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f37557b = i11;
        androidx.appcompat.app.E e11 = this.f37576u;
        if (e11 != null) {
            e11.A(i11);
        }
    }

    final void p() {
        F wrapper;
        if (this.f37558c == null) {
            this.f37558c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f37559d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof F) {
                wrapper = (F) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f37560e = wrapper;
        }
    }

    public final void q(androidx.appcompat.app.E e11) {
        this.f37576u = e11;
        if (getWindowToken() != null) {
            this.f37576u.A(this.f37557b);
            int i11 = this.f37567l;
            if (i11 != 0) {
                onWindowSystemUiVisibilityChanged(i11);
                androidx.core.view.Y.A(this);
            }
        }
    }

    public final void r(boolean z11) {
        this.f37563h = z11;
    }

    public final void s(boolean z11) {
        if (z11 != this.f37564i) {
            this.f37564i = z11;
            if (z11) {
                return;
            }
            m();
            m();
            this.f37559d.setTranslationY(-Math.max(0, Math.min(0, this.f37559d.getHeight())));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.A
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr, int i13) {
    }

    @Override // androidx.core.view.A
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            onNestedScroll(view, i11, i12, i13, i14);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f37554A.b(i11);
        ActionBarContainer actionBarContainer = this.f37559d;
        this.f37566k = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        m();
        androidx.appcompat.app.E e11 = this.f37576u;
        if (e11 != null) {
            e11.z();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        if ((i11 & 2) == 0 || this.f37559d.getVisibility() != 0) {
            return false;
        }
        return this.f37564i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f37564i || this.f37565j) {
            return;
        }
        if (this.f37566k <= this.f37559d.getHeight()) {
            m();
            postDelayed(this.f37580y, 600L);
        } else {
            m();
            postDelayed(this.f37581z, 600L);
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        this.f37566k = this.f37566k + i12;
        m();
        this.f37559d.setTranslationY(-Math.max(0, Math.min(r1, this.f37559d.getHeight())));
    }
}
