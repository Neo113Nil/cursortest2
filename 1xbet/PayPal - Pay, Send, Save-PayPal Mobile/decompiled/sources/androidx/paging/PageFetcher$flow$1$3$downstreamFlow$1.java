package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Value", "", "it", "Landroidx/paging/PageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcher$flow$1$3$downstreamFlow$1<Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.PageEvent<Value>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.paging.PageEvent pageEvent = (androidx.paging.PageEvent) this.getHighSpeedVideoFpsRangesFor;
        androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            pagingLogger.log(2, "Sent ".concat(java.lang.String.valueOf(pageEvent)), null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1) create((androidx.paging.PageEvent) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = new androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1(continuation);
        pageFetcher$flow$1$3$downstreamFlow$1.getHighSpeedVideoFpsRangesFor = obj;
        return pageFetcher$flow$1$3$downstreamFlow$1;
    }

    PageFetcher$flow$1$3$downstreamFlow$1(kotlin.coroutines.Continuation<? super androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1> continuation) {
        super(2, continuation);
    }
}
