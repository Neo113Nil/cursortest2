package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", i = {0, 1}, l = {61, 66}, m = "invokeSuspend", n = {"$this$onSubscription", "$this$onSubscription"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes7.dex */
final class CachedPageEventFlow$sharedForDownstream$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.CachedPageEventFlow<T> getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.FlattenedPageController flattenedPageController;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.Job job;
        java.util.Iterator<T> it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            flattenedPageController = ((androidx.paging.CachedPageEventFlow) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = flowCollector2;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object highSpeedVideoFpsRanges = flattenedPageController.getHighSpeedVideoFpsRanges(this);
            if (highSpeedVideoFpsRanges != coroutine_suspended) {
                flowCollector = flowCollector2;
                obj = highSpeedVideoFpsRanges;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.getHighResolutionOutputSizeshNQ4ISI;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                kotlin.collections.IndexedValue indexedValue = (kotlin.collections.IndexedValue) it.next();
                this.getHighSpeedVideoSizes = flowCollector;
                this.getHighResolutionOutputSizeshNQ4ISI = it;
                this.getHighSpeedVideoFpsRanges = 2;
                if (flowCollector.emit(indexedValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        flowCollector = flowCollector3;
        job = ((androidx.paging.CachedPageEventFlow) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges;
        job.start();
        it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.CachedPageEventFlow$sharedForDownstream$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new androidx.paging.CachedPageEventFlow$sharedForDownstream$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        cachedPageEventFlow$sharedForDownstream$1.getHighSpeedVideoSizes = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$sharedForDownstream$1(androidx.paging.CachedPageEventFlow<T> cachedPageEventFlow, kotlin.coroutines.Continuation<? super androidx.paging.CachedPageEventFlow$sharedForDownstream$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cachedPageEventFlow;
    }
}
