package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {

    @java.lang.Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int accessartificialFrame;
    androidx.recyclerview.widget.OrientationHelper getHighSpeedVideoFpsRanges;
    androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[] getOutputFormats;
    androidx.recyclerview.widget.OrientationHelper getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizeshNQ4ISI;
    private int getOutputStallDurationlomOqCM;
    private java.util.BitSet getValidOutputFormatsForInputhNQ4ISI;
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState isOutputSupportedFor;
    private final androidx.recyclerview.widget.LayoutState isOutputSupportedForhNQ4ISI;
    private int toString;
    private int[] unwrapAs;
    private int CoroutineDebuggingKt = -1;
    boolean Camera2StreamConfigurationMap = false;
    boolean getInputSizeshNQ4ISI = false;
    int getHighSpeedVideoFpsRangesFor = -1;
    int getHighSpeedVideoSizes = Integer.MIN_VALUE;
    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup getHighResolutionOutputSizeshNQ4ISI = new androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup();
    private int getOutputStallDuration = 2;
    private final android.graphics.Rect coroutineCreation = new android.graphics.Rect();
    private final androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo getInputFormats = new androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo();
    private boolean getOutputSizes = false;
    private boolean ArtificialStackFrames = true;
    private final java.lang.Runnable getHighSpeedVideoSizesFor = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighResolutionOutputSizeshNQ4ISI();
        }
    };

    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.isOutputSupportedForhNQ4ISI = new androidx.recyclerview.widget.LayoutState();
        this.getHighSpeedVideoFpsRanges = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(this, this.toString);
        this.getOutputMinFrameDuration = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(this, 1 - this.toString);
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.toString = i2;
        setSpanCount(i);
        this.isOutputSupportedForhNQ4ISI = new androidx.recyclerview.widget.LayoutState();
        this.getHighSpeedVideoFpsRanges = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(this, this.toString);
        this.getOutputMinFrameDuration = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(this, 1 - this.toString);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.getOutputStallDuration != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int position;
        int position2;
        if (getChildCount() == 0 || this.getOutputStallDuration == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.getInputSizeshNQ4ISI) {
            int childCount = getChildCount();
            position = childCount == 0 ? 0 : getPosition(getChildAt(childCount - 1));
            if (getChildCount() != 0) {
                position2 = getPosition(getChildAt(0));
                if (position != 0 && Camera2StreamConfigurationMap() != null) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup = this.getHighResolutionOutputSizeshNQ4ISI;
                    int[] iArr = lazySpanLookup.getHighSpeedVideoSizes;
                    if (iArr != null) {
                        java.util.Arrays.fill(iArr, -1);
                    }
                    lazySpanLookup.getHighSpeedVideoFpsRanges = null;
                    requestSimpleAnimationsInNextLayout();
                    requestLayout();
                    return true;
                }
                if (this.getOutputSizes) {
                    return false;
                }
                int i = this.getInputSizeshNQ4ISI ? -1 : 1;
                int i2 = position2 + 1;
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(position, i2, i);
                if (highResolutionOutputSizeshNQ4ISI == null) {
                    this.getOutputSizes = false;
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(i2);
                    return false;
                }
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem highResolutionOutputSizeshNQ4ISI2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(position, highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI, i * (-1));
                if (highResolutionOutputSizeshNQ4ISI2 == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI2.getHighResolutionOutputSizeshNQ4ISI + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            position2 = 0;
            if (position != 0) {
            }
            if (this.getOutputSizes) {
            }
        } else {
            position = getChildCount() == 0 ? 0 : getPosition(getChildAt(0));
            int childCount2 = getChildCount();
            if (childCount2 != 0) {
                position2 = getPosition(getChildAt(childCount2 - 1));
                if (position != 0) {
                }
                if (this.getOutputSizes) {
                }
            }
            position2 = 0;
            if (position != 0) {
            }
            if (this.getOutputSizes) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.getHighSpeedVideoSizesFor);
        for (int i = 0; i < this.CoroutineDebuggingKt; i++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getOutputFormats[i];
            span.getHighSpeedVideoFpsRanges.clear();
            span.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
            span.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
            span.getHighSpeedVideoSizes = 0;
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private android.view.View Camera2StreamConfigurationMap() {
        int i;
        int childCount = getChildCount();
        int i2 = childCount - 1;
        java.util.BitSet bitSet = new java.util.BitSet(this.CoroutineDebuggingKt);
        bitSet.set(0, this.CoroutineDebuggingKt, true);
        char c = (this.toString == 1 && getLayoutDirection() == 1) ? (char) 1 : (char) 65535;
        if (this.getInputSizeshNQ4ISI) {
            childCount = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < childCount ? 1 : -1;
        while (i2 != childCount) {
            android.view.View childAt = getChildAt(i2);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams();
            if (bitSet.get(layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI)) {
                if (Camera2StreamConfigurationMap(layoutParams.getHighSpeedVideoSizes)) {
                    return childAt;
                }
                bitSet.clear(layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (!layoutParams.Camera2StreamConfigurationMap && (i = i2 + i3) != childCount) {
                android.view.View childAt2 = getChildAt(i);
                if (this.getInputSizeshNQ4ISI) {
                    int decoratedEnd = this.getHighSpeedVideoFpsRanges.getDecoratedEnd(childAt);
                    int decoratedEnd2 = this.getHighSpeedVideoFpsRanges.getDecoratedEnd(childAt2);
                    if (decoratedEnd >= decoratedEnd2) {
                        if (decoratedEnd != decoratedEnd2) {
                            continue;
                        }
                        if ((layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI - ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt2.getLayoutParams()).getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI >= 0) == (c >= 0)) {
                        }
                    }
                } else {
                    int decoratedStart = this.getHighSpeedVideoFpsRanges.getDecoratedStart(childAt);
                    int decoratedStart2 = this.getHighSpeedVideoFpsRanges.getDecoratedStart(childAt2);
                    if (decoratedStart <= decoratedStart2) {
                        if (decoratedStart != decoratedStart2) {
                            continue;
                        }
                        if ((layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI - ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt2.getLayoutParams()).getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI >= 0) == (c >= 0)) {
                        }
                    }
                }
                return childAt;
            }
            i2 += i3;
        }
        return null;
    }

    private boolean Camera2StreamConfigurationMap(androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span) {
        boolean z;
        if (this.getInputSizeshNQ4ISI) {
            int i = span.Camera2StreamConfigurationMap;
            if (i == Integer.MIN_VALUE) {
                span.getHighSpeedVideoSizes();
                i = span.Camera2StreamConfigurationMap;
            }
            if (i < this.getHighSpeedVideoFpsRanges.getEndAfterPadding()) {
                z = androidx.recyclerview.widget.StaggeredGridLayoutManager.Span.getHighSpeedVideoFpsRanges(span.getHighSpeedVideoFpsRanges.get(span.getHighSpeedVideoFpsRanges.size() - 1)).Camera2StreamConfigurationMap;
                return !z;
            }
            return false;
        }
        int i2 = span.getHighSpeedVideoFpsRangesFor;
        if (i2 == Integer.MIN_VALUE) {
            span.Camera2StreamConfigurationMap();
            i2 = span.getHighSpeedVideoFpsRangesFor;
        }
        if (i2 > this.getHighSpeedVideoFpsRanges.getStartAfterPadding()) {
            z = androidx.recyclerview.widget.StaggeredGridLayoutManager.Span.getHighSpeedVideoFpsRanges(span.getHighSpeedVideoFpsRanges.get(0)).Camera2StreamConfigurationMap;
            return !z;
        }
        return false;
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.CoroutineDebuggingKt) {
            invalidateSpanAssignments();
            this.CoroutineDebuggingKt = i;
            this.getValidOutputFormatsForInputhNQ4ISI = new java.util.BitSet(this.CoroutineDebuggingKt);
            this.getOutputFormats = new androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[this.CoroutineDebuggingKt];
            for (int i2 = 0; i2 < this.CoroutineDebuggingKt; i2++) {
                this.getOutputFormats[i2] = new androidx.recyclerview.widget.StaggeredGridLayoutManager.Span(i2);
            }
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.toString) {
            return;
        }
        this.toString = i;
        androidx.recyclerview.widget.OrientationHelper orientationHelper = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = orientationHelper;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = this.isOutputSupportedFor;
        if (savedState != null && savedState.getHighSpeedVideoFpsRanges != z) {
            this.isOutputSupportedFor.getHighSpeedVideoFpsRanges = z;
        }
        this.Camera2StreamConfigurationMap = z;
        requestLayout();
    }

    public int getGapStrategy() {
        return this.getOutputStallDuration;
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.getOutputStallDuration) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new java.lang.IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.getOutputStallDuration = i;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(java.lang.String str) {
        if (this.isOutputSupportedFor == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public int getSpanCount() {
        return this.CoroutineDebuggingKt;
    }

    public void invalidateSpanAssignments() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup = this.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr = lazySpanLookup.getHighSpeedVideoSizes;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        lazySpanLookup.getHighSpeedVideoFpsRanges = null;
        requestLayout();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.toString == 1 || getLayoutDirection() != 1) {
            this.getInputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
        } else {
            this.getInputSizeshNQ4ISI = !this.Camera2StreamConfigurationMap;
        }
    }

    public boolean getReverseLayout() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.toString == 1) {
            chooseSize2 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = chooseSize(i, (this.accessartificialFrame * this.CoroutineDebuggingKt) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = chooseSize(i2, (this.accessartificialFrame * this.CoroutineDebuggingKt) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter adapter, androidx.recyclerview.widget.RecyclerView.Adapter adapter2) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup = this.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr = lazySpanLookup.getHighSpeedVideoSizes;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        lazySpanLookup.getHighSpeedVideoFpsRanges = null;
        for (int i = 0; i < this.CoroutineDebuggingKt; i++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getOutputFormats[i];
            span.getHighSpeedVideoFpsRanges.clear();
            span.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
            span.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
            span.getHighSpeedVideoSizes = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighSpeedVideoSizes = Integer.MIN_VALUE;
        this.isOutputSupportedFor = null;
        this.getInputFormats.getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.isOutputSupportedFor == null;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        int highSpeedVideoFpsRangesFor;
        if (iArr == null) {
            iArr = new int[this.CoroutineDebuggingKt];
        } else if (iArr.length < this.CoroutineDebuggingKt) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.CoroutineDebuggingKt);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.CoroutineDebuggingKt; i++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getOutputFormats[i];
            if (androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap) {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(span.getHighSpeedVideoFpsRanges.size() - 1, -1, false, true, false);
            } else {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(0, span.getHighSpeedVideoFpsRanges.size(), false, true, false);
            }
            iArr[i] = highSpeedVideoFpsRangesFor;
        }
        return iArr;
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        int highSpeedVideoFpsRangesFor;
        if (iArr == null) {
            iArr = new int[this.CoroutineDebuggingKt];
        } else if (iArr.length < this.CoroutineDebuggingKt) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.CoroutineDebuggingKt);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.CoroutineDebuggingKt; i++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getOutputFormats[i];
            if (androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap) {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(span.getHighSpeedVideoFpsRanges.size() - 1, -1, true, true, false);
            } else {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(0, span.getHighSpeedVideoFpsRanges.size(), true, true, false);
            }
            iArr[i] = highSpeedVideoFpsRangesFor;
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        int highSpeedVideoFpsRangesFor;
        if (iArr == null) {
            iArr = new int[this.CoroutineDebuggingKt];
        } else if (iArr.length < this.CoroutineDebuggingKt) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.CoroutineDebuggingKt);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.CoroutineDebuggingKt; i++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getOutputFormats[i];
            if (androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap) {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(0, span.getHighSpeedVideoFpsRanges.size(), false, true, false);
            } else {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(span.getHighSpeedVideoFpsRanges.size() - 1, -1, false, true, false);
            }
            iArr[i] = highSpeedVideoFpsRangesFor;
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        int highSpeedVideoFpsRangesFor;
        if (iArr == null) {
            iArr = new int[this.CoroutineDebuggingKt];
        } else if (iArr.length < this.CoroutineDebuggingKt) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.CoroutineDebuggingKt);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.CoroutineDebuggingKt; i++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getOutputFormats[i];
            if (androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap) {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(0, span.getHighSpeedVideoFpsRanges.size(), true, true, false);
            } else {
                highSpeedVideoFpsRangesFor = span.getHighSpeedVideoFpsRangesFor(span.getHighSpeedVideoFpsRanges.size() - 1, -1, true, true, false);
            }
            iArr[i] = highSpeedVideoFpsRangesFor;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
        return Camera2StreamConfigurationMap(state);
    }

    private int Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return androidx.recyclerview.widget.ScrollbarHelper.getHighSpeedVideoSizes(state, this.getHighSpeedVideoFpsRanges, getHighResolutionOutputSizeshNQ4ISI(!this.ArtificialStackFrames), getHighSpeedVideoSizes(!this.ArtificialStackFrames), this, this.ArtificialStackFrames, this.getInputSizeshNQ4ISI);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
        return Camera2StreamConfigurationMap(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
        return getHighResolutionOutputSizeshNQ4ISI(state);
    }

    private int getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return androidx.recyclerview.widget.ScrollbarHelper.getHighResolutionOutputSizeshNQ4ISI(state, this.getHighSpeedVideoFpsRanges, getHighResolutionOutputSizeshNQ4ISI(!this.ArtificialStackFrames), getHighSpeedVideoSizes(!this.ArtificialStackFrames), this, this.ArtificialStackFrames);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State state) {
        return getHighResolutionOutputSizeshNQ4ISI(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
        return getHighSpeedVideoFpsRanges(state);
    }

    private int getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return androidx.recyclerview.widget.ScrollbarHelper.getHighSpeedVideoSizes(state, this.getHighSpeedVideoFpsRanges, getHighResolutionOutputSizeshNQ4ISI(!this.ArtificialStackFrames), getHighSpeedVideoSizes(!this.ArtificialStackFrames), this, this.ArtificialStackFrames);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
        return getHighSpeedVideoFpsRanges(state);
    }

    private void getHighSpeedVideoSizes(android.view.View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.coroutineCreation);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i, layoutParams.leftMargin + this.coroutineCreation.left, layoutParams.rightMargin + this.coroutineCreation.right);
        int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(i2, layoutParams.topMargin + this.coroutineCreation.top, layoutParams.bottomMargin + this.coroutineCreation.bottom);
        if (shouldMeasureChild(view, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, layoutParams)) {
            view.measure(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2);
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = android.view.View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = (androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState) parcelable;
            this.isOutputSupportedFor = savedState;
            if (this.getHighSpeedVideoFpsRangesFor != -1) {
                savedState.getHighSpeedVideoSizesFor = null;
                savedState.getInputSizeshNQ4ISI = 0;
                savedState.Camera2StreamConfigurationMap = -1;
                savedState.getOutputFormats = -1;
                androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState2 = this.isOutputSupportedFor;
                savedState2.getHighSpeedVideoSizesFor = null;
                savedState2.getInputSizeshNQ4ISI = 0;
                savedState2.getOutputMinFrameDuration = 0;
                savedState2.getInputFormats = null;
                savedState2.getHighSpeedVideoFpsRangesFor = null;
            }
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.os.Parcelable onSaveInstanceState() {
        int position;
        int highSpeedVideoFpsRangesFor;
        int startAfterPadding;
        if (this.isOutputSupportedFor != null) {
            return new androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState(this.isOutputSupportedFor);
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = new androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState();
        savedState.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
        savedState.getHighSpeedVideoSizes = this.getOutputSizeshNQ4ISI;
        savedState.getHighResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lazySpanLookup != null && lazySpanLookup.getHighSpeedVideoSizes != null) {
            savedState.getInputFormats = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            savedState.getOutputMinFrameDuration = savedState.getInputFormats.length;
            savedState.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        } else {
            savedState.getOutputMinFrameDuration = 0;
        }
        if (getChildCount() > 0) {
            if (this.getOutputSizeshNQ4ISI) {
                int childCount = getChildCount();
                if (childCount != 0) {
                    position = getPosition(getChildAt(childCount - 1));
                    savedState.Camera2StreamConfigurationMap = position;
                    android.view.View highSpeedVideoSizes = !this.getInputSizeshNQ4ISI ? getHighSpeedVideoSizes(true) : getHighResolutionOutputSizeshNQ4ISI(true);
                    savedState.getOutputFormats = highSpeedVideoSizes != null ? getPosition(highSpeedVideoSizes) : -1;
                    savedState.getInputSizeshNQ4ISI = this.CoroutineDebuggingKt;
                    savedState.getHighSpeedVideoSizesFor = new int[this.CoroutineDebuggingKt];
                    for (int i = 0; i < this.CoroutineDebuggingKt; i++) {
                        if (this.getOutputSizeshNQ4ISI) {
                            highSpeedVideoFpsRangesFor = this.getOutputFormats[i].getHighResolutionOutputSizeshNQ4ISI(Integer.MIN_VALUE);
                            if (highSpeedVideoFpsRangesFor != Integer.MIN_VALUE) {
                                startAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
                                highSpeedVideoFpsRangesFor -= startAfterPadding;
                                savedState.getHighSpeedVideoSizesFor[i] = highSpeedVideoFpsRangesFor;
                            } else {
                                savedState.getHighSpeedVideoSizesFor[i] = highSpeedVideoFpsRangesFor;
                            }
                        } else {
                            highSpeedVideoFpsRangesFor = this.getOutputFormats[i].getHighSpeedVideoFpsRangesFor(Integer.MIN_VALUE);
                            if (highSpeedVideoFpsRangesFor != Integer.MIN_VALUE) {
                                startAfterPadding = this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
                                highSpeedVideoFpsRangesFor -= startAfterPadding;
                                savedState.getHighSpeedVideoSizesFor[i] = highSpeedVideoFpsRangesFor;
                            } else {
                                savedState.getHighSpeedVideoSizesFor[i] = highSpeedVideoFpsRangesFor;
                            }
                        }
                    }
                    return savedState;
                }
                position = 0;
                savedState.Camera2StreamConfigurationMap = position;
                if (!this.getInputSizeshNQ4ISI) {
                }
                savedState.getOutputFormats = highSpeedVideoSizes != null ? getPosition(highSpeedVideoSizes) : -1;
                savedState.getInputSizeshNQ4ISI = this.CoroutineDebuggingKt;
                savedState.getHighSpeedVideoSizesFor = new int[this.CoroutineDebuggingKt];
                while (i < this.CoroutineDebuggingKt) {
                }
                return savedState;
            }
            if (getChildCount() != 0) {
                position = getPosition(getChildAt(0));
                savedState.Camera2StreamConfigurationMap = position;
                if (!this.getInputSizeshNQ4ISI) {
                }
                savedState.getOutputFormats = highSpeedVideoSizes != null ? getPosition(highSpeedVideoSizes) : -1;
                savedState.getInputSizeshNQ4ISI = this.CoroutineDebuggingKt;
                savedState.getHighSpeedVideoSizesFor = new int[this.CoroutineDebuggingKt];
                while (i < this.CoroutineDebuggingKt) {
                }
                return savedState;
            }
            position = 0;
            savedState.Camera2StreamConfigurationMap = position;
            if (!this.getInputSizeshNQ4ISI) {
            }
            savedState.getOutputFormats = highSpeedVideoSizes != null ? getPosition(highSpeedVideoSizes) : -1;
            savedState.getInputSizeshNQ4ISI = this.CoroutineDebuggingKt;
            savedState.getHighSpeedVideoSizesFor = new int[this.CoroutineDebuggingKt];
            while (i < this.CoroutineDebuggingKt) {
            }
            return savedState;
        }
        savedState.Camera2StreamConfigurationMap = -1;
        savedState.getOutputFormats = -1;
        savedState.getInputSizeshNQ4ISI = 0;
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            android.view.View highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(false);
            android.view.View highSpeedVideoSizes = getHighSpeedVideoSizes(false);
            if (highResolutionOutputSizeshNQ4ISI == null || highSpeedVideoSizes == null) {
                return;
            }
            int position = getPosition(highResolutionOutputSizeshNQ4ISI);
            int position2 = getPosition(highSpeedVideoSizes);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    private android.view.View getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        int startAfterPadding = this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
        int endAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
        int childCount = getChildCount();
        android.view.View view = null;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            int decoratedStart = this.getHighSpeedVideoFpsRanges.getDecoratedStart(childAt);
            if (this.getHighSpeedVideoFpsRanges.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private android.view.View getHighSpeedVideoSizes(boolean z) {
        int startAfterPadding = this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
        int endAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
        android.view.View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            int decoratedStart = this.getHighSpeedVideoFpsRanges.getDecoratedStart(childAt);
            int decoratedEnd = this.getHighSpeedVideoFpsRanges.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(Integer.MIN_VALUE);
        if (highResolutionOutputSizeshNQ4ISI == Integer.MIN_VALUE || (endAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding() - highResolutionOutputSizeshNQ4ISI) <= 0) {
            return;
        }
        int i = endAfterPadding - (-getHighSpeedVideoSizes(-endAfterPadding, recycler, state));
        if (!z || i <= 0) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.offsetChildren(i);
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(Integer.MAX_VALUE);
        if (Camera2StreamConfigurationMap == Integer.MAX_VALUE || (startAfterPadding = Camera2StreamConfigurationMap - this.getHighSpeedVideoFpsRanges.getStartAfterPadding()) <= 0) {
            return;
        }
        int highSpeedVideoSizes = startAfterPadding - getHighSpeedVideoSizes(startAfterPadding, recycler, state);
        if (!z || highSpeedVideoSizes <= 0) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.offsetChildren(-highSpeedVideoSizes);
    }

    private void getHighSpeedVideoFpsRanges(int i, androidx.recyclerview.widget.RecyclerView.State state) {
        int i2;
        int i3;
        int targetScrollPosition;
        boolean z = false;
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes = 0;
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor = i;
        if (!isSmoothScrolling() || (targetScrollPosition = state.getTargetScrollPosition()) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.getInputSizeshNQ4ISI == (targetScrollPosition < i)) {
                i2 = this.getHighSpeedVideoFpsRanges.getTotalSpace();
                i3 = 0;
            } else {
                i3 = this.getHighSpeedVideoFpsRanges.getTotalSpace();
                i2 = 0;
            }
        }
        if (getClipToPadding()) {
            this.isOutputSupportedForhNQ4ISI.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getStartAfterPadding() - i3;
            this.isOutputSupportedForhNQ4ISI.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getEndAfterPadding() + i2;
        } else {
            this.isOutputSupportedForhNQ4ISI.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getEnd() + i2;
            this.isOutputSupportedForhNQ4ISI.getInputSizeshNQ4ISI = -i3;
        }
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizesFor = false;
        this.isOutputSupportedForhNQ4ISI.getInputFormats = true;
        androidx.recyclerview.widget.LayoutState layoutState = this.isOutputSupportedForhNQ4ISI;
        if (this.getHighSpeedVideoFpsRanges.getMode() == 0 && this.getHighSpeedVideoFpsRanges.getEnd() == 0) {
            z = true;
        }
        layoutState.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    private void getInputFormats(int i) {
        this.isOutputSupportedForhNQ4ISI.getOutputMinFrameDuration = i;
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.CoroutineDebuggingKt; i2++) {
            this.getOutputFormats[i2].Camera2StreamConfigurationMap(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.CoroutineDebuggingKt; i2++) {
            this.getOutputFormats[i2].Camera2StreamConfigurationMap(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        Camera2StreamConfigurationMap(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        Camera2StreamConfigurationMap(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup = this.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr = lazySpanLookup.getHighSpeedVideoSizes;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        lazySpanLookup.getHighSpeedVideoFpsRanges = null;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, int i3) {
        Camera2StreamConfigurationMap(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, java.lang.Object obj) {
        Camera2StreamConfigurationMap(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Camera2StreamConfigurationMap(int i, int i2, int i3) {
        int position;
        int i4;
        int i5;
        int i6 = 0;
        if (this.getInputSizeshNQ4ISI) {
            int childCount = getChildCount();
            if (childCount != 0) {
                position = getPosition(getChildAt(childCount - 1));
            }
            position = 0;
        } else {
            if (getChildCount() != 0) {
                position = getPosition(getChildAt(0));
            }
            position = 0;
        }
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i5);
                if (i3 != 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i, i2);
                } else if (i3 == 2) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(i, i2);
                } else if (i3 == 8) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(i, 1);
                    this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i2, 1);
                }
                if (i4 <= position) {
                    if (this.getInputSizeshNQ4ISI) {
                        if (getChildCount() != 0) {
                            i6 = getPosition(getChildAt(0));
                        }
                    } else {
                        int childCount2 = getChildCount();
                        if (childCount2 != 0) {
                            i6 = getPosition(getChildAt(childCount2 - 1));
                        }
                    }
                    if (i5 <= i6) {
                        requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i5);
        if (i3 != 1) {
        }
        if (i4 <= position) {
        }
    }

    private int getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.LayoutState layoutState, androidx.recyclerview.widget.RecyclerView.State state) {
        int i;
        int i2;
        int startAfterPadding;
        int highResolutionOutputSizeshNQ4ISI;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span;
        int i3;
        int i4;
        int i5;
        int decoratedMeasurement;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams;
        boolean z;
        int i6;
        int i7;
        int i8;
        androidx.recyclerview.widget.RecyclerView.Recycler recycler2 = recycler;
        int i9 = 0;
        this.getValidOutputFormatsForInputhNQ4ISI.set(0, this.CoroutineDebuggingKt, true);
        if (this.isOutputSupportedForhNQ4ISI.getHighResolutionOutputSizeshNQ4ISI) {
            i2 = layoutState.getOutputMinFrameDuration == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (layoutState.getOutputMinFrameDuration == 1) {
                i = layoutState.Camera2StreamConfigurationMap + layoutState.getHighSpeedVideoSizes;
            } else {
                i = layoutState.getInputSizeshNQ4ISI - layoutState.getHighSpeedVideoSizes;
            }
            i2 = i;
        }
        getHighSpeedVideoFpsRangesFor(layoutState.getOutputMinFrameDuration, i2);
        if (this.getInputSizeshNQ4ISI) {
            startAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
        } else {
            startAfterPadding = this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
        }
        int i10 = startAfterPadding;
        boolean z2 = false;
        while (true) {
            int i11 = layoutState.getHighSpeedVideoFpsRangesFor;
            if (i11 < 0 || i11 >= state.getItemCount() || (!this.isOutputSupportedForhNQ4ISI.getHighResolutionOutputSizeshNQ4ISI && this.getValidOutputFormatsForInputhNQ4ISI.isEmpty())) {
                break;
            }
            android.view.View viewForPosition = recycler2.getViewForPosition(layoutState.getHighSpeedVideoFpsRangesFor);
            layoutState.getHighSpeedVideoFpsRangesFor += layoutState.getHighSpeedVideoFpsRanges;
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) viewForPosition.getLayoutParams();
            int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            int i12 = (iArr == null || viewLayoutPosition >= iArr.length) ? -1 : iArr[viewLayoutPosition];
            int i13 = i12 == -1 ? 1 : i9;
            if (i13 != 0) {
                if (layoutParams2.Camera2StreamConfigurationMap) {
                    span = this.getOutputFormats[i9];
                } else {
                    if (getInputSizeshNQ4ISI(layoutState.getOutputMinFrameDuration)) {
                        i7 = this.CoroutineDebuggingKt - 1;
                        i6 = -1;
                        i8 = -1;
                    } else {
                        i6 = this.CoroutineDebuggingKt;
                        i7 = i9;
                        i8 = 1;
                    }
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span2 = null;
                    if (layoutState.getOutputMinFrameDuration == 1) {
                        int startAfterPadding2 = this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
                        int i14 = Integer.MAX_VALUE;
                        while (i7 != i6) {
                            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span3 = this.getOutputFormats[i7];
                            int highResolutionOutputSizeshNQ4ISI2 = span3.getHighResolutionOutputSizeshNQ4ISI(startAfterPadding2);
                            if (highResolutionOutputSizeshNQ4ISI2 < i14) {
                                span2 = span3;
                                i14 = highResolutionOutputSizeshNQ4ISI2;
                            }
                            i7 += i8;
                        }
                    } else {
                        int endAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
                        int i15 = Integer.MIN_VALUE;
                        while (i7 != i6) {
                            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span4 = this.getOutputFormats[i7];
                            int highSpeedVideoFpsRangesFor = span4.getHighSpeedVideoFpsRangesFor(endAfterPadding);
                            if (highSpeedVideoFpsRangesFor > i15) {
                                span2 = span4;
                                i15 = highSpeedVideoFpsRangesFor;
                            }
                            i7 += i8;
                        }
                    }
                    span = span2;
                }
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup = this.getHighResolutionOutputSizeshNQ4ISI;
                lazySpanLookup.getHighSpeedVideoFpsRangesFor(viewLayoutPosition);
                lazySpanLookup.getHighSpeedVideoSizes[viewLayoutPosition] = span.getHighResolutionOutputSizeshNQ4ISI;
            } else {
                span = this.getOutputFormats[i12];
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span5 = span;
            layoutParams2.getHighSpeedVideoSizes = span5;
            if (layoutState.getOutputMinFrameDuration == 1) {
                addView(viewForPosition);
            } else {
                addView(viewForPosition, 0);
            }
            if (layoutParams2.Camera2StreamConfigurationMap) {
                if (this.toString == 1) {
                    getHighSpeedVideoSizes(viewForPosition, this.getOutputStallDurationlomOqCM, getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams2.height, true), false);
                } else {
                    getHighSpeedVideoSizes(viewForPosition, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams2.width, true), this.getOutputStallDurationlomOqCM, false);
                }
            } else if (this.toString == 1) {
                getHighSpeedVideoSizes(viewForPosition, getChildMeasureSpec(this.accessartificialFrame, getWidthMode(), 0, layoutParams2.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams2.height, true), false);
            } else {
                getHighSpeedVideoSizes(viewForPosition, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams2.width, true), getChildMeasureSpec(this.accessartificialFrame, getHeightMode(), 0, layoutParams2.height, false), false);
            }
            if (layoutState.getOutputMinFrameDuration == 1) {
                int highResolutionOutputSizeshNQ4ISI3 = layoutParams2.Camera2StreamConfigurationMap ? getHighResolutionOutputSizeshNQ4ISI(i10) : span5.getHighResolutionOutputSizeshNQ4ISI(i10);
                int decoratedMeasurement2 = this.getHighSpeedVideoFpsRanges.getDecoratedMeasurement(viewForPosition) + highResolutionOutputSizeshNQ4ISI3;
                if (i13 != 0 && layoutParams2.Camera2StreamConfigurationMap) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = new androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
                    fullSpanItem.Camera2StreamConfigurationMap = new int[this.CoroutineDebuggingKt];
                    for (int i16 = 0; i16 < this.CoroutineDebuggingKt; i16++) {
                        fullSpanItem.Camera2StreamConfigurationMap[i16] = highResolutionOutputSizeshNQ4ISI3 - this.getOutputFormats[i16].getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI3);
                    }
                    fullSpanItem.getHighSpeedVideoFpsRanges = -1;
                    fullSpanItem.getHighResolutionOutputSizeshNQ4ISI = viewLayoutPosition;
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(fullSpanItem);
                }
                i4 = highResolutionOutputSizeshNQ4ISI3;
                i3 = decoratedMeasurement2;
            } else {
                int Camera2StreamConfigurationMap = layoutParams2.Camera2StreamConfigurationMap ? Camera2StreamConfigurationMap(i10) : span5.getHighSpeedVideoFpsRangesFor(i10);
                int decoratedMeasurement3 = Camera2StreamConfigurationMap - this.getHighSpeedVideoFpsRanges.getDecoratedMeasurement(viewForPosition);
                if (i13 != 0 && layoutParams2.Camera2StreamConfigurationMap) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem2 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
                    fullSpanItem2.Camera2StreamConfigurationMap = new int[this.CoroutineDebuggingKt];
                    for (int i17 = 0; i17 < this.CoroutineDebuggingKt; i17++) {
                        fullSpanItem2.Camera2StreamConfigurationMap[i17] = this.getOutputFormats[i17].getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap) - Camera2StreamConfigurationMap;
                    }
                    fullSpanItem2.getHighSpeedVideoFpsRanges = 1;
                    fullSpanItem2.getHighResolutionOutputSizeshNQ4ISI = viewLayoutPosition;
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(fullSpanItem2);
                }
                i3 = Camera2StreamConfigurationMap;
                i4 = decoratedMeasurement3;
            }
            if (layoutParams2.Camera2StreamConfigurationMap && layoutState.getHighSpeedVideoFpsRanges == -1) {
                if (i13 == 0) {
                    if (layoutState.getOutputMinFrameDuration == 1) {
                        int highResolutionOutputSizeshNQ4ISI4 = this.getOutputFormats[0].getHighResolutionOutputSizeshNQ4ISI(Integer.MIN_VALUE);
                        for (int i18 = 1; i18 < this.CoroutineDebuggingKt; i18++) {
                            if (this.getOutputFormats[i18].getHighResolutionOutputSizeshNQ4ISI(Integer.MIN_VALUE) != highResolutionOutputSizeshNQ4ISI4) {
                                z = false;
                                break;
                            }
                        }
                        z = true;
                    } else {
                        int highSpeedVideoFpsRangesFor2 = this.getOutputFormats[0].getHighSpeedVideoFpsRangesFor(Integer.MIN_VALUE);
                        for (int i19 = 1; i19 < this.CoroutineDebuggingKt; i19++) {
                            if (this.getOutputFormats[i19].getHighSpeedVideoFpsRangesFor(Integer.MIN_VALUE) != highSpeedVideoFpsRangesFor2) {
                                z = false;
                                break;
                            }
                        }
                        z = true;
                    }
                    if (!z) {
                        androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem highResolutionOutputSizeshNQ4ISI5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(viewLayoutPosition);
                        if (highResolutionOutputSizeshNQ4ISI5 != null) {
                            highResolutionOutputSizeshNQ4ISI5.getHighSpeedVideoSizes = true;
                        }
                    }
                }
                this.getOutputSizes = true;
            }
            if (layoutState.getOutputMinFrameDuration == 1) {
                if (!layoutParams2.Camera2StreamConfigurationMap) {
                    layoutParams2.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(viewForPosition);
                } else {
                    for (int i20 = this.CoroutineDebuggingKt - 1; i20 >= 0; i20--) {
                        this.getOutputFormats[i20].getHighResolutionOutputSizeshNQ4ISI(viewForPosition);
                    }
                }
            } else if (!layoutParams2.Camera2StreamConfigurationMap) {
                layoutParams2.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(viewForPosition);
            } else {
                for (int i21 = this.CoroutineDebuggingKt - 1; i21 >= 0; i21--) {
                    this.getOutputFormats[i21].getHighSpeedVideoFpsRangesFor(viewForPosition);
                }
            }
            if (getLayoutDirection() == 1 && this.toString == 1) {
                int endAfterPadding2 = layoutParams2.Camera2StreamConfigurationMap ? this.getOutputMinFrameDuration.getEndAfterPadding() : this.getOutputMinFrameDuration.getEndAfterPadding() - (((this.CoroutineDebuggingKt - 1) - span5.getHighResolutionOutputSizeshNQ4ISI) * this.accessartificialFrame);
                decoratedMeasurement = endAfterPadding2;
                i5 = endAfterPadding2 - this.getOutputMinFrameDuration.getDecoratedMeasurement(viewForPosition);
            } else {
                int startAfterPadding3 = layoutParams2.Camera2StreamConfigurationMap ? this.getOutputMinFrameDuration.getStartAfterPadding() : (span5.getHighResolutionOutputSizeshNQ4ISI * this.accessartificialFrame) + this.getOutputMinFrameDuration.getStartAfterPadding();
                i5 = startAfterPadding3;
                decoratedMeasurement = this.getOutputMinFrameDuration.getDecoratedMeasurement(viewForPosition) + startAfterPadding3;
            }
            if (this.toString == 1) {
                layoutDecoratedWithMargins(viewForPosition, i5, i4, decoratedMeasurement, i3);
                layoutParams = layoutParams2;
            } else {
                int i22 = i4;
                int i23 = i3;
                layoutParams = layoutParams2;
                layoutDecoratedWithMargins(viewForPosition, i22, i5, i23, decoratedMeasurement);
            }
            if (layoutParams.Camera2StreamConfigurationMap) {
                getHighSpeedVideoFpsRangesFor(this.isOutputSupportedForhNQ4ISI.getOutputMinFrameDuration, i2);
            } else {
                getHighSpeedVideoFpsRangesFor(span5, this.isOutputSupportedForhNQ4ISI.getOutputMinFrameDuration, i2);
            }
            getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI);
            if (this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizesFor && viewForPosition.hasFocusable()) {
                if (layoutParams.Camera2StreamConfigurationMap) {
                    this.getValidOutputFormatsForInputhNQ4ISI.clear();
                } else {
                    this.getValidOutputFormatsForInputhNQ4ISI.set(span5.getHighResolutionOutputSizeshNQ4ISI, false);
                }
            }
            recycler2 = recycler;
            z2 = true;
            i9 = 0;
        }
        androidx.recyclerview.widget.RecyclerView.Recycler recycler3 = recycler2;
        if (!z2) {
            getHighResolutionOutputSizeshNQ4ISI(recycler3, this.isOutputSupportedForhNQ4ISI);
        }
        if (this.isOutputSupportedForhNQ4ISI.getOutputMinFrameDuration == -1) {
            highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getStartAfterPadding() - Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.getStartAfterPadding());
        } else {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getEndAfterPadding()) - this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
        }
        if (highResolutionOutputSizeshNQ4ISI > 0) {
            return java.lang.Math.min(layoutState.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI);
        }
        return 0;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.LayoutState layoutState) {
        int min;
        int min2;
        if (!layoutState.getInputFormats || layoutState.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (layoutState.getHighSpeedVideoSizes == 0) {
            if (layoutState.getOutputMinFrameDuration == -1) {
                getHighSpeedVideoSizes(recycler, layoutState.Camera2StreamConfigurationMap);
                return;
            } else {
                getHighResolutionOutputSizeshNQ4ISI(recycler, layoutState.getInputSizeshNQ4ISI);
                return;
            }
        }
        if (layoutState.getOutputMinFrameDuration == -1) {
            int highSpeedVideoFpsRangesFor = layoutState.getInputSizeshNQ4ISI - getHighSpeedVideoFpsRangesFor(layoutState.getInputSizeshNQ4ISI);
            if (highSpeedVideoFpsRangesFor < 0) {
                min2 = layoutState.Camera2StreamConfigurationMap;
            } else {
                min2 = layoutState.Camera2StreamConfigurationMap - java.lang.Math.min(highSpeedVideoFpsRangesFor, layoutState.getHighSpeedVideoSizes);
            }
            getHighSpeedVideoSizes(recycler, min2);
            return;
        }
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(layoutState.Camera2StreamConfigurationMap) - layoutState.Camera2StreamConfigurationMap;
        if (highSpeedVideoFpsRanges < 0) {
            min = layoutState.getInputSizeshNQ4ISI;
        } else {
            min = java.lang.Math.min(highSpeedVideoFpsRanges, layoutState.getHighSpeedVideoSizes) + layoutState.getInputSizeshNQ4ISI;
        }
        getHighResolutionOutputSizeshNQ4ISI(recycler, min);
    }

    private void getHighSpeedVideoFpsRangesFor(int i, int i2) {
        for (int i3 = 0; i3 < this.CoroutineDebuggingKt; i3++) {
            if (!this.getOutputFormats[i3].getHighSpeedVideoFpsRanges.isEmpty()) {
                getHighSpeedVideoFpsRangesFor(this.getOutputFormats[i3], i, i2);
            }
        }
    }

    private int getHighSpeedVideoFpsRangesFor(int i) {
        int highSpeedVideoFpsRangesFor = this.getOutputFormats[0].getHighSpeedVideoFpsRangesFor(i);
        for (int i2 = 1; i2 < this.CoroutineDebuggingKt; i2++) {
            int highSpeedVideoFpsRangesFor2 = this.getOutputFormats[i2].getHighSpeedVideoFpsRangesFor(i);
            if (highSpeedVideoFpsRangesFor2 > highSpeedVideoFpsRangesFor) {
                highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
            }
        }
        return highSpeedVideoFpsRangesFor;
    }

    private int Camera2StreamConfigurationMap(int i) {
        int highSpeedVideoFpsRangesFor = this.getOutputFormats[0].getHighSpeedVideoFpsRangesFor(i);
        for (int i2 = 1; i2 < this.CoroutineDebuggingKt; i2++) {
            int highSpeedVideoFpsRangesFor2 = this.getOutputFormats[i2].getHighSpeedVideoFpsRangesFor(i);
            if (highSpeedVideoFpsRangesFor2 < highSpeedVideoFpsRangesFor) {
                highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
            }
        }
        return highSpeedVideoFpsRangesFor;
    }

    private int getHighResolutionOutputSizeshNQ4ISI(int i) {
        int highResolutionOutputSizeshNQ4ISI = this.getOutputFormats[0].getHighResolutionOutputSizeshNQ4ISI(i);
        for (int i2 = 1; i2 < this.CoroutineDebuggingKt; i2++) {
            int highResolutionOutputSizeshNQ4ISI2 = this.getOutputFormats[i2].getHighResolutionOutputSizeshNQ4ISI(i);
            if (highResolutionOutputSizeshNQ4ISI2 > highResolutionOutputSizeshNQ4ISI) {
                highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI2;
            }
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    private int getHighSpeedVideoFpsRanges(int i) {
        int highResolutionOutputSizeshNQ4ISI = this.getOutputFormats[0].getHighResolutionOutputSizeshNQ4ISI(i);
        for (int i2 = 1; i2 < this.CoroutineDebuggingKt; i2++) {
            int highResolutionOutputSizeshNQ4ISI2 = this.getOutputFormats[i2].getHighResolutionOutputSizeshNQ4ISI(i);
            if (highResolutionOutputSizeshNQ4ISI2 < highResolutionOutputSizeshNQ4ISI) {
                highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI2;
            }
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i) {
        while (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            if (this.getHighSpeedVideoFpsRanges.getDecoratedEnd(childAt) > i || this.getHighSpeedVideoFpsRanges.getTransformedEndWithDecoration(childAt) > i) {
                return;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.Camera2StreamConfigurationMap) {
                for (int i2 = 0; i2 < this.CoroutineDebuggingKt; i2++) {
                    if (this.getOutputFormats[i2].getHighSpeedVideoFpsRanges.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.CoroutineDebuggingKt; i3++) {
                    this.getOutputFormats[i3].getHighSpeedVideoSizesFor();
                }
            } else if (layoutParams.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.size() == 1) {
                return;
            } else {
                layoutParams.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor();
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (this.getHighSpeedVideoFpsRanges.getDecoratedStart(childAt) < i || this.getHighSpeedVideoFpsRanges.getTransformedStartWithDecoration(childAt) < i) {
                return;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.Camera2StreamConfigurationMap) {
                for (int i2 = 0; i2 < this.CoroutineDebuggingKt; i2++) {
                    if (this.getOutputFormats[i2].getHighSpeedVideoFpsRanges.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.CoroutineDebuggingKt; i3++) {
                    this.getOutputFormats[i3].getHighSpeedVideoFpsRanges();
                }
            } else if (layoutParams.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.size() == 1) {
                return;
            } else {
                layoutParams.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private boolean getInputSizeshNQ4ISI(int i) {
        if (this.toString == 0) {
            return (i == -1) != this.getInputSizeshNQ4ISI;
        }
        return ((i == -1) == this.getInputSizeshNQ4ISI) == (getLayoutDirection() == 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.toString == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.toString == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        return getHighSpeedVideoSizes(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        return getHighSpeedVideoSizes(i, recycler, state);
    }

    private int getHighSpeedVideoSizes(int i) {
        if (getChildCount() == 0) {
            return this.getInputSizeshNQ4ISI ? 1 : -1;
        }
        return (i < (getChildCount() == 0 ? 0 : getPosition(getChildAt(0)))) != this.getInputSizeshNQ4ISI ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public android.graphics.PointF computeScrollVectorForPosition(int i) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(i);
        android.graphics.PointF pointF = new android.graphics.PointF();
        if (highSpeedVideoSizes == 0) {
            return null;
        }
        if (this.toString == 0) {
            pointF.x = highSpeedVideoSizes;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = highSpeedVideoSizes;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        androidx.recyclerview.widget.LinearSmoothScroller linearSmoothScroller = new androidx.recyclerview.widget.LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = this.isOutputSupportedFor;
        if (savedState != null && savedState.Camera2StreamConfigurationMap != i) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState2 = this.isOutputSupportedFor;
            savedState2.getHighSpeedVideoSizesFor = null;
            savedState2.getInputSizeshNQ4ISI = 0;
            savedState2.Camera2StreamConfigurationMap = -1;
            savedState2.getOutputFormats = -1;
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState = this.isOutputSupportedFor;
        if (savedState != null) {
            savedState.getHighSpeedVideoSizesFor = null;
            savedState.getInputSizeshNQ4ISI = 0;
            savedState.Camera2StreamConfigurationMap = -1;
            savedState.getOutputFormats = -1;
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int highResolutionOutputSizeshNQ4ISI;
        int i3;
        if (this.toString != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        Camera2StreamConfigurationMap(i, state);
        int[] iArr = this.unwrapAs;
        if (iArr == null || iArr.length < this.CoroutineDebuggingKt) {
            this.unwrapAs = new int[this.CoroutineDebuggingKt];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.CoroutineDebuggingKt; i5++) {
            if (this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRanges == -1) {
                highResolutionOutputSizeshNQ4ISI = this.isOutputSupportedForhNQ4ISI.getInputSizeshNQ4ISI;
                i3 = this.getOutputFormats[i5].getHighSpeedVideoFpsRangesFor(this.isOutputSupportedForhNQ4ISI.getInputSizeshNQ4ISI);
            } else {
                highResolutionOutputSizeshNQ4ISI = this.getOutputFormats[i5].getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedForhNQ4ISI.Camera2StreamConfigurationMap);
                i3 = this.isOutputSupportedForhNQ4ISI.Camera2StreamConfigurationMap;
            }
            int i6 = highResolutionOutputSizeshNQ4ISI - i3;
            if (i6 >= 0) {
                this.unwrapAs[i4] = i6;
                i4++;
            }
        }
        java.util.Arrays.sort(this.unwrapAs, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor;
            if (i8 < 0 || i8 >= state.getItemCount()) {
                return;
            }
            layoutPrefetchRegistry.addPosition(this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor, this.unwrapAs[i7]);
            this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor += this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRanges;
        }
    }

    private int getHighSpeedVideoSizes(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        Camera2StreamConfigurationMap(i, state);
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
        if (this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes >= highResolutionOutputSizeshNQ4ISI) {
            i = i < 0 ? -highResolutionOutputSizeshNQ4ISI : highResolutionOutputSizeshNQ4ISI;
        }
        this.getHighSpeedVideoFpsRanges.offsetChildren(-i);
        this.getOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes = 0;
        getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.toString == 0) {
            return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(-2, -1);
        }
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams;
    }

    public int getOrientation() {
        return this.toString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0038, code lost:
    
        if (r10.toString != 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x003d, code lost:
    
        if (r10.toString != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x004b, code lost:
    
        if (getLayoutDirection() != 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0056, code lost:
    
        if (getLayoutDirection() == 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145 A[LOOP:2: B:83:0x0145->B:93:0x0165, LOOP_START, PHI: r5
      0x0145: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:64:0x011b, B:93:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00df  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.View onFocusSearchFailed(android.view.View view, int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        android.view.View findContainingItemView;
        int i2;
        int position;
        int highSpeedVideoFpsRangesFor;
        int highSpeedVideoFpsRangesFor2;
        int highSpeedVideoFpsRangesFor3;
        android.view.View Camera2StreamConfigurationMap;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        getHighSpeedVideoFpsRangesFor();
        if (i == 1) {
            if (this.toString != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.toString != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) findContainingItemView.getLayoutParams();
        boolean z = layoutParams.Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = layoutParams.getHighSpeedVideoSizes;
        if (i2 == 1) {
            int childCount = getChildCount();
            if (childCount != 0) {
                position = getPosition(getChildAt(childCount - 1));
                getHighSpeedVideoFpsRanges(position, state);
                getInputFormats(i2);
                androidx.recyclerview.widget.LayoutState layoutState = this.isOutputSupportedForhNQ4ISI;
                layoutState.getHighSpeedVideoFpsRangesFor = layoutState.getHighSpeedVideoFpsRanges + position;
                this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes = (int) (this.getHighSpeedVideoFpsRanges.getTotalSpace() * 0.33333334f);
                this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizesFor = true;
                this.isOutputSupportedForhNQ4ISI.getInputFormats = false;
                getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
                this.getOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
                if (z && (Camera2StreamConfigurationMap = span.Camera2StreamConfigurationMap(position, i2)) != null && Camera2StreamConfigurationMap != findContainingItemView) {
                    return Camera2StreamConfigurationMap;
                }
                if (!getInputSizeshNQ4ISI(i2)) {
                    for (int i3 = this.CoroutineDebuggingKt - 1; i3 >= 0; i3--) {
                        android.view.View Camera2StreamConfigurationMap2 = this.getOutputFormats[i3].Camera2StreamConfigurationMap(position, i2);
                        if (Camera2StreamConfigurationMap2 != null && Camera2StreamConfigurationMap2 != findContainingItemView) {
                            return Camera2StreamConfigurationMap2;
                        }
                    }
                } else {
                    for (int i4 = 0; i4 < this.CoroutineDebuggingKt; i4++) {
                        android.view.View Camera2StreamConfigurationMap3 = this.getOutputFormats[i4].Camera2StreamConfigurationMap(position, i2);
                        if (Camera2StreamConfigurationMap3 != null && Camera2StreamConfigurationMap3 != findContainingItemView) {
                            return Camera2StreamConfigurationMap3;
                        }
                    }
                }
                boolean z2 = (this.Camera2StreamConfigurationMap ^ true) != (i2 != -1);
                if (!z) {
                    if (z2) {
                        highSpeedVideoFpsRangesFor3 = span.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        highSpeedVideoFpsRangesFor3 = span.getHighSpeedVideoFpsRangesFor();
                    }
                    android.view.View findViewByPosition = findViewByPosition(highSpeedVideoFpsRangesFor3);
                    if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                        return findViewByPosition;
                    }
                }
                if (!getInputSizeshNQ4ISI(i2)) {
                    for (int i5 = this.CoroutineDebuggingKt - 1; i5 >= 0; i5--) {
                        if (i5 != span.getHighResolutionOutputSizeshNQ4ISI) {
                            if (z2) {
                                highSpeedVideoFpsRangesFor2 = this.getOutputFormats[i5].getHighResolutionOutputSizeshNQ4ISI();
                            } else {
                                highSpeedVideoFpsRangesFor2 = this.getOutputFormats[i5].getHighSpeedVideoFpsRangesFor();
                            }
                            android.view.View findViewByPosition2 = findViewByPosition(highSpeedVideoFpsRangesFor2);
                            if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                                return findViewByPosition2;
                            }
                        }
                    }
                } else {
                    for (int i6 = 0; i6 < this.CoroutineDebuggingKt; i6++) {
                        if (z2) {
                            highSpeedVideoFpsRangesFor = this.getOutputFormats[i6].getHighResolutionOutputSizeshNQ4ISI();
                        } else {
                            highSpeedVideoFpsRangesFor = this.getOutputFormats[i6].getHighSpeedVideoFpsRangesFor();
                        }
                        android.view.View findViewByPosition3 = findViewByPosition(highSpeedVideoFpsRangesFor);
                        if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                            return findViewByPosition3;
                        }
                    }
                }
                return null;
            }
            position = 0;
            getHighSpeedVideoFpsRanges(position, state);
            getInputFormats(i2);
            androidx.recyclerview.widget.LayoutState layoutState2 = this.isOutputSupportedForhNQ4ISI;
            layoutState2.getHighSpeedVideoFpsRangesFor = layoutState2.getHighSpeedVideoFpsRanges + position;
            this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes = (int) (this.getHighSpeedVideoFpsRanges.getTotalSpace() * 0.33333334f);
            this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizesFor = true;
            this.isOutputSupportedForhNQ4ISI.getInputFormats = false;
            getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
            this.getOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
            if (z) {
            }
            if (!getInputSizeshNQ4ISI(i2)) {
            }
            if ((this.Camera2StreamConfigurationMap ^ true) != (i2 != -1)) {
            }
            if (!z) {
            }
            if (!getInputSizeshNQ4ISI(i2)) {
            }
            return null;
        }
        if (getChildCount() != 0) {
            position = getPosition(getChildAt(0));
            getHighSpeedVideoFpsRanges(position, state);
            getInputFormats(i2);
            androidx.recyclerview.widget.LayoutState layoutState22 = this.isOutputSupportedForhNQ4ISI;
            layoutState22.getHighSpeedVideoFpsRangesFor = layoutState22.getHighSpeedVideoFpsRanges + position;
            this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes = (int) (this.getHighSpeedVideoFpsRanges.getTotalSpace() * 0.33333334f);
            this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizesFor = true;
            this.isOutputSupportedForhNQ4ISI.getInputFormats = false;
            getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
            this.getOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
            if (z) {
            }
            if (!getInputSizeshNQ4ISI(i2)) {
            }
            if ((this.Camera2StreamConfigurationMap ^ true) != (i2 != -1)) {
            }
            if (!z) {
            }
            if (!getInputSizeshNQ4ISI(i2)) {
            }
            return null;
        }
        position = 0;
        getHighSpeedVideoFpsRanges(position, state);
        getInputFormats(i2);
        androidx.recyclerview.widget.LayoutState layoutState222 = this.isOutputSupportedForhNQ4ISI;
        layoutState222.getHighSpeedVideoFpsRangesFor = layoutState222.getHighSpeedVideoFpsRanges + position;
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes = (int) (this.getHighSpeedVideoFpsRanges.getTotalSpace() * 0.33333334f);
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizesFor = true;
        this.isOutputSupportedForhNQ4ISI.getInputFormats = false;
        getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
        this.getOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
        if (z) {
        }
        if (!getInputSizeshNQ4ISI(i2)) {
        }
        if ((this.Camera2StreamConfigurationMap ^ true) != (i2 != -1)) {
        }
        if (!z) {
        }
        if (!getInputSizeshNQ4ISI(i2)) {
        }
        return null;
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.Span getHighSpeedVideoSizes;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void setFullSpan(boolean z) {
            this.Camera2StreamConfigurationMap = z;
        }

        public boolean isFullSpan() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int getSpanIndex() {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getHighSpeedVideoSizes;
            if (span == null) {
                return -1;
            }
            return span.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    class Span {
        final int getHighResolutionOutputSizeshNQ4ISI;
        java.util.ArrayList<android.view.View> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
        int getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        int Camera2StreamConfigurationMap = Integer.MIN_VALUE;
        int getHighSpeedVideoSizes = 0;

        Span(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        final int getHighSpeedVideoFpsRangesFor(int i) {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.getHighSpeedVideoFpsRanges.size() == 0) {
                return i;
            }
            Camera2StreamConfigurationMap();
            return this.getHighSpeedVideoFpsRangesFor;
        }

        final void Camera2StreamConfigurationMap() {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem highResolutionOutputSizeshNQ4ISI;
            android.view.View view = this.getHighSpeedVideoFpsRanges.get(0);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            this.getHighSpeedVideoFpsRangesFor = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedStart(view);
            if (layoutParams.Camera2StreamConfigurationMap && (highResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(layoutParams.getViewLayoutPosition())) != null && highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges == -1) {
                int i = this.getHighSpeedVideoFpsRangesFor;
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int[] iArr = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = i - (iArr != null ? iArr[i2] : 0);
            }
        }

        final int getHighResolutionOutputSizeshNQ4ISI(int i) {
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.getHighSpeedVideoFpsRanges.size() == 0) {
                return i;
            }
            getHighSpeedVideoSizes();
            return this.Camera2StreamConfigurationMap;
        }

        final void getHighSpeedVideoSizes() {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem highResolutionOutputSizeshNQ4ISI;
            java.util.ArrayList<android.view.View> arrayList = this.getHighSpeedVideoFpsRanges;
            android.view.View view = arrayList.get(arrayList.size() - 1);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            this.Camera2StreamConfigurationMap = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedEnd(view);
            if (layoutParams.Camera2StreamConfigurationMap && (highResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(layoutParams.getViewLayoutPosition())) != null && highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges == 1) {
                int i = this.Camera2StreamConfigurationMap;
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int[] iArr = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = i + (iArr == null ? 0 : iArr[i2]);
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            int size = this.getHighSpeedVideoFpsRanges.size();
            android.view.View remove = this.getHighSpeedVideoFpsRanges.remove(size - 1);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) remove.getLayoutParams();
            layoutParams.getHighSpeedVideoSizes = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.getHighSpeedVideoSizes -= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedMeasurement(remove);
            }
            if (size == 1) {
                this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
            }
            this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
        }

        final void getHighSpeedVideoSizesFor() {
            android.view.View remove = this.getHighSpeedVideoFpsRanges.remove(0);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) remove.getLayoutParams();
            layoutParams.getHighSpeedVideoSizes = null;
            if (this.getHighSpeedVideoFpsRanges.size() == 0) {
                this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.getHighSpeedVideoSizes -= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedMeasurement(remove);
            }
            this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        }

        static androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams getHighSpeedVideoFpsRanges(android.view.View view) {
            return (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        }

        final void Camera2StreamConfigurationMap(int i) {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 != Integer.MIN_VALUE) {
                this.getHighSpeedVideoFpsRangesFor = i2 + i;
            }
            int i3 = this.Camera2StreamConfigurationMap;
            if (i3 != Integer.MIN_VALUE) {
                this.Camera2StreamConfigurationMap = i3 + i;
            }
        }

        public final int getHighResolutionOutputSizeshNQ4ISI() {
            if (androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap) {
                return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.size() - 1, -1, false, false, true);
            }
            return getHighSpeedVideoFpsRangesFor(0, this.getHighSpeedVideoFpsRanges.size(), false, false, true);
        }

        public final int getHighSpeedVideoFpsRangesFor() {
            if (androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap) {
                return getHighSpeedVideoFpsRangesFor(0, this.getHighSpeedVideoFpsRanges.size(), false, false, true);
            }
            return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.size() - 1, -1, false, false, true);
        }

        final int getHighSpeedVideoFpsRangesFor(int i, int i2, boolean z, boolean z2, boolean z3) {
            int startAfterPadding = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
            int endAfterPadding = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                android.view.View view = this.getHighSpeedVideoFpsRanges.get(i);
                int decoratedStart = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedStart(view);
                int decoratedEnd = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedEnd(view);
                boolean z4 = false;
                boolean z5 = !z3 ? decoratedStart >= endAfterPadding : decoratedStart > endAfterPadding;
                if (!z3 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                            return androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                            return androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        public final android.view.View Camera2StreamConfigurationMap(int i, int i2) {
            android.view.View view = null;
            if (i2 == -1) {
                int size = this.getHighSpeedVideoFpsRanges.size();
                int i3 = 0;
                while (i3 < size) {
                    android.view.View view2 = this.getHighSpeedVideoFpsRanges.get(i3);
                    if ((androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap && androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getPosition(view2) <= i) || ((!androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap && androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getPosition(view2) >= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
                return view;
            }
            int size2 = this.getHighSpeedVideoFpsRanges.size() - 1;
            while (size2 >= 0) {
                android.view.View view3 = this.getHighSpeedVideoFpsRanges.get(size2);
                if ((androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap && androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getPosition(view3) >= i) || ((!androidx.recyclerview.widget.StaggeredGridLayoutManager.this.Camera2StreamConfigurationMap && androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getPosition(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
            return view;
        }

        final void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            layoutParams.getHighSpeedVideoSizes = this;
            this.getHighSpeedVideoFpsRanges.add(view);
            this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
            if (this.getHighSpeedVideoFpsRanges.size() == 1) {
                this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.getHighSpeedVideoSizes += androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedMeasurement(view);
            }
        }

        final void getHighSpeedVideoFpsRangesFor(android.view.View view) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            layoutParams.getHighSpeedVideoSizes = this;
            this.getHighSpeedVideoFpsRanges.add(0, view);
            this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
            if (this.getHighSpeedVideoFpsRanges.size() == 1) {
                this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.getHighSpeedVideoSizes += androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getDecoratedMeasurement(view);
            }
        }
    }

    static class LazySpanLookup {
        java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> getHighSpeedVideoFpsRanges;
        int[] getHighSpeedVideoSizes;

        LazySpanLookup() {
        }

        final int getHighSpeedVideoFpsRanges(int i) {
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> list = this.getHighSpeedVideoFpsRanges;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.getHighSpeedVideoFpsRanges.get(size).getHighResolutionOutputSizeshNQ4ISI >= i) {
                        this.getHighSpeedVideoFpsRanges.remove(size);
                    }
                }
            }
            return Camera2StreamConfigurationMap(i);
        }

        final int Camera2StreamConfigurationMap(int i) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int highSpeedVideoSizes = getHighSpeedVideoSizes(i);
            if (highSpeedVideoSizes == -1) {
                int[] iArr2 = this.getHighSpeedVideoSizes;
                java.util.Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.getHighSpeedVideoSizes.length;
            }
            int min = java.lang.Math.min(highSpeedVideoSizes + 1, this.getHighSpeedVideoSizes.length);
            java.util.Arrays.fill(this.getHighSpeedVideoSizes, i, min, -1);
            return min;
        }

        final void getHighSpeedVideoFpsRangesFor(int i) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (iArr == null) {
                int[] iArr2 = new int[java.lang.Math.max(i, 10) + 1];
                this.getHighSpeedVideoSizes = iArr2;
                java.util.Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.getHighSpeedVideoSizes = iArr3;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.getHighSpeedVideoSizes;
                java.util.Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        final void getHighSpeedVideoFpsRanges(int i, int i2) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            getHighSpeedVideoFpsRangesFor(i3);
            int[] iArr2 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.getHighSpeedVideoSizes;
            java.util.Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            getHighSpeedVideoFpsRangesFor(i, i2);
        }

        private void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> list = this.getHighSpeedVideoFpsRanges;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = this.getHighSpeedVideoFpsRanges.get(size);
                    if (fullSpanItem.getHighResolutionOutputSizeshNQ4ISI >= i) {
                        if (fullSpanItem.getHighResolutionOutputSizeshNQ4ISI < i + i2) {
                            this.getHighSpeedVideoFpsRanges.remove(size);
                        } else {
                            fullSpanItem.getHighResolutionOutputSizeshNQ4ISI -= i2;
                        }
                    }
                }
            }
        }

        final void Camera2StreamConfigurationMap(int i, int i2) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            getHighSpeedVideoFpsRangesFor(i3);
            int[] iArr2 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            java.util.Arrays.fill(this.getHighSpeedVideoSizes, i, i3, -1);
            getHighResolutionOutputSizeshNQ4ISI(i, i2);
        }

        private void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> list = this.getHighSpeedVideoFpsRanges;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = this.getHighSpeedVideoFpsRanges.get(size);
                    if (fullSpanItem.getHighResolutionOutputSizeshNQ4ISI >= i) {
                        fullSpanItem.getHighResolutionOutputSizeshNQ4ISI += i2;
                    }
                }
            }
        }

        private int getHighSpeedVideoSizes(int i) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                return -1;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                this.getHighSpeedVideoFpsRanges.remove(highResolutionOutputSizeshNQ4ISI);
            }
            int size = this.getHighSpeedVideoFpsRanges.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.getHighSpeedVideoFpsRanges.get(i2).getHighResolutionOutputSizeshNQ4ISI >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = this.getHighSpeedVideoFpsRanges.get(i2);
            this.getHighSpeedVideoFpsRanges.remove(i2);
            return fullSpanItem.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final void getHighSpeedVideoSizes(androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            }
            int size = this.getHighSpeedVideoFpsRanges.size();
            for (int i = 0; i < size; i++) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem2 = this.getHighSpeedVideoFpsRanges.get(i);
                if (fullSpanItem2.getHighResolutionOutputSizeshNQ4ISI == fullSpanItem.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRanges.remove(i);
                }
                if (fullSpanItem2.getHighResolutionOutputSizeshNQ4ISI >= fullSpanItem.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRanges.add(i, fullSpanItem);
                    return;
                }
            }
            this.getHighSpeedVideoFpsRanges.add(fullSpanItem);
        }

        public final androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getHighResolutionOutputSizeshNQ4ISI(int i) {
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> list = this.getHighSpeedVideoFpsRanges;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = this.getHighSpeedVideoFpsRanges.get(size);
                if (fullSpanItem.getHighResolutionOutputSizeshNQ4ISI == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> list = this.getHighSpeedVideoFpsRanges;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = this.getHighSpeedVideoFpsRanges.get(i4);
                if (fullSpanItem.getHighResolutionOutputSizeshNQ4ISI >= i2) {
                    return null;
                }
                if (fullSpanItem.getHighResolutionOutputSizeshNQ4ISI >= i && (i3 == 0 || fullSpanItem.getHighSpeedVideoFpsRanges == i3 || fullSpanItem.getHighSpeedVideoSizes)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        static class FullSpanItem implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> CREATOR = new android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(android.os.Parcel parcel) {
                    return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int i) {
                    return new androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
                }
            };
            int[] Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRanges;
            boolean getHighSpeedVideoSizes;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            FullSpanItem(android.os.Parcel parcel) {
                this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
                this.getHighSpeedVideoFpsRanges = parcel.readInt();
                this.getHighSpeedVideoSizes = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.Camera2StreamConfigurationMap = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            FullSpanItem() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
                parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
                parcel.writeInt(this.getHighSpeedVideoFpsRanges);
                parcel.writeInt(this.getHighSpeedVideoSizes ? 1 : 0);
                int[] iArr = this.Camera2StreamConfigurationMap;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.Camera2StreamConfigurationMap);
                } else {
                    parcel.writeInt(0);
                }
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(", mGapDir=");
                sb.append(this.getHighSpeedVideoFpsRanges);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.getHighSpeedVideoSizes);
                sb.append(", mGapPerSpan=");
                sb.append(java.util.Arrays.toString(this.Camera2StreamConfigurationMap));
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
                return sb.toString();
            }
        }
    }

    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState[] newArray(int i) {
                return new androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState[i];
            }
        };
        int Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        int[] getHighSpeedVideoSizesFor;
        int[] getInputFormats;
        int getInputSizeshNQ4ISI;
        int getOutputFormats;
        int getOutputMinFrameDuration;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(android.os.Parcel parcel) {
            this.Camera2StreamConfigurationMap = parcel.readInt();
            this.getOutputFormats = parcel.readInt();
            int readInt = parcel.readInt();
            this.getInputSizeshNQ4ISI = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.getHighSpeedVideoSizesFor = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.getOutputMinFrameDuration = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.getInputFormats = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.getHighSpeedVideoFpsRanges = parcel.readInt() == 1;
            this.getHighSpeedVideoSizes = parcel.readInt() == 1;
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt() == 1;
            this.getHighSpeedVideoFpsRangesFor = parcel.readArrayList(androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState) {
            this.getInputSizeshNQ4ISI = savedState.getInputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = savedState.Camera2StreamConfigurationMap;
            this.getOutputFormats = savedState.getOutputFormats;
            this.getHighSpeedVideoSizesFor = savedState.getHighSpeedVideoSizesFor;
            this.getOutputMinFrameDuration = savedState.getOutputMinFrameDuration;
            this.getInputFormats = savedState.getInputFormats;
            this.getHighSpeedVideoFpsRanges = savedState.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = savedState.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = savedState.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = savedState.getHighSpeedVideoFpsRangesFor;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.Camera2StreamConfigurationMap);
            parcel.writeInt(this.getOutputFormats);
            parcel.writeInt(this.getInputSizeshNQ4ISI);
            if (this.getInputSizeshNQ4ISI > 0) {
                parcel.writeIntArray(this.getHighSpeedVideoSizesFor);
            }
            parcel.writeInt(this.getOutputMinFrameDuration);
            if (this.getOutputMinFrameDuration > 0) {
                parcel.writeIntArray(this.getInputFormats);
            }
            parcel.writeInt(this.getHighSpeedVideoFpsRanges ? 1 : 0);
            parcel.writeInt(this.getHighSpeedVideoSizes ? 1 : 0);
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI ? 1 : 0);
            parcel.writeList(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    class AnchorInfo {
        boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int[] getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        boolean getInputFormats;

        AnchorInfo() {
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
            this.getHighSpeedVideoSizes = false;
            this.Camera2StreamConfigurationMap = false;
            this.getInputFormats = false;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span, int i, int i2) {
        int i3 = span.getHighSpeedVideoSizes;
        if (i == -1) {
            int i4 = span.getHighSpeedVideoFpsRangesFor;
            if (i4 == Integer.MIN_VALUE) {
                span.Camera2StreamConfigurationMap();
                i4 = span.getHighSpeedVideoFpsRangesFor;
            }
            if (i4 + i3 <= i2) {
                this.getValidOutputFormatsForInputhNQ4ISI.set(span.getHighResolutionOutputSizeshNQ4ISI, false);
                return;
            }
            return;
        }
        int i5 = span.Camera2StreamConfigurationMap;
        if (i5 == Integer.MIN_VALUE) {
            span.getHighSpeedVideoSizes();
            i5 = span.Camera2StreamConfigurationMap;
        }
        if (i5 - i3 >= i2) {
            this.getValidOutputFormatsForInputhNQ4ISI.set(span.getHighResolutionOutputSizeshNQ4ISI, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0255, code lost:
    
        if ((getLayoutDirection() == 1) != r12.getOutputMinFrameDurationlomOqCM) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04ae A[LOOP:0: B:2:0x0002->B:276:0x04ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        boolean z;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState;
        int highSpeedVideoFpsRangesFor;
        int i;
        int i2;
        int position;
        int startAfterPadding;
        int startAfterPadding2;
        boolean z2 = true;
        while (true) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo anchorInfo = this.getInputFormats;
            if ((this.isOutputSupportedFor != null || this.getHighSpeedVideoFpsRangesFor != -1) && state.getItemCount() == 0) {
                removeAndRecycleAllViews(recycler);
                anchorInfo.getHighSpeedVideoFpsRangesFor();
                return;
            }
            boolean z3 = (anchorInfo.getInputFormats && this.getHighSpeedVideoFpsRangesFor == -1 && this.isOutputSupportedFor == null) ? false : true;
            if (z3) {
                anchorInfo.getHighSpeedVideoFpsRangesFor();
                androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState2 = this.isOutputSupportedFor;
                if (savedState2 == null) {
                    getHighSpeedVideoFpsRangesFor();
                    anchorInfo.getHighSpeedVideoSizes = this.getInputSizeshNQ4ISI;
                } else {
                    if (savedState2.getInputSizeshNQ4ISI > 0) {
                        if (this.isOutputSupportedFor.getInputSizeshNQ4ISI == this.CoroutineDebuggingKt) {
                            for (int i3 = 0; i3 < this.CoroutineDebuggingKt; i3++) {
                                androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span = this.getOutputFormats[i3];
                                span.getHighSpeedVideoFpsRanges.clear();
                                span.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
                                span.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
                                span.getHighSpeedVideoSizes = 0;
                                int i4 = this.isOutputSupportedFor.getHighSpeedVideoSizesFor[i3];
                                if (i4 != Integer.MIN_VALUE) {
                                    if (this.isOutputSupportedFor.getHighSpeedVideoSizes) {
                                        startAfterPadding2 = this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
                                    } else {
                                        startAfterPadding2 = this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
                                    }
                                    i4 += startAfterPadding2;
                                }
                                androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span2 = this.getOutputFormats[i3];
                                span2.getHighSpeedVideoFpsRangesFor = i4;
                                span2.Camera2StreamConfigurationMap = i4;
                            }
                        } else {
                            androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState3 = this.isOutputSupportedFor;
                            savedState3.getHighSpeedVideoSizesFor = null;
                            savedState3.getInputSizeshNQ4ISI = 0;
                            savedState3.getOutputMinFrameDuration = 0;
                            savedState3.getInputFormats = null;
                            savedState3.getHighSpeedVideoFpsRangesFor = null;
                            androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState4 = this.isOutputSupportedFor;
                            savedState4.Camera2StreamConfigurationMap = savedState4.getOutputFormats;
                        }
                    }
                    this.getOutputMinFrameDurationlomOqCM = this.isOutputSupportedFor.getHighResolutionOutputSizeshNQ4ISI;
                    setReverseLayout(this.isOutputSupportedFor.getHighSpeedVideoFpsRanges);
                    getHighSpeedVideoFpsRangesFor();
                    if (this.isOutputSupportedFor.Camera2StreamConfigurationMap != -1) {
                        this.getHighSpeedVideoFpsRangesFor = this.isOutputSupportedFor.Camera2StreamConfigurationMap;
                        anchorInfo.getHighSpeedVideoSizes = this.isOutputSupportedFor.getHighSpeedVideoSizes;
                    } else {
                        anchorInfo.getHighSpeedVideoSizes = this.getInputSizeshNQ4ISI;
                    }
                    if (this.isOutputSupportedFor.getOutputMinFrameDuration > 1) {
                        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = this.isOutputSupportedFor.getInputFormats;
                        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = this.isOutputSupportedFor.getHighSpeedVideoFpsRangesFor;
                    }
                }
                if (!state.isPreLayout() && (i2 = this.getHighSpeedVideoFpsRangesFor) != -1) {
                    if (i2 < 0 || i2 >= state.getItemCount()) {
                        this.getHighSpeedVideoFpsRangesFor = -1;
                        this.getHighSpeedVideoSizes = Integer.MIN_VALUE;
                    } else {
                        androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState savedState5 = this.isOutputSupportedFor;
                        if (savedState5 == null || savedState5.Camera2StreamConfigurationMap == -1 || this.isOutputSupportedFor.getInputSizeshNQ4ISI <= 0) {
                            android.view.View findViewByPosition = findViewByPosition(this.getHighSpeedVideoFpsRangesFor);
                            if (findViewByPosition != null) {
                                if (this.getInputSizeshNQ4ISI) {
                                    int childCount = getChildCount();
                                    if (childCount != 0) {
                                        position = getPosition(getChildAt(childCount - 1));
                                        anchorInfo.getHighSpeedVideoFpsRangesFor = position;
                                        if (this.getHighSpeedVideoSizes == Integer.MIN_VALUE) {
                                            if (anchorInfo.getHighSpeedVideoSizes) {
                                                anchorInfo.getHighResolutionOutputSizeshNQ4ISI = (this.getHighSpeedVideoFpsRanges.getEndAfterPadding() - this.getHighSpeedVideoSizes) - this.getHighSpeedVideoFpsRanges.getDecoratedEnd(findViewByPosition);
                                            } else {
                                                anchorInfo.getHighResolutionOutputSizeshNQ4ISI = (this.getHighSpeedVideoFpsRanges.getStartAfterPadding() + this.getHighSpeedVideoSizes) - this.getHighSpeedVideoFpsRanges.getDecoratedStart(findViewByPosition);
                                            }
                                        } else if (this.getHighSpeedVideoFpsRanges.getDecoratedMeasurement(findViewByPosition) > this.getHighSpeedVideoFpsRanges.getTotalSpace()) {
                                            if (anchorInfo.getHighSpeedVideoSizes) {
                                                startAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding();
                                            } else {
                                                startAfterPadding = this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
                                            }
                                            anchorInfo.getHighResolutionOutputSizeshNQ4ISI = startAfterPadding;
                                        } else {
                                            int decoratedStart = this.getHighSpeedVideoFpsRanges.getDecoratedStart(findViewByPosition) - this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
                                            if (decoratedStart < 0) {
                                                anchorInfo.getHighResolutionOutputSizeshNQ4ISI = -decoratedStart;
                                            } else {
                                                int endAfterPadding = this.getHighSpeedVideoFpsRanges.getEndAfterPadding() - this.getHighSpeedVideoFpsRanges.getDecoratedEnd(findViewByPosition);
                                                if (endAfterPadding < 0) {
                                                    anchorInfo.getHighResolutionOutputSizeshNQ4ISI = endAfterPadding;
                                                } else {
                                                    anchorInfo.getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
                                                }
                                            }
                                        }
                                    }
                                    position = 0;
                                    anchorInfo.getHighSpeedVideoFpsRangesFor = position;
                                    if (this.getHighSpeedVideoSizes == Integer.MIN_VALUE) {
                                    }
                                } else {
                                    if (getChildCount() != 0) {
                                        position = getPosition(getChildAt(0));
                                        anchorInfo.getHighSpeedVideoFpsRangesFor = position;
                                        if (this.getHighSpeedVideoSizes == Integer.MIN_VALUE) {
                                        }
                                    }
                                    position = 0;
                                    anchorInfo.getHighSpeedVideoFpsRangesFor = position;
                                    if (this.getHighSpeedVideoSizes == Integer.MIN_VALUE) {
                                    }
                                }
                            } else {
                                anchorInfo.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
                                int i5 = this.getHighSpeedVideoSizes;
                                if (i5 == Integer.MIN_VALUE) {
                                    anchorInfo.getHighSpeedVideoSizes = getHighSpeedVideoSizes(anchorInfo.getHighSpeedVideoFpsRangesFor) == 1;
                                    anchorInfo.getHighResolutionOutputSizeshNQ4ISI = anchorInfo.getHighSpeedVideoSizes ? androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getEndAfterPadding() : androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getStartAfterPadding();
                                } else if (anchorInfo.getHighSpeedVideoSizes) {
                                    anchorInfo.getHighResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getEndAfterPadding() - i5;
                                } else {
                                    anchorInfo.getHighResolutionOutputSizeshNQ4ISI = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getStartAfterPadding() + i5;
                                }
                                anchorInfo.Camera2StreamConfigurationMap = true;
                            }
                        } else {
                            anchorInfo.getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
                            anchorInfo.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
                        }
                        anchorInfo.getInputFormats = true;
                    }
                }
                if (this.getOutputSizeshNQ4ISI) {
                    int itemCount = state.getItemCount();
                    for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                        i = getPosition(getChildAt(childCount2));
                        if (i >= 0 && i < itemCount) {
                            break;
                        }
                    }
                    i = 0;
                    anchorInfo.getHighSpeedVideoFpsRangesFor = i;
                    anchorInfo.getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
                    anchorInfo.getInputFormats = true;
                } else {
                    int itemCount2 = state.getItemCount();
                    int childCount3 = getChildCount();
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        int position2 = getPosition(getChildAt(i6));
                        if (position2 >= 0 && position2 < itemCount2) {
                            i = position2;
                            break;
                        }
                    }
                    i = 0;
                    anchorInfo.getHighSpeedVideoFpsRangesFor = i;
                    anchorInfo.getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
                    anchorInfo.getInputFormats = true;
                }
            }
            if (this.isOutputSupportedFor == null && this.getHighSpeedVideoFpsRangesFor == -1) {
                if (anchorInfo.getHighSpeedVideoSizes == this.getOutputSizeshNQ4ISI) {
                }
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup lazySpanLookup = this.getHighResolutionOutputSizeshNQ4ISI;
                int[] iArr = lazySpanLookup.getHighSpeedVideoSizes;
                if (iArr != null) {
                    java.util.Arrays.fill(iArr, -1);
                }
                lazySpanLookup.getHighSpeedVideoFpsRanges = null;
                anchorInfo.Camera2StreamConfigurationMap = true;
            }
            if (getChildCount() > 0 && ((savedState = this.isOutputSupportedFor) == null || savedState.getInputSizeshNQ4ISI <= 0)) {
                if (anchorInfo.Camera2StreamConfigurationMap) {
                    for (int i7 = 0; i7 < this.CoroutineDebuggingKt; i7++) {
                        androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span3 = this.getOutputFormats[i7];
                        span3.getHighSpeedVideoFpsRanges.clear();
                        span3.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
                        span3.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
                        span3.getHighSpeedVideoSizes = 0;
                        if (anchorInfo.getHighResolutionOutputSizeshNQ4ISI != Integer.MIN_VALUE) {
                            androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span4 = this.getOutputFormats[i7];
                            int i8 = anchorInfo.getHighResolutionOutputSizeshNQ4ISI;
                            span4.getHighSpeedVideoFpsRangesFor = i8;
                            span4.Camera2StreamConfigurationMap = i8;
                        }
                    }
                } else if (z3 || this.getInputFormats.getHighSpeedVideoFpsRanges == null) {
                    for (int i9 = 0; i9 < this.CoroutineDebuggingKt; i9++) {
                        androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span5 = this.getOutputFormats[i9];
                        boolean z4 = this.getInputSizeshNQ4ISI;
                        int i10 = anchorInfo.getHighResolutionOutputSizeshNQ4ISI;
                        if (z4) {
                            highSpeedVideoFpsRangesFor = span5.getHighResolutionOutputSizeshNQ4ISI(Integer.MIN_VALUE);
                        } else {
                            highSpeedVideoFpsRangesFor = span5.getHighSpeedVideoFpsRangesFor(Integer.MIN_VALUE);
                        }
                        span5.getHighSpeedVideoFpsRanges.clear();
                        span5.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
                        span5.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
                        span5.getHighSpeedVideoSizes = 0;
                        if (highSpeedVideoFpsRangesFor != Integer.MIN_VALUE && ((!z4 || highSpeedVideoFpsRangesFor >= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getEndAfterPadding()) && (z4 || highSpeedVideoFpsRangesFor <= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getHighSpeedVideoFpsRanges.getStartAfterPadding()))) {
                            if (i10 != Integer.MIN_VALUE) {
                                highSpeedVideoFpsRangesFor += i10;
                            }
                            span5.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor;
                            span5.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
                        }
                    }
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo anchorInfo2 = this.getInputFormats;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[] spanArr = this.getOutputFormats;
                    int length = spanArr.length;
                    int[] iArr2 = anchorInfo2.getHighSpeedVideoFpsRanges;
                    if (iArr2 == null || iArr2.length < length) {
                        anchorInfo2.getHighSpeedVideoFpsRanges = new int[androidx.recyclerview.widget.StaggeredGridLayoutManager.this.getOutputFormats.length];
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        anchorInfo2.getHighSpeedVideoFpsRanges[i11] = spanArr[i11].getHighSpeedVideoFpsRangesFor(Integer.MIN_VALUE);
                    }
                } else {
                    for (int i12 = 0; i12 < this.CoroutineDebuggingKt; i12++) {
                        androidx.recyclerview.widget.StaggeredGridLayoutManager.Span span6 = this.getOutputFormats[i12];
                        span6.getHighSpeedVideoFpsRanges.clear();
                        span6.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
                        span6.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
                        span6.getHighSpeedVideoSizes = 0;
                        int i13 = this.getInputFormats.getHighSpeedVideoFpsRanges[i12];
                        span6.getHighSpeedVideoFpsRangesFor = i13;
                        span6.Camera2StreamConfigurationMap = i13;
                    }
                }
            }
            detachAndScrapAttachedViews(recycler);
            this.isOutputSupportedForhNQ4ISI.getInputFormats = false;
            this.getOutputSizes = false;
            int totalSpace = this.getOutputMinFrameDuration.getTotalSpace();
            this.accessartificialFrame = totalSpace / this.CoroutineDebuggingKt;
            this.getOutputStallDurationlomOqCM = android.view.View.MeasureSpec.makeMeasureSpec(totalSpace, this.getOutputMinFrameDuration.getMode());
            getHighSpeedVideoFpsRanges(anchorInfo.getHighSpeedVideoFpsRangesFor, state);
            if (anchorInfo.getHighSpeedVideoSizes) {
                getInputFormats(-1);
                getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
                getInputFormats(1);
                this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor = anchorInfo.getHighSpeedVideoFpsRangesFor + this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
            } else {
                getInputFormats(1);
                getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
                getInputFormats(-1);
                this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor = anchorInfo.getHighSpeedVideoFpsRangesFor + this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI(recycler, this.isOutputSupportedForhNQ4ISI, state);
            }
            if (this.getOutputMinFrameDuration.getMode() != 1073741824) {
                int childCount4 = getChildCount();
                float f = 0.0f;
                for (int i14 = 0; i14 < childCount4; i14++) {
                    android.view.View childAt = getChildAt(i14);
                    float decoratedMeasurement = this.getOutputMinFrameDuration.getDecoratedMeasurement(childAt);
                    if (decoratedMeasurement >= f) {
                        if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                            decoratedMeasurement = (decoratedMeasurement * 1.0f) / this.CoroutineDebuggingKt;
                        }
                        f = java.lang.Math.max(f, decoratedMeasurement);
                    }
                }
                int i15 = this.accessartificialFrame;
                int round = java.lang.Math.round(f * this.CoroutineDebuggingKt);
                if (this.getOutputMinFrameDuration.getMode() == Integer.MIN_VALUE) {
                    round = java.lang.Math.min(round, this.getOutputMinFrameDuration.getTotalSpace());
                }
                this.accessartificialFrame = round / this.CoroutineDebuggingKt;
                this.getOutputStallDurationlomOqCM = android.view.View.MeasureSpec.makeMeasureSpec(round, this.getOutputMinFrameDuration.getMode());
                if (this.accessartificialFrame != i15) {
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        android.view.View childAt2 = getChildAt(i16);
                        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) childAt2.getLayoutParams();
                        if (!layoutParams.Camera2StreamConfigurationMap) {
                            if (getLayoutDirection() == 1 && this.toString == 1) {
                                childAt2.offsetLeftAndRight(((-((this.CoroutineDebuggingKt - 1) - layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI)) * this.accessartificialFrame) - ((-((this.CoroutineDebuggingKt - 1) - layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI)) * i15));
                            } else {
                                int i17 = layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI * this.accessartificialFrame;
                                int i18 = layoutParams.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI * i15;
                                if (this.toString == 1) {
                                    childAt2.offsetLeftAndRight(i17 - i18);
                                } else {
                                    childAt2.offsetTopAndBottom(i17 - i18);
                                }
                            }
                        }
                    }
                }
            }
            if (getChildCount() > 0) {
                if (this.getInputSizeshNQ4ISI) {
                    getHighResolutionOutputSizeshNQ4ISI(recycler, state, true);
                    getHighSpeedVideoFpsRangesFor(recycler, state, false);
                } else {
                    getHighSpeedVideoFpsRangesFor(recycler, state, true);
                    getHighResolutionOutputSizeshNQ4ISI(recycler, state, false);
                }
            }
            if (z2 && !state.isPreLayout() && this.getOutputStallDuration != 0 && getChildCount() > 0 && (this.getOutputSizes || Camera2StreamConfigurationMap() != null)) {
                removeCallbacks(this.getHighSpeedVideoSizesFor);
                if (getHighResolutionOutputSizeshNQ4ISI()) {
                    z = true;
                    if (state.isPreLayout()) {
                        this.getInputFormats.getHighSpeedVideoFpsRangesFor();
                    }
                    this.getOutputSizeshNQ4ISI = anchorInfo.getHighSpeedVideoSizes;
                    this.getOutputMinFrameDurationlomOqCM = getLayoutDirection() != 1;
                    if (z) {
                        return;
                    }
                    this.getInputFormats.getHighSpeedVideoFpsRangesFor();
                    z2 = false;
                }
            }
            z = false;
            if (state.isPreLayout()) {
            }
            this.getOutputSizeshNQ4ISI = anchorInfo.getHighSpeedVideoSizes;
            this.getOutputMinFrameDurationlomOqCM = getLayoutDirection() != 1;
            if (z) {
            }
        }
    }

    private void Camera2StreamConfigurationMap(int i, androidx.recyclerview.widget.RecyclerView.State state) {
        int position;
        int i2;
        if (i > 0) {
            int childCount = getChildCount();
            position = childCount != 0 ? getPosition(getChildAt(childCount - 1)) : 0;
            i2 = 1;
        } else {
            position = getChildCount() != 0 ? getPosition(getChildAt(0)) : 0;
            i2 = -1;
        }
        this.isOutputSupportedForhNQ4ISI.getInputFormats = true;
        getHighSpeedVideoFpsRanges(position, state);
        getInputFormats(i2);
        androidx.recyclerview.widget.LayoutState layoutState = this.isOutputSupportedForhNQ4ISI;
        layoutState.getHighSpeedVideoFpsRangesFor = position + layoutState.getHighSpeedVideoFpsRanges;
        this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes = java.lang.Math.abs(i);
    }
}
