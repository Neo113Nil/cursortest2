package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.MulticastedPagingData<T>>, androidx.paging.PagingData<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.ActiveFlowTracker getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
            androidx.paging.MulticastedPagingData multicastedPagingData = new androidx.paging.MulticastedPagingData(this.getHighSpeedVideoSizes, (androidx.paging.PagingData) this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (flowCollector.emit(multicastedPagingData, this) == coroutine_suspended) {
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
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.MulticastedPagingData<T>> flowCollector, androidx.paging.PagingData<T> pagingData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(continuation, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.getHighSpeedVideoFpsRanges = flowCollector;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.Camera2StreamConfigurationMap = pagingData;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(kotlin.coroutines.Continuation continuation, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.paging.ActiveFlowTracker activeFlowTracker) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = activeFlowTracker;
    }
}
