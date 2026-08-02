package androidx.paging.compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"IncompleteLoadState", "Landroidx/paging/LoadState$NotLoading;", "InitialLoadStates", "Landroidx/paging/LoadStates;", "collectAsLazyPagingItems", "Landroidx/paging/compose/LazyPagingItems;", "T", "", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/paging/compose/LazyPagingItems;", "paging-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LazyPagingItemsKt {
    private static final androidx.paging.LoadState.NotLoading getHighResolutionOutputSizeshNQ4ISI;
    private static final androidx.paging.LoadStates getHighSpeedVideoFpsRanges;

    static {
        androidx.paging.LoadState.NotLoading notLoading = new androidx.paging.LoadState.NotLoading(false);
        getHighResolutionOutputSizeshNQ4ISI = notLoading;
        androidx.paging.LoadState.NotLoading notLoading2 = notLoading;
        getHighSpeedVideoFpsRanges = new androidx.paging.LoadStates(androidx.paging.LoadState.Loading.INSTANCE, notLoading2, notLoading2);
    }

    public static final <T> androidx.paging.compose.LazyPagingItems<T> collectAsLazyPagingItems(kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> flow, kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(388053246, i, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:187)");
        }
        boolean changed = composer.changed(flow);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.paging.compose.LazyPagingItems(flow);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.paging.compose.LazyPagingItems<T> lazyPagingItems = (androidx.paging.compose.LazyPagingItems) rememberedValue;
        boolean changedInstance = composer.changedInstance(coroutineContext);
        boolean changedInstance2 = composer.changedInstance(lazyPagingItems);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1(coroutineContext, lazyPagingItems, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(lazyPagingItems, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, 0);
        boolean changedInstance3 = composer.changedInstance(coroutineContext);
        boolean changedInstance4 = composer.changedInstance(lazyPagingItems);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance3 | changedInstance4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1(coroutineContext, lazyPagingItems, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(lazyPagingItems, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyPagingItems;
    }
}
