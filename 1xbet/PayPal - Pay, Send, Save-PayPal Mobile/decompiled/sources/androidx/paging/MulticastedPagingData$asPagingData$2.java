package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class MulticastedPagingData$asPagingData$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PageEvent<T>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.MulticastedPagingData<T> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.ActiveFlowTracker camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (camera2StreamConfigurationMap.onComplete(androidx.paging.ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new androidx.paging.MulticastedPagingData$asPagingData$2(this.getHighSpeedVideoFpsRanges, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastedPagingData$asPagingData$2(androidx.paging.MulticastedPagingData<T> multicastedPagingData, kotlin.coroutines.Continuation<? super androidx.paging.MulticastedPagingData$asPagingData$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = multicastedPagingData;
    }
}
