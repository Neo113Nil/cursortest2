package androidx.core.widget;

import A.v;
import E.H0;
import G4.l;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import n.C2138i;
import n1.AbstractC2176q;
import n1.C;
import n1.C2162c;
import n1.C2173n;
import n1.C2177s;
import n1.D;
import n1.InterfaceC2166g;
import n1.InterfaceC2167h;
import n1.r;
import p1.AbstractC2242a;
import s1.b;
import s1.d;
import s1.e;
import s1.f;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC2167h {

    /* renamed from: M, reason: collision with root package name */
    public static final float f6966M = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: N, reason: collision with root package name */
    public static final d f6967N = new d();

    /* renamed from: O, reason: collision with root package name */
    public static final int[] f6968O = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final int f6969A;

    /* renamed from: B, reason: collision with root package name */
    public final int f6970B;

    /* renamed from: C, reason: collision with root package name */
    public int f6971C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f6972D;

    /* renamed from: E, reason: collision with root package name */
    public final int[] f6973E;

    /* renamed from: F, reason: collision with root package name */
    public int f6974F;

    /* renamed from: G, reason: collision with root package name */
    public int f6975G;

    /* renamed from: H, reason: collision with root package name */
    public f f6976H;

    /* renamed from: I, reason: collision with root package name */
    public final H0 f6977I;
    public final v J;
    public float K;

    /* renamed from: L, reason: collision with root package name */
    public final C2162c f6978L;

    /* renamed from: k, reason: collision with root package name */
    public final float f6979k;

    /* renamed from: l, reason: collision with root package name */
    public long f6980l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f6981m;

    /* renamed from: n, reason: collision with root package name */
    public final OverScroller f6982n;

    /* renamed from: o, reason: collision with root package name */
    public final EdgeEffect f6983o;

    /* renamed from: p, reason: collision with root package name */
    public final EdgeEffect f6984p;

    /* renamed from: q, reason: collision with root package name */
    public C2173n f6985q;

    /* renamed from: r, reason: collision with root package name */
    public int f6986r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6987s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6988t;

    /* renamed from: u, reason: collision with root package name */
    public View f6989u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6990v;

    /* renamed from: w, reason: collision with root package name */
    public VelocityTracker f6991w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6992x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6993y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6994z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, game.betting133.sports1xbet.R.attr.nestedScrollViewStyle);
        this.f6981m = new Rect();
        this.f6987s = true;
        this.f6988t = false;
        this.f6989u = null;
        this.f6990v = false;
        this.f6993y = true;
        this.f6971C = -1;
        this.f6972D = new int[2];
        this.f6973E = new int[2];
        this.f6978L = new C2162c(getContext(), new C2138i(7, this));
        int i = Build.VERSION.SDK_INT;
        this.f6983o = i >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f6984p = i >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f6979k = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f6982n = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6994z = viewConfiguration.getScaledTouchSlop();
        this.f6969A = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6970B = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6968O, game.betting133.sports1xbet.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f6977I = new H0();
        v vVar = new v();
        vVar.f135d = this;
        this.J = vVar;
        setNestedScrollingEnabled(true);
        C.d(this, f6967N);
    }

    private C2173n getScrollFeedbackProvider() {
        if (this.f6985q == null) {
            this.f6985q = new C2173n(this);
        }
        return this.f6985q;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // n1.InterfaceC2166g
    public final void a(View view, View view2, int i, int i5) {
        H0 h02 = this.f6977I;
        if (i5 == 1) {
            h02.f1042b = i;
        } else {
            h02.f1041a = i;
        }
        u(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // n1.InterfaceC2166g
    public final void b(View view, int i) {
        H0 h02 = this.f6977I;
        if (i == 1) {
            h02.f1042b = 0;
        } else {
            h02.f1041a = 0;
        }
        w(i);
    }

    @Override // n1.InterfaceC2167h
    public final void c(NestedScrollView nestedScrollView, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        m(i7, i8, iArr);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        if (this.f6982n.isFinished()) {
            return;
        }
        this.f6982n.computeScrollOffset();
        int currY = this.f6982n.getCurrY();
        int i5 = currY - this.f6975G;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f6984p;
        EdgeEffect edgeEffect2 = this.f6983o;
        if (i5 <= 0 || l.z(edgeEffect2) == 0.0f) {
            if (i5 < 0 && l.z(edgeEffect) != 0.0f) {
                float f = height;
                round = Math.round(l.G(edgeEffect, (i5 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i5) {
                    edgeEffect.finish();
                }
            }
            int i6 = i5;
            this.f6975G = currY;
            int[] iArr = this.f6973E;
            iArr[1] = 0;
            this.J.b(0, i6, 1, iArr, null);
            i = i6 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2242a.a(this, Math.abs(this.f6982n.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                o(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i7 = i - scrollY2;
                iArr[1] = 0;
                this.J.c(0, scrollY2, 0, i7, this.f6972D, 1, iArr);
                i = i7 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f6982n.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f6982n.getCurrVelocity());
                    }
                }
                this.f6982n.abortAnimation();
                w(1);
            }
            if (this.f6982n.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(l.G(edgeEffect2, ((-i5) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i5) {
            edgeEffect2.finish();
        }
        i5 -= round;
        int i62 = i5;
        this.f6975G = currY;
        int[] iArr2 = this.f6973E;
        iArr2[1] = 0;
        this.J.b(0, i62, 1, iArr2, null);
        i = i62 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f6982n.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // n1.InterfaceC2166g
    public final void d(int i, int i5, int[] iArr, int i6) {
        this.J.b(i, i5, i6, iArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f6981m.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z3 = keyEvent.isAltPressed() ? j(33) : e(33);
                        } else if (keyCode == 20) {
                            z3 = keyEvent.isAltPressed() ? j(130) : e(130);
                        } else if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            z3 = j(33);
                        } else if (keyCode == 93) {
                            z3 = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        if (z3) {
                            return false;
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                }
            }
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                    z3 = true;
                    if (z3) {
                    }
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f5, boolean z3) {
        ViewParent e3;
        v vVar = this.J;
        if (vVar.f132a && (e3 = vVar.e(0)) != null) {
            try {
                return e3.onNestedFling((NestedScrollView) vVar.f135d, f, f5, z3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f5) {
        ViewParent e3;
        v vVar = this.J;
        if (vVar.f132a && (e3 = vVar.e(0)) != null) {
            try {
                return e3.onNestedPreFling((NestedScrollView) vVar.f135d, f, f5);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i5, int[] iArr, int[] iArr2) {
        return this.J.b(i, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i5, int i6, int i7, int[] iArr) {
        return this.J.c(i, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f6983o;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i = 0;
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f6984p;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i5 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i5 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final boolean e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f6981m;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(g(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !l(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // n1.InterfaceC2166g
    public final void f(NestedScrollView nestedScrollView, int i, int i5, int i6, int i7, int i8) {
        m(i7, i8, null);
    }

    public final int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
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
        H0 h02 = this.f6977I;
        return h02.f1042b | h02.f1041a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
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
        if (this.K == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.K = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.K;
    }

    public final void h(int i) {
        if (getChildCount() > 0) {
            this.f6982n.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f6975G = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2242a.a(this, Math.abs(this.f6982n.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.J.e(0) != null;
    }

    @Override // n1.InterfaceC2166g
    public final boolean i(View view, View view2, int i, int i5) {
        return (i & 2) != 0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.J.f132a;
    }

    public final boolean j(int i) {
        int childCount;
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f6981m;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i, int i5) {
        Rect rect = this.f6981m;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i5;
    }

    public final void m(int i, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.J.c(0, scrollY2, 0, i - scrollY2, null, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6971C) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f6986r = (int) motionEvent.getY(i);
            this.f6971C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f6991w;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i, int i5, int i6, int i7) {
        int i8;
        boolean z3;
        int i9;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i10 = i6 + i;
        if (i5 <= 0 && i5 >= 0) {
            i8 = i5;
            z3 = false;
        } else {
            i8 = 0;
            z3 = true;
        }
        if (i10 > i7) {
            i9 = i7;
        } else {
            if (i10 >= 0) {
                i9 = i10;
                z5 = false;
                if (z5 && this.J.e(1) == null) {
                    this.f6982n.springBack(i8, i9, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i8, i9);
                return !z3 || z5;
            }
            i9 = 0;
        }
        z5 = true;
        if (z5) {
            this.f6982n.springBack(i8, i9, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i9);
        if (z3) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6988t = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0131, code lost:
    
        if (r6 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00dd, code lost:
    
        if (r7 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int scaledMaximumFlingVelocity;
        boolean z3;
        VelocityTracker velocityTracker;
        float f5;
        float f6;
        long j5;
        float f7;
        float sqrt;
        int i9;
        float f8;
        VelocityTracker velocityTracker2;
        int i10;
        float f9;
        if (motionEvent.getAction() != 8 || this.f6990v) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i5 = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i5 = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            i5 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i5, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            C2162c c2162c = this.f6978L;
            c2162c.getClass();
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i11 = c2162c.f;
            int[] iArr = c2162c.f18422h;
            int i12 = 1;
            if (i11 == source && c2162c.f18421g == deviceId && c2162c.f18420e == i) {
                z3 = false;
                i6 = 20;
                i7 = 0;
            } else {
                Context context = c2162c.f18416a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                i6 = 20;
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i7 = 0;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 34) {
                    Method method = D.f18363a;
                    i8 = AbstractC2176q.f(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = D.f18363a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i8 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i8 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i8 = Integer.MAX_VALUE;
                }
                iArr[0] = i8;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i13 >= 34) {
                    scaledMaximumFlingVelocity = AbstractC2176q.e(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c2162c.f = source;
                c2162c.f18421g = deviceId;
                c2162c.f18420e = i;
                z3 = true;
            }
            if (iArr[i7] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker3 = c2162c.f18418c;
                if (velocityTracker3 == null) {
                    return true;
                }
                velocityTracker3.recycle();
                c2162c.f18418c = null;
                return true;
            }
            if (c2162c.f18418c == null) {
                c2162c.f18418c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c2162c.f18418c;
            Map map = r.f18448a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = r.f18448a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C2177s());
                }
                C2177s c2177s = (C2177s) map2.get(velocityTracker4);
                c2177s.getClass();
                long eventTime = motionEvent.getEventTime();
                int i14 = c2177s.f18452d;
                long[] jArr = c2177s.f18450b;
                if (i14 != 0 && eventTime - jArr[c2177s.f18453e] > 40) {
                    c2177s.f18452d = i7;
                    c2177s.f18451c = 0.0f;
                }
                int i15 = (c2177s.f18453e + 1) % 20;
                c2177s.f18453e = i15;
                int i16 = c2177s.f18452d;
                if (i16 != i6) {
                    c2177s.f18452d = i16 + 1;
                }
                c2177s.f18449a[i15] = motionEvent.getAxisValue(26);
                jArr[c2177s.f18453e] = eventTime;
            }
            float f10 = Float.MAX_VALUE;
            velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C2177s c2177s2 = (C2177s) r.f18448a.get(velocityTracker4);
            if (c2177s2 != null) {
                int i17 = c2177s2.f18452d;
                if (i17 >= 2) {
                    int i18 = c2177s2.f18453e;
                    int i19 = ((i18 + 20) - (i17 - 1)) % 20;
                    long[] jArr2 = c2177s2.f18450b;
                    long j6 = jArr2[i18];
                    while (true) {
                        j5 = jArr2[i19];
                        if (j6 - j5 <= 100) {
                            break;
                        }
                        c2177s2.f18452d--;
                        i19 = (i19 + 1) % 20;
                    }
                    int i20 = c2177s2.f18452d;
                    if (i20 >= 2) {
                        float[] fArr = c2177s2.f18449a;
                        if (i20 == 2) {
                            int i21 = (i19 + 1) % 20;
                            if (j5 != jArr2[i21]) {
                                velocityTracker = velocityTracker4;
                                f7 = Float.MAX_VALUE;
                                i9 = 1000;
                                sqrt = fArr[i21] / (r17 - j5);
                            }
                        } else {
                            float f11 = 0.0f;
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                if (i22 >= c2177s2.f18452d - 1) {
                                    break;
                                }
                                int i24 = i22 + i19;
                                long j7 = jArr2[i24 % 20];
                                int i25 = (i24 + 1) % 20;
                                if (jArr2[i25] == j7) {
                                    velocityTracker2 = velocityTracker4;
                                    f8 = f10;
                                    i10 = i12;
                                } else {
                                    i23++;
                                    f8 = f10;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f11 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
                                    float f12 = fArr[i25] / (jArr2[i25] - j7);
                                    float abs = (Math.abs(f12) * (f12 - sqrt2)) + f11;
                                    i10 = i12;
                                    if (i23 == i10) {
                                        abs *= 0.5f;
                                    }
                                    f11 = abs;
                                }
                                i22 += i10;
                                f10 = f8;
                                i12 = i10;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            f7 = f10;
                            sqrt = ((float) Math.sqrt(Math.abs(f11) * 2.0f)) * (f11 < 0.0f ? -1.0f : 1.0f);
                            i9 = 1000;
                        }
                        f9 = sqrt * i9;
                        c2177s2.f18451c = f9;
                        if (f9 >= (-Math.abs(f7))) {
                            c2177s2.f18451c = -Math.abs(f7);
                        } else if (c2177s2.f18451c > Math.abs(f7)) {
                            c2177s2.f18451c = Math.abs(f7);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                f7 = Float.MAX_VALUE;
                i9 = 1000;
                sqrt = 0.0f;
                f9 = sqrt * i9;
                c2177s2.f18451c = f9;
                if (f9 >= (-Math.abs(f7))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f5 = AbstractC2176q.b(velocityTracker, i);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i == 0) {
                    f5 = velocityTracker5.getXVelocity();
                } else if (i == 1) {
                    f5 = velocityTracker5.getYVelocity();
                } else {
                    C2177s c2177s3 = (C2177s) r.f18448a.get(velocityTracker5);
                    f5 = (c2177s3 == null || i != 26) ? 0.0f : c2177s3.f18451c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c2162c.f18417b.f18249l;
            float f13 = f5 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f13);
            if (z3 || (signum != Math.signum(c2162c.f18419d) && signum != 0.0f)) {
                nestedScrollView.f6982n.abortAnimation();
            }
            if (Math.abs(f13) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f13, iArr[1]));
                if (max == 0.0f) {
                    f6 = 0.0f;
                } else {
                    nestedScrollView.f6982n.abortAnimation();
                    nestedScrollView.h((int) max);
                    f6 = max;
                }
                c2162c.f18419d = f6;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f6990v) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i5 = this.f6971C;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y5 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y5 - this.f6986r) > this.f6994z && (2 & getNestedScrollAxes()) == 0) {
                                this.f6990v = true;
                                this.f6986r = y5;
                                if (this.f6991w == null) {
                                    this.f6991w = VelocityTracker.obtain();
                                }
                                this.f6991w.addMovement(motionEvent);
                                this.f6974F = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f6990v = false;
            this.f6971C = -1;
            VelocityTracker velocityTracker = this.f6991w;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6991w = null;
            }
            if (this.f6982n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y6 = (int) motionEvent.getY();
            int x5 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y6 >= childAt.getTop() - scrollY && y6 < childAt.getBottom() - scrollY && x5 >= childAt.getLeft() && x5 < childAt.getRight()) {
                    this.f6986r = y6;
                    this.f6971C = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f6991w;
                    if (velocityTracker2 == null) {
                        this.f6991w = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f6991w.addMovement(motionEvent);
                    this.f6982n.computeScrollOffset();
                    if (!v(motionEvent) && this.f6982n.isFinished()) {
                        z3 = false;
                    }
                    this.f6990v = z3;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f6982n.isFinished()) {
                z3 = false;
            }
            this.f6990v = z3;
            VelocityTracker velocityTracker3 = this.f6991w;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f6991w = null;
            }
        }
        return this.f6990v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z3, i, i5, i6, i7);
        int i9 = 0;
        this.f6987s = false;
        View view = this.f6989u;
        if (view != null && k(view, this)) {
            View view2 = this.f6989u;
            Rect rect = this.f6981m;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int g5 = g(rect);
            if (g5 != 0) {
                scrollBy(0, g5);
            }
        }
        this.f6989u = null;
        if (!this.f6988t) {
            if (this.f6976H != null) {
                scrollTo(getScrollX(), this.f6976H.f19200k);
                this.f6976H = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i8 = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i8 && scrollY >= 0) {
                i9 = paddingTop + scrollY > i8 ? i8 - paddingTop : scrollY;
            }
            if (i9 != scrollY) {
                scrollTo(getScrollX(), i9);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f6988t = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.f6992x && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f5, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        h((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f5) {
        return dispatchNestedPreFling(f, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
        this.J.b(i, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        m(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i5, boolean z3, boolean z5) {
        super.scrollTo(i, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f6976H = fVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f19200k = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i5, int i6, int i7) {
        super.onScrollChanged(i, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f6981m;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int g5 = g(rect);
        if (g5 != 0) {
            if (this.f6993y) {
                t(0, g5, false);
            } else {
                scrollBy(0, g5);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return i(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float G5;
        int round;
        int i;
        ViewParent parent2;
        if (this.f6991w == null) {
            this.f6991w = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6974F = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.f6974F);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f6984p;
            EdgeEffect edgeEffect2 = this.f6983o;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f6991w;
                velocityTracker.computeCurrentVelocity(1000, this.f6970B);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f6971C);
                if (Math.abs(yVelocity) >= this.f6969A) {
                    if (l.z(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            h(-yVelocity);
                        }
                    } else if (l.z(edgeEffect) != 0.0f) {
                        int i5 = -yVelocity;
                        if (s(edgeEffect, i5)) {
                            edgeEffect.onAbsorb(i5);
                        } else {
                            h(i5);
                        }
                    } else {
                        int i6 = -yVelocity;
                        float f5 = i6;
                        if (!dispatchNestedPreFling(0.0f, f5)) {
                            dispatchNestedFling(0.0f, f5, true);
                            h(i6);
                        }
                    }
                } else if (this.f6982n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6971C = -1;
                this.f6990v = false;
                VelocityTracker velocityTracker2 = this.f6991w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f6991w = null;
                }
                w(0);
                this.f6983o.onRelease();
                this.f6984p.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f6971C);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f6971C + " in onTouchEvent");
                } else {
                    int y5 = (int) motionEvent.getY(findPointerIndex);
                    int i7 = this.f6986r - y5;
                    float x5 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i7 / getHeight();
                    if (l.z(edgeEffect2) != 0.0f) {
                        G5 = -l.G(edgeEffect2, -height, x5);
                        if (l.z(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        if (l.z(edgeEffect) != 0.0f) {
                            G5 = l.G(edgeEffect, height, 1.0f - x5);
                            if (l.z(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i = i7 - round;
                        if (!this.f6990v && Math.abs(i) > this.f6994z) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f6990v = true;
                            i = i <= 0 ? i - this.f6994z : i + this.f6994z;
                        }
                        if (this.f6990v) {
                            int r5 = r(i, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f6986r = y5 - r5;
                            this.f6974F += r5;
                        }
                    }
                    f = G5;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    i = i7 - round;
                    if (!this.f6990v) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f6990v = true;
                        if (i <= 0) {
                        }
                    }
                    if (this.f6990v) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f6990v && getChildCount() > 0 && this.f6982n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6971C = -1;
                this.f6990v = false;
                VelocityTracker velocityTracker3 = this.f6991w;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f6991w = null;
                }
                w(0);
                this.f6983o.onRelease();
                this.f6984p.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f6986r = (int) motionEvent.getY(actionIndex);
                this.f6971C = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f6986r = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f6971C));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f6990v && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f6982n.isFinished()) {
                this.f6982n.abortAnimation();
                w(1);
            }
            int y6 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f6986r = y6;
            this.f6971C = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f6991w;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i) {
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f6981m;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
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
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        q(i, i5, i6);
    }

    public final boolean q(int i, int i5, int i6) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z5 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z7 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i5 < scrollY || i6 > i7) {
            r(z5 ? i5 - scrollY : i6 - i7, -1, null, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(int i, int i5, MotionEvent motionEvent, int i6, int i7, boolean z3) {
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        if (i7 == 1) {
            u(2, i7);
        }
        boolean b3 = this.J.b(0, i, i7, this.f6973E, this.f6972D);
        int[] iArr = this.f6973E;
        int[] iArr2 = this.f6972D;
        if (b3) {
            i8 = i - iArr[1];
            i9 = iArr2[1];
        } else {
            i8 = i;
            i9 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z7 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z8 = o(i8, 0, scrollY, scrollRange) && this.J.e(i7) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f18444a.e(motionEvent.getDeviceId(), motionEvent.getSource(), i5, scrollY2);
        }
        iArr[1] = 0;
        this.J.c(0, scrollY2, 0, i8 - scrollY2, this.f6972D, i7, iArr);
        int i10 = i9 + iArr2[1];
        int i11 = i8 - iArr[1];
        int i12 = scrollY + i11;
        EdgeEffect edgeEffect = this.f6984p;
        EdgeEffect edgeEffect2 = this.f6983o;
        if (i12 < 0) {
            if (z7) {
                l.G(edgeEffect2, (-i11) / getHeight(), i6 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f18444a.b(motionEvent.getDeviceId(), motionEvent.getSource(), i5, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i12 > scrollRange && z7) {
            l.G(edgeEffect, i11 / getHeight(), 1.0f - (i6 / getWidth()));
            if (motionEvent != null) {
                z5 = false;
                getScrollFeedbackProvider().f18444a.b(motionEvent.getDeviceId(), motionEvent.getSource(), i5, false);
            } else {
                z5 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z6 = z5;
            } else {
                z6 = z8;
            }
            if (z6 && i7 == 0 && (velocityTracker = this.f6991w) != null) {
                velocityTracker.clear();
            }
            if (i7 == 1) {
                w(i7);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i10;
        }
        z5 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z6 = z5;
        if (z6) {
            velocityTracker.clear();
        }
        if (i7 == 1) {
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f6987s) {
            this.f6989u = view2;
        } else {
            Rect rect = this.f6981m;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int g5 = g(rect);
            if (g5 != 0) {
                scrollBy(0, g5);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int g5 = g(rect);
        boolean z5 = g5 != 0;
        if (z5) {
            if (z3) {
                scrollBy(0, g5);
                return z5;
            }
            t(0, g5, false);
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f6991w) != null) {
            velocityTracker.recycle();
            this.f6991w = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6987s = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float z3 = l.z(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.f6979k * 0.015f;
        double log = Math.log(abs / f);
        double d5 = f6966M;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * log) * ((double) f))) < z3;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i5);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f6992x) {
            this.f6992x = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        v vVar = this.J;
        if (vVar.f132a) {
            Field field = C.f18360a;
            ((NestedScrollView) vVar.f135d).stopNestedScroll();
        }
        vVar.f132a = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f6993y = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return u(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i, int i5, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f6980l > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f6982n.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z3) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f6975G = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f6982n.isFinished()) {
                this.f6982n.abortAnimation();
                w(1);
            }
            scrollBy(i, i5);
        }
        this.f6980l = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(int i, int i5) {
        boolean onStartNestedScroll;
        v vVar = this.J;
        if (vVar.e(i5) != null) {
            return true;
        }
        if (!vVar.f132a) {
            return false;
        }
        View view = (NestedScrollView) vVar.f135d;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            boolean z3 = parent instanceof InterfaceC2166g;
            if (z3) {
                onStartNestedScroll = ((InterfaceC2166g) parent).i(view2, view, i, i5);
            } else {
                if (i5 == 0) {
                    try {
                        onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                    }
                }
                onStartNestedScroll = false;
            }
            if (onStartNestedScroll) {
                if (i5 == 0) {
                    vVar.f133b = parent;
                } else if (i5 == 1) {
                    vVar.f134c = parent;
                }
                if (z3) {
                    ((InterfaceC2166g) parent).a(view2, view, i, i5);
                } else if (i5 == 0) {
                    try {
                        parent.onNestedScrollAccepted(view2, view, i);
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e5);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view2 = parent;
            }
        }
        return false;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f6983o;
        if (l.z(edgeEffect) != 0.0f) {
            l.G(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f6984p;
        if (l.z(edgeEffect2) == 0.0f) {
            return z3;
        }
        l.G(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        v vVar = this.J;
        ViewParent e3 = vVar.e(i);
        if (e3 != null) {
            boolean z3 = e3 instanceof InterfaceC2166g;
            NestedScrollView nestedScrollView = (NestedScrollView) vVar.f135d;
            if (z3) {
                ((InterfaceC2166g) e3).b(nestedScrollView, i);
            } else if (i == 0) {
                try {
                    e3.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i == 0) {
                vVar.f133b = null;
            } else {
                if (i != 1) {
                    return;
                }
                vVar.f134c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(e eVar) {
    }
}
