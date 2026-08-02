package androidx.paging.compose;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "", "it", "Landroidx/paging/PagingData;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class LazyPagingItems$collectPagingData$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.PagingData<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.compose.LazyPagingItems<T> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.PagingData<T> pagingData = (androidx.paging.PagingData) this.getHighResolutionOutputSizeshNQ4ISI;
            lazyPagingItems$pagingDataPresenter$1 = ((androidx.paging.compose.LazyPagingItems) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (lazyPagingItems$pagingDataPresenter$1.collectFrom(pagingData, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.compose.LazyPagingItems$collectPagingData$2) create((androidx.paging.PagingData) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.compose.LazyPagingItems$collectPagingData$2 lazyPagingItems$collectPagingData$2 = new androidx.paging.compose.LazyPagingItems$collectPagingData$2(this.getHighSpeedVideoFpsRanges, continuation);
        lazyPagingItems$collectPagingData$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return lazyPagingItems$collectPagingData$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyPagingItems$collectPagingData$2(androidx.paging.compose.LazyPagingItems<T> lazyPagingItems, kotlin.coroutines.Continuation<? super androidx.paging.compose.LazyPagingItems$collectPagingData$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lazyPagingItems;
    }
}
