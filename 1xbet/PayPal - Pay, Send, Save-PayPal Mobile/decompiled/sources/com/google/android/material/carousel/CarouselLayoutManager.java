package com.google.android.material.carousel;

/* loaded from: classes8.dex */
public class CarouselLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements com.google.android.material.carousel.Carousel, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final java.lang.String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;
    private com.google.android.material.carousel.CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;
    private com.google.android.material.carousel.KeylineState currentKeylineState;
    private final com.google.android.material.carousel.CarouselLayoutManager.DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;
    private com.google.android.material.carousel.KeylineStateList keylineStateList;
    private java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> keylineStatePositionMap;
    private int lastItemCount;
    int maxScroll;
    int minScroll;
    private com.google.android.material.carousel.CarouselOrientationHelper orientationHelper;
    private final android.view.View.OnLayoutChangeListener recyclerViewSizeChangeListener;
    int scrollOffset;

    private static int calculateShouldScrollBy(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* renamed from: lambda$new$0$com-google-android-material-carousel-CarouselLayoutManager, reason: not valid java name */
    /* synthetic */ void m10218x2ff337cb(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new java.lang.Runnable() { // from class: com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.carousel.CarouselLayoutManager.this.refreshKeylineState();
            }
        });
    }

    static final class ChildCalculations {
        final float center;
        final android.view.View child;
        final float offsetCenter;
        final com.google.android.material.carousel.CarouselLayoutManager.KeylineRange range;

        ChildCalculations(android.view.View view, float f, float f2, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange keylineRange) {
            this.child = view;
            this.center = f;
            this.offsetCenter = f2;
            this.range = keylineRange;
        }
    }

    public CarouselLayoutManager() {
        this(new com.google.android.material.carousel.MultiBrowseCarouselStrategy());
    }

    public CarouselLayoutManager(com.google.android.material.carousel.CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.CarouselStrategy carouselStrategy, int i) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new com.google.android.material.carousel.CarouselLayoutManager.DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                com.google.android.material.carousel.CarouselLayoutManager.this.m10218x2ff337cb(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i);
    }

    public CarouselLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new com.google.android.material.carousel.CarouselLayoutManager.DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.CarouselLayoutManager$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                com.google.android.material.carousel.CarouselLayoutManager.this.m10218x2ff337cb(view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new com.google.android.material.carousel.MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }

    private void setCarouselAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.Carousel);
            setCarouselAlignment(obtainStyledAttributes.getInt(com.google.android.material.R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(obtainStyledAttributes.getInt(com.google.android.material.R.styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public void setCarouselAlignment(int i) {
        this.carouselAlignment = i;
        refreshKeylineState();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingTop();
        }
        return getPaddingLeft();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingBottom();
        }
        return getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
    }

    public void setCarouselStrategy(com.google.android.material.carousel.CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        if (state.getItemCount() <= 0 || getContainerSize() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        boolean z = this.keylineStateList == null;
        if (z) {
            recalculateKeylineStateList(recycler);
        }
        int calculateStartScroll = calculateStartScroll(this.keylineStateList);
        int calculateEndScroll = calculateEndScroll(state, this.keylineStateList);
        this.minScroll = isLayoutRtl ? calculateEndScroll : calculateStartScroll;
        if (isLayoutRtl) {
            calculateEndScroll = calculateStartScroll;
        }
        this.maxScroll = calculateEndScroll;
        if (z) {
            this.scrollOffset = calculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
            int i = this.currentEstimatedPosition;
            if (i != -1) {
                this.scrollOffset = getScrollOffsetForPosition(i, getKeylineStateForPosition(i));
            }
        }
        int i2 = this.scrollOffset;
        this.scrollOffset = i2 + calculateShouldScrollBy(0, i2, this.minScroll, this.maxScroll);
        this.currentFillStartPosition = androidx.core.math.MathUtils.clamp(this.currentFillStartPosition, 0, state.getItemCount());
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        detachAndScrapAttachedViews(recycler);
        fill(recycler, state);
        this.lastItemCount = getItemCount();
    }

    private void recalculateKeylineStateList(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
        android.view.View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewForPosition);
        if (isLayoutRtl()) {
            onFirstChildMeasuredWithMargins = com.google.android.material.carousel.KeylineState.reverse(onFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = com.google.android.material.carousel.KeylineStateList.from(this, onFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift());
    }

    private int getItemMargins() {
        int i;
        int i2;
        if (getChildCount() <= 0) {
            return 0;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i = layoutParams.leftMargin;
            i2 = layoutParams.rightMargin;
        } else {
            i = layoutParams.topMargin;
            i2 = layoutParams.bottomMargin;
        }
        return i + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void fill(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        removeAndRecycleOutOfBoundsViews(recycler);
        if (getChildCount() == 0) {
            addViewsStart(recycler, this.currentFillStartPosition - 1);
            addViewsEnd(recycler, state, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(recycler, position - 1);
            addViewsEnd(recycler, state, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    private void addViewsStart(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i) {
        float calculateChildStartForFill = calculateChildStartForFill(i);
        while (i >= 0) {
            com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                return;
            }
            calculateChildStartForFill = addStart(calculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                addAndLayoutView(makeChildCalculations.child, 0, makeChildCalculations);
            }
            i--;
        }
    }

    private void addViewAtPosition(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i, int i2) {
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill(i), i);
        addAndLayoutView(makeChildCalculations.child, i2, makeChildCalculations);
    }

    private void addViewsEnd(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        float calculateChildStartForFill = calculateChildStartForFill(i);
        while (i < state.getItemCount()) {
            com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                return;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                addAndLayoutView(makeChildCalculations.child, -1, makeChildCalculations);
            }
            i++;
        }
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && android.util.Log.isLoggable(TAG, 3)) {
            for (int i = 0; i < getChildCount(); i++) {
                android.view.View childAt = getChildAt(i);
                getDecoratedCenterWithMargins(childAt);
                getPosition(childAt);
            }
        }
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() <= 0) {
            return;
        }
        int i = 0;
        while (i < getChildCount() - 1) {
            int position = getPosition(getChildAt(i));
            int i2 = i + 1;
            int position2 = getPosition(getChildAt(i2));
            if (position > position2) {
                logChildrenIfDebugging();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Detected invalid child order. Child at index [");
                sb.append(i);
                sb.append("] had adapter position [");
                sb.append(position);
                sb.append("] and child at index [");
                sb.append(i2);
                sb.append("] had adapter position [");
                sb.append(position2);
                sb.append("].");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            i = i2;
        }
    }

    private com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations makeChildCalculations(androidx.recyclerview.widget.RecyclerView.Recycler recycler, float f, int i) {
        android.view.View viewForPosition = recycler.getViewForPosition(i);
        measureChildWithMargins(viewForPosition, 0, 0);
        float addEnd = addEnd(f, this.currentKeylineState.getItemSize() / 2.0f);
        com.google.android.material.carousel.CarouselLayoutManager.KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        return new com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations(viewForPosition, addEnd, calculateChildOffsetCenterForLocation(viewForPosition, addEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private void addAndLayoutView(android.view.View view, int i, com.google.android.material.carousel.CarouselLayoutManager.ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i);
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (childCalculations.offsetCenter - itemSize), (int) (childCalculations.offsetCenter + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange keylineRange) {
        float addEnd = addEnd(f, getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f);
        return isLayoutRtl() ? addEnd > ((float) getContainerSize()) : addEnd < 0.0f;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange keylineRange) {
        float addStart = addStart(f, getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f);
        return isLayoutRtl() ? addStart < 0.0f : addStart > ((float) getContainerSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(android.view.View view, android.graphics.Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (isHorizontal()) {
            centerY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(centerY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), centerY, true));
        float width = isHorizontal() ? (rect.width() - maskedItemSizeForLocOffset) / 2.0f : 0.0f;
        float height = isHorizontal() ? 0.0f : (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    private float getDecoratedCenterWithMargins(android.view.View view) {
        int centerY;
        android.graphics.Rect rect = new android.graphics.Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        if (isHorizontal()) {
            centerY = rect.centerX();
        } else {
            centerY = rect.centerY();
        }
        return centerY;
    }

    private void removeAndRecycleOutOfBoundsViews(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            android.view.View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
    }

    private static com.google.android.material.carousel.CarouselLayoutManager.KeylineRange getSurroundingKeylineRange(java.util.List<com.google.android.material.carousel.KeylineState.Keyline> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.google.android.material.carousel.KeylineState.Keyline keyline = list.get(i5);
            float f6 = z ? keyline.locOffset : keyline.loc;
            float abs = java.lang.Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new com.google.android.material.carousel.CarouselLayoutManager.KeylineRange(list.get(i), list.get(i3));
    }

    private void updateCurrentKeylineStateForScrollOffset(com.google.android.material.carousel.KeylineStateList keylineStateList) {
        int i = this.maxScroll;
        int i2 = this.minScroll;
        if (i <= i2) {
            this.currentKeylineState = isLayoutRtl() ? keylineStateList.getEndState() : keylineStateList.getStartState();
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i2, i);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private int calculateStartScroll(com.google.android.material.carousel.KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        com.google.android.material.carousel.KeylineState endState = isLayoutRtl ? keylineStateList.getEndState() : keylineStateList.getStartState();
        return (int) (getParentStart() - addStart((isLayoutRtl ? endState.getLastFocalKeyline() : endState.getFirstFocalKeyline()).loc, endState.getItemSize() / 2.0f));
    }

    private int calculateEndScroll(androidx.recyclerview.widget.RecyclerView.State state, com.google.android.material.carousel.KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        com.google.android.material.carousel.KeylineState startState = isLayoutRtl ? keylineStateList.getStartState() : keylineStateList.getEndState();
        com.google.android.material.carousel.KeylineState.Keyline firstFocalKeyline = isLayoutRtl ? startState.getFirstFocalKeyline() : startState.getLastFocalKeyline();
        int itemCount = (int) (((((state.getItemCount() - 1) * startState.getItemSize()) * (isLayoutRtl ? -1.0f : 1.0f)) - (firstFocalKeyline.loc - getParentStart())) + (getParentEnd() - firstFocalKeyline.loc) + (isLayoutRtl ? -firstFocalKeyline.leftOrTopPaddingShift : firstFocalKeyline.rightOrBottomPaddingShift));
        return isLayoutRtl ? java.lang.Math.min(0, itemCount) : java.lang.Math.max(0, itemCount);
    }

    private float calculateChildStartForFill(int i) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i);
    }

    private float calculateChildOffsetCenterForLocation(android.view.View view, float f, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange keylineRange) {
        float lerp = com.google.android.material.animation.AnimationUtils.lerp(keylineRange.leftOrTop.locOffset, keylineRange.rightOrBottom.locOffset, keylineRange.leftOrTop.loc, keylineRange.rightOrBottom.loc, f);
        if (keylineRange.rightOrBottom != this.currentKeylineState.getFirstKeyline() && keylineRange.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return lerp;
        }
        return lerp + ((f - keylineRange.rightOrBottom.loc) * ((1.0f - keylineRange.rightOrBottom.mask) + (this.orientationHelper.getMaskMargins((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()) / this.currentKeylineState.getItemSize())));
    }

    private float getMaskedItemSizeForLocOffset(float f, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange keylineRange) {
        return com.google.android.material.animation.AnimationUtils.lerp(keylineRange.leftOrTop.maskedItemSize, keylineRange.rightOrBottom.maskedItemSize, keylineRange.leftOrTop.locOffset, keylineRange.rightOrBottom.locOffset, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(android.view.View view, float f, com.google.android.material.carousel.CarouselLayoutManager.KeylineRange keylineRange) {
        if (view instanceof com.google.android.material.carousel.Maskable) {
            float lerp = com.google.android.material.animation.AnimationUtils.lerp(keylineRange.leftOrTop.mask, keylineRange.rightOrBottom.mask, keylineRange.leftOrTop.loc, keylineRange.rightOrBottom.loc, f);
            float height = view.getHeight();
            float width = view.getWidth();
            android.graphics.RectF maskRect = this.orientationHelper.getMaskRect(height, width, com.google.android.material.animation.AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, lerp), com.google.android.material.animation.AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, lerp));
            float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, f, keylineRange);
            android.graphics.RectF rectF = new android.graphics.RectF(calculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), calculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), (maskRect.width() / 2.0f) + calculateChildOffsetCenterForLocation, (maskRect.height() / 2.0f) + calculateChildOffsetCenterForLocation);
            android.graphics.RectF rectF2 = new android.graphics.RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.isContained()) {
                this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((com.google.android.material.carousel.Maskable) view).setMaskRectF(maskRect);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(android.view.View view, int i, int i2) {
        float f;
        float f2;
        if (!(view instanceof com.google.android.material.carousel.Maskable)) {
            throw new java.lang.IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect = new android.graphics.Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = rect.left;
        int i4 = rect.right;
        int i5 = rect.top;
        int i6 = rect.bottom;
        if (this.keylineStateList != null && this.orientationHelper.orientation == 0) {
            f = this.keylineStateList.getDefaultState().getItemSize();
        } else {
            f = layoutParams.width;
        }
        if (this.keylineStateList != null && this.orientationHelper.orientation == 1) {
            f2 = this.keylineStateList.getDefaultState().getItemSize();
        } else {
            f2 = layoutParams.height;
        }
        int width = getWidth();
        int widthMode = getWidthMode();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int childMeasureSpec = getChildMeasureSpec(width, widthMode, paddingLeft + paddingRight + layoutParams.leftMargin + layoutParams.rightMargin + i + i3 + i4, (int) f, canScrollHorizontally());
        int height = getHeight();
        int heightMode = getHeightMode();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        view.measure(childMeasureSpec, getChildMeasureSpec(height, heightMode, paddingTop + paddingBottom + layoutParams.topMargin + layoutParams.bottomMargin + i2 + i5 + i6, (int) f2, canScrollVertically()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    private int getContainerSize() {
        if (isHorizontal()) {
            return getContainerWidth();
        }
        return getContainerHeight();
    }

    boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    private float addStart(float f, float f2) {
        return isLayoutRtl() ? f + f2 : f - f2;
    }

    private float addEnd(float f, float f2) {
        return isLayoutRtl() ? f - f2 : f + f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    private int getScrollOffsetForPosition(int i, com.google.android.material.carousel.KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) (((i * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i, com.google.android.material.carousel.KeylineState keylineState) {
        int i2;
        int i3 = Integer.MAX_VALUE;
        for (com.google.android.material.carousel.KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (i * keylineState.getItemSize()) + (keylineState.getItemSize() / 2.0f);
            if (isLayoutRtl()) {
                i2 = (int) ((getContainerSize() - keyline.loc) - itemSize);
            } else {
                i2 = (int) (itemSize - keyline.loc);
            }
            int i4 = i2 - this.scrollOffset;
            if (java.lang.Math.abs(i3) > java.lang.Math.abs(i4)) {
                i3 = i4;
            }
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public android.graphics.PointF computeScrollVectorForPosition(int i) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, getKeylineStateForPosition(i));
        if (isHorizontal()) {
            return new android.graphics.PointF(offsetToScrollToPosition, 0.0f);
        }
        return new android.graphics.PointF(0.0f, offsetToScrollToPosition);
    }

    int getOffsetToScrollToPosition(int i, com.google.android.material.carousel.KeylineState keylineState) {
        return getScrollOffsetForPosition(i, keylineState) - this.scrollOffset;
    }

    int getOffsetToScrollToPositionForSnap(int i, boolean z) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i, getKeylineStateForPosition(i)) : offsetToScrollToPosition;
        return (!z || java.lang.Math.abs(offsetToScrollToPosition2) >= java.lang.Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    private com.google.android.material.carousel.KeylineState getKeylineStateForPosition(int i) {
        com.google.android.material.carousel.KeylineState keylineState;
        java.util.Map<java.lang.Integer, com.google.android.material.carousel.KeylineState> map = this.keylineStatePositionMap;
        return (map == null || (keylineState = map.get(java.lang.Integer.valueOf(androidx.core.math.MathUtils.clamp(i, 0, java.lang.Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.getDefaultState() : keylineState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.currentEstimatedPosition = i;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i, getKeylineStateForPosition(i));
        this.currentFillStartPosition = androidx.core.math.MathUtils.clamp(i, 0, java.lang.Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        androidx.recyclerview.widget.LinearSmoothScroller linearSmoothScroller = new androidx.recyclerview.widget.LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public android.graphics.PointF computeScrollVectorForPosition(int i2) {
                return com.google.android.material.carousel.CarouselLayoutManager.this.computeScrollVectorForPosition(i2);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDxToMakeVisible(android.view.View view, int i2) {
                if (com.google.android.material.carousel.CarouselLayoutManager.this.keylineStateList == null || !com.google.android.material.carousel.CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager = com.google.android.material.carousel.CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDyToMakeVisible(android.view.View view, int i2) {
                if (com.google.android.material.carousel.CarouselLayoutManager.this.keylineStateList == null || com.google.android.material.carousel.CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager = com.google.android.material.carousel.CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }
        };
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    int calculateScrollDeltaToMakePositionVisible(int i) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i, getKeylineStateForPosition(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i, recycler, state);
        }
        return 0;
    }

    static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            if (orientation == 0) {
                return isLayoutRtl() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && orientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        if (orientation == 0) {
            return isLayoutRtl() ? -1 : 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View view, int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    private android.view.View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private android.view.View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z, boolean z2) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    private void scrollBy(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    private int scrollBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        float f;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(recycler);
        }
        int calculateShouldScrollBy = calculateShouldScrollBy(i, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += calculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        android.graphics.Rect rect = new android.graphics.Rect();
        if (isLayoutRtl()) {
            f = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            android.view.View childAt = getChildAt(i2);
            float abs = java.lang.Math.abs(f - offsetChild(childAt, calculateChildStartForFill, itemSize, rect));
            if (childAt != null && abs < f2) {
                this.currentEstimatedPosition = getPosition(childAt);
                f2 = abs;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(recycler, state);
        return calculateShouldScrollBy;
    }

    private float offsetChild(android.view.View view, float f, float f2, android.graphics.Rect rect) {
        float addEnd = addEnd(f, f2);
        com.google.android.material.carousel.CarouselLayoutManager.KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f2, calculateChildOffsetCenterForLocation);
        return calculateChildOffsetCenterForLocation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:".concat(java.lang.String.valueOf(i)));
        }
        assertNotInLayoutOrScroll(null);
        com.google.android.material.carousel.CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i != carouselOrientationHelper.orientation) {
            this.orientationHelper = com.google.android.material.carousel.CarouselOrientationHelper.createOrientationHelper(this, i);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        updateItemCount();
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i = this.lastItemCount;
        if (itemCount == i || this.keylineStateList == null) {
            return;
        }
        if (this.carouselStrategy.shouldRefreshKeylineState(this, i)) {
            refreshKeylineState();
        }
        this.lastItemCount = itemCount;
    }

    public void setDebuggingEnabled(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z) {
        this.isDebuggingEnabled = z;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    static class KeylineRange {
        final com.google.android.material.carousel.KeylineState.Keyline leftOrTop;
        final com.google.android.material.carousel.KeylineState.Keyline rightOrBottom;

        KeylineRange(com.google.android.material.carousel.KeylineState.Keyline keyline, com.google.android.material.carousel.KeylineState.Keyline keyline2) {
            androidx.core.util.Preconditions.checkArgument(keyline.loc <= keyline2.loc);
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    static class DebugItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines;
        private final android.graphics.Paint linePaint;

        DebugItemDecoration() {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.linePaint = paint;
            this.keylines = java.util.Collections.unmodifiableList(new java.util.ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void setKeylines(java.util.List<com.google.android.material.carousel.KeylineState.Keyline> list) {
            this.keylines = java.util.Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(com.google.android.material.R.dimen.m3_carousel_debug_keyline_width));
            for (com.google.android.material.carousel.KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(androidx.core.graphics.ColorUtils.blendARGB(-65281, -16776961, keyline.mask));
                if (((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }
    }
}
