package com.google.android.material.carousel;

/* loaded from: classes8.dex */
public class CarouselSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private androidx.recyclerview.widget.RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        return calculateDistanceToSnap(layoutManager, view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view, boolean z) {
        if (!(layoutManager instanceof com.google.android.material.carousel.CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (com.google.android.material.carousel.CarouselLayoutManager) layoutManager, z);
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{distanceToFirstFocalKeyline, 0};
        }
        if (layoutManager.canScrollVertically()) {
            return new int[]{0, distanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(android.view.View view, com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return findViewNearestFirstKeyline(layoutManager);
    }

    private android.view.View findViewNearestFirstKeyline(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount != 0 && (layoutManager instanceof com.google.android.material.carousel.CarouselLayoutManager)) {
            com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager = (com.google.android.material.carousel.CarouselLayoutManager) layoutManager;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = layoutManager.getChildAt(i2);
                int abs = java.lang.Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(layoutManager.getPosition(childAt), false));
                if (abs < i) {
                    view = childAt;
                    i = abs;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        if (!this.disableFling || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        android.view.View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = layoutManager.getChildAt(i5);
            if (childAt != null) {
                int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (com.google.android.material.carousel.CarouselLayoutManager) layoutManager, false);
                if (distanceToFirstFocalKeyline <= 0 && distanceToFirstFocalKeyline > i3) {
                    view2 = childAt;
                    i3 = distanceToFirstFocalKeyline;
                }
                if (distanceToFirstFocalKeyline >= 0 && distanceToFirstFocalKeyline < i4) {
                    view = childAt;
                    i4 = distanceToFirstFocalKeyline;
                }
            }
        }
        boolean isForwardFling = isForwardFling(layoutManager, i, i2);
        if (isForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == isForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private boolean isForwardFling(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return layoutManager.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        android.graphics.PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) || (computeScrollVectorForPosition = ((androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(final androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new androidx.recyclerview.widget.LinearSmoothScroller(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(android.view.View view, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action) {
                    if (com.google.android.material.carousel.CarouselSnapHelper.this.recyclerView != null) {
                        com.google.android.material.carousel.CarouselSnapHelper carouselSnapHelper = com.google.android.material.carousel.CarouselSnapHelper.this;
                        int[] calculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = calculateDistanceToSnap[0];
                        int i2 = calculateDistanceToSnap[1];
                        int calculateTimeForDeceleration = calculateTimeForDeceleration(java.lang.Math.max(java.lang.Math.abs(i), java.lang.Math.abs(i2)));
                        if (calculateTimeForDeceleration > 0) {
                            action.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (layoutManager.canScrollVertically()) {
                        f = displayMetrics.densityDpi;
                        f2 = 50.0f;
                    } else {
                        f = displayMetrics.densityDpi;
                        f2 = 100.0f;
                    }
                    return f2 / f;
                }
            };
        }
        return null;
    }
}
