package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$startConsumingHints$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.HintHandler hintHandler;
        androidx.paging.HintHandler hintHandler2;
        kotlin.jvm.functions.Function0 function0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hintHandler = ((androidx.paging.PageFetcherSnapshot) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<androidx.paging.ViewportHint> hintFor = hintHandler.hintFor(androidx.paging.LoadType.APPEND);
            hintHandler2 = ((androidx.paging.PageFetcherSnapshot) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow[] flowArr = {hintFor, hintHandler2.hintFor(androidx.paging.LoadType.PREPEND)};
            this.getHighSpeedVideoSizes = 1;
            obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(kotlinx.coroutines.flow.FlowKt.merge(flowArr), new androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.getHighResolutionOutputSizeshNQ4ISI, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.paging.ViewportHint viewportHint = (androidx.paging.ViewportHint) obj;
        if (viewportHint != null) {
            androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
            if (pagingLogger.isLoggable(3)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Jump triggered on PagingSource ");
                sb.append(pageFetcherSnapshot.getPagingSource$paging_common());
                sb.append(" by ");
                sb.append(viewportHint);
                pagingLogger.log(3, sb.toString(), null);
            }
            function0 = ((androidx.paging.PageFetcherSnapshot) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI;
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcherSnapshot$startConsumingHints$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PageFetcherSnapshot$startConsumingHints$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$1(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$startConsumingHints$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pageFetcherSnapshot;
    }
}
