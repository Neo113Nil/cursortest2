package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class PagerSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private androidx.recyclerview.widget.OrientationHelper getHighSpeedVideoFpsRangesFor;
    private androidx.recyclerview.widget.OrientationHelper getHighSpeedVideoSizes;

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (!layoutManager.canScrollHorizontally()) {
            iArr[0] = 0;
        } else {
            androidx.recyclerview.widget.OrientationHelper orientationHelper = this.getHighSpeedVideoFpsRangesFor;
            if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
                this.getHighSpeedVideoFpsRangesFor = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager);
            }
            androidx.recyclerview.widget.OrientationHelper orientationHelper2 = this.getHighSpeedVideoFpsRangesFor;
            iArr[0] = (orientationHelper2.getDecoratedStart(view) + (orientationHelper2.getDecoratedMeasurement(view) / 2)) - (orientationHelper2.getStartAfterPadding() + (orientationHelper2.getTotalSpace() / 2));
        }
        if (!layoutManager.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        androidx.recyclerview.widget.OrientationHelper orientationHelper3 = this.getHighSpeedVideoSizes;
        if (orientationHelper3 == null || orientationHelper3.mLayoutManager != layoutManager) {
            this.getHighSpeedVideoSizes = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager);
        }
        androidx.recyclerview.widget.OrientationHelper orientationHelper4 = this.getHighSpeedVideoSizes;
        iArr[1] = (orientationHelper4.getDecoratedStart(view) + (orientationHelper4.getDecoratedMeasurement(view) / 2)) - (orientationHelper4.getStartAfterPadding() + (orientationHelper4.getTotalSpace() / 2));
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (!layoutManager.canScrollVertically()) {
            if (!layoutManager.canScrollHorizontally()) {
                return null;
            }
            androidx.recyclerview.widget.OrientationHelper orientationHelper = this.getHighSpeedVideoFpsRangesFor;
            if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
                this.getHighSpeedVideoFpsRangesFor = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager);
            }
            return getHighSpeedVideoFpsRanges(layoutManager, this.getHighSpeedVideoFpsRangesFor);
        }
        androidx.recyclerview.widget.OrientationHelper orientationHelper2 = this.getHighSpeedVideoSizes;
        if (orientationHelper2 == null || orientationHelper2.mLayoutManager != layoutManager) {
            this.getHighSpeedVideoSizes = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager);
        }
        return getHighSpeedVideoFpsRanges(layoutManager, this.getHighSpeedVideoSizes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        androidx.recyclerview.widget.OrientationHelper orientationHelper;
        android.graphics.PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        android.view.View view = null;
        if (!layoutManager.canScrollVertically()) {
            if (layoutManager.canScrollHorizontally()) {
                androidx.recyclerview.widget.OrientationHelper orientationHelper2 = this.getHighSpeedVideoFpsRangesFor;
                if (orientationHelper2 == null || orientationHelper2.mLayoutManager != layoutManager) {
                    this.getHighSpeedVideoFpsRangesFor = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager);
                }
                orientationHelper = this.getHighSpeedVideoFpsRangesFor;
            } else {
                orientationHelper = null;
            }
        } else {
            androidx.recyclerview.widget.OrientationHelper orientationHelper3 = this.getHighSpeedVideoSizes;
            if (orientationHelper3 == null || orientationHelper3.mLayoutManager != layoutManager) {
                this.getHighSpeedVideoSizes = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager);
            }
            orientationHelper = this.getHighSpeedVideoSizes;
        }
        if (orientationHelper == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        boolean z = false;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        android.view.View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = layoutManager.getChildAt(i5);
            if (childAt != null) {
                int decoratedStart = (orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
                if (decoratedStart <= 0 && decoratedStart > i3) {
                    view = childAt;
                    i3 = decoratedStart;
                }
                if (decoratedStart >= 0 && decoratedStart < i4) {
                    view2 = childAt;
                    i4 = decoratedStart;
                }
            }
        }
        boolean z2 = !layoutManager.canScrollHorizontally() ? i2 <= 0 : i <= 0;
        if (z2 && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (!z2 && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        int itemCount2 = layoutManager.getItemCount();
        if ((layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) && (computeScrollVectorForPosition = ((androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
            z = true;
        }
        int i6 = position + (z == z2 ? -1 : 1);
        if (i6 < 0 || i6 >= itemCount) {
            return -1;
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    protected androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new androidx.recyclerview.widget.LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(android.view.View view, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action) {
                    androidx.recyclerview.widget.PagerSnapHelper pagerSnapHelper = androidx.recyclerview.widget.PagerSnapHelper.this;
                    int[] calculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
                    int i = calculateDistanceToFinalSnap[0];
                    int i2 = calculateDistanceToFinalSnap[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(java.lang.Math.max(java.lang.Math.abs(i), java.lang.Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        action.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected int calculateTimeForScrolling(int i) {
                    return java.lang.Math.min(100, super.calculateTimeForScrolling(i));
                }
            };
        }
        return null;
    }

    private static android.view.View getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding();
        int totalSpace = orientationHelper.getTotalSpace() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = layoutManager.getChildAt(i2);
            int abs = java.lang.Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - (startAfterPadding + totalSpace));
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }
}
