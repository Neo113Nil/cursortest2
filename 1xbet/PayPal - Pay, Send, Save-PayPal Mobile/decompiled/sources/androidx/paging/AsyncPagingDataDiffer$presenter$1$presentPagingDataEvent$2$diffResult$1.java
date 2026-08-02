package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/paging/PlaceholderPaddedDiffResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.paging.PlaceholderPaddedDiffResult>, java.lang.Object> {
    final /* synthetic */ androidx.paging.PagingDataEvent.Refresh<T> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.AsyncPagingDataDiffer<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.paging.PlaceholderPaddedList previousList = this.Camera2StreamConfigurationMap.getPreviousList();
        androidx.paging.PlaceholderPaddedList newList = this.Camera2StreamConfigurationMap.getNewList();
        itemCallback = ((androidx.paging.AsyncPagingDataDiffer) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizes;
        return androidx.paging.PlaceholderPaddedListDiffHelperKt.computeDiff(previousList, newList, itemCallback);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.paging.PlaceholderPaddedDiffResult> continuation) {
        return ((androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1(androidx.paging.PagingDataEvent.Refresh<T> refresh, androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer, kotlin.coroutines.Continuation<? super androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = refresh;
        this.getHighSpeedVideoFpsRangesFor = asyncPagingDataDiffer;
    }
}
