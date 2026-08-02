package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult$Page;", "Key", "Value", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.jvmAndAndroid.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class LegacyPagingSource$load$2<Key, Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult.Page<Key, Value>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.DataSource.Params<Key> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.LegacyPagingSource<Key, Value> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.PagingSource.LoadParams<Key> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getDataSource$paging_common().load$paging_common(this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.paging.PagingSource.LoadParams<Key> loadParams = this.getHighSpeedVideoSizes;
        androidx.paging.DataSource.BaseResult baseResult = (androidx.paging.DataSource.BaseResult) obj;
        return new androidx.paging.PagingSource.LoadResult.Page(baseResult.data, (baseResult.data.isEmpty() && (loadParams instanceof androidx.paging.PagingSource.LoadParams.Prepend)) ? null : baseResult.getPrevKey(), (baseResult.data.isEmpty() && (loadParams instanceof androidx.paging.PagingSource.LoadParams.Append)) ? null : baseResult.getNextKey(), baseResult.getItemsBefore(), baseResult.getItemsAfter());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.paging.LegacyPagingSource$load$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.LegacyPagingSource$load$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyPagingSource$load$2(androidx.paging.LegacyPagingSource<Key, Value> legacyPagingSource, androidx.paging.DataSource.Params<Key> params, androidx.paging.PagingSource.LoadParams<Key> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.LegacyPagingSource$load$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = legacyPagingSource;
        this.getHighResolutionOutputSizeshNQ4ISI = params;
        this.getHighSpeedVideoSizes = loadParams;
    }
}
