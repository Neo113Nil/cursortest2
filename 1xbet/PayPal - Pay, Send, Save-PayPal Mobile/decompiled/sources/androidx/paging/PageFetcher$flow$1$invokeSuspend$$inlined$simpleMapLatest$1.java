package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1<Key, Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PagingData<Value>>, androidx.paging.PageFetcher.GenerationInfo<Key, Value>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.RemoteMediatorAccessor getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.PageFetcher getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.ConflatedEventBus conflatedEventBus;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            androidx.paging.PageFetcher.GenerationInfo generationInfo = (androidx.paging.PageFetcher.GenerationInfo) this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(androidx.paging.PageFetcher.access$injectRemoteEvents(this.getHighSpeedVideoSizes, generationInfo.getHighSpeedVideoFpsRanges(), generationInfo.getGetHighSpeedVideoFpsRanges(), this.getHighResolutionOutputSizeshNQ4ISI), new androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1(null));
            androidx.paging.PageFetcher pageFetcher = this.getHighSpeedVideoSizes;
            conflatedEventBus = pageFetcher.Camera2StreamConfigurationMap;
            androidx.paging.PagingData pagingData = new androidx.paging.PagingData(onEach, new androidx.paging.PageFetcher.PagerUiReceiver(pageFetcher, conflatedEventBus), new androidx.paging.PageFetcher.PagerHintReceiver(this.getHighSpeedVideoSizes, generationInfo.getHighSpeedVideoFpsRanges()), null, 8, null);
            this.Camera2StreamConfigurationMap = 1;
            if (flowCollector.emit(pagingData, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PagingData<Value>> flowCollector, androidx.paging.PageFetcher.GenerationInfo<Key, Value> generationInfo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(continuation, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.getHighSpeedVideoFpsRangesFor = flowCollector;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.getHighSpeedVideoFpsRanges = generationInfo;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(kotlin.coroutines.Continuation continuation, androidx.paging.PageFetcher pageFetcher, androidx.paging.RemoteMediatorAccessor remoteMediatorAccessor) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = pageFetcher;
        this.getHighResolutionOutputSizeshNQ4ISI = remoteMediatorAccessor;
    }
}
