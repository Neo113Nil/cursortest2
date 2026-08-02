package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "", "delta", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "", "onScroll", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;FLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "onVisibleItemsUpdated", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "", "firstVisibleItemIndex", "onNestedPrefetch", "(Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;I)V", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "getPrefetchScheduler", "()Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "getPrefetchScheduler$annotations", "()V", "prefetchScheduler"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyListPrefetchStrategy {
    @kotlin.Deprecated(message = "Customization of PrefetchScheduler is no longer supported. LazyLayout will attach an appropriate scheduler internally.")
    static /* synthetic */ void getPrefetchScheduler$annotations() {
    }

    default androidx.compose.foundation.lazy.layout.PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    void onNestedPrefetch(androidx.compose.foundation.lazy.layout.NestedPrefetchScope nestedPrefetchScope, int i);

    void onScroll(androidx.compose.foundation.lazy.LazyListPrefetchScope lazyListPrefetchScope, float f, androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo);

    void onVisibleItemsUpdated(androidx.compose.foundation.lazy.LazyListPrefetchScope lazyListPrefetchScope, androidx.compose.foundation.lazy.LazyListLayoutInfo lazyListLayoutInfo);
}
