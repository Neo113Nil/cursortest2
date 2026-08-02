package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public static final int DEFAULT_SPAN_COUNT = -1;
    int[] Camera2StreamConfigurationMap;
    final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
    final android.util.SparseIntArray getHighSpeedVideoFpsRanges;
    final android.util.SparseIntArray getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    android.view.View[] getHighSpeedVideoSizesFor;
    androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    int getOutputMinFrameDuration;

    public GridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getHighSpeedVideoSizes = false;
        this.getOutputMinFrameDuration = -1;
        this.getHighSpeedVideoFpsRanges = new android.util.SparseIntArray();
        this.getHighSpeedVideoFpsRangesFor = new android.util.SparseIntArray();
        this.getInputSizeshNQ4ISI = new androidx.recyclerview.widget.GridLayoutManager.DefaultSpanSizeLookup();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect();
        setSpanCount(getProperties(context, attributeSet, i, i2).spanCount);
    }

    public GridLayoutManager(android.content.Context context, int i) {
        super(context);
        this.getHighSpeedVideoSizes = false;
        this.getOutputMinFrameDuration = -1;
        this.getHighSpeedVideoFpsRanges = new android.util.SparseIntArray();
        this.getHighSpeedVideoFpsRangesFor = new android.util.SparseIntArray();
        this.getInputSizeshNQ4ISI = new androidx.recyclerview.widget.GridLayoutManager.DefaultSpanSizeLookup();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect();
        setSpanCount(i);
    }

    public GridLayoutManager(android.content.Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.getHighSpeedVideoSizes = false;
        this.getOutputMinFrameDuration = -1;
        this.getHighSpeedVideoFpsRanges = new android.util.SparseIntArray();
        this.getHighSpeedVideoFpsRangesFor = new android.util.SparseIntArray();
        this.getInputSizeshNQ4ISI = new androidx.recyclerview.widget.GridLayoutManager.DefaultSpanSizeLookup();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect();
        setSpanCount(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new java.lang.UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.getOutputMinFrameDuration;
        }
        if (state.getItemCount() <= 0) {
            return 0;
        }
        return getHighSpeedVideoFpsRanges(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.getOutputMinFrameDuration;
        }
        if (state.getItemCount() <= 0) {
            return 0;
        }
        return getHighSpeedVideoFpsRanges(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), highSpeedVideoFpsRanges, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(highSpeedVideoFpsRanges, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(android.widget.GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        if (state.isPreLayout()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) getChildAt(i).getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                this.getHighSpeedVideoFpsRanges.put(viewLayoutPosition, layoutParams.getSpanSize());
                this.getHighSpeedVideoFpsRangesFor.put(viewLayoutPosition, layoutParams.getSpanIndex());
            }
        }
        super.onLayoutChildren(recycler, state);
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.getHighSpeedVideoSizes = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        this.getInputSizeshNQ4ISI.invalidateSpanIndexCache();
        this.getInputSizeshNQ4ISI.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.getInputSizeshNQ4ISI.invalidateSpanIndexCache();
        this.getInputSizeshNQ4ISI.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        this.getInputSizeshNQ4ISI.invalidateSpanIndexCache();
        this.getInputSizeshNQ4ISI.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, java.lang.Object obj) {
        this.getInputSizeshNQ4ISI.invalidateSpanIndexCache();
        this.getInputSizeshNQ4ISI.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, int i3) {
        this.getInputSizeshNQ4ISI.invalidateSpanIndexCache();
        this.getInputSizeshNQ4ISI.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(-2, -1);
        }
        return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.recyclerview.widget.GridLayoutManager.LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams;
    }

    public void setSpanSizeLookup(androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.getInputSizeshNQ4ISI = spanSizeLookup;
    }

    public androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
        return this.getInputSizeshNQ4ISI;
    }

    private void Camera2StreamConfigurationMap() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        getHighResolutionOutputSizeshNQ4ISI(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.Camera2StreamConfigurationMap == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.Camera2StreamConfigurationMap;
            chooseSize = chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.Camera2StreamConfigurationMap;
            chooseSize2 = chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i) {
        int i2;
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i3 = this.getOutputMinFrameDuration;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.Camera2StreamConfigurationMap = iArr;
    }

    private int getHighSpeedVideoSizes(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            int i3 = this.getOutputMinFrameDuration - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        int[] iArr2 = this.Camera2StreamConfigurationMap;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        int i2;
        int highSpeedVideoSizes;
        super.onAnchorReady(recycler, state, anchorInfo, i);
        Camera2StreamConfigurationMap();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            boolean z = i == 1;
            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(recycler, state, anchorInfo.getHighSpeedVideoFpsRangesFor);
            if (z) {
                while (highSpeedVideoSizes2 > 0 && anchorInfo.getHighSpeedVideoFpsRangesFor > 0) {
                    anchorInfo.getHighSpeedVideoFpsRangesFor--;
                    highSpeedVideoSizes2 = getHighSpeedVideoSizes(recycler, state, anchorInfo.getHighSpeedVideoFpsRangesFor);
                }
            } else {
                int itemCount = state.getItemCount();
                int i3 = anchorInfo.getHighSpeedVideoFpsRangesFor;
                while (i3 < itemCount - 1 && (highSpeedVideoSizes = getHighSpeedVideoSizes(recycler, state, (i2 = i3 + 1))) > highSpeedVideoSizes2) {
                    i3 = i2;
                    highSpeedVideoSizes2 = highSpeedVideoSizes;
                }
                anchorInfo.getHighSpeedVideoFpsRangesFor = i3;
            }
        }
        android.view.View[] viewArr = this.getHighSpeedVideoSizesFor;
        if (viewArr == null || viewArr.length != this.getOutputMinFrameDuration) {
            this.getHighSpeedVideoSizesFor = new android.view.View[this.getOutputMinFrameDuration];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        Camera2StreamConfigurationMap();
        android.view.View[] viewArr = this.getHighSpeedVideoSizesFor;
        if (viewArr == null || viewArr.length != this.getOutputMinFrameDuration) {
            this.getHighSpeedVideoSizesFor = new android.view.View[this.getOutputMinFrameDuration];
        }
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        Camera2StreamConfigurationMap();
        android.view.View[] viewArr = this.getHighSpeedVideoSizesFor;
        if (viewArr == null || viewArr.length != this.getOutputMinFrameDuration) {
            this.getHighSpeedVideoSizesFor = new android.view.View[this.getOutputMinFrameDuration];
        }
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount = getChildCount();
        int i3 = 1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
        }
        int itemCount = state.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        android.view.View view = null;
        android.view.View view2 = null;
        while (i2 != i) {
            android.view.View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && getHighSpeedVideoSizes(recycler, state, position) == 0) {
                if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    private int getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(i, this.getOutputMinFrameDuration);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(convertPreLayoutPositionToPostLayout, this.getOutputMinFrameDuration);
    }

    private int getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.getInputSizeshNQ4ISI.getCachedSpanIndex(i, this.getOutputMinFrameDuration);
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.getInputSizeshNQ4ISI.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, this.getOutputMinFrameDuration);
    }

    private int getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.getInputSizeshNQ4ISI.getSpanSize(i);
        }
        int i2 = this.getHighSpeedVideoFpsRanges.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 1;
        }
        return this.getInputSizeshNQ4ISI.getSpanSize(convertPreLayoutPositionToPostLayout);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.LinearLayoutManager.LayoutState layoutState, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = this.getOutputMinFrameDuration;
        for (int i2 = 0; i2 < this.getOutputMinFrameDuration && layoutState.getHighResolutionOutputSizeshNQ4ISI(state) && i > 0; i2++) {
            int i3 = layoutState.getHighSpeedVideoSizes;
            layoutPrefetchRegistry.addPosition(i3, java.lang.Math.max(0, layoutState.getOutputSizes));
            i -= this.getInputSizeshNQ4ISI.getSpanSize(i3);
            layoutState.getHighSpeedVideoSizes += layoutState.getOutputMinFrameDuration;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r22.mFinished = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.LinearLayoutManager.LayoutState layoutState, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int childMeasureSpec;
        int i12;
        android.view.View highSpeedVideoSizes;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        boolean z = modeInOther != 1073741824;
        int i13 = getChildCount() > 0 ? this.Camera2StreamConfigurationMap[this.getOutputMinFrameDuration] : 0;
        if (z) {
            Camera2StreamConfigurationMap();
        }
        boolean z2 = layoutState.getOutputMinFrameDuration == 1;
        int i14 = this.getOutputMinFrameDuration;
        if (!z2) {
            i14 = getHighSpeedVideoSizes(recycler, state, layoutState.getHighSpeedVideoSizes) + getHighResolutionOutputSizeshNQ4ISI(recycler, state, layoutState.getHighSpeedVideoSizes);
        }
        int i15 = 0;
        while (i15 < this.getOutputMinFrameDuration && layoutState.getHighResolutionOutputSizeshNQ4ISI(state) && i14 > 0) {
            int i16 = layoutState.getHighSpeedVideoSizes;
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(recycler, state, i16);
            if (highResolutionOutputSizeshNQ4ISI > this.getOutputMinFrameDuration) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Item at position ");
                sb.append(i16);
                sb.append(" requires ");
                sb.append(highResolutionOutputSizeshNQ4ISI);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.getOutputMinFrameDuration);
                sb.append(" spans.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            i14 -= highResolutionOutputSizeshNQ4ISI;
            if (i14 < 0 || (highSpeedVideoSizes = layoutState.getHighSpeedVideoSizes(recycler)) == null) {
                break;
            }
            this.getHighSpeedVideoSizesFor[i15] = highSpeedVideoSizes;
            i15++;
        }
        if (z2) {
            i = 0;
            i2 = 0;
            i4 = 1;
            i3 = i15;
        } else {
            i = i15 - 1;
            i2 = 0;
            i3 = -1;
            i4 = -1;
        }
        while (i != i3) {
            android.view.View view = this.getHighSpeedVideoSizesFor[i];
            androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view.getLayoutParams();
            layoutParams.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(recycler, state, getPosition(view));
            layoutParams.getHighSpeedVideoSizes = i2;
            i2 += layoutParams.Camera2StreamConfigurationMap;
            i += i4;
        }
        float f = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            android.view.View view2 = this.getHighSpeedVideoSizesFor[i18];
            if (layoutState.getOutputStallDurationlomOqCM == null) {
                if (z2) {
                    addView(view2);
                } else {
                    addView(view2, 0);
                }
            } else if (z2) {
                addDisappearingView(view2);
            } else {
                addDisappearingView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.getHighResolutionOutputSizeshNQ4ISI);
            getHighSpeedVideoFpsRanges(view2, modeInOther, false);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view2);
            if (decoratedMeasurement > i17) {
                i17 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther = (this.mOrientationHelper.getDecoratedMeasurementInOther(view2) * 1.0f) / ((androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view2.getLayoutParams()).Camera2StreamConfigurationMap;
            if (decoratedMeasurementInOther > f) {
                f = decoratedMeasurementInOther;
            }
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI(java.lang.Math.max(java.lang.Math.round(f * this.getOutputMinFrameDuration), i13));
            i17 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                android.view.View view3 = this.getHighSpeedVideoSizesFor[i19];
                getHighSpeedVideoFpsRanges(view3, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view3);
                if (decoratedMeasurement2 > i17) {
                    i17 = decoratedMeasurement2;
                }
            }
        }
        for (int i20 = 0; i20 < i15; i20++) {
            android.view.View view4 = this.getHighSpeedVideoSizesFor[i20];
            if (this.mOrientationHelper.getDecoratedMeasurement(view4) != i17) {
                androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view4.getLayoutParams();
                android.graphics.Rect rect = layoutParams2.getHighSpeedVideoFpsRangesFor;
                int i21 = rect.top + rect.bottom + layoutParams2.topMargin + layoutParams2.bottomMargin;
                int i22 = rect.left + rect.right + layoutParams2.leftMargin + layoutParams2.rightMargin;
                int highSpeedVideoSizes2 = getHighSpeedVideoSizes(layoutParams2.getHighSpeedVideoSizes, layoutParams2.Camera2StreamConfigurationMap);
                if (this.mOrientation == 1) {
                    i12 = getChildMeasureSpec(highSpeedVideoSizes2, 1073741824, i22, layoutParams2.width, false);
                    childMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    childMeasureSpec = getChildMeasureSpec(highSpeedVideoSizes2, 1073741824, i21, layoutParams2.height, false);
                    i12 = makeMeasureSpec;
                }
                Camera2StreamConfigurationMap(view4, i12, childMeasureSpec, true);
            }
        }
        layoutChunkResult.mConsumed = i17;
        if (this.mOrientation == 1) {
            if (layoutState.getInputSizeshNQ4ISI == -1) {
                i10 = layoutState.getHighSpeedVideoSizesFor;
                i11 = i10 - i17;
            } else {
                i11 = layoutState.getHighSpeedVideoSizesFor;
                i10 = i11 + i17;
            }
            i8 = i11;
            i9 = 0;
            i7 = 0;
        } else {
            if (layoutState.getInputSizeshNQ4ISI == -1) {
                i6 = layoutState.getHighSpeedVideoSizesFor;
                i5 = i6 - i17;
            } else {
                i5 = layoutState.getHighSpeedVideoSizesFor;
                i6 = i5 + i17;
            }
            i7 = i5;
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        int i23 = 0;
        while (i23 < i15) {
            android.view.View view5 = this.getHighSpeedVideoSizesFor[i23];
            androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams3 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    i9 = getPaddingLeft() + this.Camera2StreamConfigurationMap[this.getOutputMinFrameDuration - layoutParams3.getHighSpeedVideoSizes];
                    i7 = i9 - this.mOrientationHelper.getDecoratedMeasurementInOther(view5);
                } else {
                    i7 = this.Camera2StreamConfigurationMap[layoutParams3.getHighSpeedVideoSizes] + getPaddingLeft();
                    i9 = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + i7;
                }
            } else {
                i8 = this.Camera2StreamConfigurationMap[layoutParams3.getHighSpeedVideoSizes] + getPaddingTop();
                i10 = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + i8;
            }
            int i24 = i10;
            int i25 = i9;
            int i26 = i7;
            int i27 = i8;
            layoutDecoratedWithMargins(view5, i26, i27, i25, i24);
            if (layoutParams3.isItemRemoved() || layoutParams3.isItemChanged()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable |= view5.hasFocusable();
            i23++;
            i10 = i24;
            i9 = i25;
            i7 = i26;
            i8 = i27;
        }
        java.util.Arrays.fill(this.getHighSpeedVideoSizesFor, (java.lang.Object) null);
    }

    private void getHighSpeedVideoFpsRanges(android.view.View view, int i, boolean z) {
        int i2;
        int i3;
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect = layoutParams.getHighSpeedVideoFpsRangesFor;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int highSpeedVideoSizes = getHighSpeedVideoSizes(layoutParams.getHighSpeedVideoSizes, layoutParams.Camera2StreamConfigurationMap);
        if (this.mOrientation == 1) {
            i3 = getChildMeasureSpec(highSpeedVideoSizes, i, i5, layoutParams.width, false);
            i2 = getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i4, layoutParams.height, true);
        } else {
            int childMeasureSpec = getChildMeasureSpec(highSpeedVideoSizes, i, i4, layoutParams.height, false);
            int childMeasureSpec2 = getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i5, layoutParams.width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        Camera2StreamConfigurationMap(view, i3, i2, z);
    }

    private void Camera2StreamConfigurationMap(android.view.View view, int i, int i2, boolean z) {
        boolean shouldMeasureChild;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, i, i2, layoutParams);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i, i2, layoutParams);
        }
        if (shouldMeasureChild) {
            view.measure(i, i2);
        }
    }

    public int getSpanCount() {
        return this.getOutputMinFrameDuration;
    }

    public void setSpanCount(int i) {
        if (i == this.getOutputMinFrameDuration) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Span count should be at least 1. Provided ".concat(java.lang.String.valueOf(i)));
        }
        this.getOutputMinFrameDuration = i;
        this.getInputSizeshNQ4ISI.invalidateSpanIndexCache();
        requestLayout();
    }

    public static abstract class SpanSizeLookup {
        final android.util.SparseIntArray mSpanIndexCache = new android.util.SparseIntArray();
        final android.util.SparseIntArray mSpanGroupIndexCache = new android.util.SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public abstract int getSpanSize(int i);

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        int getCachedSpanGroupIndex(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getSpanIndex(int i, int i2) {
            int i3;
            int i4;
            int spanSize = getSpanSize(i);
            if (spanSize == i2) {
                return 0;
            }
            if (!this.mCacheSpanIndices || (i3 = findFirstKeyLessThan(this.mSpanIndexCache, i)) < 0) {
                i3 = 0;
                i4 = 0;
                if (i3 >= i) {
                    int spanSize2 = getSpanSize(i3);
                    i4 += spanSize2;
                    if (i4 == i2) {
                        i4 = 0;
                    } else if (i4 > i2) {
                        i4 = spanSize2;
                    }
                    i3++;
                    if (i3 >= i) {
                        if (spanSize + i4 <= i2) {
                            return i4;
                        }
                        return 0;
                    }
                }
            } else {
                i4 = this.mSpanIndexCache.get(i3) + getSpanSize(i3);
                i3++;
                if (i3 >= i) {
                }
            }
        }

        static int findFirstKeyLessThan(android.util.SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int getSpanGroupIndex(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int findFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (findFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i)) == -1) {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                i3 = this.mSpanGroupIndexCache.get(findFirstKeyLessThan);
                i4 = findFirstKeyLessThan + 1;
                i5 = getCachedSpanIndex(findFirstKeyLessThan, i2) + getSpanSize(findFirstKeyLessThan);
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                }
            }
            int spanSize = getSpanSize(i);
            while (i4 < i) {
                int spanSize2 = getSpanSize(i4);
                i5 += spanSize2;
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                } else if (i5 > i2) {
                    i3++;
                    i5 = spanSize2;
                }
                i4++;
            }
            return i5 + spanSize > i2 ? i3 + 1 : i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        if (r13 == (r2 > r15)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        if (r13 == (r2 > r10)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.View onFocusSearchFailed(android.view.View view, int i, androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        int childCount;
        int i2;
        int i3;
        android.view.View view2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.recyclerview.widget.RecyclerView.Recycler recycler2 = recycler;
        androidx.recyclerview.widget.RecyclerView.State state2 = state;
        android.view.View findContainingItemView = findContainingItemView(view);
        android.view.View view3 = null;
        if (findContainingItemView == null) {
            return null;
        }
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) findContainingItemView.getLayoutParams();
        int i9 = layoutParams.getHighSpeedVideoSizes;
        int i10 = layoutParams.getHighSpeedVideoSizes + layoutParams.Camera2StreamConfigurationMap;
        if (super.onFocusSearchFailed(view, i, recycler, state) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            i3 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            i3 = 0;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(recycler2, state2, i3);
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        int i15 = i3;
        android.view.View view4 = null;
        while (i15 != childCount) {
            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(recycler2, state2, i15);
            android.view.View childAt = getChildAt(i15);
            if (childAt == findContainingItemView) {
                break;
            }
            if (childAt.hasFocusable() && highSpeedVideoFpsRanges2 != highSpeedVideoFpsRanges) {
                if (view3 != null) {
                    break;
                }
                view2 = findContainingItemView;
                i5 = i13;
                i4 = childCount;
            } else {
                androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) childAt.getLayoutParams();
                int i16 = layoutParams2.getHighSpeedVideoSizes;
                view2 = findContainingItemView;
                i4 = childCount;
                int i17 = layoutParams2.getHighSpeedVideoSizes + layoutParams2.Camera2StreamConfigurationMap;
                if (childAt.hasFocusable() && i16 == i9 && i17 == i10) {
                    return childAt;
                }
                if ((!childAt.hasFocusable() || view3 != null) && (childAt.hasFocusable() || view4 != null)) {
                    int min = java.lang.Math.min(i17, i10) - java.lang.Math.max(i16, i9);
                    if (childAt.hasFocusable()) {
                        if (min <= i13) {
                            if (min == i13) {
                            }
                        }
                    } else if (view3 == null) {
                        i5 = i13;
                        i6 = highSpeedVideoFpsRanges;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            i7 = i14;
                            if (min <= i7) {
                                if (min == i7) {
                                    i8 = i12;
                                } else {
                                    i8 = i12;
                                }
                                i14 = i7;
                                i12 = i8;
                                i13 = i5;
                                i15 += i2;
                                highSpeedVideoFpsRanges = i6;
                                recycler2 = recycler;
                                state2 = state;
                                findContainingItemView = view2;
                                childCount = i4;
                            } else {
                                i8 = i12;
                            }
                            if (!childAt.hasFocusable()) {
                                i11 = layoutParams2.getHighSpeedVideoSizes;
                                i14 = i7;
                                i12 = i8;
                                view3 = childAt;
                                i13 = java.lang.Math.min(i17, i10) - java.lang.Math.max(i16, i9);
                            } else {
                                int i18 = layoutParams2.getHighSpeedVideoSizes;
                                i14 = java.lang.Math.min(i17, i10) - java.lang.Math.max(i16, i9);
                                i12 = i18;
                                i13 = i5;
                                view4 = childAt;
                            }
                            i15 += i2;
                            highSpeedVideoFpsRanges = i6;
                            recycler2 = recycler;
                            state2 = state;
                            findContainingItemView = view2;
                            childCount = i4;
                        }
                        i8 = i12;
                        i7 = i14;
                        i14 = i7;
                        i12 = i8;
                        i13 = i5;
                        i15 += i2;
                        highSpeedVideoFpsRanges = i6;
                        recycler2 = recycler;
                        state2 = state;
                        findContainingItemView = view2;
                        childCount = i4;
                    }
                    i5 = i13;
                }
                i5 = i13;
                i6 = highSpeedVideoFpsRanges;
                i8 = i12;
                i7 = i14;
                if (!childAt.hasFocusable()) {
                }
                i15 += i2;
                highSpeedVideoFpsRanges = i6;
                recycler2 = recycler;
                state2 = state;
                findContainingItemView = view2;
                childCount = i4;
            }
            i6 = highSpeedVideoFpsRanges;
            i8 = i12;
            i7 = i14;
            i14 = i7;
            i12 = i8;
            i13 = i5;
            i15 += i2;
            highSpeedVideoFpsRanges = i6;
            recycler2 = recycler;
            state2 = state;
            findContainingItemView = view2;
            childCount = i4;
        }
        return view3 != null ? view3 : view4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.getHighSpeedVideoSizes;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
        if (this.getOutputFormats) {
            return Camera2StreamConfigurationMap(state);
        }
        return super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State state) {
        if (this.getOutputFormats) {
            return Camera2StreamConfigurationMap(state);
        }
        return super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
        if (this.getOutputFormats) {
            return getHighSpeedVideoFpsRangesFor(state);
        }
        return super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State state) {
        if (this.getOutputFormats) {
            return getHighSpeedVideoFpsRangesFor(state);
        }
        return super.computeVerticalScrollOffset(state);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.getOutputFormats = z;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.getOutputFormats;
    }

    private int Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        android.view.View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
        android.view.View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
        if (findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null) {
            return 0;
        }
        if (!isSmoothScrollbarEnabled()) {
            return this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(state.getItemCount() - 1, this.getOutputMinFrameDuration) + 1;
        }
        int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd);
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart);
        int cachedSpanGroupIndex = this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.getOutputMinFrameDuration);
        return (int) (((decoratedEnd - decoratedStart) / ((this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.getOutputMinFrameDuration) - cachedSpanGroupIndex) + 1)) * (this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(state.getItemCount() - 1, this.getOutputMinFrameDuration) + 1));
    }

    private int getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.State state) {
        int max;
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            boolean z = !isSmoothScrollbarEnabled;
            android.view.View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(z, true);
            android.view.View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(z, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.getOutputMinFrameDuration);
                int cachedSpanGroupIndex2 = this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.getOutputMinFrameDuration);
                int min = java.lang.Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int max2 = java.lang.Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int cachedSpanGroupIndex3 = this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(state.getItemCount() - 1, this.getOutputMinFrameDuration);
                if (this.mShouldReverseLayout) {
                    max = java.lang.Math.max(0, ((cachedSpanGroupIndex3 + 1) - max2) - 1);
                } else {
                    max = java.lang.Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return max;
                }
                return java.lang.Math.round((max * (java.lang.Math.abs(this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart)) / ((this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.getOutputMinFrameDuration) - this.getInputSizeshNQ4ISI.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.getOutputMinFrameDuration)) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart)));
            }
        }
        return 0;
    }

    public static final class DefaultSpanSizeLookup extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanIndex(int i, int i2) {
            return i % i2;
        }
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int Camera2StreamConfigurationMap;
        int getHighSpeedVideoSizes;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getHighSpeedVideoSizes = -1;
            this.Camera2StreamConfigurationMap = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.getHighSpeedVideoSizes = -1;
            this.Camera2StreamConfigurationMap = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.getHighSpeedVideoSizes = -1;
            this.Camera2StreamConfigurationMap = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.getHighSpeedVideoSizes = -1;
            this.Camera2StreamConfigurationMap = 0;
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.getHighSpeedVideoSizes = -1;
            this.Camera2StreamConfigurationMap = 0;
        }

        public int getSpanIndex() {
            return this.getHighSpeedVideoSizes;
        }

        public int getSpanSize() {
            return this.Camera2StreamConfigurationMap;
        }
    }
}
