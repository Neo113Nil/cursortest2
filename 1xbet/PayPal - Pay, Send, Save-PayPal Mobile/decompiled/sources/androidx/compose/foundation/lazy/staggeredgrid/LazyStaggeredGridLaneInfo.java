package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0005J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0005J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "<init>", "()V", io.ktor.http.LinkHeader.Parameters.Anchor, "", "lanes", "", "spannedItems", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "setLane", "", "itemIndex", "lane", "getLane", "assignedToLane", "", "targetLane", "upperBound", "lowerBound", "reset", "findPreviousItemIndex", "findNextItemIndex", "ensureValidIndex", "requestedIndex", "setGaps", "gaps", "getGaps", "ensureCapacity", "capacity", "newOffset", "SpannedItem", "Companion", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridLaneInfo {
    public static final int LaneFullSpan = -2;
    public static final int LaneUnset = -1;
    private int getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;
    private int[] getHighSpeedVideoSizes = new int[16];
    private final kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem> Camera2StreamConfigurationMap = new kotlin.collections.ArrayDeque<>();

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u000e\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "", "p0", "", "p1", "<init>", "(I[I)V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "()I", "Camera2StreamConfigurationMap", "[I", "getHighResolutionOutputSizeshNQ4ISI", "()[I", "([I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SpannedItem {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private int[] getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRangesFor;

        public SpannedItem(int i, int[] iArr) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final int[] getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public final int getLane(int itemIndex) {
        if (itemIndex < getGetHighSpeedVideoFpsRangesFor() || itemIndex >= upperBound()) {
            return -1;
        }
        return this.getHighSpeedVideoSizes[itemIndex - this.getHighSpeedVideoFpsRangesFor] - 1;
    }

    public final boolean assignedToLane(int itemIndex, int targetLane) {
        int lane = getLane(itemIndex);
        return lane == targetLane || lane == -1 || lane == -2;
    }

    public final int upperBound() {
        return this.getHighSpeedVideoFpsRangesFor + this.getHighSpeedVideoSizes.length;
    }

    /* renamed from: lowerBound, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void reset() {
        kotlin.collections.ArraysKt.fill$default(this.getHighSpeedVideoSizes, 0, 0, 0, 6, (java.lang.Object) null);
        this.Camera2StreamConfigurationMap.clear();
    }

    public final int findPreviousItemIndex(int itemIndex, int targetLane) {
        for (int i = itemIndex - 1; i >= 0; i--) {
            if (assignedToLane(i, targetLane)) {
                return i;
            }
        }
        return -1;
    }

    public final int findNextItemIndex(int itemIndex, int targetLane) {
        int upperBound = upperBound();
        for (int i = itemIndex + 1; i < upperBound; i++) {
            if (assignedToLane(i, targetLane)) {
                return i;
            }
        }
        return upperBound();
    }

    public final void ensureValidIndex(int requestedIndex) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = requestedIndex - i;
        if (i2 < 0 || i2 >= 131072) {
            int max = java.lang.Math.max(requestedIndex - (this.getHighSpeedVideoSizes.length / 2), 0);
            this.getHighSpeedVideoFpsRangesFor = max;
            int i3 = max - i;
            if (i3 >= 0) {
                int[] iArr = this.getHighSpeedVideoSizes;
                if (i3 < iArr.length) {
                    kotlin.collections.ArraysKt.copyInto(iArr, iArr, 0, i3, iArr.length);
                }
                int[] iArr2 = this.getHighSpeedVideoSizes;
                kotlin.collections.ArraysKt.fill(iArr2, 0, java.lang.Math.max(0, iArr2.length - i3), this.getHighSpeedVideoSizes.length);
            } else {
                int i4 = -i3;
                int[] iArr3 = this.getHighSpeedVideoSizes;
                if (iArr3.length + i4 < 131072) {
                    getHighSpeedVideoSizes(iArr3.length + i4 + 1, i4);
                } else {
                    if (i4 < iArr3.length) {
                        kotlin.collections.ArraysKt.copyInto(iArr3, iArr3, i4, 0, iArr3.length - i4);
                    }
                    int[] iArr4 = this.getHighSpeedVideoSizes;
                    kotlin.collections.ArraysKt.fill(iArr4, 0, 0, java.lang.Math.min(iArr4.length, i4));
                }
            }
        } else {
            getHighSpeedVideoSizes(i2 + 1, 0);
        }
        while (!this.Camera2StreamConfigurationMap.isEmpty() && this.Camera2StreamConfigurationMap.first().getGetHighSpeedVideoFpsRangesFor() < getGetHighSpeedVideoFpsRangesFor()) {
            this.Camera2StreamConfigurationMap.removeFirst();
        }
        while (!this.Camera2StreamConfigurationMap.isEmpty() && this.Camera2StreamConfigurationMap.last().getGetHighSpeedVideoFpsRangesFor() > upperBound()) {
            this.Camera2StreamConfigurationMap.removeLast();
        }
    }

    public final void setGaps(int itemIndex, int[] gaps) {
        kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem> arrayDeque = this.Camera2StreamConfigurationMap;
        final java.lang.Integer valueOf = java.lang.Integer.valueOf(itemIndex);
        int binarySearch = kotlin.collections.CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem, java.lang.Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Integer invoke(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
                return java.lang.Integer.valueOf(kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(spannedItem.getGetHighSpeedVideoFpsRangesFor()), valueOf));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (binarySearch < 0) {
            if (gaps == null) {
                return;
            }
            this.Camera2StreamConfigurationMap.add(-(binarySearch + 1), new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem(itemIndex, gaps));
            return;
        }
        if (gaps == null) {
            this.Camera2StreamConfigurationMap.remove(binarySearch);
        } else {
            this.Camera2StreamConfigurationMap.get(binarySearch).getHighResolutionOutputSizeshNQ4ISI(gaps);
        }
    }

    public final int[] getGaps(int itemIndex) {
        kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem> arrayDeque = this.Camera2StreamConfigurationMap;
        final java.lang.Integer valueOf = java.lang.Integer.valueOf(itemIndex);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem spannedItem = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem) kotlin.collections.CollectionsKt.getOrNull(this.Camera2StreamConfigurationMap, kotlin.collections.CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem, java.lang.Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Integer invoke(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.SpannedItem spannedItem2) {
                return java.lang.Integer.valueOf(kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(spannedItem2.getGetHighSpeedVideoFpsRangesFor()), valueOf));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
        if (spannedItem != null) {
            return spannedItem.getGetHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(int i, int i2) {
        if (i > 131072) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested item capacity ");
            sb.append(i);
            sb.append(" is larger than max supported: 131072!");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        int[] iArr = this.getHighSpeedVideoSizes;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            this.getHighSpeedVideoSizes = kotlin.collections.ArraysKt.copyInto$default(this.getHighSpeedVideoSizes, new int[length], i2, 0, 0, 12, (java.lang.Object) null);
        }
    }

    public final void setLane(int itemIndex, int lane) {
        if (itemIndex < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Negative lanes are not supported");
        }
        ensureValidIndex(itemIndex);
        this.getHighSpeedVideoSizes[itemIndex - this.getHighSpeedVideoFpsRangesFor] = lane + 1;
    }
}
