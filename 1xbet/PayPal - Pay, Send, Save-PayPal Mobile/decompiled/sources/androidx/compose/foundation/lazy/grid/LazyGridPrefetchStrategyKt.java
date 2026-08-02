package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "nestedPrefetchItemCount", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "LazyGridPrefetchStrategy", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridPrefetchStrategyKt {
    public static /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy LazyGridPrefetchStrategy$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return LazyGridPrefetchStrategy(i);
    }

    public static final androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy LazyGridPrefetchStrategy(int i) {
        return new androidx.compose.foundation.lazy.grid.DefaultLazyGridPrefetchStrategy(i);
    }
}
