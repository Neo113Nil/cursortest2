package androidx.paging;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a?\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "T", "Landroidx/paging/PlaceholderPaddedList;", "newList", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/paging/PlaceholderPaddedDiffResult;", "computeDiff", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)Landroidx/paging/PlaceholderPaddedDiffResult;", "Landroidx/recyclerview/widget/ListUpdateCallback;", com.sun.jna.Callback.METHOD_NAME, "diffResult", "", "dispatchDiff", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedDiffResult;)V", "", "oldPosition", "transformAnchorIndex", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedDiffResult;Landroidx/paging/PlaceholderPaddedList;I)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaceholderPaddedListDiffHelperKt {
    public static final <T> androidx.paging.PlaceholderPaddedDiffResult computeDiff(final androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList, final androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList2, final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        final int dataCount = placeholderPaddedList.getDataCount();
        final int dataCount2 = placeholderPaddedList2.getDataCount();
        androidx.recyclerview.widget.DiffUtil.Callback callback = new androidx.recyclerview.widget.DiffUtil.Callback() { // from class: androidx.paging.PlaceholderPaddedListDiffHelperKt$computeDiff$diffResult$1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final java.lang.Object getChangePayload(int oldItemPosition, int newItemPosition) {
                java.lang.Object item = placeholderPaddedList.getItem(oldItemPosition);
                java.lang.Object item2 = placeholderPaddedList2.getItem(newItemPosition);
                if (item == item2) {
                    return java.lang.Boolean.TRUE;
                }
                return itemCallback.getChangePayload(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            /* renamed from: getOldListSize, reason: from getter */
            public final int getGetHighResolutionOutputSizeshNQ4ISI() {
                return dataCount;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            /* renamed from: getNewListSize, reason: from getter */
            public final int getGetHighSpeedVideoFpsRangesFor() {
                return dataCount2;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                java.lang.Object item = placeholderPaddedList.getItem(oldItemPosition);
                java.lang.Object item2 = placeholderPaddedList2.getItem(newItemPosition);
                if (item == item2) {
                    return true;
                }
                return itemCallback.areItemsTheSame(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                java.lang.Object item = placeholderPaddedList.getItem(oldItemPosition);
                java.lang.Object item2 = placeholderPaddedList2.getItem(newItemPosition);
                if (item == item2) {
                    return true;
                }
                return itemCallback.areContentsTheSame(item, item2);
            }
        };
        boolean z = true;
        androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff = androidx.recyclerview.widget.DiffUtil.calculateDiff(callback, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calculateDiff, "");
        java.lang.Iterable until = kotlin.ranges.RangesKt.until(0, placeholderPaddedList.getDataCount());
        if (!(until instanceof java.util.Collection) || !((java.util.Collection) until).isEmpty()) {
            java.util.Iterator<T> it = until.iterator();
            while (it.hasNext()) {
                if (calculateDiff.convertOldPositionToNew(((kotlin.collections.IntIterator) it).nextInt()) != -1) {
                    break;
                }
            }
        }
        z = false;
        return new androidx.paging.PlaceholderPaddedDiffResult(calculateDiff, z);
    }

    public static final <T> void dispatchDiff(androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList2, androidx.paging.PlaceholderPaddedDiffResult placeholderPaddedDiffResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedDiffResult, "");
        if (placeholderPaddedDiffResult.getHasOverlap()) {
            androidx.paging.OverlappingListsDiffDispatcher.INSTANCE.dispatchDiff(placeholderPaddedList, placeholderPaddedList2, listUpdateCallback, placeholderPaddedDiffResult);
        } else {
            androidx.paging.DistinctListsDiffDispatcher.INSTANCE.dispatchDiff(listUpdateCallback, placeholderPaddedList, placeholderPaddedList2);
        }
    }

    public static final int transformAnchorIndex(androidx.paging.PlaceholderPaddedList<?> placeholderPaddedList, androidx.paging.PlaceholderPaddedDiffResult placeholderPaddedDiffResult, androidx.paging.PlaceholderPaddedList<?> placeholderPaddedList2, int i) {
        int convertOldPositionToNew;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedDiffResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList2, "");
        if (!placeholderPaddedDiffResult.getHasOverlap()) {
            return kotlin.ranges.RangesKt.coerceIn(i, (kotlin.ranges.ClosedRange<java.lang.Integer>) kotlin.ranges.RangesKt.until(0, placeholderPaddedList2.getSize()));
        }
        int placeholdersBefore = i - placeholderPaddedList.getPlaceholdersBefore();
        int dataCount = placeholderPaddedList.getDataCount();
        if (placeholdersBefore >= 0 && placeholdersBefore < dataCount) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + placeholdersBefore;
                if (i3 >= 0 && i3 < placeholderPaddedList.getDataCount() && (convertOldPositionToNew = placeholderPaddedDiffResult.getDiff().convertOldPositionToNew(i3)) != -1) {
                    return convertOldPositionToNew + placeholderPaddedList2.getPlaceholdersBefore();
                }
            }
        }
        return kotlin.ranges.RangesKt.coerceIn(i, (kotlin.ranges.ClosedRange<java.lang.Integer>) kotlin.ranges.RangesKt.until(0, placeholderPaddedList2.getSize()));
    }
}
