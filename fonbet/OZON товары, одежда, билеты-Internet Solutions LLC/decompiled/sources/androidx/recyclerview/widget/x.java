package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;

/* loaded from: classes.dex */
public class x extends D {
    private w mHorizontalHelper;
    private w mVerticalHelper;

    /* loaded from: classes8.dex */
    final class a extends r {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        protected final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r
        protected final int calculateTimeForScrolling(int i11) {
            return Math.min(100, super.calculateTimeForScrolling(i11));
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.z
        protected final void onTargetFound(View view, RecyclerView.A a11, RecyclerView.z.a aVar) {
            x xVar = x.this;
            int[] calculateDistanceToFinalSnap = xVar.calculateDistanceToFinalSnap(xVar.mRecyclerView.getLayoutManager(), view);
            int i11 = calculateDistanceToFinalSnap[0];
            int i12 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
            if (calculateTimeForDeceleration > 0) {
                aVar.d(i11, i12, this.mDecelerateInterpolator, calculateTimeForDeceleration);
            }
        }
    }

    private int distanceToCenter(@NonNull RecyclerView.o oVar, @NonNull View view, w wVar) {
        return ((wVar.e(view) / 2) + wVar.g(view)) - ((wVar.o() / 2) + wVar.n());
    }

    private View findCenterView(RecyclerView.o oVar, w wVar) {
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int o11 = (wVar.o() / 2) + wVar.n();
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = oVar.getChildAt(i12);
            int abs = Math.abs(((wVar.e(childAt) / 2) + wVar.g(childAt)) - o11);
            if (abs < i11) {
                view = childAt;
                i11 = abs;
            }
        }
        return view;
    }

    @NonNull
    private w getHorizontalHelper(@NonNull RecyclerView.o oVar) {
        w wVar = this.mHorizontalHelper;
        if (wVar == null || wVar.f45026a != oVar) {
            this.mHorizontalHelper = new w.a(oVar);
        }
        return this.mHorizontalHelper;
    }

    private w getOrientationHelper(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return getVerticalHelper(oVar);
        }
        if (oVar.canScrollHorizontally()) {
            return getHorizontalHelper(oVar);
        }
        return null;
    }

    @NonNull
    private w getVerticalHelper(@NonNull RecyclerView.o oVar) {
        w wVar = this.mVerticalHelper;
        if (wVar == null || wVar.f45026a != oVar) {
            this.mVerticalHelper = new w.b(oVar);
        }
        return this.mVerticalHelper;
    }

    private boolean isForwardFling(RecyclerView.o oVar, int i11, int i12) {
        return oVar.canScrollHorizontally() ? i11 > 0 : i12 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.o oVar) {
        PointF computeScrollVectorForPosition;
        int itemCount = oVar.getItemCount();
        if (!(oVar instanceof RecyclerView.z.b) || (computeScrollVectorForPosition = ((RecyclerView.z.b) oVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.D
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.o oVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(oVar, view, getHorizontalHelper(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = distanceToCenter(oVar, view, getVerticalHelper(oVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.D
    protected r createSnapScroller(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.D
    public View findSnapView(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return findCenterView(oVar, getVerticalHelper(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return findCenterView(oVar, getHorizontalHelper(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.D
    public int findTargetSnapPosition(RecyclerView.o oVar, int i11, int i12) {
        w orientationHelper;
        int itemCount = oVar.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(oVar)) == null) {
            return -1;
        }
        int childCount = oVar.getChildCount();
        View view = null;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = oVar.getChildAt(i15);
            if (childAt != null) {
                int distanceToCenter = distanceToCenter(oVar, childAt, orientationHelper);
                if (distanceToCenter <= 0 && distanceToCenter > i14) {
                    view2 = childAt;
                    i14 = distanceToCenter;
                }
                if (distanceToCenter >= 0 && distanceToCenter < i13) {
                    view = childAt;
                    i13 = distanceToCenter;
                }
            }
        }
        boolean isForwardFling = isForwardFling(oVar, i11, i12);
        if (isForwardFling && view != null) {
            return oVar.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return oVar.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = oVar.getPosition(view) + (isReverseLayout(oVar) == isForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
