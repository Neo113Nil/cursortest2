package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/paging/DistinctListsDiffDispatcher;", "", "<init>", "()V", "T", "Landroidx/recyclerview/widget/ListUpdateCallback;", com.sun.jna.Callback.METHOD_NAME, "Landroidx/paging/PlaceholderPaddedList;", "oldList", "newList", "", "dispatchDiff", "(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;)V", "p0", "", "p1", "p2", "p3", "p4", "p5", "getHighSpeedVideoFpsRangesFor", "(Landroidx/recyclerview/widget/ListUpdateCallback;IIIILjava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DistinctListsDiffDispatcher {
    public static final androidx.paging.DistinctListsDiffDispatcher INSTANCE = new androidx.paging.DistinctListsDiffDispatcher();

    private DistinctListsDiffDispatcher() {
    }

    public final <T> void dispatchDiff(androidx.recyclerview.widget.ListUpdateCallback callback, androidx.paging.PlaceholderPaddedList<T> oldList, androidx.paging.PlaceholderPaddedList<T> newList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newList, "");
        int max = java.lang.Math.max(oldList.getPlaceholdersBefore(), newList.getPlaceholdersBefore());
        int min = java.lang.Math.min(oldList.getPlaceholdersBefore() + oldList.getDataCount(), newList.getPlaceholdersBefore() + newList.getDataCount());
        int i = min - max;
        if (i > 0) {
            callback.onRemoved(max, i);
            callback.onInserted(max, i);
        }
        int min2 = java.lang.Math.min(max, min);
        int max2 = java.lang.Math.max(max, min);
        getHighSpeedVideoFpsRangesFor(callback, min2, max2, kotlin.ranges.RangesKt.coerceAtMost(oldList.getPlaceholdersBefore(), newList.getSize()), kotlin.ranges.RangesKt.coerceAtMost(oldList.getPlaceholdersBefore() + oldList.getDataCount(), newList.getSize()), androidx.paging.DiffingChangePayload.ITEM_TO_PLACEHOLDER);
        getHighSpeedVideoFpsRangesFor(callback, min2, max2, kotlin.ranges.RangesKt.coerceAtMost(newList.getPlaceholdersBefore(), oldList.getSize()), kotlin.ranges.RangesKt.coerceAtMost(newList.getPlaceholdersBefore() + newList.getDataCount(), oldList.getSize()), androidx.paging.DiffingChangePayload.PLACEHOLDER_TO_ITEM);
        int size = newList.getSize() - oldList.getSize();
        if (size > 0) {
            callback.onInserted(oldList.getSize(), size);
        } else if (size < 0) {
            callback.onRemoved(oldList.getSize() + size, -size);
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.ListUpdateCallback p0, int p1, int p2, int p3, int p4, java.lang.Object p5) {
        int i = p1 - p3;
        if (i > 0) {
            p0.onChanged(p3, i, p5);
        }
        int i2 = p4 - p2;
        if (i2 > 0) {
            p0.onChanged(p2, i2, p5);
        }
    }
}
