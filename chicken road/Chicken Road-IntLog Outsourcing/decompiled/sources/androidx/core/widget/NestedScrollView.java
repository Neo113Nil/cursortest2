package androidx.core.widget;

import E.AbstractC0043s;
import E.AbstractC0044t;
import E.AbstractC0048x;
import E.C0029d;
import E.C0039n;
import E.C0042q;
import E.C0045u;
import E.G;
import E.InterfaceC0041p;
import E.J;
import E.K;
import I.d;
import I.g;
import I.h;
import I.i;
import I.j;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0041p {

    /* renamed from: B, reason: collision with root package name */
    public static final float f4318B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final g f4319C = new g();

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f4320D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0029d f4321A;

    /* renamed from: a, reason: collision with root package name */
    public final float f4322a;

    /* renamed from: b, reason: collision with root package name */
    public long f4323b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4324c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f4325d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f4326e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f4327f;

    /* renamed from: g, reason: collision with root package name */
    public int f4328g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4329h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4330i;

    /* renamed from: j, reason: collision with root package name */
    public View f4331j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4332k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f4333l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4334m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4335n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4336o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4337p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4338q;

    /* renamed from: r, reason: collision with root package name */
    public int f4339r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f4340s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f4341t;

    /* renamed from: u, reason: collision with root package name */
    public int f4342u;

    /* renamed from: v, reason: collision with root package name */
    public int f4343v;

    /* renamed from: w, reason: collision with root package name */
    public j f4344w;

    /* renamed from: x, reason: collision with root package name */
    public final C0042q f4345x;

    /* renamed from: y, reason: collision with root package name */
    public final C0039n f4346y;
    public float z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.chickyneer.roadway.R.attr.nestedScrollViewStyle);
        this.f4324c = new Rect();
        this.f4329h = true;
        this.f4330i = false;
        this.f4331j = null;
        this.f4332k = false;
        this.f4335n = true;
        this.f4339r = -1;
        this.f4340s = new int[2];
        this.f4341t = new int[2];
        this.f4321A = new C0029d(getContext(), new B1.g(18, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f4326e = i2 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f4327f = i2 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f4322a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4325d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4336o = viewConfiguration.getScaledTouchSlop();
        this.f4337p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4338q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4320D, com.chickyneer.roadway.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4345x = new C0042q(0);
        this.f4346y = new C0039n(this);
        setNestedScrollingEnabled(true);
        G.a(this, f4319C);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // E.InterfaceC0040o
    public final void a(View view, View view2, int i2, int i3) {
        C0042q c0042q = this.f4345x;
        if (i3 == 1) {
            c0042q.f632c = i2;
        } else {
            c0042q.f631b = i2;
        }
        u(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // E.InterfaceC0040o
    public final void b(ViewGroup viewGroup, int i2, int i3, int i6, int i7, int i8) {
        m(i7, i8, null);
    }

    @Override // E.InterfaceC0040o
    public final void c(View view, int i2) {
        C0042q c0042q = this.f4345x;
        if (i2 == 1) {
            c0042q.f632c = 0;
        } else {
            c0042q.f631b = 0;
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
        if (this.f4325d.isFinished()) {
            return;
        }
        this.f4325d.computeScrollOffset();
        int currY = this.f4325d.getCurrY();
        int i3 = currY - this.f4343v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f4327f;
        EdgeEffect edgeEffect2 = this.f4326e;
        if (i3 <= 0 || AbstractC1341c.o(edgeEffect2) == 0.0f) {
            if (i3 < 0 && AbstractC1341c.o(edgeEffect) != 0.0f) {
                float f3 = height;
                round = Math.round(AbstractC1341c.y(edgeEffect, (i3 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (round != i3) {
                    edgeEffect.finish();
                }
            }
            this.f4343v = currY;
            int[] iArr = this.f4341t;
            iArr[1] = 0;
            this.f4346y.c(0, i3, iArr, null, 1);
            i2 = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                o(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i2 - scrollY2;
                iArr[1] = 0;
                this.f4346y.d(0, scrollY2, 0, i6, this.f4340s, 1, iArr);
                i2 = i6 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f4325d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f4325d.getCurrVelocity());
                    }
                }
                this.f4325d.abortAnimation();
                w(1);
            }
            if (this.f4325d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC1341c.y(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i3) {
            edgeEffect2.finish();
        }
        i3 -= round;
        this.f4343v = currY;
        int[] iArr2 = this.f4341t;
        iArr2[1] = 0;
        this.f4346y.c(0, i3, iArr2, null, 1);
        i2 = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.f4325d.isFinished()) {
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
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // E.InterfaceC0040o
    public final void d(int i2, int i3, int[] iArr, int i6) {
        this.f4346y.c(i2, i3, iArr, null, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f4324c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        z = keyEvent.isAltPressed() ? j(33) : g(33);
                    } else if (keyCode == 20) {
                        z = keyEvent.isAltPressed() ? j(130) : g(130);
                    } else if (keyCode == 62) {
                        p(keyEvent.isShiftPressed() ? 33 : 130);
                    } else if (keyCode == 92) {
                        z = j(33);
                    } else if (keyCode == 93) {
                        z = j(130);
                    } else if (keyCode == 122) {
                        p(33);
                    } else if (keyCode == 123) {
                        p(130);
                    }
                    return !z;
                }
                z = false;
                if (!z) {
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
                z = true;
                if (!z) {
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f6, boolean z) {
        return this.f4346y.a(f3, f6, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f6) {
        return this.f4346y.b(f3, f6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f4346y.c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i6, int i7, int[] iArr) {
        return this.f4346y.d(i2, i3, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4326e;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (h.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (h.a(this)) {
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
        EdgeEffect edgeEffect2 = this.f4327f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (h.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = getPaddingLeft();
        }
        if (h.a(this)) {
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

    @Override // E.InterfaceC0041p
    public final void e(ViewGroup viewGroup, int i2, int i3, int i6, int i7, int i8, int[] iArr) {
        m(i7, i8, iArr);
    }

    @Override // E.InterfaceC0040o
    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f4324c;
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
        C0042q c0042q = this.f4345x;
        return c0042q.f632c | c0042q.f631b;
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
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.z;
    }

    public final int h(Rect rect) {
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
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i6 = rect.bottom;
        if (i6 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i6 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4346y.f(0);
    }

    public final void i(int i2) {
        if (getChildCount() > 0) {
            this.f4325d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f4343v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4346y.f628d;
    }

    public final boolean j(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f4324c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i2, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i2, int i3) {
        Rect rect = this.f4324c;
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
        this.f4346y.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4339r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f4328g = (int) motionEvent.getY(i2);
            this.f4339r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f4333l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i2, int i3, int i6, int i7) {
        boolean z;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i6 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        if (i8 <= i7) {
            if (i8 >= 0) {
                i7 = i8;
                z5 = false;
                if (z5 && !this.f4346y.f(1)) {
                    this.f4325d.springBack(i3, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i3, i7);
                return z || z5;
            }
            i7 = 0;
        }
        z5 = true;
        if (z5) {
            this.f4325d.springBack(i3, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i7);
        if (z) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4330i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        int i2;
        int i3;
        char c2;
        int i6;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c6;
        boolean z;
        VelocityTracker velocityTracker;
        float f6;
        float f7;
        long j2;
        float sqrt;
        int i7;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i8;
        float f8;
        if (motionEvent.getAction() != 8 || this.f4332k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i2 = 9;
            f3 = motionEvent.getAxisValue(9);
            i3 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f3 = motionEvent.getAxisValue(26);
            i3 = getWidth() / 2;
            i2 = 26;
        } else {
            f3 = 0.0f;
            i2 = 0;
            i3 = 0;
        }
        if (f3 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f3)), i3, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        C0029d c0029d = this.f4321A;
        c0029d.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i9 = c0029d.f609f;
        int[] iArr = c0029d.f611h;
        if (i9 == source && c0029d.f610g == deviceId && c0029d.f608e == i2) {
            c6 = 0;
            z = false;
        } else {
            Context context = c0029d.f604a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                Method method = K.f568a;
                i6 = J.b(viewConfiguration, deviceId2, i2, source2);
            } else {
                Method method2 = K.f568a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i2, source2) == null) {
                    c2 = 0;
                    i6 = Integer.MAX_VALUE;
                    iArr[c2] = i6;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i10 < 34) {
                        scaledMaximumFlingVelocity = J.a(viewConfiguration, deviceId3, i2, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        int i11 = Integer.MIN_VALUE;
                        if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                i11 = dimensionPixelSize;
                            }
                        }
                        scaledMaximumFlingVelocity = i11;
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0029d.f609f = source;
                    c0029d.f610g = deviceId;
                    c0029d.f608e = i2;
                    c6 = 0;
                    z = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        i6 = Integer.MAX_VALUE;
                    }
                    i6 = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = i6;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i10 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0029d.f609f = source;
            c0029d.f610g = deviceId;
            c0029d.f608e = i2;
            c6 = 0;
            z = true;
        }
        if (iArr[c6] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0029d.f606c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0029d.f606c = null;
            }
        } else {
            if (c0029d.f606c == null) {
                c0029d.f606c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0029d.f606c;
            Map map = AbstractC0044t.f633a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0044t.f633a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C0045u());
                }
                C0045u c0045u = (C0045u) map2.get(velocityTracker4);
                c0045u.getClass();
                long eventTime = motionEvent.getEventTime();
                int i12 = c0045u.f637d;
                long[] jArr = c0045u.f635b;
                if (i12 != 0 && eventTime - jArr[c0045u.f638e] > 40) {
                    c0045u.f637d = 0;
                    c0045u.f636c = 0.0f;
                }
                int i13 = (c0045u.f638e + 1) % 20;
                c0045u.f638e = i13;
                int i14 = c0045u.f637d;
                if (i14 != 20) {
                    c0045u.f637d = i14 + 1;
                }
                c0045u.f634a[i13] = motionEvent.getAxisValue(26);
                jArr[c0045u.f638e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, Float.MAX_VALUE);
            C0045u c0045u2 = (C0045u) AbstractC0044t.f633a.get(velocityTracker4);
            if (c0045u2 != null) {
                int i15 = c0045u2.f637d;
                if (i15 >= 2) {
                    int i16 = c0045u2.f638e;
                    int i17 = ((i16 + 20) - (i15 - 1)) % 20;
                    long[] jArr2 = c0045u2.f635b;
                    long j6 = jArr2[i16];
                    while (true) {
                        j2 = jArr2[i17];
                        if (j6 - j2 <= 100) {
                            break;
                        }
                        c0045u2.f637d--;
                        i17 = (i17 + 1) % 20;
                    }
                    int i18 = c0045u2.f637d;
                    if (i18 >= 2) {
                        float[] fArr2 = c0045u2.f634a;
                        if (i18 == 2) {
                            int i19 = (i17 + 1) % 20;
                            if (j2 != jArr2[i19]) {
                                velocityTracker = velocityTracker4;
                                i7 = 1000;
                                sqrt = fArr2[i19] / (r8 - j2);
                            }
                        } else {
                            float f9 = 0.0f;
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                if (i20 >= c0045u2.f637d - 1) {
                                    break;
                                }
                                int i22 = i20 + i17;
                                long j7 = jArr2[i22 % 20];
                                int i23 = (i22 + 1) % 20;
                                if (jArr2[i23] == j7) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i8 = 1;
                                } else {
                                    i21++;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f9 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                                    float f10 = fArr2[i23];
                                    long j8 = jArr2[i23];
                                    fArr = fArr2;
                                    float f11 = f10 / (j8 - j7);
                                    float abs = (Math.abs(f11) * (f11 - sqrt2)) + f9;
                                    i8 = 1;
                                    if (i21 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f9 = abs;
                                }
                                i20 += i8;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            sqrt = ((float) Math.sqrt(Math.abs(f9) * 2.0f)) * (f9 < 0.0f ? -1.0f : 1.0f);
                            i7 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                        }
                        f8 = sqrt * i7;
                        c0045u2.f636c = f8;
                        if (f8 >= (-Math.abs(Float.MAX_VALUE))) {
                            c0045u2.f636c = -Math.abs(Float.MAX_VALUE);
                        } else if (c0045u2.f636c > Math.abs(Float.MAX_VALUE)) {
                            c0045u2.f636c = Math.abs(Float.MAX_VALUE);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                i7 = 1000;
                sqrt = 0.0f;
                f8 = sqrt * i7;
                c0045u2.f636c = f8;
                if (f8 >= (-Math.abs(Float.MAX_VALUE))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f6 = AbstractC0043s.a(velocityTracker, i2);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i2 == 0) {
                    f6 = velocityTracker5.getXVelocity();
                } else if (i2 == 1) {
                    f6 = velocityTracker5.getYVelocity();
                } else {
                    C0045u c0045u3 = (C0045u) AbstractC0044t.f633a.get(velocityTracker5);
                    f6 = (c0045u3 == null || i2 != 26) ? 0.0f : c0045u3.f636c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0029d.f605b.f215b;
            float f12 = f6 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f12);
            if (z || (signum != Math.signum(c0029d.f607d) && signum != 0.0f)) {
                nestedScrollView.f4325d.abortAnimation();
            }
            if (Math.abs(f12) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f12, iArr[1]));
                if (max == 0.0f) {
                    f7 = 0.0f;
                } else {
                    nestedScrollView.f4325d.abortAnimation();
                    nestedScrollView.i((int) max);
                    f7 = max;
                }
                c0029d.f607d = f7;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f4332k) {
            return true;
        }
        int i2 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f4339r;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y5 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y5 - this.f4328g) > this.f4336o && (2 & getNestedScrollAxes()) == 0) {
                                this.f4332k = true;
                                this.f4328g = y5;
                                if (this.f4333l == null) {
                                    this.f4333l = VelocityTracker.obtain();
                                }
                                this.f4333l.addMovement(motionEvent);
                                this.f4342u = 0;
                                ViewParent parent = getParent();
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
            this.f4332k = false;
            this.f4339r = -1;
            VelocityTracker velocityTracker = this.f4333l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4333l = null;
            }
            if (this.f4325d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
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
                    this.f4328g = y6;
                    this.f4339r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f4333l;
                    if (velocityTracker2 == null) {
                        this.f4333l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4333l.addMovement(motionEvent);
                    this.f4325d.computeScrollOffset();
                    if (!v(motionEvent) && this.f4325d.isFinished()) {
                        z = false;
                    }
                    this.f4332k = z;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f4325d.isFinished()) {
                z = false;
            }
            this.f4332k = z;
            VelocityTracker velocityTracker3 = this.f4333l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4333l = null;
            }
        }
        return this.f4332k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int i8;
        super.onLayout(z, i2, i3, i6, i7);
        int i9 = 0;
        this.f4329h = false;
        View view = this.f4331j;
        if (view != null && k(view, this)) {
            View view2 = this.f4331j;
            Rect rect = this.f4324c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        this.f4331j = null;
        if (!this.f4330i) {
            if (this.f4344w != null) {
                scrollTo(getScrollX(), this.f4344w.f1240a);
                this.f4344w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i8 = 0;
            }
            int paddingTop = ((i7 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i8 && scrollY >= 0) {
                i9 = paddingTop + scrollY > i8 ? i8 - paddingTop : scrollY;
            }
            if (i9 != scrollY) {
                scrollTo(getScrollX(), i9);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4330i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f4334m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f6, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f6, true);
        i((int) f6);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f6) {
        return this.f4346y.b(f3, f6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f4346y.c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i6, int i7) {
        m(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z, boolean z5) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f4344w = jVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f1240a = getScrollY();
        return jVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i6, int i7) {
        super.onScrollChanged(i2, i3, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i6, int i7) {
        super.onSizeChanged(i2, i3, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f4324c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h3 = h(rect);
        if (h3 != 0) {
            if (this.f4335n) {
                t(0, h3, false);
            } else {
                scrollBy(0, h3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f4333l == null) {
            this.f4333l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4342u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        obtain.offsetLocation(0.0f, this.f4342u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4327f;
            EdgeEffect edgeEffect2 = this.f4326e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4333l;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.f4338q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4339r);
                if (Math.abs(yVelocity) >= this.f4337p) {
                    if (AbstractC1341c.o(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (AbstractC1341c.o(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (s(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            i(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f6 = i3;
                        if (!this.f4346y.b(0.0f, f6)) {
                            dispatchNestedFling(0.0f, f6, true);
                            i(i3);
                        }
                    }
                } else if (this.f4325d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4339r = -1;
                this.f4332k = false;
                VelocityTracker velocityTracker2 = this.f4333l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4333l = null;
                }
                w(0);
                this.f4326e.onRelease();
                this.f4327f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4339r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4339r + " in onTouchEvent");
                } else {
                    int y5 = (int) motionEvent.getY(findPointerIndex);
                    int i6 = this.f4328g - y5;
                    float x5 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (AbstractC1341c.o(edgeEffect2) != 0.0f) {
                        float f7 = -AbstractC1341c.y(edgeEffect2, -height, x5);
                        if (AbstractC1341c.o(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f3 = f7;
                    } else if (AbstractC1341c.o(edgeEffect) != 0.0f) {
                        float y6 = AbstractC1341c.y(edgeEffect, height, 1.0f - x5);
                        if (AbstractC1341c.o(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f3 = y6;
                    }
                    int round = Math.round(f3 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i7 = i6 - round;
                    if (!this.f4332k && Math.abs(i7) > this.f4336o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4332k = true;
                        i7 = i7 > 0 ? i7 - this.f4336o : i7 + this.f4336o;
                    }
                    if (this.f4332k) {
                        int r5 = r(i7, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f4328g = y5 - r5;
                        this.f4342u += r5;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4332k && getChildCount() > 0 && this.f4325d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4339r = -1;
                this.f4332k = false;
                VelocityTracker velocityTracker3 = this.f4333l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4333l = null;
                }
                w(0);
                this.f4326e.onRelease();
                this.f4327f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4328g = (int) motionEvent.getY(actionIndex);
                this.f4339r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f4328g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4339r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4332k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4325d.isFinished()) {
                this.f4325d.abortAnimation();
                w(1);
            }
            int y7 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4328g = y7;
            this.f4339r = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4333l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i2) {
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f4324c;
        if (z) {
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
        int i3 = rect.top;
        int i6 = height + i3;
        rect.bottom = i6;
        q(i2, i3, i6);
    }

    public final boolean q(int i2, int i3, int i6) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z5 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i6) {
                boolean z7 = i3 < top && bottom < i6;
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
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i6 > i7) {
            r(z5 ? i3 - scrollY : i6 - i7, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z;
    }

    public final int r(int i2, int i3, int i6, boolean z) {
        int i7;
        int i8;
        boolean z5;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            u(2, i6);
        }
        boolean c2 = this.f4346y.c(0, i2, this.f4341t, this.f4340s, i6);
        int[] iArr = this.f4341t;
        int[] iArr2 = this.f4340s;
        if (c2) {
            i7 = i2 - iArr[1];
            i8 = iArr2[1];
        } else {
            i7 = i2;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z7 = o(i7, 0, scrollY, scrollRange) && !this.f4346y.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f4346y.d(0, scrollY2, 0, i7 - scrollY2, this.f4340s, i6, iArr);
        int i9 = i8 + iArr2[1];
        int i10 = i7 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f4327f;
        EdgeEffect edgeEffect2 = this.f4326e;
        if (i11 < 0) {
            if (z6) {
                AbstractC1341c.y(edgeEffect2, (-i10) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z6) {
            AbstractC1341c.y(edgeEffect, i10 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z5 = z7;
        } else {
            postInvalidateOnAnimation();
            z5 = false;
        }
        if (z5 && i6 == 0 && (velocityTracker = this.f4333l) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            w(i6);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4329h) {
            this.f4331j = view2;
        } else {
            Rect rect = this.f4324c;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h3 = h(rect);
        boolean z5 = h3 != 0;
        if (z5) {
            if (z) {
                scrollBy(0, h3);
            } else {
                t(0, h3, false);
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f4333l) != null) {
            velocityTracker.recycle();
            this.f4333l = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4329h = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float o2 = AbstractC1341c.o(edgeEffect) * getHeight();
        float abs = Math.abs(-i2) * 0.35f;
        float f3 = this.f4322a * 0.015f;
        double log = Math.log(abs / f3);
        double d6 = f4318B;
        return ((float) (Math.exp((d6 / (d6 - 1.0d)) * log) * ((double) f3))) < o2;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
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

    public void setFillViewport(boolean z) {
        if (z != this.f4334m) {
            this.f4334m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0039n c0039n = this.f4346y;
        if (c0039n.f628d) {
            Field field = G.f566a;
            AbstractC0048x.z(c0039n.f627c);
        }
        c0039n.f628d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f4335n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f4346y.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4323b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4325d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f4343v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4325d.isFinished()) {
                this.f4325d.abortAnimation();
                w(1);
            }
            scrollBy(i2, i3);
        }
        this.f4323b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i2, int i3) {
        this.f4346y.g(2, i3);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f4326e;
        if (AbstractC1341c.o(edgeEffect) != 0.0f) {
            AbstractC1341c.y(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f4327f;
        if (AbstractC1341c.o(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC1341c.y(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i2) {
        this.f4346y.h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
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
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(i iVar) {
    }
}
