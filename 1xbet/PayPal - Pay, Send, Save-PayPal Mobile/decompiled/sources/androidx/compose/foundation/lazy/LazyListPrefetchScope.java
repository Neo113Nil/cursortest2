package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "", "", "index", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListPrefetchResultScope;", "", "Lkotlin/ExtensionFunctionType;", "onPrefetchFinished", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyListPrefetchScope {
    androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int index, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListPrefetchResultScope, kotlin.Unit> onPrefetchFinished);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch$default(androidx.compose.foundation.lazy.LazyListPrefetchScope lazyListPrefetchScope, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return lazyListPrefetchScope.schedulePrefetch(i, function1);
    }
}
