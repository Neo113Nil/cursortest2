package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.A;
import androidx.core.view.B;
import androidx.core.view.C;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q2.C8977a;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements A, B {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final x2.f<Rect> sRectPool;
    private D mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.c<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private C5353y0 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final C mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    final class a implements D {
        a() {
        }

        @Override // androidx.core.view.D
        public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
            return CoordinatorLayout.this.setWindowInsets(c5353y0);
        }
    }

    public interface b {
        @NonNull
        c a();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return getScrimOpacity(coordinatorLayout, v11) > 0.0f;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Rect rect) {
            return false;
        }

        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return -16777216;
        }

        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
            return false;
        }

        @NonNull
        public C5353y0 onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull C5353y0 c5353y0) {
            return c5353y0;
        }

        public void onAttachedToLayoutParams(@NonNull f fVar) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f7, float f11, boolean z11) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f7, float f11) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Rect rect, boolean z11) {
            return false;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
            if (i13 == 0) {
                onNestedPreScroll(coordinatorLayout, v11, view, i11, i12, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15) {
            if (i15 == 0) {
                onNestedScroll(coordinatorLayout, v11, view, i11, i12, i13, i14);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
            if (i12 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v11, view, view2, i11);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
            if (i12 == 0) {
                return onStartNestedScroll(coordinatorLayout, v11, view, view2, i11);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11) {
            if (i11 == 0) {
                onStopNestedScroll(coordinatorLayout, v11, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
            onNestedScroll(coordinatorLayout, v11, view, i11, i12, i13, i14, i15);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float q11 = Y.q(view);
            float q12 = Y.q(view2);
            if (q11 > q12) {
                return -1;
            }
            return q11 < q12 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r02 != null ? r02.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new i();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new x2.h(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private static Rect acquireTempRect() {
        Rect a11 = sRectPool.a();
        return a11 == null ? new Rect() : a11;
    }

    private static int clamp(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    private void constrainChildRect(f fVar, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i11 + max, i12 + max2);
    }

    private C5353y0 dispatchApplyWindowInsetsToBehaviors(C5353y0 c5353y0) {
        c cVar;
        if (c5353y0.o()) {
            return c5353y0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int i12 = Y.f42258g;
            if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).f41882a) != null) {
                c5353y0 = cVar.onApplyWindowInsets(this, childAt, c5353y0);
                if (c5353y0.o()) {
                    return c5353y0;
                }
            }
        }
        return c5353y0;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i11, Rect rect, Rect rect2, f fVar, int i12, int i13) {
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveAnchoredChildGravity(fVar.f41884c), i11);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(resolveGravity(fVar.f41885d), i11);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        int width = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            width -= i12 / 2;
        } else if (i14 != 5) {
            width -= i12;
        }
        if (i15 == 16) {
            height -= i13 / 2;
        } else if (i15 != 80) {
            height -= i13;
        }
        rect2.set(width, height, i12 + width, i13 + height);
    }

    private int getKeyline(int i11) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i11);
            return 0;
        }
        if (i11 >= 0 && i11 < iArr.length) {
            return iArr[i11];
        }
        Log.e(TAG, "Keyline index " + i11 + " out of range for " + this);
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.i(view);
    }

    private void layoutChild(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.mLastInsets != null) {
            int i12 = Y.f42258g;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                acquireTempRect.left = this.mLastInsets.j() + acquireTempRect.left;
                acquireTempRect.top = this.mLastInsets.l() + acquireTempRect.top;
                acquireTempRect.right -= this.mLastInsets.k();
                acquireTempRect.bottom -= this.mLastInsets.i();
            }
        }
        Rect acquireTempRect2 = acquireTempRect();
        Gravity.apply(resolveGravity(fVar.f41884c), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i11);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i11) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i11, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i11, int i12) {
        f fVar = (f) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(fVar.f41884c), i12);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i12 == 1) {
            i11 = width - i11;
        }
        int keyline = getKeyline(i11) - measuredWidth;
        if (i13 == 1) {
            keyline += measuredWidth / 2;
        } else if (i13 == 5) {
            keyline += measuredWidth;
        }
        int i15 = i14 != 16 ? i14 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void offsetChildByInset(View view, Rect rect, int i11) {
        boolean z11;
        boolean z12;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        int i18 = Y.f42258g;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f41882a;
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVar == null || !cVar.getInsetDodgeRect(this, view, acquireTempRect)) {
                acquireTempRect.set(acquireTempRect2);
            } else if (!acquireTempRect2.contains(acquireTempRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + acquireTempRect.toShortString() + " | Bounds:" + acquireTempRect2.toShortString());
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f41889h, i11);
            boolean z13 = true;
            if ((absoluteGravity & 48) != 48 || (i16 = (acquireTempRect.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f41891j) >= (i17 = rect.top)) {
                z11 = false;
            } else {
                setInsetOffsetY(view, i17 - i16);
                z11 = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f41891j) < (i15 = rect.bottom)) {
                setInsetOffsetY(view, height - i15);
                z11 = true;
            }
            if (!z11) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i13 = (acquireTempRect.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f41890i) >= (i14 = rect.left)) {
                z12 = false;
            } else {
                setInsetOffsetX(view, i14 - i13);
                z12 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - acquireTempRect.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f41890i) >= (i12 = rect.right)) {
                z13 = z12;
            } else {
                setInsetOffsetX(view, width - i12);
            }
            if (!z13) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e11) {
            throw new RuntimeException(Nk.a.b("Could not inflate Behavior subclass ", str), e11);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i11) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f41882a;
            if (!(z11 || z12) || actionMasked == 0) {
                if (!z11 && cVar != null) {
                    if (i11 == 0) {
                        z11 = cVar.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i11 == 1) {
                        z11 = cVar.onTouchEvent(this, view, motionEvent);
                    }
                    if (z11) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean a11 = fVar.a();
                boolean e11 = fVar.e(this, view);
                z12 = e11 && !a11;
                if (e11 && !z12) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    cVar.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i11 == 1) {
                    cVar.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d3, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r4.f41889h, r7) & r8) == r8) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.c();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f resolvedLayoutParams = getResolvedLayoutParams(childAt);
            int i12 = resolvedLayoutParams.f41887f;
            if (i12 == -1) {
                resolvedLayoutParams.f41893l = null;
                resolvedLayoutParams.f41892k = null;
            } else {
                View view = resolvedLayoutParams.f41892k;
                if (view != null && view.getId() == i12) {
                    View view2 = resolvedLayoutParams.f41892k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            resolvedLayoutParams.f41893l = null;
                            resolvedLayoutParams.f41892k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    resolvedLayoutParams.f41893l = view2;
                }
                View findViewById = findViewById(i12);
                resolvedLayoutParams.f41892k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i12) + " to anchor view " + childAt);
                    }
                    resolvedLayoutParams.f41893l = null;
                    resolvedLayoutParams.f41892k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            resolvedLayoutParams.f41893l = null;
                            resolvedLayoutParams.f41892k = null;
                        }
                    }
                    resolvedLayoutParams.f41893l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    resolvedLayoutParams.f41893l = null;
                    resolvedLayoutParams.f41892k = null;
                }
            }
            this.mChildDag.b(childAt);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (i13 != i11) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != resolvedLayoutParams.f41893l) {
                        int i14 = Y.f42258g;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f41888g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        c cVar = resolvedLayoutParams.f41882a;
                        if (cVar != null) {
                            if (!cVar.layoutDependsOn(this, childAt, childAt2)) {
                            }
                        }
                    }
                    if (!this.mChildDag.d(childAt2)) {
                        this.mChildDag.b(childAt2);
                    }
                    this.mChildDag.a(childAt2, childAt);
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.h());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(@NonNull Rect rect) {
        rect.setEmpty();
        sRectPool.b(rect);
    }

    private void resetTouchBehaviors(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            c cVar = ((f) childAt.getLayoutParams()).f41882a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z11) {
                    cVar.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    cVar.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).h();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i11) {
        if (i11 == 0) {
            return 17;
        }
        return i11;
    }

    private static int resolveGravity(int i11) {
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        return (i11 & 112) == 0 ? i11 | 48 : i11;
    }

    private static int resolveKeylineGravity(int i11) {
        if (i11 == 0) {
            return 8388661;
        }
        return i11;
    }

    private void setInsetOffsetX(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.f41890i;
        if (i12 != i11) {
            int i13 = Y.f42258g;
            view.offsetLeftAndRight(i11 - i12);
            fVar.f41890i = i11;
        }
    }

    private void setInsetOffsetY(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.f41891j;
        if (i12 != i11) {
            int i13 = Y.f42258g;
            view.offsetTopAndBottom(i11 - i12);
            fVar.f41891j = i11;
        }
    }

    private void setupForInsets() {
        int i11 = Y.f42258g;
        if (!getFitsSystemWindows()) {
            Y.J(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a();
        }
        Y.J(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List f7 = this.mChildDag.f(view);
        if (f7 == null || f7.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < f7.size(); i11++) {
            View view2 = (View) f7.get(i11);
            c cVar = ((f) view2.getLayoutParams()).f41882a;
            if (cVar != null) {
                cVar.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z11 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect acquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, acquireTempRect);
        Rect acquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left) {
                if (acquireTempRect.bottom >= acquireTempRect2.top) {
                    z11 = true;
                }
            }
            return z11;
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f41882a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.f41882a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j11);
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            if (hasDependencies(getChildAt(i11))) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (z11 != this.mNeedsPreDrawListener) {
            if (z11) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    void getChildRect(View view, boolean z11, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z11) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        ArrayList g10 = this.mChildDag.g(view);
        this.mTempDependenciesList.clear();
        if (g10 != null) {
            this.mTempDependenciesList.addAll(g10);
        }
        return this.mTempDependenciesList;
    }

    final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List f7 = this.mChildDag.f(view);
        this.mTempDependenciesList.clear();
        if (f7 != null) {
            this.mTempDependenciesList.addAll(f7);
        }
        return this.mTempDependenciesList;
    }

    void getDescendantRect(View view, Rect rect) {
        androidx.coordinatorlayout.widget.d.a(this, view, rect);
    }

    void getDesiredAnchoredChildRect(View view, int i11, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i11, rect, rect2, fVar, measuredWidth, measuredHeight);
        constrainChildRect(fVar, rect2, measuredWidth, measuredHeight);
    }

    void getLastChildRect(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).f41898q);
    }

    public final C5353y0 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    f getResolvedLayoutParams(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f41883b) {
            if (view instanceof b) {
                c a11 = ((b) view).a();
                if (a11 == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                fVar.i(a11);
                fVar.f41883b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.i(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e11) {
                    Log.e(TAG, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e11);
                }
            }
            fVar.f41883b = true;
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(@NonNull View view, int i11, int i12) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i11, i12);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    void offsetChildToAnchor(View view, int i11) {
        c cVar;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f41892k != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(fVar.f41892k, acquireTempRect);
            getChildRect(view, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i11, acquireTempRect, acquireTempRect3, fVar, measuredWidth, measuredHeight);
            boolean z11 = (acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top) ? false : true;
            constrainChildRect(fVar, acquireTempRect3, measuredWidth, measuredHeight);
            int i12 = acquireTempRect3.left - acquireTempRect2.left;
            int i13 = acquireTempRect3.top - acquireTempRect2.top;
            if (i12 != 0) {
                int i14 = Y.f42258g;
                view.offsetLeftAndRight(i12);
            }
            if (i13 != 0) {
                int i15 = Y.f42258g;
                view.offsetTopAndBottom(i13);
            }
            if (z11 && (cVar = fVar.f41882a) != null) {
                cVar.onDependentViewChanged(this, view, fVar.f41892k);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            int i11 = Y.f42258g;
            if (getFitsSystemWindows()) {
                Y.A(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    final void onChildViewsChanged(int i11) {
        boolean z11;
        int i12 = Y.f42258g;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i13 = 0; i13 < size; i13++) {
            View view = this.mDependencySortedChildren.get(i13);
            f fVar = (f) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (fVar.f41893l == this.mDependencySortedChildren.get(i14)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, acquireTempRect2);
                if (fVar.f41888g != 0 && !acquireTempRect2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f41888g, layoutDirection);
                    int i15 = absoluteGravity & 112;
                    if (i15 == 48) {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i15 == 80) {
                        acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    int i16 = absoluteGravity & 7;
                    if (i16 == 3) {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (i16 == 5) {
                        acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (fVar.f41889h != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, layoutDirection);
                }
                if (i11 != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                for (int i17 = i13 + 1; i17 < size; i17++) {
                    View view2 = this.mDependencySortedChildren.get(i17);
                    f fVar2 = (f) view2.getLayoutParams();
                    c cVar = fVar2.f41882a;
                    if (cVar != null && cVar.layoutDependsOn(this, view2, view)) {
                        if (i11 == 0 && fVar2.d()) {
                            fVar2.g();
                        } else {
                            if (i11 != 2) {
                                z11 = cVar.onDependentViewChanged(this, view2, view);
                            } else {
                                cVar.onDependentViewRemoved(this, view2, view);
                                z11 = true;
                            }
                            if (i11 == 1) {
                                fVar2.j(z11);
                            }
                        }
                    }
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        C5353y0 c5353y0 = this.mLastInsets;
        int l11 = c5353y0 != null ? c5353y0.l() : 0;
        if (l11 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), l11);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return performIntercept;
        }
        resetTouchBehaviors(true);
        return performIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        c cVar;
        int i15 = Y.f42258g;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i16 = 0; i16 < size; i16++) {
            View view = this.mDependencySortedChildren.get(i16);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f41882a) == null || !cVar.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f41892k;
        if (view2 == null && fVar.f41887f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i11);
            return;
        }
        int i12 = fVar.f41886e;
        if (i12 >= 0) {
            layoutChildWithKeyline(view, i12, i11);
        } else {
            layoutChild(view, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        c cVar;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        View view;
        View view2;
        CoordinatorLayout coordinatorLayout = this;
        boolean z11 = true;
        coordinatorLayout.prepareChildren();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i31 = Y.f42258g;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int i32 = paddingLeft + paddingRight;
        int i33 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z13 = coordinatorLayout.mLastInsets != null && coordinatorLayout.getFitsSystemWindows();
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i34 = 0;
        int i35 = 0;
        while (i34 < size3) {
            View view3 = coordinatorLayout.mDependencySortedChildren.get(i34);
            boolean z14 = z11;
            if (view3.getVisibility() == 8) {
                i18 = size3;
                i22 = i34;
                i19 = paddingLeft;
                i25 = paddingRight;
                i23 = layoutDirection;
            } else {
                f fVar = (f) view3.getLayoutParams();
                int i36 = fVar.f41886e;
                if (i36 < 0 || mode == 0) {
                    i13 = suggestedMinimumWidth;
                    i14 = suggestedMinimumHeight;
                } else {
                    int keyline = coordinatorLayout.getKeyline(i36);
                    i13 = suggestedMinimumWidth;
                    int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(fVar.f41884c), layoutDirection) & 7;
                    i14 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z12) || (absoluteGravity == 5 && z12)) {
                        i15 = Math.max(0, (size - paddingRight) - keyline);
                    } else if ((absoluteGravity == 5 && !z12) || (absoluteGravity == 3 && z12)) {
                        i15 = Math.max(0, keyline - paddingLeft);
                    }
                    if (z13 || view3.getFitsSystemWindows()) {
                        i16 = i11;
                        i17 = i12;
                    } else {
                        int k11 = coordinatorLayout.mLastInsets.k() + coordinatorLayout.mLastInsets.j();
                        int i37 = coordinatorLayout.mLastInsets.i() + coordinatorLayout.mLastInsets.l();
                        i16 = View.MeasureSpec.makeMeasureSpec(size - k11, mode);
                        i17 = View.MeasureSpec.makeMeasureSpec(size2 - i37, mode2);
                    }
                    cVar = fVar.f41882a;
                    if (cVar == null) {
                        i22 = i34;
                        int i38 = i15;
                        view2 = view3;
                        int i39 = i16;
                        i18 = size3;
                        int i41 = i13;
                        i19 = paddingLeft;
                        i21 = i41;
                        i23 = layoutDirection;
                        i24 = i14;
                        i25 = paddingRight;
                        i26 = i35;
                        int i42 = i17;
                        if (cVar.onMeasureChild(this, view2, i39, i38, i42, 0)) {
                            coordinatorLayout = this;
                            suggestedMinimumWidth = Math.max(i21, view2.getMeasuredWidth() + i32 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max = Math.max(i24, view2.getMeasuredHeight() + i33 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i35 = View.combineMeasuredStates(i26, view2.getMeasuredState());
                            suggestedMinimumHeight = max;
                        } else {
                            view = view2;
                            i28 = i39;
                            i27 = i38;
                            i29 = i42;
                        }
                    } else {
                        int i43 = i16;
                        i18 = size3;
                        int i44 = i13;
                        i19 = paddingLeft;
                        i21 = i44;
                        i22 = i34;
                        i23 = layoutDirection;
                        i24 = i14;
                        i25 = paddingRight;
                        i26 = i35;
                        i27 = i15;
                        i28 = i43;
                        i29 = i17;
                        view = view3;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view, i28, i27, i29, 0);
                    view2 = view;
                    suggestedMinimumWidth = Math.max(i21, view2.getMeasuredWidth() + i32 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max2 = Math.max(i24, view2.getMeasuredHeight() + i33 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i35 = View.combineMeasuredStates(i26, view2.getMeasuredState());
                    suggestedMinimumHeight = max2;
                }
                i15 = 0;
                if (z13) {
                }
                i16 = i11;
                i17 = i12;
                cVar = fVar.f41882a;
                if (cVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view, i28, i27, i29, 0);
                view2 = view;
                suggestedMinimumWidth = Math.max(i21, view2.getMeasuredWidth() + i32 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max22 = Math.max(i24, view2.getMeasuredHeight() + i33 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i35 = View.combineMeasuredStates(i26, view2.getMeasuredState());
                suggestedMinimumHeight = max22;
            }
            i34 = i22 + 1;
            size3 = i18;
            z11 = z14;
            paddingLeft = i19;
            paddingRight = i25;
            layoutDirection = i23;
        }
        int i45 = i35;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i11, (-16777216) & i45), View.resolveSizeAndState(suggestedMinimumHeight, i12, i45 << 16));
    }

    public void onMeasureChild(View view, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f11, boolean z11) {
        c cVar;
        View view2;
        float f12;
        float f13;
        boolean z12;
        int childCount = getChildCount();
        int i11 = 0;
        boolean z13 = false;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f(0) && (cVar = fVar.f41882a) != null) {
                    view2 = view;
                    f12 = f7;
                    f13 = f11;
                    z12 = z11;
                    z13 |= cVar.onNestedFling(this, childAt, view2, f12, f13, z12);
                    i11++;
                    view = view2;
                    f7 = f12;
                    f11 = f13;
                    z11 = z12;
                }
            }
            view2 = view;
            f12 = f7;
            f13 = f11;
            z12 = z11;
            i11++;
            view = view2;
            f7 = f12;
            f11 = f13;
            z11 = z12;
        }
        if (z13) {
            onChildViewsChanged(1);
        }
        return z13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f11) {
        c cVar;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f(0) && (cVar = fVar.f41882a) != null) {
                    view2 = view;
                    f12 = f7;
                    f13 = f11;
                    z11 |= cVar.onNestedPreFling(this, childAt, view2, f12, f13);
                    i11++;
                    view = view2;
                    f7 = f12;
                    f11 = f13;
                }
            }
            view2 = view;
            f12 = f7;
            f13 = f11;
            i11++;
            view = view2;
            f7 = f12;
            f11 = f13;
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        onNestedPreScroll(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i11, i12, i13, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        onNestedScrollAccepted(view, view2, i11, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f41900c;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c cVar = getResolvedLayoutParams(childAt).f41882a;
            if (id2 != -1 && cVar != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f41882a;
            if (id2 != -1 && cVar != null && (onSaveInstanceState = cVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, onSaveInstanceState);
            }
        }
        hVar.f41900c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return onStartNestedScroll(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean onTouchEvent;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            z11 = performIntercept(motionEvent, 1);
        } else {
            z11 = false;
        }
        c cVar = ((f) this.mBehaviorTouchView.getLayoutParams()).f41882a;
        if (cVar != null) {
            onTouchEvent = cVar.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
            motionEvent2 = null;
            if (this.mBehaviorTouchView != null) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (z11) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return onTouchEvent;
            }
            resetTouchBehaviors(false);
            return onTouchEvent;
        }
        onTouchEvent = false;
        motionEvent2 = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        resetTouchBehaviors(false);
        return onTouchEvent;
    }

    void recordLastChildRect(View view, Rect rect) {
        ((f) view.getLayoutParams()).f41898q.set(rect);
    }

    void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        c cVar = ((f) view.getLayoutParams()).f41882a;
        if (cVar == null || !cVar.onRequestChildRectangleOnScreen(this, view, rect, z11)) {
            return super.requestChildRectangleOnScreen(view, rect, z11);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (!z11 || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                int i11 = Y.f42258g;
                androidx.core.graphics.drawable.a.h(drawable3, getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            int i12 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(int i11) {
        setStatusBarBackground(i11 != 0 ? androidx.core.content.a.getDrawable(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z11) {
            return;
        }
        this.mStatusBarBackground.setVisible(z11, false);
    }

    final C5353y0 setWindowInsets(C5353y0 c5353y0) {
        if (Objects.equals(this.mLastInsets, c5353y0)) {
            return c5353y0;
        }
        this.mLastInsets = c5353y0;
        boolean z11 = false;
        boolean z12 = c5353y0 != null && c5353y0.l() > 0;
        this.mDrawStatusBarBackground = z12;
        if (!z12 && getBackground() == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        C5353y0 dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(c5353y0);
        requestLayout();
        return dispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.A
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr, int i13) {
        c cVar;
        int childCount = getChildCount();
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f(i13) && (cVar = fVar.f41882a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedPreScroll(this, childAt, view, i11, i12, iArr2, i13);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i14 = i11 > 0 ? Math.max(i14, iArr3[0]) : Math.min(i14, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i15 = i12 > 0 ? Math.max(i15, iArr4[1]) : Math.min(i15, iArr4[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = i14;
        iArr[1] = i15;
        if (z11) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.A
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15) {
        onNestedScroll(view, i11, i12, i13, i14, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.A
    public void onNestedScrollAccepted(View view, View view2, int i11, int i12) {
        c cVar;
        View view3;
        View view4;
        int i13;
        int i14;
        this.mNestedScrollingParentHelper.c(i11, i12);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.f(i12) && (cVar = fVar.f41882a) != null) {
                view3 = view;
                view4 = view2;
                i13 = i11;
                i14 = i12;
                cVar.onNestedScrollAccepted(this, childAt, view3, view4, i13, i14);
            } else {
                view3 = view;
                view4 = view2;
                i13 = i11;
                i14 = i12;
            }
            i15++;
            view = view3;
            view2 = view4;
            i11 = i13;
            i12 = i14;
        }
    }

    @Override // androidx.core.view.A
    public boolean onStartNestedScroll(View view, View view2, int i11, int i12) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f41882a;
                if (cVar != null) {
                    boolean onStartNestedScroll = cVar.onStartNestedScroll(this, childAt, view, view2, i11, i12);
                    z11 |= onStartNestedScroll;
                    fVar.k(i12, onStartNestedScroll);
                } else {
                    fVar.k(i12, false);
                }
            }
        }
        return z11;
    }

    @Override // androidx.core.view.A
    public void onStopNestedScroll(View view, int i11) {
        this.mNestedScrollingParentHelper.e(i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.f(i11)) {
                c cVar = fVar.f41882a;
                if (cVar != null) {
                    cVar.onStopNestedScroll(this, childAt, view, i11);
                }
                fVar.k(i11, false);
                fVar.g();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray obtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        int resourceId;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.c<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C();
        int[] iArr = C8977a.f81393a;
        if (i11 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        }
        TypedArray typedArray = obtainStyledAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i11 == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
            } else {
                coordinatorLayout = this;
                context2 = context;
                coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i11, 0);
                resourceId = typedArray.getResourceId(0, 0);
                if (resourceId != 0) {
                    Resources resources = context2.getResources();
                    coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
                    float f7 = resources.getDisplayMetrics().density;
                    int length = coordinatorLayout.mKeylines.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        coordinatorLayout.mKeylines[i12] = (int) (r11[i12] * f7);
                    }
                }
                coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(1);
                typedArray.recycle();
                setupForInsets();
                super.setOnHierarchyChangeListener(new e());
                int i13 = Y.f42258g;
                if (getImportantForAccessibility() != 0) {
                    setImportantForAccessibility(1);
                    return;
                }
                return;
            }
        }
        coordinatorLayout = this;
        context2 = context;
        resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
        }
        coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(1);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new e());
        int i132 = Y.f42258g;
        if (getImportantForAccessibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.B
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f(i15) && (cVar = fVar.f41882a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedScroll(this, childAt, view, i11, i12, i13, i14, i15, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i16 = i13 > 0 ? Math.max(i16, iArr3[0]) : Math.min(i16, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i17 = i14 > 0 ? Math.max(i17, iArr4[1]) : Math.min(i17, iArr4[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i16;
        iArr[1] = iArr[1] + i17;
        if (z11) {
            onChildViewsChanged(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    protected static class h extends O2.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        SparseArray<Parcelable> f41900c;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new h[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f41900c = new SparseArray<>(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                this.f41900c.append(iArr[i11], readParcelableArray[i11]);
            }
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            SparseArray<Parcelable> sparseArray = this.f41900c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = this.f41900c.keyAt(i12);
                parcelableArr[i12] = this.f41900c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i11);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f41882a;

        /* renamed from: b, reason: collision with root package name */
        boolean f41883b;

        /* renamed from: c, reason: collision with root package name */
        public int f41884c;

        /* renamed from: d, reason: collision with root package name */
        public int f41885d;

        /* renamed from: e, reason: collision with root package name */
        public int f41886e;

        /* renamed from: f, reason: collision with root package name */
        int f41887f;

        /* renamed from: g, reason: collision with root package name */
        public int f41888g;

        /* renamed from: h, reason: collision with root package name */
        public int f41889h;

        /* renamed from: i, reason: collision with root package name */
        int f41890i;

        /* renamed from: j, reason: collision with root package name */
        int f41891j;

        /* renamed from: k, reason: collision with root package name */
        View f41892k;

        /* renamed from: l, reason: collision with root package name */
        View f41893l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f41894m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f41895n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f41896o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f41897p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f41898q;

        public f(int i11, int i12) {
            super(i11, i12);
            this.f41883b = false;
            this.f41884c = 0;
            this.f41885d = 0;
            this.f41886e = -1;
            this.f41887f = -1;
            this.f41888g = 0;
            this.f41889h = 0;
            this.f41898q = new Rect();
        }

        final boolean a() {
            if (this.f41882a == null) {
                this.f41894m = false;
            }
            return this.f41894m;
        }

        public final int b() {
            return this.f41887f;
        }

        public final c c() {
            return this.f41882a;
        }

        final boolean d() {
            return this.f41897p;
        }

        final boolean e(CoordinatorLayout coordinatorLayout, View view) {
            boolean z11 = this.f41894m;
            if (z11) {
                return true;
            }
            c cVar = this.f41882a;
            boolean blocksInteractionBelow = (cVar != null ? cVar.blocksInteractionBelow(coordinatorLayout, view) : false) | z11;
            this.f41894m = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        final boolean f(int i11) {
            if (i11 == 0) {
                return this.f41895n;
            }
            if (i11 != 1) {
                return false;
            }
            return this.f41896o;
        }

        final void g() {
            this.f41897p = false;
        }

        final void h() {
            this.f41894m = false;
        }

        public final void i(c cVar) {
            c cVar2 = this.f41882a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f41882a = cVar;
                this.f41883b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        final void j(boolean z11) {
            this.f41897p = z11;
        }

        final void k(int i11, boolean z11) {
            if (i11 == 0) {
                this.f41895n = z11;
            } else {
                if (i11 != 1) {
                    return;
                }
                this.f41896o = z11;
            }
        }

        f(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41883b = false;
            this.f41884c = 0;
            this.f41885d = 0;
            this.f41886e = -1;
            this.f41887f = -1;
            this.f41888g = 0;
            this.f41889h = 0;
            this.f41898q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8977a.f81394b);
            this.f41884c = obtainStyledAttributes.getInteger(0, 0);
            this.f41887f = obtainStyledAttributes.getResourceId(1, -1);
            this.f41885d = obtainStyledAttributes.getInteger(2, 0);
            this.f41886e = obtainStyledAttributes.getInteger(6, -1);
            this.f41888g = obtainStyledAttributes.getInt(5, 0);
            this.f41889h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f41883b = hasValue;
            if (hasValue) {
                this.f41882a = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f41882a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f41883b = false;
            this.f41884c = 0;
            this.f41885d = 0;
            this.f41886e = -1;
            this.f41887f = -1;
            this.f41888g = 0;
            this.f41889h = 0;
            this.f41898q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f41883b = false;
            this.f41884c = 0;
            this.f41885d = 0;
            this.f41886e = -1;
            this.f41887f = -1;
            this.f41888g = 0;
            this.f41889h = 0;
            this.f41898q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f41883b = false;
            this.f41884c = 0;
            this.f41885d = 0;
            this.f41886e = -1;
            this.f41887f = -1;
            this.f41888g = 0;
            this.f41889h = 0;
            this.f41898q = new Rect();
        }
    }
}
