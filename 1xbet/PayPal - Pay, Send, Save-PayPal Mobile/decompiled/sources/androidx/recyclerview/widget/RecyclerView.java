package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class RecyclerView extends android.view.ViewGroup implements androidx.core.view.ScrollingView, androidx.core.view.NestedScrollingChild2, androidx.core.view.NestedScrollingChild3 {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final java.lang.String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final java.lang.String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final java.lang.String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final java.lang.String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final java.lang.String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final java.lang.String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final java.lang.String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final java.lang.String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final java.lang.String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static boolean sVerboseLoggingEnabled = false;
    androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager;
    androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    androidx.recyclerview.widget.AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private android.widget.EdgeEffect mBottomGlow;
    private androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    androidx.recyclerview.widget.ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private androidx.recyclerview.widget.RecyclerView.OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    androidx.recyclerview.widget.RecyclerView.ItemAnimator mItemAnimator;
    private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private java.lang.Runnable mItemAnimatorRunner;
    final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    androidx.recyclerview.widget.RecyclerView.LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private android.widget.EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final androidx.recyclerview.widget.RecyclerView.RecyclerViewDataObserver mObserver;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private androidx.recyclerview.widget.RecyclerView.OnFlingListener mOnFlingListener;
    private final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.OnItemTouchListener> mOnItemTouchListeners;
    final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingAccessibilityImportanceChange;
    androidx.recyclerview.widget.RecyclerView.SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final androidx.recyclerview.widget.RecyclerView.Recycler mRecycler;
    androidx.recyclerview.widget.RecyclerView.RecyclerListener mRecyclerListener;
    final java.util.List<androidx.recyclerview.widget.RecyclerView.RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private android.widget.EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener mScrollListener;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.NestedScrollingChildHelper mScrollingChildHelper;
    final androidx.recyclerview.widget.RecyclerView.State mState;
    final android.graphics.Rect mTempRect;
    private final android.graphics.Rect mTempRect2;
    final android.graphics.RectF mTempRectF;
    private android.widget.EdgeEffect mTopGlow;
    private int mTouchSlop;
    final java.lang.Runnable mUpdateChildViewsRunnable;
    private android.view.VelocityTracker mVelocityTracker;
    final androidx.recyclerview.widget.RecyclerView.ViewFlinger mViewFlinger;
    private final androidx.recyclerview.widget.ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final androidx.recyclerview.widget.ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {android.R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final java.lang.Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {android.content.Context.class, android.util.AttributeSet.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE};
    static final android.view.animation.Interpolator sQuinticInterpolator = new android.view.animation.Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.3
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    static final androidx.recyclerview.widget.RecyclerView.StretchEdgeEffectFactory sDefaultEdgeEffectFactory = new androidx.recyclerview.widget.RecyclerView.StretchEdgeEffectFactory();

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i, int i2);
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(android.view.View view);

        void onChildViewDetachedFromWindow(android.view.View view);
    }

    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i, int i2);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent);
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        }

        public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Orientation {
    }

    public interface RecyclerListener {
        void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);
    }

    public static class SimpleOnItemTouchListener implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        }
    }

    public static abstract class ViewCacheExtension {
        public abstract android.view.View getViewForPositionAndType(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i, int i2);
    }

    public void onChildAttachedToWindow(android.view.View view) {
    }

    public void onChildDetachedFromWindow(android.view.View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public RecyclerView(android.content.Context context) {
        this(context, null);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new androidx.recyclerview.widget.RecyclerView.RecyclerViewDataObserver();
        this.mRecycler = new androidx.recyclerview.widget.RecyclerView.Recycler();
        this.mViewInfoStore = new androidx.recyclerview.widget.ViewInfoStore();
        this.mUpdateChildViewsRunnable = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public void run() {
                if (!androidx.recyclerview.widget.RecyclerView.this.mFirstLayoutComplete || androidx.recyclerview.widget.RecyclerView.this.isLayoutRequested()) {
                    return;
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.mIsAttached) {
                    androidx.recyclerview.widget.RecyclerView.this.requestLayout();
                } else if (androidx.recyclerview.widget.RecyclerView.this.mLayoutSuppressed) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayoutWasDefered = true;
                } else {
                    androidx.recyclerview.widget.RecyclerView.this.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new android.graphics.Rect();
        this.mTempRect2 = new android.graphics.Rect();
        this.mTempRectF = new android.graphics.RectF();
        this.mRecyclerListeners = new java.util.ArrayList();
        this.mItemDecorations = new java.util.ArrayList<>();
        this.mOnItemTouchListeners = new java.util.ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new androidx.recyclerview.widget.RecyclerView.ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.mState = new androidx.recyclerview.widget.RecyclerView.State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new androidx.recyclerview.widget.RecyclerView.ItemAnimatorRestoreListener();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new java.util.ArrayList();
        this.mItemAnimatorRunner = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public void run() {
                if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator != null) {
                    androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.runPendingAnimations();
                }
                androidx.recyclerview.widget.RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new androidx.recyclerview.widget.ViewInfoStore.ProcessCallback() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                androidx.recyclerview.widget.RecyclerView.this.mRecycler.Camera2StreamConfigurationMap(viewHolder);
                androidx.recyclerview.widget.RecyclerView.this.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                androidx.recyclerview.widget.RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                viewHolder.setIsRecyclable(false);
                if (androidx.recyclerview.widget.RecyclerView.this.mDataSetHasChangedAfterLayout) {
                    if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                        androidx.recyclerview.widget.RecyclerView.this.postAnimationRunner();
                    }
                } else if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    androidx.recyclerview.widget.RecyclerView.this.postAnimationRunner();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
                androidx.recyclerview.widget.RecyclerView.this.mLayout.removeAndRecycleView(viewHolder.itemView, androidx.recyclerview.widget.RecyclerView.this.mRecycler);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = androidx.core.view.ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = androidx.core.view.ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (androidx.core.view.ViewCompat.getImportantForAccessibility(this) == 0) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate(this));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        java.lang.String string = obtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((android.graphics.drawable.StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (android.graphics.drawable.StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        androidx.customview.poolingcontainer.PoolingContainer.setPoolingContainer(this, true);
    }

    java.lang.String exceptionLabel() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.mAdapter);
        sb.append(", layout:");
        sb.append(this.mLayout);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    private void initAutofill() {
        if (androidx.core.view.ViewCompat.getImportantForAutofill(this) == 0) {
            androidx.core.view.ViewCompat.setImportantForAutofill(this, 8);
        }
    }

    public androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, recyclerViewAccessibilityDelegate);
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    private void createLayoutManager(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet, int i, int i2) {
        java.lang.ClassLoader classLoader;
        java.lang.reflect.Constructor constructor;
        java.lang.Object[] objArr;
        if (str != null) {
            java.lang.String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            java.lang.String fullClassName = getFullClassName(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(fullClassName, false, classLoader).asSubclass(androidx.recyclerview.widget.RecyclerView.LayoutManager.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new java.lang.Object[]{context, attributeSet, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
                } catch (java.lang.NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new java.lang.Class[0]);
                        objArr = null;
                    } catch (java.lang.NoSuchMethodException e2) {
                        e2.initCause(e);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(attributeSet.getPositionDescription());
                        sb.append(": Error creating LayoutManager ");
                        sb.append(fullClassName);
                        throw new java.lang.IllegalStateException(sb.toString(), e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((androidx.recyclerview.widget.RecyclerView.LayoutManager) constructor.newInstance(objArr));
            } catch (java.lang.ClassCastException e3) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Class is not a LayoutManager ");
                sb2.append(fullClassName);
                throw new java.lang.IllegalStateException(sb2.toString(), e3);
            } catch (java.lang.ClassNotFoundException e4) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(attributeSet.getPositionDescription());
                sb3.append(": Unable to find LayoutManager ");
                sb3.append(fullClassName);
                throw new java.lang.IllegalStateException(sb3.toString(), e4);
            } catch (java.lang.IllegalAccessException e5) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(attributeSet.getPositionDescription());
                sb4.append(": Cannot access non-public constructor ");
                sb4.append(fullClassName);
                throw new java.lang.IllegalStateException(sb4.toString(), e5);
            } catch (java.lang.InstantiationException e6) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(attributeSet.getPositionDescription());
                sb5.append(": Could not instantiate the LayoutManager: ");
                sb5.append(fullClassName);
                throw new java.lang.IllegalStateException(sb5.toString(), e6);
            } catch (java.lang.reflect.InvocationTargetException e7) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(attributeSet.getPositionDescription());
                sb6.append(": Could not instantiate the LayoutManager: ");
                sb6.append(fullClassName);
                throw new java.lang.IllegalStateException(sb6.toString(), e7);
            }
        }
    }

    private java.lang.String getFullClassName(android.content.Context context, java.lang.String str) {
        if (str.charAt(0) == '.') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        }
        if (str.contains(".")) {
            return str;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(androidx.recyclerview.widget.RecyclerView.class.getPackage().getName());
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(str);
        return sb2.toString();
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.ChildHelper(new androidx.recyclerview.widget.ChildHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final int getHighSpeedVideoFpsRangesFor() {
                return androidx.recyclerview.widget.RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final void getHighSpeedVideoFpsRangesFor(android.view.View view, int i) {
                androidx.recyclerview.widget.RecyclerView.this.addView(view, i);
                androidx.recyclerview.widget.RecyclerView.this.dispatchChildAttached(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final int getHighSpeedVideoFpsRangesFor(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
                android.view.View childAt = androidx.recyclerview.widget.RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    androidx.recyclerview.widget.RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                androidx.recyclerview.widget.RecyclerView.this.removeViewAt(i);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final android.view.View Camera2StreamConfigurationMap(int i) {
                return androidx.recyclerview.widget.RecyclerView.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final void getHighSpeedVideoFpsRanges() {
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                for (int i = 0; i < highSpeedVideoFpsRangesFor; i++) {
                    android.view.View Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
                    androidx.recyclerview.widget.RecyclerView.this.dispatchChildDetached(Camera2StreamConfigurationMap);
                    Camera2StreamConfigurationMap.clearAnimation();
                }
                androidx.recyclerview.widget.RecyclerView.this.removeAllViews();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final androidx.recyclerview.widget.RecyclerView.ViewHolder Camera2StreamConfigurationMap(android.view.View view) {
                return androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final void getHighSpeedVideoSizes(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Called attach on a child which is not detached: ");
                        sb.append(childViewHolderInt);
                        sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
                    childViewHolderInt.clearTmpDetachFlag();
                } else if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No ViewHolder found for child: ");
                    sb2.append(view);
                    sb2.append(", index: ");
                    sb2.append(i);
                    sb2.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                androidx.recyclerview.widget.RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final void getHighSpeedVideoFpsRangesFor(int i) {
                android.view.View Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
                if (Camera2StreamConfigurationMap != null) {
                    androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(Camera2StreamConfigurationMap);
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("called detach on an already detached child ");
                            sb.append(childViewHolderInt);
                            sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
                        childViewHolderInt.addFlags(256);
                    }
                } else if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No view at offset ");
                    sb2.append(i);
                    sb2.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                androidx.recyclerview.widget.RecyclerView.this.detachViewFromParent(i);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final void getHighSpeedVideoFpsRanges(android.view.View view) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public final void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(androidx.recyclerview.widget.RecyclerView.this);
                }
            }
        });
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.AdapterHelper(new androidx.recyclerview.widget.AdapterHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.6
            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final androidx.recyclerview.widget.RecyclerView.ViewHolder getHighSpeedVideoFpsRangesFor(int i) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition = androidx.recyclerview.widget.RecyclerView.this.findViewHolderForPosition(i, true);
                if (findViewHolderForPosition == null) {
                    return null;
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.mChildHelper.getHighSpeedVideoFpsRangesFor(findViewHolderForPosition.itemView)) {
                    return findViewHolderForPosition;
                }
                boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
                return null;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final void Camera2StreamConfigurationMap(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
                androidx.recyclerview.widget.RecyclerView.this.mState.getHighSpeedVideoFpsRangesFor += i2;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final void getHighSpeedVideoFpsRanges(int i, int i2, java.lang.Object obj) {
                androidx.recyclerview.widget.RecyclerView.this.viewRangeUpdate(i, i2, obj);
                androidx.recyclerview.widget.RecyclerView.this.mItemsChanged = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final void getHighSpeedVideoSizes(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
                Camera2StreamConfigurationMap(updateOp);
            }

            private void Camera2StreamConfigurationMap(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
                int i = updateOp.getHighSpeedVideoFpsRangesFor;
                if (i == 1) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsAdded(androidx.recyclerview.widget.RecyclerView.this, updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
                    return;
                }
                if (i == 2) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsRemoved(androidx.recyclerview.widget.RecyclerView.this, updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
                } else if (i == 4) {
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsUpdated(androidx.recyclerview.widget.RecyclerView.this, updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap, updateOp.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    if (i != 8) {
                        return;
                    }
                    androidx.recyclerview.widget.RecyclerView.this.mLayout.onItemsMoved(androidx.recyclerview.widget.RecyclerView.this, updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap, 1);
                }
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
                Camera2StreamConfigurationMap(updateOp);
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public final void getHighSpeedVideoSizes(int i, int i2) {
                androidx.recyclerview.widget.RecyclerView.this.offsetPositionRecordsForMove(i, i2);
                androidx.recyclerview.widget.RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i == 0 || i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void swapAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    void removeAndRecycleViews() {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.clear();
    }

    private void setAdapterInternal(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, boolean z, boolean z2) {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.getHighSpeedVideoFpsRangesFor();
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.mAdapter);
        }
        this.mRecycler.getHighSpeedVideoSizes(adapter3, this.mAdapter, z);
        this.mState.getOutputSizes = true;
    }

    public androidx.recyclerview.widget.RecyclerView.Adapter getAdapter() {
        return this.mAdapter;
    }

    @java.lang.Deprecated
    public void setRecyclerListener(androidx.recyclerview.widget.RecyclerView.RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    public void addRecyclerListener(androidx.recyclerview.widget.RecyclerView.RecyclerListener recyclerListener) {
        androidx.core.util.Preconditions.checkArgument(recyclerListener != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    public void removeRecyclerListener(androidx.recyclerview.widget.RecyclerView.RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    @Override // android.view.View
    public int getBaseline() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new java.util.ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void removeOnChildAttachStateChangeListener(androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void clearOnChildAttachStateChangeListeners() {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.clear();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.clear();
        }
        this.mChildHelper.getHighSpeedVideoSizes();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutManager ");
                sb.append(layoutManager);
                sb.append(" is already attached to a RecyclerView:");
                sb.append(layoutManager.mRecyclerView.exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.mLayout.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.getHighSpeedVideoSizesFor();
        requestLayout();
    }

    public void setOnFlingListener(androidx.recyclerview.widget.RecyclerView.OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    public androidx.recyclerview.widget.RecyclerView.OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.recyclerview.widget.RecyclerView.SavedState savedState = new androidx.recyclerview.widget.RecyclerView.SavedState(super.onSaveInstanceState());
        androidx.recyclerview.widget.RecyclerView.SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 == null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                savedState.getHighResolutionOutputSizeshNQ4ISI = layoutManager.onSaveInstanceState();
                return savedState;
            }
            savedState.getHighResolutionOutputSizeshNQ4ISI = null;
            return savedState;
        }
        savedState.getHighResolutionOutputSizeshNQ4ISI = savedState2.getHighResolutionOutputSizeshNQ4ISI;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.recyclerview.widget.RecyclerView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.recyclerview.widget.RecyclerView.SavedState savedState = (androidx.recyclerview.widget.RecyclerView.SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void addAnimatingView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.Camera2StreamConfigurationMap(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.getHighSpeedVideoFpsRanges(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (z) {
            androidx.recyclerview.widget.ChildHelper childHelper = this.mChildHelper;
            int highSpeedVideoFpsRangesFor = childHelper.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(view);
            if (highSpeedVideoFpsRangesFor < 0) {
                throw new java.lang.IllegalArgumentException("view is not a child, cannot hide ".concat(java.lang.String.valueOf(view)));
            }
            childHelper.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor);
            childHelper.getHighSpeedVideoSizes.add(view);
            childHelper.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(view);
            return;
        }
        this.mChildHelper.Camera2StreamConfigurationMap(view, -1, true);
    }

    boolean removeAnimatingView(android.view.View view) {
        startInterceptRequestLayout();
        boolean highSpeedVideoFpsRanges = this.mChildHelper.getHighSpeedVideoFpsRanges(view);
        if (highSpeedVideoFpsRanges) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.Camera2StreamConfigurationMap(childViewHolderInt);
            this.mRecycler.getHighResolutionOutputSizeshNQ4ISI(childViewHolderInt);
        }
        stopInterceptRequestLayout(!highSpeedVideoFpsRanges);
        return highSpeedVideoFpsRanges;
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public androidx.recyclerview.widget.RecyclerView.RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.getHighResolutionOutputSizeshNQ4ISI();
    }

    public void setRecycledViewPool(androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool) {
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = this.mRecycler;
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter = androidx.recyclerview.widget.RecyclerView.this.mAdapter;
        androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool2 = recycler.Camera2StreamConfigurationMap;
        if (recycledViewPool2 != null) {
            recycledViewPool2.Camera2StreamConfigurationMap(adapter, false);
        }
        if (recycler.Camera2StreamConfigurationMap != null) {
            r1.getHighSpeedVideoFpsRanges--;
        }
        recycler.Camera2StreamConfigurationMap = recycledViewPool;
        if (recycledViewPool != null && androidx.recyclerview.widget.RecyclerView.this.getAdapter() != null) {
            recycler.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        }
        recycler.getHighSpeedVideoSizes();
    }

    public void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.ViewCacheExtension viewCacheExtension) {
        this.mRecycler.getHighResolutionOutputSizeshNQ4ISI = viewCacheExtension;
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.setViewCacheSize(i);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void addItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration, int i) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    public androidx.recyclerview.widget.RecyclerView.ItemDecoration getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        return this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @java.lang.Deprecated
    public void setOnScrollListener(androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void addOnScrollListener(androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new java.util.ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void removeOnScrollListener(androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener) {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void clearOnScrollListeners() {
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(i);
        awakenScrollBars();
    }

    void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void smoothScrollToPosition(int i) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        if (this.mLayoutSuppressed || (layoutManager = this.mLayout) == null) {
            return;
        }
        layoutManager.smoothScrollToPosition(this, this.mState, i);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i = 0;
            }
            if (!canScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    private void nestedScrollByInternal(int i, int i2, android.view.MotionEvent motionEvent, int i3) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i4 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int releaseHorizontalGlow = i - releaseHorizontalGlow(i, height);
        int releaseVerticalGlow = i2 - releaseVerticalGlow(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, i3);
        androidx.recyclerview.widget.GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            gapWorker.Camera2StreamConfigurationMap(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i3);
    }

    void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.TraceCompat.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        androidx.core.os.TraceCompat.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            androidx.core.os.TraceCompat.endSection();
            return;
        }
        if (this.mAdapterHelper.getHighSpeedVideoFpsRanges()) {
            if ((this.mAdapterHelper.getHighSpeedVideoFpsRangesFor & 4) != 0 && (this.mAdapterHelper.getHighSpeedVideoFpsRangesFor & 11) == 0) {
                androidx.core.os.TraceCompat.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.Camera2StreamConfigurationMap();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                androidx.core.os.TraceCompat.endSection();
                return;
            }
            if (this.mAdapterHelper.getHighSpeedVideoFpsRanges()) {
                androidx.core.os.TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                androidx.core.os.TraceCompat.endSection();
            }
        }
    }

    private boolean hasUpdatedView() {
        int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
        for (int i = 0; i < highSpeedVideoFpsRangesFor; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    boolean scrollByInternal(int i, int i2, android.view.MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i10 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i11 = iArr5[0];
        this.mLastTouchX = i10 - i11;
        int i12 = this.mLastTouchY;
        int i13 = iArr5[1];
        this.mLastTouchY = i12 - i13;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i11;
        iArr6[1] = iArr6[1] + i13;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i6 - r1, motionEvent.getY(), i7 - r0);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float onPullDistance = androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mRightGlow, width, height);
                    if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = onPullDistance;
                }
                invalidate();
            }
        }
        return java.lang.Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        android.widget.EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mTopGlow, -height, width);
                if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            android.widget.EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float onPullDistance = androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.EdgeEffectCompat.getDistance(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = onPullDistance;
                }
                invalidate();
            }
        }
        return java.lang.Math.round(f2 * getHeight());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth <= 0) {
            if (sDebugAssertionsEnabled) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.");
                sb.append(exceptionLabel());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @java.lang.Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new java.lang.IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, android.view.animation.Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i, int i2, android.view.animation.Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    void smoothScrollBy(int i, int i2, android.view.animation.Interpolator interpolator, int i3, boolean z) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.getHighSpeedVideoFpsRanges(i, i2, i3, interpolator);
            return;
        }
        scrollBy(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fling(int i, int i2) {
        int i3;
        int i4;
        float f;
        float f2;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return false;
        }
        int canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally == 0 || java.lang.Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!canScrollVertically || java.lang.Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i != 0) {
            android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
                int i5 = -i;
                if (shouldAbsorb(this.mLeftGlow, i5, getWidth())) {
                    this.mLeftGlow.onAbsorb(i5);
                    i = 0;
                }
                i3 = 0;
            } else {
                android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                        this.mRightGlow.onAbsorb(i);
                        i = 0;
                    }
                    i3 = 0;
                }
            }
            if (i2 != 0) {
                android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
                if (edgeEffect3 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f) {
                    int i6 = -i2;
                    if (shouldAbsorb(this.mTopGlow, i6, getHeight())) {
                        this.mTopGlow.onAbsorb(i6);
                        i2 = 0;
                    }
                    i4 = 0;
                } else {
                    android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect4) != 0.0f) {
                        if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                            this.mBottomGlow.onAbsorb(i2);
                            i2 = 0;
                        }
                        i4 = 0;
                    }
                }
                if (i == 0 || i2 != 0) {
                    int i7 = this.mMaxFlingVelocity;
                    i = java.lang.Math.max(-i7, java.lang.Math.min(i, i7));
                    int i8 = this.mMaxFlingVelocity;
                    i2 = java.lang.Math.max(-i8, java.lang.Math.min(i2, i8));
                    this.mViewFlinger.getHighSpeedVideoFpsRangesFor(i, i2);
                }
                if (i3 != 0 && i4 == 0) {
                    return (i == 0 && i2 == 0) ? false : true;
                }
                f = i3;
                f2 = i4;
                if (!dispatchNestedPreFling(f, f2)) {
                    boolean z = canScrollHorizontally != 0 || canScrollVertically;
                    dispatchNestedFling(f, f2, z);
                    androidx.recyclerview.widget.RecyclerView.OnFlingListener onFlingListener = this.mOnFlingListener;
                    if (onFlingListener != null && onFlingListener.onFling(i3, i4)) {
                        return true;
                    }
                    if (z) {
                        if (canScrollVertically) {
                            canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                        }
                        startNestedScroll(canScrollHorizontally, 1);
                        int i9 = this.mMaxFlingVelocity;
                        int max = java.lang.Math.max(-i9, java.lang.Math.min(i3, i9));
                        int i10 = this.mMaxFlingVelocity;
                        this.mViewFlinger.getHighSpeedVideoFpsRangesFor(max, java.lang.Math.max(-i10, java.lang.Math.min(i4, i10)));
                        return true;
                    }
                }
                return false;
            }
            i4 = i2;
            i2 = 0;
            if (i == 0) {
            }
            int i72 = this.mMaxFlingVelocity;
            i = java.lang.Math.max(-i72, java.lang.Math.min(i, i72));
            int i82 = this.mMaxFlingVelocity;
            i2 = java.lang.Math.max(-i82, java.lang.Math.min(i2, i82));
            this.mViewFlinger.getHighSpeedVideoFpsRangesFor(i, i2);
            if (i3 != 0) {
            }
            f = i3;
            f2 = i4;
            if (!dispatchNestedPreFling(f, f2)) {
            }
            return false;
        }
        i3 = i;
        i = 0;
        if (i2 != 0) {
        }
        i4 = i2;
        i2 = 0;
        if (i == 0) {
        }
        int i722 = this.mMaxFlingVelocity;
        i = java.lang.Math.max(-i722, java.lang.Math.min(i, i722));
        int i822 = this.mMaxFlingVelocity;
        i2 = java.lang.Math.max(-i822, java.lang.Math.min(i2, i822));
        this.mViewFlinger.getHighSpeedVideoFpsRangesFor(i, i2);
        if (i3 != 0) {
        }
        f = i3;
        f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
        }
        return false;
    }

    private boolean shouldAbsorb(android.widget.EdgeEffect edgeEffect, int i, int i2) {
        return i > 0 || getSplineFlingDistance(-i) < androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) * ((float) i2);
    }

    int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    private int consumeFlingInStretch(int i, android.widget.EdgeEffect edgeEffect, android.widget.EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            int round = java.lang.Math.round(((-i2) / 4.0f) * androidx.core.widget.EdgeEffectCompat.onPullDistance(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = java.lang.Math.round((f / 4.0f) * androidx.core.widget.EdgeEffectCompat.onPullDistance(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.getHighSpeedVideoSizes();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        if (f2 < 0.0f) {
            ensureLeftGlow();
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        } else if (f2 > 0.0f) {
            ensureRightGlow();
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
        } else {
            z = false;
            if (f4 >= 0.0f) {
                ensureTopGlow();
                androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else if (!z && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
        z = true;
        if (f4 >= 0.0f) {
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
    }

    private void releaseGlows() {
        boolean z;
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        android.widget.EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        this.mLeftGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            createEdgeEffect.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        createEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        android.widget.EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        this.mRightGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            createEdgeEffect.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        createEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        android.widget.EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        this.mTopGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            createEdgeEffect.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        createEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        android.widget.EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        this.mBottomGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            createEdgeEffect.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        createEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setEdgeEffectFactory(androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory edgeEffectFactory) {
        androidx.core.util.Preconditions.checkNotNull(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View view, int i) {
        android.view.View view2;
        boolean z;
        android.view.View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            android.view.View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    private boolean isPreferredNextFocus(android.view.View view, android.view.View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        if ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) {
            i2 = 1;
        } else {
            i2 = ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            c = 0;
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid direction: ");
        sb.append(i);
        sb.append(exceptionLabel());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void requestChildOnScreen(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
            if (!layoutParams2.getHighResolutionOutputSizeshNQ4ISI) {
                android.graphics.Rect rect = layoutParams2.getHighSpeedVideoFpsRangesFor;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r0 < 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.getHighSpeedVideoSizes();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            androidx.recyclerview.widget.GapWorker gapWorker = androidx.recyclerview.widget.GapWorker.Camera2StreamConfigurationMap.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                this.mGapWorker = new androidx.recyclerview.widget.GapWorker();
                android.view.Display display = androidx.core.view.ViewCompat.getDisplay(this);
                if (!isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                this.mGapWorker.getHighSpeedVideoSizes = (long) (1.0E9f / f);
                androidx.recyclerview.widget.GapWorker.Camera2StreamConfigurationMap.set(this.mGapWorker);
            }
            this.mGapWorker.getHighSpeedVideoSizes(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.GapWorker gapWorker;
        super.onDetachedFromWindow();
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        androidx.recyclerview.widget.ViewInfoStore.Camera2StreamConfigurationMap();
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = this.mRecycler;
        for (int i = 0; i < recycler.getHighSpeedVideoFpsRanges.size(); i++) {
            androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(recycler.getHighSpeedVideoFpsRanges.get(i).itemView);
        }
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter = androidx.recyclerview.widget.RecyclerView.this.mAdapter;
        androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool = recycler.Camera2StreamConfigurationMap;
        if (recycledViewPool != null) {
            recycledViewPool.Camera2StreamConfigurationMap(adapter, false);
        }
        androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnReleaseForChildren(this);
        if (!ALLOW_THREAD_GAP_WORK || (gapWorker = this.mGapWorker) == null) {
            return;
        }
        gapWorker.getHighSpeedVideoFpsRanges(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    void assertInLayoutOrScroll(java.lang.String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            sb.append(exceptionLabel());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(exceptionLabel());
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    void assertNotInLayoutOrScroll(java.lang.String str) {
        if (isComputingLayout()) {
            if (str == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(exceptionLabel());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            throw new java.lang.IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
            sb2.append(exceptionLabel());
            new java.lang.IllegalStateException(sb2.toString());
        }
    }

    public void addOnItemTouchListener(androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void removeOnItemTouchListener(androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    private boolean dispatchToOnItemTouchListeners(android.view.MotionEvent motionEvent) {
        androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            androidx.recyclerview.widget.RecyclerView.OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        if (r0 != false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = canScrollHorizontally;
            if (canScrollVertically) {
                i = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = this.mInitialTouchX;
                int i3 = this.mInitialTouchY;
                if (canScrollHorizontally == 0 || java.lang.Math.abs(x2 - i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (canScrollVertically && java.lang.Math.abs(y2 - i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    private boolean stopGlowAnimations(android.view.MotionEvent motionEvent) {
        boolean z;
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        android.widget.EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        android.widget.EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        androidx.core.widget.EdgeEffectCompat.onPullDistance(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            int i = canScrollHorizontally;
            if (canScrollVertically) {
                i = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = canScrollHorizontally != 0 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i2 = this.mLastTouchX - x2;
                int i3 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (canScrollHorizontally != 0) {
                        if (i2 > 0) {
                            i2 = java.lang.Math.max(0, i2 - this.mTouchSlop);
                        } else {
                            i2 = java.lang.Math.min(0, i2 + this.mTouchSlop);
                        }
                        if (i2 != 0) {
                            z = true;
                            if (canScrollVertically) {
                                if (i3 > 0) {
                                    i3 = java.lang.Math.max(0, i3 - this.mTouchSlop);
                                } else {
                                    i3 = java.lang.Math.min(0, i3 + this.mTouchSlop);
                                }
                                if (i3 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                    }
                    z = false;
                    if (canScrollVertically) {
                    }
                    if (z) {
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int releaseHorizontalGlow = i2 - releaseHorizontalGlow(i2, motionEvent.getY());
                    int releaseVerticalGlow = i3 - releaseVerticalGlow(i3, motionEvent.getX());
                    if (dispatchNestedPreScroll(canScrollHorizontally != 0 ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        releaseHorizontalGlow -= iArr4[0];
                        releaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i4 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i4 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i5 = releaseVerticalGlow;
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(canScrollHorizontally != 0 ? releaseHorizontalGlow : 0, canScrollVertically ? i5 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.GapWorker gapWorker = this.mGapWorker;
                    if (gapWorker != null && (releaseHorizontalGlow != 0 || i5 != 0)) {
                        gapWorker.Camera2StreamConfigurationMap(this, releaseHorizontalGlow, i5);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    private void resetScroll() {
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void onPointerUp(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    f2 = motionEvent.getAxisValue(26);
                    if (!this.mLayout.canScrollVertically()) {
                        if (this.mLayout.canScrollHorizontally()) {
                            f = 0.0f;
                            if (f == 0.0f) {
                            }
                            nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                        }
                    } else {
                        f = -f2;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.getInputFormats == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.getHighSpeedVideoSizesFor = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.getHighSpeedVideoSizesFor = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            if (this.mState.getOutputMinFrameDurationlomOqCM) {
                this.mState.Camera2StreamConfigurationMap = true;
            } else {
                this.mAdapterHelper.getHighSpeedVideoSizes();
                this.mState.Camera2StreamConfigurationMap = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.getOutputMinFrameDurationlomOqCM) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.getInputSizeshNQ4ISI = adapter.getItemCount();
        } else {
            this.mState.getInputSizeshNQ4ISI = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.Camera2StreamConfigurationMap = false;
    }

    void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i, getPaddingLeft() + getPaddingRight(), androidx.core.view.ViewCompat.getMinimumWidth(this)), androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(i2, getPaddingTop() + getPaddingBottom(), androidx.core.view.ViewCompat.getMinimumHeight(this)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator) {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i <= 0) {
            if (sDebugAssertionsEnabled && i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching");
                sb.append(exceptionLabel());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    boolean isAccessibilityEnabled() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        androidx.core.view.accessibility.AccessibilityEventCompat.setContentChangeTypes(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    boolean shouldDeferAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? androidx.core.view.accessibility.AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public androidx.recyclerview.widget.RecyclerView.ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        androidx.core.view.ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.getHighSpeedVideoFpsRangesFor();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.Camera2StreamConfigurationMap();
        } else {
            this.mAdapterHelper.getHighSpeedVideoSizes();
        }
        boolean z = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.getOutputStallDurationlomOqCM = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z || this.mLayout.mRequestedSimpleAnimations) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds());
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        state.getOutputMinFrameDurationlomOqCM = state.getOutputStallDurationlomOqCM && z && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.getHighSpeedVideoSizesFor = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.getInputFormats == 1) {
            dispatchLayoutStep1();
        } else {
            androidx.recyclerview.widget.AdapterHelper adapterHelper = this.mAdapterHelper;
            if ((adapterHelper.getInputFormats.isEmpty() || adapterHelper.getHighSpeedVideoSizesFor.isEmpty()) && !z && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep3();
            }
        }
        this.mLayout.setExactMeasureSpecsFrom(this);
        dispatchLayoutStep2();
        dispatchLayoutStep3();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        android.view.View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        androidx.recyclerview.widget.RecyclerView.ViewHolder findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.getHighSpeedVideoSizes = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        }
        state.getHighSpeedVideoFpsRanges = absoluteAdapterPosition;
        this.mState.getHighResolutionOutputSizeshNQ4ISI = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void resetFocusInfo() {
        this.mState.getHighSpeedVideoSizes = -1L;
        this.mState.getHighSpeedVideoFpsRanges = -1;
        this.mState.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    private android.view.View findNextViewToFocus() {
        androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int i = this.mState.getHighSpeedVideoFpsRanges != -1 ? this.mState.getHighSpeedVideoFpsRanges : 0;
        int itemCount = this.mState.getItemCount();
        for (int i2 = i; i2 < itemCount; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = java.lang.Math.min(itemCount, i);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    private void recoverFocusFromState() {
        android.view.View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            android.view.View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.getHighSpeedVideoFpsRangesFor() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.getHighSpeedVideoFpsRangesFor(focusedChild)) {
                return;
            }
        }
        android.view.View view = null;
        androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForItemId = (this.mState.getHighSpeedVideoSizes == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.getHighSpeedVideoSizes);
        if (findViewHolderForItemId == null || this.mChildHelper.getHighSpeedVideoFpsRangesFor(findViewHolderForItemId.itemView) || !findViewHolderForItemId.itemView.hasFocusable()) {
            if (this.mChildHelper.getHighSpeedVideoFpsRangesFor() > 0) {
                view = findNextViewToFocus();
            }
        } else {
            view = findViewHolderForItemId.itemView;
        }
        if (view != null) {
            if (this.mState.getHighResolutionOutputSizeshNQ4ISI != -1 && (findViewById = view.findViewById(this.mState.getHighResolutionOutputSizeshNQ4ISI)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private int getDeepestFocusedViewWithId(android.view.View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof android.view.ViewGroup) && view.hasFocus()) {
            view = ((android.view.ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    final void fillRemainingScrollValues(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getScrollState() == 2) {
            android.widget.OverScroller overScroller = this.mViewFlinger.Camera2StreamConfigurationMap;
            state.getOutputFormats = overScroller.getFinalX() - overScroller.getCurrX();
            state.getOutputSizeshNQ4ISI = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            state.getOutputFormats = 0;
            state.getOutputSizeshNQ4ISI = 0;
        }
    }

    private void dispatchLayoutStep1() {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord;
        this.mState.getHighSpeedVideoFpsRanges(1);
        fillRemainingScrollValues(this.mState);
        this.mState.getHighSpeedVideoSizesFor = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.getHighSpeedVideoSizes();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        state.isOutputSupportedForhNQ4ISI = state.getOutputStallDurationlomOqCM && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        androidx.recyclerview.widget.RecyclerView.State state2 = this.mState;
        state2.Camera2StreamConfigurationMap = state2.getOutputMinFrameDurationlomOqCM;
        this.mState.getInputSizeshNQ4ISI = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.getOutputStallDurationlomOqCM) {
            int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
            for (int i = 0; i < highSpeedVideoFpsRangesFor; i++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.getHighSpeedVideoSizes(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.isOutputSupportedForhNQ4ISI && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.getHighSpeedVideoSizes.put(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.getOutputMinFrameDurationlomOqCM) {
            saveOldPositions();
            boolean z = this.mState.getOutputSizes;
            this.mState.getOutputSizes = false;
            this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
            this.mState.getOutputSizes = z;
            for (int i2 = 0; i2 < this.mChildHelper.getHighSpeedVideoFpsRangesFor(); i2++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i2));
                if (!childViewHolderInt2.shouldIgnore() && ((infoRecord = this.mViewInfoStore.getHighSpeedVideoFpsRangesFor.get(childViewHolderInt2)) == null || (infoRecord.Camera2StreamConfigurationMap & 4) == 0)) {
                    int buildAdapterChangeFlagsForAnimations = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        androidx.recyclerview.widget.ViewInfoStore viewInfoStore = this.mViewInfoStore;
                        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord2 = viewInfoStore.getHighSpeedVideoFpsRangesFor.get(childViewHolderInt2);
                        if (infoRecord2 == null) {
                            infoRecord2 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighResolutionOutputSizeshNQ4ISI();
                            viewInfoStore.getHighSpeedVideoFpsRangesFor.put(childViewHolderInt2, infoRecord2);
                        }
                        infoRecord2.Camera2StreamConfigurationMap |= 2;
                        infoRecord2.getHighSpeedVideoSizes = recordPreLayoutInformation;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.getInputFormats = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.getHighSpeedVideoFpsRanges(6);
        this.mAdapterHelper.getHighSpeedVideoSizes();
        this.mState.getInputSizeshNQ4ISI = this.mAdapter.getItemCount();
        this.mState.getHighSpeedVideoFpsRangesFor = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            if (this.mPendingSavedState.getHighResolutionOutputSizeshNQ4ISI != null) {
                this.mLayout.onRestoreInstanceState(this.mPendingSavedState.getHighResolutionOutputSizeshNQ4ISI);
            }
            this.mPendingSavedState = null;
        }
        this.mState.Camera2StreamConfigurationMap = false;
        this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
        this.mState.getOutputSizes = false;
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        state.getOutputStallDurationlomOqCM = state.getOutputStallDurationlomOqCM && this.mItemAnimator != null;
        this.mState.getInputFormats = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.getHighSpeedVideoFpsRanges(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.getInputFormats = 1;
        if (this.mState.getOutputStallDurationlomOqCM) {
            for (int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor() - 1; highSpeedVideoFpsRangesFor >= 0; highSpeedVideoFpsRangesFor--) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    androidx.recyclerview.widget.RecyclerView.ViewHolder highSpeedVideoFpsRanges = this.mViewInfoStore.getHighSpeedVideoFpsRanges(changedHolderKey);
                    if (highSpeedVideoFpsRanges != null && !highSpeedVideoFpsRanges.shouldIgnore()) {
                        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.mViewInfoStore.getHighSpeedVideoFpsRangesFor.get(highSpeedVideoFpsRanges);
                        boolean z = (infoRecord == null || (infoRecord.Camera2StreamConfigurationMap & 1) == 0) ? false : true;
                        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord2 = this.mViewInfoStore.getHighSpeedVideoFpsRangesFor.get(childViewHolderInt);
                        boolean z2 = (infoRecord2 == null || (infoRecord2.Camera2StreamConfigurationMap & 1) == 0) ? false : true;
                        if (!z || highSpeedVideoFpsRanges != childViewHolderInt) {
                            androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo highSpeedVideoSizes = this.mViewInfoStore.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, 4);
                            this.mViewInfoStore.Camera2StreamConfigurationMap(childViewHolderInt, recordPostLayoutInformation);
                            androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo highSpeedVideoSizes2 = this.mViewInfoStore.getHighSpeedVideoSizes(childViewHolderInt, 8);
                            if (highSpeedVideoSizes == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, highSpeedVideoFpsRanges);
                            } else {
                                animateChange(highSpeedVideoFpsRanges, childViewHolderInt, highSpeedVideoSizes, highSpeedVideoSizes2, z, z2);
                            }
                        }
                    }
                    this.mViewInfoStore.Camera2StreamConfigurationMap(childViewHolderInt, recordPostLayoutInformation);
                }
            }
            this.mViewInfoStore.Camera2StreamConfigurationMap(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        androidx.recyclerview.widget.RecyclerView.State state = this.mState;
        state.getOutputMinFrameDuration = state.getInputSizeshNQ4ISI;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.getOutputStallDurationlomOqCM = false;
        this.mState.getOutputMinFrameDurationlomOqCM = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        if (this.mRecycler.getHighSpeedVideoSizes != null) {
            this.mRecycler.getHighSpeedVideoSizes.clear();
        }
        if (this.mLayout.mPrefetchMaxObservedInInitialPrefetch) {
            this.mLayout.mPrefetchMaxCountObserved = 0;
            this.mLayout.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.getHighSpeedVideoSizesFor();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.getHighSpeedVideoSizes();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long j, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
        int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
        for (int i = 0; i < highSpeedVideoFpsRangesFor; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j) {
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
                if (adapter != null && adapter.hasStableIds()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(viewHolder);
                    sb.append(exceptionLabel());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(viewHolder);
                sb2.append(exceptionLabel());
                throw new java.lang.IllegalStateException(sb2.toString());
            }
        }
        exceptionLabel();
    }

    void recordAnimationInfoIfBouncedHiddenView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.isOutputSupportedForhNQ4ISI && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.getHighSpeedVideoSizes.put(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.getHighSpeedVideoSizes(viewHolder, itemHolderInfo);
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < highSpeedVideoFpsRangesFor; i3++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View view, boolean z) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                sb.append(exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        } else if (sDebugAssertionsEnabled) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(exceptionLabel());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    long getChangedHolderKey(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    void animateAppearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private void animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.Camera2StreamConfigurationMap(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        androidx.core.os.TraceCompat.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.TraceCompat.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void markItemDecorInsetsDirty() {
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i = 0; i < highResolutionOutputSizeshNQ4ISI; i++) {
            ((androidx.recyclerview.widget.RecyclerView.LayoutParams) this.mChildHelper.getHighSpeedVideoSizes(i).getLayoutParams()).getHighResolutionOutputSizeshNQ4ISI = true;
        }
        this.mRecycler.getInputFormats();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        android.widget.EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) && !z) {
            return;
        }
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) && this.mLayout.checkLayoutParams((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecyclerView has no LayoutManager");
            sb.append(exceptionLabel());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return layoutManager.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecyclerView has no LayoutManager");
            sb.append(exceptionLabel());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return layoutManager.generateLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecyclerView has no LayoutManager");
            sb.append(exceptionLabel());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return layoutManager.generateLayoutParams(layoutParams);
    }

    public boolean isAnimating() {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    void saveOldPositions() {
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i = 0; i < highResolutionOutputSizeshNQ4ISI; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("view holder cannot have position -1 unless it is removed");
                sb.append(exceptionLabel());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    void clearOldPositions() {
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i = 0; i < highResolutionOutputSizeshNQ4ISI; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.Camera2StreamConfigurationMap();
    }

    void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        int i8 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i9 = 0; i9 < highResolutionOutputSizeshNQ4ISI; i9++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i9));
            if (childViewHolderInt != null && childViewHolderInt.mPosition >= i4 && childViewHolderInt.mPosition <= i3) {
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.getOutputSizes = true;
            }
        }
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = this.mRecycler;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i8 = 1;
            i7 = i2;
        }
        int size = recycler.getHighSpeedVideoFpsRanges.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = recycler.getHighSpeedVideoFpsRanges.get(i10);
            if (viewHolder != null && viewHolder.mPosition >= i7 && viewHolder.mPosition <= i6) {
                if (viewHolder.mPosition == i) {
                    viewHolder.offsetPosition(i2 - i, false);
                } else {
                    viewHolder.offsetPosition(i8, false);
                }
            }
        }
        requestLayout();
    }

    void offsetPositionRecordsForInsert(int i, int i2) {
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i3 = 0; i3 < highResolutionOutputSizeshNQ4ISI; i3++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    int i4 = childViewHolderInt.mPosition;
                }
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.getOutputSizes = true;
            }
        }
        this.mRecycler.getHighSpeedVideoSizes(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i3 = 0; i3 < highResolutionOutputSizeshNQ4ISI; i3++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.mPosition >= i + i2) {
                    if (sVerboseLoggingEnabled) {
                        int i4 = childViewHolderInt.mPosition;
                    }
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.getOutputSizes = true;
                } else if (childViewHolderInt.mPosition >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.getOutputSizes = true;
                }
            }
        }
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = this.mRecycler;
        for (int size = recycler.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = recycler.getHighSpeedVideoFpsRanges.get(size);
            if (viewHolder != null) {
                if (viewHolder.mPosition >= i + i2) {
                    if (sVerboseLoggingEnabled) {
                        int i5 = viewHolder.mPosition;
                    }
                    viewHolder.offsetPosition(-i2, z);
                } else if (viewHolder.mPosition >= i) {
                    viewHolder.addFlags(8);
                    recycler.Camera2StreamConfigurationMap(size);
                }
            }
        }
        requestLayout();
    }

    void viewRangeUpdate(int i, int i2, java.lang.Object obj) {
        int i3;
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i4 = 0; i4 < highResolutionOutputSizeshNQ4ISI; i4++) {
            android.view.View highSpeedVideoSizes = this.mChildHelper.getHighSpeedVideoSizes(i4);
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(highSpeedVideoSizes);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i && childViewHolderInt.mPosition < i + i2) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((androidx.recyclerview.widget.RecyclerView.LayoutParams) highSpeedVideoSizes.getLayoutParams()).getHighResolutionOutputSizeshNQ4ISI = true;
            }
        }
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = this.mRecycler;
        for (int size = recycler.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = recycler.getHighSpeedVideoFpsRanges.get(size);
            if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i2 + i) {
                viewHolder.addFlags(2);
                recycler.Camera2StreamConfigurationMap(size);
            }
        }
    }

    boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void markKnownViewsInvalid() {
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i = 0; i < highResolutionOutputSizeshNQ4ISI; i++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.getInputSizeshNQ4ISI();
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolder(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return getChildViewHolderInt(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.View findContainingItemView(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof android.view.View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findContainingViewHolder(android.view.View view) {
        android.view.View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    static androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolderInt(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getOutputMinFrameDuration;
    }

    @java.lang.Deprecated
    public int getChildPosition(android.view.View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt;
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition(int i) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        for (int i2 = 0; i2 < highResolutionOutputSizeshNQ4ISI; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.getHighSpeedVideoFpsRangesFor(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int i, boolean z) {
        int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = null;
        for (int i2 = 0; i2 < highResolutionOutputSizeshNQ4ISI; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                    if (this.mChildHelper.getHighSpeedVideoFpsRangesFor(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i) {
                        continue;
                    }
                    if (this.mChildHelper.getHighSpeedVideoFpsRangesFor(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return viewHolder;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForItemId(long j) {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI();
            for (int i = 0; i < highResolutionOutputSizeshNQ4ISI; i++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getHighSpeedVideoSizes(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.getHighSpeedVideoFpsRangesFor(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public android.view.View findChildViewUnder(float f, float f2) {
        for (int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor() - 1; highSpeedVideoFpsRangesFor >= 0; highSpeedVideoFpsRangesFor--) {
            android.view.View highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
            float translationX = highResolutionOutputSizeshNQ4ISI.getTranslationX();
            float translationY = highResolutionOutputSizeshNQ4ISI.getTranslationY();
            if (f >= highResolutionOutputSizeshNQ4ISI.getLeft() + translationX && f <= highResolutionOutputSizeshNQ4ISI.getRight() + translationX && f2 >= highResolutionOutputSizeshNQ4ISI.getTop() + translationY && f2 <= highResolutionOutputSizeshNQ4ISI.getBottom() + translationY) {
                return highResolutionOutputSizeshNQ4ISI;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
        for (int i2 = 0; i2 < highSpeedVideoFpsRangesFor; i2++) {
            this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
        for (int i2 = 0; i2 < highSpeedVideoFpsRangesFor; i2++) {
            this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(android.view.View view, android.graphics.Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    static void getDecoratedBoundsWithMarginsInt(android.view.View view, android.graphics.Rect rect) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect2 = layoutParams.getHighSpeedVideoFpsRangesFor;
        int left = view.getLeft();
        int i = rect2.left;
        int i2 = layoutParams.leftMargin;
        int top = view.getTop();
        int i3 = rect2.top;
        int i4 = layoutParams.topMargin;
        int right = view.getRight();
        int i5 = rect2.right;
        rect.set((left - i) - i2, (top - i3) - i4, right + i5 + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    android.graphics.Rect getItemDecorInsetsForChild(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (!layoutParams.getHighResolutionOutputSizeshNQ4ISI) {
            return layoutParams.getHighSpeedVideoFpsRangesFor;
        }
        if (this.mState.isPreLayout() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.getHighSpeedVideoFpsRangesFor;
        }
        android.graphics.Rect rect = layoutParams.getHighSpeedVideoFpsRangesFor;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        layoutParams.getHighResolutionOutputSizeshNQ4ISI = false;
        return rect;
    }

    void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    private float getSplineFlingDistance(int i) {
        double log = java.lang.Math.log((java.lang.Math.abs(i) * 0.35f) / (this.mPhysicalCoef * SCROLL_FRICTION));
        double d = DECELERATION_RATE;
        return (float) (this.mPhysicalCoef * SCROLL_FRICTION * java.lang.Math.exp((d / (d - 1.0d)) * log));
    }

    void dispatchOnScrollStateChanged(int i) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.getHighSpeedVideoFpsRanges();
    }

    class ViewFlinger implements java.lang.Runnable {
        android.widget.OverScroller Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;
        private int getOutputFormats;
        android.view.animation.Interpolator getHighSpeedVideoSizes = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private boolean getInputSizeshNQ4ISI = false;

        ViewFlinger() {
            this.Camera2StreamConfigurationMap = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            if (androidx.recyclerview.widget.RecyclerView.this.mLayout == null) {
                getHighSpeedVideoSizes();
                return;
            }
            this.getInputSizeshNQ4ISI = false;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            androidx.recyclerview.widget.RecyclerView.this.consumePendingUpdateOperations();
            android.widget.OverScroller overScroller = this.Camera2StreamConfigurationMap;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = this.getHighSpeedVideoFpsRanges;
                int i4 = this.getOutputFormats;
                this.getHighSpeedVideoFpsRanges = currX;
                this.getOutputFormats = currY;
                int consumeFlingInHorizontalStretch = androidx.recyclerview.widget.RecyclerView.this.consumeFlingInHorizontalStretch(currX - i3);
                int consumeFlingInVerticalStretch = androidx.recyclerview.widget.RecyclerView.this.consumeFlingInVerticalStretch(currY - i4);
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0] = 0;
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1] = 0;
                androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
                if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, recyclerView.mReusableIntPair, null, 1)) {
                    consumeFlingInHorizontalStretch -= androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0];
                    consumeFlingInVerticalStretch -= androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1];
                }
                if (androidx.recyclerview.widget.RecyclerView.this.getOverScrollMode() != 2) {
                    androidx.recyclerview.widget.RecyclerView.this.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                if (androidx.recyclerview.widget.RecyclerView.this.mAdapter != null) {
                    androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0] = 0;
                    androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1] = 0;
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = androidx.recyclerview.widget.RecyclerView.this;
                    recyclerView2.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, recyclerView2.mReusableIntPair);
                    i = androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0];
                    i2 = androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1];
                    consumeFlingInHorizontalStretch -= i;
                    consumeFlingInVerticalStretch -= i2;
                    androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = androidx.recyclerview.widget.RecyclerView.this.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else {
                            if (smoothScroller.getTargetPosition() >= itemCount) {
                                smoothScroller.setTargetPosition(itemCount - 1);
                            }
                            smoothScroller.onAnimation(i, i2);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.mItemDecorations.isEmpty()) {
                    androidx.recyclerview.widget.RecyclerView.this.invalidate();
                }
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0] = 0;
                androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1] = 0;
                androidx.recyclerview.widget.RecyclerView recyclerView3 = androidx.recyclerview.widget.RecyclerView.this;
                recyclerView3.dispatchNestedScroll(i, i2, consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, null, 1, recyclerView3.mReusableIntPair);
                int i5 = consumeFlingInHorizontalStretch - androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[0];
                int i6 = consumeFlingInVerticalStretch - androidx.recyclerview.widget.RecyclerView.this.mReusableIntPair[1];
                if (i != 0 || i2 != 0) {
                    androidx.recyclerview.widget.RecyclerView.this.dispatchOnScrolled(i, i2);
                }
                if (!androidx.recyclerview.widget.RecyclerView.this.awakenScrollBars()) {
                    androidx.recyclerview.widget.RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller2 = androidx.recyclerview.widget.RecyclerView.this.mLayout.mSmoothScroller;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z) {
                    if (androidx.recyclerview.widget.RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        androidx.recyclerview.widget.RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.getHighResolutionOutputSizeshNQ4ISI();
                    }
                } else {
                    Camera2StreamConfigurationMap();
                    if (androidx.recyclerview.widget.RecyclerView.this.mGapWorker != null) {
                        androidx.recyclerview.widget.RecyclerView.this.mGapWorker.Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.this, i, i2);
                    }
                }
            }
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller3 = androidx.recyclerview.widget.RecyclerView.this.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            if (this.getInputSizeshNQ4ISI) {
                getHighSpeedVideoFpsRangesFor();
            } else {
                androidx.recyclerview.widget.RecyclerView.this.setScrollState(0);
                androidx.recyclerview.widget.RecyclerView.this.stopNestedScroll(1);
            }
        }

        final void Camera2StreamConfigurationMap() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getInputSizeshNQ4ISI = true;
            } else {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        private void getHighSpeedVideoFpsRangesFor() {
            androidx.recyclerview.widget.RecyclerView.this.removeCallbacks(this);
            androidx.core.view.ViewCompat.postOnAnimation(androidx.recyclerview.widget.RecyclerView.this, this);
        }

        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.this.setScrollState(2);
            this.getOutputFormats = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            if (this.getHighSpeedVideoSizes != androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator) {
                this.getHighSpeedVideoSizes = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator;
                this.Camera2StreamConfigurationMap = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator);
            }
            this.Camera2StreamConfigurationMap.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            Camera2StreamConfigurationMap();
        }

        public final void getHighSpeedVideoFpsRanges(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = getHighSpeedVideoSizes(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator;
            }
            if (this.getHighSpeedVideoSizes != interpolator) {
                this.getHighSpeedVideoSizes = interpolator;
                this.Camera2StreamConfigurationMap = new android.widget.OverScroller(androidx.recyclerview.widget.RecyclerView.this.getContext(), interpolator);
            }
            this.getOutputFormats = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            androidx.recyclerview.widget.RecyclerView.this.setScrollState(2);
            this.Camera2StreamConfigurationMap.startScroll(0, 0, i, i2, i4);
            Camera2StreamConfigurationMap();
        }

        private int getHighSpeedVideoSizes(int i, int i2) {
            int abs = java.lang.Math.abs(i);
            int abs2 = java.lang.Math.abs(i2);
            boolean z = abs > abs2;
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return java.lang.Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        public final void getHighSpeedVideoSizes() {
            androidx.recyclerview.widget.RecyclerView.this.removeCallbacks(this);
            this.Camera2StreamConfigurationMap.abortAnimation();
        }
    }

    void repositionShadowingViews() {
        int highSpeedVideoFpsRangesFor = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
        for (int i = 0; i < highSpeedVideoFpsRangesFor; i++) {
            android.view.View highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(i);
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = getChildViewHolder(highResolutionOutputSizeshNQ4ISI);
            if (childViewHolder != null && childViewHolder.mShadowingHolder != null) {
                android.view.View view = childViewHolder.mShadowingHolder.itemView;
                int left = highResolutionOutputSizeshNQ4ISI.getLeft();
                int top = highResolutionOutputSizeshNQ4ISI.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    class RecyclerViewDataObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.RecyclerView.this.mState.getOutputSizes = true;
            androidx.recyclerview.widget.RecyclerView.this.processDataSetCompletelyChanged(true);
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRanges()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.AdapterHelper adapterHelper = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper;
            if (i2 > 0) {
                adapterHelper.getHighSpeedVideoSizesFor.add(adapterHelper.getHighSpeedVideoFpsRangesFor(4, i, i2, obj));
                adapterHelper.getHighSpeedVideoFpsRangesFor |= 4;
                if (adapterHelper.getHighSpeedVideoSizesFor.size() == 1) {
                    getHighSpeedVideoFpsRangesFor();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRangesFor(i, i2)) {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.AdapterHelper adapterHelper = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper;
            if (i2 > 0) {
                adapterHelper.getHighSpeedVideoSizesFor.add(adapterHelper.getHighSpeedVideoFpsRangesFor(2, i, i2, null));
                adapterHelper.getHighSpeedVideoFpsRangesFor |= 2;
                if (adapterHelper.getHighSpeedVideoSizesFor.size() == 1) {
                    getHighSpeedVideoFpsRangesFor();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            androidx.recyclerview.widget.RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.AdapterHelper adapterHelper = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper;
            if (i == i2) {
                return;
            }
            if (i3 != 1) {
                throw new java.lang.IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            adapterHelper.getHighSpeedVideoSizesFor.add(adapterHelper.getHighSpeedVideoFpsRangesFor(8, i, i2, null));
            adapterHelper.getHighSpeedVideoFpsRangesFor |= 8;
            if (adapterHelper.getHighSpeedVideoSizesFor.size() == 1) {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        private void getHighSpeedVideoFpsRangesFor() {
            if (androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION && androidx.recyclerview.widget.RecyclerView.this.mHasFixedSize && androidx.recyclerview.widget.RecyclerView.this.mIsAttached) {
                androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
                androidx.core.view.ViewCompat.postOnAnimation(recyclerView, recyclerView.mUpdateChildViewsRunnable);
            } else {
                androidx.recyclerview.widget.RecyclerView.this.mAdapterUpdateDuringMeasure = true;
                androidx.recyclerview.widget.RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            androidx.recyclerview.widget.RecyclerView.Adapter adapter;
            if (androidx.recyclerview.widget.RecyclerView.this.mPendingSavedState == null || (adapter = androidx.recyclerview.widget.RecyclerView.this.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.requestLayout();
        }
    }

    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface EdgeDirection {
        }

        protected android.widget.EdgeEffect createEdgeEffect(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
            return new android.widget.EdgeEffect(recyclerView.getContext());
        }
    }

    static class StretchEdgeEffectFactory extends androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory {
        StretchEdgeEffectFactory() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        protected android.widget.EdgeEffect createEdgeEffect(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
            return new android.widget.EdgeEffect(recyclerView.getContext());
        }
    }

    public static class RecycledViewPool {
        android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData> getHighResolutionOutputSizeshNQ4ISI = new android.util.SparseArray<>();
        int getHighSpeedVideoFpsRanges = 0;
        java.util.Set<androidx.recyclerview.widget.RecyclerView.Adapter<?>> Camera2StreamConfigurationMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());

        static class ScrapData {
            final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> getHighSpeedVideoSizes = new java.util.ArrayList<>();
            int getHighSpeedVideoFpsRangesFor = 5;
            long getHighResolutionOutputSizeshNQ4ISI = 0;
            long Camera2StreamConfigurationMap = 0;

            ScrapData() {
            }
        }

        public void clear() {
            for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData valueAt = this.getHighResolutionOutputSizeshNQ4ISI.valueAt(i);
                java.util.Iterator<androidx.recyclerview.widget.RecyclerView.ViewHolder> it = valueAt.getHighSpeedVideoSizes.iterator();
                while (it.hasNext()) {
                    androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(it.next().itemView);
                }
                valueAt.getHighSpeedVideoSizes.clear();
            }
        }

        public void setMaxRecycledViews(int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = i2;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int getRecycledViewCount(int i) {
            return Camera2StreamConfigurationMap(i).getHighSpeedVideoSizes.size();
        }

        public androidx.recyclerview.widget.RecyclerView.ViewHolder getRecycledView(int i) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapData = this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            if (scrapData == null || scrapData.getHighSpeedVideoSizes.isEmpty()) {
                return null;
            }
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = scrapData.getHighSpeedVideoSizes;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public void putRecycledView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = Camera2StreamConfigurationMap(itemViewType).getHighSpeedVideoSizes;
            if (this.getHighResolutionOutputSizeshNQ4ISI.get(itemViewType).getHighSpeedVideoFpsRangesFor <= arrayList.size()) {
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
            } else {
                if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && arrayList.contains(viewHolder)) {
                    throw new java.lang.IllegalArgumentException("this scrap item already exists");
                }
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        private static long getHighSpeedVideoSizes(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        final void Camera2StreamConfigurationMap(int i, long j) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
            Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI, j);
        }

        final void getHighSpeedVideoSizes(int i, long j) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
            Camera2StreamConfigurationMap.Camera2StreamConfigurationMap = getHighSpeedVideoSizes(Camera2StreamConfigurationMap.Camera2StreamConfigurationMap, j);
        }

        final boolean getHighSpeedVideoFpsRanges(int i, long j, long j2) {
            long j3 = Camera2StreamConfigurationMap(i).getHighResolutionOutputSizeshNQ4ISI;
            return j3 == 0 || j + j3 < j2;
        }

        final boolean getHighSpeedVideoFpsRangesFor(int i, long j, long j2) {
            long j3 = Camera2StreamConfigurationMap(i).Camera2StreamConfigurationMap;
            return j3 == 0 || j + j3 < j2;
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoFpsRanges++;
        }

        final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, boolean z) {
            this.Camera2StreamConfigurationMap.remove(adapter);
            if (this.Camera2StreamConfigurationMap.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData> sparseArray = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = sparseArray.get(sparseArray.keyAt(i)).getHighSpeedVideoSizes;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(arrayList.get(i2).itemView);
                }
            }
        }

        private androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData Camera2StreamConfigurationMap(int i) {
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapData = this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            if (scrapData != null) {
                return scrapData;
            }
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData scrapData2 = new androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData();
            this.getHighResolutionOutputSizeshNQ4ISI.put(i, scrapData2);
            return scrapData2;
        }

        final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter2, boolean z) {
            if (adapter != null) {
                this.getHighSpeedVideoFpsRanges--;
            }
            if (!z && this.getHighSpeedVideoFpsRanges == 0) {
                clear();
            }
            if (adapter2 != null) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    static androidx.recyclerview.widget.RecyclerView findNestedRecyclerView(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            return (androidx.recyclerview.widget.RecyclerView) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.recyclerview.widget.RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    static void clearNestedRecyclerViewIfNotNested(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.mNestedRecyclerView != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = viewHolder.mNestedRecyclerView.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                java.lang.Object parent = recyclerView.getParent();
                recyclerView = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return java.lang.System.nanoTime();
        }
        return 0L;
    }

    public final class Recycler {
        androidx.recyclerview.widget.RecyclerView.RecycledViewPool Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.RecyclerView.ViewCacheExtension getHighResolutionOutputSizeshNQ4ISI;
        final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> getHighSpeedVideoFpsRanges;
        final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> getHighSpeedVideoSizes;
        private final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> getHighSpeedVideoSizesFor;
        int getInputFormats;
        private int getOutputMinFrameDuration;

        public Recycler() {
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = new java.util.ArrayList<>();
            this.getHighSpeedVideoFpsRangesFor = arrayList;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
            this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableList(arrayList);
            this.getOutputMinFrameDuration = 2;
            this.getInputFormats = 2;
        }

        public final void clear() {
            this.getHighSpeedVideoFpsRangesFor.clear();
            getOutputFormats();
        }

        public final void setViewCacheSize(int i) {
            this.getOutputMinFrameDuration = i;
            getHighSpeedVideoSizesFor();
        }

        final void getHighSpeedVideoSizesFor() {
            this.getInputFormats = this.getOutputMinFrameDuration + (androidx.recyclerview.widget.RecyclerView.this.mLayout != null ? androidx.recyclerview.widget.RecyclerView.this.mLayout.mPrefetchMaxCountObserved : 0);
            for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0 && this.getHighSpeedVideoFpsRanges.size() > this.getInputFormats; size--) {
                Camera2StreamConfigurationMap(size);
            }
        }

        public final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> getScrapList() {
            return this.getHighSpeedVideoSizesFor;
        }

        private boolean getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && !androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("should not receive a removed view unless it is pre layout");
                    sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                return androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout();
            }
            if (viewHolder.mPosition < 0 || viewHolder.mPosition >= androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                sb2.append(viewHolder);
                sb2.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IndexOutOfBoundsException(sb2.toString());
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() || androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemViewType(viewHolder.mPosition) == viewHolder.getItemViewType()) {
                return !androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds() || viewHolder.getItemId() == androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemId(viewHolder.mPosition);
            }
            return false;
        }

        private boolean Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, long j) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = androidx.recyclerview.widget.RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = androidx.recyclerview.widget.RecyclerView.this.getNanoTime();
            boolean z = false;
            if (j != Long.MAX_VALUE && !this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(itemViewType, nanoTime, j)) {
                return false;
            }
            if (viewHolder.isTmpDetached()) {
                androidx.recyclerview.widget.RecyclerView.this.attachViewToParent(viewHolder.itemView, androidx.recyclerview.widget.RecyclerView.this.getChildCount(), viewHolder.itemView.getLayoutParams());
                z = true;
            }
            androidx.recyclerview.widget.RecyclerView.this.mAdapter.bindViewHolder(viewHolder, i);
            if (z) {
                androidx.recyclerview.widget.RecyclerView.this.detachViewFromParent(viewHolder.itemView);
            }
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(viewHolder.getItemViewType(), androidx.recyclerview.widget.RecyclerView.this.getNanoTime() - nanoTime);
            getHighSpeedVideoFpsRangesFor(viewHolder);
            if (androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                viewHolder.mPreLayoutPosition = i2;
            }
            return true;
        }

        public final void bindViewToPosition(android.view.View view, int i) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams;
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
                sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            int highSpeedVideoFpsRangesFor = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRangesFor(i);
            if (highSpeedVideoFpsRangesFor < 0 || highSpeedVideoFpsRangesFor >= androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Inconsistency detected. Invalid item position ");
                sb2.append(i);
                sb2.append("(offset:");
                sb2.append(highSpeedVideoFpsRangesFor);
                sb2.append(").state:");
                sb2.append(androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount());
                sb2.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IndexOutOfBoundsException(sb2.toString());
            }
            Camera2StreamConfigurationMap(childViewHolderInt, highSpeedVideoFpsRangesFor, i, Long.MAX_VALUE);
            android.view.ViewGroup.LayoutParams layoutParams2 = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            } else if (!androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams2)) {
                layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams2);
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            } else {
                layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams2;
            }
            layoutParams.getHighResolutionOutputSizeshNQ4ISI = true;
            layoutParams.getOutputMinFrameDuration = childViewHolderInt;
            layoutParams.getHighSpeedVideoFpsRanges = childViewHolderInt.itemView.getParent() == null;
        }

        public final int convertPreLayoutPositionToPostLayout(int i) {
            if (i >= 0 && i < androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount()) {
                return !androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() ? i : androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRangesFor(i);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount());
            sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }

        public final android.view.View getViewForPosition(int i) {
            return getHighResolutionOutputSizeshNQ4ISI(i);
        }

        private android.view.View getHighResolutionOutputSizeshNQ4ISI(int i) {
            return getHighSpeedVideoSizes(i, false, Long.MAX_VALUE).itemView;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0252 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final androidx.recyclerview.widget.RecyclerView.ViewHolder getHighSpeedVideoSizes(int i, boolean z, long j) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder;
            boolean z2;
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2;
            boolean z3;
            boolean Camera2StreamConfigurationMap;
            android.view.ViewGroup.LayoutParams layoutParams;
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2;
            androidx.recyclerview.widget.RecyclerView findNestedRecyclerView;
            androidx.recyclerview.widget.RecyclerView.ViewCacheExtension viewCacheExtension;
            android.view.View viewForPositionAndType;
            if (i < 0 || i >= androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid item position ");
                sb.append(i);
                sb.append("(");
                sb.append(i);
                sb.append("). Item count:");
                sb.append(androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount());
                sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                viewHolder = getHighSpeedVideoSizes(i);
                if (viewHolder != null) {
                    z2 = true;
                    if (viewHolder == null && (viewHolder = getHighResolutionOutputSizeshNQ4ISI(i, false)) != null) {
                        if (getHighSpeedVideoSizes(viewHolder)) {
                            viewHolder.addFlags(4);
                            if (viewHolder.isScrap()) {
                                androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                                viewHolder.unScrap();
                            } else if (viewHolder.wasReturnedFromScrap()) {
                                viewHolder.clearReturnedFromScrapFlag();
                            }
                            getHighResolutionOutputSizeshNQ4ISI(viewHolder);
                            viewHolder = null;
                        } else {
                            z2 = true;
                        }
                    }
                    if (viewHolder == null) {
                        int highSpeedVideoFpsRangesFor = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRangesFor(i);
                        if (highSpeedVideoFpsRangesFor < 0 || highSpeedVideoFpsRangesFor >= androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Inconsistency detected. Invalid item position ");
                            sb2.append(i);
                            sb2.append("(offset:");
                            sb2.append(highSpeedVideoFpsRangesFor);
                            sb2.append(").state:");
                            sb2.append(androidx.recyclerview.widget.RecyclerView.this.mState.getItemCount());
                            sb2.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
                        }
                        int itemViewType = androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemViewType(highSpeedVideoFpsRangesFor);
                        if (androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds() && (viewHolder = getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemId(highSpeedVideoFpsRangesFor), itemViewType, false)) != null) {
                            viewHolder.mPosition = highSpeedVideoFpsRangesFor;
                            z2 = true;
                        }
                        if (viewHolder == null && (viewCacheExtension = this.getHighResolutionOutputSizeshNQ4ISI) != null && (viewForPositionAndType = viewCacheExtension.getViewForPositionAndType(this, i, itemViewType)) != null) {
                            viewHolder = androidx.recyclerview.widget.RecyclerView.this.getChildViewHolder(viewForPositionAndType);
                            if (viewHolder == null) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                sb3.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                                throw new java.lang.IllegalArgumentException(sb3.toString());
                            }
                            if (viewHolder.shouldIgnore()) {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                sb4.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                                throw new java.lang.IllegalArgumentException(sb4.toString());
                            }
                        }
                        if (viewHolder == null) {
                            boolean z4 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
                            viewHolder = getHighResolutionOutputSizeshNQ4ISI().getRecycledView(itemViewType);
                            if (viewHolder != null) {
                                viewHolder.resetInternal();
                                if (androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST && (viewHolder.itemView instanceof android.view.ViewGroup)) {
                                    Camera2StreamConfigurationMap((android.view.ViewGroup) viewHolder.itemView, false);
                                }
                            }
                        }
                        if (viewHolder == null) {
                            long nanoTime = androidx.recyclerview.widget.RecyclerView.this.getNanoTime();
                            if (j != Long.MAX_VALUE && !this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(itemViewType, nanoTime, j)) {
                                return null;
                            }
                            viewHolder = androidx.recyclerview.widget.RecyclerView.this.mAdapter.createViewHolder(androidx.recyclerview.widget.RecyclerView.this, itemViewType);
                            if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(viewHolder.itemView)) != null) {
                                viewHolder.mNestedRecyclerView = new java.lang.ref.WeakReference<>(findNestedRecyclerView);
                            }
                            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(itemViewType, androidx.recyclerview.widget.RecyclerView.this.getNanoTime() - nanoTime);
                            boolean z5 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
                        }
                    }
                    viewHolder2 = viewHolder;
                    z3 = z2;
                    if (z3 && !androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() && viewHolder2.hasAnyOfTheFlags(8192)) {
                        viewHolder2.setFlags(0, 8192);
                        if (androidx.recyclerview.widget.RecyclerView.this.mState.getOutputStallDurationlomOqCM) {
                            androidx.recyclerview.widget.RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder2, androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.recordPreLayoutInformation(androidx.recyclerview.widget.RecyclerView.this.mState, viewHolder2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder2) | 4096, viewHolder2.getUnmodifiedPayloads()));
                        }
                    }
                    if (!androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout() && viewHolder2.isBound()) {
                        viewHolder2.mPreLayoutPosition = i;
                    } else if (viewHolder2.isBound() || viewHolder2.needsUpdate() || viewHolder2.isInvalid()) {
                        if (!androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && viewHolder2.isRemoved()) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb5.append(viewHolder2);
                            sb5.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                            throw new java.lang.IllegalStateException(sb5.toString());
                        }
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(viewHolder2, androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRangesFor(i), i, j);
                        layoutParams = viewHolder2.itemView.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateDefaultLayoutParams();
                            viewHolder2.itemView.setLayoutParams(layoutParams2);
                        } else if (!androidx.recyclerview.widget.RecyclerView.this.checkLayoutParams(layoutParams)) {
                            layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) androidx.recyclerview.widget.RecyclerView.this.generateLayoutParams(layoutParams);
                            viewHolder2.itemView.setLayoutParams(layoutParams2);
                        } else {
                            layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
                        }
                        layoutParams2.getOutputMinFrameDuration = viewHolder2;
                        layoutParams2.getHighSpeedVideoFpsRanges = !z3 && Camera2StreamConfigurationMap;
                        return viewHolder2;
                    }
                    Camera2StreamConfigurationMap = false;
                    layoutParams = viewHolder2.itemView.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    layoutParams2.getOutputMinFrameDuration = viewHolder2;
                    layoutParams2.getHighSpeedVideoFpsRanges = !z3 && Camera2StreamConfigurationMap;
                    return viewHolder2;
                }
            } else {
                viewHolder = null;
            }
            z2 = false;
            if (viewHolder == null) {
                if (getHighSpeedVideoSizes(viewHolder)) {
                }
            }
            if (viewHolder == null) {
            }
            viewHolder2 = viewHolder;
            z3 = z2;
            if (z3) {
                viewHolder2.setFlags(0, 8192);
                if (androidx.recyclerview.widget.RecyclerView.this.mState.getOutputStallDurationlomOqCM) {
                }
            }
            if (!androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
            }
            if (viewHolder2.isBound()) {
            }
            if (!androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled) {
            }
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(viewHolder2, androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRangesFor(i), i, j);
            layoutParams = viewHolder2.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            layoutParams2.getOutputMinFrameDuration = viewHolder2;
            layoutParams2.getHighSpeedVideoFpsRanges = !z3 && Camera2StreamConfigurationMap;
            return viewHolder2;
        }

        private void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (androidx.recyclerview.widget.RecyclerView.this.isAccessibilityEnabled()) {
                android.view.View view = viewHolder.itemView;
                if (androidx.core.view.ViewCompat.getImportantForAccessibility(view) == 0) {
                    androidx.core.view.ViewCompat.setImportantForAccessibility(view, 1);
                }
                if (androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate != null) {
                    androidx.core.view.AccessibilityDelegateCompat itemDelegate = androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate.getItemDelegate();
                    if (itemDelegate instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) {
                        ((androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).getHighSpeedVideoFpsRangesFor(view);
                    }
                    androidx.core.view.ViewCompat.setAccessibilityDelegate(view, itemDelegate);
                }
            }
        }

        private void Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof android.view.ViewGroup) {
                    Camera2StreamConfigurationMap((android.view.ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void recycleView(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            getHighResolutionOutputSizeshNQ4ISI(childViewHolderInt);
            if (androidx.recyclerview.widget.RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        private void getOutputFormats() {
            for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
                Camera2StreamConfigurationMap(size);
            }
            this.getHighSpeedVideoFpsRanges.clear();
            if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK) {
                androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        final void Camera2StreamConfigurationMap(int i) {
            boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.getHighSpeedVideoFpsRanges.get(i);
            boolean z2 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
            getHighSpeedVideoSizes(viewHolder, true);
            this.getHighSpeedVideoFpsRanges.remove(i);
        }

        final void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            boolean z;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(viewHolder.isScrap());
                sb.append(" isAttached:");
                sb.append(viewHolder.itemView.getParent() != null);
                sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (viewHolder.isTmpDetached()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(viewHolder);
                sb2.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (viewHolder.shouldIgnore()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            boolean z2 = androidx.recyclerview.widget.RecyclerView.this.mAdapter != null && doesTransientStatePreventRecycling && androidx.recyclerview.widget.RecyclerView.this.mAdapter.onFailedToRecycleView(viewHolder);
            if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && this.getHighSpeedVideoFpsRanges.contains(viewHolder)) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("cached view received recycle internal? ");
                sb4.append(viewHolder);
                sb4.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb4.toString());
            }
            if (z2 || viewHolder.isRecyclable()) {
                if (this.getInputFormats <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.getHighSpeedVideoFpsRanges.size();
                    if (size >= this.getInputFormats && size > 0) {
                        Camera2StreamConfigurationMap(0);
                        size--;
                    }
                    if (androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.Camera2StreamConfigurationMap(viewHolder.mPosition)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (androidx.recyclerview.widget.RecyclerView.this.mPrefetchRegistry.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.get(size).mPosition));
                        size++;
                    }
                    this.getHighSpeedVideoFpsRanges.add(size, viewHolder);
                    z = true;
                }
                if (!z) {
                    getHighSpeedVideoSizes(viewHolder, true);
                    androidx.recyclerview.widget.RecyclerView.this.mViewInfoStore.getHighSpeedVideoFpsRanges(viewHolder);
                    if (z && !r1 && doesTransientStatePreventRecycling) {
                        androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
                        viewHolder.mBindingAdapter = null;
                        viewHolder.mOwnerRecyclerView = null;
                        return;
                    }
                    return;
                }
            } else {
                if (androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled) {
                    androidx.recyclerview.widget.RecyclerView.this.exceptionLabel();
                }
                z = false;
            }
            r1 = false;
            androidx.recyclerview.widget.RecyclerView.this.mViewInfoStore.getHighSpeedVideoFpsRanges(viewHolder);
            if (z) {
            }
        }

        final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
            androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            android.view.View view = viewHolder.itemView;
            if (androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate != null) {
                androidx.core.view.AccessibilityDelegateCompat itemDelegate = androidx.recyclerview.widget.RecyclerView.this.mAccessibilityDelegate.getItemDelegate();
                androidx.core.view.ViewCompat.setAccessibilityDelegate(view, itemDelegate instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate ? ((androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).getHighSpeedVideoFpsRanges(view) : null);
            }
            if (z) {
                getHighSpeedVideoFpsRanges(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            getHighResolutionOutputSizeshNQ4ISI().putRecycledView(viewHolder);
        }

        final void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.hasAnyOfTheFlags(12) || !childViewHolderInt.isUpdated() || androidx.recyclerview.widget.RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                childViewHolderInt.setScrapContainer(this, false);
                this.getHighSpeedVideoFpsRangesFor.add(childViewHolderInt);
                return;
            }
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = new java.util.ArrayList<>();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.getHighSpeedVideoSizes.add(childViewHolderInt);
        }

        final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.getHighSpeedVideoSizes.remove(viewHolder);
            } else {
                this.getHighSpeedVideoFpsRangesFor.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        final int getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor.size();
        }

        final void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoFpsRangesFor.clear();
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = this.getHighSpeedVideoSizes;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        private androidx.recyclerview.widget.RecyclerView.ViewHolder getHighSpeedVideoSizes(int i) {
            int size;
            int highSpeedVideoFpsRangesFor;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = this.getHighSpeedVideoSizes;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            for (int i2 = 0; i2 < size; i2++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.getHighSpeedVideoSizes.get(i2);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds() || (highSpeedVideoFpsRangesFor = androidx.recyclerview.widget.RecyclerView.this.mAdapterHelper.getHighSpeedVideoFpsRangesFor(i)) <= 0 || highSpeedVideoFpsRangesFor >= androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemCount()) {
                return null;
            }
            long itemId = androidx.recyclerview.widget.RecyclerView.this.mAdapter.getItemId(highSpeedVideoFpsRangesFor);
            for (int i3 = 0; i3 < size; i3++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = this.getHighSpeedVideoSizes.get(i3);
                if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                    viewHolder2.addFlags(32);
                    return viewHolder2;
                }
            }
            return null;
        }

        private androidx.recyclerview.widget.RecyclerView.ViewHolder getHighResolutionOutputSizeshNQ4ISI(int i, boolean z) {
            android.view.View Camera2StreamConfigurationMap;
            int size = this.getHighSpeedVideoFpsRangesFor.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.getHighSpeedVideoFpsRangesFor.get(i2);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i && !viewHolder.isInvalid() && (androidx.recyclerview.widget.RecyclerView.this.mState.Camera2StreamConfigurationMap || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z && (Camera2StreamConfigurationMap = androidx.recyclerview.widget.RecyclerView.this.mChildHelper.Camera2StreamConfigurationMap(i)) != null) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(Camera2StreamConfigurationMap);
                androidx.recyclerview.widget.ChildHelper childHelper = androidx.recyclerview.widget.RecyclerView.this.mChildHelper;
                int highSpeedVideoFpsRangesFor = childHelper.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
                if (highSpeedVideoFpsRangesFor < 0) {
                    throw new java.lang.IllegalArgumentException("view is not a child, cannot hide ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap)));
                }
                if (!childHelper.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor)) {
                    throw new java.lang.RuntimeException("trying to unhide a view that was not hidden".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap)));
                }
                childHelper.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
                if (childHelper.getHighSpeedVideoSizes.remove(Camera2StreamConfigurationMap)) {
                    childHelper.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
                }
                int highResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.RecyclerView.this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
                if (highResolutionOutputSizeshNQ4ISI == -1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(childViewHolderInt);
                    sb.append(androidx.recyclerview.widget.RecyclerView.this.exceptionLabel());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                androidx.recyclerview.widget.ChildHelper childHelper2 = androidx.recyclerview.widget.RecyclerView.this.mChildHelper;
                int highSpeedVideoFpsRanges = childHelper2.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI);
                childHelper2.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
                childHelper2.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges);
                getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            int size2 = this.getHighSpeedVideoFpsRanges.size();
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = this.getHighSpeedVideoFpsRanges.get(i3);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.getHighSpeedVideoFpsRanges.remove(i3);
                    }
                    boolean z2 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
                    return viewHolder2;
                }
            }
            return null;
        }

        private androidx.recyclerview.widget.RecyclerView.ViewHolder getHighSpeedVideoFpsRangesFor(long j, int i, boolean z) {
            int size = this.getHighSpeedVideoFpsRangesFor.size();
            while (true) {
                size--;
                if (size < 0) {
                    for (int size2 = this.getHighSpeedVideoFpsRanges.size() - 1; size2 >= 0; size2--) {
                        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.getHighSpeedVideoFpsRanges.get(size2);
                        if (viewHolder.getItemId() == j && !viewHolder.isAttachedToTransitionOverlay()) {
                            if (i == viewHolder.getItemViewType()) {
                                if (!z) {
                                    this.getHighSpeedVideoFpsRanges.remove(size2);
                                }
                                return viewHolder;
                            }
                            if (!z) {
                                Camera2StreamConfigurationMap(size2);
                                return null;
                            }
                        }
                    }
                    return null;
                }
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = this.getHighSpeedVideoFpsRangesFor.get(size);
                if (viewHolder2.getItemId() == j && !viewHolder2.wasReturnedFromScrap()) {
                    if (i == viewHolder2.getItemViewType()) {
                        viewHolder2.addFlags(32);
                        if (viewHolder2.isRemoved() && !androidx.recyclerview.widget.RecyclerView.this.mState.isPreLayout()) {
                            viewHolder2.setFlags(2, 14);
                        }
                        return viewHolder2;
                    }
                    if (!z) {
                        this.getHighSpeedVideoFpsRangesFor.remove(size);
                        androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(viewHolder2.itemView, false);
                        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(viewHolder2.itemView);
                        childViewHolderInt.mScrapContainer = null;
                        childViewHolderInt.mInChangeScrap = false;
                        childViewHolderInt.clearReturnedFromScrapFlag();
                        getHighResolutionOutputSizeshNQ4ISI(childViewHolderInt);
                    }
                }
            }
        }

        private void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            if (androidx.recyclerview.widget.RecyclerView.this.mRecyclerListener != null) {
                androidx.recyclerview.widget.RecyclerView.this.mRecyclerListener.onViewRecycled(viewHolder);
            }
            int size = androidx.recyclerview.widget.RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                androidx.recyclerview.widget.RecyclerView.this.mRecyclerListeners.get(i).onViewRecycled(viewHolder);
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapter != null) {
                androidx.recyclerview.widget.RecyclerView.this.mAdapter.onViewRecycled(viewHolder);
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mState != null) {
                androidx.recyclerview.widget.RecyclerView.this.mViewInfoStore.getHighSpeedVideoFpsRanges(viewHolder);
            }
            boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
        }

        final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter2, boolean z) {
            clear();
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool = this.Camera2StreamConfigurationMap;
            if (recycledViewPool != null) {
                recycledViewPool.Camera2StreamConfigurationMap(adapter, true);
            }
            getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoSizes(adapter, adapter2, z);
            getHighSpeedVideoSizes();
        }

        final void getHighSpeedVideoSizes(int i, int i2) {
            int size = this.getHighSpeedVideoFpsRanges.size();
            for (int i3 = 0; i3 < size; i3++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.getHighSpeedVideoFpsRanges.get(i3);
                if (viewHolder != null && viewHolder.mPosition >= i) {
                    if (androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled) {
                        int i4 = viewHolder.mPosition;
                    }
                    viewHolder.offsetPosition(i2, false);
                }
            }
        }

        final void getHighSpeedVideoSizes() {
            if (this.Camera2StreamConfigurationMap == null || androidx.recyclerview.widget.RecyclerView.this.mAdapter == null || !androidx.recyclerview.widget.RecyclerView.this.isAttachedToWindow()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool = this.Camera2StreamConfigurationMap;
            recycledViewPool.Camera2StreamConfigurationMap.add(androidx.recyclerview.widget.RecyclerView.this.mAdapter);
        }

        final androidx.recyclerview.widget.RecyclerView.RecycledViewPool getHighResolutionOutputSizeshNQ4ISI() {
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = new androidx.recyclerview.widget.RecyclerView.RecycledViewPool();
                getHighSpeedVideoSizes();
            }
            return this.Camera2StreamConfigurationMap;
        }

        final void getInputSizeshNQ4ISI() {
            int size = this.getHighSpeedVideoFpsRanges.size();
            for (int i = 0; i < size; i++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.getHighSpeedVideoFpsRanges.get(i);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            if (androidx.recyclerview.widget.RecyclerView.this.mAdapter == null || !androidx.recyclerview.widget.RecyclerView.this.mAdapter.hasStableIds()) {
                getOutputFormats();
            }
        }

        final void Camera2StreamConfigurationMap() {
            int size = this.getHighSpeedVideoFpsRanges.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoFpsRanges.get(i).clearOldPosition();
            }
            int size2 = this.getHighSpeedVideoFpsRangesFor.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.getHighSpeedVideoFpsRangesFor.get(i2).clearOldPosition();
            }
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = this.getHighSpeedVideoSizes;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.getHighSpeedVideoSizes.get(i3).clearOldPosition();
                }
            }
        }

        final void getInputFormats() {
            int size = this.getHighSpeedVideoFpsRanges.size();
            for (int i = 0; i < size; i++) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) this.getHighSpeedVideoFpsRanges.get(i).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.getHighResolutionOutputSizeshNQ4ISI = true;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Adapter<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        private final androidx.recyclerview.widget.RecyclerView.AdapterDataObservable mObservable = new androidx.recyclerview.widget.RecyclerView.AdapterDataObservable();
        private boolean mHasStableIds = false;
        private androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy mStateRestorationPolicy = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public int findRelativeAdapterPositionIn(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(android.view.ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void onBindViewHolder(VH vh, int i, java.util.List<java.lang.Object> list) {
            onBindViewHolder(vh, i);
        }

        public final VH createViewHolder(android.view.ViewGroup viewGroup, int i) {
            try {
                androidx.core.os.TraceCompat.beginSection(androidx.recyclerview.widget.RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i;
                return onCreateViewHolder;
            } finally {
                androidx.core.os.TraceCompat.endSection();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE);
                androidx.core.os.TraceCompat.beginSection(androidx.recyclerview.widget.RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null && androidx.core.view.ViewCompat.isAttachedToWindow(vh.itemView) != vh.isTmpDetached()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
                    sb.append(vh.isTmpDetached());
                    sb.append(", attached to window: ");
                    sb.append(androidx.core.view.ViewCompat.isAttachedToWindow(vh.itemView));
                    sb.append(", holder: ");
                    sb.append(vh);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                if (vh.itemView.getParent() == null && androidx.core.view.ViewCompat.isAttachedToWindow(vh.itemView)) {
                    throw new java.lang.IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): ".concat(java.lang.String.valueOf(vh)));
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                android.view.ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
                    ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).getHighResolutionOutputSizeshNQ4ISI = true;
                }
                androidx.core.os.TraceCompat.endSection();
            }
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final boolean hasObservers() {
            return this.mObservable.getHighSpeedVideoFpsRanges();
        }

        public void registerAdapterDataObserver(androidx.recyclerview.widget.RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void unregisterAdapterDataObserver(androidx.recyclerview.widget.RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.getHighSpeedVideoFpsRangesFor();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.Camera2StreamConfigurationMap(i, 1);
        }

        public final void notifyItemChanged(int i, java.lang.Object obj) {
            this.mObservable.Camera2StreamConfigurationMap(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.Camera2StreamConfigurationMap(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, java.lang.Object obj) {
            this.mObservable.Camera2StreamConfigurationMap(i, i2, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.getHighSpeedVideoFpsRangesFor(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.getHighSpeedVideoFpsRanges(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.getHighSpeedVideoFpsRangesFor(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.getHighResolutionOutputSizeshNQ4ISI(i, 1);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.getHighResolutionOutputSizeshNQ4ISI(i, i2);
        }

        public void setStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.Camera2StreamConfigurationMap();
        }

        public final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        boolean canRestoreState() {
            int i = androidx.recyclerview.widget.RecyclerView.AnonymousClass7.getHighSpeedVideoFpsRangesFor[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    void dispatchChildDetached(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchChildAttached(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.ViewBoundsCheck mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        androidx.recyclerview.widget.RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        androidx.recyclerview.widget.RecyclerView.SmoothScroller mSmoothScroller;
        androidx.recyclerview.widget.ViewBoundsCheck mVerticalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public interface LayoutPrefetchRegistry {
            void addPosition(int i, int i2);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void collectInitialPrefetchPositions(int i, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public abstract androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams();

        public int getBaseline() {
            return -1;
        }

        public int getColumnCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return -1;
        }

        public int getRowCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public boolean isLayoutHierarchical(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return false;
        }

        public void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter adapter, androidx.recyclerview.widget.RecyclerView.Adapter adapter2) {
        }

        public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView recyclerView, java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        @java.lang.Deprecated
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public android.view.View onFocusSearchFailed(android.view.View view, int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return null;
        }

        public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public android.view.View onInterceptFocusSearch(android.view.View view, int i) {
            return null;
        }

        public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        }

        public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State state) {
        }

        public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        }

        public android.os.Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public boolean performAccessibilityActionForItem(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, int i, android.os.Bundle bundle) {
            return false;
        }

        public int scrollHorizontallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        public int scrollVerticallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
            return 0;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public LayoutManager() {
            androidx.recyclerview.widget.ViewBoundsCheck.Callback callback = new androidx.recyclerview.widget.ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final android.view.View getHighSpeedVideoSizes(int i) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int getHighSpeedVideoSizes() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingLeft();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int Camera2StreamConfigurationMap() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getWidth() - androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingRight();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int getHighSpeedVideoSizes(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedLeft(view) - ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int getHighSpeedVideoFpsRangesFor(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedRight(view) + ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
                }
            };
            this.mHorizontalBoundCheckCallback = callback;
            androidx.recyclerview.widget.ViewBoundsCheck.Callback callback2 = new androidx.recyclerview.widget.ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final android.view.View getHighSpeedVideoSizes(int i) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int getHighSpeedVideoSizes() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingTop();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int Camera2StreamConfigurationMap() {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getHeight() - androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getPaddingBottom();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int getHighSpeedVideoSizes(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedTop(view) - ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int getHighSpeedVideoFpsRangesFor(android.view.View view) {
                    return androidx.recyclerview.widget.RecyclerView.LayoutManager.this.getDecoratedBottom(view) + ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
                }
            };
            this.mVerticalBoundCheckCallback = callback2;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.ViewBoundsCheck(callback);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.ViewBoundsCheck(callback2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        void setRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        void setMeasureSpecs(int i, int i2) {
            this.mWidth = android.view.View.MeasureSpec.getSize(i);
            int mode = android.view.View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = android.view.View.MeasureSpec.getSize(i2);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                android.view.View childAt = getChildAt(i7);
                android.graphics.Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i6) {
                    i6 = rect.right;
                }
                if (rect.top < i5) {
                    i5 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.mRecyclerView.mTempRect.set(i3, i5, i6, i4);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasuredDimension(android.graphics.Rect rect, int i, int i2) {
            int width = rect.width();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int height = rect.height();
            int paddingTop = getPaddingTop();
            setMeasuredDimension(chooseSize(i, width + paddingLeft + paddingRight, getMinimumWidth()), chooseSize(i2, height + paddingTop + getPaddingBottom(), getMinimumHeight()));
        }

        public void requestLayout() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void assertInLayoutOrScroll(java.lang.String str) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int size = android.view.View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? java.lang.Math.max(i2, i3) : size;
            }
            return java.lang.Math.min(size, java.lang.Math.max(i2, i3));
        }

        public void assertNotInLayoutOrScroll(java.lang.String str) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        @java.lang.Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.getHighSpeedVideoSizesFor();
                }
            }
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        void dispatchAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public void postOnAnimation(java.lang.Runnable runnable) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                androidx.core.view.ViewCompat.postOnAnimation(recyclerView, runnable);
            }
        }

        public boolean removeCallbacks(java.lang.Runnable runnable) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public boolean getClipToPadding() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
                return new androidx.recyclerview.widget.RecyclerView.LayoutParams((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                return new androidx.recyclerview.widget.RecyclerView.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new androidx.recyclerview.widget.RecyclerView.LayoutParams(layoutParams);
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            return new androidx.recyclerview.widget.RecyclerView.LayoutParams(context, attributeSet);
        }

        public void scrollToPosition(int i) {
            boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
        }

        public void startSmoothScroll(androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller) {
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller2 = this.mSmoothScroller;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = smoothScroller;
            smoothScroller.start(this.mRecyclerView, this);
        }

        public boolean isSmoothScrolling() {
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = this.mSmoothScroller;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public int getLayoutDirection() {
            return androidx.core.view.ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        public void endAnimation(android.view.View view) {
            if (this.mRecyclerView.mItemAnimator != null) {
                this.mRecyclerView.mItemAnimator.endAnimation(androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view));
            }
        }

        public void addDisappearingView(android.view.View view) {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(android.view.View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(android.view.View view) {
            addView(view, -1);
        }

        public void addView(android.view.View view, int i) {
            addViewInt(view, i, false);
        }

        private void addViewInt(android.view.View view, int i, boolean z) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.getHighSpeedVideoFpsRangesFor(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.Camera2StreamConfigurationMap(childViewHolderInt);
            }
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.getHighSpeedVideoFpsRanges(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(view);
                if (i == -1) {
                    i = this.mChildHelper.getHighSpeedVideoFpsRangesFor();
                }
                if (highResolutionOutputSizeshNQ4ISI == -1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    sb.append(this.mRecyclerView.exceptionLabel());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                if (highResolutionOutputSizeshNQ4ISI != i) {
                    this.mRecyclerView.mLayout.moveView(highResolutionOutputSizeshNQ4ISI, i);
                }
            } else {
                this.mChildHelper.Camera2StreamConfigurationMap(view, i, false);
                layoutParams.getHighResolutionOutputSizeshNQ4ISI = true;
                androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = this.mSmoothScroller;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.getHighSpeedVideoFpsRanges) {
                if (androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled) {
                    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = layoutParams.getOutputMinFrameDuration;
                }
                childViewHolderInt.itemView.invalidate();
                layoutParams.getHighSpeedVideoFpsRanges = false;
            }
        }

        public void removeView(android.view.View view) {
            androidx.recyclerview.widget.ChildHelper childHelper = this.mChildHelper;
            int i = childHelper.getHighSpeedVideoFpsRanges;
            if (i == 1) {
                throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i == 2) {
                throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                childHelper.getHighSpeedVideoFpsRanges = 1;
                childHelper.getHighResolutionOutputSizeshNQ4ISI = view;
                int highSpeedVideoFpsRangesFor = childHelper.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(view);
                if (highSpeedVideoFpsRangesFor >= 0) {
                    if (childHelper.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor) && childHelper.getHighSpeedVideoSizes.remove(view)) {
                        childHelper.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(view);
                    }
                    childHelper.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
                }
            } finally {
                childHelper.getHighSpeedVideoFpsRanges = 0;
                childHelper.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.getHighSpeedVideoFpsRangesFor(i);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.getHighSpeedVideoFpsRangesFor(childCount);
            }
        }

        public int getPosition(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getItemViewType(android.view.View view) {
            return androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public android.view.View findContainingItemView(android.view.View view) {
            android.view.View findContainingItemView;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.getHighSpeedVideoFpsRangesFor(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public android.view.View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.isPreLayout() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public void detachView(android.view.View view) {
            int highResolutionOutputSizeshNQ4ISI = this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(view);
            if (highResolutionOutputSizeshNQ4ISI >= 0) {
                detachViewInternal(highResolutionOutputSizeshNQ4ISI, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        private void detachViewInternal(int i, android.view.View view) {
            androidx.recyclerview.widget.ChildHelper childHelper = this.mChildHelper;
            int highSpeedVideoFpsRanges = childHelper.getHighSpeedVideoFpsRanges(i);
            childHelper.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
            childHelper.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges);
        }

        public void attachView(android.view.View view, int i, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.getHighSpeedVideoFpsRangesFor(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.Camera2StreamConfigurationMap(childViewHolderInt);
            }
            this.mChildHelper.getHighSpeedVideoFpsRanges(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        public void attachView(android.view.View view, int i) {
            attachView(view, i, (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams());
        }

        public void attachView(android.view.View view) {
            attachView(view, -1);
        }

        public void removeDetachedView(android.view.View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void moveView(int i, int i2) {
            android.view.View childAt = getChildAt(i);
            if (childAt == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot move a child from non-existing index:");
                sb.append(i);
                sb.append(this.mRecyclerView.toString());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            detachViewAt(i);
            attachView(childAt, i2);
        }

        public void detachAndScrapView(android.view.View view, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            scrapOrRecycleView(recycler, this.mChildHelper.getHighResolutionOutputSizeshNQ4ISI(view), view);
        }

        public void detachAndScrapViewAt(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            scrapOrRecycleView(recycler, i, getChildAt(i));
        }

        public void removeAndRecycleView(android.view.View view, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            removeView(view);
            recycler.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            android.view.View childAt = getChildAt(i);
            removeViewAt(i);
            recycler.recycleView(childAt);
        }

        public int getChildCount() {
            androidx.recyclerview.widget.ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getHighSpeedVideoFpsRangesFor();
            }
            return 0;
        }

        public android.view.View getChildAt(int i) {
            androidx.recyclerview.widget.ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getHighResolutionOutputSizeshNQ4ISI(i);
            }
            return null;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getPaddingLeft() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingTop() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPaddingRight() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingBottom() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingStart() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.ViewCompat.getPaddingStart(recyclerView);
            }
            return 0;
        }

        public int getPaddingEnd() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.ViewCompat.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        public boolean isFocused() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public boolean hasFocus() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public android.view.View getFocusedChild() {
            android.view.View focusedChild;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.getHighSpeedVideoFpsRangesFor(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getItemCount() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            androidx.recyclerview.widget.RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void offsetChildrenHorizontal(int i) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void ignoreView(android.view.View view) {
            android.view.ViewParent parent = view.getParent();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("View should be fully attached to be ignored");
                sb.append(this.mRecyclerView.exceptionLabel());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.getHighSpeedVideoFpsRanges(childViewHolderInt);
        }

        public void stopIgnoringView(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void detachAndScrapAttachedViews(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(recycler, childCount, getChildAt(childCount));
            }
        }

        private void scrapOrRecycleView(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i, android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                recycler.getHighResolutionOutputSizeshNQ4ISI(childViewHolderInt);
            } else {
                detachViewAt(i);
                recycler.getHighResolutionOutputSizeshNQ4ISI(view);
                this.mRecyclerView.mViewInfoStore.Camera2StreamConfigurationMap(childViewHolderInt);
            }
        }

        void removeAndRecycleScrapInt(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            int highSpeedVideoFpsRangesFor = recycler.getHighSpeedVideoFpsRangesFor();
            for (int i = highSpeedVideoFpsRangesFor - 1; i >= 0; i--) {
                android.view.View view = recycler.getHighSpeedVideoFpsRangesFor.get(i).itemView;
                androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    if (this.mRecyclerView.mItemAnimator != null) {
                        this.mRecyclerView.mItemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    recycler.getHighResolutionOutputSizeshNQ4ISI(childViewHolderInt2);
                }
            }
            recycler.getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRangesFor > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void measureChild(android.view.View view, int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left;
            int i4 = itemDecorInsetsForChild.right;
            int i5 = itemDecorInsetsForChild.top;
            int i6 = itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i + i3 + i4, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i2 + i5 + i6, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        boolean shouldReMeasureChild(android.view.View view, int i, int i2, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, layoutParams.width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, layoutParams.height)) ? false : true;
        }

        boolean shouldMeasureChild(android.view.View view, int i, int i2, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) && isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height)) ? false : true;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = android.view.View.MeasureSpec.getMode(i2);
            int size = android.view.View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public void measureChildWithMargins(android.view.View view, int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left;
            int i4 = itemDecorInsetsForChild.right;
            int i5 = itemDecorInsetsForChild.top;
            int i6 = itemDecorInsetsForChild.bottom;
            int width = getWidth();
            int widthMode = getWidthMode();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int i7 = layoutParams.leftMargin;
            int childMeasureSpec = getChildMeasureSpec(width, widthMode, paddingLeft + paddingRight + i7 + layoutParams.rightMargin + i + i3 + i4, layoutParams.width, canScrollHorizontally());
            int height = getHeight();
            int heightMode = getHeightMode();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i8 = layoutParams.topMargin;
            int childMeasureSpec2 = getChildMeasureSpec(height, heightMode, paddingTop + paddingBottom + i8 + layoutParams.bottomMargin + i2 + i5 + i6, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
        
            if (r3 >= 0) goto L11;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4;
            int i5 = i - i2;
            int i6 = 0;
            int max = java.lang.Math.max(0, i5);
            if (!z) {
                if (i3 < 0) {
                    if (i3 == -1) {
                        i3 = max;
                    } else {
                        if (i3 == -2) {
                            i6 = max;
                            i4 = Integer.MIN_VALUE;
                        }
                        i4 = 0;
                    }
                }
                i4 = 1073741824;
                i6 = i3;
            }
            return android.view.View.MeasureSpec.makeMeasureSpec(i6, i4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r4 == 1073741824) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int max = java.lang.Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i4 = max;
                                i2 = Integer.MIN_VALUE;
                            } else {
                                i4 = max;
                                i2 = 0;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return android.view.View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public int getDecoratedMeasuredWidth(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedMeasuredHeight(android.view.View view) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void layoutDecorated(android.view.View view, int i, int i2, int i3, int i4) {
            android.graphics.Rect rect = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(android.view.View view, int i, int i2, int i3, int i4) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            android.graphics.Rect rect = layoutParams.getHighSpeedVideoFpsRangesFor;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        public void getTransformedBoundingBox(android.view.View view, boolean z, android.graphics.Rect rect) {
            android.graphics.Matrix matrix;
            if (z) {
                android.graphics.Rect rect2 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                android.graphics.RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void getDecoratedBoundsWithMargins(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(android.view.View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedTop(android.view.View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getDecoratedRight(android.view.View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedBottom(android.view.View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void calculateItemDecorationsForChild(android.view.View view, android.graphics.Rect rect) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int getTopDecorationHeight(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor.top;
        }

        public int getBottomDecorationHeight(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor.bottom;
        }

        public int getLeftDecorationWidth(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor.left;
        }

        public int getRightDecorationWidth(android.view.View view) {
            return ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getHighSpeedVideoFpsRangesFor.right;
        }

        private int[] getChildRectangleOnScreenScrollAmount(android.view.View view, android.graphics.Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width();
            int height2 = rect.height();
            int i = left - paddingLeft;
            int min = java.lang.Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = java.lang.Math.min(0, i2);
            int i3 = (width2 + left) - (width - paddingRight);
            int max = java.lang.Math.max(0, i3);
            int max2 = java.lang.Math.max(0, (height2 + top) - (height - paddingBottom));
            if (getLayoutDirection() == 1) {
                min = max != 0 ? max : java.lang.Math.max(min, i3);
            } else if (min == 0) {
                min = java.lang.Math.min(i, max);
            }
            if (min2 == 0) {
                min2 = java.lang.Math.min(i2, max2);
            }
            return new int[]{min, min2};
        }

        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        public boolean isViewPartiallyVisible(android.view.View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.getHighSpeedVideoSizes(view) && this.mVerticalBoundCheck.getHighSpeedVideoSizes(view);
            return z ? z3 : !z3;
        }

        private boolean isFocusedChildVisibleAfterScrolling(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            android.graphics.Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width - paddingRight && rect.right - i > paddingLeft && rect.top - i2 < height - paddingBottom && rect.bottom - i2 > paddingTop;
        }

        @java.lang.Deprecated
        public boolean onRequestChildFocus(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.view.View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public boolean onRequestChildFocus(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, android.view.View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, java.lang.Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onMeasure(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public int getMinimumWidth() {
            return androidx.core.view.ViewCompat.getMinimumWidth(this.mRecyclerView);
        }

        public int getMinimumHeight() {
            return androidx.core.view.ViewCompat.getMinimumHeight(this.mRecyclerView);
        }

        void stopSmoothScroller() {
            androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller = this.mSmoothScroller;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        void onSmoothScrollerStopped(androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScroller) {
            if (this.mSmoothScroller == smoothScroller) {
                this.mSmoothScroller = null;
            }
        }

        public void removeAndRecycleAllViews(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfo(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.mRecyclerView.mAdapter != null) {
                accessibilityEvent.setItemCount(this.mRecyclerView.mAdapter.getItemCount());
            }
        }

        void onInitializeAccessibilityNodeInfoForItem(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.getHighSpeedVideoFpsRangesFor(childViewHolderInt.itemView)) {
                return;
            }
            onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
            return performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i, android.os.Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        boolean performAccessibilityActionForItem(android.view.View view, int i, android.os.Bundle bundle) {
            return performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, i, bundle);
        }

        public static androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties getProperties(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties properties = new androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, i2);
            properties.orientation = obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            properties.spanCount = obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            properties.reverseLayout = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            properties.stackFromEnd = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        void setExactMeasureSpecsFrom(androidx.recyclerview.widget.RecyclerView recyclerView) {
            setMeasureSpecs(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class ItemDecoration {
        @java.lang.Deprecated
        public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        @java.lang.Deprecated
        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            onDrawOver(canvas, recyclerView);
        }

        @java.lang.Deprecated
        public void getItemOffsets(android.graphics.Rect rect, int i, androidx.recyclerview.widget.RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            getItemOffsets(rect, ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = java.util.Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final android.view.View itemView;
        androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> mBindingAdapter;
        int mFlags;
        java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> mNestedRecyclerView;
        androidx.recyclerview.widget.RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowedHolder = null;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowingHolder = null;
        java.util.List<java.lang.Object> mPayloads = null;
        java.util.List<java.lang.Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        androidx.recyclerview.widget.RecyclerView.Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public ViewHolder(android.view.View view) {
            if (view == null) {
                throw new java.lang.IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((androidx.recyclerview.widget.RecyclerView.LayoutParams) this.itemView.getLayoutParams()).getHighResolutionOutputSizeshNQ4ISI = true;
            }
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        @java.lang.Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        @java.lang.Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getBindingAdapterPosition() {
            androidx.recyclerview.widget.RecyclerView recyclerView;
            androidx.recyclerview.widget.RecyclerView.Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final int getAbsoluteAdapterPosition() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        public final androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        void unScrap() {
            this.mScrapContainer.Camera2StreamConfigurationMap(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        void setScrapContainer(androidx.recyclerview.widget.RecyclerView.Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | ((~i2) & this.mFlags);
        }

        void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        void addChangePayload(java.lang.Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = java.util.Collections.unmodifiableList(arrayList);
            }
        }

        void clearPayload() {
            java.util.List<java.lang.Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        java.util.List<java.lang.Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                java.util.List<java.lang.Object> list = this.mPayloads;
                if (list == null || list.size() == 0) {
                    return FULLUPDATE_PAYLOADS;
                }
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        void resetInternal() {
            if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempting to reset temp-detached ViewHolder: ");
                sb.append(this);
                sb.append(". ViewHolders should be fully detached before resetting.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = androidx.core.view.ViewCompat.getImportantForAccessibility(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public java.lang.String toString() {
            java.lang.String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                if (androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled) {
                    throw new java.lang.RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(java.lang.String.valueOf(this)));
                }
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
            boolean z2 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !androidx.core.view.ViewCompat.hasTransientState(this.itemView);
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && androidx.core.view.ViewCompat.hasTransientState(this.itemView);
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }
    }

    boolean setChildImportantForAccessibilityInternal(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        androidx.core.view.ViewCompat.setImportantForAccessibility(viewHolder.itemView, i);
        return true;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                androidx.core.view.ViewCompat.setImportantForAccessibility(viewHolder.itemView, i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    int getAdapterPositionInRecyclerView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.AdapterHelper adapterHelper = this.mAdapterHelper;
        int i = viewHolder.mPosition;
        int size = adapterHelper.getHighSpeedVideoSizesFor.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = adapterHelper.getHighSpeedVideoSizesFor.get(i2);
            int i3 = updateOp.getHighSpeedVideoFpsRangesFor;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (updateOp.getHighSpeedVideoSizes == i) {
                            i = updateOp.Camera2StreamConfigurationMap;
                        } else {
                            if (updateOp.getHighSpeedVideoSizes < i) {
                                i--;
                            }
                            if (updateOp.Camera2StreamConfigurationMap <= i) {
                                i++;
                            }
                        }
                    }
                } else if (updateOp.getHighSpeedVideoSizes > i) {
                    continue;
                } else {
                    if (updateOp.getHighSpeedVideoSizes + updateOp.Camera2StreamConfigurationMap > i) {
                        return -1;
                    }
                    i -= updateOp.Camera2StreamConfigurationMap;
                }
            } else if (updateOp.getHighSpeedVideoSizes <= i) {
                i += updateOp.Camera2StreamConfigurationMap;
            }
        }
        return i;
    }

    void initFastScroller(android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Trying to set fast scroller without both required drawables.");
            sb.append(exceptionLabel());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        android.content.res.Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().startNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().startNestedScroll(i, i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        getScrollingChildHelper().stopNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().hasNestedScrollingParent(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().dispatchNestedPreFling(f, f2);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final android.graphics.Rect getHighSpeedVideoFpsRangesFor;
        androidx.recyclerview.widget.RecyclerView.ViewHolder getOutputMinFrameDuration;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges = false;
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges = false;
        }

        public boolean viewNeedsUpdate() {
            return this.getOutputMinFrameDuration.needsUpdate();
        }

        public boolean isViewInvalid() {
            return this.getOutputMinFrameDuration.isInvalid();
        }

        public boolean isItemRemoved() {
            return this.getOutputMinFrameDuration.isRemoved();
        }

        public boolean isItemChanged() {
            return this.getOutputMinFrameDuration.isUpdated();
        }

        @java.lang.Deprecated
        public int getViewPosition() {
            return this.getOutputMinFrameDuration.getPosition();
        }

        public int getViewLayoutPosition() {
            return this.getOutputMinFrameDuration.getLayoutPosition();
        }

        @java.lang.Deprecated
        public int getViewAdapterPosition() {
            return this.getOutputMinFrameDuration.getBindingAdapterPosition();
        }

        public int getAbsoluteAdapterPosition() {
            return this.getOutputMinFrameDuration.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.getOutputMinFrameDuration.getBindingAdapterPosition();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    public static abstract class SmoothScroller {
        private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private androidx.recyclerview.widget.RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private android.view.View mTargetView;
        private int mTargetPosition = -1;
        private final androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action mRecyclingAction = new androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action(0, 0);

        public interface ScrollVectorProvider {
            android.graphics.PointF computeScrollVectorForPosition(int i);
        }

        protected abstract void onSeekTargetStep(int i, int i2, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(android.view.View view, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action);

        void start(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
            recyclerView.mViewFlinger.getHighSpeedVideoSizes();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            if (this.mTargetPosition == -1) {
                throw new java.lang.IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.getOutputStallDuration = this.mTargetPosition;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.Camera2StreamConfigurationMap();
            this.mStarted = true;
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public android.graphics.PointF computeScrollVectorForPosition(int i) {
            java.lang.Object layoutManager = getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) {
                return ((androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
            }
            return null;
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.getOutputStallDuration = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        void onAnimation(int i, int i2) {
            android.graphics.PointF computeScrollVectorForPosition;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null && (computeScrollVectorForPosition.x != 0.0f || computeScrollVectorForPosition.y != 0.0f)) {
                recyclerView.scrollStep((int) java.lang.Math.signum(computeScrollVectorForPosition.x), (int) java.lang.Math.signum(computeScrollVectorForPosition.y), null);
            }
            this.mPendingInitialRun = false;
            android.view.View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.getHighSpeedVideoFpsRangesFor(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean z = this.mRecyclingAction.getHighSpeedVideoFpsRanges >= 0;
                this.mRecyclingAction.getHighSpeedVideoFpsRangesFor(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.Camera2StreamConfigurationMap();
                }
            }
        }

        public int getChildPosition(android.view.View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public android.view.View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        @java.lang.Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        protected void onChildAttachedToWindow(android.view.View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                boolean z = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled;
            }
        }

        protected void normalize(android.graphics.PointF pointF) {
            float sqrt = (float) java.lang.Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
            private int Camera2StreamConfigurationMap;
            private boolean getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes;
            private android.view.animation.Interpolator getInputFormats;
            private int getOutputMinFrameDuration;

            public Action(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public Action(int i, int i2, int i3) {
                this(i, i2, i3, null);
            }

            public Action(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
                this.getHighSpeedVideoFpsRanges = -1;
                this.getHighResolutionOutputSizeshNQ4ISI = false;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getOutputMinFrameDuration = i2;
                this.Camera2StreamConfigurationMap = i3;
                this.getInputFormats = interpolator;
            }

            public void jumpTo(int i) {
                this.getHighSpeedVideoFpsRanges = i;
            }

            final void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView recyclerView) {
                int i = this.getHighSpeedVideoFpsRanges;
                if (i >= 0) {
                    this.getHighSpeedVideoFpsRanges = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.getHighResolutionOutputSizeshNQ4ISI = false;
                } else {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        Camera2StreamConfigurationMap();
                        recyclerView.mViewFlinger.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getInputFormats);
                        this.getHighSpeedVideoSizes++;
                        this.getHighResolutionOutputSizeshNQ4ISI = false;
                        return;
                    }
                    this.getHighSpeedVideoSizes = 0;
                }
            }

            private void Camera2StreamConfigurationMap() {
                if (this.getInputFormats != null && this.Camera2StreamConfigurationMap <= 0) {
                    throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.Camera2StreamConfigurationMap <= 0) {
                    throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int getDx() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public void setDx(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRangesFor = i;
            }

            public int getDy() {
                return this.getOutputMinFrameDuration;
            }

            public void setDy(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getOutputMinFrameDuration = i;
            }

            public int getDuration() {
                return this.Camera2StreamConfigurationMap;
            }

            public void setDuration(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.Camera2StreamConfigurationMap = i;
            }

            public android.view.animation.Interpolator getInterpolator() {
                return this.getInputFormats;
            }

            public void setInterpolator(android.view.animation.Interpolator interpolator) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getInputFormats = interpolator;
            }

            public void update(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getOutputMinFrameDuration = i2;
                this.Camera2StreamConfigurationMap = i3;
                this.getInputFormats = interpolator;
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
        }
    }

    static class AdapterDataObservable extends android.database.Observable<androidx.recyclerview.widget.RecyclerView.AdapterDataObserver> {
        AdapterDataObservable() {
        }

        public final boolean getHighSpeedVideoFpsRanges() {
            return !this.mObservers.isEmpty();
        }

        public final void getHighSpeedVideoFpsRangesFor() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onChanged();
            }
        }

        public final void Camera2StreamConfigurationMap() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public final void Camera2StreamConfigurationMap(int i, int i2) {
            Camera2StreamConfigurationMap(i, i2, null);
        }

        public final void Camera2StreamConfigurationMap(int i, int i2, java.lang.Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void getHighSpeedVideoFpsRanges(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.recyclerview.widget.RecyclerView.SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ androidx.recyclerview.widget.RecyclerView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.recyclerview.widget.RecyclerView.SavedState[i];
            }
        };
        android.os.Parcelable getHighResolutionOutputSizeshNQ4ISI;

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.RecyclerView.LayoutManager.class.getClassLoader() : classLoader);
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, 0);
        }
    }

    public static class State {
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;
        int getOutputFormats;
        int getOutputSizeshNQ4ISI;
        private android.util.SparseArray<java.lang.Object> toString;
        int getOutputStallDuration = -1;
        int getOutputMinFrameDuration = 0;
        int getHighSpeedVideoFpsRangesFor = 0;
        int getInputFormats = 1;
        int getInputSizeshNQ4ISI = 0;
        boolean getOutputSizes = false;
        boolean Camera2StreamConfigurationMap = false;
        boolean isOutputSupportedForhNQ4ISI = false;
        boolean getHighSpeedVideoSizesFor = false;
        boolean getOutputStallDurationlomOqCM = false;
        boolean getOutputMinFrameDurationlomOqCM = false;

        final void getHighSpeedVideoFpsRanges(int i) {
            if ((this.getInputFormats & i) != 0) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Layout state should be one of ");
            sb.append(java.lang.Integer.toBinaryString(i));
            sb.append(" but it is ");
            sb.append(java.lang.Integer.toBinaryString(this.getInputFormats));
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public boolean isMeasuring() {
            return this.getHighSpeedVideoSizesFor;
        }

        public boolean isPreLayout() {
            return this.Camera2StreamConfigurationMap;
        }

        public boolean willRunPredictiveAnimations() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        public boolean willRunSimpleAnimations() {
            return this.getOutputStallDurationlomOqCM;
        }

        public void remove(int i) {
            android.util.SparseArray<java.lang.Object> sparseArray = this.toString;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i);
        }

        public <T> T get(int i) {
            android.util.SparseArray<java.lang.Object> sparseArray = this.toString;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        public void put(int i, java.lang.Object obj) {
            if (this.toString == null) {
                this.toString = new android.util.SparseArray<>();
            }
            this.toString.put(i, obj);
        }

        public int getTargetScrollPosition() {
            return this.getOutputStallDuration;
        }

        public boolean hasTargetScrollPosition() {
            return this.getOutputStallDuration != -1;
        }

        public boolean didStructureChange() {
            return this.getOutputSizes;
        }

        public int getItemCount() {
            if (this.Camera2StreamConfigurationMap) {
                return this.getOutputMinFrameDuration - this.getHighSpeedVideoFpsRangesFor;
            }
            return this.getInputSizeshNQ4ISI;
        }

        public int getRemainingScrollHorizontal() {
            return this.getOutputFormats;
        }

        public int getRemainingScrollVertical() {
            return this.getOutputSizeshNQ4ISI;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State{mTargetPosition=");
            sb.append(this.getOutputStallDuration);
            sb.append(", mData=");
            sb.append(this.toString);
            sb.append(", mItemCount=");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(", mIsMeasuring=");
            sb.append(this.getHighSpeedVideoSizesFor);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.getOutputMinFrameDuration);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", mStructureChanged=");
            sb.append(this.getOutputSizes);
            sb.append(", mInPreLayout=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.getOutputStallDurationlomOqCM);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.getOutputMinFrameDurationlomOqCM);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    class ItemAnimatorRestoreListener implements androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener {
        ItemAnimatorRestoreListener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild() || androidx.recyclerview.widget.RecyclerView.this.removeAnimatingView(viewHolder.itemView) || !viewHolder.isTmpDetached()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
        }
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mListener = null;
        private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> mFinishedListeners = new java.util.ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        interface ItemAnimatorListener {
            void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);
        }

        public abstract boolean animateAppearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public abstract void endAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public void onAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        }

        public void onAnimationStarted(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        }

        public abstract void runPendingAnimations();

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        void setListener(androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, java.util.List<java.lang.Object> list) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        static int buildAdapterChangeFlagsForAnimations(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mFlags;
            int i2 = i & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i2 | 2048;
                }
            }
            return i2;
        }

        public final void dispatchAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener = this.mListener;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.getHighResolutionOutputSizeshNQ4ISI(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final boolean isRunning(androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean isRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!isRunning) {
                    itemAnimatorFinishedListener.onAnimationsFinished();
                    return isRunning;
                }
                this.mFinishedListeners.add(itemAnimatorFinishedListener);
            }
            return isRunning;
        }

        public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, java.util.List<java.lang.Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i).onAnimationsFinished();
            }
            this.mFinishedListeners.clear();
        }

        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo obtainHolderInfo() {
            return new androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo();
        }

        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
                return setFrom(viewHolder, 0);
            }

            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
                android.view.View view = viewHolder.itemView;
                this.left = view.getLeft();
                this.top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        if (childDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return childDrawingOrderCallback.onGetChildDrawingOrder(i, i2);
    }

    private androidx.core.view.NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }
}
