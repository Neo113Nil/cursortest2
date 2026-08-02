package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchResultScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchResultScope;", "", "lineIndex", "", "mainAxisSizes", "<init>", "(ILjava/util/List;)V", "itemIndexInLine", "getMainAxisSize", "(I)I", com.visa.cbp.getEncExpo.warmup, "getLineIndex", "()I", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getLineItemCount", "lineItemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridPrefetchResultScopeImpl implements androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope {
    public static final int $stable = 8;
    private final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges;
    private final int lineIndex;

    public LazyGridPrefetchResultScopeImpl(int i, java.util.List<java.lang.Integer> list) {
        this.lineIndex = i;
        this.getHighSpeedVideoFpsRanges = list;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public final int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public final int getLineItemCount() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public final int getMainAxisSize(int itemIndexInLine) {
        return this.getHighSpeedVideoFpsRanges.get(itemIndexInLine).intValue();
    }
}
