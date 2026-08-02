package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListCacheWindowStrategy;", "Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "cacheWindow", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;)V", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "", "delta", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "", "onScroll", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;FLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "onVisibleItemsUpdated", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "", "firstVisibleItemIndex", "onNestedPrefetch", "(Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;I)V", "Landroidx/compose/foundation/lazy/LazyListCacheWindowScope;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/lazy/LazyListCacheWindowScope;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListCacheWindowStrategy extends androidx.compose.foundation.lazy.layout.CacheWindowLogic implements androidx.compose.foundation.lazy.LazyListPrefetchStrategy {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.LazyListCacheWindowScope getHighSpeedVideoFpsRanges;

    public LazyListCacheWindowStrategy(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow) {
        super(lazyLayoutCacheWindow, false, 2, null);
        this.getHighSpeedVideoFpsRanges = new androidx.compose.foundation.lazy.LazyListCacheWindowScope();
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onNestedPrefetch(androidx.compose.foundation.lazy.layout.NestedPrefetchScope nestedPrefetchScope, int i) {
        int getHighResolutionOutputSizeshNQ4ISI = nestedPrefetchScope.getGetHighResolutionOutputSizeshNQ4ISI() == -1 ? 2 : nestedPrefetchScope.getGetHighResolutionOutputSizeshNQ4ISI();
        for (int i2 = 0; i2 < getHighResolutionOutputSizeshNQ4ISI; i2++) {
            nestedPrefetchScope.schedulePrecomposition(i + i2);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onScroll(androidx.compose.foundation.lazy.LazyListPrefetchScope lazyListPrefetchScope, float f, androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        this.getHighSpeedVideoFpsRanges.setLayoutInfo(lazyListLayoutInfo);
        this.getHighSpeedVideoFpsRanges.setPrefetchScope(lazyListPrefetchScope);
        onScroll(this.getHighSpeedVideoFpsRanges, f);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onVisibleItemsUpdated(androidx.compose.foundation.lazy.LazyListPrefetchScope lazyListPrefetchScope, androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo) {
        this.getHighSpeedVideoFpsRanges.setLayoutInfo(lazyListLayoutInfo);
        this.getHighSpeedVideoFpsRanges.setPrefetchScope(lazyListPrefetchScope);
        onVisibleItemsUpdated(this.getHighSpeedVideoFpsRanges);
    }
}
