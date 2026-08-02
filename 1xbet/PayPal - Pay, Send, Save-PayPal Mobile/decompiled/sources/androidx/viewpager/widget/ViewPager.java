package androidx.viewpager.widget;

/* loaded from: classes7.dex */
public class ViewPager extends android.view.ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final java.lang.String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    androidx.viewpager.widget.PagerAdapter mAdapter;
    private java.util.List<androidx.viewpager.widget.ViewPager.OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private java.util.ArrayList<android.view.View> mDrawingOrderedChildren;
    private final java.lang.Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final java.util.ArrayList<androidx.viewpager.widget.ViewPager.ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private android.widget.EdgeEffect mLeftEdge;
    private android.graphics.drawable.Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private androidx.viewpager.widget.ViewPager.PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mOnPageChangeListener;
    private java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private androidx.viewpager.widget.ViewPager.PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private android.os.Parcelable mRestoredAdapterState;
    private java.lang.ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private android.widget.EdgeEffect mRightEdge;
    private int mScrollState;
    private android.widget.Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final androidx.viewpager.widget.ViewPager.ItemInfo mTempItem;
    private final android.graphics.Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {android.R.attr.layout_gravity};
    private static final java.util.Comparator<androidx.viewpager.widget.ViewPager.ItemInfo> COMPARATOR = new java.util.Comparator<androidx.viewpager.widget.ViewPager.ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(androidx.viewpager.widget.ViewPager.ItemInfo itemInfo, androidx.viewpager.widget.ViewPager.ItemInfo itemInfo2) {
            return itemInfo.getHighSpeedVideoFpsRanges - itemInfo2.getHighSpeedVideoFpsRanges;
        }
    };
    private static final android.view.animation.Interpolator sInterpolator = new android.view.animation.Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final androidx.viewpager.widget.ViewPager.ViewPositionComparator sPositionComparator = new androidx.viewpager.widget.ViewPager.ViewPositionComparator();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Inherited
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface DecorView {
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public interface PageTransformer {
        void transformPage(android.view.View view, float f);
    }

    public static class SimpleOnPageChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }
    }

    static class ItemInfo {
        float Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoSizes;

        ItemInfo() {
        }
    }

    public ViewPager(android.content.Context context) {
        super(context);
        this.mItems = new java.util.ArrayList<>();
        this.mTempItem = new androidx.viewpager.widget.ViewPager.ItemInfo();
        this.mTempRect = new android.graphics.Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new java.lang.Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                androidx.viewpager.widget.ViewPager.this.setScrollState(0);
                androidx.viewpager.widget.ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    public ViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new java.util.ArrayList<>();
        this.mTempItem = new androidx.viewpager.widget.ViewPager.ItemInfo();
        this.mTempRect = new android.graphics.Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new java.lang.Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                androidx.viewpager.widget.ViewPager.this.setScrollState(0);
                androidx.viewpager.widget.ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        android.content.Context context = getContext();
        this.mScroller = new android.widget.Scroller(context, sInterpolator);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new android.widget.EdgeEffect(context);
        this.mRightEdge = new android.widget.EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.viewpager.widget.ViewPager.MyAccessibilityDelegate());
        if (androidx.core.view.ViewCompat.getImportantForAccessibility(this) == 0) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            private final android.graphics.Rect getHighSpeedVideoSizes = new android.graphics.Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                androidx.core.view.WindowInsetsCompat onApplyWindowInsets = androidx.core.view.ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                android.graphics.Rect rect = this.getHighSpeedVideoSizes;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = androidx.viewpager.widget.ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets = androidx.core.view.ViewCompat.dispatchApplyWindowInsets(androidx.viewpager.widget.ViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = java.lang.Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = java.lang.Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = java.lang.Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = java.lang.Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        android.widget.Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        if (this.mPageTransformer != null) {
            enableLayers(i != 0);
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setAdapter(androidx.viewpager.widget.PagerAdapter pagerAdapter) {
        androidx.viewpager.widget.PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            synchronized (pagerAdapter2) {
                pagerAdapter2.Camera2StreamConfigurationMap = null;
            }
            this.mAdapter.startUpdate((android.view.ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(i);
                this.mAdapter.destroyItem((android.view.ViewGroup) this, itemInfo.getHighSpeedVideoFpsRanges, itemInfo.getHighSpeedVideoFpsRangesFor);
            }
            this.mAdapter.finishUpdate((android.view.ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new androidx.viewpager.widget.ViewPager.PagerObserver();
            }
            androidx.viewpager.widget.PagerAdapter pagerAdapter4 = this.mAdapter;
            androidx.viewpager.widget.ViewPager.PagerObserver pagerObserver = this.mObserver;
            synchronized (pagerAdapter4) {
                pagerAdapter4.Camera2StreamConfigurationMap = pagerObserver;
            }
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        java.util.List<androidx.viewpager.widget.ViewPager.OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mAdapterChangeListeners.get(i2).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((androidx.viewpager.widget.ViewPager.LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public androidx.viewpager.widget.PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public void addOnAdapterChangeListener(androidx.viewpager.widget.ViewPager.OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new java.util.ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void removeOnAdapterChangeListener(androidx.viewpager.widget.ViewPager.OnAdapterChangeListener onAdapterChangeListener) {
        java.util.List<androidx.viewpager.widget.ViewPager.OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        androidx.viewpager.widget.PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.mAdapter.getCount()) {
            i = this.mAdapter.getCount() - 1;
        }
        int i3 = this.mOffscreenPageLimit;
        int i4 = this.mCurItem;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                this.mItems.get(i5).getHighResolutionOutputSizeshNQ4ISI = true;
            }
        }
        boolean z3 = this.mCurItem != i;
        if (this.mFirstLayout) {
            this.mCurItem = i;
            if (z3) {
                dispatchOnPageSelected(i);
            }
            requestLayout();
            return;
        }
        populate(i);
        scrollToItem(i, z, i2, z3);
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        androidx.viewpager.widget.ViewPager.ItemInfo infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (getClientWidth() * java.lang.Math.max(this.mFirstOffset, java.lang.Math.min(infoForPosition.Camera2StreamConfigurationMap, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @java.lang.Deprecated
    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void addOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new java.util.ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    public void removeOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    public void clearOnPageChangeListeners() {
        java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setPageTransformer(boolean z, androidx.viewpager.widget.ViewPager.PageTransformer pageTransformer) {
        setPageTransformer(z, pageTransformer, 2);
    }

    public void setPageTransformer(boolean z, androidx.viewpager.widget.ViewPager.PageTransformer pageTransformer, int i) {
        boolean z2 = pageTransformer != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((androidx.viewpager.widget.ViewPager.LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).getHighSpeedVideoSizes;
    }

    androidx.viewpager.widget.ViewPager.OnPageChangeListener setInternalPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float distanceInfluenceForSnapDuration(float f) {
        return (float) java.lang.Math.sin((f - 0.5f) * 0.47123894f);
    }

    void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        android.widget.Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float distanceInfluenceForSnapDuration = distanceInfluenceForSnapDuration(java.lang.Math.min(1.0f, (java.lang.Math.abs(i5) * 1.0f) / f));
        int abs2 = java.lang.Math.abs(i3);
        if (abs2 > 0) {
            abs = java.lang.Math.round(java.lang.Math.abs((f2 + (distanceInfluenceForSnapDuration * f2)) / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((java.lang.Math.abs(i5) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = java.lang.Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, min);
        androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
    }

    androidx.viewpager.widget.ViewPager.ItemInfo addNewItem(int i, int i2) {
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = new androidx.viewpager.widget.ViewPager.ItemInfo();
        itemInfo.getHighSpeedVideoFpsRanges = i;
        itemInfo.getHighSpeedVideoFpsRangesFor = this.mAdapter.instantiateItem((android.view.ViewGroup) this, i);
        itemInfo.getHighSpeedVideoSizes = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
            return itemInfo;
        }
        this.mItems.add(i2, itemInfo);
        return itemInfo;
    }

    void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.getHighSpeedVideoFpsRangesFor);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((android.view.ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((android.view.ViewGroup) this, itemInfo.getHighSpeedVideoFpsRanges, itemInfo.getHighSpeedVideoFpsRangesFor);
                    if (this.mCurItem == itemInfo.getHighSpeedVideoFpsRanges) {
                        i = java.lang.Math.max(0, java.lang.Math.min(this.mCurItem, count - 1));
                    }
                } else if (itemInfo.getHighSpeedVideoFpsRanges != itemPosition) {
                    if (itemInfo.getHighSpeedVideoFpsRanges == this.mCurItem) {
                        i = itemPosition;
                    }
                    itemInfo.getHighSpeedVideoFpsRanges = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((android.view.ViewGroup) this);
        }
        java.util.Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                androidx.viewpager.widget.ViewPager.LayoutParams layoutParams = (androidx.viewpager.widget.ViewPager.LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.getHighSpeedVideoFpsRanges = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    void populate() {
        populate(this.mCurItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r8.getHighSpeedVideoFpsRanges == r17.mCurItem) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void populate(int i) {
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo;
        java.lang.String hexString;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo2;
        androidx.viewpager.widget.ViewPager.ItemInfo infoForChild;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo3;
        int i2 = this.mCurItem;
        if (i2 != i) {
            itemInfo = infoForPosition(i2);
            this.mCurItem = i;
        } else {
            itemInfo = null;
        }
        if (this.mAdapter == null) {
            sortChildDrawingOrder();
            return;
        }
        if (this.mPopulatePending) {
            sortChildDrawingOrder();
            return;
        }
        if (getWindowToken() != null) {
            this.mAdapter.startUpdate((android.view.ViewGroup) this);
            int i3 = this.mOffscreenPageLimit;
            int max = java.lang.Math.max(0, this.mCurItem - i3);
            int count = this.mAdapter.getCount();
            int min = java.lang.Math.min(count - 1, this.mCurItem + i3);
            if (count != this.mExpectedAdapterCount) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (android.content.res.Resources.NotFoundException unused) {
                    hexString = java.lang.Integer.toHexString(getId());
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
                sb.append(this.mExpectedAdapterCount);
                sb.append(", found: ");
                sb.append(count);
                sb.append(" Pager id: ");
                sb.append(hexString);
                sb.append(" Pager class: ");
                sb.append(getClass());
                sb.append(" Problematic adapter: ");
                sb.append(this.mAdapter.getClass());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.mItems.size()) {
                    break;
                }
                itemInfo2 = this.mItems.get(i4);
                if (itemInfo2.getHighSpeedVideoFpsRanges < this.mCurItem) {
                    i4++;
                }
            }
            itemInfo2 = null;
            if (itemInfo2 == null && count > 0) {
                itemInfo2 = addNewItem(this.mCurItem, i4);
            }
            if (itemInfo2 != null) {
                int i5 = i4 - 1;
                androidx.viewpager.widget.ViewPager.ItemInfo itemInfo4 = i5 >= 0 ? this.mItems.get(i5) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - itemInfo2.getHighSpeedVideoSizes) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                for (int i6 = this.mCurItem - 1; i6 >= 0; i6--) {
                    if (f >= paddingLeft && i6 < max) {
                        if (itemInfo4 == null) {
                            break;
                        }
                        if (i6 == itemInfo4.getHighSpeedVideoFpsRanges && !itemInfo4.getHighResolutionOutputSizeshNQ4ISI) {
                            this.mItems.remove(i5);
                            this.mAdapter.destroyItem((android.view.ViewGroup) this, i6, itemInfo4.getHighSpeedVideoFpsRangesFor);
                            i5--;
                            i4--;
                            if (i5 >= 0) {
                                itemInfo3 = this.mItems.get(i5);
                                itemInfo4 = itemInfo3;
                            }
                            itemInfo3 = null;
                            itemInfo4 = itemInfo3;
                        }
                    } else if (itemInfo4 != null && i6 == itemInfo4.getHighSpeedVideoFpsRanges) {
                        f += itemInfo4.getHighSpeedVideoSizes;
                        i5--;
                        if (i5 >= 0) {
                            itemInfo3 = this.mItems.get(i5);
                            itemInfo4 = itemInfo3;
                        }
                        itemInfo3 = null;
                        itemInfo4 = itemInfo3;
                    } else {
                        f += addNewItem(i6, i5 + 1).getHighSpeedVideoSizes;
                        i4++;
                        if (i5 >= 0) {
                            itemInfo3 = this.mItems.get(i5);
                            itemInfo4 = itemInfo3;
                        }
                        itemInfo3 = null;
                        itemInfo4 = itemInfo3;
                    }
                }
                float f2 = itemInfo2.getHighSpeedVideoSizes;
                int i7 = i4 + 1;
                if (f2 < 2.0f) {
                    androidx.viewpager.widget.ViewPager.ItemInfo itemInfo5 = i7 < this.mItems.size() ? this.mItems.get(i7) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i8 = this.mCurItem;
                    while (true) {
                        i8++;
                        if (i8 >= count) {
                            break;
                        }
                        if (f2 >= paddingRight && i8 > min) {
                            if (itemInfo5 == null) {
                                break;
                            }
                            if (i8 == itemInfo5.getHighSpeedVideoFpsRanges && !itemInfo5.getHighResolutionOutputSizeshNQ4ISI) {
                                this.mItems.remove(i7);
                                this.mAdapter.destroyItem((android.view.ViewGroup) this, i8, itemInfo5.getHighSpeedVideoFpsRangesFor);
                                if (i7 < this.mItems.size()) {
                                    itemInfo5 = this.mItems.get(i7);
                                }
                            }
                        } else if (itemInfo5 != null && i8 == itemInfo5.getHighSpeedVideoFpsRanges) {
                            f2 += itemInfo5.getHighSpeedVideoSizes;
                            i7++;
                            if (i7 < this.mItems.size()) {
                                itemInfo5 = this.mItems.get(i7);
                            }
                        } else {
                            androidx.viewpager.widget.ViewPager.ItemInfo addNewItem = addNewItem(i8, i7);
                            i7++;
                            f2 += addNewItem.getHighSpeedVideoSizes;
                            itemInfo5 = i7 < this.mItems.size() ? this.mItems.get(i7) : null;
                        }
                    }
                }
                calculatePageOffsets(itemInfo2, i4, itemInfo);
                this.mAdapter.setPrimaryItem((android.view.ViewGroup) this, this.mCurItem, itemInfo2.getHighSpeedVideoFpsRangesFor);
            }
            this.mAdapter.finishUpdate((android.view.ViewGroup) this);
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                android.view.View childAt = getChildAt(i9);
                androidx.viewpager.widget.ViewPager.LayoutParams layoutParams = (androidx.viewpager.widget.ViewPager.LayoutParams) childAt.getLayoutParams();
                layoutParams.getHighSpeedVideoSizes = i9;
                if (!layoutParams.isDecor && layoutParams.getHighSpeedVideoFpsRanges == 0.0f && (infoForChild = infoForChild(childAt)) != null) {
                    layoutParams.getHighSpeedVideoFpsRanges = infoForChild.getHighSpeedVideoSizes;
                    layoutParams.getHighResolutionOutputSizeshNQ4ISI = infoForChild.getHighSpeedVideoFpsRanges;
                }
            }
            sortChildDrawingOrder();
            if (hasFocus()) {
                android.view.View findFocus = findFocus();
                androidx.viewpager.widget.ViewPager.ItemInfo infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
                if (infoForAnyChild == null || infoForAnyChild.getHighSpeedVideoFpsRanges != this.mCurItem) {
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        android.view.View childAt2 = getChildAt(i10);
                        androidx.viewpager.widget.ViewPager.ItemInfo infoForChild2 = infoForChild(childAt2);
                        if (infoForChild2 != null && infoForChild2.getHighSpeedVideoFpsRanges == this.mCurItem && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            java.util.ArrayList<android.view.View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new java.util.ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            java.util.Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    private void calculatePageOffsets(androidx.viewpager.widget.ViewPager.ItemInfo itemInfo, int i, androidx.viewpager.widget.ViewPager.ItemInfo itemInfo2) {
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo3;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (itemInfo2 != null) {
            int i2 = itemInfo2.getHighSpeedVideoFpsRanges;
            if (i2 < itemInfo.getHighSpeedVideoFpsRanges) {
                float f2 = itemInfo2.Camera2StreamConfigurationMap + itemInfo2.getHighSpeedVideoSizes + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= itemInfo.getHighSpeedVideoFpsRanges && i4 < this.mItems.size()) {
                    androidx.viewpager.widget.ViewPager.ItemInfo itemInfo5 = this.mItems.get(i4);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i3 <= itemInfo4.getHighSpeedVideoFpsRanges || i4 >= this.mItems.size() - 1) {
                            break;
                        }
                        i4++;
                        itemInfo5 = this.mItems.get(i4);
                    }
                    while (i3 < itemInfo4.getHighSpeedVideoFpsRanges) {
                        f2 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    itemInfo4.Camera2StreamConfigurationMap = f2;
                    f2 += itemInfo4.getHighSpeedVideoSizes + f;
                    i3++;
                }
            } else if (i2 > itemInfo.getHighSpeedVideoFpsRanges) {
                int size = this.mItems.size() - 1;
                float f3 = itemInfo2.Camera2StreamConfigurationMap;
                while (true) {
                    i2--;
                    if (i2 < itemInfo.getHighSpeedVideoFpsRanges || size < 0) {
                        break;
                    }
                    androidx.viewpager.widget.ViewPager.ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i2 >= itemInfo3.getHighSpeedVideoFpsRanges || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i2 > itemInfo3.getHighSpeedVideoFpsRanges) {
                        f3 -= this.mAdapter.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= itemInfo3.getHighSpeedVideoSizes + f;
                    itemInfo3.Camera2StreamConfigurationMap = f3;
                }
            }
        }
        int size2 = this.mItems.size();
        float f4 = itemInfo.Camera2StreamConfigurationMap;
        int i5 = itemInfo.getHighSpeedVideoFpsRanges - 1;
        this.mFirstOffset = itemInfo.getHighSpeedVideoFpsRanges == 0 ? itemInfo.Camera2StreamConfigurationMap : -3.4028235E38f;
        int i6 = count - 1;
        this.mLastOffset = itemInfo.getHighSpeedVideoFpsRanges == i6 ? (itemInfo.Camera2StreamConfigurationMap + itemInfo.getHighSpeedVideoSizes) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo7 = this.mItems.get(i7);
            while (i5 > itemInfo7.getHighSpeedVideoFpsRanges) {
                f4 -= this.mAdapter.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= itemInfo7.getHighSpeedVideoSizes + f;
            itemInfo7.Camera2StreamConfigurationMap = f4;
            if (itemInfo7.getHighSpeedVideoFpsRanges == 0) {
                this.mFirstOffset = f4;
            }
            i7--;
            i5--;
        }
        float f5 = itemInfo.Camera2StreamConfigurationMap + itemInfo.getHighSpeedVideoSizes + f;
        int i8 = itemInfo.getHighSpeedVideoFpsRanges + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo8 = this.mItems.get(i9);
            while (i8 < itemInfo8.getHighSpeedVideoFpsRanges) {
                f5 += this.mAdapter.getPageWidth(i8) + f;
                i8++;
            }
            if (itemInfo8.getHighSpeedVideoFpsRanges == i6) {
                this.mLastOffset = (itemInfo8.getHighSpeedVideoSizes + f5) - 1.0f;
            }
            itemInfo8.Camera2StreamConfigurationMap = f5;
            f5 += itemInfo8.getHighSpeedVideoSizes + f;
            i9++;
            i8++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.viewpager.widget.ViewPager.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.viewpager.widget.ViewPager.SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.viewpager.widget.ViewPager.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ androidx.viewpager.widget.ViewPager.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.viewpager.widget.ViewPager.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.viewpager.widget.ViewPager.SavedState[i];
            }
        };
        java.lang.ClassLoader Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        android.os.Parcelable getHighSpeedVideoSizes;

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighSpeedVideoFpsRanges);
            parcel.writeParcelable(this.getHighSpeedVideoSizes, i);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentPager.SavedState{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append("}");
            return sb.toString();
        }

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.getHighSpeedVideoFpsRanges = parcel.readInt();
            this.getHighSpeedVideoSizes = parcel.readParcelable(classLoader);
            this.Camera2StreamConfigurationMap = classLoader;
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.viewpager.widget.ViewPager.SavedState savedState = new androidx.viewpager.widget.ViewPager.SavedState(super.onSaveInstanceState());
        savedState.getHighSpeedVideoFpsRanges = this.mCurItem;
        androidx.viewpager.widget.PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.getHighSpeedVideoSizes = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.viewpager.widget.ViewPager.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.viewpager.widget.ViewPager.SavedState savedState = (androidx.viewpager.widget.ViewPager.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        androidx.viewpager.widget.PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.getHighSpeedVideoSizes, savedState.Camera2StreamConfigurationMap);
            setCurrentItemInternal(savedState.getHighSpeedVideoFpsRanges, false, true);
        } else {
            this.mRestoredCurItem = savedState.getHighSpeedVideoFpsRanges;
            this.mRestoredAdapterState = savedState.getHighSpeedVideoSizes;
            this.mRestoredClassLoader = savedState.Camera2StreamConfigurationMap;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        androidx.viewpager.widget.ViewPager.LayoutParams layoutParams2 = (androidx.viewpager.widget.ViewPager.LayoutParams) layoutParams;
        layoutParams2.isDecor |= isDecorView(view);
        if (this.mInLayout) {
            if (layoutParams2 != null && layoutParams2.isDecor) {
                throw new java.lang.IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.getHighSpeedVideoFpsRangesFor = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    private static boolean isDecorView(android.view.View view) {
        return view.getClass().getAnnotation(androidx.viewpager.widget.ViewPager.DecorView.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForChild(android.view.View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, itemInfo.getHighSpeedVideoFpsRangesFor)) {
                return itemInfo;
            }
        }
        return null;
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForAnyChild(android.view.View view) {
        while (true) {
            java.lang.Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof android.view.View)) {
                    return null;
                }
                view = (android.view.View) parent;
            } else {
                return infoForChild(view);
            }
        }
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(i2);
            if (itemInfo.getHighSpeedVideoFpsRanges == i) {
                return itemInfo;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        androidx.viewpager.widget.ViewPager.LayoutParams layoutParams;
        androidx.viewpager.widget.ViewPager.LayoutParams layoutParams2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = java.lang.Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (androidx.viewpager.widget.ViewPager.LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i9 = layoutParams2.gravity & 7;
                int i10 = layoutParams2.gravity & 112;
                boolean z3 = (i10 == 48 || i10 == 80) ? true : z;
                if (i9 != 3 && i9 != 5) {
                    z2 = z;
                }
                int i11 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (layoutParams2.width != -2) {
                    i5 = layoutParams2.width != -1 ? layoutParams2.width : paddingLeft;
                    i4 = 1073741824;
                } else {
                    i4 = i11;
                    i5 = paddingLeft;
                }
                if (layoutParams2.height != -2) {
                    i6 = layoutParams2.height != -1 ? layoutParams2.height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i3;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i5, i4), android.view.View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
        this.mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            android.view.View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (androidx.viewpager.widget.ViewPager.LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.getHighSpeedVideoFpsRanges), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - paddingLeft) - paddingRight) + i3)), getScrollY());
            return;
        }
        androidx.viewpager.widget.ViewPager.ItemInfo infoForPosition = infoForPosition(this.mCurItem);
        int min = (int) ((infoForPosition != null ? java.lang.Math.min(infoForPosition.Camera2StreamConfigurationMap, this.mLastOffset) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            completeScroll(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        androidx.viewpager.widget.ViewPager.ItemInfo infoForChild;
        int max;
        int max2;
        int i5;
        int childCount = getChildCount();
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                androidx.viewpager.widget.ViewPager.LayoutParams layoutParams = (androidx.viewpager.widget.ViewPager.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i10 = layoutParams.gravity & 7;
                    int i11 = layoutParams.gravity & 112;
                    if (i10 == 1) {
                        max = java.lang.Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i10 == 3) {
                        max = paddingLeft;
                        paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i10 != 5) {
                        max = paddingLeft;
                    } else {
                        max = (i6 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i11 == 16) {
                        max2 = java.lang.Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else {
                        if (i11 == 48) {
                            i5 = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            i5 = paddingTop;
                        } else {
                            max2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i12 = max + scrollX;
                        childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, paddingTop + childAt.getMeasuredHeight());
                        i8++;
                        paddingTop = i5;
                    }
                    int i13 = max2;
                    i5 = paddingTop;
                    paddingTop = i13;
                    int i122 = max + scrollX;
                    childAt.layout(i122, paddingTop, childAt.getMeasuredWidth() + i122, paddingTop + childAt.getMeasuredHeight());
                    i8++;
                    paddingTop = i5;
                }
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            android.view.View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                androidx.viewpager.widget.ViewPager.LayoutParams layoutParams2 = (androidx.viewpager.widget.ViewPager.LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.isDecor && (infoForChild = infoForChild(childAt2)) != null) {
                    float f = (i6 - paddingLeft) - paddingRight;
                    int i15 = ((int) (infoForChild.Camera2StreamConfigurationMap * f)) + paddingLeft;
                    if (layoutParams2.getHighSpeedVideoFpsRangesFor) {
                        layoutParams2.getHighSpeedVideoFpsRangesFor = false;
                        childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.getHighSpeedVideoFpsRanges), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i15, paddingTop, childAt2.getMeasuredWidth() + i15, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i7 - paddingBottom;
        this.mDecorChildCount = i8;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        completeScroll(true);
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        androidx.viewpager.widget.ViewPager.ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        float f = clientWidth;
        int i3 = infoForCurrentScrollPosition.getHighSpeedVideoFpsRanges;
        float f2 = ((i / f) - infoForCurrentScrollPosition.Camera2StreamConfigurationMap) / (infoForCurrentScrollPosition.getHighSpeedVideoSizes + (i2 / f));
        this.mCalledSuper = false;
        onPageScrolled(i3, f2, (int) ((clientWidth + i2) * f2));
        if (this.mCalledSuper) {
            return true;
        }
        throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onPageScrolled(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                android.view.View childAt = getChildAt(i4);
                androidx.viewpager.widget.ViewPager.LayoutParams layoutParams = (androidx.viewpager.widget.ViewPager.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i5 = layoutParams.gravity & 7;
                    if (i5 == 1) {
                        max = java.lang.Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        dispatchOnPageScrolled(i, f, i2);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                android.view.View childAt2 = getChildAt(i7);
                if (!((androidx.viewpager.widget.ViewPager.LayoutParams) childAt2.getLayoutParams()).isDecor) {
                    this.mPageTransformer.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
        java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i, f, i2);
                }
            }
        }
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
        java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
            }
        }
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i);
                }
            }
        }
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i);
        }
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(i);
            if (itemInfo.getHighResolutionOutputSizeshNQ4ISI) {
                itemInfo.getHighResolutionOutputSizeshNQ4ISI = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                androidx.core.view.ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private boolean isGutterDrag(float f, float f2) {
        if (f >= this.mGutterSize || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f;
        }
        return true;
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState == 2 && java.lang.Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            } else {
                completeScroll(false);
                this.mIsBeingDragged = false;
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.mLastMotionX;
                float abs = java.lang.Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = java.lang.Math.abs(y2 - this.mInitialMotionY);
                if (f != 0.0f && !isGutterDrag(this.mLastMotionX, f) && canScroll(this, false, (int) f, (int) x2, (int) y2)) {
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y2;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                float f2 = this.mTouchSlop;
                if (abs > f2 && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f3 = this.mInitialMotionX;
                    float f4 = this.mTouchSlop;
                    this.mLastMotionX = f > 0.0f ? f3 + f4 : f3 - f4;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f2) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.viewpager.widget.PagerAdapter pagerAdapter;
        boolean resetTouch;
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        resetTouch = resetTouch();
                        if (resetTouch) {
                        }
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = java.lang.Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = java.lang.Math.abs(y2 - this.mLastMotionY);
                        if (abs > this.mTouchSlop && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f = this.mInitialMotionX;
                            this.mLastMotionX = x2 - f > 0.0f ? f + this.mTouchSlop : f - this.mTouchSlop;
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            android.view.ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    resetTouch = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    if (resetTouch) {
                    }
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                resetTouch = resetTouch();
                if (resetTouch) {
                    androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (this.mIsBeingDragged) {
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            androidx.viewpager.widget.ViewPager.ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f2 = clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.getHighSpeedVideoFpsRanges, ((scrollX / f2) - infoForCurrentScrollPosition.Camera2StreamConfigurationMap) / (infoForCurrentScrollPosition.getHighSpeedVideoSizes + (this.mPageMargin / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            resetTouch = resetTouch();
            if (resetTouch) {
            }
        }
        return true;
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + (f2 - f);
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(0);
        java.util.ArrayList<androidx.viewpager.widget.ViewPager.ItemInfo> arrayList = this.mItems;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.getHighSpeedVideoFpsRanges != 0) {
            f3 = itemInfo.Camera2StreamConfigurationMap * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (itemInfo2.getHighSpeedVideoFpsRanges != this.mAdapter.getCount() - 1) {
            f4 = itemInfo2.Camera2StreamConfigurationMap * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(java.lang.Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(java.lang.Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - i;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private androidx.viewpager.widget.ViewPager.ItemInfo infoForCurrentScrollPosition() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = null;
        float f3 = 0.0f;
        while (i2 < this.mItems.size()) {
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo2 = this.mItems.get(i2);
            if (!z && itemInfo2.getHighSpeedVideoFpsRanges != (i = i3 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.Camera2StreamConfigurationMap = f + f3 + f2;
                itemInfo2.getHighSpeedVideoFpsRanges = i;
                itemInfo2.getHighSpeedVideoSizes = this.mAdapter.getPageWidth(itemInfo2.getHighSpeedVideoFpsRanges);
                i2--;
            }
            androidx.viewpager.widget.ViewPager.ItemInfo itemInfo3 = itemInfo2;
            f = itemInfo3.Camera2StreamConfigurationMap;
            float f4 = itemInfo3.getHighSpeedVideoSizes;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 + f + f2 || i2 == this.mItems.size() - 1) {
                return itemInfo3;
            }
            i3 = itemInfo3.getHighSpeedVideoFpsRanges;
            i2++;
            z = false;
            itemInfo = itemInfo3;
            f3 = itemInfo3.getHighSpeedVideoSizes;
        }
        return itemInfo;
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (java.lang.Math.abs(i3) <= this.mFlingDistance || java.lang.Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        return java.lang.Math.max(this.mItems.get(0).getHighSpeedVideoFpsRanges, java.lang.Math.min(i, this.mItems.get(r4.size() - 1).getHighSpeedVideoFpsRanges));
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z;
        androidx.viewpager.widget.PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (this.mLeftEdge.isFinished()) {
                z = false;
            } else {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize((height2 - paddingTop) - paddingBottom, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
                return;
            }
            return;
        }
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.mPageMargin / width;
        int i = 0;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(0);
        float f5 = itemInfo.Camera2StreamConfigurationMap;
        int size = this.mItems.size();
        int i2 = itemInfo.getHighSpeedVideoFpsRanges;
        int i3 = this.mItems.get(size - 1).getHighSpeedVideoFpsRanges;
        while (i2 < i3) {
            while (i2 > itemInfo.getHighSpeedVideoFpsRanges && i < size) {
                i++;
                itemInfo = this.mItems.get(i);
            }
            if (i2 == itemInfo.getHighSpeedVideoFpsRanges) {
                f = (itemInfo.Camera2StreamConfigurationMap + itemInfo.getHighSpeedVideoSizes) * width;
                f2 = itemInfo.Camera2StreamConfigurationMap + itemInfo.getHighSpeedVideoSizes + f4;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i2);
                float f6 = pageWidth + f4 + f5;
                f = (f5 + pageWidth) * width;
                f2 = f6;
            }
            if (this.mPageMargin + f > scrollX) {
                f3 = f4;
                this.mMarginDrawable.setBounds(java.lang.Math.round(f), this.mTopPageBounds, java.lang.Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f > scrollX + r2) {
                return;
            }
            i2++;
            f5 = f2;
            f4 = f3;
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            androidx.viewpager.widget.ViewPager.ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.getHighSpeedVideoFpsRanges, ((scrollX / clientWidth) - infoForCurrentScrollPosition.Camera2StreamConfigurationMap) / infoForCurrentScrollPosition.getHighSpeedVideoSizes, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.mFirstOffset * clientWidth;
        float f3 = this.mLastOffset * clientWidth;
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo = this.mItems.get(0);
        androidx.viewpager.widget.ViewPager.ItemInfo itemInfo2 = this.mItems.get(r4.size() - 1);
        if (itemInfo.getHighSpeedVideoFpsRanges != 0) {
            f2 = itemInfo.Camera2StreamConfigurationMap * clientWidth;
        }
        if (itemInfo2.getHighSpeedVideoFpsRanges != this.mAdapter.getCount() - 1) {
            f3 = itemInfo2.Camera2StreamConfigurationMap * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - i;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(this.mFakeDragBeginTime, android.os.SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private void onSecondaryPointerUp(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    protected boolean canScroll(android.view.View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            }
            return arrowScroll(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return pageRight();
            }
            return arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i) {
        android.view.View findNextFocus;
        boolean pageRight;
        android.view.View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (android.view.ViewParent parent = findFocus.getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                for (android.view.ViewParent parent2 = findFocus.getParent(); parent2 instanceof android.view.ViewGroup; parent2 = parent2.getParent()) {
                }
            }
            findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i != 17 && i != 1) {
                    if (i != 66 || i == 2) {
                        pageRight = pageRight();
                    }
                    pageRight = false;
                }
                pageRight = pageLeft();
            } else if (i == 17) {
                int i2 = getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left;
                int i3 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                if (findFocus == null || i2 < i3) {
                    pageRight = findNextFocus.requestFocus();
                }
                pageRight = pageLeft();
            } else {
                if (i == 66) {
                    int i4 = getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left;
                    int i5 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                    if (findFocus != null && i4 <= i5) {
                        pageRight = pageRight();
                    } else {
                        pageRight = findNextFocus.requestFocus();
                    }
                }
                pageRight = false;
            }
            if (pageRight) {
                playSoundEffect(android.view.SoundEffectConstants.getContantForFocusDirection(i));
            }
            return pageRight;
        }
        findFocus = null;
        findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
        }
        if (i != 17) {
            if (i != 66) {
            }
            pageRight = pageRight();
            if (pageRight) {
            }
            return pageRight;
        }
        pageRight = pageLeft();
        if (pageRight) {
        }
        return pageRight;
    }

    private android.graphics.Rect getChildRectInPagerCoordinates(android.graphics.Rect rect, android.view.View view) {
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        android.view.ViewParent parent = view.getParent();
        while ((parent instanceof android.view.ViewGroup) && parent != this) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    boolean pageRight() {
        androidx.viewpager.widget.PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
        androidx.viewpager.widget.ViewPager.ItemInfo infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.getHighSpeedVideoFpsRanges == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> arrayList) {
        androidx.viewpager.widget.ViewPager.ItemInfo infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.getHighSpeedVideoFpsRanges == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        int i2;
        int i3;
        int i4;
        androidx.viewpager.widget.ViewPager.ItemInfo infoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.getHighSpeedVideoFpsRanges == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        androidx.viewpager.widget.ViewPager.ItemInfo infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.getHighSpeedVideoFpsRanges == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.viewpager.widget.ViewPager.LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.viewpager.widget.ViewPager.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.viewpager.widget.ViewPager.LayoutParams(getContext(), attributeSet);
    }

    class MyAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        MyAccessibilityDelegate() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
        
            if (r1.Camera2StreamConfigurationMap.mAdapter.getCount() > 1) goto L8;
         */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(androidx.viewpager.widget.ViewPager.class.getName());
            boolean z = androidx.viewpager.widget.ViewPager.this.mAdapter != null;
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() != 4096 || androidx.viewpager.widget.ViewPager.this.mAdapter == null) {
                return;
            }
            accessibilityEvent.setItemCount(androidx.viewpager.widget.ViewPager.this.mAdapter.getCount());
            accessibilityEvent.setFromIndex(androidx.viewpager.widget.ViewPager.this.mCurItem);
            accessibilityEvent.setToIndex(androidx.viewpager.widget.ViewPager.this.mCurItem);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(androidx.viewpager.widget.ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(androidx.viewpager.widget.ViewPager.this.mAdapter != null && androidx.viewpager.widget.ViewPager.this.mAdapter.getCount() > 1);
            if (androidx.viewpager.widget.ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (androidx.viewpager.widget.ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!androidx.viewpager.widget.ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                androidx.viewpager.widget.ViewPager viewPager = androidx.viewpager.widget.ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i != 8192 || !androidx.viewpager.widget.ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            androidx.viewpager.widget.ViewPager viewPager2 = androidx.viewpager.widget.ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem - 1);
            return true;
        }
    }

    class PagerObserver extends android.database.DataSetObserver {
        PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            androidx.viewpager.widget.ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            androidx.viewpager.widget.ViewPager.this.dataSetChanged();
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        public int gravity;
        public boolean isDecor;

        public LayoutParams() {
            super(-1, -1);
            this.getHighSpeedVideoFpsRanges = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getHighSpeedVideoFpsRanges = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.viewpager.widget.ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    static class ViewPositionComparator implements java.util.Comparator<android.view.View> {
        ViewPositionComparator() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(android.view.View view, android.view.View view2) {
            androidx.viewpager.widget.ViewPager.LayoutParams layoutParams = (androidx.viewpager.widget.ViewPager.LayoutParams) view.getLayoutParams();
            androidx.viewpager.widget.ViewPager.LayoutParams layoutParams2 = (androidx.viewpager.widget.ViewPager.LayoutParams) view2.getLayoutParams();
            if (layoutParams.isDecor != layoutParams2.isDecor) {
                return layoutParams.isDecor ? 1 : -1;
            }
            return layoutParams.getHighResolutionOutputSizeshNQ4ISI - layoutParams2.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
