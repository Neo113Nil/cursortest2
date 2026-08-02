package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.PageFetcherSnapshotState<Key, Value> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        int i;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            channel = ((androidx.paging.PageFetcherSnapshotState) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
            i = ((androidx.paging.PageFetcherSnapshotState) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizesFor;
            channel.mo9266trySendJP2dKIU(kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(androidx.paging.PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = pageFetcherSnapshotState;
    }
}
