package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "beyondBoundsItemCount", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;I)V", "itemsPerViewport", "()I", "Landroidx/compose/foundation/lazy/LazyListState;", "getState", "()Landroidx/compose/foundation/lazy/LazyListState;", com.visa.cbp.getEncExpo.warmup, "getBeyondBoundsItemCount", "getItemCount", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListBeyondBoundsState implements androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final int beyondBoundsItemCount;
    private final androidx.compose.foundation.lazy.LazyListState state;

    public LazyListBeyondBoundsState(androidx.compose.foundation.lazy.LazyListState lazyListState, int i) {
        this.state = lazyListState;
        this.beyondBoundsItemCount = i;
    }

    public final int getBeyondBoundsItemCount() {
        return this.beyondBoundsItemCount;
    }

    public final androidx.compose.foundation.lazy.LazyListState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getFirstPlacedIndex() {
        return java.lang.Math.max(0, this.state.getFirstVisibleItemIndex() - this.beyondBoundsItemCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getLastPlacedIndex() {
        return java.lang.Math.min(getItemCount() - 1, ((androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex() + this.beyondBoundsItemCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int itemsPerViewport() {
        if (this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int singleAxisViewportSize = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(this.state.getLayoutInfo());
        int visibleItemsAverageSize = androidx.compose.foundation.lazy.LazyListLayoutInfoKt.visibleItemsAverageSize(this.state.getLayoutInfo());
        if (visibleItemsAverageSize == 0) {
            return 1;
        }
        return kotlin.ranges.RangesKt.coerceAtLeast(singleAxisViewportSize / visibleItemsAverageSize, 1);
    }
}
