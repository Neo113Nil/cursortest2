package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class LinearSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private androidx.recyclerview.widget.OrientationHelper getHighSpeedVideoFpsRangesFor;
    private androidx.recyclerview.widget.OrientationHelper getHighSpeedVideoSizes;

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (!layoutManager.canScrollHorizontally()) {
            iArr[0] = 0;
        } else {
            androidx.recyclerview.widget.OrientationHelper orientationHelper = this.getHighSpeedVideoSizes;
            if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
                this.getHighSpeedVideoSizes = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager);
            }
            androidx.recyclerview.widget.OrientationHelper orientationHelper2 = this.getHighSpeedVideoSizes;
            iArr[0] = (orientationHelper2.getDecoratedStart(view) + (orientationHelper2.getDecoratedMeasurement(view) / 2)) - (orientationHelper2.getStartAfterPadding() + (orientationHelper2.getTotalSpace() / 2));
        }
        if (!layoutManager.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        androidx.recyclerview.widget.OrientationHelper orientationHelper3 = this.getHighSpeedVideoFpsRangesFor;
        if (orientationHelper3 == null || orientationHelper3.mLayoutManager != layoutManager) {
            this.getHighSpeedVideoFpsRangesFor = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager);
        }
        androidx.recyclerview.widget.OrientationHelper orientationHelper4 = this.getHighSpeedVideoFpsRangesFor;
        iArr[1] = (orientationHelper4.getDecoratedStart(view) + (orientationHelper4.getDecoratedMeasurement(view) / 2)) - (orientationHelper4.getStartAfterPadding() + (orientationHelper4.getTotalSpace() / 2));
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        android.view.View findSnapView;
        int position;
        int i3;
        android.graphics.PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (findSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            androidx.recyclerview.widget.OrientationHelper orientationHelper = this.getHighSpeedVideoSizes;
            if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
                this.getHighSpeedVideoSizes = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager);
            }
            i4 = getHighSpeedVideoFpsRangesFor(layoutManager, this.getHighSpeedVideoSizes, i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            androidx.recyclerview.widget.OrientationHelper orientationHelper2 = this.getHighSpeedVideoFpsRangesFor;
            if (orientationHelper2 == null || orientationHelper2.mLayoutManager != layoutManager) {
                this.getHighSpeedVideoFpsRangesFor = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager);
            }
            i5 = getHighSpeedVideoFpsRangesFor(layoutManager, this.getHighSpeedVideoFpsRangesFor, 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = position + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= itemCount ? i3 : i7;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (!layoutManager.canScrollVertically()) {
            if (!layoutManager.canScrollHorizontally()) {
                return null;
            }
            androidx.recyclerview.widget.OrientationHelper orientationHelper = this.getHighSpeedVideoSizes;
            if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
                this.getHighSpeedVideoSizes = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager);
            }
            return Camera2StreamConfigurationMap(layoutManager, this.getHighSpeedVideoSizes);
        }
        androidx.recyclerview.widget.OrientationHelper orientationHelper2 = this.getHighSpeedVideoFpsRangesFor;
        if (orientationHelper2 == null || orientationHelper2.mLayoutManager != layoutManager) {
            this.getHighSpeedVideoFpsRangesFor = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager);
        }
        return Camera2StreamConfigurationMap(layoutManager, this.getHighSpeedVideoFpsRangesFor);
    }

    private int getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.OrientationHelper orientationHelper, int i, int i2) {
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        int childCount = layoutManager.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            android.view.View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            android.view.View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                android.view.View childAt = layoutManager.getChildAt(i5);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i3) {
                        view = childAt;
                        i3 = position;
                    }
                    if (position > i4) {
                        view2 = childAt;
                        i4 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = java.lang.Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - java.lang.Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
                if (max != 0) {
                    f = (max * 1.0f) / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return java.lang.Math.round((java.lang.Math.abs(calculateScrollDistance[0]) > java.lang.Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1]) / f);
    }

    private static android.view.View Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.OrientationHelper orientationHelper) {
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
