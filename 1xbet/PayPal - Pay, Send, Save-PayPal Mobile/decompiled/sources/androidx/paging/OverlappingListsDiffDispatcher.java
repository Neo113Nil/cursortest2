package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher;", "", "<init>", "()V", "T", "Landroidx/paging/PlaceholderPaddedList;", "oldList", "newList", "Landroidx/recyclerview/widget/ListUpdateCallback;", com.sun.jna.Callback.METHOD_NAME, "Landroidx/paging/PlaceholderPaddedDiffResult;", "diffResult", "", "dispatchDiff", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/paging/PlaceholderPaddedDiffResult;)V", "PlaceholderUsingUpdateCallback"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlappingListsDiffDispatcher {
    public static final androidx.paging.OverlappingListsDiffDispatcher INSTANCE = new androidx.paging.OverlappingListsDiffDispatcher();

    private OverlappingListsDiffDispatcher() {
    }

    public final <T> void dispatchDiff(androidx.paging.PlaceholderPaddedList<T> oldList, androidx.paging.PlaceholderPaddedList<T> newList, androidx.recyclerview.widget.ListUpdateCallback callback, androidx.paging.PlaceholderPaddedDiffResult diffResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diffResult, "");
        androidx.paging.OverlappingListsDiffDispatcher.PlaceholderUsingUpdateCallback placeholderUsingUpdateCallback = new androidx.paging.OverlappingListsDiffDispatcher.PlaceholderUsingUpdateCallback(oldList, newList, callback);
        diffResult.getDiff().dispatchUpdatesTo(placeholderUsingUpdateCallback);
        int min = java.lang.Math.min(placeholderUsingUpdateCallback.getHighSpeedVideoFpsRanges.getPlaceholdersBefore(), placeholderUsingUpdateCallback.Camera2StreamConfigurationMap);
        int placeholdersBefore = placeholderUsingUpdateCallback.getHighSpeedVideoSizes.getPlaceholdersBefore() - placeholderUsingUpdateCallback.Camera2StreamConfigurationMap;
        if (placeholdersBefore > 0) {
            if (min > 0) {
                placeholderUsingUpdateCallback.getHighResolutionOutputSizeshNQ4ISI.onChanged(0, min, androidx.paging.DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            placeholderUsingUpdateCallback.getHighResolutionOutputSizeshNQ4ISI.onInserted(0, placeholdersBefore);
        } else if (placeholdersBefore < 0) {
            placeholderUsingUpdateCallback.getHighResolutionOutputSizeshNQ4ISI.onRemoved(0, -placeholdersBefore);
            int i = min + placeholdersBefore;
            if (i > 0) {
                placeholderUsingUpdateCallback.getHighResolutionOutputSizeshNQ4ISI.onChanged(0, i, androidx.paging.DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
        }
        placeholderUsingUpdateCallback.Camera2StreamConfigurationMap = placeholderUsingUpdateCallback.getHighSpeedVideoSizes.getPlaceholdersBefore();
        int min2 = java.lang.Math.min(placeholderUsingUpdateCallback.getHighSpeedVideoFpsRanges.getPlaceholdersAfter(), placeholderUsingUpdateCallback.getHighSpeedVideoFpsRangesFor);
        int placeholdersAfter = placeholderUsingUpdateCallback.getHighSpeedVideoSizes.getPlaceholdersAfter();
        int i2 = placeholderUsingUpdateCallback.getHighSpeedVideoFpsRangesFor;
        int i3 = placeholdersAfter - i2;
        int i4 = placeholderUsingUpdateCallback.Camera2StreamConfigurationMap + placeholderUsingUpdateCallback.getOutputFormats + i2;
        int i5 = i4 - min2;
        boolean z = i5 != placeholderUsingUpdateCallback.getHighSpeedVideoFpsRanges.getSize() - min2;
        if (i3 > 0) {
            placeholderUsingUpdateCallback.getHighResolutionOutputSizeshNQ4ISI.onInserted(i4, i3);
        } else if (i3 < 0) {
            placeholderUsingUpdateCallback.getHighResolutionOutputSizeshNQ4ISI.onRemoved(i4 + i3, -i3);
            min2 += i3;
        }
        if (min2 > 0 && z) {
            placeholderUsingUpdateCallback.getHighResolutionOutputSizeshNQ4ISI.onChanged(i5, min2, androidx.paging.DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
        }
        placeholderUsingUpdateCallback.getHighSpeedVideoFpsRangesFor = placeholderUsingUpdateCallback.getHighSpeedVideoSizes.getPlaceholdersAfter();
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0002\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001eB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ)\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback;", "T", "Landroidx/recyclerview/widget/ListUpdateCallback;", "Landroidx/paging/PlaceholderPaddedList;", "p0", "p1", "p2", "<init>", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;Landroidx/recyclerview/widget/ListUpdateCallback;)V", "", "", "onInserted", "(II)V", "onRemoved", "onMoved", "", "onChanged", "(IILjava/lang/Object;)V", "Camera2StreamConfigurationMap", "Landroidx/paging/PlaceholderPaddedList;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/recyclerview/widget/ListUpdateCallback;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizesFor", "getOutputFormats", "getInputSizeshNQ4ISI", "getInputFormats", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class PlaceholderUsingUpdateCallback<T> implements androidx.recyclerview.widget.ListUpdateCallback {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final androidx.paging.PlaceholderPaddedList<T> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        int Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final androidx.paging.PlaceholderPaddedList<T> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final androidx.recyclerview.widget.ListUpdateCallback getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        int getOutputFormats;
        private int getInputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private int getInputSizeshNQ4ISI;

        public PlaceholderUsingUpdateCallback(androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList, androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList2, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderPaddedList2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
            this.getHighSpeedVideoFpsRanges = placeholderPaddedList;
            this.getHighSpeedVideoSizes = placeholderPaddedList2;
            this.getHighResolutionOutputSizeshNQ4ISI = listUpdateCallback;
            this.Camera2StreamConfigurationMap = placeholderPaddedList.getPlaceholdersBefore();
            this.getHighSpeedVideoFpsRangesFor = placeholderPaddedList.getPlaceholdersAfter();
            this.getOutputFormats = placeholderPaddedList.getDataCount();
            this.getInputSizeshNQ4ISI = 1;
            this.getInputFormats = 1;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void onMoved(int p0, int p1) {
            androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.Camera2StreamConfigurationMap;
            listUpdateCallback.onMoved(p0 + i, p1 + i);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void onChanged(int p0, int p1, java.lang.Object p2) {
            this.getHighResolutionOutputSizeshNQ4ISI.onChanged(p0 + this.Camera2StreamConfigurationMap, p1, p2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void onInserted(int p0, int p1) {
            if (p0 >= this.getOutputFormats && this.getInputFormats != 2) {
                int min = java.lang.Math.min(p1, this.getHighSpeedVideoFpsRangesFor);
                if (min > 0) {
                    this.getInputFormats = 3;
                    this.getHighResolutionOutputSizeshNQ4ISI.onChanged(this.Camera2StreamConfigurationMap + p0, min, androidx.paging.DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                    this.getHighSpeedVideoFpsRangesFor -= min;
                }
                int i = p1 - min;
                if (i > 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onInserted(p0 + min + this.Camera2StreamConfigurationMap, i);
                }
            } else if (p0 > 0 || this.getInputSizeshNQ4ISI == 2) {
                this.getHighResolutionOutputSizeshNQ4ISI.onInserted(p0 + this.Camera2StreamConfigurationMap, p1);
            } else {
                int min2 = java.lang.Math.min(p1, this.Camera2StreamConfigurationMap);
                if (min2 > 0) {
                    this.getInputSizeshNQ4ISI = 3;
                    this.getHighResolutionOutputSizeshNQ4ISI.onChanged((0 - min2) + this.Camera2StreamConfigurationMap, min2, androidx.paging.DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                    this.Camera2StreamConfigurationMap -= min2;
                }
                int i2 = p1 - min2;
                if (i2 > 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onInserted(this.Camera2StreamConfigurationMap, i2);
                }
            }
            this.getOutputFormats += p1;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void onRemoved(int p0, int p1) {
            if (p0 + p1 >= this.getOutputFormats && this.getInputFormats != 3) {
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.min(this.getHighSpeedVideoSizes.getPlaceholdersAfter() - this.getHighSpeedVideoFpsRangesFor, p1), 0);
                int i = p1 - coerceAtLeast;
                if (coerceAtLeast > 0) {
                    this.getInputFormats = 2;
                    this.getHighResolutionOutputSizeshNQ4ISI.onChanged(this.Camera2StreamConfigurationMap + p0, coerceAtLeast, androidx.paging.DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                    this.getHighSpeedVideoFpsRangesFor += coerceAtLeast;
                }
                if (i > 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onRemoved(p0 + coerceAtLeast + this.Camera2StreamConfigurationMap, i);
                }
            } else if (p0 > 0 || this.getInputSizeshNQ4ISI == 3) {
                this.getHighResolutionOutputSizeshNQ4ISI.onRemoved(p0 + this.Camera2StreamConfigurationMap, p1);
            } else {
                int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.min(this.getHighSpeedVideoSizes.getPlaceholdersBefore() - this.Camera2StreamConfigurationMap, p1), 0);
                int i2 = p1 - coerceAtLeast2;
                if (i2 > 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onRemoved(this.Camera2StreamConfigurationMap, i2);
                }
                if (coerceAtLeast2 > 0) {
                    this.getInputSizeshNQ4ISI = 2;
                    this.getHighResolutionOutputSizeshNQ4ISI.onChanged(this.Camera2StreamConfigurationMap, coerceAtLeast2, androidx.paging.DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                    this.Camera2StreamConfigurationMap += coerceAtLeast2;
                }
            }
            this.getOutputFormats -= p1;
        }
    }
}
