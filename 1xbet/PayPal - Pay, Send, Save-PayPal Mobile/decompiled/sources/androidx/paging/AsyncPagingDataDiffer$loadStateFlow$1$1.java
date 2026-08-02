package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isGettingItem"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AsyncPagingDataDiffer$loadStateFlow$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$1 = new androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1(continuation);
        asyncPagingDataDiffer$loadStateFlow$1$1.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Boolean) obj).booleanValue();
        return asyncPagingDataDiffer$loadStateFlow$1$1;
    }

    AsyncPagingDataDiffer$loadStateFlow$1$1(kotlin.coroutines.Continuation<? super androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1> continuation) {
        super(2, continuation);
    }
}
