package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0015\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "", "itemIndex", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "findVisibleItem", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "visibleItemsAverageSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)I", "laneCount", "calculateContentSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;I)I", "", "Camera2StreamConfigurationMap", "[I", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "EmptyLazyStaggeredGridLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getEmptyLazyStaggeredGridLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getSingleAxisViewportSize", "singleAxisViewportSize"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridMeasureResultKt {
    private static final int[] Camera2StreamConfigurationMap;
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo findVisibleItem(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i) {
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i > ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i) {
            return null;
        }
        return (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.getOrNull(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), kotlin.collections.CollectionsKt.binarySearch$default(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.getHighSpeedVideoFpsRanges(i, (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) obj);
                return java.lang.Integer.valueOf(highSpeedVideoFpsRanges);
            }
        }, 3, (java.lang.Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(int i, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
        return lazyStaggeredGridItemInfo.getIndex() - i;
    }

    static {
        int[] iArr = new int[0];
        Camera2StreamConfigurationMap = iArr;
        androidx.compose.ui.layout.MeasureResult measureResult = new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
            private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines = kotlin.collections.MapsKt.emptyMap();
            private final int height;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                return this.alignmentLines;
            }
        };
        androidx.compose.ui.layout.MeasureResult measureResult2 = measureResult;
        EmptyLazyStaggeredGridLayoutInfo = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, measureResult2, 0.0f, false, false, false, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots(iArr, iArr), new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider(new androidx.compose.foundation.lazy.layout.MutableIntervalList()), androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, kotlin.collections.CollectionsKt.emptyList(), androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g(), 0, 0, 0, 0, 0, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE), null);
    }

    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int visibleItemsAverageSize(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        long size;
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size2 = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i2);
            if (lazyStaggeredGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                size = lazyStaggeredGridItemInfo.getSize() & 4294967295L;
            } else {
                size = lazyStaggeredGridItemInfo.getSize() >> 32;
            }
            i += (int) size;
        }
        return (i / visibleItemsInfo.size()) + lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing();
    }

    public static final int calculateContentSize(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i) {
        int beforeContentPadding = lazyStaggeredGridLayoutInfo.getBeforeContentPadding() + lazyStaggeredGridLayoutInfo.getAfterContentPadding();
        return (lazyStaggeredGridLayoutInfo.getTotalItemsCount() == 0 || i <= 0) ? beforeContentPadding : (((visibleItemsAverageSize(lazyStaggeredGridLayoutInfo) * lazyStaggeredGridLayoutInfo.getTotalItemsCount()) / i) - lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing()) + beforeContentPadding;
    }

    public static final int getSingleAxisViewportSize(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        long viewportSize;
        if (lazyStaggeredGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
            viewportSize = lazyStaggeredGridLayoutInfo.getViewportSize() & 4294967295L;
        } else {
            viewportSize = lazyStaggeredGridLayoutInfo.getViewportSize() >> 32;
        }
        return (int) viewportSize;
    }
}
