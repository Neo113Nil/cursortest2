package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000bH&¢\u0006\u0004\b\u0006\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "", "", "lineIndex", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "scheduleLinePrefetch", "(I)Ljava/util/List;", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchResultScope;", "", "Lkotlin/ExtensionFunctionType;", "onPrefetchFinished", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyGridPrefetchScope {
    java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int lineIndex);

    default java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int lineIndex, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope, kotlin.Unit> onPrefetchFinished) {
        return scheduleLinePrefetch(lineIndex);
    }
}
