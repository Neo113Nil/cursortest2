package androidx.coordinatorlayout.widget;

/* loaded from: classes7.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    static final java.lang.Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final java.lang.String TAG = "CoordinatorLayout";
    static final java.util.Comparator<android.view.View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final java.lang.String WIDGET_PACKAGE_NAME;
    static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>>> sConstructors;
    private static final androidx.core.util.Pools.Pool<android.graphics.Rect> sRectPool;
    private androidx.core.view.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private android.view.View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> mChildDag;
    private final java.util.List<android.view.View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private androidx.core.view.WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final androidx.core.view.NestedScrollingParentHelper mNestedScrollingParentHelper;
    private android.view.View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener mOnPreDrawListener;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private final java.util.List<android.view.View> mTempList1;

    public interface AttachedBehavior {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    /* loaded from: classes3.dex */
    public @interface DefaultBehavior {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior> value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DispatchChangeEvent {
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= androidx.core.view.GravityCompat.START;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    static {
        java.lang.Package r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new androidx.coordinatorlayout.widget.CoordinatorLayout.ViewElevationComparator();
        CONSTRUCTOR_PARAMS = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class};
        sConstructors = new java.lang.ThreadLocal<>();
        sRectPool = new androidx.core.util.Pools.SynchronizedPool(12);
    }

    private static android.graphics.Rect acquireTempRect() {
        android.graphics.Rect acquire = sRectPool.acquire();
        return acquire == null ? new android.graphics.Rect() : acquire;
    }

    private static void releaseTempRect(android.graphics.Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    public CoordinatorLayout(android.content.Context context) {
        this(context, null);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray obtainStyledAttributes;
        this.mDependencySortedChildren = new java.util.ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.DirectedAcyclicGraph<>();
        this.mTempList1 = new java.util.ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new androidx.core.view.NestedScrollingParentHelper(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, 0, androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, i, 0);
        }
        if (i == 0) {
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout);
        } else {
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.coordinatorlayout.R.styleable.CoordinatorLayout, attributeSet, obtainStyledAttributes, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            android.content.res.Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.mKeylines[i2] = (int) (r12[i2] * f);
            }
        }
        this.mStatusBarBackground = obtainStyledAttributes.getDrawable(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new androidx.coordinatorlayout.widget.CoordinatorLayout.HierarchyChangeListener());
        if (androidx.core.view.ViewCompat.getImportantForAccessibility(this) == 0) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && androidx.core.view.ViewCompat.getFitsSystemWindows(this)) {
            androidx.core.view.ViewCompat.requestApplyInsets(this);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        android.view.View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(this.mStatusBarBackground, androidx.core.view.ViewCompat.getLayoutDirection(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        android.graphics.drawable.Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? androidx.core.content.ContextCompat.getDrawable(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new android.graphics.drawable.ColorDrawable(i));
    }

    final androidx.core.view.WindowInsetsCompat setWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (androidx.core.util.ObjectsCompat.equals(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.mDrawStatusBarBackground = z;
        setWillNotDraw(!z && getBackground() == null);
        androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(windowInsetsCompat);
        requestLayout();
        return dispatchApplyWindowInsetsToBehaviors;
    }

    public final androidx.core.view.WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    private void cancelInterceptBehaviors() {
        int childCount = getChildCount();
        android.view.MotionEvent motionEvent = null;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                if (motionEvent == null) {
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    motionEvent = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                behavior.onInterceptTouchEvent(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private void resetTouchBehaviors() {
        android.view.View view = this.mBehaviorTouchView;
        if (view != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.onTouchEvent(this, this.mBehaviorTouchView, obtain);
                obtain.recycle();
            }
            this.mBehaviorTouchView = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) getChildAt(i).getLayoutParams()).getOutputMinFrameDuration = false;
        }
        this.mDisallowInterceptReset = false;
    }

    private void getTopSortedChildren(java.util.List<android.view.View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        java.util.Comparator<android.view.View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            java.util.Collections.sort(list, comparator);
        }
    }

    private boolean performIntercept(android.view.MotionEvent motionEvent, int i) {
        boolean blocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        java.util.List<android.view.View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        android.view.MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view = list.get(i2);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
            if (!(z || z2) || actionMasked == 0) {
                if (!z2 && !z && behavior != null && (z = performEvent(behavior, view, motionEvent, i))) {
                    this.mBehaviorTouchView = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i3 = 0; i3 < i2; i3++) {
                            android.view.View view2 = list.get(i3);
                            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior2 = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
                            if (behavior2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = obtainCancelEvent(motionEvent);
                                }
                                performEvent(behavior2, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (layoutParams.getHighResolutionOutputSizeshNQ4ISI == null) {
                    layoutParams.getOutputMinFrameDuration = false;
                }
                boolean z3 = layoutParams.getOutputMinFrameDuration;
                boolean z4 = layoutParams.getOutputMinFrameDuration;
                if (z4) {
                    blocksInteractionBelow = true;
                } else {
                    androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior3 = layoutParams.getHighResolutionOutputSizeshNQ4ISI;
                    blocksInteractionBelow = (behavior3 != null ? behavior3.blocksInteractionBelow(this, view) : false) | z4;
                    layoutParams.getOutputMinFrameDuration = blocksInteractionBelow;
                }
                z2 = blocksInteractionBelow && !z3;
                if (blocksInteractionBelow && !z2) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = obtainCancelEvent(motionEvent);
                }
                performEvent(behavior, view, motionEvent2, i);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    private boolean performEvent(androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior, android.view.View view, android.view.MotionEvent motionEvent, int i) {
        if (i == 0) {
            return behavior.onInterceptTouchEvent(this, view, motionEvent);
        }
        if (i == 1) {
            return behavior.onTouchEvent(this, view, motionEvent);
        }
        throw new java.lang.IllegalArgumentException();
    }

    private android.view.MotionEvent obtainCancelEvent(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors();
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return performIntercept;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return performIntercept;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean performIntercept;
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        android.view.View view = this.mBehaviorTouchView;
        boolean z2 = false;
        if (view != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getBehavior();
            if (behavior != null) {
                performIntercept = behavior.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
                z2 = performIntercept;
                z = false;
            } else {
                z = false;
            }
        } else {
            performIntercept = performIntercept(motionEvent, 1);
            if (actionMasked != 0 && performIntercept) {
                z2 = performIntercept;
                z = true;
            }
            z2 = performIntercept;
            z = false;
        }
        if (this.mBehaviorTouchView == null || actionMasked == 3) {
            z2 |= super.onTouchEvent(motionEvent);
        } else if (z) {
            android.view.MotionEvent obtainCancelEvent = obtainCancelEvent(motionEvent);
            super.onTouchEvent(obtainCancelEvent);
            obtainCancelEvent.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return z2;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        if (this.mBehaviorTouchView == null) {
            cancelInterceptBehaviors();
        }
        resetTouchBehaviors();
        this.mDisallowInterceptReset = true;
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr != null && i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior parseBehavior(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0) {
            java.lang.String str2 = WIDGET_PACKAGE_NAME;
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb2.append(str);
                str = sb2.toString();
            }
        }
        try {
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>>> threadLocal = sConstructors;
            java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new java.util.HashMap<>();
                threadLocal.set(map);
            }
            java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = java.lang.Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Could not inflate Behavior subclass ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams getResolvedLayoutParams(android.view.View view) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (!layoutParams.getHighSpeedVideoSizes) {
            if (view instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior) {
                layoutParams.setBehavior(((androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior) view).getBehavior());
                layoutParams.getHighSpeedVideoSizes = true;
                return layoutParams;
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior defaultBehavior = null;
            for (java.lang.Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                defaultBehavior = (androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior) cls.getAnnotation(androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    layoutParams.setBehavior(defaultBehavior.value().getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                } catch (java.lang.Exception unused) {
                    defaultBehavior.value();
                }
            }
            layoutParams.getHighSpeedVideoSizes = true;
        }
        return layoutParams;
    }

    private void prepareChildren() {
        android.view.View childAt;
        int layoutDirection;
        int absoluteGravity;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        this.mDependencySortedChildren.clear();
        this.mChildDag.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt2 = getChildAt(i);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams resolvedLayoutParams = getResolvedLayoutParams(childAt2);
            if (resolvedLayoutParams.getHighSpeedVideoFpsRangesFor == -1) {
                resolvedLayoutParams.getHighSpeedVideoFpsRanges = null;
                resolvedLayoutParams.Camera2StreamConfigurationMap = null;
            } else {
                if (resolvedLayoutParams.Camera2StreamConfigurationMap != null && resolvedLayoutParams.Camera2StreamConfigurationMap.getId() == resolvedLayoutParams.getHighSpeedVideoFpsRangesFor) {
                    android.view.View view = resolvedLayoutParams.Camera2StreamConfigurationMap;
                    for (android.view.ViewParent parent = view.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            resolvedLayoutParams.getHighSpeedVideoFpsRanges = null;
                            resolvedLayoutParams.Camera2StreamConfigurationMap = null;
                        } else {
                            if (parent instanceof android.view.View) {
                                view = parent;
                            }
                        }
                    }
                    resolvedLayoutParams.getHighSpeedVideoFpsRanges = view;
                    android.view.View view2 = resolvedLayoutParams.Camera2StreamConfigurationMap;
                }
                android.view.View findViewById = findViewById(resolvedLayoutParams.getHighSpeedVideoFpsRangesFor);
                resolvedLayoutParams.Camera2StreamConfigurationMap = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            resolvedLayoutParams.getHighSpeedVideoFpsRanges = null;
                            resolvedLayoutParams.Camera2StreamConfigurationMap = null;
                        } else {
                            throw new java.lang.IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (android.view.ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt2) {
                                if (isInEditMode()) {
                                    resolvedLayoutParams.getHighSpeedVideoFpsRanges = null;
                                    resolvedLayoutParams.Camera2StreamConfigurationMap = null;
                                } else {
                                    throw new java.lang.IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof android.view.View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        resolvedLayoutParams.getHighSpeedVideoFpsRanges = findViewById;
                    }
                } else if (isInEditMode()) {
                    resolvedLayoutParams.getHighSpeedVideoFpsRanges = null;
                    resolvedLayoutParams.Camera2StreamConfigurationMap = null;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                    sb.append(getResources().getResourceName(resolvedLayoutParams.getHighSpeedVideoFpsRangesFor));
                    sb.append(" to anchor view ");
                    sb.append(childAt2);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                android.view.View view22 = resolvedLayoutParams.Camera2StreamConfigurationMap;
            }
            this.mChildDag.addNode(childAt2);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i && ((childAt = getChildAt(i2)) == resolvedLayoutParams.getHighSpeedVideoFpsRanges || (((absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).insetEdge, (layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this)))) != 0 && (androidx.core.view.GravityCompat.getAbsoluteGravity(resolvedLayoutParams.dodgeInsetEdges, layoutDirection) & absoluteGravity) == absoluteGravity) || ((behavior = resolvedLayoutParams.getHighResolutionOutputSizeshNQ4ISI) != null && behavior.layoutDependsOn(this, childAt2, childAt))))) {
                    if (!this.mChildDag.contains(childAt)) {
                        this.mChildDag.addNode(childAt);
                    }
                    this.mChildDag.addEdge(childAt, childAt2);
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.getSortedList());
        java.util.Collections.reverse(this.mDependencySortedChildren);
    }

    void getDescendantRect(android.view.View view, android.graphics.Rect rect) {
        androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return java.lang.Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return java.lang.Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void onMeasureChild(android.view.View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0126, code lost:
    
        if (r0.onMeasureChild(r31, r19, r25, r20, r26, 0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        prepareChildren();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        boolean z = layoutDirection == 1;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.mLastInsets != null && androidx.core.view.ViewCompat.getFitsSystemWindows(this);
        int size3 = this.mDependencySortedChildren.size();
        int i15 = suggestedMinimumWidth;
        int i16 = suggestedMinimumHeight;
        int i17 = 0;
        int i18 = 0;
        while (i18 < size3) {
            android.view.View view = this.mDependencySortedChildren.get(i18);
            if (view.getVisibility() == 8) {
                i12 = i18;
                i10 = size3;
                i14 = mode2;
            } else {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams.keyline < 0 || mode == 0) {
                    i3 = i17;
                    i4 = i18;
                } else {
                    int keyline = getKeyline(layoutParams.keyline);
                    i3 = i17;
                    int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutParams.gravity), layoutDirection) & 7;
                    i4 = i18;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        i5 = java.lang.Math.max(0, (size - paddingRight) - keyline);
                    } else if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                        i5 = java.lang.Math.max(0, keyline - paddingLeft);
                    }
                    if (z2 || androidx.core.view.ViewCompat.getFitsSystemWindows(view)) {
                        i6 = i16;
                        i7 = i;
                        i8 = i2;
                    } else {
                        int systemWindowInsetLeft = this.mLastInsets.getSystemWindowInsetLeft();
                        int systemWindowInsetRight = this.mLastInsets.getSystemWindowInsetRight();
                        int systemWindowInsetTop = this.mLastInsets.getSystemWindowInsetTop();
                        i6 = i16;
                        int systemWindowInsetBottom = this.mLastInsets.getSystemWindowInsetBottom();
                        i7 = android.view.View.MeasureSpec.makeMeasureSpec(size - (systemWindowInsetLeft + systemWindowInsetRight), mode);
                        i8 = android.view.View.MeasureSpec.makeMeasureSpec(size2 - (systemWindowInsetTop + systemWindowInsetBottom), mode2);
                    }
                    behavior = layoutParams.getBehavior();
                    if (behavior == null) {
                        int i19 = i3;
                        i12 = i4;
                        i11 = i19;
                        i13 = i6;
                        i9 = i15;
                        i10 = size3;
                        i14 = mode2;
                    } else {
                        i9 = i15;
                        i10 = size3;
                        i11 = i3;
                        i12 = i4;
                        i13 = i6;
                        i14 = mode2;
                    }
                    onMeasureChild(view, i7, i5, i8, 0);
                    i15 = java.lang.Math.max(i9, paddingLeft + paddingRight + view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                    i16 = java.lang.Math.max(i13, paddingTop + paddingBottom + view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                    i17 = android.view.View.combineMeasuredStates(i11, view.getMeasuredState());
                }
                i5 = 0;
                if (z2) {
                }
                i6 = i16;
                i7 = i;
                i8 = i2;
                behavior = layoutParams.getBehavior();
                if (behavior == null) {
                }
                onMeasureChild(view, i7, i5, i8, 0);
                i15 = java.lang.Math.max(i9, paddingLeft + paddingRight + view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                i16 = java.lang.Math.max(i13, paddingTop + paddingBottom + view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                i17 = android.view.View.combineMeasuredStates(i11, view.getMeasuredState());
            }
            i18 = i12 + 1;
            size3 = i10;
            mode2 = i14;
        }
        int i20 = i17;
        setMeasuredDimension(android.view.View.resolveSizeAndState(i15, i, (-16777216) & i20), android.view.View.resolveSizeAndState(i16, i2, i20 << 16));
    }

    private androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (androidx.core.view.ViewCompat.getFitsSystemWindows(childAt) && (behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior()) != null) {
                windowInsetsCompat = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void onLayoutChild(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.Camera2StreamConfigurationMap == null && layoutParams.getHighSpeedVideoFpsRangesFor != -1) {
            throw new java.lang.IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (layoutParams.Camera2StreamConfigurationMap != null) {
            layoutChildWithAnchor(view, layoutParams.Camera2StreamConfigurationMap, i);
        } else if (layoutParams.keyline >= 0) {
            layoutChildWithKeyline(view, layoutParams.keyline, i);
        } else {
            layoutChild(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            android.view.View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    void recordLastChildRect(android.view.View view, android.graphics.Rect rect) {
        ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getOutputSizeshNQ4ISI.set(rect);
    }

    void getLastChildRect(android.view.View view, android.graphics.Rect rect) {
        rect.set(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getOutputSizeshNQ4ISI);
    }

    void getChildRect(android.view.View view, boolean z, android.graphics.Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(int i, android.graphics.Rect rect, android.graphics.Rect rect2, androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams, int i2, int i3) {
        int width;
        int height;
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutParams.gravity), i);
        int absoluteGravity2 = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveGravity(layoutParams.anchorGravity), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & 112;
        if (i6 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i7 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private void constrainChildRect(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams, android.graphics.Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int i3 = layoutParams.leftMargin;
        int i4 = paddingLeft + i3;
        int max = java.lang.Math.max(i4, java.lang.Math.min(rect.left, ((width - getPaddingRight()) - i) - layoutParams.rightMargin));
        int paddingTop = getPaddingTop();
        int i5 = layoutParams.topMargin;
        int i6 = paddingTop + i5;
        int max2 = java.lang.Math.max(i6, java.lang.Math.min(rect.top, ((height - getPaddingBottom()) - i2) - layoutParams.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    void getDesiredAnchoredChildRect(android.view.View view, int i, android.graphics.Rect rect, android.graphics.Rect rect2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(i, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        constrainChildRect(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    private void layoutChildWithAnchor(android.view.View view, android.view.View view2, int i) {
        android.graphics.Rect acquireTempRect = acquireTempRect();
        android.graphics.Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(android.view.View view, int i, int i2) {
        int i3;
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutParams.gravity), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        if (i4 == 1) {
            keyline += measuredWidth / 2;
        } else if (i4 == 5) {
            keyline += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int max = java.lang.Math.max(getPaddingLeft() + layoutParams.leftMargin, java.lang.Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - layoutParams.rightMargin));
        int max2 = java.lang.Math.max(getPaddingTop() + layoutParams.topMargin, java.lang.Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void layoutChild(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        android.graphics.Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + layoutParams.leftMargin, getPaddingTop() + layoutParams.topMargin, (getWidth() - getPaddingRight()) - layoutParams.rightMargin, (getHeight() - getPaddingBottom()) - layoutParams.bottomMargin);
        if (this.mLastInsets != null && androidx.core.view.ViewCompat.getFitsSystemWindows(this) && !androidx.core.view.ViewCompat.getFitsSystemWindows(view)) {
            acquireTempRect.left += this.mLastInsets.getSystemWindowInsetLeft();
            acquireTempRect.top += this.mLastInsets.getSystemWindowInsetTop();
            acquireTempRect.right -= this.mLastInsets.getSystemWindowInsetRight();
            acquireTempRect.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
        }
        android.graphics.Rect acquireTempRect2 = acquireTempRect();
        androidx.core.view.GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.getHighResolutionOutputSizeshNQ4ISI != null) {
            float scrimOpacity = layoutParams.getHighResolutionOutputSizeshNQ4ISI.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new android.graphics.Paint();
                }
                this.mScrimPaint.setColor(layoutParams.getHighResolutionOutputSizeshNQ4ISI.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(java.lang.Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    final void onChildViewsChanged(int i) {
        boolean z;
        boolean z2;
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        android.graphics.Rect acquireTempRect = acquireTempRect();
        android.graphics.Rect acquireTempRect2 = acquireTempRect();
        android.graphics.Rect acquireTempRect3 = acquireTempRect();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view = this.mDependencySortedChildren.get(i2);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (layoutParams.getHighSpeedVideoFpsRanges == this.mDependencySortedChildren.get(i3)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                boolean z3 = true;
                getChildRect(view, true, acquireTempRect2);
                if (layoutParams.insetEdge != 0 && !acquireTempRect2.isEmpty()) {
                    int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(layoutParams.insetEdge, layoutDirection);
                    int i4 = absoluteGravity & 112;
                    if (i4 == 48) {
                        acquireTempRect.top = java.lang.Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i4 == 80) {
                        acquireTempRect.bottom = java.lang.Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    int i5 = absoluteGravity & 7;
                    if (i5 == 3) {
                        acquireTempRect.left = java.lang.Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (i5 == 5) {
                        acquireTempRect.right = java.lang.Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (layoutParams.dodgeInsetEdges != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                int i6 = i2 + 1;
                while (i6 < size) {
                    android.view.View view2 = this.mDependencySortedChildren.get(i6);
                    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams2.getBehavior();
                    if (behavior == null || !behavior.layoutDependsOn(this, view2, view)) {
                        z = z3;
                    } else if (i == 0 && layoutParams2.getOutputFormats) {
                        layoutParams2.getOutputFormats = false;
                        z = true;
                    } else {
                        if (i == 2) {
                            behavior.onDependentViewRemoved(this, view2, view);
                            z2 = true;
                        } else {
                            z2 = behavior.onDependentViewChanged(this, view2, view);
                        }
                        z = true;
                        if (i == 1) {
                            layoutParams2.getOutputFormats = z2;
                        }
                    }
                    i6++;
                    z3 = z;
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    private void offsetChildByInset(android.view.View view, android.graphics.Rect rect, int i) {
        boolean z;
        int width;
        int i2;
        int height;
        int i3;
        if (!androidx.core.view.ViewCompat.isLaidOut(view) || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
        android.graphics.Rect acquireTempRect = acquireTempRect();
        android.graphics.Rect acquireTempRect2 = acquireTempRect();
        acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (behavior != null && behavior.getInsetDodgeRect(this, view, acquireTempRect)) {
            if (!acquireTempRect2.contains(acquireTempRect)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Rect should be within the child's bounds. Rect:");
                sb.append(acquireTempRect.toShortString());
                sb.append(" | Bounds:");
                sb.append(acquireTempRect2.toShortString());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        } else {
            acquireTempRect.set(acquireTempRect2);
        }
        releaseTempRect(acquireTempRect2);
        if (acquireTempRect.isEmpty()) {
            releaseTempRect(acquireTempRect);
            return;
        }
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(layoutParams.dodgeInsetEdges, i);
        boolean z2 = true;
        if ((absoluteGravity & 48) != 48 || (i3 = (acquireTempRect.top - layoutParams.topMargin) - layoutParams.getOutputMinFrameDurationlomOqCM) >= rect.top) {
            z = false;
        } else {
            setInsetOffsetY(view, rect.top - i3);
            z = true;
        }
        if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - layoutParams.bottomMargin) + layoutParams.getOutputMinFrameDurationlomOqCM) < rect.bottom) {
            setInsetOffsetY(view, height - rect.bottom);
        } else if (!z) {
            setInsetOffsetY(view, 0);
        }
        if ((absoluteGravity & 3) != 3 || (i2 = (acquireTempRect.left - layoutParams.leftMargin) - layoutParams.getOutputSizes) >= rect.left) {
            z2 = false;
        } else {
            setInsetOffsetX(view, rect.left - i2);
        }
        if ((absoluteGravity & 5) == 5 && (width = ((getWidth() - acquireTempRect.right) - layoutParams.rightMargin) + layoutParams.getOutputSizes) < rect.right) {
            setInsetOffsetX(view, width - rect.right);
        } else if (!z2) {
            setInsetOffsetX(view, 0);
        }
        releaseTempRect(acquireTempRect);
    }

    private void setInsetOffsetX(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.getOutputSizes != i) {
            androidx.core.view.ViewCompat.offsetLeftAndRight(view, i - layoutParams.getOutputSizes);
            layoutParams.getOutputSizes = i;
        }
    }

    private void setInsetOffsetY(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.getOutputMinFrameDurationlomOqCM != i) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(view, i - layoutParams.getOutputMinFrameDurationlomOqCM);
            layoutParams.getOutputMinFrameDurationlomOqCM = i;
        }
    }

    public void dispatchDependentViewsChanged(android.view.View view) {
        java.util.ArrayList<android.view.View> arrayList = this.mChildDag.getHighSpeedVideoFpsRanges.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            android.view.View view2 = arrayList.get(i);
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public java.util.List<android.view.View> getDependencies(android.view.View view) {
        java.util.List<android.view.View> outgoingEdges = this.mChildDag.getOutgoingEdges(view);
        return outgoingEdges == null ? java.util.Collections.emptyList() : outgoingEdges;
    }

    public java.util.List<android.view.View> getDependents(android.view.View view) {
        java.util.List<android.view.View> incomingEdges = this.mChildDag.getIncomingEdges(view);
        return incomingEdges == null ? java.util.Collections.emptyList() : incomingEdges;
    }

    final java.util.List<android.view.View> getDependencySortedChildren() {
        prepareChildren();
        return java.util.Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    private boolean hasDependencies(android.view.View view) {
        return this.mChildDag.hasOutgoingEdges(view);
    }

    void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    void offsetChildToAnchor(android.view.View view, int i) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.Camera2StreamConfigurationMap != null) {
            android.graphics.Rect acquireTempRect = acquireTempRect();
            android.graphics.Rect acquireTempRect2 = acquireTempRect();
            android.graphics.Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(layoutParams.Camera2StreamConfigurationMap, acquireTempRect);
            getChildRect(view, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(i, acquireTempRect, acquireTempRect3, layoutParams, measuredWidth, measuredHeight);
            boolean z = (acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top) ? false : true;
            constrainChildRect(layoutParams, acquireTempRect3, measuredWidth, measuredHeight);
            int i2 = acquireTempRect3.left - acquireTempRect2.left;
            int i3 = acquireTempRect3.top - acquireTempRect2.top;
            if (i2 != 0) {
                androidx.core.view.ViewCompat.offsetLeftAndRight(view, i2);
            }
            if (i3 != 0) {
                androidx.core.view.ViewCompat.offsetTopAndBottom(view, i3);
            }
            if (z && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onDependentViewChanged(this, view, layoutParams.Camera2StreamConfigurationMap);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    public boolean isPointInChildBounds(android.view.View view, int i, int i2) {
        android.graphics.Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public boolean doViewsOverlap(android.view.View view, android.view.View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        android.graphics.Rect acquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, acquireTempRect);
        android.graphics.Rect acquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left) {
                if (acquireTempRect.bottom >= acquireTempRect2.top) {
                    z = true;
                }
            }
            return z;
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) {
            return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateDefaultLayoutParams() {
        return new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    if (i2 == 0) {
                        layoutParams.getInputSizeshNQ4ISI = onStartNestedScroll;
                    } else if (i2 == 1) {
                        layoutParams.getHighSpeedVideoSizesFor = onStartNestedScroll;
                    }
                } else if (i2 == 0) {
                    layoutParams.getInputSizeshNQ4ISI = false;
                } else if (i2 == 1) {
                    layoutParams.getHighSpeedVideoSizesFor = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i, int i2) {
        boolean z;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
            if (i2 == 0) {
                z = layoutParams.getInputSizeshNQ4ISI;
            } else if (i2 == 1) {
                z = layoutParams.getHighSpeedVideoSizesFor;
            }
            if (z && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View view, int i) {
        boolean z;
        this.mNestedScrollingParentHelper.onStopNestedScroll(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
            if (i == 0) {
                z = layoutParams.getInputSizeshNQ4ISI;
            } else if (i == 1) {
                z = layoutParams.getHighSpeedVideoSizesFor;
            }
            if (z) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    layoutParams.getInputSizeshNQ4ISI = false;
                } else if (i == 1) {
                    layoutParams.getHighSpeedVideoSizesFor = false;
                }
                layoutParams.getOutputFormats = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int min;
        boolean z2;
        int min2;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            android.view.View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (i5 == 0) {
                    z = layoutParams.getInputSizeshNQ4ISI;
                } else if (i5 == 1) {
                    z = layoutParams.getHighSpeedVideoSizesFor;
                }
                if (z && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    int i9 = i6;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    if (i3 > 0) {
                        min = java.lang.Math.max(i7, this.mBehaviorConsumed[0]);
                    } else {
                        min = java.lang.Math.min(i7, this.mBehaviorConsumed[0]);
                    }
                    i7 = min;
                    if (i4 > 0) {
                        z2 = true;
                        min2 = java.lang.Math.max(i9, this.mBehaviorConsumed[1]);
                    } else {
                        z2 = true;
                        min2 = java.lang.Math.min(i9, this.mBehaviorConsumed[1]);
                    }
                    i6 = min2;
                    z3 = z2;
                }
            }
            i6 = i6;
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i6;
        if (z3) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (i3 == 0) {
                    z = layoutParams.getInputSizeshNQ4ISI;
                } else if (i3 == 1) {
                    z = layoutParams.getHighSpeedVideoSizesFor;
                }
                if (z && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        min = java.lang.Math.max(i4, this.mBehaviorConsumed[0]);
                    } else {
                        min = java.lang.Math.min(i4, this.mBehaviorConsumed[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = java.lang.Math.max(i5, this.mBehaviorConsumed[1]);
                    } else {
                        min2 = java.lang.Math.min(i5, this.mBehaviorConsumed[1]);
                    }
                    i5 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.getInputSizeshNQ4ISI && (behavior = layoutParams.getBehavior()) != null) {
                    z2 |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            onChildViewsChanged(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View view, float f, float f2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.getInputSizeshNQ4ISI && (behavior = layoutParams.getBehavior()) != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    class OnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            androidx.coordinatorlayout.widget.CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class ViewElevationComparator implements java.util.Comparator<android.view.View> {
        ViewElevationComparator() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(android.view.View view, android.view.View view2) {
            float z = androidx.core.view.ViewCompat.getZ(view);
            float z2 = androidx.core.view.ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    public static abstract class Behavior<V extends android.view.View> {
        public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.graphics.Rect rect) {
            return false;
        }

        public int getScrimColor(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
            return false;
        }

        public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
            return false;
        }

        public void onDependentViewRemoved(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, float f, float f2) {
            return false;
        }

        @java.lang.Deprecated
        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int[] iArr) {
        }

        @java.lang.Deprecated
        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4) {
        }

        @java.lang.Deprecated
        public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.graphics.Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.os.Parcelable parcelable) {
        }

        @java.lang.Deprecated
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i) {
            return false;
        }

        @java.lang.Deprecated
        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view) {
        }

        public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
            return false;
        }

        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        }

        public boolean blocksInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public static void setTag(android.view.View view, java.lang.Object obj) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getInputFormats = obj;
        }

        public static java.lang.Object getTag(android.view.View view) {
            return ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getInputFormats;
        }

        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        @java.lang.Deprecated
        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            return android.view.View.BaseSavedState.EMPTY_STATE;
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        android.view.View Camera2StreamConfigurationMap;
        public int anchorGravity;
        public int dodgeInsetEdges;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getHighResolutionOutputSizeshNQ4ISI;
        android.view.View getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        boolean getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        boolean getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        final android.graphics.Rect getOutputSizeshNQ4ISI;
        public int gravity;
        public int insetEdge;
        public int keyline;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.getHighSpeedVideoSizes = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.getOutputSizeshNQ4ISI = new android.graphics.Rect();
        }

        LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getHighSpeedVideoSizes = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.getOutputSizeshNQ4ISI = new android.graphics.Rect();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout);
            this.gravity = obtainStyledAttributes.getInteger(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getResourceId(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = obtainStyledAttributes.getInteger(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = obtainStyledAttributes.getInteger(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = obtainStyledAttributes.getInt(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = obtainStyledAttributes.getInt(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior);
            this.getHighSpeedVideoSizes = hasValue;
            if (hasValue) {
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.coordinatorlayout.widget.CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = this.getHighResolutionOutputSizeshNQ4ISI;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.getHighSpeedVideoSizes = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.getOutputSizeshNQ4ISI = new android.graphics.Rect();
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.getHighSpeedVideoSizes = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.getOutputSizeshNQ4ISI = new android.graphics.Rect();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.getHighSpeedVideoSizes = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.getOutputSizeshNQ4ISI = new android.graphics.Rect();
        }

        public int getAnchorId() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public void setBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = behavior;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizes = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public void setAnchorId(int i) {
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = i;
        }
    }

    class HierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View view, android.view.View view2) {
            if (androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View view, android.view.View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.this.onChildViewsChanged(2);
            if (androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = (androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        android.util.SparseArray<android.os.Parcelable> sparseArray = savedState.getHighSpeedVideoSizes;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            int id = childAt.getId();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = getResolvedLayoutParams(childAt).getBehavior();
            if (id != -1 && behavior != null && (parcelable2 = sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState;
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(super.onSaveInstanceState());
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            int id = childAt.getId();
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (id != -1 && behavior != null && (onSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.getHighSpeedVideoSizes = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void setupForInsets() {
        if (androidx.core.view.ViewCompat.getFitsSystemWindows(this)) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new androidx.core.view.OnApplyWindowInsetsListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.1
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                        return androidx.coordinatorlayout.widget.CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
                    }
                };
            }
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState[i];
            }
        };
        android.util.SparseArray<android.os.Parcelable> getHighSpeedVideoSizes;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.getHighSpeedVideoSizes = new android.util.SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.getHighSpeedVideoSizes.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            android.util.SparseArray<android.os.Parcelable> sparseArray = this.getHighSpeedVideoSizes;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.getHighSpeedVideoSizes.keyAt(i2);
                parcelableArr[i2] = this.getHighSpeedVideoSizes.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
