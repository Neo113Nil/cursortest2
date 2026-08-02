package androidx.core.widget;

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
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC0373jv;
import p000.AbstractC0528o1;
import p000.C0037at;
import p000.C0270h1;
import p000.C0415l;
import p000.a61;
import p000.af0;
import p000.ai1;
import p000.hh1;
import p000.ih1;
import p000.jg0;
import p000.pr0;
import p000.qr0;
import p000.rr0;
import p000.sr0;
import p000.tr0;
import p000.ur0;
import p000.vr0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements ur0 {

    /* JADX INFO: renamed from: L */
    public static final float f498L = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: M */
    public static final pr0 f499M = new pr0();

    /* JADX INFO: renamed from: N */
    public static final int[] f500N = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public final int f501A;

    /* JADX INFO: renamed from: B */
    public int f502B;

    /* JADX INFO: renamed from: C */
    public final int[] f503C;

    /* JADX INFO: renamed from: D */
    public final int[] f504D;

    /* JADX INFO: renamed from: E */
    public int f505E;

    /* JADX INFO: renamed from: F */
    public int f506F;

    /* JADX INFO: renamed from: G */
    public sr0 f507G;

    /* JADX INFO: renamed from: H */
    public final vr0 f508H;

    /* JADX INFO: renamed from: I */
    public final C0415l f509I;

    /* JADX INFO: renamed from: J */
    public float f510J;

    /* JADX INFO: renamed from: K */
    public final C0037at f511K;

    /* JADX INFO: renamed from: j */
    public final float f512j;

    /* JADX INFO: renamed from: k */
    public long f513k;

    /* JADX INFO: renamed from: l */
    public final Rect f514l;

    /* JADX INFO: renamed from: m */
    public final OverScroller f515m;

    /* JADX INFO: renamed from: n */
    public final EdgeEffect f516n;

    /* JADX INFO: renamed from: o */
    public final EdgeEffect f517o;

    /* JADX INFO: renamed from: p */
    public a61 f518p;

    /* JADX INFO: renamed from: q */
    public int f519q;

    /* JADX INFO: renamed from: r */
    public boolean f520r;

    /* JADX INFO: renamed from: s */
    public boolean f521s;

    /* JADX INFO: renamed from: t */
    public View f522t;

    /* JADX INFO: renamed from: u */
    public boolean f523u;

    /* JADX INFO: renamed from: v */
    public VelocityTracker f524v;

    /* JADX INFO: renamed from: w */
    public boolean f525w;

    /* JADX INFO: renamed from: x */
    public boolean f526x;

    /* JADX INFO: renamed from: y */
    public final int f527y;

    /* JADX INFO: renamed from: z */
    public final int f528z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, live.football.scorerepublic.R.attr.nestedScrollViewStyle);
        this.f514l = new Rect();
        this.f520r = true;
        this.f521s = false;
        this.f522t = null;
        this.f523u = false;
        this.f526x = true;
        this.f502B = -1;
        this.f503C = new int[2];
        this.f504D = new int[2];
        this.f511K = new C0037at(getContext(), new jg0(6, this));
        int i = Build.VERSION.SDK_INT;
        this.f516n = i >= 31 ? AbstractC0373jv.m2964a(context, attributeSet) : new EdgeEffect(context);
        this.f517o = i >= 31 ? AbstractC0373jv.m2964a(context, attributeSet) : new EdgeEffect(context);
        this.f512j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f515m = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f527y = viewConfiguration.getScaledTouchSlop();
        this.f528z = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f501A = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f500N, live.football.scorerepublic.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f508H = new vr0();
        C0415l c0415l = new C0415l();
        c0415l.f4616d = this;
        this.f509I = c0415l;
        setNestedScrollingEnabled(true);
        ai1.m252e(this, f499M);
    }

    private a61 getScrollFeedbackProvider() {
        if (this.f518p == null) {
            this.f518p = new a61(this);
        }
        return this.f518p;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m394m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m394m((View) parent, nestedScrollView);
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: a */
    public final void mo346a(View view, View view2, int i, int i2) {
        vr0 vr0Var = this.f508H;
        if (i2 == 1) {
            vr0Var.f8255b = i;
        } else {
            vr0Var.f8254a = i;
        }
        m410w(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            C0270h1.m2191g("ScrollView can host only one direct child");
        }
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: b */
    public final void mo347b(View view, int i) {
        vr0 vr0Var = this.f508H;
        if (i == 1) {
            vr0Var.f8255b = 0;
        } else {
            vr0Var.f8254a = 0;
        }
        m412y(i);
    }

    @Override // p000.ur0
    /* JADX INFO: renamed from: c */
    public final void mo348c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m402o(i4, i5, iArr);
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

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int i2;
        int overScrollMode;
        OverScroller overScroller = this.f515m;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i3 = currY - this.f506F;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f516n;
        EdgeEffect edgeEffect2 = this.f517o;
        if (i3 <= 0 || af0.m190d(edgeEffect) == 0.0f) {
            if (i3 < 0 && af0.m190d(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(af0.m193h(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect2.finish();
                }
            }
            this.f506F = currY;
            iArr = this.f504D;
            iArr[1] = 0;
            m397i(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                qr0.m4135b(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                m404q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.f509I.m3133a(0, scrollY2, 0, i4, this.f503C, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                m412y(i2);
            }
            if (overScroller.isFinished()) {
                m412y(i2);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(af0.m193h(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect.finish();
        }
        i3 -= iRound;
        this.f506F = currY;
        iArr = this.f504D;
        iArr[1] = 0;
        m397i(0, i3, 1, iArr, null);
        i = i3 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            qr0.m4135b(this, Math.abs(overScroller.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            m404q(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i5 = i - scrollY4;
            iArr[1] = 0;
            i2 = 1;
            this.f509I.m3133a(0, scrollY4, 0, i5, this.f503C, 1, iArr);
            i = i5 - iArr[1];
        } else {
            i2 = 1;
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            m412y(i2);
        }
        if (overScroller.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            m412y(i2);
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
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: d */
    public final void mo349d(int i, int i2, int[] iArr, int i3) {
        m397i(i, i2, i3, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m398j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParentM3134b;
        C0415l c0415l = this.f509I;
        if (c0415l.f4613a && (viewParentM3134b = c0415l.m3134b(0)) != null) {
            try {
                return viewParentM3134b.onNestedFling((NestedScrollView) c0415l.f4616d, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM3134b + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParentM3134b;
        C0415l c0415l = this.f509I;
        if (c0415l.f4613a && (viewParentM3134b = c0415l.m3134b(0)) != null) {
            try {
                return viewParentM3134b.onNestedPreFling((NestedScrollView) c0415l.f4616d, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM3134b + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m397i(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f509I.m3133a(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f516n;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f517o;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: e */
    public final void mo350e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        m402o(i4, i5, null);
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: f */
    public final boolean mo351f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m395g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m401n(viewFindNextFocus, maxScrollAmount, getHeight())) {
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
            m407t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f514l;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m407t(m396h(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m401n(view, 0, getHeight())) {
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
        vr0 vr0Var = this.f508H;
        return vr0Var.f8255b | vr0Var.f8254a;
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
        if (this.f510J == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                C0270h1.m2191g("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.f510J = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f510J;
    }

    /* JADX INFO: renamed from: h */
    public final int m396h(Rect rect) {
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
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f509I.m3134b(0) != null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m397i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentM3134b;
        int i4;
        int i5;
        C0415l c0415l = this.f509I;
        NestedScrollView nestedScrollView = (NestedScrollView) c0415l.f4616d;
        if (!c0415l.f4613a || (viewParentM3134b = c0415l.m3134b(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (((int[]) c0415l.f4617e) == null) {
                c0415l.f4617e = new int[2];
            }
            iArr = (int[]) c0415l.f4617e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        NestedScrollView nestedScrollView2 = (NestedScrollView) c0415l.f4616d;
        if (viewParentM3134b instanceof tr0) {
            ((tr0) viewParentM3134b).mo349d(i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParentM3134b.onNestedPreScroll(nestedScrollView2, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM3134b + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f509I.f4613a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX INFO: renamed from: j */
    public final boolean m398j(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f514l.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m400l(33) : m395g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m400l(130) : m395g(130);
                    }
                    if (keyCode == 62) {
                        m405r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m400l(33);
                    }
                    if (keyCode == 93) {
                        return m400l(130);
                    }
                    if (keyCode == 122) {
                        m405r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m405r(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m399k(int i) {
        if (getChildCount() > 0) {
            this.f515m.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m410w(2, 1);
            this.f506F = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                qr0.m4135b(this, Math.abs(this.f515m.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m400l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f514l;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m406s(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m401n(View view, int i, int i2) {
        Rect rect = this.f514l;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m402o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f509I.m3133a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f521s = false;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0299  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int width;
        boolean z;
        int i2;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        boolean z3;
        float yVelocity;
        float f2;
        long j;
        float f3;
        int i3;
        float fSqrt;
        boolean z4;
        float f4;
        if (motionEvent.getAction() != 8 || this.f523u) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            width = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        m407t(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            C0037at c0037at = this.f511K;
            NestedScrollView nestedScrollView = (NestedScrollView) c0037at.f622b.f3922k;
            int[] iArr = c0037at.f628h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (c0037at.f626f == source && c0037at.f627g == deviceId && c0037at.f625e == i) {
                z2 = false;
                z = true;
                i2 = 0;
            } else {
                Context context = c0037at.f621a;
                z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i2 = 0;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    scaledMinimumFlingVelocity = AbstractC0528o1.m3618g(viewConfiguration, deviceId2, i, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i4 >= 34) {
                    scaledMaximumFlingVelocity = AbstractC0528o1.m3617f(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0037at.f626f = source;
                c0037at.f627g = deviceId;
                c0037at.f625e = i;
                z2 = true;
            }
            int i5 = iArr[i2];
            VelocityTracker velocityTracker = c0037at.f623c;
            if (i5 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return z;
                }
                velocityTracker.recycle();
                c0037at.f623c = null;
                return z;
            }
            if (velocityTracker == null) {
                c0037at.f623c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = c0037at.f623c;
            Map map = hh1.f3212a;
            velocityTracker2.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = hh1.f3212a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new ih1());
                }
                ih1 ih1Var = (ih1) map2.get(velocityTracker2);
                long[] jArr = ih1Var.f3571b;
                long eventTime = motionEvent.getEventTime();
                if (ih1Var.f3573d != 0 && eventTime - jArr[ih1Var.f3574e] > 40) {
                    ih1Var.f3573d = i2;
                    ih1Var.f3572c = 0.0f;
                }
                int i6 = (ih1Var.f3574e + 1) % 20;
                ih1Var.f3574e = i6;
                int i7 = ih1Var.f3573d;
                if (i7 != 20) {
                    ih1Var.f3573d = i7 + 1;
                }
                ih1Var.f3570a[i6] = motionEvent.getAxisValue(26);
                jArr[ih1Var.f3574e] = eventTime;
            }
            float f5 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            ih1 ih1Var2 = (ih1) hh1.f3212a.get(velocityTracker2);
            if (ih1Var2 != null) {
                float[] fArr = ih1Var2.f3570a;
                long[] jArr2 = ih1Var2.f3571b;
                int i8 = ih1Var2.f3573d;
                if (i8 < 2) {
                    f3 = Float.MAX_VALUE;
                } else {
                    int i9 = ih1Var2.f3574e;
                    int i10 = ((i9 + 20) - (i8 - 1)) % 20;
                    long j2 = jArr2[i9];
                    while (true) {
                        j = jArr2[i10];
                        long j3 = j2 - j;
                        f3 = f5;
                        i3 = ih1Var2.f3573d;
                        if (j3 <= 100) {
                            break;
                        }
                        ih1Var2.f3573d = i3 - 1;
                        i10 = (i10 + 1) % 20;
                        f5 = f3;
                    }
                    if (i3 >= 2) {
                        if (i3 == 2) {
                            int i11 = (i10 + 1) % 20;
                            long j4 = jArr2[i11];
                            if (j != j4) {
                                fSqrt = fArr[i11] / (j4 - j);
                                z3 = z2;
                            }
                        } else {
                            float fAbs = 0.0f;
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                if (i12 >= ih1Var2.f3573d - 1) {
                                    break;
                                }
                                int i14 = i12 + i10;
                                long j5 = jArr2[i14 % 20];
                                int i15 = (i14 + 1) % 20;
                                if (jArr2[i15] == j5) {
                                    z4 = z2;
                                } else {
                                    i13++;
                                    float f6 = fAbs;
                                    z4 = z2;
                                    float fSqrt2 = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(fAbs)));
                                    float f7 = fArr[i15] / (jArr2[i15] - j5);
                                    fAbs = (Math.abs(f7) * (f7 - fSqrt2)) + f6;
                                    if (i13 == z) {
                                        fAbs *= 0.5f;
                                    }
                                }
                                i12++;
                                z2 = z4;
                                z = true;
                            }
                            float f8 = fAbs;
                            z3 = z2;
                            fSqrt = ((float) Math.sqrt(Math.abs(f8) * 2.0f)) * (f8 < 0.0f ? -1.0f : 1.0f);
                        }
                    }
                    f4 = fSqrt * 1000.0f;
                    ih1Var2.f3572c = f4;
                    if (f4 < (-Math.abs(f3))) {
                        ih1Var2.f3572c = -Math.abs(f3);
                    } else if (ih1Var2.f3572c > Math.abs(f3)) {
                        ih1Var2.f3572c = Math.abs(f3);
                    }
                }
                z3 = z2;
                fSqrt = 0.0f;
                f4 = fSqrt * 1000.0f;
                ih1Var2.f3572c = f4;
                if (f4 < (-Math.abs(f3))) {
                    ih1Var2.f3572c = -Math.abs(f3);
                } else if (ih1Var2.f3572c > Math.abs(f3)) {
                    ih1Var2.f3572c = Math.abs(f3);
                }
            } else {
                z3 = z2;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = AbstractC0528o1.m3614c(velocityTracker2, i);
            } else if (i == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                ih1 ih1Var3 = (ih1) hh1.f3212a.get(velocityTracker2);
                yVelocity = (ih1Var3 == null || i != 26) ? 0.0f : ih1Var3.f3572c;
            }
            float f9 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f9);
            if (z3 || (fSignum != Math.signum(c0037at.f624d) && fSignum != 0.0f)) {
                nestedScrollView.f515m.abortAnimation();
            }
            if (Math.abs(f9) >= iArr[0]) {
                int i16 = iArr[1];
                float fMax = Math.max(-i16, Math.min(f9, i16));
                if (fMax == 0.0f) {
                    f2 = 0.0f;
                } else {
                    nestedScrollView.f515m.abortAnimation();
                    nestedScrollView.m399k((int) fMax);
                    f2 = fMax;
                }
                c0037at.f624d = f2;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f523u) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.f515m;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m411x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f523u = z;
                    velocityTracker = this.f524v;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f524v = null;
                    }
                } else {
                    this.f519q = y;
                    this.f502B = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f524v;
                    if (velocityTracker3 == null) {
                        this.f524v = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f524v.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!m411x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f523u = z;
                    m410w(2, 0);
                }
            } else {
                if (!m411x(motionEvent)) {
                    z = false;
                }
                this.f523u = z;
                velocityTracker = this.f524v;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f524v = null;
                }
            }
        } else if (i == 1) {
            this.f523u = false;
            this.f502B = -1;
            velocityTracker2 = this.f524v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f524v = null;
            }
            if (this.f515m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m412y(0);
        } else if (i == 2) {
            int i2 = this.f502B;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f519q) > this.f527y && (2 & getNestedScrollAxes()) == 0) {
                        this.f523u = true;
                        this.f519q = y2;
                        if (this.f524v == null) {
                            this.f524v = VelocityTracker.obtain();
                        }
                        this.f524v.addMovement(motionEvent);
                        this.f505E = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f523u = false;
            this.f502B = -1;
            velocityTracker2 = this.f524v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f524v = null;
            }
            if (this.f515m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m412y(0);
        } else if (i == 6) {
            m403p(motionEvent);
        }
        return this.f523u;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f520r = false;
        View view = this.f522t;
        if (view != null && m394m(view, this)) {
            View view2 = this.f522t;
            Rect rect = this.f514l;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM396h = m396h(rect);
            if (iM396h != 0) {
                scrollBy(0, iM396h);
            }
        }
        this.f522t = null;
        if (!this.f521s) {
            if (this.f507G != null) {
                scrollTo(getScrollX(), this.f507G.f7197j);
                this.f507G = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f521s = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f525w && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m399k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m397i(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m402o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo346a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m401n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sr0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sr0 sr0Var = (sr0) parcelable;
        super.onRestoreInstanceState(sr0Var.getSuperState());
        this.f507G = sr0Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        sr0 sr0Var = new sr0(super.onSaveInstanceState());
        sr0Var.f7197j = getScrollY();
        return sr0Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m401n(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f514l;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM396h = m396h(rect);
        if (iM396h != 0) {
            if (this.f526x) {
                m409v(0, iM396h, false);
            } else {
                scrollBy(0, iM396h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo351f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo347b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM193h;
        int iRound;
        int i;
        int iAbs;
        int i2;
        ViewParent parent2;
        if (this.f524v == null) {
            this.f524v = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f505E = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f505E);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f516n;
            EdgeEffect edgeEffect2 = this.f517o;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f524v;
                velocityTracker.computeCurrentVelocity(1000, this.f501A);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f502B);
                if (Math.abs(yVelocity) >= this.f528z) {
                    if (af0.m190d(edgeEffect) != 0.0f) {
                        if (m408u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m399k(-yVelocity);
                        }
                    } else if (af0.m190d(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (m408u(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            m399k(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f2 = i4;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m399k(i4);
                        }
                    }
                } else if (this.f515m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f502B = -1;
                this.f523u = false;
                VelocityTracker velocityTracker2 = this.f524v;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f524v = null;
                }
                m412y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f502B);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f502B + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.f519q - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (af0.m190d(edgeEffect) != 0.0f) {
                        fM193h = -af0.m193h(edgeEffect, -height, x);
                        if (af0.m190d(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (af0.m190d(edgeEffect2) != 0.0f) {
                        fM193h = af0.m193h(edgeEffect2, height, 1.0f - x);
                        if (af0.m190d(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.f523u) {
                            iAbs = Math.abs(i);
                            i2 = this.f527y;
                            if (iAbs > i2) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.f523u = true;
                                if (i > 0) {
                                    i -= i2;
                                } else {
                                    i += i2;
                                }
                            }
                        }
                        if (this.f523u) {
                            int iM407t = m407t(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f519q = y - iM407t;
                            this.f505E += iM407t;
                        }
                    }
                    f = fM193h;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.f523u) {
                        iAbs = Math.abs(i);
                        i2 = this.f527y;
                        if (iAbs > i2) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f523u = true;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                    }
                    if (this.f523u) {
                        int iM407t2 = m407t(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f519q = y - iM407t2;
                        this.f505E += iM407t2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f523u && getChildCount() > 0) {
                    if (this.f515m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f502B = -1;
                this.f523u = false;
                VelocityTracker velocityTracker3 = this.f524v;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f524v = null;
                }
                m412y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f519q = (int) motionEvent.getY(actionIndex);
                this.f502B = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m403p(motionEvent);
                this.f519q = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f502B));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f523u && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.f515m;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                m412y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f519q = y2;
            this.f502B = pointerId;
            m410w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f524v;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m403p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f502B) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f519q = (int) motionEvent.getY(i);
            this.f502B = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f524v;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m404q(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && this.f509I.m3134b(1) == null) {
                this.f515m.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.f515m.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m405r(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f514l;
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
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m406s(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f520r) {
            this.f522t = view2;
        } else {
            Rect rect = this.f514l;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM396h = m396h(rect);
            if (iM396h != 0) {
                scrollBy(0, iM396h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM396h = m396h(rect);
        boolean z2 = iM396h != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM396h);
                return z2;
            }
            m409v(0, iM396h, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f524v) != null) {
            velocityTracker.recycle();
            this.f524v = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f520r = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: s */
    public final boolean m406s(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            m407t(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
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
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f525w) {
            this.f525w = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0415l c0415l = this.f509I;
        if (c0415l.f4613a) {
            NestedScrollView nestedScrollView = (NestedScrollView) c0415l.f4616d;
            WeakHashMap weakHashMap = ai1.f194a;
            nestedScrollView.stopNestedScroll();
        }
        c0415l.f4613a = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f526x = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return m410w(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m412y(0);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX INFO: renamed from: t */
    public final int m407t(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            m410w(2, i4);
        }
        boolean zM397i = m397i(0, i, i4, this.f504D, this.f503C);
        int[] iArr = this.f503C;
        int[] iArr2 = this.f504D;
        if (zM397i) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = m404q(i5, 0, scrollY, scrollRange) && this.f509I.m3134b(i4) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f43a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.f509I.m3133a(0, scrollY2, 0, i5 - scrollY2, this.f503C, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f517o;
        EdgeEffect edgeEffect2 = this.f516n;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                af0.m193h(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().f43a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.f524v) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                m412y(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            af0.m193h(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f43a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        } else {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m412y(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m408u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM190d = af0.m190d(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f512j * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f498L;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM190d;
    }

    /* JADX INFO: renamed from: v */
    public final void m409v(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f513k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f515m.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                m410w(2, 1);
            } else {
                m412y(1);
            }
            this.f506F = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.f515m;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                m412y(1);
            }
            scrollBy(i, i2);
        }
        this.f513k = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m410w(int i, int i2) {
        boolean zOnStartNestedScroll;
        C0415l c0415l = this.f509I;
        View view = (NestedScrollView) c0415l.f4616d;
        if (c0415l.m3134b(i2) != null) {
            return true;
        }
        if (c0415l.f4613a) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof tr0;
                if (z) {
                    zOnStartNestedScroll = ((tr0) parent).mo351f(view2, view, i, i2);
                } else if (i2 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        zOnStartNestedScroll = false;
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        c0415l.f4614b = parent;
                    } else if (i2 == 1) {
                        c0415l.f4615c = parent;
                    }
                    if (z) {
                        ((tr0) parent).mo346a(view2, view, i, i2);
                        return true;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i);
                        return true;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m411x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f516n;
        if (af0.m190d(edgeEffect) != 0.0f) {
            af0.m193h(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f517o;
        if (af0.m190d(edgeEffect2) == 0.0f) {
            return z;
        }
        af0.m193h(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m412y(int i) {
        C0415l c0415l = this.f509I;
        ViewParent viewParentM3134b = c0415l.m3134b(i);
        if (viewParentM3134b != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) c0415l.f4616d;
            if (viewParentM3134b instanceof tr0) {
                ((tr0) viewParentM3134b).mo347b(nestedScrollView, i);
            } else if (i == 0) {
                try {
                    viewParentM3134b.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM3134b + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                c0415l.f4614b = null;
            } else {
                if (i != 1) {
                    return;
                }
                c0415l.f4615c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            C0270h1.m2191g("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            C0270h1.m2191g("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            C0270h1.m2191g("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(rr0 rr0Var) {
    }
}
