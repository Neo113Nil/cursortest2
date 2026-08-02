package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "Value", "", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcher$injectRemoteEvents$1<Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.paging.MutableLoadStateCollection Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.RemoteMediatorAccessor<Key, Value> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.paging.SimpleProducerScope simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.paging.SimpleChannelFlowKt.simpleChannelFlow(new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.getHighSpeedVideoSizes.getState(), this.getHighSpeedVideoFpsRanges.getPageEventFlow(), null, this.Camera2StreamConfigurationMap)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object send = simpleProducerScope.send((androidx.paging.PageEvent) obj2, continuation);
                    return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
        return ((androidx.paging.PageFetcher$injectRemoteEvents$1) create((androidx.paging.SimpleProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1 = new androidx.paging.PageFetcher$injectRemoteEvents$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        pageFetcher$injectRemoteEvents$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return pageFetcher$injectRemoteEvents$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher$injectRemoteEvents$1(androidx.paging.RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, androidx.paging.MutableLoadStateCollection mutableLoadStateCollection, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcher$injectRemoteEvents$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = remoteMediatorAccessor;
        this.getHighSpeedVideoFpsRanges = pageFetcherSnapshot;
        this.Camera2StreamConfigurationMap = mutableLoadStateCollection;
    }
}
