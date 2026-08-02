package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "", "Landroidx/compose/ui/geometry/Offset;", "downPosition", "", "onExtend-k-4lQ0M", "(J)Z", "onExtend", "dragPosition", "onExtendDrag-k-4lQ0M", "onExtendDrag", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "clickCount", "onStart-9KIMszo", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;I)Z", "onStart", "onDrag-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onDrag", "", "onDragDone", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MouseSelectionObserver {
    /* renamed from: onDrag-3MmeM6k */
    boolean mo2311onDrag3MmeM6k(long dragPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment);

    void onDragDone();

    /* renamed from: onExtend-k-4lQ0M */
    boolean mo2312onExtendk4lQ0M(long downPosition);

    /* renamed from: onExtendDrag-k-4lQ0M */
    boolean mo2313onExtendDragk4lQ0M(long dragPosition);

    /* renamed from: onStart-9KIMszo */
    boolean mo2314onStart9KIMszo(long downPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, int clickCount);
}
