package androidx.core.widget;

import D.AbstractC0011l;
import D.AbstractC0012m;
import D.AbstractC0016q;
import D.C;
import D.C0002c;
import D.C0006g;
import D.C0009j;
import D.C0013n;
import D.D;
import D.InterfaceC0008i;
import D.z;
import F2.b;
import H.d;
import H.g;
import H.h;
import H.k;
import J1.i;
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
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0008i {

    /* renamed from: B, reason: collision with root package name */
    public static final float f2118B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final g f2119C = new g();

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2120D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0002c f2121A;

    /* renamed from: a, reason: collision with root package name */
    public final float f2122a;

    /* renamed from: b, reason: collision with root package name */
    public long f2123b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2124c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f2125d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f2126e;
    public final EdgeEffect f;

    /* renamed from: g, reason: collision with root package name */
    public int f2127g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2128h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2129i;

    /* renamed from: j, reason: collision with root package name */
    public View f2130j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2131k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2132l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2133m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2134n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2135o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2136p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2137q;

    /* renamed from: r, reason: collision with root package name */
    public int f2138r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f2139s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2140t;

    /* renamed from: u, reason: collision with root package name */
    public int f2141u;

    /* renamed from: v, reason: collision with root package name */
    public int f2142v;

    /* renamed from: w, reason: collision with root package name */
    public k f2143w;

    /* renamed from: x, reason: collision with root package name */
    public final C0009j f2144x;
    public final C0006g y;

    /* renamed from: z, reason: collision with root package name */
    public float f2145z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.chicken.jump.road.pump.R.attr.nestedScrollViewStyle);
        this.f2124c = new Rect();
        this.f2128h = true;
        this.f2129i = false;
        this.f2130j = null;
        this.f2131k = false;
        this.f2134n = true;
        this.f2138r = -1;
        this.f2139s = new int[2];
        this.f2140t = new int[2];
        this.f2121A = new C0002c(getContext(), new i(2, this));
        int i3 = Build.VERSION.SDK_INT;
        this.f2126e = i3 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f = i3 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f2122a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2125d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2135o = viewConfiguration.getScaledTouchSlop();
        this.f2136p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2137q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2120D, com.chicken.jump.road.pump.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2144x = new C0009j();
        this.y = new C0006g(this);
        setNestedScrollingEnabled(true);
        z.a(this, f2119C);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // D.InterfaceC0007h
    public final void a(View view, View view2, int i3, int i4) {
        C0009j c0009j = this.f2144x;
        if (i4 == 1) {
            c0009j.f246c = i3;
        } else {
            c0009j.f245b = i3;
        }
        u(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // D.InterfaceC0007h
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        m(i6, i7, null);
    }

    @Override // D.InterfaceC0007h
    public final void c(View view, int i3) {
        C0009j c0009j = this.f2144x;
        if (i3 == 1) {
            c0009j.f246c = 0;
        } else {
            c0009j.f245b = 0;
        }
        w(i3);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i3;
        if (this.f2125d.isFinished()) {
            return;
        }
        this.f2125d.computeScrollOffset();
        int currY = this.f2125d.getCurrY();
        int i4 = currY - this.f2142v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.f2126e;
        if (i4 <= 0 || b.w(edgeEffect2) == 0.0f) {
            if (i4 < 0 && b.w(edgeEffect) != 0.0f) {
                float f = height;
                round = Math.round(b.C(edgeEffect, (i4 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i4) {
                    edgeEffect.finish();
                }
            }
            int i5 = i4;
            this.f2142v = currY;
            int[] iArr = this.f2140t;
            iArr[1] = 0;
            this.y.c(0, i5, iArr, null, 1);
            i3 = i5 - iArr[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                o(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i3 - scrollY2;
                iArr[1] = 0;
                this.y.d(0, scrollY2, 0, i6, this.f2139s, 1, iArr);
                i3 = i6 - iArr[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f2125d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f2125d.getCurrVelocity());
                    }
                }
                this.f2125d.abortAnimation();
                w(1);
            }
            if (this.f2125d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(b.C(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i4) {
            edgeEffect2.finish();
        }
        i4 -= round;
        int i52 = i4;
        this.f2142v = currY;
        int[] iArr2 = this.f2140t;
        iArr2[1] = 0;
        this.y.c(0, i52, iArr2, null, 1);
        i3 = i52 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i3 != 0) {
        }
        if (i3 != 0) {
        }
        if (this.f2125d.isFinished()) {
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

    @Override // D.InterfaceC0007h
    public final void d(int i3, int i4, int[] iArr, int i5) {
        this.y.c(i3, i4, iArr, null, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f2124c.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z3 = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode == 20) {
                            z3 = keyEvent.isAltPressed() ? j(130) : g(130);
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
    public final boolean dispatchNestedFling(float f, float f3, boolean z3) {
        return this.y.a(f, f3, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return this.y.b(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.y.c(i3, i4, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.y.d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2126e;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (h.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (h.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (h.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i4 = getPaddingLeft();
        }
        if (h.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i4 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // D.InterfaceC0008i
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m(i6, i7, iArr);
    }

    @Override // D.InterfaceC0007h
    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f2124c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i3);
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
        C0009j c0009j = this.f2144x;
        return c0009j.f246c | c0009j.f245b;
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
        if (this.f2145z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2145z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2145z;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.y.f(0);
    }

    public final void i(int i3) {
        if (getChildCount() > 0) {
            this.f2125d.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f2142v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.y.f242d;
    }

    public final boolean j(int i3) {
        int childCount;
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f2124c;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i4) {
        Rect rect = this.f2124c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4;
    }

    public final void m(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2138r) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f2127g = (int) motionEvent.getY(i3);
            this.f2138r = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f2132l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i4, int i5, int i6) {
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            i7 = i4;
            z3 = false;
        } else {
            i7 = 0;
            z3 = true;
        }
        if (i9 > i6) {
            i8 = i6;
        } else {
            if (i9 >= 0) {
                i8 = i9;
                z4 = false;
                if (z4 && !this.y.f(1)) {
                    this.f2125d.springBack(i7, i8, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i7, i8);
                return !z3 || z4;
            }
            i8 = 0;
        }
        z4 = true;
        if (z4) {
            this.f2125d.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        if (z3) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2129i = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x012b, code lost:
    
        if (r2 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d7, code lost:
    
        if (r2 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int scaledMaximumFlingVelocity;
        boolean z3;
        VelocityTracker velocityTracker;
        float f3;
        float f4;
        long j3;
        float f5;
        float sqrt;
        int i8;
        float f6;
        VelocityTracker velocityTracker2;
        int i9;
        float f7;
        if (motionEvent.getAction() != 8 || this.f2131k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i3 = 9;
            f = motionEvent.getAxisValue(9);
            i4 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f = motionEvent.getAxisValue(26);
            i4 = getWidth() / 2;
            i3 = 26;
        } else {
            f = 0.0f;
            i3 = 0;
            i4 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f)), i4, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 == 0) {
            return true;
        }
        C0002c c0002c = this.f2121A;
        c0002c.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i10 = c0002c.f;
        int[] iArr = c0002c.f237h;
        int i11 = 1;
        if (i10 == source && c0002c.f236g == deviceId && c0002c.f235e == i3) {
            z3 = false;
            i5 = 20;
            i6 = 0;
        } else {
            Context context = c0002c.f231a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i5 = 20;
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i6 = 0;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 34) {
                Method method = D.f196a;
                i7 = C.b(viewConfiguration, deviceId2, i3, source2);
            } else {
                Method method2 = D.f196a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i3, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i7 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i7 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i7 = Integer.MAX_VALUE;
            }
            iArr[0] = i7;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i12 >= 34) {
                scaledMaximumFlingVelocity = C.a(viewConfiguration, deviceId3, i3, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i3, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
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
            c0002c.f = source;
            c0002c.f236g = deviceId;
            c0002c.f235e = i3;
            z3 = true;
        }
        if (iArr[i6] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0002c.f233c;
            if (velocityTracker3 == null) {
                return true;
            }
            velocityTracker3.recycle();
            c0002c.f233c = null;
            return true;
        }
        if (c0002c.f233c == null) {
            c0002c.f233c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker4 = c0002c.f233c;
        Map map = AbstractC0012m.f247a;
        velocityTracker4.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0012m.f247a;
            if (!map2.containsKey(velocityTracker4)) {
                map2.put(velocityTracker4, new C0013n());
            }
            C0013n c0013n = (C0013n) map2.get(velocityTracker4);
            c0013n.getClass();
            long eventTime = motionEvent.getEventTime();
            int i13 = c0013n.f251d;
            long[] jArr = c0013n.f249b;
            if (i13 != 0 && eventTime - jArr[c0013n.f252e] > 40) {
                c0013n.f251d = i6;
                c0013n.f250c = 0.0f;
            }
            int i14 = (c0013n.f252e + 1) % 20;
            c0013n.f252e = i14;
            int i15 = c0013n.f251d;
            if (i15 != i5) {
                c0013n.f251d = i15 + 1;
            }
            c0013n.f248a[i14] = motionEvent.getAxisValue(26);
            jArr[c0013n.f252e] = eventTime;
        }
        float f8 = Float.MAX_VALUE;
        velocityTracker4.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, Float.MAX_VALUE);
        C0013n c0013n2 = (C0013n) AbstractC0012m.f247a.get(velocityTracker4);
        if (c0013n2 != null) {
            int i16 = c0013n2.f251d;
            if (i16 >= 2) {
                int i17 = c0013n2.f252e;
                int i18 = ((i17 + 20) - (i16 - 1)) % 20;
                long[] jArr2 = c0013n2.f249b;
                long j4 = jArr2[i17];
                while (true) {
                    j3 = jArr2[i18];
                    if (j4 - j3 <= 100) {
                        break;
                    }
                    c0013n2.f251d--;
                    i18 = (i18 + 1) % 20;
                }
                int i19 = c0013n2.f251d;
                if (i19 >= 2) {
                    float[] fArr = c0013n2.f248a;
                    if (i19 == 2) {
                        int i20 = (i18 + 1) % 20;
                        if (j3 != jArr2[i20]) {
                            velocityTracker = velocityTracker4;
                            f5 = Float.MAX_VALUE;
                            i8 = 1000;
                            sqrt = fArr[i20] / (r17 - j3);
                        }
                    } else {
                        float f9 = 0.0f;
                        int i21 = 0;
                        int i22 = 0;
                        while (true) {
                            if (i21 >= c0013n2.f251d - 1) {
                                break;
                            }
                            int i23 = i21 + i18;
                            long j5 = jArr2[i23 % 20];
                            int i24 = (i23 + 1) % 20;
                            if (jArr2[i24] == j5) {
                                velocityTracker2 = velocityTracker4;
                                f6 = f8;
                                i9 = i11;
                            } else {
                                i22++;
                                f6 = f8;
                                velocityTracker2 = velocityTracker4;
                                float sqrt2 = (f9 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                                float f10 = fArr[i24] / (jArr2[i24] - j5);
                                float abs = (Math.abs(f10) * (f10 - sqrt2)) + f9;
                                i9 = i11;
                                if (i22 == i9) {
                                    abs *= 0.5f;
                                }
                                f9 = abs;
                            }
                            i21 += i9;
                            f8 = f6;
                            i11 = i9;
                            velocityTracker4 = velocityTracker2;
                        }
                        velocityTracker = velocityTracker4;
                        f5 = f8;
                        sqrt = ((float) Math.sqrt(Math.abs(f9) * 2.0f)) * (f9 < 0.0f ? -1.0f : 1.0f);
                        i8 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                    }
                    f7 = sqrt * i8;
                    c0013n2.f250c = f7;
                    if (f7 >= (-Math.abs(f5))) {
                        c0013n2.f250c = -Math.abs(f5);
                    } else if (c0013n2.f250c > Math.abs(f5)) {
                        c0013n2.f250c = Math.abs(f5);
                    }
                }
            }
            velocityTracker = velocityTracker4;
            f5 = Float.MAX_VALUE;
            i8 = 1000;
            sqrt = 0.0f;
            f7 = sqrt * i8;
            c0013n2.f250c = f7;
            if (f7 >= (-Math.abs(f5))) {
            }
        } else {
            velocityTracker = velocityTracker4;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f3 = AbstractC0011l.a(velocityTracker, i3);
        } else {
            VelocityTracker velocityTracker5 = velocityTracker;
            if (i3 == 0) {
                f3 = velocityTracker5.getXVelocity();
            } else if (i3 == 1) {
                f3 = velocityTracker5.getYVelocity();
            } else {
                C0013n c0013n3 = (C0013n) AbstractC0012m.f247a.get(velocityTracker5);
                f3 = (c0013n3 == null || i3 != 26) ? 0.0f : c0013n3.f250c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0002c.f232b.f729b;
        float f11 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
        float signum = Math.signum(f11);
        if (z3 || (signum != Math.signum(c0002c.f234d) && signum != 0.0f)) {
            nestedScrollView.f2125d.abortAnimation();
        }
        if (Math.abs(f11) < iArr[0]) {
            return true;
        }
        float max = Math.max(-r3, Math.min(f11, iArr[1]));
        if (max == 0.0f) {
            f4 = 0.0f;
        } else {
            nestedScrollView.f2125d.abortAnimation();
            nestedScrollView.i((int) max);
            f4 = max;
        }
        c0002c.f234d = f4;
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f2131k) {
            return true;
        }
        int i3 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = this.f2138r;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2127g) > this.f2135o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2131k = true;
                                this.f2127g = y;
                                if (this.f2132l == null) {
                                    this.f2132l = VelocityTracker.obtain();
                                }
                                this.f2132l.addMovement(motionEvent);
                                this.f2141u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i3 != 3) {
                    if (i3 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f2131k = false;
            this.f2138r = -1;
            VelocityTracker velocityTracker = this.f2132l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2132l = null;
            }
            if (this.f2125d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f2127g = y3;
                    this.f2138r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f2132l;
                    if (velocityTracker2 == null) {
                        this.f2132l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2132l.addMovement(motionEvent);
                    this.f2125d.computeScrollOffset();
                    if (!v(motionEvent) && this.f2125d.isFinished()) {
                        z3 = false;
                    }
                    this.f2131k = z3;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f2125d.isFinished()) {
                z3 = false;
            }
            this.f2131k = z3;
            VelocityTracker velocityTracker3 = this.f2132l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2132l = null;
            }
        }
        return this.f2131k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i3, i4, i5, i6);
        int i8 = 0;
        this.f2128h = false;
        View view = this.f2130j;
        if (view != null && k(view, this)) {
            View view2 = this.f2130j;
            Rect rect = this.f2124c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        this.f2130j = null;
        if (!this.f2129i) {
            if (this.f2143w != null) {
                scrollTo(getScrollX(), this.f2143w.f479a);
                this.f2143w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2129i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f2133m && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f3, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        i((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f3) {
        return this.y.b(f, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.y.c(i3, i4, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f2143w = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f479a = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f2124c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h3 = h(rect);
        if (h3 != 0) {
            if (this.f2134n) {
                t(0, h3, false);
            } else {
                scrollBy(0, h3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f2132l == null) {
            this.f2132l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2141u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.f2141u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f;
            EdgeEffect edgeEffect2 = this.f2126e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2132l;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.f2137q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2138r);
                if (Math.abs(yVelocity) >= this.f2136p) {
                    if (b.w(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (b.w(edgeEffect) != 0.0f) {
                        int i3 = -yVelocity;
                        if (s(edgeEffect, i3)) {
                            edgeEffect.onAbsorb(i3);
                        } else {
                            i(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f3 = i4;
                        if (!this.y.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            i(i4);
                        }
                    }
                } else if (this.f2125d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2138r = -1;
                this.f2131k = false;
                VelocityTracker velocityTracker2 = this.f2132l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2132l = null;
                }
                w(0);
                this.f2126e.onRelease();
                this.f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2138r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2138r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f2127g - y;
                    float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (b.w(edgeEffect2) != 0.0f) {
                        float f4 = -b.C(edgeEffect2, -height, x3);
                        if (b.w(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f4;
                    } else if (b.w(edgeEffect) != 0.0f) {
                        float C2 = b.C(edgeEffect, height, 1.0f - x3);
                        if (b.w(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = C2;
                    }
                    int round = Math.round(f * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i6 = i5 - round;
                    if (!this.f2131k && Math.abs(i6) > this.f2135o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2131k = true;
                        i6 = i6 > 0 ? i6 - this.f2135o : i6 + this.f2135o;
                    }
                    if (this.f2131k) {
                        int r3 = r(i6, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f2127g = y - r3;
                        this.f2141u += r3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2131k && getChildCount() > 0 && this.f2125d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2138r = -1;
                this.f2131k = false;
                VelocityTracker velocityTracker3 = this.f2132l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2132l = null;
                }
                w(0);
                this.f2126e.onRelease();
                this.f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2127g = (int) motionEvent.getY(actionIndex);
                this.f2138r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f2127g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2138r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2131k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2125d.isFinished()) {
                this.f2125d.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f2127g = y3;
            this.f2138r = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2132l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f2124c;
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
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        q(i3, i4, i5);
    }

    public final boolean q(int i3, int i4, int i5) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z4 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z7) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i5 > i6) {
            r(z4 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i3);
        }
        return z3;
    }

    public final int r(int i3, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        boolean z4;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            u(2, i5);
        }
        boolean c3 = this.y.c(0, i3, this.f2140t, this.f2139s, i5);
        int[] iArr = this.f2140t;
        int[] iArr2 = this.f2139s;
        if (c3) {
            i6 = i3 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i3;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z5 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z6 = o(i6, 0, scrollY, scrollRange) && !this.y.f(i5);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.y.d(0, scrollY2, 0, i6 - scrollY2, this.f2139s, i5, iArr);
        int i8 = i7 + iArr2[1];
        int i9 = i6 - iArr[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.f2126e;
        if (i10 < 0) {
            if (z5) {
                b.C(edgeEffect2, (-i9) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z5) {
            b.C(edgeEffect, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z4 = z6;
        } else {
            postInvalidateOnAnimation();
            z4 = false;
        }
        if (z4 && i5 == 0 && (velocityTracker = this.f2132l) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            w(i5);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f2128h) {
            this.f2130j = view2;
        } else {
            Rect rect = this.f2124c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h3 = h(rect);
        boolean z4 = h3 != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, h3);
                return z4;
            }
            t(0, h3, false);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f2132l) != null) {
            velocityTracker.recycle();
            this.f2132l = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2128h = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float w3 = b.w(edgeEffect) * getHeight();
        float abs = Math.abs(-i3) * 0.35f;
        float f = this.f2122a * 0.015f;
        double log = Math.log(abs / f);
        double d3 = f2118B;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * log) * ((double) f))) < w3;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f2133m) {
            this.f2133m = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0006g c0006g = this.y;
        if (c0006g.f242d) {
            Field field = z.f259a;
            AbstractC0016q.z(c0006g.f241c);
        }
        c0006g.f242d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f2134n = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.y.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i3, int i4, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2123b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2125d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z3) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f2142v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2125d.isFinished()) {
                this.f2125d.abortAnimation();
                w(1);
            }
            scrollBy(i3, i4);
        }
        this.f2123b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i3, int i4) {
        this.y.g(2, i4);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2126e;
        if (b.w(edgeEffect) != 0.0f) {
            b.C(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (b.w(edgeEffect2) == 0.0f) {
            return z3;
        }
        b.C(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i3) {
        this.y.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
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
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(H.i iVar) {
    }
}
