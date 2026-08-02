package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
public final class ViewPager2 extends android.view.ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static boolean getHighResolutionOutputSizeshNQ4ISI = true;
    androidx.recyclerview.widget.LinearLayoutManager Camera2StreamConfigurationMap;
    private boolean coroutineBoundary;
    int getHighSpeedVideoFpsRanges;
    androidx.viewpager2.widget.ViewPager2.AccessibilityProvider getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    private androidx.viewpager2.widget.CompositeOnPageChangeCallback getHighSpeedVideoSizesFor;
    androidx.viewpager2.widget.ScrollEventAdapter getInputFormats;
    private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver getInputSizeshNQ4ISI;
    androidx.recyclerview.widget.RecyclerView getOutputFormats;
    androidx.recyclerview.widget.PagerSnapHelper getOutputMinFrameDuration;
    private android.os.Parcelable getOutputMinFrameDurationlomOqCM;
    private androidx.viewpager2.widget.CompositeOnPageChangeCallback getOutputSizes;
    private androidx.viewpager2.widget.PageTransformerAdapter getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private androidx.viewpager2.widget.FakeDrag getOutputStallDurationlomOqCM;
    private androidx.recyclerview.widget.RecyclerView.ItemAnimator getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private final android.graphics.Rect isOutputSupportedForhNQ4ISI;
    private final android.graphics.Rect toString;
    private int unwrapAs;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Orientation {
    }

    public interface PageTransformer {
        void transformPage(android.view.View view, float f);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ScrollState {
    }

    public ViewPager2(android.content.Context context) {
        super(context);
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.toString = new android.graphics.Rect();
        this.getHighSpeedVideoSizesFor = new androidx.viewpager2.widget.CompositeOnPageChangeCallback();
        this.getHighSpeedVideoSizes = false;
        this.getInputSizeshNQ4ISI = new androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoSizes = true;
                androidx.viewpager2.widget.ViewPager2.this.getInputFormats.getHighSpeedVideoFpsRangesFor = true;
            }
        };
        this.unwrapAs = -1;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.isOutputSupportedFor = false;
        this.coroutineBoundary = true;
        this.getOutputStallDuration = -1;
        Camera2StreamConfigurationMap(context, null);
    }

    public ViewPager2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.toString = new android.graphics.Rect();
        this.getHighSpeedVideoSizesFor = new androidx.viewpager2.widget.CompositeOnPageChangeCallback();
        this.getHighSpeedVideoSizes = false;
        this.getInputSizeshNQ4ISI = new androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoSizes = true;
                androidx.viewpager2.widget.ViewPager2.this.getInputFormats.getHighSpeedVideoFpsRangesFor = true;
            }
        };
        this.unwrapAs = -1;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.isOutputSupportedFor = false;
        this.coroutineBoundary = true;
        this.getOutputStallDuration = -1;
        Camera2StreamConfigurationMap(context, attributeSet);
    }

    public ViewPager2(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.toString = new android.graphics.Rect();
        this.getHighSpeedVideoSizesFor = new androidx.viewpager2.widget.CompositeOnPageChangeCallback();
        this.getHighSpeedVideoSizes = false;
        this.getInputSizeshNQ4ISI = new androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoSizes = true;
                androidx.viewpager2.widget.ViewPager2.this.getInputFormats.getHighSpeedVideoFpsRangesFor = true;
            }
        };
        this.unwrapAs = -1;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.isOutputSupportedFor = false;
        this.coroutineBoundary = true;
        this.getOutputStallDuration = -1;
        Camera2StreamConfigurationMap(context, attributeSet);
    }

    public ViewPager2(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.toString = new android.graphics.Rect();
        this.getHighSpeedVideoSizesFor = new androidx.viewpager2.widget.CompositeOnPageChangeCallback();
        this.getHighSpeedVideoSizes = false;
        this.getInputSizeshNQ4ISI = new androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoSizes = true;
                androidx.viewpager2.widget.ViewPager2.this.getInputFormats.getHighSpeedVideoFpsRangesFor = true;
            }
        };
        this.unwrapAs = -1;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.isOutputSupportedFor = false;
        this.coroutineBoundary = true;
        this.getOutputStallDuration = -1;
        Camera2StreamConfigurationMap(context, attributeSet);
    }

    private void Camera2StreamConfigurationMap(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.viewpager2.widget.ViewPager2.AccessibilityProvider basicAccessibilityProvider;
        if (getHighResolutionOutputSizeshNQ4ISI) {
            basicAccessibilityProvider = new androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider();
        } else {
            basicAccessibilityProvider = new androidx.viewpager2.widget.ViewPager2.BasicAccessibilityProvider();
        }
        this.getHighSpeedVideoFpsRangesFor = basicAccessibilityProvider;
        androidx.viewpager2.widget.ViewPager2.RecyclerViewImpl recyclerViewImpl = new androidx.viewpager2.widget.ViewPager2.RecyclerViewImpl(context);
        this.getOutputFormats = recyclerViewImpl;
        recyclerViewImpl.setId(android.view.View.generateViewId());
        this.getOutputFormats.setDescendantFocusability(131072);
        androidx.viewpager2.widget.ViewPager2.LinearLayoutManagerImpl linearLayoutManagerImpl = new androidx.viewpager2.widget.ViewPager2.LinearLayoutManagerImpl(context);
        this.Camera2StreamConfigurationMap = linearLayoutManagerImpl;
        this.getOutputFormats.setLayoutManager(linearLayoutManagerImpl);
        this.getOutputFormats.setScrollingTouchSlop(1);
        getHighSpeedVideoFpsRanges(context, attributeSet);
        this.getOutputFormats.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.getOutputFormats.addOnChildAttachStateChangeListener(new androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener() { // from class: androidx.viewpager2.widget.ViewPager2.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(android.view.View view) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(android.view.View view) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.width != -1 || layoutParams.height != -1) {
                    throw new java.lang.IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        });
        androidx.viewpager2.widget.ScrollEventAdapter scrollEventAdapter = new androidx.viewpager2.widget.ScrollEventAdapter(this);
        this.getInputFormats = scrollEventAdapter;
        this.getOutputStallDurationlomOqCM = new androidx.viewpager2.widget.FakeDrag(this, scrollEventAdapter, this.getOutputFormats);
        androidx.viewpager2.widget.ViewPager2.PagerSnapHelperImpl pagerSnapHelperImpl = new androidx.viewpager2.widget.ViewPager2.PagerSnapHelperImpl();
        this.getOutputMinFrameDuration = pagerSnapHelperImpl;
        pagerSnapHelperImpl.attachToRecyclerView(this.getOutputFormats);
        this.getOutputFormats.addOnScrollListener(this.getInputFormats);
        androidx.viewpager2.widget.CompositeOnPageChangeCallback compositeOnPageChangeCallback = new androidx.viewpager2.widget.CompositeOnPageChangeCallback();
        this.getOutputSizes = compositeOnPageChangeCallback;
        this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI = compositeOnPageChangeCallback;
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = new androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges != i) {
                    androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges = i;
                    androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges();
                }
            }
        };
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback2 = new androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                androidx.viewpager2.widget.ViewPager2.this.clearFocus();
                if (androidx.viewpager2.widget.ViewPager2.this.hasFocus()) {
                    androidx.viewpager2.widget.ViewPager2.this.getOutputFormats.requestFocus(2);
                }
            }
        };
        this.getOutputSizes.getHighSpeedVideoSizes.add(onPageChangeCallback);
        this.getOutputSizes.getHighSpeedVideoSizes.add(onPageChangeCallback2);
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this.getOutputFormats);
        androidx.viewpager2.widget.CompositeOnPageChangeCallback compositeOnPageChangeCallback2 = this.getOutputSizes;
        compositeOnPageChangeCallback2.getHighSpeedVideoSizes.add(this.getHighSpeedVideoSizesFor);
        androidx.viewpager2.widget.PageTransformerAdapter pageTransformerAdapter = new androidx.viewpager2.widget.PageTransformerAdapter(this.Camera2StreamConfigurationMap);
        this.getOutputSizeshNQ4ISI = pageTransformerAdapter;
        this.getOutputSizes.getHighSpeedVideoSizes.add(pageTransformerAdapter);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.getOutputFormats;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap()) {
            return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        }
        return super.getAccessibilityClassName();
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.viewpager2.R.styleable.ViewPager2);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.viewpager2.R.styleable.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(androidx.viewpager2.R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        androidx.viewpager2.widget.ViewPager2.SavedState savedState = new androidx.viewpager2.widget.ViewPager2.SavedState(super.onSaveInstanceState());
        savedState.getHighSpeedVideoSizes = this.getOutputFormats.getId();
        int i = this.unwrapAs;
        if (i == -1) {
            i = this.getHighSpeedVideoFpsRanges;
        }
        savedState.getHighSpeedVideoFpsRangesFor = i;
        android.os.Parcelable parcelable = this.getOutputMinFrameDurationlomOqCM;
        if (parcelable != null) {
            savedState.getHighSpeedVideoFpsRanges = parcelable;
            return savedState;
        }
        java.lang.Object adapter = this.getOutputFormats.getAdapter();
        if (adapter instanceof androidx.viewpager2.adapter.StatefulAdapter) {
            savedState.getHighSpeedVideoFpsRanges = ((androidx.viewpager2.adapter.StatefulAdapter) adapter).saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.viewpager2.widget.ViewPager2.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.viewpager2.widget.ViewPager2.SavedState savedState = (androidx.viewpager2.widget.ViewPager2.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.unwrapAs = savedState.getHighSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDurationlomOqCM = savedState.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Camera2StreamConfigurationMap() {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter;
        if (this.unwrapAs == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        android.os.Parcelable parcelable = this.getOutputMinFrameDurationlomOqCM;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.StatefulAdapter) {
                ((androidx.viewpager2.adapter.StatefulAdapter) adapter).restoreState(parcelable);
            }
            this.getOutputMinFrameDurationlomOqCM = null;
        }
        int max = java.lang.Math.max(0, java.lang.Math.min(this.unwrapAs, adapter.getItemCount() - 1));
        this.getHighSpeedVideoFpsRanges = max;
        this.unwrapAs = -1;
        this.getOutputFormats.scrollToPosition(max);
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        android.os.Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof androidx.viewpager2.widget.ViewPager2.SavedState) {
            int i = ((androidx.viewpager2.widget.ViewPager2.SavedState) parcelable).getHighSpeedVideoSizes;
            sparseArray.put(this.getOutputFormats.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        Camera2StreamConfigurationMap();
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.viewpager2.widget.ViewPager2.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.viewpager2.widget.ViewPager2.SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.viewpager2.widget.ViewPager2.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ androidx.viewpager2.widget.ViewPager2.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.viewpager2.widget.ViewPager2.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.viewpager2.widget.ViewPager2.SavedState[i];
            }
        };
        android.os.Parcelable getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.getHighSpeedVideoSizes = parcel.readInt();
            this.getHighSpeedVideoFpsRangesFor = parcel.readInt();
            this.getHighSpeedVideoFpsRanges = parcel.readParcelable(classLoader);
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighSpeedVideoSizes);
            parcel.writeInt(this.getHighSpeedVideoFpsRangesFor);
            parcel.writeParcelable(this.getHighSpeedVideoFpsRanges, i);
        }
    }

    public final void setAdapter(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter2 = this.getOutputFormats.getAdapter();
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(adapter2);
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.getInputSizeshNQ4ISI);
        }
        this.getOutputFormats.setAdapter(adapter);
        this.getHighSpeedVideoFpsRanges = 0;
        Camera2StreamConfigurationMap();
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes((androidx.recyclerview.widget.RecyclerView.Adapter<?>) adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.getInputSizeshNQ4ISI);
        }
    }

    public final androidx.recyclerview.widget.RecyclerView.Adapter getAdapter() {
        return this.getOutputFormats.getAdapter();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.getOutputFormats, i, i2);
        int measuredWidth = this.getOutputFormats.getMeasuredWidth();
        int measuredHeight = this.getOutputFormats.getMeasuredHeight();
        int measuredState = this.getOutputFormats.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(java.lang.Math.max(measuredWidth + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(java.lang.Math.max(measuredHeight + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.getOutputFormats.getMeasuredWidth();
        int measuredHeight = this.getOutputFormats.getMeasuredHeight();
        this.isOutputSupportedForhNQ4ISI.left = getPaddingLeft();
        this.isOutputSupportedForhNQ4ISI.right = (i3 - i) - getPaddingRight();
        this.isOutputSupportedForhNQ4ISI.top = getPaddingTop();
        this.isOutputSupportedForhNQ4ISI.bottom = (i4 - i2) - getPaddingBottom();
        android.view.Gravity.apply(8388659, measuredWidth, measuredHeight, this.isOutputSupportedForhNQ4ISI, this.toString);
        this.getOutputFormats.layout(this.toString.left, this.toString.top, this.toString.right, this.toString.bottom);
        if (this.getHighSpeedVideoSizes) {
            getHighSpeedVideoFpsRanges();
        }
    }

    final void getHighSpeedVideoFpsRanges() {
        androidx.recyclerview.widget.PagerSnapHelper pagerSnapHelper = this.getOutputMinFrameDuration;
        if (pagerSnapHelper == null) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        android.view.View findSnapView = pagerSnapHelper.findSnapView(this.Camera2StreamConfigurationMap);
        if (findSnapView == null) {
            return;
        }
        int position = this.Camera2StreamConfigurationMap.getPosition(findSnapView);
        if (position != this.getHighSpeedVideoFpsRanges && getScrollState() == 0) {
            this.getOutputSizes.onPageSelected(position);
        }
        this.getHighSpeedVideoSizes = false;
    }

    final int getHighSpeedVideoFpsRangesFor() {
        int height;
        int paddingBottom;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.getOutputFormats;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final void setOrientation(int i) {
        this.Camera2StreamConfigurationMap.setOrientation(i);
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor();
    }

    public final int getOrientation() {
        return this.Camera2StreamConfigurationMap.getOrientation() == 1 ? 1 : 0;
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setCurrentItem(int i, boolean z) {
        if (isFakeDragging()) {
            throw new java.lang.IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        getHighSpeedVideoFpsRangesFor(i, z);
    }

    final void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.unwrapAs != -1) {
                this.unwrapAs = java.lang.Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() > 0) {
            int min = java.lang.Math.min(java.lang.Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.getHighSpeedVideoFpsRanges && this.getInputFormats.getInputSizeshNQ4ISI == 0) {
                return;
            }
            int i2 = this.getHighSpeedVideoFpsRanges;
            if (min == i2 && z) {
                return;
            }
            double d = i2;
            this.getHighSpeedVideoFpsRanges = min;
            this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI();
            if (this.getInputFormats.getInputSizeshNQ4ISI != 0) {
                this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI();
                d = r0.getInputFormats.Camera2StreamConfigurationMap + r0.getInputFormats.getHighSpeedVideoFpsRangesFor;
            }
            this.getInputFormats.Camera2StreamConfigurationMap(min, z);
            if (!z) {
                this.getOutputFormats.scrollToPosition(min);
                return;
            }
            double d2 = min;
            if (java.lang.Math.abs(d2 - d) > 3.0d) {
                this.getOutputFormats.scrollToPosition(d2 > d ? min - 3 : min + 3);
                androidx.recyclerview.widget.RecyclerView recyclerView = this.getOutputFormats;
                recyclerView.post(new androidx.viewpager2.widget.ViewPager2.SmoothScrollToPosition(min, recyclerView));
                return;
            }
            this.getOutputFormats.smoothScrollToPosition(min);
        }
    }

    public final int getCurrentItem() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getScrollState() {
        return this.getInputFormats.getInputSizeshNQ4ISI;
    }

    public final boolean beginFakeDrag() {
        androidx.viewpager2.widget.FakeDrag fakeDrag = this.getOutputStallDurationlomOqCM;
        if (fakeDrag.getOutputFormats.getInputSizeshNQ4ISI == 1) {
            return false;
        }
        fakeDrag.Camera2StreamConfigurationMap = 0;
        fakeDrag.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        fakeDrag.getHighSpeedVideoSizes = android.os.SystemClock.uptimeMillis();
        android.view.VelocityTracker velocityTracker = fakeDrag.getInputSizeshNQ4ISI;
        if (velocityTracker == null) {
            fakeDrag.getInputSizeshNQ4ISI = android.view.VelocityTracker.obtain();
            fakeDrag.getHighSpeedVideoFpsRanges = android.view.ViewConfiguration.get(fakeDrag.getHighSpeedVideoSizesFor.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        androidx.viewpager2.widget.ScrollEventAdapter scrollEventAdapter = fakeDrag.getOutputFormats;
        scrollEventAdapter.getHighSpeedVideoSizes = 4;
        scrollEventAdapter.getHighSpeedVideoSizes(true);
        if (fakeDrag.getOutputFormats.getInputSizeshNQ4ISI != 0) {
            fakeDrag.getHighSpeedVideoFpsRangesFor.stopScroll();
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(fakeDrag.getHighSpeedVideoSizes, fakeDrag.getHighSpeedVideoSizes, 0, 0.0f, 0.0f, 0);
        fakeDrag.getInputSizeshNQ4ISI.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final boolean fakeDragBy(float f) {
        androidx.viewpager2.widget.FakeDrag fakeDrag = this.getOutputStallDurationlomOqCM;
        if (!fakeDrag.getOutputFormats.getHighSpeedVideoFpsRanges) {
            return false;
        }
        float f2 = fakeDrag.getHighResolutionOutputSizeshNQ4ISI - f;
        fakeDrag.getHighResolutionOutputSizeshNQ4ISI = f2;
        int round = java.lang.Math.round(f2 - fakeDrag.Camera2StreamConfigurationMap);
        fakeDrag.Camera2StreamConfigurationMap += round;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z = fakeDrag.getHighSpeedVideoSizesFor.getOrientation() == 0;
        int i = z ? round : 0;
        int i2 = z ? 0 : round;
        float f3 = z ? fakeDrag.getHighResolutionOutputSizeshNQ4ISI : 0.0f;
        float f4 = z ? 0.0f : fakeDrag.getHighResolutionOutputSizeshNQ4ISI;
        fakeDrag.getHighSpeedVideoFpsRangesFor.scrollBy(i, i2);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(fakeDrag.getHighSpeedVideoSizes, uptimeMillis, 2, f3, f4, 0);
        fakeDrag.getInputSizeshNQ4ISI.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final boolean endFakeDrag() {
        int[] calculateDistanceToFinalSnap;
        int i;
        androidx.viewpager2.widget.FakeDrag fakeDrag = this.getOutputStallDurationlomOqCM;
        if (!fakeDrag.getOutputFormats.getHighSpeedVideoFpsRanges) {
            return false;
        }
        androidx.viewpager2.widget.ScrollEventAdapter scrollEventAdapter = fakeDrag.getOutputFormats;
        if (scrollEventAdapter.getInputSizeshNQ4ISI != 1 || scrollEventAdapter.getHighSpeedVideoFpsRanges) {
            scrollEventAdapter.getHighSpeedVideoFpsRanges = false;
            scrollEventAdapter.getHighResolutionOutputSizeshNQ4ISI();
            if (scrollEventAdapter.getInputFormats.getHighSpeedVideoSizes == 0) {
                if (scrollEventAdapter.getInputFormats.Camera2StreamConfigurationMap != scrollEventAdapter.Camera2StreamConfigurationMap) {
                    int i2 = scrollEventAdapter.getInputFormats.Camera2StreamConfigurationMap;
                    androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = scrollEventAdapter.getHighResolutionOutputSizeshNQ4ISI;
                    if (onPageChangeCallback != null) {
                        onPageChangeCallback.onPageSelected(i2);
                    }
                }
                scrollEventAdapter.getHighSpeedVideoFpsRanges(0);
                scrollEventAdapter.Camera2StreamConfigurationMap();
            } else {
                scrollEventAdapter.getHighSpeedVideoFpsRanges(2);
            }
        }
        android.view.VelocityTracker velocityTracker = fakeDrag.getInputSizeshNQ4ISI;
        velocityTracker.computeCurrentVelocity(1000, fakeDrag.getHighSpeedVideoFpsRanges);
        if (!fakeDrag.getHighSpeedVideoFpsRangesFor.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            androidx.viewpager2.widget.ViewPager2 viewPager2 = fakeDrag.getHighSpeedVideoSizesFor;
            android.view.View findSnapView = viewPager2.getOutputMinFrameDuration.findSnapView(viewPager2.Camera2StreamConfigurationMap);
            if (findSnapView != null && ((i = (calculateDistanceToFinalSnap = viewPager2.getOutputMinFrameDuration.calculateDistanceToFinalSnap(viewPager2.Camera2StreamConfigurationMap, findSnapView))[0]) != 0 || calculateDistanceToFinalSnap[1] != 0)) {
                viewPager2.getOutputFormats.smoothScrollBy(i, calculateDistanceToFinalSnap[1]);
            }
        }
        return true;
    }

    public final boolean isFakeDragging() {
        return this.getOutputStallDurationlomOqCM.getOutputFormats.getHighSpeedVideoFpsRanges;
    }

    public final void setUserInputEnabled(boolean z) {
        this.coroutineBoundary = z;
        this.getHighSpeedVideoFpsRangesFor.getOutputFormats();
    }

    public final boolean isUserInputEnabled() {
        return this.coroutineBoundary;
    }

    public final void setOffscreenPageLimit(int i) {
        if (i <= 0 && i != -1) {
            throw new java.lang.IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.getOutputStallDuration = i;
        this.getOutputFormats.requestLayout();
    }

    public final int getOffscreenPageLimit() {
        return this.getOutputStallDuration;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.getOutputFormats.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.getOutputFormats.canScrollVertically(i);
    }

    public final void registerOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes.add(onPageChangeCallback);
    }

    public final void unregisterOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes.remove(onPageChangeCallback);
    }

    public final void setPageTransformer(androidx.viewpager2.widget.ViewPager2.PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.isOutputSupportedFor) {
                this.getValidOutputFormatsForInputhNQ4ISI = this.getOutputFormats.getItemAnimator();
                this.isOutputSupportedFor = true;
            }
            this.getOutputFormats.setItemAnimator(null);
        } else if (this.isOutputSupportedFor) {
            this.getOutputFormats.setItemAnimator(this.getValidOutputFormatsForInputhNQ4ISI);
            this.getValidOutputFormatsForInputhNQ4ISI = null;
            this.isOutputSupportedFor = false;
        }
        if (pageTransformer == this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes) {
            return;
        }
        this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes = pageTransformer;
        requestTransform();
    }

    public final void requestTransform() {
        if (this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes == null) {
            return;
        }
        this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI();
        double d = r0.getInputFormats.Camera2StreamConfigurationMap + r0.getInputFormats.getHighSpeedVideoFpsRangesFor;
        int i = (int) d;
        float f = (float) (d - i);
        this.getOutputSizeshNQ4ISI.onPageScrolled(i, f, java.lang.Math.round(getHighSpeedVideoFpsRangesFor() * f));
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
        if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(i)) {
            return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(i);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    class RecyclerViewImpl extends androidx.recyclerview.widget.RecyclerView {
        RecyclerViewImpl(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public java.lang.CharSequence getAccessibilityClassName() {
            if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes()) {
                return androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges);
            accessibilityEvent.setToIndex(androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges);
            androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            return androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            return androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }
    }

    class LinearLayoutManagerImpl extends androidx.recyclerview.widget.LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z, boolean z2) {
            return false;
        }

        LinearLayoutManagerImpl(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i, android.os.Bundle bundle) {
            if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(i)) {
                return androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(i);
            }
            return super.performAccessibilityAction(recycler, state, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(androidx.recyclerview.widget.RecyclerView.State state, int[] iArr) {
            int offscreenPageLimit = androidx.viewpager2.widget.ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int highSpeedVideoFpsRangesFor = androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor() * offscreenPageLimit;
            iArr[0] = highSpeedVideoFpsRangesFor;
            iArr[1] = highSpeedVideoFpsRangesFor;
        }
    }

    class PagerSnapHelperImpl extends androidx.recyclerview.widget.PagerSnapHelper {
        PagerSnapHelperImpl() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
            if (androidx.viewpager2.widget.ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    static class SmoothScrollToPosition implements java.lang.Runnable {
        private final androidx.recyclerview.widget.RecyclerView getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        SmoothScrollToPosition(int i, androidx.recyclerview.widget.RecyclerView recyclerView) {
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.getHighSpeedVideoFpsRangesFor.smoothScrollToPosition(this.getHighSpeedVideoSizes);
        }
    }

    public final void addItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
        this.getOutputFormats.addItemDecoration(itemDecoration);
    }

    public final void addItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration, int i) {
        this.getOutputFormats.addItemDecoration(itemDecoration, i);
    }

    public final androidx.recyclerview.widget.RecyclerView.ItemDecoration getItemDecorationAt(int i) {
        return this.getOutputFormats.getItemDecorationAt(i);
    }

    public final int getItemDecorationCount() {
        return this.getOutputFormats.getItemDecorationCount();
    }

    public final void invalidateItemDecorations() {
        this.getOutputFormats.invalidateItemDecorations();
    }

    public final void removeItemDecorationAt(int i) {
        this.getOutputFormats.removeItemDecorationAt(i);
    }

    public final void removeItemDecoration(androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
        this.getOutputFormats.removeItemDecoration(itemDecoration);
    }

    abstract class AccessibilityProvider {
        boolean Camera2StreamConfigurationMap() {
            return false;
        }

        boolean Camera2StreamConfigurationMap(int i) {
            return false;
        }

        void getHighResolutionOutputSizeshNQ4ISI() {
        }

        void getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        }

        void getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void getHighSpeedVideoFpsRanges(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
        }

        boolean getHighSpeedVideoFpsRangesFor(int i) {
            return false;
        }

        void getHighSpeedVideoSizes(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
        }

        void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }

        boolean getHighSpeedVideoSizes() {
            return false;
        }

        void getHighSpeedVideoSizesFor() {
        }

        void getInputSizeshNQ4ISI() {
        }

        void getOutputFormats() {
        }

        void getOutputMinFrameDuration() {
        }

        private AccessibilityProvider() {
        }

        /* synthetic */ AccessibilityProvider(androidx.viewpager2.widget.ViewPager2 viewPager2, byte b) {
            this();
        }

        java.lang.String getHighSpeedVideoFpsRangesFor() {
            throw new java.lang.IllegalStateException("Not implemented.");
        }

        boolean getHighSpeedVideoFpsRanges(int i) {
            throw new java.lang.IllegalStateException("Not implemented.");
        }

        boolean getHighSpeedVideoSizes(int i) {
            throw new java.lang.IllegalStateException("Not implemented.");
        }

        java.lang.CharSequence getHighSpeedVideoFpsRanges() {
            throw new java.lang.IllegalStateException("Not implemented.");
        }
    }

    class BasicAccessibilityProvider extends androidx.viewpager2.widget.ViewPager2.AccessibilityProvider {
        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final boolean getHighSpeedVideoSizes() {
            return true;
        }

        BasicAccessibilityProvider() {
            super(androidx.viewpager2.widget.ViewPager2.this, (byte) 0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final boolean getHighSpeedVideoFpsRangesFor(int i) {
            return (i == 8192 || i == 4096) && !androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighSpeedVideoFpsRanges(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            accessibilityNodeInfoCompat.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
            accessibilityNodeInfoCompat.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfoCompat.setScrollable(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final java.lang.CharSequence getHighSpeedVideoFpsRanges() {
            return "androidx.viewpager.widget.ViewPager";
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final boolean getHighSpeedVideoSizes(int i) {
            if ((i == 8192 || i == 4096) && !androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled()) {
                return false;
            }
            throw new java.lang.IllegalStateException();
        }
    }

    class PageAwareAccessibilityProvider extends androidx.viewpager2.widget.ViewPager2.AccessibilityProvider {
        private final androidx.core.view.accessibility.AccessibilityViewCommand getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.core.view.accessibility.AccessibilityViewCommand getHighSpeedVideoFpsRanges;
        private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver getHighSpeedVideoFpsRangesFor;

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final boolean Camera2StreamConfigurationMap() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final boolean Camera2StreamConfigurationMap(int i) {
            return i == 8192 || i == 4096;
        }

        PageAwareAccessibilityProvider() {
            super(androidx.viewpager2.widget.ViewPager2.this, (byte) 0);
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                    androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider pageAwareAccessibilityProvider = androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.this;
                    int currentItem = ((androidx.viewpager2.widget.ViewPager2) view).getCurrentItem() + 1;
                    if (androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled()) {
                        androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor(currentItem, true);
                    }
                    return true;
                }
            };
            this.getHighSpeedVideoFpsRanges = new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                    androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider pageAwareAccessibilityProvider = androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.this;
                    int currentItem = ((androidx.viewpager2.widget.ViewPager2) view).getCurrentItem() - 1;
                    if (androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled()) {
                        androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor(currentItem, true);
                    }
                    return true;
                }
            };
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.getHighSpeedVideoFpsRangesFor = new androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.3
                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.this.getInputFormats();
                }
            };
            if (androidx.viewpager2.widget.ViewPager2.this.getImportantForAccessibility() == 0) {
                androidx.viewpager2.widget.ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final java.lang.String getHighSpeedVideoFpsRangesFor() {
            return "androidx.viewpager.widget.ViewPager";
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            getInputFormats();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
            getInputFormats();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighSpeedVideoSizesFor() {
            getInputFormats();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getInputSizeshNQ4ISI() {
            getInputFormats();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getOutputFormats() {
            getInputFormats();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getOutputMinFrameDuration() {
            getInputFormats();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            int itemCount;
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat wrap = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            if (androidx.viewpager2.widget.ViewPager2.this.getAdapter() == null) {
                i = 0;
                i2 = 0;
            } else if (androidx.viewpager2.widget.ViewPager2.this.getOrientation() == 1) {
                i = androidx.viewpager2.widget.ViewPager2.this.getAdapter().getItemCount();
                i2 = 1;
            } else {
                i2 = androidx.viewpager2.widget.ViewPager2.this.getAdapter().getItemCount();
                i = 1;
            }
            wrap.setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(i, i2, false, 0));
            androidx.recyclerview.widget.RecyclerView.Adapter adapter = androidx.viewpager2.widget.ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges > 0) {
                wrap.addAction(8192);
            }
            if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges < itemCount - 1) {
                wrap.addAction(4096);
            }
            wrap.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final boolean getHighSpeedVideoFpsRanges(int i) {
            int currentItem;
            if (i != 8192 && i != 4096) {
                throw new java.lang.IllegalStateException();
            }
            if (i == 8192) {
                currentItem = androidx.viewpager2.widget.ViewPager2.this.getCurrentItem() - 1;
            } else {
                currentItem = androidx.viewpager2.widget.ViewPager2.this.getCurrentItem() + 1;
            }
            if (androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled()) {
                androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRangesFor(currentItem, true);
            }
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public final void getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(androidx.viewpager2.widget.ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        final void getInputFormats() {
            int itemCount;
            androidx.viewpager2.widget.ViewPager2 viewPager2 = androidx.viewpager2.widget.ViewPager2.this;
            int i = android.R.id.accessibilityActionPageLeft;
            androidx.core.view.ViewCompat.removeAccessibilityAction(viewPager2, android.R.id.accessibilityActionPageLeft);
            androidx.core.view.ViewCompat.removeAccessibilityAction(viewPager2, android.R.id.accessibilityActionPageRight);
            androidx.core.view.ViewCompat.removeAccessibilityAction(viewPager2, android.R.id.accessibilityActionPageUp);
            androidx.core.view.ViewCompat.removeAccessibilityAction(viewPager2, android.R.id.accessibilityActionPageDown);
            if (androidx.viewpager2.widget.ViewPager2.this.getAdapter() == null || (itemCount = androidx.viewpager2.widget.ViewPager2.this.getAdapter().getItemCount()) == 0 || !androidx.viewpager2.widget.ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            if (androidx.viewpager2.widget.ViewPager2.this.getOrientation() != 0) {
                if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges < itemCount - 1) {
                    androidx.core.view.ViewCompat.replaceAccessibilityAction(viewPager2, new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, null), null, this.getHighResolutionOutputSizeshNQ4ISI);
                }
                if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges > 0) {
                    androidx.core.view.ViewCompat.replaceAccessibilityAction(viewPager2, new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, null), null, this.getHighSpeedVideoFpsRanges);
                    return;
                }
                return;
            }
            boolean z = androidx.viewpager2.widget.ViewPager2.this.Camera2StreamConfigurationMap.getLayoutDirection() == 1;
            int i2 = z ? 16908360 : 16908361;
            if (z) {
                i = 16908361;
            }
            if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges < itemCount - 1) {
                androidx.core.view.ViewCompat.replaceAccessibilityAction(viewPager2, new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, null), null, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (androidx.viewpager2.widget.ViewPager2.this.getHighSpeedVideoFpsRanges > 0) {
                androidx.core.view.ViewCompat.replaceAccessibilityAction(viewPager2, new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, null), null, this.getHighSpeedVideoFpsRanges);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        final void getHighSpeedVideoSizes(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(androidx.viewpager2.widget.ViewPager2.this.getOrientation() == 1 ? androidx.viewpager2.widget.ViewPager2.this.Camera2StreamConfigurationMap.getPosition(view) : 0, 1, androidx.viewpager2.widget.ViewPager2.this.getOrientation() == 0 ? androidx.viewpager2.widget.ViewPager2.this.Camera2StreamConfigurationMap.getPosition(view) : 0, 1, false, false));
        }
    }

    static abstract class DataSetChangeObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        /* synthetic */ DataSetChangeObserver(byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }
    }
}
