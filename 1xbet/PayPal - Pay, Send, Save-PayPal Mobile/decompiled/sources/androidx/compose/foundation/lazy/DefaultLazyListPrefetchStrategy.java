package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0012\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0015J#\u0010\u0016\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 "}, d2 = {"Landroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy;", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "", "p0", "<init>", "(I)V", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "p1", "", "onScroll", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;FLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "onVisibleItemsUpdated", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "onNestedPrefetch", "(Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;I)V", "getHighSpeedVideoSizes", "()V", "", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;Z)I", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;IZ)V", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "getHighSpeedVideoSizesFor", "Z", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultLazyListPrefetchStrategy implements androidx.compose.foundation.lazy.LazyListPrefetchStrategy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    public DefaultLazyListPrefetchStrategy(int i) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = -1;
        this.Camera2StreamConfigurationMap = -1;
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onScroll(androidx.compose.foundation.lazy.LazyListPrefetchScope lazyListPrefetchScope, float f, androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        if (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            boolean z = f < 0.0f;
            int highSpeedVideoSizes = getHighSpeedVideoSizes(lazyListLayoutInfo, z);
            if (highSpeedVideoSizes >= 0 && highSpeedVideoSizes < lazyListLayoutInfo.getTotalItemsCount()) {
                if (highSpeedVideoSizes != this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoFpsRangesFor != z) {
                        getHighSpeedVideoSizes();
                    }
                    this.getHighSpeedVideoFpsRangesFor = z;
                    this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
                    this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyListPrefetchScope.schedulePrefetch$default(lazyListPrefetchScope, highSpeedVideoSizes, null, 2, null);
                }
                if (z) {
                    androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo = (androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyListLayoutInfo.getVisibleItemsInfo());
                    if (((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + lazyListLayoutInfo.getMainAxisItemSpacing()) - lazyListLayoutInfo.getViewportEndOffset() < (-f) && (prefetchHandle2 = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                        prefetchHandle2.markAsUrgent();
                    }
                } else if (lazyListLayoutInfo.getViewportStartOffset() - ((androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) lazyListLayoutInfo.getVisibleItemsInfo())).getOffset() < f && (prefetchHandle = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                    prefetchHandle.markAsUrgent();
                }
            }
        }
        this.getInputFormats = f;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onVisibleItemsUpdated(androidx.compose.foundation.lazy.LazyListPrefetchScope lazyListPrefetchScope, androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        getHighSpeedVideoFpsRanges(lazyListLayoutInfo, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        int totalItemsCount = lazyListLayoutInfo.getTotalItemsCount();
        int i = this.Camera2StreamConfigurationMap;
        if (i != -1 && this.getInputFormats != 0.0f && i != totalItemsCount && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(lazyListLayoutInfo, this.getInputFormats < 0.0f);
            if (highSpeedVideoSizes >= 0 && highSpeedVideoSizes < totalItemsCount) {
                this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyListPrefetchScope.schedulePrefetch$default(lazyListPrefetchScope, highSpeedVideoSizes, null, 2, null);
            }
        }
        this.Camera2StreamConfigurationMap = totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onNestedPrefetch(androidx.compose.foundation.lazy.layout.NestedPrefetchScope nestedPrefetchScope, int i) {
        int getHighResolutionOutputSizeshNQ4ISI;
        if (nestedPrefetchScope.getGetHighResolutionOutputSizeshNQ4ISI() == -1) {
            getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
        } else {
            getHighResolutionOutputSizeshNQ4ISI = nestedPrefetchScope.getGetHighResolutionOutputSizeshNQ4ISI();
        }
        for (int i2 = 0; i2 < getHighResolutionOutputSizeshNQ4ISI; i2++) {
            nestedPrefetchScope.schedulePrecomposition(i + i2);
        }
    }

    private final void getHighSpeedVideoSizes() {
        this.getHighSpeedVideoFpsRanges = -1;
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.getHighResolutionOutputSizeshNQ4ISI;
        if (prefetchHandle != null) {
            prefetchHandle.cancel();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    private static int getHighSpeedVideoSizes(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo, boolean z) {
        if (z) {
            return ((androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
        }
        return ((androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo, int i, boolean z) {
        if (i == -1 || lazyListLayoutInfo.getVisibleItemsInfo().isEmpty() || i == getHighSpeedVideoSizes(lazyListLayoutInfo, z)) {
            return;
        }
        getHighSpeedVideoSizes();
    }

    public DefaultLazyListPrefetchStrategy() {
        this(0, 1, null);
    }
}
