package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "", "p0", "<init>", "(I)V", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "p1", "", "onScroll", "(Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V", "onVisibleItemsUpdated", "(Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "onNestedPrefetch", "(Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;I)V", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;IZ)V", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Z)I", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "()V", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/runtime/collection/MutableVector;", "getOutputMinFrameDuration", "Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultLazyGridPrefetchStrategy implements androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private float getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    public DefaultLazyGridPrefetchStrategy(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoFpsRanges = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.getHighSpeedVideoSizes = -1;
    }

    public /* synthetic */ DefaultLazyGridPrefetchStrategy(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void onScroll(androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope lazyGridPrefetchScope, float f, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int i = 0;
            boolean z = f < 0.0f;
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(lazyGridLayoutInfo, z);
            int highSpeedVideoSizes = getHighSpeedVideoSizes(lazyGridLayoutInfo, z);
            if (highSpeedVideoSizes >= 0 && highSpeedVideoSizes < lazyGridLayoutInfo.getTotalItemsCount()) {
                if (Camera2StreamConfigurationMap != this.Camera2StreamConfigurationMap && Camera2StreamConfigurationMap >= 0) {
                    if (this.getHighSpeedVideoFpsRangesFor != z) {
                        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.getHighSpeedVideoFpsRanges;
                        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i2 = 0; i2 < size; i2++) {
                            prefetchHandleArr[i2].cancel();
                        }
                    }
                    this.getHighSpeedVideoFpsRangesFor = z;
                    this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoFpsRanges.clear();
                    androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector2 = this.getHighSpeedVideoFpsRanges;
                    mutableVector2.addAll(mutableVector2.getSize(), (java.util.List<? extends androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle>) lazyGridPrefetchScope.scheduleLinePrefetch(Camera2StreamConfigurationMap));
                }
                if (z) {
                    androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyGridLayoutInfo.getVisibleItemsInfo());
                    if (((androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, lazyGridLayoutInfo.getOrientation()) + androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, lazyGridLayoutInfo.getOrientation())) + lazyGridLayoutInfo.getMainAxisItemSpacing()) - lazyGridLayoutInfo.getViewportEndOffset() < (-f)) {
                        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector3 = this.getHighSpeedVideoFpsRanges;
                        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr2 = mutableVector3.content;
                        int size2 = mutableVector3.getSize();
                        while (i < size2) {
                            prefetchHandleArr2[i].markAsUrgent();
                            i++;
                        }
                    }
                } else if (lazyGridLayoutInfo.getViewportStartOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) lazyGridLayoutInfo.getVisibleItemsInfo()), lazyGridLayoutInfo.getOrientation()) < f) {
                    androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector4 = this.getHighSpeedVideoFpsRanges;
                    androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr3 = mutableVector4.content;
                    int size3 = mutableVector4.getSize();
                    while (i < size3) {
                        prefetchHandleArr3[i].markAsUrgent();
                        i++;
                    }
                }
            }
        }
        this.getOutputFormats = f;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void onVisibleItemsUpdated(androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope lazyGridPrefetchScope, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        getHighSpeedVideoFpsRangesFor(lazyGridLayoutInfo, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        int totalItemsCount = lazyGridLayoutInfo.getTotalItemsCount();
        int i = this.getHighSpeedVideoSizes;
        if (i != -1 && this.getOutputFormats != 0.0f && i != totalItemsCount && !lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(lazyGridLayoutInfo, this.getOutputFormats < 0.0f);
            int highSpeedVideoSizes = getHighSpeedVideoSizes(lazyGridLayoutInfo, this.getOutputFormats < 0.0f);
            if (highSpeedVideoSizes >= 0 && highSpeedVideoSizes < lazyGridLayoutInfo.getTotalItemsCount() && Camera2StreamConfigurationMap != this.Camera2StreamConfigurationMap && Camera2StreamConfigurationMap >= 0) {
                this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges.clear();
                androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.getHighSpeedVideoFpsRanges;
                mutableVector.addAll(mutableVector.getSize(), (java.util.List<? extends androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle>) lazyGridPrefetchScope.scheduleLinePrefetch(Camera2StreamConfigurationMap));
            }
        }
        this.getHighSpeedVideoSizes = totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void onNestedPrefetch(androidx.compose.foundation.lazy.layout.NestedPrefetchScope nestedPrefetchScope, int i) {
        int getHighResolutionOutputSizeshNQ4ISI;
        if (nestedPrefetchScope.getGetHighResolutionOutputSizeshNQ4ISI() == -1) {
            getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            getHighResolutionOutputSizeshNQ4ISI = nestedPrefetchScope.getGetHighResolutionOutputSizeshNQ4ISI();
        }
        for (int i2 = 0; i2 < getHighResolutionOutputSizeshNQ4ISI; i2++) {
            nestedPrefetchScope.schedulePrecomposition(i + i2);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo, int i, boolean z) {
        if (i == -1 || lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty() || i == Camera2StreamConfigurationMap(lazyGridLayoutInfo, z)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private static int Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo, boolean z) {
        if (z) {
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyGridLayoutInfo.getVisibleItemsInfo());
            return (lazyGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        }
        androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) lazyGridLayoutInfo.getVisibleItemsInfo());
        return (lazyGridLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
    }

    private static int getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo, boolean z) {
        if (z) {
            return ((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
        }
        return ((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        this.Camera2StreamConfigurationMap = -1;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.getHighSpeedVideoFpsRanges;
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            prefetchHandleArr[i].cancel();
        }
        this.getHighSpeedVideoFpsRanges.clear();
    }

    public DefaultLazyGridPrefetchStrategy() {
        this(0, 1, null);
    }
}
