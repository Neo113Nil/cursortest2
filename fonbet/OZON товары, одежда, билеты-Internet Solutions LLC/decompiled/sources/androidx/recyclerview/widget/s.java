package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;

/* loaded from: classes8.dex */
public class s extends D {
    private static final float INVALID_DISTANCE = 1.0f;
    private w mHorizontalHelper;
    private w mVerticalHelper;

    private float computeDistancePerChild(RecyclerView.o oVar, w wVar) {
        int childCount = oVar.getChildCount();
        if (childCount != 0) {
            View view = null;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = oVar.getChildAt(i13);
                int position = oVar.getPosition(childAt);
                if (position != -1) {
                    if (position < i12) {
                        view = childAt;
                        i12 = position;
                    }
                    if (position > i11) {
                        view2 = childAt;
                        i11 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(wVar.d(view), wVar.d(view2)) - Math.min(wVar.g(view), wVar.g(view2));
                if (max != 0) {
                    return (max * 1.0f) / ((i11 - i12) + 1);
                }
            }
        }
        return 1.0f;
    }

    private int distanceToCenter(@NonNull RecyclerView.o oVar, @NonNull View view, w wVar) {
        return ((wVar.e(view) / 2) + wVar.g(view)) - ((wVar.o() / 2) + wVar.n());
    }

    private int estimateNextPositionDiffForFling(RecyclerView.o oVar, w wVar, int i11, int i12) {
        int[] calculateScrollDistance = calculateScrollDistance(i11, i12);
        float computeDistancePerChild = computeDistancePerChild(oVar, wVar);
        if (computeDistancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1]) / computeDistancePerChild);
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

    @NonNull
    private w getVerticalHelper(@NonNull RecyclerView.o oVar) {
        w wVar = this.mVerticalHelper;
        if (wVar == null || wVar.f45026a != oVar) {
            this.mVerticalHelper = new w.b(oVar);
        }
        return this.mVerticalHelper;
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
    public View findSnapView(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return findCenterView(oVar, getVerticalHelper(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return findCenterView(oVar, getHorizontalHelper(oVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.D
    public int findTargetSnapPosition(RecyclerView.o oVar, int i11, int i12) {
        int itemCount;
        View findSnapView;
        int position;
        int i13;
        PointF computeScrollVectorForPosition;
        int i14;
        int i15;
        if (!(oVar instanceof RecyclerView.z.b) || (itemCount = oVar.getItemCount()) == 0 || (findSnapView = findSnapView(oVar)) == null || (position = oVar.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.z.b) oVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (oVar.canScrollHorizontally()) {
            i14 = estimateNextPositionDiffForFling(oVar, getHorizontalHelper(oVar), i11, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (oVar.canScrollVertically()) {
            i15 = estimateNextPositionDiffForFling(oVar, getVerticalHelper(oVar), 0, i12);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i15 = -i15;
            }
        } else {
            i15 = 0;
        }
        if (oVar.canScrollVertically()) {
            i14 = i15;
        }
        if (i14 == 0) {
            return -1;
        }
        int i16 = position + i14;
        int i17 = i16 >= 0 ? i16 : 0;
        return i17 >= itemCount ? i13 : i17;
    }
}
