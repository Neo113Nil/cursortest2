package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/recyclerview/widget/FixedGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class FixedGridLayoutManager extends GridLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedGridLayoutManager(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static float p(w wVar, View view, View view2, FixedGridLayoutManager fixedGridLayoutManager, int i11) {
        return i11 * (Math.abs(wVar.d(view2) - wVar.g(view)) / (Math.abs(fixedGridLayoutManager.getPosition(view) - fixedGridLayoutManager.getPosition(view2)) + 1));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(@NotNull RecyclerView.A state) {
        float p11;
        Intrinsics.checkNotNullParameter(state, "state");
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        w mOrientationHelper = this.mOrientationHelper;
        Intrinsics.checkNotNullExpressionValue(mOrientationHelper, "mOrientationHelper");
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
        View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
        boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
        boolean z11 = this.mShouldReverseLayout;
        if (getChildCount() == 0 || state.b() == 0 || findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (state.b() - Math.max(getPosition(findFirstVisibleChildClosestToStart), getPosition(findFirstVisibleChildClosestToEnd))) - 1) : Math.max(0, Math.min(getPosition(findFirstVisibleChildClosestToStart), getPosition(findFirstVisibleChildClosestToEnd)));
        if (!isSmoothScrollbarEnabled) {
            return max;
        }
        if (max == 1) {
            View childAt = getChildAt(z11 ? getChildCount() : 0);
            Float f7 = null;
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                RecyclerView.p pVar = layoutParams instanceof RecyclerView.p ? (RecyclerView.p) layoutParams : null;
                if (pVar != null && pVar.f44747a.getAdapterPosition() == 0) {
                    f7 = Float.valueOf(childAt.getHeight());
                }
            }
            p11 = f7 != null ? f7.floatValue() : p(mOrientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd, this, max);
        } else {
            p11 = p(mOrientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd, this, max);
        }
        return Math.round(p11 + (mOrientationHelper.n() - mOrientationHelper.g(findFirstVisibleChildClosestToStart)));
    }
}
