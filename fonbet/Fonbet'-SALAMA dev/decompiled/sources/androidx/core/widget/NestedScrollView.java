package androidx.core.widget;

import A1.x0;
import P.A;
import P.AbstractC0369z;
import P.B;
import P.C0353i;
import P.C0364u;
import P.I;
import P.InterfaceC0363t;
import P.U;
import P.X;
import P.Y;
import P.r;
import V.e;
import V.h;
import V.i;
import V.j;
import a.AbstractC0603a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
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
import androidx.core.view.ScrollingView;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0363t, ScrollingView {

    /* renamed from: S, reason: collision with root package name */
    public static final float f9066S = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: T, reason: collision with root package name */
    public static final h f9067T = new h(0);

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f9068U = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public View f9069A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9070B;

    /* renamed from: C, reason: collision with root package name */
    public VelocityTracker f9071C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9072D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9073E;

    /* renamed from: F, reason: collision with root package name */
    public final int f9074F;

    /* renamed from: G, reason: collision with root package name */
    public final int f9075G;

    /* renamed from: H, reason: collision with root package name */
    public final int f9076H;

    /* renamed from: I, reason: collision with root package name */
    public int f9077I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f9078J;

    /* renamed from: K, reason: collision with root package name */
    public final int[] f9079K;

    /* renamed from: L, reason: collision with root package name */
    public int f9080L;

    /* renamed from: M, reason: collision with root package name */
    public int f9081M;

    /* renamed from: N, reason: collision with root package name */
    public SavedState f9082N;

    /* renamed from: O, reason: collision with root package name */
    public final C0364u f9083O;

    /* renamed from: P, reason: collision with root package name */
    public final r f9084P;

    /* renamed from: Q, reason: collision with root package name */
    public float f9085Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0353i f9086R;

    /* renamed from: a, reason: collision with root package name */
    public final float f9087a;

    /* renamed from: b, reason: collision with root package name */
    public long f9088b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9089c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f9090d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f9091e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f9092f;

    /* renamed from: x, reason: collision with root package name */
    public int f9093x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9094y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9095z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f9096a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return k.g(sb, this.f9096a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f9096a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.nestedScrollViewStyle);
    }

    public static boolean g(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && g((View) parent, nestedScrollView);
    }

    public final boolean a(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !h(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            n(true, maxScrollAmount, 0, 1);
        } else {
            Rect rect = this.f9089c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            n(true, b(rect), 0, 1);
            findNextFocus.requestFocus(i7);
        }
        if (findFocus != null && findFocus.isFocused() && !h(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f9084P.c(i7, i8, iArr, null, i9);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i7;
        if (this.f9090d.isFinished()) {
            return;
        }
        this.f9090d.computeScrollOffset();
        int currY = this.f9090d.getCurrY();
        int i8 = currY - this.f9081M;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f9092f;
        EdgeEffect edgeEffect2 = this.f9091e;
        if (i8 <= 0 || AbstractC0603a.X(edgeEffect2) == 0.0f) {
            if (i8 < 0 && AbstractC0603a.X(edgeEffect) != 0.0f) {
                float f7 = height;
                round = Math.round(AbstractC0603a.g0(edgeEffect, (i8 * 4.0f) / f7, 0.5f) * (f7 / 4.0f));
                if (round != i8) {
                    edgeEffect.finish();
                }
            }
            this.f9081M = currY;
            int[] iArr = this.f9079K;
            iArr[1] = 0;
            c(0, i8, iArr, null, 1);
            i7 = i8 - iArr[1];
            int scrollRange = getScrollRange();
            if (i7 != 0) {
                int scrollY = getScrollY();
                k(i7, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i9 = i7 - scrollY2;
                iArr[1] = 0;
                this.f9084P.d(0, scrollY2, 0, i9, this.f9078J, 1, iArr);
                i7 = i9 - iArr[1];
            }
            if (i7 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i7 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f9090d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f9090d.getCurrVelocity());
                    }
                }
                this.f9090d.abortAnimation();
                s(1);
            }
            if (this.f9090d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                s(1);
                return;
            }
        }
        round = Math.round(AbstractC0603a.g0(edgeEffect2, ((-i8) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i8) {
            edgeEffect2.finish();
        }
        i8 -= round;
        this.f9081M = currY;
        int[] iArr2 = this.f9079K;
        iArr2[1] = 0;
        c(0, i8, iArr2, null, 1);
        i7 = i8 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i7 != 0) {
        }
        if (i7 != 0) {
        }
        if (this.f9090d.isFinished()) {
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
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

    public final boolean d(KeyEvent keyEvent) {
        this.f9089c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? f(33) : a(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? f(130) : a(130);
                }
                if (keyCode == 62) {
                    l(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return f(33);
                }
                if (keyCode == 93) {
                    return f(130);
                }
                if (keyCode == 122) {
                    l(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                l(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z4) {
        return this.f9084P.a(f7, f8, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f9084P.b(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f9084P.c(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f9084P.d(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f9091e;
        int i8 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f9092f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i8 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final void e(int i7) {
        if (getChildCount() > 0) {
            this.f9090d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER, 0, 0);
            q(2, 1);
            this.f9081M = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean f(int i7) {
        int childCount;
        boolean z4 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f9089c;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m(i7, rect.top, rect.bottom);
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
        C0364u c0364u = this.f9083O;
        return c0364u.f5111b | c0364u.f5110a;
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
        if (this.f9085Q == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f9085Q = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f9085Q;
    }

    public final boolean h(View view, int i7, int i8) {
        Rect rect = this.f9089c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i8;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f9084P.f(0);
    }

    public final void i(int[] iArr, int i7, int i8) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9084P.d(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9084P.f5105d;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9077I) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f9093x = (int) motionEvent.getY(i7);
            this.f9077I = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f9071C;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean k(int i7, int i8, int i9, int i10) {
        boolean z4;
        boolean z7;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i11 = i9 + i7;
        if (i8 <= 0 && i8 >= 0) {
            z4 = false;
        } else {
            i8 = 0;
            z4 = true;
        }
        if (i11 <= i10) {
            if (i11 >= 0) {
                i10 = i11;
                z7 = false;
                if (z7 && !this.f9084P.f(1)) {
                    this.f9090d.springBack(i8, i10, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i8, i10);
                return z4 || z7;
            }
            i10 = 0;
        }
        z7 = true;
        if (z7) {
            this.f9090d.springBack(i8, i10, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i10);
        if (z4) {
            return true;
        }
    }

    public final void l(int i7) {
        boolean z4 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f9089c;
        if (z4) {
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
        int i8 = rect.top;
        int i9 = height + i8;
        rect.bottom = i9;
        m(i7, i8, i9);
    }

    public final boolean m(int i7, int i8, int i9) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z7 = i7 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z8 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i8 < bottom && top < i9) {
                boolean z9 = i8 < top && bottom < i9;
                if (view == null) {
                    view = view2;
                    z8 = z9;
                } else {
                    boolean z10 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z8) {
                        if (z9) {
                            if (!z10) {
                            }
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z8 = true;
                    } else {
                        if (!z10) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i8 < scrollY || i9 > i10) {
            n(true, z7 ? i8 - scrollY : i9 - i10, 0, 1);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i7);
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final int n(boolean z4, int i7, int i8, int i9) {
        int i10;
        int i11;
        boolean z7;
        VelocityTracker velocityTracker;
        if (i9 == 1) {
            q(2, i9);
        }
        boolean c3 = this.f9084P.c(0, i7, this.f9079K, this.f9078J, i9);
        int[] iArr = this.f9079K;
        int[] iArr2 = this.f9078J;
        if (c3) {
            i10 = i7 - iArr[1];
            i11 = iArr2[1];
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z8 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z9 = k(i10, 0, scrollY, scrollRange) && !this.f9084P.f(i9);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f9084P.d(0, scrollY2, 0, i10 - scrollY2, this.f9078J, i9, iArr);
        int i12 = i11 + iArr2[1];
        int i13 = i10 - iArr[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f9092f;
        EdgeEffect edgeEffect2 = this.f9091e;
        if (i14 < 0) {
            if (z8) {
                AbstractC0603a.g0(edgeEffect2, (-i13) / getHeight(), i8 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > scrollRange && z8) {
            AbstractC0603a.g0(edgeEffect, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z7 = z9;
        } else {
            postInvalidateOnAnimation();
            z7 = false;
        }
        if (z7 && i9 == 0 && (velocityTracker = this.f9071C) != null) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
            s(i9);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i12;
    }

    public final boolean o(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float X6 = AbstractC0603a.X(edgeEffect) * getHeight();
        float abs = Math.abs(-i7) * 0.35f;
        float f7 = this.f9087a * 0.015f;
        double log = Math.log(abs / f7);
        double d7 = f9066S;
        return ((float) (Math.exp((d7 / (d7 - 1.0d)) * log) * ((double) f7))) < X6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9095z = false;
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
        float f7;
        int i7;
        int i8;
        char c3;
        int i9;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c4;
        boolean z4;
        VelocityTracker velocityTracker;
        float f8;
        float f9;
        long j;
        float sqrt;
        int i10;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i11;
        float f10;
        if (motionEvent.getAction() != 8 || this.f9070B) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i7 = 9;
            f7 = motionEvent.getAxisValue(9);
            i8 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f7 = motionEvent.getAxisValue(26);
            i8 = getWidth() / 2;
            i7 = 26;
        } else {
            f7 = 0.0f;
            i7 = 0;
            i8 = 0;
        }
        if (f7 == 0.0f) {
            return false;
        }
        n((motionEvent.getSource() & 8194) == 8194, -((int) (getVerticalScrollFactorCompat() * f7)), i8, 1);
        if (i7 == 0) {
            return true;
        }
        C0353i c0353i = this.f9086R;
        c0353i.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i12 = c0353i.f5074f;
        int[] iArr = c0353i.f5076h;
        if (i12 == source && c0353i.f5075g == deviceId && c0353i.f5073e == i7) {
            c4 = 0;
            z4 = false;
        } else {
            Context context = c0353i.f5069a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 34) {
                Method method = Y.f5042a;
                i9 = X.b(viewConfiguration, deviceId2, i7, source2);
            } else {
                Method method2 = Y.f5042a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i7, source2) == null) {
                    c3 = 0;
                    i9 = f.API_PRIORITY_OTHER;
                    iArr[c3] = i9;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i13 < 34) {
                        scaledMaximumFlingVelocity = X.a(viewConfiguration, deviceId3, i7, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        int i14 = Integer.MIN_VALUE;
                        if ((device2 == null || device2.getMotionRange(i7, source3) == null) ? false : true) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i7 == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                i14 = dimensionPixelSize;
                            }
                        }
                        scaledMaximumFlingVelocity = i14;
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0353i.f5074f = source;
                    c0353i.f5075g = deviceId;
                    c0353i.f5073e = i7;
                    c4 = 0;
                    z4 = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i7 == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = f.API_PRIORITY_OTHER;
                        }
                    } else {
                        i9 = f.API_PRIORITY_OTHER;
                    }
                    i9 = scaledMinimumFlingVelocity;
                }
            }
            c3 = 0;
            iArr[c3] = i9;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i13 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0353i.f5074f = source;
            c0353i.f5075g = deviceId;
            c0353i.f5073e = i7;
            c4 = 0;
            z4 = true;
        }
        if (iArr[c4] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0353i.f5071c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0353i.f5071c = null;
            }
        } else {
            if (c0353i.f5071c == null) {
                c0353i.f5071c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0353i.f5071c;
            Map map = A.f5017a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = A.f5017a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new B());
                }
                B b7 = (B) map2.get(velocityTracker4);
                b7.getClass();
                long eventTime = motionEvent.getEventTime();
                int i15 = b7.f5021d;
                long[] jArr = b7.f5019b;
                if (i15 != 0 && eventTime - jArr[b7.f5022e] > 40) {
                    b7.f5021d = 0;
                    b7.f5020c = 0.0f;
                }
                int i16 = (b7.f5022e + 1) % 20;
                b7.f5022e = i16;
                int i17 = b7.f5021d;
                if (i17 != 20) {
                    b7.f5021d = i17 + 1;
                }
                b7.f5018a[i16] = motionEvent.getAxisValue(26);
                jArr[b7.f5022e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(zzbbd.zzq.zzf, Float.MAX_VALUE);
            B b8 = (B) A.f5017a.get(velocityTracker4);
            if (b8 != null) {
                int i18 = b8.f5021d;
                if (i18 >= 2) {
                    int i19 = b8.f5022e;
                    int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                    long[] jArr2 = b8.f5019b;
                    long j3 = jArr2[i19];
                    while (true) {
                        j = jArr2[i20];
                        if (j3 - j <= 100) {
                            break;
                        }
                        b8.f5021d--;
                        i20 = (i20 + 1) % 20;
                    }
                    int i21 = b8.f5021d;
                    if (i21 >= 2) {
                        float[] fArr2 = b8.f5018a;
                        if (i21 == 2) {
                            int i22 = (i20 + 1) % 20;
                            if (j != jArr2[i22]) {
                                velocityTracker = velocityTracker4;
                                i10 = 1000;
                                sqrt = fArr2[i22] / (r8 - j);
                            }
                        } else {
                            float f11 = 0.0f;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i23 >= b8.f5021d - 1) {
                                    break;
                                }
                                int i25 = i23 + i20;
                                long j7 = jArr2[i25 % 20];
                                int i26 = (i25 + 1) % 20;
                                if (jArr2[i26] == j7) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i11 = 1;
                                } else {
                                    i24++;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f11 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
                                    float f12 = fArr2[i26];
                                    long j8 = jArr2[i26];
                                    fArr = fArr2;
                                    float f13 = f12 / (j8 - j7);
                                    float abs = (Math.abs(f13) * (f13 - sqrt2)) + f11;
                                    i11 = 1;
                                    if (i24 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f11 = abs;
                                }
                                i23 += i11;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            sqrt = ((float) Math.sqrt(Math.abs(f11) * 2.0f)) * (f11 < 0.0f ? -1.0f : 1.0f);
                            i10 = zzbbd.zzq.zzf;
                        }
                        f10 = sqrt * i10;
                        b8.f5020c = f10;
                        if (f10 >= (-Math.abs(Float.MAX_VALUE))) {
                            b8.f5020c = -Math.abs(Float.MAX_VALUE);
                        } else if (b8.f5020c > Math.abs(Float.MAX_VALUE)) {
                            b8.f5020c = Math.abs(Float.MAX_VALUE);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                i10 = 1000;
                sqrt = 0.0f;
                f10 = sqrt * i10;
                b8.f5020c = f10;
                if (f10 >= (-Math.abs(Float.MAX_VALUE))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f8 = AbstractC0369z.a(velocityTracker, i7);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i7 == 0) {
                    f8 = velocityTracker5.getXVelocity();
                } else if (i7 == 1) {
                    f8 = velocityTracker5.getYVelocity();
                } else {
                    B b9 = (B) A.f5017a.get(velocityTracker5);
                    f8 = (b9 == null || i7 != 26) ? 0.0f : b9.f5020c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0353i.f5070b.f613b;
            float f14 = f8 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f14);
            if (z4 || (signum != Math.signum(c0353i.f5072d) && signum != 0.0f)) {
                nestedScrollView.f9090d.abortAnimation();
            }
            if (Math.abs(f14) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f14, iArr[1]));
                if (max == 0.0f) {
                    f9 = 0.0f;
                } else {
                    nestedScrollView.f9090d.abortAnimation();
                    nestedScrollView.e((int) max);
                    f9 = max;
                }
                c0353i.f5072d = f9;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f9070B) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = this.f9077I;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.f9093x) > this.f9074F && (2 & getNestedScrollAxes()) == 0) {
                                this.f9070B = true;
                                this.f9093x = y4;
                                if (this.f9071C == null) {
                                    this.f9071C = VelocityTracker.obtain();
                                }
                                this.f9071C.addMovement(motionEvent);
                                this.f9080L = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        j(motionEvent);
                    }
                }
            }
            this.f9070B = false;
            this.f9077I = -1;
            VelocityTracker velocityTracker = this.f9071C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9071C = null;
            }
            if (this.f9090d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            s(0);
        } else {
            int y5 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y5 >= childAt.getTop() - scrollY && y5 < childAt.getBottom() - scrollY && x4 >= childAt.getLeft() && x4 < childAt.getRight()) {
                    this.f9093x = y5;
                    this.f9077I = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f9071C;
                    if (velocityTracker2 == null) {
                        this.f9071C = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f9071C.addMovement(motionEvent);
                    this.f9090d.computeScrollOffset();
                    if (!r(motionEvent) && this.f9090d.isFinished()) {
                        z4 = false;
                    }
                    this.f9070B = z4;
                    q(2, 0);
                }
            }
            if (!r(motionEvent) && this.f9090d.isFinished()) {
                z4 = false;
            }
            this.f9070B = z4;
            VelocityTracker velocityTracker3 = this.f9071C;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f9071C = null;
            }
        }
        return this.f9070B;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z4, i7, i8, i9, i10);
        int i12 = 0;
        this.f9094y = false;
        View view = this.f9069A;
        if (view != null && g(view, this)) {
            View view2 = this.f9069A;
            Rect rect = this.f9089c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b7 = b(rect);
            if (b7 != 0) {
                scrollBy(0, b7);
            }
        }
        this.f9069A = null;
        if (!this.f9095z) {
            if (this.f9082N != null) {
                scrollTo(getScrollX(), this.f9082N.f9096a);
                this.f9082N = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9095z = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f9072D && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        e((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return this.f9084P.b(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        c(i7, i8, iArr, null, 0);
    }

    @Override // P.InterfaceC0363t
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        i(iArr, i10, i11);
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        C0364u c0364u = this.f9083O;
        if (i8 == 1) {
            c0364u.f5111b = i7;
        } else {
            c0364u.f5110a = i7;
        }
        q(2, i8);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i8, boolean z4, boolean z7) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (findNextFocus != null && h(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i7, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f9082N = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9096a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !h(findFocus, 0, i10)) {
            return;
        }
        Rect rect = this.f9089c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int b7 = b(rect);
        if (b7 != 0) {
            if (this.f9073E) {
                p(0, b7, false);
            } else {
                scrollBy(0, b7);
            }
        }
    }

    @Override // P.InterfaceC0362s
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // P.InterfaceC0362s
    public final void onStopNestedScroll(View view, int i7) {
        C0364u c0364u = this.f9083O;
        if (i7 == 1) {
            c0364u.f5111b = 0;
        } else {
            c0364u.f5110a = 0;
        }
        s(i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f9071C == null) {
            this.f9071C = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9080L = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f7 = 0.0f;
        obtain.offsetLocation(0.0f, this.f9080L);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f9092f;
            EdgeEffect edgeEffect2 = this.f9091e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f9071C;
                velocityTracker.computeCurrentVelocity(zzbbd.zzq.zzf, this.f9076H);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f9077I);
                if (Math.abs(yVelocity) >= this.f9075G) {
                    if (AbstractC0603a.X(edgeEffect2) != 0.0f) {
                        if (o(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            e(-yVelocity);
                        }
                    } else if (AbstractC0603a.X(edgeEffect) != 0.0f) {
                        int i7 = -yVelocity;
                        if (o(edgeEffect, i7)) {
                            edgeEffect.onAbsorb(i7);
                        } else {
                            e(i7);
                        }
                    } else {
                        int i8 = -yVelocity;
                        float f8 = i8;
                        if (!this.f9084P.b(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            e(i8);
                        }
                    }
                } else if (this.f9090d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f9077I = -1;
                this.f9070B = false;
                VelocityTracker velocityTracker2 = this.f9071C;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f9071C = null;
                }
                s(0);
                this.f9091e.onRelease();
                this.f9092f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f9077I);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f9077I + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(findPointerIndex);
                    int i9 = this.f9093x - y4;
                    float x4 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i9 / getHeight();
                    if (AbstractC0603a.X(edgeEffect2) != 0.0f) {
                        float f9 = -AbstractC0603a.g0(edgeEffect2, -height, x4);
                        if (AbstractC0603a.X(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f7 = f9;
                    } else if (AbstractC0603a.X(edgeEffect) != 0.0f) {
                        float g02 = AbstractC0603a.g0(edgeEffect, height, 1.0f - x4);
                        if (AbstractC0603a.X(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f7 = g02;
                    }
                    int round = Math.round(f7 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i10 = i9 - round;
                    if (!this.f9070B && Math.abs(i10) > this.f9074F) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f9070B = true;
                        i10 = i10 > 0 ? i10 - this.f9074F : i10 + this.f9074F;
                    }
                    if (this.f9070B) {
                        int n2 = n(false, i10, (int) motionEvent.getX(findPointerIndex), 0);
                        this.f9093x = y4 - n2;
                        this.f9080L += n2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f9070B && getChildCount() > 0 && this.f9090d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f9077I = -1;
                this.f9070B = false;
                VelocityTracker velocityTracker3 = this.f9071C;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f9071C = null;
                }
                s(0);
                this.f9091e.onRelease();
                this.f9092f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f9093x = (int) motionEvent.getY(actionIndex);
                this.f9077I = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
                this.f9093x = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f9077I));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f9070B && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f9090d.isFinished()) {
                this.f9090d.abortAnimation();
                s(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f9093x = y5;
            this.f9077I = pointerId;
            q(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f9071C;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i7, int i8, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9088b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f9090d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z4) {
                q(2, 1);
            } else {
                s(1);
            }
            this.f9081M = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f9090d.isFinished()) {
                this.f9090d.abortAnimation();
                s(1);
            }
            scrollBy(i7, i8);
        }
        this.f9088b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean q(int i7, int i8) {
        return this.f9084P.g(2, i8);
    }

    public final boolean r(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f9091e;
        if (AbstractC0603a.X(edgeEffect) != 0.0f) {
            AbstractC0603a.g0(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f9092f;
        if (AbstractC0603a.X(edgeEffect2) == 0.0f) {
            return z4;
        }
        AbstractC0603a.g0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f9094y) {
            this.f9069A = view2;
        } else {
            Rect rect = this.f9089c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b7 = b(rect);
            if (b7 != 0) {
                scrollBy(0, b7);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b7 = b(rect);
        boolean z7 = b7 != 0;
        if (z7) {
            if (z4) {
                scrollBy(0, b7);
            } else {
                p(0, b7, false);
            }
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f9071C) != null) {
            velocityTracker.recycle();
            this.f9071C = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f9094y = true;
        super.requestLayout();
    }

    public final void s(int i7) {
        this.f9084P.h(i7);
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i8 < 0) {
                i8 = 0;
            } else if (height + i8 > height2) {
                i8 = height2 - height;
            }
            if (i7 == getScrollX() && i8 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i8);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f9072D) {
            this.f9072D = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        r rVar = this.f9084P;
        if (rVar.f5105d) {
            WeakHashMap weakHashMap = U.f5037a;
            I.z(rVar.f5104c);
        }
        rVar.f5105d = z4;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f9073E = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return this.f9084P.g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        s(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9089c = new Rect();
        this.f9094y = true;
        this.f9095z = false;
        this.f9069A = null;
        this.f9070B = false;
        this.f9073E = true;
        this.f9077I = -1;
        this.f9078J = new int[2];
        this.f9079K = new int[2];
        this.f9086R = new C0353i(getContext(), new x0(this, 9));
        int i8 = Build.VERSION.SDK_INT;
        this.f9091e = i8 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f9092f = i8 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f9087a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f9090d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9074F = viewConfiguration.getScaledTouchSlop();
        this.f9075G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9076H = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9068U, i7, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f9083O = new C0364u();
        this.f9084P = new r(this);
        setNestedScrollingEnabled(true);
        U.h(this, f9067T);
    }

    @Override // P.InterfaceC0362s
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        c(i7, i8, iArr, null, i9);
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        i(null, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        i(null, i10, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
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
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(j jVar) {
    }
}
